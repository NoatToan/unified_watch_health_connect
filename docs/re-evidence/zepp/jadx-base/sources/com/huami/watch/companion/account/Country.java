package com.huami.watch.companion.account;

import com.google.gson.Gson;
import com.huami.watch.companion.ui.view.WheelAdapter;

/* JADX INFO: loaded from: classes16.dex */
public class Country implements WheelAdapter.Item {
    private String code;
    private int disneyAge;
    private String lang;
    private String name;

    public boolean equals(Object obj) {
        return (obj == null || !(obj instanceof Country)) ? super.equals(obj) : this.code.equalsIgnoreCase(((Country) obj).getCode());
    }

    public String getCode() {
        return this.code;
    }

    public int getDisneyAge() {
        return this.disneyAge;
    }

    @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
    public String getKey() {
        return this.code;
    }

    public String getLang() {
        return this.lang;
    }

    public String getName() {
        return this.name;
    }

    @Override // com.huami.watch.companion.ui.view.WheelAdapter.Item
    public String getValue() {
        return this.name;
    }

    public void setCode(String str) {
        this.code = str;
    }

    public void setLang(String str) {
        this.lang = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String toString() {
        return new Gson().toJson(this);
    }
}
