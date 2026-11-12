package com.huawei.hwfoundationmodel.trackmodel;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class TrackPauseData implements Serializable, TimeSequence {
    private static final long serialVersionUID = 8066911513283924393L;

    @SerializedName("timer")
    private int timer;

    @SerializedName("timestamp")
    private long timestamp;

    @SerializedName("type")
    private int type;

    public enum Type {
        RESUME(0),
        PAUSE(1),
        END(4);

        private final int value;

        Type(int i) {
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public static Type fromValue(int i) {
            for (Type type : values()) {
                if (type.value == i) {
                    return type;
                }
            }
            throw new IllegalArgumentException("Unknown Type value: " + i);
        }
    }

    public TrackPauseData(long j, int i, int i2) {
        this.timestamp = j;
        this.timer = i;
        this.type = i2;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    public int getTimer() {
        return this.timer;
    }

    public void setTimer(int i) {
        this.timer = i;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int i) {
        this.type = i;
    }

    public String toString() {
        return "TrackPauseData{timestamp=" + this.timestamp + ", timer=" + this.timer + ", type=" + this.type + '}';
    }

    @Override // com.huawei.hwfoundationmodel.trackmodel.TimeSequence
    public long acquireTime() {
        return this.timestamp;
    }
}
