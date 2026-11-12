package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.watch.companion.ui.view.HuaMiFontTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityEarbudBreathTrainBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView durationMsgText;

    @NonNull
    public final TextView durationText;

    @NonNull
    public final ImageView scaleImg;

    @NonNull
    public final HuaMiFontTextView timeText;

    private ActivityEarbudBreathTrainBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ImageView imageView, @NonNull HuaMiFontTextView huaMiFontTextView) {
        this.a = relativeLayout;
        this.durationMsgText = textView;
        this.durationText = textView2;
        this.scaleImg = imageView;
        this.timeText = huaMiFontTextView;
    }

    @NonNull
    public static ActivityEarbudBreathTrainBinding bind(@NonNull View view) {
        int i = R.id.duration_msg_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.duration_text;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.scale_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.time_text;
                    HuaMiFontTextView huaMiFontTextView = (HuaMiFontTextView) ViewBindings.findChildViewById(view, i);
                    if (huaMiFontTextView != null) {
                        return new ActivityEarbudBreathTrainBinding((RelativeLayout) view, textView, textView2, imageView, huaMiFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityEarbudBreathTrainBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityEarbudBreathTrainBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_earbud_breath_train, viewGroup, false);
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
