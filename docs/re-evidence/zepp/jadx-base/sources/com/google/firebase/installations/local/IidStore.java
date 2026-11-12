package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.alipay.sdk.m.n.d;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.FirebaseApp;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class IidStore {
    private static final String c = "com.google.android.gms.appid";
    private static final String d = "|S||P|";
    private static final String e = "|S|id";
    private static final String f = "|T|";
    private static final String g = "|";
    private static final String h = "token";
    private static final String i = "{";
    private static final String[] j = {"*", "FCM", CodePackage.GCM, ""};

    @GuardedBy("iidPrefs")
    private final SharedPreferences a;
    private final String b;

    public IidStore(@NonNull FirebaseApp firebaseApp) {
        this.a = firebaseApp.getApplicationContext().getSharedPreferences(c, 0);
        this.b = b(firebaseApp);
    }

    private String a(@NonNull String str, @NonNull String str2) {
        return f + str + "|" + str2;
    }

    private static String b(FirebaseApp firebaseApp) {
        String gcmSenderId = firebaseApp.getOptions().getGcmSenderId();
        if (gcmSenderId != null) {
            return gcmSenderId;
        }
        String applicationId = firebaseApp.getOptions().getApplicationId();
        if (!applicationId.startsWith("1:") && !applicationId.startsWith("2:")) {
            return applicationId;
        }
        String[] strArrSplit = applicationId.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @Nullable
    private static String c(@NonNull PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    private String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    private PublicKey e(String str) {
        try {
            return KeyFactory.getInstance(d.a).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e2) {
            Log.w("ContentValues", "Invalid key stored " + e2);
            return null;
        }
    }

    @Nullable
    private String f() {
        String string;
        synchronized (this.a) {
            string = this.a.getString(e, null);
        }
        return string;
    }

    @Nullable
    private String g() {
        synchronized (this.a) {
            String string = this.a.getString(d, null);
            if (string == null) {
                return null;
            }
            PublicKey publicKeyE = e(string);
            if (publicKeyE == null) {
                return null;
            }
            return c(publicKeyE);
        }
    }

    @Nullable
    public String readIid() {
        synchronized (this.a) {
            String strF = f();
            if (strF != null) {
                return strF;
            }
            return g();
        }
    }

    @Nullable
    public String readToken() {
        synchronized (this.a) {
            for (String str : j) {
                String string = this.a.getString(a(this.b, str), null);
                if (string != null && !string.isEmpty()) {
                    if (string.startsWith(i)) {
                        string = d(string);
                    }
                    return string;
                }
            }
            return null;
        }
    }

    @VisibleForTesting
    public IidStore(@NonNull SharedPreferences sharedPreferences, @Nullable String str) {
        this.a = sharedPreferences;
        this.b = str;
    }
}
