package com.garmin.android.apps.connectmobile.performance.stats.improvement;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.m0;
import com.garmin.android.apps.connectmobile.performance.stats.improvement.view.CaterpillarChart;
import e23.l;
import fw.p;
import iz1.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.f0;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p13.y;
import v13.e;
import v13.i;
import vb.h;
import w61.r0;
import w61.t;
import w61.x;
import x61.j;
import x61.k;
import x61.q;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/d;", "Lcom/garmin/android/apps/connectmobile/m0;", "Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/view/CaterpillarChart$d;", "Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/b$b;", "", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends m0 implements CaterpillarChart.d, com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final a f40127w = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DateTime f40128h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DateTime f40129i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x f40130j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public t f40132l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public CaterpillarChart f40133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RecyclerView f40134n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f40135o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f40136p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ConstraintLayout f40137q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FrameLayout f40138r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f40139t;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f40131k = 10;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final g f40140v = new g(this, 28);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40141a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f40141a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.garmin.android.apps.connectmobile.performance.stats.improvement.TrainingStatusSummaryFragment$onDeviceChanged$1", f = "TrainingStatusSummaryFragment.kt", l = {230}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f40142a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f40144c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f40144c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new c(this.f40144c, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f40142a;
            if (i14 == 0) {
                r.b(obj);
                x xVar = d.this.f40130j;
                if (xVar != null) {
                    this.f40142a = 1;
                    if (xVar.A4(this.f40144c, true, this) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.stats.improvement.d$d, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class C0748d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f40145a;

        public C0748d(l lVar) {
            lVar.getClass();
            this.f40145a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f40145a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40145a.invoke(obj);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        x xVar = this.f40130j;
        if (xVar != null) {
            xVar.H4(this.f40131k, this.f40128h, this.f40129i, true).f(this, this.f40140v);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.performance.stats.improvement.view.CaterpillarChart.d
    public final void I2(int i14) {
        t tVar = this.f40132l;
        if (tVar == null || i14 < 0 || i14 >= tVar.f183255d.size()) {
            return;
        }
        int size = (tVar.f183255d.size() - 1) - i14;
        if (size == tVar.f183254c) {
            size = -1;
        }
        tVar.f183254c = size;
        tVar.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.CharSequence] */
    public final void I6(q qVar) {
        boolean z14;
        Throwable th3;
        List<j> list = qVar != null ? qVar.f189271a : null;
        String str = "trainingStatusSummaryTableHeader";
        String str2 = "trainingStatusSummaryRecyclerView";
        boolean z15 = true;
        if (list == null || !(!list.isEmpty())) {
            z14 = true;
            th3 = null;
            CaterpillarChart caterpillarChart = this.f40133m;
            if (caterpillarChart == null) {
                s.m("trainingStatusSummaryChart");
                throw null;
            }
            TextView textView = caterpillarChart.f40153g;
            if (textView == null) {
                s.m("caterpillarChartNoDataMessage");
                throw null;
            }
            textView.setVisibility(0);
            LinearLayout linearLayout = caterpillarChart.f40155i;
            if (linearLayout == null) {
                s.m("caterpillarChartBarContainer");
                throw null;
            }
            linearLayout.setVisibility(8);
            LinearLayout linearLayout2 = caterpillarChart.f40154h;
            if (linearLayout2 == null) {
                s.m("caterpillarChartXAxisContainer");
                throw null;
            }
            linearLayout2.setVisibility(8);
            RecyclerView recyclerView = this.f40134n;
            if (recyclerView == null) {
                s.m("trainingStatusSummaryRecyclerView");
                throw null;
            }
            recyclerView.setVisibility(8);
            ConstraintLayout constraintLayout = this.f40137q;
            if (constraintLayout == null) {
                s.m("trainingStatusSummaryTableHeader");
                throw null;
            }
            constraintLayout.setVisibility(8);
        } else {
            CaterpillarChart caterpillarChart2 = this.f40133m;
            if (caterpillarChart2 == null) {
                s.m("trainingStatusSummaryChart");
                throw null;
            }
            ArrayList arrayList = new ArrayList(y.r(list, 10));
            for (j jVar : list) {
                arrayList.add(new CaterpillarChart.a(jVar.f189255b, jVar.f189258e, jVar.f189257d, jVar.f189259f));
                z15 = z15;
            }
            z14 = z15;
            th3 = null;
            CaterpillarChart.c cVar = new CaterpillarChart.c(arrayList, qVar.f189272b);
            caterpillarChart2.f40148b = -1;
            TextView textView2 = caterpillarChart2.f40153g;
            if (textView2 == null) {
                s.m("caterpillarChartNoDataMessage");
                throw null;
            }
            textView2.setVisibility(8);
            LinearLayout linearLayout3 = caterpillarChart2.f40155i;
            if (linearLayout3 == null) {
                s.m("caterpillarChartBarContainer");
                throw null;
            }
            linearLayout3.setVisibility(0);
            LinearLayout linearLayout4 = caterpillarChart2.f40154h;
            if (linearLayout4 == null) {
                s.m("caterpillarChartXAxisContainer");
                throw null;
            }
            linearLayout4.setVisibility(0);
            LinearLayout linearLayout5 = caterpillarChart2.f40155i;
            if (linearLayout5 == null) {
                s.m("caterpillarChartBarContainer");
                throw null;
            }
            linearLayout5.removeAllViews();
            List<CaterpillarChart.a> list2 = cVar.f40161a;
            Iterator it = list2.iterator();
            int i14 = 0;
            int i15 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i16 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                CaterpillarChart.a aVar = (CaterpillarChart.a) next;
                List<j> list3 = list;
                View view2 = new View(caterpillarChart2.getContext());
                List<CaterpillarChart.a> list4 = list2;
                float f14 = aVar.f40158b;
                String str3 = str;
                int i17 = aVar.f40157a;
                String str4 = str2;
                Iterator it3 = it;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, f14);
                layoutParams.setMarginEnd(4);
                view2.setLayoutParams(layoutParams);
                if (i14 == 0) {
                    Drawable drawable = a7.b.getDrawable(caterpillarChart2.getContext(), R.drawable.shape_rounded_corners_left);
                    if (drawable != null) {
                        drawable.setTint(i17);
                        view2.setBackground(drawable);
                    }
                } else if (i14 == list4.size() - 1) {
                    Drawable drawable2 = a7.b.getDrawable(caterpillarChart2.getContext(), R.drawable.shape_rounded_corners_right);
                    if (drawable2 != null) {
                        drawable2.setTint(i17);
                        view2.setBackground(drawable2);
                    }
                } else {
                    view2.setBackground(new ColorDrawable(i17));
                }
                if (aVar.f40159c) {
                    if (!aVar.f40160d) {
                        view2.setOnClickListener(caterpillarChart2);
                    }
                    view2.setTag(Integer.valueOf(i15));
                    i15++;
                }
                LinearLayout linearLayout6 = caterpillarChart2.f40155i;
                if (linearLayout6 == null) {
                    s.m("caterpillarChartBarContainer");
                    throw null;
                }
                linearLayout6.addView(view2);
                i14 = i16;
                list = list3;
                list2 = list4;
                str = str3;
                str2 = str4;
                it = it3;
            }
            List<j> list5 = list;
            String str5 = str;
            String str6 = str2;
            LinearLayout linearLayout7 = caterpillarChart2.f40154h;
            if (linearLayout7 == null) {
                s.m("caterpillarChartXAxisContainer");
                throw null;
            }
            linearLayout7.removeAllViews();
            for (String str7 : cVar.f40162b) {
                TextView textView3 = new TextView(caterpillarChart2.getContext());
                textView3.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
                textView3.setGravity(17);
                textView3.setText(str7);
                textView3.setTextColor(caterpillarChart2.f40156j);
                Context context = caterpillarChart2.getContext();
                context.getClass();
                textView3.setTextSize(0, c22.b.b(context, caterpillarChart2.getContext().getResources().getDimension(R.dimen.andfont_caption), 1.5f));
                LinearLayout linearLayout8 = caterpillarChart2.f40154h;
                if (linearLayout8 == null) {
                    s.m("caterpillarChartXAxisContainer");
                    throw null;
                }
                linearLayout8.addView(textView3);
            }
            RecyclerView recyclerView2 = this.f40134n;
            if (recyclerView2 == null) {
                s.m(str6);
                throw null;
            }
            recyclerView2.setVisibility(0);
            ConstraintLayout constraintLayout2 = this.f40137q;
            if (constraintLayout2 == null) {
                s.m(str5);
                throw null;
            }
            constraintLayout2.setVisibility(0);
            t tVar = this.f40132l;
            if (tVar != null) {
                tVar.f183255d.clear();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list5) {
                    if (((j) obj).f189257d) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(arrayList2);
                tVar.f183255d = arrayList3;
                Collections.reverse(arrayList3);
                tVar.f183254c = -2;
                tVar.notifyDataSetChanged();
            }
        }
        TextView textView4 = this.f40135o;
        if (textView4 == null) {
            s.m("trainingStatusSummaryInfoMessageFirst");
            throw th3;
        }
        v22.e.o(textView4, qVar != null ? qVar.f189273c : th3);
        TextView textView5 = this.f40136p;
        if (textView5 == null) {
            s.m("trainingStatusSummaryInfoMessageSecond");
            throw th3;
        }
        v22.e.o(textView5, qVar != null ? qVar.f189274d : th3);
        if (qVar == null || qVar.f189275e != z14) {
            FrameLayout frameLayout = this.f40138r;
            if (frameLayout != null) {
                frameLayout.setVisibility(8);
                return;
            } else {
                s.m("deviceContainerView");
                throw th3;
            }
        }
        FrameLayout frameLayout2 = this.f40138r;
        if (frameLayout2 == null) {
            s.m("deviceContainerView");
            throw th3;
        }
        frameLayout2.setVisibility(0);
    }

    @Override // com.garmin.android.apps.connectmobile.performance.stats.improvement.b.InterfaceC0747b
    public final void m5(String str) {
        ge1.b.T(f0.w(this), null, null, new c(str, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f40128h = new DateTime(arguments != null ? Long.valueOf(arguments.getLong("GCM_extra_start_date")) : null);
        Bundle arguments2 = getArguments();
        this.f40129i = new DateTime(arguments2 != null ? Long.valueOf(arguments2.getLong("GCM_extra_end_date")) : null);
        Bundle arguments3 = getArguments();
        Integer numValueOf = arguments3 != null ? Integer.valueOf(arguments3.getInt("key_interval_type")) : null;
        numValueOf.getClass();
        this.f40131k = numValueOf.intValue();
        m activity = getActivity();
        if (activity != null) {
            l22.a aVar = new l22.a(activity);
            Resources resources = activity.getResources();
            resources.getClass();
            r0 r0Var = new r0(new k(aVar, resources), null, null, false, 14, null);
            m activity2 = getActivity();
            x xVar = (x) (activity2 != null ? new x1(activity2, r0Var).b(s0.f105811a.b(x.class)) : null);
            this.f40130j = xVar;
            if (xVar != null) {
                xVar.H4(this.f40131k, this.f40128h, this.f40129i, false).f(this, this.f40140v);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return A6(viewGroup, layoutInflater, R.layout.training_status_summary_fragment);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        y0 y0Var;
        y0<fw.m<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var2;
        y0<Set<com.garmin.android.apps.connectmobile.performance.model.a>> y0Var3;
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.training_status_summary_chart);
        viewFindViewById.getClass();
        this.f40133m = (CaterpillarChart) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.training_status_summary_recycler_view);
        viewFindViewById2.getClass();
        this.f40134n = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = view2.findViewById(R.id.training_status_summary_info_message_first);
        viewFindViewById3.getClass();
        this.f40135o = (TextView) viewFindViewById3;
        View viewFindViewById4 = view2.findViewById(R.id.training_status_summary_info_message_second);
        viewFindViewById4.getClass();
        this.f40136p = (TextView) viewFindViewById4;
        View viewFindViewById5 = view2.findViewById(R.id.training_status_table_header_view);
        viewFindViewById5.getClass();
        this.f40137q = (ConstraintLayout) viewFindViewById5;
        View viewFindViewById6 = view2.findViewById(R.id.tabbed_pager_optional_view);
        viewFindViewById6.getClass();
        this.f40138r = (FrameLayout) viewFindViewById6;
        View viewFindViewById7 = view2.findViewById(R.id.provisional_status_text_view);
        viewFindViewById7.getClass();
        this.f40139t = (TextView) viewFindViewById7;
        TextView textView = (TextView) view2.findViewById(R.id.header_left);
        TextView textView2 = (TextView) view2.findViewById(R.id.header_right);
        textView.setContentDescription(getString(R.string.lbl_table_header) + StringUtils.SPACE + getString(R.string.lbl_status));
        textView2.setContentDescription(getString(R.string.lbl_table_header) + StringUtils.SPACE + getString(R.string.common_dates));
        v childFragmentManager = getChildFragmentManager();
        childFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
        com.garmin.android.apps.connectmobile.performance.stats.improvement.b.f40115g.getClass();
        final int i14 = 1;
        aVar.j(R.id.tabbed_pager_optional_view, new com.garmin.android.apps.connectmobile.performance.stats.improvement.b(), "DeviceFragmentTag", 1);
        Unit unit = Unit.INSTANCE;
        aVar.e();
        x xVar = this.f40130j;
        if (xVar != null && (y0Var3 = xVar.f183272h) != null) {
            final int i15 = 0;
            y0Var3.f(getViewLifecycleOwner(), new C0748d(new l(this) { // from class: w61.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.d f183260b;

                {
                    this.f183260b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    x xVar2;
                    String strC4;
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.performance.stats.improvement.d dVar = this.f183260b;
                    switch (i16) {
                        case 0:
                            Set set = (Set) obj;
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.d.a aVar2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w;
                            Fragment fragmentG = dVar.getChildFragmentManager().G("DeviceFragmentTag");
                            if (set == null || !(!set.isEmpty()) || set.size() < 2) {
                                FrameLayout frameLayout = dVar.f40138r;
                                if (frameLayout == null) {
                                    p005kotlin.jvm.internal.s.m("deviceContainerView");
                                    throw null;
                                }
                                frameLayout.setVisibility(8);
                            } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                                if (bVar.isAdded()) {
                                    bVar.v6(p13.h0.b1(set));
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            fw.m mVar = (fw.m) obj;
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.d.a aVar3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w;
                            Fragment fragmentG2 = dVar.getChildFragmentManager().G("DeviceFragmentTag");
                            if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                                if (bVar2.isAdded()) {
                                    bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                                }
                            }
                            return Unit.INSTANCE;
                        default:
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.d.a aVar4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w;
                            if (((Boolean) ((o13.p) obj).f128594a).booleanValue() && (xVar2 = dVar.f40130j) != null && (strC4 = xVar2.C4()) != null) {
                                TextView textView3 = dVar.f40139t;
                                if (textView3 == null) {
                                    p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                    throw null;
                                }
                                textView3.setText(dVar.getString(R.string.provisional_status_please_sync, strC4));
                                TextView textView4 = dVar.f40139t;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                    throw null;
                                }
                                textView4.setVisibility(0);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        x xVar2 = this.f40130j;
        if (xVar2 != null && (y0Var2 = xVar2.f183282q) != null) {
            y0Var2.f(getViewLifecycleOwner(), new C0748d(new l(this) { // from class: w61.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.d f183260b;

                {
                    this.f183260b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    x xVar3;
                    String strC4;
                    int i16 = i14;
                    com.garmin.android.apps.connectmobile.performance.stats.improvement.d dVar = this.f183260b;
                    switch (i16) {
                        case 0:
                            Set set = (Set) obj;
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.d.a aVar2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w;
                            Fragment fragmentG = dVar.getChildFragmentManager().G("DeviceFragmentTag");
                            if (set == null || !(!set.isEmpty()) || set.size() < 2) {
                                FrameLayout frameLayout = dVar.f40138r;
                                if (frameLayout == null) {
                                    p005kotlin.jvm.internal.s.m("deviceContainerView");
                                    throw null;
                                }
                                frameLayout.setVisibility(8);
                            } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                                if (bVar.isAdded()) {
                                    bVar.v6(p13.h0.b1(set));
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            fw.m mVar = (fw.m) obj;
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.d.a aVar3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w;
                            Fragment fragmentG2 = dVar.getChildFragmentManager().G("DeviceFragmentTag");
                            if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                                if (bVar2.isAdded()) {
                                    bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                                }
                            }
                            return Unit.INSTANCE;
                        default:
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.d.a aVar4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w;
                            if (((Boolean) ((o13.p) obj).f128594a).booleanValue() && (xVar3 = dVar.f40130j) != null && (strC4 = xVar3.C4()) != null) {
                                TextView textView3 = dVar.f40139t;
                                if (textView3 == null) {
                                    p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                    throw null;
                                }
                                textView3.setText(dVar.getString(R.string.provisional_status_please_sync, strC4));
                                TextView textView4 = dVar.f40139t;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                    throw null;
                                }
                                textView4.setVisibility(0);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        x xVar3 = this.f40130j;
        if (xVar3 != null && (y0Var = xVar3.Y) != null) {
            final int i16 = 2;
            y0Var.f(getViewLifecycleOwner(), new C0748d(new l(this) { // from class: w61.u

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.performance.stats.improvement.d f183260b;

                {
                    this.f183260b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // e23.l
                public final Object invoke(Object obj) {
                    x xVar4;
                    String strC4;
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.performance.stats.improvement.d dVar = this.f183260b;
                    switch (i17) {
                        case 0:
                            Set set = (Set) obj;
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.d.a aVar2 = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w;
                            Fragment fragmentG = dVar.getChildFragmentManager().G("DeviceFragmentTag");
                            if (set == null || !(!set.isEmpty()) || set.size() < 2) {
                                FrameLayout frameLayout = dVar.f40138r;
                                if (frameLayout == null) {
                                    p005kotlin.jvm.internal.s.m("deviceContainerView");
                                    throw null;
                                }
                                frameLayout.setVisibility(8);
                            } else if (fragmentG != null && (fragmentG instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG;
                                if (bVar.isAdded()) {
                                    bVar.v6(p13.h0.b1(set));
                                }
                            }
                            return Unit.INSTANCE;
                        case 1:
                            fw.m mVar = (fw.m) obj;
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.d.a aVar3 = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w;
                            Fragment fragmentG2 = dVar.getChildFragmentManager().G("DeviceFragmentTag");
                            if (fragmentG2 != null && (fragmentG2 instanceof com.garmin.android.apps.connectmobile.performance.stats.improvement.b)) {
                                com.garmin.android.apps.connectmobile.performance.stats.improvement.b bVar2 = (com.garmin.android.apps.connectmobile.performance.stats.improvement.b) fragmentG2;
                                if (bVar2.isAdded()) {
                                    bVar2.u6(mVar != null ? (com.garmin.android.apps.connectmobile.performance.model.a) mVar.f73770c : null);
                                }
                            }
                            return Unit.INSTANCE;
                        default:
                            com.garmin.android.apps.connectmobile.performance.stats.improvement.d.a aVar4 = com.garmin.android.apps.connectmobile.performance.stats.improvement.d.f40127w;
                            if (((Boolean) ((o13.p) obj).f128594a).booleanValue() && (xVar4 = dVar.f40130j) != null && (strC4 = xVar4.C4()) != null) {
                                TextView textView3 = dVar.f40139t;
                                if (textView3 == null) {
                                    p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                    throw null;
                                }
                                textView3.setText(dVar.getString(R.string.provisional_status_please_sync, strC4));
                                TextView textView4 = dVar.f40139t;
                                if (textView4 == null) {
                                    p005kotlin.jvm.internal.s.m("provisionalStatusTextView");
                                    throw null;
                                }
                                textView4.setVisibility(0);
                            }
                            return Unit.INSTANCE;
                    }
                }
            }));
        }
        m activity = getActivity();
        if (activity != null) {
            RecyclerView recyclerView = this.f40134n;
            if (recyclerView == null) {
                s.m("trainingStatusSummaryRecyclerView");
                throw null;
            }
            recyclerView.setHasFixedSize(true);
            RecyclerView recyclerView2 = this.f40134n;
            if (recyclerView2 == null) {
                s.m("trainingStatusSummaryRecyclerView");
                throw null;
            }
            recyclerView2.setLayoutManager(new LinearLayoutManager(activity));
            t tVar = new t(activity);
            this.f40132l = tVar;
            tVar.f183253b = this;
            RecyclerView recyclerView3 = this.f40134n;
            if (recyclerView3 == null) {
                s.m("trainingStatusSummaryRecyclerView");
                throw null;
            }
            recyclerView3.setAdapter(tVar);
        }
        CaterpillarChart caterpillarChart = this.f40133m;
        if (caterpillarChart != null) {
            caterpillarChart.setOnBarSelectedListener(this);
        } else {
            s.m("trainingStatusSummaryChart");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/improvement/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DEVICE_FRAGMENT_TAG", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
