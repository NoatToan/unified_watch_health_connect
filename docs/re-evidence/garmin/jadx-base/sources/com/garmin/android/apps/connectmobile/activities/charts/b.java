package com.garmin.android.apps.connectmobile.activities.charts;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import aq.q1;
import com.garmin.android.apps.connectmobile.R;
import h32.n;
import k32.p;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/charts/b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "chartRow", "<init>", "(Landroid/view/View;)V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class b extends RecyclerView.f0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final SparseArray<int[]> f28961k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f28962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f28963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f28964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f28965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f28966e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ViewGroup f28967f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f28968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f28969h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearLayout f28970i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinearLayout f28971j;

    static {
        new a(null);
        f28961k = new SparseArray<>(97);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view2) {
        super(view2);
        view2.getClass();
        View viewFindViewById = view2.findViewById(R.id.gcm_stats_row_1);
        this.f28962a = viewFindViewById;
        this.f28963b = viewFindViewById != null ? new p(viewFindViewById) : null;
        this.f28964c = (TextView) view2.findViewById(R.id.chart_title);
        this.f28965d = (TextView) view2.findViewById(R.id.chart_subtitle);
        this.f28966e = view2.findViewById(R.id.chart_help);
        this.f28967f = (ViewGroup) view2.findViewById(R.id.chart_tags_container);
        this.f28968g = (ImageView) view2.findViewById(R.id.connect_iq_icon);
        this.f28969h = (LinearLayout) view2.findViewById(R.id.chart_graph);
        this.f28970i = (LinearLayout) view2.findViewById(R.id.chart_legend_container);
        this.f28971j = (LinearLayout) view2.findViewById(R.id.chart_top_legend_container);
    }

    public void d(String str, String str2) {
        n.b bVar;
        p pVar = this.f28963b;
        if (pVar == null || (bVar = pVar.f102718b) == null) {
            return;
        }
        bVar.e(0);
        bVar.d(str);
        bVar.c(str2);
    }

    public void e(String str, String str2, String str3, String str4) {
        n.b bVar;
        View view2;
        p pVar = this.f28963b;
        if (pVar == null || (bVar = pVar.f102718b) == null) {
            return;
        }
        bVar.e(0);
        bVar.d(str);
        bVar.a(str3);
        bVar.c(str2);
        if (str4 == null || (view2 = bVar.f81397a) == null) {
            return;
        }
        view2.setContentDescription(str4);
    }

    public void f(String str, String str2) {
        n.b bVar;
        p pVar = this.f28963b;
        if (pVar == null || (bVar = pVar.f102719c) == null) {
            return;
        }
        bVar.e(0);
        bVar.d(str);
        bVar.c(str2);
    }

    public void g(String str, String str2, String str3, String str4) {
        n.b bVar;
        View view2;
        p pVar = this.f28963b;
        if (pVar == null || (bVar = pVar.f102719c) == null) {
            return;
        }
        bVar.e(0);
        bVar.d(str);
        bVar.a(str3);
        bVar.c(str2);
        if (str4 == null || (view2 = bVar.f81397a) == null) {
            return;
        }
        view2.setContentDescription(str4);
    }

    public void h(boolean z14) {
        n.b bVar;
        p pVar = this.f28963b;
        if (pVar == null || (bVar = pVar.f102718b) == null) {
            return;
        }
        bVar.e(z14 ? 0 : 4);
    }

    public void i(boolean z14) {
        n.b bVar;
        p pVar = this.f28963b;
        if (pVar == null || (bVar = pVar.f102719c) == null) {
            return;
        }
        bVar.e(z14 ? 0 : 4);
    }

    public void j(boolean z14) {
        p pVar = this.f28963b;
        if (pVar != null) {
            n.b bVar = pVar.f102719c;
            n.b bVar2 = pVar.f102718b;
            View view2 = pVar.f102717a;
            if (z14) {
                view2.setVisibility(0);
                bVar2.e(0);
                bVar.e(0);
            } else {
                view2.setVisibility(8);
                bVar2.e(8);
                bVar.e(8);
            }
        }
    }

    public final void k(e23.a<Unit> aVar) {
        q1 q1Var = new q1(aVar, 9);
        View view2 = this.f28966e;
        if (view2 != null) {
            TextView textView = this.f28964c;
            CharSequence text = textView != null ? textView.getText() : null;
            view2.setContentDescription(((Object) text) + ", " + view2.getContext().getString(R.string.lbl_help));
            view2.setVisibility(0);
            view2.setOnClickListener(q1Var);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/charts/b$a;", "", "<init>", "()V", "Landroid/util/SparseArray;", "", "mChartDataSetSelection", "Landroid/util/SparseArray;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
