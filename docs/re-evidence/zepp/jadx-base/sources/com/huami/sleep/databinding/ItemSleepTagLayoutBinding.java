package com.huami.sleep.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.huami.sleep.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes13.dex */
public final class ItemSleepTagLayoutBinding implements ViewBinding {

    @NonNull
    private final TextView a;

    @NonNull
    public final TextView titleTv;

    private ItemSleepTagLayoutBinding(@NonNull TextView rootView, @NonNull TextView titleTv) {
        this.a = rootView;
        this.titleTv = titleTv;
    }

    @NonNull
    public static ItemSleepTagLayoutBinding bind(@NonNull View rootView) {
        Objects.requireNonNull(rootView, "rootView");
        TextView textView = (TextView) rootView;
        return new ItemSleepTagLayoutBinding(textView, textView);
    }

    @NonNull
    public static ItemSleepTagLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSleepTagLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sleep_tag_layout, parent, false);
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
