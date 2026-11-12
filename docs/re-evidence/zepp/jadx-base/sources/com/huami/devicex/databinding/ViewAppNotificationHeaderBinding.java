package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.xiaomi.hm.health.ui.smartplay.appnotify.view.NotificationFaqView;

/* JADX INFO: loaded from: classes7.dex */
public final class ViewAppNotificationHeaderBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ListTile awakeSwitch;

    @NonNull
    public final ListTile itemReplyManagement;

    @NonNull
    public final LinearLayout layoutHeader;

    @NonNull
    public final ListTile notificationEnable;

    @NonNull
    public final TextView tvDescNotification;

    @NonNull
    public final NotificationFaqView tvNotificationFaq;

    private ViewAppNotificationHeaderBinding(@NonNull RelativeLayout relativeLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull LinearLayout linearLayout, @NonNull ListTile listTile3, @NonNull TextView textView, @NonNull NotificationFaqView notificationFaqView) {
        this.a = relativeLayout;
        this.awakeSwitch = listTile;
        this.itemReplyManagement = listTile2;
        this.layoutHeader = linearLayout;
        this.notificationEnable = listTile3;
        this.tvDescNotification = textView;
        this.tvNotificationFaq = notificationFaqView;
    }

    @NonNull
    public static ViewAppNotificationHeaderBinding bind(@NonNull View view) {
        int i = R.id.awake_switch;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.item_reply_management;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile2 != null) {
                i = R.id.layout_header;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.notification_enable;
                    ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                    if (listTile3 != null) {
                        i = R.id.tv_desc_notification;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.tv_notification_faq;
                            NotificationFaqView notificationFaqView = (NotificationFaqView) ViewBindings.findChildViewById(view, i);
                            if (notificationFaqView != null) {
                                return new ViewAppNotificationHeaderBinding((RelativeLayout) view, listTile, listTile2, linearLayout, listTile3, textView, notificationFaqView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewAppNotificationHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ViewAppNotificationHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.view_app_notification_header, viewGroup, false);
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
