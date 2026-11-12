package com.garmin.android.gncs.persistence;

import android.content.Context;
import androidx.room.b0;
import androidx.room.k0;
import androidx.room.m;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.NotificationConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import md.n;
import vb.h;
import vd.c;
import vd.d;
import xd.a;

/* JADX INFO: loaded from: classes11.dex */
public final class GNCSNotificationDatabase_Impl extends GNCSNotificationDatabase {
    private volatile GNCSNotificationDAO _gNCSNotificationDAO;

    @Override // androidx.room.b0
    public void clearAllTables() {
        super.assertNotMainThread();
        c writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.k3("DELETE FROM `notification_info`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.X3("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.D()) {
                writableDatabase.k3("VACUUM");
            }
        }
    }

    @Override // androidx.room.b0
    public m createInvalidationTracker() {
        return new m(this, new HashMap(0), new HashMap(0), GNCSNotificationInfo.TABLE_NAME);
    }

    @Override // androidx.room.b0
    public d createOpenHelper(androidx.room.c cVar) {
        k0 k0Var = new k0(cVar, new k0.b(16) { // from class: com.garmin.android.gncs.persistence.GNCSNotificationDatabase_Impl.1
            @Override // androidx.room.k0.b
            public void createAllTables(c cVar2) {
                cVar2.k3("CREATE TABLE IF NOT EXISTS `notification_info` (`status` TEXT, `statusTimestamp` INTEGER NOT NULL, `title` TEXT, `subTitle` TEXT, `message` TEXT, `positiveAction` TEXT, `negativeAction` TEXT, `phoneNumber` TEXT, `cacheKey` TEXT NOT NULL, `cacheId` INTEGER NOT NULL, `notificationKey` TEXT, `packageName` TEXT, `groupKey` TEXT, `type` TEXT, `postTime` INTEGER NOT NULL, `when` INTEGER NOT NULL, `positiveActionIndex` INTEGER NOT NULL, `negativeActionIndex` INTEGER NOT NULL, `notificationFlags` INTEGER NOT NULL, `eventFlags` INTEGER NOT NULL, `extraFlags` INTEGER NOT NULL, `category` TEXT, `priority` INTEGER NOT NULL, `numEvents` INTEGER NOT NULL, `isProgressUpdate` INTEGER NOT NULL, `hasLargeIcon` INTEGER NOT NULL, `conversationId` TEXT, `isSuppressed` INTEGER NOT NULL, `numRemoteViewImages` INTEGER NOT NULL, `actions` TEXT, `images` TEXT, `callType` INTEGER NOT NULL, PRIMARY KEY(`cacheKey`))");
                cVar2.k3("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                cVar2.k3("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1299b37636764988478ba8a3ef5e4185')");
            }

            @Override // androidx.room.k0.b
            public void dropAllTables(c cVar2) {
                cVar2.k3("DROP TABLE IF EXISTS `notification_info`");
                if (((b0) GNCSNotificationDatabase_Impl.this).mCallbacks != null) {
                    int size = ((b0) GNCSNotificationDatabase_Impl.this).mCallbacks.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((b0.b) ((b0) GNCSNotificationDatabase_Impl.this).mCallbacks.get(i14)).getClass();
                    }
                }
            }

            @Override // androidx.room.k0.b
            public void onCreate(c cVar2) {
                if (((b0) GNCSNotificationDatabase_Impl.this).mCallbacks != null) {
                    int size = ((b0) GNCSNotificationDatabase_Impl.this).mCallbacks.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((b0.b) ((b0) GNCSNotificationDatabase_Impl.this).mCallbacks.get(i14)).getClass();
                        cVar2.getClass();
                    }
                }
            }

            @Override // androidx.room.k0.b
            public void onOpen(c cVar2) {
                ((b0) GNCSNotificationDatabase_Impl.this).mDatabase = cVar2;
                GNCSNotificationDatabase_Impl.this.internalInitInvalidationTracker(cVar2);
                if (((b0) GNCSNotificationDatabase_Impl.this).mCallbacks != null) {
                    int size = ((b0) GNCSNotificationDatabase_Impl.this).mCallbacks.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        ((b0.b) ((b0) GNCSNotificationDatabase_Impl.this).mCallbacks.get(i14)).a(cVar2);
                    }
                }
            }

            @Override // androidx.room.k0.b
            public void onPostMigrate(c cVar2) {
            }

            @Override // androidx.room.k0.b
            public void onPreMigrate(c cVar2) {
                cVar2.getClass();
                gl1.d.s(new a(cVar2));
            }

            @Override // androidx.room.k0.b
            public k0.c onValidateSchema(c cVar2) {
                HashMap map = new HashMap(32);
                map.put("status", new n.a("status", "TEXT", false, 0, null, 1));
                map.put("statusTimestamp", new n.a("statusTimestamp", "INTEGER", true, 0, null, 1));
                map.put("title", new n.a("title", "TEXT", false, 0, null, 1));
                map.put("subTitle", new n.a("subTitle", "TEXT", false, 0, null, 1));
                map.put("message", new n.a("message", "TEXT", false, 0, null, 1));
                map.put("positiveAction", new n.a("positiveAction", "TEXT", false, 0, null, 1));
                map.put("negativeAction", new n.a("negativeAction", "TEXT", false, 0, null, 1));
                map.put("phoneNumber", new n.a("phoneNumber", "TEXT", false, 0, null, 1));
                map.put("cacheKey", new n.a("cacheKey", "TEXT", true, 1, null, 1));
                map.put("cacheId", new n.a("cacheId", "INTEGER", true, 0, null, 1));
                map.put("notificationKey", new n.a("notificationKey", "TEXT", false, 0, null, 1));
                map.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, new n.a(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "TEXT", false, 0, null, 1));
                map.put("groupKey", new n.a("groupKey", "TEXT", false, 0, null, 1));
                map.put(NotificationConstants.KEY_DATA_MIME_TYPE, new n.a(NotificationConstants.KEY_DATA_MIME_TYPE, "TEXT", false, 0, null, 1));
                map.put("postTime", new n.a("postTime", "INTEGER", true, 0, null, 1));
                map.put("when", new n.a("when", "INTEGER", true, 0, null, 1));
                map.put("positiveActionIndex", new n.a("positiveActionIndex", "INTEGER", true, 0, null, 1));
                map.put("negativeActionIndex", new n.a("negativeActionIndex", "INTEGER", true, 0, null, 1));
                map.put("notificationFlags", new n.a("notificationFlags", "INTEGER", true, 0, null, 1));
                map.put("eventFlags", new n.a("eventFlags", "INTEGER", true, 0, null, 1));
                map.put("extraFlags", new n.a("extraFlags", "INTEGER", true, 0, null, 1));
                map.put("category", new n.a("category", "TEXT", false, 0, null, 1));
                map.put("priority", new n.a("priority", "INTEGER", true, 0, null, 1));
                map.put("numEvents", new n.a("numEvents", "INTEGER", true, 0, null, 1));
                map.put("isProgressUpdate", new n.a("isProgressUpdate", "INTEGER", true, 0, null, 1));
                map.put("hasLargeIcon", new n.a("hasLargeIcon", "INTEGER", true, 0, null, 1));
                map.put("conversationId", new n.a("conversationId", "TEXT", false, 0, null, 1));
                map.put("isSuppressed", new n.a("isSuppressed", "INTEGER", true, 0, null, 1));
                map.put("numRemoteViewImages", new n.a("numRemoteViewImages", "INTEGER", true, 0, null, 1));
                map.put("actions", new n.a("actions", "TEXT", false, 0, null, 1));
                map.put("images", new n.a("images", "TEXT", false, 0, null, 1));
                map.put("callType", new n.a("callType", "INTEGER", true, 0, null, 1));
                n nVar = new n(GNCSNotificationInfo.TABLE_NAME, map, new HashSet(0), new HashSet(0));
                n nVarA = n.a(cVar2, GNCSNotificationInfo.TABLE_NAME);
                return !nVar.equals(nVarA) ? new k0.c(false, h.i("notification_info(com.garmin.android.gncs.GNCSNotificationInfo).\n Expected:\n", nVar, "\n Found:\n", nVarA)) : new k0.c(true, null);
            }
        }, "1299b37636764988478ba8a3ef5e4185", "92a497e1ae0c2c23c51752bd212faed9");
        Context context = cVar.f10770a;
        d.b.f177135f.getClass();
        d.b.a aVarA = d.b.C3315b.a(context);
        aVarA.f177142b = cVar.f10771b;
        aVarA.f177143c = k0Var;
        return cVar.f10772c.b(aVarA.a());
    }

    @Override // androidx.room.b0
    public List<kd.a> getAutoMigrations(Map<Class<Object>, Object> map) {
        return Arrays.asList(new kd.a[0]);
    }

    @Override // androidx.room.b0
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.b0
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(GNCSNotificationDAO.class, GNCSNotificationDAO_Impl.getRequiredConverters());
        return map;
    }

    @Override // com.garmin.android.gncs.persistence.GNCSNotificationDatabase
    public GNCSNotificationDAO notificationDAO() {
        GNCSNotificationDAO gNCSNotificationDAO;
        if (this._gNCSNotificationDAO != null) {
            return this._gNCSNotificationDAO;
        }
        synchronized (this) {
            try {
                if (this._gNCSNotificationDAO == null) {
                    this._gNCSNotificationDAO = new GNCSNotificationDAO_Impl(this);
                }
                gNCSNotificationDAO = this._gNCSNotificationDAO;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return gNCSNotificationDAO;
    }
}
