package m92;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.o0 f117269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f117270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f117271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LinkedHashMap f117272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f117273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f117274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f117275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q4.f f117276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f117277i;

    public /* synthetic */ c(p005kotlin.jvm.internal.o0 o0Var, float f14, float f15, LinkedHashMap linkedHashMap, float f16, float f17, float f18, q4.f fVar, long j8) {
        this.f117269a = o0Var;
        this.f117270b = f14;
        this.f117271c = f15;
        this.f117272d = linkedHashMap;
        this.f117273e = f16;
        this.f117274f = f17;
        this.f117275g = f18;
        this.f117276h = fVar;
        this.f117277i = j8;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj2;
        ((Integer) obj).getClass();
        list.getClass();
        Iterator it = list.iterator();
        int i14 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            p005kotlin.jvm.internal.o0 o0Var = this.f117269a;
            float f14 = this.f117271c;
            if (!zHasNext) {
                o0Var.f105806a = (this.f117270b - f14) + o0Var.f105806a;
                return Unit.INSTANCE;
            }
            Object next = it.next();
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            l0 l0Var = (l0) next;
            boolean z14 = l0Var.f117399b;
            h0 h0Var = l0Var.f117398a;
            h0Var.getClass();
            h0.a aVar = (h0.a) h0Var;
            float f15 = aVar.f117334d;
            float f16 = o0Var.f105806a;
            float f17 = this.f117273e;
            float f18 = f17 / 2;
            this.f117272d.put(Float.valueOf(f16 + f18), Float.valueOf(aVar.f117332b));
            q4.f fVar = this.f117276h;
            float fH = i0.h(f15, this.f117274f, this.f117275g, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), 0.0f);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.b() & 4294967295L)) - fH;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(o0Var.f105806a)) << 32) | (((long) Float.floatToRawIntBits(fH)) & 4294967295L);
            n4.c.a aVar2 = n4.c.f123541b;
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f17)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
            n4.g.a aVar3 = n4.g.f123559b;
            long j8 = this.f117277i;
            q4.f.A0(fVar, j8, jFloatToRawIntBits, jFloatToRawIntBits2, 0.0f, null, null, 120);
            if (f15 > 0.0f && z14 && fIntBitsToFloat >= f18) {
                q4.f.o0(fVar, j8, f18, (((long) Float.floatToRawIntBits(fH)) & 4294967295L) | (Float.floatToRawIntBits(o0Var.f105806a + f18) << 32), null, 0, 120);
            }
            o0Var.f105806a = f17 + f14 + o0Var.f105806a;
            i14 = i15;
        }
    }
}
