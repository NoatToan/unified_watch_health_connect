package vt1;

import am.x0;
import android.content.Context;
import c22.g2;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.gms.stats.CodePackage;
import d53.u;
import java.util.List;
import p005kotlin.Metadata;
import p13.j0;
import p13.w;
import p13.x;
import u62.c5;
import u62.f3;
import u62.n5;
import u62.q4;
import u62.t;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'j' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB+\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lvt1/o;", "", "", "jsonVal", "jsonValLowercase", "", "displayResId", "Lgg0/f;", "eventType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ILgg0/f;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f180174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f180175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f180176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f180177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f180178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o f180179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final o f180180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final o f180181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ o[] f180182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ w13.c f180183n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f180184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f180185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f180186c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gg0.f f180187d;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f180188a;

        static {
            int[] iArr = new int[o.values().length];
            try {
                iArr[o.f180176g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.f180178i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.f180177h.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o.f180175f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o.f180179j.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o.f180180k.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f180188a = iArr;
        }
    }

    static {
        o oVar = new o("RUNNING", 0, "Running", "running", R.string.lbl_running, gg0.f.f77130f);
        f180175f = oVar;
        o oVar2 = new o("CYCLING", 1, "Cycling", "cycling", R.string.lbl_cycling, gg0.f.f77132h);
        f180176g = oVar2;
        o oVar3 = new o("STRENGTH", 2, "Strength", "strength", R.string.lbl_strength, gg0.f.f77140p);
        f180177h = oVar3;
        o oVar4 = new o("TRIATHLON", 3, "Triathlon", "multi_sport_triathlon", R.string.lbl_triathlon, gg0.f.f77136l);
        f180178i = oVar4;
        gg0.f fVar = gg0.f.f77144v;
        o oVar5 = new o(CodePackage.FITNESS, 4, "Generic", "generic", R.string.lbl_fitness, fVar);
        f180179j = oVar5;
        o oVar6 = new o("FROG", 5, "Walk", "walk", R.string.activity_options_walk_title, gg0.f.f77139o);
        f180180k = oVar6;
        o oVar7 = new o("HEALTH_FITNESS", 6, "Generic", "generic", R.string.device_cat_wellness, fVar);
        f180181l = oVar7;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7};
        f180182m = oVarArr;
        f180183n = new w13.c(oVarArr);
        f180174e = new a(null);
    }

    private o(String str, int i14, String str2, String str3, int i15, gg0.f fVar) {
        super(str, i14);
        this.f180184a = str2;
        this.f180185b = str3;
        this.f180186c = i15;
        this.f180187d = fVar;
    }

    public static String g(String str) {
        fy1.i.f73924a.getClass();
        return u.v(str, "_LOCALE_", fy1.i.a.f(), false);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f180182m.clone();
    }

    public final u4.d a() {
        switch (b.f180188a[ordinal()]) {
            case 1:
                s62.a.f157643a.getClass();
                return t.a(t62.a.f162797a);
            case 2:
                s62.a.f157643a.getClass();
                return c5.a(t62.a.f162797a);
            case 3:
                s62.a.f157643a.getClass();
                return q4.a(t62.a.f162797a);
            case 4:
                s62.a.f157643a.getClass();
                return f3.a(t62.a.f162797a);
            case 5:
                s62.a.f157643a.getClass();
                return u62.a.a(t62.a.f162797a);
            case 6:
                s62.a.f157643a.getClass();
                return n5.a(t62.a.f162797a);
            default:
                s62.a.f157643a.getClass();
                return u62.a.a(t62.a.f162797a);
        }
    }

    public final x0 b() {
        switch (b.f180188a[ordinal()]) {
            case 1:
                return x0.f4312o;
            case 2:
                return x0.C;
            case 3:
                return x0.f4309n1;
            case 4:
                return x0.f4308n;
            case 5:
                return x0.f4346x;
            case 6:
                return x0.f4331t;
            default:
                return x0.f4346x;
        }
    }

    public final List<String> c() {
        switch (b.f180188a[ordinal()]) {
            case 1:
                return w.c(x0.f4312o.f4358a);
            case 2:
                return x.k(x0.f4308n.f4358a, x0.f4312o.f4358a, x0.f4324r.f4358a, x0.f4317p1.f4358a, x0.f4313o1.f4358a, x0.C.f4358a);
            case 3:
                return w.c(x0.f4309n1.f4358a);
            case 4:
            case 5:
                return x.k(x0.f4308n.f4358a, x0.f4312o.f4358a, x0.f4331t.f4358a, x0.f4350y.f4358a, x0.f4320q.f4358a, x0.f4346x.f4358a, x0.f4316p.f4358a, x0.U1.f4358a);
            case 6:
                return w.c(x0.f4331t.f4358a);
            default:
                return j0.f134944a;
        }
    }

    public final int d() {
        int i14 = b.f180188a[ordinal()];
        if (i14 == 1) {
            return R.string.garmin_cycling_coach;
        }
        if (i14 == 2) {
            return R.string.garmin_triathlon_coach;
        }
        if (i14 == 3) {
            return R.string.lbl_garmin_strength_coach;
        }
        if (i14 == 4) {
            return R.string.garmin_run_coach;
        }
        if (i14 != 5) {
            return -1;
        }
        return R.string.garmin_fitness_coach;
    }

    public final String e(Context context) {
        String str;
        String str2;
        context.getClass();
        l22.a aVar = new l22.a(context);
        if (d() != -1) {
            return aVar.getString(d());
        }
        int[] iArr = b.f180188a;
        if (iArr[ordinal()] == 6) {
            c22.x0.f23314a.getClass();
            str = c22.x0.Mb;
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        if (iArr[ordinal()] == 6) {
            c22.x0.f23314a.getClass();
            str2 = c22.x0.Mb;
        } else {
            str2 = null;
        }
        g2 g2VarB = str2 != null ? g2.b(str2) : null;
        if (g2VarB != null) {
            return dh.b.A(aVar.f109162a, g2VarB);
        }
        vb.h.s("Required value was null.");
        return null;
    }

    public final xw1.o f(Context context) {
        context.getClass();
        String strE = e(context);
        int i14 = b.f180188a[ordinal()];
        if (i14 == 1) {
            return new xw1.o(null, "https://connectvideo.garmin.com/coach-v2/GarminCyclingCoachUpdate.mp4", 87, g("/web-data/dsw/subtitles/_LOCALE_/CyclingCoachINTROSubtitles.vtt"), strE, null, 33, null);
        }
        if (i14 == 2) {
            return new xw1.o(null, "https://connectvideo.garmin.com/coach-v2/GarminTriCoachUpdate-v3.mp4", 95, g("/web-data/dsw/subtitles/_LOCALE_/TriathlonCoachINTROSubtitles.vtt"), strE, null, 33, null);
        }
        if (i14 == 4) {
            return new xw1.o(null, "https://connectvideo.garmin.com/coach-v2/yT1R3m8uTGm_Lz9XmX8v3A.mp4", 87, g("/web-data/dsw/subtitles/_LOCALE_/RunningCoachINTROSubtitles.vtt"), strE, null, 33, null);
        }
        if (i14 != 5) {
            return null;
        }
        return new xw1.o(null, "https://connectvideo.garmin.com/coach-v2/GarminFitnessCoachUpdate.mp4", 94, g("/web-data/dsw/subtitles/_LOCALE_/GarminFitnessCoach_PickMe.vtt"), strE, null, 33, null);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006¨\u0006\u0014"}, d2 = {"Lvt1/o$a;", "", "<init>", "()V", "", "GARMIN_RUN_COACH_VIDEO_URL", "Ljava/lang/String;", "", "GARMIN_RUN_COACH_VIDEO_DURATION_SECS", "I", "GARMIN_RUNNING_COACH_SUBTITLES_URI", "GARMIN_CYCLING_COACH_VIDEO_URL", "GARMIN_CYCLING_COACH_VIDEO_DURATION_SECS", "GARMIN_CYCLING_COACH_SUBTITLES_URI", "GARMIN_TRIATHLON_COACH_VIDEO_URL", "GARMIN_TRIATHLON_COACH_VIDEO_DURATION_SECS", "GARMIN_TRIATHLON_COACH_SUBTITLES_URI", "GARMIN_FITNESS_COACH_VIDEO_URL", "GARMIN_FITNESS_COACH_VIDEO_DURATION_SECS", "GARMIN_FITNESS_COACH_SUBTITLES_URI", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static o a(String str) {
            Object next;
            str.getClass();
            w13.c cVar = o.f180183n;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
            while (bVarN.hasNext()) {
                next = bVarN.next();
                if (d53.w.z(((o) next).f180184a, str, true)) {
                    return (o) next;
                }
            }
            next = null;
            return (o) next;
        }

        private a() {
        }
    }
}
