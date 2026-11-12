package com.xmlywind.sdk.base.common;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import com.huami.feedback.log.utils.ConstantsKt;
import com.huami.watch.companion.watchface.cloud.WatchFaceApi;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.IntentActions;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.mta.PointCategory;
import com.xmlywind.sdk.common.mta.PointEntitySigmob;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes22.dex */
public class l {
    private static Map<String, String> a = new Hashtable();
    private static Set<a> b = new CopyOnWriteArraySet();

    public static class a {
        public String a;
        public String b;
        public long c;

        public a(String str, String str2, long j) {
            this.a = str;
            this.b = str2;
            this.c = j;
        }
    }

    private static long a(Context context, String str, String str2) {
        if (str == null) {
            return -1L;
        }
        try {
            if (str.isEmpty()) {
                return -1L;
            }
            String strTrim = str.trim();
            if (!strTrim.startsWith("http")) {
                strTrim = "http://" + strTrim;
            }
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(strTrim));
            File file = new File(str2);
            request.setTitle(file.getName());
            request.setAllowedNetworkTypes(3);
            request.setAllowedOverRoaming(true);
            request.setVisibleInDownloadsUi(true);
            request.setNotificationVisibility(1);
            File parentFile = file.getParentFile();
            if (parentFile.exists()) {
                if (!parentFile.isDirectory()) {
                    parentFile.delete();
                    if (!parentFile.mkdirs()) {
                        return -1L;
                    }
                }
            } else if (!parentFile.mkdirs()) {
                return -1L;
            }
            request.addRequestHeader("User-Agent", com.xmlywind.sdk.common.e.f.c());
            request.setDestinationUri(Uri.fromFile(file));
            return ((DownloadManager) context.getApplicationContext().getSystemService(WatchFaceApi.SORT_DOWNLOAD)).enqueue(request);
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            return -1L;
        }
    }

    public static String a(File file) {
        String name = file.getName();
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(name.substring(name.lastIndexOf(".") + 1, name.length()).toLowerCase());
    }

    public static List<String> a(DownloadManager downloadManager) {
        Throwable th;
        Cursor cursorQuery;
        try {
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterByStatus(3);
            cursorQuery = downloadManager.query(query);
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("title"));
                if (!TextUtils.isEmpty(string)) {
                    arrayList.add(string);
                }
                cursorQuery.moveToNext();
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th2) {
                th = th2;
                try {
                    SigmobLog.e(th.getMessage());
                    if (cursorQuery == null) {
                        return null;
                    }
                } finally {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    public static Map<String, Object> a(DownloadManager downloadManager, long j) {
        Throwable th;
        Cursor cursorQuery;
        try {
            DownloadManager.Query query = new DownloadManager.Query();
            query.setFilterById(j);
            Uri uriForDownloadedFile = downloadManager.getUriForDownloadedFile(j);
            cursorQuery = downloadManager.query(query);
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                int i = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                int i2 = cursorQuery.getInt(cursorQuery.getColumnIndex("reason"));
                String string = cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"));
                HashMap map = new HashMap();
                map.put("fileName", string);
                map.put("status", Integer.valueOf(i));
                map.put("uri", uriForDownloadedFile);
                map.put("reason", Integer.valueOf(i2));
                cursorQuery.close();
                return map;
            } catch (Throwable th2) {
                th = th2;
                try {
                    SigmobLog.e(th.getMessage());
                    if (cursorQuery == null) {
                        return null;
                    }
                } finally {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    public static void a(Context context, String str, BaseAdUnit baseAdUnit) {
        try {
            SigmobLog.i("download apk:" + str);
            d.b(baseAdUnit);
            String strA = m.a(str);
            if (TextUtils.isEmpty(strA) && !TextUtils.isEmpty(baseAdUnit.getProductId())) {
                strA = baseAdUnit.getProductId() + ".apk";
            }
            a(strA, context, str, baseAdUnit);
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
            t.b(PointCategory.DOWNLOAD_START, "0", baseAdUnit);
            t.a(PointCategory.DOWNLOAD_START, 0, th.getMessage(), baseAdUnit);
            try {
                Toast.makeText(context, "下载失败", 1).show();
            } catch (Throwable th2) {
                SigmobLog.e(th2.getMessage());
            }
        }
    }

    private static void a(String str, Context context, final String str2, BaseAdUnit baseAdUnit) {
        String str3;
        HashMap map;
        String uuid;
        String absolutePath;
        String str4;
        try {
            try {
                String str5 = TextUtils.isEmpty(str) ? com.xmlywind.sdk.common.utils.k.a(baseAdUnit.getLanding_page()) + ".apk" : str;
                final File file = new File(com.xmlywind.sdk.common.utils.d.a(context), str5);
                if (!c(-1L, file.getAbsolutePath())) {
                    List<String> listA = a((DownloadManager) context.getApplicationContext().getSystemService(WatchFaceApi.SORT_DOWNLOAD));
                    if (listA != null) {
                        for (String str6 : listA) {
                            if (!TextUtils.isEmpty(str6) && str6.equals(str5)) {
                                str3 = str5 + "当前正在努力下载，请稍等";
                            }
                        }
                    }
                    boolean zContainsKey = a.containsKey(baseAdUnit.getUuid());
                    if (file.exists() && !zContainsKey && !a(context, file.getAbsolutePath())) {
                        SigmobLog.i("cacheFile deleteFile:" + com.xmlywind.sdk.common.utils.d.b(file.getAbsolutePath()));
                    }
                    SigmobLog.i(str5 + " exists:" + file.exists() + " containsKey:" + zContainsKey);
                    if (file.exists()) {
                        if (zContainsKey) {
                            absolutePath = file.getAbsolutePath();
                        } else {
                            long jLastModified = file.lastModified();
                            int apk_expired_time = SDKConfig.sharedInstance().getApk_expired_time();
                            if (apk_expired_time == 0) {
                                str4 = "default deleteFile:" + com.xmlywind.sdk.common.utils.d.b(file.getAbsolutePath());
                            } else if (System.currentTimeMillis() - jLastModified > apk_expired_time * 1000) {
                                str4 = "timeOut deleteFile:" + com.xmlywind.sdk.common.utils.d.b(file.getAbsolutePath());
                            } else {
                                absolutePath = file.getAbsolutePath();
                            }
                            SigmobLog.i(str4);
                        }
                        b(context, absolutePath, baseAdUnit);
                        return;
                    }
                    try {
                        Toast.makeText(context, "下载开始", 1).show();
                    } catch (Throwable th) {
                        SigmobLog.e(th.getMessage());
                    }
                    a.put(baseAdUnit.getUuid(), str5);
                    long jA = a(context, str2, file.getAbsolutePath());
                    if (jA != -1) {
                        a(jA, file.getAbsolutePath());
                        com.xmlywind.sdk.common.utils.d.a(baseAdUnit, new File(com.xmlywind.sdk.common.utils.d.d(), jA + ConstantsKt.LOG_FILE_SUFFIX).getAbsolutePath());
                        t.a(PointCategory.DOWNLOAD_START, "1", baseAdUnit, new t.a() { // from class: com.xmlywind.sdk.base.common.l.1
                            @Override // com.xmlywind.sdk.base.common.t.a
                            public void a(Object obj) {
                                if (obj instanceof PointEntitySigmob) {
                                    HashMap map2 = new HashMap();
                                    map2.put("apkfile", file.getAbsolutePath());
                                    map2.put("apkurl", str2);
                                    ((PointEntitySigmob) obj).setOptions(map2);
                                }
                            }
                        });
                        map = new HashMap();
                        map.put("result", "1");
                        uuid = baseAdUnit.getUuid();
                    } else {
                        t.a(PointCategory.DOWNLOAD_START, "0", baseAdUnit, new t.a() { // from class: com.xmlywind.sdk.base.common.l.2
                            @Override // com.xmlywind.sdk.base.common.t.a
                            public void a(Object obj) {
                                if (obj instanceof PointEntitySigmob) {
                                    HashMap map2 = new HashMap();
                                    map2.put("apkfile", file.getAbsolutePath());
                                    map2.put("apkurl", str2);
                                    ((PointEntitySigmob) obj).setOptions(map2);
                                }
                            }
                        });
                        if (com.xmlywind.sdk.common.a.b(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                            t.a(PointCategory.DOWNLOAD_FAILED, 2, "download Directory not exist", baseAdUnit);
                        } else {
                            Toast.makeText(context, "请先给予应用 WRITE_EXTERNAL_STORAGE 权限", 1).show();
                            t.a(PointCategory.DOWNLOAD_FAILED, 1, " No permission Manifest.permission.WRITE_EXTERNAL_STORAGE ", baseAdUnit);
                        }
                        map = new HashMap();
                        map.put("result", "0");
                        uuid = baseAdUnit.getUuid();
                    }
                    BaseBroadcastReceiver.a(context, uuid, map, IntentActions.ACTION_INTERSTITIAL_DOWNLOAD_START);
                    com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_DOWNLOAD_START);
                    return;
                }
                str3 = str5 + "当前正在努力下载，请稍等";
            } catch (Throwable th2) {
                SigmobLog.e(th2.getMessage());
                t.b(PointCategory.DOWNLOAD_START, "0", baseAdUnit);
                t.a(PointCategory.DOWNLOAD_START, 0, th2.getMessage(), baseAdUnit);
                HashMap map2 = new HashMap();
                map2.put("result", "0");
                BaseBroadcastReceiver.a(context, baseAdUnit.getUuid(), map2, IntentActions.ACTION_INTERSTITIAL_DOWNLOAD_START);
                str3 = "请先给予应用权限";
            }
            Toast.makeText(context, str3, 1).show();
        } catch (Throwable unused) {
        }
    }

    public static boolean a(long j, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        b.add(new a(str, null, j));
        return true;
    }

    public static boolean a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageArchiveInfo(str, 1) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void b(long j, String str) {
        for (a aVar : b) {
            if (aVar.c == j || aVar.a.equalsIgnoreCase(str)) {
                b.remove(aVar);
                return;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d4  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00d4, please report this as an issue */
    public static void b(Context context, String str, BaseAdUnit baseAdUnit) {
        Uri uriFromFile;
        String strA;
        PackageInfo packageInfoA;
        Class<?> cls;
        File file = new File(str);
        SigmobLog.i("installAPK:" + file.getAbsolutePath() + ":" + file.exists());
        Intent intent = new Intent();
        intent.addFlags(268435456);
        intent.setAction("android.intent.action.VIEW");
        try {
            Toast.makeText(context, "开始安装", 1).show();
        } catch (Throwable th) {
            SigmobLog.e(th.getMessage());
        }
        if (Build.VERSION.SDK_INT >= 24 && context.getApplicationInfo().targetSdkVersion >= 24) {
            try {
                cls = Class.forName("androidx.core.content.FileProvider");
            } catch (Throwable unused) {
                cls = null;
            }
            try {
                cls = Class.forName("androidx.core.content.FileProvider");
            } catch (Throwable unused2) {
            }
            if (cls != null) {
                try {
                    com.xmlywind.sdk.common.utils.n.a aVar = new com.xmlywind.sdk.common.utils.n.a((Class) cls, "getUriForFile");
                    aVar.a(Context.class, context);
                    aVar.a(String.class, context.getApplicationContext().getPackageName() + ".sigprovider");
                    aVar.a(File.class, file);
                    uriFromFile = (Uri) aVar.a();
                } catch (Exception e) {
                    SigmobLog.e(e.getMessage());
                    uriFromFile = null;
                }
                if (uriFromFile != null) {
                    intent.addFlags(1);
                    strA = "application/vnd.android.package-archive";
                }
            }
            context.startActivity(intent);
            com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_INSTALL_START);
            BaseBroadcastReceiver.a(context, baseAdUnit.getUuid(), (Map<String, Object>) null, IntentActions.ACTION_INTERSTITIAL_INSTALL_START);
            packageInfoA = com.xmlywind.sdk.common.a.a(context, str);
            if (packageInfoA != null) {
                com.xmlywind.sdk.common.utils.d.a(baseAdUnit, new File(com.xmlywind.sdk.common.utils.d.d(), packageInfoA.packageName + ConstantsKt.LOG_FILE_SUFFIX).getAbsolutePath());
            }
            t.a(baseAdUnit, PointCategory.APP_INSTALL_START, packageInfoA, "1");
        }
        uriFromFile = Uri.fromFile(file);
        strA = a(file);
        intent.setDataAndType(uriFromFile, strA);
        context.startActivity(intent);
        com.xmlywind.sdk.base.a.c.a(baseAdUnit, com.xmlywind.sdk.base.common.a.AD_INSTALL_START);
        BaseBroadcastReceiver.a(context, baseAdUnit.getUuid(), (Map<String, Object>) null, IntentActions.ACTION_INTERSTITIAL_INSTALL_START);
        packageInfoA = com.xmlywind.sdk.common.a.a(context, str);
        if (packageInfoA != null) {
            com.xmlywind.sdk.common.utils.d.a(baseAdUnit, new File(com.xmlywind.sdk.common.utils.d.d(), packageInfoA.packageName + ConstantsKt.LOG_FILE_SUFFIX).getAbsolutePath());
        }
        t.a(baseAdUnit, PointCategory.APP_INSTALL_START, packageInfoA, "1");
    }

    public static boolean b(Context context, String str) {
        Throwable th;
        Cursor cursorQuery;
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            DownloadManager downloadManager = (DownloadManager) context.getSystemService(WatchFaceApi.SORT_DOWNLOAD);
            try {
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterByStatus(3);
                cursorQuery = downloadManager.query(query);
                try {
                    if (cursorQuery.moveToFirst()) {
                        new ArrayList();
                        do {
                            String string = cursorQuery.getString(cursorQuery.getColumnIndex("uri"));
                            if (!TextUtils.isEmpty(string) && str.equalsIgnoreCase(string)) {
                                z = true;
                            }
                        } while (cursorQuery.moveToNext());
                        cursorQuery.close();
                    } else {
                        cursorQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        SigmobLog.e(th.getMessage());
                        return z;
                    } finally {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursorQuery = null;
            }
        }
        return z;
    }

    public static boolean c(long j, String str) {
        for (a aVar : b) {
            if (aVar.c == j || aVar.a.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
