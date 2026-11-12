package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.view.Window;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes4.dex */
public abstract class lss extends Dialog {
    public lss(Context context) {
        super(context);
        b();
    }

    public abstract void a();

    public final void b() {
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            a();
            window.getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                attributes.width = -1;
                attributes.height = -2;
                attributes.gravity = 80;
            }
            window.setAttributes(attributes);
            window.setBackgroundDrawableResource(R.color.transparent);
        }
    }
}
