package com.xiaomi.ai.domain.phonecall.common;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public enum ReQueryType {
    PAT_YES("patYes"),
    PAT_NO("patNo"),
    PAT_LAST("patLast"),
    PAT_ORDER("patOrder"),
    PAT_TAG("patTag"),
    PAT_NUMBER("patNumber"),
    PAT_OTHER("other");

    private static Map<String, ReQueryType> textMap = new HashMap();
    private String text;

    static {
        for (ReQueryType reQueryType : values()) {
            textMap.put(reQueryType.toString(), reQueryType);
        }
    }

    ReQueryType(String str) {
        this.text = str;
    }

    public static ReQueryType fromString(String str) {
        if (textMap.containsKey(str)) {
            return textMap.get(str);
        }
        return null;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }
}
