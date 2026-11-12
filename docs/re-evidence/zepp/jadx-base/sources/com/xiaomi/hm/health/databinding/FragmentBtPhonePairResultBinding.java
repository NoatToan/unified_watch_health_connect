package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentBtPhonePairResultBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView btPhoneTipsTv;

    @NonNull
    public final TextView btPhoneTv;

    @NonNull
    public final ImageView pairResultIv;

    @NonNull
    public final RainbowTitleBar titleBar;

    private FragmentBtPhonePairResultBinding(@NonNull ConstraintLayout rootView, @NonNull TextView btPhoneTipsTv, @NonNull TextView btPhoneTv, @NonNull ImageView pairResultIv, @NonNull RainbowTitleBar titleBar) {
        this.a = rootView;
        this.btPhoneTipsTv = btPhoneTipsTv;
        this.btPhoneTv = btPhoneTv;
        this.pairResultIv = pairResultIv;
        this.titleBar = titleBar;
    }

    @NonNull
    public static FragmentBtPhonePairResultBinding bind(@NonNull View rootView) {
        int i = R.id.bt_phone_tips_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bt_phone_tips_tv);
        if (textView != null) {
            i = R.id.bt_phone_tv;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bt_phone_tv);
            if (textView2 != null) {
                i = R.id.pair_result_iv;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.pair_result_iv);
                if (imageView != null) {
                    i = R.id.title_bar;
                    RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, R.id.title_bar);
                    if (rainbowTitleBar != null) {
                        return new FragmentBtPhonePairResultBinding((ConstraintLayout) rootView, textView, textView2, imageView, rainbowTitleBar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBtPhonePairResultBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentBtPhonePairResultBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_bt_phone_pair_result, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
