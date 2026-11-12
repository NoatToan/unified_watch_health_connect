package com.xiaomi.ai.nlp.contact.weixin;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public enum Tag {
    TOP_HIT("最常使用"),
    CONTACT("联系人"),
    GROUP_CHAT("群聊");

    private static Map<String, Tag> textMap = new HashMap();
    private String text;

    static {
        for (Tag tag : values()) {
            textMap.put(tag.toString(), tag);
        }
    }

    Tag(String str) {
        this.text = str;
    }

    public static Tag fromString(String str) {
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
