package a7;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private c() {
    }

    public static <T> T a(Intent intent, String str, Class<T> cls) {
        return (T) intent.getParcelableExtra(str, cls);
    }
}
