package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.view.image.CircleImageView;
import com.huami.lib.view.text.UnitTextView;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.view.ShareItemView;

/* JADX INFO: loaded from: classes20.dex */
public final class ShareLayoutBinding implements ViewBinding {

    @NonNull
    private final RelativeLayout a;

    @NonNull
    public final Button backButton;

    @NonNull
    public final RelativeLayout contentLayout;

    @NonNull
    public final TextView continueDotLine;

    @NonNull
    public final RelativeLayout continueLayout;

    @NonNull
    public final TextView continueStart;

    @NonNull
    public final TextView continueStop;

    @NonNull
    public final ShareItemView firstItem;

    @NonNull
    public final ImageView icon;

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
    public final RelativeLayout shareValueLayout;

    @NonNull
    public final TextView shareValueTitle;

    @NonNull
    public final ImageView shareWeightIcon;

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
    public final View valueBg;

    @NonNull
    public final RelativeLayout weightItem;

    @NonNull
    public final UnitTextView weightItemValue;

    private ShareLayoutBinding(@NonNull RelativeLayout rootView, @NonNull Button backButton, @NonNull RelativeLayout contentLayout, @NonNull TextView continueDotLine, @NonNull RelativeLayout continueLayout, @NonNull TextView continueStart, @NonNull TextView continueStop, @NonNull ShareItemView firstItem, @NonNull ImageView icon, @NonNull ShareItemView secondItem, @NonNull ImageView shareAchieveMarkView, @NonNull View shareBarBg, @NonNull RelativeLayout shareBgRl, @NonNull LinearLayout shareDetailLayout, @NonNull View shareDividerLine, @NonNull ToggleButton shareHiddenIcon, @NonNull CircleImageView shareIcon, @NonNull ImageView shareLeftArrow, @NonNull RelativeLayout shareLogo, @NonNull FrameLayout sharePaneContainer, @NonNull ImageView shareRightArrow, @NonNull RelativeLayout shareTop, @NonNull TextView shareUsername, @NonNull TextView shareValueDate, @NonNull RelativeLayout shareValueLayout, @NonNull TextView shareValueTitle, @NonNull ImageView shareWeightIcon, @NonNull ShareItemView thirdItem, @NonNull TextView title, @NonNull FrameLayout titleBarBack, @NonNull ImageView tvLogo, @NonNull UnitTextView unitText, @NonNull View valueBg, @NonNull RelativeLayout weightItem, @NonNull UnitTextView weightItemValue) {
        this.a = rootView;
        this.backButton = backButton;
        this.contentLayout = contentLayout;
        this.continueDotLine = continueDotLine;
        this.continueLayout = continueLayout;
        this.continueStart = continueStart;
        this.continueStop = continueStop;
        this.firstItem = firstItem;
        this.icon = icon;
        this.secondItem = secondItem;
        this.shareAchieveMarkView = shareAchieveMarkView;
        this.shareBarBg = shareBarBg;
        this.shareBgRl = shareBgRl;
        this.shareDetailLayout = shareDetailLayout;
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
        this.shareValueLayout = shareValueLayout;
        this.shareValueTitle = shareValueTitle;
        this.shareWeightIcon = shareWeightIcon;
        this.thirdItem = thirdItem;
        this.title = title;
        this.titleBarBack = titleBarBack;
        this.tvLogo = tvLogo;
        this.unitText = unitText;
        this.valueBg = valueBg;
        this.weightItem = weightItem;
        this.weightItemValue = weightItemValue;
    }

