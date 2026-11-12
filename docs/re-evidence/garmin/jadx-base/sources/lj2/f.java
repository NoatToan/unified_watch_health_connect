package lj2;

import android.annotation.SuppressLint;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import b21.a5;
import com.garmin.android.apps.connectmobile.R;
import e23.l;
import e23.p;
import e23.q;
import f4.u;
import i3.b4;
import i3.e5;
import i3.kb;
import java.util.List;
import java.util.Locale;
import l72.i3;
import lc.y;
import nj2.n;
import o13.r;
import o53.b0;
import o53.f0;
import o53.m0;
import org.koin.bundle.CreationExtrasExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.compose.KoinApplicationKt;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s0;
import p13.j0;
import p3.l0;
import p3.m;
import p3.n1;
import p3.o0;
import p3.p0;
import p3.p1;
import p3.p2;
import p3.x1;
import p3.x3;

/* JADX INFO: loaded from: classes11.dex */
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.customermanagementlib.ui.composables.screens.AddEditAddressScreenKt$AddEditAddressScreen$1$1", f = "AddEditAddressScreen.kt", l = {244}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f113112b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p1<Boolean> p1Var, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f113112b = p1Var;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f113112b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f113111a;
            p1<Boolean> p1Var = this.f113112b;
            if (i14 == 0) {
                r.b(obj);
                if (!p1Var.getF182175a().booleanValue()) {
                    return Unit.INSTANCE;
                }
                this.f113111a = 1;
                if (m0.b(500L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            p1Var.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.customermanagementlib.ui.composables.screens.AddEditAddressScreenKt$AddEditAddressScreen$2$1", f = "AddEditAddressScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f113113a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nj2.a f113114b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, nj2.a aVar, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f113113a = str;
            this.f113114b = aVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f113113a, this.f113114b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            nj2.a aVar2 = this.f113114b;
            String str = this.f113113a;
            if (str != null) {
                aVar2.f126252d.setValue(Boolean.TRUE);
                ge1.b.T(v1.a(aVar2), null, null, new n(aVar2, str, false, null), 3);
            }
            aVar2.getClass();
            ge1.b.T(v1.a(aVar2), null, null, new nj2.j(aVar2, null), 3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.customermanagementlib.ui.composables.screens.AddEditAddressScreenKt$AddEditAddressScreen$onMenuItemSelectedHandler$1$1$2", f = "AddEditAddressScreen.kt", l = {182}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f113115a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ nj2.a f113116b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f113117c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ x3<cj2.b> f113118d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ y f113119e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f113120f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f113121g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p1<Boolean> f113122h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ u<nj2.a.b, o13.p<Boolean, Integer>> f113123i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(nj2.a aVar, String str, x3<? extends cj2.b> x3Var, y yVar, String str2, p1<Boolean> p1Var, p1<Boolean> p1Var2, u<nj2.a.b, o13.p<Boolean, Integer>> uVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f113116b = aVar;
            this.f113117c = str;
            this.f113118d = x3Var;
            this.f113119e = yVar;
            this.f113120f = str2;
            this.f113121g = p1Var;
            this.f113122h = p1Var2;
            this.f113123i = uVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f113116b, this.f113117c, this.f113118d, this.f113119e, this.f113120f, this.f113121g, this.f113122h, this.f113123i, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f113115a;
            if (i14 == 0) {
                r.b(obj);
                nj2.a aVar2 = this.f113116b;
                String str = this.f113117c;
                a5 a5Var = new a5(aVar2, str, this.f113118d, this.f113119e, this.f113120f, this.f113121g, this.f113122h, this.f113123i, 6);
                this.f113115a = 1;
                if (aVar2.R4(str, a5Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"MutableCollectionMutableState"})
    public static final void a(String str, final y yVar, nj2.a aVar, String str2, final String str3, m mVar, int i14, int i15) {
        String str4;
        int i16;
        String str5;
        int i17;
        o0 o0Var;
        String str6;
        nj2.a aVar2;
        String str7;
        String str8;
        nj2.a aVar3;
        int i18;
        boolean z14;
        String strJ;
        String str9;
        Object b4Var;
        p1 p1Var;
        int i19;
        u uVar;
        yVar.getClass();
        o0 o0VarE = mVar.E(-28092243);
        int i24 = i15 & 1;
        if (i24 != 0) {
            i16 = i14 | 6;
            str4 = str;
        } else {
            str4 = str;
            i16 = i14 | (o0VarE.B(str4) ? 4 : 2);
        }
        int i25 = i16 | (o0VarE.r(yVar) ? 32 : 16);
        int i26 = i25 | 128;
        int i27 = i15 & 8;
        if (i27 != 0) {
            i17 = i25 | 3200;
            str5 = str2;
        } else {
            str5 = str2;
            i17 = i26 | (o0VarE.B(str5) ? 2048 : 1024);
        }
        if (o0VarE.n(i17 & 1, (i17 & 9363) != 9362)) {
            o0VarE.G0();
            if ((i14 & 1) == 0 || o0VarE.o0()) {
                if (i24 != 0) {
                    str4 = null;
                }
                o0VarE.L(-1614864554);
                v9.a.f176280a.getClass();
                ViewModelStoreOwner viewModelStoreOwnerA = v9.a.a(o0VarE);
                if (viewModelStoreOwnerA == null) {
                    vb.h.z("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                u1 u1VarResolveViewModel = GetViewModelKt.resolveViewModel(s0.f105811a.b(nj2.a.class), viewModelStoreOwnerA.getF189591b(), null, CreationExtrasExtKt.defaultExtras(viewModelStoreOwnerA), null, KoinApplicationKt.currentKoinScope(o0VarE, 0), null);
                o0VarE.g0(false);
                nj2.a aVar4 = (nj2.a) u1VarResolveViewModel;
                int i28 = i17 & (-897);
                str7 = str4;
                str8 = i27 != 0 ? null : str5;
                aVar3 = aVar4;
                i18 = i28;
            } else {
                o0VarE.e();
                i18 = i17 & (-897);
                str7 = str4;
                str8 = str5;
                aVar3 = aVar;
            }
            o0VarE.h0();
            x1 x1Var = p3.n.f135158a;
            final String language = Locale.getDefault().getLanguage();
            y0<List<fj2.f>> y0Var = aVar3.f126271y;
            j0 j0Var = j0.f134944a;
            final p1 p1VarF = f0.F(y0Var, j0Var, o0VarE, 48);
            final p1 p1VarF2 = f0.F(aVar3.f126272z, j0Var, o0VarE, 48);
            final p1 p1VarF3 = f0.F(aVar3.f126266r, j0Var, o0VarE, 48);
            final p1 p1VarF4 = f0.F(aVar3.f126267t, j0Var, o0VarE, 48);
            final p1 p1VarF5 = f0.F(aVar3.f126270x, j0Var, o0VarE, 48);
            final p1 p1VarF6 = f0.F(aVar3.f126258j, null, o0VarE, 48);
            Object objQ = o0VarE.q();
            m.f135153a.getClass();
            m.a.C2565a c2565a = m.a.f135155b;
            if (objQ == c2565a) {
                objQ = p0.n(j0Var);
                o0VarE.K(objQ);
            }
            final p1 p1Var2 = (p1) objQ;
            Object objQ2 = o0VarE.q();
            if (objQ2 == c2565a) {
                objQ2 = p0.n(j0Var);
                o0VarE.K(objQ2);
            }
            final p1 p1Var3 = (p1) objQ2;
            Object objQ3 = o0VarE.q();
            if (objQ3 == c2565a) {
                objQ3 = p0.n("---");
                o0VarE.K(objQ3);
            }
            final p1 p1Var4 = (p1) objQ3;
            Object objQ4 = o0VarE.q();
            if (objQ4 == c2565a) {
                objQ4 = p0.n("---");
                o0VarE.K(objQ4);
            }
            final p1 p1Var5 = (p1) objQ4;
            Object objQ5 = o0VarE.q();
            if (objQ5 == c2565a) {
                objQ5 = p0.n("---");
                o0VarE.K(objQ5);
            }
            final p1 p1Var6 = (p1) objQ5;
            Object objQ6 = o0VarE.q();
            if (objQ6 == c2565a) {
                objQ6 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ6);
            }
            final p1 p1Var7 = (p1) objQ6;
            Object objQ7 = o0VarE.q();
            if (objQ7 == c2565a) {
                objQ7 = p0.n(Boolean.TRUE);
                o0VarE.K(objQ7);
            }
            final p1 p1Var8 = (p1) objQ7;
            Object objQ8 = o0VarE.q();
            if (objQ8 == c2565a) {
                objQ8 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ8);
            }
            final p1 p1Var9 = (p1) objQ8;
            Object objQ9 = o0VarE.q();
            if (objQ9 == c2565a) {
                objQ9 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ9);
            }
            final p1 p1Var10 = (p1) objQ9;
            Object objQ10 = o0VarE.q();
            if (objQ10 == c2565a) {
                objQ10 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ10);
            }
            final p1 p1Var11 = (p1) objQ10;
            Object objQ11 = o0VarE.q();
            if (objQ11 == c2565a) {
                objQ11 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ11);
            }
            p1 p1Var12 = (p1) objQ11;
            Object objQ12 = o0VarE.q();
            if (objQ12 == c2565a) {
                objQ12 = p0.n(Boolean.FALSE);
                o0VarE.K(objQ12);
            }
            final p1 p1Var13 = (p1) objQ12;
            Object objQ13 = o0VarE.q();
            if (objQ13 == c2565a) {
                objQ13 = e5.o(R.string.cm_add_address_2_optional, o0VarE);
            }
            final n1 n1Var = (n1) objQ13;
            Object objQ14 = o0VarE.q();
            if (objQ14 == c2565a) {
                o13.p pVar = new o13.p(nj2.a.b.ADDRESS_LINE_1, Boolean.TRUE);
                nj2.a.b bVar = nj2.a.b.ADDRESS_LINE_2;
                Boolean bool = Boolean.FALSE;
                objQ14 = p0.m(pVar, new o13.p(bVar, bool), new o13.p(nj2.a.b.ADDRESS_LINE_3, bool), new o13.p(nj2.a.b.ADDRESS_LINE_4, bool));
                o0VarE.K(objQ14);
            }
            final u uVar2 = (u) objQ14;
            Object objQ15 = o0VarE.q();
            if (objQ15 == c2565a) {
                nj2.a.b bVar2 = nj2.a.b.FIRST_NAME;
                cj2.a.f27739a.getClass();
                o13.p<Boolean, Integer> pVar2 = cj2.a.f27740b;
                objQ15 = p0.m(new o13.p(bVar2, pVar2), new o13.p(nj2.a.b.LAST_NAME, pVar2), new o13.p(nj2.a.b.ADDRESS_LINE_1, pVar2), new o13.p(nj2.a.b.ADDRESS_LINE_2, pVar2), new o13.p(nj2.a.b.ADDRESS_LINE_3, pVar2), new o13.p(nj2.a.b.ADDRESS_LINE_4, pVar2), new o13.p(nj2.a.b.COUNTRY_REGION, pVar2), new o13.p(nj2.a.b.STATE_OR_PROVINCE, pVar2), new o13.p(nj2.a.b.COUNTY_OR_DISTRICT, pVar2), new o13.p(nj2.a.b.CITY, pVar2), new o13.p(nj2.a.b.POSTAL_CODE, pVar2), new o13.p(nj2.a.b.PHONE_REGION, pVar2), new o13.p(nj2.a.b.PHONE_NUMBER, pVar2));
                o0VarE.K(objQ15);
            }
            u uVar3 = (u) objQ15;
            Object objQ16 = o0VarE.q();
            if (objQ16 == c2565a) {
                objQ16 = kg.f.j(o0VarE);
            }
            final m4.b0 b0Var = (m4.b0) objQ16;
            i3 i3Var = new i3("MENU_SAVE", gl1.y.Q(o0VarE, R.string.cm_save), false, (u4.d) null, gl1.y.Q(o0VarE, R.string.cm_save), 12, (p005kotlin.jvm.internal.j) null);
            i3 i3Var2 = new i3("MENU_DONE", gl1.y.Q(o0VarE, R.string.cm_done), false, (u4.d) null, gl1.y.Q(o0VarE, R.string.cm_done), 12, (p005kotlin.jvm.internal.j) null);
            if (str7 == null || str7.length() == 0) {
                z14 = false;
                o0VarE.C(626204843);
                if (str8 == null || str8.length() == 0) {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 626240059, R.string.cm_add_address, o0VarE, false);
                } else {
                    strJ = com.airbnb.lottie.animation.keyframe.a.j(o0VarE, 626367066, R.string.cm_edit_address, o0VarE, false);
                    i3Var = i3Var2;
                }
                o0VarE.g0(false);
                str9 = strJ;
            } else {
                o0VarE.C(626499746);
                z14 = false;
                o0VarE.g0(false);
                str9 = str7;
            }
            int i29 = i18 & 7168;
            boolean zR = o0VarE.r(aVar3) | (i29 == 2048 ? true : z14) | o0VarE.B(p1VarF6) | o0VarE.r(yVar);
            Object objQ17 = o0VarE.q();
            if (zR || objQ17 == c2565a) {
                p1Var = p1Var12;
                i19 = i29;
                b4Var = new b4(aVar3, uVar3, p1Var, p1Var10, str8, p1VarF6, yVar, str3, p1Var13, 2);
                uVar = uVar3;
                o0VarE.K(b4Var);
            } else {
                p1Var = p1Var12;
                i19 = i29;
                b4Var = objQ17;
                uVar = uVar3;
            }
            final l lVar = (l) b4Var;
            Boolean bool2 = (Boolean) p1Var.getF182175a();
            bool2.getClass();
            Object objQ18 = o0VarE.q();
            if (objQ18 == c2565a) {
                objQ18 = new a(p1Var, null);
                o0VarE.K(objQ18);
            }
            l0.e((p) objQ18, bool2, o0VarE);
            Unit unit = Unit.INSTANCE;
            boolean zR2 = (i19 == 2048) | o0VarE.r(aVar3);
            Object objQ19 = o0VarE.q();
            if (zR2 || objQ19 == c2565a) {
                objQ19 = new b(str8, aVar3, null);
                o0VarE.K(objQ19);
            }
            l0.e((p) objQ19, unit, o0VarE);
            final u uVar4 = uVar;
            final nj2.a aVar5 = aVar3;
            final String str10 = str9;
            final String str11 = str8;
            final i3 i3Var3 = i3Var;
            p pVar3 = new p() { // from class: lj2.c
                @Override // e23.p
                public final Object invoke(Object obj, Object obj2) {
                    m mVar2 = (m) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x1 x1Var2 = p3.n.f135158a;
                        String str12 = str10;
                        final nj2.a aVar6 = aVar5;
                        final y yVar2 = yVar;
                        final String str13 = str3;
                        z3.e eVarC = z3.f.c(810462537, new hl1.j(str12, aVar6, yVar2, str13, i3Var3, lVar, 20), mVar2);
                        final p1 p1Var14 = p1Var13;
                        final x3 x3Var = p1VarF2;
                        final m4.b0 b0Var2 = b0Var;
                        final u uVar5 = uVar4;
                        final x3 x3Var2 = p1VarF3;
                        final x3 x3Var3 = p1VarF4;
                        final x3 x3Var4 = p1VarF;
                        final String str14 = language;
                        final String str15 = str11;
                        final u uVar6 = uVar2;
                        final x3 x3Var5 = p1VarF5;
                        final x3 x3Var6 = p1VarF6;
                        final p1 p1Var15 = p1Var11;
                        final p1 p1Var16 = p1Var2;
                        final p1 p1Var17 = p1Var3;
                        final p1 p1Var18 = p1Var8;
                        final n1 n1Var2 = n1Var;
                        final p1 p1Var19 = p1Var7;
                        final p1 p1Var20 = p1Var4;
                        final p1 p1Var21 = p1Var5;
                        final p1 p1Var22 = p1Var6;
                        final p1 p1Var23 = p1Var9;
                        final p1 p1Var24 = p1Var10;
                        kb.a(null, eVarC, null, null, null, 0, 0L, 0L, null, z3.f.c(475808084, new q() { // from class: lj2.e
                            /* JADX WARN: Multi-variable type inference failed */
                            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r17v4 nj2.a
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
                                	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:523)
                                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
                                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                                */
                            @Override // e23.q
                            public final java.lang.Object invoke(java.lang.Object r59, java.lang.Object r60, java.lang.Object r61) {
                                /*
                                    Method dump skipped, instruction units count: 4114
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: lj2.e.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
                            }
                        }, mVar2), mVar2, 805306416, 509);
                    } else {
                        mVar2.e();
                    }
                    return Unit.INSTANCE;
                }
            };
            o0Var = o0VarE;
            lg.d.d(false, null, null, z3.f.c(717662597, pVar3, o0Var), o0Var, 3072, 7);
            aVar2 = aVar5;
            str6 = str11;
            str4 = str7;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            str6 = str5;
            aVar2 = aVar;
        }
        p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new ka0.e(str4, yVar, aVar2, str6, str3, i14, i15);
        }
    }

    public static final String b(p1<String> p1Var) {
        return p1Var.getF182175a();
    }

    public static final void c(p1<String> p1Var, String str) {
        p1Var.setValue(str);
    }

    public static final String d(p1<String> p1Var) {
        return p1Var.getF182175a();
    }

    public static final void e(p1<String> p1Var, String str) {
        p1Var.setValue(str);
    }

    public static final boolean f(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    public static final boolean g(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    public static final void h(List list, p1 p1Var) {
        p1Var.setValue(list);
    }

    public static final void i(p1<Boolean> p1Var, boolean z14) {
        p1Var.setValue(Boolean.valueOf(z14));
    }

    public static final boolean j(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    public static final boolean k(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    public static final boolean l(p1<Boolean> p1Var) {
        return p1Var.getF182175a().booleanValue();
    }

    public static final int m(n1 n1Var) {
        return n1Var.getIntValue();
    }

    public static final void n(List list, p1 p1Var) {
        p1Var.setValue(list);
    }

    public static final String o(p1<String> p1Var) {
        return p1Var.getF182175a();
    }

    public static final void p(p1<String> p1Var, String str) {
        p1Var.setValue(str);
    }
}
