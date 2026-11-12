package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityUserInfoPrivacyBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final ListTile itemExercisingUserRights;

    @NonNull
    public final ListTile itemUserAgreement;

    @NonNull
    public final ListTile itemUserCollectedDataList;

    @NonNull
    public final ListTile itemUserHealthDataAgreement;

    @NonNull
    public final ListTile itemUserPlan;

    @NonNull
    public final ListTile itemUserPrivacy;

    @NonNull
    public final ListTile itemUserSharedDataList;

    @NonNull
    public final LinearLayoutCompat itemsLayout;

    @NonNull
    public final RainbowTitleBar titleBar;

    private ActivityUserInfoPrivacyBinding(@NonNull LinearLayout rootView, @NonNull ListTile itemExercisingUserRights, @NonNull ListTile itemUserAgreement, @NonNull ListTile itemUserCollectedDataList, @NonNull ListTile itemUserHealthDataAgreement, @NonNull ListTile itemUserPlan, @NonNull ListTile itemUserPrivacy, @NonNull ListTile itemUserSharedDataList, @NonNull LinearLayoutCompat itemsLayout, @NonNull RainbowTitleBar titleBar) {
        this.a = rootView;
        this.itemExercisingUserRights = itemExercisingUserRights;
        this.itemUserAgreement = itemUserAgreement;
        this.itemUserCollectedDataList = itemUserCollectedDataList;
        this.itemUserHealthDataAgreement = itemUserHealthDataAgreement;
        this.itemUserPlan = itemUserPlan;
        this.itemUserPrivacy = itemUserPrivacy;
        this.itemUserSharedDataList = itemUserSharedDataList;
        this.itemsLayout = itemsLayout;
        this.titleBar = titleBar;
    }

    @NonNull
    public static ActivityUserInfoPrivacyBinding bind(@NonNull View rootView) {
        int i = R.id.item_exercising_user_rights;
        ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_exercising_user_rights);
        if (listTile != null) {
            i = R.id.item_user_agreement;
            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_user_agreement);
            if (listTile2 != null) {
                i = R.id.item_user_collected_data_list;
                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_user_collected_data_list);
                if (listTile3 != null) {
                    i = R.id.item_user_health_data_agreement;
                    ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_user_health_data_agreement);
                    if (listTile4 != null) {
                        i = R.id.item_user_plan;
                        ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_user_plan);
                        if (listTile5 != null) {
                            i = R.id.item_user_privacy;
                            ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_user_privacy);
                            if (listTile6 != null) {
                                i = R.id.item_user_shared_data_list;
                                ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_user_shared_data_list);
                                if (listTile7 != null) {
                                    i = R.id.items_layout;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(rootView, R.id.items_layout);
                                    if (linearLayoutCompat != null) {
                                        i = R.id.title_bar;
                                        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) ViewBindings.findChildViewById(rootView, R.id.title_bar);
                                        if (rainbowTitleBar != null) {
                                            return new ActivityUserInfoPrivacyBinding((LinearLayout) rootView, listTile, listTile2, listTile3, listTile4, listTile5, listTile6, listTile7, linearLayoutCompat, rainbowTitleBar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityUserInfoPrivacyBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityUserInfoPrivacyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_user_info_privacy, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.a;
    }
}
