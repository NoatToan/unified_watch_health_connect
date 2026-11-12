package com.huami.module.homepage.cards.sort.db;

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

/* JADX INFO: loaded from: classes11.dex */
public final class HomeCardDb_Impl extends HomeCardDb {
    private volatile CardSequenceDao a;
    private volatile CardExpandDao b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int version) {
            super(version);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("CREATE TABLE IF NOT EXISTS `card_sequence` (`cardName` TEXT NOT NULL, `showCard` INTEGER NOT NULL, PRIMARY KEY(`cardName`))");
            _db.execSQL("CREATE TABLE IF NOT EXISTS `card_expand` (`cardName` TEXT NOT NULL, `showExpand` INTEGER NOT NULL, PRIMARY KEY(`cardName`))");
            _db.execSQL(RoomMasterTable.CREATE_QUERY);
            _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c07650dee15852e4e35155faa8230458')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase _db) {
            _db.execSQL("DROP TABLE IF EXISTS `card_sequence`");
            _db.execSQL("DROP TABLE IF EXISTS `card_expand`");
            if (HomeCardDb_Impl.this.mCallbacks != null) {
                int size = HomeCardDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) HomeCardDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase _db) {
            if (HomeCardDb_Impl.this.mCallbacks != null) {
                int size = HomeCardDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) HomeCardDb_Impl.this.mCallbacks.get(i)).onCreate(_db);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase _db) {
            HomeCardDb_Impl.this.mDatabase = _db;
            HomeCardDb_Impl.this.internalInitInvalidationTracker(_db);
            if (HomeCardDb_Impl.this.mCallbacks != null) {
                int size = HomeCardDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) HomeCardDb_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
            HashMap map = new HashMap(2);
            map.put("cardName", new TableInfo.Column("cardName", "TEXT", true, 1, null, 1));
            map.put("showCard", new TableInfo.Column("showCard", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo = new TableInfo("card_sequence", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(_db, "card_sequence");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "card_sequence(com.huami.module.homepage.cards.sort.db.CardSequence).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(2);
            map2.put("cardName", new TableInfo.Column("cardName", "TEXT", true, 1, null, 1));
            map2.put("showExpand", new TableInfo.Column("showExpand", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("card_expand", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(_db, "card_expand");
            if (tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "card_expand(com.huami.module.homepage.cards.sort.db.CardExpand).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
        }
    }

    @Override // com.huami.module.homepage.cards.sort.db.HomeCardDb
    public CardExpandDao cardExpandDao() {
        CardExpandDao cardExpandDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new CardExpandDao_Impl(this);
            }
            cardExpandDao = this.b;
        }
        return cardExpandDao;
    }

    @Override // com.huami.module.homepage.cards.sort.db.HomeCardDb
    public CardSequenceDao cardSequenceDao() {
        CardSequenceDao cardSequenceDao;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new CardSequenceDao_Impl(this);
            }
            cardSequenceDao = this.a;
        }
        return cardSequenceDao;
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `card_sequence`");
            writableDatabase.execSQL("DELETE FROM `card_expand`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "card_sequence", "card_expand");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new a(1), "c07650dee15852e4e35155faa8230458", "64a4010523513f92b30c24044218ba6f")).build());
    }
}
