package com.xiaomi.hm.health.bt.profile.alert;

import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattPeripheral;

/* JADX INFO: loaded from: classes10.dex */
public class HMAlertController {
    private static final String c = "HMAlertController";
    private HMAlertProfile a;
    private HMAlertServiceProfile b;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HMAlertMode.values().length];
            a = iArr;
            try {
                iArr[HMAlertMode.ALERT_THIRD_APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HMAlertMode.ALERT_FIND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HMAlertMode.ALERT_INCALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[HMAlertMode.ALERT_PACE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[HMAlertMode.ALERT_HR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[HMAlertMode.ALERT_SMS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[HMAlertMode.ALERT_STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[HMAlertMode.ALERT_LOVE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public HMAlertController(GattPeripheral gattPeripheral) {
        this.a = null;
        this.b = null;
        this.a = new HMAlertProfile(gattPeripheral);
        this.b = new HMAlertServiceProfile(gattPeripheral);
    }

    private boolean a(HMAlertMode mode, int value) {
        synchronized (this.a) {
            boolean zAlertMoreHr = false;
            if (!this.a.init()) {
                return false;
            }
            if (mode == HMAlertMode.ALERT_PACE) {
                zAlertMoreHr = this.a.alertMorePace(value);
            } else if (mode == HMAlertMode.ALERT_HR) {
                zAlertMoreHr = this.a.alertMoreHr(value);
            }
            this.a.deInit();
            return zAlertMoreHr;
        }
    }

    public boolean alert(HMAlertMode mode) {
        synchronized (this.a) {
            boolean zAlertFind = false;
            if (!this.a.init()) {
                return false;
            }
            switch (a.a[mode.ordinal()]) {
                case 1:
                case 2:
                    zAlertFind = this.a.alertFind();
                    break;
                case 3:
                    zAlertFind = this.a.alertIncall();
                    break;
                case 4:
                    zAlertFind = this.a.alertPace();
                    break;
                case 5:
                    zAlertFind = this.a.alertHr();
                    break;
                case 6:
                    zAlertFind = this.a.alertSms();
                    break;
                case 7:
                    zAlertFind = this.a.alertStop();
                    break;
                case 8:
                    zAlertFind = this.a.alertLove();
                    break;
            }
            this.a.deInit();
            return zAlertFind;
        }
    }

    public boolean pair() {
        synchronized (this.b) {
            if (!this.b.init()) {
                return false;
            }
            boolean zPair = this.b.pair();
            this.b.deInit();
            return zPair;
        }
    }

    public void resetVersion() {
        HMAlertServiceProfile hMAlertServiceProfile = this.b;
        if (hMAlertServiceProfile != null) {
            hMAlertServiceProfile.f();
        }
    }

    public boolean setBtPhoneDelay(byte delay) {
        synchronized (this.b) {
            if (!this.b.init()) {
                return false;
            }
            boolean btPhoneDelay = this.b.setBtPhoneDelay(delay);
            Debug.fi(c, "setBtPhoneDelay: " + btPhoneDelay);
            this.b.deInit();
            return btPhoneDelay;
        }
    }

    public void updateVersion() {
        HMAlertServiceProfile hMAlertServiceProfile = this.b;
        if (hMAlertServiceProfile != null) {
            hMAlertServiceProfile.updateVersion();
        }
    }

    public boolean alert(HMAlertModeExt ext, boolean isPiece, boolean supportCallReply) {
        ext.setAlertMaxLength(this.b.isAlterMaxLength());
        HMAlertMode mode = ext.getMode();
        if (mode != HMAlertMode.ALERT_FIND && mode != HMAlertMode.ALERT_LOVE) {
            if (mode != HMAlertMode.ALERT_PACE && mode != HMAlertMode.ALERT_HR) {
                if (this.b.g()) {
                    HMAlertServiceProfile hMAlertServiceProfile = this.b;
                    return hMAlertServiceProfile.patchWrite(hMAlertServiceProfile.getAlertCmdNew(ext, supportCallReply), 0);
                }
                if (isPiece && this.b.isSupportPatchWrite()) {
                    byte[] alertCmd = HMAlertServiceProfile.getAlertCmd(ext, 1);
                    return alertCmd != null && alertCmd.length > 0 && this.b.patchWrite(alertCmd, 0);
                }
                synchronized (this.b) {
                    if (!this.b.init()) {
                        return false;
                    }
                    boolean zAlert = this.b.alert(ext);
                    this.b.deInit();
                    return zAlert;
                }
            }
            return a(mode, ext.getValue());
        }
        return alert(mode);
    }

    public boolean alert(short time, short offsetTime, byte num) {
        Debug.i(c, "alert time:" + ((int) time) + ",offsetTime:" + ((int) offsetTime) + ",num:" + ((int) num));
        synchronized (this.a) {
            if (!this.a.init()) {
                return false;
            }
            boolean zAlert = this.a.alert(time, offsetTime, num);
            this.a.deInit();
            return zAlert;
        }
    }
}
