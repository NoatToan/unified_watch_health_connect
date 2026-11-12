package com.huami.moving.databinding;

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
import com.huami.moving.R;

/* JADX INFO: loaded from: classes11.dex */
public final class DialogRunningGpsUnavailableBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final TextView avoidUseIndoorText;

    @NonNull
    public final TextView gpsCannotRecordText;

    @NonNull
    public final TextView gpsPreTitle;

    @NonNull
    public final ImageView gpsSignalImage;

    @NonNull
    public final RelativeLayout gpsSignalLayout;

    @NonNull
    public final ImageView image;

    @NonNull
    public final TextView pleaseGoOutdoorText;

    @NonNull
    public final View splitLine;

    private DialogRunningGpsUnavailableBinding(@NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView2, @NonNull TextView textView4, @NonNull View view) {
        this.a = relativeLayout;
        this.avoidUseIndoorText = textView;
        this.gpsCannotRecordText = textView2;
        this.gpsPreTitle = textView3;
        this.gpsSignalImage = imageView;
        this.gpsSignalLayout = relativeLayout2;
        this.image = imageView2;
        this.pleaseGoOutdoorText = textView4;
        this.splitLine = view;
    }

    @NonNull
    public static DialogRunningGpsUnavailableBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.avoid_use_indoor_text;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.gps_cannot_record_text;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.gps_pre_title;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.gps_signal_image;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.gps_signal_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = R.id.image;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.please_go_outdoor_text;
                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.split_line))) != null) {
                                    return new DialogRunningGpsUnavailableBinding((RelativeLayout) view, textView, textView2, textView3, imageView, relativeLayout, imageView2, textView4, viewFindChildViewById);
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
    public static DialogRunningGpsUnavailableBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogRunningGpsUnavailableBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_running_gps_unavailable, viewGroup, false);
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
