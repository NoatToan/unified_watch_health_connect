package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.HMCircleImageView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class FamilyMemberItemBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView memberContent;

    @NonNull
    public final HMCircleImageView memberIcon;

    @NonNull
    public final TextView memberName;

    @NonNull
    public final ImageView memberRightArrow;

    private FamilyMemberItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull HMCircleImageView hMCircleImageView, @NonNull TextView textView2, @NonNull ImageView imageView) {
        this.a = relativeLayout;
        this.memberContent = textView;
        this.memberIcon = hMCircleImageView;
        this.memberName = textView2;
        this.memberRightArrow = imageView;
    }

    @NonNull
    public static FamilyMemberItemBinding bind(@NonNull View view) {
        int i = R.id.member_content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.member_icon;
            HMCircleImageView hMCircleImageView = (HMCircleImageView) ViewBindings.findChildViewById(view, i);
            if (hMCircleImageView != null) {
                i = R.id.member_name;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.member_right_arrow;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        return new FamilyMemberItemBinding((RelativeLayout) view, textView, hMCircleImageView, textView2, imageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FamilyMemberItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FamilyMemberItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.family_member_item, viewGroup, false);
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
