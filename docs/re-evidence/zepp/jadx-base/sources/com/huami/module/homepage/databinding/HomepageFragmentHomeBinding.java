package com.huami.module.homepage.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.module.homepage.R;
import com.huami.module.homepage.sync.view.refresh.HomeRefreshAnimator;
import com.huami.module.homepage.sync.view.refresh.HomeRefreshHeader;
import com.huami.module.homepage.sync.view.refresh.HomeRefreshLayout;
import com.huami.module.homepage.sync.view.refresh.ServerFaultView;

/* JADX INFO: loaded from: classes11.dex */
public final class HomepageFragmentHomeBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RelativeLayout homepage;

    @NonNull
    public final AppCompatImageView homepageAllDataIv;

    @NonNull
    public final View homepageBarAvatar;

    @NonNull
    public final FrameLayout homepageCardContainer;

    @NonNull
    public final HomeRefreshAnimator homepageConnectAnimator;

    @NonNull
    public final TextView homepageDeviceStatus;

    @NonNull
    public final ImageView homepageImageview;

    @NonNull
    public final AppCompatImageView homepageLogo;

    @NonNull
    public final FrameLayout homepagePromotionContainer;

    @NonNull
    public final HomeRefreshHeader homepageRefreshHeader;

    @NonNull
    public final NestedScrollView homepageScroll;

    @NonNull
    public final ServerFaultView homepageServerFault;

    @NonNull
    public final AppCompatImageView homepageSleepAid;

    @NonNull
    public final HomeRefreshLayout homepageSrl;

    @NonNull
    public final ConstraintLayout homepageStatus;

    private HomepageFragmentHomeBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout homepage, @NonNull AppCompatImageView homepageAllDataIv, @NonNull View homepageBarAvatar, @NonNull FrameLayout homepageCardContainer, @NonNull HomeRefreshAnimator homepageConnectAnimator, @NonNull TextView homepageDeviceStatus, @NonNull ImageView homepageImageview, @NonNull AppCompatImageView homepageLogo, @NonNull FrameLayout homepagePromotionContainer, @NonNull HomeRefreshHeader homepageRefreshHeader, @NonNull NestedScrollView homepageScroll, @NonNull ServerFaultView homepageServerFault, @NonNull AppCompatImageView homepageSleepAid, @NonNull HomeRefreshLayout homepageSrl, @NonNull ConstraintLayout homepageStatus) {
        this.a = rootView;
        this.homepage = homepage;
        this.homepageAllDataIv = homepageAllDataIv;
        this.homepageBarAvatar = homepageBarAvatar;
        this.homepageCardContainer = homepageCardContainer;
        this.homepageConnectAnimator = homepageConnectAnimator;
        this.homepageDeviceStatus = homepageDeviceStatus;
        this.homepageImageview = homepageImageview;
        this.homepageLogo = homepageLogo;
        this.homepagePromotionContainer = homepagePromotionContainer;
        this.homepageRefreshHeader = homepageRefreshHeader;
        this.homepageScroll = homepageScroll;
        this.homepageServerFault = homepageServerFault;
        this.homepageSleepAid = homepageSleepAid;
        this.homepageSrl = homepageSrl;
        this.homepageStatus = homepageStatus;
    }

    @NonNull
    public static HomepageFragmentHomeBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        RelativeLayout relativeLayout = (RelativeLayout) rootView;
        int i = R.id.homepage_all_data_iv;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
        if (appCompatImageView != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.homepage_bar_avatar))) != null) {
            i = R.id.homepage_card_container;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
            if (frameLayout != null) {
                i = R.id.homepage_connect_animator;
                HomeRefreshAnimator homeRefreshAnimator = (HomeRefreshAnimator) ViewBindings.findChildViewById(rootView, i);
                if (homeRefreshAnimator != null) {
                    i = R.id.homepage_device_status;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                    if (textView != null) {
                        i = R.id.homepage_imageview;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                        if (imageView != null) {
                            i = R.id.homepage_logo;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                            if (appCompatImageView2 != null) {
                                i = R.id.homepage_promotion_container;
                                FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                                if (frameLayout2 != null) {
                                    i = R.id.homepage_refresh_header;
                                    HomeRefreshHeader homeRefreshHeader = (HomeRefreshHeader) ViewBindings.findChildViewById(rootView, i);
                                    if (homeRefreshHeader != null) {
                                        i = R.id.homepage_scroll;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, i);
                                        if (nestedScrollView != null) {
                                            i = R.id.homepage_server_fault;
                                            ServerFaultView serverFaultView = (ServerFaultView) ViewBindings.findChildViewById(rootView, i);
                                            if (serverFaultView != null) {
                                                i = R.id.homepage_sleep_aid;
                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, i);
                                                if (appCompatImageView3 != null) {
                                                    i = R.id.homepage_srl;
                                                    HomeRefreshLayout homeRefreshLayout = (HomeRefreshLayout) ViewBindings.findChildViewById(rootView, i);
                                                    if (homeRefreshLayout != null) {
                                                        i = R.id.homepage_status;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                                        if (constraintLayout != null) {
                                                            return new HomepageFragmentHomeBinding(relativeLayout, relativeLayout, appCompatImageView, viewFindChildViewById, frameLayout, homeRefreshAnimator, textView, imageView, appCompatImageView2, frameLayout2, homeRefreshHeader, nestedScrollView, serverFaultView, appCompatImageView3, homeRefreshLayout, constraintLayout);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static HomepageFragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static HomepageFragmentHomeBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.homepage_fragment_home, parent, false);
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
