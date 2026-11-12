package zn2;

import com.google.common.util.concurrent.FluentFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayServiceProvider$deleteInvalidateDataOnDevice$1", f = "NewFitPayServiceProvider.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z0 f205414a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(z0 z0Var, t13.d<? super a1> dVar) {
        super(2, dVar);
        this.f205414a = z0Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new a1(this.f205414a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((a1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        ps2.w wVar = ps2.w.f140538a;
        is2.b bVar = is2.b.FITPAY;
        wVar.getClass();
        for (ps2.n nVar : ps2.w.j(bVar)) {
            z0.f205974g.getClass();
            ArrayList arrayList = z0.f205977j;
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((qs2.a) it.next()).f147399d);
            }
            Set setG1 = p13.h0.g1(arrayList2);
            hn2.a aVar2 = (hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null);
            long j8 = nVar.f140511n;
            if (aVar2.a(j8)) {
                g1 g1Var = this.f205414a.f205979a;
                if ((g1Var.s() instanceof sn2.a.c) || !g1Var.X(j8)) {
                    try {
                        z0.f205975h.debug("deleteInvalidateDataOnDevice: hasFitPayUser:" + g1Var.f205530e + " , hasFpDevice:" + g1Var.X(j8) + " for device " + j8 + ", deleting data on the device...");
                        FluentFuture fluentFutureW = nVar.f140499b.w(is2.b.FITPAY, setG1);
                        if (fluentFutureW != null) {
                        }
                    } catch (Exception unused) {
                        z0.f205975h.error("deleteInvalidateDataOnDevice: Unable to deleteInvalidateDataOnDevice");
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