    @NonNull
    public static ShareLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.back_button;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.back_button);
        if (button != null) {
            RelativeLayout relativeLayout = (RelativeLayout) rootView;
            i = R.id.continue_dot_line;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.continue_dot_line);
            if (textView != null) {
                i = R.id.continue_layout;
                RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.continue_layout);
                if (relativeLayout2 != null) {
                    i = R.id.continue_start;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.continue_start);
                    if (textView2 != null) {
                        i = R.id.continue_stop;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.continue_stop);
                        if (textView3 != null) {
                            i = R.id.first_item;
                            ShareItemView shareItemView = (ShareItemView) ViewBindings.findChildViewById(rootView, R.id.first_item);
                            if (shareItemView != null) {
                                i = R.id.icon;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.icon);
                                if (imageView != null) {
                                    i = R.id.second_item;
                                    ShareItemView shareItemView2 = (ShareItemView) ViewBindings.findChildViewById(rootView, R.id.second_item);
                                    if (shareItemView2 != null) {
                                        i = R.id.share_achieve_mark_view;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_achieve_mark_view);
                                        if (imageView2 != null) {
                                            i = R.id.share_bar_bg;
                                            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.share_bar_bg);
                                            if (viewFindChildViewById != null) {
                                                i = R.id.share_bg_rl;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_bg_rl);
                                                if (relativeLayout3 != null) {
                                                    i = R.id.share_detail_layout;
                                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.share_detail_layout);
                                                    if (linearLayout != null) {
                                                        i = R.id.share_divider_line;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(rootView, R.id.share_divider_line);
                                                        if (viewFindChildViewById2 != null) {
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
                                                                        RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_logo);
                                                                        if (relativeLayout4 != null) {
                                                                            i = R.id.share_pane_container;
                                                                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.share_pane_container);
                                                                            if (frameLayout != null) {
                                                                                i = R.id.share_right_arrow;
                                                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_right_arrow);
                                                                                if (imageView4 != null) {
                                                                                    i = R.id.share_top;
                                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_top);
                                                                                    if (relativeLayout5 != null) {
                                                                                        i = R.id.share_username;
                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_username);
                                                                                        if (textView4 != null) {
                                                                                            i = R.id.share_value_date;
                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_value_date);
                                                                                            if (textView5 != null) {
                                                                                                i = R.id.share_value_layout;
                                                                                                RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.share_value_layout);
                                                                                                if (relativeLayout6 != null) {
                                                                                                    i = R.id.share_value_title;
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.share_value_title);
                                                                                                    if (textView6 != null) {
                                                                                                        i = R.id.share_weight_icon;
                                                                                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.share_weight_icon);
                                                                                                        if (imageView5 != null) {
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
                                                                                                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tv_logo);
                                                                                                                        if (imageView6 != null) {
                                                                                                                            i = R.id.unit_text;
                                                                                                                            UnitTextView unitTextView = (UnitTextView) ViewBindings.findChildViewById(rootView, R.id.unit_text);
                                                                                                                            if (unitTextView != null) {
                                                                                                                                i = R.id.value_bg;
                                                                                                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(rootView, R.id.value_bg);
                                                                                                                                if (viewFindChildViewById3 != null) {
                                                                                                                                    i = R.id.weight_item;
                                                                                                                                    RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.weight_item);
                                                                                                                                    if (relativeLayout7 != null) {
                                                                                                                                        i = R.id.weight_item_value;
                                                                                                                                        UnitTextView unitTextView2 = (UnitTextView) ViewBindings.findChildViewById(rootView, R.id.weight_item_value);
                                                                                                                                        if (unitTextView2 != null) {
                                                                                                                                            return new ShareLayoutBinding(relativeLayout, button, relativeLayout, textView, relativeLayout2, textView2, textView3, shareItemView, imageView, shareItemView2, imageView2, viewFindChildViewById, relativeLayout3, linearLayout, viewFindChildViewById2, toggleButton, circleImageView, imageView3, relativeLayout4, frameLayout, imageView4, relativeLayout5, textView4, textView5, relativeLayout6, textView6, imageView5, shareItemView3, textView7, frameLayout2, imageView6, unitTextView, viewFindChildViewById3, relativeLayout7, unitTextView2);
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
    public static ShareLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ShareLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.share_layout, parent, false);
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
