package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.view.widget.LoadingView;
import com.huami.widget.typeface.TypefaceTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class ItemMibandAlarmListBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView alarmDelete;

    @NonNull
    public final FrameLayout deleteLayout;

    @NonNull
    public final View divider;

    @NonNull
    public final FrameLayout loadingParent;

    @NonNull
    public final LoadingView loadingView;

    @NonNull
    public final TextView mibandAlarmAmpmText;

    @NonNull
    public final TextView mibandAlarmRepeat;

    @NonNull
    public final TextView mibandAlarmStatus;

    @NonNull
    public final SwitchCompat mibandAlarmSwitch;

    @NonNull
    public final TypefaceTextView mibandAlarmTimeText;

    private ItemMibandAlarmListBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull View view, @NonNull FrameLayout frameLayout2, @NonNull LoadingView loadingView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull SwitchCompat switchCompat, @NonNull TypefaceTextView typefaceTextView) {
        this.a = relativeLayout;
        this.alarmDelete = imageView;
        this.deleteLayout = frameLayout;
        this.divider = view;
        this.loadingParent = frameLayout2;
        this.loadingView = loadingView;
        this.mibandAlarmAmpmText = textView;
        this.mibandAlarmRepeat = textView2;
        this.mibandAlarmStatus = textView3;
        this.mibandAlarmSwitch = switchCompat;
        this.mibandAlarmTimeText = typefaceTextView;
    }

    @NonNull
    public static ItemMibandAlarmListBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.alarm_delete;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.delete_layout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider))) != null) {
                i = R.id.loading_parent;
                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout2 != null) {
                    i = R.id.loading_view;
                    LoadingView loadingView = (LoadingView) ViewBindings.findChildViewById(view, i);
                    if (loadingView != null) {
                        i = R.id.miband_alarm_ampm_text;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            i = R.id.miband_alarm_repeat;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.miband_alarm_status;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    i = R.id.miband_alarm_switch;
                                    SwitchCompat switchCompat = (SwitchCompat) ViewBindings.findChildViewById(view, i);
                                    if (switchCompat != null) {
                                        i = R.id.miband_alarm_time_text;
                                        TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(view, i);
                                        if (typefaceTextView != null) {
                                            return new ItemMibandAlarmListBinding((RelativeLayout) view, imageView, frameLayout, viewFindChildViewById, frameLayout2, loadingView, textView, textView2, textView3, switchCompat, typefaceTextView);
                                        }
                                    }
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
    public static ItemMibandAlarmListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMibandAlarmListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.item_miband_alarm_list, viewGroup, false);
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
