package pu1;

import am.x0;
import c22.c3;
import c22.i;
import com.garmin.android.apps.connectmobile.R;
import java.util.ArrayList;
import n23.j;
import p005kotlin.Metadata;
import p13.y;
import p3.m;
import p3.n;
import p3.x1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'f' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lpu1/c;", "", "", "jsonVal", "Lc22/c3;", "labelResID", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lc22/c3;)V", "a", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f141303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f141304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f141305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f141306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f141307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f141308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f141309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f141310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f141311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ c[] f141312l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ w13.c f141313m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f141314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f141315b;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f141316a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.f141304d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.f141305e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.f141306f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.f141307g.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.f141308h.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.f141309i.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[c.f141310j.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[c.f141311k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f141316a = iArr;
        }
    }

    static {
        c cVar = new c("RUN", 0, x0.f4308n.f4358a, i.b(R.string.lbl_activity_group_run));
        f141304d = cVar;
        c cVar2 = new c("BIKE", 1, x0.f4312o.f4358a, i.b(R.string.activity_options_bike_title));
        f141305e = cVar2;
        x0 x0Var = x0.f4316p;
        c cVar3 = new c("FITNESS_EQUIPMENT", 2, x0Var.f4358a, x0Var.f4360c);
        f141306f = cVar3;
        c cVar4 = new c("WALK", 3, x0.f4331t.f4358a, i.b(R.string.activity_options_walk_title));
        f141307g = cVar4;
        c cVar5 = new c("HIKE", 4, x0.f4320q.f4358a, i.b(R.string.social_adventure_type_hike));
        f141308h = cVar5;
        x0 x0Var2 = x0.U1;
        c cVar6 = new c("WINTER_SPORTS", 5, x0Var2.f4358a, x0Var2.f4360c);
        f141309i = cVar6;
        x0 x0Var3 = x0.f4350y;
        c cVar7 = new c("WATER_SPORT", 6, x0Var3.f4358a, x0Var3.f4360c);
        f141310j = cVar7;
        x0 x0Var4 = x0.f4346x;
        c cVar8 = new c("OTHER", 7, x0Var4.f4358a, x0Var4.f4360c);
        f141311k = cVar8;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8};
        f141312l = cVarArr;
        f141313m = new w13.c(cVarArr);
        f141303c = new a(null);
    }

    private c(String str, int i14, String str2, c3 c3Var) {
        super(str, i14);
        this.f141314a = str2;
        this.f141315b = c3Var;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f141312l.clone();
    }

    public final long a(m mVar) {
        x1 x1Var = n.f135158a;
        switch (b.f141316a[ordinal()]) {
            case 1:
                mVar.C(-584262441);
                gl.c.f77766a.getClass();
                long jB = gl.c.a(mVar).b();
                mVar.f();
                return jB;
            case 2:
                mVar.C(-584260968);
                gl.c.f77766a.getClass();
                long jD = gl.c.a(mVar).d();
                mVar.f();
                return jD;
            case 3:
                mVar.C(-584259047);
                gl.c.f77766a.getClass();
                long jH = gl.c.a(mVar).h();
                mVar.f();
                return jH;
            case 4:
                mVar.C(-584257511);
                gl.c.f77766a.getClass();
                long j8 = gl.c.a(mVar).j();
                mVar.f();
                return j8;
            case 5:
                mVar.C(-584255978);
                gl.c.f77766a.getClass();
                long jL = gl.c.a(mVar).l();
                mVar.f();
                return jL;
            case 6:
                mVar.C(-584254249);
                gl.c.f77766a.getClass();
                long jN = gl.c.a(mVar).n();
                mVar.f();
                return jN;
            case 7:
                mVar.C(-584252551);
                gl.c.f77766a.getClass();
                long jP = gl.c.a(mVar).p();
                mVar.f();
                return jP;
            case 8:
                mVar.C(-584250983);
                gl.c.f77766a.getClass();
                long jR = gl.c.a(mVar).r();
                mVar.f();
                return jR;
            default:
                throw j.m(mVar, -584263532);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpu1/c$a;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static ArrayList a() {
            w13.c cVar = c.f141313m;
            ArrayList arrayList = new ArrayList(y.r(cVar, 10));
            p13.c.b bVar = new p13.c.b();
            while (bVar.hasNext()) {
                arrayList.add(((c) bVar.next()).f141314a);
            }
            return arrayList;
        }

        private a() {
        }
    }
}
