package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.huami.ecg.core.db.entity.EcgData;
import com.xiaomi.hm.health.databases.model.trainning.BgMusic;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class BgMusicDao extends AbstractDao<BgMusic, Long> {
    public static final String TABLENAME = "BG_MUSIC";

    public static class Properties {
        public static final Property Id;
        public static final Property MusicId;
        public static final Property Name;
        public static final Property Size;
        public static final Property Status;
        public static final Property TrainingId;
        public static final Property UpdateTime;
        public static final Property Url;

        static {
            Class cls = Long.TYPE;
            Id = new Property(0, cls, "id", true, "_id");
            TrainingId = new Property(1, Long.class, "trainingId", false, "TRAINING_ID");
            MusicId = new Property(2, cls, "musicId", false, "MUSIC_ID");
            Size = new Property(3, cls, "size", false, "SIZE");
            UpdateTime = new Property(4, cls, EcgData.TIMESTAMP_SERVER_UPDATED, false, "UPDATE_TIME");
            Name = new Property(5, String.class, "name", false, "NAME");
            Url = new Property(6, String.class, "url", false, DTransferConstants.URL);
            Status = new Property(7, String.class, "status", false, "STATUS");
        }
    }

    public BgMusicDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"BG_MUSIC\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ,\"TRAINING_ID\" INTEGER,\"MUSIC_ID\" INTEGER NOT NULL ,\"SIZE\" INTEGER NOT NULL ,\"UPDATE_TIME\" INTEGER NOT NULL ,\"NAME\" TEXT,\"URL\" TEXT,\"STATUS\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"BG_MUSIC\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public BgMusicDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(BgMusic bgMusic) {
        if (bgMusic != null) {
            return Long.valueOf(bgMusic.getId());
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(BgMusic bgMusic) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public Long readKey(Cursor cursor, int i) {
        return Long.valueOf(cursor.getLong(i + 0));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final Long updateKeyAfterInsert(BgMusic bgMusic, long j) {
        bgMusic.setId(j);
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, BgMusic bgMusic) {
        databaseStatement.clearBindings();
        databaseStatement.bindLong(1, bgMusic.getId());
        Long trainingId = bgMusic.getTrainingId();
        if (trainingId != null) {
            databaseStatement.bindLong(2, trainingId.longValue());
        }
        databaseStatement.bindLong(3, bgMusic.getMusicId());
        databaseStatement.bindLong(4, bgMusic.getSize());
        databaseStatement.bindLong(5, bgMusic.getUpdateTime());
        String name = bgMusic.getName();
        if (name != null) {
            databaseStatement.bindString(6, name);
        }
        String url = bgMusic.getUrl();
        if (url != null) {
            databaseStatement.bindString(7, url);
        }
        String status = bgMusic.getStatus();
        if (status != null) {
            databaseStatement.bindString(8, status);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public BgMusic readEntity(Cursor cursor, int i) {
        long j = cursor.getLong(i + 0);
        int i2 = i + 1;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        long j2 = cursor.getLong(i + 2);
        long j3 = cursor.getLong(i + 3);
        long j4 = cursor.getLong(i + 4);
        int i3 = i + 5;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 6;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        int i5 = i + 7;
        return new BgMusic(j, lValueOf, j2, j3, j4, string, string2, cursor.isNull(i5) ? null : cursor.getString(i5));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, BgMusic bgMusic, int i) {
        bgMusic.setId(cursor.getLong(i + 0));
        int i2 = i + 1;
        bgMusic.setTrainingId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        bgMusic.setMusicId(cursor.getLong(i + 2));
        bgMusic.setSize(cursor.getLong(i + 3));
        bgMusic.setUpdateTime(cursor.getLong(i + 4));
        int i3 = i + 5;
        bgMusic.setName(cursor.isNull(i3) ? null : cursor.getString(i3));
        int i4 = i + 6;
        bgMusic.setUrl(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 7;
        bgMusic.setStatus(cursor.isNull(i5) ? null : cursor.getString(i5));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, BgMusic bgMusic) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, bgMusic.getId());
        Long trainingId = bgMusic.getTrainingId();
        if (trainingId != null) {
            sQLiteStatement.bindLong(2, trainingId.longValue());
        }
        sQLiteStatement.bindLong(3, bgMusic.getMusicId());
        sQLiteStatement.bindLong(4, bgMusic.getSize());
        sQLiteStatement.bindLong(5, bgMusic.getUpdateTime());
        String name = bgMusic.getName();
        if (name != null) {
            sQLiteStatement.bindString(6, name);
        }
        String url = bgMusic.getUrl();
        if (url != null) {
            sQLiteStatement.bindString(7, url);
        }
        String status = bgMusic.getStatus();
        if (status != null) {
            sQLiteStatement.bindString(8, status);
        }
    }
}
