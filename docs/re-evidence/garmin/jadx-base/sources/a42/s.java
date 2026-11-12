package a42;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.x2;
import com.garmin.android.apps.connectmobile.R;
import com.google.mlkit.common.MlKitException;
import f5.z0;
import i3.a1;
import i3.e5;
import i3.mc;
import i3.mh;
import i3.pc;
import java.util.List;
import o4.m1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.l0;
import p3.o0;
import p3.p0;
import p3.p2;
import p3.x1;
import r1.q2;
import s5.x0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"La42/s;", "Lh82/c;", "<init>", "()V", "d", "a", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s extends h82.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f1073g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static e23.l<? super sd2.f, Unit> f1074h = new a03.h(24);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p1.z<sd2.f> f1075f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.composables.screen.VO2MaxHelpScreen$SetupHowToGetVO2MaxScreen$1$1$1", f = "VO2MaxHelpScreen.kt", l = {183}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f1077b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a1 a1Var, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f1077b = a1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f1077b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f1076a;
            if (i14 == 0) {
                o13.r.b(obj);
                mc mcVar = this.f1077b.f87409a;
                this.f1076a = 1;
                if (mcVar.d(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.vo2.reports.presentation.composables.screen.VO2MaxHelpScreen$SetupHowToGetVO2MaxScreen$2$1$1$1$1$1", f = "VO2MaxHelpScreen.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a1 f1079b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a1 a1Var, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f1079b = a1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f1079b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f1078a;
            if (i14 == 0) {
                o13.r.b(obj);
                mc mcVar = this.f1079b.f87409a;
                this.f1078a = 1;
                if (mcVar.b(this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"La42/s$d;", "", "", "labelResId", "descriptionFormatResId", "Lkotlin/Function0;", "Lo4/d0;", "getColor", "<init>", "(IILe23/a;)V", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f1081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final e23.a<o4.d0> f1082c;

        public d(int i14, int i15, e23.a<o4.d0> aVar) {
            aVar.getClass();
            this.f1080a = i14;
            this.f1081b = i15;
            this.f1082c = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f1080a == dVar.f1080a && this.f1081b == dVar.f1081b && this.f1082c.equals(dVar.f1082c);
        }

        public final int hashCode() {
            return this.f1082c.hashCode() + q2.d(this.f1081b, Integer.hashCode(this.f1080a) * 31, 31);
        }

        public final String toString() {
            return n23.j.i(e5.j(this.f1080a, this.f1081b, "VO2MaxCategory(labelResId=", ", descriptionFormatResId=", ", getColor="), this.f1082c, ")");
        }
    }

    @Override // h82.c
    public final void a(Bundle bundle, p3.m mVar, int i14) {
        Parcelable parcelable;
        List<sd2.f> list;
        o0 o0VarE = mVar.E(741182406);
        int i15 = (i14 & 6) == 0 ? (o0VarE.r(bundle) ? 4 : 2) | i14 : i14;
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.r(this) ? 32 : 16;
        }
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            super.a(bundle, o0VarE, i15 & 126);
            p1.z<sd2.f> zVar = null;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundle.getParcelable("extra_vo2_help_data", c42.b.class);
            } else {
                Parcelable parcelable2 = bundle.getParcelable("extra_vo2_help_data");
                if (!(parcelable2 instanceof c42.b)) {
                    parcelable2 = null;
                }
                parcelable = (c42.b) parcelable2;
            }
            c42.b bVar = (c42.b) parcelable;
            if (bVar != null && (list = bVar.f24352a) != null) {
                p1.z<sd2.f> zVar2 = new p1.z<>(0, 1, null);
                for (sd2.f fVar : list) {
                    zVar2.f(fVar.getUnitID(), fVar);
                }
                zVar = zVar2;
            }
            this.f1075f = zVar;
            x1 x1Var2 = p3.n.f135158a;
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new r(this, bundle, i14, i16);
        }
    }

    @Override // h82.c
    public final List<h82.c.b> c(Context context) {
        context.getClass();
        p1.z<sd2.f> zVar = this.f1075f;
        return p13.x.k(new h82.c.b("DEFAULT_ACTION", context.getString(R.string.lbl_help), null, new z3.e(-971233446, true, new k(this, 1)), 4, null), new h82.c.b("WHAT_IS_VO2_MAX_ACTION", context.getString((zVar == null || zVar.d()) ? R.string.vo2_max_ftnscoach : R.string.lbl_what_is_vo2max), null, new z3.e(1139457913, true, new k(this, 2)), 4, null), new h82.c.b("HOW_TO_GET_VO2_MAX_ACTION", context.getString(R.string.lbl_how_to_get_vo2_max), null, new z3.e(-1044818024, true, new k(this, 3)), 4, null));
    }

    public final void g(String str, String str2, long j8, boolean z14, p3.m mVar, int i14) {
        o0 o0Var;
        boolean z15;
        boolean z16;
        o0 o0VarE = mVar.E(1832818561);
        p3.c<?> cVar = o0VarE.f135177b;
        int i15 = i14 | (o0VarE.B(str) ? 4 : 2) | (o0VarE.B(str2) ? 32 : 16) | (o0VarE.l(j8) ? 256 : 128) | 3072;
        if (o0VarE.n(i15 & 1, (i15 & 1171) != 1170)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA0, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            d92.b.f58623a.getClass();
            j92.b bVar2 = d92.b.f58625c;
            bVar2.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarA = c2.l.A(aVar, eVar2.f97920e, 0.0f, 2);
            h4.g gVar = h4.d.a.f81524b;
            z0 z0VarD = c2.q.d(gVar, false);
            int iHashCode2 = Long.hashCode(o0VarE.U);
            i2 i2VarA1 = o0VarE.a0();
            h4.r rVarC2 = h4.k.c(rVarA, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            c2.u uVar = c2.u.f22885a;
            g6.f.a aVar3 = g6.f.f75994b;
            h4.r rVarC3 = c2.l.C(aVar, 0.0f, 6, 0.0f, 0.0f, 13);
            z0 z0VarD2 = c2.q.d(gVar, false);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC4 = h4.k.c(rVarC3, o0VarE);
            if (cVar == null) {
                p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar, z0VarD2, o0VarE);
            b4.c(c1623g, i2VarA2, o0VarE);
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC4, o0VarE);
            o0VarE.C(-628164942);
            c2.q.a(u1.n.e(l4.k.b(x2.q(aVar, 12), k2.i.a(3)), j8, m1.f128891a), o0VarE, 0);
            o0VarE.g0(false);
            o0VarE.g0(true);
            d92.b.f58624b.getClass();
            mh.c(str, c2.l.C(aVar, 20, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97931h), o0VarE), o0VarE, (i15 & 14) | 48, 0, 131068);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (str2 == null) {
                o0Var.C(335268633);
                o0Var.g0(false);
                z16 = true;
            } else {
                o0Var.C(335268634);
                j92.f.f97924a.getClass();
                x0 x0VarF = d92.c.f(j92.f.f97932i, o0Var);
                bVar2.getClass();
                float f14 = eVar2.f97920e;
                bVar2.getClass();
                mh.c(str2, c2.l.C(aVar, 36, 0.0f, f14, eVar2.f97920e, 2), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 131068);
                o0Var = o0Var;
                Unit unit = Unit.INSTANCE;
                o0Var.g0(false);
                z16 = true;
            }
            o0Var.g0(z16);
            z15 = z16;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            z15 = z14;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o(this, str, str2, j8, z15, i14);
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
    public final void h(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-595483045);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = l0.j(t13.h.f161748a, o0VarE);
                o0VarE.K(objQ);
            }
            o53.b0 b0Var = (o53.b0) objQ;
            a1 a1VarD = i3.z0.d(i3.z0.e(pc.Hidden, o0VarE, 390, 2), null, o0VarE, 0, 2);
            p1.z<sd2.f> zVar = this.f1075f;
            int iH = zVar != null ? zVar.h() : 0;
            q80.b bVar = q80.b.f143300a;
            p1.z<sd2.f> zVar2 = this.f1075f;
            boolean zR = o0VarE.r(b0Var) | o0VarE.B(a1VarD);
            Object objQ2 = o0VarE.q();
            if (zR || objQ2 == c2565a) {
                objQ2 = new i(i16, b0Var, a1VarD);
                o0VarE.K(objQ2);
            }
            bVar.b(b0Var, a1VarD, zVar2, (e23.l) objQ2, z3.f.c(-2021756038, new a03.g(context, iH, this, b0Var, a1VarD), o0VarE), o0VarE, 24576);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, 0);
        }
    }

    public final void i(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(-271356450);
        int i15 = (o0VarE.r(this) ? 4 : 2) | i14;
        int i16 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.b(z3.f.c(454751690, new k(this, i16), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, 1);
        }
    }

    public final void j(p3.m mVar, int i14) {
        o0 o0VarE = mVar.E(1572212670);
        int i15 = 4;
        int i16 = (o0VarE.r(this) ? 4 : 2) | i14;
        if (o0VarE.n(i16 & 1, (i16 & 3) != 2)) {
            x1 x1Var = p3.n.f135158a;
            h82.e.a(z3.f.c(633924753, new k(this, i15), o0VarE), o0VarE, 6);
        } else {
            o0VarE.e();
        }
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new j(this, i14, 2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"La42/s$a;", "", "<init>", "()V", "", "EXTRA_DATA", "Ljava/lang/String;", "WHAT_IS_VO2_MAX_ACTION", "HOW_TO_GET_VO2_MAX_ACTION", "LINK_COOPER_INSTITUTE", "gcm-vo2_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
