package aw1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.b2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$quitActiveTrainingPlan$1", f = "FBTPlanWizardViewModel.kt", l = {4725, 4726}, m = "invokeSuspend", v = 2)
public final class m0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public st1.c f13487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f13489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f13490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Long f13491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f13492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg0.k f13493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e23.l<Boolean, Unit> f13494h;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "Lrt1/j;", "it", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.training.fbtap.wizardflow.FBTPlanWizardViewModel$quitActiveTrainingPlan$1$1", f = "FBTPlanWizardViewModel.kt", l = {4736, 4743}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<g3<? extends rt1.j>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f13495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public o53.b0 f13496b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13497c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e23.l f13498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public fg0.k f13499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f13501g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13502h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f13503i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ h f13504j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ o53.b0 f13505k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Long f13506l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ fg0.k f13507m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ e23.l<Boolean, Unit> f13508n;

        /* JADX INFO: renamed from: aw1.m0$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C0189a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f13509a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f13509a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(h hVar, o53.b0 b0Var, Long l14, fg0.k kVar, e23.l<? super Boolean, Unit> lVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f13504j = hVar;
            this.f13505k = b0Var;
            this.f13506l = l14;
            this.f13507m = kVar;
            this.f13508n = lVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f13504j, this.f13505k, this.f13506l, this.f13507m, this.f13508n, dVar);
            aVar.f13503i = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(g3<? extends rt1.j> g3Var, t13.d<? super Unit> dVar) {
            return ((a) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x0195  */
        /* JADX WARN: Code duplicated, block: B:43:0x019c  */
        /* JADX WARN: Code duplicated, block: B:45:0x01a0  */
        /* JADX WARN: Code duplicated, block: B:46:0x01d0  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            fg0.k kVar;
            Object objB;
            int i14;
            o53.b0 b0Var;
            fg0.k kVar2;
            fg0.k kVar3;
            e23.l<Boolean, Unit> lVar;
            h hVar;
            int i15;
            Object objB2;
            h hVar2;
            v2 v2Var;
            g3 g3Var = (g3) this.f13503i;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f13502h;
            if (i16 != 0) {
                if (i16 == 1) {
                    int i17 = this.f13501g;
                    int i18 = this.f13500f;
                    fg0.k kVar4 = this.f13499e;
                    e23.l<Boolean, Unit> lVar2 = this.f13498d;
                    fg0.k kVar5 = (fg0.k) this.f13497c;
                    o53.b0 b0Var2 = this.f13496b;
                    hVar = this.f13495a;
                    o13.r.b(obj);
                    b0Var = b0Var2;
                    kVar2 = kVar5;
                    kVar3 = kVar4;
                    i15 = i17;
                    lVar = lVar2;
                    i14 = i18;
                    objB = obj;
                } else {
                    if (i16 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lVar = (e23.l) this.f13497c;
                    hVar2 = this.f13495a;
                    o13.r.b(obj);
                    objB2 = obj;
                }
                v2Var = (v2) objB2;
                if (v2Var instanceof v2.b) {
                    lVar.invoke(Boolean.TRUE);
                } else {
                    if (v2Var instanceof v2.a) {
                        u0.r();
                        return null;
                    }
                    v2.a aVar2 = (v2.a) v2Var;
                    String strD = com.airbnb.lottie.animation.keyframe.a.d(aVar2.f47383a, "Error resetting active plan linked event ");
                    i2.a aVar3 = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar3.getClass();
                    i2.a.f(a2Var, "FBTPlanWizardViewModel", strD);
                    int i19 = h.S1;
                    hVar2.r6().j(g3.a.a(g3.f35298f, aVar2.f47385c, null, null, null, 14));
                    lVar.invoke(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            if (g3Var != null) {
                int i24 = C0189a.f13509a[g3Var.f35300a.ordinal()];
                h hVar3 = this.f13504j;
                if (i24 == 1) {
                    int i25 = h.S1;
                    hVar3.r6().j(g3.a.c(g3.f35298f));
                } else if (i24 == 2) {
                    dw1.a aVarH5 = hVar3.H5();
                    o13.t tVar = hVar3.C1;
                    aVarH5.f61439e = Boolean.TRUE;
                    jv1.s sVarI6 = hVar3.i6();
                    if (sVarI6 != null && (kVar = sVarI6.f101124c) != null) {
                        cg0.a aVar4 = (cg0.a) tVar.getValue();
                        dg0.a aVar5 = dg0.a.PRIMARY_EVENT;
                        aVar4.getClass();
                        fg0.k kVarA = cg0.a.a(kVar, aVar5, false);
                        cg0.a aVar6 = (cg0.a) tVar.getValue();
                        this.f13503i = null;
                        this.f13495a = hVar3;
                        o53.b0 b0Var3 = this.f13505k;
                        this.f13496b = b0Var3;
                        fg0.k kVar6 = this.f13507m;
                        this.f13497c = kVar6;
                        e23.l<Boolean, Unit> lVar3 = this.f13508n;
                        this.f13498d = lVar3;
                        this.f13499e = kVar;
                        this.f13500f = 0;
                        this.f13501g = 0;
                        this.f13502h = 1;
                        objB = aVar6.b(kVarA, this);
                        if (objB != aVar) {
                            i14 = 0;
                            b0Var = b0Var3;
                            kVar2 = kVar6;
                            kVar3 = kVar;
                            lVar = lVar3;
                            hVar = hVar3;
                            i15 = 0;
                        }
                        return aVar;
                    }
                } else {
                    if (i24 != 3) {
                        u0.r();
                        return null;
                    }
                    int i26 = h.S1;
                    hVar3.r6().j(g3.a.a(g3.f35298f, null, g3Var.f35303d, null, null, 13));
                    String str = "Error quitting the current active plan , plan id: " + this.f13506l;
                    i2.a aVar7 = i2.f36769a;
                    a2 a2Var2 = a2.GENERAL;
                    aVar7.getClass();
                    i2.a.f(a2Var2, "FBTPlanWizardViewModel", str);
                }
            }
            return Unit.INSTANCE;
            v2 v2Var2 = (v2) objB;
            if (v2Var2 instanceof v2.b) {
                cg0.a aVar8 = (cg0.a) hVar.C1.getValue();
                dg0.a aVar9 = dg0.a.PRIMARY_EVENT;
                aVar8.getClass();
                fg0.k kVarA2 = cg0.a.a(kVar3, aVar9, false);
                jv1.s sVarI7 = hVar.i6();
                hVar.k8(sVarI7 != null ? jv1.s.a(sVarI7, null, null, kVarA2, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -5, 511) : null);
                if (kVar2 != null) {
                    cg0.a aVar10 = (cg0.a) hVar.C1.getValue();
                    dg0.a aVar11 = dg0.a.SUPPORTING_EVENT;
                    this.f13503i = null;
                    this.f13495a = hVar;
                    this.f13496b = b0Var;
                    this.f13497c = lVar;
                    this.f13498d = null;
                    this.f13499e = null;
                    this.f13500f = i14;
                    this.f13501g = i15;
                    this.f13502h = 2;
                    aVar10.getClass();
                    objB2 = aVar10.b(cg0.a.a(kVar2, aVar11, true), this);
                    if (objB2 != aVar) {
                        hVar2 = hVar;
                        v2Var = (v2) objB2;
                        if (v2Var instanceof v2.b) {
                            lVar.invoke(Boolean.TRUE);
                        } else {
                            if (v2Var instanceof v2.a) {
                                u0.r();
                                return null;
                            }
                            v2.a aVar12 = (v2.a) v2Var;
                            String strD2 = com.airbnb.lottie.animation.keyframe.a.d(aVar12.f47383a, "Error resetting active plan linked event ");
                            i2.a aVar13 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar13.getClass();
                            i2.a.f(a2Var3, "FBTPlanWizardViewModel", strD2);
                            int i110 = h.S1;
                            hVar2.r6().j(g3.a.a(g3.f35298f, aVar12.f47385c, null, null, null, 14));
                            lVar.invoke(Boolean.FALSE);
                        }
                    }
                    return aVar;
                }
                lVar.invoke(Boolean.TRUE);
            } else {
                if (!(v2Var2 instanceof v2.a)) {
                    u0.r();
                    return null;
                }
                v2.a aVar14 = (v2.a) v2Var2;
                String strD3 = com.airbnb.lottie.animation.keyframe.a.d(aVar14.f47383a, "Error updating event priority ");
                i2.a aVar15 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar15.getClass();
                i2.a.f(a2Var4, "FBTPlanWizardViewModel", strD3);
                int i27 = h.S1;
                hVar.r6().j(g3.a.a(g3.f35298f, aVar14.f47385c, null, null, null, 14));
                lVar.invoke(Boolean.FALSE);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m0(h hVar, Long l14, boolean z14, fg0.k kVar, e23.l<? super Boolean, Unit> lVar, t13.d<? super m0> dVar) {
        super(2, dVar);
        this.f13490d = hVar;
        this.f13491e = l14;
        this.f13492f = z14;
        this.f13493g = kVar;
        this.f13494h = lVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        m0 m0Var = new m0(this.f13490d, this.f13491e, this.f13492f, this.f13493g, this.f13494h, dVar);
        m0Var.f13489c = obj;
        return m0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((m0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0066, code lost:
    
        if (r53.s.k(r0, r1, r10) == r8) goto L15;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        st1.c cVar;
        o53.b0 b0Var = (o53.b0) this.f13489c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f13488b;
        if (i14 != 0) {
            if (i14 == 1) {
                cVar = this.f13487a;
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        uw1.b bVar = new uw1.b();
        h hVar = this.f13490d;
        cVar = new st1.c(bVar, hVar.P, hVar.f204384a);
        this.f13489c = b0Var;
        this.f13487a = cVar;
        this.f13488b = 1;
        if (cVar.b(this.f13491e, this.f13492f, null, p13.j0.f134944a, this) != aVar) {
        }
        return aVar;
        b2 b2Var = cVar.f160874f;
        a aVar2 = new a(this.f13490d, b0Var, this.f13491e, this.f13493g, this.f13494h, null);
        this.f13489c = null;
        this.f13487a = null;
        this.f13488b = 2;
    }
}
