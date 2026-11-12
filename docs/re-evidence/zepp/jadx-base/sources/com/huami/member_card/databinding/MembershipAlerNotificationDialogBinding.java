package com.huami.member_card.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.member_card.R;

/* JADX INFO: loaded from: classes11.dex */
public final class MembershipAlerNotificationDialogBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final Button memberBtnKnown;

    @NonNull
    public final TextView memberCardAlertMsg;

    private MembershipAlerNotificationDialogBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull Button button, @NonNull TextView textView) {
        this.a = linearLayoutCompat;
        this.memberBtnKnown = button;
        this.memberCardAlertMsg = textView;
    }

    @NonNull
    public static MembershipAlerNotificationDialogBinding bind(@NonNull View view) {
        int i = R.id.member_btn_known;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.member_card_alert_msg;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                return new MembershipAlerNotificationDialogBinding((LinearLayoutCompat) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static MembershipAlerNotificationDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MembershipAlerNotificationDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.membership_aler_notification_dialog, viewGroup, false);
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
