package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.sleepassistant.apilib.utils.WebConst;
import com.ingenic.iwds.HardwareList;
import com.xiaomi.hm.health.databases.model.trainning.ActionAudio;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ActionAudioDao extends AbstractDao<ActionAudio, Long> {
    public static final String TABLENAME = "ACTION_AUDIO";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property AudioId = new Property(1, Long.class, WebConst.QueryParam.AUDIO_ID, false, "AUDIO_ID");
        public static final Property TrainingId = new Property(2, Long.class, "trainingId", false, "TRAINING_ID");
        public static final Property Name = new Property(3, String.class, "name", false, "NAME");
        public static final Property Content = new Property(4, String.class, "content", false, "CONTENT");
        public static final Property Time = new Property(5, Integer.class, "time", false, "TIME");
        public static final Property Url = new Property(6, String.class, "url", false, DTransferConstants.URL);
        public static final Property Size = new Property(7, Long.class, "size", false, "SIZE");
        public static final Property Status = new Property(8, Integer.class, "status", false, "STATUS");
        public static final Property UpdateTime = new Property(9, Long.class, EcgData.TIMESTAMP_SERVER_UPDATED, false, "UPDATE_TIME");
        public static final Property Round = new Property(10, Integer.class, HardwareList.VALUE_LCD_EXTERIOR_ROUND, false, "ROUND");
        public static final Property Group = new Property(11, Integer.class, "group", false, "GROUP");
    }

    public ActionAudioDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ACTION_AUDIO\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"AUDIO_ID\" INTEGER,\"TRAINING_ID\" INTEGER,\"NAME\" TEXT,\"CONTENT\" TEXT,\"TIME\" INTEGER,\"URL\" TEXT,\"SIZE\" INTEGER,\"STATUS\" INTEGER,\"UPDATE_TIME\" INTEGER,\"ROUND\" INTEGER,\"GROUP\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ACTION_AUDIO\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ActionAudioDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ActionAudio actionAudio) {
        if (actionAudio != null) {
            return actionAudio.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ActionAudio actionAudio) {
        return actionAudio.getId() != null;
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
    public final Long updateKeyAfterInsert(ActionAudio actionAudio, long j) {
        actionAudio.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ActionAudio actionAudio) {
        databaseStatement.clearBindings();
        Long id = actionAudio.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long audioId = actionAudio.getAudioId();
        if (audioId != null) {
            databaseStatement.bindLong(2, audioId.longValue());
        }
        Long trainingId = actionAudio.getTrainingId();
        if (trainingId != null) {
            databaseStatement.bindLong(3, trainingId.longValue());
        }
        String name = actionAudio.getName();
        if (name != null) {
            databaseStatement.bindString(4, name);
        }
        String content = actionAudio.getContent();
        if (content != null) {
            databaseStatement.bindString(5, content);
        }
        Integer time = actionAudio.getTime();
        if (time != null) {
            databaseStatement.bindLong(6, time.intValue());
        }
        String url = actionAudio.getUrl();
        if (url != null) {
            databaseStatement.bindString(7, url);
        }
        Long size = actionAudio.getSize();
        if (size != null) {
            databaseStatement.bindLong(8, size.longValue());
        }
        Integer status = actionAudio.getStatus();
        if (status != null) {
            databaseStatement.bindLong(9, status.intValue());
        }
        Long updateTime = actionAudio.getUpdateTime();
        if (updateTime != null) {
            databaseStatement.bindLong(10, updateTime.longValue());
        }
        Integer round = actionAudio.getRound();
        if (round != null) {
            databaseStatement.bindLong(11, round.intValue());
        }
        Integer group = actionAudio.getGroup();
        if (group != null) {
            databaseStatement.bindLong(12, group.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ActionAudio readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        int i3 = i + 1;
        int i4 = i + 2;
        int i5 = i + 3;
        int i6 = i + 4;
        int i7 = i + 5;
        int i8 = i + 6;
        int i9 = i + 7;
        int i10 = i + 8;
        int i11 = i + 9;
        int i12 = i + 10;
        int i13 = i + 11;
        return new ActionAudio(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)), cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)), cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)), cursor.isNull(i5) ? null : cursor.getString(i5), cursor.isNull(i6) ? null : cursor.getString(i6), cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)), cursor.isNull(i8) ? null : cursor.getString(i8), cursor.isNull(i9) ? null : Long.valueOf(cursor.getLong(i9)), cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)), cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11)), cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)), cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ActionAudio actionAudio, int i) {
        int i2 = i + 0;
        actionAudio.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        actionAudio.setAudioId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        actionAudio.setTrainingId(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        actionAudio.setName(cursor.isNull(i5) ? null : cursor.getString(i5));
        int i6 = i + 4;
        actionAudio.setContent(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        actionAudio.setTime(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        actionAudio.setUrl(cursor.isNull(i8) ? null : cursor.getString(i8));
        int i9 = i + 7;
        actionAudio.setSize(cursor.isNull(i9) ? null : Long.valueOf(cursor.getLong(i9)));
        int i10 = i + 8;
        actionAudio.setStatus(cursor.isNull(i10) ? null : Integer.valueOf(cursor.getInt(i10)));
        int i11 = i + 9;
        actionAudio.setUpdateTime(cursor.isNull(i11) ? null : Long.valueOf(cursor.getLong(i11)));
        int i12 = i + 10;
        actionAudio.setRound(cursor.isNull(i12) ? null : Integer.valueOf(cursor.getInt(i12)));
        int i13 = i + 11;
        actionAudio.setGroup(cursor.isNull(i13) ? null : Integer.valueOf(cursor.getInt(i13)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ActionAudio actionAudio) {
        sQLiteStatement.clearBindings();
        Long id = actionAudio.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long audioId = actionAudio.getAudioId();
        if (audioId != null) {
            sQLiteStatement.bindLong(2, audioId.longValue());
        }
        Long trainingId = actionAudio.getTrainingId();
        if (trainingId != null) {
            sQLiteStatement.bindLong(3, trainingId.longValue());
        }
        String name = actionAudio.getName();
        if (name != null) {
            sQLiteStatement.bindString(4, name);
        }
        String content = actionAudio.getContent();
        if (content != null) {
            sQLiteStatement.bindString(5, content);
        }
        Integer time = actionAudio.getTime();
        if (time != null) {
            sQLiteStatement.bindLong(6, time.intValue());
        }
        String url = actionAudio.getUrl();
        if (url != null) {
            sQLiteStatement.bindString(7, url);
        }
        Long size = actionAudio.getSize();
        if (size != null) {
            sQLiteStatement.bindLong(8, size.longValue());
        }
        Integer status = actionAudio.getStatus();
        if (status != null) {
            sQLiteStatement.bindLong(9, status.intValue());
        }
        Long updateTime = actionAudio.getUpdateTime();
        if (updateTime != null) {
            sQLiteStatement.bindLong(10, updateTime.longValue());
        }
        Integer round = actionAudio.getRound();
        if (round != null) {
            sQLiteStatement.bindLong(11, round.intValue());
        }
        Integer group = actionAudio.getGroup();
        if (group != null) {
            sQLiteStatement.bindLong(12, group.intValue());
        }
    }
}
