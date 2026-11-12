package c80;

import com.garmin.android.apps.connectmobile.R;
import f72.h1;
import f72.i1;
import f72.j1;
import f72.k1;
import f72.m1;
import f72.o1;
import f72.p1;
import f72.q1;
import f72.r1;
import f72.s1;
import o4.t1;
import o4.u1;
import o4.v1;
import org.koin.ext.StringExtKt;
import p005kotlin.Metadata;
import v62.a8;
import v62.x3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB3\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lc80/u;", "", "Lu4/d;", "icon", "", "nameRes", "pluralNameRes", "Lc80/h;", "defaultActivitySelectionLimit", "<init>", "(Ljava/lang/String;ILu4/d;Ljava/lang/Integer;Ljava/lang/Integer;Lc80/h;)V", "Companion", "a", "gcm-domain-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final class u {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f25596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final u f25597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final u f25598g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final u f25599h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final u f25600i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final u f25601j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final u f25602k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final u f25603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final u f25604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final u f25605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final u f25606o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final u f25607p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final u f25608q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final u f25609r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final u f25610t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ u[] f25611v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ w13.c f25612w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4.d f25613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f25614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f25615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f25616d;

    static {
        Integer numValueOf = Integer.valueOf(R.string.lbl_other);
        Integer numValueOf2 = Integer.valueOf(R.string.lbl_gear_type_skates);
        Integer numValueOf3 = Integer.valueOf(R.string.lbl_gear_type_skis);
        Integer numValueOf4 = Integer.valueOf(R.string.lbl_gear_type_boots);
        s62.a.f157643a.getClass();
        t62.b bVar = t62.b.f162798a;
        u4.d dVarA = x3.a(bVar);
        Integer numValueOf5 = Integer.valueOf(R.string.lbl_gear_type_shoes);
        u uVar = new u("Shoes", 0, dVarA, numValueOf5, numValueOf5, null, 8, null);
        f25597f = uVar;
        t62.c cVar = t62.c.f162799a;
        u uVar2 = new u("Bike", 1, h1.a(cVar), Integer.valueOf(R.string.lbl_gear_type_bike), Integer.valueOf(R.string.lbl_gear_type_bikes), null, 8, null);
        f25598g = uVar2;
        u4.d dVarC = i1.f69604a;
        p005kotlin.jvm.internal.j jVar = null;
        if (dVarC == null) {
            float f14 = (float) 24.0d;
            g6.f.a aVar = g6.f.f75994b;
            u4.d.a aVar2 = new u4.d.a("GearBikeParts", f14, f14, 24.0f, 24.0f, 0L, 0, false, 96, null);
            t1 t1Var = new t1(o4.f0.d(4278190080L), jVar);
            u1.f129010b.getClass();
            v1.f129019b.getClass();
            o4.h1.f128863b.getClass();
            int i14 = o4.h1.f128864c;
            u4.e eVarM = com.nimbusds.jose.shaded.gson.internal.a.m(22.0f, 11.0056f, 19.8995f, 11.5029f);
            eVarM.i(19.4485f, 10.1343f);
            eVarM.i(12.4248f, 18.2429f);
            eVarM.d(12.1669f, 18.5401f, 11.8487f, 18.7784f, 11.4917f, 18.9419f);
            eVarM.d(11.1347f, 19.1054f, 10.7471f, 19.1902f, 10.3548f, 19.1909f);
            eVarM.d(10.0924f, 19.1916f, 9.8311f, 19.1536f, 9.5796f, 19.0781f);
            eVarM.i(2.564f, 16.9819f);
            eVarM.d(2.4941f, 16.9613f, 2.4308f, 16.9225f, 2.3807f, 16.8694f);
            eVarM.d(2.3305f, 16.8163f, 2.2952f, 16.7507f, 2.2784f, 16.6794f);
            eVarM.i(2.0132f, 15.5828f);
            eVarM.d(1.9945f, 15.511f, 1.9955f, 15.4353f, 2.0161f, 15.364f);
            eVarM.d(2.0368f, 15.2927f, 2.0765f, 15.2282f, 2.1307f, 15.1777f);
            eVarM.i(8.1775f, 9.3347f);
            eVarM.i(7.6678f, 7.1924f);
            eVarM.i(18.0918f, 6.0171f);
            eVarM.i(17.7784f, 5.0654f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 19.9148f, 4.8091f, 22.0f, 11.0056f);
            eVarM.k(4.3994f, 15.1111f);
            eVarM.d(4.3351f, 15.1733f, 4.2881f, 15.2515f, 4.2632f, 15.3376f);
            eVarM.d(4.2383f, 15.4238f, 4.2365f, 15.5149f, 4.2576f, 15.6021f);
            eVarM.d(4.2788f, 15.6892f, 4.3223f, 15.7693f, 4.3838f, 15.8342f);
            eVarM.d(4.4454f, 15.8991f, 4.5229f, 15.9468f, 4.6084f, 15.9722f);
            eVarM.i(9.5796f, 17.387f);
            eVarM.d(9.6668f, 17.4122f, 9.7593f, 17.4135f, 9.8472f, 17.3909f);
            eVarM.d(9.9351f, 17.3683f, 10.0154f, 17.3225f, 10.0799f, 17.2583f);
            eVarM.d(10.1443f, 17.194f, 10.1907f, 17.1136f, 10.2139f, 17.0254f);
            eVarM.d(10.2371f, 16.9372f, 10.2364f, 16.8442f, 10.212f, 16.7563f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 8.6468f, 11.0107f, 4.3994f, 15.1111f);
            eVarM.k(9.5696f, 8.53f);
            eVarM.i(11.563f, 15.7058f);
            eVarM.d(11.5875f, 15.7953f, 11.6357f, 15.8763f, 11.7024f, 15.9404f);
            eVarM.d(11.7691f, 16.0045f, 11.8519f, 16.0493f, 11.9419f, 16.0698f);
            eVarM.d(12.032f, 16.0903f, 12.1259f, 16.0858f, 12.2137f, 16.0569f);
            eVarM.d(12.3014f, 16.028f, 12.3798f, 15.9756f, 12.4402f, 15.9055f);
            eVarM.i(18.8794f, 8.4077f);
            com.nimbusds.jose.shaded.gson.internal.a.z(eVarM, 18.5691f, 7.4653f, 9.5696f, 8.53f);
            u4.d.a.b(aVar2, eVarM.f168407a, i14, t1Var, 1.0f, null, 0.0f, 0, 4.0f);
            dVarC = aVar2.c();
            i1.f69604a = dVarC;
        }
        u4.d dVar = dVarC;
        Integer numValueOf6 = Integer.valueOf(R.string.lbl_gear_type_bike_parts);
        Integer numValueOf7 = Integer.valueOf(R.string.lbl_gear_type_bike_components);
        h hVar = h.Multi;
        u uVar3 = new u("BikeComponent", 2, dVar, numValueOf6, numValueOf7, hVar);
        f25599h = uVar3;
        u uVar4 = new u("Boots", 3, k1.a(cVar), numValueOf4, numValueOf4, null, 8, null);
        f25600i = uVar4;
        u uVar5 = new u("Skis", 4, p1.a(cVar), numValueOf3, numValueOf3, null, 8, null);
        f25601j = uVar5;
        u uVar6 = new u("Snowboard", 5, q1.a(cVar), Integer.valueOf(R.string.lbl_gear_type_snowboard), Integer.valueOf(R.string.lbl_gear_type_snowboards), null, 8, null);
        f25602k = uVar6;
        u uVar7 = new u("Racket", 6, m1.a(cVar), Integer.valueOf(R.string.lbl_gear_type_racket), Integer.valueOf(R.string.lbl_gear_type_rackets), hVar);
        f25603l = uVar7;
        int i15 = 8;
        p005kotlin.jvm.internal.j jVar2 = null;
        h hVar2 = null;
        u uVar8 = new u("Skates", 7, o1.a(cVar), numValueOf2, numValueOf2, hVar2, i15, jVar2);
        f25604m = uVar8;
        u uVar9 = new u("Paddleboard", 8, r1.a(cVar), Integer.valueOf(R.string.lbl_gear_type_paddleboard), Integer.valueOf(R.string.lbl_gear_type_paddleboards), hVar2, i15, jVar2);
        f25605n = uVar9;
        u uVar10 = new u("Surfboard", 9, s1.a(cVar), Integer.valueOf(R.string.lbl_gear_type_surf), Integer.valueOf(R.string.lbl_gear_type_surfboards), hVar2, i15, jVar2);
        f25606o = uVar10;
        u uVar11 = new u("Wakeboard", 10, f72.t1.a(cVar), Integer.valueOf(R.string.lbl_gear_type_wakeboard), Integer.valueOf(R.string.lbl_gear_type_wakeboards), hVar2, i15, jVar2);
        f25607p = uVar11;
        u uVar12 = new u("Boat", 11, j1.a(cVar), Integer.valueOf(R.string.lbl_gear_type_boat), Integer.valueOf(R.string.lbl_gear_type_boats), hVar2, i15, jVar2);
        f25608q = uVar12;
        u uVar13 = new u("Wheelchair", 12, f72.u1.a(cVar), Integer.valueOf(R.string.lbl_gear_type_wheelchair), Integer.valueOf(R.string.lbl_gear_type_wheelchairs), hVar2, i15, jVar2);
        f25609r = uVar13;
        u uVar14 = new u("Other", 13, a8.a(bVar), numValueOf, numValueOf, hVar);
        f25610t = uVar14;
        u[] uVarArr = {uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9, uVar10, uVar11, uVar12, uVar13, uVar14};
        f25611v = uVarArr;
        f25612w = new w13.c(uVarArr);
        INSTANCE = new Companion(jVar);
        f25596e = o13.m.a(o13.n.PUBLICATION, new c63.g0(12));
    }

    public /* synthetic */ u(String str, int i14, u4.d dVar, Integer num, Integer num2, h hVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(str, i14, dVar, (i15 & 2) != 0 ? null : num, (i15 & 4) != 0 ? null : num2, (i15 & 8) != 0 ? h.Single : hVar);
    }

    public static u valueOf(String str) {
        return (u) Enum.valueOf(u.class, str);
    }

    public static u[] values() {
        return (u[]) f25611v.clone();
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final u4.d getF25613a() {
        return this.f25613a;
    }

    @Override // java.lang.Enum
    public final String toString() {
        n63.b.a aVar = n63.b.f123892d;
        aVar.getClass();
        return StringExtKt.clearQuotes(aVar.b(INSTANCE.serializer(), this));
    }

    /* JADX INFO: renamed from: c80.u$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc80/u$a;", "", "<init>", "()V", "Li63/c;", "Lc80/u;", "serializer", "()Li63/c;", "gcm-domain-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static u a(String str) {
            return (u) n63.b.f123892d.c(new i(), "\"" + str + "\"");
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
        public final i63.c<u> serializer() {
            return (i63.c) u.f25596e.getValue();
        }

        private Companion() {
        }
    }

    private u(String str, int i14, u4.d dVar, Integer num, Integer num2, h hVar) {
        super(str, i14);
        this.f25613a = dVar;
        this.f25614b = num;
        this.f25615c = num2;
        this.f25616d = hVar;
    }
}
