package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutCervicalRulerBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView angle0;

    @NonNull
    public final TextView angle15;

    @NonNull
    public final TextView angle30;

    @NonNull
    public final TextView angle45;

    @NonNull
    public final TextView angle60;

    @NonNull
    public final View cervicalCursor;

    @NonNull
    public final View rulerCommon;

    @NonNull
    public final View rulerLarger;

    @NonNull
    public final View rulerNormal;

    @NonNull
    public final View rulerTooBig;

    private LayoutCervicalRulerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull View view4, @NonNull View view5) {
        this.a = constraintLayout;
        this.angle0 = textView;
        this.angle15 = textView2;
        this.angle30 = textView3;
        this.angle45 = textView4;
        this.angle60 = textView5;
        this.cervicalCursor = view;
        this.rulerCommon = view2;
        this.rulerLarger = view3;
        this.rulerNormal = view4;
        this.rulerTooBig = view5;
    }

    @NonNull
    public static LayoutCervicalRulerBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        int i = R.id.angle_0;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.angle_15;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.angle_30;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.angle_45;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.angle_60;
                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView5 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.cervical_cursor))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.ruler_common))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.ruler_larger))) != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(view, (i = R.id.ruler_normal))) != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(view, (i = R.id.ruler_too_big))) != null) {
                            return new LayoutCervicalRulerBinding((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, viewFindChildViewById4, viewFindChildViewById5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutCervicalRulerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutCervicalRulerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_cervical_ruler, viewGroup, false);
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
