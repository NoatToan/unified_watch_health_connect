package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemEarbudAlarmBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView alarmAmpmText;

    @NonNull
    public final ImageView alarmDelete;

    @NonNull
    public final TextView alarmRepeat;

    @NonNull
    public final TextView alarmStatus;

    @NonNull
    public final SwitchCompat alarmSwitch;

    @NonNull
    public final TypefaceTextView alarmTimeText;

    @NonNull
    public final ImageView endLine;

    private ItemEarbudAlarmBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SwitchCompat switchCompat, @NonNull TypefaceTextView typefaceTextView, @NonNull ImageView imageView2) {
        this.a = linearLayout;
        this.alarmAmpmText = textView;
        this.alarmDelete = imageView;
        this.alarmRepeat = textView2;
        this.alarmStatus = textView3;
        this.alarmSwitch = switchCompat;
        this.alarmTimeText = typefaceTextView;
        this.endLine = imageView2;
    }

    @NonNull
    public static ItemEarbudAlarmBinding bind(@NonNull View view) {
        int i = R.id.alarm_ampm_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.alarm_delete;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.alarm_repeat;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.alarm_status;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        i = R.id.alarm_switch;
                        SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                        if (switchCompat != null) {
                            i = R.id.alarm_time_text;
                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                            if (typefaceTextView != null) {
                                i = R.id.end_line;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    return new ItemEarbudAlarmBinding((LinearLayout) view, textView, imageView, textView2, textView3, switchCompat, typefaceTextView, imageView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemEarbudAlarmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemEarbudAlarmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_earbud_alarm, viewGroup, false);
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
