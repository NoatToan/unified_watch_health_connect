package a11;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import java.text.DateFormatSymbols;
import l72.c1;
import p3.o0;
import p3.p2;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final class y {
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
    public static final void a(String str, b63.v vVar, b63.v vVar2, b63.v vVar3, boolean z14, e23.a aVar, e23.l lVar, String str2, String str3, p3.m mVar, int i14) {
        int i15;
        o0 o0Var;
        boolean z15 = z14;
        str.getClass();
        vVar.getClass();
        vVar2.getClass();
        vVar3.getClass();
        o0 o0VarE = mVar.E(-625152548);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(str) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(vVar) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(vVar2) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i15 |= o0VarE.r(vVar3) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= o0VarE.h(z15) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= o0VarE.r(aVar) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= o0VarE.r(lVar) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i14) == 0) {
            i15 |= o0VarE.B(str2) ? 8388608 : 4194304;
        }
        if ((100663296 & i14) == 0) {
            i15 |= o0VarE.B(str3) ? 67108864 : 33554432;
        }
        if (o0VarE.n(i15 & 1, (38347923 & i15) != 38347922)) {
            o0VarE.G0();
            if ((i14 & 1) != 0 && !o0VarE.o0()) {
                o0VarE.e();
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            boolean zIs24HourFormat = DateFormat.is24HourFormat((Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b));
            int i16 = ((i15 >> 9) & 14) | (i15 & 112) | (i15 & 896) | (i15 & 57344);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new DateFormatSymbols().getAmPmStrings();
                o0VarE.K(objQ);
            }
            String[] strArr = (String[]) objQ;
            o21.c.a aVar2 = o21.c.f128644n;
            strArr.getClass();
            aVar2.getClass();
            int i17 = i15;
            o01.e eVar = new o01.e(12);
            bm.f fVar = new bm.f(vVar, vVar2, zIs24HourFormat, strArr, z15);
            d4.l lVar2 = d4.m.f57455a;
            d4.l lVar3 = new d4.l(eVar, fVar);
            Object[] objArr = {vVar, vVar2, Boolean.valueOf(zIs24HourFormat), Boolean.valueOf(z15)};
            boolean zR = o0VarE.r(vVar3) | o0VarE.r(vVar) | o0VarE.r(vVar2) | o0VarE.h(zIs24HourFormat) | o0VarE.r(strArr) | ((((i16 & 57344) ^ 24576) > 16384 && o0VarE.h(z15)) || (i16 & 24576) == 16384);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                w wVar = new w(vVar3, vVar, vVar2, zIs24HourFormat, strArr, z15);
                z15 = z15;
                o0VarE.K(wVar);
                objQ2 = wVar;
            }
            o21.c cVar = (o21.c) d4.a.c(objArr, lVar3, (e23.a) objQ2, o0VarE, 0);
            c1 c1Var = c1.f110940a;
            z3.e eVarC = z3.f.c(-252527360, new u(cVar, z15, zIs24HourFormat, 0), o0VarE);
            boolean zB = o0VarE.B(cVar) | ((i17 & 3670016) == 1048576);
            Object objQ3 = o0VarE.q();
            if (zB || objQ3 == c2565a) {
                objQ3 = new n(1, lVar, cVar);
                o0VarE.K(objQ3);
            }
            int i18 = i17 << 3;
            o0Var = o0VarE;
            c1Var.a(true, str, null, eVarC, null, str2, false, false, (e23.a) objQ3, str3, aVar, o0Var, (i18 & 112) | 3078 | (458752 & (i17 >> 6)) | (i18 & 1879048192), (i17 >> 15) & 14, 212);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new v(str, vVar, vVar2, vVar3, z15, aVar, lVar, str2, str3, i14);
        }
    }
}
