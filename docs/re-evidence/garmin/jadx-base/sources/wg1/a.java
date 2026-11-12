package wg1;

import bs2.in;
import bs2.yt;
import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: wg1.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3425a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f185121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f185122b;

        static {
            int[] iArr = new int[yt.values().length];
            try {
                iArr[yt.SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yt.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yt.LONG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f185121a = iArr;
            int[] iArr2 = new int[in.values().length];
            try {
                iArr2[in.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[in.ACTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[in.GESTURE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f185122b = iArr2;
        }
    }

    public static final int a(in inVar) {
        int i14 = inVar == null ? -1 : C3425a.f185122b[inVar.ordinal()];
        if (i14 == 1) {
            return R.string.lbl_off;
        }
        if (i14 != 2) {
            return i14 != 3 ? R.string.lbl_off : R.string.device_setting_gesture;
        }
        return R.string.device_settings_action;
    }

    public static final int b(yt ytVar) {
        ytVar.getClass();
        int i14 = C3425a.f185121a[ytVar.ordinal()];
        if (i14 == 1) {
            return R.string.screen_timeout_short;
        }
        if (i14 != 2) {
            return i14 != 3 ? R.string.screen_timeout_short : R.string.screen_timeout_long;
        }
        return R.string.screen_timeout_medium;
    }
}
