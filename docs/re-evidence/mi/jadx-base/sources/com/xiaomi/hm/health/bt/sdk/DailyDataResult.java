package com.xiaomi.hm.health.bt.sdk;

import com.xiaomi.hm.health.bt.sdk.data.FatBurningData;
import java.io.Serializable;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
public class DailyDataResult implements Serializable {
    public static final int ERROR_COMMAND_FAILED = 2;
    public static final int ERROR_DEVICE_BUSY = 5;
    public static final int ERROR_LOSE_PACKAGE = 1;
    public static final int ERROR_MUSIC_ALIVE = 6;
    public static final int ERROR_NONE = 0;
    public static final int ERROR_NO_CONNECTION = 3;
    public static final int ERROR_NO_DATA = 4;
    public static final int ERROR_OTHER = 100;
    public static final int ERROR_SPEECH_ALIVE = 7;
    private static final long serialVersionUID = 1;
    private int error;
    private List<FatBurningData> fatBurningDataList;
    private List<DailyData> list;
    private int timestamp;
    private int tz;

    public int getError() {
        return this.error;
    }

    public List<FatBurningData> getFatBurningDataList() {
        return this.fatBurningDataList;
    }

    public List<DailyData> getList() {
        return this.list;
    }

    public int getTimestamp() {
        return this.timestamp;
    }

    public int getTz() {
        return this.tz;
    }

    public void setError(int i) {
        this.error = i;
    }

    public void setFatBurningDataList(List<FatBurningData> list) {
        this.fatBurningDataList = list;
    }

    public void setList(List<DailyData> list) {
        this.list = list;
    }

    public void setTimestamp(int i) {
        this.timestamp = i;
    }

    public void setTz(int i) {
        this.tz = i;
    }

    public String toString() {
        return "DailyDataResult{timestamp=" + this.timestamp + ", tz=" + this.tz + ", error=" + this.error + ", list=" + this.list + AbstractJsonLexerKt.END_OBJ;
    }
}
