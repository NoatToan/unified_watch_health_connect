package cq;

import android.content.Context;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import e2.f0;
import f5.b1;
import f5.v1;
import g2.d1;
import i3.oh;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import li0.r0;
import li0.s0;
import li0.t0;
import li0.u0;
import m92.i0;
import m92.k0;
import o4.v0;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.o0;
import p005kotlin.math.MathKt;
import p008y1.x3;
import p3.p1;
import s1.f2;
import s5.e0;
import vd0.x0;
import vd0.z0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f55084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f55085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f55086d;

    public /* synthetic */ p(x0 x0Var, g6.c cVar, float f14) {
        this.f55083a = 8;
        this.f55086d = x0Var;
        this.f55085c = cVar;
        this.f55084b = f14;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0370  */
    /* JADX WARN: Code duplicated, block: B:88:0x0372 A[PHI: r1
      0x0372: PHI (r1v8 float) = (r1v7 float), (r1v14 float) binds: [B:92:0x0386, B:86:0x036e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) throws Throwable {
        float f14;
        float fFloatValue;
        float fFloatValue2;
        Map mapB;
        int i14 = this.f55083a;
        int i15 = 0;
        float f15 = 0.0f;
        Throwable th3 = null;
        Object obj2 = this.f55086d;
        float f16 = this.f55084b;
        Object obj3 = this.f55085c;
        switch (i14) {
            case 0:
                p1 p1Var = (p1) obj2;
                f5.c0 c0Var = (f5.c0) obj;
                c0Var.getClass();
                float fC1 = ((g6.c) obj3).c1((int) (c0Var.a() & 4294967295L));
                if (g6.f.b(fC1, f16) > 0) {
                    p1Var.setValue(g6.f.a(fC1));
                }
                return Unit.INSTANCE;
            case 1:
                o0 o0Var = (o0) obj3;
                d1 d1Var = (d1) obj2;
                s1.j jVar = (s1.j) obj;
                if (f16 > 0.0f) {
                    fFloatValue = ((Number) jVar.f155607e.getF182175a()).floatValue();
                    if (fFloatValue > f16) {
                        f14 = f16;
                    } else {
                        f14 = fFloatValue;
                    }
                } else if (f16 < 0.0f) {
                    fFloatValue = ((Number) jVar.f155607e.getF182175a()).floatValue();
                    if (fFloatValue < f16) {
                        f14 = f16;
                    } else {
                        f14 = fFloatValue;
                    }
                } else {
                    f14 = 0.0f;
                }
                float f17 = f14 - o0Var.f105806a;
                if (f17 != d1Var.f(f17) || f14 != ((Number) jVar.f155607e.getF182175a()).floatValue()) {
                    jVar.a();
                }
                o0Var.f105806a += f17;
                return Unit.INSTANCE;
            case 2:
                ((v1.a) obj).r((v1) obj3, ((b1) obj2).f0(f16), 0, 0.0f);
                return Unit.INSTANCE;
            case 3:
                v1 v1Var = (v1) obj3;
                v1.a aVar = (v1.a) obj;
                s1.b<Float, s1.n> bVar = ((oh) obj2).f89220e;
                v1.a.B(aVar, v1Var, bVar != null ? (int) bVar.e().floatValue() : (int) f16, 0);
                return Unit.INSTANCE;
            case 4:
                v0 v0Var = (v0) obj3;
                o4.r rVar = (o4.r) obj2;
                q4.c cVar = (q4.c) obj;
                cVar.m1();
                q4.a.b f142543b = cVar.getF142543b();
                long jB = f142543b.b();
                f142543b.a().l();
                try {
                    q4.b bVar2 = f142543b.f142550a;
                    bVar2.h(f16, 0.0f);
                    n4.c.f123541b.getClass();
                    bVar2.f(45.0f, 0L);
                    q4.f.w0(cVar, v0Var, 0L, rVar, 46);
                    return Unit.INSTANCE;
                } finally {
                    tn.k.p(f142543b, jB);
                }
            case 5:
                f4.s sVar = (f4.s) obj3;
                f0 f0Var = (f0) obj;
                f0Var.getClass();
                f0Var.a(sVar.size(), new s0(new li0.x(8), sVar), new t0(r0.f112856a, sVar), new z3.e(802480018, true, new u0(sVar, (li0.f) obj2, f16)));
                return Unit.INSTANCE;
            case 6:
                i53.c cVar2 = (i53.c) obj3;
                Float f18 = (Float) obj2;
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                cVar2.getClass();
                if (cVar2.isEmpty()) {
                    return i53.a.c();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                float fS0 = fVar.s0(f16);
                Iterator<E> it = cVar2.iterator();
                if (!it.hasNext()) {
                    c22.t.g();
                    return null;
                }
                float fMin = ((k0) it.next()).f117388a;
                while (it.hasNext()) {
                    fMin = Math.min(fMin, ((k0) it.next()).f117388a);
                }
                Iterator<E> it3 = cVar2.iterator();
                if (!it3.hasNext()) {
                    c22.t.g();
                    return null;
                }
                float fMax = ((k0) it3.next()).f117389b;
                while (it3.hasNext()) {
                    fMax = Math.max(fMax, ((k0) it3.next()).f117389b);
                }
                if (f18 != null) {
                    fFloatValue2 = f18.floatValue();
                } else {
                    Iterator<E> it4 = cVar2.iterator();
                    if (!it4.hasNext()) {
                        c22.t.g();
                        return null;
                    }
                    float fMax2 = ((k0) it4.next()).f117390c;
                    while (it4.hasNext()) {
                        fMax2 = Math.max(fMax2, ((k0) it4.next()).f117390c);
                    }
                    fFloatValue2 = fMax2;
                }
                char c14 = ' ';
                float fH = i0.h(fMin, fMin, fMax, 0.0f, Float.intBitsToFloat((int) (fVar.b() >> 32)));
                int size = cVar2.size();
                int iAbs = (int) (Math.abs(fMax - fMin) + 1.0f);
                if (iAbs < 1) {
                    return i53.a.c();
                }
                float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.b() >> 32)) - ((size - 1) * fS0)) / iAbs;
                Iterator it5 = cVar2.iterator();
                while (it5.hasNext()) {
                    Object next = it5.next();
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        Throwable th4 = th3;
                        p13.x.q();
                        throw th4;
                    }
                    k0 k0Var = (k0) next;
                    float f19 = k0Var.f117390c;
                    float f22 = k0Var.f117389b;
                    char c15 = c14;
                    Iterator it6 = it5;
                    float fH2 = i0.h(f19, f15, fFloatValue2, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), f15);
                    float fH3 = i0.h(k0Var.f117391d, 0.0f, fFloatValue2, Float.intBitsToFloat((int) (fVar.b() & 4294967295L)), 0.0f);
                    float f24 = fH2 - fH3;
                    float f25 = k0Var.f117388a;
                    float f26 = (f22 - f25) + 1.0f;
                    float f27 = f26 * fIntBitsToFloat;
                    Throwable th5 = th3;
                    if (((int) f26) == 1) {
                        mapB = p13.t0.b(new o13.p(Float.valueOf(fH), Float.valueOf(f25)));
                    } else {
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        float f28 = f27 / f26;
                        int i17 = (int) f25;
                        int i18 = ((int) f22) + 1;
                        float f29 = fH;
                        while (i17 < i18) {
                            linkedHashMap2.put(Float.valueOf(f29), Float.valueOf(i17));
                            f29 += f28;
                            i17++;
                            fH = fH;
                        }
                        mapB = linkedHashMap2;
                    }
                    float f34 = fH;
                    linkedHashMap.putAll(mapB);
                    long j8 = k0Var.f117392e;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f34)) << c15) | (((long) Float.floatToRawIntBits(fH3)) & 4294967295L);
                    n4.c.a aVar2 = n4.c.f123541b;
                    long jFloatToRawIntBits2 = Float.floatToRawIntBits(f27);
                    LinkedHashMap linkedHashMap3 = linkedHashMap;
                    long jFloatToRawIntBits3 = ((long) Float.floatToRawIntBits(f24)) & 4294967295L;
                    n4.g.a aVar3 = n4.g.f123559b;
                    m92.u.e(fVar, j8, jFloatToRawIntBits, jFloatToRawIntBits3 | (jFloatToRawIntBits2 << c15), k0Var.f117395h, k0Var.f117396i, k0Var.f117393f, k0Var.f117394g);
                    fH = f27 + fS0 + f34;
                    c14 = c15;
                    linkedHashMap = linkedHashMap3;
                    i15 = i16;
                    it5 = it6;
                    th3 = th5;
                    f15 = 0.0f;
                }
                return i53.a.k(linkedHashMap);
            case 7:
                List list = (List) obj3;
                f0 f0Var2 = (f0) obj;
                f0Var2.getClass();
                f0Var2.a(list.size(), new s70.f(new e0(15), list), new s70.g(s70.e.f157686a, list), new z3.e(802480018, true, new s70.h(list, f16, (e23.l) obj2)));
                return Unit.INSTANCE;
            case 8:
                Context context = (Context) obj;
                context.getClass();
                UCropView uCropView = new UCropView(context, null);
                OverlayView overlayView = uCropView.getOverlayView();
                overlayView.setCircleDimmedLayer(true);
                overlayView.setShowCropFrame(false);
                overlayView.setShowCropGrid(false);
                uCropView.addOnLayoutChangeListener(new z0((g6.c) obj3, uCropView, f16));
                ((x0) obj2).f177429a = uCropView;
                return uCropView;
            default:
                x3 x3Var = (x3) obj3;
                e23.l lVar = (e23.l) obj2;
                long jLongValue = ((Long) obj).longValue();
                if (x3Var.f193713b == Long.MIN_VALUE) {
                    x3Var.f193713b = jLongValue;
                }
                s1.n nVar = new s1.n(x3Var.f193716e);
                long jC = f16 == 0.0f ? x3Var.f193712a.c(new s1.n(x3Var.f193716e), x3.f193711g, x3Var.f193714c) : MathKt.d((jLongValue - x3Var.f193713b) / f16);
                f2<s1.n> f2Var = x3Var.f193712a;
                s1.n nVar2 = x3.f193711g;
                float f35 = ((s1.n) f2Var.f(jC, nVar, nVar2, x3Var.f193714c)).f155642a;
                x3Var.f193714c = (s1.n) x3Var.f193712a.d(jC, nVar, nVar2, x3Var.f193714c);
                x3Var.f193713b = jLongValue;
                float f36 = x3Var.f193716e - f35;
                x3Var.f193716e = f35;
                lVar.invoke(Float.valueOf(f36));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p(Object obj, float f14, Object obj2, int i14) {
        this.f55083a = i14;
        this.f55085c = obj;
        this.f55084b = f14;
        this.f55086d = obj2;
    }

    public /* synthetic */ p(Object obj, Object obj2, float f14, int i14) {
        this.f55083a = i14;
        this.f55085c = obj;
        this.f55086d = obj2;
        this.f55084b = f14;
    }

    public /* synthetic */ p(float f14, Object obj, Object obj2, int i14) {
        this.f55083a = i14;
        this.f55084b = f14;
        this.f55085c = obj;
        this.f55086d = obj2;
    }
}
