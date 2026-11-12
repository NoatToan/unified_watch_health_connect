package ie0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.p;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.d2;
import r53.j;
import v13.e;
import v13.i;
import vb.h;
import z70.w;
import zd0.j1;
import zd0.q0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lie0/b;", "Lz70/w;", "Lzd0/j1;", "subscriptionProvider", "<init>", "(Lzd0/j1;)V", "b", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements w {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.domain.watchers.GCPlusSubscriptionPromoWatcher$1", f = "GCPlusSubscriptionPromoWatcher.kt", l = {18}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f93077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f93078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j1 f93079c;

        /* JADX INFO: renamed from: ie0.b$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class C1779a<T> implements j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b0 f93080a;

            public C1779a(b0 b0Var) {
                this.f93080a = b0Var;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                a2 a2Var = a2.PROMOTIONS;
                i2.f36769a.getClass();
                i2.a.k(a2Var, "SubscriptionPromoWatcher", "Subscription status changed. Resetting PromosProvider.");
                Object objK = ((q0) KoinJavaComponent.get$default(q0.class, null, null, 6, null)).k(dVar);
                return objK == u13.a.COROUTINE_SUSPENDED ? objK : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j1 j1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f93079c = j1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f93079c, dVar);
            aVar.f93078b = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f93078b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f93077a;
            if (i14 == 0) {
                r.b(obj);
                d2<c80.r> d2VarB = this.f93079c.b();
                C1779a c1779a = new C1779a(b0Var);
                this.f93078b = null;
                this.f93077a = 1;
                if (d2VarB.collect(c1779a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            o2.c.f();
            return null;
        }
    }

    static {
        new C1780b(null);
    }

    public b(j1 j1Var) {
        j1Var.getClass();
        x53.c cVar = s0.f129406a;
        ge1.b.T(c0.a(x53.b.f189152a), null, null, new a(j1Var, null), 3);
    }

    /* JADX INFO: renamed from: ie0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lie0/b$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1780b {
        public /* synthetic */ C1780b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C1780b() {
        }
    }
}
