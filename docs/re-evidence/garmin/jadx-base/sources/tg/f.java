package tg;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static volatile f f164483g;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f164489f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f164484a = new a("udid");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f164485b = new a("oaid");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f164487d = new a("vaid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f164486c = new a("aaid");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f164488e = new c();

    public static d a(Cursor cursor) {
        d dVar = new d(null, 0);
        if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex >= 0) {
                dVar.f164480a = cursor.getString(columnIndex);
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                dVar.f164481b = cursor.getInt(columnIndex2);
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                dVar.f164482c = cursor.getLong(columnIndex3);
            }
        }
        return dVar;
    }

    public static final f b() {
        if (f164483g == null) {
            synchronized (f.class) {
                try {
                    if (f164483g == null) {
                        f164483g = new f();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return f164483g;
    }

    public final boolean c(Context context, boolean z14) {
        String str;
        c cVar = this.f164488e;
        boolean z15 = false;
        if (cVar.a() && !z14) {
            Boolean bool = cVar.f164479b;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider("com.meizu.flyme.openidsdk", 0);
            Cursor cursorQuery = null;
            String str2 = (providerInfoResolveContentProvider == null || (providerInfoResolveContentProvider.applicationInfo.flags & 1) == 0) ? null : providerInfoResolveContentProvider.packageName;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str2, 0);
                    str = packageInfo != null ? packageInfo.versionName : null;
                } catch (Exception e4) {
                    e4.printStackTrace();
                    e4.getMessage();
                }
                if (cVar.a()) {
                    if (TextUtils.isEmpty(str) ? false : TextUtils.equals(cVar.f164478a, str)) {
                        "use same version cache, safeVersion : ".concat(String.valueOf(str));
                        Boolean bool2 = cVar.f164479b;
                        if (bool2 != null) {
                            return bool2.booleanValue();
                        }
                        return false;
                    }
                }
                cVar.f164478a = str;
                try {
                    try {
                        cursorQuery = context.getContentResolver().query(Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                        if (cursorQuery == null) {
                            if (cursorQuery != null) {
                            }
                            "query support, result : ".concat(String.valueOf(z15));
                            cVar.f164479b = Boolean.valueOf(z15);
                            return z15;
                        }
                        d dVarA = a(cursorQuery);
                        if (1000 != dVarA.f164481b || "0".equals(dVarA.f164480a)) {
                            z15 = true;
                        }
                    } catch (Exception e14) {
                        e14.getMessage();
                        if (cursorQuery != null) {
                        }
                    }
                    cursorQuery.close();
                    "query support, result : ".concat(String.valueOf(z15));
                    cVar.f164479b = Boolean.valueOf(z15);
                    return z15;
                } catch (Throwable th3) {
                    if (cursorQuery == null) {
                        throw th3;
                    }
                    cursorQuery.close();
                    throw th3;
                }
            }
        }
        return false;
    }

    public final synchronized void d(Context context) {
        if (this.f164489f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        e eVar = new e();
        this.f164489f = eVar;
        context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }
}
