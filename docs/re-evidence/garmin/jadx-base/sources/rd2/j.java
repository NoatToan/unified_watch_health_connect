package rd2;

import android.database.Cursor;
import android.database.SQLException;
import android.text.TextUtils;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes11.dex */
public class j extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f152077a = LoggerFactory.getLogger("DeviceSelectQuery");

    public static ArrayList d() {
        ArrayList arrayList;
        Cursor cursor = null;
        arrayList = null;
        ArrayList arrayList2 = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = a.b().query("devices", null, null, null, null, null, "is_connected desc, last_connected_timestamp desc");
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                arrayList = new ArrayList(cursorQuery.getCount());
                                try {
                                    arrayList.add(sd2.d.b(cursorQuery));
                                    while (!cursorQuery.isLast()) {
                                        cursorQuery.moveToNext();
                                        arrayList.add(sd2.d.b(cursorQuery));
                                    }
                                    arrayList2 = arrayList;
                                } catch (SQLException e4) {
                                    e = e4;
                                    cursor = cursorQuery;
                                    f152077a.error("findAll", (Throwable) e);
                                    a.a(cursor);
                                    arrayList2 = arrayList;
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
            } catch (SQLException e15) {
                e = e15;
                arrayList = null;
            }
            return sd2.d.a(arrayList2);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public static ArrayList e() {
        ArrayList arrayList;
        Cursor cursor = null;
        arrayList = null;
        ArrayList arrayList2 = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = a.b().query("devices", null, "mac_address is not null", new String[0], null, null, "connection_type asc");
                if (cursorQuery != null) {
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                arrayList = new ArrayList(cursorQuery.getCount());
                                try {
                                    arrayList.add(sd2.d.b(cursorQuery));
                                    while (!cursorQuery.isLast()) {
                                        cursorQuery.moveToNext();
                                        arrayList.add(sd2.d.b(cursorQuery));
                                    }
                                    arrayList2 = arrayList;
                                } catch (SQLException e4) {
                                    e = e4;
                                    cursor = cursorQuery;
                                    f152077a.error("retrieveAllPaired", (Throwable) e);
                                    a.a(cursor);
                                    arrayList2 = arrayList;
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
            } catch (SQLException e15) {
                e = e15;
                arrayList = null;
            }
            return sd2.d.a(arrayList2);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0029: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:13:0x0028 */
    public static sd2.j f(String str) throws Throwable {
        Throwable th3;
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursor2 = null;
        jVarB = null;
        sd2.j jVarB = null;
        if (str == null) {
            return null;
        }
        try {
            try {
                cursorQuery = a.b().query("devices", null, "mac_address=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            jVarB = sd2.d.b(cursorQuery);
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        f152077a.error("byMacAddress(" + str + ")", (Throwable) e);
                        a.a(cursorQuery);
                        return null;
                    }
                }
                a.a(cursorQuery);
                return jVarB;
            } catch (Throwable th4) {
                th3 = th4;
                cursor2 = cursor;
                a.a(cursor2);
                throw th3;
            }
        } catch (SQLException e14) {
            e = e14;
            cursorQuery = null;
        } catch (Throwable th5) {
            th3 = th5;
            a.a(cursor2);
            throw th3;
        }
    }

    public static long g(long j8, String str) {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = a.b().query("devices", null, "unit_id=? and connection_type=?", new String[]{String.valueOf(j8), str}, null, null, null);
                long j14 = (cursorQuery == null || !cursorQuery.moveToFirst()) ? -1L : cursorQuery.getLong(0);
                a.a(cursorQuery);
                return j14;
            } catch (SQLException e4) {
                f152077a.error("byUnitID(" + j8 + ", " + str + ")", (Throwable) e4);
                throw e4;
            }
        } catch (Throwable th3) {
            a.a(cursorQuery);
            throw th3;
        }
    }

    public static ArrayList h(long j8) {
        Throwable th3;
        Cursor cursor = null;
        arrayList = null;
        ArrayList arrayList = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = a.b().query("devices", null, "unit_id=?", new String[]{String.valueOf(j8)}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            arrayList = new ArrayList(cursorQuery.getCount());
                            arrayList.add(Long.valueOf(cursorQuery.getLong(0)));
                            while (!cursorQuery.isLast()) {
                                cursorQuery.moveToNext();
                                arrayList.add(Long.valueOf(cursorQuery.getLong(0)));
                            }
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        cursor = cursorQuery;
                        f152077a.error("byUnitID(" + j8 + ")", (Throwable) e);
                        throw e;
                    } catch (Throwable th4) {
                        th3 = th4;
                        cursor = cursorQuery;
                        a.a(cursor);
                        throw th3;
                    }
                }
                a.a(cursorQuery);
                return arrayList;
            } catch (SQLException e14) {
                e = e14;
            }
        } catch (Throwable th5) {
            th3 = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x005d: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:19:0x005c */
    public static sd2.f i(long j8, String str) {
        String[] strArr;
        String str2;
        Throwable th3;
        Cursor cursorQuery;
        ArrayList arrayList;
        Cursor cursor;
        if (TextUtils.isEmpty(str)) {
            strArr = new String[]{String.valueOf(j8)};
            str2 = "unit_id=?";
        } else {
            strArr = new String[]{String.valueOf(j8), str};
            str2 = "unit_id=? and application_key=?";
        }
        String str3 = str2;
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = a.b().query("devices", null, str3, strArr, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            arrayList = new ArrayList(cursorQuery.getCount());
                            try {
                                arrayList.add(sd2.d.b(cursorQuery));
                                while (!cursorQuery.isLast()) {
                                    cursorQuery.moveToNext();
                                    arrayList.add(sd2.d.b(cursorQuery));
                                }
                            } catch (SQLException e4) {
                                e = e4;
                                f152077a.error("byUnitIDAndApplicationKey(" + j8 + ", " + str + ")", (Throwable) e);
                            }
                        } else {
                            arrayList = null;
                        }
                    } catch (SQLException e14) {
                        e = e14;
                        arrayList = null;
                    }
                } else {
                    arrayList = null;
                }
            } catch (Throwable th4) {
                th3 = th4;
                cursor2 = cursor;
                a.a(cursor2);
                throw th3;
            }
        } catch (SQLException e15) {
            e = e15;
            cursorQuery = null;
            arrayList = null;
        } catch (Throwable th5) {
            th3 = th5;
            a.a(cursor2);
            throw th3;
        }
        a.a(cursorQuery);
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        return arrayList.size() == 1 ? (sd2.f) arrayList.get(0) : new sd2.a(arrayList);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:10:0x002f */
    public static byte[] j(long j8) {
        Throwable th3;
        Cursor cursorQuery;
        Cursor cursor;
        Cursor cursor2 = null;
        blob = null;
        byte[] blob = null;
        try {
            try {
                cursorQuery = a.b().query("devices", new String[]{"garmin_device_xml"}, "unit_id = ?", new String[]{String.valueOf(j8)}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToNext()) {
                            blob = cursorQuery.getBlob(0);
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        f152077a.error("garminDeviceXML(" + j8 + ")", e);
                        a.a(cursorQuery);
                        return null;
                    } catch (NullPointerException e14) {
                        e = e14;
                        f152077a.error("garminDeviceXML(" + j8 + ")", e);
                        a.a(cursorQuery);
                        return null;
                    }
                }
                a.a(cursorQuery);
                return blob;
            } catch (Throwable th4) {
                th3 = th4;
                cursor2 = cursor;
                a.a(cursor2);
                throw th3;
            }
        } catch (SQLException e15) {
            e = e15;
            cursorQuery = null;
            f152077a.error("garminDeviceXML(" + j8 + ")", e);
            a.a(cursorQuery);
            return null;
        } catch (NullPointerException e16) {
            e = e16;
            cursorQuery = null;
            f152077a.error("garminDeviceXML(" + j8 + ")", e);
            a.a(cursorQuery);
            return null;
        } catch (Throwable th5) {
            th3 = th5;
            a.a(cursor2);
            throw th3;
        }
    }

    public static String k(long j8) throws Throwable {
        Throwable th3;
        Cursor cursor = null;
        string = null;
        String string = null;
        cursor = null;
        try {
            try {
                Cursor cursorQuery = a.b().query("devices", new String[]{"product_nbr"}, "unit_id=?", new String[]{String.valueOf(j8)}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            string = cursorQuery.getString(0);
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        cursor = cursorQuery;
                        f152077a.error("productNumber(" + j8 + ")", (Throwable) e);
                        throw e;
                    } catch (Throwable th4) {
                        th3 = th4;
                        cursor = cursorQuery;
                        a.a(cursor);
                        throw th3;
                    }
                }
                a.a(cursorQuery);
                return string;
            } catch (SQLException e14) {
                e = e14;
            }
        } catch (Throwable th5) {
            th3 = th5;
        }
    }
}
