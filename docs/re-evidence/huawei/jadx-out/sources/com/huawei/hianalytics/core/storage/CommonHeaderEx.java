package com.huawei.hianalytics.core.storage;

/* JADX INFO: loaded from: classes3.dex */
public class CommonHeaderEx {
    private String commonHeaderEx;
    private String evtExHashCode;
    public static final Property COLUMN_HASHCODE = new Property(String.class, "EVT_EX_HASH_CODE");
    public static final String TABLE_NAME = "COMMON_HEADER_EX";
    public static final Property COLUMN_HEADER = new Property(String.class, TABLE_NAME);

    public CommonHeaderEx() {
    }

    public String getCommonHeaderEx() {
        String str = this.commonHeaderEx;
        return str == null ? "" : str;
    }

    public String getEvtExHashCode() {
        String str = this.evtExHashCode;
        return str == null ? "" : str;
    }

    public void setCommonHeaderEx(String str) {
        this.commonHeaderEx = str;
    }

    public void setEvtExHashCode(String str) {
        this.evtExHashCode = str;
    }

    public CommonHeaderEx(String str, String str2) {
        this.evtExHashCode = str;
        this.commonHeaderEx = str2;
    }
}
