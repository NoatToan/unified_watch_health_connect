package zd0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.e2;
import r53.g2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lzd0/a;", "Lzd0/t;", "<init>", "()V", "a", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e2 f203977a = g2.b(0, 0, null, 7);

    static {
        new C3805a(null);
    }

    @Override // zd0.f
    public final Object a(com.garmin.android.apps.connectmobile.gcplus.presentation.home.g gVar) throws Throwable {
        a2 a2Var = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "DefaultGCPlusSubscriptionEventManager", "Posting PurchaseCompleted with failure");
        Object objEmit = this.f203977a.emit(new c80.r.a(false), gVar);
        return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
    }

    @Override // zd0.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final e2 getF203977a() {
        return this.f203977a;
    }

    @Override // zd0.f
    public final Object c(com.garmin.android.apps.connectmobile.gcplus.presentation.home.g gVar) throws Throwable {
        a2 a2Var = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "DefaultGCPlusSubscriptionEventManager", "Posting PurchaseCompleted with success");
        Object objEmit = this.f203977a.emit(new c80.r.a(true), gVar);
        return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
    }

    @Override // zd0.f
    public final Object d(s00.n0 n0Var) throws Throwable {
        a2 a2Var = a2.SUBSCRIPTIONS;
        i2.f36769a.getClass();
        i2.a.k(a2Var, "DefaultGCPlusSubscriptionEventManager", "Posting SubscriptionChange");
        Object objEmit = this.f203977a.emit(c80.r.b.f25555a, n0Var);
        return objEmit == u13.a.COROUTINE_SUSPENDED ? objEmit : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: zd0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lzd0/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3805a {
        public /* synthetic */ C3805a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C3805a() {
        }
    }
}
