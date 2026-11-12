package cd1;

import e23.l;
import f21.l0;
import java.util.List;
import m92.c0;
import m92.e0;
import m92.m;
import o4.g1;
import p005kotlin.Unit;
import q4.f;
import q4.k;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26868a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f26870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f26871d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f26872e;

    public /* synthetic */ c(float f14, long j8, List list, fd1.e eVar) {
        this.f26870c = f14;
        this.f26869b = j8;
        this.f26871d = list;
        this.f26872e = eVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        i53.c<String> cVar;
        int i14 = this.f26868a;
        float f14 = this.f26870c;
        long j8 = this.f26869b;
        Object obj2 = this.f26872e;
        Object obj3 = this.f26871d;
        switch (i14) {
            case 0:
                List list = (List) obj3;
                fd1.e eVar = (fd1.e) obj2;
                f fVar = (f) obj;
                fVar.getClass();
                return c0.e(fVar, this.f26870c, new m.d(j8, null), false, 0.0f, null, null, list, null, Float.valueOf(0.0f), (eVar == null || (cVar = eVar.f70493d) == null) ? null : Float.valueOf(cVar.size() - 1), eVar != null ? Float.valueOf(eVar.f70494e) : null, eVar != null ? Float.valueOf(eVar.f70495f) : null, null, true, null, 20668);
            case 1:
                f fVar2 = (f) obj;
                fVar2.getClass();
                float f15 = l0.f68589a;
                m.d dVar = new m.d(j8, null);
                e0 e0Var = e0.STEP_CENTER;
                g1.f128855a.getClass();
                return c0.e(fVar2, f15, dVar, false, 0.0f, null, null, (i53.f) obj3, Float.valueOf(f14), null, null, Float.valueOf(0.0f), (Float) obj2, e0Var, false, g1.a.a(0.0f, new float[]{8.0f, 2.0f}), 9020);
            case 2:
                o61.d dVar2 = (o61.d) obj3;
                k kVar = (k) obj2;
                f fVar3 = (f) obj;
                fVar3.getClass();
                if (dVar2 != o61.d.FILL_COLOR) {
                    f.o0(fVar3, this.f26869b, fVar3.s0(f14) / 2, 0L, kVar, 0, 108);
                }
                return Unit.INSTANCE;
            default:
                f fVar4 = (f) obj;
                fVar4.getClass();
                return c0.e(fVar4, this.f26870c, new m.d(j8, null), false, 0.0f, null, null, (List) obj3, Float.valueOf(481.0f), null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, (g1) obj2, 13112);
        }
    }

    public /* synthetic */ c(long j8, float f14, List list, o4.k kVar) {
        this.f26869b = j8;
        this.f26870c = f14;
        this.f26871d = list;
        this.f26872e = kVar;
    }

    public /* synthetic */ c(long j8, i53.f fVar, float f14, Float f15) {
        this.f26869b = j8;
        this.f26871d = fVar;
        this.f26870c = f14;
        this.f26872e = f15;
    }

    public /* synthetic */ c(o61.d dVar, float f14, long j8, k kVar) {
        this.f26871d = dVar;
        this.f26870c = f14;
        this.f26869b = j8;
        this.f26872e = kVar;
    }
}
