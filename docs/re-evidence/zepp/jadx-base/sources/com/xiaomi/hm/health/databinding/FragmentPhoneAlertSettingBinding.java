package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.widget.TipComponent;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting.PhoneAlertSettingItemView;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentPhoneAlertSettingBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final PhoneAlertSettingItemView btPhoneItv;

    @NonNull
    public final FrameLayout btPhoneSettingLayout;

    @NonNull
    public final PhoneAlertSettingItemView closeItv;

    @NonNull
    public final ListTile contactItv;

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final TipComponent permissionTips;

    @NonNull
    public final PhoneAlertSettingItemView phoneAlertItv;

    @NonNull
    public final FrameLayout phoneAlertSettingLayout;

    @NonNull
    public final CardView phoneCallSmsReplyContainer;

    @NonNull
    public final RainbowTitleBar titleBar;

    @NonNull
    public final TextView watchSettingTitle;

    private FragmentPhoneAlertSettingBinding(@NonNull ScrollView rootView, @NonNull PhoneAlertSettingItemView btPhoneItv, @NonNull FrameLayout btPhoneSettingLayout, @NonNull PhoneAlertSettingItemView closeItv, @NonNull ListTile contactItv, @NonNull FrameLayout container, @NonNull TipComponent permissionTips, @NonNull PhoneAlertSettingItemView phoneAlertItv, @NonNull FrameLayout phoneAlertSettingLayout, @NonNull CardView phoneCallSmsReplyContainer, @NonNull RainbowTitleBar titleBar, @NonNull TextView watchSettingTitle) {
        this.a = rootView;
        this.btPhoneItv = btPhoneItv;
        this.btPhoneSettingLayout = btPhoneSettingLayout;
        this.closeItv = closeItv;
        this.contactItv = contactItv;
        this.container = container;
        this.permissionTips = permissionTips;
        this.phoneAlertItv = phoneAlertItv;
        this.phoneAlertSettingLayout = phoneAlertSettingLayout;
        this.phoneCallSmsReplyContainer = phoneCallSmsReplyContainer;
        this.titleBar = titleBar;
        this.watchSettingTitle = watchSettingTitle;
    }

    @NonNull
    public static FragmentPhoneAlertSettingBinding bind(@NonNull View rootView) {
        int i = R.id.bt_phone_itv;
        PhoneAlertSettingItemView phoneAlertSettingItemView = (PhoneAlertSettingItemView) ViewBindings.findChildViewById(rootView, R.id.bt_phone_itv);
        if (phoneAlertSettingItemView != null) {
            i = R.id.bt_phone_setting_layout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.bt_phone_setting_layout);
            if (frameLayout != null) {
                i = R.id.close_itv;
                PhoneAlertSettingItemView phoneAlertSettingItemView2 = (PhoneAlertSettingItemView) ViewBindings.findChildViewById(rootView, R.id.close_itv);
                if (phoneAlertSettingItemView2 != null) {
                    i = R.id.contact_itv;
                    ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.contact_itv);
                    if (listTile != null) {
                        i = R.id.container;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.container);
                        if (frameLayout2 != null) {
                            i = R.id.permission_tips;
                            TipComponent tipComponent = (TipComponent) ViewBindings.findChildViewById(rootView, R.id.permission_tips);
                            if (tipComponent != null) {
                                i = R.id.phone_alert_itv;
                                PhoneAlertSettingItemView phoneAlertSettingItemView3 = (PhoneAlertSettingItemView) ViewBindings.findChildViewById(rootView, R.id.phone_alert_itv);
                                if (phoneAlertSettingItemView3 != null) {
                                    i = R.id.phone_alert_setting_layout;
                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.phone_alert_setting_layout);
                                    if (frameLayout3 != null) {
                                        i = R.id.phone_call_sms_reply_container;
                                        CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.phone_call_sms_reply_container);
                                        if (cardView != null) {
                                            i = R.id.title_bar;
                                            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, R.id.title_bar);
                                            if (rainbowTitleBar != null) {
                                                i = R.id.watch_setting_title;
                                                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.watch_setting_title);
                                                if (textView != null) {
                                                    return new FragmentPhoneAlertSettingBinding((ScrollView) rootView, phoneAlertSettingItemView, frameLayout, phoneAlertSettingItemView2, listTile, frameLayout2, tipComponent, phoneAlertSettingItemView3, frameLayout3, cardView, rainbowTitleBar, textView);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPhoneAlertSettingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPhoneAlertSettingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_phone_alert_setting, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.a;
    }
}
