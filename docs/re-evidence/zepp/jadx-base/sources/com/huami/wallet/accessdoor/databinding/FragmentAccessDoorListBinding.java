package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.wallet.accessdoor.R;
import com.loopeer.cardstack.CardStackView;

/* JADX INFO: loaded from: classes15.dex */
public final class FragmentAccessDoorListBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CardView card;

    @NonNull
    public final ImageView cardImageDefault;

    @NonNull
    public final LinearLayout cardInUse;

    @NonNull
    public final CardStackView cardStack;

    @NonNull
    public final LinearLayout cardsNoUse;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final TextView titleDefaultCard;

    @NonNull
    public final TextView titleIdleCard;

    @NonNull
    public final TextView tvCardName;

    private FragmentAccessDoorListBinding(@NonNull LinearLayout linearLayout, @NonNull CardView cardView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout2, @NonNull CardStackView cardStackView, @NonNull LinearLayout linearLayout3, @NonNull NestedScrollView nestedScrollView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = linearLayout;
        this.card = cardView;
        this.cardImageDefault = imageView;
        this.cardInUse = linearLayout2;
        this.cardStack = cardStackView;
        this.cardsNoUse = linearLayout3;
        this.scrollView = nestedScrollView;
        this.titleDefaultCard = textView;
        this.titleIdleCard = textView2;
        this.tvCardName = textView3;
    }

    @NonNull
    public static FragmentAccessDoorListBinding bind(@NonNull View view) {
        int i = R.id.card;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.card_image_default;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.card_in_use;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.card_stack;
                    CardStackView cardStackView = (CardStackView) ViewBindings.findChildViewById(view, i);
                    if (cardStackView != null) {
                        i = R.id.cards_no_use;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.scrollView;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = R.id.title_default_card;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.title_idle_card;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv_card_name;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            return new FragmentAccessDoorListBinding((LinearLayout) view, cardView, imageView, linearLayout, cardStackView, linearLayout2, nestedScrollView, textView, textView2, textView3);
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
    public static FragmentAccessDoorListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentAccessDoorListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_access_door_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
