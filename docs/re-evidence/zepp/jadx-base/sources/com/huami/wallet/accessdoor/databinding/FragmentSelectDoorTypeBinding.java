package com.huami.wallet.accessdoor.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.wallet.accessdoor.R;

/* JADX INFO: loaded from: classes15.dex */
public final class FragmentSelectDoorTypeBinding implements ViewBinding {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final View dividerTagTop;

    @NonNull
    public final ImageView ivSelectDoor;

    @NonNull
    public final RelativeLayout rlDoorCard;

    @NonNull
    public final RelativeLayout rlDoorNeighborhood;

    @NonNull
    public final RelativeLayout rlDoorYun;

    @NonNull
    public final RelativeLayout rlNfcTag;

    @NonNull
    public final RelativeLayout rlWhiteCard;

    @NonNull
    public final TextView tvAccessDoor;

    @NonNull
    public final TextView tvAccessDoorMessage;

    @NonNull
    public final TextView tvAccessDoorMessageNeighborhood;

    @NonNull
    public final TextView tvAccessDoorMessageYun;

    @NonNull
    public final TextView tvAccessNeighborhood;

    @NonNull
    public final TextView tvAccessYun;

    @NonNull
    public final TextView tvMessageNeighborhoodUrl;

    @NonNull
    public final TextView tvMessageYunUrl;

    @NonNull
    public final TextView tvTagDoor;

    @NonNull
    public final TextView tvWhiteDoor;

    @NonNull
    public final TextView tvWhiteDoorMessage;

    @NonNull
    public final View viewNeighborhood;

    @NonNull
    public final View viewYun;

    private FragmentSelectDoorTypeBinding(@NonNull ScrollView scrollView, @NonNull View view, @NonNull ImageView imageView, @NonNull RelativeLayout relativeLayout, @NonNull RelativeLayout relativeLayout2, @NonNull RelativeLayout relativeLayout3, @NonNull RelativeLayout relativeLayout4, @NonNull RelativeLayout relativeLayout5, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7, @NonNull TextView textView8, @NonNull TextView textView9, @NonNull TextView textView10, @NonNull TextView textView11, @NonNull View view2, @NonNull View view3) {
        this.a = scrollView;
        this.dividerTagTop = view;
        this.ivSelectDoor = imageView;
        this.rlDoorCard = relativeLayout;
        this.rlDoorNeighborhood = relativeLayout2;
        this.rlDoorYun = relativeLayout3;
        this.rlNfcTag = relativeLayout4;
        this.rlWhiteCard = relativeLayout5;
        this.tvAccessDoor = textView;
        this.tvAccessDoorMessage = textView2;
        this.tvAccessDoorMessageNeighborhood = textView3;
        this.tvAccessDoorMessageYun = textView4;
        this.tvAccessNeighborhood = textView5;
        this.tvAccessYun = textView6;
        this.tvMessageNeighborhoodUrl = textView7;
        this.tvMessageYunUrl = textView8;
        this.tvTagDoor = textView9;
        this.tvWhiteDoor = textView10;
        this.tvWhiteDoorMessage = textView11;
        this.viewNeighborhood = view2;
        this.viewYun = view3;
    }

    @NonNull
    public static FragmentSelectDoorTypeBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        int i = R.id.divider_tag_top;
        View viewFindChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById3 != null) {
            i = R.id.iv_select_door;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.rl_door_card;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout != null) {
                    i = R.id.rl_door_neighborhood;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout2 != null) {
                        i = R.id.rl_door_yun;
                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout3 != null) {
                            i = R.id.rl_nfc_tag;
                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout4 != null) {
                                i = R.id.rl_white_card;
                                RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout5 != null) {
                                    i = R.id.tv_access_door;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView != null) {
                                        i = R.id.tv_access_door_message;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                        if (textView2 != null) {
                                            i = R.id.tv_access_door_message_neighborhood;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView3 != null) {
                                                i = R.id.tv_access_door_message_yun;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                if (textView4 != null) {
                                                    i = R.id.tv_access_neighborhood;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                    if (textView5 != null) {
                                                        i = R.id.tv_access_yun;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView6 != null) {
                                                            i = R.id.tv_message_neighborhood_url;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                            if (textView7 != null) {
                                                                i = R.id.tv_message_yun_url;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                if (textView8 != null) {
                                                                    i = R.id.tv_tag_door;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                    if (textView9 != null) {
                                                                        i = R.id.tv_white_door;
                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView10 != null) {
                                                                            i = R.id.tv_white_door_message;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView11 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view_neighborhood))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.view_yun))) != null) {
                                                                                return new FragmentSelectDoorTypeBinding((ScrollView) view, viewFindChildViewById3, imageView, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, viewFindChildViewById, viewFindChildViewById2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSelectDoorTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSelectDoorTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_select_door_type, viewGroup, false);
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
