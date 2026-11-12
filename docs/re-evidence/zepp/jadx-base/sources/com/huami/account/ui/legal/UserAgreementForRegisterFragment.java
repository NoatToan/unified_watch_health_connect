package com.huami.account.ui.legal;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.account.AccountExternalsKt;
import com.huami.account.AccountProperties;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.service.EdmService;
import com.huami.account.ui.R;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.ui.legal.UserAgreementForRegisterFragment;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.xiaomi.hm.health.baseutil.Language;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes4.dex */
public class UserAgreementForRegisterFragment extends BaseDialogFragment {
    private static final String h = "UserAgreementFragment";
    private OnDialogListener e;
    private String f;
    private boolean g = false;

    public interface OnDialogListener {
        void onCancel();

        void onSave(boolean z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void g(TextView textView, CompoundButton compoundButton, boolean z) {
        textView.setEnabled(z);
        textView.setTextColor(z ? ContextCompat.getColor(AccountExternalsKt.getAppContext(), R.color.s1) : ContextCompat.getColor(AccountExternalsKt.getAppContext(), R.color.s3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(CheckBox checkBox, View view) {
        OnDialogListener onDialogListener = this.e;
        if (onDialogListener != null) {
            onDialogListener.onSave(checkBox.isChecked());
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(View view) {
        dismiss();
        OnDialogListener onDialogListener = this.e;
        if (onDialogListener != null) {
            onDialogListener.onCancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(CompoundButton compoundButton, boolean z) {
        AccountProperties.INSTANCE.setEdmConfirmedByRegister(Boolean.valueOf(z));
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasBackground() {
        return false;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public boolean hasPadding() {
        return true;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment
    public View initView() {
        View viewInflate = View.inflate(getContext(), R.layout.account_ui_fragment_useragreement_for_register, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.useragreement_info);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.useragreement_ux);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.useragreement_btn_cancel);
        final TextView textView4 = (TextView) viewInflate.findViewById(R.id.useragreement_btn_save);
        final CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.useragreement_ux_checkbox);
        CheckBox checkBox2 = (CheckBox) viewInflate.findViewById(R.id.useragreement_info_checkbox);
        CheckBox checkBox3 = (CheckBox) viewInflate.findViewById(R.id.useragreement_edm_checkbox);
        UserLegalInfoManager.assembleRegisterAgreementAndPrivacyText(AccountExternalsKt.getAppContext(), textView, getString(R.string.account_ui_user_agreement_regist_title), this.f);
        UserLegalInfoManager.assembleRegisterExperienceText(AccountExternalsKt.getAppContext(), textView2, this.f);
        if (Language.isEnglish()) {
            textView.append(".");
        }
        if (this.g) {
            viewInflate.findViewById(R.id.useragreement_ux_ll).setVisibility(0);
        } else {
            viewInflate.findViewById(R.id.useragreement_ux_ll).setVisibility(8);
        }
        textView4.setEnabled(false);
        textView4.setTextColor(ContextCompat.getColor(AccountExternalsKt.getAppContext(), R.color.s3));
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s58
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                UserAgreementForRegisterFragment.g(textView4, compoundButton, z);
            }
        });
        textView4.setOnClickListener(new View.OnClickListener() { // from class: r58
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.h(checkBox, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: q58
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.i(view);
            }
        });
        AccountProperties.INSTANCE.setEdmConfirmedByRegister(Boolean.FALSE);
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: t58
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                UserAgreementForRegisterFragment.j(compoundButton, z);
            }
        });
        ((LinearLayout) viewInflate.findViewById(R.id.useragreement_edm_ll)).setVisibility(((EdmService) KoinJavaComponent.get(EdmService.class)).shouldShowEdm(SelectAreaHelper.getAreaByCountryCode(this.f)) ? 0 : 8);
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCancelable(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    public void setListener(OnDialogListener onDialogListener) {
        this.e = onDialogListener;
    }

    public void setShowUx(boolean z) {
        this.g = z;
    }

    public void setValue(String str) {
        this.f = str;
    }
}
