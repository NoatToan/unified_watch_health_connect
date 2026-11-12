package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.android.zxing.ViewfinderView;
import com.huami.devicex.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityCaptureShoesBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView bindShoesCaptureTips;

    @NonNull
    public final TextView bindTitle;

    @NonNull
    public final ViewfinderView captureFindView;

    @NonNull
    public final SurfaceView capturePreviewView;

    @NonNull
    public final TextView captureQuit;

    private ActivityCaptureShoesBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ViewfinderView viewfinderView, @NonNull SurfaceView surfaceView, @NonNull TextView textView3) {
        this.a = relativeLayout;
        this.bindShoesCaptureTips = textView;
        this.bindTitle = textView2;
        this.captureFindView = viewfinderView;
        this.capturePreviewView = surfaceView;
        this.captureQuit = textView3;
    }

    @NonNull
    public static ActivityCaptureShoesBinding bind(@NonNull View view) {
        int i = R.id.bind_shoes_capture_tips;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.bind_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.capture_find_view;
                ViewfinderView viewfinderView = (ViewfinderView) ViewBindings.findChildViewById(view, i);
                if (viewfinderView != null) {
                    i = R.id.capture_preview_view;
                    SurfaceView surfaceView = (SurfaceView) ViewBindings.findChildViewById(view, i);
                    if (surfaceView != null) {
                        i = R.id.capture_quit;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new ActivityCaptureShoesBinding((RelativeLayout) view, textView, textView2, viewfinderView, surfaceView, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCaptureShoesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityCaptureShoesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_capture_shoes, viewGroup, false);
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
