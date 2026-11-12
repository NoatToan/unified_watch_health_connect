package i3;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ce {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", l = {231}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f87776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ wd f87777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlin.h f87778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd wdVar, kotlin.h hVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f87777b = wdVar;
            this.f87778c = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f87777b, this.f87778c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            long jA;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f87776a;
            wd wdVar = this.f87777b;
            if (i14 == 0) {
                o13.r.b(obj);
                if (wdVar != null) {
                    yd f88114d = wdVar.getF88109a().getF111263a();
                    boolean z14 = wdVar.getF88109a().getF88112b() != null;
                    int i15 = b.f87779a[f88114d.ordinal()];
                    if (i15 == 1) {
                        jA = Long.MAX_VALUE;
                    } else if (i15 == 2) {
                        jA = AbstractComponentTracker.LINGERING_TIMEOUT;
                    } else {
                        if (i15 != 3) {
                            lc.u0.r();
                            return null;
                        }
                        jA = 4000;
                    }
                    kotlin.h hVar = this.f87778c;
                    if (hVar != null) {
                        jA = hVar.a(jA, z14);
                    }
                    this.f87776a = 1;
                    if (o53.m0.b(jA, this) == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            wdVar.dismiss();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f87779a;

        static {
            int[] iArr = new int[yd.values().length];
            try {
                iArr[yd.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yd.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yd.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f87779a = iArr;
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r9v11 e23.p<? super p3.m, ? super java.lang.Integer, kotlin.Unit>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public static final void a(i3.wd r16, h4.r r17, e23.q r18, p3.m r19, int r20) {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.ce.a(i3.wd, h4.r, e23.q, p3.m, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    public static final void b(fe feVar, h4.r rVar, e23.q<? super wd, ? super p3.m, ? super Integer, Unit> qVar, p3.m mVar, int i14, int i15) {
        int i16;
        p3.o0 o0VarE = mVar.E(-1077081618);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(feVar) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        int i17 = i15 & 2;
        if (i17 != 0) {
            i16 |= 48;
        } else if ((i14 & 48) == 0) {
            i16 |= o0VarE.B(rVar) ? 32 : 16;
        }
        int i18 = i15 & 4;
        if (i18 != 0) {
            i16 |= 384;
        } else if ((i14 & 384) == 0) {
            i16 |= o0VarE.r(qVar) ? 256 : 128;
        }
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            if (i17 != 0) {
                rVar = h4.r.S;
            }
            if (i18 != 0) {
                p2.f89260a.getClass();
                qVar = p2.f89261b;
            }
            p3.x1 x1Var = p3.n.f135158a;
            wd wdVar = (wd) feVar.f88108b.getF182175a();
            kotlin.h hVar = (kotlin.h) o0VarE.A(kotlin.t1.f91483a);
            boolean zB = o0VarE.B(wdVar) | o0VarE.r(hVar);
            Object objQ = o0VarE.q();
            if (zB) {
                objQ = new a(wdVar, hVar, null);
                o0VarE.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a(wdVar, hVar, null);
                    o0VarE.K(objQ);
                }
            }
            p3.l0.e((e23.p) objQ, wdVar, o0VarE);
            a((wd) feVar.f88108b.getF182175a(), rVar, qVar, o0VarE, i16 & 1008);
        } else {
            o0VarE.e();
        }
        h4.r rVar2 = rVar;
        e23.q<? super wd, ? super p3.m, ? super Integer, Unit> qVar2 = qVar;
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new an1.d(feVar, rVar2, qVar2, i14, i15, 8);
        }
    }
}
