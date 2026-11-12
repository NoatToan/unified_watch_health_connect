package com.huami.training.db;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.ViewInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.huami.bloodpressure_core.p002const.BloodPressureConst;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.training.api.WebConst;
import com.huami.training.db.dao.EntranceDao;
import com.huami.training.db.dao.EntranceDao_Impl;
import com.huami.training.db.dao.FilterDao;
import com.huami.training.db.dao.FilterDao_Impl;
import com.huami.training.db.dao.ParticipationDao;
import com.huami.training.db.dao.ParticipationDao_Impl;
import com.huami.training.db.dao.PlanDao;
import com.huami.training.db.dao.PlanDao_Impl;
import com.huami.training.db.dao.PromotionDao;
import com.huami.training.db.dao.PromotionDao_Impl;
import com.huami.training.db.dao.SearchDao;
import com.huami.training.db.dao.SearchDao_Impl;
import com.huami.training.db.dao.TrainingDao;
import com.huami.training.db.dao.TrainingDao_Impl;
import com.huami.training.db.dao.UserCourseDao;
import com.huami.training.db.dao.UserCourseDao_Impl;
import com.xiaomi.hm.health.traininglib.util.TrainingAnalytics;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes15.dex */
public final class TrainingDb_Impl extends TrainingDb {
    private volatile TrainingDao a;
    private volatile PromotionDao b;
    private volatile ParticipationDao c;
    private volatile FilterDao d;
    private volatile SearchDao e;
    private volatile EntranceDao f;
    private volatile PlanDao g;
    private volatile UserCourseDao h;

