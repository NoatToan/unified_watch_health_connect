package com.huami.bloodoxygen.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.bloodoxygen.ui.R;
import com.huami.bloodoxygen.ui.view.BloodOxygenTitleBar;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class BoUiActivityClickSpo2HistoryBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView noData;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    public final SmartRefreshLayout smartRefreshLayout;

    @NonNull
    public final BloodOxygenTitleBar titleBar;

    private BoUiActivityClickSpo2HistoryBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull SmartRefreshLayout smartRefreshLayout, @NonNull BloodOxygenTitleBar bloodOxygenTitleBar) {
        this.a = linearLayout;
        this.noData = textView;
        this.recyclerView = recyclerView;
        this.smartRefreshLayout = smartRefreshLayout;
        this.titleBar = bloodOxygenTitleBar;
    }

    @NonNull
    public static BoUiActivityClickSpo2HistoryBinding bind(@NonNull View view) {
        int i = R.id.no_data;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.smart_refresh_layout;
                SmartRefreshLayout smartRefreshLayout = (SmartRefreshLayout) ViewBindings.findChildViewById(view, i);
                if (smartRefreshLayout != null) {
                    i = R.id.title_bar;
                    BloodOxygenTitleBar bloodOxygenTitleBar = (BloodOxygenTitleBar) ViewBindings.findChildViewById(view, i);
                    if (bloodOxygenTitleBar != null) {
                        return new BoUiActivityClickSpo2HistoryBinding((LinearLayout) view, textView, recyclerView, smartRefreshLayout, bloodOxygenTitleBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static BoUiActivityClickSpo2HistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BoUiActivityClickSpo2HistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.bo_ui_activity_click_spo2_history, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
