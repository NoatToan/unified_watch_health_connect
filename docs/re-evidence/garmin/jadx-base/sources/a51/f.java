package a51;

import a11.f0;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import gl1.y;
import l72.c1;
import p005kotlin.Unit;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    /* JADX WARN: Code duplicated, block: B:65:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:74:0x0140  */
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
    public static final void a(final int i14, final int i15, final int i16, final int i17, final int i18, final String str, final String str2, final e23.l lVar, final e23.l lVar2, final e23.l lVar3, final e23.a aVar, p3.m mVar, final int i19) {
        o0 o0Var;
        str.getClass();
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-766527028);
        int i24 = (o0VarE.r(lVar3) ? 536870912 : 268435456) | i19 | (o0VarE.k(i14) ? 4 : 2) | (o0VarE.k(i15) ? 32 : 16) | (o0VarE.k(i16) ? 256 : 128) | (o0VarE.k(i17) ? 2048 : 1024) | (o0VarE.B(str) ? 131072 : 65536) | (o0VarE.B(str2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarE.r(lVar) ? 8388608 : 4194304) | (o0VarE.r(lVar2) ? 67108864 : 33554432);
        int i25 = o0VarE.r(aVar) ? 4 : 2;
        if (o0VarE.n(i24 & 1, ((306783379 & i24) == 306783378 && (i25 & 3) == 2) ? false : true)) {
            o0VarE.G0();
            if ((i19 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = {Integer.valueOf(i14)};
            boolean z14 = (i24 & 14) == 4;
            Object objQ = o0VarE.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                objQ = new c(i14, 0);
                o0VarE.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new c(i14, 0);
                    o0VarE.K(objQ);
                }
            }
            n1 n1Var = (n1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            c1 c1Var = c1.f110940a;
            z3.e eVarC = z3.f.c(1400022312, new d(i14, str, str2, i17, i18, n1Var, i15, lVar, lVar2, i16), o0VarE);
            String strQ = y.Q(o0VarE, R.string.lbl_done);
            boolean zB = o0VarE.B(n1Var) | ((i24 & 1879048192) == 536870912);
            Object objQ2 = o0VarE.q();
            if (zB) {
                objQ2 = new f0(lVar3, n1Var, 1);
                o0VarE.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new f0(lVar3, n1Var, 1);
                    o0VarE.K(objQ2);
                }
            }
            o0Var = o0VarE;
            c1Var.a(false, null, null, eVarC, null, strQ, false, false, (e23.a) objQ2, null, aVar, o0Var, 3072, i25 & 14, 727);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(i14, i15, i16, i17, i18, str, str2, lVar, lVar2, lVar3, aVar, i19) { // from class: a51.e

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f1428a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f1429b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ int f1430c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f1431d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f1432e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ String f1433f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public final /* synthetic */ String f1434g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public final /* synthetic */ e23.l f1435h;

                /* JADX INFO: renamed from: i, reason: collision with root package name */
                public final /* synthetic */ e23.l f1436i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                public final /* synthetic */ e23.l f1437j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                public final /* synthetic */ e23.a f1438k;

                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iT = p0.t(24577);
                    f.a(this.f1428a, this.f1429b, this.f1430c, this.f1431d, this.f1432e, this.f1433f, this.f1434g, this.f1435h, this.f1436i, this.f1437j, this.f1438k, (p3.m) obj, iT);
                    return Unit.INSTANCE;
                }
            };
        }
    }
}
