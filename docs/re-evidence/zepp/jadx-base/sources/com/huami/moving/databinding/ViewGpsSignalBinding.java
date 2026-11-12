package com.huami.moving.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.moving.R;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class ViewGpsSignalBinding implements ViewBinding {

    @NonNull
    private final View a;

    @NonNull
    public final ImageView gpsSignalDot1;

    @NonNull
    public final ImageView gpsSignalDot2;

    @NonNull
    public final ImageView gpsSignalDot3;

    @NonNull
    public final TextView tvGps;

    private ViewGpsSignalBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull TextView textView) {
        this.a = view;
        this.gpsSignalDot1 = imageView;
        this.gpsSignalDot2 = imageView2;
        this.gpsSignalDot3 = imageView3;
        this.tvGps = textView;
    }

    @NonNull
    public static ViewGpsSignalBinding bind(@NonNull View view) {
        int i = R.id.gps_signal_dot_1;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.gps_signal_dot_2;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.gps_signal_dot_3;
                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView3 != null) {
                    i = R.id.tv_gps;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        return new ViewGpsSignalBinding(view, imageView, imageView2, imageView3, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ViewGpsSignalBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.view_gps_signal, viewGroup);
        return bind(viewGroup);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.a;
    }
}
