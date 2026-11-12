package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.moving.ui.view.FastSlowGradientView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class CardOverViewBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ImageView overViewAvatar;

    @NonNull
    public final RecyclerView overViewDataSource;

    @NonNull
    public final TextView overViewDataTitle;

    @NonNull
    public final View overViewDivide;

    @NonNull
    public final TextView overViewFast;

    @NonNull
    public final FastSlowGradientView overViewGradient;

    @NonNull
    public final RecyclerView overViewInfo;

    @NonNull
    public final ImageView overViewInfoMore;

    @NonNull
    public final TextView overViewMainUnit;

    @NonNull
    public final TypefaceTextView overViewMainValue;

    @NonNull
    public final TextView overViewNickname;

    @NonNull
    public final View overViewReplace;

    @NonNull
    public final TextView overViewSlow;

    @NonNull
    public final TextView overViewStartTime;

    @NonNull
    public final TextView overViewType;

    @NonNull
    public final TextView overViewWatermark;

    private CardOverViewBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2, @NonNull FastSlowGradientView fastSlowGradientView, @NonNull RecyclerView recyclerView2, @NonNull ImageView imageView2, @NonNull TextView textView3, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView4, @NonNull View view2, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8) {
        this.a = frameLayout;
        this.overViewAvatar = imageView;
        this.overViewDataSource = recyclerView;
        this.overViewDataTitle = textView;
        this.overViewDivide = view;
        this.overViewFast = textView2;
        this.overViewGradient = fastSlowGradientView;
        this.overViewInfo = recyclerView2;
        this.overViewInfoMore = imageView2;
        this.overViewMainUnit = textView3;
        this.overViewMainValue = typefaceTextView;
        this.overViewNickname = textView4;
        this.overViewReplace = view2;
        this.overViewSlow = textView5;
        this.overViewStartTime = textView6;
        this.overViewType = textView7;
        this.overViewWatermark = textView8;
    }

    @NonNull
    public static CardOverViewBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.over_view_avatar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.over_view_data_source;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.over_view_data_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.over_view_divide))) != null) {
                    i = R.id.over_view_fast;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.over_view_gradient;
                        FastSlowGradientView fastSlowGradientView = (FastSlowGradientView) ViewBindings.findChildViewById(view, i);
                        if (fastSlowGradientView != null) {
                            i = R.id.over_view_info;
                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView2 != null) {
                                i = R.id.over_view_info_more;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.over_view_main_unit;
                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView3 != null) {
                                        i = R.id.over_view_main_value;
                                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                        if (typefaceTextView != null) {
                                            i = R.id.over_view_nickname;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.over_view_replace))) != null) {
                                                i = R.id.over_view_slow;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = R.id.over_view_start_time;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        i = R.id.over_view_type;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView7 != null) {
                                                            i = R.id.over_view_watermark;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView8 != null) {
                                                                return new CardOverViewBinding((FrameLayout) view, imageView, recyclerView, textView, viewFindChildViewById, textView2, fastSlowGradientView, recyclerView2, imageView2, textView3, typefaceTextView, textView4, viewFindChildViewById2, textView5, textView6, textView7, textView8);
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
    public static CardOverViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CardOverViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.card_over_view, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
