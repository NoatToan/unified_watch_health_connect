package com.huami.moving.databinding;

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
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.amap.api.maps.MapView;
import com.huami.moving.R;
import com.huami.moving.ui.view.LinearGradientView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class ActivityShareSportDetailMapGaodeBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView back;

    @NonNull
    public final ConstraintLayout containerView;

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final Guideline guideline1;

    @NonNull
    public final ImageView imageIcon;

    @NonNull
    public final ImageView imagePlay;

    @NonNull
    public final ImageView ivWaterMark;

    @NonNull
    public final ImageView lableImage2;

    @NonNull
    public final TextView lableSpeed;

    @NonNull
    public final LinearLayout linearMessage;

    @NonNull
    public final MapView map;

    @NonNull
    public final LinearGradientView mapBottom;

    @NonNull
    public final ImageView mapImage;

    @NonNull
    public final LinearGradientView mapTop;

    @NonNull
    public final TypefaceTextView runCalories;

    @NonNull
    public final TypefaceTextView runDistance;

    @NonNull
    public final TypefaceTextView runTime;

    @NonNull
    public final RelativeLayout shareLinear;

    @NonNull
    public final TypefaceTextView shareStartTime;

    @NonNull
    public final TextView trackTime;

    @NonNull
    public final TextView tvTrackVideoSave;

    @NonNull
    public final TextView tvTrackVideoShare;

    @NonNull
    public final ImageView userAvatar;

    @NonNull
    public final TextView userName;

    private ActivityShareSportDetailMapGaodeBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull ImageView imageView4, @NonNull ImageView imageView5, @NonNull TextView textView, @NonNull LinearLayout linearLayout, @NonNull MapView mapView, @NonNull LinearGradientView linearGradientView, @NonNull ImageView imageView6, @NonNull LinearGradientView linearGradientView2, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TypefaceTextView typefaceTextView3, @NonNull RelativeLayout relativeLayout, @NonNull TypefaceTextView typefaceTextView4, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ImageView imageView7, @NonNull TextView textView5) {
        this.a = constraintLayout;
        this.back = imageView;
        this.containerView = constraintLayout2;
        this.guideline = guideline;
        this.guideline1 = guideline2;
        this.imageIcon = imageView2;
        this.imagePlay = imageView3;
        this.ivWaterMark = imageView4;
        this.lableImage2 = imageView5;
        this.lableSpeed = textView;
        this.linearMessage = linearLayout;
        this.map = mapView;
        this.mapBottom = linearGradientView;
        this.mapImage = imageView6;
        this.mapTop = linearGradientView2;
        this.runCalories = typefaceTextView;
        this.runDistance = typefaceTextView2;
        this.runTime = typefaceTextView3;
        this.shareLinear = relativeLayout;
        this.shareStartTime = typefaceTextView4;
        this.trackTime = textView2;
        this.tvTrackVideoSave = textView3;
        this.tvTrackVideoShare = textView4;
        this.userAvatar = imageView7;
        this.userName = textView5;
    }

    @NonNull
    public static ActivityShareSportDetailMapGaodeBinding bind(@NonNull View view) {
        int i = R.id.back;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.guideline;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.guideline1;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline2 != null) {
                    i = R.id.image_icon;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.image_play;
                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView3 != null) {
                            i = R.id.iv_water_mark;
                            ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView4 != null) {
                                i = R.id.lable_image_2;
                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView5 != null) {
                                    i = R.id.lable_speed;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = R.id.linear_message;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R.id.map;
                                            MapView mapView = (MapView) ViewBindings.findChildViewById(view, i);
                                            if (mapView != null) {
                                                i = R.id.map_bottom;
                                                LinearGradientView linearGradientView = (LinearGradientView) ViewBindings.findChildViewById(view, i);
                                                if (linearGradientView != null) {
                                                    i = R.id.map_image;
                                                    ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView6 != null) {
                                                        i = R.id.map_top;
                                                        LinearGradientView linearGradientView2 = (LinearGradientView) ViewBindings.findChildViewById(view, i);
                                                        if (linearGradientView2 != null) {
                                                            i = R.id.run_calories;
                                                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                            if (typefaceTextView != null) {
                                                                i = R.id.run_distance;
                                                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                if (typefaceTextView2 != null) {
                                                                    i = R.id.run_time;
                                                                    TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (typefaceTextView3 != null) {
                                                                        i = R.id.share_linear;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (relativeLayout != null) {
                                                                            i = R.id.share_start_time;
                                                                            TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (typefaceTextView4 != null) {
                                                                                i = R.id.track_time;
                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                if (textView2 != null) {
                                                                                    i = R.id.tv_track_video_save;
                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView3 != null) {
                                                                                        i = R.id.tv_track_video_share;
                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView4 != null) {
                                                                                            i = R.id.user_avatar;
                                                                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                            if (imageView7 != null) {
                                                                                                i = R.id.user_name;
                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView5 != null) {
                                                                                                    return new ActivityShareSportDetailMapGaodeBinding(constraintLayout, imageView, constraintLayout, guideline, guideline2, imageView2, imageView3, imageView4, imageView5, textView, linearLayout, mapView, linearGradientView, imageView6, linearGradientView2, typefaceTextView, typefaceTextView2, typefaceTextView3, relativeLayout, typefaceTextView4, textView2, textView3, textView4, imageView7, textView5);
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
    public static ActivityShareSportDetailMapGaodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityShareSportDetailMapGaodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_share_sport_detail_map_gaode, viewGroup, false);
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
