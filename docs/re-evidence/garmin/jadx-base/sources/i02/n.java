package i02;

import f2.p0;
import java.util.ArrayList;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import r53.l1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.ui.composable.draggable.grid.ReorderableLazyGridStateKt$rememberReorderableLazyGridState$1$1", f = "ReorderableLazyGridState.kt", l = {35}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f86877b;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f86878a;

        public a(m mVar) {
            this.f86878a = mVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            int iC;
            int iAbs;
            int iP;
            int iAbs2;
            int iN;
            int iAbs3;
            int iO;
            int iAbs4;
            int i14;
            int i15;
            int i16;
            m mVar = this.f86878a;
            c2 c2Var = mVar.f86895k;
            p0 p0Var = mVar.f86875r;
            T f182175a = c2Var.getF182175a();
            if (f182175a != null) {
                float f14 = 0;
                mVar.f86894j.setValue(n4.c.a((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (mVar.d() & 4294967295L)) + f14)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (mVar.d() >> 32)) + f14)) << 32)));
                Object objH = mVar.h();
                if (objH != null) {
                    float fG = mVar.g() + mVar.p(objH);
                    float f15 = mVar.f() + mVar.n(objH);
                    int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (mVar.d() >> 32));
                    int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (4294967295L & mVar.d()));
                    ArrayList arrayList = mVar.f86897m;
                    arrayList.clear();
                    ArrayList arrayList2 = mVar.f86898n;
                    arrayList2.clear();
                    int iN2 = mVar.n(f182175a) + iIntBitsToFloat;
                    int iO2 = mVar.o(f182175a) + iIntBitsToFloat;
                    int iP2 = mVar.p(f182175a) + iIntBitsToFloat2;
                    int iC2 = mVar.c(f182175a) + iIntBitsToFloat2;
                    int i17 = (iN2 + iO2) / 2;
                    int i18 = (iP2 + iC2) / 2;
                    for (T t7 : mVar.s()) {
                        int iL = mVar.l(t7);
                        Integer numE = mVar.e();
                        p0 p0Var2 = p0Var;
                        if ((numE != null && iL == numE.intValue()) || mVar.c(t7) < iP2 || mVar.p(t7) > iC2 || mVar.o(t7) < iN2 || mVar.n(t7) > iO2) {
                            i14 = iP2;
                            i15 = i17;
                            i16 = iN2;
                        } else {
                            e23.p<f, f, Boolean> pVar = mVar.f86888d;
                            if (pVar != null) {
                                i14 = iP2;
                                i15 = i17;
                                i16 = iN2;
                                if (!pVar.invoke(new f(mVar.l(t7), mVar.m(t7)), new f(mVar.l(f182175a), mVar.m(f182175a))).booleanValue()) {
                                }
                            } else {
                                i14 = iP2;
                                i15 = i17;
                                i16 = iN2;
                            }
                            int iAbs5 = Math.abs(i15 - ((mVar.o(t7) + mVar.n(t7)) / 2));
                            int iAbs6 = Math.abs(i18 - ((mVar.c(t7) + mVar.p(t7)) / 2));
                            int i19 = (iAbs6 * iAbs6) + (iAbs5 * iAbs5);
                            int size = arrayList.size();
                            int i24 = 0;
                            for (int i25 = 0; i25 < size && i19 > ((Number) arrayList2.get(i25)).intValue(); i25++) {
                                i24++;
                            }
                            arrayList.add(i24, t7);
                            arrayList2.add(i24, Integer.valueOf(i19));
                        }
                        p0Var = p0Var2;
                        iP2 = i14;
                        i17 = i15;
                        iN2 = i16;
                    }
                    p0 p0Var3 = p0Var;
                    int i26 = (int) f15;
                    int i27 = (int) fG;
                    arrayList.getClass();
                    int iT = mVar.t(objH) + i26;
                    int iK = mVar.k(objH) + i27;
                    int iN3 = i26 - mVar.n(objH);
                    int iP3 = i27 - mVar.p(objH);
                    int i28 = -1;
                    Object obj2 = null;
                    for (Object obj3 : arrayList) {
                        if (iN3 > 0 && (iO = mVar.o(obj3) - iT) < 0 && mVar.o(obj3) > mVar.o(objH) && (iAbs4 = Math.abs(iO)) > i28) {
                            obj2 = obj3;
                            i28 = iAbs4;
                        }
                        if (iN3 < 0 && (iN = mVar.n(obj3) - i26) > 0 && mVar.n(obj3) < mVar.n(objH) && (iAbs3 = Math.abs(iN)) > i28) {
                            obj2 = obj3;
                            i28 = iAbs3;
                        }
                        if (iP3 < 0 && (iP = mVar.p(obj3) - i27) > 0 && mVar.p(obj3) < mVar.p(objH) && (iAbs2 = Math.abs(iP)) > i28) {
                            obj2 = obj3;
                            i28 = iAbs2;
                        }
                        if (iP3 > 0 && (iC = mVar.c(obj3) - iK) < 0 && mVar.c(obj3) > mVar.c(objH) && (iAbs = Math.abs(iC)) > i28) {
                            obj2 = obj3;
                            i28 = iAbs;
                        }
                    }
                    if (obj2 != null) {
                        if (mVar.l(obj2) == p0Var3.g() || mVar.l(objH) == p0Var3.g()) {
                            ge1.b.T(mVar.f86885a, null, null, new q(mVar, objH, obj2, null), 3);
                        } else {
                            mVar.f86887c.invoke(new f(mVar.l(objH), mVar.m(objH)), new f(mVar.l(obj2), mVar.m(obj2)));
                        }
                        mVar.f86891g.setValue(Integer.valueOf(mVar.l(obj2)));
                    }
                    float fB = mVar.b(mVar.f86886b, 0L);
                    if (fB != 0.0f) {
                        mVar.a(fB);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(m mVar, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f86877b = mVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f86877b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f86876a;
        if (i14 == 0) {
            o13.r.b(obj);
            m mVar = this.f86877b;
            mVar.getClass();
            r53.g gVarR = r53.s.r(new l1(r53.s.N(p3.p0.s(new j(mVar, 2)), new r(null, mVar))), new k(mVar, 1));
            a aVar2 = new a(mVar);
            this.f86876a = 1;
            if (gVarR.collect(aVar2, this) == aVar) {
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
