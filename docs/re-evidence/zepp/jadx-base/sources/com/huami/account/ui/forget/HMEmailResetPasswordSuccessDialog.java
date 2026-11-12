package com.huami.account.ui.forget;

import android.view.View;
import android.widget.TextView;
import com.huami.account.ui.R;
import com.huami.android.design.dialog.BaseDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public class HMEmailResetPasswordSuccessDialog extends BaseDialogFragment {
    private a e;

    public interface a {
        String a();

        void b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        if (this.e != null) {
            dismissAllowingStateLoss();
            this.e.b();
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
        View viewInflate = View.inflate(getContext(), R.layout.account_ui_hm_email_reset_password_success, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.hm_email_send_to);
        textView.getPaint().setFlags(8);
        textView.getPaint().setAntiAlias(true);
        a aVar = this.e;
        if (aVar != null) {
            textView.setText(aVar.a());
        }
        viewInflate.findViewById(R.id.hm_email_known).setOnClickListener(new View.OnClickListener() { // from class: nu2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d(view);
            }
        });
        return viewInflate;
    }

    public void setCallback(a aVar) {
        this.e = aVar;
    }
}
