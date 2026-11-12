package em1;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import rl1.i;
import rl1.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lem1/c;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-charts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f64619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b10.c f64620b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64621a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f64622b;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.DEEP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.REM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.AWAKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f64621a = iArr;
            int[] iArr2 = new int[i.values().length];
            try {
                iArr2[i.MOVEMENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[i.BREATHING_VARIATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[i.AWAKE_RESTLESSNESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[i.RESTING_HEART_RATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[i.OVERNIGHT_HEART_RATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[i.BODY_BATTERY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[i.PULSE_OX.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[i.RESPIRATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[i.RESPIRATION_AVERAGES.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[i.OVERNIGHT_HRV.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            f64622b = iArr2;
        }
    }

    public c(l22.b bVar) {
        bVar.getClass();
        this.f64619a = bVar;
        this.f64620b = new b10.c(bVar);
    }

    public final String a(i iVar) {
        int i14;
        iVar.getClass();
        switch (a.f64622b[iVar.ordinal()]) {
            case 1:
                i14 = R.string.lbl_movement;
                break;
            case 2:
                i14 = R.string.lbl_breathing_variations;
                break;
            case 3:
                i14 = R.string.lbl_restless_moments;
                break;
            case 4:
                i14 = R.string.resting_heart_rate;
                break;
            case 5:
                i14 = R.string.lbl_avg_overnight_heart_rate;
                break;
            case 6:
                i14 = R.string.gcm_body_battery_lbl_body_battery;
                break;
            case 7:
                i14 = R.string.device_settings_pulse_ox;
                break;
            case 8:
                i14 = R.string.activities_respiration_title;
                break;
            case 9:
                i14 = R.string.lbl_avg_respiration;
                break;
            case 10:
                i14 = R.string.lbl_overnight_hrv;
                break;
            default:
                i14 = -1;
                break;
        }
        return this.f64619a.getString(i14);
    }
}
