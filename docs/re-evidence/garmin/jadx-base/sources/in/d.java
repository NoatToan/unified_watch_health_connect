package in;

import am.x0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.k1;
import lc.u0;
import o13.p;
import p13.j0;
import p13.w;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94407a;

        static {
            int[] iArr = new int[o70.c.values().length];
            try {
                iArr[o70.c.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o70.c.CYCLING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o70.c.SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o70.c.WALKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o70.c.MULTI_SPORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o70.c.FITNESS_EQUIPMENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o70.c.PARA_SPORTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o70.c.ALL_ACTIVITIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f94407a = iArr;
        }
    }

    public static final x0 a(o70.c cVar) {
        cVar.getClass();
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zL0 = k1.f37122a.l0();
        switch (a.f94407a[cVar.ordinal()]) {
            case 1:
                return x0.f4308n;
            case 2:
                return zL0 ? x0.Y2 : x0.f4312o;
            case 3:
                return x0.f4324r;
            case 4:
                return x0.f4331t;
            case 5:
                return x0.C;
            case 6:
                return x0.f4316p;
            case 7:
                return x0.f4268a3;
            case 8:
                return x0.f4304m;
            default:
                u0.r();
                return null;
        }
    }

    public static final String b(o70.c cVar, Context context) {
        int i14;
        cVar.getClass();
        switch (a.f94407a[cVar.ordinal()]) {
            case 1:
                i14 = R.string.running_activity_lowercase;
                break;
            case 2:
                i14 = R.string.cycling_activity_lowercase;
                break;
            case 3:
                i14 = R.string.swimming_activity_lowercase;
                break;
            case 4:
                i14 = R.string.walking_activity_lowercase;
                break;
            case 5:
                i14 = R.string.multisport_activity_lowercase;
                break;
            case 6:
                i14 = R.string.gym_fitness_activity_lowercase;
                break;
            case 7:
                i14 = R.string.parasport_activity_lowercase;
                break;
            case 8:
                i14 = R.string.lbl_all_activities;
                break;
            default:
                u0.r();
                return null;
        }
        String string = context.getString(i14);
        string.getClass();
        return string;
    }

    public static final k70.b c(o70.c cVar) {
        cVar.getClass();
        switch (a.f94407a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return k70.b.Distance;
            case 6:
            case 7:
            case 8:
                return k70.b.Duration;
            default:
                return k70.b.Duration;
        }
    }

    public static final i53.c<p<k70.b, b>> d(o70.c cVar) {
        Iterable iterableC;
        cVar.getClass();
        switch (a.f94407a[cVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                iterableC = w.c(new p(k70.b.Duration, b.Total));
                break;
            case 6:
            case 7:
            case 8:
                iterableC = j0.f134944a;
                break;
            default:
                u0.r();
                return null;
        }
        return i53.a.e(iterableC);
    }
}
