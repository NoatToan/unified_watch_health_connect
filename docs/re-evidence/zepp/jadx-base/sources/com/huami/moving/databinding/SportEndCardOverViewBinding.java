package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.moving.ui.view.FastSlowGradientView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class SportEndCardOverViewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView endCardViewAvatar;

    @NonNull
    public final View endCardViewBlowLine;

    @NonNull
    public final FastSlowGradientView endCardViewGradient;

    @NonNull
    public final RecyclerView endCardViewInfo;

    @NonNull
    public final TypefaceTextView endCardViewMainUnit;

    @NonNull
    public final TypefaceTextView endCardViewMainValue;

    @NonNull
    public final TypefaceTextView endCardViewNickName;

    @NonNull
    public final TextView endCardViewSportType;

    @NonNull
    public final TypefaceTextView endCardViewStartTime;

    private SportEndCardOverViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull FastSlowGradientView fastSlowGradientView, @NonNull RecyclerView recyclerView, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TypefaceTextView typefaceTextView3, @NonNull TextView textView, @NonNull TypefaceTextView typefaceTextView4) {
        this.a = constraintLayout;
        this.endCardViewAvatar = imageView;
        this.endCardViewBlowLine = view;
        this.endCardViewGradient = fastSlowGradientView;
        this.endCardViewInfo = recyclerView;
        this.endCardViewMainUnit = typefaceTextView;
        this.endCardViewMainValue = typefaceTextView2;
        this.endCardViewNickName = typefaceTextView3;
        this.endCardViewSportType = textView;
        this.endCardViewStartTime = typefaceTextView4;
    }

    @NonNull
    public static SportEndCardOverViewBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.end_card_view_avatar;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.end_card_view_blow_line))) != null) {
            i = R.id.end_card_view_gradient;
            FastSlowGradientView fastSlowGradientView = (FastSlowGradientView) ViewBindings.findChildViewById(view, i);
            if (fastSlowGradientView != null) {
                i = R.id.end_card_view_info;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.end_card_view_main_unit;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                    if (typefaceTextView != null) {
                        i = R.id.end_card_view_main_value;
                        TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                        if (typefaceTextView2 != null) {
                            i = R.id.end_card_view_nick_name;
                            TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView3 != null) {
                                i = R.id.end_card_view_sport_type;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.end_card_view_start_time;
                                    TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                    if (typefaceTextView4 != null) {
                                        return new SportEndCardOverViewBinding((ConstraintLayout) view, imageView, viewFindChildViewById, fastSlowGradientView, recyclerView, typefaceTextView, typefaceTextView2, typefaceTextView3, textView, typefaceTextView4);
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
    public static SportEndCardOverViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SportEndCardOverViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.sport_end_card_over_view, viewGroup, false);
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
