package com.huami.account.ui.login;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.huami.account.ui.R;
import com.huami.android.design.dialog.BaseDialogFragment;

/* JADX INFO: loaded from: classes4.dex */
public class AccountErrorFragment extends BaseDialogFragment {
    private static final String l = "AccountErrorFragment";
    private OnDialogListener f;
    private String k;
    private final int e = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private boolean j = false;

    public static class Builder {
        public AccountErrorFragment a = new AccountErrorFragment();

        private Builder() {
        }

        public static Builder get() {
            return new Builder();
        }

        public Builder enableDoubleBtn(int i, OnDialogListener onDialogListener) {
            this.a.j = true;
            this.a.i = i;
            this.a.f = onDialogListener;
            return this;
        }

        public Builder setContentRes(int i) {
            this.a.h = i;
            return this;
        }

        public Builder setId(String str) {
            this.a.k = str;
            return this;
        }

        public Builder setTitleRes(int i) {
            this.a.g = i;
            return this;
        }

        public void show(FragmentActivity fragmentActivity) {
            this.a.show(fragmentActivity.getSupportFragmentManager(), AccountErrorFragment.l);
        }
    }

    public interface OnDialogListener {
        void confirm();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m(View view) {
        dismiss();
        OnDialogListener onDialogListener = this.f;
        if (onDialogListener != null) {
            onDialogListener.confirm();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n(View view) {
        dismiss();
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
        View viewInflate = View.inflate(getContext(), R.layout.account_ui_fragment_account_error, null);
        if (this.g != -1) {
            ((TextView) viewInflate.findViewById(R.id.account_error_title)).setText(this.g);
        }
        if (!TextUtils.isEmpty(this.k)) {
            ((TextView) viewInflate.findViewById(R.id.account_error_id)).setText("(ID:" + this.k + ")");
        }
        if (this.h != -1) {
            ((TextView) viewInflate.findViewById(R.id.account_error_content)).setText(this.h);
        }
        if (this.j) {
            viewInflate.findViewById(R.id.account_error_double).setVisibility(0);
            viewInflate.findViewById(R.id.account_error_exit).setOnClickListener(new View.OnClickListener() { // from class: i3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.l(view);
                }
            });
            TextView textView = (TextView) viewInflate.findViewById(R.id.account_error_setting);
            int i = this.i;
            if (i != -1) {
                textView.setText(i);
            }
            textView.setOnClickListener(new View.OnClickListener() { // from class: h3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.m(view);
                }
            });
        } else {
            View viewFindViewById = viewInflate.findViewById(R.id.account_error_got_it);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: g3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.n(view);
                }
            });
            viewFindViewById.setVisibility(0);
        }
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
        this.f = onDialogListener;
    }
}
