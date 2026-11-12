package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ItemDiagnosisResultBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView tvDesc;

    @NonNull
    public final TextView tvPoint;

    @NonNull
    public final TextView tvResult;

    private ItemDiagnosisResultBinding(@NonNull RelativeLayout rootView, @NonNull TextView tvDesc, @NonNull TextView tvPoint, @NonNull TextView tvResult) {
        this.a = rootView;
        this.tvDesc = tvDesc;
        this.tvPoint = tvPoint;
        this.tvResult = tvResult;
    }

    @NonNull
    public static ItemDiagnosisResultBinding bind(@NonNull View rootView) {
        int i = R.id.tv_desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_desc);
        if (textView != null) {
            i = R.id.tv_point;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_point);
            if (textView2 != null) {
                i = R.id.tv_result;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_result);
                if (textView3 != null) {
                    return new ItemDiagnosisResultBinding((RelativeLayout) rootView, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemDiagnosisResultBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemDiagnosisResultBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_diagnosis_result, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
