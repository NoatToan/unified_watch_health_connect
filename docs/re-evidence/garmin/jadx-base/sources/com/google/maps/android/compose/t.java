package com.google.maps.android.compose;

import c2.x2;
import h4.r;
import i3.mh;
import p005kotlin.Unit;
import p3.x1;
import s5.x0;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.q f54239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f54241d;

    public /* synthetic */ t(Object obj, e23.q qVar, int i14) {
        this.f54238a = 0;
        this.f54240c = obj;
        this.f54239b = qVar;
        this.f54241d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f54238a;
        int i15 = this.f54241d;
        Object obj3 = this.f54240c;
        e23.q qVar = this.f54239b;
        switch (i14) {
            case 0:
                return MapEffectKt.MapEffect$lambda$1(obj3, qVar, i15, (p3.m) obj, ((Integer) obj2).intValue());
            case 1:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    r rVarF = x2.f(r.S, 1.0f);
                    String str = (String) qVar.invoke(obj3, mVar, Integer.valueOf((i15 >> 9) & 8));
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB = d92.c.b(j92.f.f97932i, mVar);
                    d6.h.f57752b.getClass();
                    mh.c(str, rVarF, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarB, mVar, 48, 0, 130044);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    r rVarF2 = x2.f(r.S, 1.0f);
                    String str2 = (String) qVar.invoke(obj3, mVar2, Integer.valueOf((i15 >> 12) & 8));
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0VarB2 = d92.c.b(j92.f.f97932i, mVar2);
                    d6.h.f57752b.getClass();
                    mh.c(str2, rVarF2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57757g), 0L, 0, false, 0, 0, null, x0VarB2, mVar2, 48, 0, 130044);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ t(e23.q qVar, Object obj, int i14, int i15) {
        this.f54238a = i15;
        this.f54239b = qVar;
        this.f54240c = obj;
        this.f54241d = i14;
    }
}
