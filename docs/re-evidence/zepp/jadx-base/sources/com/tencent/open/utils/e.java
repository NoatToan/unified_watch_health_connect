package com.tencent.open.utils;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes18.dex */
public final class e {
    private static Context a;

    public static final Context a() {
        Context context = a;
        if (context == null) {
            return null;
        }
        return context;
    }

    public static final String b() {
        return a() == null ? "" : a().getPackageName();
    }

    public static final File c() {
        if (a() == null) {
            return null;
        }
        return a().getFilesDir();
    }

    public static final File d() {
        if (a() == null) {
            return null;
        }
        return a().getExternalFilesDir(null);
    }

    public static final void a(Context context) {
        a = context;
    }
}
