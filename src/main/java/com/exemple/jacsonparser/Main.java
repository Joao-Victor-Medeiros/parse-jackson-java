package com.exemple.jacsonparser;

import com.fasterxml.jackson.databind.JsonNode;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String jsonSource = "{  \"title\": \"jsonprser in java\" }";
        try{
            JsonNode node = Json.parse(jsonSource);
            System.out.println(node.get("title").asText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}