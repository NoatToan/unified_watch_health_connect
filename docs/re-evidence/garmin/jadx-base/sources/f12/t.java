package f12;

import com.garmin.android.apps.connectmobile.R;
import lc.u0;

/* JADX INFO: loaded from: classes10.dex */
public final class t {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68102a;

        static {
            int[] iArr = new int[u.values().length];
            try {
                iArr[u.LEVEL_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[u.LEVEL_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[u.LEVEL_3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[u.LEVEL_4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[u.LEVEL_5.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[u.LEVEL_6.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[u.LEVEL_7.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[u.LEVEL_8.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[u.LEVEL_9.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[u.LEVEL_10.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f68102a = iArr;
        }
    }

    public static final int a(u uVar) {
        switch (a.f68102a[uVar.ordinal()]) {
            case 1:
                return R.color.gcm3_user_level_1;
            case 2:
                return R.color.gcm3_user_level_2;
            case 3:
                return R.color.gcm3_user_level_3;
            case 4:
                return R.color.gcm3_user_level_4;
            case 5:
                return R.color.gcm3_user_level_5;
            case 6:
                return R.color.gcm3_user_level_6;
            case 7:
                return R.color.gcm3_user_level_7;
            case 8:
                return R.color.gcm3_user_level_8;
            case 9:
                return R.color.gcm3_user_level_9;
            case 10:
                return R.color.gcm3_user_level_10;
            default:
                u0.r();
                return 0;
        }
    }
}
