package com.garmin.android.apps.connectmobile.workouts.presentation.edit;

import p005kotlin.Metadata;
import p3.o0;
import p3.p2;
import p3.x1;
import w52.x0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/j;", "Lr52/b;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/q;", "Lcom/garmin/android/apps/connectmobile/workouts/presentation/edit/p;", "Lw52/x0;", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j implements r52.b<q, p>, x0 {
    @Override // r52.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void a(p pVar, q qVar, p3.m mVar, int i14) {
        int i15;
        pVar.getClass();
        qVar.getClass();
        o0 o0VarE = mVar.E(-756483919);
        if ((i14 & 48) == 0) {
            i15 = (o0VarE.r(qVar) ? 32 : 16) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.B(this) ? 256 : 128;
        }
        if (o0VarE.n(i15 & 1, (i15 & 145) != 144)) {
            x1 x1Var = p3.n.f135158a;
            if (qVar.f49269y || !p005kotlin.jvm.internal.s.g(qVar.f49263s, g.b.f48995a)) {
                o0VarE.C(-718825455);
                o0VarE.g0(false);
            } else {
                o0VarE.C(-718863895);
                w52.o.a(this, o0VarE, (i15 >> 6) & 14);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f21.a0(this, pVar, qVar, i14, 4);
        }
    }
}
