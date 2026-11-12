package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import i3.e5;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/o0;", "Landroidx/fragment/app/n0;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class o0 extends androidx.fragment.app.n0 implements SwipeRefreshLayout.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n0 f39639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n0 f39640k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public SwipeRefreshLayout f39642m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f39643n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f39644o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ListView f39645p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f39646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f39647r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f39648t;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f39641l = new Handler();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final a f39649v = new a(A6());

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/o0$a", "Lr22/h0;", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends r22.h0 {
        public a(int i14) {
            super(i14);
        }

        @Override // r22.h0
        public final void a(int i14, int i15) {
            o0 o0Var = o0.this;
            if (o0Var.G6()) {
                View view2 = o0Var.f39643n;
                view2.getClass();
                view2.setVisibility(0);
                o0Var.H6(i14, i15);
            }
        }

        @Override // r22.h0
        public final void b(boolean z14) {
            o0.this.M6(z14);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.garmin.android.apps.connectmobile.n0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.garmin.android.apps.connectmobile.n0] */
    public o0() {
        final int i14 = 0;
        this.f39639j = new Runnable(this) { // from class: com.garmin.android.apps.connectmobile.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f39328b;

            {
                this.f39328b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        SwipeRefreshLayout swipeRefreshLayout = this.f39328b.f39642m;
                        swipeRefreshLayout.getClass();
                        swipeRefreshLayout.setRefreshing(true);
                        break;
                    default:
                        SwipeRefreshLayout swipeRefreshLayout2 = this.f39328b.f39642m;
                        swipeRefreshLayout2.getClass();
                        swipeRefreshLayout2.setRefreshing(false);
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f39640k = new Runnable(this) { // from class: com.garmin.android.apps.connectmobile.n0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o0 f39328b;

            {
                this.f39328b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        SwipeRefreshLayout swipeRefreshLayout = this.f39328b.f39642m;
                        swipeRefreshLayout.getClass();
                        swipeRefreshLayout.setRefreshing(true);
                        break;
                    default:
                        SwipeRefreshLayout swipeRefreshLayout2 = this.f39328b.f39642m;
                        swipeRefreshLayout2.getClass();
                        swipeRefreshLayout2.setRefreshing(false);
                        break;
                }
            }
        };
    }

    public int A6() {
        return 10;
    }

    /* JADX INFO: renamed from: C6, reason: from getter */
    public String getF39648t() {
        return this.f39648t;
    }

    public String E6() {
        String str = this.f39647r;
        return str == null ? "" : str;
    }

    public final void F6() {
        n0 n0Var = this.f39639j;
        Handler handler = this.f39641l;
        handler.removeCallbacks(n0Var);
        handler.post(this.f39640k);
    }

    public boolean G6() {
        return this instanceof com.garmin.android.apps.connectmobile.segments.presentation.c;
    }

    public void H6(int i14, int i15) {
    }

    public abstract void I6();

    public final void J6(boolean z14) {
        F6();
        a aVar = this.f39649v;
        aVar.f149666c = false;
        if (z14) {
            aVar.f149665b = true;
        }
        z6();
        TextView textView = this.f39644o;
        textView.getClass();
        String str = this.f39646q;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
    }

    public void K6(int i14) {
        F6();
        a aVar = this.f39649v;
        if (i14 == 0 || i14 < aVar.f149664a) {
            aVar.f149665b = true;
        }
        aVar.f149666c = false;
        aVar.f149667d += i14;
        if (aVar.f149665b) {
            z6();
        }
        if (i14 == 0 && aVar.f149667d == 1) {
            TextView textView = this.f39644o;
            textView.getClass();
            textView.setText(getF39648t());
        }
    }

    public void M6(boolean z14) {
        SwipeRefreshLayout swipeRefreshLayout = this.f39642m;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.getClass();
            swipeRefreshLayout.setEnabled(z14);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public final void M7() {
        TextView textView = this.f39644o;
        textView.getClass();
        textView.setText(E6());
        a aVar = this.f39649v;
        boolean z14 = aVar.f149666c;
        if (!z14) {
            if (!z14) {
                aVar.f149665b = false;
                aVar.f149667d = 1;
            }
            aVar.f149666c = true;
            z6();
            S6();
        }
        I6();
    }

    public final void S6() {
        Handler handler = this.f39641l;
        n0 n0Var = this.f39639j;
        handler.removeCallbacks(n0Var);
        handler.postDelayed(n0Var, 100L);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39647r = getString(R.string.txt_loading);
        this.f39646q = e5.g(getString(R.string.msg_common_no_data_available), StringUtils.SPACE, getString(R.string.msg_common_pull_to_refresh));
        this.f39648t = getString(R.string.txt_empty_page_no_data);
    }

    @Override // androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.base_swipetofrefresh_list_layout, (ViewGroup) null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        n0 n0Var = this.f39639j;
        Handler handler = this.f39641l;
        handler.removeCallbacks(n0Var);
        handler.removeCallbacks(this.f39640k);
        SwipeRefreshLayout swipeRefreshLayout = this.f39642m;
        swipeRefreshLayout.getClass();
        swipeRefreshLayout.setRefreshing(false);
        SwipeRefreshLayout swipeRefreshLayout2 = this.f39642m;
        swipeRefreshLayout2.getClass();
        swipeRefreshLayout2.destroyDrawingCache();
        SwipeRefreshLayout swipeRefreshLayout3 = this.f39642m;
        swipeRefreshLayout3.getClass();
        swipeRefreshLayout3.clearAnimation();
    }

    @Override // androidx.fragment.app.n0, androidx.fragment.app.Fragment
    public void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        u6();
        ListView listView = this.f7311e;
        this.f39645p = listView;
        listView.getClass();
        listView.setFooterDividersEnabled(false);
        ListView listView2 = this.f39645p;
        listView2.getClass();
        listView2.setOnScrollListener(this.f39649v);
        if (G6()) {
            View viewInflate = requireActivity().getLayoutInflater().inflate(R.layout.gcm_list_loading_footer, (ViewGroup) null);
            this.f39643n = viewInflate.findViewById(R.id.footer_container);
            ListView listView3 = this.f39645p;
            listView3.getClass();
            listView3.addFooterView(viewInflate, null, false);
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view2.findViewById(R.id.root_view);
        this.f39642m = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        TextView textView = (TextView) view2.findViewById(android.R.id.empty);
        this.f39644o = textView;
        textView.getClass();
        textView.setText(E6());
    }

    public final void z6() {
        View view2;
        if (!G6() || (view2 = this.f39643n) == null) {
            return;
        }
        view2.setVisibility(8);
    }
}
