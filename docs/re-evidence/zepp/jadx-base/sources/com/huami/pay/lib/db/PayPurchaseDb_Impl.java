package com.huami.pay.lib.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes12.dex */
public final class PayPurchaseDb_Impl extends PayPurchaseDb {
    private volatile PayPurchaseDao a;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `pay_notification` (`userId` TEXT NOT NULL, `orderId` TEXT NOT NULL, `purchaseToken` TEXT NOT NULL, `skus` TEXT NOT NULL, PRIMARY KEY(`purchaseToken`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5179abcc2c950f76a706dd6158aa622c')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `pay_notification`");
            if (PayPurchaseDb_Impl.this.mCallbacks != null) {
                int size = PayPurchaseDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PayPurchaseDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (PayPurchaseDb_Impl.this.mCallbacks != null) {
                int size = PayPurchaseDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PayPurchaseDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            PayPurchaseDb_Impl.this.mDatabase = _db;
            PayPurchaseDb_Impl.this.internalInitInvalidationTracker(_db);
            if (PayPurchaseDb_Impl.this.mCallbacks != null) {
                int size = PayPurchaseDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) PayPurchaseDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase _db) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase _db) {
            DBUtil.dropFtsSyncTriggers(_db);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
            HashMap map = new HashMap(4);
            map.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map.put("orderId", new TableInfo.Column("orderId", "TEXT", true, 0, null, 1));
            map.put("purchaseToken", new TableInfo.Column("purchaseToken", "TEXT", true, 1, null, 1));
            map.put("skus", new TableInfo.Column("skus", "TEXT", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("pay_notification", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "pay_notification");
            if (tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "pay_notification(com.huami.pay.lib.db.PayPurchase).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `pay_notification`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "pay_notification");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(1), "5179abcc2c950f76a706dd6158aa622c", "671b5fa16d8e32a8f2880cf038b5ac47")).build());
    }

    @Override // com.huami.pay.lib.db.PayPurchaseDb
    public PayPurchaseDao payPurchaseDao() {
        PayPurchaseDao payPurchaseDao;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new PayPurchaseDao_Impl(this);
            }
            payPurchaseDao = this.a;
        }
        return payPurchaseDao;
    }
}
