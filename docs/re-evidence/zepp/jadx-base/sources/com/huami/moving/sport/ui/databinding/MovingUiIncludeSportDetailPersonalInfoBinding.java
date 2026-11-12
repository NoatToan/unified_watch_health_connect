package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;
import com.huami.moving.ui.view.FastSlowGradientView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingUiIncludeSportDetailPersonalInfoBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout clUserInfo;

    @NonNull
    public final ConstraintLayout clUserInfoNoGps;

    @NonNull
    public final ImageView ivDistanceVerify;

    @NonNull
    public final ImageView ivFold;

    @NonNull
    public final ImageView ivHumidity;

    @NonNull
    public final ImageView ivLogo;

    @NonNull
    public final ImageView ivSpeed;

    @NonNull
    public final ImageView overViewAvatarNoGps;

    @NonNull
    public final TextView overViewFast;

    @NonNull
    public final FastSlowGradientView overViewGradient;

    @NonNull
    public final TextView overViewMainUnit;

    @NonNull
    public final TextView overViewMainUnitNoGps;

    @NonNull
    public final TypefaceTextView overViewMainValue;

    @NonNull
    public final TypefaceTextView overViewMainValueNoGps;

    @NonNull
    public final TextView overViewNickname;

    @NonNull
    public final TextView overViewNicknameNoGps;

    @NonNull
    public final View overViewReplace;

    @NonNull
    public final TextView overViewSlow;

    @NonNull
    public final TextView overViewStartTime;

    @NonNull
    public final TextView overViewStartTimeNoGps;

    @NonNull
    public final RelativeLayout rlSportHeadNoMap;

    @NonNull
    public final TextView sportHeadNoMap;

    @NonNull
    public final TextView tvLabelHumidityNoGps;

    @NonNull
    public final TextView tvLabelSpeedNoGps;

    @NonNull
    public final TextView tvLabelTemperatureNoGps;

    @NonNull
    public final TextView tvLableHumidity;

    @NonNull
    public final TextView tvLableSpeed;

    @NonNull
    public final TextView tvLableTemperature;

    private MovingUiIncludeSportDetailPersonalInfoBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull ImageView imageView6, @NonNull TextView textView, @NonNull FastSlowGradientView fastSlowGradientView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull View view, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13, @NonNull TextView textView14, @NonNull TextView textView15) {
        this.a = constraintLayout;
        this.clUserInfo = constraintLayout2;
        this.clUserInfoNoGps = constraintLayout3;
        this.ivDistanceVerify = imageView;
        this.ivFold = imageView2;
        this.ivHumidity = imageView3;
        this.ivLogo = imageView4;
        this.ivSpeed = imageView5;
        this.overViewAvatarNoGps = imageView6;
        this.overViewFast = textView;
        this.overViewGradient = fastSlowGradientView;
        this.overViewMainUnit = textView2;
        this.overViewMainUnitNoGps = textView3;
        this.overViewMainValue = typefaceTextView;
        this.overViewMainValueNoGps = typefaceTextView2;
        this.overViewNickname = textView4;
        this.overViewNicknameNoGps = textView5;
        this.overViewReplace = view;
        this.overViewSlow = textView6;
        this.overViewStartTime = textView7;
        this.overViewStartTimeNoGps = textView8;
        this.rlSportHeadNoMap = relativeLayout;
        this.sportHeadNoMap = textView9;
        this.tvLabelHumidityNoGps = textView10;
        this.tvLabelSpeedNoGps = textView11;
        this.tvLabelTemperatureNoGps = textView12;
        this.tvLableHumidity = textView13;
        this.tvLableSpeed = textView14;
        this.tvLableTemperature = textView15;
    }

    @NonNull
    public static MovingUiIncludeSportDetailPersonalInfoBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.cl_user_info;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.cl_user_info_no_gps;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                i = R.id.iv_distance_verify;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.iv_fold;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.iv_humidity;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.iv_logo;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView4 != null) {
                                i = R.id.iv_speed;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView5 != null) {
                                    i = R.id.over_view_avatar_no_gps;
                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView6 != null) {
                                        i = R.id.over_view_fast;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            i = R.id.over_view_gradient;
                                            FastSlowGradientView fastSlowGradientView = (FastSlowGradientView) ViewBindings.findChildViewById(view, i);
                                            if (fastSlowGradientView != null) {
                                                i = R.id.over_view_main_unit;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView2 != null) {
                                                    i = R.id.over_view_main_unit_no_gps;
                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView3 != null) {
                                                        i = R.id.over_view_main_value;
                                                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                        if (typefaceTextView != null) {
                                                            i = R.id.over_view_main_value_no_gps;
                                                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                            if (typefaceTextView2 != null) {
                                                                i = R.id.over_view_nickname;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView4 != null) {
                                                                    i = R.id.over_view_nickname_no_gps;
                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.over_view_replace))) != null) {
                                                                        i = R.id.over_view_slow;
                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView6 != null) {
                                                                            i = R.id.over_view_start_time;
                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView7 != null) {
                                                                                i = R.id.over_view_start_time_no_gps;
                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView8 != null) {
                                                                                    i = R.id.rl_sport_head_no_map;
                                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (relativeLayout != null) {
                                                                                        i = R.id.sport_head_no_map;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.tv_label_humidity_no_gps;
                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView10 != null) {
                                                                                                i = R.id.tv_label_speed_no_gps;
                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView11 != null) {
                                                                                                    i = R.id.tv_label_temperature_no_gps;
                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView12 != null) {
                                                                                                        i = R.id.tv_lable_humidity;
                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView13 != null) {
                                                                                                            i = R.id.tv_lable_speed;
                                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textView14 != null) {
                                                                                                                i = R.id.tv_lable_temperature;
                                                                                                                TextView textView15 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textView15 != null) {
                                                                                                                    return new MovingUiIncludeSportDetailPersonalInfoBinding((ConstraintLayout) view, constraintLayout, constraintLayout2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, fastSlowGradientView, textView2, textView3, typefaceTextView, typefaceTextView2, textView4, textView5, viewFindChildViewById, textView6, textView7, textView8, relativeLayout, textView9, textView10, textView11, textView12, textView13, textView14, textView15);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static MovingUiIncludeSportDetailPersonalInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MovingUiIncludeSportDetailPersonalInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moving_ui_include_sport_detail_personal_info, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
