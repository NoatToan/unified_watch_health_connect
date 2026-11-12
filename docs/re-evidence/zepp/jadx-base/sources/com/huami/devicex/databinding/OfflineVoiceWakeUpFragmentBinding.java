package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes7.dex */
public final class OfflineVoiceWakeUpFragmentBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final ListTile deviceSettingResponseAfterBrightScreen;

    @NonNull
    public final ListTile deviceSettingResponseAfterTurningWrist;

    @NonNull
    public final ListTile deviceSettingResponseDuringBrightScreen;

    @NonNull
    public final View maskView;

    private OfflineVoiceWakeUpFragmentBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull FrameLayout frameLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull View view) {
        this.a = linearLayoutCompat;
        this.container = frameLayout;
        this.deviceSettingResponseAfterBrightScreen = listTile;
        this.deviceSettingResponseAfterTurningWrist = listTile2;
        this.deviceSettingResponseDuringBrightScreen = listTile3;
        this.maskView = view;
    }

    @NonNull
    public static OfflineVoiceWakeUpFragmentBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.device_setting_response_after_bright_screen;
            ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile != null) {
                i = R.id.device_setting_response_after_turning_wrist;
                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile2 != null) {
                    i = R.id.device_setting_response_during_bright_screen;
                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile3 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                        return new OfflineVoiceWakeUpFragmentBinding((LinearLayoutCompat) view, frameLayout, listTile, listTile2, listTile3, viewFindChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OfflineVoiceWakeUpFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OfflineVoiceWakeUpFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.offline_voice_wake_up_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.a;
    }
}
