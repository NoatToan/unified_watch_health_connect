package c62;

import com.garmin.android.apps.connectmobile.R;

/* JADX INFO: loaded from: classes9.dex */
public final class k2 {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24774a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f24775b;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f24774a = iArr;
            int[] iArr2 = new int[m52.k.values().length];
            try {
                iArr2[m52.k.f116755o.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[m52.k.f116754n.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[m52.k.f116759t.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[m52.k.f116760v.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[m52.k.f116758r.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[m52.k.A.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[m52.k.f116757q.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[m52.k.f116756p.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[m52.k.f116762x.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[m52.k.f116761w.ordinal()] = 10;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[m52.k.f116764z.ordinal()] = 11;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[m52.k.f116763y.ordinal()] = 12;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[m52.k.B.ordinal()] = 13;
            } catch (NoSuchFieldError unused16) {
            }
            f24775b = iArr2;
        }
    }

    public static final androidx.lifecycle.w0 a(androidx.lifecycle.w0 w0Var, e23.l lVar) {
        return androidx.lifecycle.t1.a(w0Var, new a12.a(lVar, 27));
    }

    public static final int b(m52.k kVar) {
        switch (kVar == null ? -1 : a.f24775b[kVar.ordinal()]) {
            case -1:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                return R.string.courses_send_to_device_title_generic;
            case 0:
            default:
                lc.u0.r();
                return 0;
            case 1:
                return R.string.courses_send_to_device_title_cycling;
            case 2:
                return R.string.courses_send_to_device_title_running;
            case 3:
                return R.string.workout_send_to_device_title_strength_2;
            case 4:
                return R.string.workout_send_to_device_title_cardio_long;
            case 5:
                return R.string.workout_send_to_device_title_poolswim;
            case 6:
                return R.string.msg_workout_send_to_device_completion;
        }
    }
}
