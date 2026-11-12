package jv0;

import android.content.Intent;
import b21.v4;
import c.q;
import c.w;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import e23.l;
import e23.p;
import ew1.v1;
import gl1.y;
import gv0.m0;
import h4.k;
import h5.e0;
import i3.fe;
import i3.mh;
import java.util.List;
import l72.f0;
import lc.u0;
import o13.r;
import o53.b0;
import org.koin.compose.InjectKt;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.m;
import p3.n;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import s5.x0;
import u1.a2;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a implements e23.a<ParametersHolder> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3 f100977a;

        public a(x3 x3Var) {
            this.f100977a = x3Var;
        }

        @Override // e23.a
        public final ParametersHolder invoke() {
            ParametersHolder parametersHolder;
            e23.a aVarM473koinInject$lambda0 = InjectKt.m473koinInject$lambda0(this.f100977a);
            return (aVarM473koinInject$lambda0 == null || (parametersHolder = (ParametersHolder) aVarM473koinInject$lambda0.invoke()) == null) ? ParametersHolderKt.emptyParametersHolder() : parametersHolder;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.setup.screens.EmailContactsSetupScreenKt$EmailContactsSetupScreen$1$1", f = "EmailContactsSetupScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gv0.d f100978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x3<g3<List<qu0.e>>> f100979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(gv0.d dVar, x3<? extends g3<? extends List<qu0.e>>> x3Var, t13.d<? super b> dVar2) {
            super(2, dVar2);
            this.f100978a = dVar;
            this.f100979b = x3Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f100978a, this.f100979b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            x3<g3<List<qu0.e>>> x3Var = this.f100979b;
            if (x3Var.getF182175a().f35300a == fw.p.SUCCESS) {
                List<qu0.e> list = x3Var.getF182175a().f35301b;
                boolean z14 = false;
                if (list != null && (!list.isEmpty())) {
                    z14 = true;
                }
                this.f100978a.N4(z14);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.setup.screens.EmailContactsSetupScreenKt$EmailContactsSetupScreen$2$1", f = "EmailContactsSetupScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x3<g3<List<qu0.e>>> f100980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f100981b;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f100982a;

            static {
                int[] iArr = new int[fw.p.values().length];
                try {
                    iArr[fw.p.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[fw.p.ERROR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[fw.p.LOADING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f100982a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x3<? extends g3<? extends List<qu0.e>>> x3Var, p1<Boolean> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f100980a = x3Var;
            this.f100981b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f100980a, this.f100981b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            int i14 = a.f100982a[this.f100980a.getF182175a().f35300a.ordinal()];
            boolean z14 = true;
            if (i14 == 1 || i14 == 2) {
                z14 = false;
            } else if (i14 != 3) {
                u0.r();
                return null;
            }
            this.f100981b.setValue(Boolean.valueOf(z14));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends p005kotlin.jvm.internal.a implements l<pu0.b, Unit> {
        public d(Object obj) {
            super(1, obj, gv0.d.class, "removeRecipient", "removeRecipient(Lcom/garmin/android/apps/connectmobile/livetrackui/data/model/contact/Contact;Z)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(pu0.b bVar) {
            pu0.b bVar2 = bVar;
            bVar2.getClass();
            gv0.d.V4((gv0.d) this.receiver, bVar2);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: jv0.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.livetrackui.presentation.settings.setup.screens.EmailContactsSetupScreenKt$EmailContactsSetupScreen$3$1$1$8$1$1$1", f = "EmailContactsSetupScreen.kt", l = {165}, m = "invokeSuspend", v = 2)
    public static final class C1943e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f100983a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ gv0.d f100984b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f100985c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q<Intent, f.a> f100986d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ uu0.c f100987e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ b.g f100988f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1943e(gv0.d dVar, String str, q<Intent, f.a> qVar, uu0.c cVar, b.g gVar, t13.d<? super C1943e> dVar2) {
            super(2, dVar2);
            this.f100984b = dVar;
            this.f100985c = str;
            this.f100986d = qVar;
            this.f100987e = cVar;
            this.f100988f = gVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new C1943e(this.f100984b, this.f100985c, this.f100986d, this.f100987e, this.f100988f, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1943e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f100983a;
            if (i14 == 0) {
                r.b(obj);
                this.f100983a = 1;
                obj = this.f100984b.E4(this.f100985c, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            pu0.b bVar = (pu0.b) obj;
            if (bVar != null) {
                this.f100986d.a(this.f100987e.b(this.f100988f, bVar), null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final gv0.d dVar, final l<? super String, Unit> lVar, final l<? super pu0.b, Unit> lVar2, final p<? super String, ? super Boolean, Unit> pVar, final l<? super Boolean, Unit> lVar3, final e23.a<Unit> aVar, m mVar, final int i14) {
        o0 o0Var;
        p2 p2VarI0;
        p<? super m, ? super Integer, Unit> pVar2;
        dVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        pVar.getClass();
        lVar3.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(1328796245);
        int i15 = i14 | (o0VarE.r(dVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar3) ? 16384 : 8192) | (o0VarE.r(aVar) ? 131072 : 65536);
        if (o0VarE.n(i15 & 1, (74899 & i15) != 74898)) {
            x1 x1Var = n.f135158a;
            Object objA = o0VarE.A(c.n.f22332a);
            b.g gVar = objA instanceof b.g ? (b.g) objA : null;
            if (gVar == null) {
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 == null) {
                    return;
                }
                final int i16 = 0;
                pVar2 = new p(dVar, lVar, lVar2, pVar, lVar3, aVar, i14, i16) { // from class: jv0.b

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ int f100951a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ gv0.d f100952b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ l f100953c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ l f100954d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ p f100955e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public final /* synthetic */ l f100956f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    public final /* synthetic */ e23.a f100957g;

                    {
                        this.f100951a = i16;
                    }

                    @Override // e23.p
                    public final Object invoke(Object obj, Object obj2) {
                        switch (this.f100951a) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iT = p0.t(1);
                                e.a(this.f100952b, this.f100953c, this.f100954d, this.f100955e, this.f100956f, this.f100957g, (m) obj, iT);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iT2 = p0.t(1);
                                e.a(this.f100952b, this.f100953c, this.f100954d, this.f100955e, this.f100956f, this.f100957g, (m) obj, iT2);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
            } else {
                Object objQ = o0VarE.q();
                m.f135153a.getClass();
                m.a.C2565a c2565a = m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ);
                }
                final b0 b0Var = (b0) objQ;
                o0VarE.L(414512006);
                Scope scopeCurrentKoinScope = KoinApplicationKt.currentKoinScope(o0VarE, 0);
                p1 p1VarQ = p0.q(null, o0VarE);
                o0VarE.L(855641119);
                boolean zB = o0VarE.B(null) | o0VarE.B(scopeCurrentKoinScope);
                Object objQ2 = o0VarE.q();
                if (zB || objQ2 == c2565a) {
                    objQ2 = scopeCurrentKoinScope.get((k23.d<?>) s0.f105811a.b(uu0.c.class), (Qualifier) null, new a(p1VarQ));
                    o0VarE.K(objQ2);
                }
                o0VarE.g0(false);
                o0VarE.g0(false);
                final uu0.c cVar = (uu0.c) objQ2;
                g.h hVar = new g.h();
                boolean z14 = (i15 & 112) == 32;
                Object objQ3 = o0VarE.q();
                if (z14 || objQ3 == c2565a) {
                    objQ3 = new fb0.d(lVar, 26);
                    o0VarE.K(objQ3);
                }
                final q qVarC = w.c(hVar, (l) objQ3, o0VarE, 0);
                g.h hVar2 = new g.h();
                boolean zR = o0VarE.r(dVar);
                Object objQ4 = o0VarE.q();
                if (zR || objQ4 == c2565a) {
                    objQ4 = new bv0.n(dVar, 14);
                    o0VarE.K(objQ4);
                }
                final q qVarC2 = w.c(hVar2, (l) objQ4, o0VarE, 0);
                final p1 p1VarC = s9.c.c(dVar.f79190h, o0VarE);
                final p1 p1VarC2 = s9.c.c(dVar.K0, o0VarE);
                final p1 p1VarC3 = s9.c.c(dVar.f79194k0, o0VarE);
                Object objQ5 = o0VarE.q();
                if (objQ5 == c2565a) {
                    objQ5 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ5);
                }
                final p1 p1Var = (p1) objQ5;
                g3 g3Var = (g3) p1VarC2.getF182175a();
                boolean zB2 = o0VarE.B(p1VarC2) | o0VarE.r(dVar);
                final b.g gVar2 = gVar;
                Object objQ6 = o0VarE.q();
                if (zB2 || objQ6 == c2565a) {
                    objQ6 = new b(dVar, p1VarC2, null);
                    o0VarE.K(objQ6);
                }
                g3.a aVar2 = g3.f35298f;
                l0.e((p) objQ6, g3Var, o0VarE);
                g3 g3Var2 = (g3) p1VarC3.getF182175a();
                boolean zB3 = o0VarE.B(p1VarC2);
                Object objQ7 = o0VarE.q();
                if (zB3 || objQ7 == c2565a) {
                    objQ7 = new c(p1VarC2, p1Var, null);
                    o0VarE.K(objQ7);
                }
                l0.e((p) objQ7, g3Var2, o0VarE);
                final hl.a aVar3 = dVar.f79188f;
                m0.a(dVar, pVar, o0VarE, (i15 & 14) | ((i15 >> 6) & 112));
                o0Var = o0VarE;
                gl1.d.b(y.Q(o0VarE, R.string.lbl_livetrack_setup), aVar, ((Boolean) p1Var.getF182175a()).booleanValue(), null, null, null, z3.f.c(-1113194873, new e23.q() { // from class: jv0.d
                    /* JADX WARN: Code duplicated, block: B:34:0x01ca  */
                    /* JADX WARN: Code duplicated, block: B:41:0x0204  */
                    /* JADX WARN: Code duplicated, block: B:46:0x0224  */
                    /* JADX WARN: Code duplicated, block: B:51:0x0241  */
                    /* JADX WARN: Code duplicated, block: B:56:0x0260  */
                    /* JADX WARN: Multi-variable type inference failed */
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
                    @Override // e23.q
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        m.a.C2565a c2565a2;
                        m mVar2 = (m) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((fe) obj).getClass();
                        if (mVar2.n(iIntValue & 1, (iIntValue & 17) != 16)) {
                            x1 x1Var2 = n.f135158a;
                            h4.r.a aVar4 = h4.r.S;
                            h4.r rVarD = x2.d(aVar4, 1.0f);
                            d92.b.f58623a.getClass();
                            d92.b.f58625c.getClass();
                            j92.e eVar = j92.b.f97899b;
                            float f14 = eVar.f97920e;
                            h4.r rVarC = c2.l.C(rVarD, 0.0f, 0.0f, 0.0f, f14, 7);
                            c2.j.f22691a.getClass();
                            c2.j.k kVar = c2.j.f22694d;
                            h4.d.f81522a.getClass();
                            h4.g.a aVar5 = h4.d.a.f81536n;
                            z zVarA = c2.y.a(kVar, aVar5, mVar2, 0);
                            int iHashCode = Long.hashCode(mVar2.getU());
                            i2 i2VarX = mVar2.x();
                            h4.r rVarC2 = k.c(rVarC, mVar2);
                            h5.g.V.getClass();
                            e0.a aVar6 = h5.g.a.f81805b;
                            if (mVar2.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar6);
                            } else {
                                mVar2.c();
                            }
                            h5.g.a.e eVar2 = h5.g.a.f81810g;
                            b4.c(eVar2, zVarA, mVar2);
                            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                            b4.c(c1623g, i2VarX, mVar2);
                            h5.g.a.b bVar = h5.g.a.f81813j;
                            if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                                v.h.z(iHashCode, mVar2, iHashCode, bVar);
                            }
                            h5.g.a.f fVar = h5.g.a.f81807d;
                            b4.c(fVar, rVarC2, mVar2);
                            h4.r rVarB = a2.b(c2.b0.f22601a.a(x2.f(aVar4, 1.0f), 1.0f, true), a2.a(mVar2), true);
                            z zVarA2 = c2.y.a(kVar, aVar5, mVar2, 0);
                            int iHashCode2 = Long.hashCode(mVar2.getU());
                            i2 i2VarX2 = mVar2.x();
                            h4.r rVarC3 = k.c(rVarB, mVar2);
                            if (mVar2.F() == null) {
                                p0.l();
                                throw null;
                            }
                            mVar2.z();
                            if (mVar2.getT()) {
                                mVar2.M(aVar6);
                            } else {
                                mVar2.c();
                            }
                            b4.c(eVar2, zVarA2, mVar2);
                            b4.c(c1623g, i2VarX2, mVar2);
                            if (mVar2.getT() || !s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                                v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                            }
                            b4.c(fVar, rVarC3, mVar2);
                            String strQ = y.Q(mVar2, R.string.lbl_share_with_contacts);
                            d92.b.f58624b.getClass();
                            x0 x0VarB = d92.c.b(j92.f.f97930g, mVar2);
                            d6.h.f57752b.getClass();
                            int i17 = d6.h.f57755e;
                            h4.r rVarF = x2.f(aVar4, 1.0f);
                            float f15 = eVar.f97922g;
                            float f16 = eVar.f97920e;
                            mh.c(strQ, c2.l.C(rVarF, f16, f15, f16, 0.0f, 8), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 130044);
                            mh.c(y.Q(mVar2, R.string.msg_livetrack_setup_email_option_description), c2.l.y(x2.f(aVar4, 1.0f), f14), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar2), mVar2, 0, 0, 130044);
                            g3 g3Var3 = (g3) p1VarC2.getF182175a();
                            iv0.h hVar3 = (iv0.h) p1VarC.getF182175a();
                            gv0.d dVar2 = dVar;
                            boolean zR2 = mVar2.r(dVar2);
                            Object objQ8 = mVar2.q();
                            m.a aVar7 = m.f135153a;
                            if (zR2) {
                                objQ8 = new bv0.j(dVar2, 3);
                                mVar2.K(objQ8);
                            } else {
                                aVar7.getClass();
                                if (objQ8 == m.a.f135155b) {
                                    objQ8 = new bv0.j(dVar2, 3);
                                    mVar2.K(objQ8);
                                }
                            }
                            e23.a aVar8 = (e23.a) objQ8;
                            q qVar = qVarC;
                            boolean zR3 = mVar2.r(qVar);
                            uu0.c cVar2 = cVar;
                            boolean zR4 = zR3 | mVar2.r(cVar2);
                            b.g gVar3 = gVar2;
                            boolean zR5 = zR4 | mVar2.r(gVar3) | mVar2.r(dVar2);
                            hl.a aVar9 = aVar3;
                            boolean zR6 = zR5 | mVar2.r(aVar9);
                            Object objQ9 = mVar2.q();
                            if (zR6) {
                                objQ9 = new v4(qVar, cVar2, gVar3, dVar2, aVar9, 14);
                                mVar2.K(objQ9);
                            } else {
                                aVar7.getClass();
                                if (objQ9 == m.a.f135155b) {
                                    objQ9 = new v4(qVar, cVar2, gVar3, dVar2, aVar9, 14);
                                    mVar2.K(objQ9);
                                }
                            }
                            e23.a aVar10 = (e23.a) objQ9;
                            boolean zR7 = mVar2.r(dVar2);
                            Object objQ10 = mVar2.q();
                            if (zR7) {
                                objQ10 = new e.d(dVar2);
                                mVar2.K(objQ10);
                            } else {
                                aVar7.getClass();
                                if (objQ10 == m.a.f135155b) {
                                    objQ10 = new e.d(dVar2);
                                    mVar2.K(objQ10);
                                }
                            }
                            l lVar4 = (l) objQ10;
                            boolean zR8 = mVar2.r(dVar2);
                            Object objQ11 = mVar2.q();
                            if (zR8) {
                                objQ11 = new bv0.n(dVar2, 15);
                                mVar2.K(objQ11);
                            } else {
                                aVar7.getClass();
                                if (objQ11 == m.a.f135155b) {
                                    objQ11 = new bv0.n(dVar2, 15);
                                    mVar2.K(objQ11);
                                }
                            }
                            l lVar5 = (l) objQ11;
                            boolean zR9 = mVar2.r(dVar2);
                            Object objQ12 = mVar2.q();
                            if (zR9) {
                                objQ12 = new bv0.n(dVar2, 16);
                                mVar2.K(objQ12);
                            } else {
                                aVar7.getClass();
                                if (objQ12 == m.a.f135155b) {
                                    objQ12 = new bv0.n(dVar2, 16);
                                    mVar2.K(objQ12);
                                }
                            }
                            l lVar6 = (l) objQ12;
                            Object objQ13 = mVar2.q();
                            aVar7.getClass();
                            m.a.C2565a c2565a3 = m.a.f135155b;
                            p1 p1Var2 = p1Var;
                            if (objQ13 == c2565a3) {
                                objQ13 = new jt1.h(p1Var2, 3);
                                mVar2.K(objQ13);
                            }
                            e23.a aVar11 = (e23.a) objQ13;
                            Object objQ14 = mVar2.q();
                            if (objQ14 == c2565a3) {
                                objQ14 = new jt1.h(p1Var2, 2);
                                mVar2.K(objQ14);
                            }
                            e23.a aVar12 = (e23.a) objQ14;
                            b0 b0Var2 = b0Var;
                            boolean zR10 = mVar2.r(b0Var2) | mVar2.r(dVar2);
                            q qVar2 = qVarC2;
                            boolean zR11 = zR10 | mVar2.r(qVar2) | mVar2.r(cVar2) | mVar2.r(gVar3);
                            Object objQ15 = mVar2.q();
                            if (zR11 || objQ15 == c2565a3) {
                                c2565a2 = c2565a3;
                                c cVar3 = new c(b0Var2, dVar2, qVar2, cVar2, gVar3, 0);
                                mVar2.K(cVar3);
                                objQ15 = cVar3;
                            } else {
                                c2565a2 = c2565a3;
                            }
                            int i18 = (g3.f35299g << 3) | 6;
                            hl.a.Companion companion = hl.a.INSTANCE;
                            m.a.C2565a c2565a4 = c2565a2;
                            iv0.y.a(false, g3Var3, aVar9, hVar3, aVar8, aVar10, lVar4, lVar5, lVar2, lVar6, aVar11, aVar12, null, (l) objQ15, null, null, mVar2, i18, 53248);
                            mVar2.y();
                            f0 f0Var = f0.f110999a;
                            String strQ2 = y.Q(mVar2, R.string.lbl_next);
                            h4.r rVarA = c2.l.A(x2.f(aVar4, 1.0f), f14, 0.0f, 2);
                            l lVar7 = lVar3;
                            boolean zB4 = mVar2.B(lVar7);
                            p1 p1Var3 = p1VarC3;
                            boolean zB5 = zB4 | mVar2.B(p1Var3);
                            Object objQ16 = mVar2.q();
                            if (zB5 || objQ16 == c2565a4) {
                                objQ16 = new v1(lVar7, p1Var3, 5);
                                mVar2.K(objQ16);
                            }
                            f0Var.d(0, 9, (e23.a) objQ16, rVarA, strQ2, mVar2, null, false);
                            mVar2.y();
                        } else {
                            mVar2.e();
                        }
                        return Unit.INSTANCE;
                    }
                }, o0VarE), o0Var, ((i15 >> 12) & 112) | 1572864, 56);
            }
            p2VarI0.f135219d = pVar2;
        }
        o0Var = o0VarE;
        o0Var.e();
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            final int i17 = 1;
            pVar2 = new p(dVar, lVar, lVar2, pVar, lVar3, aVar, i14, i17) { // from class: jv0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f100951a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ gv0.d f100952b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ l f100953c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ l f100954d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ p f100955e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ l f100956f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ e23.a f100957g;

                {
                    this.f100951a = i17;
                }

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f100951a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iT = p0.t(1);
                            e.a(this.f100952b, this.f100953c, this.f100954d, this.f100955e, this.f100956f, this.f100957g, (m) obj, iT);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iT2 = p0.t(1);
                            e.a(this.f100952b, this.f100953c, this.f100954d, this.f100955e, this.f100956f, this.f100957g, (m) obj, iT2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            p2VarI0.f135219d = pVar2;
        }
    }
}
