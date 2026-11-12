package z10;

import android.content.Context;
import java.util.Locale;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lz10/i3;", "Landroidx/lifecycle/u1;", "Le20/a;", "consentRepo", "<init>", "(Le20/a;)V", "a", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i3 extends androidx.lifecycle.u1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f201047d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e20.a f201048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.y0<m0> f201049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.a<Unit> f201050c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.UploadConsentEnforceViewModel$checkConsent$1", f = "UploadConsentEnforceViewModel.kt", l = {146, 156}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f201051a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f201052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f201053c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f201054d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f201055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i3 f201056f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z14, i3 i3Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f201055e = z14;
            this.f201056f = i3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f201055e, this.f201056f, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a4, code lost:
        
            if (r12 == r0) goto L38;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v3, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            boolean zQ;
            ?? r14;
            int i14;
            ?? r15;
            boolean zBooleanValue;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i15 = this.f201054d;
            boolean z14 = this.f201055e;
            i3 i3Var = this.f201056f;
            if (i15 != 0) {
                if (i15 == 1) {
                    int i16 = this.f201053c;
                    i14 = this.f201052b;
                    zQ = this.f201051a;
                    o13.r.b(obj);
                    r15 = i16;
                } else {
                    if (i15 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                Boolean bool = (Boolean) obj;
                if (bool == null) {
                    i3Var.f201049b.m(m0.CONSENT_CHECK_ERROR);
                } else if (bool.booleanValue()) {
                    i3Var.f201049b.m(m0.CONSENT_ALREADY_GRANTED);
                    e23.a<Unit> aVar2 = i3Var.f201050c;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                } else {
                    i3Var.f201049b.m(m0.DEVICE_UPLOAD_CONSENT_REQUIRED);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            zQ = d53.u.q(Locale.CHINA.getCountry(), c22.b0.b(null), true);
            p92.o oVar = p92.o.f136619a;
            q92.x xVar = q92.x.DI_CONNECT_UPLOAD;
            oVar.getClass();
            q92.v vVarN = p92.o.n(xVar);
            int i17 = (!z14 || vVarN == null || q92.c.c(vVarN)) ? 0 : 1;
            Boolean boolH = p92.o.m().h();
            if (boolH != null) {
                zBooleanValue = boolH.booleanValue();
            } else {
                r14 = 1;
            }
            if (i17 == 0 && (zQ || r14 == 0)) {
                i3Var.f201049b.m(m0.CONSENT_IN_PROGRESS);
                this.f201051a = zQ;
                this.f201052b = i17;
                this.f201053c = r14;
                this.f201054d = 1;
                obj = oVar.c(xVar, this);
                if (obj != aVar) {
                    i14 = i17;
                    r15 = r14;
                }
                return aVar;
            }
            r14 = zBooleanValue;
            i3Var.f201049b.m(m0.CONSENT_ALREADY_GRANTED);
            e23.a<Unit> aVar3 = i3Var.f201050c;
            if (aVar3 != null) {
                aVar3.invoke();
            }
            return Unit.INSTANCE;
            q92.v vVar = (q92.v) obj;
            if (vVar == null) {
                i3Var.f201049b.m(m0.CONSENT_CHECK_ERROR);
            } else if (q92.c.c(vVar)) {
                i3Var.f201049b.m(m0.UPLOAD_CONSENT_REQUIRED);
            } else if (z14 || r15 != 0) {
                i3Var.f201049b.m(m0.CONSENT_ALREADY_GRANTED);
                e23.a<Unit> aVar4 = i3Var.f201050c;
                if (aVar4 != null) {
                    aVar4.invoke();
                }
            } else {
                i3Var.f201049b.m(m0.DEVICE_UPLOAD_CONSENT_IN_PROGRESS);
                p92.o oVar2 = p92.o.f136619a;
                this.f201051a = zQ;
                this.f201052b = i14;
                this.f201053c = r15;
                this.f201054d = 2;
                obj = oVar2.i(this);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public i3(e20.a aVar) {
        aVar.getClass();
        this.f201048a = aVar;
        this.f201049b = new androidx.lifecycle.y0<>();
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        this.f201050c = null;
    }

    public final void x4(Context context, boolean z14, e23.a aVar) {
        if (context != null && d1.f()) {
            d1.o(context, new xk1.v(12));
        } else {
            this.f201050c = aVar;
            ge1.b.T(androidx.lifecycle.v1.a(this), null, null, new b(z14, this, null), 3);
        }
    }

    public final void y4(m0 m0Var) {
        m0Var.getClass();
        this.f201049b.m(m0Var);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lz10/i3$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
