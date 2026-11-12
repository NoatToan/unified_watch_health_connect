package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.module.homepage.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageToastBinding implements ViewBinding {

    @NonNull
    private final TextView a;

    @NonNull
    public final TextView homepageToastTv;

    private HomepageToastBinding(@NonNull TextView rootView, @NonNull TextView homepageToastTv) {
        this.a = rootView;
        this.homepageToastTv = homepageToastTv;
    }

    @NonNull
    public static HomepageToastBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        TextView textView = (TextView) rootView;
        return new HomepageToastBinding(textView, textView);
    }

    @NonNull
    public static HomepageToastBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageToastBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_toast, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public TextView getRoot() {
        return this.a;
    }
}
