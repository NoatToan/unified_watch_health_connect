package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
class Store {
    static final String NO_BACKUP_FILE = "com.google.android.gms.appid-no-backup";
    static final String PREFERENCES = "com.google.android.gms.appid";
    private static final String SCOPE_ALL = "*";
    private static final String STORE_KEY_TOKEN = "|T|";
    final SharedPreferences store;

    public static class Token {
        private static final String KEY_APP_VERSION = "appVersion";
        private static final String KEY_TIMESTAMP = "timestamp";
        private static final String KEY_TOKEN = "token";
        private static final long REFRESH_PERIOD_MILLIS = CoreConstants.MILLIS_IN_ONE_WEEK;
        final String appVersion;
        final long timestamp;
        final String token;

        private Token(String str, String str2, long j8) {
            this.token = str;
            this.appVersion = str2;
            this.timestamp = j8;
        }

        public static String encode(String str, String str2, long j8) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(KEY_TOKEN, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put(KEY_TIMESTAMP, j8);
                return jSONObject.toString();
            } catch (JSONException e4) {
                e4.toString();
                return null;
            }
        }

        public static Token parse(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new Token(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new Token(jSONObject.getString(KEY_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong(KEY_TIMESTAMP));
            } catch (JSONException e4) {
                e4.toString();
                return null;
            }
        }

        public boolean needsRefresh(String str) {
            return System.currentTimeMillis() > this.timestamp + REFRESH_PERIOD_MILLIS || !str.equals(this.appVersion);
        }
    }

    public Store(Context context) {
        this.store = context.getSharedPreferences(PREFERENCES, 0);
        checkForRestore(context, NO_BACKUP_FILE);
    }

    private void checkForRestore(Context context, String str) {
        File file = new File(a7.b.getNoBackupFilesDir(context), str);
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || isEmpty()) {
                return;
            }
            deleteAll();
        } catch (IOException e4) {
            if (Log.isLoggable(Constants.TAG, 3)) {
                e4.getMessage();
            }
        }
    }

    private String createTokenKey(String str, String str2) {
        return com.nimbusds.jose.shaded.gson.internal.a.h(str, STORE_KEY_TOKEN, str2, "|*");
    }

    public synchronized void deleteAll() {
        this.store.edit().clear().commit();
    }

    public synchronized void deleteToken(String str, String str2) {
        String strCreateTokenKey = createTokenKey(str, str2);
        SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.remove(strCreateTokenKey);
        editorEdit.commit();
    }

    public synchronized Token getToken(String str, String str2) {
        return Token.parse(this.store.getString(createTokenKey(str, str2), null));
    }

    public synchronized boolean isEmpty() {
        return this.store.getAll().isEmpty();
    }

    public synchronized void saveToken(String str, String str2, String str3, String str4) {
        String strEncode = Token.encode(str3, str4, System.currentTimeMillis());
        if (strEncode == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.store.edit();
        editorEdit.putString(createTokenKey(str, str2), strEncode);
        editorEdit.commit();
    }
}
