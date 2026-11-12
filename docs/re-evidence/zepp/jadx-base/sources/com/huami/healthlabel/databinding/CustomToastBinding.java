package com.huami.healthlabel.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.healthlabel.R;

/* JADX INFO: loaded from: classes9.dex */
public final class CustomToastBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final TextView contentTxt;

    private CustomToastBinding(@NonNull FrameLayout rootView, @NonNull TextView contentTxt) {
        this.a = rootView;
        this.contentTxt = contentTxt;
    }

    @NonNull
    public static CustomToastBinding bind(@NonNull View rootView) {
        int i = R.id.content_txt;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            return new CustomToastBinding((FrameLayout) rootView, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static CustomToastBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static CustomToastBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.custom_toast, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
