package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemMibandAlarmListNewBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView alarmDelete;

    @NonNull
    public final FrameLayout deleteLayout;

    @NonNull
    public final TextView mibandAlarmAmpmText;

    @NonNull
    public final TextView mibandAlarmRepeat;

    @NonNull
    public final SwitchCompat mibandAlarmSwitch;

    @NonNull
    public final TypefaceTextView mibandAlarmTimeText;

    private ItemMibandAlarmListNewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull SwitchCompat switchCompat, @NonNull TypefaceTextView typefaceTextView) {
        this.a = constraintLayout;
        this.alarmDelete = imageView;
        this.deleteLayout = frameLayout;
        this.mibandAlarmAmpmText = textView;
        this.mibandAlarmRepeat = textView2;
        this.mibandAlarmSwitch = switchCompat;
        this.mibandAlarmTimeText = typefaceTextView;
    }

    @NonNull
    public static ItemMibandAlarmListNewBinding bind(@NonNull View view) {
        int i = R.id.alarm_delete;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.delete_layout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.miband_alarm_ampm_text;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.miband_alarm_repeat;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.miband_alarm_switch;
                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                        if (switchCompat != null) {
                            i = R.id.miband_alarm_time_text;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView != null) {
                                return new ItemMibandAlarmListNewBinding((ConstraintLayout) view, imageView, frameLayout, textView, textView2, switchCompat, typefaceTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMibandAlarmListNewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMibandAlarmListNewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_miband_alarm_list_new, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
