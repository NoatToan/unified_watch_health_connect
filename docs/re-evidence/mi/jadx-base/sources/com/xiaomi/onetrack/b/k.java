package com.xiaomi.onetrack.b;

import android.database.Cursor;
import android.text.TextUtils;
import com.xiaomi.onetrack.util.p;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
class k implements Callable<l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f13819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ h f13820b;

    public k(h hVar, String str) {
        this.f13820b = hVar;
        this.f13819a = str;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l call() throws Exception {
        Cursor cursorQuery;
        Throwable th;
        try {
            cursorQuery = this.f13820b.f13813b.getWritableDatabase().query(g.f13811b, null, "app_id=?", new String[]{this.f13819a}, null, null, null);
            try {
                try {
                    int columnIndex = cursorQuery.getColumnIndex(g.d);
                    int columnIndex2 = cursorQuery.getColumnIndex(g.e);
                    int columnIndex3 = cursorQuery.getColumnIndex(g.f);
                    int columnIndex4 = cursorQuery.getColumnIndex("timestamp");
                    if (cursorQuery.moveToNext()) {
                        l lVar = new l();
                        lVar.f13821a = cursorQuery.getString(columnIndex);
                        String string = cursorQuery.getString(columnIndex2);
                        if (!TextUtils.isEmpty(string)) {
                            lVar.e = new JSONObject(string);
                        }
                        lVar.f13822b = h.b(lVar.e);
                        lVar.d = cursorQuery.getString(columnIndex3);
                        lVar.c = cursorQuery.getLong(columnIndex4);
                        try {
                            cursorQuery.close();
                        } catch (Exception unused) {
                            p.a("ConfigDbManager", "getConfig  cursor.close");
                        }
                        return lVar;
                    }
                } catch (Exception e) {
                    e = e;
                    p.a("ConfigDbManager", e.getMessage());
                    if (cursorQuery != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                if (cursorQuery != null) {
                    try {
                        cursorQuery.close();
                    } catch (Exception unused2) {
                        p.a("ConfigDbManager", "getConfig  cursor.close");
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            cursorQuery = null;
            th = th3;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
        try {
            cursorQuery.close();
        } catch (Exception unused3) {
            p.a("ConfigDbManager", "getConfig  cursor.close");
        }
        return null;
    }
}
