package com.huami.member_card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.member_card.R;

/* JADX INFO: loaded from: classes11.dex */
public final class MembershipCardBgColorBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final View membershipCardColor;

    @NonNull
    public final View membershipColorCheckedBorder;

    @NonNull
    public final ImageView membershipColorCheckedIcon;

    private MembershipCardBgColorBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull View view2, @NonNull ImageView imageView) {
        this.a = frameLayout;
        this.membershipCardColor = view;
        this.membershipColorCheckedBorder = view2;
        this.membershipColorCheckedIcon = imageView;
    }

    @NonNull
    public static MembershipCardBgColorBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.membership_card_color;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.membership_color_checked_border))) != null) {
            i = R.id.membership_color_checked_icon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new MembershipCardBgColorBinding((FrameLayout) view, viewFindChildViewById2, viewFindChildViewById, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static MembershipCardBgColorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MembershipCardBgColorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.membership_card_bg_color, viewGroup, false);
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
