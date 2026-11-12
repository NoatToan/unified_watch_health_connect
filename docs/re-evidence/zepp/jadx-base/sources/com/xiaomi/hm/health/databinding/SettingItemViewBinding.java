package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.Objects;

/* JADX INFO: loaded from: classes20.dex */
public final class SettingItemViewBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final View dividerView;

    @NonNull
    public final ImageView leftArrowIv;

    @NonNull
    public final View maskView;

    @NonNull
    public final TypefaceTextView subTitleTv;

    @NonNull
    public final TypefaceTextView titleTv;

    private SettingItemViewBinding(@NonNull View rootView, @NonNull View dividerView, @NonNull ImageView leftArrowIv, @NonNull View maskView, @NonNull TypefaceTextView subTitleTv, @NonNull TypefaceTextView titleTv) {
        this.a = rootView;
        this.dividerView = dividerView;
        this.leftArrowIv = leftArrowIv;
        this.maskView = maskView;
        this.subTitleTv = subTitleTv;
        this.titleTv = titleTv;
    }

    @NonNull
    public static SettingItemViewBinding bind(@NonNull View rootView) {
        int i = R.id.divider_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider_view);
        if (viewFindChildViewById != null) {
            i = R.id.left_arrow_iv;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.left_arrow_iv);
            if (imageView != null) {
                i = R.id.mask_view;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.mask_view);
                if (viewFindChildViewById2 != null) {
                    i = R.id.sub_title_tv;
                    TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.sub_title_tv);
                    if (typefaceTextView != null) {
                        i = R.id.title_tv;
                        TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.title_tv);
                        if (typefaceTextView2 != null) {
                            return new SettingItemViewBinding(rootView, viewFindChildViewById, imageView, viewFindChildViewById2, typefaceTextView, typefaceTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static SettingItemViewBinding inflate(@NonNull LayoutInflater inflater, @NonNull ViewGroup parent) {
        Objects.requireNonNull(parent, "parent");
        inflater.inflate(R.layout.setting_item_view, parent);
        return bind(parent);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
