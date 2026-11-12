package rd2;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class m extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f152083a = LoggerFactory.getLogger("OrphanDeviceDAO");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static m f152084b;

    private m() {
    }

    public static sd2.j d(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("bt_friendly_name");
        int columnIndex2 = cursor.getColumnIndex("image_url");
        int columnIndex3 = cursor.getColumnIndex("unit_id");
        int columnIndex4 = cursor.getColumnIndex("mac_address");
        int columnIndex5 = cursor.getColumnIndex("product_display_name");
        int columnIndex6 = cursor.getColumnIndex("product_nbr");
        int columnIndex7 = cursor.getColumnIndex("part_nbr");
        sd2.j jVar = new sd2.j();
        jVar.f158687c1 = true;
        jVar.O0 = cursor.isNull(columnIndex) ? null : cursor.getString(columnIndex);
        jVar.L0 = cursor.isNull(columnIndex2) ? null : cursor.getString(columnIndex2);
        jVar.f158686c = cursor.isNull(columnIndex3) ? -1L : cursor.getLong(columnIndex3);
        jVar.J0 = cursor.isNull(columnIndex4) ? null : cursor.getString(columnIndex4);
        jVar.f158683a1 = cursor.isNull(columnIndex5) ? null : cursor.getString(columnIndex5);
        jVar.Z0 = cursor.isNull(columnIndex6) ? null : cursor.getString(columnIndex6);
        jVar.Y0 = cursor.isNull(columnIndex7) ? null : cursor.getString(columnIndex7);
        return jVar;
    }

    public static boolean e(long j8) {
        SQLiteDatabase sQLiteDatabase = qd2.a.b().f144484a;
        if (sQLiteDatabase == null) {
            return false;
        }
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.delete("orphan_devices", "unit_id=?", new String[]{String.valueOf(j8)});
            sQLiteDatabase.setTransactionSuccessful();
            return true;
        } catch (Exception e4) {
            f152083a.error((String) null, (Throwable) e4);
            return false;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static m f() {
        if (f152084b == null) {
            f152084b = new m();
        }
        return f152084b;
    }

    public static ArrayList g() throws Throwable {
        ArrayList arrayList;
        Cursor cursor = null;
        arrayList = null;
        ArrayList arrayList2 = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = qd2.a.b().f144484a.query("orphan_devices", null, null, null, null, null, null);
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                arrayList = new ArrayList(cursorQuery.getCount());
                                try {
                                    arrayList.add(d(cursorQuery));
                                    while (!cursorQuery.isLast()) {
                                        cursorQuery.moveToNext();
                                        arrayList.add(d(cursorQuery));
                                    }
                                    arrayList2 = arrayList;
                                } catch (SQLException e4) {
                                    e = e4;
                                    cursor = cursorQuery;
                                    f152083a.error("retrieveAll:", (Throwable) e);
                                    a.a(cursor);
                                    return arrayList;
                                }
                            }
                        } catch (SQLException e14) {
                            e = e14;
                            arrayList = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursorQuery;
                        a.a(cursor);
                        throw th;
                    }
                }
                a.a(cursorQuery);
                return arrayList2;
            } catch (SQLException e15) {
                e = e15;
                arrayList = null;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
