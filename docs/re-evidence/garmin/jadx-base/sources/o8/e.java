package o8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.health.connect.HealthConnectException;
import android.health.connect.HealthConnectManager;
import android.health.connect.InsertRecordsResponse;
import android.health.connect.RecordIdFilter;
import android.os.RemoteException;
import ch.qos.logback.core.CoreConstants;
import d53.u;
import e23.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o13.r;
import o53.k;
import o53.r0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.a1;
import p13.w;
import p13.y;
import y8.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0011\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lo8/e;", "Lk8/a;", "Lk8/c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function1;", "", "", "", "revokePermissionsFunction", "(Landroid/content/Context;Le23/l;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements k8.a, k8.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f130805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f130806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HealthConnectManager f130807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<Collection<String>, Unit> f130808f;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<Collection<String>, Unit> {
        public a(Object obj) {
            super(1, obj, Context.class, "revokeSelfPermissionsOnKill", "revokeSelfPermissionsOnKill(Ljava/util/Collection;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Collection<String> collection) {
            Collection<String> collection2 = collection;
            collection2.getClass();
            ((Context) this.receiver).revokeSelfPermissionsOnKill(collection2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Ljava/lang/Void;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl$deleteRecords$2", f = "HealthConnectClientUpsideDownImpl.kt", l = {634}, m = "invokeSuspend")
    public static final class b extends v13.i implements l<t13.d<? super Void>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f130809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f130810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public k23.d f130811c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f130812d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<String> f130814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ List<String> f130815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k23.d<? extends q0> f130816h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<String> list, List<String> list2, k23.d<? extends q0> dVar, t13.d<? super b> dVar2) {
            super(1, dVar2);
            this.f130814f = list;
            this.f130815g = list2;
            this.f130816h = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return e.this.new b(this.f130814f, this.f130815g, this.f130816h, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Void> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f130812d;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            List<String> list = this.f130814f;
            this.f130809a = list;
            List<String> list2 = this.f130815g;
            this.f130810b = list2;
            k23.d<? extends q0> dVar = this.f130816h;
            this.f130811c = dVar;
            this.f130812d = 1;
            k kVar = new k(u13.f.b(this), 1);
            kVar.q();
            e eVar = e.this;
            HealthConnectManager healthConnectManager = eVar.f130807e;
            q13.b bVarB = w.b();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                bVarB.add(RecordIdFilter.fromId(t8.k.c(dVar), (String) it.next()));
            }
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                bVarB.add(RecordIdFilter.fromClientRecordId(t8.k.c(dVar), (String) it3.next()));
            }
            healthConnectManager.deleteRecords(w.a(bVarB), eVar.f130805c, new h7.f(kVar));
            Object objP = kVar.p();
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            return objP == aVar ? aVar : objP;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(Context context, l<? super Collection<String>, Unit> lVar) {
        Executor executor;
        context.getClass();
        lVar.getClass();
        x53.c cVar = s0.f129406a;
        x53.c cVar2 = cVar != null ? cVar : null;
        this.f130805c = (cVar2 == null || (executor = cVar2.getExecutor()) == null) ? new r0(cVar) : executor;
        new n8.b();
        this.f130806d = context;
        Object systemService = context.getSystemService("healthconnect");
        systemService.getClass();
        this.f130807e = fd.i.m(systemService);
        this.f130808f = lVar;
    }

    @Override // k8.a
    public final Object a(k23.d dVar, b9.a aVar, v13.c cVar) throws RemoteException, IOException {
        Object objF = f(new f(this, dVar, aVar, null), cVar);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
    }

    @Override // k8.c
    public final Object b(v13.c cVar) throws PackageManager.NameNotFoundException {
        Context context = this.f130806d;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(4096L));
        q13.g gVar = new q13.g();
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            strArr = new String[0];
        }
        int length = strArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            String str = strArr[i14];
            str.getClass();
            if (u.y(str, "android.permission.health.", false)) {
                int[] iArr = packageInfo.requestedPermissionsFlags;
                iArr.getClass();
                if ((iArr[i14] & 2) > 0) {
                    String str2 = strArr[i14];
                    str2.getClass();
                    gVar.add(str2);
                }
            }
        }
        return a1.a(gVar);
    }

    @Override // k8.a
    public final Object c(k23.d<? extends q0> dVar, List<String> list, List<String> list2, t13.d<? super Unit> dVar2) throws RemoteException, IOException {
        Object objF = f(new b(list, list2, dVar, null), (v13.c) dVar2);
        return objF == u13.a.COROUTINE_SUSPENDED ? objF : Unit.INSTANCE;
    }

    @Override // k8.a
    public final k8.c d() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k8.a
    public final Object e(List list, v13.c cVar) throws RemoteException, IOException {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f130824c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f130824c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objF = gVar.f130822a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f130824c;
        if (i15 == 0) {
            r.b(objF);
            l hVar = new h(this, list, null);
            gVar.f130824c = 1;
            objF = f(hVar, gVar);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objF);
        }
        InsertRecordsResponse insertRecordsResponseN = fd.i.n(objF);
        insertRecordsResponseN.getClass();
        List records = insertRecordsResponseN.getRecords();
        records.getClass();
        ArrayList arrayList = new ArrayList(y.r(records, 10));
        Iterator it = records.iterator();
        while (it.hasNext()) {
            String id3 = v8.a.d(it.next()).getMetadata().getId();
            id3.getClass();
            arrayList.add(id3);
        }
        return new a9.a(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(l lVar, v13.c cVar) throws RemoteException, IOException {
        i iVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i14 = iVar.f130831c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f130831c = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, cVar);
            }
        } else {
            iVar = new i(this, cVar);
        }
        Object obj = iVar.f130829a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f130831c;
        try {
            if (i15 == 0) {
                r.b(obj);
                iVar.f130831c = 1;
                Object objInvoke = lVar.invoke(iVar);
                return objInvoke == aVar ? aVar : objInvoke;
            }
            if (i15 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        } catch (HealthConnectException e4) {
            int errorCode = e4.getErrorCode();
            if (errorCode == 3) {
                throw new IllegalArgumentException(e4);
            }
            if (errorCode == 4) {
                throw new IOException(e4);
            }
            if (errorCode == 5) {
                throw new SecurityException(e4);
            }
            if (errorCode != 6) {
                throw new IllegalStateException(e4);
            }
            throw new RemoteException(e4.getMessage());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        this(context, new a(context));
        context.getClass();
    }
}
