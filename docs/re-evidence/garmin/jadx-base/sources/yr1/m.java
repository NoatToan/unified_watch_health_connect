package yr1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import o53.s0;
import ok2.a0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lyr1/m;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f199104a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference<g> f199105b = new AtomicReference<>(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyr1/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object a(Context context, v13.c cVar) throws Throwable {
            j jVar;
            n nVar;
            Object objE0;
            if (cVar instanceof j) {
                jVar = (j) cVar;
                int i14 = jVar.f199100e;
                if ((i14 & Integer.MIN_VALUE) != 0) {
                    jVar.f199100e = i14 - Integer.MIN_VALUE;
                } else {
                    jVar = new j(this, cVar);
                }
            } else {
                jVar = new j(this, cVar);
            }
            Object obj = jVar.f199098c;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = jVar.f199100e;
            try {
                if (i15 == 0) {
                    o13.r.b(obj);
                    nVar = new n(context);
                    x53.c cVar2 = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    k kVar = new k(null);
                    jVar.f199096a = context;
                    jVar.f199097b = nVar;
                    jVar.f199100e = 1;
                    objE0 = ge1.b.e0(bVar, kVar, jVar);
                    if (objE0 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i15 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n nVar2 = jVar.f199097b;
                    Context context2 = jVar.f199096a;
                    o13.r.b(obj);
                    nVar = nVar2;
                    context = context2;
                    objE0 = obj;
                }
                il2.g.b(il2.g.f94050g.a(), nVar, (List) objE0, new i(context, new bs1.b(), new as1.a()));
                g gVar = new g(context);
                AtomicReference<g> atomicReference = m.f199105b;
                do {
                    if (atomicReference.compareAndSet(null, gVar)) {
                        jl2.c cVar3 = il2.g.f94050g.a().f94057e;
                        if (cVar3 != null) {
                            cVar3.f99553i.add(gVar);
                        }
                        a0.f132585h.a().b(gVar);
                        break;
                    }
                } while (atomicReference.get() == null);
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "GCMSyncInitializer", "initialized SyncInitializer");
            } catch (IllegalArgumentException e4) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "GCMSyncInitializer", "failed to initialize connect-device-sync: " + e4);
            }
            return Unit.INSTANCE;
        }

        private a() {
        }
    }
}
