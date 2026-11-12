package com.airoha.android.lib.fota.stage;

/* JADX INFO: loaded from: classes2.dex */
public class CancelInfo {

    public class Reason {
        public static final byte Cancel = 0;
        public static final byte Fail = 1;
        public static final byte PartnerLost = 3;
        public static final byte TimeOut = 2;

        public Reason() {
        }
    }

    public class Sender {
        public static final byte Agent = 0;
        public static final byte SP = 7;

        public Sender() {
        }
    }
}
