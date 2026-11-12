package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.view.card.OverViewCard;

/* JADX INFO: loaded from: classes11.dex */
public final class LayoutNewSportDetailDataViewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout cardShareEnd;

    @NonNull
    public final LinearLayout cardShareFeedback;

    @NonNull
    public final LinearLayout cardStrengthTrainingLayout;

    @NonNull
    public final LinearLayout chartInfoLayout;

    @NonNull
    public final ImageView imagePlay;

    @NonNull
    public final RadioGroup milestoneArea;

    @NonNull
    public final LinearLayout movingUiChartLayout;

    @NonNull
    public final TextView movingUiSportFeedback;

    @NonNull
    public final OverViewCard overviewCard;

    @NonNull
    public final LinearLayout segmentLayout;

    @NonNull
    public final TextView sportDetailTargetTitle;

    @NonNull
    public final RecyclerView targetCard;

    @NonNull
    public final RelativeLayout targetCardLayout;

    @NonNull
    public final LinearLayoutCompat triangleMultiple;

    private LayoutNewSportDetailDataViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull ImageView imageView, @NonNull RadioGroup radioGroup, @NonNull LinearLayout linearLayout6, @NonNull TextView textView, @NonNull OverViewCard overViewCard, @NonNull LinearLayout linearLayout7, @NonNull TextView textView2, @NonNull RecyclerView recyclerView, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayoutCompat linearLayoutCompat) {
        this.a = linearLayout;
        this.cardShareEnd = linearLayout2;
        this.cardShareFeedback = linearLayout3;
        this.cardStrengthTrainingLayout = linearLayout4;
        this.chartInfoLayout = linearLayout5;
        this.imagePlay = imageView;
        this.milestoneArea = radioGroup;
        this.movingUiChartLayout = linearLayout6;
        this.movingUiSportFeedback = textView;
        this.overviewCard = overViewCard;
        this.segmentLayout = linearLayout7;
        this.sportDetailTargetTitle = textView2;
        this.targetCard = recyclerView;
        this.targetCardLayout = relativeLayout;
        this.triangleMultiple = linearLayoutCompat;
    }

    @NonNull
    public static LayoutNewSportDetailDataViewBinding bind(@NonNull View view) {
        int i = R.id.card_share_end;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.card_share_feedback;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.card_strength_training_layout;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    LinearLayout linearLayout4 = (LinearLayout) view;
                    i = R.id.image_play;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.milestone_area;
                        RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                        if (radioGroup != null) {
                            i = R.id.moving_ui_chart_layout;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout5 != null) {
                                i = R.id.moving_ui_sport_feedback;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.overview_card;
                                    OverViewCard overViewCard = (OverViewCard) ViewBindings.findChildViewById(view, i);
                                    if (overViewCard != null) {
                                        i = R.id.segment_layout;
                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout6 != null) {
                                            i = R.id.sport_detail_target_title;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView2 != null) {
                                                i = R.id.target_card;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView != null) {
                                                    i = R.id.target_card_layout;
                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                    if (relativeLayout != null) {
                                                        i = R.id.triangle_multiple;
                                                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayoutCompat != null) {
                                                            return new LayoutNewSportDetailDataViewBinding(linearLayout4, linearLayout, linearLayout2, linearLayout3, linearLayout4, imageView, radioGroup, linearLayout5, textView, overViewCard, linearLayout6, textView2, recyclerView, relativeLayout, linearLayoutCompat);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutNewSportDetailDataViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutNewSportDetailDataViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_new_sport_detail_data_view, viewGroup, false);
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
