package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.alipay.sdk.m.l0.e;
import com.huawei.agconnect.common.aaid.AaidUtils;

/* JADX INFO: loaded from: classes4.dex */
public class mv {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile mv f42476b = null;
    public static boolean d = false;
    public BroadcastReceiver h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo f42477a = new mo("udid");
    public mo e = new mo("oaid");
    public mo g = new mo("vaid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mo f42478c = new mo(AaidUtils.f4803a);
    public mt f = new mt();

    public final void e(Context context) {
        synchronized (this) {
            if (this.h != null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
            e eVar = new e();
            this.h = eVar;
            context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
        }
    }

    public final String a(Context context, mo moVar) throws Throwable {
        Cursor cursorQuery;
        String str;
        String strValueOf;
        String str2;
        a("queryId : " + moVar.f42053a);
        Cursor cursor = null;
        str = null;
        str = null;
        String str3 = null;
        cursor = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{moVar.f42053a}, null);
                try {
                    if (cursorQuery != null) {
                        mr mrVarB = b(cursorQuery);
                        str3 = mrVarB.e;
                        moVar.b(str3);
                        moVar.d(mrVarB.d);
                        moVar.a(mrVarB.f42232c);
                        a(moVar.f42053a + " errorCode : " + moVar.d);
                        if (mrVarB.f42232c != 1000) {
                            e(context);
                            if (!d(context, false)) {
                                strValueOf = String.valueOf(d(context, true));
                                str2 = "not support, forceQuery isSupported: ";
                                a(str2.concat(strValueOf));
                            }
                        }
                    } else if (d(context, false)) {
                        strValueOf = String.valueOf(d(context, true));
                        str2 = "forceQuery isSupported : ";
                        a(str2.concat(strValueOf));
                    }
                    if (cursorQuery == null) {
                        return str3;
                    }
                } catch (Exception e) {
                    e = e;
                    str = str3;
                    cursor = cursorQuery;
                    a("queryId, Exception : " + e.getMessage());
                    if (cursor == null) {
                        return str;
                    }
                    cursorQuery = cursor;
                    str3 = str;
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                str = null;
            }
            cursorQuery.close();
            return str3;
        } catch (Throwable th2) {
            th = th2;
            cursorQuery = cursor;
        }
    }

    public final boolean d(Context context, boolean z) {
        if (this.f.c() && !z) {
            return this.f.a();
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return false;
        }
        String strA = a(packageManager, "com.meizu.flyme.openidsdk");
        if (TextUtils.isEmpty(strA)) {
            return false;
        }
        String strD = d(packageManager, strA);
        if (this.f.c() && this.f.c(strD)) {
            a("use same version cache, safeVersion : ".concat(String.valueOf(strD)));
            return this.f.a();
        }
        this.f.a(strD);
        boolean zC = c(context);
        a("query support, result : ".concat(String.valueOf(zC)));
        this.f.b(zC);
        return zC;
    }

    public final String b(Context context, mo moVar) {
        String str;
        if (moVar == null) {
            str = "getId, openId = null.";
        } else {
            if (moVar.e()) {
                return moVar.e;
            }
            if (d(context, true)) {
                return a(context, moVar);
            }
            str = "getId, isSupported = false.";
        }
        a(str);
        return null;
    }

    public static String d(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            a("getAppVersion, Exception : " + e.getMessage());
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a A[PHI: r7
      0x005a: PHI (r7v3 android.database.Cursor) = (r7v2 android.database.Cursor), (r7v4 android.database.Cursor) binds: [B:18:0x0058, B:12:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    public static boolean c(Context context) {
        a("querySupport version : 1.0.8");
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                if (cursorQuery != null) {
                    mr mrVarB = b(cursorQuery);
                    boolean z = 1000 != mrVarB.f42232c || "0".equals(mrVarB.e);
                    cursorQuery.close();
                    return z;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Exception e) {
                a("querySupport, Exception : " + e.getMessage());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
            return false;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static void a(String str) {
        if (d) {
            Log.d("OpenIdManager", str);
        }
    }

    public static String a(PackageManager packageManager, String str) {
        ProviderInfo providerInfoResolveContentProvider;
        if (packageManager == null || (providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return providerInfoResolveContentProvider.packageName;
    }

    public static final mv c() {
        if (f42476b == null) {
            synchronized (mv.class) {
                if (f42476b == null) {
                    f42476b = new mv();
                }
            }
        }
        return f42476b;
    }

    public static mr b(Cursor cursor) {
        mr mrVar = new mr(null, 0);
        if (cursor == null) {
            a("parseValue fail, cursor is null.");
            return mrVar;
        }
        if (cursor.isClosed()) {
            a("parseValue fail, cursor is closed.");
            return mrVar;
        }
        cursor.moveToFirst();
        int columnIndex = cursor.getColumnIndex("value");
        if (columnIndex >= 0) {
            mrVar.e = cursor.getString(columnIndex);
        } else {
            a("parseValue fail, index < 0.");
        }
        int columnIndex2 = cursor.getColumnIndex("code");
        if (columnIndex2 >= 0) {
            mrVar.f42232c = cursor.getInt(columnIndex2);
        } else {
            a("parseCode fail, index < 0.");
        }
        int columnIndex3 = cursor.getColumnIndex("expired");
        if (columnIndex3 >= 0) {
            mrVar.d = cursor.getLong(columnIndex3);
            return mrVar;
        }
        a("parseExpired fail, index < 0.");
        return mrVar;
    }
}
