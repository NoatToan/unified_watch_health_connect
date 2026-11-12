package com.nimbusds.jose.shaded.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum FieldNamingPolicy implements FieldNamingStrategy {
    IDENTITY { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.1
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return field.getName();
        }
    },
    UPPER_CAMEL_CASE { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.2
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
        }
    },
    UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.3
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), ' '));
        }
    },
    UPPER_CASE_WITH_UNDERSCORES { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.4
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_UNDERSCORES { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.5
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DASHES { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.6
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    },
    LOWER_CASE_WITH_DOTS { // from class: com.nimbusds.jose.shaded.gson.FieldNamingPolicy.7
        @Override // com.nimbusds.jose.shaded.gson.FieldNamingStrategy
        public String translateName(Field field) {
            return FieldNamingPolicy.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };

    public static String separateCamelCase(String str, char c14) {
        StringBuilder sb3 = new StringBuilder();
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (Character.isUpperCase(cCharAt) && sb3.length() != 0) {
                sb3.append(c14);
            }
            sb3.append(cCharAt);
        }
        return sb3.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length();
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    break;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                if (i14 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i14) + upperCase + str.substring(i14 + 1);
            }
        }
        return str;
    }
}
