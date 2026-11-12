package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.view.weightfigure.WeightFigureView;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.view.WeightLoadingStatus;
import com.xiaomi.hm.health.bodyfat.view.WeightUserQuickPicker;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityOneFootDetailBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout chartContainer;

    @NonNull
    public final ConstraintLayout constraintLayout;

    @NonNull
    public final ImageView deleteIv;

    @NonNull
    public final RelativeLayout deleteLl;

    @NonNull
    public final ImageView guestIv;

    @NonNull
    public final RelativeLayout guestLl;

    @NonNull
    public final View lineSplit2;

    @NonNull
    public final LinearLayout llBottom;

    @NonNull
    public final WeightLoadingStatus loadingStatus;

    @NonNull
    public final ImageView measureIv;

    @NonNull
    public final RelativeLayout measureLl;

    @NonNull
    public final WeightFigureView oneFootFigureView;

    @NonNull
    public final TypefaceTextView oneFootValueTv;

    @NonNull
    public final RelativeLayout rlHasScore;

    @NonNull
    public final RelativeLayout rlNoScore;

    @NonNull
    public final TextView txNoScore;

    @NonNull
    public final TextView txScoreLevel;

    @NonNull
    public final TextView unitTV;

    @NonNull
    public final WeightUserQuickPicker userPicker;

    @NonNull
    public final RelativeLayout userPickerLl;

    @NonNull
    public final LinearLayout weightBodyTypeLl;

    @NonNull
    public final RelativeLayout weightRl;

    @NonNull
    public final LinearLayout weightValueLlPicker;

    private ActivityOneFootDetailBinding(@NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout3, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout4, @NonNull View view, @NonNull LinearLayout linearLayout, @NonNull WeightLoadingStatus weightLoadingStatus, @NonNull ImageView imageView3, @NonNull RelativeLayout relativeLayout5, @NonNull WeightFigureView weightFigureView, @NonNull TypefaceTextView typefaceTextView, @NonNull RelativeLayout relativeLayout6, @NonNull RelativeLayout relativeLayout7, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull WeightUserQuickPicker weightUserQuickPicker, @NonNull RelativeLayout relativeLayout8, @NonNull LinearLayout linearLayout2, @NonNull RelativeLayout relativeLayout9, @NonNull LinearLayout linearLayout3) {
        this.a = relativeLayout;
        this.chartContainer = relativeLayout2;
        this.constraintLayout = constraintLayout;
        this.deleteIv = imageView;
        this.deleteLl = relativeLayout3;
        this.guestIv = imageView2;
        this.guestLl = relativeLayout4;
        this.lineSplit2 = view;
        this.llBottom = linearLayout;
        this.loadingStatus = weightLoadingStatus;
        this.measureIv = imageView3;
        this.measureLl = relativeLayout5;
        this.oneFootFigureView = weightFigureView;
        this.oneFootValueTv = typefaceTextView;
        this.rlHasScore = relativeLayout6;
        this.rlNoScore = relativeLayout7;
        this.txNoScore = textView;
        this.txScoreLevel = textView2;
        this.unitTV = textView3;
        this.userPicker = weightUserQuickPicker;
        this.userPickerLl = relativeLayout8;
        this.weightBodyTypeLl = linearLayout2;
        this.weightRl = relativeLayout9;
        this.weightValueLlPicker = linearLayout3;
    }

    @NonNull
    public static ActivityOneFootDetailBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.chart_container;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.constraint_layout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.delete_iv;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.delete_ll;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null) {
                        i = R.id.guest_iv;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.guest_ll;
                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line_split2))) != null) {
                                i = R.id.ll_bottom;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null) {
                                    i = R.id.loading_status;
                                    WeightLoadingStatus weightLoadingStatus = (WeightLoadingStatus) ViewBindings.findChildViewById(view, i);
                                    if (weightLoadingStatus != null) {
                                        i = R.id.measure_iv;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView3 != null) {
                                            i = R.id.measure_ll;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout4 != null) {
                                                i = R.id.one_foot_figure_view;
                                                WeightFigureView weightFigureView = (WeightFigureView) ViewBindings.findChildViewById(view, i);
                                                if (weightFigureView != null) {
                                                    i = R.id.one_foot_value_tv;
                                                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                    if (typefaceTextView != null) {
                                                        i = R.id.rl_has_score;
                                                        RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                        if (relativeLayout5 != null) {
                                                            i = R.id.rl_no_score;
                                                            RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                            if (relativeLayout6 != null) {
                                                                i = R.id.tx_no_score;
                                                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView != null) {
                                                                    i = R.id.tx_score_level;
                                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView2 != null) {
                                                                        i = R.id.unitTV;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView3 != null) {
                                                                            i = R.id.user_picker;
                                                                            WeightUserQuickPicker weightUserQuickPicker = (WeightUserQuickPicker) ViewBindings.findChildViewById(view, i);
                                                                            if (weightUserQuickPicker != null) {
                                                                                i = R.id.user_picker_ll;
                                                                                RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (relativeLayout7 != null) {
                                                                                    i = R.id.weight_body_type_ll;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (linearLayout2 != null) {
                                                                                        i = R.id.weight_rl;
                                                                                        RelativeLayout relativeLayout8 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (relativeLayout8 != null) {
                                                                                            i = R.id.weight_value_ll_picker;
                                                                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (linearLayout3 != null) {
                                                                                                return new ActivityOneFootDetailBinding((RelativeLayout) view, relativeLayout, constraintLayout, imageView, relativeLayout2, imageView2, relativeLayout3, viewFindChildViewById, linearLayout, weightLoadingStatus, imageView3, relativeLayout4, weightFigureView, typefaceTextView, relativeLayout5, relativeLayout6, textView, textView2, textView3, weightUserQuickPicker, relativeLayout7, linearLayout2, relativeLayout8, linearLayout3);
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
    public static ActivityOneFootDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneFootDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_one_foot_detail, viewGroup, false);
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
