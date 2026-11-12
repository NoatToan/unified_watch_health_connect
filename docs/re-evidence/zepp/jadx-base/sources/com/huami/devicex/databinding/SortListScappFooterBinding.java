package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class SortListScappFooterBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView footerTips;

    @NonNull
    public final RelativeLayout invisibleItemArea;

    @NonNull
    public final View invisibleItemDivider;

    @NonNull
    public final ImageView invisibleItemImg;

    private SortListScappFooterBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull ImageView imageView) {
        this.a = linearLayout;
        this.footerTips = textView;
        this.invisibleItemArea = relativeLayout;
        this.invisibleItemDivider = view;
        this.invisibleItemImg = imageView;
    }

    @NonNull
    public static SortListScappFooterBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.footer_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.invisible_item_area;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.invisible_item_divider))) != null) {
                i = R.id.invisible_item_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new SortListScappFooterBinding((LinearLayout) view, textView, relativeLayout, viewFindChildViewById, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SortListScappFooterBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SortListScappFooterBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.sort_list_scapp_footer, viewGroup, false);
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
