package com.huami.assistant.model.bean;

import com.google.gson.annotations.SerializedName;
import com.xmlywind.sdk.common.Constants;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class Pin implements Serializable {

    @SerializedName("content")
    public String content;

    @SerializedName("contentAlign")
    public int contentAlign;

    @SerializedName("contentColor")
    public int contentColor;

    @SerializedName("contentSize")
    public int contentSize;

    @SerializedName("displayType")
    public int displayType;

    @SerializedName(Constants.EXPIRED)
    public int expired;

    @SerializedName("extraTime")
    public long extraTime;

    @SerializedName("highlights")
    public List<PinItem> highlights;

    @SerializedName("iconStr")
    public String iconStr;

    @SerializedName("startTime")
    public long startTime;

    @SerializedName("syncId")
    public String syncId;

    @SerializedName("title")
    public String title;

    public static class PinItem implements Serializable {

        @SerializedName("content")
        public String content;

        @SerializedName("contentAlign")
        public int contentAlign;

        @SerializedName("contentColor")
        public int contentColor;

        @SerializedName("contentSize")
        public int contentSize;

        @SerializedName("title")
        public String title;

        @SerializedName("titleAlign")
        public int titleAlign;

        @SerializedName("titleColor")
        public int titleColor;

        @SerializedName("titleSize")
        public int titleSize;

        public String toString() {
            return "PinItem{title='" + this.title + "', content='" + this.content + "', titleColor=" + this.titleColor + ", titleSize=" + this.titleSize + ", titleAlign=" + this.titleAlign + ", contentColor=" + this.contentColor + ", contentSize=" + this.contentSize + ", contentAlign=" + this.contentAlign + '}';
        }
    }

    public String toString() {
        return "Pin{iconStr=" + this.iconStr + ", title='" + this.title + "', content='" + this.content + "', contentColor=" + this.contentColor + ", contentSize=" + this.contentSize + ", contentAlign=" + this.contentAlign + ", displayType=" + this.displayType + ", expired=" + this.expired + ", startTime=" + this.startTime + ", highlights=" + this.highlights + '}';
    }
}
