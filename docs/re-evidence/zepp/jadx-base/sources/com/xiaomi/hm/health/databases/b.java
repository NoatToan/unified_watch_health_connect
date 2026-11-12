package com.xiaomi.hm.health.databases;

import android.database.Cursor;
import android.text.TextUtils;
import com.xiaomi.hm.health.databases.model.DaoMaster;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
class b {
    private static final String a = "MIGRATION HELPER - CLASS DOESN'T MATCH WITH THE CURRENT PARAMETERS";
    private static b b;

    private static List<String> c(Database database, String str) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = database.rawQuery("SELECT * FROM " + str + " limit 1", null);
                if (cursorRawQuery != null) {
                    arrayList = new ArrayList(Arrays.asList(cursorRawQuery.getColumnNames()));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return arrayList;
        } finally {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
        }
    }

    public static b d() {
        if (b == null) {
            b = new b();
        }
        return b;
    }

    private String e(Class<?> cls) throws Exception {
        if (cls.equals(String.class)) {
            return "TEXT";
        }
        if (cls.equals(Long.class) || cls.equals(Integer.class) || cls.equals(Long.TYPE)) {
            return "INTEGER";
        }
        if (cls.equals(Boolean.class)) {
            return "BOOLEAN";
        }
        throw new Exception(a.concat(" - Class: ").concat(cls.toString()));
    }

    @SafeVarargs
    public final void a(Database database, Class<? extends AbstractDao<?, ?>>... clsArr) {
        for (Class<? extends AbstractDao<?, ?>> cls : clsArr) {
            String str = new DaoConfig(database, cls).tablename;
            String strConcat = str.concat("_TEMP");
            StringBuilder sb = new StringBuilder();
            sb.append("DROP TABLE ");
            sb.append(strConcat);
            database.execSQL("INSERT INTO " + str + " SELECT * FROM " + strConcat);
            database.execSQL(sb.toString());
        }
    }

    @SafeVarargs
    public final void b(Database database, Class<? extends AbstractDao<?, ?>>... clsArr) {
        for (Class<? extends AbstractDao<?, ?>> cls : clsArr) {
            DaoConfig daoConfig = new DaoConfig(database, cls);
            String str = daoConfig.tablename;
            String strConcat = str.concat("_TEMP");
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            sb.append("CREATE TABLE ");
            sb.append(strConcat);
            sb.append(" (");
            String str2 = "";
            int i = 0;
            while (true) {
                Property[] propertyArr = daoConfig.properties;
                if (i < propertyArr.length) {
                    String str3 = propertyArr[i].columnName;
                    if (c(database, str).contains(str3)) {
                        arrayList.add(str3);
                        String strE = null;
                        try {
                            try {
                                strE = e(daoConfig.properties[i].type);
                            } catch (Exception e) {
                                e = e;
                                e.printStackTrace();
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        sb.append(str2);
                        sb.append(str3);
                        sb.append(" ");
                        sb.append(strE);
                        if (daoConfig.properties[i].primaryKey) {
                            sb.append(" PRIMARY KEY");
                        }
                        str2 = ",";
                    }
                    i++;
                }
            }
            sb.append(");");
            database.execSQL(sb.toString());
            database.execSQL("INSERT INTO " + strConcat + " (" + TextUtils.join(",", arrayList) + ") SELECT " + TextUtils.join(",", arrayList) + " FROM " + str + ";");
        }
    }

    public void f(Database database, Class<? extends AbstractDao<?, ?>>... clsArr) {
        b(database, clsArr);
        DaoMaster.dropAllTables(database, true);
        DaoMaster.createAllTables(database, false);
        g(database, clsArr);
    }

    @SafeVarargs
    public final void g(Database database, Class<? extends AbstractDao<?, ?>>... clsArr) {
        for (Class<? extends AbstractDao<?, ?>> cls : clsArr) {
            DaoConfig daoConfig = new DaoConfig(database, cls);
            String str = daoConfig.tablename;
            String strConcat = str.concat("_TEMP");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                Property[] propertyArr = daoConfig.properties;
                if (i < propertyArr.length) {
                    String str2 = propertyArr[i].columnName;
                    if (c(database, strConcat).contains(str2)) {
                        arrayList.add(str2);
                    }
                    i++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("DROP TABLE ");
            sb.append(strConcat);
            database.execSQL("INSERT INTO " + str + " (" + TextUtils.join(",", arrayList) + ") SELECT " + TextUtils.join(",", arrayList) + " FROM " + strConcat + ";");
            database.execSQL(sb.toString());
        }
    }
}
