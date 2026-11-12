package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class LayoutHeadsetHrReminderNotificationBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final ImageButton bindHeadsetDeviceCancel;

    @NonNull
    public final ImageView bindHeadsetDeviceSearchImage;

    @NonNull
    public final ImageButton hrReminderAudition;

    @NonNull
    public final TextView hrReminderAuditionHint;

    private LayoutHeadsetHrReminderNotificationBinding(@NonNull FrameLayout frameLayout, @NonNull ImageButton imageButton, @NonNull ImageView imageView, @NonNull ImageButton imageButton2, @NonNull TextView textView) {
        this.a = frameLayout;
        this.bindHeadsetDeviceCancel = imageButton;
        this.bindHeadsetDeviceSearchImage = imageView;
        this.hrReminderAudition = imageButton2;
        this.hrReminderAuditionHint = textView;
    }

    @NonNull
    public static LayoutHeadsetHrReminderNotificationBinding bind(@NonNull View view) {
        int i = R.id.bind_headset_device_cancel;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.bind_headset_device_search_image;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.hr_reminder_audition;
                ImageButton imageButton2 = (ImageButton) ViewBindings.findChildViewById(view, i);
                if (imageButton2 != null) {
                    i = R.id.hr_reminder_audition_hint;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new LayoutHeadsetHrReminderNotificationBinding((FrameLayout) view, imageButton, imageView, imageButton2, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutHeadsetHrReminderNotificationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutHeadsetHrReminderNotificationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_headset_hr_reminder_notification, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
