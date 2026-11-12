package com.datatheorem.android.trustkit.utils;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.preference.PreferenceManager;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class VendorIdentifier {
    private static final String a = "TRUSTKIT_VENDOR_ID";

    @NonNull
    public static String getOrCreate(@NonNull Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString(a, "");
        if (!string.equals("")) {
            return string;
        }
        TrustKitLog.i("Generating new vendor identifier...");
        String string2 = UUID.randomUUID().toString();
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        editorEdit.putString(a, string2);
        editorEdit.apply();
        return string2;
    }
}
