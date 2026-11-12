package com.huami.account.userinfo.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.huami.account.userinfo.R;

/* JADX INFO: loaded from: classes4.dex */
public final class UserInfoFragmentPersonInfoSettingNicknameBinding implements ViewBinding {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final EditText infoNickName;

    @NonNull
    public final TextView nickNameBtnCancel;

    @NonNull
    public final TextView nickNameBtnSave;

    @NonNull
    public final TextView updateTv;

    private UserInfoFragmentPersonInfoSettingNicknameBinding(@NonNull LinearLayout linearLayout, @NonNull EditText editText, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = linearLayout;
        this.infoNickName = editText;
        this.nickNameBtnCancel = textView;
        this.nickNameBtnSave = textView2;
        this.updateTv = textView3;
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingNicknameBinding bind(@NonNull View view) {
        int i = R.id.info_nick_name;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, i);
        if (editText != null) {
            i = R.id.nick_name_btn_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
            if (textView != null) {
                i = R.id.nick_name_btn_save;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView2 != null) {
                    i = R.id.updateTv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView3 != null) {
                        return new UserInfoFragmentPersonInfoSettingNicknameBinding((LinearLayout) view, editText, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingNicknameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static UserInfoFragmentPersonInfoSettingNicknameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.user_info_fragment_person_info_setting_nickname, viewGroup, false);
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
