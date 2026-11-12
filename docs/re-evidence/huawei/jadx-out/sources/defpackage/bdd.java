package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes23.dex */
public class bdd {
    public static SharedPreferences e(Context context, String str, int i) {
        if (context == null) {
            return null;
        }
        Context contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
        SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("move2DE_records", 0);
        if (sharedPreferences.getBoolean(str, false)) {
            context = contextCreateDeviceProtectedStorageContext;
        } else if (contextCreateDeviceProtectedStorageContext.moveSharedPreferencesFrom(context, str)) {
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(str, true);
            editorEdit.apply();
            context = contextCreateDeviceProtectedStorageContext;
        } else {
            bcw.d("SharedPreferenceUtil4DE", "Failed to move shared preference");
        }
        return context.getSharedPreferences(str, i);
    }
}
