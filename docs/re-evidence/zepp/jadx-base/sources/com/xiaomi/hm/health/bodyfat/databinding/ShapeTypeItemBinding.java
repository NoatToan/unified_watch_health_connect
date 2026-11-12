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
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ShapeTypeItemBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final View bottomLine;

    @NonNull
    public final View rightLine;

    @NonNull
    public final RelativeLayout rl;

    @NonNull
    public final TextView shapeTv;

    @NonNull
    public final ImageView typeIcon;

    private ShapeTypeItemBinding(@NonNull RelativeLayout relativeLayout, @NonNull View view, @NonNull View view2, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.a = relativeLayout;
        this.bottomLine = view;
        this.rightLine = view2;
        this.rl = relativeLayout2;
        this.shapeTv = textView;
        this.typeIcon = imageView;
    }

    @NonNull
    public static ShapeTypeItemBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.bottom_line;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.right_line))) != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.shape_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.type_icon;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new ShapeTypeItemBinding(relativeLayout, viewFindChildViewById2, viewFindChildViewById, relativeLayout, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ShapeTypeItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ShapeTypeItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.shape_type_item, viewGroup, false);
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
