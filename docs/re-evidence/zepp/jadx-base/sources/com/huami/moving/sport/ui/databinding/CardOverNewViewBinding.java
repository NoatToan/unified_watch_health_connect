package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;

/* JADX INFO: loaded from: classes11.dex */
public final class CardOverNewViewBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ConstraintLayout cardOverContainer;

    @NonNull
    public final MovingUiIncludeSportDetailPersonalInfoBinding includeUserInfo;

    @NonNull
    public final ImageView overViewAvatar;

    @NonNull
    public final RecyclerView overViewDataSource;

    @NonNull
    public final TextView overViewDataTitle;

    @NonNull
    public final View overViewDivide;

    @NonNull
    public final RecyclerView overViewInfo;

    @NonNull
    public final LinearLayout overViewInfoMore;

    private CardOverNewViewBinding(@NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull MovingUiIncludeSportDetailPersonalInfoBinding movingUiIncludeSportDetailPersonalInfoBinding, @NonNull ImageView imageView, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull View view, @NonNull RecyclerView recyclerView2, @NonNull LinearLayout linearLayout) {
        this.a = frameLayout;
        this.cardOverContainer = constraintLayout;
        this.includeUserInfo = movingUiIncludeSportDetailPersonalInfoBinding;
        this.overViewAvatar = imageView;
        this.overViewDataSource = recyclerView;
        this.overViewDataTitle = textView;
        this.overViewDivide = view;
        this.overViewInfo = recyclerView2;
        this.overViewInfoMore = linearLayout;
    }

    @NonNull
    public static CardOverNewViewBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.card_over_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_user_info))) != null) {
            MovingUiIncludeSportDetailPersonalInfoBinding movingUiIncludeSportDetailPersonalInfoBindingBind = MovingUiIncludeSportDetailPersonalInfoBinding.bind(viewFindChildViewById);
            i = R.id.over_view_avatar;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.over_view_data_source;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.over_view_data_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.over_view_divide))) != null) {
                        i = R.id.over_view_info;
                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                        if (recyclerView2 != null) {
                            i = R.id.over_view_info_more;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                return new CardOverNewViewBinding((FrameLayout) view, constraintLayout, movingUiIncludeSportDetailPersonalInfoBindingBind, imageView, recyclerView, textView, viewFindChildViewById2, recyclerView2, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static CardOverNewViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CardOverNewViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.card_over_new_view, viewGroup, false);
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
