package com.airoha.liblogger;

import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class LogInfo {
    private String a;
    private LOG_TYPE b;
    private Date c;
    private int d;
    private String e;
    private String f;
    private byte[] g;

    public enum LOG_TYPE {
        TEXT,
        BINARY
    }

    public LogInfo(int i, String str, String str2) {
        this.b = LOG_TYPE.TEXT;
        this.c = Calendar.getInstance().getTime();
        this.d = i;
        this.e = str;
        this.f = str2;
    }

    public int getLogLevel() {
        return this.d;
    }

    public LOG_TYPE getLogType() {
        return this.b;
    }

    public byte[] getRaw() {
        return this.g;
    }

    public String getTag() {
        return this.e;
    }

    public String getTargetPrinterName() {
        return this.a;
    }

    public String getText() {
        return this.f;
    }

    public Date getTimeStamp() {
        return this.c;
    }

    public LogInfo(String str, String str2) {
        this.a = str;
        this.b = LOG_TYPE.TEXT;
        this.f = str2;
    }

    public LogInfo(String str, byte[] bArr) {
        this.a = str;
        this.b = LOG_TYPE.BINARY;
        this.g = bArr;
    }
}
