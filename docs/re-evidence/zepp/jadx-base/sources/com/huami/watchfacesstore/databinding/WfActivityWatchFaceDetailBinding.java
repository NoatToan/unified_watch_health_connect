package com.huami.watchfacesstore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.watchfacesstore.R;
import com.huami.watchfacesstore.view.CommonTitleBar;
import com.huami.watchfacesstore.view.WatchFaceProgressView;

/* JADX INFO: loaded from: classes17.dex */
public final class WfActivityWatchFaceDetailBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final WatchFaceProgressView btnSync;

    @NonNull
    public final ConstraintLayout clDeviceDetail;

    @NonNull
    public final CommonTitleBar commonTitleBar;

    @NonNull
    public final View divider;

    @NonNull
    public final View divider2;

    @NonNull
    public final View divider3;

    @NonNull
    public final FrameLayout flImage;

    @NonNull
    public final Group groupColor;

    @NonNull
    public final Group groupDiy;

    @NonNull
    public final Group groupRecommend;

    @NonNull
    public final Group groupStyle;

    @NonNull
    public final ConstraintLayout infoLayout;

    @NonNull
    public final ImageView ivDeviceBg;

    @NonNull
    public final ImageView ivDevicePreview;

    @NonNull
    public final ImageView ivDeviceTransparent;

    @NonNull
    public final ImageView ivIsCollect;

    @NonNull
    public final ImageView ivWatchFaceChange;

    @NonNull
    public final NestedScrollView layoutContainer;

    @NonNull
    public final TextView moneyTv;

    @NonNull
    public final LinearLayout packageInfoLayout;

    @NonNull
    public final View packageSizeDivider;

    @NonNull
    public final TextView packageSizeTv;

    @NonNull
    public final View publisherNameDivider;

    @NonNull
    public final TextView publisherNameTv;

    @NonNull
    public final RecyclerView rlColorList;

    @NonNull
    public final RecyclerView rlRecommend;

    @NonNull
    public final RecyclerView rlStyleList;

    @NonNull
    public final ConstraintLayout syncArea;

    @NonNull
    public final TextView tvDiyTip;

    @NonNull
    public final TextView tvPowerConsumptionLong;

    @NonNull
    public final TextView tvPowerConsumptionShort;

    @NonNull
    public final TextView tvRecommendTitle;

    @NonNull
    public final TextView tvWatchFaceColor;

    @NonNull
    public final TextView tvWatchFaceDiyLabel;

    @NonNull
    public final TextView tvWatchFaceIntro;

    @NonNull
    public final TextView tvWatchFaceName;

    @NonNull
    public final TextView tvWatchFaceStyle;

    private WfActivityWatchFaceDetailBinding(@NonNull LinearLayout rootView, @NonNull WatchFaceProgressView btnSync, @NonNull ConstraintLayout clDeviceDetail, @NonNull CommonTitleBar commonTitleBar, @NonNull View divider, @NonNull View divider2, @NonNull View divider3, @NonNull FrameLayout flImage, @NonNull Group groupColor, @NonNull Group groupDiy, @NonNull Group groupRecommend, @NonNull Group groupStyle, @NonNull ConstraintLayout infoLayout, @NonNull ImageView ivDeviceBg, @NonNull ImageView ivDevicePreview, @NonNull ImageView ivDeviceTransparent, @NonNull ImageView ivIsCollect, @NonNull ImageView ivWatchFaceChange, @NonNull NestedScrollView layoutContainer, @NonNull TextView moneyTv, @NonNull LinearLayout packageInfoLayout, @NonNull View packageSizeDivider, @NonNull TextView packageSizeTv, @NonNull View publisherNameDivider, @NonNull TextView publisherNameTv, @NonNull RecyclerView rlColorList, @NonNull RecyclerView rlRecommend, @NonNull RecyclerView rlStyleList, @NonNull ConstraintLayout syncArea, @NonNull TextView tvDiyTip, @NonNull TextView tvPowerConsumptionLong, @NonNull TextView tvPowerConsumptionShort, @NonNull TextView tvRecommendTitle, @NonNull TextView tvWatchFaceColor, @NonNull TextView tvWatchFaceDiyLabel, @NonNull TextView tvWatchFaceIntro, @NonNull TextView tvWatchFaceName, @NonNull TextView tvWatchFaceStyle) {
        this.a = rootView;
        this.btnSync = btnSync;
        this.clDeviceDetail = clDeviceDetail;
        this.commonTitleBar = commonTitleBar;
        this.divider = divider;
        this.divider2 = divider2;
        this.divider3 = divider3;
        this.flImage = flImage;
        this.groupColor = groupColor;
        this.groupDiy = groupDiy;
        this.groupRecommend = groupRecommend;
        this.groupStyle = groupStyle;
        this.infoLayout = infoLayout;
        this.ivDeviceBg = ivDeviceBg;
        this.ivDevicePreview = ivDevicePreview;
        this.ivDeviceTransparent = ivDeviceTransparent;
        this.ivIsCollect = ivIsCollect;
        this.ivWatchFaceChange = ivWatchFaceChange;
        this.layoutContainer = layoutContainer;
        this.moneyTv = moneyTv;
        this.packageInfoLayout = packageInfoLayout;
        this.packageSizeDivider = packageSizeDivider;
        this.packageSizeTv = packageSizeTv;
        this.publisherNameDivider = publisherNameDivider;
        this.publisherNameTv = publisherNameTv;
        this.rlColorList = rlColorList;
        this.rlRecommend = rlRecommend;
        this.rlStyleList = rlStyleList;
        this.syncArea = syncArea;
        this.tvDiyTip = tvDiyTip;
        this.tvPowerConsumptionLong = tvPowerConsumptionLong;
        this.tvPowerConsumptionShort = tvPowerConsumptionShort;
        this.tvRecommendTitle = tvRecommendTitle;
        this.tvWatchFaceColor = tvWatchFaceColor;
        this.tvWatchFaceDiyLabel = tvWatchFaceDiyLabel;
        this.tvWatchFaceIntro = tvWatchFaceIntro;
        this.tvWatchFaceName = tvWatchFaceName;
        this.tvWatchFaceStyle = tvWatchFaceStyle;
    }

    @NonNull
    public static WfActivityWatchFaceDetailBinding bind(@NonNull View rootView) {
        View viewFindChildViewById;
        View viewFindChildViewById2;
        View viewFindChildViewById3;
        View viewFindChildViewById4;
        View viewFindChildViewById5;
        int i = R.id.btn_sync;
        WatchFaceProgressView watchFaceProgressView = (WatchFaceProgressView) ViewBindings.findChildViewById(rootView, i);
        if (watchFaceProgressView != null) {
            i = R.id.cl_device_detail;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
            if (constraintLayout != null) {
                i = R.id.common_title_bar;
                CommonTitleBar commonTitleBar = (CommonTitleBar) ViewBindings.findChildViewById(rootView, i);
                if (commonTitleBar != null && (viewFindChildViewById = ViewBindings.findChildViewById(rootView, (i = R.id.divider))) != null && (viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, (i = R.id.divider2))) != null && (viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, (i = R.id.divider3))) != null) {
                    i = R.id.fl_image;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, i);
                    if (frameLayout != null) {
                        i = R.id.group_color;
                        Group group = (Group) ViewBindings.findChildViewById(rootView, i);
                        if (group != null) {
                            i = R.id.group_diy;
                            Group group2 = (Group) ViewBindings.findChildViewById(rootView, i);
                            if (group2 != null) {
                                i = R.id.group_recommend;
                                Group group3 = (Group) ViewBindings.findChildViewById(rootView, i);
                                if (group3 != null) {
                                    i = R.id.group_style;
                                    Group group4 = (Group) ViewBindings.findChildViewById(rootView, i);
                                    if (group4 != null) {
                                        i = R.id.infoLayout;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                        if (constraintLayout2 != null) {
                                            i = R.id.iv_device_bg;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                            if (imageView != null) {
                                                i = R.id.iv_device_preview;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                if (imageView2 != null) {
                                                    i = R.id.iv_device_transparent;
                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                    if (imageView3 != null) {
                                                        i = R.id.iv_is_collect;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                        if (imageView4 != null) {
                                                            i = R.id.iv_watch_face_change;
                                                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                                                            if (imageView5 != null) {
                                                                i = R.id.layout_container;
                                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, i);
                                                                if (nestedScrollView != null) {
                                                                    i = R.id.moneyTv;
                                                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                    if (textView != null) {
                                                                        i = R.id.packageInfoLayout;
                                                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                                                                        if (linearLayout != null && (viewFindChildViewById4 = ViewBindings.findChildViewById(rootView, (i = R.id.packageSizeDivider))) != null) {
                                                                            i = R.id.packageSizeTv;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                            if (textView2 != null && (viewFindChildViewById5 = ViewBindings.findChildViewById(rootView, (i = R.id.publisherNameDivider))) != null) {
                                                                                i = R.id.publisherNameTv;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.rl_color_list;
                                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                                                                                    if (recyclerView != null) {
                                                                                        i = R.id.rl_recommend;
                                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                                                                                        if (recyclerView2 != null) {
                                                                                            i = R.id.rl_style_list;
                                                                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(rootView, i);
                                                                                            if (recyclerView3 != null) {
                                                                                                i = R.id.sync_area;
                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
                                                                                                if (constraintLayout3 != null) {
                                                                                                    i = R.id.tv_diy_tip;
                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                    if (textView4 != null) {
                                                                                                        i = R.id.tv_power_consumption_long;
                                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                        if (textView5 != null) {
                                                                                                            i = R.id.tv_power_consumption_short;
                                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                            if (textView6 != null) {
                                                                                                                i = R.id.tv_recommend_title;
                                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                if (textView7 != null) {
                                                                                                                    i = R.id.tv_watch_face_color;
                                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                    if (textView8 != null) {
                                                                                                                        i = R.id.tv_watch_face_diy_label;
                                                                                                                        TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                        if (textView9 != null) {
                                                                                                                            i = R.id.tv_watch_face_intro;
                                                                                                                            TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                            if (textView10 != null) {
                                                                                                                                i = R.id.tv_watch_face_name;
                                                                                                                                TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                if (textView11 != null) {
                                                                                                                                    i = R.id.tv_watch_face_style;
                                                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, i);
                                                                                                                                    if (textView12 != null) {
                                                                                                                                        return new WfActivityWatchFaceDetailBinding((LinearLayout) rootView, watchFaceProgressView, constraintLayout, commonTitleBar, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, frameLayout, group, group2, group3, group4, constraintLayout2, imageView, imageView2, imageView3, imageView4, imageView5, nestedScrollView, textView, linearLayout, viewFindChildViewById4, textView2, viewFindChildViewById5, textView3, recyclerView, recyclerView2, recyclerView3, constraintLayout3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static WfActivityWatchFaceDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static WfActivityWatchFaceDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.wf_activity_watch_face_detail, parent, false);
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
