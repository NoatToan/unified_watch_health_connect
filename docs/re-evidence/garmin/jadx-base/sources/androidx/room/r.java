package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.g2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/room/r;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "name", "Landroidx/room/m;", "invalidationTracker", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/room/m;)V", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f10926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f10927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o53.b0 f10928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f10929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f10931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2 f10932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b f10933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f10934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f10935k;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/r$a", "Landroidx/room/i$a;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends i.a {

        /* JADX INFO: renamed from: androidx.room.r$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
        @v13.e(c = "androidx.room.MultiInstanceInvalidationClient$invalidationCallback$1$onInvalidation$1", f = "MultiInstanceInvalidationClient.android.kt", l = {87}, m = "invokeSuspend")
        public static final class C0155a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Set f10937a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f10938b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String[] f10939c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ r f10940d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0155a(String[] strArr, r rVar, t13.d<? super C0155a> dVar) {
                super(2, dVar);
                this.f10939c = strArr;
                this.f10940d = rVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C0155a(this.f10939c, this.f10940d, dVar);
            }

            @Override // e23.p
            public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                return ((C0155a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                Set<String> set;
                Set<String> setA;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f10938b;
                r rVar = this.f10940d;
                if (i14 == 0) {
                    o13.r.b(obj);
                    String[] strArr = this.f10939c;
                    Set setM0 = p13.u.m0(Arrays.copyOf(strArr, strArr.length));
                    e2 e2Var = rVar.f10932h;
                    this.f10937a = setM0;
                    this.f10938b = 1;
                    if (e2Var.emit(setM0, this) == aVar) {
                        return aVar;
                    }
                    set = setM0;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = this.f10937a;
                    o13.r.b(obj);
                }
                m mVar = rVar.f10926b;
                set.getClass();
                ReentrantLock reentrantLock = mVar.f10885g;
                reentrantLock.lock();
                try {
                    List<v> listB1 = p13.h0.b1(mVar.f10884f.values());
                    reentrantLock.unlock();
                    for (v vVar : listB1) {
                        if (!(vVar.f10967a instanceof b)) {
                            String[] strArr2 = vVar.f10969c;
                            int length = strArr2.length;
                            if (length == 0) {
                                setA = p13.l0.f134950a;
                            } else if (length == 1) {
                                Set set2 = set;
                                if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                                    Iterator it = set2.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            setA = p13.l0.f134950a;
                                            break;
                                        }
                                        if (d53.u.q((String) it.next(), strArr2[0], true)) {
                                            setA = vVar.f10970d;
                                            break;
                                        }
                                    }
                                } else {
                                    setA = p13.l0.f134950a;
                                    break;
                                }
                            } else {
                                q13.g gVar = new q13.g();
                                for (String str : set) {
                                    for (String str2 : strArr2) {
                                        if (d53.u.q(str2, str, true)) {
                                            gVar.add(str2);
                                            break;
                                        }
                                    }
                                }
                                setA = p13.a1.a(gVar);
                            }
                            if (!setA.isEmpty()) {
                                vVar.f10967a.a(setA);
                            }
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th3) {
                    reentrantLock.unlock();
                    throw th3;
                }
            }
        }

        public a() {
        }

        @Override // androidx.room.i
        public final void H(String[] strArr) {
            strArr.getClass();
            r rVar = r.this;
            ge1.b.T(rVar.f10928d, null, null, new C0155a(strArr, rVar, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/r$b", "Landroidx/room/m$b;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends m.b {
        public b(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.m.b
        public final void a(Set<String> set) {
            set.getClass();
            r rVar = r.this;
            if (rVar.f10929e.get()) {
                return;
            }
            try {
                j jVar = rVar.f10931g;
                if (jVar != null) {
                    jVar.c0(rVar.f10930f, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/room/r$c", "Landroid/content/ServiceConnection;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements ServiceConnection {
        public c() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            componentName.getClass();
            iBinder.getClass();
            int i14 = j.a.f10855a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(j.f10854h);
            j c0153a = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof j)) ? new j.a.C0153a(iBinder) : (j) iInterfaceQueryLocalInterface;
            r rVar = r.this;
            rVar.f10931g = c0153a;
            try {
                rVar.f10930f = c0153a.y(rVar.f10934j, rVar.f10925a);
            } catch (RemoteException unused) {
            }
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            componentName.getClass();
            r.this.f10931g = null;
        }
    }

    public r(Context context, String str, m mVar) {
        context.getClass();
        str.getClass();
        mVar.getClass();
        this.f10925a = str;
        this.f10926b = mVar;
        this.f10927c = context.getApplicationContext();
        this.f10928d = mVar.f10879a.getCoroutineScope();
        this.f10929e = new AtomicBoolean(true);
        this.f10932h = g2.a(0, 0, q53.a.SUSPEND);
        this.f10933i = new b(mVar.f10882d);
        this.f10934j = new a();
        this.f10935k = new c();
    }

    public final void a() {
        if (this.f10929e.compareAndSet(false, true)) {
            this.f10926b.c(this.f10933i);
            try {
                j jVar = this.f10931g;
                if (jVar != null) {
                    jVar.E(this.f10934j, this.f10930f);
                }
            } catch (RemoteException unused) {
            }
            this.f10927c.unbindService(this.f10935k);
        }
    }
}
