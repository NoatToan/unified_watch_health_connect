package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.watchfacesstore.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public final class WfHomeItemCoolSpecialHolderBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final View placeHolder;

    private WfHomeItemCoolSpecialHolderBinding(@NonNull View rootView, @NonNull View placeHolder) {
        this.a = rootView;
        this.placeHolder = placeHolder;
    }

    @NonNull
    public static WfHomeItemCoolSpecialHolderBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        return new WfHomeItemCoolSpecialHolderBinding(rootView, rootView);
    }

    @NonNull
    public static WfHomeItemCoolSpecialHolderBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }

    @NonNull
    public static WfHomeItemCoolSpecialHolderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_home_item_cool_special_holder, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }
}
