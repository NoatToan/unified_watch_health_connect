package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.RestrictTo;
import androidx.health.platform.client.impl.ipc.ApiVersionException;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public abstract class y04<S extends IInterface> {
    private static final int UNKNOWN_VERSION = -1;
    protected final re4 mConnectionConfiguration;
    protected final se4 mConnectionManager;
    protected volatile int mCurrentVersion = -1;
    private final mkk<S, Integer> mRemoteVersionGetter;
    private final d<S> mServiceGetter;

    public class a implements egi {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mkk f39633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f39634b;

        public a(mkk mkkVar, d dVar) {
            this.f39633a = mkkVar;
            this.f39634b = dVar;
        }

        @Override // defpackage.egi
        public re4 a() {
            return y04.this.mConnectionConfiguration;
        }

        @Override // defpackage.egi
        public void b(Throwable th) {
        }

        @Override // defpackage.egi
        public void c(IBinder iBinder) throws RemoteException {
            y04.this.mCurrentVersion = ((Integer) this.f39633a.a((IInterface) this.f39634b.a(iBinder))).intValue();
        }

        @Override // defpackage.egi
        public egi d(uf8 uf8Var) {
            return this;
        }
    }

    public class b implements iua<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f39635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l0m f39636b;
        public final /* synthetic */ kkk c;

        public b(int i, l0m l0mVar, kkk kkkVar) {
            this.f39635a = i;
            this.f39636b = l0mVar;
            this.c = kkkVar;
        }

        @Override // defpackage.iua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Integer num) {
            if (num.intValue() >= this.f39635a) {
                y04 y04Var = y04.this;
                y04Var.mConnectionManager.g(y04Var.createQueueOperation(this.c, this.f39636b));
            } else {
                y04 y04Var2 = y04.this;
                y04Var2.mConnectionManager.g(new ga2(y04Var2.mConnectionConfiguration));
                this.f39636b.C(y04.this.getApiVersionCheckFailureException(num.intValue(), this.f39635a));
            }
        }

        @Override // defpackage.iua
        public void onFailure(Throwable th) {
            this.f39636b.C(th);
        }
    }

    public class c extends ga2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kkk f39637b;
        public final /* synthetic */ l0m c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(re4 re4Var, kkk kkkVar, l0m l0mVar) {
            super(re4Var);
            this.f39637b = kkkVar;
            this.c = l0mVar;
        }

        @Override // defpackage.ga2, defpackage.egi
        public void b(Throwable th) {
            this.c.C(th);
        }

        @Override // defpackage.ga2, defpackage.egi
        public void c(IBinder iBinder) throws RemoteException {
            this.f39637b.a(y04.this.getService(iBinder), this.c);
        }

        @Override // defpackage.ga2, defpackage.egi
        public egi d(uf8 uf8Var) {
            uf8Var.a(this.c);
            return this;
        }
    }

    public interface d<S> {
        S a(IBinder iBinder);
    }

    public y04(a14 a14Var, se4 se4Var, d<S> dVar, mkk<S, Integer> mkkVar) {
        this.mConnectionConfiguration = new re4(a14Var.c(), a14Var.a(), a14Var.b(), new a(mkkVar, dVar));
        this.mConnectionManager = se4Var;
        this.mServiceGetter = dVar;
        this.mRemoteVersionGetter = mkkVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$execute$0(mkk mkkVar, IInterface iInterface, l0m l0mVar) throws RemoteException {
        l0mVar.B(mkkVar.a(iInterface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Integer lambda$getCurrentRemoteVersion$1(Integer num) {
        this.mCurrentVersion = num.intValue();
        return Integer.valueOf(this.mCurrentVersion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$registerListener$2(mkk mkkVar, IInterface iInterface, l0m l0mVar) throws RemoteException {
        l0mVar.B(mkkVar.a(iInterface));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$unregisterListener$3(mkk mkkVar, IInterface iInterface, l0m l0mVar) throws RemoteException {
        l0mVar.B(mkkVar.a(iInterface));
    }

    public <R> egi createQueueOperation(kkk<S, R> kkkVar, l0m<R> l0mVar) {
        return new c(this.mConnectionConfiguration, kkkVar, l0mVar);
    }

    public <R> lhe<R> execute(final mkk<S, R> mkkVar) {
        return execute(new kkk() { // from class: w04
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                y04.lambda$execute$0(mkkVar, (IInterface) obj, l0mVar);
            }
        });
    }

    public <R> lhe<R> executeWithVersionCheck(int i, kkk<S, R> kkkVar) {
        l0m l0mVarF = l0m.F();
        pua.a(getCurrentRemoteVersion(false), new b(i, l0mVarF, kkkVar), c8g.a());
        return l0mVarF;
    }

    public Exception getApiVersionCheckFailureException(int i, int i2) {
        return new ApiVersionException(i, i2);
    }

    public re4 getConnectionConfiguration() {
        return this.mConnectionConfiguration;
    }

    public se4 getConnectionManager() {
        return this.mConnectionManager;
    }

    public lhe<Integer> getCurrentRemoteVersion(boolean z) {
        return (this.mCurrentVersion == -1 || z) ? pua.d(execute(this.mRemoteVersionGetter), new dua() { // from class: v04
            @Override // defpackage.dua
            public final Object apply(Object obj) {
                return this.f36338a.lambda$getCurrentRemoteVersion$1((Integer) obj);
            }
        }, c8g.a()) : pua.c(Integer.valueOf(this.mCurrentVersion));
    }

    public S getService(IBinder iBinder) {
        return this.mServiceGetter.a(iBinder);
    }

    public <R> lhe<R> registerListener(the theVar, final mkk<S, R> mkkVar) {
        return registerListener(theVar, new kkk() { // from class: u04
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                y04.lambda$registerListener$2(mkkVar, (IInterface) obj, l0mVar);
            }
        });
    }

    public <R> lhe<R> unregisterListener(the theVar, final mkk<S, R> mkkVar) {
        return unregisterListener(theVar, new kkk() { // from class: x04
            @Override // defpackage.kkk
            public final void a(Object obj, l0m l0mVar) throws RemoteException {
                y04.lambda$unregisterListener$3(mkkVar, (IInterface) obj, l0mVar);
            }
        });
    }

    public <R> lhe<R> execute(kkk<S, R> kkkVar) {
        l0m<R> l0mVarF = l0m.F();
        this.mConnectionManager.g(createQueueOperation(kkkVar, l0mVarF));
        return l0mVarF;
    }

    public <R> lhe<R> registerListener(the theVar, kkk<S, R> kkkVar) {
        l0m<R> l0mVarF = l0m.F();
        this.mConnectionManager.f(theVar, createQueueOperation(kkkVar, l0mVarF));
        return l0mVarF;
    }

    public <R> lhe<R> unregisterListener(the theVar, kkk<S, R> kkkVar) {
        l0m<R> l0mVarF = l0m.F();
        this.mConnectionManager.h(theVar, createQueueOperation(kkkVar, l0mVarF));
        return l0mVarF;
    }
}
