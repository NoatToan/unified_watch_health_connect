package com.garmin.android.apps.connectmobile;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k0 extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f37118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f37119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f37120c = new Handler();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SwipeRefreshLayout f37121d;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.garmin.android.apps.connectmobile.j0] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.garmin.android.apps.connectmobile.j0] */
    public k0() {
        final int i14 = 0;
        this.f37118a = new Runnable(this) { // from class: com.garmin.android.apps.connectmobile.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f36946b;

            {
                this.f36946b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        SwipeRefreshLayout swipeRefreshLayout = this.f36946b.f37121d;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(true);
                        }
                        break;
                    default:
                        this.f36946b.f37121d.setRefreshing(false);
                        break;
                }
            }
        };
        final int i15 = 1;
        this.f37119b = new Runnable(this) { // from class: com.garmin.android.apps.connectmobile.j0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k0 f36946b;

            {
                this.f36946b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        SwipeRefreshLayout swipeRefreshLayout = this.f36946b.f37121d;
                        if (swipeRefreshLayout != null) {
                            swipeRefreshLayout.setRefreshing(true);
                        }
                        break;
                    default:
                        this.f36946b.f37121d.setRefreshing(false);
                        break;
                }
            }
        };
    }

    public final void ca() {
        j0 j0Var = this.f37118a;
        Handler handler = this.f37120c;
        handler.removeCallbacks(j0Var);
        handler.post(this.f37119b);
    }

    public abstract void da();

    public final void ea(boolean z14) {
        SwipeRefreshLayout swipeRefreshLayout = this.f37121d;
        if (swipeRefreshLayout == null || swipeRefreshLayout.isEnabled() == z14) {
            return;
        }
        this.f37121d.setEnabled(z14);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public void onStop() {
        super.onStop();
        j0 j0Var = this.f37118a;
        Handler handler = this.f37120c;
        handler.removeCallbacks(j0Var);
        handler.removeCallbacks(this.f37119b);
        SwipeRefreshLayout swipeRefreshLayout = this.f37121d;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
            this.f37121d.destroyDrawingCache();
            this.f37121d.clearAnimation();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, i.c, b.g, android.app.Activity
    public final void setContentView(int i14) {
        super.setContentView(R.layout.base_swipetofrefresh_layout);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.root_view);
        this.f37121d = swipeRefreshLayout;
        swipeRefreshLayout.setOnRefreshListener(new bd0.e(this, 12));
        this.f37121d.addView(LayoutInflater.from(this).inflate(i14, (ViewGroup) null, true));
    }
}
