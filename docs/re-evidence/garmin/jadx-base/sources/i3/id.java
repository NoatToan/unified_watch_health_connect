package i3;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class id implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ud f88446b;

    public /* synthetic */ id(ud udVar, int i14) {
        this.f88445a = i14;
        this.f88446b = udVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) throws Throwable {
        int i14;
        switch (this.f88445a) {
            case 0:
                g6.m mVar = (g6.m) obj;
                int i15 = (int) (mVar.f76013a >> 32);
                ud udVar = this.f88446b;
                udVar.f89920k.t(i15);
                udVar.f89921l.t((int) (mVar.f76013a & 4294967295L));
                return Unit.INSTANCE;
            case 1:
                ud udVar2 = this.f88446b;
                p3.z1 z1Var = udVar2.f89913d;
                float fFloatValue = ((Float) obj).floatValue();
                j23.f<Float> fVar = udVar2.f89912c;
                float fD = j23.t.d(fFloatValue, fVar.getStart().floatValue(), fVar.b().floatValue());
                int i16 = udVar2.f89910a;
                boolean z14 = false;
                if (i16 > 0 && (i14 = i16 + 1) >= 0) {
                    float fAbs = fD;
                    float f14 = fAbs;
                    int i17 = 0;
                    while (true) {
                        float fJ = gl.b.J(fVar.getStart().floatValue(), fVar.b().floatValue(), i17 / i14);
                        float f15 = fJ - fD;
                        if (Math.abs(f15) <= fAbs) {
                            fAbs = Math.abs(f15);
                            f14 = fJ;
                        }
                        if (i17 != i14) {
                            i17++;
                        } else {
                            fD = f14;
                        }
                    }
                }
                if (fD != z1Var.getFloatValue()) {
                    if (fD != z1Var.getFloatValue()) {
                        e23.l<? super Float, Unit> lVar = udVar2.f89914e;
                        if (lVar != null) {
                            lVar.invoke(Float.valueOf(fD));
                        } else {
                            udVar2.d(fD);
                        }
                    }
                    e23.a<Unit> aVar = udVar2.f89911b;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                    z14 = true;
                }
                return Boolean.valueOf(z14);
            default:
                ud udVar3 = this.f88446b;
                udVar3.b(0.0f);
                udVar3.f89924o.invoke();
                return Unit.INSTANCE;
        }
    }
}
