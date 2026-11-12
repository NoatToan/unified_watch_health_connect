package com.github.tamir7.contacts;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class Contacts {
    private static Context a;

    private Contacts() {
    }

    public static Query getQuery() {
        Context context = a;
        if (context != null) {
            return new Query(context);
        }
        throw new IllegalStateException("Contacts library not initialized");
    }

    public static void initialize(Context context) {
        a = context.getApplicationContext();
    }
}
