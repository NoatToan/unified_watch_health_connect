package com.xiaomi.hm.health.speech.utils;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes21.dex */
public class ChatCharacterUtils {
    private static final String a = "";
    private static final String b = "...";

    public static String truncateSpeechChatCharacters(String speechResponseStr, int characterMaxLength) {
        if (TextUtils.isEmpty(speechResponseStr) || characterMaxLength <= 0 || characterMaxLength <= 3) {
            return "";
        }
        if (speechResponseStr.length() < characterMaxLength) {
            return speechResponseStr;
        }
        return speechResponseStr.substring(0, characterMaxLength - 3) + b;
    }
}
