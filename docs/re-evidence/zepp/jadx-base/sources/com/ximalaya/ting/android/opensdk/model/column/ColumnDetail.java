package com.ximalaya.ting.android.opensdk.model.column;

import com.google.gson.annotations.SerializedName;
import com.ximalaya.ting.android.opensdk.datatrasfer.XimalayaResponse;

/* JADX INFO: loaded from: classes22.dex */
public class ColumnDetail extends XimalayaResponse {

    @SerializedName("column_content_type")
    private int columnContentType;

    @SerializedName("column_editor")
    private ColumnEditor columnEditor;

    @SerializedName("id")
    private long columnId;

    @SerializedName("column_intro")
    private String columnIntro;

    @SerializedName("cover_url_large")
    private String coverUrlLarge;

    @SerializedName("logo_small")
    private String logoSmall;

    public int getColumnContentType() {
        return this.columnContentType;
    }

    public ColumnEditor getColumnEditor() {
        return this.columnEditor;
    }

    public long getColumnId() {
        return this.columnId;
    }

    public String getColumnIntro() {
        return this.columnIntro;
    }

    public String getCoverUrlLarge() {
        return this.coverUrlLarge;
    }

    public String getLogoSmall() {
        return this.logoSmall;
    }

    public void setColumnContentType(int i) {
        this.columnContentType = i;
    }

    public void setColumnEditor(ColumnEditor columnEditor) {
        this.columnEditor = columnEditor;
    }

    public void setColumnId(long j) {
        this.columnId = j;
    }

    public void setColumnIntro(String str) {
        this.columnIntro = str;
    }

    public void setCoverUrlLarge(String str) {
        this.coverUrlLarge = str;
    }

    public void setLogoSmall(String str) {
        this.logoSmall = str;
    }

    public String toString() {
        return "ColumnDetail [columnId=" + this.columnId + ", columnIntro=" + this.columnIntro + ", columnContentType=" + this.columnContentType + ", coverUrlLarge=" + this.coverUrlLarge + ", logoSmall=" + this.logoSmall + ", columnEditor=" + this.columnEditor + "]";
    }
}
