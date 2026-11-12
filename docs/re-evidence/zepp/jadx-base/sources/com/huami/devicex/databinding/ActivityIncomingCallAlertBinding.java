package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.widget.TipComponent;
import com.xiaomi.hm.health.ui.smartplay.appnotify.view.NotificationFaqView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityIncomingCallAlertBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final TipComponent callPermissionTips;

    @NonNull
    public final ListTile incomingCallDelay;

    @NonNull
    public final ListTile incomingCallDelayEnable;

    @NonNull
    public final ListTile incomingCallEnable;

    @NonNull
    public final ListTile itemSmsCallReply;

    @NonNull
    public final ListTile itemSmsCallReplyManagement;

    @NonNull
    public final ListTile showContactInfoAlert;

    @NonNull
    public final ListTile strangeNumberAlert;

    @NonNull
    public final NotificationFaqView tvNotificationFaq;

    @NonNull
    public final ListTile vibrateModeIv;

    private ActivityIncomingCallAlertBinding(@NonNull ScrollView scrollView, @NonNull TipComponent tipComponent, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull ListTile listTile5, @NonNull ListTile listTile6, @NonNull ListTile listTile7, @NonNull NotificationFaqView notificationFaqView, @NonNull ListTile listTile8) {
        this.a = scrollView;
        this.callPermissionTips = tipComponent;
        this.incomingCallDelay = listTile;
        this.incomingCallDelayEnable = listTile2;
        this.incomingCallEnable = listTile3;
        this.itemSmsCallReply = listTile4;
        this.itemSmsCallReplyManagement = listTile5;
        this.showContactInfoAlert = listTile6;
        this.strangeNumberAlert = listTile7;
        this.tvNotificationFaq = notificationFaqView;
        this.vibrateModeIv = listTile8;
    }

    @NonNull
    public static ActivityIncomingCallAlertBinding bind(@NonNull View view) {
        int i = R.id.call_permission_tips;
        TipComponent tipComponent = (TipComponent) ViewBindings.findChildViewById(view, i);
        if (tipComponent != null) {
            i = R.id.incoming_call_delay;
            ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile != null) {
                i = R.id.incoming_call_delay_enable;
                ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                if (listTile2 != null) {
                    i = R.id.incoming_call_enable;
                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile3 != null) {
                        i = R.id.item_sms_call_reply;
                        ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile4 != null) {
                            i = R.id.item_sms_call_reply_management;
                            ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile5 != null) {
                                i = R.id.show_contact_info_alert;
                                ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile6 != null) {
                                    i = R.id.strange_number_alert;
                                    ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile7 != null) {
                                        i = R.id.tv_notification_faq;
                                        NotificationFaqView notificationFaqView = (NotificationFaqView) ViewBindings.findChildViewById(view, i);
                                        if (notificationFaqView != null) {
                                            i = R.id.vibrate_mode_iv;
                                            ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(view, i);
                                            if (listTile8 != null) {
                                                return new ActivityIncomingCallAlertBinding((ScrollView) view, tipComponent, listTile, listTile2, listTile3, listTile4, listTile5, listTile6, listTile7, notificationFaqView, listTile8);
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
    public static ActivityIncomingCallAlertBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityIncomingCallAlertBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_incoming_call_alert, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.a;
    }
}
