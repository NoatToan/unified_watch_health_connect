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
public final class ActivityCaptureDeviceBaseBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ViewfinderView captureFindView;

    @NonNull
    public final SurfaceView capturePreviewView;

    @NonNull
    public final TextView captureQuit;

    @NonNull
    public final TextView captureTips;

    @NonNull
    public final TextView captureTitle;

    @NonNull
    public final TextView tvNoQrCode;

    private ActivityCaptureDeviceBaseBinding(@NonNull RelativeLayout relativeLayout, @NonNull ViewfinderView viewfinderView, @NonNull SurfaceView surfaceView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.a = relativeLayout;
        this.captureFindView = viewfinderView;
        this.capturePreviewView = surfaceView;
        this.captureQuit = textView;
        this.captureTips = textView2;
        this.captureTitle = textView3;
        this.tvNoQrCode = textView4;
    }

    @NonNull
    public static ActivityCaptureDeviceBaseBinding bind(@NonNull View view) {
        int i = R.id.capture_find_view;
        ViewfinderView viewfinderView = (ViewfinderView) ViewBindings.findChildViewById(view, i);
        if (viewfinderView != null) {
            i = R.id.capture_preview_view;
            SurfaceView surfaceView = (SurfaceView) ViewBindings.findChildViewById(view, i);
            if (surfaceView != null) {
                i = R.id.capture_quit;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.capture_tips;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.capture_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            i = R.id.tv_no_qr_code;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView4 != null) {
                                return new ActivityCaptureDeviceBaseBinding((RelativeLayout) view, viewfinderView, surfaceView, textView, textView2, textView3, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCaptureDeviceBaseBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityCaptureDeviceBaseBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_capture_device_base, viewGroup, false);
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
