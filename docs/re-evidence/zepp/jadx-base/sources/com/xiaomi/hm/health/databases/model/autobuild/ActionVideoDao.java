package com.xiaomi.hm.health.databases.model.autobuild;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.google.android.gms.stats.CodePackage;
import com.huami.android.zxing.Intents;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.moving.sport.ui.webapi.impl.DeviceSettingApiImpl;
import com.ingenic.iwds.HardwareList;
import com.xiaomi.hm.health.databases.model.trainning.ActionVideo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class ActionVideoDao extends AbstractDao<ActionVideo, Long> {
    public static final String TABLENAME = "ACTION_VIDEO";

    public static class Properties {
        public static final Property Id = new Property(0, Long.class, "id", true, "_id");
        public static final Property VideoId = new Property(1, Long.class, "videoId", false, "VIDEO_ID");
        public static final Property TrainingId = new Property(2, Long.class, "trainingId", false, "TRAINING_ID");
        public static final Property Gender = new Property(3, Integer.class, "gender", false, "GENDER");
        public static final Property Name = new Property(4, String.class, "name", false, "NAME");
        public static final Property Time = new Property(5, Integer.class, "time", false, "TIME");
        public static final Property SingleActionTime = new Property(6, Long.class, "singleActionTime", false, "SINGLE_ACTION_TIME");
        public static final Property Thumbnail = new Property(7, String.class, DeviceSettingApiImpl.META_KEY_THUMBNAIL, false, "THUMBNAIL");
        public static final Property Size = new Property(8, Long.class, "size", false, "SIZE");
        public static final Property Url = new Property(9, String.class, "url", false, DTransferConstants.URL);
        public static final Property Location = new Property(10, String.class, "location", false, CodePackage.LOCATION);
        public static final Property InterpretationDocument = new Property(11, String.class, "interpretationDocument", false, "INTERPRETATION_DOCUMENT");
        public static final Property Type = new Property(12, String.class, "type", false, Intents.WifiConnect.TYPE);
        public static final Property DifficultyDegree = new Property(13, Integer.class, "difficultyDegree", false, "DIFFICULTY_DEGREE");
        public static final Property Instrument = new Property(14, String.class, "instrument", false, "INSTRUMENT");
        public static final Property ActionPosition = new Property(15, String.class, "actionPosition", false, "ACTION_POSITION");
        public static final Property Function = new Property(16, String.class, "function", false, "FUNCTION");
        public static final Property Status = new Property(17, Integer.class, "status", false, "STATUS");
        public static final Property UpdateTime = new Property(18, Long.class, EcgData.TIMESTAMP_SERVER_UPDATED, false, "UPDATE_TIME");
        public static final Property Round = new Property(19, Integer.class, HardwareList.VALUE_LCD_EXTERIOR_ROUND, false, "ROUND");
        public static final Property Group = new Property(20, Integer.class, "group", false, "GROUP");
        public static final Property ActionNumber = new Property(21, Integer.class, "actionNumber", false, "ACTION_NUMBER");
        public static final Property UsualError = new Property(22, String.class, "usualError", false, "USUAL_ERROR");
        public static final Property BreathGist = new Property(23, String.class, "breathGist", false, "BREATH_GIST");
        public static final Property Consumption = new Property(24, Integer.class, "consumption", false, "CONSUMPTION");
    }

    public ActionVideoDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"ACTION_VIDEO\" (\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ,\"VIDEO_ID\" INTEGER,\"TRAINING_ID\" INTEGER,\"GENDER\" INTEGER,\"NAME\" TEXT,\"TIME\" INTEGER,\"SINGLE_ACTION_TIME\" INTEGER,\"THUMBNAIL\" TEXT,\"SIZE\" INTEGER,\"URL\" TEXT,\"LOCATION\" TEXT,\"INTERPRETATION_DOCUMENT\" TEXT,\"TYPE\" TEXT,\"DIFFICULTY_DEGREE\" INTEGER,\"INSTRUMENT\" TEXT,\"ACTION_POSITION\" TEXT,\"FUNCTION\" TEXT,\"STATUS\" INTEGER,\"UPDATE_TIME\" INTEGER,\"ROUND\" INTEGER,\"GROUP\" INTEGER,\"ACTION_NUMBER\" INTEGER,\"USUAL_ERROR\" TEXT,\"BREATH_GIST\" TEXT,\"CONSUMPTION\" INTEGER);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"ACTION_VIDEO\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    public ActionVideoDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Long getKey(ActionVideo actionVideo) {
        if (actionVideo != null) {
            return actionVideo.getId();
        }
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(ActionVideo actionVideo) {
        return actionVideo.getId() != null;
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
    public final Long updateKeyAfterInsert(ActionVideo actionVideo, long j) {
        actionVideo.setId(Long.valueOf(j));
        return Long.valueOf(j);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, ActionVideo actionVideo) {
        databaseStatement.clearBindings();
        Long id = actionVideo.getId();
        if (id != null) {
            databaseStatement.bindLong(1, id.longValue());
        }
        Long videoId = actionVideo.getVideoId();
        if (videoId != null) {
            databaseStatement.bindLong(2, videoId.longValue());
        }
        Long trainingId = actionVideo.getTrainingId();
        if (trainingId != null) {
            databaseStatement.bindLong(3, trainingId.longValue());
        }
        Integer gender = actionVideo.getGender();
        if (gender != null) {
            databaseStatement.bindLong(4, gender.intValue());
        }
        String name = actionVideo.getName();
        if (name != null) {
            databaseStatement.bindString(5, name);
        }
        Integer time = actionVideo.getTime();
        if (time != null) {
            databaseStatement.bindLong(6, time.intValue());
        }
        Long singleActionTime = actionVideo.getSingleActionTime();
        if (singleActionTime != null) {
            databaseStatement.bindLong(7, singleActionTime.longValue());
        }
        String thumbnail = actionVideo.getThumbnail();
        if (thumbnail != null) {
            databaseStatement.bindString(8, thumbnail);
        }
        Long size = actionVideo.getSize();
        if (size != null) {
            databaseStatement.bindLong(9, size.longValue());
        }
        String url = actionVideo.getUrl();
        if (url != null) {
            databaseStatement.bindString(10, url);
        }
        String location = actionVideo.getLocation();
        if (location != null) {
            databaseStatement.bindString(11, location);
        }
        String interpretationDocument = actionVideo.getInterpretationDocument();
        if (interpretationDocument != null) {
            databaseStatement.bindString(12, interpretationDocument);
        }
        String type = actionVideo.getType();
        if (type != null) {
            databaseStatement.bindString(13, type);
        }
        Integer difficultyDegree = actionVideo.getDifficultyDegree();
        if (difficultyDegree != null) {
            databaseStatement.bindLong(14, difficultyDegree.intValue());
        }
        String instrument = actionVideo.getInstrument();
        if (instrument != null) {
            databaseStatement.bindString(15, instrument);
        }
        String actionPosition = actionVideo.getActionPosition();
        if (actionPosition != null) {
            databaseStatement.bindString(16, actionPosition);
        }
        String function = actionVideo.getFunction();
        if (function != null) {
            databaseStatement.bindString(17, function);
        }
        Integer status = actionVideo.getStatus();
        if (status != null) {
            databaseStatement.bindLong(18, status.intValue());
        }
        Long updateTime = actionVideo.getUpdateTime();
        if (updateTime != null) {
            databaseStatement.bindLong(19, updateTime.longValue());
        }
        Integer round = actionVideo.getRound();
        if (round != null) {
            databaseStatement.bindLong(20, round.intValue());
        }
        Integer group = actionVideo.getGroup();
        if (group != null) {
            databaseStatement.bindLong(21, group.intValue());
        }
        Integer actionNumber = actionVideo.getActionNumber();
        if (actionNumber != null) {
            databaseStatement.bindLong(22, actionNumber.intValue());
        }
        String usualError = actionVideo.getUsualError();
        if (usualError != null) {
            databaseStatement.bindString(23, usualError);
        }
        String breathGist = actionVideo.getBreathGist();
        if (breathGist != null) {
            databaseStatement.bindString(24, breathGist);
        }
        Integer consumption = actionVideo.getConsumption();
        if (consumption != null) {
            databaseStatement.bindLong(25, consumption.intValue());
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public ActionVideo readEntity(Cursor cursor, int i) {
        int i2 = i + 0;
        Long lValueOf = cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2));
        int i3 = i + 1;
        Long lValueOf2 = cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3));
        int i4 = i + 2;
        Long lValueOf3 = cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4));
        int i5 = i + 3;
        Integer numValueOf = cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5));
        int i6 = i + 4;
        String string = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 5;
        Integer numValueOf2 = cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7));
        int i8 = i + 6;
        Long lValueOf4 = cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8));
        int i9 = i + 7;
        String string2 = cursor.isNull(i9) ? null : cursor.getString(i9);
        int i10 = i + 8;
        Long lValueOf5 = cursor.isNull(i10) ? null : Long.valueOf(cursor.getLong(i10));
        int i11 = i + 9;
        String string3 = cursor.isNull(i11) ? null : cursor.getString(i11);
        int i12 = i + 10;
        String string4 = cursor.isNull(i12) ? null : cursor.getString(i12);
        int i13 = i + 11;
        String string5 = cursor.isNull(i13) ? null : cursor.getString(i13);
        int i14 = i + 12;
        String string6 = cursor.isNull(i14) ? null : cursor.getString(i14);
        int i15 = i + 13;
        Integer numValueOf3 = cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15));
        int i16 = i + 14;
        String string7 = cursor.isNull(i16) ? null : cursor.getString(i16);
        int i17 = i + 15;
        String string8 = cursor.isNull(i17) ? null : cursor.getString(i17);
        int i18 = i + 16;
        String string9 = cursor.isNull(i18) ? null : cursor.getString(i18);
        int i19 = i + 17;
        Integer numValueOf4 = cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19));
        int i20 = i + 18;
        Long lValueOf6 = cursor.isNull(i20) ? null : Long.valueOf(cursor.getLong(i20));
        int i21 = i + 19;
        Integer numValueOf5 = cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21));
        int i22 = i + 20;
        Integer numValueOf6 = cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22));
        int i23 = i + 21;
        Integer numValueOf7 = cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23));
        int i24 = i + 22;
        String string10 = cursor.isNull(i24) ? null : cursor.getString(i24);
        int i25 = i + 23;
        String string11 = cursor.isNull(i25) ? null : cursor.getString(i25);
        int i26 = i + 24;
        return new ActionVideo(lValueOf, lValueOf2, lValueOf3, numValueOf, string, numValueOf2, lValueOf4, string2, lValueOf5, string3, string4, string5, string6, numValueOf3, string7, string8, string9, numValueOf4, lValueOf6, numValueOf5, numValueOf6, numValueOf7, string10, string11, cursor.isNull(i26) ? null : Integer.valueOf(cursor.getInt(i26)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, ActionVideo actionVideo, int i) {
        int i2 = i + 0;
        actionVideo.setId(cursor.isNull(i2) ? null : Long.valueOf(cursor.getLong(i2)));
        int i3 = i + 1;
        actionVideo.setVideoId(cursor.isNull(i3) ? null : Long.valueOf(cursor.getLong(i3)));
        int i4 = i + 2;
        actionVideo.setTrainingId(cursor.isNull(i4) ? null : Long.valueOf(cursor.getLong(i4)));
        int i5 = i + 3;
        actionVideo.setGender(cursor.isNull(i5) ? null : Integer.valueOf(cursor.getInt(i5)));
        int i6 = i + 4;
        actionVideo.setName(cursor.isNull(i6) ? null : cursor.getString(i6));
        int i7 = i + 5;
        actionVideo.setTime(cursor.isNull(i7) ? null : Integer.valueOf(cursor.getInt(i7)));
        int i8 = i + 6;
        actionVideo.setSingleActionTime(cursor.isNull(i8) ? null : Long.valueOf(cursor.getLong(i8)));
        int i9 = i + 7;
        actionVideo.setThumbnail(cursor.isNull(i9) ? null : cursor.getString(i9));
        int i10 = i + 8;
        actionVideo.setSize(cursor.isNull(i10) ? null : Long.valueOf(cursor.getLong(i10)));
        int i11 = i + 9;
        actionVideo.setUrl(cursor.isNull(i11) ? null : cursor.getString(i11));
        int i12 = i + 10;
        actionVideo.setLocation(cursor.isNull(i12) ? null : cursor.getString(i12));
        int i13 = i + 11;
        actionVideo.setInterpretationDocument(cursor.isNull(i13) ? null : cursor.getString(i13));
        int i14 = i + 12;
        actionVideo.setType(cursor.isNull(i14) ? null : cursor.getString(i14));
        int i15 = i + 13;
        actionVideo.setDifficultyDegree(cursor.isNull(i15) ? null : Integer.valueOf(cursor.getInt(i15)));
        int i16 = i + 14;
        actionVideo.setInstrument(cursor.isNull(i16) ? null : cursor.getString(i16));
        int i17 = i + 15;
        actionVideo.setActionPosition(cursor.isNull(i17) ? null : cursor.getString(i17));
        int i18 = i + 16;
        actionVideo.setFunction(cursor.isNull(i18) ? null : cursor.getString(i18));
        int i19 = i + 17;
        actionVideo.setStatus(cursor.isNull(i19) ? null : Integer.valueOf(cursor.getInt(i19)));
        int i20 = i + 18;
        actionVideo.setUpdateTime(cursor.isNull(i20) ? null : Long.valueOf(cursor.getLong(i20)));
        int i21 = i + 19;
        actionVideo.setRound(cursor.isNull(i21) ? null : Integer.valueOf(cursor.getInt(i21)));
        int i22 = i + 20;
        actionVideo.setGroup(cursor.isNull(i22) ? null : Integer.valueOf(cursor.getInt(i22)));
        int i23 = i + 21;
        actionVideo.setActionNumber(cursor.isNull(i23) ? null : Integer.valueOf(cursor.getInt(i23)));
        int i24 = i + 22;
        actionVideo.setUsualError(cursor.isNull(i24) ? null : cursor.getString(i24));
        int i25 = i + 23;
        actionVideo.setBreathGist(cursor.isNull(i25) ? null : cursor.getString(i25));
        int i26 = i + 24;
        actionVideo.setConsumption(cursor.isNull(i26) ? null : Integer.valueOf(cursor.getInt(i26)));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, ActionVideo actionVideo) {
        sQLiteStatement.clearBindings();
        Long id = actionVideo.getId();
        if (id != null) {
            sQLiteStatement.bindLong(1, id.longValue());
        }
        Long videoId = actionVideo.getVideoId();
        if (videoId != null) {
            sQLiteStatement.bindLong(2, videoId.longValue());
        }
        Long trainingId = actionVideo.getTrainingId();
        if (trainingId != null) {
            sQLiteStatement.bindLong(3, trainingId.longValue());
        }
        Integer gender = actionVideo.getGender();
        if (gender != null) {
            sQLiteStatement.bindLong(4, gender.intValue());
        }
        String name = actionVideo.getName();
        if (name != null) {
            sQLiteStatement.bindString(5, name);
        }
        Integer time = actionVideo.getTime();
        if (time != null) {
            sQLiteStatement.bindLong(6, time.intValue());
        }
        Long singleActionTime = actionVideo.getSingleActionTime();
        if (singleActionTime != null) {
            sQLiteStatement.bindLong(7, singleActionTime.longValue());
        }
        String thumbnail = actionVideo.getThumbnail();
        if (thumbnail != null) {
            sQLiteStatement.bindString(8, thumbnail);
        }
        Long size = actionVideo.getSize();
        if (size != null) {
            sQLiteStatement.bindLong(9, size.longValue());
        }
        String url = actionVideo.getUrl();
        if (url != null) {
            sQLiteStatement.bindString(10, url);
        }
        String location = actionVideo.getLocation();
        if (location != null) {
            sQLiteStatement.bindString(11, location);
        }
        String interpretationDocument = actionVideo.getInterpretationDocument();
        if (interpretationDocument != null) {
            sQLiteStatement.bindString(12, interpretationDocument);
        }
        String type = actionVideo.getType();
        if (type != null) {
            sQLiteStatement.bindString(13, type);
        }
        Integer difficultyDegree = actionVideo.getDifficultyDegree();
        if (difficultyDegree != null) {
            sQLiteStatement.bindLong(14, difficultyDegree.intValue());
        }
        String instrument = actionVideo.getInstrument();
        if (instrument != null) {
            sQLiteStatement.bindString(15, instrument);
        }
        String actionPosition = actionVideo.getActionPosition();
        if (actionPosition != null) {
            sQLiteStatement.bindString(16, actionPosition);
        }
        String function = actionVideo.getFunction();
        if (function != null) {
            sQLiteStatement.bindString(17, function);
        }
        Integer status = actionVideo.getStatus();
        if (status != null) {
            sQLiteStatement.bindLong(18, status.intValue());
        }
        Long updateTime = actionVideo.getUpdateTime();
        if (updateTime != null) {
            sQLiteStatement.bindLong(19, updateTime.longValue());
        }
        Integer round = actionVideo.getRound();
        if (round != null) {
            sQLiteStatement.bindLong(20, round.intValue());
        }
        Integer group = actionVideo.getGroup();
        if (group != null) {
            sQLiteStatement.bindLong(21, group.intValue());
        }
        Integer actionNumber = actionVideo.getActionNumber();
        if (actionNumber != null) {
            sQLiteStatement.bindLong(22, actionNumber.intValue());
        }
        String usualError = actionVideo.getUsualError();
        if (usualError != null) {
            sQLiteStatement.bindString(23, usualError);
        }
        String breathGist = actionVideo.getBreathGist();
        if (breathGist != null) {
            sQLiteStatement.bindString(24, breathGist);
        }
        Integer consumption = actionVideo.getConsumption();
        if (consumption != null) {
            sQLiteStatement.bindLong(25, consumption.intValue());
        }
    }
}
