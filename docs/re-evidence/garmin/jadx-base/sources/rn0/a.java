package rn0;

import c22.b0;
import com.garmin.android.apps.connectmobile.R;
import in0.h;
import in0.k;
import in0.m;
import java.util.Locale;
import lc.u0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrn0/a;", "", "<init>", "()V", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f153638a = new a();

    /* JADX INFO: renamed from: rn0.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C2909a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f153640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f153641c;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.HRV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.HEART_RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m.SKIN_TEMP_C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m.SKIN_TEMP_F.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[m.RESPIRATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[m.PULSE_OX.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f153639a = iArr;
            int[] iArr2 = new int[h.a.C1802a.EnumC1803a.values().length];
            try {
                iArr2[h.a.C1802a.EnumC1803a.BELOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[h.a.C1802a.EnumC1803a.ABOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[h.a.C1802a.EnumC1803a.IN_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            f153640b = iArr2;
            int[] iArr3 = new int[k.values().length];
            try {
                iArr3[k.HRV_BELOW_RANGE_HRV_STATUS_POOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[k.HRV_IN_RANGE_HRV_STATUS_POOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[k.HRV_ABOVE_RANGE_HRV_STATUS_POOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[k.HRV_BELOW_RANGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[k.HRV_IN_RANGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[k.HRV_ABOVE_RANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[k.SKIN_TEMPERATURE_BELOW_RANGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[k.SKIN_TEMPERATURE_IN_RANGE.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[k.SKIN_TEMPERATURE_ABOVE_RANGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[k.HEART_RATE_BELOW_RANGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[k.HEART_RATE_IN_RANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[k.HEART_RATE_ABOVE_RANGE.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr3[k.RESPIRATION_RATE_BELOW_RANGE.ordinal()] = 13;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[k.RESPIRATION_RATE_IN_RANGE.ordinal()] = 14;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[k.RESPIRATION_RATE_ABOVE_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[k.BLOOD_OXYGEN_BELOW_RANGE.ordinal()] = 16;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr3[k.BLOOD_OXYGEN_IN_RANGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused26) {
            }
            f153641c = iArr3;
        }
    }

    private a() {
    }

    public static int a(m mVar) {
        mVar.getClass();
        switch (C2909a.f153639a[mVar.ordinal()]) {
            case 1:
                return R.string.hrv;
            case 2:
                return R.string.activity_details_heart_rate;
            case 3:
            case 4:
                return R.string.lbl_skin_temp;
            case 5:
                return R.string.activities_respiration_title;
            case 6:
                return b();
            default:
                u0.r();
                return 0;
        }
    }

    public static int b() {
        return b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry()) ? R.string.device_settings_blood_ox : R.string.device_settings_pulse_ox;
    }
}
