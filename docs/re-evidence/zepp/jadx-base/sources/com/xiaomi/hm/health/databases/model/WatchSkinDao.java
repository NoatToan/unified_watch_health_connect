package com.xiaomi.hm.health.databases.model;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huami.watch.companion.ximalaya.XimalayaConst;
import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;
import org.greenrobot.greendao.internal.DaoConfig;

/* JADX INFO: loaded from: classes20.dex */
public class WatchSkinDao extends AbstractDao<WatchSkin, Void> {
    public static final String TABLENAME = "WATCH_SKIN";

    public static class Properties {
        public static final Property Customizable;
        public static final Property Description;
        public static final Property DownloadUrl;
        public static final Property Downloadable;
        public static final Property Id;
        public static final Property Image;
        public static final Property IsFree;
        public static final Property Name;
        public static final Property Price;
        public static final Property Size;

        static {
            Class cls = Integer.TYPE;
            Id = new Property(0, cls, "id", false, "ID");
            Name = new Property(1, String.class, "name", false, "NAME");
            Description = new Property(2, String.class, "description", false, ShareConstants.DESCRIPTION);
            Class cls2 = Boolean.TYPE;
            IsFree = new Property(3, cls2, "isFree", false, "IS_FREE");
            Price = new Property(4, Float.TYPE, FirebaseAnalytics.Param.PRICE, false, "PRICE");
            Downloadable = new Property(5, cls2, "downloadable", false, "DOWNLOADABLE");
            Size = new Property(6, cls, "size", false, "SIZE");
            Customizable = new Property(7, cls2, "customizable", false, "CUSTOMIZABLE");
            Image = new Property(8, String.class, "image", false, ShareConstants.IMAGE_URL);
            DownloadUrl = new Property(9, String.class, XimalayaConst.DOWNLOAD_URL, false, "DOWNLOAD_URL");
        }
    }

    public WatchSkinDao(DaoConfig daoConfig) {
        super(daoConfig);
    }

    public static void createTable(Database database, boolean z) {
        database.execSQL("CREATE TABLE " + (z ? "IF NOT EXISTS " : "") + "\"WATCH_SKIN\" (\"ID\" INTEGER NOT NULL ,\"NAME\" TEXT,\"DESCRIPTION\" TEXT,\"IS_FREE\" INTEGER NOT NULL ,\"PRICE\" REAL NOT NULL ,\"DOWNLOADABLE\" INTEGER NOT NULL ,\"SIZE\" INTEGER NOT NULL ,\"CUSTOMIZABLE\" INTEGER NOT NULL ,\"IMAGE\" TEXT,\"DOWNLOAD_URL\" TEXT);");
    }

    public static void dropTable(Database database, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("DROP TABLE ");
        sb.append(z ? "IF EXISTS " : "");
        sb.append("\"WATCH_SKIN\"");
        database.execSQL(sb.toString());
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Void getKey(WatchSkin watchSkin) {
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public boolean hasKey(WatchSkin watchSkin) {
        return false;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final boolean isEntityUpdateable() {
        return true;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public Void readKey(Cursor cursor, int i) {
        return null;
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final Void updateKeyAfterInsert(WatchSkin watchSkin, long j) {
        return null;
    }

    public WatchSkinDao(DaoConfig daoConfig, DaoSession daoSession) {
        super(daoConfig, daoSession);
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(DatabaseStatement databaseStatement, WatchSkin watchSkin) {
        databaseStatement.clearBindings();
        databaseStatement.bindLong(1, watchSkin.getId());
        String name = watchSkin.getName();
        if (name != null) {
            databaseStatement.bindString(2, name);
        }
        String description = watchSkin.getDescription();
        if (description != null) {
            databaseStatement.bindString(3, description);
        }
        databaseStatement.bindLong(4, watchSkin.getIsFree() ? 1L : 0L);
        databaseStatement.bindDouble(5, watchSkin.getPrice());
        databaseStatement.bindLong(6, watchSkin.getDownloadable() ? 1L : 0L);
        databaseStatement.bindLong(7, watchSkin.getSize());
        databaseStatement.bindLong(8, watchSkin.getCustomizable() ? 1L : 0L);
        String image = watchSkin.getImage();
        if (image != null) {
            databaseStatement.bindString(9, image);
        }
        String downloadUrl = watchSkin.getDownloadUrl();
        if (downloadUrl != null) {
            databaseStatement.bindString(10, downloadUrl);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // org.greenrobot.greendao.AbstractDao
    public WatchSkin readEntity(Cursor cursor, int i) {
        int i2 = cursor.getInt(i + 0);
        int i3 = i + 1;
        String string = cursor.isNull(i3) ? null : cursor.getString(i3);
        int i4 = i + 2;
        String string2 = cursor.isNull(i4) ? null : cursor.getString(i4);
        boolean z = cursor.getShort(i + 3) != 0;
        float f = cursor.getFloat(i + 4);
        boolean z2 = cursor.getShort(i + 5) != 0;
        int i5 = cursor.getInt(i + 6);
        boolean z3 = cursor.getShort(i + 7) != 0;
        int i6 = i + 8;
        String string3 = cursor.isNull(i6) ? null : cursor.getString(i6);
        int i7 = i + 9;
        return new WatchSkin(i2, string, string2, z, f, z2, i5, z3, string3, cursor.isNull(i7) ? null : cursor.getString(i7));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public void readEntity(Cursor cursor, WatchSkin watchSkin, int i) {
        watchSkin.setId(cursor.getInt(i + 0));
        int i2 = i + 1;
        watchSkin.setName(cursor.isNull(i2) ? null : cursor.getString(i2));
        int i3 = i + 2;
        watchSkin.setDescription(cursor.isNull(i3) ? null : cursor.getString(i3));
        watchSkin.setIsFree(cursor.getShort(i + 3) != 0);
        watchSkin.setPrice(cursor.getFloat(i + 4));
        watchSkin.setDownloadable(cursor.getShort(i + 5) != 0);
        watchSkin.setSize(cursor.getInt(i + 6));
        watchSkin.setCustomizable(cursor.getShort(i + 7) != 0);
        int i4 = i + 8;
        watchSkin.setImage(cursor.isNull(i4) ? null : cursor.getString(i4));
        int i5 = i + 9;
        watchSkin.setDownloadUrl(cursor.isNull(i5) ? null : cursor.getString(i5));
    }

    @Override // org.greenrobot.greendao.AbstractDao
    public final void bindValues(SQLiteStatement sQLiteStatement, WatchSkin watchSkin) {
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindLong(1, watchSkin.getId());
        String name = watchSkin.getName();
        if (name != null) {
            sQLiteStatement.bindString(2, name);
        }
        String description = watchSkin.getDescription();
        if (description != null) {
            sQLiteStatement.bindString(3, description);
        }
        sQLiteStatement.bindLong(4, watchSkin.getIsFree() ? 1L : 0L);
        sQLiteStatement.bindDouble(5, watchSkin.getPrice());
        sQLiteStatement.bindLong(6, watchSkin.getDownloadable() ? 1L : 0L);
        sQLiteStatement.bindLong(7, watchSkin.getSize());
        sQLiteStatement.bindLong(8, watchSkin.getCustomizable() ? 1L : 0L);
        String image = watchSkin.getImage();
        if (image != null) {
            sQLiteStatement.bindString(9, image);
        }
        String downloadUrl = watchSkin.getDownloadUrl();
        if (downloadUrl != null) {
            sQLiteStatement.bindString(10, downloadUrl);
        }
    }
}
