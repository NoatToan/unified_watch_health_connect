package com.xiaomi.push.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.xiaomi.passport.sim.SIMInfo;
import defpackage.m3s;
import defpackage.xys;

/* JADX INFO: loaded from: classes11.dex */
public class TrafficProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f14164b = Uri.parse("content://com.xiaomi.push.providers.TrafficProvider/traffic");
    public static final UriMatcher c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteOpenHelper f14165a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        c = uriMatcher;
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "traffic", 1);
        uriMatcher.addURI("com.xiaomi.push.providers.TrafficProvider", "update_imsi", 2);
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        if (c.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.xiaomi.push.traffic";
        }
        throw new IllegalArgumentException("Unknown URI " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f14165a = new m3s(getContext());
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Cursor cursorQuery;
        synchronized (m3s.f25728b) {
            try {
                if (c.match(uri) != 1) {
                    throw new IllegalArgumentException("Unknown URI " + uri);
                }
                cursorQuery = this.f14165a.getReadableDatabase().query("traffic", strArr, str, strArr2, null, null, str2);
            } catch (Throwable th) {
                throw th;
            }
        }
        return cursorQuery;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (c.match(uri) != 2 || contentValues == null || !contentValues.containsKey(SIMInfo.SIM_INFO_TYPE_IMSI)) {
            return 0;
        }
        xys.m(contentValues.getAsString(SIMInfo.SIM_INFO_TYPE_IMSI));
        return 0;
    }
}
