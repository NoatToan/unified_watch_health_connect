package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SortListAppFooterBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView footerTips;

    @NonNull
    public final RelativeLayout invisibleItemArea;

    @NonNull
    public final View invisibleItemDivider;

    @NonNull
    public final AppCompatImageView invisibleItemImg;

    @NonNull
    public final View invisibleItemSpaceArea;

    private SortListAppFooterBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull View view2) {
        this.a = linearLayout;
        this.footerTips = textView;
        this.invisibleItemArea = relativeLayout;
        this.invisibleItemDivider = view;
        this.invisibleItemImg = appCompatImageView;
        this.invisibleItemSpaceArea = view2;
    }

    @NonNull
    public static SortListAppFooterBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.footer_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.invisible_item_area;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.invisible_item_divider))) != null) {
                i = R.id.invisible_item_img;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.invisible_item_space_area))) != null) {
                    return new SortListAppFooterBinding((LinearLayout) view, textView, relativeLayout, viewFindChildViewById, appCompatImageView, viewFindChildViewById2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SortListAppFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SortListAppFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.sort_list_app_footer, viewGroup, false);
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
