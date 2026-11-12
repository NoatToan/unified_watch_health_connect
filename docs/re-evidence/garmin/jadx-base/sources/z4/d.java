package z4;

import android.view.KeyEvent;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final long a(KeyEvent keyEvent) {
        return f.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action == 0) {
            c.f202307b.getClass();
            return c.f202309d;
        }
        if (action != 1) {
            c.f202307b.getClass();
            return 0;
        }
        c.f202307b.getClass();
        return c.f202308c;
    }
}
