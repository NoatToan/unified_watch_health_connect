package com.huami.phone_call.sms.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.phone_call.sms.R;

/* JADX INFO: loaded from: classes12.dex */
public final class FragmentSmsReplySettingBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile smsReply;

    @NonNull
    public final ListTile smsReplyManager;

    private FragmentSmsReplySettingBinding(@NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull ListTile listTile2) {
        this.a = linearLayout;
        this.smsReply = listTile;
        this.smsReplyManager = listTile2;
    }

    @NonNull
    public static FragmentSmsReplySettingBinding bind(@NonNull View view) {
        int i = R.id.sms_reply;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.sms_reply_manager;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
            if (listTile2 != null) {
                return new FragmentSmsReplySettingBinding((LinearLayout) view, listTile, listTile2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSmsReplySettingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSmsReplySettingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sms_reply_setting, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
