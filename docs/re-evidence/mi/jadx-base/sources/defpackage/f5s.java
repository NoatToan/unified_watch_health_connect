package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes11.dex */
public class f5s {
    public static boolean a(Context context) {
        try {
            return ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        } catch (Exception e) {
            x9s.s(e);
            return false;
        }
    }

    public static boolean b(Context context) {
        Intent intentC = null;
        try {
            intentC = a5t.c(context, null, new IntentFilter("android.intent.action.BATTERY_CHANGED"), null, null);
        } catch (Exception unused) {
        }
        if (intentC == null) {
            return false;
        }
        int intExtra = intentC.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }
}
