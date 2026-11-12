package o8;

import android.health.connect.HealthConnectManager;
import android.health.connect.InsertRecordsResponse;
import e23.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.k;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;
import y8.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/health/connect/InsertRecordsResponse;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
@v13.e(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$insertRecords$response$1", f = "HealthConnectClientUpsideDownImpl.kt", l = {634}, m = "invokeSuspend")
public final class h extends v13.i implements l<t13.d<? super InsertRecordsResponse>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f130825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f130826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f130827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<q0> f130828d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(e eVar, List<? extends q0> list, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f130827c = eVar;
        this.f130828d = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f130827c, this.f130828d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super InsertRecordsResponse> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f130826b;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        List<q0> list = this.f130828d;
        this.f130825a = list;
        this.f130826b = 1;
        k kVar = new k(u13.f.b(this), 1);
        kVar.q();
        e eVar = this.f130827c;
        HealthConnectManager healthConnectManager = eVar.f130807e;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(t8.k.b((q0) it.next()));
        }
        healthConnectManager.insertRecords(arrayList, eVar.f130805c, new h7.f(kVar));
        Object objP = kVar.p();
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        return objP == aVar ? aVar : objP;
    }
}
