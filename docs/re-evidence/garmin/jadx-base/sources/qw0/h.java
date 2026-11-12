package qw0;

import java.util.Iterator;
import java.util.LinkedHashMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.map.GCMMapBuilder$initializeAllMapSdk$1", f = "GCMMapBuilder.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f148317a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f148317a = iVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f148317a, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        i iVar = this.f148317a;
        iVar.f50332c.clear();
        LinkedHashMap linkedHashMap = iVar.f50332c;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        com.garmin.android.library.mapsdkadapter.i.d dVar = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
        Boolean bool = Boolean.FALSE;
        linkedHashMap2.put(dVar, bool);
        if (((s) iVar.f148319e.getValue()).c()) {
            linkedHashMap2.put(com.garmin.android.library.mapsdkadapter.i.d.MAPBOX, bool);
        }
        linkedHashMap.putAll(linkedHashMap2);
        Iterator it = iVar.f50332c.keySet().iterator();
        while (it.hasNext()) {
            iVar.d((com.garmin.android.library.mapsdkadapter.i.d) it.next());
        }
        return Unit.INSTANCE;
    }
}
