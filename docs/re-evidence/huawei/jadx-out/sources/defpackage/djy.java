package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.huawei.haf.application.BaseApplication;

/* JADX INFO: loaded from: classes2.dex */
public final class djy implements View.OnClickListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View.OnClickListener f31835c;
    private djy d;

    public djy(View.OnClickListener onClickListener) {
        this.f31835c = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        djy djyVar = this.d;
        if (djyVar != null) {
            djyVar.b();
            this.d = null;
        }
        View.OnClickListener onClickListener = this.f31835c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
            b();
        }
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f31835c != null) {
            onClick(new View(BaseApplication.b()));
        }
    }

    void a(djy djyVar) {
        this.d = djyVar;
    }

    private void b() {
        this.f31835c = null;
    }
}
