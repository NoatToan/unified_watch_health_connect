package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes21.dex */
class um {
    um() {
    }

    static void b(String str, String str2, Context context) {
        context.getApplicationContext().getSharedPreferences("com.braintreepayment.browserswitch.persistentstore", 0).edit().putString(str, str2).apply();
    }

    static String a(String str, Context context) {
        return context.getApplicationContext().getSharedPreferences("com.braintreepayment.browserswitch.persistentstore", 0).getString(str, null);
    }

    static void b(String str, Context context) {
        context.getApplicationContext().getSharedPreferences("com.braintreepayment.browserswitch.persistentstore", 0).edit().remove(str).apply();
    }
}
