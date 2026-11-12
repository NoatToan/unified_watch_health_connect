package com.amazon.identity.auth.device.appid;

import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.dataobject.AppInfo;
import com.amazon.identity.auth.device.utils.HashAlgorithm;
import com.amazon.identity.auth.device.utils.JSONUtils;
import com.amazon.identity.auth.device.utils.JWTDecoder;
import com.amazon.identity.auth.device.utils.PackageSignatureUtil;
import com.amazon.identity.auth.device.utils.ThirdPartyResourceParser;
import com.amazon.identity.auth.map.device.utils.MAPLog;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class APIKeyDecoder {
    private static final String EXPECTED_ISSUER = "Amazon";
    private static final String FAILED_TO_DECODE = "Failed to decode: ";
    private static final char HASH_SEPARATOR = ':';
    private static final String HTTPS = "https";
    private static final String KEY_API_KEY_VER = "ver";
    private static final String KEY_APP_FAMILY_ID = "appFamilyId";
    private static final String KEY_APP_ID = "appId";
    private static final String KEY_APP_VARIANT_ID = "appVariantId";
    public static final String KEY_AUTHORIZATION_HOST = "authz";
    private static final String KEY_CLIENT_ID = "clientId";
    public static final String KEY_ENDPOINTS = "endpoints";
    public static final String KEY_EXCHANGE_HOST = "tokenExchange";
    private static final String KEY_ISSUER = "iss";
    private static final String KEY_PACKAGE_NAME = "pkg";
    private static final String KEY_PERMISSIONS = "perm";
    private static final String KEY_SCOPES = "scopes";
    private static final String KEY_SIGNATURE_MD5 = "appsig";
    private static final String KEY_SIGNATURE_SHA256 = "appsigSha256";
    private static final String LOG_TAG = "com.amazon.identity.auth.device.appid.APIKeyDecoder";
    private static final String VER_1 = "1";
    private static final String VER_3 = "3";

    private APIKeyDecoder() throws Exception {
        throw new Exception("This class is not instantiable!");
    }

    public static AppInfo decode(String str, String str2, Context context) {
        return doDecode(str, str2, true, context);
    }

    public static AppInfo doDecode(String str, String str2, boolean z, Context context) {
        String str3 = LOG_TAG;
        MAPLog.i(str3, "Begin decoding API Key for packageName=" + str);
        JSONObject jSONObjectDecode = new JWTDecoder().decode(str2);
        MAPLog.pii(str3, ThirdPartyResourceParser.KEY_API_KEY, "payload=" + jSONObjectDecode);
        if (jSONObjectDecode == null) {
            MAPLog.w(str3, "Unable to decode APIKey for pkg=" + str);
            return null;
        }
        if (z) {
            try {
                verifyPayload(str, jSONObjectDecode, context);
            } catch (PackageManager.NameNotFoundException e) {
                MAPLog.w(LOG_TAG, FAILED_TO_DECODE + e.getMessage());
                MAPLog.w(LOG_TAG, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (AuthError e2) {
                MAPLog.w(LOG_TAG, FAILED_TO_DECODE + e2.getMessage());
                MAPLog.w(LOG_TAG, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (IOException e3) {
                MAPLog.w(LOG_TAG, FAILED_TO_DECODE + e3.getMessage());
                MAPLog.w(LOG_TAG, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (SecurityException e4) {
                MAPLog.w(LOG_TAG, FAILED_TO_DECODE + e4.getMessage());
                MAPLog.w(LOG_TAG, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (NoSuchAlgorithmException e5) {
                MAPLog.w(LOG_TAG, FAILED_TO_DECODE + e5.getMessage());
                MAPLog.w(LOG_TAG, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (CertificateException e6) {
                MAPLog.w(LOG_TAG, FAILED_TO_DECODE + e6.getMessage());
                MAPLog.w(LOG_TAG, "Unable to decode APIKey for pkg=" + str);
                return null;
            } catch (JSONException e7) {
                MAPLog.w(LOG_TAG, FAILED_TO_DECODE + e7.getMessage());
                MAPLog.w(LOG_TAG, "Unable to decode APIKey for pkg=" + str);
                return null;
            }
        }
        return extractAppInfo(jSONObjectDecode);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    public static AppInfo extractAppInfo(JSONObject jSONObject) throws JSONException, AuthError {
        String string;
        String string2;
        JSONObject jSONObject2;
        String str;
        String str2;
        String string3;
        String string4 = jSONObject.getString("ver");
        if (string4.equals("1")) {
            string = jSONObject.getString("appId");
            string2 = string;
        } else {
            string = jSONObject.getString(KEY_APP_FAMILY_ID);
            string2 = jSONObject.getString(KEY_APP_VARIANT_ID);
        }
        if (string4.equals("3")) {
            try {
                jSONObject2 = jSONObject.getJSONObject(KEY_ENDPOINTS);
            } catch (JSONException unused) {
                MAPLog.w(LOG_TAG, "APIKey does not contain endpoints object");
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                String string5 = jSONObject2.getString(KEY_AUTHORIZATION_HOST);
                String string6 = jSONObject2.getString(KEY_EXCHANGE_HOST);
                if (string5 != null && !string5.startsWith("https")) {
                    throw new AuthError("Authorization Host in APIKey is invalid", AuthError.ERROR_TYPE.ERROR_BAD_PARAM);
                }
                if (string6 != null && !string6.startsWith("https")) {
                    throw new AuthError("Exchange Host in APIKey is invalid", AuthError.ERROR_TYPE.ERROR_BAD_PARAM);
                }
                str = string6;
                str2 = string5;
            } else {
                str2 = null;
                str = null;
            }
        } else {
            str2 = null;
            str = null;
        }
        String string7 = jSONObject.getString(KEY_PACKAGE_NAME);
        String[] stringArray = JSONUtils.getStringArray(jSONObject, KEY_SCOPES);
        try {
            string3 = jSONObject.getString("clientId");
        } catch (JSONException unused2) {
            MAPLog.w(LOG_TAG, "APIKey does not contain a client id");
            string3 = null;
        }
        return new AppInfo(string, string2, string7, stringArray, JSONUtils.getStringArray(jSONObject, KEY_PERMISSIONS), string3, str2, str, jSONObject);
    }

    private static void verifyPayload(String str, JSONObject jSONObject, Context context) throws JSONException, PackageManager.NameNotFoundException, NoSuchAlgorithmException, SecurityException, IOException, CertificateException {
        String str2 = LOG_TAG;
        MAPLog.i(str2, "verifyPayload for packageName=" + str);
        if (!jSONObject.getString("iss").equals(EXPECTED_ISSUER)) {
            throw new SecurityException("Decoding fails: issuer (" + jSONObject.getString("iss") + ") is not = " + EXPECTED_ISSUER + " pkg=" + str);
        }
        if (str != null && !str.equals(jSONObject.getString(KEY_PACKAGE_NAME))) {
            throw new SecurityException("Decoding fails: package names don't match! - " + str + " != " + jSONObject.getString(KEY_PACKAGE_NAME));
        }
        if (jSONObject.has(KEY_SIGNATURE_MD5)) {
            String string = jSONObject.getString(KEY_SIGNATURE_MD5);
            MAPLog.pii(str2, "Validating MD5 signature in API key", String.format("pkg = %s and signature %s", str, string));
            verifySignature(string, str, HashAlgorithm.MD5, context);
        }
        if (jSONObject.has(KEY_SIGNATURE_SHA256)) {
            String string2 = jSONObject.getString(KEY_SIGNATURE_SHA256);
            MAPLog.pii(str2, "Validating SHA256 signature in API key", String.format("pkg = %s and signature %s", str, string2));
            verifySignature(string2, str, HashAlgorithm.SHA_256, context);
        }
    }

    private static void verifySignature(String str, String str2, HashAlgorithm hashAlgorithm, Context context) {
        if (str == null) {
            MAPLog.d(LOG_TAG, "App Signature is null. pkg=" + str2);
            throw new SecurityException("Decoding failed: certificate fingerprint can't be verified! pkg=" + str2);
        }
        String strReplace = str.replace(":", "");
        List<String> allSignaturesFor = PackageSignatureUtil.getAllSignaturesFor(str2, hashAlgorithm, context);
        String str3 = LOG_TAG;
        MAPLog.i(str3, "Number of signatures = " + allSignaturesFor.size());
        MAPLog.pii(str3, "Fingerprint checking", allSignaturesFor.toString());
        if (allSignaturesFor.contains(strReplace.toLowerCase(Locale.US))) {
            return;
        }
        throw new SecurityException("Decoding failed: certificate fingerprint can't be verified! pkg=" + str2);
    }
}
