package defpackage;

import android.app.Activity;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
public class out {
    public static <T extends View> T b(View view, int i) {
        return (T) view.findViewById(i);
    }

    public static <T extends View> T d(Activity activity, int i) {
        return (T) activity.findViewById(i);
    }
}
