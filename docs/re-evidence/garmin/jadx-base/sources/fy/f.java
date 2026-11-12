package fy;

import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import c22.r0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.model.CalendarItemDTO;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfy/f;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f73874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vx.f f73876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l22.a f73877d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73878a;

        static {
            int[] iArr = new int[CalendarItemDTO.b.values().length];
            try {
                iArr[CalendarItemDTO.b.WEIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CalendarItemDTO.b.STEPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CalendarItemDTO.b.PUSHES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CalendarItemDTO.b.SLEEP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CalendarItemDTO.b.SLEEP_AND_SCORE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CalendarItemDTO.b.NAP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CalendarItemDTO.b.SLEEP_COACH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[CalendarItemDTO.b.JET_LAG_TRIP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[CalendarItemDTO.b.HEART_RATE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[CalendarItemDTO.b.HRV_STATUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[CalendarItemDTO.b.BLOOD_PRESSURE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[CalendarItemDTO.b.ACTIVITY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[CalendarItemDTO.b.MOVE_IQ_EVENT.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[CalendarItemDTO.b.STRESS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[CalendarItemDTO.b.BODY_BATTERY.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[CalendarItemDTO.b.MENSTRUAL_CYCLE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[CalendarItemDTO.b.HEALTH_SNAPSHOT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[CalendarItemDTO.b.EVENT.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[CalendarItemDTO.b.WORKOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[CalendarItemDTO.b.FBT_ADAPTIVE_WORKOUT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[CalendarItemDTO.b.TRAINING_PLAN.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[CalendarItemDTO.b.ECG.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            f73878a = iArr;
        }
    }

    public f(Context context) {
        context.getClass();
        this.f73874a = context;
        String string = context.getString(R.string.no_value);
        string.getClass();
        this.f73875b = string;
        this.f73876c = (vx.f) KoinJavaComponent.get$default(vx.f.class, null, null, 6, null);
        this.f73877d = new l22.a(context);
    }

    public static LayerDrawable a(f fVar, int i14, int i15) {
        return r0.b(fVar.f73874a, i14, i15, R.color.gcm_icon_on_color, r0.a.LARGE, 48);
    }
}
