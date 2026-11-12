package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.shapeable.ShapeableConstraintLayout;
import com.huami.sky.ui.R;

/* JADX INFO: loaded from: classes13.dex */
public final class DialogSkyCommonBinding implements ViewBinding {

    @NonNull
    private final ShapeableConstraintLayout a;

    @NonNull
    public final TextView content;

    @NonNull
    public final View divider;

    @NonNull
    public final AppCompatImageView headerImage;

    @NonNull
    public final TextView negativeButton;

    @NonNull
    public final TextView positiveButton;

    @NonNull
    public final TextView title;

    private DialogSkyCommonBinding(@NonNull ShapeableConstraintLayout shapeableConstraintLayout, @NonNull TextView textView, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.a = shapeableConstraintLayout;
        this.content = textView;
        this.divider = view;
        this.headerImage = appCompatImageView;
        this.negativeButton = textView2;
        this.positiveButton = textView3;
        this.title = textView4;
    }

    @NonNull
    public static DialogSkyCommonBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.content;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
            i = R.id.header_image;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.negative_button;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.positive_button;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.title;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView4 != null) {
                            return new DialogSkyCommonBinding((ShapeableConstraintLayout) view, textView, viewFindChildViewById, appCompatImageView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogSkyCommonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogSkyCommonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_sky_common, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ShapeableConstraintLayout getRoot() {
        return this.a;
    }
}
