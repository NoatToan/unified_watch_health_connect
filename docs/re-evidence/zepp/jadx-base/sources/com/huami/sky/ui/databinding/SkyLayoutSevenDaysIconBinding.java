package com.huami.sky.ui.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.sky.ui.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class SkyLayoutSevenDaysIconBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final AppCompatImageView dayImage;

    @NonNull
    public final AppCompatTextView dayNum;

    private SkyLayoutSevenDaysIconBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatTextView appCompatTextView) {
        this.a = view;
        this.dayImage = appCompatImageView;
        this.dayNum = appCompatTextView;
    }

    @NonNull
    public static SkyLayoutSevenDaysIconBinding bind(@NonNull View view) {
        int i = R.id.day_image;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.day_num;
            AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(view, i);
            if (appCompatTextView != null) {
                return new SkyLayoutSevenDaysIconBinding(view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static SkyLayoutSevenDaysIconBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.sky_layout_seven_days_icon, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
