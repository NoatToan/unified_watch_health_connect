package o8;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import androidx.health.platform.client.proto.o1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import y8.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lo8/a;", "Lk8/a;", "Lk8/c;", "Ld9/a;", "delegate", "Lk8/b;", "features", "<init>", "(Ld9/a;Lk8/b;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "providerPackageName", "(Landroid/content/Context;Ljava/lang/String;)V", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements k8.a, k8.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d9.a f130789c;

    /* JADX INFO: renamed from: o8.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.health.connect.client.impl.HealthConnectClientImpl", f = "HealthConnectClientImpl.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "deleteRecords")
    public static final class C2484a extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f130790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f130791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f130792c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f130794e;

        public C2484a(t13.d<? super C2484a> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f130792c = obj;
            this.f130794e |= Integer.MIN_VALUE;
            return a.this.c(null, null, null, this);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String str) {
        this(new f9.e(context, new j9.d("HealthData", str, "androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE")), str.equals("com.google.android.apps.healthdata") ? new n8.a(context, str) : n8.c.f124921b);
        context.getClass();
        str.getClass();
        d9.b.f58411a.getClass();
        if (str.length() != 0) {
        } else {
            vb.h.s("Service package name must not be empty.");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k8.a
    public final Object a(k23.d dVar, b9.a aVar, v13.c cVar) throws Throwable {
        b bVar;
        Throwable deadObjectException;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f130797c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f130797c = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.f130795a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f130797c;
        try {
            if (i15 == 0) {
                r.b(obj);
                SettableFuture settableFutureA = this.f130789c.a(r8.a.a(dVar, aVar));
                bVar.f130797c = 1;
                if (t53.c.b(settableFutureA, bVar) == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            int i16 = l9.a.f111509a;
            return Unit.INSTANCE;
        } catch (RemoteException e4) {
            if (e4 instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e4.getMessage());
            } else {
                deadObjectException = e4 instanceof TransactionTooLargeException ? new TransactionTooLargeException(e4.getMessage()) : new RemoteException(e4.getMessage());
            }
            deadObjectException.initCause(e4);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k8.c
    public final Object b(v13.c cVar) throws Throwable {
        c cVar2;
        Throwable deadObjectException;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f130800c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f130800c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objB = cVar2.f130798a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f130800c;
        try {
            if (i15 == 0) {
                r.b(objB);
                d9.a aVar2 = this.f130789c;
                q13.b bVar = w8.a.f183538d;
                ArrayList arrayList = new ArrayList(y.r(bVar, 10));
                ListIterator listIterator = bVar.listIterator(0);
                while (true) {
                    q13.b.c cVar3 = (q13.b.c) listIterator;
                    if (!cVar3.hasNext()) {
                        break;
                    }
                    String str = (String) cVar3.next();
                    o1.a aVarV = o1.v();
                    aVarV.g();
                    o1.t((o1) aVarV.f7677b, str);
                    arrayList.add(aVarV.e());
                }
                SettableFuture settableFutureB = aVar2.b(h0.g1(arrayList));
                cVar2.f130800c = 1;
                objB = t53.c.b(settableFutureB, cVar2);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objB);
            }
            Iterable iterable = (Iterable) objB;
            ArrayList arrayList2 = new ArrayList(y.r(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((o1) it.next()).u());
            }
            Set setG1 = h0.g1(arrayList2);
            setG1.size();
            w8.a.f183538d.getF142104b();
            int i16 = l9.a.f111509a;
            return setG1;
        } catch (RemoteException e4) {
            if (e4 instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e4.getMessage());
            } else {
                deadObjectException = e4 instanceof TransactionTooLargeException ? new TransactionTooLargeException(e4.getMessage()) : new RemoteException(e4.getMessage());
            }
            deadObjectException.initCause(e4);
            throw deadObjectException;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k8.a
    public final Object c(k23.d<? extends q0> dVar, List<String> list, List<String> list2, t13.d<? super Unit> dVar2) throws Throwable {
        C2484a c2484a;
        Throwable deadObjectException;
        if (dVar2 instanceof C2484a) {
            c2484a = (C2484a) dVar2;
            int i14 = c2484a.f130794e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c2484a.f130794e = i14 - Integer.MIN_VALUE;
            } else {
                c2484a = new C2484a(dVar2);
            }
        } else {
            c2484a = new C2484a(dVar2);
        }
        Object obj = c2484a.f130792c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = c2484a.f130794e;
        try {
            if (i15 == 0) {
                r.b(obj);
                SettableFuture settableFutureC = this.f130789c.c(p8.b.a(dVar, list), p8.b.a(dVar, list2));
                c2484a.f130790a = list;
                c2484a.f130791b = list2;
                c2484a.f130794e = 1;
                if (t53.c.b(settableFutureC, c2484a) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = c2484a.f130791b;
                list = c2484a.f130790a;
                r.b(obj);
            }
            list.size();
            list2.size();
            int i16 = l9.a.f111509a;
            return Unit.INSTANCE;
        } catch (RemoteException e4) {
            if (e4 instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e4.getMessage());
            } else {
                deadObjectException = e4 instanceof TransactionTooLargeException ? new TransactionTooLargeException(e4.getMessage()) : new RemoteException(e4.getMessage());
            }
            deadObjectException.initCause(e4);
            throw deadObjectException;
        }
    }

    @Override // k8.a
    public final k8.c d() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // k8.a
    public final Object e(List list, v13.c cVar) throws Throwable {
        d dVar;
        Throwable deadObjectException;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i14 = dVar.f130804d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f130804d = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objB = dVar.f130802b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f130804d;
        try {
            if (i15 == 0) {
                r.b(objB);
                d9.a aVar2 = this.f130789c;
                ArrayList arrayList = new ArrayList(y.r(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(q8.b.a((q0) it.next()));
                }
                SettableFuture settableFutureD = aVar2.d(arrayList);
                dVar.f130801a = list;
                dVar.f130804d = 1;
                objB = t53.c.b(settableFutureD, dVar);
                if (objB == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list = dVar.f130801a;
                r.b(objB);
            }
            List list2 = (List) objB;
            list.size();
            int i16 = l9.a.f111509a;
            return new a9.a(list2);
        } catch (RemoteException e4) {
            if (e4 instanceof DeadObjectException) {
                deadObjectException = new DeadObjectException(e4.getMessage());
            } else {
                deadObjectException = e4 instanceof TransactionTooLargeException ? new TransactionTooLargeException(e4.getMessage()) : new RemoteException(e4.getMessage());
            }
            deadObjectException.initCause(e4);
            throw deadObjectException;
        }
    }

    public a(d9.a aVar, k8.b bVar) {
        aVar.getClass();
        bVar.getClass();
        this.f130789c = aVar;
    }
}
