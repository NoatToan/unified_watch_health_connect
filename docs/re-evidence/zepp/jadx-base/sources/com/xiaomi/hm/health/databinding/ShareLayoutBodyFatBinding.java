package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.CircleImageView;
import com.huami.lib.view.text.UnitTextView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.view.ShareItemView;

/* JADX INFO: loaded from: classes20.dex */
public final class ShareLayoutBodyFatBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final RecyclerView allParamRv;

    @NonNull
    public final RelativeLayout allRl;

    @NonNull
    public final Button backButton;

    @NonNull
    public final RelativeLayout contentBase;

    @NonNull
    public final View filler;

    @NonNull
    public final ShareItemView firstItem;

    @NonNull
    public final ListView focusGoalList;

    @NonNull
    public final TextView focusGoalTitle;

    @NonNull
    public final ImageView icon;

    @NonNull
    public final RelativeLayout partRl;

    @NonNull
    public final RelativeLayout reachGoalLayout;

    @NonNull
    public final ListView reachGoalList;

    @NonNull
    public final TextView reachGoalTitle;

    @NonNull
    public final RelativeLayout rootLayout;

    @NonNull
    public final ScrollView scrollBase;

    @NonNull
    public final ShareItemView secondItem;

    @NonNull
    public final ImageView shareAchieveMarkView;

    @NonNull
    public final View shareBarBg;

    @NonNull
    public final RelativeLayout shareBgRl;

    @NonNull
    public final LinearLayout shareDetailLayout;

    @NonNull
    public final RelativeLayout shareDetailLayout1;

    @NonNull
    public final View shareDividerLine;

    @NonNull
    public final ToggleButton shareHiddenIcon;

    @NonNull
    public final CircleImageView shareIcon;

    @NonNull
    public final ImageView shareLeftArrow;

    @NonNull
    public final RelativeLayout shareLogo;

    @NonNull
    public final FrameLayout sharePaneContainer;

    @NonNull
    public final ImageView shareRightArrow;

    @NonNull
    public final RelativeLayout shareTop;

    @NonNull
    public final TextView shareUsername;

    @NonNull
    public final TextView shareValueDate;

    @NonNull
    public final TextView shareValueDateChange;

    @NonNull
    public final RelativeLayout shareValueLayout;

    @NonNull
    public final TextView shareValueTitle;

    @NonNull
    public final ShareItemView thirdItem;

    @NonNull
    public final TextView title;

    @NonNull
    public final FrameLayout titleBarBack;

    @NonNull
    public final ImageView tvLogo;

    @NonNull
    public final UnitTextView unitText;

    @NonNull
    public final ListView unreachGoalList;

    @NonNull
    public final TextView unreachGoalTitle;

    @NonNull
    public final RelativeLayout weightItem;

    @NonNull
    public final UnitTextView weightItemValue;

    private ShareLayoutBodyFatBinding(@NonNull RelativeLayout rootView, @NonNull RecyclerView allParamRv, @NonNull RelativeLayout allRl, @NonNull Button backButton, @NonNull RelativeLayout contentBase, @NonNull View filler, @NonNull ShareItemView firstItem, @NonNull ListView focusGoalList, @NonNull TextView focusGoalTitle, @NonNull ImageView icon, @NonNull RelativeLayout partRl, @NonNull RelativeLayout reachGoalLayout, @NonNull ListView reachGoalList, @NonNull TextView reachGoalTitle, @NonNull RelativeLayout rootLayout, @NonNull ScrollView scrollBase, @NonNull ShareItemView secondItem, @NonNull ImageView shareAchieveMarkView, @NonNull View shareBarBg, @NonNull RelativeLayout shareBgRl, @NonNull LinearLayout shareDetailLayout, @NonNull RelativeLayout shareDetailLayout1, @NonNull View shareDividerLine, @NonNull ToggleButton shareHiddenIcon, @NonNull CircleImageView shareIcon, @NonNull ImageView shareLeftArrow, @NonNull RelativeLayout shareLogo, @NonNull FrameLayout sharePaneContainer, @NonNull ImageView shareRightArrow, @NonNull RelativeLayout shareTop, @NonNull TextView shareUsername, @NonNull TextView shareValueDate, @NonNull TextView shareValueDateChange, @NonNull RelativeLayout shareValueLayout, @NonNull TextView shareValueTitle, @NonNull ShareItemView thirdItem, @NonNull TextView title, @NonNull FrameLayout titleBarBack, @NonNull ImageView tvLogo, @NonNull UnitTextView unitText, @NonNull ListView unreachGoalList, @NonNull TextView unreachGoalTitle, @NonNull RelativeLayout weightItem, @NonNull UnitTextView weightItemValue) {
        this.a = rootView;
        this.allParamRv = allParamRv;
        this.allRl = allRl;
        this.backButton = backButton;
        this.contentBase = contentBase;
        this.filler = filler;
        this.firstItem = firstItem;
        this.focusGoalList = focusGoalList;
        this.focusGoalTitle = focusGoalTitle;
        this.icon = icon;
        this.partRl = partRl;
        this.reachGoalLayout = reachGoalLayout;
        this.reachGoalList = reachGoalList;
        this.reachGoalTitle = reachGoalTitle;
        this.rootLayout = rootLayout;
        this.scrollBase = scrollBase;
        this.secondItem = secondItem;
        this.shareAchieveMarkView = shareAchieveMarkView;
        this.shareBarBg = shareBarBg;
        this.shareBgRl = shareBgRl;
        this.shareDetailLayout = shareDetailLayout;
        this.shareDetailLayout1 = shareDetailLayout1;
        this.shareDividerLine = shareDividerLine;
        this.shareHiddenIcon = shareHiddenIcon;
        this.shareIcon = shareIcon;
        this.shareLeftArrow = shareLeftArrow;
        this.shareLogo = shareLogo;
        this.sharePaneContainer = sharePaneContainer;
        this.shareRightArrow = shareRightArrow;
        this.shareTop = shareTop;
        this.shareUsername = shareUsername;
        this.shareValueDate = shareValueDate;
        this.shareValueDateChange = shareValueDateChange;
        this.shareValueLayout = shareValueLayout;
        this.shareValueTitle = shareValueTitle;
        this.thirdItem = thirdItem;
        this.title = title;
        this.titleBarBack = titleBarBack;
        this.tvLogo = tvLogo;
        this.unitText = unitText;
        this.unreachGoalList = unreachGoalList;
        this.unreachGoalTitle = unreachGoalTitle;
        this.weightItem = weightItem;
        this.weightItemValue = weightItemValue;
    }

    @NonNull
    public static ShareLayoutBodyFatBinding bind(@NonNull View rootView) {
        int i = R.id.all_param_rv;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.all_param_rv);
        if (recyclerView != null) {
            i = R.id.all_rl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.all_rl);
            if (relativeLayout != null) {
                i = R.id.back_button;
                Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.back_button);
                if (button != null) {
                    i = R.id.content_base;
                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.content_base);
                    if (relativeLayout2 != null) {
                        i = R.id.filler;
                        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.filler);
                        if (viewFindChildViewById != null) {
                            i = R.id.first_item;
                            ShareItemView shareItemView = (ShareItemView) ViewBindings.findChildViewById(rootView, R.id.first_item);
                            if (shareItemView != null) {
                                i = R.id.focus_goal_list;
                                ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.focus_goal_list);
                                if (listView != null) {
                                    i = R.id.focus_goal_title;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.focus_goal_title);
                                    if (textView != null) {
                                        i = R.id.icon;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                                        if (imageView != null) {
                                            i = R.id.part_rl;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.part_rl);
                                            if (relativeLayout3 != null) {
                                                i = R.id.reach_goal_layout;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.reach_goal_layout);
                                                if (relativeLayout4 != null) {
                                                    i = R.id.reach_goal_list;
                                                    ListView listView2 = (ListView) ViewBindings.findChildViewById(rootView, R.id.reach_goal_list);
                                                    if (listView2 != null) {
                                                        i = R.id.reach_goal_title;
                                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.reach_goal_title);
                                                        if (textView2 != null) {
                                                            RelativeLayout relativeLayout5 = (RelativeLayout) rootView;
                                                            i = R.id.scroll_base;
                                                            ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.scroll_base);
                                                            if (scrollView != null) {
                                                                i = R.id.second_item;
                                                                ShareItemView shareItemView2 = (ShareItemView) ViewBindings.findChildViewById(rootView, R.id.second_item);
                                                                if (shareItemView2 != null) {
                                                                    i = R.id.share_achieve_mark_view;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_achieve_mark_view);
                                                                    if (imageView2 != null) {
                                                                        i = R.id.share_bar_bg;
                                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.share_bar_bg);
                                                                        if (viewFindChildViewById2 != null) {
                                                                            i = R.id.share_bg_rl;
                                                                            RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_bg_rl);
                                                                            if (relativeLayout6 != null) {
                                                                                i = R.id.share_detail_layout;
                                                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_detail_layout);
                                                                                if (linearLayout != null) {
                                                                                    i = R.id.share_detail_layout1;
                                                                                    RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_detail_layout1);
                                                                                    if (relativeLayout7 != null) {
                                                                                        i = R.id.share_divider_line;
                                                                                        View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.share_divider_line);
                                                                                        if (viewFindChildViewById3 != null) {
                                                                                            i = R.id.share_hidden_icon;
                                                                                            ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(rootView, R.id.share_hidden_icon);
                                                                                            if (toggleButton != null) {
                                                                                                i = R.id.share_icon;
                                                                                                CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.share_icon);
                                                                                                if (circleImageView != null) {
                                                                                                    i = R.id.share_left_arrow;
                                                                                                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_left_arrow);
                                                                                                    if (imageView3 != null) {
                                                                                                        i = R.id.share_logo;
                                                                                                        RelativeLayout relativeLayout8 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_logo);
                                                                                                        if (relativeLayout8 != null) {
                                                                                                            i = R.id.share_pane_container;
                                                                                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.share_pane_container);
                                                                                                            if (frameLayout != null) {
                                                                                                                i = R.id.share_right_arrow;
                                                                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_right_arrow);
                                                                                                                if (imageView4 != null) {
                                                                                                                    i = R.id.share_top;
                                                                                                                    RelativeLayout relativeLayout9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_top);
                                                                                                                    if (relativeLayout9 != null) {
                                                                                                                        i = R.id.share_username;
                                                                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_username);
                                                                                                                        if (textView3 != null) {
                                                                                                                            i = R.id.share_value_date;
                                                                                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_value_date);
                                                                                                                            if (textView4 != null) {
                                                                                                                                i = R.id.share_value_date_change;
                                                                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_value_date_change);
                                                                                                                                if (textView5 != null) {
                                                                                                                                    i = R.id.share_value_layout;
                                                                                                                                    RelativeLayout relativeLayout10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_value_layout);
                                                                                                                                    if (relativeLayout10 != null) {
                                                                                                                                        i = R.id.share_value_title;
                                                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_value_title);
                                                                                                                                        if (textView6 != null) {
                                                                                                                                            i = R.id.third_item;
                                                                                                                                            ShareItemView shareItemView3 = (ShareItemView) ViewBindings.findChildViewById(rootView, R.id.third_item);
                                                                                                                                            if (shareItemView3 != null) {
                                                                                                                                                i = R.id.title;
                                                                                                                                                TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.title);
                                                                                                                                                if (textView7 != null) {
                                                                                                                                                    i = R.id.title_bar_back;
                                                                                                                                                    FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.title_bar_back);
                                                                                                                                                    if (frameLayout2 != null) {
                                                                                                                                                        i = R.id.tv_logo;
                                                                                                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_logo);
                                                                                                                                                        if (imageView5 != null) {
                                                                                                                                                            i = R.id.unit_text;
                                                                                                                                                            UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, R.id.unit_text);
                                                                                                                                                            if (unitTextView != null) {
                                                                                                                                                                i = R.id.unreach_goal_list;
                                                                                                                                                                ListView listView3 = (ListView) ViewBindings.findChildViewById(rootView, R.id.unreach_goal_list);
                                                                                                                                                                if (listView3 != null) {
                                                                                                                                                                    i = R.id.unreach_goal_title;
                                                                                                                                                                    TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.unreach_goal_title);
                                                                                                                                                                    if (textView8 != null) {
                                                                                                                                                                        i = R.id.weight_item;
                                                                                                                                                                        RelativeLayout relativeLayout11 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.weight_item);
                                                                                                                                                                        if (relativeLayout11 != null) {
                                                                                                                                                                            i = R.id.weight_item_value;
                                                                                                                                                                            UnitTextView unitTextView2 = (UnitTextView) ViewBindings.findChildViewById(rootView, R.id.weight_item_value);
                                                                                                                                                                            if (unitTextView2 != null) {
                                                                                                                                                                                return new ShareLayoutBodyFatBinding(relativeLayout5, recyclerView, relativeLayout, button, relativeLayout2, viewFindChildViewById, shareItemView, listView, textView, imageView, relativeLayout3, relativeLayout4, listView2, textView2, relativeLayout5, scrollView, shareItemView2, imageView2, viewFindChildViewById2, relativeLayout6, linearLayout, relativeLayout7, viewFindChildViewById3, toggleButton, circleImageView, imageView3, relativeLayout8, frameLayout, imageView4, relativeLayout9, textView3, textView4, textView5, relativeLayout10, textView6, shareItemView3, textView7, frameLayout2, imageView5, unitTextView, listView3, textView8, relativeLayout11, unitTextView2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ShareLayoutBodyFatBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ShareLayoutBodyFatBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.share_layout_body_fat, parent, false);
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
