package com.ingenic.iwds.smartvibrate;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.Vibrator;
import com.ingenic.iwds.common.api.ServiceManagerContext;
import com.ingenic.iwds.utils.IwdsLog;

/* JADX INFO: loaded from: classes18.dex */
public class VibrateServiceManager extends ServiceManagerContext {
    public static final int VIBRATE_1000MS_ALERT = 16;
    public static final int VIBRATE_750MS_ALERT = 15;
    public static final int VIBRATE_BUZZ_1 = 47;
    public static final int VIBRATE_BUZZ_2 = 48;
    public static final int VIBRATE_BUZZ_3 = 49;
    public static final int VIBRATE_BUZZ_4 = 50;
    public static final int VIBRATE_BUZZ_5 = 51;
    public static final int VIBRATE_DELAY = 0;
    public static final int VIBRATE_DOUBLE_CLICK1 = 10;
    public static final int VIBRATE_DOUBLE_CLICK2 = 11;
    public static final int VIBRATE_LONG_BUZZ_STOPPING = 118;
    public static final int VIBRATE_LONG_DOUBLE_SHARP_CLICK_MEDIUM_1 = 41;
    public static final int VIBRATE_LONG_DOUBLE_SHARP_CLICK_MEDIUM_2 = 42;
    public static final int VIBRATE_LONG_DOUBLE_SHARP_CLICK_MEDIUM_3 = 43;
    public static final int VIBRATE_LONG_DOUBLE_SHARP_CLICK_STRONG_1 = 37;
    public static final int VIBRATE_LONG_DOUBLE_SHARP_CLICK_STRONG_2 = 38;
    public static final int VIBRATE_LONG_DOUBLE_SHARP_CLICK_STRONG_3 = 39;
    public static final int VIBRATE_LONG_DOUBLE_SHARP_CLICK_STRONG_4 = 40;
    public static final int VIBRATE_LONG_DOUBLE_SHARP_CLICK_TICK_1 = 44;
    public static final int VIBRATE_LONG_DOUBLE_SHARP_CLICK_TICK_2 = 45;
    public static final int VIBRATE_LONG_DOUBLE_SHARP_CLICK_TICK_3 = 46;
    public static final int VIBRATE_MEDIUM_CLICK_1 = 21;
    public static final int VIBRATE_MEDIUM_CLICK_2 = 22;
    public static final int VIBRATE_MEDIUM_CLICK_3 = 23;
    public static final int VIBRATE_PULSING_MEDIUM_1 = 54;
    public static final int VIBRATE_PULSING_MEDIUM_2 = 55;
    public static final int VIBRATE_PULSING_SHARP_1 = 56;
    public static final int VIBRATE_PULSING_SHARP_2 = 57;
    public static final int VIBRATE_PULSING_STRONG_1 = 52;
    public static final int VIBRATE_PULSING_STRONG_2 = 53;
    public static final int VIBRATE_SHARP_CLICK1 = 4;
    public static final int VIBRATE_SHARP_CLICK2 = 5;
    public static final int VIBRATE_SHARP_CLICK3 = 6;
    public static final int VIBRATE_SHARP_TICK_1 = 24;
    public static final int VIBRATE_SHARP_TICK_2 = 25;
    public static final int VIBRATE_SHARP_TICK_3 = 26;
    public static final int VIBRATE_SHORT_DOUBLE_CLICK_MEDIUM_1 = 31;
    public static final int VIBRATE_SHORT_DOUBLE_CLICK_MEDIUM_2 = 32;
    public static final int VIBRATE_SHORT_DOUBLE_CLICK_MEDIUM_3 = 33;
    public static final int VIBRATE_SHORT_DOUBLE_CLICK_STRONG_1 = 27;
    public static final int VIBRATE_SHORT_DOUBLE_CLICK_STRONG_2 = 28;
    public static final int VIBRATE_SHORT_DOUBLE_CLICK_STRONG_3 = 29;
    public static final int VIBRATE_SHORT_DOUBLE_CLICK_STRONG_4 = 30;
    public static final int VIBRATE_SHORT_DOUBLE_SHARP_TICK_1 = 34;
    public static final int VIBRATE_SHORT_DOUBLE_SHARP_TICK_2 = 35;
    public static final int VIBRATE_SHORT_DOUBLE_SHARP_TICK_3 = 36;
    public static final int VIBRATE_SMOOTH_HUM_1 = 119;
    public static final int VIBRATE_SMOOTH_HUM_2 = 120;
    public static final int VIBRATE_SMOOTH_HUM_3 = 121;
    public static final int VIBRATE_SMOOTH_HUM_4 = 122;
    public static final int VIBRATE_SMOOTH_HUM_5 = 123;
    public static final int VIBRATE_SOFT_BUMP1 = 7;
    public static final int VIBRATE_SOFT_BUMP2 = 8;
    public static final int VIBRATE_SOFT_BUMP3 = 9;
    public static final int VIBRATE_SOFT_FUZZ = 13;
    public static final int VIBRATE_STRONG_CLICK1 = 1;
    public static final int VIBRATE_STRONG_CLICK2 = 2;
    public static final int VIBRATE_STRONG_CLICK3 = 3;
    public static final int VIBRATE_STRONG_CLICK_1 = 17;
    public static final int VIBRATE_STRONG_CLICK_2 = 18;
    public static final int VIBRATE_STRONG_CLICK_3 = 19;
    public static final int VIBRATE_STRONG_CLICK_4 = 20;
    public static final int VIBRATE_STRONG_FUZZ = 14;
    public static final int VIBRATE_TRANSITION_CLICK_1 = 58;
    public static final int VIBRATE_TRANSITION_CLICK_2 = 59;
    public static final int VIBRATE_TRANSITION_CLICK_3 = 60;
    public static final int VIBRATE_TRANSITION_CLICK_4 = 61;
    public static final int VIBRATE_TRANSITION_CLICK_5 = 62;
    public static final int VIBRATE_TRANSITION_CLICK_6 = 63;
    public static final int VIBRATE_TRANSITION_HUM_1 = 64;
    public static final int VIBRATE_TRANSITION_HUM_2 = 65;
    public static final int VIBRATE_TRANSITION_HUM_3 = 66;
    public static final int VIBRATE_TRANSITION_HUM_4 = 67;
    public static final int VIBRATE_TRANSITION_HUM_5 = 68;
    public static final int VIBRATE_TRANSITION_HUM_6 = 69;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_LONG_SHARP_1 = 76;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_LONG_SHARP_1_HALF = 100;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_LONG_SHARP_2 = 77;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_LONG_SHARP_2_HALF = 101;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_LONG_SMOOTH_1 = 70;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_LONG_SMOOTH_1_HALF = 94;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_LONG_SMOOTH_2 = 71;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_LONG_SMOOTH_2_HALF = 95;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_MEDIUM_SHARP_1 = 78;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_MEDIUM_SHARP_1_HALF = 102;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_MEDIUM_SHARP_2 = 79;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_MEDIUM_SHARP_2_HALF = 103;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_MEDIUM_SMOOTH_1 = 72;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_MEDIUM_SMOOTH_1_HALF = 96;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_MEDIUM_SMOOTH_2 = 73;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_MEDIUM_SMOOTH_2_HALF = 97;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_SHORT_SHARP_1 = 80;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_SHORT_SHARP_1_HALF = 104;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_SHORT_SHARP_2 = 81;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_SHORT_SHARP_2_HALF = 105;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_SHORT_SMOOTH_1 = 74;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_SHORT_SMOOTH_1_HALF = 98;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_SHORT_SMOOTH_2 = 75;
    public static final int VIBRATE_TRANSITION_RAMP_DOWN_SHORT_SMOOTH_2_HALF = 99;
    public static final int VIBRATE_TRANSITION_RAMP_UP_LONG_SHARP_1 = 88;
    public static final int VIBRATE_TRANSITION_RAMP_UP_LONG_SHARP_1_HALF = 112;
    public static final int VIBRATE_TRANSITION_RAMP_UP_LONG_SHARP_2 = 89;
    public static final int VIBRATE_TRANSITION_RAMP_UP_LONG_SHARP_2_HALF = 113;
    public static final int VIBRATE_TRANSITION_RAMP_UP_LONG_SMOOTH_1 = 82;
    public static final int VIBRATE_TRANSITION_RAMP_UP_LONG_SMOOTH_1_HALF = 106;
    public static final int VIBRATE_TRANSITION_RAMP_UP_LONG_SMOOTH_2 = 83;
    public static final int VIBRATE_TRANSITION_RAMP_UP_LONG_SMOOTH_2_HALF = 107;
    public static final int VIBRATE_TRANSITION_RAMP_UP_MEDIUM_SHARP_1 = 90;
    public static final int VIBRATE_TRANSITION_RAMP_UP_MEDIUM_SHARP_1_HALF = 114;
    public static final int VIBRATE_TRANSITION_RAMP_UP_MEDIUM_SHARP_2 = 91;
    public static final int VIBRATE_TRANSITION_RAMP_UP_MEDIUM_SHARP_2_HALF = 115;
    public static final int VIBRATE_TRANSITION_RAMP_UP_MEDIUM_SMOOTH_1 = 84;
    public static final int VIBRATE_TRANSITION_RAMP_UP_MEDIUM_SMOOTH_1_HALF = 108;
    public static final int VIBRATE_TRANSITION_RAMP_UP_MEDIUM_SMOOTH_2 = 85;
    public static final int VIBRATE_TRANSITION_RAMP_UP_MEDIUM_SMOOTH_2_HALF = 109;
    public static final int VIBRATE_TRANSITION_RAMP_UP_SHORT_SHARP_1 = 92;
    public static final int VIBRATE_TRANSITION_RAMP_UP_SHORT_SHARP_1_HALF = 116;
    public static final int VIBRATE_TRANSITION_RAMP_UP_SHORT_SHARP_2 = 93;
    public static final int VIBRATE_TRANSITION_RAMP_UP_SHORT_SHARP_2_HALF = 117;
    public static final int VIBRATE_TRANSITION_RAMP_UP_SHORT_SMOOTH_1 = 86;
    public static final int VIBRATE_TRANSITION_RAMP_UP_SHORT_SMOOTH_1_HALF = 110;
    public static final int VIBRATE_TRANSITION_RAMP_UP_SHORT_SMOOTH_2 = 87;
    public static final int VIBRATE_TRANSITION_RAMP_UP_SHORT_SMOOTH_2_HALF = 111;
    public static final int VIBRATE_TRIPLE_CLICK = 12;
    private final Vibrator a;
    private IVibrateService b;

