package com.huawei.openalliance.ad.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.openalliance.ad.hw;
import java.lang.ref.SoftReference;
import java.security.interfaces.RSAPublicKey;

/* JADX INFO: loaded from: classes12.dex */
public class ce {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Uri f20528a = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid_pub_store/get").build();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Uri f20529b = new Uri.Builder().scheme("content").authority("com.huawei.hwid.pps.apiprovider").path("/oaid_pub_store_ks/get").build();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f20530c = new byte[0];
    private static SoftReference<RSAPublicKey> d;
    private static SoftReference<RSAPublicKey> e;

    private static RSAPublicKey e(Context context) {
        RSAPublicKey rSAPublicKey;
        synchronized (f20530c) {
            SoftReference<RSAPublicKey> softReference = e;
            rSAPublicKey = softReference != null ? softReference.get() : null;
            if (rSAPublicKey == null) {
                final Context applicationContext = context.getApplicationContext();
                final cw.a aVarA = cw.a.a(applicationContext);
                RSAPublicKey rSAPublicKeyA = co.a(aVarA.c());
                if (rSAPublicKeyA != null) {
                    e = new SoftReference<>(rSAPublicKeyA);
                }
                o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ce.2
                    @Override // java.lang.Runnable
                    public void run() {
                        String strB = ce.b(applicationContext);
                        hw.a("OaidSettingsUtil", "##### remote pub store: %s", strB);
                        aVarA.c(strB);
                    }
                });
                rSAPublicKey = rSAPublicKeyA;
            }
        }
        return rSAPublicKey;
    }

    private static RSAPublicKey d(Context context) {
        RSAPublicKey rSAPublicKey;
        synchronized (f20530c) {
            SoftReference<RSAPublicKey> softReference = d;
            rSAPublicKey = softReference != null ? softReference.get() : null;
            if (rSAPublicKey == null) {
                final Context applicationContext = context.getApplicationContext();
                final cw.a aVarA = cw.a.a(applicationContext);
                RSAPublicKey rSAPublicKeyA = co.a(aVarA.e());
                if (rSAPublicKeyA != null) {
                    d = new SoftReference<>(rSAPublicKeyA);
                }
                o.a(new Runnable() { // from class: com.huawei.openalliance.ad.utils.ce.1
                    @Override // java.lang.Runnable
                    public void run() {
                        String strC = ce.c(applicationContext);
                        hw.a("OaidSettingsUtil", "##### remote pub store KS: %s", strC);
                        aVarA.e(strC);
                    }
                });
                rSAPublicKey = rSAPublicKeyA;
            }
        }
        return rSAPublicKey;
    }

    public static String c(Context context) {
        StringBuilder sb;
        Cursor cursorQuery = null;
        try {
            try {
                Uri uri = f20529b;
                if (!as.b(context, uri)) {
                    return "";
                }
                cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    return cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("pub_store_ks"));
                }
                return "";
            } catch (IllegalArgumentException e2) {
                sb = new StringBuilder("remote pub ");
                sb.append(e2.getClass().getSimpleName());
                hw.c("OaidSettingsUtil", sb.toString());
            } catch (Throwable th) {
                sb = new StringBuilder("remote pub ");
                sb.append(th.getClass().getSimpleName());
                hw.c("OaidSettingsUtil", sb.toString());
            }
        } finally {
            df.a(cursorQuery);
        }
    }

    public static String b(Context context) {
        StringBuilder sb;
        Cursor cursorQuery = null;
        try {
            try {
                Uri uri = f20528a;
                if (!as.b(context, uri)) {
                    return "";
                }
                cursorQuery = context.getContentResolver().query(uri, null, null, null, null);
                if (cursorQuery != null && cursorQuery.moveToFirst()) {
                    return cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("pub_store"));
                }
                return "";
            } catch (IllegalArgumentException e2) {
                sb = new StringBuilder("remote pub ");
                sb.append(e2.getClass().getSimpleName());
                hw.c("OaidSettingsUtil", sb.toString());
            } catch (Throwable th) {
                sb = new StringBuilder("remote pub ");
                sb.append(th.getClass().getSimpleName());
                hw.c("OaidSettingsUtil", sb.toString());
            }
        } finally {
            df.a(cursorQuery);
        }
    }

    public static Pair<String, Boolean> a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            String string = Settings.Global.getString(context.getContentResolver(), "pps_oaid_c");
            if (!TextUtils.isEmpty(string)) {
                hw.a("OaidSettingsUtil", "read and decrypt oaid.");
                return cd.a(context, string);
            }
            ContentResolver contentResolver = context.getContentResolver();
            String string2 = Settings.Global.getString(contentResolver, "pps_oaid");
            String string3 = Settings.Global.getString(contentResolver, "pps_track_limit");
            if (!TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                RSAPublicKey rSAPublicKeyD = d(context);
                String strA = db.a(string2 + string3);
                boolean zA = co.a(context, strA, Settings.Global.getString(contentResolver, "pps_oaid_digest_pss"), rSAPublicKeyD);
                hw.a("OaidSettingsUtil", "verifySignPss result: %s", Boolean.valueOf(zA));
                if (!zA) {
                    d = null;
                    zA = co.a(strA, Settings.Global.getString(contentResolver, "pps_oaid_digest"), e(context));
                    hw.a("OaidSettingsUtil", "verifySign result: %s", Boolean.valueOf(zA));
                }
                if (!zA) {
                    e = null;
                    return null;
                }
                Boolean boolValueOf = Boolean.valueOf(string3);
                boolValueOf.booleanValue();
                return new Pair<>(string2, boolValueOf);
            }
            return null;
        } catch (Throwable th) {
            hw.c("OaidSettingsUtil", "exception happen: " + th.getClass().getSimpleName());
        }
    }
}
