package com.xiaomi.hm.health.databinding;

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
import com.huami.watch.hmwatchmanager.R;

/* JADX INFO: loaded from: classes20.dex */
public final class FragmentPersonInfoSettingNicknameBinding implements ViewBinding {

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

    private FragmentPersonInfoSettingNicknameBinding(@NonNull LinearLayout rootView, @NonNull EditText infoNickName, @NonNull TextView nickNameBtnCancel, @NonNull TextView nickNameBtnSave, @NonNull TextView updateTv) {
        this.a = rootView;
        this.infoNickName = infoNickName;
        this.nickNameBtnCancel = nickNameBtnCancel;
        this.nickNameBtnSave = nickNameBtnSave;
        this.updateTv = updateTv;
    }

    @NonNull
    public static FragmentPersonInfoSettingNicknameBinding bind(@NonNull View rootView) {
        int i = R.id.info_nick_name;
        EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.info_nick_name);
        if (editText != null) {
            i = R.id.nick_name_btn_cancel;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.nick_name_btn_cancel);
            if (textView != null) {
                i = R.id.nick_name_btn_save;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.nick_name_btn_save);
                if (textView2 != null) {
                    i = R.id.updateTv;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.updateTv);
                    if (textView3 != null) {
                        return new FragmentPersonInfoSettingNicknameBinding((LinearLayout) rootView, editText, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPersonInfoSettingNicknameBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentPersonInfoSettingNicknameBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_person_info_setting_nickname, parent, false);
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
