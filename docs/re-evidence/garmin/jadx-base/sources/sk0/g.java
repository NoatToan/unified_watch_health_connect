package sk0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.n3;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import i3.i7;
import java.util.ArrayList;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final class g {
    public static final void a(i iVar, e23.l lVar, e23.l lVar2, e23.p pVar, e23.l lVar3, e23.l lVar4, GearActivity.w wVar, p3.m mVar, int i14) {
        iVar.getClass();
        lVar.getClass();
        lVar2.getClass();
        pVar.getClass();
        lVar3.getClass();
        lVar4.getClass();
        p3.o0 o0VarE = mVar.E(-349321957);
        int i15 = i14 | (o0VarE.r(iVar) ? 4 : 2) | (o0VarE.r(lVar) ? 32 : 16) | (o0VarE.r(lVar2) ? 256 : 128) | (o0VarE.r(pVar) ? 2048 : 1024) | (o0VarE.r(lVar3) ? 16384 : 8192) | (o0VarE.r(lVar4) ? 131072 : 65536) | (o0VarE.r(wVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (o0VarE.n(i15 & 1, (599187 & i15) != 599186)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                l0 l0Var = new l0(null, null, j53.l.b(), g22.l.d(b63.o.INSTANCE), j53.l.b(), false, null, j53.l.b());
                o0VarE.K(l0Var);
                objQ = l0Var;
            }
            l0 l0Var2 = (l0) objQ;
            String strQ = gl1.y.Q(o0VarE, R.string.add_gear_collection);
            boolean zR = o0VarE.r(iVar) | o0VarE.r(context) | o0VarE.r(l0Var2);
            Object objQ2 = o0VarE.q();
            int i16 = 14;
            if (zR || objQ2 == c2565a) {
                objQ2 = new rx1.u(iVar, i16, context, l0Var2);
                o0VarE.K(objQ2);
            }
            int i17 = i15 << 9;
            b(strQ, l0Var2, iVar, true, lVar, lVar2, pVar, lVar3, (e23.p) objQ2, lVar4, wVar, o0VarE, ((i15 << 6) & 896) | 3072 | (57344 & i17) | (458752 & i17) | (3670016 & i17) | (i17 & 29360128) | ((i15 << 12) & 1879048192), (i15 >> 18) & 14);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r11.k(iVar, lVar, lVar2, pVar, lVar3, lVar4, wVar, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0131  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(String str, final l0 l0Var, final f1 f1Var, final boolean z14, final e23.l lVar, e23.l lVar2, final e23.p pVar, e23.l lVar3, final e23.p pVar2, final e23.l lVar4, GearActivity.w wVar, p3.m mVar, int i14, int i15) {
        int i16;
        e23.p pVar3;
        int i17;
        p3.o0 o0Var;
        p3.o0 o0VarE = mVar.E(-200981);
        if ((i14 & 6) == 0) {
            i16 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= o0VarE.r(l0Var) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i16 |= (i14 & 512) == 0 ? o0VarE.B(f1Var) : o0VarE.r(f1Var) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i16 |= o0VarE.h(z14) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i16 |= o0VarE.r(lVar) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i16 |= o0VarE.r(lVar2) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i16 |= o0VarE.r(pVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i16 |= o0VarE.r(lVar3) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            pVar3 = pVar2;
            i16 |= o0VarE.r(pVar3) ? 67108864 : 33554432;
        } else {
            pVar3 = pVar2;
        }
        if ((805306368 & i14) == 0) {
            i16 |= o0VarE.r(lVar4) ? 536870912 : 268435456;
        }
        if ((i15 & 6) == 0) {
            i17 = i15 | (o0VarE.r(wVar) ? 4 : 2);
        } else {
            i17 = i15;
        }
        int i18 = 1;
        if (o0VarE.n(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            x1 x1Var = p3.n.f135158a;
            final p3.p1 p1VarC = p3.p0.c(f1Var.getUiState(), o0VarE, 0);
            Object[] objArr = new Object[0];
            boolean zR = o0VarE.r(l0Var);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new sg0.w0(l0Var, i18);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new sg0.w0(l0Var, i18);
                    o0VarE.K(objQ);
                }
            }
            final p3.p1 p1Var = (p3.p1) d4.a.e(objArr, (e23.a) objQ, o0VarE, 0);
            Object[] objArr2 = new Object[0];
            Object objQ2 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = new sd.o(13);
                o0VarE.K(objQ2);
            }
            final p3.p1 p1Var2 = (p3.p1) d4.a.e(objArr2, (e23.a) objQ2, o0VarE, 48);
            Object[] objArr3 = new Object[0];
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = new sd.o(14);
                o0VarE.K(objQ3);
            }
            final p3.p1 p1Var3 = (p3.p1) d4.a.e(objArr3, (e23.a) objQ3, o0VarE, 48);
            boolean zB = o0VarE.B(p1Var) | o0VarE.B(p1Var2);
            Object objQ4 = o0VarE.q();
            if (zB || objQ4 == c2565a) {
                objQ4 = new am.c1(p1Var, p1Var2, 24);
                o0VarE.K(objQ4);
            }
            lVar3.invoke((e23.l) objQ4);
            boolean zB2 = o0VarE.B(p1Var) | o0VarE.B(p1Var3);
            Object objQ5 = o0VarE.q();
            if (zB2 || objQ5 == c2565a) {
                objQ5 = new am.c1(p1Var, p1Var3, 25);
                o0VarE.K(objQ5);
            }
            lVar2.invoke((e23.l) objQ5);
            Object[] objArr4 = new Object[0];
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = new sd.o(15);
                o0VarE.K(objQ6);
            }
            final p3.p1 p1Var4 = (p3.p1) d4.a.e(objArr4, (e23.a) objQ6, o0VarE, 48);
            Object[] objArr5 = new Object[0];
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = new sd.o(16);
                o0VarE.K(objQ7);
            }
            final p3.p1 p1Var5 = (p3.p1) d4.a.e(objArr5, (e23.a) objQ7, o0VarE, 48);
            Object[] objArr6 = new Object[0];
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = new sd.o(17);
                o0VarE.K(objQ8);
            }
            final p3.p1 p1Var6 = (p3.p1) d4.a.e(objArr6, (e23.a) objQ8, o0VarE, 48);
            Object[] objArr7 = new Object[0];
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new sd.o(18);
                o0VarE.K(objQ9);
            }
            final p3.p1 p1Var7 = (p3.p1) d4.a.e(objArr7, (e23.a) objQ9, o0VarE, 48);
            boolean z15 = ((h) p1VarC.getF182175a()).f159672a;
            c2.n0 n0Var = n3.f22788a;
            o0Var = o0VarE;
            z02.d.a(z15, z3.f.c(-1722769914, new ci0.g(str, wVar, p1Var, p1Var3, z14, p1Var4, p1Var5, p1Var6, pVar3, p1Var2), o0VarE), null, null, new c2.n0(0, 0, 0, 0), z3.f.c(1200662146, new e23.p() { // from class: sk0.b
                /* JADX WARN: Failed to calculate best type for var: r15v14 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v14 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
                	... 6 more
                 */
                /* JADX WARN: Failed to calculate best type for var: r15v14 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v14 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
                	... 7 more
                 */
                /* JADX WARN: Failed to calculate best type for var: r15v15 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v15 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
                	... 7 more
                 */
                /* JADX WARN: Failed to calculate best type for var: r15v18 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v18 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
                	... 7 more
                 */
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
                /*  JADX ERROR: Types fix failed
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v14 ??, new type: char
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
                    	... 5 more
                    */
                @Override // e23.p
                public final java.lang.Object invoke(java.lang.Object r61, java.lang.Object r62) {
                    /*
                        Method dump skipped, instruction units count: 2856
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: sk0.b.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }
            }, o0Var), o0Var, 196656, 12);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new jt1.i(str, l0Var, f1Var, z14, lVar, lVar2, pVar, lVar3, pVar2, lVar4, wVar, i14, i15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:61:0x0110  */
    public static final void c(l0 l0Var, ArrayList arrayList, p0 p0Var, e23.l lVar, e23.l lVar2, e23.p pVar, e23.l lVar3, e23.a aVar, GearActivity.w wVar, p3.m mVar, int i14) {
        l0Var.getClass();
        p0Var.getClass();
        lVar.getClass();
        lVar2.getClass();
        pVar.getClass();
        p3.o0 o0VarP = androidx.room.a0.p(lVar3, aVar, mVar, -1811452998);
        int i15 = i14 | (o0VarP.r(l0Var) ? 4 : 2) | (o0VarP.r(arrayList) ? 32 : 16) | (o0VarP.r(p0Var) ? 256 : 128) | (o0VarP.r(lVar) ? 2048 : 1024) | (o0VarP.r(lVar2) ? 16384 : 8192) | (o0VarP.r(pVar) ? 131072 : 65536) | (o0VarP.r(lVar3) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (o0VarP.r(aVar) ? 8388608 : 4194304) | (o0VarP.r(wVar) ? 67108864 : 33554432);
        if (o0VarP.n(i15 & 1, (38347923 & i15) != 38347922)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarP.A(AndroidCompositionLocals_androidKt.f6042b);
            String strQ = gl1.y.Q(o0VarP, R.string.edit_gear_collection_title);
            boolean zR = o0VarP.r(l0Var) | ((i15 & 234881024) == 67108864) | o0VarP.r(p0Var) | o0VarP.r(context) | o0VarP.r(arrayList);
            Object objQ = o0VarP.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                sg2.g gVar = new sg2.g(l0Var, wVar, p0Var, context, arrayList, 3);
                o0VarP.K(gVar);
                objQ = gVar;
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    sg2.g gVar2 = new sg2.g(l0Var, wVar, p0Var, context, arrayList, 3);
                    o0VarP.K(gVar2);
                    objQ = gVar2;
                }
            }
            e23.p pVar2 = (e23.p) objQ;
            boolean z14 = (i15 & 29360128) == 8388608;
            Object objQ2 = o0VarP.q();
            if (z14) {
                objQ2 = new rx1.m(aVar, 5);
                o0VarP.K(objQ2);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new rx1.m(aVar, 5);
                    o0VarP.K(objQ2);
                }
            }
            int i16 = i15 << 3;
            b(strQ, l0Var, p0Var, false, lVar, lVar2, pVar, lVar3, pVar2, (e23.l) objQ2, wVar, o0VarP, (i16 & 112) | 3072 | (i15 & 896) | (57344 & i16) | (458752 & i16) | (3670016 & i16) | (29360128 & i16), (i15 >> 24) & 14);
        } else {
            o0VarP.e();
        }
        p2 p2VarI0 = o0VarP.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new c42.d(l0Var, arrayList, p0Var, lVar, lVar2, pVar, lVar3, aVar, wVar, i14, 13);
        }
    }

    public static final void d(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(989462162);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            j92.b bVar = d92.b.f58625c;
            bVar.getClass();
            j92.c cVar = j92.b.f97901d;
            float f14 = cVar.f97904c;
            float f15 = cVar.f97903b;
            bVar.getClass();
            h4.r rVarN = x2.n(aVar, f14, cVar.f97904c);
            h4.d.f81522a.getClass();
            f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarN, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
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
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.u uVar = c2.u.f22885a;
            t4.d dVarA = n5.c.a(R.drawable.ic_exclamation, o0VarE, 0);
            bVar.getClass();
            h4.r rVarH = x2.h(aVar, f15);
            bVar.getClass();
            i7.a(dVarA, null, u1.n.e(l4.k.b(uVar.c(x2.u(rVarH, f15), h4.d.a.f81528f), k2.i.f102406a), d92.b.a(o0VarE).f().f(), o4.m1.f128891a), d92.b.a(o0VarE).f().f63508c, o0VarE, 48, 0);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new si1.a(i14, 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x010e  */
    public static final void e(boolean z14, e23.a<Unit> aVar, p3.m mVar, int i14) {
        p3.o0 o0Var;
        boolean z15;
        p3.o0 o0VarE = mVar.E(-1478103551);
        int i15 = (o0VarE.h(z14) ? 4 : 2) | i14 | (o0VarE.r(aVar) ? 32 : 16);
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p3.m.a aVar2 = p3.m.f135153a;
            if (z14) {
                o0VarE.C(2116912997);
                l72.c1 c1Var = l72.c1.f110940a;
                String strQ = gl1.y.Q(o0VarE, R.string.unable_save_all_info);
                String strQ2 = gl1.y.Q(o0VarE, R.string.collection_created_some_info_failed_try_again);
                String strQ3 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                int i16 = i15 & 112;
                boolean z16 = i16 == 32;
                Object objQ = o0VarE.q();
                if (z16) {
                    objQ = new sg0.q0(aVar, 7);
                    o0VarE.K(objQ);
                } else {
                    aVar2.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new sg0.q0(aVar, 7);
                        o0VarE.K(objQ);
                    }
                }
                e23.a<Unit> aVar3 = (e23.a) objQ;
                z15 = i16 == 32;
                Object objQ2 = o0VarE.q();
                if (z15) {
                    objQ2 = new sg0.q0(aVar, 8);
                    o0VarE.K(objQ2);
                } else {
                    aVar2.getClass();
                    if (objQ2 == p3.m.a.f135155b) {
                        objQ2 = new sg0.q0(aVar, 8);
                        o0VarE.K(objQ2);
                    }
                }
                c1Var.a(false, strQ, strQ2, null, null, strQ3, false, false, aVar3, null, (e23.a) objQ2, o0VarE, 0, 0, 729);
                o0Var = o0VarE;
                o0Var.g0(false);
            } else {
                o0VarE.C(2117327033);
                l72.c1 c1Var2 = l72.c1.f110940a;
                String strQ4 = gl1.y.Q(o0VarE, R.string.lbl_error_occurred);
                String strQ5 = gl1.y.Q(o0VarE, R.string.technical_challenge_message);
                String strQ6 = gl1.y.Q(o0VarE, R.string.lbl_ok);
                int i17 = i15 & 112;
                boolean z17 = i17 == 32;
                Object objQ3 = o0VarE.q();
                if (z17) {
                    objQ3 = new sg0.q0(aVar, 9);
                    o0VarE.K(objQ3);
                } else {
                    aVar2.getClass();
                    if (objQ3 == p3.m.a.f135155b) {
                        objQ3 = new sg0.q0(aVar, 9);
                        o0VarE.K(objQ3);
                    }
                }
                e23.a<Unit> aVar4 = (e23.a) objQ3;
                z15 = i17 == 32;
                Object objQ4 = o0VarE.q();
                if (z15) {
                    objQ4 = new sg0.q0(aVar, 10);
                    o0VarE.K(objQ4);
                } else {
                    aVar2.getClass();
                    if (objQ4 == p3.m.a.f135155b) {
                        objQ4 = new sg0.q0(aVar, 10);
                        o0VarE.K(objQ4);
                    }
                }
                c1Var2.a(false, strQ4, strQ5, null, null, strQ6, false, false, aVar4, null, (e23.a) objQ4, o0VarE, 0, 0, 729);
                o0Var = o0VarE;
                o0Var.g0(false);
            }
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new a42.e(i14, 19, aVar, z14);
        }
    }

    public static final void f(uk0.a aVar, e23.a<Unit> aVar2, p3.m mVar, int i14) {
        uk0.a aVar3;
        p3.o0 o0VarE = mVar.E(1230311046);
        int i15 = 16;
        int i16 = (o0VarE.B(aVar) ? 4 : 2) | i14 | (o0VarE.r(aVar2) ? 32 : 16);
        if (o0VarE.n(i16 & 1, (i16 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar4 = h4.r.S;
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new se0.a(12);
                o0VarE.K(objQ);
            }
            aVar3 = aVar;
            uk0.u.a(aVar3, false, p5.v.c((e23.l) objQ, aVar4, true), z3.f.c(-2096440399, new ak0.p(aVar2, i15), o0VarE), null, o0VarE, (i16 & 14) | 27696, 0);
        } else {
            aVar3 = aVar;
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new rk0.a1(aVar3, aVar2, i14, 22);
        }
    }
}
