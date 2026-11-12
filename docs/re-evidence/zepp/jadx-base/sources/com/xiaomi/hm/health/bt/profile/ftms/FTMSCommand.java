package com.xiaomi.hm.health.bt.profile.ftms;

/* JADX INFO: loaded from: classes12.dex */
public class FTMSCommand {
    public static final int INCLINATION_DEC = 2;
    public static final int INCLINATION_INC = 1;
    public static final int NO_LOAD_CLOSE = 2;
    public static final int NO_LOAD_OPEN = 1;
    public static final int OP_INCLINATION = 25;
    public static final int OP_NO_LOAD = 21;
    public static final int OP_SET_INCLINATION = 26;
    public static final int OP_SET_SPEED = 23;
    public static final int OP_SET_UNIT = 27;
    public static final int OP_SPEED = 22;
    public static final int OP_STOP_AND_DELETE = 24;
    public static final int OP_UNIT_IMPERIAL = 2;
    public static final int OP_UNIT_METRIC = 1;
    public static final int SPEED_DEC = 2;
    public static final int SPEED_INC = 1;
    public static final int STOP_AND_DELETE_CMD = 0;
    private byte a;
    private byte b;
    private byte[] c;

    public FTMSCommand(int command, int data) {
        byte b = (byte) command;
        this.a = b;
        byte b2 = (byte) data;
        this.b = b2;
        this.c = new byte[]{b, b2};
    }

    public byte[] getBytes() {
        return this.c;
    }

    public int getData() {
        return this.b;
    }

    public int getOp() {
        return this.a;
    }
}
