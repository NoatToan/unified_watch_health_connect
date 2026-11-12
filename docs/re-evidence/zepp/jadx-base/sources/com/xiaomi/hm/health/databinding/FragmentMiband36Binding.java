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
public final class FragmentMiband36Binding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    private FragmentMiband36Binding(@NonNull RelativeLayout rootView, @NonNull TextView subTitleTv, @NonNull TextView titleTv) {
        this.a = rootView;
        this.subTitleTv = subTitleTv;
        this.titleTv = titleTv;
    }

    @NonNull
    public static FragmentMiband36Binding bind(@NonNull View rootView) {
        int i = R.id.sub_title_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sub_title_tv);
        if (textView != null) {
            i = R.id.title_tv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
            if (textView2 != null) {
                return new FragmentMiband36Binding((RelativeLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMiband36Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMiband36Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_miband3_6, parent, false);
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
