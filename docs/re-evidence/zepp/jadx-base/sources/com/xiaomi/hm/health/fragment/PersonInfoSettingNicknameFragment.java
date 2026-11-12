package com.xiaomi.hm.health.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.huami.account.HMLoginManager;
import com.huami.account.UserInfoLegalCheckManager;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.legal.DefaultUserInfoLegalCallback;
import com.huami.watch.hmwatchmanager.R;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.utils.Utils;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;

/* JADX INFO: loaded from: classes21.dex */
public class PersonInfoSettingNicknameFragment extends PersonInfoSettingBaseFragment {
    public static final String ARG_WITH_LEGAL_CHECK = "withLegalCheck";
    private EditText e;
    private TextView f;

    public static abstract class OnNicknameChangeListener implements PersonInfoSettingBaseFragment.OnDataChangeListener {
        @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment.OnDataChangeListener
        public void onChange() {
        }

        public abstract void onChange(String nickname);
    }

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable s) {
            PersonInfoSettingNicknameFragment.this.f.setEnabled(s.length() > 0);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (count != 0) {
                PersonInfoSettingNicknameFragment.this.f.setEnabled(true);
            }
        }
    }

    public class b extends DefaultUserInfoLegalCallback {
        public final /* synthetic */ String b;

        public b(final String val$inputStr) {
            this.b = val$inputStr;
        }

        @Override // com.huami.account.legal.DefaultUserInfoLegalCallback, com.huami.account.UserInfoLegalCallBack
        public void onAudit() {
            PersonInfoSettingNicknameFragment.this.n(this.b);
        }

        @Override // com.huami.account.legal.DefaultUserInfoLegalCallback, com.huami.account.UserInfoLegalCallBack
        public void onSuccess() {
            PersonInfoSettingNicknameFragment.this.n(this.b);
        }
    }

    private boolean i(String str) {
        return str.contains("'") || str.contains("\"") || str.contains("\\") || str.contains(FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE);
    }

    private boolean j() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("withLegalCheck", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(String inputStr) {
        String nickname = this.mUserInfo.getNickname();
        String manualAuditNickName = HMAccountKeeper.INSTANCE.getManualAuditNickName();
        if (inputStr.equals(nickname) || manualAuditNickName != null) {
            PersonInfoSettingBaseFragment.OnDataChangeListener onDataChangeListener = this.mListener;
            if (onDataChangeListener instanceof OnNicknameChangeListener) {
                ((OnNicknameChangeListener) onDataChangeListener).onChange(inputStr);
            }
            this.mListener.onChange();
            dismiss();
            return;
        }
        this.mUserInfo.setNickname(inputStr);
        if (this.mIsAddNew) {
            PersonInfoSettingBaseFragment.OnAddNewUserDataChangeListener onAddNewUserDataChangeListener = this.mAddNewListener;
            if (onAddNewUserDataChangeListener != null) {
                onAddNewUserDataChangeListener.onChange(this.mUserInfo);
            }
            dismiss();
            return;
        }
        save(2);
        PersonInfoSettingBaseFragment.OnDataChangeListener onDataChangeListener2 = this.mListener;
        if (onDataChangeListener2 != null) {
            onDataChangeListener2.onChange();
            PersonInfoSettingBaseFragment.OnDataChangeListener onDataChangeListener3 = this.mListener;
            if (onDataChangeListener3 instanceof OnNicknameChangeListener) {
                ((OnNicknameChangeListener) onDataChangeListener3).onChange(inputStr);
            }
        }
        dismiss();
    }

    public static PersonInfoSettingNicknameFragment newInstanceWithLegalCheck() {
        Bundle bundle = new Bundle();
        PersonInfoSettingNicknameFragment personInfoSettingNicknameFragment = new PersonInfoSettingNicknameFragment();
        bundle.putBoolean("withLegalCheck", true);
        personInfoSettingNicknameFragment.setArguments(bundle);
        return personInfoSettingNicknameFragment;
    }

    private void o() {
        String strTrim = this.e.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            Utils.toast(getActivity(), R.string.content_too_short, 0);
            return;
        }
        if (i(strTrim)) {
            Utils.toast(getActivity(), R.string.invalid_name, 0);
        } else if (j()) {
            UserInfoLegalCheckManager.checkNickNameLegal(requireActivity(), strTrim, new b(strTrim));
        } else {
            n(strTrim);
        }
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.fragment_person_info_setting_nickname, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.updateTv)).setText(this.mSelf ? R.string.modify_nickname : R.string.modify_family_nickname);
        this.e = (EditText) viewInflate.findViewById(R.id.info_nick_name);
        this.f = (TextView) viewInflate.findViewById(R.id.nick_name_btn_save);
        this.e.setHintTextColor(getResources().getColor(R.color.s2));
        if (TextUtils.isEmpty(this.e.getText())) {
            this.f.setEnabled(false);
        }
        this.e.addTextChangedListener(new a());
        String nickname = this.mUserInfo.getNickname();
        boolean z = this.mIsAddNew;
        int i = R.string.modify_nickname_hint;
        if (z) {
            this.e.setHint(R.string.modify_nickname_hint);
            EditText editText = this.e;
            if (TextUtils.isEmpty(nickname)) {
                nickname = "";
            }
            editText.setText(nickname);
            EditText editText2 = this.e;
            editText2.setSelection(editText2.length());
        } else {
            EditText editText3 = this.e;
            if (!this.mSelf) {
                i = R.string.modify_family_nickname_hint;
            }
            editText3.setHint(i);
            String thirdId = HMLoginManager.getThirdId();
            if (!HMLoginManager.isNewUser()) {
                EditText editText4 = this.e;
                if (TextUtils.isEmpty(nickname)) {
                    nickname = "";
                }
                editText4.setText(nickname);
            } else if (!TextUtils.isEmpty(nickname) && !TextUtils.isEmpty(thirdId) && !nickname.equals(thirdId)) {
                this.e.setText(nickname);
            }
            EditText editText5 = this.e;
            editText5.setSelection(editText5.length());
        }
        viewInflate.findViewById(R.id.nick_name_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: yu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.k(view);
            }
        });
        viewInflate.findViewById(R.id.nick_name_btn_save).setOnClickListener(new View.OnClickListener() { // from class: zu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.l(view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: xu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.m(view);
            }
        });
        viewInflate.setFitsSystemWindows(true);
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: isWidePadding */
    public boolean getIsMiDong() {
        return GlobalConfig.get().isBuildMidong();
    }

    @Override // com.xiaomi.hm.health.fragment.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }
}
