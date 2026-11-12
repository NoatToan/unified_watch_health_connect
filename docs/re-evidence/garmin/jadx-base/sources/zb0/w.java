package zb0;

import java.util.ArrayList;
import java.util.Iterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.devices.DeviceImageLoader$Companion$solveRegisteredDevicesImages$2$productNumberImage$1", f = "DeviceImageLoader.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ArrayList<bm2.c> f203865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f203866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(ArrayList<bm2.c> arrayList, String str, t13.d<? super w> dVar) {
        super(2, dVar);
        this.f203865a = arrayList;
        this.f203866b = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new w(this.f203865a, this.f203866b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
        return ((w) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        Iterator<T> it = this.f203865a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!p005kotlin.jvm.internal.s.g(((bm2.c) next).f18897a, this.f203866b));
        bm2.c cVar = (bm2.c) next;
        if (cVar != null) {
            return cVar.f18909g;
        }
        return null;
    }
}
