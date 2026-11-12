package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class MovingUiSportDetailCommonDiagramViewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout bodyStatusBottom;

    @NonNull
    public final TextView movingUiBottomStatusIcon1;

    @NonNull
    public final TextView movingUiBottomStatusIcon2;

    @NonNull
    public final TextView movingUiBottomStatusIcon3;

    @NonNull
    public final TextView movingUiBottomStatusIcon4;

    @NonNull
    public final TextView movingUiBottomStatusLabel1;

    @NonNull
    public final TextView movingUiBottomStatusLabel2;

    @NonNull
    public final TextView movingUiBottomStatusLabel3;

    @NonNull
    public final TextView movingUiBottomStatusLabel4;

    @NonNull
    public final ImageView movingUiDiagramChartIcon;

    @NonNull
    public final RelativeLayout movingUiDiagramContainer;

    @NonNull
    public final LinearLayout movingUiDiagramFirstSubLayout;

    @NonNull
    public final LinearLayout movingUiDiagramLabelsLayout;

    @NonNull
    public final LinearLayout movingUiDiagramSecondSubLayout;

    @NonNull
    public final LinearLayoutCompat movingUiDiagramSub3;

    @NonNull
    public final LinearLayoutCompat movingUiDiagramSub4;

    @NonNull
    public final TypefaceTextView movingUiDiagramSubtitle1;

    @NonNull
    public final TypefaceTextView movingUiDiagramSubtitle2;

    @NonNull
    public final TypefaceTextView movingUiDiagramSubtitle3;

    @NonNull
    public final TypefaceTextView movingUiDiagramSubtitle4;

    @NonNull
    public final TextView movingUiDiagramSubtitleName1;

    @NonNull
    public final TextView movingUiDiagramSubtitleName2;

    @NonNull
    public final TextView movingUiDiagramSubtitleName3;

    @NonNull
    public final TextView movingUiDiagramSubtitleName4;

    @NonNull
    public final View movingUiDiagramSubtitleSplit3;

    @NonNull
    public final TextView movingUiDiagramTitle;

    @NonNull
    public final RelativeLayout movingUiDiagramTitleLayout;

    @NonNull
    public final TextView movingUiDiagramUnit;

    private MovingUiSportDetailCommonDiagramViewBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull LinearLayout linearLayout3, @NonNull LinearLayout linearLayout4, @NonNull LinearLayout linearLayout5, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayoutCompat linearLayoutCompat2, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TypefaceTextView typefaceTextView3, @NonNull TypefaceTextView typefaceTextView4, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull TextView textView12, @NonNull View view, @NonNull TextView textView13, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView14) {
        this.a = linearLayout;
        this.bodyStatusBottom = linearLayout2;
        this.movingUiBottomStatusIcon1 = textView;
        this.movingUiBottomStatusIcon2 = textView2;
        this.movingUiBottomStatusIcon3 = textView3;
        this.movingUiBottomStatusIcon4 = textView4;
        this.movingUiBottomStatusLabel1 = textView5;
        this.movingUiBottomStatusLabel2 = textView6;
        this.movingUiBottomStatusLabel3 = textView7;
        this.movingUiBottomStatusLabel4 = textView8;
        this.movingUiDiagramChartIcon = imageView;
        this.movingUiDiagramContainer = relativeLayout;
        this.movingUiDiagramFirstSubLayout = linearLayout3;
        this.movingUiDiagramLabelsLayout = linearLayout4;
        this.movingUiDiagramSecondSubLayout = linearLayout5;
        this.movingUiDiagramSub3 = linearLayoutCompat;
        this.movingUiDiagramSub4 = linearLayoutCompat2;
        this.movingUiDiagramSubtitle1 = typefaceTextView;
        this.movingUiDiagramSubtitle2 = typefaceTextView2;
        this.movingUiDiagramSubtitle3 = typefaceTextView3;
        this.movingUiDiagramSubtitle4 = typefaceTextView4;
        this.movingUiDiagramSubtitleName1 = textView9;
        this.movingUiDiagramSubtitleName2 = textView10;
        this.movingUiDiagramSubtitleName3 = textView11;
        this.movingUiDiagramSubtitleName4 = textView12;
        this.movingUiDiagramSubtitleSplit3 = view;
        this.movingUiDiagramTitle = textView13;
        this.movingUiDiagramTitleLayout = relativeLayout2;
        this.movingUiDiagramUnit = textView14;
    }

    @NonNull
    public static MovingUiSportDetailCommonDiagramViewBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.body_status_bottom;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.moving_ui_bottom_status_icon_1;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.moving_ui_bottom_status_icon_2;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.moving_ui_bottom_status_icon_3;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.moving_ui_bottom_status_icon_4;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            i = R.id.moving_ui_bottom_status_label_1;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView5 != null) {
                                i = R.id.moving_ui_bottom_status_label_2;
                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView6 != null) {
                                    i = R.id.moving_ui_bottom_status_label_3;
                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView7 != null) {
                                        i = R.id.moving_ui_bottom_status_label_4;
                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView8 != null) {
                                            i = R.id.moving_ui_diagram_chart_icon;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView != null) {
                                                i = R.id.moving_ui_diagram_container;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout != null) {
                                                    i = R.id.moving_ui_diagram_first_sub_layout;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.moving_ui_diagram_labels_layout;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.moving_ui_diagram_second_sub_layout;
                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout4 != null) {
                                                                i = R.id.moving_ui_diagram_sub3;
                                                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                if (linearLayoutCompat != null) {
                                                                    i = R.id.moving_ui_diagram_sub4;
                                                                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                                    if (linearLayoutCompat2 != null) {
                                                                        i = R.id.moving_ui_diagram_subtitle1;
                                                                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (typefaceTextView != null) {
                                                                            i = R.id.moving_ui_diagram_subtitle2;
                                                                            TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (typefaceTextView2 != null) {
                                                                                i = R.id.moving_ui_diagram_subtitle3;
                                                                                TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (typefaceTextView3 != null) {
                                                                                    i = R.id.moving_ui_diagram_subtitle4;
                                                                                    TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (typefaceTextView4 != null) {
                                                                                        i = R.id.moving_ui_diagram_subtitle_name1;
                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView9 != null) {
                                                                                            i = R.id.moving_ui_diagram_subtitle_name2;
                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView10 != null) {
                                                                                                i = R.id.moving_ui_diagram_subtitle_name3;
                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (textView11 != null) {
                                                                                                    i = R.id.moving_ui_diagram_subtitle_name4;
                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textView12 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.moving_ui_diagram_subtitle_split_3))) != null) {
                                                                                                        i = R.id.moving_ui_diagram_title;
                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (textView13 != null) {
                                                                                                            i = R.id.moving_ui_diagram_title_layout;
                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                                                                            if (relativeLayout2 != null) {
                                                                                                                i = R.id.moving_ui_diagram_unit;
                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textView14 != null) {
                                                                                                                    return new MovingUiSportDetailCommonDiagramViewBinding((LinearLayout) view, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, imageView, relativeLayout, linearLayout2, linearLayout3, linearLayout4, linearLayoutCompat, linearLayoutCompat2, typefaceTextView, typefaceTextView2, typefaceTextView3, typefaceTextView4, textView9, textView10, textView11, textView12, viewFindChildViewById, textView13, relativeLayout2, textView14);
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
    public static MovingUiSportDetailCommonDiagramViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MovingUiSportDetailCommonDiagramViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.moving_ui_sport_detail_common_diagram_view, viewGroup, false);
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
