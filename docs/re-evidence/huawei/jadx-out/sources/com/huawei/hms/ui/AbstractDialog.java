package com.huawei.hms.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.UIUtil;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f16679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AlertDialog f16680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Callback f16681c;

    public interface Callback {
        void onCancel(AbstractDialog abstractDialog);

        void onDoWork(AbstractDialog abstractDialog);
    }

    class a implements DialogInterface.OnClickListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractDialog.this.fireDoWork();
        }
    }

    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractDialog.this.cancel();
        }
    }

    class c implements DialogInterface.OnCancelListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            AbstractDialog.this.fireCancel();
        }
    }

    class d implements DialogInterface.OnKeyListener {
        d() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (4 != i || keyEvent.getAction() != 1) {
                return false;
            }
            AbstractDialog.this.cancel();
            return true;
        }
    }

    public void cancel() {
        AlertDialog alertDialog = this.f16680b;
        if (alertDialog != null) {
            alertDialog.cancel();
        }
    }

    public void dismiss() {
        AlertDialog alertDialog = this.f16680b;
        if (alertDialog == null || !alertDialog.isShowing()) {
            return;
        }
        this.f16680b.dismiss();
    }

    protected void fireCancel() {
        Callback callback = this.f16681c;
        if (callback != null) {
            callback.onCancel(this);
        }
    }

    protected void fireDoWork() {
        Callback callback = this.f16681c;
        if (callback != null) {
            callback.onDoWork(this);
        }
    }

    protected Activity getActivity() {
        return this.f16679a;
    }

    protected int getDialogThemeId() {
        return UIUtil.getDialogThemeId(getActivity());
    }

    protected AlertDialog onCreateDialog(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(), getDialogThemeId());
        String strOnGetTitleString = onGetTitleString(activity);
        if (strOnGetTitleString != null) {
            builder.setTitle(strOnGetTitleString);
        }
        String strOnGetMessageString = onGetMessageString(activity);
        if (strOnGetMessageString != null) {
            builder.setMessage(strOnGetMessageString);
        }
        String strOnGetPositiveButtonString = onGetPositiveButtonString(activity);
        if (strOnGetPositiveButtonString != null) {
            builder.setPositiveButton(strOnGetPositiveButtonString, new a());
        }
        String strOnGetNegativeButtonString = onGetNegativeButtonString(activity);
        if (strOnGetNegativeButtonString != null) {
            builder.setNegativeButton(strOnGetNegativeButtonString, new b());
        }
        return builder.create();
    }

    protected abstract String onGetMessageString(Context context);

    protected abstract String onGetNegativeButtonString(Context context);

    protected abstract String onGetPositiveButtonString(Context context);

    protected abstract String onGetTitleString(Context context);

    public void setMessage(CharSequence charSequence) {
        AlertDialog alertDialog = this.f16680b;
        if (alertDialog != null) {
            alertDialog.setMessage(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        AlertDialog alertDialog = this.f16680b;
        if (alertDialog != null) {
            alertDialog.setTitle(charSequence);
        }
    }

    public void show(Activity activity, Callback callback) {
        this.f16679a = activity;
        this.f16681c = callback;
        if (activity == null || activity.isFinishing()) {
            HMSLog.e("AbstractDialog", "In show, The activity is null or finishing.");
            return;
        }
        AlertDialog alertDialogOnCreateDialog = onCreateDialog(this.f16679a);
        this.f16680b = alertDialogOnCreateDialog;
        alertDialogOnCreateDialog.setCanceledOnTouchOutside(false);
        this.f16680b.setOnCancelListener(new c());
        this.f16680b.setOnKeyListener(new d());
        UIUtil.enableFocusedForButtonsInTV(this.f16680b);
        this.f16680b.show();
    }
}
