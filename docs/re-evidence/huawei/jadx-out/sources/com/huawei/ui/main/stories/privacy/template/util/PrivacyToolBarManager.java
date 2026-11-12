package com.huawei.ui.main.stories.privacy.template.util;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.huawei.ui.commonui.toolbar.HealthToolBar;
import com.huawei.ui.main.R;

/* JADX INFO: loaded from: classes19.dex */
public class PrivacyToolBarManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f28714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HealthToolBar.OnSingleTapListener f28715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OnStatusChangedListener f28716c;
    private HealthToolBar e;

    public interface OnStatusChangedListener {
        void onStatusChanged(int i);
    }

    public PrivacyToolBarManager(HealthToolBar healthToolBar, HealthToolBar.OnSingleTapListener onSingleTapListener) {
        this.e = healthToolBar;
        this.f28715b = onSingleTapListener;
        c();
    }

    public void a(OnStatusChangedListener onStatusChangedListener) {
        this.f28716c = onStatusChangedListener;
    }

    public void e(int i) {
        if (this.e == null) {
            return;
        }
        OnStatusChangedListener onStatusChangedListener = this.f28716c;
        if (onStatusChangedListener != null) {
            onStatusChangedListener.onStatusChanged(i);
        }
        this.f28714a = i;
        if (i == 1) {
            this.e.setVisibility(8);
            return;
        }
        if (i == 2) {
            this.e.setVisibility(0);
            e();
        } else if (i == 3) {
            d();
        } else {
            if (i != 4) {
                return;
            }
            a();
        }
    }

    public int b() {
        return this.f28714a;
    }

    private void c() {
        HealthToolBar healthToolBar = this.e;
        if (healthToolBar == null || this.f28715b == null) {
            return;
        }
        this.f28714a = 1;
        View viewInflate = LayoutInflater.from(healthToolBar.getContext()).inflate(R.layout.hw_toolbar_bottomview, (ViewGroup) null);
        viewInflate.setBackgroundColor(ContextCompat.getColor(this.e.getContext(), R.color.health_chart_extend_background_color));
        this.e.d(viewInflate);
        this.e.setOnSingleTapListener(this.f28715b);
        this.e.setVisibility(8);
    }

    private void e() {
        HealthToolBar healthToolBar = this.e;
        if (healthToolBar == null) {
            return;
        }
        healthToolBar.setIconVisible(2, 8);
        this.e.setIcon(1, R.drawable.ic_public_black_delete);
        HealthToolBar healthToolBar2 = this.e;
        healthToolBar2.setIconTitle(1, healthToolBar2.getContext().getString(R.string.IDS_hw_show_healthdata_bloodsugar_delete));
        this.e.setIcon(3, R.drawable.ic_public_select_all);
        HealthToolBar healthToolBar3 = this.e;
        healthToolBar3.setIconTitle(3, healthToolBar3.getContext().getString(R.string.IDS_hw_show_healthdata_bloodsugar_select_all));
        this.e.setIconVisible(1, 0);
        this.e.setIconVisible(3, 0);
    }

    private void d() {
        HealthToolBar healthToolBar = this.e;
        if (healthToolBar == null) {
            return;
        }
        healthToolBar.setIconTitle(3, healthToolBar.getContext().getString(R.string.IDS_hw_show_healthdata_bloodsugar_select_all));
        this.e.setIcon(3, R.drawable.ic_public_select_all);
    }

    private void a() {
        HealthToolBar healthToolBar = this.e;
        if (healthToolBar == null) {
            return;
        }
        healthToolBar.setIconTitle(3, healthToolBar.getContext().getString(R.string.IDS_hw_show_healthdata_bloodsugar_unselected_all));
        this.e.setIcon(3, R.drawable.ic_public_deselect_all);
    }
}
