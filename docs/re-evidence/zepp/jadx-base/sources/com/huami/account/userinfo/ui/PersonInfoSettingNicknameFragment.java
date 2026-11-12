package com.huami.account.userinfo.ui;

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
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.UserInfoLegalCheckManager;
import com.huami.account.keeper.HMAccountKeeper;
import com.huami.account.legal.DefaultUserInfoLegalCallback;
import com.huami.account.userinfo.R;
import com.huami.account.userinfo.ui.PersonInfoSettingNicknameFragment;
import com.huami.account.userinfo.utils.Utils;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0014J\b\u0010\r\u001a\u00020\bH\u0014J\b\u0010\u000e\u001a\u00020\bH\u0014J\b\u0010\u000f\u001a\u00020\bH\u0014R\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\b8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001f"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingNicknameFragment;", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment;", "", GoogleApiAvailabilityLight.b, "", "inputStr", "m", "str", "", "h", "onStart", "Landroid/view/View;", "initView", "hasPadding", "isWidePadding", "hasBackground", "Landroid/widget/EditText;", "i", "Landroid/widget/EditText;", "mNickName", "Landroid/widget/TextView;", z.j, "Landroid/widget/TextView;", "mNickNameSaveBtn", "l", "()Z", "isWithLegalCheck", "<init>", "()V", "Companion", "OnNicknameChangeListener", "userinfo_release"}, k = 1, mv = {1, 5, 1})
public final class PersonInfoSettingNicknameFragment extends PersonInfoSettingBaseFragment {

    @NotNull
    public static final String ARG_WITH_LEGAL_CHECK = "withLegalCheck";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private EditText mNickName;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private TextView mNickNameSaveBtn;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingNicknameFragment$Companion;", "", "Lcom/huami/account/userinfo/ui/PersonInfoSettingNicknameFragment;", "newInstanceWithLegalCheck", "", "ARG_WITH_LEGAL_CHECK", "Ljava/lang/String;", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PersonInfoSettingNicknameFragment newInstanceWithLegalCheck() {
            Bundle bundle = new Bundle();
            PersonInfoSettingNicknameFragment personInfoSettingNicknameFragment = new PersonInfoSettingNicknameFragment();
            bundle.putBoolean("withLegalCheck", true);
            personInfoSettingNicknameFragment.setArguments(bundle);
            return personInfoSettingNicknameFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&¨\u0006\b"}, d2 = {"Lcom/huami/account/userinfo/ui/PersonInfoSettingNicknameFragment$OnNicknameChangeListener;", "Lcom/huami/account/userinfo/ui/PersonInfoSettingBaseFragment$OnDataChangeListener;", "", "onChange", "", "nickname", "<init>", "()V", "userinfo_release"}, k = 1, mv = {1, 5, 1})
    public static abstract class OnNicknameChangeListener implements PersonInfoSettingBaseFragment.OnDataChangeListener {
        @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment.OnDataChangeListener
        public void onChange() {
        }

        public abstract void onChange(@Nullable String nickname);
    }

