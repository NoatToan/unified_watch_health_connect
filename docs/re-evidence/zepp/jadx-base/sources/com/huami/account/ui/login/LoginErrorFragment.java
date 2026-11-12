package com.huami.account.ui.login;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.annotation.Nullable;
import com.huami.account.AccountExternalsKt;
import com.huami.account.ui.R;
import com.huami.account.utils.SystemBarTintSupport;
import com.huami.android.design.dialog.BaseDialogFragment;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseutil.NetUtil;

/* JADX INFO: loaded from: classes4.dex */
public class LoginErrorFragment extends BaseDialogFragment {
    private OnListener e;

    public interface OnListener {
        void onFeedback(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(EditText editText, View view) {
        if (!NetUtil.isNetworkConnected(AccountExternalsKt.getAppContext())) {
            IconToast.showError(AccountExternalsKt.getAppContext(), getString(R.string.account_ui_no_network_connection));
            return;
        }
        dismiss();
        OnListener onListener = this.e;
        if (onListener != null) {
            onListener.onFeedback(editText.getText().toString().trim());
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
        View viewInflate = View.inflate(getContext(), R.layout.account_ui_fragment_login_error, null);
        final EditText editText = (EditText) viewInflate.findViewById(R.id.tv_contact);
        viewInflate.findViewById(R.id.btn_cancel).setOnClickListener(new View.OnClickListener() { // from class: ms4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.e(view);
            }
        });
        viewInflate.findViewById(R.id.btn_feedback).setOnClickListener(new View.OnClickListener() { // from class: ns4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.f(editText, view);
            }
        });
        viewInflate.setFitsSystemWindows(true);
        return viewInflate;
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int i = R.style.AccountUiDimPanel;
        if (SystemBarTintSupport.isSupport(getActivity())) {
            i = R.style.AccountUiDimPanelTint;
        }
        setStyle(0, i);
    }

    @Override // com.huami.android.design.dialog.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = getDialog().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setSoftInputMode(3);
        }
    }

    public void setListener(OnListener onListener) {
        this.e = onListener;
    }
}
