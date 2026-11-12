package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sleep.R;

/* JADX INFO: loaded from: classes13.dex */
public final class SlpActivityDataSourceSelectLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView earbudIcon;

    @NonNull
    public final ImageView miliIcon;

    @NonNull
    public final TextView sourceEarbud;

    @NonNull
    public final TextView sourceMili;

    private SlpActivityDataSourceSelectLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView earbudIcon, @NonNull ImageView miliIcon, @NonNull TextView sourceEarbud, @NonNull TextView sourceMili) {
        this.a = rootView;
        this.earbudIcon = earbudIcon;
        this.miliIcon = miliIcon;
        this.sourceEarbud = sourceEarbud;
        this.sourceMili = sourceMili;
    }

    @NonNull
    public static SlpActivityDataSourceSelectLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.earbudIcon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
        if (imageView != null) {
            i = R.id.miliIcon;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView2 != null) {
                i = R.id.sourceEarbud;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                if (textView != null) {
                    i = R.id.sourceMili;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView2 != null) {
                        return new SlpActivityDataSourceSelectLayoutBinding((ConstraintLayout) rootView, imageView, imageView2, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static SlpActivityDataSourceSelectLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static SlpActivityDataSourceSelectLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.slp_activity_data_source_select_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
