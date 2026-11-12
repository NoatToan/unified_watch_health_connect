package com.huami.applet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.applet.R;

/* JADX INFO: loaded from: classes5.dex */
public final class AppletFragmentLaumberjackBinding implements ViewBinding {

    @NonNull
    private final LinearLayoutCompat a;

    @NonNull
    public final LinearLayout appletDeviceLogBtnLayout;

    @NonNull
    public final Button appletDeviceLogClear;

    @NonNull
    public final Button appletDeviceLogClose;

    @NonNull
    public final ListView appletDeviceLogListView;

    @NonNull
    public final TextView appletEmptyHint;

    private AppletFragmentLaumberjackBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull Button button2, @NonNull ListView listView, @NonNull TextView textView) {
        this.a = linearLayoutCompat;
        this.appletDeviceLogBtnLayout = linearLayout;
        this.appletDeviceLogClear = button;
        this.appletDeviceLogClose = button2;
        this.appletDeviceLogListView = listView;
        this.appletEmptyHint = textView;
    }

    @NonNull
    public static AppletFragmentLaumberjackBinding bind(@NonNull View view) {
        int i = R.id.applet_device_log_btn_layout;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.applet_device_log_clear;
            Button button = (Button) ViewBindings.findChildViewById(view, i);
            if (button != null) {
                i = R.id.applet_device_log_close;
                Button button2 = (Button) ViewBindings.findChildViewById(view, i);
                if (button2 != null) {
                    i = R.id.applet_device_log_list_view;
                    ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
                    if (listView != null) {
                        i = R.id.applet_empty_hint;
                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView != null) {
                            return new AppletFragmentLaumberjackBinding((LinearLayoutCompat) view, linearLayout, button, button2, listView, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static AppletFragmentLaumberjackBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static AppletFragmentLaumberjackBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.applet_fragment_laumberjack, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.a;
    }
}
