package ye;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import com.garmin.android.apps.connectmobile.activities.model.PrivacyUpdateRequestError;
import e23.p;
import java.util.LinkedHashMap;
import o13.r;
import o53.b0;
import o53.m0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import q53.t;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq53/t;", "Lye/b;", "", "<anonymous>", "(Lq53/t;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {180}, m = "invokeSuspend")
public final class d extends v13.i implements p<t<? super b>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f196783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ue.f f196784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f196785d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", f = "WorkConstraintsTracker.kt", l = {151}, m = "invokeSuspend")
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f196786a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f196787b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t<b> f196788c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(e eVar, t<? super b> tVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f196787b = eVar;
            this.f196788c = tVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f196787b, this.f196788c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f196786a;
            e eVar = this.f196787b;
            if (i14 == 0) {
                r.b(obj);
                long j8 = eVar.f196790b;
                this.f196786a = 1;
                if (m0.b(j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            u uVarA = u.a();
            int i15 = l.f196812a;
            long j14 = eVar.f196790b;
            uVarA.getClass();
            this.f196788c.i(new b.C3684b(7));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ue.f fVar, e eVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f196784c = fVar;
        this.f196785d = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d dVar2 = new d(this.f196784c, this.f196785d, dVar);
        dVar2.f196783b = obj;
        return dVar2;
    }

    @Override // e23.p
    public final Object invoke(t<? super b> tVar, t13.d<? super Unit> dVar) {
        return ((d) create(tVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Exception {
        e23.a kVar;
        NetworkCapabilities networkCapabilities;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196782a;
        if (i14 == 0) {
            r.b(obj);
            t tVar = (t) this.f196783b;
            NetworkRequest networkRequestA = this.f196784c.a();
            if (networkRequestA == null) {
                tVar.getChannel().q(null);
                return Unit.INSTANCE;
            }
            x9.b bVar = new x9.b(22, ge1.b.T(tVar, null, null, new a(this.f196785d, tVar, null), 3), tVar);
            if (Build.VERSION.SDK_INT >= 30) {
                h hVar = h.f196795a;
                ConnectivityManager connectivityManager = this.f196785d.f196789a;
                hVar.getClass();
                connectivityManager.getClass();
                synchronized (h.f196796b) {
                    try {
                        LinkedHashMap linkedHashMap = h.f196797c;
                        boolean zIsEmpty = linkedHashMap.isEmpty();
                        linkedHashMap.put(bVar, networkRequestA);
                        if (zIsEmpty) {
                            u uVarA = u.a();
                            int i15 = l.f196812a;
                            uVarA.getClass();
                            connectivityManager.registerDefaultNetworkCallback(hVar);
                        }
                        u uVarA2 = u.a();
                        int i16 = l.f196812a;
                        uVarA2.getClass();
                        if (h.f196799e) {
                            networkCapabilities = h.f196798d;
                        } else {
                            networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                            h.f196798d = networkCapabilities;
                            h.f196799e = true;
                        }
                        bVar.invoke(networkRequestA.canBeSatisfiedBy(networkCapabilities) ? b.a.f196778a : new b.C3684b(7));
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                kVar = new xr.a(17, bVar, connectivityManager);
            } else {
                c.a aVar2 = c.f196780b;
                ConnectivityManager connectivityManager2 = this.f196785d.f196789a;
                aVar2.getClass();
                connectivityManager2.getClass();
                c cVar = new c(bVar, null);
                p005kotlin.jvm.internal.m0 m0Var = new p005kotlin.jvm.internal.m0();
                try {
                    u uVarA3 = u.a();
                    int i17 = l.f196812a;
                    uVarA3.getClass();
                    connectivityManager2.registerNetworkCallback(networkRequestA, cVar);
                    m0Var.f105804a = true;
                } catch (RuntimeException e4) {
                    if (!d53.u.p(e4.getClass().getName(), PrivacyUpdateRequestError.TOO_MANY_REQUESTS, false)) {
                        throw e4;
                    }
                    u uVarA4 = u.a();
                    int i18 = l.f196812a;
                    uVarA4.getClass();
                    bVar.invoke(new b.C3684b(7));
                }
                kVar = new x72.k(m0Var, 8, connectivityManager2, cVar);
            }
            ya0.l lVar = new ya0.l(kVar, 3);
            this.f196782a = 1;
            if (q53.r.a(tVar, lVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
