package ph;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements DialogInterface.OnKeyListener {
    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i14, KeyEvent keyEvent) {
        return i14 == 4;
    }
}
