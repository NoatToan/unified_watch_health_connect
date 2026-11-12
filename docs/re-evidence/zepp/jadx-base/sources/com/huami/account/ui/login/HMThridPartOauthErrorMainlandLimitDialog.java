package com.huami.account.ui.login;

import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.ui.R;
import com.huami.android.design.dialog.BaseDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public class HMThridPartOauthErrorMainlandLimitDialog extends BaseDialogFragment {
    private boolean e;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        dismissAllowingStateLoss();
    }

    public static void showDialog(FragmentActivity fragmentActivity, boolean z) {
        HMThridPartOauthErrorMainlandLimitDialog hMThridPartOauthErrorMainlandLimitDialog = new HMThridPartOauthErrorMainlandLimitDialog();
        hMThridPartOauthErrorMainlandLimitDialog.e = z;
        hMThridPartOauthErrorMainlandLimitDialog.show(fragmentActivity.getSupportFragmentManager(), (String) null);
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
        View viewInflate = View.inflate(getContext(), R.layout.account_ui_third_part_oauth_error_mainland_limit, null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.third_part_oauth_error_mainland_limit_known);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.third_part_oauth_error_mainland_limit_content);
        textView.setOnClickListener(new View.OnClickListener() { // from class: fk3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.d(view);
            }
        });
        textView2.setText(this.e ? R.string.account_ui_third_part_oauth_error_mainland_limit_login : R.string.account_ui_third_part_oauth_error_mainland_limit_regist);
        return viewInflate;
    }
}
