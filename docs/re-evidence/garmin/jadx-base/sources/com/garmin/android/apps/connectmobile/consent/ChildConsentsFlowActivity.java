package com.garmin.android.apps.connectmobile.consent;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import b.g;
import c2.j;
import c2.l;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowActivity;
import e23.p;
import g.h;
import h4.k;
import h5.e0;
import i3.mh;
import java.util.List;
import l72.f0;
import lc.u0;
import o13.m;
import o13.n;
import o13.r;
import o13.t;
import o53.b0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import p3.x3;
import q92.x;
import s5.x0;
import v13.i;
import z10.c0;
import z10.d1;
import z10.i2;
import z10.v;
import z10.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/ChildConsentsFlowActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lz10/c0;", "currentScreen", "Lz10/i2;", "livetrackNoticeUiState", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ChildConsentsFlowActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f32139f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32140a = m.a(n.NONE, new d(this, null, null, null));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f32141b = m.b(new v(this, 0));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f32142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.c<Intent> f32143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.c<Intent> f32144e;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32145a;

        static {
            int[] iArr = new int[c0.values().length];
            try {
                iArr[c0.LIVETRACK_CONSENT_NOTICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f32145a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.consent.ChildConsentsFlowActivity$onCreate$1$1$2$1", f = "ChildConsentsFlowActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<c0> f32147b;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32148a;

            static {
                int[] iArr = new int[c0.values().length];
                try {
                    iArr[c0.ERROR.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c0.PRIVACY_POLICY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c0.STORAGE_AND_PROCESSING_CONSENT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c0.LIVETRACK_CONSENT_NOTICE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[c0.LIVETRACK_CONSENT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[c0.COACH_CONSENT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[c0.INSIGHT_CONSENT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[c0.AUTO_DETECTION_ACTIVITY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[c0.PRODUCT_IMPROVEMENT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[c0.END_FLOW.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                f32148a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x3<? extends c0> x3Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f32147b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return ChildConsentsFlowActivity.this.new c(this.f32147b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a aVar2 = ChildConsentsFlowActivity.f32139f;
            int i14 = a.f32148a[this.f32147b.getF182175a().ordinal()];
            ChildConsentsFlowActivity childConsentsFlowActivity = ChildConsentsFlowActivity.this;
            switch (i14) {
                case 1:
                    g22.a.a(childConsentsFlowActivity, null);
                    childConsentsFlowActivity.fa();
                    break;
                case 2:
                    childConsentsFlowActivity.f32142c.a(PrivacyPolicyConsentActivity.a.b(PrivacyPolicyConsentActivity.f32218d, childConsentsFlowActivity, childConsentsFlowActivity.ga(), 4), null);
                    break;
                case 3:
                    childConsentsFlowActivity.f32143d.a(DataStorageConsentActivity.a.a(DataStorageConsentActivity.f32194t, childConsentsFlowActivity, childConsentsFlowActivity.ga(), 32), null);
                    break;
                case 4:
                    z10.b0 b0VarHa = childConsentsFlowActivity.ha();
                    b0VarHa.getClass();
                    ge1.b.T(v1.a(b0VarHa), null, null, new y(b0VarHa, null), 3);
                    break;
                case 5:
                    f.c<Intent> cVar = childConsentsFlowActivity.f32144e;
                    ConsentActivity.a aVar3 = ConsentActivity.f32155r;
                    x xVar = x.DI_CONNECT_LIVETRACK;
                    hl.a aVarGa = childConsentsFlowActivity.ga();
                    aVar3.getClass();
                    cVar.a(ConsentActivity.a.a(childConsentsFlowActivity, xVar, false, true, aVarGa), null);
                    break;
                case 6:
                    f.c<Intent> cVar2 = childConsentsFlowActivity.f32144e;
                    CoachConsentActivity.a aVar4 = CoachConsentActivity.f32153p;
                    hl.a aVarGa2 = childConsentsFlowActivity.ga();
                    aVar4.getClass();
                    aVarGa2.getClass();
                    Intent intent = new Intent(childConsentsFlowActivity, (Class<?>) CoachConsentActivity.class);
                    intent.putExtra("GCM_extra_screen_access_role", aVarGa2);
                    intent.putExtra("extra_creation_consent_flow", true);
                    cVar2.a(intent, null);
                    break;
                case 7:
                    f.c<Intent> cVar3 = childConsentsFlowActivity.f32144e;
                    ConsentActivity.a aVar5 = ConsentActivity.f32155r;
                    x xVar2 = x.DI_CONNECT_INSIGHTS;
                    hl.a aVarGa3 = childConsentsFlowActivity.ga();
                    aVar5.getClass();
                    cVar3.a(ConsentActivity.a.a(childConsentsFlowActivity, xVar2, false, true, aVarGa3), null);
                    break;
                case 8:
                    f.c<Intent> cVar4 = childConsentsFlowActivity.f32144e;
                    ConsentActivity.a aVar6 = ConsentActivity.f32155r;
                    x xVar3 = x.DI_CONNECT_AUTO_ACTIVITY_DETECTION;
                    hl.a aVarGa4 = childConsentsFlowActivity.ga();
                    aVar6.getClass();
                    cVar4.a(ConsentActivity.a.a(childConsentsFlowActivity, xVar3, false, true, aVarGa4), null);
                    break;
                case 9:
                    f.c<Intent> cVar5 = childConsentsFlowActivity.f32144e;
                    ProductImprovementConsentActivity.a aVar7 = ProductImprovementConsentActivity.f32230h;
                    hl.a aVarGa5 = childConsentsFlowActivity.ga();
                    aVar7.getClass();
                    aVarGa5.getClass();
                    Intent intent2 = new Intent(childConsentsFlowActivity, (Class<?>) ProductImprovementConsentActivity.class);
                    intent2.putExtra("GCM_extra_screen_access_role", aVarGa5);
                    intent2.putExtra("extra_creation_consent_flow", true);
                    cVar5.a(intent2, null);
                    break;
                case 10:
                    childConsentsFlowActivity.fa();
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<z10.b0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f32149a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f32150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f32151c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f32152d;

        public d(g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f32149a = gVar;
            this.f32150b = qualifier;
            this.f32151c = aVar;
            this.f32152d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, z10.b0] */
        @Override // e23.a
        public final z10.b0 invoke() {
            CreationExtras defaultViewModelCreationExtras;
            g gVar = this.f32149a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f32151c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(z10.b0.class), viewModelStore, null, defaultViewModelCreationExtras, this.f32150b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f32152d, 4, null);
        }
    }

    public ChildConsentsFlowActivity() {
        final int i14 = 0;
        this.f32142c = registerForActivityResult(new h(), new f.b(this) { // from class: z10.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChildConsentsFlowActivity f201279b;

            {
                this.f201279b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                ChildConsentsFlowActivity childConsentsFlowActivity = this.f201279b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        ChildConsentsFlowActivity.a aVar2 = ChildConsentsFlowActivity.f32139f;
                        aVar.getClass();
                        if (aVar.f67585a != -1) {
                            childConsentsFlowActivity.fa();
                        } else {
                            childConsentsFlowActivity.ha().x4();
                        }
                        break;
                    case 1:
                        ChildConsentsFlowActivity.a aVar3 = ChildConsentsFlowActivity.f32139f;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        boolean z14 = intent != null && intent.getBooleanExtra("extra_too_many_retries", false);
                        if (aVar.f67585a == -1) {
                            childConsentsFlowActivity.ha().x4();
                        } else if (z14) {
                            childConsentsFlowActivity.ha().y4();
                        } else if (!(childConsentsFlowActivity.ga() instanceof hl.a.b)) {
                            childConsentsFlowActivity.fa();
                        } else {
                            b0 b0VarHa = childConsentsFlowActivity.ha();
                            b0VarHa.getClass();
                            ge1.b.T(androidx.lifecycle.v1.a(b0VarHa), null, null, new a0(b0VarHa, null), 3);
                        }
                        break;
                    default:
                        ChildConsentsFlowActivity.a aVar4 = ChildConsentsFlowActivity.f32139f;
                        aVar.getClass();
                        Intent intent2 = aVar.f67586b;
                        if (intent2 != null && intent2.getBooleanExtra("extra_too_many_retries", false)) {
                            childConsentsFlowActivity.ha().y4();
                        } else {
                            childConsentsFlowActivity.ha().x4();
                        }
                        break;
                }
            }
        });
        final int i15 = 1;
        this.f32143d = registerForActivityResult(new h(), new f.b(this) { // from class: z10.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChildConsentsFlowActivity f201279b;

            {
                this.f201279b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                ChildConsentsFlowActivity childConsentsFlowActivity = this.f201279b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        ChildConsentsFlowActivity.a aVar2 = ChildConsentsFlowActivity.f32139f;
                        aVar.getClass();
                        if (aVar.f67585a != -1) {
                            childConsentsFlowActivity.fa();
                        } else {
                            childConsentsFlowActivity.ha().x4();
                        }
                        break;
                    case 1:
                        ChildConsentsFlowActivity.a aVar3 = ChildConsentsFlowActivity.f32139f;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        boolean z14 = intent != null && intent.getBooleanExtra("extra_too_many_retries", false);
                        if (aVar.f67585a == -1) {
                            childConsentsFlowActivity.ha().x4();
                        } else if (z14) {
                            childConsentsFlowActivity.ha().y4();
                        } else if (!(childConsentsFlowActivity.ga() instanceof hl.a.b)) {
                            childConsentsFlowActivity.fa();
                        } else {
                            b0 b0VarHa = childConsentsFlowActivity.ha();
                            b0VarHa.getClass();
                            ge1.b.T(androidx.lifecycle.v1.a(b0VarHa), null, null, new a0(b0VarHa, null), 3);
                        }
                        break;
                    default:
                        ChildConsentsFlowActivity.a aVar4 = ChildConsentsFlowActivity.f32139f;
                        aVar.getClass();
                        Intent intent2 = aVar.f67586b;
                        if (intent2 != null && intent2.getBooleanExtra("extra_too_many_retries", false)) {
                            childConsentsFlowActivity.ha().y4();
                        } else {
                            childConsentsFlowActivity.ha().x4();
                        }
                        break;
                }
            }
        });
        final int i16 = 2;
        this.f32144e = registerForActivityResult(new h(), new f.b(this) { // from class: z10.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ChildConsentsFlowActivity f201279b;

            {
                this.f201279b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i17 = i16;
                ChildConsentsFlowActivity childConsentsFlowActivity = this.f201279b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        ChildConsentsFlowActivity.a aVar2 = ChildConsentsFlowActivity.f32139f;
                        aVar.getClass();
                        if (aVar.f67585a != -1) {
                            childConsentsFlowActivity.fa();
                        } else {
                            childConsentsFlowActivity.ha().x4();
                        }
                        break;
                    case 1:
                        ChildConsentsFlowActivity.a aVar3 = ChildConsentsFlowActivity.f32139f;
                        aVar.getClass();
                        Intent intent = aVar.f67586b;
                        boolean z14 = intent != null && intent.getBooleanExtra("extra_too_many_retries", false);
                        if (aVar.f67585a == -1) {
                            childConsentsFlowActivity.ha().x4();
                        } else if (z14) {
                            childConsentsFlowActivity.ha().y4();
                        } else if (!(childConsentsFlowActivity.ga() instanceof hl.a.b)) {
                            childConsentsFlowActivity.fa();
                        } else {
                            b0 b0VarHa = childConsentsFlowActivity.ha();
                            b0VarHa.getClass();
                            ge1.b.T(androidx.lifecycle.v1.a(b0VarHa), null, null, new a0(b0VarHa, null), 3);
                        }
                        break;
                    default:
                        ChildConsentsFlowActivity.a aVar4 = ChildConsentsFlowActivity.f32139f;
                        aVar.getClass();
                        Intent intent2 = aVar.f67586b;
                        if (intent2 != null && intent2.getBooleanExtra("extra_too_many_retries", false)) {
                            childConsentsFlowActivity.ha().y4();
                        } else {
                            childConsentsFlowActivity.ha().x4();
                        }
                        break;
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:58:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x02a4  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void da(i2 i2Var, p3.m mVar, int i14) {
        boolean z14;
        List<s92.b> listB;
        x0 x0VarF;
        boolean z15;
        i2Var.getClass();
        o0 o0VarE = mVar.E(-119449449);
        int i15 = 4;
        int i16 = (o0VarE.r(i2Var) ? 4 : 2) | i14 | (o0VarE.r(this) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            boolean z16 = i2Var.f201044b;
            p3.m.a aVar = p3.m.f135153a;
            if (z16) {
                o0VarE.C(2009483086);
                if (i2Var.f201045c == 3) {
                    o0VarE.C(2009551906);
                    boolean zR = o0VarE.r(this);
                    Object objQ = o0VarE.q();
                    if (zR) {
                        objQ = new v(this, i15);
                        o0VarE.K(objQ);
                    } else {
                        aVar.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new v(this, i15);
                            o0VarE.K(objQ);
                        }
                    }
                    d1.x(this, (e23.a) objQ);
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(2009691313);
                    ea(o0VarE, (i16 >> 3) & 14);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(2009867672);
                s92.g gVar = i2Var.f201046d;
                if (gVar == null) {
                    o0VarE.C(2009867671);
                    o0VarE.g0(false);
                    z14 = false;
                } else {
                    o0VarE.C(2009867672);
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarY = l.y(rVarD, j92.b.f97899b.f97920e);
                    j.f22691a.getClass();
                    j.k kVar = j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    int iHashCode = Long.hashCode(o0VarE.U);
                    p3.i2 i2VarA0 = o0VarE.a0();
                    h4.r rVarC = k.c(rVarY, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    Object obj = null;
                    if (o0VarE.f135177b == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String headline = gVar.getHeadline();
                    if (headline == null) {
                        o0VarE.C(1745210924);
                        o0VarE.g0(false);
                        z14 = false;
                    } else {
                        o0VarE.C(1745210925);
                        d92.b.f58624b.getClass();
                        z14 = false;
                        mh.c(headline, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), o0VarE), o0VarE, 0, 0, 131070);
                        o0VarE = o0VarE;
                        o0VarE.g0(false);
                    }
                    List<s92.f> listF = r3.f();
                    if (listF != null) {
                        for (Object obj2 : listF) {
                            if (((s92.f) obj2).getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() == s92.j.PARENT) {
                                obj = obj2;
                                break;
                            }
                        }
                        s92.f fVar = (s92.f) obj;
                        if (fVar == null || (listB = fVar.b()) == null) {
                            listB = gVar.b();
                        }
                    } else {
                        listB = gVar.b();
                    }
                    if (listB == null) {
                        o0VarE.C(1745613831);
                        o0VarE.g0(z14);
                    } else {
                        o0VarE.C(1745613832);
                        for (s92.b bVar2 : listB) {
                            h4.r rVarF = x2.f(h4.r.S, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            h4.r rVarC2 = l.C(rVarF, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                            if (bVar2.f()) {
                                o0VarE.C(1854500532);
                                d92.b.f58624b.getClass();
                                x0VarF = d92.c.b(j92.f.f97931h, o0VarE);
                            } else {
                                o0VarE.C(1854501654);
                                d92.b.f58624b.getClass();
                                x0VarF = d92.c.f(j92.f.f97932i, o0VarE);
                            }
                            o0VarE.g0(z14);
                            x0 x0Var = x0VarF;
                            String copy = bVar2.getCopy();
                            if (copy == null) {
                                copy = "";
                            }
                            o0 o0Var = o0VarE;
                            mh.c(copy, rVarC2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0Var, o0Var, 0, 0, 131068);
                            o0VarE = o0Var;
                        }
                        o0VarE.g0(z14);
                    }
                    f0 f0Var = f0.f110999a;
                    String strQ = gl1.y.Q(o0VarE, R.string.lbl_accept);
                    h4.r rVarF2 = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarC3 = l.C(rVarF2, 0.0f, j92.b.f97899b.f97920e, 0.0f, 0.0f, 13);
                    boolean zR2 = o0VarE.r(this);
                    Object objQ2 = o0VarE.q();
                    if (zR2) {
                        z15 = true;
                        objQ2 = new v(this, 1 == true ? 1 : 0);
                        o0VarE.K(objQ2);
                    } else {
                        aVar.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            z15 = true;
                            objQ2 = new v(this, 1 == true ? 1 : 0);
                            o0VarE.K(objQ2);
                        } else {
                            z15 = true;
                        }
                    }
                    f0Var.d(0, 9, (e23.a) objQ2, rVarC3, strQ, o0VarE, null, false);
                    o0VarE.g0(z15);
                    o0VarE.g0(z14);
                    Unit unit = Unit.INSTANCE;
                }
                o0VarE.g0(z14);
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new xm0.h(this, i2Var, i14, 20);
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b  */
    public final void ea(p3.m mVar, int i14) {
        int i15;
        o0 o0VarE = mVar.E(-1074226429);
        int i16 = 2;
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarF = x2.f(h4.r.S, 1.0f);
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = l.y(rVarF, j92.b.f97899b.f97920e);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_nothing_to_see_here);
            String strQ2 = gl1.y.Q(o0VarE, R.string.txt_empty_page_unable_load);
            String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_retry);
            boolean zR = o0VarE.r(this);
            Object objQ = o0VarE.q();
            if (zR) {
                objQ = new v(this, i16);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new v(this, i16);
                    o0VarE.K(objQ);
                }
            }
            b82.n.d(null, strQ, strQ2, rVarY, strQ3, (e23.a) objQ, null, null, o0VarE, 0, 193);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new w52.n(this, i14, 16);
        }
    }

    public final void fa() {
        if (((c0) r53.s.d(ha().f200892b).f150540a.getValue()) == c0.PRIVACY_POLICY) {
            Intent intent = new Intent();
            intent.putExtra("GCM_extra_privacy_policy_declined", true);
            setResult(0, intent);
        }
        finish();
    }

    public final hl.a ga() {
        return (hl.a) this.f32141b.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    public final z10.b0 ha() {
        return (z10.b0) this.f32140a.getValue();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hl.a aVarGa = ga();
        if (s.g(aVarGa, hl.a.c.f84256b)) {
            finish();
            return;
        }
        if (!(aVarGa instanceof hl.a.b)) {
            u0.r();
            return;
        }
        z10.b0 b0VarHa = ha();
        hl.a aVarGa2 = ga();
        aVarGa2.getClass();
        long j8 = ((hl.a.b) aVarGa2).f84252b;
        hl.a aVarGa3 = ga();
        aVarGa3.getClass();
        String str = ((hl.a.b) aVarGa3).f84255e;
        b0VarHa.getClass();
        ge1.b.T(v1.a(b0VarHa), null, null, new z10.z(j8, b0VarHa, str, null), 3);
        initComposeScreen(new z3.e(-416628112, true, new z10.x(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/consent/ChildConsentsFlowActivity$a;", "", "<init>", "()V", "", "CHILD_RETRY_COUNT", "I", "gcm-consent_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
