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
public final class PlayCardSportHelperBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final PlayCardCommonTitleBinding llTitle;

    @NonNull
    public final TextView tvDesc;

    @NonNull
    public final TextView tvIntervalTraining;

    @NonNull
    public final TextView tvSportData;

    private PlayCardSportHelperBinding(@NonNull ConstraintLayout rootView, @NonNull PlayCardCommonTitleBinding llTitle, @NonNull TextView tvDesc, @NonNull TextView tvIntervalTraining, @NonNull TextView tvSportData) {
        this.a = rootView;
        this.llTitle = llTitle;
        this.tvDesc = tvDesc;
        this.tvIntervalTraining = tvIntervalTraining;
        this.tvSportData = tvSportData;
    }

    @NonNull
    public static PlayCardSportHelperBinding bind(@NonNull View rootView) {
        int i = R.id.ll_title;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.ll_title);
        if (viewFindChildViewById != null) {
            PlayCardCommonTitleBinding playCardCommonTitleBindingBind = PlayCardCommonTitleBinding.bind(viewFindChildViewById);
            i = R.id.tv_desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_desc);
            if (textView != null) {
                i = R.id.tv_interval_training;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_interval_training);
                if (textView2 != null) {
                    i = R.id.tv_sport_data;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_sport_data);
                    if (textView3 != null) {
                        return new PlayCardSportHelperBinding((ConstraintLayout) rootView, playCardCommonTitleBindingBind, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlayCardSportHelperBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PlayCardSportHelperBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.play_card_sport_helper, parent, false);
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
