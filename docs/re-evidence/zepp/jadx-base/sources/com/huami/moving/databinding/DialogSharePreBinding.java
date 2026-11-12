package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class DialogSharePreBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView cancelTv;

    @NonNull
    public final Guideline centerGu;

    @NonNull
    public final Guideline endGu;

    @NonNull
    public final View line;

    @NonNull
    public final ImageView runShareLongCam;

    @NonNull
    public final ImageView runShareLongImg;

    @NonNull
    public final Guideline startGu;

    @NonNull
    public final TextView title;

    private DialogSharePreBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull Guideline guideline2, @NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull Guideline guideline3, @NonNull TextView textView2) {
        this.a = constraintLayout;
        this.cancelTv = textView;
        this.centerGu = guideline;
        this.endGu = guideline2;
        this.line = view;
        this.runShareLongCam = imageView;
        this.runShareLongImg = imageView2;
        this.startGu = guideline3;
        this.title = textView2;
    }

    @NonNull
    public static DialogSharePreBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.cancel_tv;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.center_gu;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.end_gu;
                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                if (guideline2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line))) != null) {
                    i = R.id.run_share_long_cam;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.run_share_long_img;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.start_gu;
                            Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline3 != null) {
                                i = R.id.title;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    return new DialogSharePreBinding((ConstraintLayout) view, textView, guideline, guideline2, viewFindChildViewById, imageView, imageView2, guideline3, textView2);
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
    public static DialogSharePreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogSharePreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_share_pre, viewGroup, false);
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
