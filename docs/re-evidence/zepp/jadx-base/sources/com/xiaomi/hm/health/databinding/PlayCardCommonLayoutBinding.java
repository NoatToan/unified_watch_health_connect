package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class PlayCardCommonLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final PlayCardCommonTitleBinding llTitle;

    @NonNull
    public final TextView tvDesc;

    private PlayCardCommonLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull PlayCardCommonTitleBinding llTitle, @NonNull TextView tvDesc) {
        this.a = rootView;
        this.llTitle = llTitle;
        this.tvDesc = tvDesc;
    }

    @NonNull
    public static PlayCardCommonLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.ll_title;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.ll_title);
        if (viewFindChildViewById != null) {
            PlayCardCommonTitleBinding playCardCommonTitleBindingBind = PlayCardCommonTitleBinding.bind(viewFindChildViewById);
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_desc);
            if (textView != null) {
                return new PlayCardCommonLayoutBinding((ConstraintLayout) rootView, playCardCommonTitleBindingBind, textView);
            }
            i = R.id.tv_desc;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayCardCommonLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayCardCommonLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_card_common_layout, parent, false);
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
