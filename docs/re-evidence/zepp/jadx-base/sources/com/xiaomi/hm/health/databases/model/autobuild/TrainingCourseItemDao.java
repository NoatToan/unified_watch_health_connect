package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.xiaomi.hm.health.databases.model.trainning.TrainingCourseItem;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class TrainingCourseItemDao extends AbstractDao<TrainingCourseItem, Long> {
    public static final String TABLENAME = "TRAINING_COURSE_ITEM";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property TrainingId = new Property(1, Long.class, "trainingId", false, "TRAINING_ID");
        public static final Property Name = new Property(2, String.class, "name", false, "NAME");
        public static final Property DayOfWeek = new Property(3, Integer.class, "dayOfWeek", false, "DAY_OF_WEEK");
        public static final Property Time = new Property(4, Integer.class, "time", false, "TIME");
        public static final Property Consumption = new Property(5, Integer.class, "consumption", false, "CONSUMPTION");
        public static final Property IsFinished = new Property(6, Boolean.class, "isFinished", false, "IS_FINISHED");
        public static final Property IsToday = new Property(7, Boolean.class, "isToday", false, "IS_TODAY");
        public static final Property DayIndex = new Property(8, Integer.class, "dayIndex", false, "DAY_INDEX");
        public static final Property ArticleTitle = new Property(9, String.class, "articleTitle", false, "ARTICLE_TITLE");
        public static final Property ArticleLink = new Property(10, String.class, "articleLink", false, "ARTICLE_LINK");
        public static final Property ArticleImgUrl = new Property(11, String.class, "articleImgUrl", false, "ARTICLE_IMG_URL");
    }

    public TrainingCourseItemDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"TRAINING_COURSE_ITEM\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"TRAINING_ID\" INTEGER,\"NAME\" TEXT,\"DAY_OF_WEEK\" INTEGER,\"TIME\" INTEGER,\"CONSUMPTION\" INTEGER,\"IS_FINISHED\" INTEGER,\"IS_TODAY\" INTEGER,\"DAY_INDEX\" INTEGER,\"ARTICLE_TITLE\" TEXT,\"ARTICLE_LINK\" TEXT,\"ARTICLE_IMG_URL\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"TRAINING_COURSE_ITEM\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public TrainingCourseItemDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(TrainingCourseItem trainingCourseItem) {
        if (trainingCourseItem != null) {
            return trainingCourseItem.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(TrainingCourseItem trainingCourseItem) {
        return trainingCourseItem.getId() != null;
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
    public final Long updateKeyAfterInsert(TrainingCourseItem trainingCourseItem, long j) {
        trainingCourseItem.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, TrainingCourseItem trainingCourseItem) {
        databaseStatement.clearBindings();
        Long id = trainingCourseItem.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long trainingId = trainingCourseItem.getTrainingId();
        if (trainingId != null) {
            databaseStatement.bindLong(2, trainingId.longValue());
        }
        String name = trainingCourseItem.getName();
        if (name != null) {
            databaseStatement.bindString(3, name);
        }
        Integer dayOfWeek = trainingCourseItem.getDayOfWeek();
        if (dayOfWeek != null) {
            databaseStatement.bindLong(4, dayOfWeek.intValue());
        }
        Integer time = trainingCourseItem.getTime();
        if (time != null) {
            databaseStatement.bindLong(5, time.intValue());
        }
        Integer consumption = trainingCourseItem.getConsumption();
        if (consumption != null) {
            databaseStatement.bindLong(6, consumption.intValue());
        }
        Boolean isFinished = trainingCourseItem.getIsFinished();
        if (isFinished != null) {
            databaseStatement.bindLong(7, isFinished.booleanValue() ? 1L : 0L);
        }
        Boolean isToday = trainingCourseItem.getIsToday();
        if (isToday != null) {
            databaseStatement.bindLong(8, isToday.booleanValue() ? 1L : 0L);
        }
        Integer dayIndex = trainingCourseItem.getDayIndex();
        if (dayIndex != null) {
            databaseStatement.bindLong(9, dayIndex.intValue());
        }
        String articleTitle = trainingCourseItem.getArticleTitle();
        if (articleTitle != null) {
            databaseStatement.bindString(10, articleTitle);
        }
        String articleLink = trainingCourseItem.getArticleLink();
        if (articleLink != null) {
            databaseStatement.bindString(11, articleLink);
        }
        String articleImgUrl = trainingCourseItem.getArticleImgUrl();
        if (articleImgUrl != null) {
            databaseStatement.bindString(12, articleImgUrl);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public TrainingCourseItem readEntity(Cursor cursor, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        String string = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 3;
        Integer numValueOf = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        Integer numValueOf2 = cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6));
        int i7 = i + 5;
        Integer numValueOf3 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        if (cursor.isNull(i8)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i8) != 0);
        }
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        int i10 = i + 8;
        int i11 = i + 9;
        int i12 = i + 10;
        int i13 = i + 11;
        return new TrainingCourseItem(lValueOf, lValueOf2, string, numValueOf, numValueOf2, numValueOf3, boolValueOf, boolValueOf2, cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)), cursor.isNull(i11) ? null : cursor.getString(i11), cursor.isNull(i12) ? null : cursor.getString(i12), cursor.isNull(i13) ? null : cursor.getString(i13));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, TrainingCourseItem trainingCourseItem, int i) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        int i2 = i + 0;
        trainingCourseItem.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        trainingCourseItem.setTrainingId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        trainingCourseItem.setName(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 3;
        trainingCourseItem.setDayOfWeek(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        trainingCourseItem.setTime(cursor.isNull(i6) ? null : Integer.valueOf(cursor.getInt(i6)));
        int i7 = i + 5;
        trainingCourseItem.setConsumption(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        if (cursor.isNull(i8)) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(cursor.getShort(i8) != 0);
        }
        trainingCourseItem.setIsFinished(boolValueOf);
        int i9 = i + 7;
        if (cursor.isNull(i9)) {
            boolValueOf2 = null;
        } else {
            boolValueOf2 = Boolean.valueOf(cursor.getShort(i9) != 0);
        }
        trainingCourseItem.setIsToday(boolValueOf2);
        int i10 = i + 8;
        trainingCourseItem.setDayIndex(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 9;
        trainingCourseItem.setArticleTitle(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 10;
        trainingCourseItem.setArticleLink(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 11;
        trainingCourseItem.setArticleImgUrl(cursor.isNull(i13) ? null : cursor.getString(i13));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, TrainingCourseItem trainingCourseItem) {
        sQLiteStatement.clearBindings();
        Long id = trainingCourseItem.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long trainingId = trainingCourseItem.getTrainingId();
        if (trainingId != null) {
            sQLiteStatement.bindLong(2, trainingId.longValue());
        }
        String name = trainingCourseItem.getName();
        if (name != null) {
            sQLiteStatement.bindString(3, name);
        }
        Integer dayOfWeek = trainingCourseItem.getDayOfWeek();
        if (dayOfWeek != null) {
            sQLiteStatement.bindLong(4, dayOfWeek.intValue());
        }
        Integer time = trainingCourseItem.getTime();
        if (time != null) {
            sQLiteStatement.bindLong(5, time.intValue());
        }
        Integer consumption = trainingCourseItem.getConsumption();
        if (consumption != null) {
            sQLiteStatement.bindLong(6, consumption.intValue());
        }
        Boolean isFinished = trainingCourseItem.getIsFinished();
        if (isFinished != null) {
            sQLiteStatement.bindLong(7, isFinished.booleanValue() ? 1L : 0L);
        }
        Boolean isToday = trainingCourseItem.getIsToday();
        if (isToday != null) {
            sQLiteStatement.bindLong(8, isToday.booleanValue() ? 1L : 0L);
        }
        Integer dayIndex = trainingCourseItem.getDayIndex();
        if (dayIndex != null) {
            sQLiteStatement.bindLong(9, dayIndex.intValue());
        }
        String articleTitle = trainingCourseItem.getArticleTitle();
        if (articleTitle != null) {
            sQLiteStatement.bindString(10, articleTitle);
        }
        String articleLink = trainingCourseItem.getArticleLink();
        if (articleLink != null) {
            sQLiteStatement.bindString(11, articleLink);
        }
        String articleImgUrl = trainingCourseItem.getArticleImgUrl();
        if (articleImgUrl != null) {
            sQLiteStatement.bindString(12, articleImgUrl);
        }
    }
}
