package com.huami.wallet.accessdoor.dialog;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.nfc.web.entity.ProtocolEntity;
import com.huami.wallet.accessdoor.R;
import com.huami.wallet.accessdoor.api.FunctionsConfig;
import com.huami.wallet.accessdoor.di.koin.DoorKoinModuleKt;
import kotlin.Lazy;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes15.dex */
public class AccessDoorUserPrivacyDialog extends BaseDialogFragment implements View.OnClickListener {
    private TextView e;
    private OnClickButton f;
    private ProtocolEntity g;
    public Lazy<String> h = KoinJavaComponent.inject(String.class, QualifierKt.named(DoorKoinModuleKt.DOOR_CONFIG_APP_NAME));

    public interface OnClickButton {
        void clickNegation();

        void clickPosition(Long l);

        void clickUserPrivacy(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(CompoundButton compoundButton, boolean z) {
        this.e.setEnabled(z);
        this.e.setTextColor(z ? ContextCompat.getColor(getActivity(), R.color.black_70) : ContextCompat.getColor(getActivity(), R.color.black20));
    }

    public static AccessDoorUserPrivacyDialog getInstance(ProtocolEntity protocolEntity) {
        AccessDoorUserPrivacyDialog accessDoorUserPrivacyDialog = new AccessDoorUserPrivacyDialog();
        Bundle bundle = new Bundle();
        bundle.putParcelable("protocolEntity", protocolEntity);
        accessDoorUserPrivacyDialog.setArguments(bundle);
        return accessDoorUserPrivacyDialog;
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
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.dialog_user_privacy_agreement, (ViewGroup) null);
        if (getArguments() != null) {
            this.g = (ProtocolEntity) getArguments().getParcelable("protocolEntity");
        }
        initView(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == R.id.tv_confirm) {
            this.f.clickPosition(Long.valueOf(this.g.getId()));
        } else if (view.getId() == R.id.tv_cancel) {
            this.f.clickNegation();
        } else if (view.getId() == R.id.tv_user_privacy_link) {
            this.f.clickUserPrivacy(this.g.getUrl());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    public void setOnClickButton(OnClickButton onClickButton) {
        this.f = onClickButton;
    }

    private void initView(View view) {
        this.e = (TextView) view.findViewById(R.id.tv_confirm);
        TextView textView = (TextView) view.findViewById(R.id.tv_cancel);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.check_user_privacy);
        TextView textView2 = (TextView) view.findViewById(R.id.user_agreement_title);
        int i = R.string.access_card_user_privacy_title;
        Object[] objArr = new Object[1];
        objArr[0] = FunctionsConfig.isMiFit().invoke().booleanValue() ? this.h.getValue() : "Zepp/Amazfit";
        textView2.setText(getString(i, objArr));
        TextView textView3 = (TextView) view.findViewById(R.id.tv_user_privacy_link);
        SpannableString spannableString = new SpannableString("《" + this.g.getTitle() + "》");
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(getActivity(), R.color.text_blue)), 0, spannableString.length(), 33);
        textView3.setText(spannableString);
        this.e.setOnClickListener(this);
        textView.setOnClickListener(this);
        textView3.setOnClickListener(this);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: a1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.a.d(compoundButton, z);
            }
        });
    }
}
