package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.training.ui.widget.RoundImageView;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ItemSportAdvViewBinding implements ViewBinding {

    @NonNull
    private final CardView a;

    @NonNull
    public final TextView sportAdvertiseDesc;

    @NonNull
    public final RoundImageView sportAdvertiseImage;

    @NonNull
    public final TextView sportAdvertiseTitle;

    private ItemSportAdvViewBinding(@NonNull CardView rootView, @NonNull TextView sportAdvertiseDesc, @NonNull RoundImageView sportAdvertiseImage, @NonNull TextView sportAdvertiseTitle) {
        this.a = rootView;
        this.sportAdvertiseDesc = sportAdvertiseDesc;
        this.sportAdvertiseImage = sportAdvertiseImage;
        this.sportAdvertiseTitle = sportAdvertiseTitle;
    }

    @NonNull
    public static ItemSportAdvViewBinding bind(@NonNull View rootView) {
        int i = R.id.sport_advertise_desc;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_advertise_desc);
        if (textView != null) {
            i = R.id.sport_advertise_image;
            RoundImageView roundImageView = (RoundImageView) ViewBindings.findChildViewById(rootView, R.id.sport_advertise_image);
            if (roundImageView != null) {
                i = R.id.sport_advertise_title;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sport_advertise_title);
                if (textView2 != null) {
                    return new ItemSportAdvViewBinding((CardView) rootView, textView, roundImageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSportAdvViewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemSportAdvViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_sport_adv_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.a;
    }
}
