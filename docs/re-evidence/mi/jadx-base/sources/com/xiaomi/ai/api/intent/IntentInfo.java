package com.xiaomi.ai.api.intent;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class IntentInfo {
    private String category;
    private String name;
    private List<SlotInfo> slotsInfo;
    private String subCategory;

    public IntentInfo() {
    }

    public String getCategory() {
        return this.category;
    }

    public String getName() {
        return this.name;
    }

    public List<SlotInfo> getSlotsInfo() {
        return this.slotsInfo;
    }

    public String getSubCategory() {
        return this.subCategory;
    }

    public IntentInfo setCategory(String str) {
        this.category = str;
        return this;
    }

    public IntentInfo setName(String str) {
        this.name = str;
        return this;
    }

    public IntentInfo setSlotsInfo(List<SlotInfo> list) {
        this.slotsInfo = list;
        return this;
    }

    public IntentInfo setSubCategory(String str) {
        this.subCategory = str;
        return this;
    }

    public IntentInfo(String str, String str2, String str3, List<SlotInfo> list) {
        this.name = str;
        this.category = str2;
        this.subCategory = str3;
        this.slotsInfo = list;
    }
}
