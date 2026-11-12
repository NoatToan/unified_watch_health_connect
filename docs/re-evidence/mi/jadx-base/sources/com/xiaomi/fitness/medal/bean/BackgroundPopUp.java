package com.xiaomi.fitness.medal.bean;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class BackgroundPopUp {

    @SerializedName("list")
    public ArrayList<DataList> list;

    public static class DataList {

        @SerializedName("id")
        public long id;

        @SerializedName("picture")
        public String picture;

        @SerializedName("title")
        public String title;

        @SerializedName("url")
        public String url;

        @SerializedName("urlType")
        public int urlType;

        public String toString() {
            return " id = " + this.id + ", picture = " + this.picture + ", url = " + this.url + ", urlType = " + this.urlType;
        }
    }

    public String toString() {
        return "BackgroundPopUp{list=" + this.list + AbstractJsonLexerKt.END_OBJ;
    }
}
