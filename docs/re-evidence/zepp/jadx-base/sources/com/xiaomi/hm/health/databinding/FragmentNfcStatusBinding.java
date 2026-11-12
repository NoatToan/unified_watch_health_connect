package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentNfcStatusBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView known;

    @NonNull
    public final TextView tipMessage;

    private FragmentNfcStatusBinding(@NonNull RelativeLayout rootView, @NonNull TextView known, @NonNull TextView tipMessage) {
        this.a = rootView;
        this.known = known;
        this.tipMessage = tipMessage;
    }

    @NonNull
    public static FragmentNfcStatusBinding bind(@NonNull View rootView) {
        int i = R.id.known;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.known);
        if (textView != null) {
            i = R.id.tip_message;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tip_message);
            if (textView2 != null) {
                return new FragmentNfcStatusBinding((RelativeLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentNfcStatusBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentNfcStatusBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_nfc_status, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
