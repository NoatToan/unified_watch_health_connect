package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ScaleUnitInstrcutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final View dividerBelowKg;

    @NonNull
    public final View dividerBelowYb;

    @NonNull
    public final View dividerTitle;

    @NonNull
    public final RelativeLayout page3Layout;

    @NonNull
    public final TextView unitTitle;

    @NonNull
    public final TextView unitTvJin;

    @NonNull
    public final TextView unitTvKg;

    @NonNull
    public final TextView unitTvYb;

    private ScaleUnitInstrcutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull View view2, @NonNull View view3, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.a = constraintLayout;
        this.dividerBelowKg = view;
        this.dividerBelowYb = view2;
        this.dividerTitle = view3;
        this.page3Layout = relativeLayout;
        this.unitTitle = textView;
        this.unitTvJin = textView2;
        this.unitTvKg = textView3;
        this.unitTvYb = textView4;
    }

    @NonNull
    public static ScaleUnitInstrcutBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.divider_below_kg;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider_below_yb))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.divider_title))) != null) {
            i = R.id.page_3_layout;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.unit_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.unit_tv_jin;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.unit_tv_kg;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.unit_tv_yb;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new ScaleUnitInstrcutBinding((ConstraintLayout) view, viewFindChildViewById3, viewFindChildViewById, viewFindChildViewById2, relativeLayout, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ScaleUnitInstrcutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ScaleUnitInstrcutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.scale_unit_instrcut, viewGroup, false);
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
