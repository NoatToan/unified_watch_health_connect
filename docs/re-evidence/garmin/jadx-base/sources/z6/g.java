package z6;

import android.app.LocaleManager;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public class g {
    private g() {
    }

    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
