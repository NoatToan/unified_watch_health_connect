package uz2;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.Checkable;

/* JADX INFO: loaded from: classes3.dex */
public class c extends b implements Checkable {
    public c(Context context) {
        super(context);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt instanceof Checkable) {
            return ((Checkable) childAt).isChecked();
        }
        return false;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z14) {
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt instanceof Checkable) {
            ((Checkable) childAt).setChecked(z14);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt instanceof Checkable) {
            ((Checkable) childAt).toggle();
        }
    }
}
