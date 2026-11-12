package bo2;

import com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletNoSESpaceException;
import e23.p;
import lc.u0;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zn2.q3;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel$checkAvailableSpace$2", f = "AlipayAppletInstallationViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19260b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f19260b = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f19260b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f19259a;
        if (i14 == 0) {
            r.b(obj);
            q3 q3Var = new q3();
            e.a aVar2 = e.f19250d;
            long jB4 = this.f19260b.B4();
            or2.a aVar3 = or2.a.f133422a;
            qs2.a aVar4 = qs2.a.f147394y;
            aVar3.getClass();
            int iB = or2.a.b(aVar4);
            this.f19259a = 1;
            obj = q3Var.a(jB4, iB, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        q3.a aVar5 = (q3.a) obj;
        if (aVar5 instanceof q3.a.c) {
            throw new AlipayAppletNoSESpaceException("Not enough space for Alipay applet installation");
        }
        if (aVar5 instanceof q3.a.b) {
            kg.f.n("Failed to get eSE space");
            return null;
        }
        if (aVar5 instanceof q3.a.C3843a) {
            return Unit.INSTANCE;
        }
        u0.r();
        return null;
    }
}
