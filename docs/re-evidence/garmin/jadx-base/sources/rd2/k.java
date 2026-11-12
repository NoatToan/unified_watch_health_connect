package rd2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import v.e0;

/* JADX INFO: loaded from: classes11.dex */
public class k extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f152078a = LoggerFactory.getLogger("GolfCourseImageDataDAO");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f152079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static k f152080c;

    private k() {
        f152079b = "select *, substr('part_nbr', 11) as part_nbr_suffix from golf_course_image_data where device_id=? and global_id=? and map_type=? order by part_nbr_suffix desc, version limit 1";
        f152078a.debug("select *, substr('part_nbr', 11) as part_nbr_suffix from golf_course_image_data where device_id=? and global_id=? and map_type=? order by part_nbr_suffix desc, version limit 1");
    }

    public static sd2.g d(Cursor cursor) {
        sd2.g gVar = new sd2.g();
        gVar.f158650a = cursor.getLong(cursor.getColumnIndex("device_id"));
        gVar.f158651b = cursor.getInt(cursor.getColumnIndex("global_id"));
        gVar.f158654e = cursor.getString(cursor.getColumnIndex("part_nbr"));
        gVar.f158655f = cursor.getBlob(cursor.getColumnIndex("image_data"));
        gVar.f158652c = cursor.getInt(cursor.getColumnIndex("version"));
        gVar.f158653d = cursor.getInt(cursor.getColumnIndex("map_type"));
        int columnIndex = cursor.getColumnIndex("gma_data");
        if (!cursor.isNull(columnIndex)) {
            gVar.f158656g = cursor.getBlob(columnIndex);
        }
        int columnIndex2 = cursor.getColumnIndex("unl_data");
        if (!cursor.isNull(columnIndex2)) {
            gVar.f158657h = cursor.getBlob(columnIndex2);
        }
        return gVar;
    }

    public static sd2.g e(int i14, int i15, long j8) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor = null;
        gVarD = null;
        sd2.g gVarD = null;
        try {
            cursorRawQuery = qd2.a.b().f144484a.rawQuery(f152079b, new String[]{String.valueOf(j8), String.valueOf(i14), String.valueOf(i15)});
            if (cursorRawQuery != null) {
                try {
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            gVarD = d(cursorRawQuery);
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        f152078a.error("fetchMostRecent(" + j8 + ", " + i14 + ")", (Throwable) e);
                        a.a(cursorRawQuery);
                        return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorRawQuery;
                    a.a(cursor);
                    throw th;
                }
            }
            a.a(cursorRawQuery);
            return gVarD;
        } catch (SQLException e14) {
            e = e14;
            cursorRawQuery = null;
        } catch (Throwable th4) {
            th = th4;
            a.a(cursor);
            throw th;
        }
    }

    public static k f() {
        if (f152080c == null) {
            f152080c = new k();
        }
        return f152080c;
    }

    public static boolean g(sd2.g gVar) {
        Logger logger = f152078a;
        long j8 = gVar.f158650a;
        int i14 = gVar.f158651b;
        String str = gVar.f158654e;
        try {
            qd2.a.b().f144484a.delete("golf_course_image_data", "device_id=? and global_id=? and part_nbr=?", new String[]{String.valueOf(j8), String.valueOf(i14), str});
        } catch (Exception e4) {
            logger.error(e0.h(v.h.w(i14, "delete(", ", ", j8), ", ", str, ")"), (Throwable) e4);
        }
        ContentValues contentValues = new ContentValues(6);
        contentValues.put("device_id", Long.valueOf(gVar.f158650a));
        contentValues.put("global_id", Integer.valueOf(gVar.f158651b));
        contentValues.put("version", Integer.valueOf(gVar.f158652c));
        contentValues.put("map_type", Integer.valueOf(gVar.f158653d));
        contentValues.put("part_nbr", gVar.f158654e);
        contentValues.put("image_data", gVar.f158655f);
        contentValues.put("gma_data", gVar.f158656g);
        contentValues.put("unl_data", gVar.f158657h);
        try {
            qd2.a.b().f144484a.insertOrThrow("golf_course_image_data", "blah", contentValues);
            return true;
        } catch (Exception e14) {
            logger.error("insert", (Throwable) e14);
            return false;
        }
    }
}
