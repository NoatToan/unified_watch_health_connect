package com.garmin.android.framework.garminonline.query;

/* JADX INFO: loaded from: classes8.dex */
public class VersionException extends QueryException {
    public static final int VERSION_OUT_OF_DATE = 10001;
    private static final long serialVersionUID = 1;
    private String updateUrl;
    private int versionNumber;

    public VersionException(String str, int i14) {
        super(10001);
        this.updateUrl = str;
        this.versionNumber = i14;
    }

    public String getUpdateUrl() {
        return this.updateUrl;
    }

    public int getVersionNumber() {
        return this.versionNumber;
    }

    public VersionException(String str) {
        super(10001);
        this.updateUrl = str;
    }
}
