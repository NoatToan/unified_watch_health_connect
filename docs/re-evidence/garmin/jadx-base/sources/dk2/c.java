package dk2;

import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import v13.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.discovery.ActiveDiscoveryCheck$startProbing$1", f = "ActiveDiscoveryCheck.kt", l = {110}, m = "invokeSuspend")
public final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f60230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Collection<String> f60232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f60233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f60234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Collection<String> collection, long j8, a aVar, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f60232c = collection;
        this.f60233d = j8;
        this.f60234e = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c(this.f60232c, this.f60233d, this.f60234e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        HashSet hashSet;
        List listN0;
        a aVar = this.f60234e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60231b;
        if (i14 == 0) {
            r.b(obj);
            HashSet hashSetZ0 = h0.Z0(this.f60232c);
            long j8 = this.f60233d;
            this.f60230a = hashSetZ0;
            this.f60231b = 1;
            if (m0.b(j8, this) == aVar2) {
                return aVar2;
            }
            hashSet = hashSetZ0;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hashSet = this.f60230a;
            r.b(obj);
        }
        ek2.b bVar = aVar.f60213a;
        d.f60235m.getClass();
        androidx.browser.trusted.c cVar = d.f60236n;
        bVar.getClass();
        cVar.getClass();
        synchronized (bVar.f64515b) {
            try {
                ArrayList arrayList = new ArrayList(bVar.f64520g.values());
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    arrayList2.add(obj2);
                }
                listN0 = h0.N0(arrayList2, cVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        ArrayList arrayList3 = new ArrayList(y.r(listN0, 10));
        Iterator it = listN0.iterator();
        while (it.hasNext()) {
            arrayList3.add(((h) it.next()).getF60238b());
        }
        hashSet.addAll(arrayList3);
        if (aVar.f60213a.c()) {
            aVar.f60220h.c(hashSet, aVar.f60216d, aVar);
        } else {
            a.f60211i.debug("Skip probing since discovery stopped");
        }
        return Unit.INSTANCE;
    }
}
