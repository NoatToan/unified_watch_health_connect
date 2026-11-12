package r1;

import java.util.ListIterator;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T f149146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h4.r f149147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s1.f0<Float> f149148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f149149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.q<T, p3.m, Integer, Unit> f149150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f149151f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f149152g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(T t7, h4.r rVar, s1.f0<Float> f0Var, String str, e23.q<? super T, ? super p3.m, ? super Integer, Unit> qVar, int i14, int i15) {
            super(2);
            this.f149146a = t7;
            this.f149147b = rVar;
            this.f149148c = f0Var;
            this.f149149d = str;
            this.f149150e = qVar;
            this.f149151f = i14;
            this.f149152g = i15;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            num.intValue();
            m0.a(this.f149146a, this.f149147b, this.f149148c, this.f149149d, this.f149150e, mVar, p3.p0.t(this.f149151f | 1), this.f149152g);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> extends p005kotlin.jvm.internal.w implements e23.l<T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f149153a = new b();

        public b() {
            super(1);
        }

        @Override // e23.l
        public final T invoke(T t7) {
            return t7;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class c<T> extends p005kotlin.jvm.internal.w implements e23.l<T, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1.t1<T> f149154a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s1.t1<T> t1Var) {
            super(1);
            this.f149154a = t1Var;
        }

        @Override // e23.l
        public final Boolean invoke(Object obj) {
            return Boolean.valueOf(!p005kotlin.jvm.internal.s.g(obj, this.f149154a.f155747d.getF182175a()));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "(Lp3/m;I)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1.t1<T> f149155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s1.f0<Float> f149156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f149157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.q<T, p3.m, Integer, Unit> f149158d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(s1.t1<T> t1Var, s1.f0<Float> f0Var, T t7, e23.q<? super T, ? super p3.m, ? super Integer, Unit> qVar) {
            super(2);
            this.f149155a = t1Var;
            this.f149156b = f0Var;
            this.f149157c = t7;
            this.f149158d = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0054  */
        /* JADX WARN: Code duplicated, block: B:16:0x005f  */
        /* JADX WARN: Code duplicated, block: B:17:0x0064  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:47:0x0122  */
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
        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            Object objA;
            f4.f fVarA;
            e23.l<Object, Unit> f68724f;
            f4.f fVarB;
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                o0 o0Var = new o0(this.f149156b);
                p005kotlin.jvm.internal.m mVar3 = p005kotlin.jvm.internal.m.f105803a;
                s1.d2 d2Var = s1.e2.f155568a;
                s1.t1<T> t1Var = this.f149155a;
                boolean zI = t1Var.i();
                s1.a2<S> a2Var = t1Var.f155744a;
                p3.m.a aVar = p3.m.f135153a;
                if (zI) {
                    mVar2.C(1666827533);
                    mVar2.f();
                    objA = a2Var.a();
                } else {
                    mVar2.C(1666573488);
                    boolean zB = mVar2.B(t1Var);
                    objA = mVar2.q();
                    if (zB) {
                        f4.f.f68735e.getClass();
                        fVarA = f4.f.a.a();
                        if (fVarA != null) {
                            f68724f = fVarA.getF68799i();
                        } else {
                            f68724f = null;
                        }
                        fVarB = f4.f.a.b(fVarA);
                        Object objA2 = a2Var.a();
                        f4.f.a.e(fVarA, fVarB, f68724f);
                        mVar2.K(objA2);
                        objA = objA2;
                    } else {
                        aVar.getClass();
                        if (objA == p3.m.a.f135155b) {
                            f4.f.f68735e.getClass();
                            fVarA = f4.f.a.a();
                            if (fVarA != null) {
                                f68724f = fVarA.getF68799i();
                            } else {
                                f68724f = null;
                            }
                            fVarB = f4.f.a.b(fVarA);
                            try {
                                Object objA3 = a2Var.a();
                                f4.f.a.e(fVarA, fVarB, f68724f);
                                mVar2.K(objA3);
                                objA = objA3;
                            } catch (Throwable th3) {
                                f4.f.a.e(fVarA, fVarB, f68724f);
                                throw th3;
                            }
                        }
                    }
                    mVar2.f();
                }
                mVar2.C(1378811975);
                T t7 = this.f149157c;
                float f14 = p005kotlin.jvm.internal.s.g(objA, t7) ? 1.0f : 0.0f;
                mVar2.f();
                Float fValueOf = Float.valueOf(f14);
                boolean zB2 = mVar2.B(t1Var);
                Object objQ = mVar2.q();
                if (zB2) {
                    objQ = p3.p0.f(new p0(t1Var));
                    mVar2.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = p3.p0.f(new p0(t1Var));
                        mVar2.K(objQ);
                    }
                }
                Object f182175a = ((x3) objQ).getF182175a();
                mVar2.C(1378811975);
                float f15 = p005kotlin.jvm.internal.s.g(f182175a, t7) ? 1.0f : 0.0f;
                mVar2.f();
                Float fValueOf2 = Float.valueOf(f15);
                boolean zB3 = mVar2.B(t1Var);
                Object objQ2 = mVar2.q();
                if (zB3) {
                    objQ2 = p3.p0.f(new q0(t1Var));
                    mVar2.K(objQ2);
                } else {
                    aVar.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = p3.p0.f(new q0(t1Var));
                        mVar2.K(objQ2);
                    }
                }
                s1.t1.d dVarC = s1.w1.c(t1Var, fValueOf, fValueOf2, o0Var.invoke(((x3) objQ2).getF182175a(), mVar2, 0), d2Var, "FloatAnimation", mVar2, 0);
                h4.r.a aVar2 = h4.r.S;
                boolean zB4 = mVar2.B(dVarC);
                Object objQ3 = mVar2.q();
                if (zB4) {
                    objQ3 = new n0(dVarC);
                    mVar2.K(objQ3);
                } else {
                    aVar.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new n0(dVarC);
                        mVar2.K(objQ3);
                    }
                }
                h4.r rVarA = o4.s0.a(aVar2, (e23.l) objQ3);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                int iHashCode = Long.hashCode(mVar2.getU());
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC = h4.k.c(rVarA, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar3 = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar3);
                } else {
                    mVar2.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                b4.a(mVar2, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                b4.b(h5.g.a.f81814k, mVar2);
                b4.c(h5.g.a.f81807d, rVarC, mVar2);
                c2.u uVar = c2.u.f22885a;
                this.f149158d.invoke(t7, mVar2, 0);
                mVar2.y();
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class e extends p005kotlin.jvm.internal.w implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s1.t1<T> f149159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h4.r f149160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s1.f0<Float> f149161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<T, Object> f149162d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.q<T, p3.m, Integer, Unit> f149163e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f149164f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f149165g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(s1.t1<T> t1Var, h4.r rVar, s1.f0<Float> f0Var, e23.l<? super T, ? extends Object> lVar, e23.q<? super T, ? super p3.m, ? super Integer, Unit> qVar, int i14, int i15) {
            super(2);
            this.f149159a = t1Var;
            this.f149160b = rVar;
            this.f149161c = f0Var;
            this.f149162d = lVar;
            this.f149163e = qVar;
            this.f149164f = i14;
            this.f149165g = i15;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            num.intValue();
            m0.b(this.f149159a, this.f149160b, this.f149161c, this.f149162d, this.f149163e, mVar, p3.p0.t(this.f149164f | 1), this.f149165g);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0084  */
    /* JADX WARN: Code duplicated, block: B:55:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    public static final <T> void a(T t7, h4.r rVar, s1.f0<Float> f0Var, String str, e23.q<? super T, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15) {
        int i16;
        h4.r rVar2;
        int i17;
        s1.f0<Float> f0Var2;
        int i18;
        int i19;
        String str2;
        int i24;
        boolean z14;
        s1.f0<Float> f0Var3;
        String str3;
        p3.p2 p2VarI0;
        h4.r rVar3;
        s1.f0<Float> f0VarD;
        String str4;
        int i25;
        p3.o0 o0VarE = mVar.E(-513216493);
        if ((i14 & 6) == 0) {
            i16 = ((i14 & 8) == 0 ? o0VarE.B(t7) : o0VarE.r(t7) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i26 = i15 & 2;
        if (i26 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i16 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            i17 = i15 & 4;
            if (i17 != 0) {
                if ((i14 & 384) == 0) {
                    f0Var2 = f0Var;
                    if (o0VarE.r(f0Var2)) {
                        i18 = 256;
                    } else {
                        i18 = 128;
                    }
                    i16 |= i18;
                }
                i19 = i15 & 8;
                if (i19 != 0) {
                    if ((i14 & 3072) == 0) {
                        str2 = str;
                        if (o0VarE.B(str2)) {
                            i24 = 2048;
                        } else {
                            i24 = 1024;
                        }
                        i16 |= i24;
                    }
                    if ((i14 & 24576) == 0) {
                        if (o0VarE.r(qVar)) {
                            i25 = 16384;
                        } else {
                            i25 = 8192;
                        }
                        i16 |= i25;
                    }
                    if ((i16 & 9363) != 9362) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i16 & 1, z14)) {
                        if (i26 != 0) {
                            rVar3 = h4.r.S;
                        } else {
                            rVar3 = rVar2;
                        }
                        if (i17 != 0) {
                            f0VarD = s1.l.d(0, 0, null, 7);
                        } else {
                            f0VarD = f0Var2;
                        }
                        if (i19 != 0) {
                            str4 = "Crossfade";
                        } else {
                            str4 = str2;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        b(s1.w1.e(t7, str4, o0VarE, (i16 & 14) | ((i16 >> 6) & 112), 0), rVar3, f0VarD, null, qVar, o0VarE, i16 & 58352, 4);
                        str3 = str4;
                        rVar2 = rVar3;
                        f0Var3 = f0VarD;
                    } else {
                        o0VarE.e();
                        f0Var3 = f0Var2;
                        str3 = str2;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new a(t7, rVar2, f0Var3, str3, qVar, i14, i15);
                    }
                }
                i16 |= 3072;
                str2 = str;
                if ((i14 & 24576) == 0) {
                    if (o0VarE.r(qVar)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i16 |= i25;
                }
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        f0VarD = s1.l.d(0, 0, null, 7);
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i19 != 0) {
                        str4 = "Crossfade";
                    } else {
                        str4 = str2;
                    }
                    p3.x1 x1Var2 = p3.n.f135158a;
                    b(s1.w1.e(t7, str4, o0VarE, (i16 & 14) | ((i16 >> 6) & 112), 0), rVar3, f0VarD, null, qVar, o0VarE, i16 & 58352, 4);
                    str3 = str4;
                    rVar2 = rVar3;
                    f0Var3 = f0VarD;
                } else {
                    o0VarE.e();
                    f0Var3 = f0Var2;
                    str3 = str2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a(t7, rVar2, f0Var3, str3, qVar, i14, i15);
                }
            }
            i16 |= 384;
            f0Var2 = f0Var;
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    str2 = str;
                    if (o0VarE.B(str2)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarE.r(qVar)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i16 |= i25;
                }
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        f0VarD = s1.l.d(0, 0, null, 7);
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i19 != 0) {
                        str4 = "Crossfade";
                    } else {
                        str4 = str2;
                    }
                    p3.x1 x1Var3 = p3.n.f135158a;
                    b(s1.w1.e(t7, str4, o0VarE, (i16 & 14) | ((i16 >> 6) & 112), 0), rVar3, f0VarD, null, qVar, o0VarE, i16 & 58352, 4);
                    str3 = str4;
                    rVar2 = rVar3;
                    f0Var3 = f0VarD;
                } else {
                    o0VarE.e();
                    f0Var3 = f0Var2;
                    str3 = str2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a(t7, rVar2, f0Var3, str3, qVar, i14, i15);
                }
            }
            i16 |= 3072;
            str2 = str;
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(qVar)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i16 |= i25;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    f0VarD = s1.l.d(0, 0, null, 7);
                } else {
                    f0VarD = f0Var2;
                }
                if (i19 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                p3.x1 x1Var4 = p3.n.f135158a;
                b(s1.w1.e(t7, str4, o0VarE, (i16 & 14) | ((i16 >> 6) & 112), 0), rVar3, f0VarD, null, qVar, o0VarE, i16 & 58352, 4);
                str3 = str4;
                rVar2 = rVar3;
                f0Var3 = f0VarD;
            } else {
                o0VarE.e();
                f0Var3 = f0Var2;
                str3 = str2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a(t7, rVar2, f0Var3, str3, qVar, i14, i15);
            }
        }
        i16 |= 48;
        rVar2 = rVar;
        i17 = i15 & 4;
        if (i17 != 0) {
            if ((i14 & 384) == 0) {
                f0Var2 = f0Var;
                if (o0VarE.r(f0Var2)) {
                    i18 = 256;
                } else {
                    i18 = 128;
                }
                i16 |= i18;
            }
            i19 = i15 & 8;
            if (i19 != 0) {
                if ((i14 & 3072) == 0) {
                    str2 = str;
                    if (o0VarE.B(str2)) {
                        i24 = 2048;
                    } else {
                        i24 = 1024;
                    }
                    i16 |= i24;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarE.r(qVar)) {
                        i25 = 16384;
                    } else {
                        i25 = 8192;
                    }
                    i16 |= i25;
                }
                if ((i16 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i16 & 1, z14)) {
                    if (i26 != 0) {
                        rVar3 = h4.r.S;
                    } else {
                        rVar3 = rVar2;
                    }
                    if (i17 != 0) {
                        f0VarD = s1.l.d(0, 0, null, 7);
                    } else {
                        f0VarD = f0Var2;
                    }
                    if (i19 != 0) {
                        str4 = "Crossfade";
                    } else {
                        str4 = str2;
                    }
                    p3.x1 x1Var5 = p3.n.f135158a;
                    b(s1.w1.e(t7, str4, o0VarE, (i16 & 14) | ((i16 >> 6) & 112), 0), rVar3, f0VarD, null, qVar, o0VarE, i16 & 58352, 4);
                    str3 = str4;
                    rVar2 = rVar3;
                    f0Var3 = f0VarD;
                } else {
                    o0VarE.e();
                    f0Var3 = f0Var2;
                    str3 = str2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new a(t7, rVar2, f0Var3, str3, qVar, i14, i15);
                }
            }
            i16 |= 3072;
            str2 = str;
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(qVar)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i16 |= i25;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    f0VarD = s1.l.d(0, 0, null, 7);
                } else {
                    f0VarD = f0Var2;
                }
                if (i19 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                p3.x1 x1Var6 = p3.n.f135158a;
                b(s1.w1.e(t7, str4, o0VarE, (i16 & 14) | ((i16 >> 6) & 112), 0), rVar3, f0VarD, null, qVar, o0VarE, i16 & 58352, 4);
                str3 = str4;
                rVar2 = rVar3;
                f0Var3 = f0VarD;
            } else {
                o0VarE.e();
                f0Var3 = f0Var2;
                str3 = str2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a(t7, rVar2, f0Var3, str3, qVar, i14, i15);
            }
        }
        i16 |= 384;
        f0Var2 = f0Var;
        i19 = i15 & 8;
        if (i19 != 0) {
            if ((i14 & 3072) == 0) {
                str2 = str;
                if (o0VarE.B(str2)) {
                    i24 = 2048;
                } else {
                    i24 = 1024;
                }
                i16 |= i24;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(qVar)) {
                    i25 = 16384;
                } else {
                    i25 = 8192;
                }
                i16 |= i25;
            }
            if ((i16 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i16 & 1, z14)) {
                if (i26 != 0) {
                    rVar3 = h4.r.S;
                } else {
                    rVar3 = rVar2;
                }
                if (i17 != 0) {
                    f0VarD = s1.l.d(0, 0, null, 7);
                } else {
                    f0VarD = f0Var2;
                }
                if (i19 != 0) {
                    str4 = "Crossfade";
                } else {
                    str4 = str2;
                }
                p3.x1 x1Var7 = p3.n.f135158a;
                b(s1.w1.e(t7, str4, o0VarE, (i16 & 14) | ((i16 >> 6) & 112), 0), rVar3, f0VarD, null, qVar, o0VarE, i16 & 58352, 4);
                str3 = str4;
                rVar2 = rVar3;
                f0Var3 = f0VarD;
            } else {
                o0VarE.e();
                f0Var3 = f0Var2;
                str3 = str2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new a(t7, rVar2, f0Var3, str3, qVar, i14, i15);
            }
        }
        i16 |= 3072;
        str2 = str;
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(qVar)) {
                i25 = 16384;
            } else {
                i25 = 8192;
            }
            i16 |= i25;
        }
        if ((i16 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i16 & 1, z14)) {
            if (i26 != 0) {
                rVar3 = h4.r.S;
            } else {
                rVar3 = rVar2;
            }
            if (i17 != 0) {
                f0VarD = s1.l.d(0, 0, null, 7);
            } else {
                f0VarD = f0Var2;
            }
            if (i19 != 0) {
                str4 = "Crossfade";
            } else {
                str4 = str2;
            }
            p3.x1 x1Var8 = p3.n.f135158a;
            b(s1.w1.e(t7, str4, o0VarE, (i16 & 14) | ((i16 >> 6) & 112), 0), rVar3, f0VarD, null, qVar, o0VarE, i16 & 58352, 4);
            str3 = str4;
            rVar2 = rVar3;
            f0Var3 = f0VarD;
        } else {
            o0VarE.e();
            f0Var3 = f0Var2;
            str3 = str2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a(t7, rVar2, f0Var3, str3, qVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0171  */
    /* JADX WARN: Code duplicated, block: B:104:0x0188 A[LOOP:0: B:99:0x0167->B:104:0x0188, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x018e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0196  */
    /* JADX WARN: Code duplicated, block: B:111:0x01a7 A[LOOP:1: B:110:0x01a5->B:111:0x01a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:116:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:122:0x0225  */
    /* JADX WARN: Code duplicated, block: B:124:0x023b  */
    /* JADX WARN: Code duplicated, block: B:126:0x0245  */
    /* JADX WARN: Code duplicated, block: B:129:0x0266  */
    /* JADX WARN: Code duplicated, block: B:131:0x026a  */
    /* JADX WARN: Code duplicated, block: B:134:0x0276  */
    /* JADX WARN: Code duplicated, block: B:136:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x018c A[EDGE_INSN: B:137:0x018c->B:106:0x018c BREAK  A[LOOP:0: B:99:0x0167->B:104:0x0188], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043  */
    /* JADX WARN: Code duplicated, block: B:27:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0059  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0101  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:85:0x0123  */
    /* JADX WARN: Code duplicated, block: B:87:0x012e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0130  */
    /* JADX WARN: Code duplicated, block: B:91:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0139  */
    /* JADX WARN: Code duplicated, block: B:95:0x014e  */
    /* JADX WARN: Code duplicated, block: B:98:0x015c  */
    public static final <T> void b(s1.t1<T> t1Var, h4.r rVar, s1.f0<Float> f0Var, e23.l<? super T, ? extends Object> lVar, e23.q<? super T, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15) {
        h4.r rVar2;
        int i16;
        s1.f0<Float> f0Var2;
        int i17;
        int i18;
        e23.l<? super T, ? extends Object> lVar2;
        int i19;
        boolean z14;
        h4.r rVar3;
        s1.f0<Float> f0Var3;
        e23.l<? super T, ? extends Object> lVar3;
        p3.p2 p2VarI0;
        h4.r rVar4;
        s1.f0<Float> f0VarD;
        p3.m.a aVar;
        e23.l<? super T, ? extends Object> lVar4;
        Object objQ;
        Object obj;
        Object obj2;
        f4.s sVar;
        Object objQ2;
        p1.t0 t0Var;
        s1.a2<T> a2Var;
        p3.c2 c2Var;
        f5.z0 z0VarD;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        h5.e0.a aVar2;
        int size;
        int i24;
        e23.p pVar;
        ListIterator<T> listIterator;
        int i25;
        f4.z zVar;
        int size2;
        int i26;
        boolean z15;
        Object objQ3;
        Object objQ4;
        int i27;
        p3.o0 o0VarE = mVar.E(-1877370462);
        int i28 = (i14 & 6) == 0 ? (o0VarE.B(t1Var) ? 4 : 2) | i14 : i14;
        int i29 = i15 & 1;
        if (i29 == 0) {
            if ((i14 & 48) == 0) {
                rVar2 = rVar;
                i28 |= o0VarE.B(rVar2) ? 32 : 16;
            }
            i16 = i15 & 2;
            if (i16 != 0) {
                if ((i14 & 384) == 0) {
                    f0Var2 = f0Var;
                    if (o0VarE.r(f0Var2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i28 |= i17;
                }
                i18 = i15 & 4;
                if (i18 != 0) {
                    if ((i14 & 3072) == 0) {
                        lVar2 = lVar;
                        if (o0VarE.r(lVar2)) {
                            i19 = 2048;
                        } else {
                            i19 = 1024;
                        }
                        i28 |= i19;
                    }
                    if ((i14 & 24576) == 0) {
                        if (o0VarE.r(qVar)) {
                            i27 = 16384;
                        } else {
                            i27 = 8192;
                        }
                        i28 |= i27;
                    }
                    if ((i28 & 9363) != 9362) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (o0VarE.n(i28 & 1, z14)) {
                        if (i29 != 0) {
                            rVar4 = h4.r.S;
                        } else {
                            rVar4 = rVar2;
                        }
                        if (i16 != 0) {
                            f0VarD = s1.l.d(0, 0, null, 7);
                        } else {
                            f0VarD = f0Var2;
                        }
                        aVar = p3.m.f135153a;
                        if (i18 != 0) {
                            objQ4 = o0VarE.q();
                            aVar.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = b.f149153a;
                                o0VarE.K(objQ4);
                            }
                            lVar4 = (e23.l) objQ4;
                        } else {
                            lVar4 = lVar2;
                        }
                        p3.x1 x1Var = p3.n.f135158a;
                        objQ = o0VarE.q();
                        aVar.getClass();
                        obj = p3.m.a.f135155b;
                        obj2 = objQ;
                        if (objQ == obj) {
                            f4.s sVar2 = new f4.s();
                            sVar2.add(t1Var.f155744a.a());
                            o0VarE.K(sVar2);
                            obj2 = sVar2;
                        }
                        sVar = (f4.s) obj2;
                        objQ2 = o0VarE.q();
                        if (objQ2 == obj) {
                            objQ2 = p1.g1.b();
                            o0VarE.K(objQ2);
                        }
                        t0Var = (p1.t0) objQ2;
                        a2Var = t1Var.f155744a;
                        c2Var = t1Var.f155747d;
                        if (p005kotlin.jvm.internal.s.g(a2Var.a(), c2Var.getF182175a())) {
                            o0VarE.C(321145192);
                            if (sVar.size() == 1 || !p005kotlin.jvm.internal.s.g(sVar.get(0), c2Var.getF182175a())) {
                                o0VarE.C(321279546);
                                if ((i28 & 14) == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                objQ3 = o0VarE.q();
                                if (z15 || objQ3 == obj) {
                                    objQ3 = new c(t1Var);
                                    o0VarE.K(objQ3);
                                }
                                p13.d0.B((e23.l) objQ3, sVar);
                                t0Var.g();
                            } else {
                                o0VarE.C(316295552);
                            }
                            o0VarE.g0(false);
                        } else {
                            o0VarE.C(316295552);
                        }
                        o0VarE.g0(false);
                        if (t0Var.a(c2Var.getF182175a())) {
                            o0VarE.C(316295552);
                        } else {
                            o0VarE.C(321536443);
                            listIterator = sVar.listIterator();
                            i25 = 0;
                            while (true) {
                                zVar = (f4.z) listIterator;
                                if (zVar.hasNext()) {
                                    i25 = -1;
                                    break;
                                } else if (p005kotlin.jvm.internal.s.g(lVar4.invoke((Object) zVar.next()), lVar4.invoke(c2Var.getF182175a()))) {
                                    break;
                                } else {
                                    i25++;
                                }
                            }
                            if (i25 == -1) {
                                sVar.add(c2Var.getF182175a());
                            } else {
                                sVar.set(i25, c2Var.getF182175a());
                            }
                            t0Var.g();
                            size2 = sVar.size();
                            for (i26 = 0; i26 < size2; i26++) {
                                Object obj3 = sVar.get(i26);
                                t0Var.m(obj3, z3.f.c(-934471669, new d(t1Var, f0VarD, obj3, qVar), o0VarE));
                            }
                        }
                        o0VarE.g0(false);
                        h4.d.f81522a.getClass();
                        z0VarD = c2.q.d(h4.d.a.f81524b, false);
                        p3.x1 x1Var2 = p3.n.f135158a;
                        iHashCode = Long.hashCode(o0VarE.U);
                        i2VarA0 = o0VarE.a0();
                        rVarC = h4.k.c(rVar4, o0VarE);
                        h5.g.V.getClass();
                        aVar2 = h5.g.a.f81805b;
                        if (o0VarE.f135177b != null) {
                            p3.p0.l();
                            throw null;
                        }
                        o0VarE.z();
                        if (o0VarE.T) {
                            o0VarE.M(aVar2);
                        } else {
                            o0VarE.c();
                        }
                        b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                        b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                        b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                        b4.b(h5.g.a.f81814k, o0VarE);
                        b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                        c2.u uVar = c2.u.f22885a;
                        o0VarE.C(-1312707512);
                        size = sVar.size();
                        for (i24 = 0; i24 < size; i24++) {
                            a0.g gVar = (Object) sVar.get(i24);
                            o0VarE.N(1171574969, lVar4.invoke(gVar));
                            pVar = (e23.p) t0Var.d(gVar);
                            if (pVar == null) {
                                o0VarE.C(1959122128);
                            } else {
                                o0VarE.C(1171576145);
                                pVar.invoke(o0VarE, 0);
                            }
                            o0VarE.g0(false);
                            o0VarE.g0(false);
                        }
                        o0VarE.g0(false);
                        o0VarE.g0(true);
                        p3.x1 x1Var3 = p3.n.f135158a;
                        rVar3 = rVar4;
                        f0Var3 = f0VarD;
                        lVar3 = lVar4;
                    } else {
                        o0VarE.e();
                        rVar3 = rVar2;
                        f0Var3 = f0Var2;
                        lVar3 = lVar2;
                    }
                    p2VarI0 = o0VarE.i0();
                    if (p2VarI0 != null) {
                        p2VarI0.f135219d = new e(t1Var, rVar3, f0Var3, lVar3, qVar, i14, i15);
                    }
                }
                i28 |= 3072;
                lVar2 = lVar;
                if ((i14 & 24576) == 0) {
                    if (o0VarE.r(qVar)) {
                        i27 = 16384;
                    } else {
                        i27 = 8192;
                    }
                    i28 |= i27;
                }
                if ((i28 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i28 & 1, z14)) {
                    if (i29 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i16 != 0) {
                        f0VarD = s1.l.d(0, 0, null, 7);
                    } else {
                        f0VarD = f0Var2;
                    }
                    aVar = p3.m.f135153a;
                    if (i18 != 0) {
                        objQ4 = o0VarE.q();
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = b.f149153a;
                            o0VarE.K(objQ4);
                        }
                        lVar4 = (e23.l) objQ4;
                    } else {
                        lVar4 = lVar2;
                    }
                    p3.x1 x1Var4 = p3.n.f135158a;
                    objQ = o0VarE.q();
                    aVar.getClass();
                    obj = p3.m.a.f135155b;
                    obj2 = objQ;
                    if (objQ == obj) {
                        f4.s sVar3 = new f4.s();
                        sVar3.add(t1Var.f155744a.a());
                        o0VarE.K(sVar3);
                        obj2 = sVar3;
                    }
                    sVar = (f4.s) obj2;
                    objQ2 = o0VarE.q();
                    if (objQ2 == obj) {
                        objQ2 = p1.g1.b();
                        o0VarE.K(objQ2);
                    }
                    t0Var = (p1.t0) objQ2;
                    a2Var = t1Var.f155744a;
                    c2Var = t1Var.f155747d;
                    if (p005kotlin.jvm.internal.s.g(a2Var.a(), c2Var.getF182175a())) {
                        o0VarE.C(321145192);
                        if (sVar.size() == 1) {
                            o0VarE.C(321279546);
                            if ((i28 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objQ3 = o0VarE.q();
                            if (z15) {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            }
                            p13.d0.B((e23.l) objQ3, sVar);
                            t0Var.g();
                        } else {
                            o0VarE.C(321279546);
                            if ((i28 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objQ3 = o0VarE.q();
                            if (z15) {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            }
                            p13.d0.B((e23.l) objQ3, sVar);
                            t0Var.g();
                        }
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(316295552);
                    }
                    o0VarE.g0(false);
                    if (t0Var.a(c2Var.getF182175a())) {
                        o0VarE.C(321536443);
                        listIterator = sVar.listIterator();
                        i25 = 0;
                        while (true) {
                            zVar = (f4.z) listIterator;
                            if (zVar.hasNext()) {
                                i25 = -1;
                                break;
                            } else {
                                if (p005kotlin.jvm.internal.s.g(lVar4.invoke((Object) zVar.next()), lVar4.invoke(c2Var.getF182175a()))) {
                                    break;
                                    break;
                                }
                                i25++;
                            }
                        }
                        if (i25 == -1) {
                            sVar.add(c2Var.getF182175a());
                        } else {
                            sVar.set(i25, c2Var.getF182175a());
                        }
                        t0Var.g();
                        size2 = sVar.size();
                        while (i26 < size2) {
                            Object obj4 = sVar.get(i26);
                            t0Var.m(obj4, z3.f.c(-934471669, new d(t1Var, f0VarD, obj4, qVar), o0VarE));
                        }
                    } else {
                        o0VarE.C(316295552);
                    }
                    o0VarE.g0(false);
                    h4.d.f81522a.getClass();
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    p3.x1 x1Var5 = p3.n.f135158a;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar4, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                    b4.b(h5.g.a.f81814k, o0VarE);
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.u uVar2 = c2.u.f22885a;
                    o0VarE.C(-1312707512);
                    size = sVar.size();
                    while (i24 < size) {
                        a0.g gVar2 = (Object) sVar.get(i24);
                        o0VarE.N(1171574969, lVar4.invoke(gVar2));
                        pVar = (e23.p) t0Var.d(gVar2);
                        if (pVar == null) {
                            o0VarE.C(1959122128);
                        } else {
                            o0VarE.C(1171576145);
                            pVar.invoke(o0VarE, 0);
                        }
                        o0VarE.g0(false);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                    o0VarE.g0(true);
                    p3.x1 x1Var6 = p3.n.f135158a;
                    rVar3 = rVar4;
                    f0Var3 = f0VarD;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    f0Var3 = f0Var2;
                    lVar3 = lVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e(t1Var, rVar3, f0Var3, lVar3, qVar, i14, i15);
                }
            }
            i28 |= 384;
            f0Var2 = f0Var;
            i18 = i15 & 4;
            if (i18 != 0) {
                if ((i14 & 3072) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i28 |= i19;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarE.r(qVar)) {
                        i27 = 16384;
                    } else {
                        i27 = 8192;
                    }
                    i28 |= i27;
                }
                if ((i28 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i28 & 1, z14)) {
                    if (i29 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i16 != 0) {
                        f0VarD = s1.l.d(0, 0, null, 7);
                    } else {
                        f0VarD = f0Var2;
                    }
                    aVar = p3.m.f135153a;
                    if (i18 != 0) {
                        objQ4 = o0VarE.q();
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = b.f149153a;
                            o0VarE.K(objQ4);
                        }
                        lVar4 = (e23.l) objQ4;
                    } else {
                        lVar4 = lVar2;
                    }
                    p3.x1 x1Var7 = p3.n.f135158a;
                    objQ = o0VarE.q();
                    aVar.getClass();
                    obj = p3.m.a.f135155b;
                    obj2 = objQ;
                    if (objQ == obj) {
                        f4.s sVar4 = new f4.s();
                        sVar4.add(t1Var.f155744a.a());
                        o0VarE.K(sVar4);
                        obj2 = sVar4;
                    }
                    sVar = (f4.s) obj2;
                    objQ2 = o0VarE.q();
                    if (objQ2 == obj) {
                        objQ2 = p1.g1.b();
                        o0VarE.K(objQ2);
                    }
                    t0Var = (p1.t0) objQ2;
                    a2Var = t1Var.f155744a;
                    c2Var = t1Var.f155747d;
                    if (p005kotlin.jvm.internal.s.g(a2Var.a(), c2Var.getF182175a())) {
                        o0VarE.C(321145192);
                        if (sVar.size() == 1) {
                            o0VarE.C(321279546);
                            if ((i28 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objQ3 = o0VarE.q();
                            if (z15) {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            }
                            p13.d0.B((e23.l) objQ3, sVar);
                            t0Var.g();
                        } else {
                            o0VarE.C(321279546);
                            if ((i28 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objQ3 = o0VarE.q();
                            if (z15) {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            }
                            p13.d0.B((e23.l) objQ3, sVar);
                            t0Var.g();
                        }
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(316295552);
                    }
                    o0VarE.g0(false);
                    if (t0Var.a(c2Var.getF182175a())) {
                        o0VarE.C(321536443);
                        listIterator = sVar.listIterator();
                        i25 = 0;
                        while (true) {
                            zVar = (f4.z) listIterator;
                            if (zVar.hasNext()) {
                                i25 = -1;
                                break;
                            } else {
                                if (p005kotlin.jvm.internal.s.g(lVar4.invoke((Object) zVar.next()), lVar4.invoke(c2Var.getF182175a()))) {
                                    break;
                                    break;
                                }
                                i25++;
                            }
                        }
                        if (i25 == -1) {
                            sVar.add(c2Var.getF182175a());
                        } else {
                            sVar.set(i25, c2Var.getF182175a());
                        }
                        t0Var.g();
                        size2 = sVar.size();
                        while (i26 < size2) {
                            Object obj5 = sVar.get(i26);
                            t0Var.m(obj5, z3.f.c(-934471669, new d(t1Var, f0VarD, obj5, qVar), o0VarE));
                        }
                    } else {
                        o0VarE.C(316295552);
                    }
                    o0VarE.g0(false);
                    h4.d.f81522a.getClass();
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    p3.x1 x1Var8 = p3.n.f135158a;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar4, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                    b4.b(h5.g.a.f81814k, o0VarE);
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.u uVar3 = c2.u.f22885a;
                    o0VarE.C(-1312707512);
                    size = sVar.size();
                    while (i24 < size) {
                        a0.g gVar3 = (Object) sVar.get(i24);
                        o0VarE.N(1171574969, lVar4.invoke(gVar3));
                        pVar = (e23.p) t0Var.d(gVar3);
                        if (pVar == null) {
                            o0VarE.C(1959122128);
                        } else {
                            o0VarE.C(1171576145);
                            pVar.invoke(o0VarE, 0);
                        }
                        o0VarE.g0(false);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                    o0VarE.g0(true);
                    p3.x1 x1Var9 = p3.n.f135158a;
                    rVar3 = rVar4;
                    f0Var3 = f0VarD;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    f0Var3 = f0Var2;
                    lVar3 = lVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e(t1Var, rVar3, f0Var3, lVar3, qVar, i14, i15);
                }
            }
            i28 |= 3072;
            lVar2 = lVar;
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(qVar)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i28 |= i27;
            }
            if ((i28 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i28 & 1, z14)) {
                if (i29 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i16 != 0) {
                    f0VarD = s1.l.d(0, 0, null, 7);
                } else {
                    f0VarD = f0Var2;
                }
                aVar = p3.m.f135153a;
                if (i18 != 0) {
                    objQ4 = o0VarE.q();
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = b.f149153a;
                        o0VarE.K(objQ4);
                    }
                    lVar4 = (e23.l) objQ4;
                } else {
                    lVar4 = lVar2;
                }
                p3.x1 x1Var10 = p3.n.f135158a;
                objQ = o0VarE.q();
                aVar.getClass();
                obj = p3.m.a.f135155b;
                obj2 = objQ;
                if (objQ == obj) {
                    f4.s sVar5 = new f4.s();
                    sVar5.add(t1Var.f155744a.a());
                    o0VarE.K(sVar5);
                    obj2 = sVar5;
                }
                sVar = (f4.s) obj2;
                objQ2 = o0VarE.q();
                if (objQ2 == obj) {
                    objQ2 = p1.g1.b();
                    o0VarE.K(objQ2);
                }
                t0Var = (p1.t0) objQ2;
                a2Var = t1Var.f155744a;
                c2Var = t1Var.f155747d;
                if (p005kotlin.jvm.internal.s.g(a2Var.a(), c2Var.getF182175a())) {
                    o0VarE.C(321145192);
                    if (sVar.size() == 1) {
                        o0VarE.C(321279546);
                        if ((i28 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objQ3 = o0VarE.q();
                        if (z15) {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        }
                        p13.d0.B((e23.l) objQ3, sVar);
                        t0Var.g();
                    } else {
                        o0VarE.C(321279546);
                        if ((i28 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objQ3 = o0VarE.q();
                        if (z15) {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        }
                        p13.d0.B((e23.l) objQ3, sVar);
                        t0Var.g();
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(316295552);
                }
                o0VarE.g0(false);
                if (t0Var.a(c2Var.getF182175a())) {
                    o0VarE.C(321536443);
                    listIterator = sVar.listIterator();
                    i25 = 0;
                    while (true) {
                        zVar = (f4.z) listIterator;
                        if (zVar.hasNext()) {
                            i25 = -1;
                            break;
                        } else {
                            if (p005kotlin.jvm.internal.s.g(lVar4.invoke((Object) zVar.next()), lVar4.invoke(c2Var.getF182175a()))) {
                                break;
                                break;
                            }
                            i25++;
                        }
                    }
                    if (i25 == -1) {
                        sVar.add(c2Var.getF182175a());
                    } else {
                        sVar.set(i25, c2Var.getF182175a());
                    }
                    t0Var.g();
                    size2 = sVar.size();
                    while (i26 < size2) {
                        Object obj6 = sVar.get(i26);
                        t0Var.m(obj6, z3.f.c(-934471669, new d(t1Var, f0VarD, obj6, qVar), o0VarE));
                    }
                } else {
                    o0VarE.C(316295552);
                }
                o0VarE.g0(false);
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                p3.x1 x1Var11 = p3.n.f135158a;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar4, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                b4.b(h5.g.a.f81814k, o0VarE);
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar4 = c2.u.f22885a;
                o0VarE.C(-1312707512);
                size = sVar.size();
                while (i24 < size) {
                    a0.g gVar4 = (Object) sVar.get(i24);
                    o0VarE.N(1171574969, lVar4.invoke(gVar4));
                    pVar = (e23.p) t0Var.d(gVar4);
                    if (pVar == null) {
                        o0VarE.C(1959122128);
                    } else {
                        o0VarE.C(1171576145);
                        pVar.invoke(o0VarE, 0);
                    }
                    o0VarE.g0(false);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                p3.x1 x1Var12 = p3.n.f135158a;
                rVar3 = rVar4;
                f0Var3 = f0VarD;
                lVar3 = lVar4;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                f0Var3 = f0Var2;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e(t1Var, rVar3, f0Var3, lVar3, qVar, i14, i15);
            }
        }
        i28 |= 48;
        rVar2 = rVar;
        i16 = i15 & 2;
        if (i16 != 0) {
            if ((i14 & 384) == 0) {
                f0Var2 = f0Var;
                if (o0VarE.r(f0Var2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i28 |= i17;
            }
            i18 = i15 & 4;
            if (i18 != 0) {
                if ((i14 & 3072) == 0) {
                    lVar2 = lVar;
                    if (o0VarE.r(lVar2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i28 |= i19;
                }
                if ((i14 & 24576) == 0) {
                    if (o0VarE.r(qVar)) {
                        i27 = 16384;
                    } else {
                        i27 = 8192;
                    }
                    i28 |= i27;
                }
                if ((i28 & 9363) != 9362) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (o0VarE.n(i28 & 1, z14)) {
                    if (i29 != 0) {
                        rVar4 = h4.r.S;
                    } else {
                        rVar4 = rVar2;
                    }
                    if (i16 != 0) {
                        f0VarD = s1.l.d(0, 0, null, 7);
                    } else {
                        f0VarD = f0Var2;
                    }
                    aVar = p3.m.f135153a;
                    if (i18 != 0) {
                        objQ4 = o0VarE.q();
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = b.f149153a;
                            o0VarE.K(objQ4);
                        }
                        lVar4 = (e23.l) objQ4;
                    } else {
                        lVar4 = lVar2;
                    }
                    p3.x1 x1Var13 = p3.n.f135158a;
                    objQ = o0VarE.q();
                    aVar.getClass();
                    obj = p3.m.a.f135155b;
                    obj2 = objQ;
                    if (objQ == obj) {
                        f4.s sVar6 = new f4.s();
                        sVar6.add(t1Var.f155744a.a());
                        o0VarE.K(sVar6);
                        obj2 = sVar6;
                    }
                    sVar = (f4.s) obj2;
                    objQ2 = o0VarE.q();
                    if (objQ2 == obj) {
                        objQ2 = p1.g1.b();
                        o0VarE.K(objQ2);
                    }
                    t0Var = (p1.t0) objQ2;
                    a2Var = t1Var.f155744a;
                    c2Var = t1Var.f155747d;
                    if (p005kotlin.jvm.internal.s.g(a2Var.a(), c2Var.getF182175a())) {
                        o0VarE.C(321145192);
                        if (sVar.size() == 1) {
                            o0VarE.C(321279546);
                            if ((i28 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objQ3 = o0VarE.q();
                            if (z15) {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            }
                            p13.d0.B((e23.l) objQ3, sVar);
                            t0Var.g();
                        } else {
                            o0VarE.C(321279546);
                            if ((i28 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            objQ3 = o0VarE.q();
                            if (z15) {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            } else {
                                objQ3 = new c(t1Var);
                                o0VarE.K(objQ3);
                            }
                            p13.d0.B((e23.l) objQ3, sVar);
                            t0Var.g();
                        }
                        o0VarE.g0(false);
                    } else {
                        o0VarE.C(316295552);
                    }
                    o0VarE.g0(false);
                    if (t0Var.a(c2Var.getF182175a())) {
                        o0VarE.C(321536443);
                        listIterator = sVar.listIterator();
                        i25 = 0;
                        while (true) {
                            zVar = (f4.z) listIterator;
                            if (zVar.hasNext()) {
                                i25 = -1;
                                break;
                            } else {
                                if (p005kotlin.jvm.internal.s.g(lVar4.invoke((Object) zVar.next()), lVar4.invoke(c2Var.getF182175a()))) {
                                    break;
                                    break;
                                }
                                i25++;
                            }
                        }
                        if (i25 == -1) {
                            sVar.add(c2Var.getF182175a());
                        } else {
                            sVar.set(i25, c2Var.getF182175a());
                        }
                        t0Var.g();
                        size2 = sVar.size();
                        while (i26 < size2) {
                            Object obj7 = sVar.get(i26);
                            t0Var.m(obj7, z3.f.c(-934471669, new d(t1Var, f0VarD, obj7, qVar), o0VarE));
                        }
                    } else {
                        o0VarE.C(316295552);
                    }
                    o0VarE.g0(false);
                    h4.d.f81522a.getClass();
                    z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    p3.x1 x1Var14 = p3.n.f135158a;
                    iHashCode = Long.hashCode(o0VarE.U);
                    i2VarA0 = o0VarE.a0();
                    rVarC = h4.k.c(rVar4, o0VarE);
                    h5.g.V.getClass();
                    aVar2 = h5.g.a.f81805b;
                    if (o0VarE.f135177b != null) {
                        p3.p0.l();
                        throw null;
                    }
                    o0VarE.z();
                    if (o0VarE.T) {
                        o0VarE.M(aVar2);
                    } else {
                        o0VarE.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                    b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                    b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                    b4.b(h5.g.a.f81814k, o0VarE);
                    b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                    c2.u uVar5 = c2.u.f22885a;
                    o0VarE.C(-1312707512);
                    size = sVar.size();
                    while (i24 < size) {
                        a0.g gVar5 = (Object) sVar.get(i24);
                        o0VarE.N(1171574969, lVar4.invoke(gVar5));
                        pVar = (e23.p) t0Var.d(gVar5);
                        if (pVar == null) {
                            o0VarE.C(1959122128);
                        } else {
                            o0VarE.C(1171576145);
                            pVar.invoke(o0VarE, 0);
                        }
                        o0VarE.g0(false);
                        o0VarE.g0(false);
                    }
                    o0VarE.g0(false);
                    o0VarE.g0(true);
                    p3.x1 x1Var15 = p3.n.f135158a;
                    rVar3 = rVar4;
                    f0Var3 = f0VarD;
                    lVar3 = lVar4;
                } else {
                    o0VarE.e();
                    rVar3 = rVar2;
                    f0Var3 = f0Var2;
                    lVar3 = lVar2;
                }
                p2VarI0 = o0VarE.i0();
                if (p2VarI0 != null) {
                    p2VarI0.f135219d = new e(t1Var, rVar3, f0Var3, lVar3, qVar, i14, i15);
                }
            }
            i28 |= 3072;
            lVar2 = lVar;
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(qVar)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i28 |= i27;
            }
            if ((i28 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i28 & 1, z14)) {
                if (i29 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i16 != 0) {
                    f0VarD = s1.l.d(0, 0, null, 7);
                } else {
                    f0VarD = f0Var2;
                }
                aVar = p3.m.f135153a;
                if (i18 != 0) {
                    objQ4 = o0VarE.q();
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = b.f149153a;
                        o0VarE.K(objQ4);
                    }
                    lVar4 = (e23.l) objQ4;
                } else {
                    lVar4 = lVar2;
                }
                p3.x1 x1Var16 = p3.n.f135158a;
                objQ = o0VarE.q();
                aVar.getClass();
                obj = p3.m.a.f135155b;
                obj2 = objQ;
                if (objQ == obj) {
                    f4.s sVar7 = new f4.s();
                    sVar7.add(t1Var.f155744a.a());
                    o0VarE.K(sVar7);
                    obj2 = sVar7;
                }
                sVar = (f4.s) obj2;
                objQ2 = o0VarE.q();
                if (objQ2 == obj) {
                    objQ2 = p1.g1.b();
                    o0VarE.K(objQ2);
                }
                t0Var = (p1.t0) objQ2;
                a2Var = t1Var.f155744a;
                c2Var = t1Var.f155747d;
                if (p005kotlin.jvm.internal.s.g(a2Var.a(), c2Var.getF182175a())) {
                    o0VarE.C(321145192);
                    if (sVar.size() == 1) {
                        o0VarE.C(321279546);
                        if ((i28 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objQ3 = o0VarE.q();
                        if (z15) {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        }
                        p13.d0.B((e23.l) objQ3, sVar);
                        t0Var.g();
                    } else {
                        o0VarE.C(321279546);
                        if ((i28 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objQ3 = o0VarE.q();
                        if (z15) {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        }
                        p13.d0.B((e23.l) objQ3, sVar);
                        t0Var.g();
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(316295552);
                }
                o0VarE.g0(false);
                if (t0Var.a(c2Var.getF182175a())) {
                    o0VarE.C(321536443);
                    listIterator = sVar.listIterator();
                    i25 = 0;
                    while (true) {
                        zVar = (f4.z) listIterator;
                        if (zVar.hasNext()) {
                            i25 = -1;
                            break;
                        } else {
                            if (p005kotlin.jvm.internal.s.g(lVar4.invoke((Object) zVar.next()), lVar4.invoke(c2Var.getF182175a()))) {
                                break;
                                break;
                            }
                            i25++;
                        }
                    }
                    if (i25 == -1) {
                        sVar.add(c2Var.getF182175a());
                    } else {
                        sVar.set(i25, c2Var.getF182175a());
                    }
                    t0Var.g();
                    size2 = sVar.size();
                    while (i26 < size2) {
                        Object obj8 = sVar.get(i26);
                        t0Var.m(obj8, z3.f.c(-934471669, new d(t1Var, f0VarD, obj8, qVar), o0VarE));
                    }
                } else {
                    o0VarE.C(316295552);
                }
                o0VarE.g0(false);
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                p3.x1 x1Var17 = p3.n.f135158a;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar4, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                b4.b(h5.g.a.f81814k, o0VarE);
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar6 = c2.u.f22885a;
                o0VarE.C(-1312707512);
                size = sVar.size();
                while (i24 < size) {
                    a0.g gVar6 = (Object) sVar.get(i24);
                    o0VarE.N(1171574969, lVar4.invoke(gVar6));
                    pVar = (e23.p) t0Var.d(gVar6);
                    if (pVar == null) {
                        o0VarE.C(1959122128);
                    } else {
                        o0VarE.C(1171576145);
                        pVar.invoke(o0VarE, 0);
                    }
                    o0VarE.g0(false);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                p3.x1 x1Var18 = p3.n.f135158a;
                rVar3 = rVar4;
                f0Var3 = f0VarD;
                lVar3 = lVar4;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                f0Var3 = f0Var2;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e(t1Var, rVar3, f0Var3, lVar3, qVar, i14, i15);
            }
        }
        i28 |= 384;
        f0Var2 = f0Var;
        i18 = i15 & 4;
        if (i18 != 0) {
            if ((i14 & 3072) == 0) {
                lVar2 = lVar;
                if (o0VarE.r(lVar2)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i28 |= i19;
            }
            if ((i14 & 24576) == 0) {
                if (o0VarE.r(qVar)) {
                    i27 = 16384;
                } else {
                    i27 = 8192;
                }
                i28 |= i27;
            }
            if ((i28 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (o0VarE.n(i28 & 1, z14)) {
                if (i29 != 0) {
                    rVar4 = h4.r.S;
                } else {
                    rVar4 = rVar2;
                }
                if (i16 != 0) {
                    f0VarD = s1.l.d(0, 0, null, 7);
                } else {
                    f0VarD = f0Var2;
                }
                aVar = p3.m.f135153a;
                if (i18 != 0) {
                    objQ4 = o0VarE.q();
                    aVar.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = b.f149153a;
                        o0VarE.K(objQ4);
                    }
                    lVar4 = (e23.l) objQ4;
                } else {
                    lVar4 = lVar2;
                }
                p3.x1 x1Var19 = p3.n.f135158a;
                objQ = o0VarE.q();
                aVar.getClass();
                obj = p3.m.a.f135155b;
                obj2 = objQ;
                if (objQ == obj) {
                    f4.s sVar8 = new f4.s();
                    sVar8.add(t1Var.f155744a.a());
                    o0VarE.K(sVar8);
                    obj2 = sVar8;
                }
                sVar = (f4.s) obj2;
                objQ2 = o0VarE.q();
                if (objQ2 == obj) {
                    objQ2 = p1.g1.b();
                    o0VarE.K(objQ2);
                }
                t0Var = (p1.t0) objQ2;
                a2Var = t1Var.f155744a;
                c2Var = t1Var.f155747d;
                if (p005kotlin.jvm.internal.s.g(a2Var.a(), c2Var.getF182175a())) {
                    o0VarE.C(321145192);
                    if (sVar.size() == 1) {
                        o0VarE.C(321279546);
                        if ((i28 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objQ3 = o0VarE.q();
                        if (z15) {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        }
                        p13.d0.B((e23.l) objQ3, sVar);
                        t0Var.g();
                    } else {
                        o0VarE.C(321279546);
                        if ((i28 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        objQ3 = o0VarE.q();
                        if (z15) {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        } else {
                            objQ3 = new c(t1Var);
                            o0VarE.K(objQ3);
                        }
                        p13.d0.B((e23.l) objQ3, sVar);
                        t0Var.g();
                    }
                    o0VarE.g0(false);
                } else {
                    o0VarE.C(316295552);
                }
                o0VarE.g0(false);
                if (t0Var.a(c2Var.getF182175a())) {
                    o0VarE.C(321536443);
                    listIterator = sVar.listIterator();
                    i25 = 0;
                    while (true) {
                        zVar = (f4.z) listIterator;
                        if (zVar.hasNext()) {
                            i25 = -1;
                            break;
                        } else {
                            if (p005kotlin.jvm.internal.s.g(lVar4.invoke((Object) zVar.next()), lVar4.invoke(c2Var.getF182175a()))) {
                                break;
                                break;
                            }
                            i25++;
                        }
                    }
                    if (i25 == -1) {
                        sVar.add(c2Var.getF182175a());
                    } else {
                        sVar.set(i25, c2Var.getF182175a());
                    }
                    t0Var.g();
                    size2 = sVar.size();
                    while (i26 < size2) {
                        Object obj9 = sVar.get(i26);
                        t0Var.m(obj9, z3.f.c(-934471669, new d(t1Var, f0VarD, obj9, qVar), o0VarE));
                    }
                } else {
                    o0VarE.C(316295552);
                }
                o0VarE.g0(false);
                h4.d.f81522a.getClass();
                z0VarD = c2.q.d(h4.d.a.f81524b, false);
                p3.x1 x1Var110 = p3.n.f135158a;
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(rVar4, o0VarE);
                h5.g.V.getClass();
                aVar2 = h5.g.a.f81805b;
                if (o0VarE.f135177b != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
                b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
                b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
                b4.b(h5.g.a.f81814k, o0VarE);
                b4.c(h5.g.a.f81807d, rVarC, o0VarE);
                c2.u uVar7 = c2.u.f22885a;
                o0VarE.C(-1312707512);
                size = sVar.size();
                while (i24 < size) {
                    a0.g gVar7 = (Object) sVar.get(i24);
                    o0VarE.N(1171574969, lVar4.invoke(gVar7));
                    pVar = (e23.p) t0Var.d(gVar7);
                    if (pVar == null) {
                        o0VarE.C(1959122128);
                    } else {
                        o0VarE.C(1171576145);
                        pVar.invoke(o0VarE, 0);
                    }
                    o0VarE.g0(false);
                    o0VarE.g0(false);
                }
                o0VarE.g0(false);
                o0VarE.g0(true);
                p3.x1 x1Var111 = p3.n.f135158a;
                rVar3 = rVar4;
                f0Var3 = f0VarD;
                lVar3 = lVar4;
            } else {
                o0VarE.e();
                rVar3 = rVar2;
                f0Var3 = f0Var2;
                lVar3 = lVar2;
            }
            p2VarI0 = o0VarE.i0();
            if (p2VarI0 != null) {
                p2VarI0.f135219d = new e(t1Var, rVar3, f0Var3, lVar3, qVar, i14, i15);
            }
        }
        i28 |= 3072;
        lVar2 = lVar;
        if ((i14 & 24576) == 0) {
            if (o0VarE.r(qVar)) {
                i27 = 16384;
            } else {
                i27 = 8192;
            }
            i28 |= i27;
        }
        if ((i28 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (o0VarE.n(i28 & 1, z14)) {
            if (i29 != 0) {
                rVar4 = h4.r.S;
            } else {
                rVar4 = rVar2;
            }
            if (i16 != 0) {
                f0VarD = s1.l.d(0, 0, null, 7);
            } else {
                f0VarD = f0Var2;
            }
            aVar = p3.m.f135153a;
            if (i18 != 0) {
                objQ4 = o0VarE.q();
                aVar.getClass();
                if (objQ4 == p3.m.a.f135155b) {
                    objQ4 = b.f149153a;
                    o0VarE.K(objQ4);
                }
                lVar4 = (e23.l) objQ4;
            } else {
                lVar4 = lVar2;
            }
            p3.x1 x1Var112 = p3.n.f135158a;
            objQ = o0VarE.q();
            aVar.getClass();
            obj = p3.m.a.f135155b;
            obj2 = objQ;
            if (objQ == obj) {
                f4.s sVar9 = new f4.s();
                sVar9.add(t1Var.f155744a.a());
                o0VarE.K(sVar9);
                obj2 = sVar9;
            }
            sVar = (f4.s) obj2;
            objQ2 = o0VarE.q();
            if (objQ2 == obj) {
                objQ2 = p1.g1.b();
                o0VarE.K(objQ2);
            }
            t0Var = (p1.t0) objQ2;
            a2Var = t1Var.f155744a;
            c2Var = t1Var.f155747d;
            if (p005kotlin.jvm.internal.s.g(a2Var.a(), c2Var.getF182175a())) {
                o0VarE.C(321145192);
                if (sVar.size() == 1) {
                    o0VarE.C(321279546);
                    if ((i28 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ3 = o0VarE.q();
                    if (z15) {
                        objQ3 = new c(t1Var);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new c(t1Var);
                        o0VarE.K(objQ3);
                    }
                    p13.d0.B((e23.l) objQ3, sVar);
                    t0Var.g();
                } else {
                    o0VarE.C(321279546);
                    if ((i28 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    objQ3 = o0VarE.q();
                    if (z15) {
                        objQ3 = new c(t1Var);
                        o0VarE.K(objQ3);
                    } else {
                        objQ3 = new c(t1Var);
                        o0VarE.K(objQ3);
                    }
                    p13.d0.B((e23.l) objQ3, sVar);
                    t0Var.g();
                }
                o0VarE.g0(false);
            } else {
                o0VarE.C(316295552);
            }
            o0VarE.g0(false);
            if (t0Var.a(c2Var.getF182175a())) {
                o0VarE.C(321536443);
                listIterator = sVar.listIterator();
                i25 = 0;
                while (true) {
                    zVar = (f4.z) listIterator;
                    if (zVar.hasNext()) {
                        i25 = -1;
                        break;
                    } else {
                        if (p005kotlin.jvm.internal.s.g(lVar4.invoke((Object) zVar.next()), lVar4.invoke(c2Var.getF182175a()))) {
                            break;
                            break;
                        }
                        i25++;
                    }
                }
                if (i25 == -1) {
                    sVar.add(c2Var.getF182175a());
                } else {
                    sVar.set(i25, c2Var.getF182175a());
                }
                t0Var.g();
                size2 = sVar.size();
                while (i26 < size2) {
                    Object obj10 = sVar.get(i26);
                    t0Var.m(obj10, z3.f.c(-934471669, new d(t1Var, f0VarD, obj10, qVar), o0VarE));
                }
            } else {
                o0VarE.C(316295552);
            }
            o0VarE.g0(false);
            h4.d.f81522a.getClass();
            z0VarD = c2.q.d(h4.d.a.f81524b, false);
            p3.x1 x1Var113 = p3.n.f135158a;
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(rVar4, o0VarE);
            h5.g.V.getClass();
            aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar8 = c2.u.f22885a;
            o0VarE.C(-1312707512);
            size = sVar.size();
            while (i24 < size) {
                a0.g gVar8 = (Object) sVar.get(i24);
                o0VarE.N(1171574969, lVar4.invoke(gVar8));
                pVar = (e23.p) t0Var.d(gVar8);
                if (pVar == null) {
                    o0VarE.C(1959122128);
                } else {
                    o0VarE.C(1171576145);
                    pVar.invoke(o0VarE, 0);
                }
                o0VarE.g0(false);
                o0VarE.g0(false);
            }
            o0VarE.g0(false);
            o0VarE.g0(true);
            p3.x1 x1Var114 = p3.n.f135158a;
            rVar3 = rVar4;
            f0Var3 = f0VarD;
            lVar3 = lVar4;
        } else {
            o0VarE.e();
            rVar3 = rVar2;
            f0Var3 = f0Var2;
            lVar3 = lVar2;
        }
        p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new e(t1Var, rVar3, f0Var3, lVar3, qVar, i14, i15);
        }
    }
}
