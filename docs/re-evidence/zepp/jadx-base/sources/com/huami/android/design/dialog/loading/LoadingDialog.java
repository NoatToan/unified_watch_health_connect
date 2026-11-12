package com.huami.android.design.dialog.loading;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.annotation.DrawableRes;

/* JADX INFO: loaded from: classes5.dex */
public class LoadingDialog {
    private static final int h = 800;
    private final Dialog a;
    private final LoadingView b;
    private final TextView c;
    private final TextView d;
    private OnAnimEndListener e;
    private int f;
    private LoadingShownListener g;

    public interface LoadingShownListener {
        void onShown();
    }

    public interface OnAnimEndListener {
        void onAnimEnd(LoadingDialog loadingDialog);

        void onDismiss(LoadingDialog loadingDialog);
    }

    public class a implements DialogInterface.OnShowListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            if (LoadingDialog.this.g != null) {
                LoadingDialog.this.g.onShown();
            }
        }
    }

    public class b implements LoadingView.OnAnimEndListener {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                LoadingDialog.this.dismiss();
                if (LoadingDialog.this.e != null) {
                    LoadingDialog.this.e.onDismiss(LoadingDialog.this);
                }
                LoadingDialog.this.b.reset();
            }
        }

        public b() {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingView.OnAnimEndListener
        public void onAnimEnd() {
            if (LoadingDialog.this.e != null) {
                LoadingDialog.this.e.onAnimEnd(LoadingDialog.this);
            }
            if (LoadingDialog.this.f < 0) {
                return;
            }
            LoadingDialog.this.b.postDelayed(new a(), LoadingDialog.this.f);
        }
    }

    public LoadingDialog(Context context) {
        Dialog dialog = new Dialog(context, R.style.LoadingDialog);
        this.a = dialog;
        dialog.setOnShowListener(new a());
        dialog.setContentView(View.inflate(context, R.layout.loading_dialog_layout_dialog, null));
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        LoadingView loadingView = (LoadingView) dialog.findViewById(R.id.loading);
        this.b = loadingView;
        loadingView.startLoading();
        loadingView.setOnAnimEndListener(new b());
        this.c = (TextView) dialog.findViewById(R.id.message);
        this.d = (TextView) dialog.findViewById(R.id.tv_tips);
    }

    private void e(OnAnimEndListener onAnimEndListener) {
        this.e = onAnimEndListener;
    }

    public static LoadingDialog showDialog(Context context, CharSequence charSequence, @DrawableRes int i) {
        LoadingDialog loadingDialog = new LoadingDialog(context);
        loadingDialog.a.show();
        if (!TextUtils.isEmpty(charSequence)) {
            loadingDialog.setMessage(charSequence);
        }
        return loadingDialog;
    }

    public void dismiss() {
        this.b.stopLoading();
        Dialog dialog = this.a;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        try {
            this.a.dismiss();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public void hide() {
        this.a.hide();
    }

    public boolean isShowing() {
        return this.a.isShowing();
    }

    public void setCancelable(boolean z) {
        this.a.setCancelable(z);
    }

    public void setFailed(CharSequence charSequence) {
        setFailed(charSequence, null);
    }

    public void setMessage(CharSequence charSequence) {
        this.c.setVisibility(0);
        this.c.setText(charSequence);
    }

    public void setMessageAndTips(CharSequence charSequence, CharSequence charSequence2) {
        setMessage(charSequence);
        setTips(charSequence2);
    }

    public void setShownListener(LoadingShownListener loadingShownListener) {
        this.g = loadingShownListener;
    }

    public void setSuccess(CharSequence charSequence) {
        setSuccess(charSequence, null);
    }

    public void setTips(CharSequence charSequence) {
        this.d.setVisibility(0);
        this.d.setText(charSequence);
    }

    public void show() {
        this.b.startLoading();
        this.a.show();
    }

    public void setFailed(CharSequence charSequence, OnAnimEndListener onAnimEndListener) {
        setFailed(charSequence, 800, onAnimEndListener);
    }

    public void setSuccess(CharSequence charSequence, OnAnimEndListener onAnimEndListener) {
        setSuccess(charSequence, 800, onAnimEndListener);
    }

    public void setFailed(CharSequence charSequence, int i, OnAnimEndListener onAnimEndListener) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setVisibility(0);
            this.c.setText(charSequence);
        }
        setTips("");
        this.b.setFailed();
        this.f = i;
        e(onAnimEndListener);
    }

    public void setSuccess(CharSequence charSequence, int i, OnAnimEndListener onAnimEndListener) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.c.setVisibility(0);
            this.c.setText(charSequence);
        }
        this.d.setText("");
        this.b.setSuccess();
        this.f = i;
        e(onAnimEndListener);
    }

    public static LoadingDialog showDialog(Context context) {
        return showDialog(context, null, 0);
    }

    public static LoadingDialog showDialog(Context context, CharSequence charSequence) {
        return showDialog(context, charSequence, 0);
    }
}
