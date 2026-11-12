package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.huawei.ui.openservice.db.OpenServiceDbHelper;

/* JADX INFO: loaded from: classes7.dex */
public class dwg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SQLiteDatabase f32450a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f32451c;
    private String[] d;

    public dwg(Context context, String str, String[] strArr) {
        this.f32451c = str;
        this.d = (String[]) strArr.clone();
        this.f32450a = OpenServiceDbHelper.getInstance(context).getWritableDatabase();
    }

    public Cursor d(String str, String[] strArr, String str2, String str3, String str4) {
        return this.f32450a.query(this.f32451c, this.d, str, strArr, str2, str3, str4);
    }
}
