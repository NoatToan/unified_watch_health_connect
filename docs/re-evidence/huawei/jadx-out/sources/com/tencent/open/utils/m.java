package com.tencent.open.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import androidx.core.content.FileProvider;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.Tencent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f31122a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f31123b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f31124c = "";
    private static String d = "";
    private static int e = -1;
    private static String f = "0123456789ABCDEF";

    private static char a(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }

    public static Bundle a(String str) {
        Bundle bundle = new Bundle();
        if (str != null) {
            try {
                for (String str2 : str.split("&")) {
                    String[] strArrA = a(str2, "=");
                    if (strArrA.length == 2) {
                        bundle.putString(URLDecoder.decode(strArrA[0]), URLDecoder.decode(strArrA[1]));
                    }
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return bundle;
    }

    public static String[] a(String str, String str2) {
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf == -1) {
            return new String[]{str};
        }
        return new String[]{str.substring(0, iIndexOf), str.substring(iIndexOf + str2.length())};
    }

    public static JSONObject a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (str != null) {
            for (String str2 : str.split("&")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    try {
                        try {
                            strArrSplit[0] = URLDecoder.decode(strArrSplit[0]);
                            strArrSplit[1] = URLDecoder.decode(strArrSplit[1]);
                        } catch (JSONException e2) {
                            SLog.e("openSDK_LOG.Util", "decodeUrlToJson has exception: " + e2.getMessage());
                        }
                    } catch (Exception unused) {
                    }
                    jSONObject.put(strArrSplit[0], strArrSplit[1]);
                }
            }
        }
        return jSONObject;
    }

    public static Bundle b(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            Bundle bundleA = a(url.getQuery());
            bundleA.putAll(a(url.getRef()));
            return bundleA;
        } catch (MalformedURLException unused) {
            return new Bundle();
        }
    }

    public static JSONObject c(String str) {
        try {
            URL url = new URL(str.replace("auth://", "http://"));
            JSONObject jSONObjectA = a((JSONObject) null, url.getQuery());
            a(jSONObjectA, url.getRef());
            return jSONObjectA;
        } catch (MalformedURLException unused) {
            return new JSONObject();
        }
    }

    public static JSONObject d(String str) throws JSONException {
        if (str.equals("false")) {
            str = "{value : false}";
        }
        if (str.equals("true")) {
            str = "{value : true}";
        }
        if (str.contains("allback(")) {
            str = str.replaceFirst("[\\s\\S]*allback\\(([\\s\\S]*)\\);[^\\)]*\\z", "$1").trim();
        }
        if (str.contains("online[0]=")) {
            str = "{online:" + str.charAt(str.length() - 2) + "}";
        }
        return new JSONObject(str);
    }

    public static boolean e(String str) {
        return str == null || str.length() == 0;
    }

    private static boolean g(Context context) {
        Signature[] signatureArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.tencent.mtt", 64);
            String str = packageInfo.versionName;
            if (k.a(str, "4.3") >= 0 && !str.startsWith("4.4") && (signatureArr = packageInfo.signatures) != null) {
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    messageDigest.update(signatureArr[0].toByteArray());
                    String strA = a(messageDigest.digest());
                    messageDigest.reset();
                    if (strA.equals("d8391a394d4a179e6fe7bdb8a301258b")) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException e2) {
                    SLog.e("openSDK_LOG.Util", "isQQBrowerAvailable has exception: " + e2.getMessage());
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean a(Context context, String str) {
        try {
            boolean zG = g(context);
            try {
                if (zG) {
                    a(context, "com.tencent.mtt", "com.tencent.mtt.MainActivity", str);
                } else {
                    a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                }
                return true;
            } catch (Exception unused) {
                if (zG) {
                    try {
                        try {
                            try {
                                a(context, "com.android.browser", "com.android.browser.BrowserActivity", str);
                                return true;
                            } catch (Exception unused2) {
                                return false;
                            }
                        } catch (Exception unused3) {
                            a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                            return true;
                        }
                    } catch (Exception unused4) {
                        a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    }
                }
                try {
                    try {
                        a(context, "com.google.android.browser", "com.android.browser.BrowserActivity", str);
                        return true;
                    } catch (Exception unused5) {
                        a(context, "com.android.chrome", "com.google.android.apps.chrome.Main", str);
                        return true;
                    }
                } catch (Exception unused6) {
                    return false;
                }
            }
        } catch (Exception unused7) {
        }
    }

    private static void a(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(str, str2));
        intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str3));
        context.startActivity(intent);
    }

    public static String f(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e2) {
            SLog.e("openSDK_LOG.Util", "urlEncode: UnsupportedEncodingException", e2);
            return "";
        }
    }

    public static String g(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(j(str));
            byte[] bArrDigest = messageDigest.digest();
            if (bArrDigest != null) {
                StringBuilder sb = new StringBuilder();
                for (byte b2 : bArrDigest) {
                    sb.append(a(b2 >>> 4));
                    sb.append(a(b2));
                }
                return sb.toString();
            }
        } catch (NoSuchAlgorithmException e2) {
            SLog.e("openSDK_LOG.Util", "encrypt has exception: " + e2.getMessage());
        }
        return str;
    }

    public static boolean a() {
        return (Environment.getExternalStorageState().equals("mounted") ? Environment.getExternalStorageDirectory() : null) != null;
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            String string = Integer.toString(b2 & 255, 16);
            if (string.length() == 1) {
                string = "0" + string;
            }
            sb.append(string);
        }
        return sb.toString();
    }

    public static final String a(Context context) {
        CharSequence applicationLabel;
        if (context == null || (applicationLabel = context.getPackageManager().getApplicationLabel(context.getApplicationInfo())) == null) {
            return null;
        }
        return applicationLabel.toString();
    }

    public static final boolean h(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("http://") || str.startsWith("https://");
    }

    public static boolean i(String str) {
        return str != null && new File(str).exists();
    }

    public static final String a(String str, int i, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "UTF-8";
        }
        try {
            if (str.getBytes(str2).length > i) {
                int i2 = 0;
                int length = 0;
                while (i2 < str.length()) {
                    int i3 = i2 + 1;
                    length += str.substring(i2, i3).getBytes(str2).length;
                    if (length > i) {
                        String strSubstring = str.substring(0, i2);
                        if (TextUtils.isEmpty(str3)) {
                            return strSubstring;
                        }
                        return strSubstring + str3;
                    }
                    i2 = i3;
                }
            }
            return str;
        } catch (Exception e2) {
            SLog.e("openSDK_LOG.Util", "Util.subString has exception: " + e2.getMessage());
            return str;
        }
    }

    public static boolean b(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo[] allNetworkInfo;
        if (context == null || i(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return true;
        }
        try {
            allNetworkInfo = connectivityManager.getAllNetworkInfo();
        } catch (Exception e2) {
            SLog.e("openSDK_LOG.Util", "Util.isNetWorkAvailable has exception: ", e2);
            allNetworkInfo = null;
        }
        if (allNetworkInfo != null && allNetworkInfo.length != 0) {
            for (NetworkInfo networkInfo : allNetworkInfo) {
                if (networkInfo.isConnectedOrConnecting()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean i(Context context, String str) {
        try {
            return context.checkSelfPermission(str) != 0;
        } catch (Exception e2) {
            SLog.e("openSDK_LOG.Util", "checkSelfPermission exception", e2);
            return false;
        }
    }

    public static Bundle a(Bundle bundle, String str) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("result", str);
        return bundle;
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        Bundle bundle = new Bundle();
        bundle.putString("openid", str);
        bundle.putString("report_type", str2);
        bundle.putString("act_type", str3);
        bundle.putString("via", str4);
        bundle.putString("app_id", str5);
        bundle.putString("type", str6);
        bundle.putString("login_status", str7);
        bundle.putString("need_user_auth", str8);
        bundle.putString("to_uin", str9);
        bundle.putString("call_source", str10);
        bundle.putString("to_type", str11);
        bundle.putString("platform", "1");
        return bundle;
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5) {
        return a(str, str3, str4, str2, str5, "", "", "", "", "", "");
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6) {
        return a(str, str3, str4, str2, str5, str6, "", "", "", "", "", "");
    }

    public static Bundle a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        return a(a(str, str2, str3, str4, str5, str7, str8, str9, str10, str11, str12), str6);
    }

    public static void b(Context context, String str) {
        if (context == null) {
            return;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            String str2 = packageInfo.versionName;
            f31123b = str2;
            f31122a = str2.substring(0, str2.lastIndexOf(46));
            String str3 = f31123b;
            d = str3.substring(str3.lastIndexOf(46) + 1, f31123b.length());
            e = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            SLog.e("openSDK_LOG.Util", "getPackageInfo has exception: " + e2.getMessage());
        } catch (Exception e3) {
            SLog.e("openSDK_LOG.Util", "getPackageInfo has exception: " + e3.getMessage());
        }
    }

    public static String c(Context context, String str) {
        if (context == null) {
            return "";
        }
        b(context, str);
        return f31123b;
    }

    public static String d(Context context, String str) {
        if (context == null) {
            return "";
        }
        b(context, str);
        return f31122a;
    }

    public static String e(Context context, String str) {
        if (context == null) {
            return "";
        }
        String strD = d(context, str);
        f31124c = strD;
        return strD;
    }

    public static byte[] j(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            SLog.e("openSDK_LOG.Util", "getBytesUTF8: UnsupportedEncodingException", e2);
            return new byte[0];
        }
    }

    public static boolean c(Context context) {
        double dSqrt;
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            dSqrt = Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
        } catch (Throwable unused) {
            dSqrt = 0.0d;
        }
        return dSqrt > 6.5d;
    }

    public static boolean f(Context context, String str) {
        boolean z = !c(context) || k.a(context, Constants.PACKAGE_QQ_PAD) == null;
        if (z && k.a(context, Constants.PACKAGE_TIM) != null) {
            z = false;
        }
        if (z) {
            return k.c(context, str) < 0;
        }
        return z;
    }

    public static boolean g(Context context, String str) {
        boolean z = !c(context) || k.a(context, Constants.PACKAGE_QQ_PAD) == null;
        if (z) {
            return k.c(context, str) < 0;
        }
        return z;
    }

    public static boolean a(Context context, boolean z) {
        return (c(context) && k.a(context, Constants.PACKAGE_QQ_PAD) != null) || k.c(context, "4.1") >= 0 || k.a(context, Constants.PACKAGE_TIM) != null;
    }

    public static boolean d(Context context) {
        return k.c(context, "8.1.5") >= 0;
    }

    public static boolean e(Context context) {
        return k.c(context, "8.1.8") >= 0;
    }

    public static boolean f(Context context) {
        return k.c(context, "5.9.5") >= 0;
    }

    public static long a(Context context, Uri uri) {
        Cursor cursorQuery = context.getContentResolver().query(uri, new String[]{"_size"}, null, null, null);
        long j = 0;
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() != 0) {
                    try {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_size");
                        if (cursorQuery.moveToFirst()) {
                            j = cursorQuery.getLong(columnIndexOrThrow);
                        }
                    } catch (Exception e2) {
                        SLog.e("openSDK_LOG.Util", "cursor exception", e2);
                    }
                    return j;
                }
            } finally {
                try {
                    cursorQuery.close();
                } catch (Exception e3) {
                    SLog.e("openSDK_LOG.Util", "cursor exception", e3);
                }
            }
        }
        return 0L;
    }

    public static String b(Context context, Uri uri) {
        Uri uri2;
        if (uri == null) {
            return null;
        }
        if (DocumentsContract.isDocumentUri(context, uri)) {
            String authority = uri.getAuthority();
            if ("com.android.externalstorage.documents".equals(authority)) {
                String[] strArrSplit = DocumentsContract.getDocumentId(uri).split(":");
                String str = strArrSplit[0];
                if ("primary".equals(str)) {
                    return Environment.getExternalStorageDirectory().getAbsolutePath().concat("/").concat(strArrSplit[1]);
                }
                return "/storage/".concat(str).concat("/").concat(strArrSplit[1]);
            }
            if ("com.android.providers.downloads.documents".equals(authority)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (documentId.startsWith("raw:")) {
                    return documentId.replaceFirst("raw:", "");
                }
                return c(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(documentId)));
            }
            if ("com.android.providers.media.documents".equals(authority)) {
                String[] strArrSplit2 = DocumentsContract.getDocumentId(uri).split(":");
                String str2 = strArrSplit2[0];
                if ("image".equals(str2)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str2)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str2)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return c(context, ContentUris.withAppendedId(uri2, Long.parseLong(strArrSplit2[1])));
            }
            return null;
        }
        String scheme = uri.getScheme();
        if ("content".equals(scheme)) {
            return c(context, uri);
        }
        if ("file".equals(scheme)) {
            return uri.getPath();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:118:0x01ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x01e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v47 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.os.ParcelFileDescriptor] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.io.FileInputStream] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.io.FileInputStream] */
    public static String c(Context context, Uri uri) throws Throwable {
        ?? fileInputStream;
        Throwable th;
        ?? r11;
        ?? r3;
        Exception e2;
        FileOutputStream fileOutputStream;
        ?? r10 = 0;
        r10 = 0;
        try {
            fileInputStream = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
            if (fileInputStream != 0) {
                try {
                    if (fileInputStream.moveToFirst()) {
                        return fileInputStream.getString(fileInputStream.getColumnIndexOrThrow("_data"));
                    }
                } catch (Exception e3) {
                    e = e3;
                    ?? OpenFileDescriptor = "queryAbsolutePath error : " + e.getMessage();
                    SLog.e("openSDK_LOG.Util", OpenFileDescriptor);
                    if (fileInputStream != 0) {
                        fileInputStream.close();
                    }
                    try {
                        try {
                            OpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r");
                            try {
                                fileInputStream = new FileInputStream(OpenFileDescriptor.getFileDescriptor());
                                try {
                                    File fileH = h(context, "Images");
                                    if (fileH == null) {
                                        SLog.e("openSDK_LOG.Util", "getExternalFilesDir return null");
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e4) {
                                            SLog.e("openSDK_LOG.Util", "close fileIuputStream error" + e4.getMessage());
                                        }
                                        if (OpenFileDescriptor != 0) {
                                            try {
                                                OpenFileDescriptor.close();
                                            } catch (IOException e5) {
                                                SLog.e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e5.getMessage());
                                            }
                                        }
                                        return null;
                                    }
                                    if (!fileH.exists()) {
                                        fileH.mkdirs();
                                    }
                                    File file = new File(fileH, uri.getLastPathSegment());
                                    if (!file.exists()) {
                                        file.createNewFile();
                                    }
                                    fileOutputStream = new FileOutputStream(file);
                                    try {
                                        byte[] bArr = new byte[2048];
                                        while (true) {
                                            int i = fileInputStream.read(bArr);
                                            if (i == -1) {
                                                break;
                                            }
                                            fileOutputStream.write(bArr, 0, i);
                                        }
                                        fileOutputStream.flush();
                                        String absolutePath = file.getAbsolutePath();
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e6) {
                                            SLog.e("openSDK_LOG.Util", "close fileIuputStream error" + e6.getMessage());
                                        }
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e7) {
                                            SLog.e("openSDK_LOG.Util", "close fileOutputStream error" + e7.getMessage());
                                        }
                                        if (OpenFileDescriptor != 0) {
                                            try {
                                                OpenFileDescriptor.close();
                                            } catch (IOException e8) {
                                                SLog.e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e8.getMessage());
                                            }
                                        }
                                        return absolutePath;
                                    } catch (Exception e9) {
                                        e2 = e9;
                                        SLog.e("openSDK_LOG.Util", "copy file from uri error : " + e2.getMessage());
                                        if (fileInputStream != 0) {
                                            try {
                                                fileInputStream.close();
                                            } catch (IOException e10) {
                                                SLog.e("openSDK_LOG.Util", "close fileIuputStream error" + e10.getMessage());
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (IOException e11) {
                                                SLog.e("openSDK_LOG.Util", "close fileOutputStream error" + e11.getMessage());
                                            }
                                        }
                                        if (OpenFileDescriptor != 0) {
                                            try {
                                                OpenFileDescriptor.close();
                                            } catch (IOException e12) {
                                                SLog.e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e12.getMessage());
                                            }
                                        }
                                        return null;
                                    }
                                } catch (Exception e13) {
                                    e2 = e13;
                                    fileOutputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    context = null;
                                    r10 = fileInputStream;
                                    r3 = OpenFileDescriptor;
                                    r11 = context;
                                    if (r10 != 0) {
                                        try {
                                            r10.close();
                                        } catch (IOException e14) {
                                            SLog.e("openSDK_LOG.Util", "close fileIuputStream error" + e14.getMessage());
                                        }
                                    }
                                    if (r11 != 0) {
                                        try {
                                            r11.close();
                                        } catch (IOException e15) {
                                            SLog.e("openSDK_LOG.Util", "close fileOutputStream error" + e15.getMessage());
                                        }
                                    }
                                    if (r3 != 0) {
                                        throw th;
                                    }
                                    try {
                                        r3.close();
                                        throw th;
                                    } catch (IOException e16) {
                                        SLog.e("openSDK_LOG.Util", "close ParcelFileDescriptor error" + e16.getMessage());
                                        throw th;
                                    }
                                }
                            } catch (Exception e17) {
                                e2 = e17;
                                fileOutputStream = null;
                                fileInputStream = 0;
                            } catch (Throwable th3) {
                                th = th3;
                                r11 = 0;
                                r3 = OpenFileDescriptor;
                                if (r10 != 0) {
                                    r10.close();
                                }
                                if (r11 != 0) {
                                    r11.close();
                                }
                                if (r3 != 0) {
                                    throw th;
                                }
                                r3.close();
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Exception e18) {
                        e2 = e18;
                        fileOutputStream = null;
                        OpenFileDescriptor = 0;
                        fileInputStream = 0;
                    } catch (Throwable th5) {
                        th = th5;
                        r11 = 0;
                        r3 = 0;
                    }
                }
            }
            return null;
        } catch (Exception e19) {
            e = e19;
            fileInputStream = 0;
        }
    }

    public static String k(String str) {
        return a(str, 2);
    }

    public static String a(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.encodeToString(str.getBytes("UTF-8"), i);
            } catch (UnsupportedEncodingException e2) {
                SLog.e("openSDK_LOG.Util", "convert2Base64String exception: " + e2.getMessage());
                return "";
            }
        }
        return "";
    }

    public static Drawable a(String str, Context context) throws Throwable {
        InputStream inputStreamOpen;
        StringBuilder sb;
        InputStream inputStream = null;
        drawableCreateFromStream = null;
        Drawable drawableCreateFromStream = null;
        if (context == null) {
            SLog.e("openSDK_LOG.Util", "context null!");
            return null;
        }
        try {
            inputStreamOpen = context.getAssets().open(str);
            try {
                try {
                    drawableCreateFromStream = Drawable.createFromStream(inputStreamOpen, str);
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e2) {
                        e = e2;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        SLog.e("openSDK_LOG.Util", sb.toString());
                    }
                } catch (IOException e3) {
                    e = e3;
                    SLog.e("openSDK_LOG.Util", "getDrawable exception: " + e.getMessage());
                    try {
                        inputStreamOpen.close();
                    } catch (Exception e4) {
                        e = e4;
                        sb = new StringBuilder("inputStream close exception: ");
                        sb.append(e.getMessage());
                        SLog.e("openSDK_LOG.Util", sb.toString());
                    }
                }
            } catch (Throwable th) {
                th = th;
                inputStream = inputStreamOpen;
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    SLog.e("openSDK_LOG.Util", "inputStream close exception: " + e5.getMessage());
                }
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            inputStreamOpen = null;
        } catch (Throwable th2) {
            th = th2;
            inputStream.close();
            throw th;
        }
        return drawableCreateFromStream;
    }

    public static File h(Context context, String str) {
        File[] externalFilesDirs;
        if (context == null || (externalFilesDirs = context.getExternalFilesDirs(str)) == null || externalFilesDirs.length <= 0) {
            return null;
        }
        return externalFilesDirs[0];
    }

    public static String b() {
        File fileE = g.e();
        if (fileE == null) {
            return null;
        }
        if (!fileE.exists()) {
            fileE.mkdirs();
        }
        return fileE.toString();
    }

    public static boolean c() {
        Context contextA = g.a();
        return contextA != null && contextA.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", contextA.getPackageName()) == 0;
    }

    public static File l(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            if (file.getParentFile() != null && !file.getParentFile().exists()) {
                if (file.getParentFile().mkdirs()) {
                    file.createNewFile();
                    return file;
                }
                SLog.d("openSDK_LOG.Util", "createFile failed" + str);
                return file;
            }
            file.createNewFile();
        }
        return file;
    }

    public static boolean b(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        try {
            return a(file, l(str2));
        } catch (IOException e2) {
            SLog.d("openSDK_LOG.Util", "copy fail from " + str + " to " + str2 + " ", e2);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0096 A[EXC_TOP_SPLITTER, PHI: r2 r8
      0x0096: PHI (r2v8 java.io.FileOutputStream) = (r2v6 java.io.FileOutputStream), (r2v9 java.io.FileOutputStream) binds: [B:50:0x0082, B:60:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0096: PHI (r8v11 ??) = (r8v9 ??), (r8v12 ??) binds: [B:50:0x0082, B:60:0x0094] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.BufferedInputStream] */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static boolean a(File file, File file2) throws Throwable {
        ?? r8;
        FileOutputStream fileOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedInputStream bufferedInputStream2 = null;
        BufferedInputStream bufferedInputStream3 = null;
        fileOutputStream = null;
        fileOutputStream = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                if (file2.exists()) {
                    file2.delete();
                }
                if (file2.getParentFile() != null && !file2.getParentFile().exists()) {
                    file2.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream3 = new FileOutputStream((File) file2);
                try {
                    BufferedInputStream bufferedInputStream4 = new BufferedInputStream(new FileInputStream(file));
                    try {
                        byte[] bArr = new byte[com.huawei.openalliance.ad.constant.Constants.GIF_SIZE_UPPER_LIMIT_KB];
                        while (true) {
                            int i = bufferedInputStream4.read(bArr);
                            if (i != -1) {
                                fileOutputStream3.write(bArr, 0, i);
                                fileOutputStream3.flush();
                            } else {
                                try {
                                    break;
                                } catch (IOException e2) {
                                    SLog.e("openSDK_LOG.Util", "copyFile error, ", e2);
                                }
                            }
                        }
                        fileOutputStream3.close();
                        try {
                            bufferedInputStream4.close();
                        } catch (IOException e3) {
                            SLog.e("openSDK_LOG.Util", "copyFile error, ", e3);
                        }
                        return true;
                    } catch (IOException e4) {
                        e = e4;
                        bufferedInputStream = bufferedInputStream4;
                        file2 = bufferedInputStream;
                        fileOutputStream = fileOutputStream3;
                        SLog.e("openSDK_LOG.Util", "copyFile error, ", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e5) {
                                SLog.e("openSDK_LOG.Util", "copyFile error, ", e5);
                            }
                        }
                        if (file2 != 0) {
                            try {
                                file2.close();
                            } catch (IOException e6) {
                                SLog.e("openSDK_LOG.Util", "copyFile error, ", e6);
                            }
                        }
                        return false;
                    } catch (OutOfMemoryError e7) {
                        e = e7;
                        bufferedInputStream2 = bufferedInputStream4;
                        file2 = bufferedInputStream2;
                        fileOutputStream = fileOutputStream3;
                        SLog.e("openSDK_LOG.Util", "copyFile error, ", e);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e8) {
                                SLog.e("openSDK_LOG.Util", "copyFile error, ", e8);
                            }
                        }
                        if (file2 != 0) {
                            file2.close();
                        }
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        bufferedInputStream3 = bufferedInputStream4;
                        r8 = bufferedInputStream3;
                        fileOutputStream2 = fileOutputStream3;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e9) {
                                SLog.e("openSDK_LOG.Util", "copyFile error, ", e9);
                            }
                        }
                        if (r8 == 0) {
                            throw th;
                        }
                        try {
                            r8.close();
                            throw th;
                        } catch (IOException e10) {
                            SLog.e("openSDK_LOG.Util", "copyFile error, ", e10);
                            throw th;
                        }
                    }
                } catch (IOException e11) {
                    e = e11;
                } catch (OutOfMemoryError e12) {
                    e = e12;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream2 = fileOutputStream;
                r8 = file2;
            }
        } catch (IOException e13) {
            e = e13;
            file2 = 0;
        } catch (OutOfMemoryError e14) {
            e = e14;
            file2 = 0;
        } catch (Throwable th4) {
            th = th4;
            r8 = 0;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        boolean zB = b(str, str2);
        SLog.i("openSDK_LOG.Util", "copyFileByCheckPermission() copy success:" + zB);
        return zB;
    }

    public static boolean m(String str) {
        String strB = b();
        return (TextUtils.isEmpty(str) || TextUtils.isEmpty(strB) || !str.contains(strB)) ? false : true;
    }

    public static String a(String str, Activity activity, String str2, IUiListener iUiListener) {
        String str3;
        try {
            boolean zM = m(str2);
            SLog.i("openSDK_LOG.Util", "doPublishMood() check file: isAppSpecificDir=" + zM + ",hasSDPermission=" + c());
            if (!zM) {
                File fileA = g.a("Images");
                if (fileA != null) {
                    str3 = fileA.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
                } else {
                    File cacheDir = g.a().getCacheDir();
                    if (cacheDir == null) {
                        SLog.e("openSDK_LOG.Util", "getMediaFileUri error, cacheDir is null");
                        return null;
                    }
                    str3 = cacheDir.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR;
                }
                File file = new File(str2);
                String absolutePath = file.getAbsolutePath();
                String str4 = str3 + File.separator + file.getName();
                str2 = b(absolutePath, str4) ? str4 : null;
            }
            Uri uriA = a(activity, str, str2);
            if (uriA == null) {
                return null;
            }
            return uriA.toString();
        } catch (Exception e2) {
            SLog.e("openSDK_LOG.Util", "getMediaFileUri error", e2);
            return null;
        }
    }

    public static boolean a(Map<String, Object> map, String str, boolean z) {
        if (map == null) {
            SLog.e("openSDK_LOG.Util", "getBoolean error, params==null");
            return z;
        }
        if (!map.containsKey(str)) {
            SLog.e("openSDK_LOG.Util", "getBoolean error, not comtain : " + str);
            return z;
        }
        Object obj = map.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public static String a(Map<String, Object> map, String str, String str2) {
        if (map == null) {
            SLog.e("openSDK_LOG.Util", "getString error, params==null");
            return str2;
        }
        if (!map.containsKey(str)) {
            SLog.e("openSDK_LOG.Util", "getString error, not comtain : " + str);
            return str2;
        }
        Object obj = map.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    public static Uri a(Activity activity, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            SLog.e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion -- stringForFileUri is empty");
            return null;
        }
        try {
            String authorities = Tencent.getAuthorities(str);
            if (TextUtils.isEmpty(authorities)) {
                return null;
            }
            Uri uriForFile = FileProvider.getUriForFile(activity, authorities, new File(str2));
            activity.grantUriPermission("com.tencent.mobileqq", uriForFile, 3);
            activity.grantUriPermission(Constants.PACKAGE_TIM, uriForFile, 3);
            activity.grantUriPermission(Constants.PACKAGE_QQ_PAD, uriForFile, 3);
            activity.grantUriPermission(Constants.PACKAGE_QQ_SPEED, uriForFile, 3);
            return uriForFile;
        } catch (Exception e2) {
            SLog.e("openSDK_LOG.Util", "grantUriPermissionToAllQQVersion exception:", e2);
            return null;
        }
    }
}
