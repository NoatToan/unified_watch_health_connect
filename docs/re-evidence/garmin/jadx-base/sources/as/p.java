package as;

import android.content.Context;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.d2;
import b82.t0;
import b82.y1;
import c2.b0;
import c2.x2;
import c2.y;
import c2.z;
import com.garmin.android.apps.connectmobile.R;
import com.google.accompanist.drawablepainter.DrawablePainter2Kt;
import d53.u;
import d53.w;
import g02.b2;
import h5.e0;
import i3.i7;
import i3.mh;
import i3.ve;
import java.util.Locale;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p0;
import p3.x1;
import s5.x0;
import u1.y0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f12668b;

    public /* synthetic */ p(String str, int i14) {
        this.f12667a = i14;
        this.f12668b = str;
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
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i14 = this.f12667a;
        String upperCase = this.f12668b;
        boolean z14 = false;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    d2.f16532a.d(null, z3.f.c(-61821825, new s(upperCase, z14 ? 1 : 0), mVar), mVar, 48, 1);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                t0 t0Var = t0.f16792a;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    mh.c(this.f12668b, null, com.nimbusds.jose.shaded.gson.internal.a.x(mVar2), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97931h, mVar2), mVar2, 0, 0, 131066);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 2:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String str = this.f12668b;
                    if (str != null) {
                        mVar3.C(1459606155);
                        g6.f.a aVar = g6.f.f75994b;
                        h4.r rVarY = c2.l.y(h4.r.S, 8);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        mh.c(str, rVarY, d92.b.a(mVar3).k().f63527d, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97933j, mVar3, 48, 0, 131064);
                        mVar3.f();
                    } else {
                        mVar3.C(1459885837);
                        mVar3.C(1459885836);
                        mVar3.f();
                        mVar3.f();
                    }
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 3:
                p3.m mVar4 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                y1 y1Var = y1.f16902a;
                if (mVar4.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var4 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var = j92.f.f97932i;
                    d6.h.f57752b.getClass();
                    mh.c(this.f12668b, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var, mVar4, 0, 0, 130046);
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 4:
                p3.m mVar5 = (p3.m) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                y1 y1Var2 = y1.f16902a;
                if (mVar5.n(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    x1 x1Var5 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var2 = j92.f.f97932i;
                    d6.h.f57752b.getClass();
                    mh.c(this.f12668b, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var2, mVar5, 0, 0, 130046);
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                c12.d.d(upperCase, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                c12.d.b(upperCase, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                c42.h.b(upperCase, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 8:
                p3.m mVar6 = (p3.m) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (mVar6.n(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    x1 x1Var6 = p3.n.f135158a;
                    mh.c(this.f12668b, null, com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar6), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar6, 0, 0, 262138);
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 9:
                p3.m mVar7 = (p3.m) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (mVar7.n(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97921f;
                    h4.r rVarZ = c2.l.z(rVarF, f14, f14);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode = Long.hashCode(mVar7.getU());
                    i2 i2VarX = mVar7.x();
                    h4.r rVarC = h4.k.c(rVarZ, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar2 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar2);
                    } else {
                        mVar7.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar7);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar7);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar7.getT() || !p005kotlin.jvm.internal.s.g(mVar7.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar7, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar7);
                    b0 b0Var = b0.f22601a;
                    if (upperCase == null) {
                        mVar7.C(-1517696735);
                        upperCase = gl1.y.Q(mVar7, R.string.lbl_start_date).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                    } else {
                        mVar7.C(-1517698471);
                    }
                    mVar7.f();
                    String str2 = upperCase;
                    d92.b.f58624b.getClass();
                    mh.c(str2, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97934k, mVar7), mVar7, 0, 0, 131070);
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 10:
                p3.m mVar8 = (p3.m) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (mVar8.n(1 & iIntValue8, (iIntValue8 & 3) != 2)) {
                    x1 x1Var8 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    d92.b.f58624b.getClass();
                    x0 x0Var3 = j92.f.f97932i;
                    d6.h.f57752b.getClass();
                    mh.c(this.f12668b, null, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0Var3, mVar8, 0, 0, 130046);
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                da0.z.c(upperCase, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                da0.z.b(upperCase, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 13:
                p3.m mVar9 = (p3.m) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (mVar9.n(1 & iIntValue9, (iIntValue9 & 3) != 2)) {
                    x1 x1Var9 = p3.n.f135158a;
                    b3.b.f15502a.getClass();
                    i7.b(d3.n.a(), this.f12668b, null, ds.e0.b(d92.b.f58623a, mVar9), mVar9, 0, 4);
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 14:
                p3.m mVar10 = (p3.m) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (mVar10.n(1 & iIntValue10, (iIntValue10 & 3) != 2)) {
                    x1 x1Var10 = p3.n.f135158a;
                    h4.r.a aVar3 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA = c2.l.A(aVar3, j92.b.f97899b.f97918c, 0.0f, 2);
                    d92.b.f58624b.getClass();
                    mh.c(this.f12668b, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar10, 0, 0, 131068);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 15:
                p3.m mVar11 = (p3.m) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (mVar11.n(1 & iIntValue11, (iIntValue11 & 3) != 2)) {
                    x1 x1Var11 = p3.n.f135158a;
                    h4.r.a aVar4 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA2 = c2.l.A(aVar4, j92.b.f97899b.f97918c, 0.0f, 2);
                    d92.b.f58624b.getClass();
                    mh.c(this.f12668b, rVarA2, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar11, 0, 0, 131068);
                } else {
                    mVar11.e();
                }
                return Unit.INSTANCE;
            case 16:
                p3.m mVar12 = (p3.m) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (mVar12.n(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    x1 x1Var12 = p3.n.f135158a;
                    et.a.b(gl1.y.P(R.string.help_activity_recording_first_key_feature, new Object[]{upperCase, upperCase, upperCase}, mVar12), mVar12, 0);
                    et.a.b(gl1.y.Q(mVar12, R.string.help_activity_recording_second_key_feature), mVar12, 0);
                    et.a.b(gl1.y.P(R.string.help_activity_recording_third_key_feature, new Object[]{upperCase, upperCase}, mVar12), mVar12, 0);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 17:
                p3.m mVar13 = (p3.m) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (mVar13.n(1 & iIntValue13, (iIntValue13 & 3) != 2)) {
                    x1 x1Var13 = p3.n.f135158a;
                    h82.r.f82497a.j(z3.f.c(-826658770, new p(upperCase, 18), mVar13), mVar13, 54);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 18:
                p3.m mVar14 = (p3.m) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (mVar14.n(1 & iIntValue14, (iIntValue14 & 3) != 2)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h82.r rVar = h82.r.f82497a;
                    rVar.s(384, 2, gl1.y.Q(mVar14, R.string.lbl_key_features), null, mVar14);
                    et.a.c(z3.f.c(-229902970, new p(upperCase, 16), mVar14), mVar14, 6);
                    rVar.s(384, 2, gl1.y.Q(mVar14, R.string.lbl_how_it_works_capitalized), null, mVar14);
                    et.a.d(gl1.y.P(R.string.help_activity_recording_first_paragraph, new Object[]{upperCase}, mVar14), mVar14, 0);
                    et.a.d(gl1.y.P(R.string.help_activity_recording_second_paragraph, new Object[]{upperCase, upperCase}, mVar14), mVar14, 0);
                    et.a.d(gl1.y.P(R.string.help_activity_recording_third_paragraph, new Object[]{upperCase, upperCase}, mVar14), mVar14, 0);
                    rVar.c(mVar14, 6);
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
            case 19:
                ((Integer) obj2).getClass();
                et.a.d(upperCase, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                et.a.b(upperCase, (p3.m) obj, p0.t(1));
                return Unit.INSTANCE;
            case 21:
                p3.m mVar15 = (p3.m) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (mVar15.n(1 & iIntValue15, (iIntValue15 & 3) != 2)) {
                    x1 x1Var15 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA3 = c2.l.A(aVar5, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(cVar, h4.d.a.f81537o, mVar15, 54);
                    int iHashCode2 = Long.hashCode(mVar15.getU());
                    i2 i2VarX2 = mVar15.x();
                    h4.r rVarC2 = h4.k.c(rVarA3, mVar15);
                    h5.g.V.getClass();
                    e0.a aVar6 = h5.g.a.f81805b;
                    if (mVar15.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar15.z();
                    if (mVar15.getT()) {
                        mVar15.M(aVar6);
                    } else {
                        mVar15.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar15);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar15);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar15.getT() || !p005kotlin.jvm.internal.s.g(mVar15.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar15, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar15);
                    b0 b0Var2 = b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c(this.f12668b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar15, 0, 0, 131070);
                    mVar15.y();
                } else {
                    mVar15.e();
                }
                return Unit.INSTANCE;
            case 22:
                p3.m mVar16 = (p3.m) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                if (mVar16.n(1 & iIntValue16, (iIntValue16 & 3) != 2)) {
                    x1 x1Var16 = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA4 = c2.l.A(aVar7, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar2 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    z zVarA3 = y.a(cVar2, h4.d.a.f81537o, mVar16, 54);
                    int iHashCode3 = Long.hashCode(mVar16.getU());
                    i2 i2VarX3 = mVar16.x();
                    h4.r rVarC3 = h4.k.c(rVarA4, mVar16);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar16.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar16.z();
                    if (mVar16.getT()) {
                        mVar16.M(aVar8);
                    } else {
                        mVar16.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA3, mVar16);
                    b4.c(h5.g.a.f81809f, i2VarX3, mVar16);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar16.getT() || !p005kotlin.jvm.internal.s.g(mVar16.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar16, iHashCode3, bVar3);
                    }
                    b4.c(h5.g.a.f81807d, rVarC3, mVar16);
                    b0 b0Var3 = b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c(this.f12668b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar16, 0, 0, 131070);
                    mVar16.y();
                } else {
                    mVar16.e();
                }
                return Unit.INSTANCE;
            case 23:
                p3.m mVar17 = (p3.m) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                if (mVar17.n(1 & iIntValue17, (iIntValue17 & 3) != 2)) {
                    x1 x1Var17 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA5 = c2.l.A(aVar9, j92.b.f97899b.f97918c, 0.0f, 2);
                    c2.j.f22691a.getClass();
                    c2.j.c cVar3 = c2.j.f22696f;
                    h4.d.f81522a.getClass();
                    z zVarA4 = y.a(cVar3, h4.d.a.f81537o, mVar17, 54);
                    int iHashCode4 = Long.hashCode(mVar17.getU());
                    i2 i2VarX4 = mVar17.x();
                    h4.r rVarC4 = h4.k.c(rVarA5, mVar17);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar17.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar17.z();
                    if (mVar17.getT()) {
                        mVar17.M(aVar10);
                    } else {
                        mVar17.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA4, mVar17);
                    b4.c(h5.g.a.f81809f, i2VarX4, mVar17);
                    h5.g.a.b bVar4 = h5.g.a.f81813j;
                    if (mVar17.getT() || !p005kotlin.jvm.internal.s.g(mVar17.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar17, iHashCode4, bVar4);
                    }
                    b4.c(h5.g.a.f81807d, rVarC4, mVar17);
                    b0 b0Var4 = b0.f22601a;
                    d92.b.f58624b.getClass();
                    mh.c(this.f12668b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, j92.f.f97932i, mVar17, 0, 0, 131070);
                    mVar17.y();
                } else {
                    mVar17.e();
                }
                return Unit.INSTANCE;
            case 24:
                p3.m mVar18 = (p3.m) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                if (mVar18.n(1 & iIntValue18, (iIntValue18 & 3) != 2)) {
                    x1 x1Var18 = p3.n.f135158a;
                    String str3 = this.f12668b;
                    if (str3 == null) {
                        mVar18.C(-808303173);
                        mVar18.f();
                    } else {
                        mVar18.C(-808303172);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB = d92.c.b(d92.c.e(j92.f.f97931h), mVar18);
                        h4.r.a aVar11 = h4.r.S;
                        d92.b.f58625c.getClass();
                        j92.e eVar = j92.b.f97899b;
                        mh.c(str3, c2.l.C(aVar11, 0.0f, eVar.f97920e, 0.0f, eVar.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar18, 0, 0, 131068);
                        mVar18.f();
                    }
                } else {
                    mVar18.e();
                }
                return Unit.INSTANCE;
            case 25:
                p3.m mVar19 = (p3.m) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                if (mVar19.n(1 & iIntValue19, (iIntValue19 & 3) != 2)) {
                    x1 x1Var19 = p3.n.f135158a;
                    String str4 = this.f12668b;
                    if (str4 == null) {
                        mVar19.C(-1445711727);
                        mVar19.f();
                    } else {
                        mVar19.C(-1445711726);
                        d92.b.f58623a.getClass();
                        d92.b.f58624b.getClass();
                        x0 x0VarB2 = d92.c.b(d92.c.e(j92.f.f97931h), mVar19);
                        h4.r.a aVar12 = h4.r.S;
                        d92.b.f58625c.getClass();
                        j92.e eVar2 = j92.b.f97899b;
                        mh.c(str4, c2.l.C(aVar12, 0.0f, eVar2.f97920e, 0.0f, eVar2.f97922g, 5), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB2, mVar19, 0, 0, 131068);
                        mVar19.f();
                    }
                } else {
                    mVar19.e();
                }
                return Unit.INSTANCE;
            case 26:
                p3.m mVar20 = (p3.m) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                if (mVar20.n(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    x1 x1Var20 = p3.n.f135158a;
                    h4.r.a aVar13 = h4.r.S;
                    h4.r rVarF2 = x2.f(u1.n.e(aVar13, p6.b.a(d92.b.f58623a, mVar20), m1.f128891a), 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar2 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA5 = y.a(kVar2, h4.d.a.f81536n, mVar20, 0);
                    int iHashCode5 = Long.hashCode(mVar20.getU());
                    i2 i2VarX5 = mVar20.x();
                    h4.r rVarC5 = h4.k.c(rVarF2, mVar20);
                    h5.g.V.getClass();
                    e0.a aVar14 = h5.g.a.f81805b;
                    if (mVar20.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar20.z();
                    if (mVar20.getT()) {
                        mVar20.M(aVar14);
                    } else {
                        mVar20.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA5, mVar20);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar20);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar20.getT() || !p005kotlin.jvm.internal.s.g(mVar20.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar20, iHashCode5, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar20);
                    b0 b0Var5 = b0.f22601a;
                    String strV = u.v(upperCase, "http:", "https:", true);
                    if (w.z(strV, ".gif", false)) {
                        mVar20.C(227549579);
                        ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(((Context) mVar20.A(AndroidCompositionLocals_androidKt.f6042b)).getContentResolver(), Uri.parse(strV));
                        sourceCreateSource.getClass();
                        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(sourceCreateSource);
                        drawableDecodeDrawable.getClass();
                        y0.a(DrawablePainter2Kt.rememberDrawablePainter((AnimatedImageDrawable) drawableDecodeDrawable, mVar20, 0), "animated gif", null, null, null, 0.0f, null, mVar20, 48, 124);
                        mVar20.f();
                    } else {
                        mVar20.C(227896562);
                        d92.b.f58625c.getClass();
                        jf.r.a(strV, null, x2.h(c2.l.y(aVar13, j92.b.f97899b.f97920e), j92.b.f97901d.f97906e), null, null, null, null, mVar20, 48, 2040);
                        mVar20.f();
                    }
                    mVar20.y();
                } else {
                    mVar20.e();
                }
                return Unit.INSTANCE;
            case 27:
                p3.m mVar21 = (p3.m) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                if (mVar21.n(1 & iIntValue21, (iIntValue21 & 3) != 2)) {
                    x1 x1Var21 = p3.n.f135158a;
                    d92.b.f58623a.getClass();
                    long jG = d92.b.a(mVar21).c().g();
                    g6.f.a aVar15 = g6.f.f75994b;
                    k2.h hVarA = k2.i.a(10);
                    h4.r.a aVar16 = h4.r.S;
                    d92.b.f58625c.getClass();
                    ve.a(c2.l.A(aVar16, j92.b.f97899b.f97923h, 0.0f, 2), hVarA, jG, 0L, 0.0f, 0.0f, null, z3.f.c(-1193766883, new p(upperCase, 28), mVar21), mVar21, 12582912, 120);
                } else {
                    mVar21.e();
                }
                return Unit.INSTANCE;
            case 28:
                p3.m mVar22 = (p3.m) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                if (mVar22.n(1 & iIntValue22, (iIntValue22 & 3) != 2)) {
                    x1 x1Var22 = p3.n.f135158a;
                    h4.r.a aVar17 = h4.r.S;
                    c2.j.f22691a.getClass();
                    c2.j.k kVar3 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA6 = y.a(kVar3, h4.d.a.f81536n, mVar22, 0);
                    int iHashCode6 = Long.hashCode(mVar22.getU());
                    i2 i2VarX6 = mVar22.x();
                    h4.r rVarC6 = h4.k.c(aVar17, mVar22);
                    h5.g.V.getClass();
                    e0.a aVar18 = h5.g.a.f81805b;
                    if (mVar22.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar22.z();
                    if (mVar22.getT()) {
                        mVar22.M(aVar18);
                    } else {
                        mVar22.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA6, mVar22);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar22);
                    h5.g.a.b bVar6 = h5.g.a.f81813j;
                    if (mVar22.getT() || !p005kotlin.jvm.internal.s.g(mVar22.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar22, iHashCode6, bVar6);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar22);
                    b0 b0Var6 = b0.f22601a;
                    t4.d dVarA = n5.c.a(2131231871, mVar22, 0);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f15 = eVar3.f97921f;
                    h4.r rVarY2 = c2.l.y(aVar17, f15);
                    h4.g.a aVar19 = h4.d.a.f81537o;
                    y0.a(dVarA, "", b0Var6.b(rVarY2, aVar19), null, null, 0.0f, null, mVar22, 48, 120);
                    d6.h.f57752b.getClass();
                    int i15 = d6.h.f57755e;
                    d92.b.f58624b.getClass();
                    mh.c(this.f12668b, b0Var6.b(c2.l.B(aVar17, f15, eVar3.f97918c, f15, f15), aVar19), 0L, null, 0L, null, 0L, d6.h.a(i15), 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97932i, mVar22), mVar22, 0, 0, 130044);
                    mVar22.y();
                } else {
                    mVar22.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar23 = (p3.m) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                fv1.c.a aVar20 = fv1.c.f73671x;
                if (mVar23.n(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    x1 x1Var23 = p3.n.f135158a;
                    b2.a(null, false, 0, 0, this.f12668b, gl1.y.Q(mVar23, R.string.try_to_be_optimistic_yet_realistic), null, null, null, mVar23, 0, 463);
                } else {
                    mVar23.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ p(String str, int i14, int i15) {
        this.f12667a = i15;
        this.f12668b = str;
    }
}
