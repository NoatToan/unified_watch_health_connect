package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes16.dex */
public class qky {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static float f46413c = 1.0f;

    protected qky() {
        throw new UnsupportedOperationException();
    }

    public static void e(Context context) {
        f46413c = context.getResources().getDisplayMetrics().density;
    }

    public static float c(float f) {
        return f * f46413c;
    }
}
