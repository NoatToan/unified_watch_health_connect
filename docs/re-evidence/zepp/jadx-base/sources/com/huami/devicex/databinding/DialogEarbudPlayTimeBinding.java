package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.widget.wheelview.WheelView;

/* JADX INFO: loaded from: classes7.dex */
public final class DialogEarbudPlayTimeBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView btnCancel;

    @NonNull
    public final TextView btnSave;

    @NonNull
    public final WheelView timeWheel;

    @NonNull
    public final LinearLayout wheels;

    private DialogEarbudPlayTimeBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull WheelView wheelView, @NonNull LinearLayout linearLayout2) {
        this.a = linearLayout;
        this.btnCancel = textView;
        this.btnSave = textView2;
        this.timeWheel = wheelView;
        this.wheels = linearLayout2;
    }

    @NonNull
    public static DialogEarbudPlayTimeBinding bind(@NonNull View view) {
        int i = R.id.btn_cancel;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.btn_save;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.time_wheel;
                WheelView wheelView = (WheelView) ViewBindings.findChildViewById(view, i);
                if (wheelView != null) {
                    i = R.id.wheels;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        return new DialogEarbudPlayTimeBinding((LinearLayout) view, textView, textView2, wheelView, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogEarbudPlayTimeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogEarbudPlayTimeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_earbud_play_time, viewGroup, false);
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
