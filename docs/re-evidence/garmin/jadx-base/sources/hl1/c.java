package hl1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.l0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lhl1/c;", "Landroidx/lifecycle/u1;", "", "deviceId", "Lfl1/f;", "getDeviceWheelchairAvailability", "Ly51/a;", "pendingActivitiesRepo", "Lcl1/a;", "preferences", "Lfl1/m;", "isGpsActivity", "Lfl1/n;", "shouldShowPreciseLocation", "Lfl1/k;", "getWorkoutSupportedActivityTypes", "Lws/a;", "activityRecordingDelegate", "<init>", "(JLfl1/f;Ly51/a;Lcl1/a;Lfl1/m;Lfl1/n;Lfl1/k;Lws/a;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f84363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl1.f f84364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y51.a f84365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final cl1.a f84366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fl1.m f84367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final fl1.n f84368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fl1.k f84369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ws.a f84370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p2 f84371i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b2 f84372j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Set<String> f84373k;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lhl1/b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.activities.AllActivitiesViewModel$uiState$1", f = "AllActivitiesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super hl1.b>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super hl1.b> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            c cVar = c.this;
            p2 p2Var = cVar.f84371i;
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, hl1.b.a((hl1.b) value, true, null, null, null, false, false, 62)));
            ge1.b.T(v1.a(cVar), null, null, new e(cVar, null), 3);
            ge1.b.T(v1.a(cVar), null, null, new d(cVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public c(long j8, fl1.f fVar, y51.a aVar, cl1.a aVar2, fl1.m mVar, fl1.n nVar, fl1.k kVar, ws.a aVar3) {
        fVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        mVar.getClass();
        nVar.getClass();
        kVar.getClass();
        aVar3.getClass();
        this.f84363a = j8;
        this.f84364b = fVar;
        this.f84365c = aVar;
        this.f84366d = aVar2;
        this.f84367e = mVar;
        this.f84368f = nVar;
        this.f84369g = kVar;
        this.f84370h = aVar3;
        p2 p2VarA = q2.a(new hl1.b(false, null, null, null, false, false, 63, null));
        this.f84371i = p2VarA;
        r53.v vVar = new r53.v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f84372j = r53.s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
        this.f84373k = l0.f134950a;
    }

    public final void x4(zf2.d dVar) {
        Object value;
        p2 p2Var = this.f84371i;
        if (dVar == null) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, hl1.b.a((hl1.b) value, false, null, null, null, false, false, 39)));
            return;
        }
        boolean zA = this.f84368f.a(this.f84373k, dVar);
        while (true) {
            Object value2 = p2Var.getValue();
            zf2.d dVar2 = dVar;
            if (p2Var.b(value2, hl1.b.a((hl1.b) value2, false, null, null, dVar2, zA, false, 39))) {
                return;
            } else {
                dVar = dVar2;
            }
        }
    }

    public final void y4() {
        p2 p2Var;
        Object value;
        this.f84366d.a();
        do {
            p2Var = this.f84371i;
            value = p2Var.getValue();
        } while (!p2Var.b(value, hl1.b.a((hl1.b) value, false, null, null, null, false, false, 47)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhl1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
