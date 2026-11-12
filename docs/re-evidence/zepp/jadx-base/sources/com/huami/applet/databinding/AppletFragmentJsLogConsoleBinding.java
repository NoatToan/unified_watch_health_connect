package com.huami.applet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.applet.R;

/* JADX INFO: loaded from: classes5.dex */
public final class AppletFragmentJsLogConsoleBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Button appletClearLog;

    @NonNull
    public final ListView appletJsLogListView;

    @NonNull
    public final TextView appletJsLogNoData;

    @NonNull
    public final ProgressBar appletJsLogProgress;

    @NonNull
    public final RelativeLayout appletNoDataLayout;

    private AppletFragmentJsLogConsoleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull ListView listView, @NonNull TextView textView, @NonNull ProgressBar progressBar, @NonNull RelativeLayout relativeLayout) {
        this.a = constraintLayout;
        this.appletClearLog = button;
        this.appletJsLogListView = listView;
        this.appletJsLogNoData = textView;
        this.appletJsLogProgress = progressBar;
        this.appletNoDataLayout = relativeLayout;
    }

    @NonNull
    public static AppletFragmentJsLogConsoleBinding bind(@NonNull View view) {
        int i = R.id.applet_clear_log;
        Button button = (Button) ViewBindings.findChildViewById(view, i);
        if (button != null) {
            i = R.id.applet_js_log_list_view;
            ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
            if (listView != null) {
                i = R.id.applet_js_log_no_data;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.applet_js_log_progress;
                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                    if (progressBar != null) {
                        i = R.id.applet_no_data_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            return new AppletFragmentJsLogConsoleBinding((ConstraintLayout) view, button, listView, textView, progressBar, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static AppletFragmentJsLogConsoleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static AppletFragmentJsLogConsoleBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.applet_fragment_js_log_console, viewGroup, false);
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
