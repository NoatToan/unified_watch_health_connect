package com.huami.message.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.huami.message.api.WebConst;
import com.huami.message.db.dao.MessageDao;
import com.huami.message.db.dao.MessageDao_Impl;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import com.xiaomi.hm.health.relation.cloud.WebAPI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes11.dex */
public final class MessageDb_Impl extends MessageDb {
    private volatile MessageDao b;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `PrivateMessagePo` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `messageId` INTEGER NOT NULL, `userId` TEXT, `avatar` TEXT, `nickName` TEXT, `count` INTEGER, `messageStatus` TEXT, `content` TEXT, `generateTime` INTEGER, `nextIndex` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_PrivateMessagePo_messageId` ON `PrivateMessagePo` (`messageId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `MessageCount` (`noticeType` TEXT NOT NULL, `mainType` TEXT NOT NULL, `subType` TEXT NOT NULL, `count` INTEGER NOT NULL, `status` TEXT NOT NULL, PRIMARY KEY(`noticeType`, `mainType`, `subType`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SubMessagePo` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `messageId` INTEGER NOT NULL, `count` INTEGER, `dataType` TEXT, `day` TEXT, `description` TEXT, `followeeId` TEXT, `from` TEXT, `fromFirstCommentId` TEXT, `fromPostId` TEXT, `fromSecondCommentId` TEXT, `fromTopicId` TEXT, `generateTime` INTEGER, `generatedTime` INTEGER, `hrvType` TEXT, `iconUrl` TEXT, `memberId` TEXT, `messageSubType` TEXT, `nickName` TEXT, `noticeType` TEXT, `status` TEXT, `subType` TEXT, `text` TEXT, `subText` TEXT, `title` TEXT, `type` TEXT, `resource` TEXT, `resourceType` TEXT, `followStatus` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_SubMessagePo_messageId` ON `SubMessagePo` (`messageId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `NotificationPo` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `messageId` INTEGER NOT NULL, `generateTime` INTEGER, `iconUrl` TEXT, `groupExType` TEXT, `status` TEXT, `text` TEXT, `title` TEXT, `subTypeName` TEXT, `typeName` TEXT, `jumpType` TEXT, `url` TEXT, `pushUrl` TEXT, `noticeType` TEXT, `subType` TEXT)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_NotificationPo_messageId` ON `NotificationPo` (`messageId`)");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5f9f41c01cee9342f5a51dee81b88dbe')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `PrivateMessagePo`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `MessageCount`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SubMessagePo`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `NotificationPo`");
            if (MessageDb_Impl.this.mCallbacks != null) {
                int size = MessageDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) MessageDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (MessageDb_Impl.this.mCallbacks != null) {
                int size = MessageDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) MessageDb_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            MessageDb_Impl.this.mDatabase = supportSQLiteDatabase;
            MessageDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (MessageDb_Impl.this.mCallbacks != null) {
                int size = MessageDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) MessageDb_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            DBUtil.dropFtsSyncTriggers(supportSQLiteDatabase);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap map = new HashMap(10);
            map.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map.put(WebConst.QueryParam.MESSAGE_ID, new TableInfo.Column(WebConst.QueryParam.MESSAGE_ID, "INTEGER", true, 0, null, 1));
            map.put("userId", new TableInfo.Column("userId", "TEXT", false, 0, null, 1));
            map.put(WebAPI.PARAM_SHARE_INVITE_AVATAR, new TableInfo.Column(WebAPI.PARAM_SHARE_INVITE_AVATAR, "TEXT", false, 0, null, 1));
            map.put("nickName", new TableInfo.Column("nickName", "TEXT", false, 0, null, 1));
            map.put("count", new TableInfo.Column("count", "INTEGER", false, 0, null, 1));
            map.put("messageStatus", new TableInfo.Column("messageStatus", "TEXT", false, 0, null, 1));
            map.put("content", new TableInfo.Column("content", "TEXT", false, 0, null, 1));
            map.put("generateTime", new TableInfo.Column("generateTime", "INTEGER", false, 0, null, 1));
            map.put("nextIndex", new TableInfo.Column("nextIndex", "TEXT", false, 0, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_PrivateMessagePo_messageId", true, Arrays.asList(WebConst.QueryParam.MESSAGE_ID)));
            TableInfo tableInfo = new TableInfo("PrivateMessagePo", map, hashSet, hashSet2);
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "PrivateMessagePo");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "PrivateMessagePo(com.huami.message.db.po.PrivateMessagePo).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(5);
            map2.put(WebConst.QueryParam.NOTICE_TYPE, new TableInfo.Column(WebConst.QueryParam.NOTICE_TYPE, "TEXT", true, 1, null, 1));
            map2.put("mainType", new TableInfo.Column("mainType", "TEXT", true, 2, null, 1));
            map2.put("subType", new TableInfo.Column("subType", "TEXT", true, 3, null, 1));
            map2.put("count", new TableInfo.Column("count", "INTEGER", true, 0, null, 1));
            map2.put("status", new TableInfo.Column("status", "TEXT", true, 0, null, 1));
            TableInfo tableInfo3 = new TableInfo("MessageCount", map2, new HashSet(0), new HashSet(0));
            TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "MessageCount");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "MessageCount(com.huami.message.db.po.MessageCount).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(29);
            map3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map3.put(WebConst.QueryParam.MESSAGE_ID, new TableInfo.Column(WebConst.QueryParam.MESSAGE_ID, "INTEGER", true, 0, null, 1));
            map3.put("count", new TableInfo.Column("count", "INTEGER", false, 0, null, 1));
            map3.put("dataType", new TableInfo.Column("dataType", "TEXT", false, 0, null, 1));
            map3.put("day", new TableInfo.Column("day", "TEXT", false, 0, null, 1));
            map3.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, 1));
            map3.put("followeeId", new TableInfo.Column("followeeId", "TEXT", false, 0, null, 1));
            map3.put("from", new TableInfo.Column("from", "TEXT", false, 0, null, 1));
            map3.put("fromFirstCommentId", new TableInfo.Column("fromFirstCommentId", "TEXT", false, 0, null, 1));
            map3.put("fromPostId", new TableInfo.Column("fromPostId", "TEXT", false, 0, null, 1));
            map3.put("fromSecondCommentId", new TableInfo.Column("fromSecondCommentId", "TEXT", false, 0, null, 1));
            map3.put("fromTopicId", new TableInfo.Column("fromTopicId", "TEXT", false, 0, null, 1));
            map3.put("generateTime", new TableInfo.Column("generateTime", "INTEGER", false, 0, null, 1));
            map3.put("generatedTime", new TableInfo.Column("generatedTime", "INTEGER", false, 0, null, 1));
            map3.put("hrvType", new TableInfo.Column("hrvType", "TEXT", false, 0, null, 1));
            map3.put("iconUrl", new TableInfo.Column("iconUrl", "TEXT", false, 0, null, 1));
            map3.put(ParamKey.memberId, new TableInfo.Column(ParamKey.memberId, "TEXT", false, 0, null, 1));
            map3.put(WebConst.QueryParam.MESSAGE_SUB_TYPE, new TableInfo.Column(WebConst.QueryParam.MESSAGE_SUB_TYPE, "TEXT", false, 0, null, 1));
            map3.put("nickName", new TableInfo.Column("nickName", "TEXT", false, 0, null, 1));
            map3.put(WebConst.QueryParam.NOTICE_TYPE, new TableInfo.Column(WebConst.QueryParam.NOTICE_TYPE, "TEXT", false, 0, null, 1));
            map3.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, 1));
            map3.put("subType", new TableInfo.Column("subType", "TEXT", false, 0, null, 1));
            map3.put("text", new TableInfo.Column("text", "TEXT", false, 0, null, 1));
            map3.put("subText", new TableInfo.Column("subText", "TEXT", false, 0, null, 1));
            map3.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
            map3.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, 1));
            map3.put("resource", new TableInfo.Column("resource", "TEXT", false, 0, null, 1));
            map3.put("resourceType", new TableInfo.Column("resourceType", "TEXT", false, 0, null, 1));
            map3.put("followStatus", new TableInfo.Column("followStatus", "TEXT", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.Index("index_SubMessagePo_messageId", true, Arrays.asList(WebConst.QueryParam.MESSAGE_ID)));
            TableInfo tableInfo5 = new TableInfo("SubMessagePo", map3, hashSet3, hashSet4);
            TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, "SubMessagePo");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(false, "SubMessagePo(com.huami.message.db.po.SubMessagePo).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(15);
            map4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map4.put(WebConst.QueryParam.MESSAGE_ID, new TableInfo.Column(WebConst.QueryParam.MESSAGE_ID, "INTEGER", true, 0, null, 1));
            map4.put("generateTime", new TableInfo.Column("generateTime", "INTEGER", false, 0, null, 1));
            map4.put("iconUrl", new TableInfo.Column("iconUrl", "TEXT", false, 0, null, 1));
            map4.put("groupExType", new TableInfo.Column("groupExType", "TEXT", false, 0, null, 1));
            map4.put("status", new TableInfo.Column("status", "TEXT", false, 0, null, 1));
            map4.put("text", new TableInfo.Column("text", "TEXT", false, 0, null, 1));
            map4.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
            map4.put("subTypeName", new TableInfo.Column("subTypeName", "TEXT", false, 0, null, 1));
            map4.put("typeName", new TableInfo.Column("typeName", "TEXT", false, 0, null, 1));
            map4.put("jumpType", new TableInfo.Column("jumpType", "TEXT", false, 0, null, 1));
            map4.put("url", new TableInfo.Column("url", "TEXT", false, 0, null, 1));
            map4.put("pushUrl", new TableInfo.Column("pushUrl", "TEXT", false, 0, null, 1));
            map4.put(WebConst.QueryParam.NOTICE_TYPE, new TableInfo.Column(WebConst.QueryParam.NOTICE_TYPE, "TEXT", false, 0, null, 1));
            map4.put("subType", new TableInfo.Column("subType", "TEXT", false, 0, null, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new TableInfo.Index("index_NotificationPo_messageId", true, Arrays.asList(WebConst.QueryParam.MESSAGE_ID)));
            TableInfo tableInfo7 = new TableInfo("NotificationPo", map4, hashSet5, hashSet6);
            TableInfo tableInfo8 = TableInfo.read(supportSQLiteDatabase, "NotificationPo");
            if (tableInfo7.equals(tableInfo8)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "NotificationPo(com.huami.message.db.po.NotificationPo).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `PrivateMessagePo`");
            writableDatabase.execSQL("DELETE FROM `MessageCount`");
            writableDatabase.execSQL("DELETE FROM `SubMessagePo`");
            writableDatabase.execSQL("DELETE FROM `NotificationPo`");
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
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "PrivateMessagePo", "MessageCount", "SubMessagePo", "NotificationPo");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(5), "5f9f41c01cee9342f5a51dee81b88dbe", "e2819b229ac8d12bb718a99792db882b")).build());
    }

    @Override // com.huami.message.db.MessageDb
    public MessageDao messageDao() {
        MessageDao messageDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new MessageDao_Impl(this);
            }
            messageDao = this.b;
        }
        return messageDao;
    }
}
