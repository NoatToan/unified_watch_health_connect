package wu1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.i0;
import androidx.recyclerview.widget.RecyclerView;
import bv1.a0;
import bv1.c0;
import bv1.d0;
import bv1.l;
import bv1.o;
import bv1.p;
import bv1.q;
import bv1.r;
import bv1.s;
import bv1.u;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f1;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import jv1.n;
import kotlin.w3;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.m0;
import p13.h0;
import p13.j0;
import p13.k0;
import p3.c2;
import p3.p0;
import tw1.m;
import vu1.w;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lwu1/c;", "Lcom/garmin/android/apps/connectmobile/f1;", "Landroid/app/Activity;", "activity", "Lvu1/w;", "dashboardListener", "<init>", "(Landroid/app/Activity;Lvu1/w;)V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends f1 {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final DateTimeFormatter f187269w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Activity f187270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f187271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f187272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bv1.i f187273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f187274g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p f187275h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f187276i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final o f187277j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r f187278k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f187279l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final bv1.g f187280m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f187281n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final d0 f187282o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bv1.b f187283p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f187284q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f187285r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f187286t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final View f187287v;

    static {
        new a(null);
        f187269w = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
    }

    public c(Activity activity, w wVar) {
        activity.getClass();
        wVar.getClass();
        this.f187270c = activity;
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f187271d = k0Var;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(activity);
        this.f187272e = layoutInflaterFrom;
        layoutInflaterFrom.getClass();
        bv1.i iVar = new bv1.i(layoutInflaterFrom, wVar);
        this.f187273f = iVar;
        l lVar = new l(layoutInflaterFrom);
        this.f187274g = lVar;
        p pVar = new p(layoutInflaterFrom);
        this.f187275h = pVar;
        j jVar = new j(layoutInflaterFrom, wVar);
        this.f187276i = jVar;
        o oVar = new o(layoutInflaterFrom, wVar);
        this.f187277j = oVar;
        r rVar = new r(layoutInflaterFrom);
        this.f187278k = rVar;
        u uVar = new u(layoutInflaterFrom, activity, wVar);
        this.f187279l = uVar;
        bv1.g gVar = new bv1.g(layoutInflaterFrom, activity, wVar);
        this.f187280m = gVar;
        a0 a0Var = new a0(layoutInflaterFrom, wVar);
        this.f187281n = a0Var;
        d0 d0Var = new d0(layoutInflaterFrom);
        this.f187282o = d0Var;
        bv1.b bVar = new bv1.b(layoutInflaterFrom);
        this.f187283p = bVar;
        b bVar2 = new b(layoutInflaterFrom);
        this.f187284q = bVar2;
        h hVar = new h(layoutInflaterFrom, wVar);
        this.f187285r = hVar;
        k kVar = new k(layoutInflaterFrom, wVar);
        this.f187286t = kVar;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.gcm4_atp_dashboard_footer, (ViewGroup) null);
        this.f187287v = viewInflate;
        iVar.a();
        lVar.a();
        pVar.a();
        jVar.a();
        oVar.a();
        rVar.a();
        uVar.a();
        gVar.a();
        a0Var.a();
        d0Var.a();
        bVar2.a();
        hVar.a();
        kVar.a();
        viewInflate.getClass();
        viewInflate.setVisibility(8);
        t(iVar.f21420a);
        t(lVar.f21420a);
        t(bVar2.f21420a);
        t(hVar.f21420a);
        t(kVar.f21420a);
        t(pVar.f21420a);
        t(jVar.f21420a);
        t(oVar.f21420a);
        t(rVar.f21420a);
        t(uVar.f21420a);
        t(a0Var.f21420a);
        t(gVar.f21420a);
        t(d0Var.f21420a);
        t(bVar.f21420a);
        r(viewInflate);
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
    public final void A(n nVar, boolean z14, i0 i0Var) {
        Object next;
        int i14;
        List list;
        DateTime dateTime;
        Activity activity;
        gg0.f eventType;
        LocalDate date;
        tw1.a aVar;
        ww1.d0 trainingPlanSubType;
        if (nVar != null) {
            fg0.k kVar = nVar.f101088j;
            boolean z15 = nVar.f101091m;
            xu1.a aVar2 = nVar.f101083e;
            String str = nVar.f101087i;
            boolean z16 = nVar.H;
            List<iw1.a> list2 = nVar.f101093o;
            boolean z17 = nVar.f101096r;
            boolean z18 = nVar.f101094p;
            boolean z19 = nVar.f101095q;
            m mVar = nVar.f101079a;
            Activity activity2 = this.f187270c;
            if (list2 != null) {
                tu1.a.b(activity2, new ArrayList(list2));
            }
            bv1.i iVar = this.f187273f;
            iVar.b(z16);
            c2 c2VarN = p0.n(Boolean.TRUE);
            ComposeView composeView = iVar.f21415c;
            composeView.setViewCompositionStrategy(w3.d.f91628b);
            composeView.setContent(new z3.e(96482963, true, new bv1.h(c2VarN, iVar, 0)));
            if (z16) {
                rt1.l.f154545a.getClass();
                rt1.l.b("CoachBikeSwitchToBeginnerPromptShown");
            }
            ww1.l.a aVar3 = ww1.l.f187814b;
            String subTypeKey = (mVar == null || (trainingPlanSubType = mVar.getTrainingPlanSubType()) == null) ? null : trainingPlanSubType.getSubTypeKey();
            aVar3.getClass();
            Iterator<T> it = ww1.l.f187824l.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!d53.w.z(((ww1.l) next).f187825a, subTypeKey == null ? "" : subTypeKey, true));
            ww1.l lVar = (ww1.l) next;
            boolean z24 = (mVar == null || !mVar.Z() || lVar == null) ? false : true;
            l lVar2 = this.f187274g;
            lVar2.b(z24);
            ComposeView composeView2 = lVar2.f21419b;
            w3.d dVar = w3.d.f91628b;
            composeView2.setViewCompositionStrategy(dVar);
            composeView2.setContent(new z3.e(-1073382221, true, new bv1.j(lVar, 0)));
            this.f187284q.b(z18);
            k kVar2 = this.f187286t;
            h hVar = this.f187285r;
            if (z19 && z14) {
                hVar.b(false);
                kVar2.b(true);
                TextView textView = kVar2.f187325d;
                View view2 = kVar2.f21420a;
                textView.setText(view2.getContext().getString(R.string.lbl_data_permission_required));
                TextView textView2 = kVar2.f187326e;
                Context context = view2.getContext();
                if (str == null) {
                    str = "";
                }
                textView2.setText(context.getString(R.string.msg_plan_paused_on_date, str));
                kVar2.f187324c.setText(view2.getContext().getString(R.string.lbl_review_permission));
            } else {
                kVar2.b(false);
                hVar.b(z19);
                boolean z25 = mVar != null && mVar.q0();
                ComposeView composeView3 = hVar.f187317c;
                composeView3.setViewCompositionStrategy(dVar);
                composeView3.setContent(new z3.e(1986198450, true, new g(str, z25, hVar, 0)));
            }
            boolean z26 = (z19 || aVar2 == null) ? false : true;
            p pVar = this.f187275h;
            pVar.b(z26);
            if (aVar2 != null) {
                pVar.c(aVar2);
            }
            j jVar = this.f187276i;
            jVar.b(!z17);
            if (!z17) {
                ComposeView composeView4 = jVar.f187322c;
                composeView4.setViewCompositionStrategy(dVar);
                composeView4.setContent(new z3.e(-775690306, true, new i(nVar, jVar, 0)));
            }
            boolean z27 = (!z15 || z19 || z18 || z17) ? false : true;
            o oVar = this.f187277j;
            oVar.b(z27);
            if (z15 && !z17 && (aVar = nVar.f101092n) != null) {
                ComposeView composeView5 = oVar.f21426c;
                composeView5.setViewCompositionStrategy(dVar);
                fy1.i.a aVar4 = fy1.i.f73924a;
                Context context2 = oVar.f21420a.getContext();
                context2.getClass();
                DateTime dateTimeAtStartOfDay = aVar.g().toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay.getClass();
                DateTime dateTimeAtStartOfDay2 = aVar.d().toDateTimeAtStartOfDay();
                dateTimeAtStartOfDay2.getClass();
                aVar4.getClass();
                composeView5.setContent(new z3.e(-1229695113, true, new bv1.n(aVar, fy1.i.a.j(context2, dateTimeAtStartOfDay, dateTimeAtStartOfDay2), oVar, 0)));
            }
            boolean z28 = nVar.E;
            r rVar = this.f187278k;
            rVar.b(z28);
            rVar.f21431b.setContent(new z3.e(969803930, true, new q(rVar, nVar, 0)));
            boolean z29 = (z19 || z18 || ((kVar == null || (date = kVar.getDate()) == null) ? false : date.equals(LocalDate.now()))) ? false : true;
            u uVar = this.f187279l;
            uVar.b(z29);
            uVar.getClass();
            DateTime dateTimeNow = DateTime.now();
            if (list2 != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list2) {
                    DateTime dateTime2 = ((iw1.a) obj).f95330q;
                    if (dateTime2 != null && g22.k.k(dateTime2)) {
                        arrayList.add(obj);
                    }
                }
                i14 = 1;
                list = arrayList;
            } else {
                i14 = 1;
                list = j0.f134944a;
            }
            ArrayList arrayListG = tu1.a.g(list, dateTimeNow);
            boolean z34 = arrayListG.size() > i14 ? i14 : 0;
            m0 m0Var = new m0();
            List<iw1.a> listF = tu1.a.f(list, dateTimeNow);
            Activity activity3 = activity2;
            boolean z35 = i14;
            uVar.f21446d.setContent(new z3.e(-202385902, z35, new s(list, uVar, listF.size() > i14 ? i14 : 0, listF, new m0(), z34, m0Var, arrayListG, nVar, 0)));
            ge1.b.T(i0Var, null, null, new e(this, nVar, null), 3);
            bv1.g gVar = this.f187280m;
            gVar.b(!z19);
            gVar.getClass();
            DateTime dateTimeO = mVar != null ? mVar.o() : null;
            int i15 = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).e1().f77271c;
            DateTime dateTimeWithTimeAtStartOfDay = (!z18 || dateTimeO == null) ? DateTime.now().withTimeAtStartOfDay() : dateTimeO.withTimeAtStartOfDay();
            dateTimeWithTimeAtStartOfDay.getClass();
            DateTime dateTimeO2 = g22.k.o(i15, dateTimeWithTimeAtStartOfDay);
            DateTime dateTimeA = g22.k.A(g22.k.b(i15, dateTimeWithTimeAtStartOfDay));
            ComposeView composeView6 = gVar.f21409d;
            composeView6.setViewCompositionStrategy(w3.d.f91628b);
            composeView6.setContent(new z3.e(-642908486, z35, new bv1.f(nVar, gVar, dateTimeO2, dateTimeA, 0)));
            boolean zF0 = mVar != null ? mVar.f0() : false;
            boolean zJ0 = mVar != null ? mVar.j0() : false;
            fy1.i.f73924a.getClass();
            boolean z36 = (!((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).f() || zJ0) ? false : z35 ? 1 : 0;
            boolean z37 = (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).f() || zJ0) ? false : z35 ? 1 : 0;
            boolean z38 = (!((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).p() || zF0 || zJ0) ? false : z35 ? 1 : 0;
            boolean z39 = (!bo1.a.a().c().D() || kVar == null || (eventType = kVar.getEventType()) == null || eventType.e() != z35) ? false : z35 ? 1 : 0;
            boolean z44 = (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).k() && (zF0 || zJ0)) ? z35 ? 1 : 0 : false;
            boolean z45 = (((rt1.m) KoinJavaComponent.get$default(rt1.m.class, null, null, 6, null)).j() && zJ0) ? z35 ? 1 : 0 : false;
            boolean z46 = (z18 || !((z36 || z37 || z38 || z44 || z39 || z45) ? z35 ? 1 : 0 : false)) ? false : z35 ? 1 : 0;
            d0 d0Var = this.f187282o;
            d0Var.b(z46);
            d0Var.f21401b.setContent(new z3.e(-721383770, z35, new c0(nVar.f101103y, nVar.G, nVar.f101104z, nVar.C, nVar.A, nVar.I, z36, z38, z39, z44, z37, z45, 0)));
            List<av1.b> list3 = nVar.f101097s;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list3) {
                if (((av1.b) obj2).f13243a.f29259e != null) {
                    arrayList2.add(obj2);
                }
            }
            List listN0 = h0.N0(arrayList2, new d());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj3 : listN0) {
                String strA = ((av1.b) obj3).f13243a.f29259e;
                if (strA != null) {
                    try {
                        dateTime = f187269w.parseDateTime(strA);
                    } catch (Exception e4) {
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.f(a2Var, "FBTDashboardAdapter", "Error parsing startTimeLocal '" + strA + "': " + e4);
                        dateTime = null;
                    }
                    if (dateTime != null) {
                        activity = activity3;
                        strA = new pi0.e(activity).a(dateTime, qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY_WEEKDAY);
                    } else {
                        activity = activity3;
                    }
                } else {
                    activity = activity3;
                    strA = "";
                }
                Object arrayList3 = linkedHashMap.get(strA);
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                    linkedHashMap.put(strA, arrayList3);
                }
                ((List) arrayList3).add(obj3);
                activity3 = activity;
            }
            this.f187271d = linkedHashMap;
            tw1.n nVar2 = nVar.f101082d;
            if (nVar2 != null) {
                boolean zIsEmpty = linkedHashMap.isEmpty();
                bv1.b bVar = this.f187283p;
                bVar.getClass();
                TextView textView3 = bVar.f21380b;
                textView3.getClass();
                textView3.setVisibility(0);
                String string = bVar.f21420a.getContext().getString(R.string.lbl_completed_activities);
                string.getClass();
                textView3.setText(g22.n.b(string));
                View view3 = bVar.f21382d;
                view3.getClass();
                v22.e.r(view3, !zIsEmpty);
                ComposeView composeView7 = bVar.f21381c;
                composeView7.getClass();
                v22.e.r(composeView7, zIsEmpty);
                composeView7.setViewCompositionStrategy(w3.d.f91628b);
                composeView7.setContent(new z3.e(-191044980, z35, new bv1.a(nVar2, 0)));
            }
            View view4 = this.f187287v;
            view4.getClass();
            view4.setVisibility(8);
        }
        notifyDataSetChanged();
    }

    @Override // com.garmin.android.apps.connectmobile.f1, androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        int itemViewType = super.getItemViewType(i14);
        if (itemViewType == 1) {
            return 99;
        }
        return itemViewType;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // com.garmin.android.apps.connectmobile.f1
    /* JADX INFO: renamed from: u */
    public final int getF187301i() {
        return this.f187271d.size();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    @Override // com.garmin.android.apps.connectmobile.f1
    public final void x(int i14, RecyclerView.f0 f0Var) {
        String str = (String) h0.b1(this.f187271d.keySet()).get(i14);
        List list = (List) this.f187271d.get(str);
        if (list != null) {
            wu1.a aVar = f0Var instanceof wu1.a ? (wu1.a) f0Var : null;
            if (aVar != null) {
                str.getClass();
                RecyclerView.f0 f0Var2 = aVar.f187268a;
                bv1.d dVar = f0Var2 instanceof bv1.d ? (bv1.d) f0Var2 : null;
                if (dVar != null) {
                    ComposeView composeView = dVar.f21400a;
                    composeView.setViewCompositionStrategy(w3.d.f91628b);
                    composeView.setContent(new z3.e(-316315590, true, new bv1.c(0, str, list)));
                }
            }
        }
    }

    @Override // com.garmin.android.apps.connectmobile.f1
    public final RecyclerView.f0 z(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        View viewInflate = this.f187272e.inflate(R.layout.fbt_activity_view, viewGroup, false);
        viewInflate.getClass();
        return new wu1.a(viewInflate, new bv1.d(viewInflate));
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lwu1/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "ACTIVITY", "I", "Lorg/joda/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "activityDateFormat", "Lorg/joda/time/format/DateTimeFormatter;", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
