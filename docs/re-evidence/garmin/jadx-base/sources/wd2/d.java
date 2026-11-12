package wd2;

import android.content.Context;
import com.garmin.android.library.livetrack.LivetrackService;
import java.util.Arrays;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lwd2/d;", "Lwd2/m1;", "Lo53/b0;", "Lwd2/g1;", "serviceController", "<init>", "(Lwd2/g1;)V", "a", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d implements m1, o53.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f184416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f184417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o53.m1 f184418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Long f184419d;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.library.livetrack.DefaultLivetrackSettingsIO$open$1", f = "DefaultLivetrackSettingsIO.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e23.l f184420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f184421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f184422c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f184423d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f184424e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e23.l<? super Boolean, Unit> lVar, d dVar, Context context, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f184422c = lVar;
            this.f184423d = dVar;
            this.f184424e = context;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f184422c, this.f184423d, this.f184424e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            e23.l<Boolean, Unit> lVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f184421b;
            d dVar = this.f184423d;
            boolean z14 = true;
            if (i14 == 0) {
                o13.r.b(obj);
                g1 g1Var = dVar.f184416a;
                e23.l<Boolean, Unit> lVar2 = this.f184422c;
                this.f184420a = lVar2;
                this.f184421b = 1;
                obj = g1Var.b(this.f184424e, this);
                if (obj == aVar) {
                    return aVar;
                }
                lVar = lVar2;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                lVar = this.f184420a;
                o13.r.b(obj);
            }
            o13.p pVar = (o13.p) obj;
            if (pVar != null) {
                dVar.f184419d = (Long) pVar.f128594a;
            } else {
                z14 = false;
            }
            lVar.invoke(Boolean.valueOf(z14));
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public d(g1 g1Var) {
        g1Var.getClass();
        this.f184416a = g1Var;
        this.f184417b = i2.a("DefaultLivetrackSettingsIO");
        this.f184418c = g8.i.c();
    }

    @Override // wd2.m1
    public final Object a(boolean z14, v13.i iVar) {
        g1 g1Var = this.f184416a;
        LivetrackService livetrackService = g1Var.f184472d;
        if (livetrackService == null) {
            return null;
        }
        Object objK = livetrackService.k(g1Var.f184469a, z14, iVar);
        return objK == u13.a.COROUTINE_SUSPENDED ? objK : (Boolean) objK;
    }

    @Override // wd2.m1
    public final androidx.lifecycle.w0 b(boolean z14) {
        g1 g1Var = this.f184416a;
        LivetrackService livetrackService = g1Var.f184472d;
        if (livetrackService == null) {
            return null;
        }
        livetrackService.f50164d = g1Var.f184469a;
        ge1.b.T(livetrackService, null, null, new n0(livetrackService, z14, -1L, null), 3);
        return livetrackService.f50169i;
    }

    @Override // wd2.m1
    public final Object c(long j8, ge2.a aVar, t13.d<? super Unit> dVar) {
        Object objJ = this.f184416a.j(j8, aVar, (v13.c) dVar);
        return objJ == u13.a.COROUTINE_SUSPENDED ? objJ : Unit.INSTANCE;
    }

    @Override // wd2.m1
    public final void d(Context context) {
        context.getClass();
        Long l14 = this.f184419d;
        if (l14 == null) {
            this.f184417b.warn("Cannot close, missing bindId. Did you call open?");
        } else {
            this.f184416a.h(context, l14.longValue());
        }
    }

    @Override // wd2.m1
    public final Object e(long j8, t13.d<? super Unit> dVar) {
        Object objE = this.f184416a.e(j8, (v13.c) dVar);
        return objE == u13.a.COROUTINE_SUSPENDED ? objE : Unit.INSTANCE;
    }

    @Override // wd2.m1
    public final void f(long j8, ge2.e eVar) {
        g1 g1Var = this.f184416a;
        LivetrackService livetrackService = g1Var.f184472d;
        if (livetrackService != null) {
            ge1.b.T(livetrackService, null, null, new d1(livetrackService, j8, eVar, g1Var.f184469a, null), 3);
        } else {
            g1Var.f184471c.error("Not initialized");
        }
    }

    @Override // wd2.m1
    public final void g(String str) {
        str.getClass();
        LivetrackService livetrackService = this.f184416a.f184472d;
        if (livetrackService != null) {
            ge1.b.T(livetrackService, null, null, new e1(livetrackService, str, null), 3);
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF195311f() {
        x53.c cVar = o53.s0.f129406a;
        return u53.o.f168762a.plus(this.f184418c);
    }

    @Override // wd2.m1
    public final void h(o13.p<? extends ge2.c, ? extends ge2.b>... pVarArr) {
        o13.p[] pVarArr2 = (o13.p[]) Arrays.copyOf(pVarArr, pVarArr.length);
        LivetrackService livetrackService = this.f184416a.f184472d;
        if (livetrackService != null) {
            ge1.b.T(livetrackService, null, null, new a1(livetrackService, (o13.p[]) Arrays.copyOf(pVarArr2, pVarArr2.length), null), 3);
        }
    }

    @Override // wd2.m1
    public final void i(Context context, e23.l<? super Boolean, Unit> lVar) {
        context.getClass();
        ge1.b.T(this, null, null, new b(lVar, this, context, null), 3);
    }

    @Override // wd2.m1
    public final void j(boolean z14) {
        LivetrackService livetrackService = this.f184416a.f184472d;
        if (livetrackService != null) {
            ge1.b.T(livetrackService, null, null, new f1(livetrackService, z14, null), 3);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwd2/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "livetrack_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
