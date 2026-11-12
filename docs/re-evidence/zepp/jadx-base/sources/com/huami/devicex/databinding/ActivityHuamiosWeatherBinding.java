package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.huami.lib.rainbow.ListTile;
import com.zhouyou.recyclerview.swipemenu.SwipeMenuRecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityHuamiosWeatherBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile alertIv;

    @NonNull
    public final FrameLayout btStatusFragmentContainer;

    @NonNull
    public final CardView cardView;

    @NonNull
    public final SwipeMenuRecyclerView cityRc;

    @NonNull
    public final View maskView;

    @NonNull
    public final ConstraintLayout noPermissionLayout;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final FrameLayout searchFragmentContainer;

    @NonNull
    public final ListTile tempUnitIv;

    @NonNull
    public final CardView weatherSettingCardView;

    @NonNull
    public final TextView weatherTipsTv;

    private ActivityHuamiosWeatherBinding(@NonNull LinearLayout linearLayout, @NonNull ListTile listTile, @NonNull FrameLayout frameLayout, @NonNull CardView cardView, @NonNull SwipeMenuRecyclerView swipeMenuRecyclerView, @NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout2, @NonNull ListTile listTile2, @NonNull CardView cardView2, @NonNull TextView textView) {
        this.a = linearLayout;
        this.alertIv = listTile;
        this.btStatusFragmentContainer = frameLayout;
        this.cardView = cardView;
        this.cityRc = swipeMenuRecyclerView;
        this.maskView = view;
        this.noPermissionLayout = constraintLayout;
        this.scrollView = nestedScrollView;
        this.searchFragmentContainer = frameLayout2;
        this.tempUnitIv = listTile2;
        this.weatherSettingCardView = cardView2;
        this.weatherTipsTv = textView;
    }

    @NonNull
    public static ActivityHuamiosWeatherBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.alert_iv;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
        if (listTile != null) {
            i = R.id.bt_status_fragment_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.card_view;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.city_rc;
                    SwipeMenuRecyclerView swipeMenuRecyclerView = (SwipeMenuRecyclerView) ViewBindings.findChildViewById(view, i);
                    if (swipeMenuRecyclerView != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.mask_view))) != null) {
                        i = R.id.no_permission_layout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.scroll_view;
                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                            if (nestedScrollView != null) {
                                i = R.id.search_fragment_container;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout2 != null) {
                                    i = R.id.temp_unit_iv;
                                    ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile2 != null) {
                                        i = R.id.weather_setting_card_view;
                                        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                                        if (cardView2 != null) {
                                            i = R.id.weather_tips_tv;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                            if (textView != null) {
                                                return new ActivityHuamiosWeatherBinding((LinearLayout) view, listTile, frameLayout, cardView, swipeMenuRecyclerView, viewFindChildViewById, constraintLayout, nestedScrollView, frameLayout2, listTile2, cardView2, textView);
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
    public static ActivityHuamiosWeatherBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityHuamiosWeatherBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_huamios_weather, viewGroup, false);
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
