package ok0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c.w;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import gg1.o0;
import h5.e0;
import java.text.Collator;
import java.util.Comparator;
import l72.f0;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;
import u1.a2;
import u1.d2;

/* JADX INFO: loaded from: classes8.dex */
public final class e {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ActivityDetailsGearFragmentKt$ActivityGearListScreen$1$1$1", f = "ActivityDetailsGearFragment.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f132461a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f132461a = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f132461a, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            this.f132461a.I2(false);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ActivityDetailsGearFragmentKt$ActivityGearListScreen$1$3$1", f = "ActivityDetailsGearFragment.kt", l = {157}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f132462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d2 f132463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f132464c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f132465a;

            public a(m mVar) {
                this.f132465a = mVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                this.f132465a.I2(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d2 d2Var, m mVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f132463b = d2Var;
            this.f132464c = mVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f132463b, this.f132464c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f132462a;
            if (i14 == 0) {
                o13.r.b(obj);
                r53.i iVarS = r53.s.s(p0.s(new f(this.f132463b, 0)));
                a aVar2 = new a(this.f132464c);
                this.f132462a = 1;
                if (iVarS.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c<T> implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f132466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f132467b;

        public c(Comparator comparator, Context context) {
            this.f132466a = comparator;
            this.f132467b = context;
        }

        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            String strA;
            String strA2;
            uk0.e eVar = (uk0.e) t7;
            boolean z14 = eVar instanceof uk0.d;
            Context context = this.f132467b;
            if (z14) {
                uk0.r rVar = uk0.r.f171870a;
                uk0.d dVar = (uk0.d) eVar;
                String str = dVar.f171809c;
                String str2 = dVar.f171810d;
                String str3 = dVar.f171811e;
                rVar.getClass();
                strA = uk0.r.a(context, str, str2, str3);
            } else if (eVar instanceof uk0.g) {
                uk0.r rVar2 = uk0.r.f171870a;
                uk0.g gVar = (uk0.g) eVar;
                String str4 = gVar.f171814c;
                String str5 = gVar.f171815d;
                String str6 = gVar.f171816e;
                rVar2.getClass();
                strA = uk0.r.a(context, str4, str5, str6);
            } else {
                if (!(eVar instanceof uk0.b)) {
                    u0.r();
                    return 0;
                }
                strA = ((uk0.b) eVar).f171802b;
            }
            uk0.e eVar2 = (uk0.e) t14;
            if (eVar2 instanceof uk0.d) {
                uk0.r rVar3 = uk0.r.f171870a;
                uk0.d dVar2 = (uk0.d) eVar2;
                String str7 = dVar2.f171809c;
                String str8 = dVar2.f171810d;
                String str9 = dVar2.f171811e;
                rVar3.getClass();
                strA2 = uk0.r.a(context, str7, str8, str9);
            } else if (eVar2 instanceof uk0.g) {
                uk0.r rVar4 = uk0.r.f171870a;
                uk0.g gVar2 = (uk0.g) eVar2;
                String str10 = gVar2.f171814c;
                String str11 = gVar2.f171815d;
                String str12 = gVar2.f171816e;
                rVar4.getClass();
                strA2 = uk0.r.a(context, str10, str11, str12);
            } else {
                if (!(eVar2 instanceof uk0.b)) {
                    u0.r();
                    return 0;
                }
                strA2 = ((uk0.b) eVar2).f171802b;
            }
            return this.f132466a.compare(strA, strA2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
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
    public static final void a(m mVar, o0 o0Var, e23.l<? super String, Unit> lVar, p3.m mVar2, int i14) {
        p3.o0 o0Var2;
        boolean z14;
        boolean z15;
        e23.a aVar;
        p3.o0 o0Var3;
        p3.o0 o0Var4;
        final m mVar3 = mVar;
        p3.o0 o0VarE = mVar2.E(1018353700);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(mVar3) ? 4 : 2) | (o0VarE.k(o0Var.ordinal()) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        final int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            p1 p1VarC = s9.c.c(mVar3.getF132474d(), o0VarE);
            boolean z16 = ((g.a) s9.c.c(mVar3.getUiState(), o0VarE).getF182175a()).f132477a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            g.h hVar = new g.h();
            int i17 = i15 & 14;
            boolean zR = ((i15 & 896) == 256) | (i17 == 4) | o0VarE.r(context);
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new ls0.h(mVar3, 21, lVar, context);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ls0.h(mVar3, 21, lVar, context);
                    o0VarE.K(objQ);
                }
            }
            c.q qVarC = w.c(hVar, (e23.l) objQ, o0VarE, 0);
            Object objQ2 = o0VarE.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            Object obj = objQ2;
            if (objQ2 == c2565a) {
                Collator collator = Collator.getInstance();
                collator.setStrength(1);
                o0VarE.K(collator);
                obj = collator;
            }
            Collator collator2 = (Collator) obj;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.f(new nw0.p(p1VarC, 7, collator2, context));
                o0VarE.K(objQ3);
            }
            i53.c<uk0.e> cVar2 = (i53.c) ((x3) objQ3).getF182175a();
            if (cVar2 == null) {
                o0VarE.C(-1871703289);
                o0VarE.g0(false);
                o0Var4 = o0VarE;
            } else {
                o0VarE.C(-1871703288);
                if (cVar2.isEmpty()) {
                    o0VarE.C(-1818490573);
                    Unit unit = Unit.INSTANCE;
                    boolean z17 = i17 == 4;
                    Object objQ4 = o0VarE.q();
                    if (z17 || objQ4 == c2565a) {
                        objQ4 = new a(mVar3, null);
                        o0VarE.K(objQ4);
                    }
                    l0.e((e23.p) objQ4, unit, o0VarE);
                    h4.r rVarD = x2.d(h4.r.S, 1.0f);
                    boolean z18 = i17 == 4;
                    Object objQ5 = o0VarE.q();
                    if (z18 || objQ5 == c2565a) {
                        objQ5 = new e23.a() { // from class: ok0.c
                            @Override // e23.a
                            public final Object invoke() {
                                switch (i16) {
                                    case 0:
                                        mVar3.t2();
                                        break;
                                    case 1:
                                        mVar3.t2();
                                        break;
                                    default:
                                        mVar3.k3();
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        o0VarE.K(objQ5);
                    }
                    b(6, (e23.a) objQ5, rVarD, o0VarE, z16);
                    o0VarE.g0(false);
                    z14 = false;
                    o0Var3 = o0VarE;
                } else {
                    o0VarE.C(-1818106731);
                    d2 d2VarA = a2.a(o0VarE);
                    boolean zB = o0VarE.B(d2VarA) | (i17 == 4);
                    Object objQ6 = o0VarE.q();
                    if (zB || objQ6 == c2565a) {
                        objQ6 = new b(d2VarA, mVar3, null);
                        o0VarE.K(objQ6);
                    }
                    l0.e((e23.p) objQ6, d2VarA, o0VarE);
                    h4.r rVarB = a2.b(x2.d(h4.r.S, 1.0f), d2VarA, true);
                    d92.b.f58623a.getClass();
                    j92.b bVar = d92.b.f58625c;
                    bVar.getClass();
                    j92.e eVar = j92.b.f97899b;
                    float f14 = 0.0f;
                    h4.r rVarA = c2.l.A(rVarB, 0.0f, eVar.f97920e, 1);
                    c2.j jVar = c2.j.f22691a;
                    bVar.getClass();
                    float f15 = eVar.f97918c;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f15);
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(iVarI, h4.d.a.f81536n, o0VarE, 0);
                    int iHashCode = Long.hashCode(o0VarE.U);
                    i2 i2VarA0 = o0VarE.a0();
                    h4.r rVarC = h4.k.c(rVarA, o0VarE);
                    h5.g.V.getClass();
                    e0.a aVar3 = h5.g.a.f81805b;
                    if (cVar == null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar3);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var = c2.b0.f22601a;
                    o0VarE.C(-285437483);
                    p3.o0 o0Var5 = o0VarE;
                    for (uk0.e eVar2 : cVar2) {
                        h4.r rVarF = x2.f(h4.r.S, 1.0f);
                        d92.b.f58623a.getClass();
                        d92.b.f58625c.getClass();
                        h4.r rVarA2 = c2.l.A(rVarF, j92.b.f97899b.f97920e, f14, 2);
                        if (eVar2 instanceof uk0.g) {
                            if (z16) {
                                o0Var5.C(-329538694);
                                boolean zR2 = o0Var5.r(eVar2) | (i17 == 4) | o0Var5.r(qVarC) | o0Var5.r(context);
                                Object objQ7 = o0Var5.q();
                                if (zR2 || objQ7 == p3.m.a.f135155b) {
                                    d dVar = new d((uk0.g) eVar2, mVar, qVarC, context, 0);
                                    mVar3 = mVar;
                                    o0Var5.K(dVar);
                                    objQ7 = dVar;
                                }
                                aVar = (e23.a) objQ7;
                                o0Var5.g0(false);
                            } else {
                                o0Var5.C(-329154883);
                                o0Var5.g0(false);
                            }
                            int i18 = i17;
                            p3.o0 o0Var6 = o0Var5;
                            uk0.f.a(rVarA2, eVar2, o0Var, aVar, o0Var6, (i15 << 3) & 896);
                            i15 = i15;
                            z16 = z16;
                            o0Var5 = o0Var6;
                            i17 = i18;
                            f14 = 0.0f;
                        } else if (!(eVar2 instanceof uk0.d) && !(eVar2 instanceof uk0.b)) {
                            u0.r();
                            return;
                        }
                        aVar = null;
                        int i19 = i17;
                        p3.o0 o0Var7 = o0Var5;
                        uk0.f.a(rVarA2, eVar2, o0Var, aVar, o0Var7, (i15 << 3) & 896);
                        i15 = i15;
                        z16 = z16;
                        o0Var5 = o0Var7;
                        i17 = i19;
                        f14 = 0.0f;
                    }
                    boolean z19 = z16;
                    int i24 = i17;
                    z14 = false;
                    final int i25 = 1;
                    o0Var5.g0(false);
                    h4.r.a aVar4 = h4.r.S;
                    c2.l.f(b0Var.a(aVar4, 1.0f, true), o0Var5);
                    if (z19) {
                        o0Var5.C(-257466460);
                        h4.r rVarF2 = x2.f(aVar4, 1.0f);
                        d92.b.f58623a.getClass();
                        j92.b bVar3 = d92.b.f58625c;
                        bVar3.getClass();
                        j92.e eVar3 = j92.b.f97899b;
                        h4.r rVarA3 = c2.l.A(rVarF2, eVar3.f97920e, 0.0f, 2);
                        c2.j.f22691a.getClass();
                        c2.j.k kVar = c2.j.f22694d;
                        h4.d.f81522a.getClass();
                        z zVarA2 = y.a(kVar, h4.d.a.f81536n, o0Var5, 0);
                        x1 x1Var2 = p3.n.f135158a;
                        int iHashCode2 = Long.hashCode(o0Var5.U);
                        i2 i2VarA1 = o0Var5.a0();
                        h4.r rVarC2 = h4.k.c(rVarA3, o0Var5);
                        h5.g.V.getClass();
                        e0.a aVar5 = h5.g.a.f81805b;
                        if (cVar == null) {
                            p0.l();
                            throw null;
                        }
                        o0Var5.z();
                        if (o0Var5.T) {
                            o0Var5.M(aVar5);
                        } else {
                            o0Var5.c();
                        }
                        b4.c(h5.g.a.f81810g, zVarA2, o0Var5);
                        b4.c(h5.g.a.f81809f, i2VarA1, o0Var5);
                        h5.g.a.b bVar4 = h5.g.a.f81813j;
                        if (o0Var5.T || !p005kotlin.jvm.internal.s.g(o0Var5.q(), Integer.valueOf(iHashCode2))) {
                            v.h.A(iHashCode2, o0Var5, iHashCode2, bVar4);
                        }
                        b4.c(h5.g.a.f81807d, rVarC2, o0Var5);
                        c2.b0 b0Var2 = c2.b0.f22601a;
                        f0 f0Var = f0.f110999a;
                        h4.r rVarF3 = x2.f(aVar4, 1.0f);
                        String strQ = gl1.y.Q(o0Var5, R.string.edit_gear_title);
                        boolean z24 = i24 == 4;
                        Object objQ8 = o0Var5.q();
                        if (z24 || objQ8 == p3.m.a.f135155b) {
                            objQ8 = new e23.a() { // from class: ok0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i25) {
                                        case 0:
                                            mVar3.t2();
                                            break;
                                        case 1:
                                            mVar3.t2();
                                            break;
                                        default:
                                            mVar3.k3();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var5.K(objQ8);
                        }
                        z15 = true;
                        f0Var.i(strQ, rVarF3, false, (e23.a) objQ8, o0Var5, 48, 4);
                        bVar3.getClass();
                        c2.l.f(c2.l.A(aVar4, 0.0f, eVar3.f97918c, 1), o0Var5);
                        h4.r rVarF4 = x2.f(aVar4, 1.0f);
                        String strQ2 = gl1.y.Q(o0Var5, R.string.lbl_view_all_gear);
                        boolean z25 = i24 == 4;
                        Object objQ9 = o0Var5.q();
                        if (z25 || objQ9 == p3.m.a.f135155b) {
                            final int i26 = 2;
                            objQ9 = new e23.a() { // from class: ok0.c
                                @Override // e23.a
                                public final Object invoke() {
                                    switch (i26) {
                                        case 0:
                                            mVar3.t2();
                                            break;
                                        case 1:
                                            mVar3.t2();
                                            break;
                                        default:
                                            mVar3.k3();
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            };
                            o0Var5.K(objQ9);
                        }
                        f0Var.k(strQ2, rVarF4, false, (e23.a) objQ9, o0Var5, 48, 4);
                        o0Var5.g0(true);
                        z14 = false;
                        o0Var5.g0(false);
                    } else {
                        z15 = true;
                        o0Var5.C(-256569847);
                        o0Var5.g0(false);
                    }
                    o0Var5.g0(z15);
                    o0Var5.g0(z14);
                    o0Var3 = o0Var5;
                }
                Unit unit2 = Unit.INSTANCE;
                o0Var3.g0(z14);
                o0Var4 = o0Var3;
            }
            x1 x1Var3 = p3.n.f135158a;
            o0Var2 = o0Var4;
        } else {
            o0VarE.e();
            o0Var2 = o0VarE;
        }
        p2 p2VarI0 = o0Var2.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new mw1.b(mVar3, o0Var, lVar, i14, 15);
        }
    }

    public static final void b(int i14, e23.a aVar, h4.r rVar, p3.m mVar, boolean z14) {
        h4.r rVar2;
        String strJ;
        p3.o0 o0VarE = mVar.E(-1385833015);
        int i15 = i14 | (o0VarE.h(z14) ? 32 : 16) | (o0VarE.r(aVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            rVar2 = rVar;
            h4.r rVarC = x2.c(a2.b(rVar2, a2.a(o0VarE), true), 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarC, o0VarE);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
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
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC2, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97921f;
            float f15 = eVar.f97920e;
            h4.r rVarF = x2.f(c2.l.C(aVar3, 0.0f, f14, 0.0f, 0.0f, 13), 1.0f);
            s62.a.f157643a.getClass();
            u4.d dVarA = v62.x3.a(t62.b.f162798a);
            String strQ = gl1.y.Q(o0VarE, R.string.lbl_no_gear_added);
            if (z14) {
                strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 767017980, R.string.lbl_add_gear_subtitle, o0VarE, false);
            } else {
                o0VarE.C(767106392);
                o0VarE.g0(false);
                strJ = "";
            }
            b82.n.c(dVarA, strQ, strJ, rVarF, null, o0VarE, 0, 16);
            if (z14) {
                o0VarE.C(767247535);
                c2.l.f(b0Var.a(aVar3, 1.0f, true), o0VarE);
                f0 f0Var = f0.f110999a;
                org.apache.commons.lang3.e.j(bVar2);
                float f16 = eVar.f97921f;
                bVar2.getClass();
                f0Var.d((i15 << 6) & 57344, 9, aVar, x2.f(c2.l.B(aVar3, f15, f16, f15, f15), 1.0f), gl1.y.Q(o0VarE, R.string.lbl_gear_add), o0VarE, null, false);
                o0VarE = o0VarE;
                o0VarE.g0(false);
            } else {
                o0VarE.C(767831823);
                o0VarE.g0(false);
            }
            o0VarE.g0(true);
        } else {
            rVar2 = rVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new d50.n(rVar2, z14, aVar, i14, 5);
        }
    }
}
