package com.garmin.android.apps.connectmobile.performance.stats;

import am.r1;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.m0;
import e23.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import o13.m;
import o13.n;
import o13.r;
import o53.b0;
import o53.f0;
import o61.l;
import org.joda.time.DateTime;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.c0;
import p13.h0;
import p13.j0;
import p92.y;
import r53.c2;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/c;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends m0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f40046r = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f40047h = m.a(n.NONE, new d(this, null, new C0745c(this), null, null));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f40048i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public DateTime f40049j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public DateTime f40050k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public CustomBarChart f40051l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public rz.a<List<l>, d00.a> f40052m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CustomBarChart f40053n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public rz.a<List<l>, d00.a> f40054o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f40055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f40056q;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectSummaryFragment$onRefreshed$1", f = "TrainingEffectSummaryFragment.kt", l = {117, 119}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40057a;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/g3;", "", "Lo61/l;", "it", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/g3;)V"}, k = 3, mv = {2, 3, 0})
        @e(c = "com.garmin.android.apps.connectmobile.performance.stats.TrainingEffectSummaryFragment$onRefreshed$1$1", f = "TrainingEffectSummaryFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<g3<? extends List<? extends l>>, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f40059a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f40060b;

            /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.stats.c$b$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0744a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f40061a;

                static {
                    int[] iArr = new int[fw.p.values().length];
                    try {
                        iArr[fw.p.SUCCESS.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[fw.p.ERROR.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[fw.p.LOADING.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f40061a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f40060b = cVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                a aVar = new a(this.f40060b, dVar);
                aVar.f40059a = obj;
                return aVar;
            }

            @Override // e23.p
            public final Object invoke(g3<? extends List<? extends l>> g3Var, t13.d<? super Unit> dVar) {
                return ((a) create(g3Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:87:0x0210  */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r13v1 */
            /* JADX WARN: Type inference failed for: r13v14 */
            /* JADX WARN: Type inference failed for: r13v2, types: [android.view.View] */
            /* JADX WARN: Type inference failed for: r3v10, types: [android.view.ViewGroup, android.widget.LinearLayout] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Throwable th3;
                c cVar;
                ArrayList arrayList;
                g3 g3Var = (g3) this.f40059a;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                int i14 = C0744a.f40061a[g3Var.f35300a.ordinal()];
                Throwable th4 = null;
                c cVar2 = this.f40060b;
                int i15 = 1;
                if (i14 != 1) {
                    if (i14 != 2) {
                        if (i14 != 3) {
                            u0.r();
                            return null;
                        }
                        cVar2.G6();
                    } else if (cVar2.getActivity() != null) {
                        cVar2.u6(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
                        cVar2.w6();
                    }
                } else if (cVar2.getActivity() != null) {
                    cVar2.w6();
                    List<l> list = (List) g3Var.f35301b;
                    if (list == null) {
                        list = j0.f134944a;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (l lVar : list) {
                        if (!Double.isNaN(lVar.f129606b) || !Double.isNaN(lVar.f129607c)) {
                            arrayList2.add(lVar);
                        }
                    }
                    a61.e eVar = a61.e.f1563a;
                    DateTime dateTime = cVar2.f40049j;
                    if (dateTime == null) {
                        s.m("mStartDate");
                        throw null;
                    }
                    DateTime dateTime2 = cVar2.f40050k;
                    if (dateTime2 == null) {
                        s.m("mEndDate");
                        throw null;
                    }
                    eVar.getClass();
                    boolean z14 = false;
                    boolean z15 = false;
                    boolean z16 = false;
                    HashMap mapJ = a61.e.j(arrayList2, dateTime, dateTime2, false);
                    DateTime dateTime3 = cVar2.f40049j;
                    if (dateTime3 == null) {
                        s.m("mStartDate");
                        throw null;
                    }
                    DateTime dateTime4 = cVar2.f40050k;
                    if (dateTime4 == null) {
                        s.m("mEndDate");
                        throw null;
                    }
                    HashMap mapJ2 = a61.e.j(arrayList2, dateTime3, dateTime4, true);
                    HashSet hashSet = new HashSet();
                    hashSet.addAll(mapJ.keySet());
                    hashSet.addAll(mapJ2.keySet());
                    ArrayList arrayList3 = new ArrayList(hashSet.size());
                    Iterator it = hashSet.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        Object next = it.next();
                        next.getClass();
                        DateTime dateTime5 = (DateTime) next;
                        Double d14 = (Double) mapJ.get(dateTime5);
                        double dDoubleValue = Double.NaN;
                        double dDoubleValue2 = d14 != null ? d14.doubleValue() : Double.NaN;
                        Double d15 = (Double) mapJ2.get(dateTime5);
                        if (d15 != null) {
                            dDoubleValue = d15.doubleValue();
                        }
                        arrayList3.add(new l(j0.f134944a, dDoubleValue2, dDoubleValue, dateTime5, null));
                    }
                    a61.e.f1563a.getClass();
                    c0.u(arrayList3, new a61.c(new a03.n(16), z16 ? 1 : 0));
                    rz.a<List<l>, d00.a> aVar2 = cVar2.f40052m;
                    if (aVar2 == null) {
                        s.m("anaerobicChartConfigurator");
                        throw null;
                    }
                    qz.a.b(aVar2, h0.Z(arrayList3), cVar2.requireContext().getString(R.string.txt_empty_page_no_data), 4);
                    rz.a<List<l>, d00.a> aVar3 = cVar2.f40054o;
                    if (aVar3 == null) {
                        s.m("aerobicChartConfigurator");
                        throw null;
                    }
                    qz.a.b(aVar3, h0.Z(arrayList3), cVar2.requireContext().getString(R.string.txt_empty_page_no_data), 4);
                    LinearLayout linearLayout = cVar2.f40048i;
                    if (linearLayout != null) {
                        linearLayout.removeAllViews();
                    }
                    ArrayList arrayList4 = new ArrayList(arrayList2);
                    h0.N0(arrayList4, new t61.n());
                    androidx.fragment.app.m activity = cVar2.getActivity();
                    LayoutInflater layoutInflater = activity != null ? activity.getLayoutInflater() : null;
                    com.garmin.android.apps.connectmobile.performance.stats.b bVar = new com.garmin.android.apps.connectmobile.performance.stats.b(activity);
                    t61.m mVar = new t61.m(cVar2, z15 ? 1 : 0);
                    int size = arrayList4.size();
                    View view2 = cVar2.f40055p;
                    if (view2 != null) {
                        view2.setVisibility(size > 0 ? 0 : 8);
                    }
                    int i16 = 0;
                    while (i16 < size) {
                        ?? Inflate = layoutInflater != null ? layoutInflater.inflate(R.layout.gcm3_summary_list_item, cVar2.f40048i, z14) : th4;
                        l lVar2 = (l) arrayList4.get(i16);
                        DateTime dateTime6 = lVar2.f129608d;
                        if (dateTime6 == null) {
                            th3 = th4;
                            cVar = cVar2;
                            arrayList = arrayList4;
                        } else {
                            DateTime dateTime7 = cVar2.f40049j;
                            if (dateTime7 == null) {
                                Throwable th5 = th4;
                                s.m("mStartDate");
                                throw th5;
                            }
                            if (dateTime6.isAfter(dateTime7.minusDays(i15))) {
                                DateTime dateTime8 = cVar2.f40050k;
                                if (dateTime8 == null) {
                                    Throwable th6 = th4;
                                    s.m("mEndDate");
                                    throw th6;
                                }
                                if (dateTime6.isBefore(dateTime8.plusDays(i15))) {
                                    com.garmin.android.apps.connectmobile.performance.stats.b.a aVar4 = new com.garmin.android.apps.connectmobile.performance.stats.b.a(Inflate, mVar);
                                    th3 = th4;
                                    aVar4.f40044a.setText(com.garmin.android.apps.connectmobile.performance.stats.b.f40042b.print(dateTime6));
                                    arrayList = arrayList4;
                                    c cVar3 = cVar2;
                                    aVar4.f40045b.setText(r1.i(bVar.f40043a, lVar2.f129609e, lVar2.f129606b, lVar2.f129607c));
                                    if (Inflate != 0) {
                                        Inflate.setTag(lVar2);
                                    }
                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) cVar3.getResources().getDimension(R.dimen.spacing_normal));
                                    View view3 = new View(cVar3.requireContext());
                                    view3.setLayoutParams(layoutParams);
                                    cVar = cVar3;
                                    ?? r14 = cVar.f40048i;
                                    if (r14 != 0) {
                                        r14.addView(Inflate);
                                    }
                                    LinearLayout linearLayout2 = cVar.f40048i;
                                    if (linearLayout2 != null) {
                                        linearLayout2.addView(view3);
                                    }
                                } else {
                                    th3 = th4;
                                    cVar = cVar2;
                                    arrayList = arrayList4;
                                }
                            } else {
                                th3 = th4;
                                cVar = cVar2;
                                arrayList = arrayList4;
                            }
                        }
                        i16++;
                        cVar2 = cVar;
                        arrayList4 = arrayList;
                        th4 = th3;
                        z14 = false;
                        i15 = 1;
                    }
                }
                return Unit.INSTANCE;
            }
        }

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        
            if (r53.s.k(r8, r1, r7) == r0) goto L19;
         */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, o13.l] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f40057a;
            c cVar = c.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            t61.r rVar = (t61.r) cVar.f40047h.getValue();
            DateTime dateTime = cVar.f40049j;
            if (dateTime == null) {
                s.m("mStartDate");
                throw null;
            }
            DateTime dateTime2 = cVar.f40050k;
            if (dateTime2 == null) {
                s.m("mEndDate");
                throw null;
            }
            this.f40057a = 1;
            rVar.getClass();
            obj = new c2(new t61.p(rVar, dateTime, dateTime2, null));
            if (obj != aVar) {
            }
            return aVar;
            androidx.lifecycle.b0 f158016a = cVar.getF158016a();
            f158016a.getClass();
            r53.b bVarA = u.a((r53.i) obj, f158016a, androidx.lifecycle.b0.b.STARTED);
            a aVar2 = new a(cVar, null);
            this.f40057a = 2;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.stats.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0745c implements e23.a<Fragment> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40062a;

        public C0745c(Fragment fragment) {
            this.f40062a = fragment;
        }

        @Override // e23.a
        public final Fragment invoke() {
            return this.f40062a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<t61.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f40064b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f40065c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f40066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e23.a f40067e;

        public d(Fragment fragment, Qualifier qualifier, e23.a aVar, e23.a aVar2, e23.a aVar3) {
            this.f40063a = fragment;
            this.f40064b = qualifier;
            this.f40065c = aVar;
            this.f40066d = aVar2;
            this.f40067e = aVar3;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [androidx.lifecycle.u1, t61.r] */
        @Override // e23.a
        public final t61.r invoke() {
            CreationExtras defaultViewModelCreationExtras;
            y1 f189591b = ((ViewModelStoreOwner) this.f40065c.invoke()).getF189591b();
            Fragment fragment = this.f40063a;
            e23.a aVar = this.f40066d;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = fragment.getDefaultViewModelCreationExtras();
                defaultViewModelCreationExtras.getClass();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(t61.r.class), f189591b, null, defaultViewModelCreationExtras, this.f40064b, AndroidKoinScopeExtKt.getKoinScope(fragment), this.f40067e, 4, null);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        G6();
        ge1.b.T(f0.w(this), null, null, new b(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @o13.e
    public final void onActivityResult(int i14, int i15, Intent intent) {
        if (i14 == 101 && i15 == 12) {
            E6();
        } else {
            super.onActivityResult(i14, i15, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            y.f136664a.getClass();
            y.a.c("TrainingEffectSummaryFragment", "Error! No arguments were provided in onCreate!");
        } else {
            this.f40049j = new DateTime(arguments.getLong("GCM_extra_start_date"));
            this.f40050k = new DateTime(arguments.getLong("GCM_extra_end_date"));
            this.f40056q = arguments.getBoolean("EXTRA_HAS_COMPLETE_DATA");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewA6 = A6(viewGroup, layoutInflater, R.layout.gcm3_training_effect_summary_fragment);
        this.f40048i = (LinearLayout) viewA6.findViewById(R.id.stats_list_container);
        this.f40055p = viewA6.findViewById(R.id.section_header_title);
        LinearLayout linearLayout = (LinearLayout) viewA6.findViewById(R.id.anaerobic_chart_container);
        linearLayout.getClass();
        v22.e.v(linearLayout, this.f40056q);
        View viewFindViewById = viewA6.findViewById(R.id.anaerobic_summary_bar_chart);
        viewFindViewById.getClass();
        this.f40051l = (CustomBarChart) viewFindViewById;
        CustomBarChart customBarChart = this.f40051l;
        if (customBarChart == null) {
            s.m("anaerobicBarChart");
            throw null;
        }
        Context context = viewA6.getContext();
        context.getClass();
        DateTime dateTime = this.f40049j;
        if (dateTime == null) {
            s.m("mStartDate");
            throw null;
        }
        DateTime dateTime2 = this.f40050k;
        if (dateTime2 == null) {
            s.m("mEndDate");
            throw null;
        }
        u61.c cVar = new u61.c(context, dateTime, dateTime2, true);
        CustomBarChart customBarChart2 = this.f40051l;
        if (customBarChart2 == null) {
            s.m("anaerobicBarChart");
            throw null;
        }
        rz.a<List<l>, d00.a> aVar = new rz.a<>(customBarChart, cVar, new u61.d(customBarChart2), null, null, null, 56, null);
        this.f40052m = aVar;
        aVar.c();
        View viewFindViewById2 = viewA6.findViewById(R.id.aerobic_summary_bar_chart);
        viewFindViewById2.getClass();
        this.f40053n = (CustomBarChart) viewFindViewById2;
        CustomBarChart customBarChart3 = this.f40053n;
        if (customBarChart3 == null) {
            s.m("aerobicBarChart");
            throw null;
        }
        Context context2 = viewA6.getContext();
        context2.getClass();
        DateTime dateTime3 = this.f40049j;
        if (dateTime3 == null) {
            s.m("mStartDate");
            throw null;
        }
        DateTime dateTime4 = this.f40050k;
        if (dateTime4 == null) {
            s.m("mEndDate");
            throw null;
        }
        u61.c cVar2 = new u61.c(context2, dateTime3, dateTime4, false);
        CustomBarChart customBarChart4 = this.f40053n;
        if (customBarChart4 == null) {
            s.m("aerobicBarChart");
            throw null;
        }
        rz.a<List<l>, d00.a> aVar2 = new rz.a<>(customBarChart3, cVar2, new u61.d(customBarChart4), null, null, null, 56, null);
        this.f40054o = aVar2;
        aVar2.c();
        return viewA6;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        E6();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_HAS_COMPLETE_DATA", "", "REQUEST_CODE_SELECT_EFFECT", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
