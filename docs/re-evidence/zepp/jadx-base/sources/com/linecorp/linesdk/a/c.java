package com.linecorp.linesdk.a;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes18.dex */
public final class c {
    private static final com.linecorp.a.a.a.b a = new com.linecorp.a.a.a.b("com.linecorp.linesdk.sharedpreference.encryptionsalt");
    private static volatile boolean b = false;

    public static class a implements Runnable {

        @NonNull
        private final Context a;

        public a(@NonNull Context context) {
            this.a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.a.a(this.a);
        }
    }

    public static void a(@NonNull Context context) {
        if (b) {
            return;
        }
        b = true;
        Executors.newSingleThreadExecutor().execute(new a(context.getApplicationContext()));
    }

    @NonNull
    public static com.linecorp.a.a.a.b a() {
        return a;
    }
}
