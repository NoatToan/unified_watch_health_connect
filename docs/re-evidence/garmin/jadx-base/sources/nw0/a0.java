package nw0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lnw0/a0;", "Landroidx/lifecycle/u1;", "Ltv0/c;", "getLifestyleLoggingReminders", "Ltv0/s;", "saveLifestyleLoggingReminders", "Lfw0/a;", "defaultRemindersProvider", "<init>", "(Ltv0/c;Ltv0/s;Lfw0/a;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a0 extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv0.c f127985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv0.s f127986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f127987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b2 f127988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public rd1.a f127989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f127990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f127991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b2 f127992h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lnw0/g0;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.settings.LifestyleLoggingRemindersViewModel$remindersUiState$1", f = "LifestyleLoggingRemindersViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super g0>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return a0.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super g0> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            a0 a0Var = a0.this;
            a0Var.getClass();
            w9.a aVarA = v1.a(a0Var);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new b0(a0Var, null), 2);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public a0(tv0.c cVar, tv0.s sVar, fw0.a aVar) {
        cVar.getClass();
        sVar.getClass();
        aVar.getClass();
        this.f127985a = cVar;
        this.f127986b = sVar;
        p2 p2VarA = q2.a(new g0(null, null, 3, null));
        this.f127987c = p2VarA;
        r53.v vVar = new r53.v(new b(null), p2VarA);
        w9.a aVarA = v1.a(this);
        k2.f150703a.getClass();
        this.f127988d = r53.s.K(vVar, aVarA, k2.a.f150706c, p2VarA.getValue());
        p2 p2VarA2 = q2.a(new rd1.a(aVar.b(), aVar.a(), pd1.a.LIFESTYLE_LOGGING, Integer.valueOf(aVar.f73777a.getUserProfilePk())));
        this.f127991g = p2VarA2;
        this.f127992h = r53.s.d(p2VarA2);
    }

    public static final void x4(a0 a0Var) {
        Object value;
        p2 p2Var = a0Var.f127987c;
        do {
            value = p2Var.getValue();
        } while (!p2Var.b(value, g0.a((g0) value, f0.a.f128022a, null, 2)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lnw0/a0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
