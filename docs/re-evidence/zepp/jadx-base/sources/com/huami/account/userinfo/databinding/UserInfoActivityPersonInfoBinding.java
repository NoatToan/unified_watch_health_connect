package com.huami.account.userinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.account.userinfo.R;
import com.huami.lib.view.image.CircleImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class UserInfoActivityPersonInfoBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final CircleImageView personInfoAvatar;

    @NonNull
    public final RelativeLayout personInfoAvatarRl;

    @NonNull
    public final TextView personInfoId;

    @NonNull
    public final ListView personInfoList;

    @NonNull
    public final RelativeLayout personInfoMineHead;

    @NonNull
    public final TextView personInfoUnauthorized;

    @NonNull
    public final TextView tvAvatarInAudit;

    private UserInfoActivityPersonInfoBinding(@NonNull LinearLayout linearLayout, @NonNull CircleImageView circleImageView, @NonNull RelativeLayout relativeLayout, @NonNull TextView textView, @NonNull ListView listView, @NonNull RelativeLayout relativeLayout2, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = linearLayout;
        this.personInfoAvatar = circleImageView;
        this.personInfoAvatarRl = relativeLayout;
        this.personInfoId = textView;
        this.personInfoList = listView;
        this.personInfoMineHead = relativeLayout2;
        this.personInfoUnauthorized = textView2;
        this.tvAvatarInAudit = textView3;
    }

    @NonNull
    public static UserInfoActivityPersonInfoBinding bind(@NonNull View view) {
        int i = R.id.person_info_avatar;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view, i);
        if (circleImageView != null) {
            i = R.id.person_info_avatar_rl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.person_info_id;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.person_info_list;
                    ListView listView = (ListView) ViewBindings.findChildViewById(view, i);
                    if (listView != null) {
                        i = R.id.person_info_mine_head;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.person_info_unauthorized;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                            if (textView2 != null) {
                                i = R.id.tv_avatar_in_audit;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView3 != null) {
                                    return new UserInfoActivityPersonInfoBinding((LinearLayout) view, circleImageView, relativeLayout, textView, listView, relativeLayout2, textView2, textView3);
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
    public static UserInfoActivityPersonInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static UserInfoActivityPersonInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_info_activity_person_info, viewGroup, false);
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
