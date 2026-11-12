package ew0;

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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lew0/m;", "Landroidx/lifecycle/u1;", "Ltv0/a;", "addCustomBehaviour", "Ltv0/w;", "toggleBehaviourSelection", "Ltv0/i;", "saveBehaviourChanges", "Ltv0/s;", "saveReminders", "Ltv0/b;", "getAutoLoggableBehaviors", "Lqv0/a;", "preferences", "Lrv0/a;", "repository", "Lfw0/a;", "defaultRemindersProvider", "<init>", "(Ltv0/a;Ltv0/w;Ltv0/i;Ltv0/s;Ltv0/b;Lqv0/a;Lrv0/a;Lfw0/a;)V", "a", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends u1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f66233v = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tv0.a f66234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tv0.w f66235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tv0.i f66236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tv0.s f66237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final tv0.b f66238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qv0.a f66239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rv0.a f66240g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p2 f66241h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b2 f66242i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p2 f66243j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b2 f66244k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p2 f66245l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b2 f66246m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2 f66247n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final b2 f66248o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f66249p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b2 f66250q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f66251r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final b2 f66252t;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lew0/l;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.logging.presentation.onboarding.LifestyleLoggingOnboardingViewModel$onboardingInitUiState$1", f = "LifestyleLoggingOnboardingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<r53.j<? super l>, t13.d<? super Unit>, Object> {
        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return m.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super l> jVar, t13.d<? super Unit> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            m mVar = m.this;
            mVar.getClass();
            w9.a aVarA = v1.a(mVar);
            x53.c cVar = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new n(mVar, null), 2);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public m(tv0.a aVar, tv0.w wVar, tv0.i iVar, tv0.s sVar, tv0.b bVar, qv0.a aVar2, rv0.a aVar3, fw0.a aVar4) {
        aVar.getClass();
        wVar.getClass();
        iVar.getClass();
        sVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        this.f66234a = aVar;
        this.f66235b = wVar;
        this.f66236c = iVar;
        this.f66237d = sVar;
        this.f66238e = bVar;
        this.f66239f = aVar2;
        this.f66240g = aVar3;
        p2 p2VarA = q2.a(new l(true, false, false, 6, null));
        this.f66241h = p2VarA;
        this.f66242i = r53.s.K(new r53.v(new b(null), p2VarA), v1.a(this), k2.a.a(k2.f150703a, 2), p2VarA.getValue());
        p2 p2VarA2 = q2.a(j53.l.b());
        this.f66243j = p2VarA2;
        this.f66244k = r53.s.d(p2VarA2);
        p2 p2VarA3 = q2.a(new rd1.a(aVar4.b(), aVar4.a(), pd1.a.LIFESTYLE_LOGGING, Integer.valueOf(aVar4.f73777a.getUserProfilePk())));
        this.f66245l = p2VarA3;
        this.f66246m = r53.s.d(p2VarA3);
        p2 p2VarA4 = q2.a(new q(false, false, false, 7, null));
        this.f66247n = p2VarA4;
        this.f66248o = r53.s.d(p2VarA4);
        p2 p2VarA5 = q2.a(new d0(false, false, 3, null));
        this.f66249p = p2VarA5;
        this.f66250q = r53.s.d(p2VarA5);
        p2 p2VarA6 = q2.a(j53.l.b());
        this.f66251r = p2VarA6;
        this.f66252t = r53.s.d(p2VarA6);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lew0/m$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
