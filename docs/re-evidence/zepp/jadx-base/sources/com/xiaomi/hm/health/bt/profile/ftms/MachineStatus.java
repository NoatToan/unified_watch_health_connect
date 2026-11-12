package com.xiaomi.hm.health.bt.profile.ftms;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes12.dex */
public class MachineStatus {

    @Deprecated
    public static final int OP_CTL = 2;
    public static final int OP_ERROR = 2;
    public static final int OP_MAINTENANCE = 3;
    public static final int OP_SPEED = 1;
    public static final int OP_START = 4;
    public static final int OP_STOP = 3;

    @Deprecated
    public static final int PAUSE = 2;
    public static final int SPEED_DEC = 2;
    public static final int SPEED_INC = 1;
    public static final int STATUS_NEED_MAINTENANCE = 1;
    public static final int STATUS_NO_NEED_MAINTENANCE = 2;

    @Deprecated
    public static final int STOP = 1;
    private int a;
    private byte[] b;

    public MachineStatus(int op, byte[] data) {
        this.a = 4;
        this.b = null;
        this.a = op;
        this.b = data;
    }

    public byte[] getData() {
        return this.b;
    }

    public int getOp() {
        return this.a;
    }

    public void setData(byte[] data) {
        this.b = data;
    }

    public void setOp(int op) {
        this.a = op;
    }

    @NonNull
    public String toString() {
        return "MachineStatus{op=" + this.a + ", data=" + Arrays.toString(this.b) + '}';
    }

    public MachineStatus(int op) {
        this.a = 4;
        this.b = null;
        this.a = op;
    }
}
