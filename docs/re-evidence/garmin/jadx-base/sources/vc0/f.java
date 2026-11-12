package vc0;

import java.util.ArrayList;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)I"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.settings.dynamic.transform.DSLFeatureSetupTransform$getDeviceSetupIncompleteFeaturesCount$1", f = "DSLFeatureSetupTransform.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<b0, t13.d<? super Integer>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f176982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b31.a f176983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f176984c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(b31.a aVar, g gVar, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f176983b = aVar;
        this.f176984c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new f(this.f176983b, this.f176984c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Integer> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176982a;
        if (i14 == 0) {
            o13.r.b(obj);
            long unitID = this.f176984c.f176985c.getUnitID();
            d31.c cVar = d31.c.NOT_STARTED;
            this.f176982a = 1;
            obj = this.f176983b.b(unitID, cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (((d31.a) obj2).f57326f != d31.d.DEVICE_WELCOME) {
                arrayList.add(obj2);
            }
        }
        return new Integer(arrayList.size());
    }
}
