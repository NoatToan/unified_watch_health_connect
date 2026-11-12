package wa0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.devices.model.m;
import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import lc.u0;
import o13.r;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import pc0.j;
import pc0.n0;
import q6.f;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\f\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lwa0/c;", "Landroidx/lifecycle/u1;", "", "deviceId", "Lm90/a;", "inReachSubscriptionDelegate", "Lpc0/n0;", "inReachSubscriptionPreferences", "Lpc0/j;", "devicesRepository", "<init>", "(JLm90/a;Lpc0/n0;Lpc0/j;)V", "b", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f183763g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f183764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m90.a f183765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f183766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f183767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f183768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b2 f183769f;

    /* JADX INFO: renamed from: wa0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lwa0/c$b;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.InReachSubscriptionViewModel$uiState$1", f = "InReachSubscriptionViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C3406c extends i implements p<r53.j<? super b>, t13.d<? super Unit>, Object> {
        public C3406c(t13.d<? super C3406c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C3406c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super b> jVar, t13.d<? super Unit> dVar) {
            return ((C3406c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = c.f183763g;
            c cVar = c.this;
            cVar.getClass();
            w9.a aVarA = v1.a(cVar);
            x53.c cVar2 = s0.f129406a;
            ge1.b.T(aVarA, x53.b.f189152a, null, new e(cVar, null), 2);
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public c(long j8, m90.a aVar, n0 n0Var, j jVar) {
        aVar.getClass();
        n0Var.getClass();
        jVar.getClass();
        this.f183764a = j8;
        this.f183765b = aVar;
        this.f183766c = n0Var;
        this.f183767d = jVar;
        int i14 = 14;
        p005kotlin.jvm.internal.j jVar2 = null;
        boolean z14 = true;
        boolean z15 = false;
        Boolean bool = null;
        int i15 = 0;
        p2 p2VarA = q2.a(new b(z14, z15, bool, i15, i14, jVar2));
        this.f183768e = p2VarA;
        this.f183769f = s.K(new v(new C3406c(null), s.d(p2VarA)), v1.a(this), k2.a.a(k2.f150703a, 2), new b(z14, z15, bool, i15, i14, jVar2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object x4(c cVar, long j8, v13.c cVar2) {
        d dVar;
        cVar.getClass();
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i14 = dVar.f183777c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f183777c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar, cVar2);
            }
        } else {
            dVar = new d(cVar, cVar2);
        }
        Object objG = dVar.f183775a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f183777c;
        if (i15 == 0) {
            r.b(objG);
            j jVar = cVar.f183767d;
            String strValueOf = String.valueOf(j8);
            dVar.f183777c = 1;
            objG = jVar.g(strValueOf, dVar);
            if (objG == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objG);
        }
        v2 v2Var = (v2) objG;
        boolean zBooleanValue = false;
        if (v2Var instanceof v2.b) {
            Boolean inReachServicesCapable = ((m) ((v2.b) v2Var).f47386a).getInReachServicesCapable();
            if (inReachServicesCapable != null) {
                zBooleanValue = inReachServicesCapable.booleanValue();
            }
        } else if (!(v2Var instanceof v2.a)) {
            u0.r();
            return null;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwa0/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lwa0/c$b;", "", "", "isLoading", "skipInReachSubscription", "isEligibleForFreeTrial", "", "freeTrialDuration", "<init>", "(ZZLjava/lang/Boolean;I)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f183770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f183771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Boolean f183772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f183773d;

        public /* synthetic */ b(boolean z14, boolean z15, Boolean bool, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? true : z14, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? null : bool, (i15 & 8) != 0 ? 0 : i14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f183770a == bVar.f183770a && this.f183771b == bVar.f183771b && p005kotlin.jvm.internal.s.g(this.f183772c, bVar.f183772c) && this.f183773d == bVar.f183773d;
        }

        public final int hashCode() {
            int iG = f.g(Boolean.hashCode(this.f183770a) * 31, 31, this.f183771b);
            Boolean bool = this.f183772c;
            return Integer.hashCode(this.f183773d) + ((iG + (bool == null ? 0 : bool.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("UiState(isLoading=", ", skipInReachSubscription=", ", isEligibleForFreeTrial=", this.f183770a, this.f183771b);
            sbM.append(this.f183772c);
            sbM.append(", freeTrialDuration=");
            sbM.append(this.f183773d);
            sbM.append(")");
            return sbM.toString();
        }

        public b(boolean z14, boolean z15, Boolean bool, int i14) {
            this.f183770a = z14;
            this.f183771b = z15;
            this.f183772c = bool;
            this.f183773d = i14;
        }

        public b() {
            this(false, false, null, 0, 15, null);
        }
    }
}
