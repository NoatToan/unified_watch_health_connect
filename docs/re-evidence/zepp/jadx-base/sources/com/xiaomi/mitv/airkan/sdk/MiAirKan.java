package com.xiaomi.mitv.airkan.sdk;

/* JADX INFO: loaded from: classes22.dex */
public interface MiAirKan {
    public static final int ERROR_CONNECT_FAILED = 17;
    public static final int ERROR_EMPTY_IP = 11;
    public static final int ERROR_INTERNAL = 15;
    public static final int ERROR_INVALID_REQUEST = 13;
    public static final int ERROR_RESPONSE_FAILED = 14;
    public static final int ERROR_TIME_OUT = 12;
    public static final int ERROR_UNKNOWN = 18;
    public static final int ERROR_VOICE_CLOSED = 16;
    public static final int EVENT_TYPE_KEY = 0;
    public static final int EVENT_TYPE_VOICE = 1;
    public static final int RESULT_FAILED = -1;
    public static final int RESULT_OK = 0;

    public interface Callback {
        void onResult(int i, int i2, String str);
    }

    public interface Key {
        void back();

        void down();

        void left();

        void menu();

        void ok();

        void power();

        void right();

        void up();

        void volumeDown();

        void volumeUp();
    }

    public interface Voice {
        void send(byte[] bArr);

        void start(Callback callback);

        void stop();
    }

    void close();

    void connect(Callback callback);

    Key key();

    void setCallback(Callback callback);

    void setIp(String str);

    Voice voice();
}
