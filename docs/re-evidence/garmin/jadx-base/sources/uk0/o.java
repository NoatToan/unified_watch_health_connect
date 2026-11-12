package uk0;

import b21.n9;
import b82.f0;
import c2.x2;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import gl1.y;
import h5.e0;
import i3.e9;
import i3.mc;
import i3.mh;
import java.text.NumberFormat;
import l72.r1;
import l72.v2;
import l72.w;
import o53.b0;
import o72.h3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import s5.w0;
import s5.x0;
import x5.l0;

/* JADX INFO: loaded from: classes8.dex */
public final class o {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.shared.GearInputKt$NotesBottomSheet$1$1", f = "GearInput.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f171852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f171853b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<Boolean> p1Var, m4.b0 b0Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f171852a = p1Var;
            this.f171853b = b0Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f171852a, this.f171853b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f171852a.getF182175a().booleanValue()) {
                m4.b0.a(this.f171853b);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.shared.GearInputKt$NotesBottomSheet$onDismiss$1$1$1", f = "GearInput.kt", l = {162}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f171854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mc f171855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f171856c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mc mcVar, p1<Boolean> p1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f171855b = mcVar;
            this.f171856c = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f171855b, this.f171856c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f171854a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f171854a = 1;
                if (this.f171855b.d(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            this.f171856c.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.shared.GearInputKt$NotesInputSection$1$1$1", f = "GearInput.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f171857a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<l0> f171858b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, p1<l0> p1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f171857a = str;
            this.f171858b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f171857a, this.f171858b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            p1<l0> p1Var = this.f171858b;
            String str = p1Var.getF182175a().f188878a.f157138b;
            String str2 = this.f171857a;
            if (!p005kotlin.jvm.internal.s.g(str2, str)) {
                l0 f182175a = p1Var.getF182175a();
                int length = str2.length();
                p1Var.setValue(l0.a(f182175a, str2, og.a.l(length, length), 4));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.shared.GearInputKt$NotesInputSection$1$4$1$1", f = "GearInput.kt", l = {115}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f171859a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i2.a f171860b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i2.a aVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f171860b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(this.f171860b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f171859a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f171859a = 1;
                if (this.f171860b.a(null, this) == aVar) {
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

    public static final void a(p3.m mVar, int i14) {
        o0 o0Var;
        o0 o0VarE = mVar.E(1605917974);
        if (o0VarE.n(i14 & 1, (i14 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            String str = NumberFormat.getIntegerInstance().format((Object) 250);
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.e eVar = j92.b.f97899b;
            float f14 = eVar.f97920e;
            bVar.getClass();
            h4.r rVarZ = c2.l.z(aVar, f14, eVar.f97917b);
            str.getClass();
            String strP = y.P(R.string.exceeds_char_limit_num_or_fewer, new Object[]{str}, o0VarE);
            d92.b.f58624b.getClass();
            o0Var = o0VarE;
            mh.c(strP, rVarZ, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97933j, o0VarE), o0Var, 0, 0, 131068);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new uj1.a(i14, 9);
        }
    }

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
    public static final void b(p1<Boolean> p1Var, String str, e23.l<? super String, Unit> lVar, p3.m mVar, int i14) {
        p1Var.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(-2085108277);
        int i15 = (o0VarE.B(p1Var) ? 4 : 2) | i14 | (o0VarE.B(str) ? 32 : 16) | (o0VarE.r(lVar) ? 256 : 128);
        if (o0VarE.n(i15 & 1, (i15 & 147) != 146)) {
            x1 x1Var = p3.n.f135158a;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0 b0Var = (b0) objQ;
            mc mcVarF = e9.f(true, null, o0VarE, 6, 2);
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var2 = (m4.b0) objQ2;
            Boolean f182175a = p1Var.getF182175a();
            int i16 = i15 & 14;
            boolean z14 = i16 == 4;
            Object objQ3 = o0VarE.q();
            if (z14 || objQ3 == c2565a) {
                objQ3 = new a(p1Var, b0Var2, null);
                o0VarE.K(objQ3);
            }
            p3.l0.e((e23.p) objQ3, f182175a, o0VarE);
            if (p1Var.getF182175a().booleanValue()) {
                o0VarE.C(651852229);
                boolean zR = (i16 == 4) | o0VarE.r(b0Var) | o0VarE.B(mcVarF);
                Object objQ4 = o0VarE.q();
                if (zR || objQ4 == c2565a) {
                    objQ4 = new fo.j(b0Var, mcVarF, p1Var, 19);
                    o0VarE.K(objQ4);
                }
                e23.a aVar = (e23.a) objQ4;
                boolean z15 = (i15 & 112) == 32;
                Object objQ5 = o0VarE.q();
                if (z15 || objQ5 == c2565a) {
                    objQ5 = p0.n(str == null ? "" : str);
                    o0VarE.K(objQ5);
                }
                p1 p1Var2 = (p1) objQ5;
                w wVar = w.f111301a;
                String strQ = y.Q(o0VarE, R.string.edit_notes);
                z3.e eVarC = z3.f.c(-743469433, new et.h(p1Var2, str, lVar, aVar), o0VarE);
                boolean zB = o0VarE.B(aVar);
                Object objQ6 = o0VarE.q();
                if (zB || objQ6 == c2565a) {
                    objQ6 = new u11.b(aVar, 24);
                    o0VarE.K(objQ6);
                }
                wVar.d(strQ, eVarC, (e23.a) objQ6, mcVarF, null, null, z3.f.c(409194834, new qk0.n(p1Var2, b0Var2), o0VarE), o0VarE, 1572912, 48);
                o0VarE.g0(false);
            } else {
                o0VarE.C(653314871);
                o0VarE.g0(false);
            }
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n(i14, lVar, str, p1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:102:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:36:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:41:0x0083  */
    /* JADX WARN: Code duplicated, block: B:43:0x0086  */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:52:0x00db  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x014e  */
    /* JADX WARN: Code duplicated, block: B:67:0x015c  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /* JADX WARN: Code duplicated, block: B:75:0x0188  */
    /* JADX WARN: Code duplicated, block: B:78:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01df A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:86:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fd A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:97:0x023b  */
    /* JADX WARN: Code duplicated, block: B:98:0x02c1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(String str, e23.l<? super String, Unit> lVar, h4.r rVar, m4.b0 b0Var, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        m4.b0 b0Var2;
        int i17;
        int i18;
        boolean z14;
        o0 o0Var;
        m4.b0 b0Var3;
        p2 p2VarI0;
        h4.r rVar3;
        Object objQ;
        p3.m.a.C2565a c2565a;
        b0 b0Var4;
        int i19;
        z zVarA;
        int iHashCode;
        i2 i2VarA0;
        h4.r rVarC;
        e0.a aVar;
        h5.g.a.b bVar;
        Object objQ2;
        p1 p1Var;
        Object objQ3;
        h4.r rVar4;
        p3.m.a.C2565a c2565a2;
        m4.b0 b0Var5;
        p1 p1Var2;
        boolean z15;
        Object objQ4;
        Object objQ5;
        i2.a aVar2;
        h4.r.a aVar3;
        z3.e eVar;
        boolean zR;
        Object objQ6;
        boolean z16;
        Object objQ7;
        str.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1856748024);
        int i24 = (o0VarE.B(str) ? 4 : 2) | i14 | (o0VarE.r(lVar) ? 32 : 16);
        int i25 = i15 & 4;
        if (i25 == 0) {
            if ((i14 & 384) == 0) {
                rVar2 = rVar;
                i24 |= o0VarE.B(rVar2) ? 256 : 128;
            }
            i16 = i15 & 8;
            if (i16 != 0) {
                if ((i14 & 3072) == 0) {
                    b0Var2 = b0Var;
                    if (o0VarE.B(b0Var2)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i24 |= i17;
                }
                i18 = i24;
                if ((i18 & 1171) != 1170) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i18 & 1, z14)) {
                    if (i25 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i16 != 0) {
                        b0Var2 = null;
                    }
                    x1 x1Var = p3.n.f135158a;
                    objQ = o0VarE.q();
                    p3.m.f135153a.getClass();
                    c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                        o0VarE.K(objQ);
                    }
                    b0Var4 = (b0) objQ;
                    i19 = i18 >> 6;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar3, o0VarE);
                    h5.g.V.getClass();
                    aVar = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    bVar = h5.g.a.f81813j;
                    if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                        v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.b0 b0Var6 = c2.b0.f22601a;
                    r1.b(y.Q(o0VarE, R.string.workout_add_notes), null, o0VarE, 0, 2);
                    objQ2 = o0VarE.q();
                    if (objQ2 == c2565a) {
                        objQ2 = p0.n(Boolean.FALSE);
                        o0VarE.K(objQ2);
                    }
                    p1Var = (p1) objQ2;
                    objQ3 = o0VarE.q();
                    if (objQ3 == c2565a) {
                        int length = str.length();
                        rVar4 = rVar3;
                        c2565a2 = c2565a;
                        b0Var5 = b0Var2;
                        objQ3 = p0.n(new l0(str, og.a.l(length, length), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                        o0VarE.K(objQ3);
                    } else {
                        rVar4 = rVar3;
                        c2565a2 = c2565a;
                        b0Var5 = b0Var2;
                    }
                    p1Var2 = (p1) objQ3;
                    if ((i18 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ4 = o0VarE.q();
                    if (z15 || objQ4 == c2565a2) {
                        objQ4 = new c(str, p1Var2, 0);
                        o0VarE.K(objQ4);
                    }
                    p3.l0.e((e23.p) objQ4, str, o0VarE);
                    z3.e eVarC = z3.f.c(-1908426935, new b71.n(lVar, 22, (byte) 0), o0VarE);
                    objQ5 = o0VarE.q();
                    if (objQ5 == c2565a2) {
                        objQ5 = new i2.c();
                        o0VarE.K(objQ5);
                    }
                    aVar2 = (i2.a) objQ5;
                    aVar3 = h4.r.S;
                    h4.r rVarA = i2.d.a(v2.b(aVar3, b0Var5, new u72.a(4), o0VarE, (i19 & 112) | 6), aVar2);
                    l0 l0Var = (l0) p1Var2.getF182175a();
                    String strQ = y.Q(o0VarE, R.string.add_your_gear_note);
                    if (((Boolean) p1Var.getF182175a()).booleanValue() || str.length() <= 0) {
                        eVar = null;
                    } else {
                        eVar = eVarC;
                    }
                    zR = o0VarE.r(b0Var4) | o0VarE.r(aVar2);
                    objQ6 = o0VarE.q();
                    if (zR || objQ6 == c2565a2) {
                        objQ6 = new dv0.k(b0Var4, p1Var, aVar2, 2);
                        o0VarE.K(objQ6);
                    }
                    e23.l lVar2 = (e23.l) objQ6;
                    if ((i18 & 112) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ7 = o0VarE.q();
                    if (z16 || objQ7 == c2565a2) {
                        objQ7 = new oy0.c(lVar, p1Var2, 8);
                        o0VarE.K(objQ7);
                    }
                    m4.b0 b0Var7 = b0Var5;
                    l72.p1.b(l0Var, rVarA, strQ, 2000, false, false, null, 0L, null, eVar, null, null, null, lVar2, (e23.l) objQ7, o0VarE, 27648, 0, 7648);
                    if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                        o0VarE.C(271811403);
                        NumberFormat integerInstance = NumberFormat.getIntegerInstance();
                        String str2 = integerInstance.format(Integer.valueOf(str.length()));
                        String str3 = integerInstance.format((Object) 2000);
                        d92.b.f58623a.getClass();
                        j92.b bVar2 = d92.b.f58625c;
                        bVar2.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        float f14 = eVar2.f97920e;
                        bVar2.getClass();
                        h4.r rVarF = x2.f(c2.l.z(aVar3, f14, eVar2.f97918c), 1.0f);
                        str2.getClass();
                        str3.getClass();
                        String strP = y.P(R.string.value_slash_value, new Object[]{str2, str3}, o0VarE);
                        d92.b.f58624b.getClass();
                        x0 x0VarF = d92.c.f(j92.f.f97935l, o0VarE);
                        d6.h.f57752b.getClass();
                        mh.c(strP, rVarF, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarF, o0VarE, 0, 0, 130044);
                        o0Var = o0VarE;
                        o0Var.g0(false);
                    } else {
                        o0Var = o0VarE;
                        o0Var.C(272477376);
                        o0Var.g0(false);
                    }
                    o0Var.g0(true);
                    b0Var3 = b0Var7;
                    rVar2 = rVar4;
                } else {
                    o0Var = o0VarE;
                    o0Var.e();
                    b0Var3 = b0Var2;
                }
                p2VarI0 = o0Var.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new f0(str, lVar, rVar2, b0Var3, i14, i15, 25);
                }
            }
            i24 |= 3072;
            b0Var2 = b0Var;
            i18 = i24;
            if ((i18 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                if (i25 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i16 != 0) {
                    b0Var2 = null;
                }
                x1 x1Var2 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ);
                }
                b0Var4 = (b0) objQ;
                i19 = i18 >> 6;
                c2.j.f22691a.getClass();
                c2.j.k kVar2 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar2, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar3, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var8 = c2.b0.f22601a;
                r1.b(y.Q(o0VarE, R.string.workout_add_notes), null, o0VarE, 0, 2);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ2);
                }
                p1Var = (p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    int length2 = str.length();
                    rVar4 = rVar3;
                    c2565a2 = c2565a;
                    b0Var5 = b0Var2;
                    objQ3 = p0.n(new l0(str, og.a.l(length2, length2), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ3);
                } else {
                    rVar4 = rVar3;
                    c2565a2 = c2565a;
                    b0Var5 = b0Var2;
                }
                p1Var2 = (p1) objQ3;
                if ((i18 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ4 = o0VarE.q();
                if (z15) {
                    objQ4 = new c(str, p1Var2, 0);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new c(str, p1Var2, 0);
                    o0VarE.K(objQ4);
                }
                p3.l0.e((e23.p) objQ4, str, o0VarE);
                z3.e eVarC2 = z3.f.c(-1908426935, new b71.n(lVar, 22, (byte) 0), o0VarE);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a2) {
                    objQ5 = new i2.c();
                    o0VarE.K(objQ5);
                }
                aVar2 = (i2.a) objQ5;
                aVar3 = h4.r.S;
                h4.r rVarA2 = i2.d.a(v2.b(aVar3, b0Var5, new u72.a(4), o0VarE, (i19 & 112) | 6), aVar2);
                l0 l0Var2 = (l0) p1Var2.getF182175a();
                String strQ2 = y.Q(o0VarE, R.string.add_your_gear_note);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    eVar = null;
                } else {
                    eVar = null;
                }
                zR = o0VarE.r(b0Var4) | o0VarE.r(aVar2);
                objQ6 = o0VarE.q();
                if (zR) {
                    objQ6 = new dv0.k(b0Var4, p1Var, aVar2, 2);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new dv0.k(b0Var4, p1Var, aVar2, 2);
                    o0VarE.K(objQ6);
                }
                e23.l lVar3 = (e23.l) objQ6;
                if ((i18 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ7 = o0VarE.q();
                if (z16) {
                    objQ7 = new oy0.c(lVar, p1Var2, 8);
                    o0VarE.K(objQ7);
                } else {
                    objQ7 = new oy0.c(lVar, p1Var2, 8);
                    o0VarE.K(objQ7);
                }
                m4.b0 b0Var9 = b0Var5;
                l72.p1.b(l0Var2, rVarA2, strQ2, 2000, false, false, null, 0L, null, eVar, null, null, null, lVar3, (e23.l) objQ7, o0VarE, 27648, 0, 7648);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(271811403);
                    NumberFormat integerInstance2 = NumberFormat.getIntegerInstance();
                    String str4 = integerInstance2.format(Integer.valueOf(str.length()));
                    String str5 = integerInstance2.format((Object) 2000);
                    d92.b.f58623a.getClass();
                    j92.b bVar3 = d92.b.f58625c;
                    bVar3.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f15 = eVar3.f97920e;
                    bVar3.getClass();
                    h4.r rVarF2 = x2.f(c2.l.z(aVar3, f15, eVar3.f97918c), 1.0f);
                    str4.getClass();
                    str5.getClass();
                    String strP2 = y.P(R.string.value_slash_value, new Object[]{str4, str5}, o0VarE);
                    d92.b.f58624b.getClass();
                    x0 x0VarF2 = d92.c.f(j92.f.f97935l, o0VarE);
                    d6.h.f57752b.getClass();
                    mh.c(strP2, rVarF2, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarF2, o0VarE, 0, 0, 130044);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                } else {
                    o0Var = o0VarE;
                    o0Var.C(272477376);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                b0Var3 = b0Var9;
                rVar2 = rVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                b0Var3 = b0Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f0(str, lVar, rVar2, b0Var3, i14, i15, 25);
            }
        }
        i24 |= 384;
        rVar2 = rVar;
        i16 = i15 & 8;
        if (i16 != 0) {
            if ((i14 & 3072) == 0) {
                b0Var2 = b0Var;
                if (o0VarE.B(b0Var2)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i24 |= i17;
            }
            i18 = i24;
            if ((i18 & 1171) != 1170) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i18 & 1, z14)) {
                if (i25 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i16 != 0) {
                    b0Var2 = null;
                }
                x1 x1Var3 = p3.n.f135158a;
                objQ = o0VarE.q();
                p3.m.f135153a.getClass();
                c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                    o0VarE.K(objQ);
                }
                b0Var4 = (b0) objQ;
                i19 = i18 >> 6;
                c2.j.f22691a.getClass();
                c2.j.k kVar3 = c2.j.f22694d;
                h4.d.f81522a.getClass();
                zVarA = c2.y.a(kVar3, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar3, o0VarE);
                h5.g.V.getClass();
                aVar = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                bVar = h5.g.a.f81813j;
                if (o0VarE.T) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                } else {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.b0 b0Var10 = c2.b0.f22601a;
                r1.b(y.Q(o0VarE, R.string.workout_add_notes), null, o0VarE, 0, 2);
                objQ2 = o0VarE.q();
                if (objQ2 == c2565a) {
                    objQ2 = p0.n(Boolean.FALSE);
                    o0VarE.K(objQ2);
                }
                p1Var = (p1) objQ2;
                objQ3 = o0VarE.q();
                if (objQ3 == c2565a) {
                    int length3 = str.length();
                    rVar4 = rVar3;
                    c2565a2 = c2565a;
                    b0Var5 = b0Var2;
                    objQ3 = p0.n(new l0(str, og.a.l(length3, length3), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                    o0VarE.K(objQ3);
                } else {
                    rVar4 = rVar3;
                    c2565a2 = c2565a;
                    b0Var5 = b0Var2;
                }
                p1Var2 = (p1) objQ3;
                if ((i18 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ4 = o0VarE.q();
                if (z15) {
                    objQ4 = new c(str, p1Var2, 0);
                    o0VarE.K(objQ4);
                } else {
                    objQ4 = new c(str, p1Var2, 0);
                    o0VarE.K(objQ4);
                }
                p3.l0.e((e23.p) objQ4, str, o0VarE);
                z3.e eVarC3 = z3.f.c(-1908426935, new b71.n(lVar, 22, (byte) 0), o0VarE);
                objQ5 = o0VarE.q();
                if (objQ5 == c2565a2) {
                    objQ5 = new i2.c();
                    o0VarE.K(objQ5);
                }
                aVar2 = (i2.a) objQ5;
                aVar3 = h4.r.S;
                h4.r rVarA3 = i2.d.a(v2.b(aVar3, b0Var5, new u72.a(4), o0VarE, (i19 & 112) | 6), aVar2);
                l0 l0Var3 = (l0) p1Var2.getF182175a();
                String strQ3 = y.Q(o0VarE, R.string.add_your_gear_note);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    eVar = null;
                } else {
                    eVar = null;
                }
                zR = o0VarE.r(b0Var4) | o0VarE.r(aVar2);
                objQ6 = o0VarE.q();
                if (zR) {
                    objQ6 = new dv0.k(b0Var4, p1Var, aVar2, 2);
                    o0VarE.K(objQ6);
                } else {
                    objQ6 = new dv0.k(b0Var4, p1Var, aVar2, 2);
                    o0VarE.K(objQ6);
                }
                e23.l lVar4 = (e23.l) objQ6;
                if ((i18 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ7 = o0VarE.q();
                if (z16) {
                    objQ7 = new oy0.c(lVar, p1Var2, 8);
                    o0VarE.K(objQ7);
                } else {
                    objQ7 = new oy0.c(lVar, p1Var2, 8);
                    o0VarE.K(objQ7);
                }
                m4.b0 b0Var11 = b0Var5;
                l72.p1.b(l0Var3, rVarA3, strQ3, 2000, false, false, null, 0L, null, eVar, null, null, null, lVar4, (e23.l) objQ7, o0VarE, 27648, 0, 7648);
                if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                    o0VarE.C(271811403);
                    NumberFormat integerInstance3 = NumberFormat.getIntegerInstance();
                    String str6 = integerInstance3.format(Integer.valueOf(str.length()));
                    String str7 = integerInstance3.format((Object) 2000);
                    d92.b.f58623a.getClass();
                    j92.b bVar4 = d92.b.f58625c;
                    bVar4.getClass();
                    j92.e eVar4 = j92.b.f97899b;
                    float f16 = eVar4.f97920e;
                    bVar4.getClass();
                    h4.r rVarF3 = x2.f(c2.l.z(aVar3, f16, eVar4.f97918c), 1.0f);
                    str6.getClass();
                    str7.getClass();
                    String strP3 = y.P(R.string.value_slash_value, new Object[]{str6, str7}, o0VarE);
                    d92.b.f58624b.getClass();
                    x0 x0VarF3 = d92.c.f(j92.f.f97935l, o0VarE);
                    d6.h.f57752b.getClass();
                    mh.c(strP3, rVarF3, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarF3, o0VarE, 0, 0, 130044);
                    o0Var = o0VarE;
                    o0Var.g0(false);
                } else {
                    o0Var = o0VarE;
                    o0Var.C(272477376);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                b0Var3 = b0Var11;
                rVar2 = rVar4;
            } else {
                o0Var = o0VarE;
                o0Var.e();
                b0Var3 = b0Var2;
            }
            p2VarI0 = o0Var.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new f0(str, lVar, rVar2, b0Var3, i14, i15, 25);
            }
        }
        i24 |= 3072;
        b0Var2 = b0Var;
        i18 = i24;
        if ((i18 & 1171) != 1170) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i18 & 1, z14)) {
            if (i25 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i16 != 0) {
                b0Var2 = null;
            }
            x1 x1Var4 = p3.n.f135158a;
            objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            b0Var4 = (b0) objQ;
            i19 = i18 >> 6;
            c2.j.f22691a.getClass();
            c2.j.k kVar4 = c2.j.f22694d;
            h4.d.f81522a.getClass();
            zVarA = c2.y.a(kVar4, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar3, o0VarE);
            h5.g.V.getClass();
            aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var12 = c2.b0.f22601a;
            r1.b(y.Q(o0VarE, R.string.workout_add_notes), null, o0VarE, 0, 2);
            objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ2);
            }
            p1Var = (p1) objQ2;
            objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                int length4 = str.length();
                rVar4 = rVar3;
                c2565a2 = c2565a;
                b0Var5 = b0Var2;
                objQ3 = p0.n(new l0(str, og.a.l(length4, length4), (w0) null, 4, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ3);
            } else {
                rVar4 = rVar3;
                c2565a2 = c2565a;
                b0Var5 = b0Var2;
            }
            p1Var2 = (p1) objQ3;
            if ((i18 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ4 = o0VarE.q();
            if (z15) {
                objQ4 = new c(str, p1Var2, 0);
                o0VarE.K(objQ4);
            } else {
                objQ4 = new c(str, p1Var2, 0);
                o0VarE.K(objQ4);
            }
            p3.l0.e((e23.p) objQ4, str, o0VarE);
            z3.e eVarC4 = z3.f.c(-1908426935, new b71.n(lVar, 22, (byte) 0), o0VarE);
            objQ5 = o0VarE.q();
            if (objQ5 == c2565a2) {
                objQ5 = new i2.c();
                o0VarE.K(objQ5);
            }
            aVar2 = (i2.a) objQ5;
            aVar3 = h4.r.S;
            h4.r rVarA4 = i2.d.a(v2.b(aVar3, b0Var5, new u72.a(4), o0VarE, (i19 & 112) | 6), aVar2);
            l0 l0Var4 = (l0) p1Var2.getF182175a();
            String strQ4 = y.Q(o0VarE, R.string.add_your_gear_note);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                eVar = null;
            } else {
                eVar = null;
            }
            zR = o0VarE.r(b0Var4) | o0VarE.r(aVar2);
            objQ6 = o0VarE.q();
            if (zR) {
                objQ6 = new dv0.k(b0Var4, p1Var, aVar2, 2);
                o0VarE.K(objQ6);
            } else {
                objQ6 = new dv0.k(b0Var4, p1Var, aVar2, 2);
                o0VarE.K(objQ6);
            }
            e23.l lVar5 = (e23.l) objQ6;
            if ((i18 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            objQ7 = o0VarE.q();
            if (z16) {
                objQ7 = new oy0.c(lVar, p1Var2, 8);
                o0VarE.K(objQ7);
            } else {
                objQ7 = new oy0.c(lVar, p1Var2, 8);
                o0VarE.K(objQ7);
            }
            m4.b0 b0Var13 = b0Var5;
            l72.p1.b(l0Var4, rVarA4, strQ4, 2000, false, false, null, 0L, null, eVar, null, null, null, lVar5, (e23.l) objQ7, o0VarE, 27648, 0, 7648);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(271811403);
                NumberFormat integerInstance4 = NumberFormat.getIntegerInstance();
                String str8 = integerInstance4.format(Integer.valueOf(str.length()));
                String str9 = integerInstance4.format((Object) 2000);
                d92.b.f58623a.getClass();
                j92.b bVar5 = d92.b.f58625c;
                bVar5.getClass();
                j92.e eVar5 = j92.b.f97899b;
                float f17 = eVar5.f97920e;
                bVar5.getClass();
                h4.r rVarF4 = x2.f(c2.l.z(aVar3, f17, eVar5.f97918c), 1.0f);
                str8.getClass();
                str9.getClass();
                String strP4 = y.P(R.string.value_slash_value, new Object[]{str8, str9}, o0VarE);
                d92.b.f58624b.getClass();
                x0 x0VarF4 = d92.c.f(j92.f.f97935l, o0VarE);
                d6.h.f57752b.getClass();
                mh.c(strP4, rVarF4, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57758h), 0L, 0, false, 0, 0, null, x0VarF4, o0VarE, 0, 0, 130044);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0Var = o0VarE;
                o0Var.C(272477376);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            b0Var3 = b0Var13;
            rVar2 = rVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            b0Var3 = b0Var2;
        }
        p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new f0(str, lVar, rVar2, b0Var3, i14, i15, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(String str, String str2, String str3, String str4, int i14, boolean z14, e23.l lVar, e23.p pVar, p3.m mVar, int i15) {
        str.getClass();
        str4.getClass();
        lVar.getClass();
        o0 o0VarE = mVar.E(1619434517);
        int i16 = i15 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.B(str3) ? 256 : 128) | (o0VarE.B(str4) ? 2048 : 1024) | (o0VarE.k(i14) ? 16384 : 8192) | (o0VarE.h(z14) ? 131072 : 65536) | (o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(pVar) ? 8388608 : 4194304);
        if (o0VarE.n(i16 & 1, (4793491 & i16) != 4793490)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = new Object[0];
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new uf2.p0(16);
                o0VarE.K(objQ);
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 48);
            l72.p2.f111205a.b(null, z3.f.c(1875135251, new a82.b(str3, str2, str, i14, z14, lVar, p1Var), o0VarE), gg.b.o(((Boolean) p1Var.getF182175a()).booleanValue(), z3.f.c(-1968580592, new h3(str4, 29), o0VarE), o0VarE), pVar, o0VarE, ((i16 >> 12) & 7168) | 48, 1);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(str, str2, str3, str4, i14, z14, lVar, pVar, i15);
        }
    }
}
