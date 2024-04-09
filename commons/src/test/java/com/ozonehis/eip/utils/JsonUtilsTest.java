/*
 * Copyright © 2021, Ozone HIS <info@ozone-his.com>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package com.ozonehis.eip.utils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JsonUtilsTest {

    @Test
    public void convertToValuesArrayForKey_shouldConvertToValuesArrayForKey() {
        // Given
        String json = jsonArray();
        String expectedString =
                "\"4686a8ca56534ae1a1b330c6c0489f3e\",\"5a692788c4b443b4af9a68ee5a9fa7a0\",\"07e3306dc3f2409eacd725dfd91f6d74\",\"a2f37ae28c6b45c8b747d3a29c718cca\",\"fceb8a504e194f098c595979ace926e8\",\"14a74625b1bb4f9fbd37b8d3d710ae23\",\"387bad978eeb4f6cb1c5d368b4bae291\",\"cd441ba2c2454b6cb79a8ac64ba2de3e\",\"da0a2ad524844b21b7ed03e63d68bc37\",\"8418cace20e34a8fa6f2852bdaa1d012\",\"fe056ad2295d48288c06ce43713f351c\"";

        // When
        String concatenatedValuesString = JsonUtils.convertToValuesArrayForKey(json, "service_uid");

        // Then
        assertEquals(expectedString, concatenatedValuesString);
    }

    @Test
    public void containsItemWithKeyEqualsValue() {
        // Given
        String json = jsonArray();
        Boolean expectedValue = true;

        // When
        Boolean actualValue =
                JsonUtils.containsItemWithKeyEqualsValue(json, "service_uid", "8418cace20e34a8fa6f2852bdaa1d012");

        // Then
        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void getPropertyValueWhereKeyMatchesValue() {
        // Given
        String json = jsonArray();
        String expectedValue = "part-6";

        // When
        String actualValue = JsonUtils.getPropertyValueWhereKeyMatchesValue(
                json, "partition", "service_uid", "14a74625b1bb4f9fbd37b8d3d710ae23");

        // Then
        assertEquals(expectedValue, actualValue);
    }

    private String jsonArray() {
        return "[\n" + "                {\n"
                + "                    \"service_uid\": \"4686a8ca56534ae1a1b330c6c0489f3e\",\n"
                + "                    \"partition\": \"part-1\"\n"
                + "                },\n"
                + "                {\n"
                + "                    \"service_uid\": \"5a692788c4b443b4af9a68ee5a9fa7a0\",\n"
                + "                    \"partition\": \"part-2\"\n"
                + "                },\n"
                + "                {\n"
                + "                    \"service_uid\": \"07e3306dc3f2409eacd725dfd91f6d74\",\n"
                + "                    \"partition\": \"part-3\"\n"
                + "                },\n"
                + "                {\n"
                + "                    \"service_uid\": \"a2f37ae28c6b45c8b747d3a29c718cca\",\n"
                + "                    \"partition\": \"part-4\"\n"
                + "                },\n"
                + "                {\n"
                + "                    \"service_uid\": \"fceb8a504e194f098c595979ace926e8\",\n"
                + "                    \"partition\": \"part-5\"\n"
                + "                },\n"
                + "                {\n"
                + "                    \"service_uid\": \"14a74625b1bb4f9fbd37b8d3d710ae23\",\n"
                + "                    \"partition\": \"part-6\"\n"
                + "                },\n"
                + "                {\n"
                + "                    \"service_uid\": \"387bad978eeb4f6cb1c5d368b4bae291\",\n"
                + "                    \"partition\": \"part-7\"\n"
                + "                },\n"
                + "                {\n"
                + "                    \"service_uid\": \"cd441ba2c2454b6cb79a8ac64ba2de3e\",\n"
                + "                    \"partition\": \"part-8\"\n"
                + "                },\n"
                + "                {\n"
                + "                    \"service_uid\": \"da0a2ad524844b21b7ed03e63d68bc37\",\n"
                + "                    \"partition\": \"part-9\"\n"
                + "                },\n"
                + "                {\n"
                + "                    \"service_uid\": \"8418cace20e34a8fa6f2852bdaa1d012\",\n"
                + "                    \"partition\": \"part-10\"\n"
                + "                },\n"
                + "                {\n"
                + "                    \"service_uid\": \"fe056ad2295d48288c06ce43713f351c\",\n"
                + "                    \"partition\": \"part-11\"\n"
                + "                }\n"
                + "            ]";
    }
    ;
}
