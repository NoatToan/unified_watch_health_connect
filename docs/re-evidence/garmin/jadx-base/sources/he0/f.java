package he0;

import c80.m0;
import c80.n0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import d53.u;
import d53.w;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zd0.a0;
import zd0.e0;
import zd0.l0;
import zd0.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lhe0/f;", "Lzd0/e0;", "Lzd0/a0;", "isPrimaryDeviceScreenlessUseCase", "Lzd0/s;", "hasScreenlessDeviceRegisteredUseCase", "Lz70/a0;", "promosPreferences", "Lhe0/a;", "dashboardConfigDelegate", "<init>", "(Lzd0/a0;Lzd0/s;Lz70/a0;Lhe0/a;)V", "a", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements e0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f83487s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final m0 f83488t = m0.B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f83489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f83490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final z70.a0 f83491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final he0.a f83492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f83493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f83494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f83495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f83496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f83497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f83498r;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.android.apps.connectmobile.domain.validators.PromosEssentialsValidator", f = "PromosEssentialsValidator.kt", l = {37, 38, 39}, m = "setup", v = 2)
    public static final class b extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f83499a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f83500b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f83502d;

        public b(t13.d<? super b> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f83500b = obj;
            this.f83502d |= Integer.MIN_VALUE;
            return f.this.c(this);
        }
    }

    public f(a0 a0Var, s sVar, z70.a0 a0Var2, he0.a aVar) {
        a0Var.getClass();
        sVar.getClass();
        a0Var2.getClass();
        aVar.getClass();
        this.f83489i = a0Var;
        this.f83490j = sVar;
        this.f83491k = a0Var2;
        this.f83492l = aVar;
    }

    @Override // zd0.e0
    public final m0 a() {
        return f83488t;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) throws Throwable {
        b bVar;
        f fVar;
        f fVar2;
        f fVar3;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i14 = bVar.f83502d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f83502d = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objA = bVar.f83500b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f83502d;
        if (i15 == 0) {
            r.b(objA);
            bVar.f83499a = this;
            bVar.f83502d = 1;
            objA = this.f83489i.a(bVar);
            if (objA != aVar) {
                fVar = this;
            }
            return aVar;
        }
        if (i15 == 1) {
            fVar = bVar.f83499a;
            r.b(objA);
        } else {
            if (i15 == 2) {
                fVar2 = bVar.f83499a;
                r.b(objA);
                fVar2.f83497q = ((Boolean) objA).booleanValue();
                r53.i<Boolean> iVarA = this.f83492l.a();
                bVar.f83499a = this;
                bVar.f83502d = 3;
                objA = r53.s.x(iVarA, bVar);
                if (objA != aVar) {
                    fVar3 = this;
                }
                return aVar;
            }
            if (i15 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fVar3 = bVar.f83499a;
            r.b(objA);
        }
        fVar3.f83498r = ((Boolean) objA).booleanValue();
        return Unit.INSTANCE;
        fVar.f83496p = ((Boolean) objA).booleanValue();
        bVar.f83499a = this;
        bVar.f83502d = 2;
        objA = this.f83490j.a(bVar);
        if (objA != aVar) {
            fVar2 = this;
            fVar2.f83497q = ((Boolean) objA).booleanValue();
            r53.i<Boolean> iVarA2 = this.f83492l.a();
            bVar.f83499a = this;
            bVar.f83502d = 3;
            objA = r53.s.x(iVarA2, bVar);
            if (objA != aVar) {
                fVar3 = this;
                fVar3.f83498r = ((Boolean) objA).booleanValue();
                return Unit.INSTANCE;
            }
        }
        return aVar;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        Boolean bool = n0Var.f25499x;
        if (this.f83491k.h()) {
            a2 a2Var = a2.PROMOTIONS;
            i2.f36769a.getClass();
            i2.a.k(a2Var, "PromosValidator", "User has already tried this feature, hiding promo forever");
            return l0.HIDE;
        }
        f12.l.f68084a.getClass();
        String strH4 = f12.l.a.a().h4();
        boolean z14 = true;
        boolean z15 = strH4 == null || w.J(strH4);
        boolean z16 = !z15;
        boolean z17 = strH4 != null && u.p(strH4, "_ESSENTIALS", false);
        if (!z15 && !z17 && !this.f83498r) {
            z14 = false;
        }
        boolean z18 = this.f83496p;
        this.f83493m = z18;
        boolean z19 = this.f83497q;
        this.f83494n = z19;
        this.f83495o = z17;
        a2 a2Var2 = a2.PROMOTIONS;
        StringBuilder sb3 = new StringBuilder("conditionsProvider.isPrimaryWearable=");
        sb3.append(bool);
        sb3.append(", isPrimaryWearable=");
        sb3.append(z18);
        sb3.append(", hasDeviceRegistered=");
        kg.f.q(", isFocusKnown=", ", currentFocusIsAlreadyUsed=", sb3, z19, z16);
        sb3.append(z17);
        sb3.append(", currentFocus=");
        sb3.append(strH4);
        String string = sb3.toString();
        i2.f36769a.getClass();
        i2.a.k(a2Var2, "PromosValidator", string);
        bv.b.f21239a.getClass();
        bv.b.a();
        if (!k1.f37122a.I0()) {
            i2.a.k(a2Var2, "PromosValidator", "Feature not available, hiding promo");
            return l0.HIDE;
        }
        if (z14) {
            i2.a.k(a2Var2, "PromosValidator", "Hide due to focus");
            return l0.HIDE;
        }
        if (this.f83496p && p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
            i2.a.k(a2Var2, "PromosValidator", "Primary wearable, showing banner");
            return l0.SHOW;
        }
        if (this.f83497q && p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE) && !this.f83496p) {
            i2.a.k(a2Var2, "PromosValidator", "Has registered device, showing whats new card");
            return l0.SHOW;
        }
        i2.a.k(a2Var2, "PromosValidator", "Hide promo");
        return l0.HIDE;
    }

    @Override // zd0.e0
    public final String e() {
        boolean z14 = this.f83493m;
        boolean z15 = this.f83494n;
        boolean z16 = this.f83495o;
        StringBuilder sbM = com.airbnb.lottie.animation.keyframe.a.m("isPrimaryWearable: ", ", hasDeviceRegistered: ", ", currentFocusIs: ", z14, z15);
        sbM.append(z16);
        return sbM.toString();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lhe0/f$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ESSENTIAL_SUFFIX", "gcm-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
