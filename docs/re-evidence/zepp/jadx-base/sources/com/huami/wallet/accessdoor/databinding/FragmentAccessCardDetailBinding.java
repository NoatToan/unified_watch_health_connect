package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.wallet.accessdoor.R;

/* JADX INFO: loaded from: classes15.dex */
public final class FragmentAccessCardDetailBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final AppCompatButton btScheduledSwitchCardAdd;

    @NonNull
    public final CardView card;

    @NonNull
    public final ImageView cardImage;

    @NonNull
    public final ConstraintLayout doorCardTimeSwitch;

    @NonNull
    public final LinearLayoutCompat llDoorDetail;

    @NonNull
    public final RecyclerView rvScheduledSwitchTimes;

    @NonNull
    public final TextView tvCardName;

    @NonNull
    public final TextView tvCardState;

    @NonNull
    public final TextView tvDeleteCard;

    @NonNull
    public final TextView tvEditName;

    @NonNull
    public final TextView tvEncryptionCardTip;

    @NonNull
    public final TextView tvEncryptionTip;

    @NonNull
    public final TextView tvFreQuestion;

    @NonNull
    public final TextView tvSetDefaultCard;

    @NonNull
    public final TextView tvTitleScheduledSwitchCard;

    private FragmentAccessCardDetailBinding(@NonNull ScrollView scrollView, @NonNull AppCompatButton appCompatButton, @NonNull CardView cardView, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout, @NonNull LinearLayoutCompat linearLayoutCompat, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9) {
        this.a = scrollView;
        this.btScheduledSwitchCardAdd = appCompatButton;
        this.card = cardView;
        this.cardImage = imageView;
        this.doorCardTimeSwitch = constraintLayout;
        this.llDoorDetail = linearLayoutCompat;
        this.rvScheduledSwitchTimes = recyclerView;
        this.tvCardName = textView;
        this.tvCardState = textView2;
        this.tvDeleteCard = textView3;
        this.tvEditName = textView4;
        this.tvEncryptionCardTip = textView5;
        this.tvEncryptionTip = textView6;
        this.tvFreQuestion = textView7;
        this.tvSetDefaultCard = textView8;
        this.tvTitleScheduledSwitchCard = textView9;
    }

    @NonNull
    public static FragmentAccessCardDetailBinding bind(@NonNull View view) {
        int i = R.id.bt_scheduled_switch_card_add;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(view, i);
        if (appCompatButton != null) {
            i = R.id.card;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.card_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.door_card_time_switch;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.ll_door_detail;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = R.id.rv_scheduled_switch_times;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.tv_card_name;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.tv_card_state;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        i = R.id.tv_delete_card;
                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView3 != null) {
                                            i = R.id.tv_edit_name;
                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView4 != null) {
                                                i = R.id.tv_encryption_card_tip;
                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView5 != null) {
                                                    i = R.id.tv_encryption_tip;
                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView6 != null) {
                                                        i = R.id.tv_fre_question;
                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView7 != null) {
                                                            i = R.id.tv_set_default_card;
                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView8 != null) {
                                                                i = R.id.tv_title_scheduled_switch_card;
                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView9 != null) {
                                                                    return new FragmentAccessCardDetailBinding((ScrollView) view, appCompatButton, cardView, imageView, constraintLayout, linearLayoutCompat, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
    public static FragmentAccessCardDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentAccessCardDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_access_card_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ScrollView getRoot() {
        return this.a;
    }
}
