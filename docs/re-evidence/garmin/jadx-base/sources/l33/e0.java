package l33;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends w23.k0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ k23.l<Object>[] f109726m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o33.r f109727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k33.i f109728h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final o43.j f109729i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f109730j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o43.j<List<x33.c>> f109731k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u23.h f109732l;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f109733a;

        static {
            int[] iArr = new int[r33.a.EnumC2820a.values().length];
            try {
                iArr[r33.a.EnumC2820a.MULTIFILE_CLASS_PART.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r33.a.EnumC2820a.FILE_FACADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f109733a = iArr;
        }
    }

    static {
        p005kotlin.jvm.internal.i0 i0Var = new p005kotlin.jvm.internal.i0(e0.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0);
        p005kotlin.jvm.internal.t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        f109726m = new k23.l[]{t0Var.h(i0Var), n23.j.l(e0.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0, t0Var)};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public e0(k33.i iVar, o33.r rVar) {
        u23.h hVarN;
        iVar.getClass();
        rVar.getClass();
        k33.c cVar = iVar.f102785a;
        super(cVar.f102765o, rVar.c());
        this.f109727g = rVar;
        k33.i iVarM = ge1.b.m(iVar, this, null, 6);
        this.f109728h = iVarM;
        cVar.f102754d.c().f110053c.a();
        k33.c cVar2 = iVarM.f102785a;
        o43.n nVar = cVar2.f102751a;
        this.f109729i = nVar.g(new b0(this));
        this.f109730j = new e(iVarM, rVar, this);
        this.f109731k = nVar.i(new c0(this), p13.j0.f134944a);
        if (cVar2.f102772v.f81513c) {
            u23.h.f168226x0.getClass();
            hVarN = u23.h.a.f168228b;
        } else {
            hVarN = gg.b.N(iVarM, rVar);
        }
        this.f109732l = hVarN;
        nVar.g(new d0(this));
    }

    @Override // u23.b, u23.a
    public final u23.h getAnnotations() {
        return this.f109732l;
    }

    @Override // w23.k0, w23.p, t23.m
    public final t23.y0 getSource() {
        return new q33.y(this);
    }

    @Override // t23.h0
    public final i43.l i() {
        return this.f109730j;
    }

    @Override // w23.k0, w23.o
    public final String toString() {
        return "Lazy Java package fragment: " + this.f181639e + " of module " + this.f109728h.f102785a.f102765o;
    }
}
