package oo;

import am.x0;
import am.z0;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import d53.u;
import e23.p;
import java.util.Iterator;
import lc.u0;
import o13.r;
import o53.b0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p92.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Loo/k;", "Landroidx/lifecycle/u1;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mj1.b f133103a = mj1.b.a.a(mj1.b.f119081b);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nj1.b f133104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<am.l> f133105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f133106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d80.f<com.garmin.android.apps.connectmobile.activities.newmodel.h> f133107e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.manual.viewmodel.CreateManualActivityViewModel$updatePrivacySettings$1", f = "CreateManualActivityViewModel.kt", l = {78}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f133108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x0 f133109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public am.l f133110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public b0 f133111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f133112e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f133113f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ am.l f133115h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ x0 f133116i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(am.l lVar, x0 x0Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f133115h = lVar;
            this.f133116i = x0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = k.this.new b(this.f133115h, this.f133116i, dVar);
            bVar.f133113f = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            k kVar;
            x0 x0Var;
            am.l lVar;
            Object next;
            String privacySubcategoryType;
            x0 x0VarH;
            b0 b0Var = (b0) this.f133113f;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133112e;
            if (i14 == 0) {
                r.b(obj);
                kVar = k.this;
                nj1.b bVar = kVar.f133104b;
                x0 x0Var2 = this.f133116i;
                am.l lVar2 = this.f133115h;
                if (bVar != null) {
                    Iterator<T> it = bVar.d().iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        privacySubcategoryType = ((nj1.d) next).getPrivacySubcategoryType();
                        x0VarH = z0.h(x0Var2);
                        if (u.q(privacySubcategoryType, x0Var2.f4358a, true)) {
                            break;
                        }
                    } while (!u.q(privacySubcategoryType, x0VarH.f4358a, true));
                    nj1.d dVar = (nj1.d) next;
                    nj1.c subcategoryDetails = dVar != null ? dVar.getSubcategoryDetails() : null;
                    am.l.a aVar2 = am.l.f4047c;
                    String accessRule = subcategoryDetails != null ? subcategoryDetails.getAccessRule() : null;
                    aVar2.getClass();
                    kVar.f133105c.j(am.l.a.a(accessRule, lVar2));
                } else {
                    mj1.b bVar2 = kVar.f133103a;
                    this.f133113f = null;
                    this.f133108a = kVar;
                    this.f133109b = x0Var2;
                    this.f133110c = lVar2;
                    this.f133111d = b0Var;
                    this.f133112e = 1;
                    bVar2.getClass();
                    obj = f0.J(bVar2, new mj1.c(bVar2, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    x0Var = x0Var2;
                    lVar = lVar2;
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lVar = this.f133110c;
            x0Var = this.f133109b;
            kVar = this.f133108a;
            r.b(obj);
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                kVar.f133104b = ((nj1.e) ((v2.b) v2Var).f47386a).getActivityPrivacySettings();
                kVar.x4(x0Var, lVar);
            } else {
                if (!(v2Var instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                y.f136664a.getClass();
                y.a.c("CreateManualActivityViewModel", "Error fetching privacy from server");
                kVar.f133105c.j(lVar);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public k() {
        y0<am.l> y0Var = new y0<>();
        this.f133105c = y0Var;
        this.f133106d = y0Var;
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        d80.f<com.garmin.android.apps.connectmobile.activities.newmodel.h> fVar = this.f133107e;
        if (fVar == null || fVar.c()) {
            return;
        }
        fVar.f58259c = null;
    }

    public final void x4(x0 x0Var, am.l lVar) {
        x0Var.getClass();
        lVar.getClass();
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new b(lVar, x0Var, null), 2);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Loo/k$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
