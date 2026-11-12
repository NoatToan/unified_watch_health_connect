package defpackage;

import android.animation.Animator;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes3.dex */
public class uc1 {
    public static Animator a(Fragment fragment, int i) {
        if (i == mgi.s) {
            return new r2a(fragment, true, true);
        }
        if (i == mgi.t) {
            return new r2a(fragment, true, false);
        }
        if (i == mgi.q) {
            return new r2a(fragment, false, true);
        }
        if (i == mgi.f26160r) {
            return new r2a(fragment, false, false);
        }
        return null;
    }
}
