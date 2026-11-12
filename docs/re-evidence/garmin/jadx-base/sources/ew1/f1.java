package ew1;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.garmin.android.apps.connectmobile.R;
import i3.mh;
import p005kotlin.Metadata;
import p3.b4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\t\u001a\u0004\u0018\u00010\b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lew1/f1;", "Lew1/u;", "<init>", "()V", "a", "", "backNavigation", "enableNext", "", "planNameVal", "isFocused", "Lx5/l0;", "value", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 extends u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f66451c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.w1 f66452b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66453a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f66453a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.y1 invoke() {
            return this.f66453a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f66454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f66455b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(e23.a aVar, Fragment fragment) {
            super(0);
            this.f66454a = aVar;
            this.f66455b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f66454a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f66455b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<androidx.lifecycle.x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f66456a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f66456a = fragment;
        }

        @Override // e23.a
        public final androidx.lifecycle.x1.c invoke() {
            return this.f66456a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public f1() {
        super(R.layout.fbt_activity_view);
        this.f66452b = new androidx.lifecycle.w1(p005kotlin.jvm.internal.s0.f105811a.b(aw1.h.class), new b(this), new d(this), new c(null, this));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        requireActivity().setTitle(z6().f13385r1 ? R.string.plan_name : R.string.name_your_plan);
    }

    @Override // ew1.u, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        tu1.a.p(view2, R.id.composable_container, new z3.e(-789921209, true, new dh1.a(this, 17)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w6(int i14, int i15, int i16, e23.a aVar, p3.m mVar, boolean z14) {
        String strR5;
        p3.p1 p1Var;
        vt1.n nVar;
        p3.o0 o0VarE = mVar.E(1435564552);
        int i17 = i16 | (o0VarE.h(z14) ? 4 : 2) | (o0VarE.k(i14) ? 32 : 16) | (o0VarE.k(i15) ? 256 : 128) | (o0VarE.r(aVar) ? 2048 : 1024) | (o0VarE.r(this) ? 16384 : 8192);
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            Activity activity = (Activity) o0VarE.A(c.n.f22332a);
            Object objQ = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p3.p0.n(Boolean.TRUE);
                o0VarE.K(objQ);
            }
            p3.p1 p1Var2 = (p3.p1) objQ;
            boolean zBooleanValue = ((Boolean) p1Var2.getF182175a()).booleanValue();
            boolean z15 = (i17 & 7168) == 2048;
            Object objQ2 = o0VarE.q();
            if (z15 || objQ2 == c2565a) {
                objQ2 = new a11.a0(aVar, p1Var2, 14);
                o0VarE.K(objQ2);
            }
            c.w.a(0, 0, (e23.a) objQ2, o0VarE, zBooleanValue);
            h4.r.a aVar2 = h4.r.S;
            h4.r rVarE = u1.n.e(c2.x2.d(aVar2, 1.0f), vb.h.f(d92.b.f58623a, o0VarE), o4.m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, o0VarE, 0);
            int iHashCode = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA0 = o0VarE.a0();
            h4.r rVarC = h4.k.c(rVarE, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar3 = h5.g.a.f81805b;
            String string = null;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
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
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            c2.b0 b0Var = c2.b0.f22601a;
            if (z6().M6()) {
                jv1.s sVarI6 = z6().i6();
                strR5 = sVarI6 != null ? sVarI6.f101139r : null;
                if (strR5 == null) {
                    aw1.h hVarZ6 = z6();
                    context.getClass();
                    jv1.s sVar = (jv1.s) hVarZ6.j6().d();
                    jv1.h hVar = sVar != null ? sVar.f101127f : null;
                    jv1.g gVar = hVar instanceof jv1.g ? (jv1.g) hVar : null;
                    String strA = (gVar == null || (nVar = gVar.f101054c) == null) ? null : nVar.a(context);
                    strR5 = strA != null ? context.getString(R.string.named_plan, strA) : null;
                }
            } else {
                jv1.s sVarI7 = z6().i6();
                strR5 = sVarI7 != null ? sVarI7.f101138q : null;
                if (strR5 == null) {
                    aw1.h hVarZ7 = z6();
                    Context contextRequireContext = requireContext();
                    contextRequireContext.getClass();
                    strR5 = hVarZ7.r5(contextRequireContext);
                }
            }
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.valueOf(g22.n.d(strR5)));
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(strR5);
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var4 = (p3.p1) objQ4;
            if (z6().N6() && !z6().f13385r1) {
                string = getString(R.string.add_to_calendar_as_private_event);
            }
            String str = string;
            String string2 = z6().M6() ? getString(R.string.name_your_event_question) : getString(R.string.name_your_plan_question);
            string2.getClass();
            d92.b.f58625c.getClass();
            g02.b2.a(c2.l.C(aVar2, 0.0f, 0.0f, 0.0f, j92.b.f97899b.f97921f, 7), z14, i14, i15, string2, str, null, null, null, o0VarE, (i17 << 3) & 8176, 448);
            String str2 = (String) p1Var4.getF182175a();
            if (str2 == null) {
                str2 = "";
            }
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                p1Var = p1Var4;
                objQ5 = new am.c1(p1Var, p1Var3, 5);
                o0VarE.K(objQ5);
            } else {
                p1Var = p1Var4;
            }
            y6(str2, (e23.l) objQ5, o0VarE, ((i17 >> 3) & 7168) | 432);
            c2.l.f(b0Var.a(aVar2, 1.0f, true), o0VarE);
            b82.c.b(null, null, z3.f.c(-746861485, new a42.c(20, aVar, this, activity, context, p1Var3, p1Var), o0VarE), null, 0L, o0VarE, 384, 27);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.a(this, z14, i14, i15, aVar, i16);
        }
    }

    @Override // ew1.u
    public final String x3() {
        return "FBTNameYourPlanFragCompose";
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:60:0x015a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179  */
    /* JADX WARN: Code duplicated, block: B:65:0x0180  */
    /* JADX WARN: Code duplicated, block: B:66:0x0184  */
    /* JADX WARN: Code duplicated, block: B:71:0x019f  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:92:0x0248  */
    /* JADX WARN: Code duplicated, block: B:93:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:95:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:97:0x02d1  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void y6(String str, e23.l lVar, p3.m mVar, int i14) {
        String str2;
        int i15;
        p3.o0 o0Var;
        p3.p1 p1Var;
        boolean z14;
        p3.c<?> cVar;
        h5.g.a.f fVar;
        c2.z zVarA;
        int iHashCode;
        p3.i2 i2VarA0;
        h4.r rVarC;
        f5.z0 z0VarD;
        int iHashCode2;
        p3.i2 i2VarA1;
        h4.r rVarC2;
        z3.e eVar;
        Object objQ;
        p3.p1 p1Var2;
        boolean z15;
        Object objQ2;
        lVar.getClass();
        p3.o0 o0VarE = mVar.E(381767947);
        p3.c<?> cVar2 = o0VarE.f135177b;
        if ((i14 & 6) == 0) {
            str2 = str;
            i15 = (o0VarE.B(str2) ? 4 : 2) | i14;
        } else {
            str2 = str;
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= o0VarE.k(50) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= o0VarE.r(lVar) ? 256 : 128;
        }
        int i16 = i15;
        if (o0VarE.n(i16 & 1, (i16 & 147) != 146)) {
            p3.x1 x1Var = p3.n.f135158a;
            Object objQ3 = o0VarE.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ3 == c2565a) {
                objQ3 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ3);
            }
            p3.p1 p1Var3 = (p3.p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                p1Var = p1Var3;
                String str3 = str2;
                z14 = false;
                objQ4 = p3.p0.n(new x5.l0(str3, 0L, (s5.w0) null, 6, (p005kotlin.jvm.internal.j) null));
                o0VarE.K(objQ4);
            } else {
                p1Var = p1Var3;
                z14 = false;
            }
            p3.p1 p1Var4 = (p3.p1) objQ4;
            z3.e eVarC = z3.f.c(-359291502, new bt1.k(lVar, p1Var4, 6), o0VarE);
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            f5.z0 z0VarD2 = c2.q.d(h4.d.a.f81524b, z14);
            int iHashCode3 = Long.hashCode(o0VarE.U);
            p3.i2 i2VarA2 = o0VarE.a0();
            h4.r rVarC3 = h4.k.c(aVar, o0VarE);
            h5.g.V.getClass();
            h5.e0.a aVar2 = h5.g.a.f81805b;
            if (cVar2 == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            b4.c(eVar2, z0VarD2, o0VarE);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarA2, o0VarE);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (o0VarE.T) {
                cVar = cVar2;
            } else {
                cVar = cVar2;
                if (!p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode3))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC3, o0VarE);
                c2.u uVar = c2.u.f22885a;
                c2.j.f22691a.getClass();
                zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
                iHashCode = Long.hashCode(o0VarE.U);
                i2VarA0 = o0VarE.a0();
                rVarC = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, zVarA, o0VarE);
                b4.c(c1623g, i2VarA0, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode))) {
                    v.h.A(iHashCode, o0VarE, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, o0VarE);
                c2.b0 b0Var = c2.b0.f22601a;
                z0VarD = c2.q.d(h4.d.a.f81529g, false);
                iHashCode2 = Long.hashCode(o0VarE.U);
                i2VarA1 = o0VarE.a0();
                rVarC2 = h4.k.c(aVar, o0VarE);
                if (cVar != null) {
                    p3.p0.l();
                    throw null;
                }
                o0VarE.z();
                if (o0VarE.T) {
                    o0VarE.M(aVar2);
                } else {
                    o0VarE.c();
                }
                b4.c(eVar2, z0VarD, o0VarE);
                b4.c(c1623g, i2VarA1, o0VarE);
                if (o0VarE.T || !p005kotlin.jvm.internal.s.g(o0VarE.q(), Integer.valueOf(iHashCode2))) {
                    v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, o0VarE);
                x5.l0 l0Var = (x5.l0) p1Var4.getF182175a();
                long jD = ds.e0.d(d92.b.f58623a, o0VarE);
                if (((Boolean) p1Var.getF182175a()).booleanValue() || !g22.n.d(((x5.l0) p1Var4.getF182175a()).f188878a.f157138b)) {
                    eVar = null;
                } else {
                    eVar = eVarC;
                }
                objQ = o0VarE.q();
                if (objQ == c2565a) {
                    p1Var2 = p1Var;
                    objQ = new et1.b2(p1Var2, 3);
                    o0VarE.K(objQ);
                } else {
                    p1Var2 = p1Var;
                }
                e23.l lVar2 = (e23.l) objQ;
                if ((i16 & 896) == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objQ2 = o0VarE.q();
                if (z15 || objQ2 == c2565a) {
                    objQ2 = new a11.b0(lVar, p1Var4, 12);
                    o0VarE.K(objQ2);
                }
                l72.p1.b(l0Var, null, null, 50, false, false, null, jD, null, eVar, null, null, null, lVar2, (e23.l) objQ2, o0VarE, ((i16 << 6) & 7168) | 24576, 3072, 7526);
                o0Var = o0VarE;
                o0Var.g0(true);
                if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                    o0Var.C(266281893);
                    String strF = androidx.core.view.j.f(((x5.l0) p1Var4.getF182175a()).f188878a.f157138b.length(), " / 50");
                    d6.h.f57752b.getClass();
                    int i17 = d6.h.f57758h;
                    d92.b.f58624b.getClass();
                    s5.x0 x0VarF = d92.c.f(j92.f.f97932i, o0Var);
                    h4.r rVarF = c2.x2.f(aVar, 1.0f);
                    j92.b bVar2 = d92.b.f58625c;
                    bVar2.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f14 = eVar3.f97920e;
                    bVar2.getClass();
                    float f15 = eVar3.f97917b;
                    bVar2.getClass();
                    mh.c(strF, c2.l.C(rVarF, 0.0f, f15, f14, eVar3.f97920e, 1), 0L, null, 0L, null, 0L, d6.h.a(i17), 0L, 0, false, 0, 0, null, x0VarF, o0Var, 0, 0, 130044);
                    o0Var.g0(false);
                } else {
                    o0Var.C(266787379);
                    o0Var.g0(false);
                }
                o0Var.g0(true);
                o0Var.g0(true);
            }
            v.h.A(iHashCode3, o0VarE, iHashCode3, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC3, o0VarE);
            c2.u uVar2 = c2.u.f22885a;
            c2.j.f22691a.getClass();
            zVarA = c2.y.a(c2.j.f22694d, h4.d.a.f81536n, o0VarE, 0);
            iHashCode = Long.hashCode(o0VarE.U);
            i2VarA0 = o0VarE.a0();
            rVarC = h4.k.c(aVar, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, zVarA, o0VarE);
            b4.c(c1623g, i2VarA0, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            } else {
                v.h.A(iHashCode, o0VarE, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, o0VarE);
            c2.b0 b0Var2 = c2.b0.f22601a;
            z0VarD = c2.q.d(h4.d.a.f81529g, false);
            iHashCode2 = Long.hashCode(o0VarE.U);
            i2VarA1 = o0VarE.a0();
            rVarC2 = h4.k.c(aVar, o0VarE);
            if (cVar != null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar2);
            } else {
                o0VarE.c();
            }
            b4.c(eVar2, z0VarD, o0VarE);
            b4.c(c1623g, i2VarA1, o0VarE);
            if (o0VarE.T) {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            } else {
                v.h.A(iHashCode2, o0VarE, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, o0VarE);
            x5.l0 l0Var2 = (x5.l0) p1Var4.getF182175a();
            long jD2 = ds.e0.d(d92.b.f58623a, o0VarE);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                eVar = null;
            } else {
                eVar = null;
            }
            objQ = o0VarE.q();
            if (objQ == c2565a) {
                p1Var2 = p1Var;
                objQ = new et1.b2(p1Var2, 3);
                o0VarE.K(objQ);
            } else {
                p1Var2 = p1Var;
            }
            e23.l lVar3 = (e23.l) objQ;
            if ((i16 & 896) == 256) {
                z15 = true;
            } else {
                z15 = false;
            }
            objQ2 = o0VarE.q();
            if (z15) {
                objQ2 = new a11.b0(lVar, p1Var4, 12);
                o0VarE.K(objQ2);
            } else {
                objQ2 = new a11.b0(lVar, p1Var4, 12);
                o0VarE.K(objQ2);
            }
            l72.p1.b(l0Var2, null, null, 50, false, false, null, jD2, null, eVar, null, null, null, lVar3, (e23.l) objQ2, o0VarE, ((i16 << 6) & 7168) | 24576, 3072, 7526);
            o0Var = o0VarE;
            o0Var.g0(true);
            if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                o0Var.C(266281893);
                String strF2 = androidx.core.view.j.f(((x5.l0) p1Var4.getF182175a()).f188878a.f157138b.length(), " / 50");
                d6.h.f57752b.getClass();
                int i18 = d6.h.f57758h;
                d92.b.f58624b.getClass();
                s5.x0 x0VarF2 = d92.c.f(j92.f.f97932i, o0Var);
                h4.r rVarF2 = c2.x2.f(aVar, 1.0f);
                j92.b bVar3 = d92.b.f58625c;
                bVar3.getClass();
                j92.e eVar4 = j92.b.f97899b;
                float f16 = eVar4.f97920e;
                bVar3.getClass();
                float f17 = eVar4.f97917b;
                bVar3.getClass();
                mh.c(strF2, c2.l.C(rVarF2, 0.0f, f17, f16, eVar4.f97920e, 1), 0L, null, 0L, null, 0L, d6.h.a(i18), 0L, 0, false, 0, 0, null, x0VarF2, o0Var, 0, 0, 130044);
                o0Var.g0(false);
            } else {
                o0Var.C(266787379);
                o0Var.g0(false);
            }
            o0Var.g0(true);
            o0Var.g0(true);
        } else {
            o0Var = o0VarE;
            o0Var.e();
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new cn1.p(this, str, lVar, i14, 23);
        }
    }

    public final aw1.h z6() {
        return (aw1.h) this.f66452b.getValue();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lew1/f1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "MAX_CHAR_LENGTH", "I", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
