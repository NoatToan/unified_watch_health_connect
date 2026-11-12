package com.xiaomi.hm.health.bt.profile.speech;

/* JADX INFO: loaded from: classes18.dex */
public class HMSpeechEvent {
    public static final int CTRL_EXIT = 2;
    public static final int CTRL_START = 1;
    public static final int CTRL_STOP = 0;
    public static final int RESULT_CANCEL = 2;
    public static final int RESULT_FULL = 3;
    public static final int RESULT_SUCCESS = 1;
    public static final int TYPE_CTRL = 1;
    public static final int TYPE_RESULT = 2;
    private int a;
    private int b;
    private int c;
    private int d;

    public HMSpeechEvent(int type, int ctrl) {
        this.a = 1;
        this.b = 1;
        this.c = 0;
        this.d = 1;
        this.a = type;
        this.b = ctrl;
    }

    public int getCtrl() {
        return this.b;
    }

    public int getId() {
        return this.c;
    }

    public int getResult() {
        return this.d;
    }

    public int getType() {
        return this.a;
    }

    public void setCtrl(int ctrl) {
        this.b = ctrl;
    }

    public void setId(int id) {
        this.c = id;
    }

    public void setResult(int result) {
        this.d = result;
    }

    public void setType(int type) {
        this.a = type;
    }

    public String toString() {
        return "HMSpeechEvent{type=" + this.a + ", ctrl=" + this.b + ", id=" + this.c + ", result=" + this.d + '}';
    }

    public HMSpeechEvent(int type, int id, int result) {
        this.a = 1;
        this.b = 1;
        this.c = 0;
        this.d = 1;
        this.a = type;
        this.c = id;
        this.d = result;
    }
}
