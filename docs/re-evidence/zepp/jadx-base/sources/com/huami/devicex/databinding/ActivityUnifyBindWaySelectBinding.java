package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityUnifyBindWaySelectBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final CardView cardBindByBlueTooth;

    @NonNull
    public final CardView cardBindByQr;

    @NonNull
    public final ImageView hasQrCodeImg;

    @NonNull
    public final TextView noQrCode;

    @NonNull
    public final ImageView noQrCodeImg;

    @NonNull
    public final TextView qrCode;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivityUnifyBindWaySelectBinding(@NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull CardView cardView2, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull ImageView imageView2, @NonNull TextView textView2, @NonNull RainbowTitleBar rainbowTitleBar) {
        this.a = constraintLayout;
        this.cardBindByBlueTooth = cardView;
        this.cardBindByQr = cardView2;
        this.hasQrCodeImg = imageView;
        this.noQrCode = textView;
        this.noQrCodeImg = imageView2;
        this.qrCode = textView2;
        this.titleBar = rainbowTitleBar;
    }

    @NonNull
    public static ActivityUnifyBindWaySelectBinding bind(@NonNull View view) {
        int i = R.id.cardBindByBlueTooth;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.cardBindByQr;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView2 != null) {
                i = R.id.has_qr_code_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.no_qr_code;
                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView != null) {
                        i = R.id.no_qr_code_img;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.qr_code;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.titleBar;
                                RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(view, i);
                                if (rainbowTitleBar != null) {
                                    return new ActivityUnifyBindWaySelectBinding((ConstraintLayout) view, cardView, cardView2, imageView, textView, imageView2, textView2, rainbowTitleBar);
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
    public static ActivityUnifyBindWaySelectBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityUnifyBindWaySelectBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_unify_bind_way_select, viewGroup, false);
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
