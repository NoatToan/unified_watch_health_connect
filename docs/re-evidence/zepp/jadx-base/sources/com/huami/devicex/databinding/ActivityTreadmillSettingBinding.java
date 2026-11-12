package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.scroll.HMScrollView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityTreadmillSettingBinding implements ViewBinding {

    @NonNull
    private final HMScrollView a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile itemCheckUpgrade;

    @NonNull
    public final ListTile itemClearData;

    @NonNull
    public final ListTile itemFaq;

    @NonNull
    public final ListTile itemFwVersion;

    @NonNull
    public final LinearLayout itemLayout;

    @NonNull
    public final ListTile itemMacAddress;

    @NonNull
    public final ListTile itemMaintain;

    @NonNull
    public final ListTile itemMusicEqualizer;

    @NonNull
    public final ListTile itemNoLoadTest;

    @NonNull
    public final Button treadmillSettingUnbind;

    private ActivityTreadmillSettingBinding(@NonNull HMScrollView hMScrollView, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull LinearLayout linearLayout, @NonNull ListTile listTile5, @NonNull ListTile listTile6, @NonNull ListTile listTile7, @NonNull ListTile listTile8, @NonNull Button button) {
        this.a = hMScrollView;
        this.container = frameLayout;
        this.itemCheckUpgrade = listTile;
        this.itemClearData = listTile2;
        this.itemFaq = listTile3;
        this.itemFwVersion = listTile4;
        this.itemLayout = linearLayout;
        this.itemMacAddress = listTile5;
        this.itemMaintain = listTile6;
        this.itemMusicEqualizer = listTile7;
        this.itemNoLoadTest = listTile8;
        this.treadmillSettingUnbind = button;
    }

    @NonNull
    public static ActivityTreadmillSettingBinding bind(@NonNull View view) {
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.item_check_upgrade;
            ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile != null) {
                i = R.id.item_clear_data;
                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile2 != null) {
                    i = R.id.item_faq;
                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile3 != null) {
                        i = R.id.item_fw_version;
                        ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile4 != null) {
                            i = R.id.item_layout;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.item_mac_address;
                                ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile5 != null) {
                                    i = R.id.item_maintain;
                                    ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile6 != null) {
                                        i = R.id.item_music_equalizer;
                                        ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(view, i);
                                        if (listTile7 != null) {
                                            i = R.id.item_no_load_test;
                                            ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(view, i);
                                            if (listTile8 != null) {
                                                i = R.id.treadmill_setting_unbind;
                                                Button button = (Button) ViewBindings.findChildViewById(view, i);
                                                if (button != null) {
                                                    return new ActivityTreadmillSettingBinding((HMScrollView) view, frameLayout, listTile, listTile2, listTile3, listTile4, linearLayout, listTile5, listTile6, listTile7, listTile8, button);
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
    public static ActivityTreadmillSettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityTreadmillSettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_treadmill_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public HMScrollView getRoot() {
        return this.a;
    }
}
