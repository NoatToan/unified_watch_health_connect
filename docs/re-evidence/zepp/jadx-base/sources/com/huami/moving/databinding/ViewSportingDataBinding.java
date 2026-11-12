package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class ViewSportingDataBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final FrameLayout flDataContainer;

    @NonNull
    public final ImageView ivWarning;

    @NonNull
    public final TypefaceTextView tvData;

    @NonNull
    public final TypefaceTextView tvDesc;

    @NonNull
    public final TextView tvTips;

    private ViewSportingDataBinding(@NonNull View view, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TypefaceTextView typefaceTextView, @NonNull TypefaceTextView typefaceTextView2, @NonNull TextView textView) {
        this.a = view;
        this.flDataContainer = frameLayout;
        this.ivWarning = imageView;
        this.tvData = typefaceTextView;
        this.tvDesc = typefaceTextView2;
        this.tvTips = textView;
    }

    @NonNull
    public static ViewSportingDataBinding bind(@NonNull View view) {
        int i = R.id.fl_data_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.iv_warning;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tv_data;
                TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                if (typefaceTextView != null) {
                    i = R.id.tv_desc;
                    TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                    if (typefaceTextView2 != null) {
                        i = R.id.tv_tips;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new ViewSportingDataBinding(view, frameLayout, imageView, typefaceTextView, typefaceTextView2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewSportingDataBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.view_sporting_data, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
