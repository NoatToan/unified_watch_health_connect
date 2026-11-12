package com.huami.devicex.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.watch_skin.WatchSkinProgressView;

/* JADX INFO: loaded from: classes7.dex */
public final class ActivityWatchSkinDetailBinding implements ViewBinding {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final View addSkinBg;

    @NonNull
    public final FrameLayout addView;

    @NonNull
    public final CardView cardView;

    @NonNull
    public final ImageView cincoBgImg;

    @NonNull
    public final FrameLayout cincoContainer;

    @NonNull
    public final ImageView cincoTransparentImg;

    @NonNull
    public final ImageView closeMoreColorIcon;

    @NonNull
    public final FrameLayout colorContainer;

    @NonNull
    public final FrameLayout disableMask;

    @NonNull
    public final View dividerColor;

    @NonNull
    public final NestedScrollView layoutContainer;

    @NonNull
    public final LinearLayout layoutCustomize;

    @NonNull
    public final FrameLayout openVipLayout;

    @NonNull
    public final TextView openVipTv;

    @NonNull
    public final RecyclerView selectColorRv;

    @NonNull
    public final RecyclerView selectMoreColorRv;

    @NonNull
    public final WatchSkinProgressView syncApplyBtn;

    @NonNull
    public final TextView tvColor;

    @NonNull
    public final TextView watchSkinBuyTv;

    @NonNull
    public final ImageView watchSkinCollectIv;

    @NonNull
    public final TextView watchSkinDetail;

    @NonNull
    public final TextView watchSkinDetailStar;

    @NonNull
    public final TextView watchSkinDetailTitle;

    @NonNull
    public final ImageView watchSkinLargeIv;

    @NonNull
    public final AppCompatRatingBar watchSkinRate;

    @NonNull
    public final LinearLayout watchSkinStarLayout;

    @NonNull
    public final TextView watchSkinVipTipsTv;

    private ActivityWatchSkinDetailBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull FrameLayout frameLayout2, @NonNull CardView cardView, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout3, @NonNull ImageView imageView2, @NonNull ImageView imageView3, @NonNull FrameLayout frameLayout4, @NonNull FrameLayout frameLayout5, @NonNull View view2, @NonNull NestedScrollView nestedScrollView, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout6, @NonNull TextView textView, @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2, @NonNull WatchSkinProgressView watchSkinProgressView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull ImageView imageView4, @NonNull TextView textView4, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull ImageView imageView5, @NonNull AppCompatRatingBar appCompatRatingBar, @NonNull LinearLayout linearLayout2, @NonNull TextView textView7) {
        this.a = frameLayout;
        this.addSkinBg = view;
        this.addView = frameLayout2;
        this.cardView = cardView;
        this.cincoBgImg = imageView;
        this.cincoContainer = frameLayout3;
        this.cincoTransparentImg = imageView2;
        this.closeMoreColorIcon = imageView3;
        this.colorContainer = frameLayout4;
        this.disableMask = frameLayout5;
        this.dividerColor = view2;
        this.layoutContainer = nestedScrollView;
        this.layoutCustomize = linearLayout;
        this.openVipLayout = frameLayout6;
        this.openVipTv = textView;
        this.selectColorRv = recyclerView;
        this.selectMoreColorRv = recyclerView2;
        this.syncApplyBtn = watchSkinProgressView;
        this.tvColor = textView2;
        this.watchSkinBuyTv = textView3;
        this.watchSkinCollectIv = imageView4;
        this.watchSkinDetail = textView4;
        this.watchSkinDetailStar = textView5;
        this.watchSkinDetailTitle = textView6;
        this.watchSkinLargeIv = imageView5;
        this.watchSkinRate = appCompatRatingBar;
        this.watchSkinStarLayout = linearLayout2;
        this.watchSkinVipTipsTv = textView7;
    }

    @NonNull
    public static ActivityWatchSkinDetailBinding bind(@NonNull View view) {
        View viewFindChildViewById;
        int i = R.id.add_skin_bg;
        View viewFindChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (viewFindChildViewById2 != null) {
            i = R.id.add_view;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.card_view;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.cinco_bg_img;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.cinco_container;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            i = R.id.cinco_transparent_img;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.close_more_color_icon;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.color_container;
                                    FrameLayout frameLayout3 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (frameLayout3 != null) {
                                        i = R.id.disable_mask;
                                        FrameLayout frameLayout4 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout4 != null && (viewFindChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider_color))) != null) {
                                            i = R.id.layout_container;
                                            NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                            if (nestedScrollView != null) {
                                                i = R.id.layout_customize;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout != null) {
                                                    i = R.id.open_vip_layout;
                                                    FrameLayout frameLayout5 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                                    if (frameLayout5 != null) {
                                                        i = R.id.open_vip_tv;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                                        if (textView != null) {
                                                            i = R.id.select_color_rv;
                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                            if (recyclerView != null) {
                                                                i = R.id.select_more_color_rv;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                if (recyclerView2 != null) {
                                                                    i = R.id.sync_apply_btn;
                                                                    WatchSkinProgressView watchSkinProgressView = (WatchSkinProgressView) ViewBindings.findChildViewById(view, i);
                                                                    if (watchSkinProgressView != null) {
                                                                        i = R.id.tv_color;
                                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                        if (textView2 != null) {
                                                                            i = R.id.watch_skin_buy_tv;
                                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                            if (textView3 != null) {
                                                                                i = R.id.watch_skin_collect_iv;
                                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                if (imageView4 != null) {
                                                                                    i = R.id.watch_skin_detail;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.watch_skin_detail_star;
                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textView5 != null) {
                                                                                            i = R.id.watch_skin_detail_title;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (textView6 != null) {
                                                                                                i = R.id.watch_skin_large_iv;
                                                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                if (imageView5 != null) {
                                                                                                    i = R.id.watch_skin_rate;
                                                                                                    AppCompatRatingBar appCompatRatingBar = (AppCompatRatingBar) ViewBindings.findChildViewById(view, i);
                                                                                                    if (appCompatRatingBar != null) {
                                                                                                        i = R.id.watch_skin_star_layout;
                                                                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                                        if (linearLayout2 != null) {
                                                                                                            i = R.id.watch_skin_vip_tips_tv;
                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textView7 != null) {
                                                                                                                return new ActivityWatchSkinDetailBinding((FrameLayout) view, viewFindChildViewById2, frameLayout, cardView, imageView, frameLayout2, imageView2, imageView3, frameLayout3, frameLayout4, viewFindChildViewById, nestedScrollView, linearLayout, frameLayout5, textView, recyclerView, recyclerView2, watchSkinProgressView, textView2, textView3, imageView4, textView4, textView5, textView6, imageView5, appCompatRatingBar, linearLayout2, textView7);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityWatchSkinDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityWatchSkinDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_watch_skin_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.a;
    }
}
