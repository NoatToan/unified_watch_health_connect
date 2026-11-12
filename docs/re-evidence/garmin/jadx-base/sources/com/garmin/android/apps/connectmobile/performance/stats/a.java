package com.garmin.android.apps.connectmobile.performance.stats;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.charts.mpchart3.wrapper.CustomBarChart;
import com.garmin.android.apps.connectmobile.m0;
import fw.p;
import iz1.g;
import java.util.List;
import o61.i;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;
import p92.y;
import t61.j;
import t61.k;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/a;", "Lcom/garmin/android/apps/connectmobile/m0;", "<init>", "()V", "b", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends m0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C0743a f40030n = new C0743a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public DateTime f40031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public DateTime f40032i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public rz.a<List<i>, d00.a> f40033j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f40034k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w1 f40035l = new w1(s0.f105811a.b(k.class), new d(this), new f(this), new e(null, this));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f40036m = new g(this, 18);

    public interface b {
        void A2();
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f40037a;

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
            f40037a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class d extends w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40038a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Fragment fragment) {
            super(0);
            this.f40038a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f40038a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f40039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f40040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f40039a = aVar;
            this.f40040b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f40039a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f40040b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f40041a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f40041a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f40041a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0
    public final void E6() {
        k kVar = (k) this.f40035l.getValue();
        DateTime dateTime = this.f40031h;
        if (dateTime == null) {
            s.m("mStartDate");
            throw null;
        }
        DateTime dateTime2 = this.f40032i;
        if (dateTime2 != null) {
            m.a(null, new j(dateTime, dateTime2, kVar, null), 3).f(getViewLifecycleOwner(), this.f40036m);
        } else {
            s.m("mEndDate");
            throw null;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.m0, androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void M7() {
        E6();
        b bVar = this.f40034k;
        if (bVar != null) {
            bVar.A2();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        try {
            this.f40034k = (b) context;
        } catch (ClassCastException unused) {
            wr.g.u(context, " must implement OnStressScoreSummaryRefreshed");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f40031h = new DateTime(arguments.getLong("GCM_extra_start_date"));
            this.f40032i = new DateTime(arguments.getLong("GCM_extra_end_date"));
        } else {
            y.f136664a.getClass();
            y.a.c("StressScoreLevelSummaryFragment", "Error! No arguments were provided in onCreate!");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewA6 = A6(viewGroup, layoutInflater, R.layout.gcm3_stress_score_level_summary_fragment);
        View viewFindViewById = viewA6.findViewById(R.id.summary_bar_chart);
        viewFindViewById.getClass();
        CustomBarChart customBarChart = (CustomBarChart) viewFindViewById;
        Context context = viewA6.getContext();
        context.getClass();
        DateTime dateTime = this.f40031h;
        if (dateTime == null) {
            s.m("mStartDate");
            throw null;
        }
        DateTime dateTime2 = this.f40032i;
        if (dateTime2 != null) {
            this.f40033j = new rz.a<>(customBarChart, new u61.a(context, dateTime, dateTime2), new u61.b(customBarChart), null, null, null, 56, null);
            return viewA6;
        }
        s.m("mEndDate");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        E6();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.performance.stats.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/stats/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0743a {
        public /* synthetic */ C0743a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private C0743a() {
        }
    }
}
