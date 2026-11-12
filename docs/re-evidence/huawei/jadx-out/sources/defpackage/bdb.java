package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes23.dex */
public final class bdb {
    public static <T extends View> T d(View view, int i) {
        if (view != null) {
            return (T) view.findViewById(i);
        }
        return null;
    }
}
