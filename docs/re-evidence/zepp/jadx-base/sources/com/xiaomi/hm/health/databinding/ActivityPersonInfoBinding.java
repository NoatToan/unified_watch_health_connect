package com.xiaomi.hm.health.databinding;

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
import com.huami.lib.view.image.CircleImageView;
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class ActivityPersonInfoBinding implements ViewBinding {

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
    public final TextView tvAvatarInAudit;

    private ActivityPersonInfoBinding(@NonNull LinearLayout rootView, @NonNull CircleImageView personInfoAvatar, @NonNull RelativeLayout personInfoAvatarRl, @NonNull TextView personInfoId, @NonNull ListView personInfoList, @NonNull RelativeLayout personInfoMineHead, @NonNull TextView tvAvatarInAudit) {
        this.a = rootView;
        this.personInfoAvatar = personInfoAvatar;
        this.personInfoAvatarRl = personInfoAvatarRl;
        this.personInfoId = personInfoId;
        this.personInfoList = personInfoList;
        this.personInfoMineHead = personInfoMineHead;
        this.tvAvatarInAudit = tvAvatarInAudit;
    }

    @NonNull
    public static ActivityPersonInfoBinding bind(@NonNull View rootView) {
        int i = R.id.person_info_avatar;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(rootView, R.id.person_info_avatar);
        if (circleImageView != null) {
            i = R.id.person_info_avatar_rl;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.person_info_avatar_rl);
            if (relativeLayout != null) {
                i = R.id.person_info_id;
                TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.person_info_id);
                if (textView != null) {
                    i = R.id.person_info_list;
                    ListView listView = (ListView) ViewBindings.findChildViewById(rootView, R.id.person_info_list);
                    if (listView != null) {
                        i = R.id.person_info_mine_head;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.person_info_mine_head);
                        if (relativeLayout2 != null) {
                            i = R.id.tv_avatar_in_audit;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_avatar_in_audit);
                            if (textView2 != null) {
                                return new ActivityPersonInfoBinding((LinearLayout) rootView, circleImageView, relativeLayout, textView, listView, relativeLayout2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityPersonInfoBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityPersonInfoBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_person_info, parent, false);
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
