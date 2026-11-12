package n70;

import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvb0/a;", "bannerData", "", "Lvb0/e;", "dismissedBannerData", "", "<unused var>", "<anonymous>", "(Lvb0/a;Ljava/util/List;Z)Lvb0/a;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetRemainingInReachSubscriptionsUseCase$invoke$1", f = "GetRemainingInReachSubscriptionsUseCase.kt", l = {39}, m = "invokeSuspend", v = 2)
public final class h3 extends v13.i implements e23.r<vb0.a, List<? extends vb0.e>, Boolean, t13.d<? super vb0.a>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f124255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ vb0.a f124256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ List f124257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d3 f124258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(d3 d3Var, t13.d<? super h3> dVar) {
        super(4, dVar);
        this.f124258d = d3Var;
    }

    @Override // e23.r
    public final Object invoke(vb0.a aVar, List<? extends vb0.e> list, Boolean bool, t13.d<? super vb0.a> dVar) {
        bool.getClass();
        h3 h3Var = new h3(this.f124258d, dVar);
        h3Var.f124256b = aVar;
        h3Var.f124257c = list;
        return h3Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        vb0.a aVar = this.f124256b;
        List list = this.f124257c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f124255a;
        if (i14 == 0) {
            o13.r.b(obj);
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((vb0.e) next).getUnitId() != aVar.f176833a);
            vb0.e eVar = (vb0.e) next;
            e53.a.C1329a.f63093a.getClass();
            long jC = e53.k.f63117a.a().c();
            d3 d3Var = this.f124258d;
            int iI2 = d3Var.f124136b.i2(172800000, "keyInReachReminderOverrideDurationMillis");
            if (eVar == null || jC - eVar.getDeviceRemovalTimestamp() <= iI2) {
                return null;
            }
            vb0.b bVar = d3Var.f124135a;
            this.f124256b = aVar;
            this.f124257c = null;
            this.f124255a = 1;
            obj = bVar.a(this);
            if (obj == aVar2) {
                return aVar2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return new vb0.a(aVar.f176833a, (Uri) obj);
    }
}
