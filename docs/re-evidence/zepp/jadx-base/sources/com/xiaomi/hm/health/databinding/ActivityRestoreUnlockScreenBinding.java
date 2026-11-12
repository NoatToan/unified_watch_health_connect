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
public final class ActivityRestoreUnlockScreenBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView restoreUnlockScreenTips;

    @NonNull
    public final TextView restoreUnlockScreenTitle;

    private ActivityRestoreUnlockScreenBinding(@NonNull RelativeLayout rootView, @NonNull TextView restoreUnlockScreenTips, @NonNull TextView restoreUnlockScreenTitle) {
        this.a = rootView;
        this.restoreUnlockScreenTips = restoreUnlockScreenTips;
        this.restoreUnlockScreenTitle = restoreUnlockScreenTitle;
    }

    @NonNull
    public static ActivityRestoreUnlockScreenBinding bind(@NonNull View rootView) {
        int i = R.id.restore_unlock_screen_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.restore_unlock_screen_tips);
        if (textView != null) {
            i = R.id.restore_unlock_screen_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.restore_unlock_screen_title);
            if (textView2 != null) {
                return new ActivityRestoreUnlockScreenBinding((RelativeLayout) rootView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityRestoreUnlockScreenBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityRestoreUnlockScreenBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_restore_unlock_screen, parent, false);
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
