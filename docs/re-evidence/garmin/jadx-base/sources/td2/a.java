package td2;

import android.database.Cursor;
import android.database.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import p1.z;
import rd2.f;
import rd2.j;

/* JADX INFO: loaded from: classes11.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z<String> f163901a = new z<>();

    /* JADX INFO: renamed from: td2.a$a, reason: collision with other inner class name */
    public enum EnumC3084a {
        FITNESS,
        GOLF,
        /* JADX INFO: Fake field, exist only in values array */
        OUTDOOR,
        WELLNESS,
        DIVE;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final ArrayList<String> f163906e = new ArrayList<>(values().length);

        static {
            Iterator it = EnumSet.allOf(EnumC3084a.class).iterator();
            while (it.hasNext()) {
                f163906e.add(((EnumC3084a) it.next()).name());
            }
        }
    }

    public static boolean a(long j8) {
        String string = EnumC3084a.WELLNESS.toString();
        String strB = f163901a.b(j8);
        return strB != null && strB.toLowerCase().contains(string.toLowerCase());
    }

    public static void b() throws Throwable {
        Cursor cursorQuery;
        f.a().f152045a.getClass();
        Cursor cursor = null;
        zVar = null;
        zVar = null;
        z<String> zVar = null;
        try {
            cursorQuery = rd2.a.b().query(true, "devices", new String[]{"unit_id", "categories"}, null, null, null, null, null, null);
            if (cursorQuery != null) {
                try {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            z<String> zVar2 = new z<>(cursorQuery.getCount());
                            if (!cursorQuery.isNull(0) && !cursorQuery.isNull(1)) {
                                zVar2.f(cursorQuery.getLong(0), cursorQuery.getString(1));
                            }
                            while (!cursorQuery.isLast()) {
                                cursorQuery.moveToNext();
                                if (!cursorQuery.isNull(0) && !cursorQuery.isNull(1)) {
                                    zVar2.f(cursorQuery.getLong(0), cursorQuery.getString(1));
                                }
                            }
                            zVar = zVar2;
                        }
                    } catch (SQLException e4) {
                        e = e4;
                        j.f152077a.error("allCategories", (Throwable) e);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor = cursorQuery;
                    rd2.a.a(cursor);
                    throw th;
                }
            }
        } catch (SQLException e14) {
            e = e14;
            cursorQuery = null;
        } catch (Throwable th4) {
            th = th4;
            rd2.a.a(cursor);
            throw th;
        }
        rd2.a.a(cursorQuery);
        if (zVar == null) {
            zVar = new z<>(0);
        }
        f163901a = zVar;
    }

    public static boolean c(String str) {
        for (String str2 : str.split(",")) {
            HashSet hashSet = new HashSet();
            for (int i14 = 0; i14 < f163901a.h(); i14++) {
                Collections.addAll(hashSet, f163901a.i(i14).split(","));
            }
            if (!new ArrayList(hashSet).contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(String str) {
        for (int i14 = 0; i14 < f163901a.h(); i14++) {
            String strI = f163901a.i(i14);
            if (strI != null && strI.toLowerCase().contains(str.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}
