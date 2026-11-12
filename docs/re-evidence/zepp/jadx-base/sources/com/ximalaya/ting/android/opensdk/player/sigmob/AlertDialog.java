package com.ximalaya.ting.android.opensdk.player.sigmob;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.ximalaya.ting.android.opensdk.R;

/* JADX INFO: loaded from: classes22.dex */
public class AlertDialog extends Dialog {
    public TextView btCancel;
    public TextView btCommit;
    public TextView tvMessage;
    public TextView tvTitle;

    public AlertDialog(Context context) {
        this(context, R.layout.dialog_alert);
    }

    private void init() {
        this.tvTitle = (TextView) findViewById(R.id.title);
        this.tvMessage = (TextView) findViewById(R.id.content);
        this.btCancel = (TextView) findViewById(R.id.btn_cancel);
        this.btCommit = (TextView) findViewById(R.id.btn_commit);
    }

    public AlertDialog setCancelTx(String str) {
        this.btCancel.setText(str);
        return this;
    }

    public AlertDialog setCommitTx(String str) {
        this.btCommit.setText(str);
        return this;
    }

    public AlertDialog setMessage(String str) {
        this.tvMessage.setText(str);
        return this;
    }

    public AlertDialog setMessageNoTitle(String str) {
        this.tvTitle.setText(str);
        this.tvMessage.setVisibility(8);
        return this;
    }

    public void setOnCancelClickListener(View.OnClickListener onClickListener) {
        this.btCancel.setOnClickListener(onClickListener);
    }

    public void setOnCommitClickListener(View.OnClickListener onClickListener) {
        this.btCommit.setOnClickListener(onClickListener);
    }

    public AlertDialog setTitle(String str) {
        this.tvTitle.setText(str);
        return this;
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        this.btCommit.requestFocus();
    }

    public AlertDialog(Context context, int i) {
        super(context, R.style.CustomDialog);
        setContentView(i);
        init();
    }
}
