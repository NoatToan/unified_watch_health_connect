package com.huami.phone_call.sms.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import com.huami.phone_call.sms.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public final class ActivityPhoneCallReplyMsgBinding implements ViewBinding {

    @NonNull
    private final FragmentContainerView a;

    @NonNull
    public final FragmentContainerView navHost;

    private ActivityPhoneCallReplyMsgBinding(@NonNull FragmentContainerView fragmentContainerView, @NonNull FragmentContainerView fragmentContainerView2) {
        this.a = fragmentContainerView;
        this.navHost = fragmentContainerView2;
    }

    @NonNull
    public static ActivityPhoneCallReplyMsgBinding bind(@NonNull View view) {
        Objects.requireNonNull(view, "rootView");
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new ActivityPhoneCallReplyMsgBinding(fragmentContainerView, fragmentContainerView);
    }

    @NonNull
    public static ActivityPhoneCallReplyMsgBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityPhoneCallReplyMsgBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_phone_call_reply_msg, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FragmentContainerView getRoot() {
        return this.a;
    }
}
