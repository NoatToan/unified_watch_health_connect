package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes9.dex */
public class qz5 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogInterface.OnClickListener f32008a;

    public class a implements ViewTreeObserver.OnWindowAttachListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowAttached() {
        }

        @Override // android.view.ViewTreeObserver.OnWindowAttachListener
        public void onWindowDetached() {
            qz5.this.f32008a = null;
        }
    }

    private qz5(DialogInterface.OnClickListener onClickListener) {
        this.f32008a = onClickListener;
    }

    public static qz5 c(DialogInterface.OnClickListener onClickListener) {
        return new qz5(onClickListener);
    }

    public void b(Dialog dialog) {
        if (dialog == null) {
            return;
        }
        dialog.getWindow().getDecorView().getViewTreeObserver().addOnWindowAttachListener(new a());
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        DialogInterface.OnClickListener onClickListener = this.f32008a;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, i);
        }
    }
}
