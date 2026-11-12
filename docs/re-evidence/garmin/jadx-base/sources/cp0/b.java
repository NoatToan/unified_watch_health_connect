package cp0;

import android.util.Log;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.dashboard.data.datasource.o;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import java.util.concurrent.locks.ReentrantLock;
import lc.u0;
import o13.r;
import o53.b0;
import o53.c0;
import o53.c2;
import o53.m1;
import o53.s0;
import o72.t;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import t13.g;
import u53.d;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcp0/b;", "Lgn/b;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/o;", "activityTrendsPreferenceDataSource", "<init>", "(Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/o;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements gn.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f54887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReentrantLock f54888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c2 f54889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f54890d;

    /* JADX INFO: renamed from: cp0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.home.domain.DismissActivityTrendPromptUseCaseImpl$dismissPrompts$1$1", f = "DismissActivityTrendPromptUseCaseImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class C1195b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f54891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f54892b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o70.c f54894d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1195b(o70.c cVar, t13.d<? super C1195b> dVar) {
            super(2, dVar);
            this.f54894d = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C1195b c1195b = b.this.new C1195b(this.f54894d, dVar);
            c1195b.f54892b = obj;
            return c1195b;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1195b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            b0 b0Var = (b0) this.f54892b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f54891a;
            o70.c cVar = this.f54894d;
            if (i14 == 0) {
                r.b(obj);
                o oVar = b.this.f54887a;
                this.f54892b = b0Var;
                this.f54891a = 1;
                obj = oVar.b(cVar, true, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                t.k(Log.e("DismissActivityTrendPromptUseCase", "Failed to save dismissed type: " + cVar));
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                i2.f36769a.getClass();
                i2.a.b(a2.DASHBOARD, "DismissActivityTrendPromptUseCase", "Successfully saved dismissed type " + cVar);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public b(o oVar) {
        oVar.getClass();
        this.f54887a = oVar;
        this.f54888b = new ReentrantLock();
        m1 m1VarC = g8.i.c();
        x53.c cVar = s0.f129406a;
        this.f54890d = c0.a(g.a.C3052a.d(x53.b.f189152a, m1VarC));
    }

    @Override // gn.b
    public final void a(o70.c cVar) {
        cVar.getClass();
        ReentrantLock reentrantLock = this.f54888b;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f54889c;
            if (c2Var == null || !c2Var.isActive()) {
                this.f54889c = ge1.b.T(this.f54890d, null, null, new C1195b(cVar, null), 3);
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcp0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