    private final boolean h(String str) {
        return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "'", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "\"", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) "\\", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, false, 2, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(PersonInfoSettingNicknameFragment personInfoSettingNicknameFragment, View view) {
        personInfoSettingNicknameFragment.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(PersonInfoSettingNicknameFragment personInfoSettingNicknameFragment, View view) {
        personInfoSettingNicknameFragment.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(PersonInfoSettingNicknameFragment personInfoSettingNicknameFragment, View view) {
        personInfoSettingNicknameFragment.dismiss();
    }

    private final boolean l() {
        Bundle arguments = getArguments();
        return arguments != null && arguments.getBoolean("withLegalCheck", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(String inputStr) {
        String nickname = getMUserInfo().getNickname();
        String manualAuditNickName = HMAccountKeeper.INSTANCE.getManualAuditNickName();
        if (!Intrinsics.areEqual(inputStr, nickname) && manualAuditNickName == null) {
            getMUserInfo().setNickname(inputStr);
            save(2);
            dismiss();
        } else {
            if (getMListener() instanceof OnNicknameChangeListener) {
                PersonInfoSettingBaseFragment.OnDataChangeListener mListener = getMListener();
                Objects.requireNonNull(mListener, "null cannot be cast to non-null type com.huami.account.userinfo.ui.PersonInfoSettingNicknameFragment.OnNicknameChangeListener");
                ((OnNicknameChangeListener) mListener).onChange(inputStr);
            }
            getMListener().onChange();
            dismiss();
        }
    }

    private final void n() {
        EditText editText = this.mNickName;
        Objects.requireNonNull(editText);
        String string = editText.getText().toString();
        int length = string.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.compare((int) string.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                } else {
                    length--;
                }
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        final String string2 = string.subSequence(i, length + 1).toString();
        if (TextUtils.isEmpty(string2)) {
            Utils.INSTANCE.toast(getActivity(), R.string.user_info_content_too_short, 0);
            return;
        }
        if (h(string2)) {
            Utils.INSTANCE.toast(getActivity(), R.string.user_info_invalid_name, 0);
        } else if (l()) {
            UserInfoLegalCheckManager.checkNickNameLegal(requireActivity(), string2, new DefaultUserInfoLegalCallback() { // from class: com.huami.account.userinfo.ui.PersonInfoSettingNicknameFragment$onSave$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(null, 1, null);
                }

                @Override // com.huami.account.legal.DefaultUserInfoLegalCallback, com.huami.account.UserInfoLegalCallBack
                public void onAudit() {
                    this.b.m(string2);
                }

                @Override // com.huami.account.legal.DefaultUserInfoLegalCallback, com.huami.account.UserInfoLegalCallBack
                public void onSuccess() {
                    this.b.m(string2);
                    if (this.b.getMListener() != null) {
                        this.b.getMListener().onChange();
                        if (this.b.getMListener() instanceof PersonInfoSettingNicknameFragment.OnNicknameChangeListener) {
                            PersonInfoSettingBaseFragment.OnDataChangeListener mListener = this.b.getMListener();
                            Objects.requireNonNull(mListener, "null cannot be cast to non-null type com.huami.account.userinfo.ui.PersonInfoSettingNicknameFragment.OnNicknameChangeListener");
                            ((PersonInfoSettingNicknameFragment.OnNicknameChangeListener) mListener).onChange(string2);
                        }
                    }
                }
            });
        } else {
            m(string2);
        }
    }

    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    @NotNull
    public View initView() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.user_info_fragment_person_info_setting_nickname, (ViewGroup) null);
        ((TextView) viewInflate.findViewById(R.id.updateTv)).setText(R.string.user_info_modify_nickname);
        this.mNickName = (EditText) viewInflate.findViewById(R.id.info_nick_name);
        int i = R.id.nick_name_btn_save;
        this.mNickNameSaveBtn = (TextView) viewInflate.findViewById(i);
        EditText editText = this.mNickName;
        Objects.requireNonNull(editText);
        editText.setHintTextColor(getResources().getColor(R.color.s2));
        EditText editText2 = this.mNickName;
        Objects.requireNonNull(editText2);
        if (TextUtils.isEmpty(editText2.getText())) {
            TextView textView = this.mNickNameSaveBtn;
            Objects.requireNonNull(textView);
            textView.setEnabled(false);
        }
        EditText editText3 = this.mNickName;
        Objects.requireNonNull(editText3);
        editText3.addTextChangedListener(new TextWatcher() { // from class: com.huami.account.userinfo.ui.PersonInfoSettingNicknameFragment.initView.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(@NotNull Editable s) {
                TextView textView2 = PersonInfoSettingNicknameFragment.this.mNickNameSaveBtn;
                Objects.requireNonNull(textView2);
                textView2.setEnabled(s.length() > 0);
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(@NotNull CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(@NotNull CharSequence s, int start, int before, int count) {
                if (count != 0) {
                    TextView textView2 = PersonInfoSettingNicknameFragment.this.mNickNameSaveBtn;
                    Objects.requireNonNull(textView2);
                    textView2.setEnabled(true);
                }
            }
        });
        String nickname = getMUserInfo().getNickname();
        EditText editText4 = this.mNickName;
        Objects.requireNonNull(editText4);
        editText4.setHint(R.string.user_info_modify_nickname_hint);
        String thirdId = HMLoginManager.getThirdId();
        if (!HMLoginManager.isNewUser()) {
            EditText editText5 = this.mNickName;
            Objects.requireNonNull(editText5);
            if (TextUtils.isEmpty(nickname)) {
                nickname = "";
            }
            editText5.setText(nickname);
        } else if (!TextUtils.isEmpty(nickname) && !TextUtils.isEmpty(thirdId) && !Intrinsics.areEqual(nickname, thirdId)) {
            EditText editText6 = this.mNickName;
            Objects.requireNonNull(editText6);
            editText6.setText(nickname);
        }
        EditText editText7 = this.mNickName;
        Objects.requireNonNull(editText7);
        Objects.requireNonNull(editText7);
        editText7.setSelection(editText7.length());
        viewInflate.findViewById(R.id.nick_name_btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: vu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingNicknameFragment.i(this.a, view);
            }
        });
        viewInflate.findViewById(i).setOnClickListener(new View.OnClickListener() { // from class: uu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingNicknameFragment.j(this.a, view);
            }
        });
        viewInflate.findViewById(R.id.dlg_empty_area_btn).setOnClickListener(new View.OnClickListener() { // from class: wu5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PersonInfoSettingNicknameFragment.k(this.a, view);
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

    @Override // com.huami.account.userinfo.ui.PersonInfoSettingBaseFragment, com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window == null) {
            return;
        }
        window.setSoftInputMode(5);
    }
}
