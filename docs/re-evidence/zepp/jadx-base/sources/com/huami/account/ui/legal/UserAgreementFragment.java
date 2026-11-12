package com.huami.account.ui.legal;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.huami.account.AccountExternalsKt;
import com.huami.account.UserLegalInfoManager;
import com.huami.account.service.EdmService;
import com.huami.account.ui.R;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.Language;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes4.dex */
public class UserAgreementFragment extends BaseDialogFragment {
    private static final String f = "UserAgreementFragment";
    private OnDialogListener e;

    public interface OnDialogListener {
        boolean isExperience();

        boolean isUpdate();

        void onCancel();

        void onSave(boolean z);
    }

    public class a implements View.OnClickListener {
        public final /* synthetic */ CheckBox a;

        public a(CheckBox checkBox) {
            this.a = checkBox;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UserAgreementFragment.this.e != null && this.a != null) {
                UserAgreementFragment.this.e.onSave(this.a.isChecked());
            }
            UserAgreementFragment.this.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UserAgreementFragment.this.dismiss();
            if (UserAgreementFragment.this.e != null) {
                UserAgreementFragment.this.e.onCancel();
            }
        }
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
        View viewInflate = View.inflate(getContext(), R.layout.account_ui_fragment_useragreement, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.useragreement_info);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.user_agreement_title);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.useragreement_ux);
        TextView textView4 = (TextView) viewInflate.findViewById(R.id.useragreement_btn_cancel);
        TextView textView5 = (TextView) viewInflate.findViewById(R.id.useragreement_btn_save);
        View viewFindViewById = viewInflate.findViewById(R.id.useragreement_ux_ll);
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.useragreement_ux_checkbox);
        OnDialogListener onDialogListener = this.e;
        if (onDialogListener != null && onDialogListener.isUpdate()) {
            viewFindViewById.setVisibility(8);
            if (this.e.isExperience()) {
                textView2.setText(R.string.account_ui_user_experience_update);
                textView4.setText(R.string.account_ui_give_up);
                UserLegalInfoManager.assembleUpdateExperienceText(getContext(), textView);
            } else {
                textView2.setText(R.string.account_ui_user_agreement_update);
                UserLegalInfoManager.assembleAgreementAndPrivacyText(getContext(), textView, getString(R.string.account_ui_bracelet_dialog_info));
            }
        } else if (GlobalConfig.get().isBuildPlay()) {
            checkBox.setVisibility(0);
            textView3.setVisibility(0);
            textView3.setText(R.string.account_ui_agree_ux);
            UserLegalInfoManager.assembleExperienceText(getContext(), textView3);
            UserLegalInfoManager.assembleAgreementAndPrivacyText(getContext(), textView, getString(R.string.account_ui_bracelet_dialog_info));
        } else {
            viewFindViewById.setVisibility(8);
            UserLegalInfoManager.assembleAgreementAndPrivacyText(getContext(), textView, getString(R.string.account_ui_bracelet_dialog_info));
        }
        if (Language.isEnglish()) {
            textView.append(".");
        }
        textView5.setOnClickListener(new a(checkBox));
        textView4.setOnClickListener(new b());
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

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NonNull DialogInterface dialogInterface) {
        OnDialogListener onDialogListener;
        super.onDismiss(dialogInterface);
        if (!AccountExternalsKt.getConfigDelegate().enableEdmFeature() || (onDialogListener = this.e) == null || onDialogListener.isExperience()) {
            return;
        }
        ((EdmService) KoinJavaComponent.get(EdmService.class)).checkEdmStatus();
    }

    public void setListener(OnDialogListener onDialogListener) {
        this.e = onDialogListener;
    }
}
