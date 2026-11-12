package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class ybj extends Dialog {
    public ybj(Context context) {
        super(context);
    }

    public abstract View getNegativeButton();

    public abstract List<String> getPermissionsToRequest();

    public abstract View getPositiveButton();

    public ybj(Context context, int i) {
        super(context, i);
    }

    public ybj(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
    }
}
