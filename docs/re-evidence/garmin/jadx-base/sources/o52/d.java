package o52;

import com.garmin.android.apps.connectmobile.devices.model.m;
import lc.u0;
import m52.k;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lo52/d;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f129300a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.f116754n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.f116755o.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.f116756p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k.f116758r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k.f116759t.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k.f116760v.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k.f116764z.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k.f116761w.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k.f116762x.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k.f116763y.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k.A.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k.f116757q.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[k.B.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f129300a = iArr;
        }
    }

    public static boolean a(m mVar, k kVar) {
        Boolean runningWorkoutCapable;
        mVar.getClass();
        kVar.getClass();
        switch (a.f129300a[kVar.ordinal()]) {
            case 1:
                runningWorkoutCapable = mVar.getRunningWorkoutCapable();
                break;
            case 2:
                runningWorkoutCapable = mVar.getCyclingWorkoutCapable();
                break;
            case 3:
                runningWorkoutCapable = mVar.getCustomWorkoutCapable();
                break;
            case 4:
                runningWorkoutCapable = mVar.getSwimWorkoutCapable();
                break;
            case 5:
                runningWorkoutCapable = mVar.getStrengthWorkoutCapable();
                break;
            case 6:
                runningWorkoutCapable = mVar.getCardioWorkoutCapable();
                break;
            case 7:
                runningWorkoutCapable = mVar.getHiitWorkoutCapable();
                break;
            case 8:
                runningWorkoutCapable = mVar.getYogaWorkoutCapable();
                break;
            case 9:
                runningWorkoutCapable = mVar.getPilatesWorkoutCapable();
                break;
            case 10:
                runningWorkoutCapable = mVar.getMobilityWorkoutCapable();
                break;
            case 11:
                runningWorkoutCapable = mVar.getMultisportWorkoutCapable();
                break;
            case 12:
                runningWorkoutCapable = mVar.getWalkWorkoutCapable();
                break;
            case 13:
                runningWorkoutCapable = mVar.getRuckingWorkoutCapable();
                break;
            default:
                u0.r();
                return false;
        }
        if (runningWorkoutCapable != null) {
            return runningWorkoutCapable.booleanValue();
        }
        return false;
    }
}
