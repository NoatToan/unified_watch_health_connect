package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.android.gms.stats.CodePackage;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class CompareModelDao extends AbstractDao<CompareModel, Long> {
    public static final String TABLENAME = "COMPARE_MODEL";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property TimeValue = new Property(1, String.class, "timeValue", false, "TIME_VALUE");
        public static final Property AgeGroup = new Property(2, Integer.class, "ageGroup", false, "AGE_GROUP");
        public static final Property ItemType = new Property(3, String.class, "itemType", false, "ITEM_TYPE");
        public static final Property Gender = new Property(4, Integer.class, "gender", false, "GENDER");
        public static final Property Category = new Property(5, Integer.class, "category", false, "CATEGORY");
        public static final Property Count = new Property(6, Integer.class, "count", false, "COUNT");
        public static final Property CategoryCount = new Property(7, Integer.class, "categoryCount", false, "CATEGORY_COUNT");
        public static final Property Location = new Property(8, String.class, "location", false, CodePackage.LOCATION);
        public static final Property TimeUnit = new Property(9, Integer.class, "timeUnit", false, "TIME_UNIT");
        public static final Property AggregationLevel = new Property(10, String.class, "aggregationLevel", false, "AGGREGATION_LEVEL");
    }

    public CompareModelDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"COMPARE_MODEL\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TIME_VALUE\" TEXT,\"AGE_GROUP\" INTEGER,\"ITEM_TYPE\" TEXT,\"GENDER\" INTEGER,\"CATEGORY\" INTEGER,\"COUNT\" INTEGER,\"CATEGORY_COUNT\" INTEGER,\"LOCATION\" TEXT,\"TIME_UNIT\" INTEGER,\"AGGREGATION_LEVEL\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"COMPARE_MODEL\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public CompareModelDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(CompareModel compareModel) {
        if (compareModel != null) {
            return compareModel.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(CompareModel compareModel) {
        return compareModel.getId() != null;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        int i2 = i + 0;
        if (cursor.isNull(i2)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i2));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(CompareModel compareModel, long j) {
        compareModel.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, CompareModel compareModel) {
        databaseStatement.clearBindings();
        Long id = compareModel.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        String timeValue = compareModel.getTimeValue();
        if (timeValue != null) {
            databaseStatement.bindString(2, timeValue);
        }
        Integer ageGroup = compareModel.getAgeGroup();
        if (ageGroup != null) {
            databaseStatement.bindLong(3, ageGroup.intValue());
        }
        String itemType = compareModel.getItemType();
        if (itemType != null) {
            databaseStatement.bindString(4, itemType);
        }
        Integer gender = compareModel.getGender();
        if (gender != null) {
            databaseStatement.bindLong(5, gender.intValue());
        }
        Integer category = compareModel.getCategory();
        if (category != null) {
            databaseStatement.bindLong(6, category.intValue());
        }
        Integer count = compareModel.getCount();
        if (count != null) {
            databaseStatement.bindLong(7, count.intValue());
        }
        Integer categoryCount = compareModel.getCategoryCount();
        if (categoryCount != null) {
            databaseStatement.bindLong(8, categoryCount.intValue());
        }
        String location = compareModel.getLocation();
        if (location != null) {
            databaseStatement.bindString(9, location);
        }
        Integer timeUnit = compareModel.getTimeUnit();
        if (timeUnit != null) {
            databaseStatement.bindLong(10, timeUnit.intValue());
        }
        String aggregationLevel = compareModel.getAggregationLevel();
        if (aggregationLevel != null) {
            databaseStatement.bindString(11, aggregationLevel);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public CompareModel readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        Integer numValueOf = cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4));
        int i5 = i + 3;
        String string2 = cursor.isNull(i5) ? null : cursor.getString(i5);
        int i6 = i + 4;
        Integer numValueOf2 = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        Integer numValueOf3 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        Integer numValueOf4 = cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8));
        int i9 = i + 7;
        Integer numValueOf5 = cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9));
        int i10 = i + 8;
        String string3 = cursor.isNull(i10) ? null : cursor.getString(i10);
        int i11 = i + 9;
        int i12 = i + 10;
        return new CompareModel(lValueOf, string, numValueOf, string2, numValueOf2, numValueOf3, numValueOf4, numValueOf5, string3, cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)), cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, CompareModel compareModel, int i) {
        int i2 = i + 0;
        compareModel.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        compareModel.setTimeValue(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 2;
        compareModel.setAgeGroup(cursor.isNull(i4) ? null : Integer.valueOf(cursor.getInt(i4)));
        int i5 = i + 3;
        compareModel.setItemType(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        compareModel.setGender(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        compareModel.setCategory(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        compareModel.setCount(cursor.isNull(i8) ? null : Integer.valueOf(cursor.getInt(i8)));
        int i9 = i + 7;
        compareModel.setCategoryCount(cursor.isNull(i9) ? null : Integer.valueOf(cursor.getInt(i9)));
        int i10 = i + 8;
        compareModel.setLocation(cursor.isNull(i10) ? null : cursor.getString(i10));
        int i11 = i + 9;
        compareModel.setTimeUnit(cursor.isNull(i11) ? null : Integer.valueOf(cursor.getInt(i11)));
        int i12 = i + 10;
        compareModel.setAggregationLevel(cursor.isNull(i12) ? null : cursor.getString(i12));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, CompareModel compareModel) {
        sQLiteStatement.clearBindings();
        Long id = compareModel.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        String timeValue = compareModel.getTimeValue();
        if (timeValue != null) {
            sQLiteStatement.bindString(2, timeValue);
        }
        Integer ageGroup = compareModel.getAgeGroup();
        if (ageGroup != null) {
            sQLiteStatement.bindLong(3, ageGroup.intValue());
        }
        String itemType = compareModel.getItemType();
        if (itemType != null) {
            sQLiteStatement.bindString(4, itemType);
        }
        Integer gender = compareModel.getGender();
        if (gender != null) {
            sQLiteStatement.bindLong(5, gender.intValue());
        }
        Integer category = compareModel.getCategory();
        if (category != null) {
            sQLiteStatement.bindLong(6, category.intValue());
        }
        Integer count = compareModel.getCount();
        if (count != null) {
            sQLiteStatement.bindLong(7, count.intValue());
        }
        Integer categoryCount = compareModel.getCategoryCount();
        if (categoryCount != null) {
            sQLiteStatement.bindLong(8, categoryCount.intValue());
        }
        String location = compareModel.getLocation();
        if (location != null) {
            sQLiteStatement.bindString(9, location);
        }
        Integer timeUnit = compareModel.getTimeUnit();
        if (timeUnit != null) {
            sQLiteStatement.bindLong(10, timeUnit.intValue());
        }
        String aggregationLevel = compareModel.getAggregationLevel();
        if (aggregationLevel != null) {
            sQLiteStatement.bindString(11, aggregationLevel);
        }
    }
}
