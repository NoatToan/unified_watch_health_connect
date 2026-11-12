package gg0;

import am.x0;
import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import d53.u;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import org.apache.commons.codec.language.bm.Rule;
import p005kotlin.Metadata;
import p13.h0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'l' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgg0/f;", "", "", "jsonValue", "", "displayResId", "Lam/x0;", "activityType", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILam/x0;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f77128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f77129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f77130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f77131g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final f f77132h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final f f77133i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f77134j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f77135k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f77136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f77137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f77138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f77139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final f f77140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @o13.e
    public static final f f77141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final f f77142r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final f f77143t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final f f77144v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ f[] f77145w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ w13.c f77146x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f77149c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f77150a;

        static {
            int[] iArr = new int[f.values().length];
            try {
                iArr[f.f77129e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.f77130f.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.f77131g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.f77132h.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[f.f77133i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[f.f77134j.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[f.f77135k.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[f.f77137m.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[f.f77136l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[f.f77138n.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[f.f77139o.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[f.f77140p.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[f.f77141q.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[f.f77142r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[f.f77143t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[f.f77144v.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f77150a = iArr;
        }
    }

    static {
        f fVar = new f(Rule.ALL, 0, TtmlNode.COMBINE_ALL, R.string.common_all, x0.f4304m);
        f77129e = fVar;
        f fVar2 = new f("RUNNING", 1, "running", R.string.lbl_running, x0.f4308n);
        f77130f = fVar2;
        f fVar3 = new f("TRAIL_RUNNING", 2, "trail_running", R.string.lbl_trail_running, x0.J0);
        f77131g = fVar3;
        f fVar4 = new f("CYCLING", 3, "cycling", R.string.lbl_cycling, x0.f4312o);
        f77132h = fVar4;
        f fVar5 = new f("GRAVEL_CYCLING", 4, "gravel_cycling", R.string.lbl_gravel_unpaved_cycling, x0.Z0);
        f77133i = fVar5;
        f fVar6 = new f("MOUNTAIN_BIKING", 5, "mountain_biking", R.string.lbl_mountain_biking, x0.V0);
        f77134j = fVar6;
        f fVar7 = new f("SWIMMING", 6, "swimming", R.string.lbl_swimming, x0.f4324r);
        f77135k = fVar7;
        x0 x0Var = x0.C;
        f fVar8 = new f("TRIATHLON", 7, "multi_sport_triathlon", R.string.lbl_triathlon, x0Var);
        f77136l = fVar8;
        f fVar9 = new f("MULTI_SPORT", 8, "multi_sport", R.string.activity_type_multisport, x0Var);
        f77137m = fVar9;
        f fVar10 = new f("HIKING", 9, "hiking", R.string.lbl_hiking, x0.f4320q);
        f77138n = fVar10;
        f fVar11 = new f("WALKING", 10, "walking", R.string.lbl_walking, x0.f4331t);
        f77139o = fVar11;
        f fVar12 = new f("FITNESS_EQUIPMENT", 11, "fitness_equipment", R.string.lbl_activity_gym_fitness_equipment, x0.f4316p);
        f77140p = fVar12;
        x0 x0Var2 = x0.f4354z;
        f fVar13 = new f("MOTORCYCLING", 12, "motorcycling", R.string.lbl_motorcycling, x0Var2);
        f77141q = fVar13;
        f fVar14 = new f("MOTORCYCLING_V2", 13, "motorcycling_v2", R.string.lbl_motorcycling, x0Var2);
        f77142r = fVar14;
        f fVar15 = new f("WINTER_SPORTS", 14, "winter_sports", R.string.lbl_winter_sports, x0.U1);
        f77143t = fVar15;
        f fVar16 = new f("OTHER", 15, "other", R.string.lbl_other, x0.f4346x);
        f77144v = fVar16;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6, fVar7, fVar8, fVar9, fVar10, fVar11, fVar12, fVar13, fVar14, fVar15, fVar16};
        f77145w = fVarArr;
        f77146x = new w13.c(fVarArr);
        f77128d = new a(null);
    }

    private f(String str, int i14, String str2, int i15, x0 x0Var) {
        super(str, i14);
        this.f77147a = str2;
        this.f77148b = i15;
        this.f77149c = x0Var;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f77145w.clone();
    }

    public final String a(Context context) {
        switch (b.f77150a[ordinal()]) {
            case 1:
                String string = context.getString(R.string.common_all);
                string.getClass();
                return string;
            case 2:
                String string2 = context.getString(R.string.lbl_running);
                string2.getClass();
                return string2;
            case 3:
                String string3 = context.getString(R.string.lbl_trail_running);
                string3.getClass();
                return string3;
            case 4:
                String string4 = context.getString(R.string.lbl_cycling);
                string4.getClass();
                return string4;
            case 5:
                String string5 = context.getString(R.string.lbl_gravel_cycling);
                string5.getClass();
                return string5;
            case 6:
                String string6 = context.getString(R.string.lbl_mountain_biking);
                string6.getClass();
                return string6;
            case 7:
                String string7 = context.getString(R.string.lbl_swimming);
                string7.getClass();
                return string7;
            case 8:
                String string8 = context.getString(R.string.activity_type_multisport);
                string8.getClass();
                return string8;
            case 9:
                String string9 = context.getString(R.string.lbl_triathlon);
                string9.getClass();
                return string9;
            case 10:
                String string10 = context.getString(R.string.lbl_hiking);
                string10.getClass();
                return string10;
            case 11:
                String string11 = context.getString(R.string.lbl_walking);
                string11.getClass();
                return string11;
            case 12:
                String string12 = context.getString(R.string.lbl_activity_gym_fitness_equipment);
                string12.getClass();
                return string12;
            case 13:
            case 14:
                String string13 = context.getString(R.string.lbl_motorcycling);
                string13.getClass();
                return string13;
            case 15:
                String string14 = context.getString(R.string.lbl_winter_sports);
                string14.getClass();
                return string14;
            case 16:
                String string15 = context.getString(R.string.lbl_other);
                string15.getClass();
                return string15;
            default:
                u0.r();
                return null;
        }
    }

    public final String b(Context context) {
        context.getClass();
        int i14 = b.f77150a[ordinal()];
        if (i14 == 2) {
            String string = context.getString(R.string.all_running_title);
            string.getClass();
            return string;
        }
        if (i14 != 4) {
            String string2 = context.getString(this.f77148b);
            string2.getClass();
            return string2;
        }
        String string3 = context.getString(R.string.all_cycling_title);
        string3.getClass();
        return string3;
    }

    public final f c() {
        if (e()) {
            return f77132h;
        }
        if (f()) {
            return f77130f;
        }
        if (g()) {
            return f77137m;
        }
        return this == f77142r ? f77141q : this;
    }

    public final boolean d() {
        if (e() || f()) {
            return true;
        }
        return g() && bo1.a.a().c().V0();
    }

    public final boolean e() {
        return this == f77132h || this == f77133i || this == f77134j;
    }

    public final boolean f() {
        return this == f77130f || this == f77131g;
    }

    public final boolean g() {
        return this == f77136l;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgg0/f$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static f a(String str) {
            if (str != null) {
                w13.c cVar = f.f77146x;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                while (bVarN.hasNext()) {
                    f fVar = (f) bVarN.next();
                    if (u.q(fVar.f77147a, str, true)) {
                        return fVar;
                    }
                }
            }
            return f.f77130f;
        }

        public static List b() {
            w13.c cVar = f.f77146x;
            ArrayList arrayListK = n23.j.k(cVar);
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                Object next = bVar.next();
                if (((f) next) != f.f77141q) {
                    arrayListK.add(next);
                }
            }
            return h0.b1(arrayListK);
        }

        private a() {
        }
    }
}
