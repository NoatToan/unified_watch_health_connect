package ds;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.map.GCMMapView;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import i3.e5;
import i3.mc;
import i3.pc;
import java.util.Arrays;
import java.util.List;
import kotlin.h4;
import m92.m0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n0;
import p005kotlin.jvm.internal.q0;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p005kotlin.jvm.internal.x0;
import p006l2.b2;
import p006l2.h1;
import p006l2.i3;
import p006l2.m1;
import p006l2.s2;
import p006l2.t2;
import p13.u0;
import p3.c2;
import p3.p1;
import p3.x3;
import r53.p2;
import s5.w0;
import x5.l0;
import x5.p0;
import z2.h2;
import z2.r2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f60922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f60923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f60924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f60925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f60926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f60927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f60928g;

    public /* synthetic */ e(boolean z14, String str, String str2, String str3, p1 p1Var, p1 p1Var2) {
        this.f60922a = 8;
        this.f60923b = z14;
        this.f60924c = str;
        this.f60927f = str2;
        this.f60928g = str3;
        this.f60925d = p1Var;
        this.f60926e = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // e23.l
    public final Object invoke(Object obj) throws Throwable {
        Object value;
        double d14;
        p0 p0Var;
        f5.c0 c0Var;
        int i14 = this.f60922a;
        int i15 = 16;
        Drawable drawable = null;
        boolean z14 = this.f60923b;
        int i16 = 1;
        Object obj2 = this.f60926e;
        Object obj3 = this.f60925d;
        Object obj4 = this.f60928g;
        Object obj5 = this.f60927f;
        Object obj6 = this.f60924c;
        switch (i14) {
            case 0:
                qr.t tVar = (qr.t) obj6;
                p1 p1Var = (p1) obj2;
                p1 p1Var2 = (p1) obj5;
                x3 x3Var = (x3) obj4;
                Integer num = (Integer) obj;
                nr.p0 p0Var2 = (nr.p0) p13.h0.e0(num.intValue(), (List) ((p1) obj3).getF182175a());
                nr.p0.a aVar = p0Var2 != null ? p0Var2.f127286e : null;
                p1Var.setValue(Boolean.valueOf(aVar instanceof nr.p0.a.h));
                p1Var2.setValue(Boolean.valueOf(aVar instanceof nr.p0.a.i));
                if (!z14 && ((Boolean) x3Var.getF182175a()).booleanValue() && !(aVar instanceof nr.p0.a.b)) {
                    tVar.H4();
                }
                p2 p2Var = tVar.f146527i2;
                do {
                    value = p2Var.getValue();
                    ((Number) value).intValue();
                } while (!p2Var.b(value, num));
                return Unit.INSTANCE;
            case 1:
                gz1.a aVar2 = (gz1.a) obj6;
                Double d15 = aVar2.f80417j;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b bVar = (com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b) obj3;
                boolean z15 = bVar.f45997b;
                q0 q0Var = (q0) obj2;
                n0 n0Var = (n0) obj5;
                e23.l lVar = (e23.l) obj4;
                long jLongValue = ((Long) obj).longValue();
                com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.a aVar3 = com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.f45995d;
                if (z14) {
                    double dDoubleValue = ((d15 != null ? d15.doubleValue() : 0.0d) / ((double) 1000)) / (z15 ? 1.0d : 1.609344d);
                    double dDoubleValue2 = (d15 != null ? d15.doubleValue() : 0.0d) / 1609.344d;
                    double d16 = jLongValue;
                    long j8 = (long) (d16 * dDoubleValue);
                    q0Var.f105808a = j8;
                    l3.a aVar4 = l3.f23124b;
                    aVar4.getClass();
                    if (((int) j8) / DateTimeConstants.SECONDS_PER_HOUR <= 48) {
                        ag0.c.a aVar5 = ag0.c.U0;
                        long j14 = q0Var.f105808a;
                        aVar5.getClass();
                        q0Var.f105808a = dh.b.S(ag0.c.a.a(j14));
                        o13.u uVarA = ag0.c.a.a((long) (dDoubleValue2 * 240));
                        o13.u uVarA2 = ag0.c.a.a((long) (1200 * dDoubleValue2));
                        long j15 = q0Var.f105808a;
                        long jS = dh.b.S(uVarA);
                        long jS2 = dh.b.S(uVarA2);
                        if (j15 > jS2) {
                            j15 = jS2;
                        } else if (j15 < jS) {
                            j15 = jS;
                        }
                        q0Var.f105808a = j15;
                        n0Var.f105805a = j15;
                        Context contextRequireContext = bVar.requireContext();
                        contextRequireContext.getClass();
                        lz1.f.f115404a.getClass();
                        bVar.F6().E.k(null, gz1.a.a(aVar2, null, null, null, l3.a.e1(q0Var.f105808a), null, null, aVar4.r0(contextRequireContext, lz1.f.a.o(d16, 2), bVar.f45997b, true, ""), Double.valueOf(n0Var.f105805a), jLongValue, null, null, 0.0d, q0Var.f105808a, 3639));
                    } else {
                        g22.e.a(bVar, null);
                    }
                } else {
                    double d17 = jLongValue;
                    double d18 = n0Var.f105805a / d17;
                    if (z15) {
                        l3.f23124b.getClass();
                        d14 = 1000.0d * d18;
                    } else {
                        l3.f23124b.getClass();
                        d14 = d18 * 1609.344d;
                    }
                    bg0.a.f17827a.getClass();
                    if (!com.garmin.android.apps.connectmobile.traininginitiative.ui.goal.b.G6(d18, bg0.a.C0255a.e())) {
                        lVar.invoke(Boolean.TRUE);
                        return Unit.INSTANCE;
                    }
                    l3.a aVar6 = l3.f23124b;
                    Context contextRequireContext2 = bVar.requireContext();
                    contextRequireContext2.getClass();
                    boolean z16 = bVar.f45997b;
                    aVar6.getClass();
                    String strR0 = aVar6.r0(contextRequireContext2, d17, z16, true, "");
                    x0 x0Var = x0.f105818a;
                    lz1.f.f115404a.getClass();
                    String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(lz1.f.a.o(d18, 2))}, 1));
                    gg0.i iVarD = bg0.a.C0255a.d();
                    Context contextRequireContext3 = bVar.requireContext();
                    contextRequireContext3.getClass();
                    bVar.F6().E.k(null, gz1.a.a(aVar2, null, null, null, null, e5.g(str, StringUtils.SPACE, iVarD.c(contextRequireContext3)), null, strR0, Double.valueOf(n0Var.f105805a), jLongValue, Double.valueOf(d14), null, 0.0d, 0L, 7215));
                }
                lVar.invoke(Boolean.FALSE);
                return Unit.INSTANCE;
            case 2:
                p1 p1Var3 = (p1) obj3;
                Context context = (Context) obj;
                context.getClass();
                GCMMapView gCMMapView = new GCMMapView(context);
                gCMMapView.setContentDescription(context.getString(R.string.msg_image_of_the_map));
                gCMMapView.setupMap(new gs.f((o53.b0) obj6, this.f60923b, gCMMapView, (List) obj2, (List) obj5, (List) obj4, p1Var3));
                gCMMapView.onCreate(null);
                return gCMMapView;
            case 3:
                mc mcVar = (mc) obj6;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                String str4 = (String) obj5;
                o53.b0 b0Var = (o53.b0) obj4;
                p5.k0 k0Var = (p5.k0) obj;
                if (mcVar.f88996e.e().getSize() > 1 && z14) {
                    pc pcVarC = mcVar.c();
                    pc pcVar = pc.PartiallyExpanded;
                    l3.m<pc> mVar = mcVar.f88996e;
                    if (pcVarC == pcVar) {
                        if (mVar.f109322d.invoke(pc.Expanded).booleanValue()) {
                            p5.h0.d(k0Var, str2, new cn1.t(b0Var, mcVar, i15));
                        }
                    } else if (mVar.f109322d.invoke(pcVar).booleanValue()) {
                        p5.h0.a(k0Var, str3, new cn1.t(b0Var, mcVar, 17));
                    }
                    if (!mcVar.f88994c) {
                        p5.h0.c(k0Var, str4, new cn1.t(b0Var, mcVar, 18));
                    }
                }
                return Unit.INSTANCE;
            case 4:
                b2 b2Var = (b2) obj6;
                c2 c2Var = b2Var.f108405o;
                h4 h4Var = (h4) obj3;
                h2 h2Var = (h2) obj2;
                l0 l0Var = (l0) obj5;
                x5.c0 c0Var2 = (x5.c0) obj4;
                f5.c0 c0Var3 = (f5.c0) obj;
                b2Var.f108398h = c0Var3;
                i3 i3VarD = b2Var.d();
                if (i3VarD != null) {
                    i3VarD.f108576b = c0Var3;
                }
                if (z14) {
                    if (b2Var.a() == m1.Selection) {
                        if (((Boolean) b2Var.f108402l.getF182175a()).booleanValue() && h4Var.a()) {
                            h2Var.B();
                        } else {
                            h2Var.v();
                        }
                        b2Var.f108403m.setValue(Boolean.valueOf(r2.a(h2Var, true)));
                        b2Var.f108404n.setValue(Boolean.valueOf(r2.a(h2Var, false)));
                        c2Var.setValue(Boolean.valueOf(w0.e(l0Var.f188879b)));
                    } else if (b2Var.a() == m1.Cursor) {
                        c2Var.setValue(Boolean.valueOf(r2.a(h2Var, true)));
                    }
                    h1.f(b2Var, l0Var, c0Var2);
                    i3 i3VarD2 = b2Var.d();
                    if (i3VarD2 != null && (p0Var = b2Var.f108395e) != null && b2Var.b()) {
                        t2.f108797a.getClass();
                        f5.c0 c0Var4 = i3VarD2.f108576b;
                        if (c0Var4 != null && c0Var4.isAttached() && (c0Var = i3VarD2.f108577c) != null) {
                            s5.q0 q0Var2 = i3VarD2.f108575a;
                            s2 s2Var = new s2(c0Var4);
                            n4.d dVarC = z2.p1.c(c0Var4);
                            n4.d dVarJ0 = c0Var4.j0(c0Var, false);
                            if (p005kotlin.jvm.internal.s.g(p0Var.f188928a.f188887b.get(), p0Var)) {
                                p0Var.f188929b.d(l0Var, c0Var2, q0Var2, s2Var, dVarC, dVarJ0);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 5:
                q4.f fVar = (q4.f) obj;
                fVar.getClass();
                m92.n0.c(fVar, (m0) obj6, (Float) obj3, null, null, (Float) obj2, (Float) obj5, (m92.e0) obj4, this.f60923b);
                p13.k0 k0Var2 = p13.k0.f134949a;
                k0Var2.getClass();
                return k0Var2;
            case 6:
                Context context2 = (Context) obj6;
                String str5 = (String) obj3;
                String str6 = (String) obj2;
                String str7 = (String) obj5;
                DateTime dateTime = (DateTime) obj4;
                Bitmap bitmap = (Bitmap) obj;
                int i17 = s00.d.f155289a;
                String string = z14 ? context2.getString(R.string.pn_group_activity_is_liked_with_dot, str5) : context2.getString(R.string.pn_activity_is_liked_with_dot, str5, str6);
                string.getClass();
                po1.f fVar2 = new po1.f(context2, str7, dateTime, bitmap, string, false, null);
                oi2.a.f132270a.getClass();
                l73.c.b().e(fVar2);
                ((tz0.a) KoinJavaComponent.get$default(tz0.a.class, null, null, 6, null)).m().b(true);
                return Unit.INSTANCE;
            case 7:
                e23.a aVar7 = (e23.a) obj6;
                lc.m0 m0Var = (lc.m0) obj3;
                e23.a aVar8 = (e23.a) obj2;
                lc.k0 k0Var3 = (lc.k0) obj;
                k0Var3.getClass();
                ug2.x xVar = new ug2.x(m0Var, 9);
                ug2.x xVar2 = new ug2.x(m0Var, 10);
                aVar7.getClass();
                boolean z17 = this.f60923b;
                z3.e eVar = new z3.e(2010651479, true, new oy0.g(z17, xVar, xVar2, aVar7, 3));
                p13.k0 k0Var4 = p13.k0.f134949a;
                k0Var4.getClass();
                p13.j0 j0Var = p13.j0.f134944a;
                t0 t0Var = s0.f105811a;
                nc.n.a(k0Var3, t0Var.b(vv0.j.class), k0Var4, j0Var, null, null, null, null, eVar);
                ug2.x xVar3 = new ug2.x(m0Var, 11);
                m0Var.getClass();
                aVar8.getClass();
                ge1.b.U(k0Var3, t0Var.b(vv0.x.class), vv0.w.INSTANCE, k0Var4, new cq.m(m0Var, z17, aVar7, xVar3, aVar8, 10));
                nc.n.a(k0Var3, t0Var.b(vv0.l.class), k0Var4, j0Var, null, null, null, null, new z3.e(900581969, true, new ky0.g0((b63.o) obj5, (o82.g) obj4, z17, new ug2.x(m0Var, 12), new ug2.x(m0Var, 13), new ug2.x(m0Var, 14), new ug2.x(m0Var, 7), new ug2.x(m0Var, 8), aVar7)));
                HelpActivity.f36653a.getClass();
                lc.b bVar2 = new lc.b((lc.a) k0Var3.f111792h.b(lc.a.class), t0Var.b(vv0.i.class), u0.h(p13.t0.b(HelpActivity.a.c()), k0Var4));
                bVar2.f111721i = t0Var.b(HelpActivity.class);
                k0Var3.f111797m.add(bVar2.a());
                ge1.b.U(k0Var3, t0Var.b(vv0.g0.class), vv0.h0.INSTANCE, k0Var4, new gl1.n(4, aVar7, m0Var));
                nc.n.a(k0Var3, t0Var.b(vv0.h.class), k0Var4, j0Var, vv0.o.f180469a, vv0.p.f180471a, vv0.q.f180473a, vv0.r.f180475a, new z3.e(2071514885, true, new vv0.m(0, aVar7, m0Var)));
                nc.n.a(k0Var3, t0Var.b(vv0.k.class), k0Var4, j0Var, null, null, null, null, new z3.e(-1977827068, true, new vv0.m(i16, aVar7, m0Var)));
                return Unit.INSTANCE;
            default:
                String str8 = (String) obj6;
                String str9 = (String) obj5;
                String str10 = (String) obj4;
                p1 p1Var4 = (p1) obj3;
                p1 p1Var5 = (p1) obj2;
                Context context3 = (Context) obj;
                context3.getClass();
                y52.b bVar3 = new y52.b(context3, null, 0, 6, null);
                bVar3.setShouldEnforceCharacterLimit(z14);
                Drawable drawable2 = a7.b.getDrawable(context3, R.drawable.plus);
                if (drawable2 != null) {
                    og2.k.F(R.color.gcm_icon_primary_action, context3, drawable2);
                    drawable = drawable2;
                }
                Float fValueOf = Float.valueOf(20.0f);
                str8.getClass();
                str9.getClass();
                GCMComplexOneLineButton gCMComplexOneLineButton = bVar3.f194526b;
                gCMComplexOneLineButton.setButtonLeftLabel(str8);
                if (drawable != null) {
                    gCMComplexOneLineButton.c(drawable, fValueOf);
                }
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = bVar3.f194525a;
                styledInlineTextFieldViewDark.setTitle(str9);
                styledInlineTextFieldViewDark.setFocusableInTouchMode(true);
                bVar3.setTextChangedListener(new p62.e(str10, 16, p1Var4, p1Var5));
                bVar3.setText(str10);
                p1Var4.setValue(str10);
                return bVar3;
        }
    }

    public /* synthetic */ e(m0 m0Var, Float f14, Float f15, Float f16, m92.e0 e0Var, boolean z14) {
        this.f60922a = 5;
        this.f60924c = m0Var;
        this.f60925d = f14;
        this.f60926e = f15;
        this.f60927f = f16;
        this.f60928g = e0Var;
        this.f60923b = z14;
    }

    public /* synthetic */ e(o53.b0 b0Var, boolean z14, List list, List list2, List list3, p1 p1Var) {
        this.f60922a = 2;
        this.f60924c = b0Var;
        this.f60923b = z14;
        this.f60926e = list;
        this.f60927f = list2;
        this.f60928g = list3;
        this.f60925d = p1Var;
    }

    public /* synthetic */ e(boolean z14, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f60922a = i14;
        this.f60923b = z14;
        this.f60924c = obj;
        this.f60925d = obj2;
        this.f60926e = obj3;
        this.f60927f = obj4;
        this.f60928g = obj5;
    }

    public /* synthetic */ e(Object obj, boolean z14, Object obj2, Object obj3, Object obj4, Object obj5, int i14) {
        this.f60922a = i14;
        this.f60924c = obj;
        this.f60923b = z14;
        this.f60925d = obj2;
        this.f60926e = obj3;
        this.f60927f = obj4;
        this.f60928g = obj5;
    }
}
