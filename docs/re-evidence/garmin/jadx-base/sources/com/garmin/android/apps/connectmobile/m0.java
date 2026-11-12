package com.garmin.android.apps.connectmobile;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/m0;", "Landroidx/fragment/app/Fragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$f;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class m0 extends Fragment implements SwipeRefreshLayout.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f38726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f38727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f38728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f38729d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f38730e = new Handler();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Handler f38731f = new Handler();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SwipeRefreshLayout f38732g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38733a;

        static {
            int[] iArr = new int[com.garmin.android.library.backgroundtaskmanagement.b.c.values().length];
            try {
                iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.NO_NETWORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.library.backgroundtaskmanagement.b.c.SERVER_UNAVAILABLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f38733a = iArr;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.garmin.android.apps.connectmobile.l0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.garmin.android.apps.connectmobile.l0] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.garmin.android.apps.connectmobile.l0] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.garmin.android.apps.connectmobile.l0] */
    public m0() {
        final int i14 = 0;
        this.f38726a = new Runnable(this) { // from class: com.garmin.android.apps.connectmobile.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f37134b;

            {
                this.f37134b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        SwipeRefreshLayout swipeRefreshLayout = this.f37134b.f38732g;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(true);
                        }
                        break;
                    case 1:
                        SwipeRefreshLayout swipeRefreshLayout2 = this.f37134b.f38732g;
                        swipeRefreshLayout2.getClass();
                        swipeRefreshLayout2.setRefreshing(false);
                        break;
                    case 2:
                        m0 m0Var = this.f37134b;
                        if (m0Var.getActivity() != null) {
                            c cVar = (c) m0Var.getActivity();
                            cVar.getClass();
                            cVar.showProgressOverlay();
                        }
                        break;
                    default:
                        m0 m0Var2 = this.f37134b;
                        if (m0Var2.getActivity() != null) {
                            c cVar2 = (c) m0Var2.getActivity();
                            cVar2.getClass();
                            cVar2.hideProgressOverlay();
                        }
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f38727b = new Runnable(this) { // from class: com.garmin.android.apps.connectmobile.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f37134b;

            {
                this.f37134b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        SwipeRefreshLayout swipeRefreshLayout = this.f37134b.f38732g;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(true);
                        }
                        break;
                    case 1:
                        SwipeRefreshLayout swipeRefreshLayout2 = this.f37134b.f38732g;
                        swipeRefreshLayout2.getClass();
                        swipeRefreshLayout2.setRefreshing(false);
                        break;
                    case 2:
                        m0 m0Var = this.f37134b;
                        if (m0Var.getActivity() != null) {
                            c cVar = (c) m0Var.getActivity();
                            cVar.getClass();
                            cVar.showProgressOverlay();
                        }
                        break;
                    default:
                        m0 m0Var2 = this.f37134b;
                        if (m0Var2.getActivity() != null) {
                            c cVar2 = (c) m0Var2.getActivity();
                            cVar2.getClass();
                            cVar2.hideProgressOverlay();
                        }
                        break;
                }
            }
        };
        final int i16 = 2;
        this.f38728c = new Runnable(this) { // from class: com.garmin.android.apps.connectmobile.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f37134b;

            {
                this.f37134b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        SwipeRefreshLayout swipeRefreshLayout = this.f37134b.f38732g;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(true);
                        }
                        break;
                    case 1:
                        SwipeRefreshLayout swipeRefreshLayout2 = this.f37134b.f38732g;
                        swipeRefreshLayout2.getClass();
                        swipeRefreshLayout2.setRefreshing(false);
                        break;
                    case 2:
                        m0 m0Var = this.f37134b;
                        if (m0Var.getActivity() != null) {
                            c cVar = (c) m0Var.getActivity();
                            cVar.getClass();
                            cVar.showProgressOverlay();
                        }
                        break;
                    default:
                        m0 m0Var2 = this.f37134b;
                        if (m0Var2.getActivity() != null) {
                            c cVar2 = (c) m0Var2.getActivity();
                            cVar2.getClass();
                            cVar2.hideProgressOverlay();
                        }
                        break;
                }
            }
        };
        final int i17 = 3;
        this.f38729d = new Runnable(this) { // from class: com.garmin.android.apps.connectmobile.l0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m0 f37134b;

            {
                this.f37134b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        SwipeRefreshLayout swipeRefreshLayout = this.f37134b.f38732g;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(true);
                        }
                        break;
                    case 1:
                        SwipeRefreshLayout swipeRefreshLayout2 = this.f37134b.f38732g;
                        swipeRefreshLayout2.getClass();
                        swipeRefreshLayout2.setRefreshing(false);
                        break;
                    case 2:
                        m0 m0Var = this.f37134b;
                        if (m0Var.getActivity() != null) {
                            c cVar = (c) m0Var.getActivity();
                            cVar.getClass();
                            cVar.showProgressOverlay();
                        }
                        break;
                    default:
                        m0 m0Var2 = this.f37134b;
                        if (m0Var2.getActivity() != null) {
                            c cVar2 = (c) m0Var2.getActivity();
                            cVar2.getClass();
                            cVar2.hideProgressOverlay();
                        }
                        break;
                }
            }
        };
    }

    public final View A6(ViewGroup viewGroup, LayoutInflater layoutInflater, int i14) {
        ViewGroup viewGroup2 = (ViewGroup) com.airbnb.lottie.animation.keyframe.a.b(layoutInflater, R.layout.base_swipetofrefresh_layout, viewGroup, false);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewGroup2.findViewById(R.id.root_view);
        this.f38732g = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        View viewInflate = layoutInflater.inflate(i14, viewGroup2, true);
        viewInflate.getClass();
        return viewInflate;
    }

    public final ViewGroup C6(LayoutInflater layoutInflater, ViewGroup viewGroup, View view2) {
        View viewInflate = layoutInflater.inflate(R.layout.base_swipetofrefresh_layout, viewGroup, false);
        viewInflate.getClass();
        ViewGroup viewGroup2 = (ViewGroup) viewInflate;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewGroup2.findViewById(R.id.root_view);
        this.f38732g = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        viewGroup2.addView(view2);
        return viewGroup2;
    }

    public abstract void E6();

    public final void F6(boolean z14) {
        SwipeRefreshLayout swipeRefreshLayout = this.f38732g;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.getClass();
            swipeRefreshLayout.setEnabled(z14);
        }
    }

    public final void G6() {
        Handler handler = this.f38730e;
        l0 l0Var = this.f38726a;
        handler.removeCallbacks(l0Var);
        handler.postDelayed(l0Var, 100L);
    }

    public final void H6(boolean z14) {
        if (z14) {
            Handler handler = this.f38731f;
            l0 l0Var = this.f38728c;
            handler.removeCallbacks(l0Var);
            handler.postDelayed(l0Var, 100L);
            return;
        }
        Handler handler2 = this.f38730e;
        l0 l0Var2 = this.f38726a;
        handler2.removeCallbacks(l0Var2);
        handler2.postDelayed(l0Var2, 100L);
    }

    public void M7() {
        E6();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        l0 l0Var = this.f38726a;
        Handler handler = this.f38730e;
        handler.removeCallbacks(l0Var);
        handler.removeCallbacks(this.f38727b);
        l0 l0Var2 = this.f38728c;
        Handler handler2 = this.f38731f;
        handler2.removeCallbacks(l0Var2);
        handler2.removeCallbacks(this.f38729d);
        SwipeRefreshLayout swipeRefreshLayout = this.f38732g;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
            SwipeRefreshLayout swipeRefreshLayout2 = this.f38732g;
            swipeRefreshLayout2.getClass();
            swipeRefreshLayout2.destroyDrawingCache();
            SwipeRefreshLayout swipeRefreshLayout3 = this.f38732g;
            swipeRefreshLayout3.getClass();
            swipeRefreshLayout3.clearAnimation();
        }
    }

    public final void u6(com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
        if (getActivity() != null) {
            int i14 = cVar == null ? -1 : a.f38733a[cVar.ordinal()];
            if (i14 == 1 || i14 == 2 || i14 == 3) {
                return;
            }
            Toast.makeText(getActivity(), R.string.txt_error_occurred, 0).show();
        }
    }

    public final void v6(Integer num) {
        if (getActivity() == null || num == null) {
            return;
        }
        int iIntValue = num.intValue();
        if (200 > iIntValue || iIntValue >= 300) {
            Toast.makeText(getActivity(), R.string.txt_error_occurred, 0).show();
        }
    }

    public final void w6() {
        l0 l0Var = this.f38726a;
        Handler handler = this.f38730e;
        handler.removeCallbacks(l0Var);
        handler.post(this.f38727b);
    }

    public final void y6(boolean z14) {
        if (z14) {
            l0 l0Var = this.f38728c;
            Handler handler = this.f38731f;
            handler.removeCallbacks(l0Var);
            handler.post(this.f38729d);
            return;
        }
        l0 l0Var2 = this.f38726a;
        Handler handler2 = this.f38730e;
        handler2.removeCallbacks(l0Var2);
        handler2.post(this.f38727b);
    }

    public final boolean z6() {
        SwipeRefreshLayout swipeRefreshLayout = this.f38732g;
        if (swipeRefreshLayout == null) {
            return false;
        }
        swipeRefreshLayout.getClass();
        return swipeRefreshLayout.f11021c;
    }
}
