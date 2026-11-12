package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.image.CircleImageView;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.view.ImageItem;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentMineOverseaLayoutBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView avatarInAudit;

    @NonNull
    public final View dividerMineDevice;

    @NonNull
    public final View dividerMineMore;

    @NonNull
    public final ListTile itemAnalyse;

    @NonNull
    public final ListTile itemFeedBack;

    @NonNull
    public final ListTile itemFriends;

    @NonNull
    public final ListTile itemMyRecord;

    @NonNull
    public final LinearLayout itemNpsLayout;

    @NonNull
    public final ListTile itemSettings;

    @NonNull
    public final ListTile itemSmart;

    @NonNull
    public final ListTile itemSportGoal;

    @NonNull
    public final ListTile itemThird;

    @NonNull
    public final ImageView ivDeviceFold;

    @NonNull
    public final ImageItem medal;

    @NonNull
    public final TextView mineAddDeviceBound;

    @NonNull
    public final ListTile mineCourse;

    @NonNull
    public final LinearLayout mineDeviceList;

    @NonNull
    public final TypefaceTextView mineDeviceTitle;

    @NonNull
    public final TypefaceTextView mineGoals;

    @NonNull
    public final Group mineGroup;

    @NonNull
    public final ImageView mineHeaderBg;

    @NonNull
    public final ImageItem mineHealth;

    @NonNull
    public final HMScrollView mineHmscrollview;

    @NonNull
    public final ConstraintLayout mineHomeDeviceCard;

    @NonNull
    public final ConstraintLayout mineHomeHeadCard;

    @NonNull
    public final ConstraintLayout mineHomeMoreCard;

    @NonNull
    public final ImageView mineMessage;

    @NonNull
    public final RelativeLayout mineMessageLayout;

    @NonNull
    public final TypefaceTextView mineMore;

    @NonNull
    public final CardView mineMoreLayout;

    @NonNull
    public final TypefaceTextView mineName;

    @NonNull
    public final ImageItem mineOrder;

    @NonNull
    public final CircleImageView minePersonIcon;

    @NonNull
    public final RelativeLayout mineToolbar;

    @NonNull
    public final TextView nicknameAudit;

    @NonNull
    public final Guideline pEnd;

    @NonNull
    public final Guideline pStart;

    @NonNull
    public final ImageItem report;

    @NonNull
    public final View topMask;

    @NonNull
    public final TextView tvAddDeviceTitle;

    @NonNull
    public final TextView tvRedDot;

    private FragmentMineOverseaLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull TextView avatarInAudit, @NonNull View dividerMineDevice, @NonNull View dividerMineMore, @NonNull ListTile itemAnalyse, @NonNull ListTile itemFeedBack, @NonNull ListTile itemFriends, @NonNull ListTile itemMyRecord, @NonNull LinearLayout itemNpsLayout, @NonNull ListTile itemSettings, @NonNull ListTile itemSmart, @NonNull ListTile itemSportGoal, @NonNull ListTile itemThird, @NonNull ImageView ivDeviceFold, @NonNull ImageItem medal, @NonNull TextView mineAddDeviceBound, @NonNull ListTile mineCourse, @NonNull LinearLayout mineDeviceList, @NonNull TypefaceTextView mineDeviceTitle, @NonNull TypefaceTextView mineGoals, @NonNull Group mineGroup, @NonNull ImageView mineHeaderBg, @NonNull ImageItem mineHealth, @NonNull HMScrollView mineHmscrollview, @NonNull ConstraintLayout mineHomeDeviceCard, @NonNull ConstraintLayout mineHomeHeadCard, @NonNull ConstraintLayout mineHomeMoreCard, @NonNull ImageView mineMessage, @NonNull RelativeLayout mineMessageLayout, @NonNull TypefaceTextView mineMore, @NonNull CardView mineMoreLayout, @NonNull TypefaceTextView mineName, @NonNull ImageItem mineOrder, @NonNull CircleImageView minePersonIcon, @NonNull RelativeLayout mineToolbar, @NonNull TextView nicknameAudit, @NonNull Guideline pEnd, @NonNull Guideline pStart, @NonNull ImageItem report, @NonNull View topMask, @NonNull TextView tvAddDeviceTitle, @NonNull TextView tvRedDot) {
        this.a = rootView;
        this.avatarInAudit = avatarInAudit;
        this.dividerMineDevice = dividerMineDevice;
        this.dividerMineMore = dividerMineMore;
        this.itemAnalyse = itemAnalyse;
        this.itemFeedBack = itemFeedBack;
        this.itemFriends = itemFriends;
        this.itemMyRecord = itemMyRecord;
        this.itemNpsLayout = itemNpsLayout;
        this.itemSettings = itemSettings;
        this.itemSmart = itemSmart;
        this.itemSportGoal = itemSportGoal;
        this.itemThird = itemThird;
        this.ivDeviceFold = ivDeviceFold;
        this.medal = medal;
        this.mineAddDeviceBound = mineAddDeviceBound;
        this.mineCourse = mineCourse;
        this.mineDeviceList = mineDeviceList;
        this.mineDeviceTitle = mineDeviceTitle;
        this.mineGoals = mineGoals;
        this.mineGroup = mineGroup;
        this.mineHeaderBg = mineHeaderBg;
        this.mineHealth = mineHealth;
        this.mineHmscrollview = mineHmscrollview;
        this.mineHomeDeviceCard = mineHomeDeviceCard;
        this.mineHomeHeadCard = mineHomeHeadCard;
        this.mineHomeMoreCard = mineHomeMoreCard;
        this.mineMessage = mineMessage;
        this.mineMessageLayout = mineMessageLayout;
        this.mineMore = mineMore;
        this.mineMoreLayout = mineMoreLayout;
        this.mineName = mineName;
        this.mineOrder = mineOrder;
        this.minePersonIcon = minePersonIcon;
        this.mineToolbar = mineToolbar;
        this.nicknameAudit = nicknameAudit;
        this.pEnd = pEnd;
        this.pStart = pStart;
        this.report = report;
        this.topMask = topMask;
        this.tvAddDeviceTitle = tvAddDeviceTitle;
        this.tvRedDot = tvRedDot;
    }

    @NonNull
    public static FragmentMineOverseaLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.avatar_in_audit;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.avatar_in_audit);
        if (textView != null) {
            i = R.id.divider_mine_device;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.divider_mine_device);
            if (viewFindChildViewById != null) {
                i = R.id.divider_mine_more;
                View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.divider_mine_more);
                if (viewFindChildViewById2 != null) {
                    i = R.id.item_analyse;
                    ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_analyse);
                    if (listTile != null) {
                        i = R.id.item_feed_back;
                        ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_feed_back);
                        if (listTile2 != null) {
                            i = R.id.item_friends;
                            ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_friends);
                            if (listTile3 != null) {
                                i = R.id.item_my_record;
                                ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_my_record);
                                if (listTile4 != null) {
                                    i = R.id.item_nps_layout;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.item_nps_layout);
                                    if (linearLayout != null) {
                                        i = R.id.item_settings;
                                        ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_settings);
                                        if (listTile5 != null) {
                                            i = R.id.item_smart;
                                            ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_smart);
                                            if (listTile6 != null) {
                                                i = R.id.item_sport_goal;
                                                ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_sport_goal);
                                                if (listTile7 != null) {
                                                    i = R.id.item_third;
                                                    ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.item_third);
                                                    if (listTile8 != null) {
                                                        i = R.id.iv_device_fold;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_device_fold);
                                                        if (imageView != null) {
                                                            i = R.id.medal;
                                                            ImageItem imageItem = (ImageItem) ViewBindings.findChildViewById(rootView, R.id.medal);
                                                            if (imageItem != null) {
                                                                i = R.id.mine_add_device_bound;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.mine_add_device_bound);
                                                                if (textView2 != null) {
                                                                    i = R.id.mine_course;
                                                                    ListTile listTile9 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.mine_course);
                                                                    if (listTile9 != null) {
                                                                        i = R.id.mine_device_list;
                                                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.mine_device_list);
                                                                        if (linearLayout2 != null) {
                                                                            i = R.id.mine_device_title;
                                                                            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.mine_device_title);
                                                                            if (typefaceTextView != null) {
                                                                                i = R.id.mine_goals;
                                                                                TypefaceTextView typefaceTextView2 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.mine_goals);
                                                                                if (typefaceTextView2 != null) {
                                                                                    i = R.id.mine_group;
                                                                                    Group group = (Group) ViewBindings.findChildViewById(rootView, R.id.mine_group);
                                                                                    if (group != null) {
                                                                                        i = R.id.mine_header_bg;
                                                                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.mine_header_bg);
                                                                                        if (imageView2 != null) {
                                                                                            i = R.id.mine_health;
                                                                                            ImageItem imageItem2 = (ImageItem) ViewBindings.findChildViewById(rootView, R.id.mine_health);
                                                                                            if (imageItem2 != null) {
                                                                                                i = R.id.mine_hmscrollview;
                                                                                                HMScrollView hMScrollView = (HMScrollView) ViewBindings.findChildViewById(rootView, R.id.mine_hmscrollview);
                                                                                                if (hMScrollView != null) {
                                                                                                    i = R.id.mine_home_device_card;
                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.mine_home_device_card);
                                                                                                    if (constraintLayout != null) {
                                                                                                        i = R.id.mine_home_head_card;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.mine_home_head_card);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i = R.id.mine_home_more_card;
                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(rootView, R.id.mine_home_more_card);
                                                                                                            if (constraintLayout3 != null) {
                                                                                                                i = R.id.mine_message;
                                                                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.mine_message);
                                                                                                                if (imageView3 != null) {
                                                                                                                    i = R.id.mine_message_layout;
                                                                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.mine_message_layout);
                                                                                                                    if (relativeLayout != null) {
                                                                                                                        i = R.id.mine_more;
                                                                                                                        TypefaceTextView typefaceTextView3 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.mine_more);
                                                                                                                        if (typefaceTextView3 != null) {
                                                                                                                            i = R.id.mine_more_layout;
                                                                                                                            CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, R.id.mine_more_layout);
                                                                                                                            if (cardView != null) {
                                                                                                                                i = R.id.mine_name;
                                                                                                                                TypefaceTextView typefaceTextView4 = (TypefaceTextView) ViewBindings.findChildViewById(rootView, R.id.mine_name);
                                                                                                                                if (typefaceTextView4 != null) {
                                                                                                                                    i = R.id.mine_order;
                                                                                                                                    ImageItem imageItem3 = (ImageItem) ViewBindings.findChildViewById(rootView, R.id.mine_order);
                                                                                                                                    if (imageItem3 != null) {
                                                                                                                                        i = R.id.mine_person_icon;
                                                                                                                                        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.mine_person_icon);
                                                                                                                                        if (circleImageView != null) {
                                                                                                                                            i = R.id.mine_toolbar;
                                                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.mine_toolbar);
                                                                                                                                            if (relativeLayout2 != null) {
                                                                                                                                                i = R.id.nickname_audit;
                                                                                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.nickname_audit);
                                                                                                                                                if (textView3 != null) {
                                                                                                                                                    i = R.id.p_end;
                                                                                                                                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(rootView, R.id.p_end);
                                                                                                                                                    if (guideline != null) {
                                                                                                                                                        i = R.id.p_start;
                                                                                                                                                        Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(rootView, R.id.p_start);
                                                                                                                                                        if (guideline2 != null) {
                                                                                                                                                            i = R.id.report;
                                                                                                                                                            ImageItem imageItem4 = (ImageItem) ViewBindings.findChildViewById(rootView, R.id.report);
                                                                                                                                                            if (imageItem4 != null) {
                                                                                                                                                                i = R.id.top_mask;
                                                                                                                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.top_mask);
                                                                                                                                                                if (viewFindChildViewById3 != null) {
                                                                                                                                                                    i = R.id.tv_add_device_title;
                                                                                                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_add_device_title);
                                                                                                                                                                    if (textView4 != null) {
                                                                                                                                                                        i = R.id.tv_red_dot;
                                                                                                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_red_dot);
                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                            return new FragmentMineOverseaLayoutBinding((ConstraintLayout) rootView, textView, viewFindChildViewById, viewFindChildViewById2, listTile, listTile2, listTile3, listTile4, linearLayout, listTile5, listTile6, listTile7, listTile8, imageView, imageItem, textView2, listTile9, linearLayout2, typefaceTextView, typefaceTextView2, group, imageView2, imageItem2, hMScrollView, constraintLayout, constraintLayout2, constraintLayout3, imageView3, relativeLayout, typefaceTextView3, cardView, typefaceTextView4, imageItem3, circleImageView, relativeLayout2, textView3, guideline, guideline2, imageItem4, viewFindChildViewById3, textView4, textView5);
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
    public static FragmentMineOverseaLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentMineOverseaLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_mine_oversea_layout, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
