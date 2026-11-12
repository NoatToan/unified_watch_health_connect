package com.huami.moving.sport.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.sport.ui.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes11.dex */
public final class ItemNewOverViewBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TypefaceTextView overViewItemContent;

    @NonNull
    public final TextView overViewItemDesc;

    private ItemNewOverViewBinding(@NonNull LinearLayout linearLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull TextView textView) {
        this.a = linearLayout;
        this.overViewItemContent = typefaceTextView;
        this.overViewItemDesc = textView;
    }

    @NonNull
    public static ItemNewOverViewBinding bind(@NonNull View view) {
        int i = R.id.over_view_item_content;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            i = R.id.over_view_item_desc;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new ItemNewOverViewBinding((LinearLayout) view, typefaceTextView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemNewOverViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemNewOverViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_new_over_view, viewGroup, false);
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
