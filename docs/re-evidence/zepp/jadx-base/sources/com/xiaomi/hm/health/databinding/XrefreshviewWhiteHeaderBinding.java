package com.xiaomi.hm.health.databinding;

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
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class XrefreshviewWhiteHeaderBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView xrefreshviewHeaderArrow;

    @NonNull
    public final TextView xrefreshviewHeaderHintDot;

    @NonNull
    public final TextView xrefreshviewHeaderHintTextview;

    private XrefreshviewWhiteHeaderBinding(@NonNull RelativeLayout rootView, @NonNull ImageView xrefreshviewHeaderArrow, @NonNull TextView xrefreshviewHeaderHintDot, @NonNull TextView xrefreshviewHeaderHintTextview) {
        this.a = rootView;
        this.xrefreshviewHeaderArrow = xrefreshviewHeaderArrow;
        this.xrefreshviewHeaderHintDot = xrefreshviewHeaderHintDot;
        this.xrefreshviewHeaderHintTextview = xrefreshviewHeaderHintTextview;
    }

    @NonNull
    public static XrefreshviewWhiteHeaderBinding bind(@NonNull View rootView) {
        int i = R.id.xrefreshview_header_arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.xrefreshview_header_arrow);
        if (imageView != null) {
            i = R.id.xrefreshview_header_hint_dot;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.xrefreshview_header_hint_dot);
            if (textView != null) {
                i = R.id.xrefreshview_header_hint_textview;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.xrefreshview_header_hint_textview);
                if (textView2 != null) {
                    return new XrefreshviewWhiteHeaderBinding((RelativeLayout) rootView, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static XrefreshviewWhiteHeaderBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static XrefreshviewWhiteHeaderBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.xrefreshview_white_header, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.a;
    }
}