    public class a extends RoomOpenHelper.Delegate {
        public a(int i) {
            super(i);
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Training` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `name` TEXT, `listImage` TEXT, `difficulty` INTEGER, `consumption` INTEGER, `participants` INTEGER, `contentCount` INTEGER, `label` TEXT, `squareImage` TEXT, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Promotion` (`promotePlace` INTEGER NOT NULL, `trainingId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Promotion_promotePlace_trainingId` ON `Promotion` (`promotePlace`, `trainingId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `FilterTraining` (`filterMode` TEXT NOT NULL, `filterOrder` TEXT NOT NULL, `trainingId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_FilterTraining_filterMode_filterOrder_trainingId` ON `FilterTraining` (`filterMode`, `filterOrder`, `trainingId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `SearchResult` (`query` TEXT NOT NULL, `mode` TEXT NOT NULL, `ids` TEXT NOT NULL, `next` INTEGER, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_SearchResult_query_mode` ON `SearchResult` (`query`, `mode`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Participation` (`trainingId` INTEGER NOT NULL, `trainTimes` INTEGER NOT NULL, `joinedTime` INTEGER, `lastTrainingTime` INTEGER, `updateTime` INTEGER, `expiry` INTEGER, `hasDownloaded` INTEGER, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Participation_trainingId` ON `Participation` (`trainingId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Tag` (`tagId` INTEGER NOT NULL, `name` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_Tag_tagId` ON `Tag` (`tagId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `TodayTraining` (`trainingId` INTEGER NOT NULL, `tagId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_TodayTraining_trainingId` ON `TodayTraining` (`trainingId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `LookAround` (`trainingId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_LookAround_trainingId` ON `LookAround` (`trainingId`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `FilterMode` (`text` TEXT NOT NULL, `jumpType` TEXT NOT NULL, `defaultOrder` TEXT, `supportOrders` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_FilterMode_jumpType` ON `FilterMode` (`jumpType`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `Subject` (`id` TEXT NOT NULL, `title` TEXT, `subtitle` TEXT, `imageUrl` TEXT, `targetUrl` TEXT, `targetMode` INTEGER, `displayMode` INTEGER, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `EntranceKing` (`iconUrl` TEXT NOT NULL, `name` TEXT NOT NULL, `jumpType` TEXT, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_EntranceKing_jumpType` ON `EntranceKing` (`jumpType`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `CardPlace` (`subjectPlace` INTEGER, `subjectId` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_CardPlace_subjectId_subjectPlace` ON `CardPlace` (`subjectId`, `subjectPlace`)");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `TrainingPlan` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `listImageUrl` TEXT, `detailImageUrl` TEXT, `consumption` INTEGER NOT NULL, `introduction` TEXT, `type` INTEGER NOT NULL, `difficulty` INTEGER NOT NULL, `duration` INTEGER NOT NULL, `trainingDays` INTEGER NOT NULL, `totalDays` INTEGER NOT NULL, `startDay` INTEGER NOT NULL, PRIMARY KEY(`id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `PlanTraining` (`planId` INTEGER NOT NULL, `trainingId` INTEGER NOT NULL, `name` TEXT, `dayOfWeek` INTEGER NOT NULL, `duration` INTEGER, `consumption` INTEGER, `isFinished` INTEGER NOT NULL, `dayIndex` INTEGER NOT NULL, `articleId` INTEGER, `articleTitle` TEXT, `articleDescription` TEXT, `articleLink` TEXT, `articleImageUrl` TEXT, PRIMARY KEY(`planId`, `trainingId`, `dayIndex`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `UserCourse` (`courseId` INTEGER NOT NULL, `userId` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL)");
            supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_UserCourse_courseId_userId` ON `UserCourse` (`courseId`, `userId`)");
            supportSQLiteDatabase.execSQL("CREATE VIEW `JoinedTraining` AS SELECT Training.id, name, type, trainTimes, contentCount, joinedTime, lastTrainingTime, updateTime, expiry, hasDownloaded, squareImage\n    FROM Training INNER JOIN Participation\n    ON Training.id = Participation.trainingId\n    ORDER BY updateTime DESC");
            supportSQLiteDatabase.execSQL(RoomMasterTable.CREATE_QUERY);
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '70bddc48f0f9ef03a4cbea7f732b9bcf')");
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Training`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Promotion`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `FilterTraining`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `SearchResult`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Participation`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Tag`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `TodayTraining`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `LookAround`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `FilterMode`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `Subject`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `EntranceKing`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `CardPlace`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `TrainingPlan`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `PlanTraining`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `UserCourse`");
            supportSQLiteDatabase.execSQL("DROP VIEW IF EXISTS `JoinedTraining`");
            if (TrainingDb_Impl.this.mCallbacks != null) {
                int size = TrainingDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) TrainingDb_Impl.this.mCallbacks.get(i)).onDestructiveMigration(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            if (TrainingDb_Impl.this.mCallbacks != null) {
                int size = TrainingDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) TrainingDb_Impl.this.mCallbacks.get(i)).onCreate(supportSQLiteDatabase);
                }
            }
        }

        @Override // androidx.room.RoomOpenHelper.Delegate
        public void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            TrainingDb_Impl.this.mDatabase = supportSQLiteDatabase;
            TrainingDb_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            if (TrainingDb_Impl.this.mCallbacks != null) {
                int size = TrainingDb_Impl.this.mCallbacks.size();
                for (int i = 0; i < size; i++) {
                    ((RoomDatabase.Callback) TrainingDb_Impl.this.mCallbacks.get(i)).onOpen(supportSQLiteDatabase);
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
            map.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, 1));
            map.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
            map.put("listImage", new TableInfo.Column("listImage", "TEXT", false, 0, null, 1));
            map.put("difficulty", new TableInfo.Column("difficulty", "INTEGER", false, 0, null, 1));
            map.put("consumption", new TableInfo.Column("consumption", "INTEGER", false, 0, null, 1));
            map.put("participants", new TableInfo.Column("participants", "INTEGER", false, 0, null, 1));
            map.put("contentCount", new TableInfo.Column("contentCount", "INTEGER", false, 0, null, 1));
            map.put("label", new TableInfo.Column("label", "TEXT", false, 0, null, 1));
            map.put("squareImage", new TableInfo.Column("squareImage", "TEXT", false, 0, null, 1));
            TableInfo tableInfo = new TableInfo("Training", map, new HashSet(0), new HashSet(0));
            TableInfo tableInfo2 = TableInfo.read(supportSQLiteDatabase, "Training");
            if (!tableInfo.equals(tableInfo2)) {
                return new RoomOpenHelper.ValidationResult(false, "Training(com.huami.training.db.po.Training).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
            }
            HashMap map2 = new HashMap(3);
            map2.put("promotePlace", new TableInfo.Column("promotePlace", "INTEGER", true, 0, null, 1));
            map2.put("trainingId", new TableInfo.Column("trainingId", "INTEGER", true, 0, null, 1));
            map2.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet = new HashSet(0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new TableInfo.Index("index_Promotion_promotePlace_trainingId", true, Arrays.asList("promotePlace", "trainingId")));
            TableInfo tableInfo3 = new TableInfo("Promotion", map2, hashSet, hashSet2);
            TableInfo tableInfo4 = TableInfo.read(supportSQLiteDatabase, "Promotion");
            if (!tableInfo3.equals(tableInfo4)) {
                return new RoomOpenHelper.ValidationResult(false, "Promotion(com.huami.training.db.po.Promotion).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
            }
            HashMap map3 = new HashMap(4);
            map3.put(WebConst.QueryParam.FILTER_MODE, new TableInfo.Column(WebConst.QueryParam.FILTER_MODE, "TEXT", true, 0, null, 1));
            map3.put("filterOrder", new TableInfo.Column("filterOrder", "TEXT", true, 0, null, 1));
            map3.put("trainingId", new TableInfo.Column("trainingId", "INTEGER", true, 0, null, 1));
            map3.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new TableInfo.Index("index_FilterTraining_filterMode_filterOrder_trainingId", true, Arrays.asList(WebConst.QueryParam.FILTER_MODE, "filterOrder", "trainingId")));
            TableInfo tableInfo5 = new TableInfo("FilterTraining", map3, hashSet3, hashSet4);
            TableInfo tableInfo6 = TableInfo.read(supportSQLiteDatabase, "FilterTraining");
            if (!tableInfo5.equals(tableInfo6)) {
                return new RoomOpenHelper.ValidationResult(false, "FilterTraining(com.huami.training.db.po.FilterTraining).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
            }
            HashMap map4 = new HashMap(5);
            map4.put("query", new TableInfo.Column("query", "TEXT", true, 0, null, 1));
            map4.put("mode", new TableInfo.Column("mode", "TEXT", true, 0, null, 1));
            map4.put("ids", new TableInfo.Column("ids", "TEXT", true, 0, null, 1));
            map4.put("next", new TableInfo.Column("next", "INTEGER", false, 0, null, 1));
            map4.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet5 = new HashSet(0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new TableInfo.Index("index_SearchResult_query_mode", true, Arrays.asList("query", "mode")));
            TableInfo tableInfo7 = new TableInfo("SearchResult", map4, hashSet5, hashSet6);
            TableInfo tableInfo8 = TableInfo.read(supportSQLiteDatabase, "SearchResult");
            if (!tableInfo7.equals(tableInfo8)) {
                return new RoomOpenHelper.ValidationResult(false, "SearchResult(com.huami.training.db.po.SearchResult).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
            }
            HashMap map5 = new HashMap(8);
            map5.put("trainingId", new TableInfo.Column("trainingId", "INTEGER", true, 0, null, 1));
            map5.put("trainTimes", new TableInfo.Column("trainTimes", "INTEGER", true, 0, null, 1));
            map5.put("joinedTime", new TableInfo.Column("joinedTime", "INTEGER", false, 0, null, 1));
            map5.put("lastTrainingTime", new TableInfo.Column("lastTrainingTime", "INTEGER", false, 0, null, 1));
            map5.put(EcgData.TIMESTAMP_SERVER_UPDATED, new TableInfo.Column(EcgData.TIMESTAMP_SERVER_UPDATED, "INTEGER", false, 0, null, 1));
            map5.put("expiry", new TableInfo.Column("expiry", "INTEGER", false, 0, null, 1));
            map5.put("hasDownloaded", new TableInfo.Column("hasDownloaded", "INTEGER", false, 0, null, 1));
            map5.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet7 = new HashSet(0);
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new TableInfo.Index("index_Participation_trainingId", true, Arrays.asList("trainingId")));
            TableInfo tableInfo9 = new TableInfo("Participation", map5, hashSet7, hashSet8);
            TableInfo tableInfo10 = TableInfo.read(supportSQLiteDatabase, "Participation");
            if (!tableInfo9.equals(tableInfo10)) {
                return new RoomOpenHelper.ValidationResult(false, "Participation(com.huami.training.db.po.Participation).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
            }
            HashMap map6 = new HashMap(3);
            map6.put("tagId", new TableInfo.Column("tagId", "INTEGER", true, 0, null, 1));
            map6.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map6.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet9 = new HashSet(0);
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new TableInfo.Index("index_Tag_tagId", true, Arrays.asList("tagId")));
            TableInfo tableInfo11 = new TableInfo("Tag", map6, hashSet9, hashSet10);
            TableInfo tableInfo12 = TableInfo.read(supportSQLiteDatabase, "Tag");
            if (!tableInfo11.equals(tableInfo12)) {
                return new RoomOpenHelper.ValidationResult(false, "Tag(com.huami.training.db.po.Tag).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
            }
            HashMap map7 = new HashMap(3);
            map7.put("trainingId", new TableInfo.Column("trainingId", "INTEGER", true, 0, null, 1));
            map7.put("tagId", new TableInfo.Column("tagId", "INTEGER", true, 0, null, 1));
            map7.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet11 = new HashSet(0);
            HashSet hashSet12 = new HashSet(1);
            hashSet12.add(new TableInfo.Index("index_TodayTraining_trainingId", true, Arrays.asList("trainingId")));
            TableInfo tableInfo13 = new TableInfo("TodayTraining", map7, hashSet11, hashSet12);
            TableInfo tableInfo14 = TableInfo.read(supportSQLiteDatabase, "TodayTraining");
            if (!tableInfo13.equals(tableInfo14)) {
                return new RoomOpenHelper.ValidationResult(false, "TodayTraining(com.huami.training.db.po.TodayTraining).\n Expected:\n" + tableInfo13 + "\n Found:\n" + tableInfo14);
            }
            HashMap map8 = new HashMap(2);
            map8.put("trainingId", new TableInfo.Column("trainingId", "INTEGER", true, 0, null, 1));
            map8.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet13 = new HashSet(0);
            HashSet hashSet14 = new HashSet(1);
            hashSet14.add(new TableInfo.Index("index_LookAround_trainingId", true, Arrays.asList("trainingId")));
            TableInfo tableInfo15 = new TableInfo("LookAround", map8, hashSet13, hashSet14);
            TableInfo tableInfo16 = TableInfo.read(supportSQLiteDatabase, "LookAround");
            if (!tableInfo15.equals(tableInfo16)) {
                return new RoomOpenHelper.ValidationResult(false, "LookAround(com.huami.training.db.po.LookAround).\n Expected:\n" + tableInfo15 + "\n Found:\n" + tableInfo16);
            }
            HashMap map9 = new HashMap(5);
            map9.put("text", new TableInfo.Column("text", "TEXT", true, 0, null, 1));
            map9.put("jumpType", new TableInfo.Column("jumpType", "TEXT", true, 0, null, 1));
            map9.put("defaultOrder", new TableInfo.Column("defaultOrder", "TEXT", false, 0, null, 1));
            map9.put("supportOrders", new TableInfo.Column("supportOrders", "TEXT", false, 0, null, 1));
            map9.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet15 = new HashSet(0);
            HashSet hashSet16 = new HashSet(1);
            hashSet16.add(new TableInfo.Index("index_FilterMode_jumpType", true, Arrays.asList("jumpType")));
            TableInfo tableInfo17 = new TableInfo("FilterMode", map9, hashSet15, hashSet16);
            TableInfo tableInfo18 = TableInfo.read(supportSQLiteDatabase, "FilterMode");
            if (!tableInfo17.equals(tableInfo18)) {
                return new RoomOpenHelper.ValidationResult(false, "FilterMode(com.huami.training.db.po.FilterMode).\n Expected:\n" + tableInfo17 + "\n Found:\n" + tableInfo18);
            }
            HashMap map10 = new HashMap(7);
            map10.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, 1));
            map10.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
            map10.put(MessengerShareContentUtility.SUBTITLE, new TableInfo.Column(MessengerShareContentUtility.SUBTITLE, "TEXT", false, 0, null, 1));
            map10.put("imageUrl", new TableInfo.Column("imageUrl", "TEXT", false, 0, null, 1));
            map10.put("targetUrl", new TableInfo.Column("targetUrl", "TEXT", false, 0, null, 1));
            map10.put("targetMode", new TableInfo.Column("targetMode", "INTEGER", false, 0, null, 1));
            map10.put("displayMode", new TableInfo.Column("displayMode", "INTEGER", false, 0, null, 1));
            TableInfo tableInfo19 = new TableInfo("Subject", map10, new HashSet(0), new HashSet(0));
            TableInfo tableInfo20 = TableInfo.read(supportSQLiteDatabase, "Subject");
            if (!tableInfo19.equals(tableInfo20)) {
                return new RoomOpenHelper.ValidationResult(false, "Subject(com.huami.training.db.po.Subject).\n Expected:\n" + tableInfo19 + "\n Found:\n" + tableInfo20);
            }
            HashMap map11 = new HashMap(4);
            map11.put("iconUrl", new TableInfo.Column("iconUrl", "TEXT", true, 0, null, 1));
            map11.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map11.put("jumpType", new TableInfo.Column("jumpType", "TEXT", false, 0, null, 1));
            map11.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet17 = new HashSet(0);
            HashSet hashSet18 = new HashSet(1);
            hashSet18.add(new TableInfo.Index("index_EntranceKing_jumpType", true, Arrays.asList("jumpType")));
            TableInfo tableInfo21 = new TableInfo("EntranceKing", map11, hashSet17, hashSet18);
            TableInfo tableInfo22 = TableInfo.read(supportSQLiteDatabase, "EntranceKing");
            if (!tableInfo21.equals(tableInfo22)) {
                return new RoomOpenHelper.ValidationResult(false, "EntranceKing(com.huami.training.db.po.EntranceKing).\n Expected:\n" + tableInfo21 + "\n Found:\n" + tableInfo22);
            }
            HashMap map12 = new HashMap(3);
            map12.put("subjectPlace", new TableInfo.Column("subjectPlace", "INTEGER", false, 0, null, 1));
            map12.put("subjectId", new TableInfo.Column("subjectId", "TEXT", true, 0, null, 1));
            map12.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet19 = new HashSet(0);
            HashSet hashSet20 = new HashSet(1);
            hashSet20.add(new TableInfo.Index("index_CardPlace_subjectId_subjectPlace", true, Arrays.asList("subjectId", "subjectPlace")));
            TableInfo tableInfo23 = new TableInfo("CardPlace", map12, hashSet19, hashSet20);
            TableInfo tableInfo24 = TableInfo.read(supportSQLiteDatabase, "CardPlace");
            if (!tableInfo23.equals(tableInfo24)) {
                return new RoomOpenHelper.ValidationResult(false, "CardPlace(com.huami.training.db.po.CardPlace).\n Expected:\n" + tableInfo23 + "\n Found:\n" + tableInfo24);
            }
            HashMap map13 = new HashMap(12);
            map13.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            map13.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
            map13.put("listImageUrl", new TableInfo.Column("listImageUrl", "TEXT", false, 0, null, 1));
            map13.put("detailImageUrl", new TableInfo.Column("detailImageUrl", "TEXT", false, 0, null, 1));
            map13.put("consumption", new TableInfo.Column("consumption", "INTEGER", true, 0, null, 1));
            map13.put("introduction", new TableInfo.Column("introduction", "TEXT", false, 0, null, 1));
            map13.put("type", new TableInfo.Column("type", "INTEGER", true, 0, null, 1));
            map13.put("difficulty", new TableInfo.Column("difficulty", "INTEGER", true, 0, null, 1));
            map13.put("duration", new TableInfo.Column("duration", "INTEGER", true, 0, null, 1));
            map13.put("trainingDays", new TableInfo.Column("trainingDays", "INTEGER", true, 0, null, 1));
            map13.put("totalDays", new TableInfo.Column("totalDays", "INTEGER", true, 0, null, 1));
            map13.put("startDay", new TableInfo.Column("startDay", "INTEGER", true, 0, null, 1));
            TableInfo tableInfo25 = new TableInfo("TrainingPlan", map13, new HashSet(0), new HashSet(0));
            TableInfo tableInfo26 = TableInfo.read(supportSQLiteDatabase, "TrainingPlan");
            if (!tableInfo25.equals(tableInfo26)) {
                return new RoomOpenHelper.ValidationResult(false, "TrainingPlan(com.huami.training.db.po.TrainingPlan).\n Expected:\n" + tableInfo25 + "\n Found:\n" + tableInfo26);
            }
            HashMap map14 = new HashMap(13);
            map14.put(BloodPressureConst.ParamKey.PLANID, new TableInfo.Column(BloodPressureConst.ParamKey.PLANID, "INTEGER", true, 1, null, 1));
            map14.put("trainingId", new TableInfo.Column("trainingId", "INTEGER", true, 2, null, 1));
            map14.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, 1));
            map14.put("dayOfWeek", new TableInfo.Column("dayOfWeek", "INTEGER", true, 0, null, 1));
            map14.put("duration", new TableInfo.Column("duration", "INTEGER", false, 0, null, 1));
            map14.put("consumption", new TableInfo.Column("consumption", "INTEGER", false, 0, null, 1));
            map14.put("isFinished", new TableInfo.Column("isFinished", "INTEGER", true, 0, null, 1));
            map14.put("dayIndex", new TableInfo.Column("dayIndex", "INTEGER", true, 3, null, 1));
            map14.put("articleId", new TableInfo.Column("articleId", "INTEGER", false, 0, null, 1));
            map14.put("articleTitle", new TableInfo.Column("articleTitle", "TEXT", false, 0, null, 1));
            map14.put("articleDescription", new TableInfo.Column("articleDescription", "TEXT", false, 0, null, 1));
            map14.put("articleLink", new TableInfo.Column("articleLink", "TEXT", false, 0, null, 1));
            map14.put("articleImageUrl", new TableInfo.Column("articleImageUrl", "TEXT", false, 0, null, 1));
            TableInfo tableInfo27 = new TableInfo("PlanTraining", map14, new HashSet(0), new HashSet(0));
            TableInfo tableInfo28 = TableInfo.read(supportSQLiteDatabase, "PlanTraining");
            if (!tableInfo27.equals(tableInfo28)) {
                return new RoomOpenHelper.ValidationResult(false, "PlanTraining(com.huami.training.db.po.PlanTraining).\n Expected:\n" + tableInfo27 + "\n Found:\n" + tableInfo28);
            }
            HashMap map15 = new HashMap(3);
            map15.put("courseId", new TableInfo.Column("courseId", "INTEGER", true, 0, null, 1));
            map15.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
            map15.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, 1));
            HashSet hashSet21 = new HashSet(0);
            HashSet hashSet22 = new HashSet(1);
            hashSet22.add(new TableInfo.Index("index_UserCourse_courseId_userId", true, Arrays.asList("courseId", "userId")));
            TableInfo tableInfo29 = new TableInfo("UserCourse", map15, hashSet21, hashSet22);
            TableInfo tableInfo30 = TableInfo.read(supportSQLiteDatabase, "UserCourse");
            if (!tableInfo29.equals(tableInfo30)) {
                return new RoomOpenHelper.ValidationResult(false, "UserCourse(com.huami.training.db.po.UserCourse).\n Expected:\n" + tableInfo29 + "\n Found:\n" + tableInfo30);
            }
            ViewInfo viewInfo = new ViewInfo(TrainingAnalytics.ParamValue.SeeTrainingSource.JOINED_TRAINING, "CREATE VIEW `JoinedTraining` AS SELECT Training.id, name, type, trainTimes, contentCount, joinedTime, lastTrainingTime, updateTime, expiry, hasDownloaded, squareImage\n    FROM Training INNER JOIN Participation\n    ON Training.id = Participation.trainingId\n    ORDER BY updateTime DESC");
            ViewInfo viewInfo2 = ViewInfo.read(supportSQLiteDatabase, TrainingAnalytics.ParamValue.SeeTrainingSource.JOINED_TRAINING);
            if (viewInfo.equals(viewInfo2)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "JoinedTraining(com.huami.training.db.po.JoinedTraining).\n Expected:\n" + viewInfo + "\n Found:\n" + viewInfo2);
        }
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `Training`");
            writableDatabase.execSQL("DELETE FROM `Promotion`");
            writableDatabase.execSQL("DELETE FROM `FilterTraining`");
            writableDatabase.execSQL("DELETE FROM `SearchResult`");
            writableDatabase.execSQL("DELETE FROM `Participation`");
            writableDatabase.execSQL("DELETE FROM `Tag`");
            writableDatabase.execSQL("DELETE FROM `TodayTraining`");
            writableDatabase.execSQL("DELETE FROM `LookAround`");
            writableDatabase.execSQL("DELETE FROM `FilterMode`");
            writableDatabase.execSQL("DELETE FROM `Subject`");
            writableDatabase.execSQL("DELETE FROM `EntranceKing`");
            writableDatabase.execSQL("DELETE FROM `CardPlace`");
            writableDatabase.execSQL("DELETE FROM `TrainingPlan`");
            writableDatabase.execSQL("DELETE FROM `PlanTraining`");
            writableDatabase.execSQL("DELETE FROM `UserCourse`");
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
        HashMap map = new HashMap(0);
        HashMap map2 = new HashMap(1);
        HashSet hashSet = new HashSet(2);
        hashSet.add("Training");
        hashSet.add("Participation");
        map2.put("joinedtraining", hashSet);
        return new InvalidationTracker(this, map, map2, "Training", "Promotion", "FilterTraining", "SearchResult", "Participation", "Tag", "TodayTraining", "LookAround", "FilterMode", "Subject", "EntranceKing", "CardPlace", "TrainingPlan", "PlanTraining", "UserCourse");
    }

    @Override // androidx.room.RoomDatabase
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return databaseConfiguration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(databaseConfiguration.context).name(databaseConfiguration.name).callback(new RoomOpenHelper(databaseConfiguration, new a(5), "70bddc48f0f9ef03a4cbea7f732b9bcf", "4e89cdcf2aef381418b27f3aa07a32f1")).build());
    }

    @Override // com.huami.training.db.TrainingDb
    public EntranceDao entranceDao() {
        EntranceDao entranceDao;
        if (this.f != null) {
            return this.f;
        }
        synchronized (this) {
            if (this.f == null) {
                this.f = new EntranceDao_Impl(this);
            }
            entranceDao = this.f;
        }
        return entranceDao;
    }

    @Override // com.huami.training.db.TrainingDb
    public FilterDao filterDao() {
        FilterDao filterDao;
        if (this.d != null) {
            return this.d;
        }
        synchronized (this) {
            if (this.d == null) {
                this.d = new FilterDao_Impl(this);
            }
            filterDao = this.d;
        }
        return filterDao;
    }

    @Override // com.huami.training.db.TrainingDb
    public SearchDao getSearchDao() {
        SearchDao searchDao;
        if (this.e != null) {
            return this.e;
        }
        synchronized (this) {
            if (this.e == null) {
                this.e = new SearchDao_Impl(this);
            }
            searchDao = this.e;
        }
        return searchDao;
    }

    @Override // com.huami.training.db.TrainingDb
    public ParticipationDao participationDao() {
        ParticipationDao participationDao;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            if (this.c == null) {
                this.c = new ParticipationDao_Impl(this);
            }
            participationDao = this.c;
        }
        return participationDao;
    }

    @Override // com.huami.training.db.TrainingDb
    public PlanDao planDao() {
        PlanDao planDao;
        if (this.g != null) {
            return this.g;
        }
        synchronized (this) {
            if (this.g == null) {
                this.g = new PlanDao_Impl(this);
            }
            planDao = this.g;
        }
        return planDao;
    }

    @Override // com.huami.training.db.TrainingDb
    public PromotionDao promotionDao() {
        PromotionDao promotionDao;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            if (this.b == null) {
                this.b = new PromotionDao_Impl(this);
            }
            promotionDao = this.b;
        }
        return promotionDao;
    }

    @Override // com.huami.training.db.TrainingDb
    public TrainingDao trainingDao() {
        TrainingDao trainingDao;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            if (this.a == null) {
                this.a = new TrainingDao_Impl(this);
            }
            trainingDao = this.a;
        }
        return trainingDao;
    }

    @Override // com.huami.training.db.TrainingDb
    public UserCourseDao userCourseDao() {
        UserCourseDao userCourseDao;
        if (this.h != null) {
            return this.h;
        }
        synchronized (this) {
            if (this.h == null) {
                this.h = new UserCourseDao_Impl(this);
            }
            userCourseDao = this.h;
        }
        return userCourseDao;
    }
}
