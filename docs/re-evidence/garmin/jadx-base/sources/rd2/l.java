package rd2;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.google.android.gms.common.Scopes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class l extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f152081a = LoggerFactory.getLogger("GolfDownloadedCourseDAO");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l f152082b;

    private l() {
    }

    public static sd2.h d(Cursor cursor) {
        sd2.h hVar = new sd2.h();
        hVar.f158679x = Long.valueOf(cursor.getLong(cursor.getColumnIndex("android_download_id")));
        hVar.f158658a = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("build_id")));
        hVar.f158663f = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("global_layout_id")));
        hVar.f158678w = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("download_status_id")));
        hVar.f158680y = Long.valueOf(cursor.getLong(cursor.getColumnIndex("saved_timestamp")));
        hVar.f158677v = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("membership_type_id")));
        hVar.f158664g = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("semi_circle_latitude")));
        hVar.f158665h = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("semi_circle_longitude")));
        hVar.f158666i = a.c(cursor, cursor.getColumnIndex("name"));
        hVar.f158672o = a.c(cursor, cursor.getColumnIndex("street"));
        hVar.f158659b = a.c(cursor, cursor.getColumnIndex("city"));
        hVar.f158671n = a.c(cursor, cursor.getColumnIndex(RemoteConfigConstants.ResponseFieldKey.STATE));
        hVar.f158670m = a.c(cursor, cursor.getColumnIndex("postal_code"));
        hVar.f158660c = a.c(cursor, cursor.getColumnIndex("country"));
        hVar.f158673p = a.c(cursor, cursor.getColumnIndex("website_url"));
        hVar.f158662e = a.c(cursor, cursor.getColumnIndex(Scopes.EMAIL));
        hVar.f158668k = a.c(cursor, cursor.getColumnIndex("telephone"));
        hVar.f158669l = a.c(cursor, cursor.getColumnIndex("telephone_extension"));
        hVar.f158661d = a.c(cursor, cursor.getColumnIndex("designer"));
        hVar.f158674q = a.c(cursor, cursor.getColumnIndex("year_designed"));
        hVar.f158675r = Integer.valueOf(cursor.getInt(cursor.getColumnIndex("version")));
        int columnIndex = cursor.getColumnIndex("download_mgr_status_reason_id");
        if (!cursor.isNull(columnIndex)) {
            hVar.f158681z = Integer.valueOf(cursor.getInt(columnIndex));
        }
        int columnIndex2 = cursor.getColumnIndex("hole_count");
        if (!cursor.isNull(columnIndex2)) {
            hVar.f158667j = Integer.valueOf(cursor.getInt(columnIndex2));
        }
        return hVar;
    }

    public static l e() {
        if (f152082b == null) {
            f152082b = new l();
        }
        return f152082b;
    }

    public static LinkedHashMap f() throws Throwable {
        LinkedHashMap linkedHashMap;
        Cursor cursor = null;
        linkedHashMap = null;
        LinkedHashMap linkedHashMap2 = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = qd2.a.b().f144484a.query("golf_downloaded_course", null, "name IS NOT NULL", null, null, null, "name asc, country asc, state asc, city asc");
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                linkedHashMap = new LinkedHashMap(cursorQuery.getCount());
                                try {
                                    sd2.h hVarD = d(cursorQuery);
                                    linkedHashMap.put(hVarD.f158663f, hVarD);
                                    while (!cursorQuery.isLast()) {
                                        cursorQuery.moveToNext();
                                        sd2.h hVarD2 = d(cursorQuery);
                                        linkedHashMap.put(hVarD2.f158663f, hVarD2);
                                    }
                                    linkedHashMap2 = linkedHashMap;
                                } catch (SQLException e4) {
                                    e = e4;
                                    cursor = cursorQuery;
                                    f152081a.error("retrieveAll", (Throwable) e);
                                    a.a(cursor);
                                    linkedHashMap2 = linkedHashMap;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor = cursorQuery;
                            a.a(cursor);
                            throw th;
                        }
                    } catch (SQLException e14) {
                        e = e14;
                        linkedHashMap = null;
                    }
                }
                a.a(cursorQuery);
            } catch (SQLException e15) {
                e = e15;
                linkedHashMap = null;
            }
            return linkedHashMap2 == null ? new LinkedHashMap(0) : linkedHashMap2;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static ArrayList g() throws Throwable {
        Cursor cursor = null;
        arrayList = null;
        ArrayList arrayList = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = qd2.a.b().f144484a.query("golf_downloaded_course", null, "download_status_id=? and name is not null and binary is not null", new String[]{String.valueOf(5)}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            arrayList = new ArrayList(cursorQuery.getCount());
                            arrayList.add(d(cursorQuery));
                            while (!cursorQuery.isLast()) {
                                cursorQuery.moveToNext();
                                arrayList.add(d(cursorQuery));
                            }
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        cursor = cursorQuery;
                        f152081a.error("retrieveAllWithDownloadStatus(5)", (Throwable) e);
                        throw e;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = cursorQuery;
                        a.a(cursor);
                        throw th;
                    }
                }
                a.a(cursorQuery);
                int i14 = 0;
                if (arrayList == null) {
                    arrayList = new ArrayList(0);
                }
                int size = arrayList.size();
                while (i14 < size) {
                    int i15 = i14 + 1;
                    int i16 = i15;
                    while (i16 < size) {
                        if (((sd2.h) arrayList.get(i14)).f158663f.equals(((sd2.h) arrayList.get(i16)).f158663f)) {
                            arrayList.remove(i16);
                            size--;
                            i16--;
                        }
                        i16++;
                    }
                    i14 = i15;
                }
                return arrayList;
            } catch (SQLException e14) {
                e = e14;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static byte[] h(int i14, int i15, int i16) throws Throwable {
        Throwable th3;
        SQLException sQLException;
        Cursor cursor = null;
        blob = null;
        byte[] blob = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = qd2.a.b().f144484a.query("golf_downloaded_course", new String[]{"binary"}, "global_layout_id=? and build_id=? and map_type=?", new String[]{String.valueOf(i14), String.valueOf(i15), String.valueOf(i16)}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            blob = cursorQuery.getBlob(cursorQuery.getColumnIndex("binary"));
                        }
                    } catch (SQLException e4) {
                        sQLException = e4;
                        cursor = cursorQuery;
                        f152081a.error("retrieveBinary", (Throwable) sQLException);
                        throw sQLException;
                    } catch (Throwable th4) {
                        th3 = th4;
                        cursor = cursorQuery;
                        a.a(cursor);
                        throw th3;
                    }
                }
                a.a(cursorQuery);
                return blob;
            } catch (SQLException e14) {
                sQLException = e14;
            }
        } catch (Throwable th5) {
            th3 = th5;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v2 */
    public static sd2.h i(int i14, Integer num) throws Throwable {
        Throwable th3;
        Cursor cursorQuery;
        String strValueOf = String.valueOf(num);
        String strValueOf2 = String.valueOf(i14);
        ?? r14 = 0;
        hVarD = null;
        sd2.h hVarD = null;
        try {
            try {
                cursorQuery = qd2.a.b().f144484a.query("golf_downloaded_course", null, "global_layout_id=? and global_layout_id is not null and map_type=?", new String[]{strValueOf, strValueOf2}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            hVarD = d(cursorQuery);
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        f152081a.error("retrieveByGlobalLayoutID(" + num + ", " + i14 + ")", (Throwable) e);
                        a.a(cursorQuery);
                        return null;
                    }
                }
                a.a(cursorQuery);
                return hVarD;
            } catch (Throwable th4) {
                th3 = th4;
                r14 = strValueOf2;
                a.a(r14);
                throw th3;
            }
        } catch (SQLException e14) {
            e = e14;
            cursorQuery = null;
        } catch (Throwable th5) {
            th3 = th5;
            a.a(r14);
            throw th3;
        }
    }

    public static int j(long j8, int i14, byte[] bArr, Integer num) {
        String[] strArr = {String.valueOf(j8)};
        try {
            ContentValues contentValues = new ContentValues(5);
            contentValues.put("android_download_id", (Long) null);
            contentValues.put("download_mgr_status_reason_id", num);
            contentValues.put("download_status_id", Integer.valueOf(i14));
            contentValues.put("binary", bArr);
            contentValues.put("saved_timestamp", Long.valueOf(System.currentTimeMillis()));
            return qd2.a.b().f144484a.update("golf_downloaded_course", contentValues, "android_download_id =?", strArr);
        } catch (Exception e4) {
            f152081a.error("updateByDownloadID", (Throwable) e4);
            return 0;
        }
    }
}
