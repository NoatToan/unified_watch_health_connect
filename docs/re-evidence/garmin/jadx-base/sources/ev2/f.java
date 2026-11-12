package ev2;

import a42.c0;
import a42.d0;
import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.lifecycle.v1;
import b21.m;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomCombinedChart;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import com.garmin.android.apps.connectmobile.view.view_3_0.StyledInlineTextFieldViewDark;
import com.garmin.android.apps.ui.catalog.PreviewCatalogActivity;
import com.garmin.customermanagementlib.ui.CustomerManagementLibMainActivity;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity.c;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import d53.u;
import e23.l;
import e23.p;
import ew1.e1;
import ew1.r;
import ew1.u2;
import f2.i0;
import f2.j0;
import fo.o;
import fz1.k;
import gw0.h0;
import i3.e5;
import i3.mc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kr2.h;
import l72.i3;
import lc.m0;
import lc.u0;
import lc.v;
import lj2.f;
import nc.n;
import o53.b0;
import org.apache.commons.lang3.StringUtils;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.r0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p006l2.b2;
import p006l2.f1;
import p006l2.t2;
import p006l2.x0;
import p13.w;
import p3.p1;
import p3.x1;
import p3.x3;
import p5.k0;
import pv0.j;
import pv0.s;
import rl1.i;
import x5.g0;
import x5.l0;
import x5.p0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f66173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f66174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f66175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f66176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f66177e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ f(DeveloperSettingsActivity developerSettingsActivity, p pVar, String str, h hVar) {
        this.f66173a = 19;
        this.f66174b = hVar;
        this.f66175c = developerSettingsActivity;
        this.f66176d = (q) pVar;
        this.f66177e = str;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0482  */
    /* JADX WARN: Code duplicated, block: B:66:0x0499  */
    /* JADX WARN: Code duplicated, block: B:68:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:69:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:74:0x04f5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v5, types: [e23.p, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r3v48, types: [T, java.lang.Object, x5.p0] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // e23.l
    public final Object invoke(Object obj) throws Exception {
        Object next;
        String string;
        int i14 = this.f66173a;
        int i15 = 14;
        int i16 = 8;
        int i17 = 6;
        final int i18 = 2;
        final int i19 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Long lValueOf = null;
        final int i24 = 1;
        Object obj2 = this.f66177e;
        Object obj3 = this.f66176d;
        Object obj4 = this.f66175c;
        Object obj5 = this.f66174b;
        switch (i14) {
            case 0:
                g gVar = (g) obj5;
                dx2.c cVar = (dx2.c) obj4;
                Map<String, ? extends Object> map = (Map) obj3;
                e eVar = (e) obj2;
                int i25 = g.f66178e;
                gVar.j(cVar, map, eVar);
                AppCompatImageView appCompatImageView = gVar.f66179a;
                zw2.g.c cVarD = zw2.f.d(cVar, map);
                com.garmin.realtimesettings.app.initialization.b.f52589a.getClass();
                u53.d dVar = com.garmin.realtimesettings.app.initialization.b.f52593e;
                cx2.g.f(appCompatImageView, cVarD, dVar, 4);
                AppCompatImageView appCompatImageView2 = gVar.f66180b;
                cx2.g.f(appCompatImageView2, cVar.I4(map), dVar, 4);
                cx2.g.g(gVar.f66181c, eVar.f(cVar, map));
                String strE = eVar.e(cVar, map);
                if (strE.length() == 0) {
                    strE = eVar.l(cVar, map);
                }
                Long lK = eVar.k(cVar, map);
                if (lK != null) {
                    appCompatImageView2.setColorFilter(xy2.b.u(lK.longValue()), PorterDuff.Mode.SRC_ATOP);
                }
                cx2.g.g(gVar.f66182d, strE);
                return Unit.INSTANCE;
            case 1:
                r rVar = (r) obj5;
                p1 p1Var = (p1) obj4;
                List list = (List) obj;
                r.a aVar = r.f66699d;
                list.getClass();
                p1Var.setValue(new ArrayList(list));
                Context contextRequireContext = rVar.requireContext();
                contextRequireContext.getClass();
                o13.p<String, Boolean> pVarC6 = rVar.C6(contextRequireContext, (List) p1Var.getF182175a(), rVar.A6().f128594a.intValue(), rVar.A6().f128595b.intValue());
                String str = pVarC6.f128594a;
                Boolean bool = pVarC6.f128595b;
                bool.getClass();
                ((p1) obj3).setValue(str);
                ((p1) obj2).setValue(bool);
                return Unit.INSTANCE;
            case 2:
                e1 e1Var = (e1) obj5;
                p1 p1Var2 = (p1) obj4;
                List list2 = (List) obj;
                e1.a aVar2 = e1.f66409d;
                list2.getClass();
                p1Var2.setValue(new ArrayList(list2));
                o13.p<String, Boolean> pVarA6 = e1Var.A6((l22.a) e1Var.f66411c.getValue(), (List) p1Var2.getF182175a(), e1Var.z6().f128594a.intValue(), e1Var.z6().f128595b.intValue());
                String str2 = pVarA6.f128594a;
                Boolean bool2 = pVarA6.f128595b;
                bool2.getClass();
                ((p1) obj3).setValue(str2);
                ((p1) obj2).setValue(bool2);
                return Unit.INSTANCE;
            case 3:
                u2 u2Var = (u2) obj5;
                p1 p1Var3 = (p1) obj4;
                List list3 = (List) obj;
                u2.a aVar3 = u2.f66789c;
                list3.getClass();
                p1Var3.setValue(new ArrayList(list3));
                Context contextRequireContext2 = u2Var.requireContext();
                contextRequireContext2.getClass();
                o13.p<String, Boolean> pVarA7 = u2Var.A6(contextRequireContext2, (List) p1Var3.getF182175a(), ((Number) u2.z6().f128594a).intValue(), ((Number) u2.z6().f128595b).intValue());
                String str3 = pVarA7.f128594a;
                Boolean bool3 = pVarA7.f128595b;
                bool3.getClass();
                ((p1) obj3).setValue(str3);
                ((p1) obj2).setValue(bool3);
                return Unit.INSTANCE;
            case 4:
                i53.c cVar2 = (i53.c) obj;
                cVar2.getClass();
                ge1.b.T((b0) obj4, null, null, new o((mc) obj3, (p1) obj2, null), 3);
                ((l) obj5).invoke(cVar2);
                return Unit.INSTANCE;
            case 5:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b bVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b) obj5;
                Context context = (Context) obj4;
                p1 p1Var4 = (p1) obj3;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar4 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                Boolean bool4 = Boolean.FALSE;
                ((p1) obj2).setValue(bool4);
                if (zBooleanValue) {
                    bVar.C6(context);
                    p1Var4.setValue(bool4);
                } else {
                    p1Var4.setValue(Boolean.TRUE);
                }
                return Unit.INSTANCE;
            case 6:
                gz1.a aVar5 = (gz1.a) obj5;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b bVar2 = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b) obj4;
                p1 p1Var5 = (p1) obj3;
                p1 p1Var6 = (p1) obj2;
                Long l14 = (Long) obj;
                if (l14 != null) {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar6 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                    p1Var6.setValue(Boolean.FALSE);
                    l3.a aVar7 = l3.f23124b;
                    long jLongValue = l14.longValue();
                    aVar7.getClass();
                    gz1.a aVarA = gz1.a.a(aVar5, null, null, null, l3.a.V(jLongValue, true), null, null, null, null, 0L, null, null, 0.0d, 0L, 8183);
                    Double d14 = aVar5.f80417j;
                    if (bVar2.F6().C4()) {
                        double dDoubleValue = (d14 != null ? d14.doubleValue() : 0.0d) / l14.longValue();
                        bVar2.F6();
                        Context contextRequireContext3 = bVar2.requireContext();
                        contextRequireContext3.getClass();
                        aVarA = gz1.a.a(aVarA, null, null, null, null, null, k.I4(contextRequireContext3, l14.longValue(), d14 != null ? d14.doubleValue() : 0.0d), null, null, 0L, null, null, dDoubleValue, 0L, 6111);
                    } else if (bVar2.F6().E4()) {
                        p1Var5.setValue(Boolean.valueOf(((double) l14.longValue()) <= 0.0d));
                    } else {
                        og0.a aVar8 = og0.a.f131967a;
                        double dLongValue = l14.longValue();
                        double dDoubleValue2 = d14 != null ? d14.doubleValue() : 0.0d;
                        aVar8.getClass();
                        long jD = (long) og0.a.d(dLongValue, dDoubleValue2);
                        String strB = og0.a.b(l14.longValue(), d14 != null ? d14.doubleValue() : 0.0d);
                        bg0.a.C0255a c0255a = bg0.a.f17827a;
                        Context contextRequireContext4 = bVar2.requireContext();
                        contextRequireContext4.getClass();
                        c0255a.getClass();
                        aVarA = gz1.a.a(aVarA, null, null, null, null, null, null, e5.g(strB, StringUtils.SPACE, bg0.a.C0255a.b(contextRequireContext4)), null, jD, null, null, 0.0d, 0L, 7871);
                    }
                    bVar2.F6().E.k(null, gz1.a.a(aVarA, null, null, null, null, null, null, null, Double.valueOf(l14.longValue()), 0L, null, null, 0.0d, 0L, 8063));
                } else {
                    com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar9 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                    p1Var6.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 7:
                pv0.h hVar = (pv0.h) obj5;
                l lVar = (l) obj4;
                e23.a aVar10 = (e23.a) obj3;
                p1 p1Var7 = (p1) obj2;
                s sVar = ((Boolean) obj).booleanValue() ? s.YES : s.NO;
                if (j.b(hVar) == sVar) {
                    lVar.invoke(sVar);
                } else {
                    s sVar2 = s.YES;
                    if (sVar != sVar2 || j.b(hVar) == sVar2) {
                        s sVar3 = s.NO;
                        if (sVar == sVar3 && j.b(hVar) == sVar2) {
                            p1Var7.setValue(Boolean.TRUE);
                        } else if (sVar == sVar3) {
                            lVar.invoke(sVar3);
                        }
                    } else {
                        aVar10.invoke();
                    }
                }
                return Unit.INSTANCE;
            case 8:
                n82.f fVar = (n82.f) obj5;
                e23.a aVar11 = (e23.a) obj3;
                p1 p1Var8 = (p1) obj2;
                fVar.d((o82.g) ((i53.f) obj4).get(((Integer) obj).intValue()));
                if (fVar.f124961b.a() != o82.g.f130850c && ((h0) p1Var8.getF182175a()).f79613e) {
                    aVar11.invoke();
                }
                return Unit.INSTANCE;
            case 9:
                h60.h hVar2 = (h60.h) obj5;
                o82.g gVar2 = (o82.g) obj4;
                Context context2 = (Context) obj3;
                c.q qVar = (c.q) obj2;
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                String str4 = i3Var.f111063a;
                int iHashCode = str4.hashCode();
                if (iHashCode != -2044010161) {
                    if (iHashCode != -429323995) {
                        if (iHashCode == 2213697 && str4.equals("HELP")) {
                            hVar2.getClass();
                            h60.h.x4(gVar2, "help");
                            HelpActivity.a.e(HelpActivity.f36653a, context2, ro0.l.CRITICAL_SWIM_SPEED, null, null, 12);
                        }
                    } else if (str4.equals("ADD_CSS")) {
                        hVar2.getClass();
                        h60.h.x4(gVar2, "addEntry");
                        qVar.a(((h60.b) KoinJavaComponent.get$default(h60.b.class, null, null, 6, null)).a(context2), null);
                    }
                } else if (str4.equals("DELETE_CSS")) {
                    hVar2.y4(hVar2.f82168d);
                }
                return Unit.INSTANCE;
            case 10:
                Object obj6 = (String) obj5;
                s5.c cVar3 = (s5.c) obj4;
                String str5 = (String) obj3;
                e23.a aVar12 = (e23.a) obj2;
                k0 k0Var = (k0) obj;
                h82.r rVar2 = h82.r.f82497a;
                k0Var.getClass();
                if (obj6 == null) {
                    obj6 = cVar3;
                }
                p5.h0.n(k0Var, u.v(u.v(obj6.toString(), "<link>", "", false), "</link>", "", false));
                p5.h0.p(k0Var, w.c(new p5.g(str5, new gt1.s(aVar12, 6))));
                return Unit.INSTANCE;
            case 11:
                String str6 = (String) obj5;
                com.garmin.android.apps.connectmobile.webtranslation.b bVar3 = (com.garmin.android.apps.connectmobile.webtranslation.b) obj4;
                String str7 = (String) obj3;
                String str8 = (String) obj2;
                ud.a aVar13 = (ud.a) obj;
                com.garmin.android.apps.connectmobile.webtranslation.b.c cVar4 = com.garmin.android.apps.connectmobile.webtranslation.b.f47973e;
                aVar13.getClass();
                ud.c cVarM0 = aVar13.M0("SELECT id FROM installation_record WHERE version_name = ? AND locale = ? AND tag = ?");
                try {
                    cVarM0.q3(1, str6);
                    bVar3.f47977d.getClass();
                    str7.getClass();
                    cVarM0.q3(2, str7);
                    cVarM0.q3(3, str8);
                    if (cVarM0.J0() && !cVarM0.isNull(0)) {
                        lValueOf = Long.valueOf(cVarM0.getLong(0));
                        break;
                    }
                    return lValueOf;
                } finally {
                    cVarM0.close();
                }
            case 12:
                e23.r rVar3 = (e23.r) obj5;
                d91.s sVar4 = (d91.s) obj4;
                l91.a aVar14 = (l91.a) obj3;
                Context context3 = (Context) obj2;
                d91.h hVar3 = (d91.h) obj;
                hVar3.getClass();
                if (rVar3 != null) {
                    rVar3.invoke(sVar4.f58579a, d91.f.f58528g, null, null);
                }
                if (aVar14 != null) {
                    aVar14.a(context3, hVar3);
                }
                return Unit.INSTANCE;
            case 13:
                i53.c cVar5 = (i53.c) obj5;
                j0 j0Var = (j0) obj;
                j0Var.getClass();
                j0Var.g(cVar5.size(), null, null, i0.f68219a, new z3.e(1635571624, true, new d0(cVar5, (Context) obj4, (l) obj3, (e23.a) obj2)));
                return Unit.INSTANCE;
            case 14:
                sl1.h hVar4 = (sl1.h) obj5;
                rm1.j jVar = (rm1.j) obj4;
                String str9 = (String) obj3;
                ((CustomCombinedChart) obj).getClass();
                i iVar = (i) ((p1) obj2).getF182175a();
                if (iVar != null) {
                    hVar4.b(iVar);
                } else {
                    hVar4.b(null);
                }
                uz.a.a(hVar4, jVar, str9, 4);
                return Unit.INSTANCE;
            case 15:
                Context context4 = (Context) obj5;
                hl.a aVar15 = (hl.a) obj4;
                p1 p1Var9 = (p1) obj3;
                l lVar2 = (l) obj2;
                pu0.b bVar4 = (pu0.b) obj;
                bVar4.getClass();
                f12.l.f68084a.getClass();
                com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
                Iterator<T> it = bVar4.f141193k.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    if (next != null) {
                        String string2 = context4.getString(R.string.lbl_admin_cannot_be_removed);
                        p1Var9.setValue(new lv0.a.b(string2, p6.b.d(context4, R.string.msg_remove_admin_recipient, string2)));
                    } else {
                        if (p005kotlin.jvm.internal.s.g(aVar15, hl.a.c.f84256b)) {
                            string = context4.getString(R.string.live_track_remove_recipient_description, d53.w.i0(og.a.A(bVar4)).toString());
                        } else {
                            if (aVar15 instanceof hl.a.b) {
                                u0.r();
                                return null;
                            }
                            string = context4.getString(R.string.msg_child_livetrack_remove_recipient, d53.w.i0(og.a.A(bVar4)).toString());
                        }
                        string.getClass();
                        String string3 = context4.getString(R.string.live_track_remove_recipient);
                        p1Var9.setValue(new lv0.a.C2188a(string3, string, p6.b.d(context4, R.string.lbl_remove, string3), new iv0.c(lVar2, bVar4, 2)));
                    }
                    return Unit.INSTANCE;
                } while (!p005kotlin.jvm.internal.s.g(((pu0.c) next).f141199a, gVarW0 != null ? gVarW0.f46857a : null));
                if (next != null) {
                    String string4 = context4.getString(R.string.lbl_admin_cannot_be_removed);
                    p1Var9.setValue(new lv0.a.b(string4, p6.b.d(context4, R.string.msg_remove_admin_recipient, string4)));
                } else {
                    if (p005kotlin.jvm.internal.s.g(aVar15, hl.a.c.f84256b)) {
                        string = context4.getString(R.string.live_track_remove_recipient_description, d53.w.i0(og.a.A(bVar4)).toString());
                    } else {
                        if (aVar15 instanceof hl.a.b) {
                            u0.r();
                            return null;
                        }
                        string = context4.getString(R.string.msg_child_livetrack_remove_recipient, d53.w.i0(og.a.A(bVar4)).toString());
                    }
                    string.getClass();
                    String string5 = context4.getString(R.string.live_track_remove_recipient);
                    p1Var9.setValue(new lv0.a.C2188a(string5, string, p6.b.d(context4, R.string.lbl_remove, string5), new iv0.c(lVar2, bVar4, 2)));
                }
                return Unit.INSTANCE;
            case 16:
                rz.a aVar16 = (rz.a) obj5;
                ((CustomBarChart) obj).getClass();
                ((d00.a) aVar16.f155195c.getF173486i()).f56994f = Float.valueOf(0.0f);
                aVar16.c();
                qz.a.b(aVar16, ((iy0.f) obj4).f95790a, ((Context) obj3).getString(R.string.no_data_label), 4);
                ((CustomBarChart) obj2).setTouchEnabled(true);
                return Unit.INSTANCE;
            case 17:
                ((p3.i0) obj).getClass();
                return new j02.f((e23.a) obj5, (p1) obj4, (p1) obj3, (b0) obj2, null);
            case 18:
                final m0 m0Var = (m0) obj5;
                final String str10 = (String) obj4;
                final String str11 = (String) obj3;
                lc.k0 k0Var2 = (lc.k0) obj;
                CustomerManagementLibMainActivity.a aVar17 = CustomerManagementLibMainActivity.f50711h;
                k0Var2.getClass();
                int i26 = 9;
                n.b(k0Var2, "AddressesListRoute", null, null, null, null, null, null, new z3.e(739287758, true, new m(m0Var, i26)), 254);
                final Object[] objArr3 = objArr == true ? 1 : 0;
                n.b(k0Var2, "AddAddressRoute", null, null, null, null, null, null, new z3.e(-2121868937, true, new e23.r() { // from class: jj2.d
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        r1.l lVar3 = (r1.l) obj7;
                        v vVar = (v) obj8;
                        p3.m mVar = (p3.m) obj9;
                        Integer num = (Integer) obj10;
                        switch (objArr3) {
                            case 0:
                                num.intValue();
                                CustomerManagementLibMainActivity.a aVar18 = CustomerManagementLibMainActivity.f50711h;
                                lVar3.getClass();
                                vVar.getClass();
                                x1 x1Var = p3.n.f135158a;
                                f.a(str10, m0Var, null, null, "Exit", mVar, 24576, 12);
                                break;
                            default:
                                num.getClass();
                                CustomerManagementLibMainActivity.a aVar19 = CustomerManagementLibMainActivity.f50711h;
                                lVar3.getClass();
                                vVar.getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                String str12 = str10;
                                if (str12 == null) {
                                    mVar.C(1308397429);
                                    mVar.f();
                                } else {
                                    mVar.C(1308397430);
                                    f.a(null, m0Var, null, str12, "Exit", mVar, 24576, 5);
                                    mVar.f();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 254);
                n.b(k0Var2, "EditAddressRoute", null, null, null, null, null, null, new z3.e(-1068832170, true, new e23.r() { // from class: jj2.d
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        r1.l lVar3 = (r1.l) obj7;
                        v vVar = (v) obj8;
                        p3.m mVar = (p3.m) obj9;
                        Integer num = (Integer) obj10;
                        switch (i24) {
                            case 0:
                                num.intValue();
                                CustomerManagementLibMainActivity.a aVar18 = CustomerManagementLibMainActivity.f50711h;
                                lVar3.getClass();
                                vVar.getClass();
                                x1 x1Var = p3.n.f135158a;
                                f.a(str11, m0Var, null, null, "Exit", mVar, 24576, 12);
                                break;
                            default:
                                num.getClass();
                                CustomerManagementLibMainActivity.a aVar19 = CustomerManagementLibMainActivity.f50711h;
                                lVar3.getClass();
                                vVar.getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                String str12 = str11;
                                if (str12 == null) {
                                    mVar.C(1308397429);
                                    mVar.f();
                                } else {
                                    mVar.C(1308397430);
                                    f.a(null, m0Var, null, str12, "Exit", mVar, 24576, 5);
                                    mVar.f();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }), 254);
                n.b(k0Var2, "EditAddressRoute/{addressId}", null, null, null, null, null, null, new z3.e(-15795403, true, new m(m0Var, i16)), 254);
                n.b(k0Var2, "Exit", null, null, null, null, null, null, new z3.e(1037241364, true, new a6.c((CustomerManagementLibMainActivity) obj2, i26)), 254);
                return Unit.INSTANCE;
            case 19:
                ps2.n nVar = (ps2.n) obj;
                String str12 = DeveloperSettingsActivity.f51946n;
                nVar.getClass();
                ge1.b.T(v1.a((h) obj5), null, null, ((DeveloperSettingsActivity) obj4).new c((q) obj3, nVar, (String) obj2, null), 3);
                return Unit.INSTANCE;
            case 20:
                l lVar3 = (l) obj5;
                l lVar4 = (l) obj4;
                p1 p1Var10 = (p1) obj2;
                String str13 = (String) obj;
                str13.getClass();
                ((p1) obj3).setValue(str13);
                if (str13.length() < 4 || ((String) p1Var10.getF182175a()).length() > str13.length()) {
                    lVar4.invoke(Boolean.FALSE);
                } else {
                    if (lVar3 != null) {
                        lVar3.invoke(str13);
                    }
                    lVar4.invoke(Boolean.TRUE);
                }
                p1Var10.setValue(str13);
                return Unit.INSTANCE;
            case 21:
                Context context5 = (Context) obj5;
                long jLongValue2 = ((Long) obj).longValue();
                String string6 = context5.getString(R.string.lbl_stop_livetrack);
                string6.getClass();
                String string7 = context5.getString(R.string.msg_location_no_longer_shared);
                String string8 = context5.getString(R.string.lbl_stop);
                string8.getClass();
                ((p1) obj2).setValue(new lv0.a.C2188a(string6, string7, string8, new d62.s((kv0.j) obj4, jLongValue2, (p1) obj3, 3)));
                return Unit.INSTANCE;
            case 22:
                b2 b2Var = (b2) obj5;
                x5.m0 m0Var2 = (x5.m0) obj4;
                l0 l0Var = (l0) obj3;
                x5.q qVar2 = (x5.q) obj2;
                if (b2Var.b()) {
                    t2.a aVar18 = t2.f108797a;
                    x5.l lVar5 = b2Var.f108394d;
                    x0 x0Var = b2Var.f108412v;
                    x0 x0Var2 = b2Var.f108413w;
                    aVar18.getClass();
                    r0 r0Var = new r0();
                    k62.k kVar = new k62.k(lVar5, i15, x0Var, r0Var);
                    g0 g0Var = m0Var2.f188886a;
                    g0Var.g(l0Var, qVar2, kVar, x0Var2);
                    ?? p0Var = new p0(m0Var2, g0Var);
                    m0Var2.f188887b.set((p0) p0Var);
                    r0Var.f105810a = p0Var;
                    b2Var.f108395e = p0Var;
                }
                return new f1();
            case 23:
                b.g gVar3 = (b.g) obj5;
                ((p3.i0) obj).getClass();
                fm2.b bVar5 = new fm2.b((m0) obj4, i24, (p51.c) obj3, (Context) obj2);
                gVar3.addOnNewIntentListener(bVar5);
                return new l51.k.b(gVar3, bVar5);
            case 24:
                ms0.e eVar2 = (ms0.e) obj5;
                TripFlightFragment tripFlightFragment = (TripFlightFragment) obj4;
                int i27 = TripFlightFragment.f37039n;
                ((String) obj).getClass();
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = eVar2.f120466b;
                styledInlineTextFieldViewDark.getClass();
                EditText editText = styledInlineTextFieldViewDark.editText;
                editText.getClass();
                editText.removeTextChangedListener((com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.d) obj2);
                editText.setText(tripFlightFragment.w6().f114746c.f198995c);
                Unit unit = Unit.INSTANCE;
                tripFlightFragment.w6().f114749f.k((ls0.d) obj3);
                tripFlightFragment.w6().A4();
                tripFlightFragment.F6(true);
                TripFlightFragment.H6(eVar2, false, null);
                tripFlightFragment.M6();
                return Unit.INSTANCE;
            case 25:
                ms0.e eVar3 = (ms0.e) obj5;
                TripFlightFragment tripFlightFragment2 = (TripFlightFragment) obj4;
                int i28 = TripFlightFragment.f37039n;
                ((String) obj).getClass();
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = eVar3.f120466b;
                styledInlineTextFieldViewDark2.getClass();
                EditText editText2 = styledInlineTextFieldViewDark2.editText;
                editText2.getClass();
                editText2.removeTextChangedListener((com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.c) obj2);
                editText2.setText(tripFlightFragment2.w6().f114746c.f198999g);
                Unit unit2 = Unit.INSTANCE;
                tripFlightFragment2.w6().f114749f.k((ls0.d) obj3);
                tripFlightFragment2.w6().A4();
                tripFlightFragment2.E6(true);
                TripFlightFragment.H6(eVar3, false, null);
                tripFlightFragment2.M6();
                return Unit.INSTANCE;
            case 26:
                m72.i iVar2 = (m72.i) obj5;
                final PreviewCatalogActivity previewCatalogActivity = (PreviewCatalogActivity) obj4;
                final m0 m0Var3 = (m0) obj3;
                final e23.a aVar19 = (e23.a) obj2;
                lc.k0 k0Var3 = (lc.k0) obj;
                int i29 = PreviewCatalogActivity.f49781a;
                k0Var3.getClass();
                z3.e eVar4 = new z3.e(-920637872, true, new d0((Object) previewCatalogActivity, (Object) m0Var3, aVar19, (Object) iVar2, 26));
                p13.k0 k0Var4 = p13.k0.f134949a;
                k0Var4.getClass();
                p13.j0 j0Var2 = p13.j0.f134944a;
                t0 t0Var = s0.f105811a;
                n.a(k0Var3, t0Var.b(w72.g.f.class), k0Var4, j0Var2, null, null, null, null, eVar4);
                n.a(k0Var3, t0Var.b(w72.g.i.class), k0Var4, j0Var2, null, null, null, null, new z3.e(-900835769, true, new ca0.a(m0Var3, aVar19, i17)));
                final Object[] objArr4 = objArr2 == true ? 1 : 0;
                n.a(k0Var3, t0Var.b(w72.g.b.class), k0Var4, j0Var2, null, null, null, null, new z3.e(25918984, true, new e23.r() { // from class: m72.k
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i30 = objArr4;
                        r1.l lVar6 = (r1.l) obj7;
                        v vVar = (v) obj8;
                        p3.m mVar = (p3.m) obj9;
                        ((Integer) obj10).getClass();
                        int i34 = PreviewCatalogActivity.f49781a;
                        switch (i30) {
                            case 0:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Components", aVar19, n72.k.f124897b, mVar, 48);
                                break;
                            case 1:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Colors", aVar19, n72.k.f124899d, mVar, 48);
                                break;
                            case 2:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var3 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Icons", aVar19, n72.k.f124898c, mVar, 48);
                                break;
                            default:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var4 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Patterns", aVar19, n72.k.f124900e, mVar, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var3, t0Var.b(w72.g.a.class), k0Var4, j0Var2, null, null, null, null, new z3.e(952673737, true, new e23.r() { // from class: m72.k
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i30 = i24;
                        r1.l lVar6 = (r1.l) obj7;
                        v vVar = (v) obj8;
                        p3.m mVar = (p3.m) obj9;
                        ((Integer) obj10).getClass();
                        int i34 = PreviewCatalogActivity.f49781a;
                        switch (i30) {
                            case 0:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Components", aVar19, n72.k.f124897b, mVar, 48);
                                break;
                            case 1:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Colors", aVar19, n72.k.f124899d, mVar, 48);
                                break;
                            case 2:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var3 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Icons", aVar19, n72.k.f124898c, mVar, 48);
                                break;
                            default:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var4 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Patterns", aVar19, n72.k.f124900e, mVar, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var3, t0Var.b(w72.g.d.class), k0Var4, j0Var2, null, null, null, null, new z3.e(1879428490, true, new ca0.a(m0Var3, aVar19, 7)));
                n.a(k0Var3, t0Var.b(w72.g.C3398g.class), k0Var4, j0Var2, null, null, null, null, new z3.e(-1488784053, true, new e23.r() { // from class: m72.k
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i30 = i18;
                        r1.l lVar6 = (r1.l) obj7;
                        v vVar = (v) obj8;
                        p3.m mVar = (p3.m) obj9;
                        ((Integer) obj10).getClass();
                        int i34 = PreviewCatalogActivity.f49781a;
                        switch (i30) {
                            case 0:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Components", aVar19, n72.k.f124897b, mVar, 48);
                                break;
                            case 1:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Colors", aVar19, n72.k.f124899d, mVar, 48);
                                break;
                            case 2:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var3 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Icons", aVar19, n72.k.f124898c, mVar, 48);
                                break;
                            default:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var4 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Patterns", aVar19, n72.k.f124900e, mVar, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var3, t0Var.b(w72.g.j.class), k0Var4, j0Var2, null, null, null, null, new z3.e(-562029300, true, new ca0.a(m0Var3, aVar19, i16)));
                n.a(k0Var3, t0Var.b(w72.g.h.class), k0Var4, j0Var2, null, null, null, null, new z3.e(364725453, true, new e23.r() { // from class: m72.k
                    @Override // e23.r
                    public final Object invoke(Object obj7, Object obj8, Object obj9, Object obj10) {
                        int i30 = i19;
                        r1.l lVar6 = (r1.l) obj7;
                        v vVar = (v) obj8;
                        p3.m mVar = (p3.m) obj9;
                        ((Integer) obj10).getClass();
                        int i34 = PreviewCatalogActivity.f49781a;
                        switch (i30) {
                            case 0:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Components", aVar19, n72.k.f124897b, mVar, 48);
                                break;
                            case 1:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var2 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Colors", aVar19, n72.k.f124899d, mVar, 48);
                                break;
                            case 2:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var3 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Icons", aVar19, n72.k.f124898c, mVar, 48);
                                break;
                            default:
                                lVar6.getClass();
                                vVar.getClass();
                                x1 x1Var4 = p3.n.f135158a;
                                previewCatalogActivity.N9(m0Var3, "Patterns", aVar19, n72.k.f124900e, mVar, 48);
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }));
                n.a(k0Var3, t0Var.b(w72.g.e.class), k0Var4, j0Var2, null, null, null, null, new z3.e(1291480206, true, new i91.e(iVar2, i15, m0Var3, aVar19)));
                if (iVar2 != null) {
                    n.a(k0Var3, t0Var.b(w72.g.c.class), k0Var4, j0Var2, null, null, null, null, new z3.e(-1277730453, true, new c0((Object) previewCatalogActivity, (Object) m0Var3, (Object) "GCM Components", aVar19, (Object) iVar2, 20)));
                }
                return Unit.INSTANCE;
            case 27:
                sz.a aVar20 = (sz.a) obj5;
                ((CustomCombinedChart) obj).getClass();
                qz.c<T, IBarLineScatterCandleBubbleDataSet<?>> cVar6 = aVar20.f161313b;
                ge1.c[] cVarArr = (ge1.c[]) ((fe1.o) ((x3) obj2).getF182175a()).f70582d.toArray(new ge1.c[0]);
                cVar6.n(Arrays.copyOf(cVarArr, cVarArr.length));
                aVar20.c();
                qz.a.b(aVar20, (ge1.a) obj4, ((Context) obj3).getString(R.string.lbl_no_respiration_data), 4);
                return Unit.INSTANCE;
            case 28:
                hk1.p pVar = (hk1.p) obj;
                pVar.getClass();
                ((dk1.a) obj5).d((Context) obj4, pVar, (c.q) obj3, new mk1.b(pVar, (l) obj2));
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f fVar2 = (com.garmin.android.apps.connectmobile.leaderboard.challenges.f) obj5;
                String str14 = (String) obj4;
                String str15 = (String) obj3;
                String str16 = (String) obj2;
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.leaderboard.challenges.f.a aVar21 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f.R0;
                g3Var.getClass();
                fw.p pVar2 = g3Var.f35300a;
                fVar2.hideProgressOverlay();
                int i30 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f.c.f37457a[pVar2.ordinal()];
                if (i30 == 1) {
                    fVar2.h7().a(str14, str15, str16);
                    fVar2.h7().notifyDataSetChanged();
                } else if (i30 != 2) {
                    if (i30 != 3) {
                        u0.r();
                        return null;
                    }
                    fVar2.n7();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f66173a = i14;
        this.f66174b = obj;
        this.f66175c = obj2;
        this.f66176d = obj3;
        this.f66177e = obj4;
    }
}
