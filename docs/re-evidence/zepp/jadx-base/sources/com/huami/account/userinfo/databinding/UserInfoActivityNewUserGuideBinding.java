package com.huami.account.userinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.account.userinfo.R;
import com.huami.lib.rainbow.ListTile;

/* JADX INFO: loaded from: classes4.dex */
public final class UserInfoActivityNewUserGuideBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final TextView newUserInfo;

    @NonNull
    public final TextView newUserInfoTitle;

    @NonNull
    public final TextView newUserNext;

    @NonNull
    public final TextView newUserSkip;

    @NonNull
    public final ListTile settingBirthday;

    @NonNull
    public final ListTile settingGender;

    @NonNull
    public final ListTile settingHeight;

    @NonNull
    public final ListTile settingName;

    @NonNull
    public final ListTile settingWeight;

    private UserInfoActivityNewUserGuideBinding(@NonNull LinearLayout linearLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull ListTile listTile, @NonNull ListTile listTile2, @NonNull ListTile listTile3, @NonNull ListTile listTile4, @NonNull ListTile listTile5) {
        this.a = linearLayout;
        this.newUserInfo = textView;
        this.newUserInfoTitle = textView2;
        this.newUserNext = textView3;
        this.newUserSkip = textView4;
        this.settingBirthday = listTile;
        this.settingGender = listTile2;
        this.settingHeight = listTile3;
        this.settingName = listTile4;
        this.settingWeight = listTile5;
    }

    @NonNull
    public static UserInfoActivityNewUserGuideBinding bind(@NonNull View view) {
        int i = R.id.new_user_info;
        TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
        if (textView != null) {
            i = R.id.new_user_info_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView2 != null) {
                i = R.id.new_user_next;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView3 != null) {
                    i = R.id.new_user_skip;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView4 != null) {
                        i = R.id.setting_birthday;
                        ListTile listTile = (ListTile) ViewBindings.findChildViewById(view, i);
                        if (listTile != null) {
                            i = R.id.setting_gender;
                            ListTile listTile2 = (ListTile) ViewBindings.findChildViewById(view, i);
                            if (listTile2 != null) {
                                i = R.id.setting_height;
                                ListTile listTile3 = (ListTile) ViewBindings.findChildViewById(view, i);
                                if (listTile3 != null) {
                                    i = R.id.setting_name;
                                    ListTile listTile4 = (ListTile) ViewBindings.findChildViewById(view, i);
                                    if (listTile4 != null) {
                                        i = R.id.setting_weight;
                                        ListTile listTile5 = (ListTile) ViewBindings.findChildViewById(view, i);
                                        if (listTile5 != null) {
                                            return new UserInfoActivityNewUserGuideBinding((LinearLayout) view, textView, textView2, textView3, textView4, listTile, listTile2, listTile3, listTile4, listTile5);
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
    public static UserInfoActivityNewUserGuideBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static UserInfoActivityNewUserGuideBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_info_activity_new_user_guide, viewGroup, false);
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
