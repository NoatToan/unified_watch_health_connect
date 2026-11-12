package s90;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ls90/c;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f158029a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158030a;

        static {
            int[] iArr = new int[yl2.b.values().length];
            try {
                iArr[yl2.b.f197814x3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yl2.b.f197821y3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yl2.b.f197828z3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yl2.b.A3.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[yl2.b.B3.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[yl2.b.C3.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[yl2.b.D3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[yl2.b.E3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[yl2.b.F3.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[yl2.b.K3.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[yl2.b.J3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[yl2.b.L3.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[yl2.b.M3.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[yl2.b.P3.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[yl2.b.Q3.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[yl2.b.R3.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[yl2.b.S3.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[yl2.b.T3.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[yl2.b.U3.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[yl2.b.f197666b4.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[yl2.b.V3.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[yl2.b.W3.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[yl2.b.G3.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[yl2.b.H3.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[yl2.b.I3.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[yl2.b.X3.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[yl2.b.Y3.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[yl2.b.Z3.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[yl2.b.f197660a4.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[yl2.b.f197749n6.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[yl2.b.f197720j6.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[yl2.b.f197699g6.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            f158030a = iArr;
        }
    }

    public c(Context context) {
        context.getClass();
        this.f158029a = context;
    }

    public final String a(yl2.b bVar) {
        bVar.getClass();
        Context context = this.f158029a;
        String string = context.getString(R.string.sleep_window_caption_do_not_disturb_and_settings_location);
        String strD = p6.b.d(context, R.string.sleep_window_focus_mode_settings_location, string);
        String string2 = context.getString(R.string.msg_change_sleep_schedule_in_device_settings, context.getString(R.string.device_setting_system), context.getString(R.string.lbl_sleep_schedule));
        string2.getClass();
        switch (a.f158030a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return strD;
            case 30:
                return string2;
            default:
                return string;
        }
    }
}
