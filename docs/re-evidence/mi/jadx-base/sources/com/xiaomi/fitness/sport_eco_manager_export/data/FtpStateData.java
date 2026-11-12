package com.xiaomi.fitness.sport_eco_manager_export.data;

import android.annotation.SuppressLint;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes10.dex */
public class FtpStateData implements Serializable {
    public int countdown;
    public int lightOnNumber;
    public int retryCount;
    public int stage;
    public int version;

    public FtpStateData() {
    }

    @SuppressLint({"WrongConstant"})
    public void clear() {
        this.version = 0;
        this.stage = 0;
        this.retryCount = 0;
        this.lightOnNumber = 0;
        this.countdown = 0;
    }

    public FtpStateData copy() {
        FtpStateData ftpStateData = new FtpStateData();
        ftpStateData.version = this.version;
        ftpStateData.stage = this.stage;
        ftpStateData.retryCount = this.retryCount;
        ftpStateData.lightOnNumber = this.lightOnNumber;
        ftpStateData.countdown = this.countdown;
        return ftpStateData;
    }

    public String toString() {
        return "FtpStateData{version=" + this.version + ", stage=" + this.stage + ", retryCount=" + this.retryCount + ", lightOnNumber=" + this.lightOnNumber + ", countdown=" + this.countdown + AbstractJsonLexerKt.END_OBJ;
    }

    public FtpStateData(int i, int i2, int i3, int i4, int i5) {
        this.version = i;
        this.stage = i2;
        this.retryCount = i3;
        this.lightOnNumber = i4;
        this.countdown = i5;
    }
}
