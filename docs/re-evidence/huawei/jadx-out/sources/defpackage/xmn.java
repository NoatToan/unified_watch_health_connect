package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes20.dex */
public class xmn {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f53157b = new Object();
    private static volatile xmn d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f53158c = false;
    private Handler e = xpc.b().a();

    public xmn() {
        xnd.b("ProcessDataSyncHelper", "isSync " + this.f53158c + ",isMainProcess ,isSwipeCardProcess ", false);
    }

    public static xmn e() {
        if (d == null) {
            synchronized (f53157b) {
                if (d == null) {
                    d = new xmn();
                }
            }
        }
        return d;
    }

    public void a(Context context, final String str, final String str2, final Object obj) {
        if (!this.f53158c || context == null || TextUtils.isEmpty(str)) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        this.e.post(new Runnable() { // from class: xmn.3
            @Override // java.lang.Runnable
            public void run() {
                if (applicationContext == null) {
                    xnd.b("ProcessDataSyncHelper", "drop put operation for context is null", false);
                    return;
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sp_sync_operate_type", (Integer) 0);
                    xmn.this.e(applicationContext, contentValues, str);
                    contentValues.put("sp_sync_key", str2);
                    xmn.this.b(contentValues, "sp_sync_value", obj);
                } catch (IllegalArgumentException | SecurityException unused) {
                    xnd.b("ProcessDataSyncHelper", "put failed", false);
                }
            }
        });
    }

    public void a(Context context, final String str, final String str2) {
        if (!this.f53158c || context == null || TextUtils.isEmpty(str)) {
            return;
        }
        final Context applicationContext = context.getApplicationContext();
        this.e.post(new Runnable() { // from class: xmn.5
            @Override // java.lang.Runnable
            public void run() {
                if (applicationContext == null) {
                    xnd.b("ProcessDataSyncHelper", "drop remove operation for context is null", false);
                    return;
                }
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("sp_sync_operate_type", (Integer) 1);
                    xmn.this.e(applicationContext, contentValues, str);
                    contentValues.put("sp_sync_key", str2);
                } catch (IllegalArgumentException | SecurityException unused) {
                    xnd.b("ProcessDataSyncHelper", "remove failed", false);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, ContentValues contentValues, String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 10) {
            return;
        }
        contentValues.put("sp_sync_sp_name", str.substring(10, str.length()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ContentValues contentValues, String str, Object obj) {
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            contentValues.put(str, (Integer) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
            return;
        }
        if (obj instanceof Boolean) {
            contentValues.put(str, (Boolean) obj);
        } else if (obj instanceof Float) {
            contentValues.put(str, (Float) obj);
        } else {
            xnd.b("ProcessDataSyncHelper", "unsupported type", false);
        }
    }
}