    public class VibrateModes {
        public int[] effect;
        public int length;

        public VibrateModes() {
        }
    }

    public class a extends ServiceManagerContext.ServiceClientProxy {
        public a() {
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public IBinder getBinder() {
            return VibrateServiceManager.this.b.asBinder();
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceConnected(IBinder iBinder) {
            VibrateServiceManager.this.b = IVibrateService.Stub.asInterface(iBinder);
        }

        @Override // com.ingenic.iwds.common.api.ServiceManagerContext.ServiceClientProxy
        public void onServiceDisconnected(boolean z) {
        }
    }

    public VibrateServiceManager(Context context) {
        super(context);
        this.a = (Vibrator) context.getSystemService("vibrator");
        this.m_serviceClientProxy = new a();
    }

    public VibrateModes GetCustomModes(int i) {
        VibrateModes vibrateModes = new VibrateModes();
        int[] iArr = new int[3];
        vibrateModes.effect = iArr;
        if (i == 1) {
            iArr[0] = 10;
            iArr[1] = 10;
            iArr[2] = 10;
        } else if (i == 2) {
            iArr[0] = 76;
            iArr[1] = 76;
            iArr[2] = 76;
        } else {
            if (i != 3) {
                return null;
            }
            iArr[0] = 64;
            iArr[1] = 0;
            iArr[2] = 0;
        }
        return vibrateModes;
    }

    public VibrateModes GetVibrateModes(int[] iArr, int i) {
        VibrateModes vibrateModes = new VibrateModes();
        vibrateModes.effect = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            vibrateModes.effect[i2] = iArr[i2];
        }
        return vibrateModes;
    }

    public void SpecialVibrate(VibrateModes vibrateModes) {
        if (vibrateModes == null) {
            return;
        }
        try {
            this.b.Drv2605Vibrate(vibrateModes.effect);
        } catch (RemoteException e) {
            IwdsLog.e(this, "Exception in vibrate: " + e.toString());
        }
    }

    public void cancel() {
        this.a.cancel();
    }

    public boolean hasVibrator() {
        return this.a.hasVibrator();
    }

    public void vibrate(long j) {
        this.a.vibrate(j);
    }

    public void vibrate(long[] jArr, int i) {
        this.a.vibrate(jArr, i);
    }
}
