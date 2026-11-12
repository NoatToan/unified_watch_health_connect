package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes20.dex */
public class ykm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f53589a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f53590c;
    private String[] e;

    public ykm(Context context, String str, String[] strArr) {
        this.f53589a = str;
        this.e = (String[]) strArr.clone();
        this.f53590c = ykn.d(context).getWritableDatabase();
    }

    public long b(ContentValues contentValues) {
        return this.f53590c.insert(this.f53589a, null, contentValues);
    }

    public int e(String str, String[] strArr) {
        return this.f53590c.delete(this.f53589a, str, strArr);
    }

    public int b(ContentValues contentValues, String str, String[] strArr) {
        return this.f53590c.update(this.f53589a, contentValues, str, strArr);
    }

    public Cursor d(String str, String[] strArr, String str2, String str3, String str4) {
        return this.f53590c.query(this.f53589a, this.e, str, strArr, str2, str3, str4);
    }
}
