package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityParamsShapeBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TypefaceTextView cannotAnalyzeTv;

    @NonNull
    public final RelativeLayout containLayout;

    @NonNull
    public final TextView enRadioTv;

    @NonNull
    public final GridView gridview;

    @NonNull
    public final RelativeLayout hasShapeLl;

    @NonNull
    public final RelativeLayout leftLineRl;

    @NonNull
    public final RelativeLayout noShapeLl;

    @NonNull
    public final TextView reasonTv;

    @NonNull
    public final ImageView shapeIv;

    @NonNull
    public final RelativeLayout shapeRl;

    @NonNull
    public final TextView shapeTypeTv;

    @NonNull
    public final RelativeLayout upLayout;

    @NonNull
    public final TextView zhRadioTv;

    private ActivityParamsShapeBinding(@NonNull RelativeLayout relativeLayout, @NonNull TypefaceTextView typefaceTextView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView, @NonNull GridView gridView, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout6, @NonNull TextView textView3, @NonNull RelativeLayout relativeLayout7, @NonNull TextView textView4) {
        this.a = relativeLayout;
        this.cannotAnalyzeTv = typefaceTextView;
        this.containLayout = relativeLayout2;
        this.enRadioTv = textView;
        this.gridview = gridView;
        this.hasShapeLl = relativeLayout3;
        this.leftLineRl = relativeLayout4;
        this.noShapeLl = relativeLayout5;
        this.reasonTv = textView2;
        this.shapeIv = imageView;
        this.shapeRl = relativeLayout6;
        this.shapeTypeTv = textView3;
        this.upLayout = relativeLayout7;
        this.zhRadioTv = textView4;
    }

    @NonNull
    public static ActivityParamsShapeBinding bind(@NonNull View view) {
        int i = R.id.cannot_analyze_tv;
        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
        if (typefaceTextView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.en_radio_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.gridview;
                GridView gridView = (GridView) ViewBindings.findChildViewById(view, i);
                if (gridView != null) {
                    i = R.id.has_shape_ll;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null) {
                        i = R.id.left_line_rl;
                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout3 != null) {
                            i = R.id.no_shape_ll;
                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout4 != null) {
                                i = R.id.reason_tv;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView2 != null) {
                                    i = R.id.shape_iv;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = R.id.shape_rl;
                                        RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout5 != null) {
                                            i = R.id.shape_type_tv;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = R.id.up_layout;
                                                RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout6 != null) {
                                                    i = R.id.zh_radio_tv;
                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView4 != null) {
                                                        return new ActivityParamsShapeBinding(relativeLayout, typefaceTextView, relativeLayout, textView, gridView, relativeLayout2, relativeLayout3, relativeLayout4, textView2, imageView, relativeLayout5, textView3, relativeLayout6, textView4);
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static ActivityParamsShapeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityParamsShapeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_params_shape, viewGroup, false);
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
