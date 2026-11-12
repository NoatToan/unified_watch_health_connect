package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.progress.ProgressView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentEraseScaleHistoryDataBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ProgressView bindChart;

    @NonNull
    public final TextView leftBtn;

    @NonNull
    public final TextView rightBtn;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    private FragmentEraseScaleHistoryDataBinding(@NonNull RelativeLayout relativeLayout, @NonNull ProgressView progressView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.a = relativeLayout;
        this.bindChart = progressView;
        this.leftBtn = textView;
        this.rightBtn = textView2;
        this.subTitleTv = textView3;
        this.titleTv = textView4;
    }

    @NonNull
    public static FragmentEraseScaleHistoryDataBinding bind(@NonNull View view) {
        int i = R.id.bind_chart;
        ProgressView progressView = (ProgressView) ViewBindings.findChildViewById(view, i);
        if (progressView != null) {
            i = R.id.left_btn;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.right_btn;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.sub_title_tv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.title_tv;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            return new FragmentEraseScaleHistoryDataBinding((RelativeLayout) view, progressView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEraseScaleHistoryDataBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEraseScaleHistoryDataBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_erase_scale_history_data, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
