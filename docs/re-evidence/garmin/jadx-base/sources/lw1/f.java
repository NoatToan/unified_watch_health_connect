package lw1;

import androidx.lifecycle.u1;
import c80.s;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Llw1/f;", "Landroidx/lifecycle/u1;", "Lkw1/a;", "getTrainablePrimaryEventUseCase", "Lkw1/e;", "getTrainingPlansUseCase", "Lkw1/f;", "getTriathlonTypesUseCase", "<init>", "(Lkw1/a;Lkw1/e;Lkw1/f;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kw1.a f115108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kw1.e f115109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kw1.f f115110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f115111d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f115112e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public fg0.k f115113f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ww1.g f115114g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f115115h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f115116i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f115117j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2 f115118k;

    public f(kw1.a aVar, kw1.e eVar, kw1.f fVar) {
        aVar.getClass();
        eVar.getClass();
        fVar.getClass();
        this.f115108a = aVar;
        this.f115109b = eVar;
        this.f115110c = fVar;
        fy1.i.f73924a.getClass();
        this.f115111d = fy1.i.a.o();
        bo1.a.a().c().G0();
        p2 p2VarA = q2.a(new a(false, false, false, null, 0, null, null, null, false, false, false, false, 4095, null));
        this.f115117j = p2VarA;
        this.f115118k = p2VarA;
    }

    public final void A4(kw1.h hVar) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f115117j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a.a((a) value, false, false, false, null, 0, null, hVar, null, false, false, false, false, 4031)));
    }

    public final void B4(boolean z14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f115117j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a.a((a) value, false, false, false, null, 0, null, null, null, false, z14, false, false, 3583)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x4(v13.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f115093c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f115093c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objI = dVar.f115091a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f115093c;
        if (i15 == 0) {
            r.b(objI);
            j1 j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
            dVar.f115093c = 1;
            objI = j1Var.i(dVar);
            if (objI == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objI);
        }
        return Boolean.valueOf(objI instanceof s.a);
    }

    public final void y4(int i14) {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f115117j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a.a((a) value, false, false, false, null, i14, null, null, null, false, false, false, false, 4079)));
    }

    public final void z4() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f115117j;
            value = p2Var.getValue();
        } while (!p2Var.b(value, a.a((a) value, true, false, false, null, 0, null, null, null, false, false, false, false, 4094)));
    }
}
