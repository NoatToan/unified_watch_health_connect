package miuix.view;

import android.view.View;
import androidx.annotation.Keep;
import defpackage.alb;
import defpackage.blb;
import defpackage.dlb;

/* JADX INFO: loaded from: classes3.dex */
@Keep
class ExtendedVibrator implements blb {
    private static final String TAG = "ExtendedVibrator";

    static {
        initialize();
    }

    private ExtendedVibrator() {
    }

    private static void initialize() {
        if (PlatformConstants.VERSION < 0) {
            return;
        }
        HapticCompat.registerProvider(new ExtendedVibrator());
    }

    @Override // defpackage.blb
    public boolean performHapticFeedback(View view, int i) {
        if (i != alb.e) {
            return false;
        }
        dlb.a("performHapticFeedback: " + i);
        return view.performHapticFeedback(2);
    }
}
