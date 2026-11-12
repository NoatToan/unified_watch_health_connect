package com.xiaomi.hm.health.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.image.CircleImageView;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityNewUserGuideBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CircleImageView newUserAvatar;

    @NonNull
    public final RelativeLayout newUserAvatarRl;

    @NonNull
    public final TextView newUserInfo;

    @NonNull
    public final ListTile newUserInfoSettingBirthday;

    @NonNull
    public final ListTile newUserInfoSettingGender;

    @NonNull
    public final ListTile newUserInfoSettingGoalActivity;

    @NonNull
    public final ListTile newUserInfoSettingGoalCalorie;

    @NonNull
    public final ListTile newUserInfoSettingGoalSleep;

    @NonNull
    public final ListTile newUserInfoSettingHeight;

    @NonNull
    public final ListTile newUserInfoSettingName;

    @NonNull
    public final ListTile newUserInfoSettingWeight;

    @NonNull
    public final TextView newUserNext;

    @NonNull
    public final TextView newUserSkip;

    @NonNull
    public final TextView tvAvatarInAudit;

    private ActivityNewUserGuideBinding(@NonNull LinearLayout rootView, @NonNull CircleImageView newUserAvatar, @NonNull RelativeLayout newUserAvatarRl, @NonNull TextView newUserInfo, @NonNull ListTile newUserInfoSettingBirthday, @NonNull ListTile newUserInfoSettingGender, @NonNull ListTile newUserInfoSettingGoalActivity, @NonNull ListTile newUserInfoSettingGoalCalorie, @NonNull ListTile newUserInfoSettingGoalSleep, @NonNull ListTile newUserInfoSettingHeight, @NonNull ListTile newUserInfoSettingName, @NonNull ListTile newUserInfoSettingWeight, @NonNull TextView newUserNext, @NonNull TextView newUserSkip, @NonNull TextView tvAvatarInAudit) {
        this.a = rootView;
        this.newUserAvatar = newUserAvatar;
        this.newUserAvatarRl = newUserAvatarRl;
        this.newUserInfo = newUserInfo;
        this.newUserInfoSettingBirthday = newUserInfoSettingBirthday;
        this.newUserInfoSettingGender = newUserInfoSettingGender;
        this.newUserInfoSettingGoalActivity = newUserInfoSettingGoalActivity;
        this.newUserInfoSettingGoalCalorie = newUserInfoSettingGoalCalorie;
        this.newUserInfoSettingGoalSleep = newUserInfoSettingGoalSleep;
        this.newUserInfoSettingHeight = newUserInfoSettingHeight;
        this.newUserInfoSettingName = newUserInfoSettingName;
        this.newUserInfoSettingWeight = newUserInfoSettingWeight;
        this.newUserNext = newUserNext;
        this.newUserSkip = newUserSkip;
        this.tvAvatarInAudit = tvAvatarInAudit;
    }

    @NonNull
    public static ActivityNewUserGuideBinding bind(@NonNull View rootView) {
        int i = R.id.new_user_avatar;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.new_user_avatar);
        if (circleImageView != null) {
            i = R.id.new_user_avatar_rl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.new_user_avatar_rl);
            if (relativeLayout != null) {
                i = R.id.new_user_info;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_user_info);
                if (textView != null) {
                    i = R.id.new_user_info_setting_birthday;
                    ListTile listTile = (ListTile) ViewBindings.findChildViewById(rootView, R.id.new_user_info_setting_birthday);
                    if (listTile != null) {
                        i = R.id.new_user_info_setting_gender;
                        ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.new_user_info_setting_gender);
                        if (listTile2 != null) {
                            i = R.id.new_user_info_setting_goal_activity;
                            ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.new_user_info_setting_goal_activity);
                            if (listTile3 != null) {
                                i = R.id.new_user_info_setting_goal_calorie;
                                ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.new_user_info_setting_goal_calorie);
                                if (listTile4 != null) {
                                    i = R.id.new_user_info_setting_goal_sleep;
                                    ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.new_user_info_setting_goal_sleep);
                                    if (listTile5 != null) {
                                        i = R.id.new_user_info_setting_height;
                                        ListTile listTile6 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.new_user_info_setting_height);
                                        if (listTile6 != null) {
                                            i = R.id.new_user_info_setting_name;
                                            ListTile listTile7 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.new_user_info_setting_name);
                                            if (listTile7 != null) {
                                                i = R.id.new_user_info_setting_weight;
                                                ListTile listTile8 = (ListTile) ViewBindings.findChildViewById(rootView, R.id.new_user_info_setting_weight);
                                                if (listTile8 != null) {
                                                    i = R.id.new_user_next;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_user_next);
                                                    if (textView2 != null) {
                                                        i = R.id.new_user_skip;
                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.new_user_skip);
                                                        if (textView3 != null) {
                                                            i = R.id.tv_avatar_in_audit;
                                                            TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_avatar_in_audit);
                                                            if (textView4 != null) {
                                                                return new ActivityNewUserGuideBinding((LinearLayout) rootView, circleImageView, relativeLayout, textView, listTile, listTile2, listTile3, listTile4, listTile5, listTile6, listTile7, listTile8, textView2, textView3, textView4);
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
    public static ActivityNewUserGuideBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityNewUserGuideBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_new_user_guide, parent, false);
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
