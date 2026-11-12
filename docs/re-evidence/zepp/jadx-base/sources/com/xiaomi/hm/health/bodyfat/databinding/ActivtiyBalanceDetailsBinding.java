package com.xiaomi.hm.health.bodyfat.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.xiaomi.hm.health.bodyfat.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivtiyBalanceDetailsBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final ImageView deleteIv;

    @NonNull
    public final RelativeLayout deleteLl;

    @NonNull
    public final ImageView guestIv;

    @NonNull
    public final RelativeLayout guestLl;

    @NonNull
    public final CardStatusIntroducesBinding layoutIntro;

    @NonNull
    public final ScrollView layoutScroll;

    @NonNull
    public final LinearLayout llBottom;

    @NonNull
    public final ImageView measureIv;

    @NonNull
    public final RelativeLayout measureLl;

    @NonNull
    public final TextView txNoScore;

    private ActivtiyBalanceDetailsBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout2, @NonNull ImageView imageView2, @NonNull RelativeLayout relativeLayout3, @NonNull CardStatusIntroducesBinding cardStatusIntroducesBinding, @NonNull ScrollView scrollView, @NonNull LinearLayout linearLayout, @NonNull ImageView imageView3, @NonNull RelativeLayout relativeLayout4, @NonNull TextView textView) {
        this.a = relativeLayout;
        this.deleteIv = imageView;
        this.deleteLl = relativeLayout2;
        this.guestIv = imageView2;
        this.guestLl = relativeLayout3;
        this.layoutIntro = cardStatusIntroducesBinding;
        this.layoutScroll = scrollView;
        this.llBottom = linearLayout;
        this.measureIv = imageView3;
        this.measureLl = relativeLayout4;
        this.txNoScore = textView;
    }

    @NonNull
    public static ActivtiyBalanceDetailsBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.delete_iv;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.delete_ll;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.guest_iv;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.guest_ll;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layout_intro))) != null) {
                        CardStatusIntroducesBinding cardStatusIntroducesBindingBind = CardStatusIntroducesBinding.bind(viewFindChildViewById);
                        i = R.id.layout_scroll;
                        ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(view, i);
                        if (scrollView != null) {
                            i = R.id.ll_bottom;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.measure_iv;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.measure_ll;
                                    RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout3 != null) {
                                        i = R.id.tx_no_score;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView != null) {
                                            return new ActivtiyBalanceDetailsBinding((RelativeLayout) view, imageView, relativeLayout, imageView2, relativeLayout2, cardStatusIntroducesBindingBind, scrollView, linearLayout, imageView3, relativeLayout3, textView);
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
    public static ActivtiyBalanceDetailsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivtiyBalanceDetailsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activtiy_balance_details, viewGroup, false);
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
