package o72;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v62.o7;

/* JADX INFO: loaded from: classes9.dex */
public final class u3 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.TitleBarExamplesKt$TitleBarExamples$3$1", f = "TitleBarExamples.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m4.b0 f130619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p3.p1<Boolean> f130620b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m4.b0 b0Var, p3.p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f130619a = b0Var;
            this.f130620b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f130619a, this.f130620b, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            if (this.f130620b.getF182175a().booleanValue()) {
                m4.b0.a(this.f130619a);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0071  */
    /* JADX WARN: Code duplicated, block: B:17:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x021d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [b92.a, kotlin.jvm.internal.j] */
    public static final void a(p3.m mVar, int i14) {
        ?? r14;
        Context context;
        p3.o0 o0VarE = mVar.E(683574901);
        if (o0VarE.n(i14 & 1, i14 != 0)) {
            p3.x1 x1Var = p3.n.f135158a;
            Context context2 = (Context) o0VarE.A(AndroidCompositionLocals_androidKt.f6042b);
            u4.d.b bVar = u4.d.f168373k;
            l72.i3 i3Var = new l72.i3("MENU_DIALOG", "Dialog", false, n5.e.b(R.drawable.ic_palette_24dp, o0VarE, 6), "Dialog", 4, (p005kotlin.jvm.internal.j) null);
            i53.f fVarA = i53.a.a(new l72.i3("MENU_HELP", "Help", false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new l72.i3("MENU_DELETE", "Delete", false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null));
            boolean zR = o0VarE.r(context2);
            Object objQ = o0VarE.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zR) {
                objQ = new f(context2, 19);
                o0VarE.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new f(context2, 19);
                    o0VarE.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            boolean zR2 = o0VarE.r(context2);
            Object objQ2 = o0VarE.q();
            if (zR2) {
                objQ2 = new a51.m(context2, 28);
                o0VarE.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new a51.m(context2, 28);
                    o0VarE.K(objQ2);
                }
            }
            e23.l lVar = (e23.l) objQ2;
            h4.r.a aVar3 = h4.r.S;
            float f14 = 8;
            g6.f.a aVar4 = g6.f.f75994b;
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            l72.h3.e(null, "Title", null, null, null, null, null, o0VarE, 48, 125);
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            l72.h3.e(null, "Title", "Subtitle", null, null, null, null, o0VarE, 432, 121);
            o0VarE = o0VarE;
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
            c0235a.f16962a.put("navigateIconDescription", "Navigate Back");
            b92.a aVarB = c0235a.b();
            int i15 = b3.a.f15501a;
            u4.d dVarA = c3.a.a();
            int i16 = b92.a.f16960b;
            l72.h3.f(dVarA, "Title", "Subtitle", aVarB, aVar2, null, fVarA, lVar, null, o0VarE, 2097584, 288);
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            l72.h3.f(c3.a.a(), "Title Title long long long long long long long long title", "Subtitle Title long long long long long long long long long long long title dfsfdsf dfsfdjsfhjds fjdshf ", aVarB, aVar2, i53.a.a(i3Var), fVarA, lVar, null, o0VarE, 2359728, 256);
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            b3.b.f15502a.getClass();
            u4.d dVarC = d3.m.f57316a;
            if (dVarC != null) {
                r14 = 0;
            } else {
                u4.d.a aVar5 = new u4.d.a("Filled.Menu", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96, null);
                p13.j0 j0Var = u4.m.f168519a;
                o4.d0.f128823b.getClass();
                r14 = 0;
                o4.t1 t1Var = new o4.t1(o4.d0.f128824c, null);
                o4.u1.f129010b.getClass();
                o4.v1.f129019b.getClass();
                int i17 = o4.v1.f129021d;
                u4.e eVar = new u4.e();
                eVar.k(3.0f, 18.0f);
                eVar.h(18.0f);
                eVar.p(-2.0f);
                eVar.i(3.0f, 16.0f);
                eVar.p(2.0f);
                eVar.c();
                eVar.k(3.0f, 13.0f);
                eVar.h(18.0f);
                eVar.p(-2.0f);
                eVar.i(3.0f, 11.0f);
                eVar.p(2.0f);
                eVar.c();
                eVar.k(3.0f, 6.0f);
                eVar.p(2.0f);
                eVar.h(18.0f);
                com.nimbusds.jose.shaded.gson.internal.a.z(eVar, 21.0f, 6.0f, 3.0f, 6.0f);
                u4.d.a.b(aVar5, eVar.f168407a, 0, t1Var, 1.0f, null, 1.0f, i17, 1.0f);
                dVarC = aVar5.c();
                d3.m.f57316a = dVarC;
            }
            b92.a.C0235a c0235a2 = new b92.a.C0235a(r14, 1, r14);
            c0235a2.f16962a.put("navigateIconDescription", "Menu");
            b92.a aVarB2 = c0235a2.b();
            boolean zR3 = o0VarE.r(context2);
            Object objQ3 = o0VarE.q();
            if (zR3) {
                objQ3 = new f(context2, 21);
                o0VarE.K(objQ3);
            } else {
                aVar.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new f(context2, 21);
                    o0VarE.K(objQ3);
                }
            }
            l72.h3.f(dVarC, "Title", "Subtitle", aVarB2, (e23.a) objQ3, i53.a.a(i3Var), null, lVar, null, o0VarE, 262576, 320);
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            l72.h3.f(null, "Title long long long long long long long long title", null, null, null, i53.a.a(new l72.i3("MENU_HELP", "Help", false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null)), null, lVar, null, o0VarE, 262192, 349);
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            l72.h3.f(null, "Disabled Text Menu", null, null, null, i53.a.a(new l72.i3("MENU_HELP", "Help", false, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null)), null, lVar, null, o0VarE, 262192, 349);
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            String str = i3Var.f111063a;
            str.getClass();
            String str2 = i3Var.f111064b;
            str2.getClass();
            l72.h3.f(null, "Disabled Icon Menu", null, null, null, i53.a.a(new l72.i3(str, str2, false, i3Var.f111066d, i3Var.f111067e)), null, lVar, null, o0VarE, 262192, 349);
            i53.f fVarA2 = i53.a.a(new l72.i3("MENU_HELP", "Help", false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new l72.i3("MENU_DELETE", "Delete", false, (u4.d) null, (String) null, 24, (p005kotlin.jvm.internal.j) null));
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            l72.h3.f(c3.a.a(), "Disabled Context Menu Item", null, aVarB, aVar2, null, fVarA2, lVar, null, o0VarE, 2097200, 292);
            i53.f fVarA3 = i53.a.a(new l72.i3("MENU_HELP", "Help", false, (u4.d) null, (String) null, 28, (p005kotlin.jvm.internal.j) null), new l72.i3("MENU_DELETE", "Delete", false, null, null, true, null, null, 220, null));
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            l72.h3.f(c3.a.a(), "Menu With Divider", null, aVarB, aVar2, null, fVarA3, lVar, null, o0VarE, 2097200, 292);
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            Object objQ4 = o0VarE.q();
            aVar.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ4 == c2565a) {
                objQ4 = p3.p0.n(Boolean.FALSE);
                o0VarE.K(objQ4);
            }
            p3.p1 p1Var = (p3.p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p3.p0.n("");
                o0VarE.K(objQ5);
            }
            p3.p1 p1Var2 = (p3.p1) objQ5;
            s62.a.f157643a.getClass();
            l72.i3 i3Var2 = new l72.i3("MENU_SEARCH", "Search", false, o7.a(t62.b.f162798a), "Search", 4, (p005kotlin.jvm.internal.j) null);
            boolean zR4 = o0VarE.r(context2);
            Object objQ6 = o0VarE.q();
            if (zR4 || objQ6 == c2565a) {
                objQ6 = new y2(context2, p1Var, p1Var2, 3);
                o0VarE.K(objQ6);
            }
            e23.a aVar6 = (e23.a) objQ6;
            boolean zBooleanValue = ((Boolean) p1Var.getF182175a()).booleanValue();
            boolean zB = o0VarE.B(aVar6);
            Object objQ7 = o0VarE.q();
            if (zB || objQ7 == c2565a) {
                objQ7 = new nw0.x(aVar6, 23);
                o0VarE.K(objQ7);
            }
            c.w.a(0, 0, (e23.a) objQ7, o0VarE, zBooleanValue);
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = kg.f.j(o0VarE);
            }
            m4.b0 b0Var = (m4.b0) objQ8;
            Boolean bool = (Boolean) p1Var.getF182175a();
            bool.getClass();
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = new a(b0Var, p1Var, null);
                o0VarE.K(objQ9);
            }
            p3.l0.e((e23.p) objQ9, bool, o0VarE);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                o0VarE.C(1945101396);
                l72.h3.d(c3.a.a(), aVarB, aVar6, null, null, z3.f.c(-1701983771, new ng2.i(b0Var, 4, context2, p1Var2), o0VarE), o0VarE, 196608, 24);
                o0VarE.g0(false);
                context = context2;
            } else {
                o0VarE.C(1945825835);
                u4.d dVarA2 = c3.a.a();
                i53.f fVarA4 = i53.a.a(i3Var2);
                boolean zB2 = o0VarE.B(lVar);
                Object objQ10 = o0VarE.q();
                if (zB2 || objQ10 == c2565a) {
                    objQ10 = new a11.b0(lVar, p1Var, 29);
                    o0VarE.K(objQ10);
                }
                context = context2;
                l72.h3.f(dVarA2, "Searchable Page Title", null, aVarB, aVar2, fVarA4, fVarA, (e23.l) objQ10, null, o0VarE, 2359344, 260);
                o0VarE.g0(false);
            }
            c2.l.f(c2.l.A(aVar3, 0.0f, f14, 1), o0VarE);
            z3.e eVarC = z3.f.c(-1996025472, new ho0.f(context, 11), o0VarE);
            k1.f130459a.getClass();
            l72.h3.c(eVarC, null, k1.f130461c, o0VarE, 24582);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new o3(i14, 5);
        }
    }

    public static final void b(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }
}
