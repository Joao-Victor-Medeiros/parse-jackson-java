package com.exemple.jacsonparser;

import com.exemple.jacsonparser.pojo.SimpleTestCaseJsonPOJO;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class JsonTest {
    private final String simpleTestCasejsonSource = "{  \"title\": \"jsonparser in java\" }";
    @Test
    void parse() throws IOException {
        JsonNode node = Json.parse(simpleTestCasejsonSource);
        assertEquals(node.get("title").asText(), "jsonparser in java");
    }

    @Test
    void fromJson() throws IOException{
        JsonNode node = Json.parse(simpleTestCasejsonSource);
        SimpleTestCaseJsonPOJO pojo = Json.fromJson(node, SimpleTestCaseJsonPOJO.class);

        assertEquals(pojo.getTitle(), "jsonparser in java");
        System.out.println(pojo.getTitle());
    }

}