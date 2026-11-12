package zp2;

import androidx.lifecycle.v1;
import e23.p;
import java.util.concurrent.atomic.AtomicReference;
import ms2.g;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import ps2.n;
import ps2.w;
import u53.o;
import v13.i;
import vb.h;
import zn2.g1;
import zn2.t;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.updatedevice.NewFitPayUpdateDeviceViewModel$initViewModel$1", f = "NewFitPayUpdateDeviceViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f206608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f206609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f206610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f206611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f206612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f206613f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, long j8, String str, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f206611d = bVar;
        this.f206612e = j8;
        this.f206613f = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f206611d, this.f206612e, this.f206613f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ms2.d dVarG;
        b bVar;
        b bVar2;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f206610c;
        b bVar3 = this.f206611d;
        try {
            if (i14 == 0) {
                r.b(obj);
                b.f206600h.debug("initViewModel");
                w wVar = w.f140538a;
                is2.b bVar4 = is2.b.FITPAY;
                g gVarA = wVar.a(bVar4);
                gVarA.getClass();
                bVar3.f206605e = (z0) gVarA;
                w9.a aVarA = v1.a(bVar3);
                x53.c cVar = s0.f129406a;
                ge1.b.T(aVarA, o.f168762a, null, new d(bVar3, null), 2);
                z0 z0Var = bVar3.f206605e;
                if (z0Var == null) {
                    s.m("serviceProvider");
                    throw null;
                }
                long j8 = this.f206612e;
                String str = this.f206613f;
                n nVarI = w.i(j8);
                if (nVarI != null) {
                    dVarG = nVarI.g(bVar4);
                    if (!(dVarG instanceof t)) {
                        dVarG = null;
                    }
                } else {
                    dVarG = null;
                }
                dVarG.getClass();
                g1 g1Var = z0Var.f205979a;
                fo2.s sVar = ((t) dVarG).f205819e.f205629a;
                this.f206608a = bVar3;
                this.f206609b = bVar3;
                this.f206610c = 1;
                obj = g1Var.A(str, sVar, true, this);
                if (obj == aVar) {
                    return aVar;
                }
                bVar = bVar3;
                bVar2 = bVar;
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = this.f206609b;
                bVar2 = this.f206608a;
                r.b(obj);
            }
            bVar.f206604d = new AtomicReference<>(obj);
            AtomicReference<yo2.b> atomicReference = bVar2.f206604d;
            if (atomicReference == null) {
                s.m("creditCard");
                throw null;
            }
            if (atomicReference.get().getDeviceUpdateOperation().getLink() != null) {
                bVar3.f206606f.j(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            b.f206600h.debug("initViewModel: no se update required, notifying listeners");
            bVar2.f206602b.j(yo2.h.COMPLETE);
            return Unit.INSTANCE;
        } catch (Exception e4) {
            b.f206600h.error("initViewModel: ", (Throwable) e4);
            bVar3.f206606f.j(Boolean.FALSE);
        }
    }
}
