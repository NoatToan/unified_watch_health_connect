package com.xiaomi.account.utils;

import android.app.Activity;
import android.content.Intent;
import android.os.BadParcelableException;

/* JADX INFO: loaded from: classes6.dex */
public class ParcelableAttackGuardian {
    private static final String TAG = "ParcelableAttackGuardian";

    public boolean safeCheck(Activity activity) {
        if (activity == null || activity.getIntent() == null) {
            return true;
        }
        try {
            unparcelIntent(new Intent(activity.getIntent()));
            return true;
        } catch (BadParcelableException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("fail checking ParcelableAttack for Activity ");
            sb.append(activity.getClass().getName());
            return false;
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof ClassNotFoundException)) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("fail checking SerializableAttack for Activity ");
            sb2.append(activity.getClass().getName());
            return false;
        }
    }

    public void unparcelIntent(Intent intent) throws BadParcelableException {
        intent.getStringExtra("");
    }
}
