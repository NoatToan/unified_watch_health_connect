package com.ximalaya.ting.android.opensdk.model.word;

import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes22.dex */
public class HotWord {
    private int count;
    private int degree;

    @SerializedName("search_word")
    private String searchword;

    public int getCount() {
        return this.count;
    }

    public int getDegree() {
        return this.degree;
    }

    public String getSearchword() {
        return this.searchword;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setDegree(int i) {
        this.degree = i;
    }

    public void setSearchword(String str) {
        this.searchword = str;
    }

    public String toString() {
        return "HotWord [searchword=" + this.searchword + ", degree=" + this.degree + ", count=" + this.count + "]";
    }
}
