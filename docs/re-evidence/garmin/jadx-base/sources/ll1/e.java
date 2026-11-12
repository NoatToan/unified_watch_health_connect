package ll1;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import zd0.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lll1/e;", "Landroidx/lifecycle/u1;", "", "initialDeviceId", "Lbu0/d;", "getLiveActivitySessionInfo", "Lfl1/b;", "checkOnboardingCompleted", "Lzd0/o;", "getStartActivityCapablePairedDevices", "<init>", "(Ljava/lang/Long;Lbu0/d;Lfl1/b;Lzd0/o;)V", "a", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f113380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bu0.d f113381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fl1.b f113382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f113383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f113384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f113385f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lll1/d;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.setup.presentation.init.RecordActivityInitialStateCheckViewModel$uiState$1", f = "RecordActivityInitialStateCheckViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<r53.j<? super d>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return e.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super d> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            e eVar = e.this;
            eVar.getClass();
            ge1.b.T(v1.a(eVar), null, null, new f(eVar, null), 3);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public e(Long l14, bu0.d dVar, fl1.b bVar, o oVar) {
        dVar.getClass();
        bVar.getClass();
        oVar.getClass();
        this.f113380a = l14;
        this.f113381b = dVar;
        this.f113382c = bVar;
        this.f113383d = oVar;
        p2 p2VarA = q2.a(new d(false, false, null, 7, null));
        this.f113384e = p2VarA;
        v vVar = new v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f113385f = s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lll1/e$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-activity-recording_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ e(Long l14, bu0.d dVar, fl1.b bVar, o oVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : l14, dVar, bVar, oVar);
    }
}
