package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivitySettingLibraryBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView clickForHelp;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile miLaptopItem;

    @NonNull
    public final ListTile miliSettingOffWristLockLl;

    @NonNull
    public final ListTile takePic;

    private ActivitySettingLibraryBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3) {
        this.a = relativeLayout;
        this.clickForHelp = textView;
        this.container = frameLayout;
        this.miLaptopItem = listTile;
        this.miliSettingOffWristLockLl = listTile2;
        this.takePic = listTile3;
    }

    @NonNull
    public static ActivitySettingLibraryBinding bind(@NonNull View view) {
        int i = R.id.click_for_help;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.mi_laptop_item;
                ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile != null) {
                    i = R.id.mili_setting_off_wrist_lock_ll;
                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile2 != null) {
                        i = R.id.take_pic;
                        ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile3 != null) {
                            return new ActivitySettingLibraryBinding((RelativeLayout) view, textView, frameLayout, listTile, listTile2, listTile3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySettingLibraryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySettingLibraryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_setting_library, viewGroup, false);
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
