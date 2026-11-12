package com.xiaomi.ai.domain.phonecall.contact;

import com.google.gson.annotations.SerializedName;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneItem {
    private boolean autoDial;
    private String name;
    private String number;
    private String tag;

    @SerializedName(alternate = {"userId", "userID"}, value = "user_id")
    private String userId;

    public PhoneItem() {
        this.userId = "";
        this.name = "";
        this.tag = "";
        this.number = "";
        this.autoDial = false;
    }

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public String getTag() {
        return this.tag;
    }

    public String getUserId() {
        return this.userId;
    }

    public boolean isAutoDial() {
        return this.autoDial;
    }

    public void setAutoDial(boolean z) {
        this.autoDial = z;
    }

    public PhoneItem setName(String str) {
        this.name = str;
        return this;
    }

    public PhoneItem setNumber(String str) {
        this.number = str;
        return this;
    }

    public void setTag(String str) {
        this.tag = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String toString() {
        return "PhoneItem{userId='" + this.userId + "', name='" + this.name + "', tag='" + this.tag + "', number='" + this.number + "', autoDial=" + this.autoDial + AbstractJsonLexerKt.END_OBJ;
    }

    public PhoneItem(String str, String str2, String str3, String str4, boolean z) {
        this.userId = str;
        this.name = str2;
        this.tag = str3;
        this.number = str4;
        this.autoDial = z;
    }
}
