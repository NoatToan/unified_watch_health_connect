package qd2;

import am.j;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p1.z;

/* JADX INFO: loaded from: classes11.dex */
public class b extends SQLiteOpenHelper implements DatabaseErrorHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f144505a = LoggerFactory.getLogger("GCMSQLiteOpenHelper");

    public b(Context context) {
        super(context, "gcm_cache.db", (SQLiteDatabase.CursorFactory) null, 69);
    }

    @Override // android.database.DatabaseErrorHandler
    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        f144505a.error("onCorruption");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        Logger logger = f144505a;
        logger.debug("onCreate: **** BEGIN");
        sQLiteDatabase.beginTransaction();
        try {
            sQLiteDatabase.execSQL("create table if not exists json (_id integer primary key autoincrement, saved_timestamp integer, concept_name text not null, cached_val text not null);");
            sQLiteDatabase.execSQL("create table if not exists json_steps (_id integer primary key autoincrement, saved_timestamp integer, start_date text not null, data_type text not null, cached_val text not null);");
            sQLiteDatabase.execSQL("create table if not exists json_myfitnesspal_calories (_id integer primary key autoincrement, saved_timestamp integer, start_date text not null, data_type text not null, cached_val text not null);");
            sQLiteDatabase.execSQL("create table if not exists json_activities (_id integer primary key autoincrement, saved_timestamp integer, concept_id text not null, data_type text not null, cached_val text not null);");
            sQLiteDatabase.execSQL("create table if not exists json_courses (_id integer primary key autoincrement, saved_timestamp integer, concept_id text not null, data_type text not null, cached_val text not null);");
            sQLiteDatabase.execSQL("create table if not exists devices (_id integer primary key autoincrement, unit_id integer, application_key text, product_nbr text, mac_address text, product_display_name text, bt_friendly_name text, connection_type text, last_connected_timestamp integer, software_version text, is_software_update_available integer default 0, min_app_version_code_supported integer default 99999, image_url text, video_url text, categories text, is_segment_capable integer default 0, garmin_device_xml blob, garmin_device_xml_id text, is_connected integer default 0, sku text, capabilities integer default 0, gble_ediv blob, gble_rand blob, gble_ltk blob, is_vivohub_configurable integer default 0, sport_capabilities integer default 0, is_primary_user integer default 1, display_name text, training_video_url text, active_ind integer, part_nbr text, fitpay_user_id text, nfc_se_id text, multi_link_support integer default 0, gcj02_course_capable integer default 0, activity_course_capable integer default 0, nfc_capable integer default 0, solarPanelUtilizationCapable integer default 0, lowHrAlertCapable integer default 0, abnormalHeartRateAlertCapable integer default 0, gcmSettingsFileName text, sku_image_url text, sku_image_defaultWatchFace_url text, sku_image_defaultWatchFaceBlank_url text, sku_image_sideProfile_url text, sku_image_tutorial_url text, sku_image_option1_url text, sku_image_option2_url text, sku_image_option3_url text, spectatorMessagingCapable integer default 0, trainingStatusPauseCapable integer default 0, trainingStatusCapable integer default 0, measurementUnitSettingCapable integer default 0, powerCurveCapable integer default 0, secondaryWorkoutStepTargetCapable integer default 0,assistancePlusCapable integer default 0,emergencyCallingCapable integer default 0,solarChargeCapable integer default 0,diveAppSyncCapable integer default 0,dayOfWeekSleepWindowCapable integer default 0,primaryApp integer default 0,incompatibleApps text,applyBackupCapable integer default 0,hillScoreAndEnduranceScoreCapable integer default 0,bodyBatteryTrueUpCapable integer default 0,rechargeableSensorCapable integer default 0,startActivityCapable integer default 0,pendingActivityCapable integer default 0,fixedLocationCapable integer default 0,screenlessDeviceCapable integer default 0,startStopWorkoutCapable integer default 0,fallDetectionCapable integer default 0,directActivationCapable integer default 0,lastUploadToServerTimestamp bigint default 0);");
            sQLiteDatabase.execSQL("create table if not exists orphan_devices (_id integer primary key autoincrement, unit_id integer not null, product_nbr text not null, mac_address text not null, product_display_name text, bt_friendly_name text, image_url text, part_nbr text); ");
            sQLiteDatabase.execSQL("create table if not exists device_permission (_id integer primary key autoincrement, unit_id text not null, perm_id integer not null, perm_val integer not null);");
            sQLiteDatabase.execSQL("create table if not exists golf_downloaded_course (_id integer primary key autoincrement, android_download_id integer, build_id integer not null, global_layout_id integer not null, binary blob, download_mgr_status_reason_id integer, download_status_id integer not null, saved_timestamp integer not null, name text, street text, city text, state text, postal_code text, country text, semi_circle_latitude integer not null, semi_circle_longitude integer not null, website_url text, email text, telephone text, telephone_extension text, hole_count integer, membership_type_id integer not null, designer text, year_designed text, map_type integer default 0, version integer default 0);");
            sQLiteDatabase.execSQL("create table if not exists golf_course_image_data (_id integer primary key autoincrement, device_id integer not null, global_id integer not null, version integer default 0,part_nbr text not null, image_data blob not null, gma_data blob, unl_data blob, map_type integer not null);");
            sQLiteDatabase.setTransactionSuccessful();
            logger.warn("onCreate: database [gcm_cache.db], version [69]");
            sQLiteDatabase.endTransaction();
            logger.debug("onCreate **** END");
        } catch (Throwable th3) {
            sQLiteDatabase.endTransaction();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:142:0x022f A[Catch: SQLException -> 0x0235, TRY_LEAVE, TryCatch #26 {SQLException -> 0x0235, blocks: (B:140:0x0222, B:142:0x022f), top: B:550:0x0222 }] */
    /* JADX WARN: Code duplicated, block: B:153:0x0252 A[Catch: SQLException -> 0x0258, TRY_LEAVE, TryCatch #8 {SQLException -> 0x0258, blocks: (B:151:0x0245, B:153:0x0252), top: B:518:0x0245 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0275 A[Catch: SQLException -> 0x027b, TRY_LEAVE, TryCatch #31 {SQLException -> 0x027b, blocks: (B:162:0x0268, B:164:0x0275), top: B:560:0x0268 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x02b5 A[Catch: SQLException -> 0x02bb, TryCatch #30 {SQLException -> 0x02bb, blocks: (B:180:0x02a8, B:182:0x02b5, B:185:0x02bd, B:187:0x02c5, B:188:0x02ca, B:190:0x02d0), top: B:558:0x02a8 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x02c5 A[Catch: SQLException -> 0x02bb, TryCatch #30 {SQLException -> 0x02bb, blocks: (B:180:0x02a8, B:182:0x02b5, B:185:0x02bd, B:187:0x02c5, B:188:0x02ca, B:190:0x02d0), top: B:558:0x02a8 }] */
    /* JADX WARN: Code duplicated, block: B:190:0x02d0 A[Catch: SQLException -> 0x02bb, TRY_LEAVE, TryCatch #30 {SQLException -> 0x02bb, blocks: (B:180:0x02a8, B:182:0x02b5, B:185:0x02bd, B:187:0x02c5, B:188:0x02ca, B:190:0x02d0), top: B:558:0x02a8 }] */
    /* JADX WARN: Code duplicated, block: B:198:0x02ee A[Catch: SQLException -> 0x02f4, TRY_LEAVE, TryCatch #23 {SQLException -> 0x02f4, blocks: (B:196:0x02e1, B:198:0x02ee), top: B:544:0x02e1 }] */
    /* JADX WARN: Code duplicated, block: B:209:0x0311 A[Catch: SQLException -> 0x0317, TRY_LEAVE, TryCatch #4 {SQLException -> 0x0317, blocks: (B:207:0x0304, B:209:0x0311), top: B:511:0x0304 }] */
    /* JADX WARN: Code duplicated, block: B:220:0x0336 A[Catch: SQLException -> 0x033c, TRY_LEAVE, TryCatch #32 {SQLException -> 0x033c, blocks: (B:218:0x0329, B:220:0x0336), top: B:562:0x0329 }] */
    /* JADX WARN: Code duplicated, block: B:238:0x036e A[Catch: SQLException -> 0x0373, TryCatch #22 {SQLException -> 0x0373, blocks: (B:236:0x0363, B:238:0x036e, B:242:0x0375, B:244:0x037b), top: B:543:0x0363 }] */
    /* JADX WARN: Code duplicated, block: B:242:0x0375 A[Catch: SQLException -> 0x0373, TryCatch #22 {SQLException -> 0x0373, blocks: (B:236:0x0363, B:238:0x036e, B:242:0x0375, B:244:0x037b), top: B:543:0x0363 }] */
    /* JADX WARN: Code duplicated, block: B:244:0x037b A[Catch: SQLException -> 0x0373, TRY_LEAVE, TryCatch #22 {SQLException -> 0x0373, blocks: (B:236:0x0363, B:238:0x036e, B:242:0x0375, B:244:0x037b), top: B:543:0x0363 }] */
    /* JADX WARN: Code duplicated, block: B:250:0x038d  */
    /* JADX WARN: Code duplicated, block: B:253:0x039a A[Catch: SQLException -> 0x039f, TryCatch #10 {SQLException -> 0x039f, blocks: (B:251:0x038f, B:253:0x039a, B:257:0x03a1, B:259:0x03a7), top: B:522:0x038f }] */
    /* JADX WARN: Code duplicated, block: B:257:0x03a1 A[Catch: SQLException -> 0x039f, TryCatch #10 {SQLException -> 0x039f, blocks: (B:251:0x038f, B:253:0x039a, B:257:0x03a1, B:259:0x03a7), top: B:522:0x038f }] */
    /* JADX WARN: Code duplicated, block: B:259:0x03a7 A[Catch: SQLException -> 0x039f, TRY_LEAVE, TryCatch #10 {SQLException -> 0x039f, blocks: (B:251:0x038f, B:253:0x039a, B:257:0x03a1, B:259:0x03a7), top: B:522:0x038f }] */
    /* JADX WARN: Code duplicated, block: B:267:0x03c6 A[Catch: SQLException -> 0x03cc, TRY_LEAVE, TryCatch #36 {SQLException -> 0x03cc, blocks: (B:265:0x03b9, B:267:0x03c6), top: B:570:0x03b9 }] */
    /* JADX WARN: Code duplicated, block: B:278:0x03e9 A[Catch: SQLException -> 0x03ef, TRY_LEAVE, TryCatch #18 {SQLException -> 0x03ef, blocks: (B:276:0x03dc, B:278:0x03e9), top: B:536:0x03dc }] */
    /* JADX WARN: Code duplicated, block: B:289:0x040c A[Catch: SQLException -> 0x0412, TRY_LEAVE, TryCatch #40 {SQLException -> 0x0412, blocks: (B:287:0x03ff, B:289:0x040c), top: B:578:0x03ff }] */
    /* JADX WARN: Code duplicated, block: B:300:0x042f A[Catch: SQLException -> 0x0435, TRY_LEAVE, TryCatch #25 {SQLException -> 0x0435, blocks: (B:298:0x0422, B:300:0x042f), top: B:548:0x0422 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x0452 A[Catch: SQLException -> 0x0458, TRY_LEAVE, TryCatch #7 {SQLException -> 0x0458, blocks: (B:309:0x0445, B:311:0x0452), top: B:516:0x0445 }] */
    /* JADX WARN: Code duplicated, block: B:322:0x0473 A[Catch: SQLException -> 0x0479, TRY_LEAVE, TryCatch #29 {SQLException -> 0x0479, blocks: (B:320:0x0468, B:322:0x0473), top: B:556:0x0468 }] */
    /* JADX WARN: Code duplicated, block: B:333:0x0496 A[Catch: SQLException -> 0x049c, TryCatch #9 {SQLException -> 0x049c, blocks: (B:331:0x0489, B:333:0x0496, B:336:0x049e, B:338:0x04a6, B:339:0x04ab, B:341:0x04b3, B:342:0x04b8, B:344:0x04c0, B:345:0x04c5, B:347:0x04cd, B:348:0x04d2, B:350:0x04da, B:351:0x04df, B:353:0x04e7), top: B:520:0x0489 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x04a6 A[Catch: SQLException -> 0x049c, TryCatch #9 {SQLException -> 0x049c, blocks: (B:331:0x0489, B:333:0x0496, B:336:0x049e, B:338:0x04a6, B:339:0x04ab, B:341:0x04b3, B:342:0x04b8, B:344:0x04c0, B:345:0x04c5, B:347:0x04cd, B:348:0x04d2, B:350:0x04da, B:351:0x04df, B:353:0x04e7), top: B:520:0x0489 }] */
    /* JADX WARN: Code duplicated, block: B:341:0x04b3 A[Catch: SQLException -> 0x049c, TryCatch #9 {SQLException -> 0x049c, blocks: (B:331:0x0489, B:333:0x0496, B:336:0x049e, B:338:0x04a6, B:339:0x04ab, B:341:0x04b3, B:342:0x04b8, B:344:0x04c0, B:345:0x04c5, B:347:0x04cd, B:348:0x04d2, B:350:0x04da, B:351:0x04df, B:353:0x04e7), top: B:520:0x0489 }] */
    /* JADX WARN: Code duplicated, block: B:344:0x04c0 A[Catch: SQLException -> 0x049c, TryCatch #9 {SQLException -> 0x049c, blocks: (B:331:0x0489, B:333:0x0496, B:336:0x049e, B:338:0x04a6, B:339:0x04ab, B:341:0x04b3, B:342:0x04b8, B:344:0x04c0, B:345:0x04c5, B:347:0x04cd, B:348:0x04d2, B:350:0x04da, B:351:0x04df, B:353:0x04e7), top: B:520:0x0489 }] */
    /* JADX WARN: Code duplicated, block: B:347:0x04cd A[Catch: SQLException -> 0x049c, TryCatch #9 {SQLException -> 0x049c, blocks: (B:331:0x0489, B:333:0x0496, B:336:0x049e, B:338:0x04a6, B:339:0x04ab, B:341:0x04b3, B:342:0x04b8, B:344:0x04c0, B:345:0x04c5, B:347:0x04cd, B:348:0x04d2, B:350:0x04da, B:351:0x04df, B:353:0x04e7), top: B:520:0x0489 }] */
    /* JADX WARN: Code duplicated, block: B:350:0x04da A[Catch: SQLException -> 0x049c, TryCatch #9 {SQLException -> 0x049c, blocks: (B:331:0x0489, B:333:0x0496, B:336:0x049e, B:338:0x04a6, B:339:0x04ab, B:341:0x04b3, B:342:0x04b8, B:344:0x04c0, B:345:0x04c5, B:347:0x04cd, B:348:0x04d2, B:350:0x04da, B:351:0x04df, B:353:0x04e7), top: B:520:0x0489 }] */
    /* JADX WARN: Code duplicated, block: B:353:0x04e7 A[Catch: SQLException -> 0x049c, TRY_LEAVE, TryCatch #9 {SQLException -> 0x049c, blocks: (B:331:0x0489, B:333:0x0496, B:336:0x049e, B:338:0x04a6, B:339:0x04ab, B:341:0x04b3, B:342:0x04b8, B:344:0x04c0, B:345:0x04c5, B:347:0x04cd, B:348:0x04d2, B:350:0x04da, B:351:0x04df, B:353:0x04e7), top: B:520:0x0489 }] */
    /* JADX WARN: Code duplicated, block: B:361:0x0507 A[Catch: SQLException -> 0x050d, TRY_LEAVE, TryCatch #37 {SQLException -> 0x050d, blocks: (B:359:0x04fa, B:361:0x0507), top: B:572:0x04fa }] */
    /* JADX WARN: Code duplicated, block: B:372:0x052a A[Catch: SQLException -> 0x0530, TRY_LEAVE, TryCatch #20 {SQLException -> 0x0530, blocks: (B:370:0x051d, B:372:0x052a), top: B:539:0x051d }] */
    /* JADX WARN: Code duplicated, block: B:388:0x0557  */
    /* JADX WARN: Code duplicated, block: B:391:0x0566 A[Catch: SQLException -> 0x056c, TRY_LEAVE, TryCatch #17 {SQLException -> 0x056c, blocks: (B:389:0x0559, B:391:0x0566), top: B:534:0x0559 }] */
    /* JADX WARN: Code duplicated, block: B:400:0x057c  */
    /* JADX WARN: Code duplicated, block: B:403:0x058b A[Catch: SQLException -> 0x0591, TRY_LEAVE, TryCatch #39 {SQLException -> 0x0591, blocks: (B:401:0x057e, B:403:0x058b), top: B:576:0x057e }] */
    /* JADX WARN: Code duplicated, block: B:412:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:415:0x05b0 A[Catch: SQLException -> 0x05b6, TryCatch #27 {SQLException -> 0x05b6, blocks: (B:413:0x05a3, B:415:0x05b0, B:418:0x05b8, B:420:0x05c0), top: B:552:0x05a3 }] */
    /* JADX WARN: Code duplicated, block: B:420:0x05c0 A[Catch: SQLException -> 0x05b6, TRY_LEAVE, TryCatch #27 {SQLException -> 0x05b6, blocks: (B:413:0x05a3, B:415:0x05b0, B:418:0x05b8, B:420:0x05c0), top: B:552:0x05a3 }] */
    /* JADX WARN: Code duplicated, block: B:426:0x05d3  */
    /* JADX WARN: Code duplicated, block: B:429:0x05e4 A[Catch: SQLException -> 0x05ea, TRY_LEAVE, TryCatch #15 {SQLException -> 0x05ea, blocks: (B:427:0x05d5, B:429:0x05e4), top: B:530:0x05d5 }] */
    /* JADX WARN: Code duplicated, block: B:438:0x05fa  */
    /* JADX WARN: Code duplicated, block: B:441:0x0604  */
    /* JADX WARN: Code duplicated, block: B:444:0x060e  */
    /* JADX WARN: Code duplicated, block: B:447:0x0618  */
    /* JADX WARN: Code duplicated, block: B:450:0x0622  */
    /* JADX WARN: Code duplicated, block: B:453:0x062c  */
    /* JADX WARN: Code duplicated, block: B:456:0x0636  */
    /* JADX WARN: Code duplicated, block: B:459:0x0640  */
    /* JADX WARN: Code duplicated, block: B:462:0x064a  */
    /* JADX WARN: Code duplicated, block: B:465:0x0654  */
    /* JADX WARN: Code duplicated, block: B:468:0x065e  */
    /* JADX WARN: Code duplicated, block: B:471:0x0668  */
    /* JADX WARN: Code duplicated, block: B:474:0x0672  */
    /* JADX WARN: Code duplicated, block: B:477:0x067c  */
    /* JADX WARN: Code duplicated, block: B:480:0x0686  */
    /* JADX WARN: Code duplicated, block: B:483:0x0690  */
    /* JADX WARN: Code duplicated, block: B:486:0x069a  */
    /* JADX WARN: Code duplicated, block: B:489:0x06a4  */
    /* JADX WARN: Code duplicated, block: B:492:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:495:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:498:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:500:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:501:0x070b  */
    /* JADX WARN: Code duplicated, block: B:503:0x020e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x034a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:511:0x0304 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:513:0x028b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:516:0x0445 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:518:0x0245 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:520:0x0489 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:0x03dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:0x051d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:0x0363 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:0x02e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:0x0422 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:550:0x0222 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:0x0468 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:0x02a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:0x0268 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0329 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:0x0540 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:570:0x03b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x04fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:0x03ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i14, int i15) throws Throwable {
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        String str;
        boolean z29;
        boolean z34;
        boolean z35;
        boolean z36;
        boolean z37;
        boolean z38;
        boolean z39;
        boolean z44;
        boolean z45;
        boolean z46;
        boolean z47;
        boolean z48;
        boolean z49;
        boolean z54;
        boolean z55;
        boolean z56;
        boolean z57;
        boolean z58;
        boolean z59;
        boolean z64;
        boolean z65;
        boolean z66;
        Logger logger;
        boolean z67;
        Logger logger2;
        boolean z68;
        Logger logger3;
        boolean z69;
        Logger logger4;
        boolean z73;
        boolean z74;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String strG = j.g(i14, i15, "onUpgrade: from version [", "] to [", "]");
        Logger logger5 = f144505a;
        logger5.warn(strG);
        Logger logger6 = c.f144506a;
        if (i14 < 12) {
            try {
                logger6.warn("Executing upgradeTo12...");
                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN is_segment_capable integer default 0");
                z14 = true;
            } catch (SQLException e4) {
                logger6.error("upgradeTo12", (Throwable) e4);
                z14 = false;
            }
            z15 = z14;
        } else {
            z15 = true;
        }
        if (i14 < 13) {
            try {
                logger6.warn("Executing upgradeTo13...");
                sQLiteDatabase2.execSQL("create table if not exists json_courses (_id integer primary key autoincrement, saved_timestamp integer, concept_id text not null, data_type text not null, cached_val text not null);");
                z16 = true;
            } catch (SQLException e14) {
                logger6.error("upgradeTo13", (Throwable) e14);
                z16 = false;
            }
            z15 &= z16;
        }
        if (i14 < 14) {
            try {
                logger6.warn("Executing upgradeTo14...");
                c.b(sQLiteDatabase2, new String[]{"is_registered", "upload_garmin_device"});
                z17 = true;
            } catch (SQLException e15) {
                logger6.error("upgradeTo14", (Throwable) e15);
                z17 = false;
            }
            z15 &= z17;
        }
        if (i14 < 15) {
            try {
                logger6.warn("Executing upgradeTo15...");
                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku text");
                sQLiteDatabase2.execSQL("DELETE FROM json_activities");
                z18 = true;
            } catch (SQLException e16) {
                logger6.error("upgradeTo15", (Throwable) e16);
                z18 = false;
            }
            z15 &= z18;
        }
        if (i14 < 16) {
            try {
                logger6.warn("Executing upgradeTo16...");
                if (!c.f("json_activities", "concept_id", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE json_activities ADD COLUMN concept_id text");
                }
                z19 = true;
            } catch (SQLException e17) {
                logger6.error("upgradeTo16", (Throwable) e17);
                z19 = false;
            }
            z15 &= z19;
        }
        if (i14 < 17) {
            try {
                logger6.warn("Executing upgradeTo17...");
                sQLiteDatabase2.execSQL("create table if not exists golf_downloaded_course (_id integer primary key autoincrement, android_download_id integer, build_id integer not null, global_layout_id integer not null, binary blob, download_mgr_status_reason_id integer, download_status_id integer not null, saved_timestamp integer not null, name text, street text, city text, state text, postal_code text, country text, semi_circle_latitude integer not null, semi_circle_longitude integer not null, website_url text, email text, telephone text, telephone_extension text, hole_count integer, membership_type_id integer not null, designer text, year_designed text, map_type integer default 0, version integer default 0);");
                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN capabilities integer default 0");
                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN gble_ediv blob");
                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN gble_rand blob");
                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN gble_ltk blob");
                z24 = true;
            } catch (SQLException e18) {
                logger6.error("upgradeTo17", (Throwable) e18);
                z24 = false;
            }
            z15 &= z24;
        }
        String str2 = "devices";
        if (i14 < 18) {
            try {
                logger6.warn("Executing upgradeTo18...");
                if (!c.f("devices", "is_vivohub_configurable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN is_vivohub_configurable integer default 0");
                }
                z25 = true;
            } catch (SQLException e19) {
                logger6.error("upgradeTo18", (Throwable) e19);
                z25 = false;
            }
            z15 &= z25;
        }
        if (i14 < 19) {
            try {
                logger6.warn("Executing upgradeTo19...");
                if (!c.f("devices", "sport_capabilities", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sport_capabilities integer default 0");
                }
                z26 = true;
            } catch (SQLException e24) {
                logger6.error("upgradeTo19", (Throwable) e24);
                z26 = false;
            }
            z15 &= z26;
        }
        if (i14 < 20) {
            try {
                logger6.warn("Executing upgradeTo20...");
                if (!c.f("devices", "is_primary_user", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN is_primary_user integer default 1");
                }
                z27 = true;
            } catch (SQLException e25) {
                logger6.error("upgradeTo20", (Throwable) e25);
                z27 = false;
            }
            z15 &= z27;
        }
        if (i14 < 21) {
            try {
                logger6.warn("Executing upgradeTo21...");
                if (!c.f("devices", "display_name", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN display_name text");
                }
                z28 = true;
            } catch (SQLException e26) {
                logger6.error("upgradeTo21", (Throwable) e26);
                z28 = false;
            }
            z15 &= z28;
        }
        boolean zC = z15;
        try {
            if (i14 < 22) {
                try {
                    sQLiteDatabase2.beginTransaction();
                    sQLiteDatabase2.execSQL("create table if not exists device_capabilities (_id integer primary key autoincrement, unit_id text not null, capability_group text not null, capability_mask integer not null);");
                    z<Long> zVarC = c.c(sQLiteDatabase2);
                    int i16 = 0;
                    while (i16 < zVarC.h()) {
                        try {
                            try {
                                long jE = zVarC.e(i16);
                                str = str2;
                                z<Long> zVar = zVarC;
                                int i17 = i16;
                                try {
                                    c.h(jE, "CONNECTIVITY", zVarC.b(jE).longValue(), sQLiteDatabase2);
                                    i16 = i17 + 1;
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    str2 = str;
                                    zVarC = zVar;
                                } catch (SQLException e27) {
                                    e = e27;
                                    sQLiteDatabase2 = sQLiteDatabase;
                                    logger6.error("upgradeTo22", (Throwable) e);
                                    sQLiteDatabase2.endTransaction();
                                    z29 = false;
                                    zC &= z29;
                                    if (i14 < 23) {
                                        try {
                                            sQLiteDatabase2.execSQL("alter table golf_downloaded_course add column map_type integer default 0");
                                            z34 = true;
                                        } catch (SQLException e28) {
                                            logger6.error("upgradeTo23", (Throwable) e28);
                                            z34 = false;
                                        }
                                        zC &= z34;
                                    }
                                    if (i14 < 24) {
                                        try {
                                            logger6.warn("Executing upgradeTo24...");
                                            if (!c.f(str, "training_video_url", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN training_video_url text");
                                            }
                                            z35 = true;
                                        } catch (SQLException e29) {
                                            logger6.error("upgradeTo24", (Throwable) e29);
                                            z35 = false;
                                        }
                                        zC &= z35;
                                    }
                                    if (i14 < 25) {
                                        try {
                                            logger6.warn("Executing upgradeTo25...");
                                            if (!c.f(str, "active_ind", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN active_ind integer");
                                            }
                                            z36 = true;
                                        } catch (SQLException e34) {
                                            logger6.error("upgradeTo25", (Throwable) e34);
                                            z36 = false;
                                        }
                                        zC &= z36;
                                    }
                                    if (i14 < 26) {
                                        try {
                                            logger6.warn("Executing upgradeTo26...");
                                            if (!c.f(str, "part_nbr", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN part_nbr text");
                                            }
                                            z37 = true;
                                        } catch (SQLException e35) {
                                            logger6.error("upgradeTo26", (Throwable) e35);
                                            z37 = false;
                                        }
                                        zC &= z37;
                                    }
                                    if (i14 < 27) {
                                        try {
                                            logger6.warn("Executing upgradeTo27...");
                                            sQLiteDatabase2.execSQL("create table if not exists orphan_devices (_id integer primary key autoincrement, unit_id integer not null, product_nbr text not null, mac_address text not null, product_display_name text, bt_friendly_name text, image_url text, part_nbr text); ");
                                            z38 = true;
                                        } catch (SQLException e36) {
                                            logger6.error("upgradeTo27", (Throwable) e36);
                                            z38 = false;
                                        }
                                        zC &= z38;
                                    }
                                    if (i14 < 28) {
                                        try {
                                            logger6.warn("Executing upgradeTo28...");
                                            if (!c.f(str, "fitpay_user_id", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN fitpay_user_id text");
                                            }
                                            if (!c.f(str, "nfc_se_id", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN nfc_se_id text");
                                            }
                                            if (!c.a(sQLiteDatabase2, "golf_course_image_data")) {
                                                sQLiteDatabase2.execSQL("create table if not exists golf_course_image_data (_id integer primary key autoincrement, device_id integer not null, global_id integer not null, version integer default 0,part_nbr text not null, image_data blob not null, gma_data blob, unl_data blob, map_type integer not null);");
                                            }
                                            z39 = true;
                                        } catch (SQLException e37) {
                                            logger6.error("upgradeTo28", (Throwable) e37);
                                            z39 = false;
                                        }
                                        zC &= z39;
                                    }
                                    if (i14 < 29) {
                                        try {
                                            logger6.warn("Executing upgradeTo29...");
                                            if (!c.f(str, "application_key", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN application_key text");
                                            }
                                            z44 = true;
                                        } catch (SQLException e38) {
                                            logger6.error("upgradeTo29", (Throwable) e38);
                                            z44 = false;
                                        }
                                        zC &= z44;
                                    }
                                    if (i14 < 30) {
                                        try {
                                            logger6.warn("Executing upgradeTo30...");
                                            if (!c.f(str, "multi_link_support", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN multi_link_support integer default 0");
                                            }
                                            z45 = true;
                                        } catch (SQLException e39) {
                                            logger6.error("upgradeTo30", (Throwable) e39);
                                            z45 = false;
                                        }
                                        zC &= z45;
                                    }
                                    if (i14 < 31) {
                                        try {
                                            logger6.warn("Executing upgradeTo31...");
                                            if (!c.f(str, "activity_course_capable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN activity_course_capable integer default 0");
                                            }
                                            z46 = true;
                                        } catch (SQLException e44) {
                                            logger6.error("upgradeTo31", (Throwable) e44);
                                            z46 = false;
                                        }
                                        zC &= z46;
                                    }
                                    if (i14 < 32) {
                                        try {
                                            logger6.warn("Executing upgradeTo32...");
                                            sQLiteDatabase2.execSQL("drop table if exists device_capabilities");
                                            z47 = true;
                                        } catch (SQLException e45) {
                                            logger6.error("upgradeTo31", (Throwable) e45);
                                            z47 = false;
                                        }
                                        zC &= z47;
                                    }
                                    if (i14 < 33) {
                                        try {
                                            logger6.warn("Executing upgradeTo33...");
                                            if (!c.a(sQLiteDatabase2, "golf_course_image_data")) {
                                                sQLiteDatabase2.execSQL("create table if not exists golf_course_image_data (_id integer primary key autoincrement, device_id integer not null, global_id integer not null, version integer default 0,part_nbr text not null, image_data blob not null, gma_data blob, unl_data blob, map_type integer not null);");
                                            } else if (!c.f("golf_course_image_data", "version", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE golf_course_image_data ADD COLUMN version integer default 0");
                                            }
                                            z48 = true;
                                        } catch (SQLException e46) {
                                            logger6.error("upgradeTo33", (Throwable) e46);
                                            z48 = false;
                                        }
                                        zC &= z48;
                                    }
                                    if (i14 < 34) {
                                        try {
                                            logger6.warn("Executing upgradeTo34...");
                                            if (!c.a(sQLiteDatabase2, "golf_downloaded_course")) {
                                                sQLiteDatabase2.execSQL("create table if not exists golf_downloaded_course (_id integer primary key autoincrement, android_download_id integer, build_id integer not null, global_layout_id integer not null, binary blob, download_mgr_status_reason_id integer, download_status_id integer not null, saved_timestamp integer not null, name text, street text, city text, state text, postal_code text, country text, semi_circle_latitude integer not null, semi_circle_longitude integer not null, website_url text, email text, telephone text, telephone_extension text, hole_count integer, membership_type_id integer not null, designer text, year_designed text, map_type integer default 0, version integer default 0);");
                                            } else if (!c.f("golf_downloaded_course", "version", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE golf_downloaded_course ADD COLUMN version integer default 0");
                                            }
                                            z74 = true;
                                        } catch (SQLException e47) {
                                            logger6.error("upgradeTo34", (Throwable) e47);
                                            z74 = false;
                                        }
                                        zC &= z74;
                                    }
                                    if (i14 < 35) {
                                        try {
                                            logger6.warn("Executing upgradeTo35...");
                                            if (!c.f(str, "nfc_capable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN nfc_capable integer default 0");
                                            }
                                            z49 = true;
                                        } catch (SQLException e48) {
                                            logger6.error("upgradeTo35", (Throwable) e48);
                                            z49 = false;
                                        }
                                        zC &= z49;
                                    }
                                    if (i14 < 36) {
                                        try {
                                            logger6.warn("Executing upgradeTo36...");
                                            if (!c.f(str, "solarPanelUtilizationCapable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN solarPanelUtilizationCapable integer default 0");
                                            }
                                            z54 = true;
                                        } catch (SQLException e49) {
                                            logger6.error("upgradeTo36", (Throwable) e49);
                                            z54 = false;
                                        }
                                        zC &= z54;
                                    }
                                    if (i14 < 37) {
                                        try {
                                            logger6.warn("Executing upgradeTo37...");
                                            if (!c.f(str, "gcj02_course_capable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN gcj02_course_capable integer default 0");
                                            }
                                            z55 = true;
                                        } catch (SQLException e54) {
                                            logger6.error("upgradeTo37", (Throwable) e54);
                                            z55 = false;
                                        }
                                        zC &= z55;
                                    }
                                    if (i14 < 38) {
                                        try {
                                            logger6.warn("Executing upgradeTo38...");
                                            if (!c.f(str, "lowHrAlertCapable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN lowHrAlertCapable integer default 0");
                                            }
                                            z56 = true;
                                        } catch (SQLException e55) {
                                            logger6.error("upgradeTo38", (Throwable) e55);
                                            z56 = false;
                                        }
                                        zC &= z56;
                                    }
                                    if (i14 < 39) {
                                        try {
                                            logger6.warn("Executing upgradeTo39...");
                                            if (!c.f(str, "abnormalHeartRateAlertCapable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN abnormalHeartRateAlertCapable integer default 0");
                                            }
                                            z57 = true;
                                        } catch (SQLException e56) {
                                            logger6.error("upgradeTo39", (Throwable) e56);
                                            z57 = false;
                                        }
                                        zC &= z57;
                                    }
                                    if (i14 < 40) {
                                        try {
                                            logger6.warn("Executing upgradeTo40...");
                                            if (!c.f(str, "deviceSettingsFileName", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN deviceSettingsFileName text");
                                            }
                                            z58 = true;
                                        } catch (SQLException e57) {
                                            logger6.error("upgradeTo40", (Throwable) e57);
                                            z58 = false;
                                        }
                                        zC &= z58;
                                    }
                                    if (i14 < 41) {
                                        try {
                                            logger6.warn("Executing upgradeTo41...");
                                            if (!c.f(str, "sku_image_defaultWatchFace_url", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_defaultWatchFace_url text");
                                            }
                                            if (!c.f(str, "sku_image_defaultWatchFaceBlank_url", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_defaultWatchFaceBlank_url text");
                                            }
                                            if (!c.f(str, "sku_image_sideProfile_url", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_sideProfile_url text");
                                            }
                                            if (!c.f(str, "sku_image_tutorial_url", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_tutorial_url text");
                                            }
                                            if (!c.f(str, "sku_image_option1_url", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option1_url text");
                                            }
                                            if (!c.f(str, "sku_image_option2_url", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option2_url text");
                                            }
                                            if (!c.f(str, "sku_image_option3_url", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option3_url text");
                                            }
                                            z59 = true;
                                        } catch (SQLException e58) {
                                            logger6.error("upgradeTo41", (Throwable) e58);
                                            z59 = false;
                                        }
                                        zC &= z59;
                                    }
                                    if (i14 < 42) {
                                        try {
                                            logger6.warn("Executing upgradeTo42...");
                                            if (!c.f(str, "trainingStatusPauseCapable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN trainingStatusPauseCapable integer default 0");
                                            }
                                            z64 = true;
                                        } catch (SQLException e59) {
                                            logger6.error("upgradeTo42", (Throwable) e59);
                                            z64 = false;
                                        }
                                        zC &= z64;
                                    }
                                    if (i14 < 43) {
                                        try {
                                            logger6.warn("Executing upgradeTo43...");
                                            if (!c.f(str, "trainingStatusCapable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN trainingStatusCapable integer default 0");
                                            }
                                            z65 = true;
                                        } catch (SQLException e64) {
                                            logger6.error("upgradeTo43", (Throwable) e64);
                                            z65 = false;
                                        }
                                        zC &= z65;
                                    }
                                    if (i14 < 44) {
                                        try {
                                            logger6.warn("Executing upgradeTo44...");
                                            c.g(sQLiteDatabase2);
                                            z66 = true;
                                        } catch (SQLException e65) {
                                            logger6.error("upgradeTo44", (Throwable) e65);
                                            z66 = false;
                                        }
                                        zC &= z66;
                                    }
                                    if (i14 < 45) {
                                        logger4 = c.f144506a;
                                        try {
                                            logger4.warn("Executing upgradeTo45...");
                                            if (!c.f(str, "measurementUnitSettingCapable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN measurementUnitSettingCapable integer default 0");
                                            }
                                            z73 = true;
                                        } catch (SQLException e66) {
                                            logger4.error("Error in upgradeTo45", (Throwable) e66);
                                            z73 = false;
                                        }
                                        zC &= z73;
                                    }
                                    if (i14 < 46) {
                                        logger3 = c.f144506a;
                                        try {
                                            logger3.warn("Executing upgradeTo46...");
                                            if (!c.f(str, "spectatorMessagingCapable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN spectatorMessagingCapable integer default 0");
                                            }
                                            z69 = true;
                                        } catch (SQLException e67) {
                                            logger3.error("Error in upgradeTo46", (Throwable) e67);
                                            z69 = false;
                                        }
                                        zC &= z69;
                                    }
                                    if (i14 < 47) {
                                        logger2 = c.f144506a;
                                        try {
                                            logger2.warn("Executing upgradeTo47...");
                                            if (!c.f(str, "powerCurveCapable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN powerCurveCapable integer default 0");
                                            }
                                            if (!c.f(str, "secondaryWorkoutStepTargetCapable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN secondaryWorkoutStepTargetCapable integer default 0");
                                            }
                                            z68 = true;
                                        } catch (SQLException e68) {
                                            logger2.error("Error in upgradeTo47", (Throwable) e68);
                                            z68 = false;
                                        }
                                        zC &= z68;
                                    }
                                    if (i14 < 48) {
                                        logger = c.f144506a;
                                        try {
                                            logger.warn("Executing upgradeTo48...");
                                            if (!c.f("devices", "assistancePlusCapable", sQLiteDatabase2)) {
                                                sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN assistancePlusCapable integer default 0");
                                            }
                                            z67 = true;
                                        } catch (SQLException e69) {
                                            logger.error("Error in upgradeTo48", (Throwable) e69);
                                            z67 = false;
                                        }
                                        zC &= z67;
                                    }
                                    if (i14 < 49) {
                                        zC &= c.i(sQLiteDatabase2);
                                    }
                                    if (i14 < 50) {
                                        zC &= c.j(sQLiteDatabase2);
                                    }
                                    if (i14 < 51) {
                                        zC &= c.k(sQLiteDatabase2);
                                    }
                                    if (i14 < 52) {
                                        zC &= c.l(sQLiteDatabase2);
                                    }
                                    if (i14 < 53) {
                                        zC &= c.m(sQLiteDatabase2);
                                    }
                                    if (i14 < 54) {
                                        zC &= c.n(sQLiteDatabase2);
                                    }
                                    if (i14 < 55) {
                                        zC &= c.o(sQLiteDatabase2);
                                    }
                                    if (i14 < 56) {
                                        zC &= c.p(sQLiteDatabase2);
                                    }
                                    if (i14 < 57) {
                                        zC &= c.q(sQLiteDatabase2);
                                    }
                                    if (i14 < 58) {
                                        zC &= c.r(sQLiteDatabase2);
                                    }
                                    if (i14 < 59) {
                                        zC &= c.s(sQLiteDatabase2);
                                    }
                                    if (i14 < 60) {
                                        zC &= c.t(sQLiteDatabase2);
                                    }
                                    if (i14 < 61) {
                                        zC &= c.u(sQLiteDatabase2);
                                    }
                                    if (i14 < 62) {
                                        zC &= c.v(sQLiteDatabase2);
                                    }
                                    if (i14 < 63) {
                                        zC &= c.w(sQLiteDatabase2);
                                    }
                                    if (i14 < 64) {
                                        zC &= c.x(sQLiteDatabase2);
                                    }
                                    if (i14 < 65) {
                                        zC &= c.y(sQLiteDatabase2);
                                    }
                                    if (i14 < 66) {
                                        zC &= c.z(sQLiteDatabase2);
                                    }
                                    if (i14 < 67) {
                                        zC &= c.A(sQLiteDatabase2);
                                    }
                                    if (i14 < 68) {
                                        zC &= c.B(sQLiteDatabase2);
                                    }
                                    if (i14 < 69) {
                                        zC &= c.C(sQLiteDatabase2);
                                    }
                                    if (!zC) {
                                        logger5.warn(j.g(i14, i15, "onUpgrade: successful upgrade from version [", "] to [", "]"));
                                        return;
                                    }
                                    logger5.error(j.g(i14, i15, "onUpgrade: failure from version [", "] to [", "]. As a fallback, dropping and re-creating the database..."));
                                    sQLiteDatabase2.execSQL("drop table if exists json");
                                    sQLiteDatabase2.execSQL("drop table if exists json_steps");
                                    sQLiteDatabase2.execSQL("drop table if exists json_myfitnesspal_calories");
                                    sQLiteDatabase2.execSQL("drop table if exists json_activities");
                                    sQLiteDatabase2.execSQL("drop table if exists json_courses");
                                    sQLiteDatabase2.execSQL("drop table if exists devices");
                                    sQLiteDatabase2.execSQL("drop table if exists orphan_devices");
                                    sQLiteDatabase2.execSQL("drop table if exists device_permission");
                                    sQLiteDatabase2.execSQL("drop table if exists golf_downloaded_course");
                                    sQLiteDatabase2.execSQL("drop table if exists golf_course_image_data");
                                    onCreate(sQLiteDatabase);
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                sQLiteDatabase2 = sQLiteDatabase;
                                sQLiteDatabase2.endTransaction();
                                throw th;
                            }
                        } catch (SQLException e74) {
                            e = e74;
                            str = str2;
                            sQLiteDatabase2 = sQLiteDatabase;
                            logger6.error("upgradeTo22", (Throwable) e);
                            sQLiteDatabase2.endTransaction();
                            z29 = false;
                            zC &= z29;
                            if (i14 < 23) {
                                sQLiteDatabase2.execSQL("alter table golf_downloaded_course add column map_type integer default 0");
                                z34 = true;
                                zC &= z34;
                            }
                            if (i14 < 24) {
                                logger6.warn("Executing upgradeTo24...");
                                if (!c.f(str, "training_video_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN training_video_url text");
                                }
                                z35 = true;
                                zC &= z35;
                            }
                            if (i14 < 25) {
                                logger6.warn("Executing upgradeTo25...");
                                if (!c.f(str, "active_ind", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN active_ind integer");
                                }
                                z36 = true;
                                zC &= z36;
                            }
                            if (i14 < 26) {
                                logger6.warn("Executing upgradeTo26...");
                                if (!c.f(str, "part_nbr", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN part_nbr text");
                                }
                                z37 = true;
                                zC &= z37;
                            }
                            if (i14 < 27) {
                                logger6.warn("Executing upgradeTo27...");
                                sQLiteDatabase2.execSQL("create table if not exists orphan_devices (_id integer primary key autoincrement, unit_id integer not null, product_nbr text not null, mac_address text not null, product_display_name text, bt_friendly_name text, image_url text, part_nbr text); ");
                                z38 = true;
                                zC &= z38;
                            }
                            if (i14 < 28) {
                                logger6.warn("Executing upgradeTo28...");
                                if (!c.f(str, "fitpay_user_id", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN fitpay_user_id text");
                                }
                                if (!c.f(str, "nfc_se_id", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN nfc_se_id text");
                                }
                                if (!c.a(sQLiteDatabase2, "golf_course_image_data")) {
                                    sQLiteDatabase2.execSQL("create table if not exists golf_course_image_data (_id integer primary key autoincrement, device_id integer not null, global_id integer not null, version integer default 0,part_nbr text not null, image_data blob not null, gma_data blob, unl_data blob, map_type integer not null);");
                                }
                                z39 = true;
                                zC &= z39;
                            }
                            if (i14 < 29) {
                                logger6.warn("Executing upgradeTo29...");
                                if (!c.f(str, "application_key", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN application_key text");
                                }
                                z44 = true;
                                zC &= z44;
                            }
                            if (i14 < 30) {
                                logger6.warn("Executing upgradeTo30...");
                                if (!c.f(str, "multi_link_support", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN multi_link_support integer default 0");
                                }
                                z45 = true;
                                zC &= z45;
                            }
                            if (i14 < 31) {
                                logger6.warn("Executing upgradeTo31...");
                                if (!c.f(str, "activity_course_capable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN activity_course_capable integer default 0");
                                }
                                z46 = true;
                                zC &= z46;
                            }
                            if (i14 < 32) {
                                logger6.warn("Executing upgradeTo32...");
                                sQLiteDatabase2.execSQL("drop table if exists device_capabilities");
                                z47 = true;
                                zC &= z47;
                            }
                            if (i14 < 33) {
                                logger6.warn("Executing upgradeTo33...");
                                if (!c.a(sQLiteDatabase2, "golf_course_image_data")) {
                                    sQLiteDatabase2.execSQL("create table if not exists golf_course_image_data (_id integer primary key autoincrement, device_id integer not null, global_id integer not null, version integer default 0,part_nbr text not null, image_data blob not null, gma_data blob, unl_data blob, map_type integer not null);");
                                } else if (!c.f("golf_course_image_data", "version", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE golf_course_image_data ADD COLUMN version integer default 0");
                                }
                                z48 = true;
                                zC &= z48;
                            }
                            if (i14 < 34) {
                                logger6.warn("Executing upgradeTo34...");
                                if (!c.a(sQLiteDatabase2, "golf_downloaded_course")) {
                                    sQLiteDatabase2.execSQL("create table if not exists golf_downloaded_course (_id integer primary key autoincrement, android_download_id integer, build_id integer not null, global_layout_id integer not null, binary blob, download_mgr_status_reason_id integer, download_status_id integer not null, saved_timestamp integer not null, name text, street text, city text, state text, postal_code text, country text, semi_circle_latitude integer not null, semi_circle_longitude integer not null, website_url text, email text, telephone text, telephone_extension text, hole_count integer, membership_type_id integer not null, designer text, year_designed text, map_type integer default 0, version integer default 0);");
                                } else if (!c.f("golf_downloaded_course", "version", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE golf_downloaded_course ADD COLUMN version integer default 0");
                                }
                                z74 = true;
                                zC &= z74;
                            }
                            if (i14 < 35) {
                                logger6.warn("Executing upgradeTo35...");
                                if (!c.f(str, "nfc_capable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN nfc_capable integer default 0");
                                }
                                z49 = true;
                                zC &= z49;
                            }
                            if (i14 < 36) {
                                logger6.warn("Executing upgradeTo36...");
                                if (!c.f(str, "solarPanelUtilizationCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN solarPanelUtilizationCapable integer default 0");
                                }
                                z54 = true;
                                zC &= z54;
                            }
                            if (i14 < 37) {
                                logger6.warn("Executing upgradeTo37...");
                                if (!c.f(str, "gcj02_course_capable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN gcj02_course_capable integer default 0");
                                }
                                z55 = true;
                                zC &= z55;
                            }
                            if (i14 < 38) {
                                logger6.warn("Executing upgradeTo38...");
                                if (!c.f(str, "lowHrAlertCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN lowHrAlertCapable integer default 0");
                                }
                                z56 = true;
                                zC &= z56;
                            }
                            if (i14 < 39) {
                                logger6.warn("Executing upgradeTo39...");
                                if (!c.f(str, "abnormalHeartRateAlertCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN abnormalHeartRateAlertCapable integer default 0");
                                }
                                z57 = true;
                                zC &= z57;
                            }
                            if (i14 < 40) {
                                logger6.warn("Executing upgradeTo40...");
                                if (!c.f(str, "deviceSettingsFileName", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN deviceSettingsFileName text");
                                }
                                z58 = true;
                                zC &= z58;
                            }
                            if (i14 < 41) {
                                logger6.warn("Executing upgradeTo41...");
                                if (!c.f(str, "sku_image_defaultWatchFace_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_defaultWatchFace_url text");
                                }
                                if (!c.f(str, "sku_image_defaultWatchFaceBlank_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_defaultWatchFaceBlank_url text");
                                }
                                if (!c.f(str, "sku_image_sideProfile_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_sideProfile_url text");
                                }
                                if (!c.f(str, "sku_image_tutorial_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_tutorial_url text");
                                }
                                if (!c.f(str, "sku_image_option1_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option1_url text");
                                }
                                if (!c.f(str, "sku_image_option2_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option2_url text");
                                }
                                if (!c.f(str, "sku_image_option3_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option3_url text");
                                }
                                z59 = true;
                                zC &= z59;
                            }
                            if (i14 < 42) {
                                logger6.warn("Executing upgradeTo42...");
                                if (!c.f(str, "trainingStatusPauseCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN trainingStatusPauseCapable integer default 0");
                                }
                                z64 = true;
                                zC &= z64;
                            }
                            if (i14 < 43) {
                                logger6.warn("Executing upgradeTo43...");
                                if (!c.f(str, "trainingStatusCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN trainingStatusCapable integer default 0");
                                }
                                z65 = true;
                                zC &= z65;
                            }
                            if (i14 < 44) {
                                logger6.warn("Executing upgradeTo44...");
                                c.g(sQLiteDatabase2);
                                z66 = true;
                                zC &= z66;
                            }
                            if (i14 < 45) {
                                logger4 = c.f144506a;
                                logger4.warn("Executing upgradeTo45...");
                                if (!c.f(str, "measurementUnitSettingCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN measurementUnitSettingCapable integer default 0");
                                }
                                z73 = true;
                                zC &= z73;
                            }
                            if (i14 < 46) {
                                logger3 = c.f144506a;
                                logger3.warn("Executing upgradeTo46...");
                                if (!c.f(str, "spectatorMessagingCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN spectatorMessagingCapable integer default 0");
                                }
                                z69 = true;
                                zC &= z69;
                            }
                            if (i14 < 47) {
                                logger2 = c.f144506a;
                                logger2.warn("Executing upgradeTo47...");
                                if (!c.f(str, "powerCurveCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN powerCurveCapable integer default 0");
                                }
                                if (!c.f(str, "secondaryWorkoutStepTargetCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN secondaryWorkoutStepTargetCapable integer default 0");
                                }
                                z68 = true;
                                zC &= z68;
                            }
                            if (i14 < 48) {
                                logger = c.f144506a;
                                logger.warn("Executing upgradeTo48...");
                                if (!c.f("devices", "assistancePlusCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN assistancePlusCapable integer default 0");
                                }
                                z67 = true;
                                zC &= z67;
                            }
                            if (i14 < 49) {
                                zC &= c.i(sQLiteDatabase2);
                            }
                            if (i14 < 50) {
                                zC &= c.j(sQLiteDatabase2);
                            }
                            if (i14 < 51) {
                                zC &= c.k(sQLiteDatabase2);
                            }
                            if (i14 < 52) {
                                zC &= c.l(sQLiteDatabase2);
                            }
                            if (i14 < 53) {
                                zC &= c.m(sQLiteDatabase2);
                            }
                            if (i14 < 54) {
                                zC &= c.n(sQLiteDatabase2);
                            }
                            if (i14 < 55) {
                                zC &= c.o(sQLiteDatabase2);
                            }
                            if (i14 < 56) {
                                zC &= c.p(sQLiteDatabase2);
                            }
                            if (i14 < 57) {
                                zC &= c.q(sQLiteDatabase2);
                            }
                            if (i14 < 58) {
                                zC &= c.r(sQLiteDatabase2);
                            }
                            if (i14 < 59) {
                                zC &= c.s(sQLiteDatabase2);
                            }
                            if (i14 < 60) {
                                zC &= c.t(sQLiteDatabase2);
                            }
                            if (i14 < 61) {
                                zC &= c.u(sQLiteDatabase2);
                            }
                            if (i14 < 62) {
                                zC &= c.v(sQLiteDatabase2);
                            }
                            if (i14 < 63) {
                                zC &= c.w(sQLiteDatabase2);
                            }
                            if (i14 < 64) {
                                zC &= c.x(sQLiteDatabase2);
                            }
                            if (i14 < 65) {
                                zC &= c.y(sQLiteDatabase2);
                            }
                            if (i14 < 66) {
                                zC &= c.z(sQLiteDatabase2);
                            }
                            if (i14 < 67) {
                                zC &= c.A(sQLiteDatabase2);
                            }
                            if (i14 < 68) {
                                zC &= c.B(sQLiteDatabase2);
                            }
                            if (i14 < 69) {
                                zC &= c.C(sQLiteDatabase2);
                            }
                            if (!zC) {
                                logger5.warn(j.g(i14, i15, "onUpgrade: successful upgrade from version [", "] to [", "]"));
                                return;
                            }
                            logger5.error(j.g(i14, i15, "onUpgrade: failure from version [", "] to [", "]. As a fallback, dropping and re-creating the database..."));
                            sQLiteDatabase2.execSQL("drop table if exists json");
                            sQLiteDatabase2.execSQL("drop table if exists json_steps");
                            sQLiteDatabase2.execSQL("drop table if exists json_myfitnesspal_calories");
                            sQLiteDatabase2.execSQL("drop table if exists json_activities");
                            sQLiteDatabase2.execSQL("drop table if exists json_courses");
                            sQLiteDatabase2.execSQL("drop table if exists devices");
                            sQLiteDatabase2.execSQL("drop table if exists orphan_devices");
                            sQLiteDatabase2.execSQL("drop table if exists device_permission");
                            sQLiteDatabase2.execSQL("drop table if exists golf_downloaded_course");
                            sQLiteDatabase2.execSQL("drop table if exists golf_course_image_data");
                            onCreate(sQLiteDatabase);
                        }
                    }
                    str = str2;
                    z<Long> zVarD = c.d(sQLiteDatabase);
                    int i18 = 0;
                    while (i18 < zVarD.h()) {
                        long jE2 = zVarD.e(i18);
                        int i19 = i18;
                        z<Long> zVar2 = zVarD;
                        sQLiteDatabase2 = sQLiteDatabase;
                        try {
                            c.h(jE2, "SPORTS", zVarD.b(jE2).longValue(), sQLiteDatabase2);
                            i18 = i19 + 1;
                            zVarD = zVar2;
                        } catch (SQLException e75) {
                            e = e75;
                            logger6.error("upgradeTo22", (Throwable) e);
                            sQLiteDatabase2.endTransaction();
                            z29 = false;
                            zC &= z29;
                            if (i14 < 23) {
                                sQLiteDatabase2.execSQL("alter table golf_downloaded_course add column map_type integer default 0");
                                z34 = true;
                                zC &= z34;
                            }
                            if (i14 < 24) {
                                logger6.warn("Executing upgradeTo24...");
                                if (!c.f(str, "training_video_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN training_video_url text");
                                }
                                z35 = true;
                                zC &= z35;
                            }
                            if (i14 < 25) {
                                logger6.warn("Executing upgradeTo25...");
                                if (!c.f(str, "active_ind", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN active_ind integer");
                                }
                                z36 = true;
                                zC &= z36;
                            }
                            if (i14 < 26) {
                                logger6.warn("Executing upgradeTo26...");
                                if (!c.f(str, "part_nbr", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN part_nbr text");
                                }
                                z37 = true;
                                zC &= z37;
                            }
                            if (i14 < 27) {
                                logger6.warn("Executing upgradeTo27...");
                                sQLiteDatabase2.execSQL("create table if not exists orphan_devices (_id integer primary key autoincrement, unit_id integer not null, product_nbr text not null, mac_address text not null, product_display_name text, bt_friendly_name text, image_url text, part_nbr text); ");
                                z38 = true;
                                zC &= z38;
                            }
                            if (i14 < 28) {
                                logger6.warn("Executing upgradeTo28...");
                                if (!c.f(str, "fitpay_user_id", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN fitpay_user_id text");
                                }
                                if (!c.f(str, "nfc_se_id", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN nfc_se_id text");
                                }
                                if (!c.a(sQLiteDatabase2, "golf_course_image_data")) {
                                    sQLiteDatabase2.execSQL("create table if not exists golf_course_image_data (_id integer primary key autoincrement, device_id integer not null, global_id integer not null, version integer default 0,part_nbr text not null, image_data blob not null, gma_data blob, unl_data blob, map_type integer not null);");
                                }
                                z39 = true;
                                zC &= z39;
                            }
                            if (i14 < 29) {
                                logger6.warn("Executing upgradeTo29...");
                                if (!c.f(str, "application_key", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN application_key text");
                                }
                                z44 = true;
                                zC &= z44;
                            }
                            if (i14 < 30) {
                                logger6.warn("Executing upgradeTo30...");
                                if (!c.f(str, "multi_link_support", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN multi_link_support integer default 0");
                                }
                                z45 = true;
                                zC &= z45;
                            }
                            if (i14 < 31) {
                                logger6.warn("Executing upgradeTo31...");
                                if (!c.f(str, "activity_course_capable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN activity_course_capable integer default 0");
                                }
                                z46 = true;
                                zC &= z46;
                            }
                            if (i14 < 32) {
                                logger6.warn("Executing upgradeTo32...");
                                sQLiteDatabase2.execSQL("drop table if exists device_capabilities");
                                z47 = true;
                                zC &= z47;
                            }
                            if (i14 < 33) {
                                logger6.warn("Executing upgradeTo33...");
                                if (!c.a(sQLiteDatabase2, "golf_course_image_data")) {
                                    sQLiteDatabase2.execSQL("create table if not exists golf_course_image_data (_id integer primary key autoincrement, device_id integer not null, global_id integer not null, version integer default 0,part_nbr text not null, image_data blob not null, gma_data blob, unl_data blob, map_type integer not null);");
                                } else if (!c.f("golf_course_image_data", "version", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE golf_course_image_data ADD COLUMN version integer default 0");
                                }
                                z48 = true;
                                zC &= z48;
                            }
                            if (i14 < 34) {
                                logger6.warn("Executing upgradeTo34...");
                                if (!c.a(sQLiteDatabase2, "golf_downloaded_course")) {
                                    sQLiteDatabase2.execSQL("create table if not exists golf_downloaded_course (_id integer primary key autoincrement, android_download_id integer, build_id integer not null, global_layout_id integer not null, binary blob, download_mgr_status_reason_id integer, download_status_id integer not null, saved_timestamp integer not null, name text, street text, city text, state text, postal_code text, country text, semi_circle_latitude integer not null, semi_circle_longitude integer not null, website_url text, email text, telephone text, telephone_extension text, hole_count integer, membership_type_id integer not null, designer text, year_designed text, map_type integer default 0, version integer default 0);");
                                } else if (!c.f("golf_downloaded_course", "version", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE golf_downloaded_course ADD COLUMN version integer default 0");
                                }
                                z74 = true;
                                zC &= z74;
                            }
                            if (i14 < 35) {
                                logger6.warn("Executing upgradeTo35...");
                                if (!c.f(str, "nfc_capable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN nfc_capable integer default 0");
                                }
                                z49 = true;
                                zC &= z49;
                            }
                            if (i14 < 36) {
                                logger6.warn("Executing upgradeTo36...");
                                if (!c.f(str, "solarPanelUtilizationCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN solarPanelUtilizationCapable integer default 0");
                                }
                                z54 = true;
                                zC &= z54;
                            }
                            if (i14 < 37) {
                                logger6.warn("Executing upgradeTo37...");
                                if (!c.f(str, "gcj02_course_capable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN gcj02_course_capable integer default 0");
                                }
                                z55 = true;
                                zC &= z55;
                            }
                            if (i14 < 38) {
                                logger6.warn("Executing upgradeTo38...");
                                if (!c.f(str, "lowHrAlertCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN lowHrAlertCapable integer default 0");
                                }
                                z56 = true;
                                zC &= z56;
                            }
                            if (i14 < 39) {
                                logger6.warn("Executing upgradeTo39...");
                                if (!c.f(str, "abnormalHeartRateAlertCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN abnormalHeartRateAlertCapable integer default 0");
                                }
                                z57 = true;
                                zC &= z57;
                            }
                            if (i14 < 40) {
                                logger6.warn("Executing upgradeTo40...");
                                if (!c.f(str, "deviceSettingsFileName", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN deviceSettingsFileName text");
                                }
                                z58 = true;
                                zC &= z58;
                            }
                            if (i14 < 41) {
                                logger6.warn("Executing upgradeTo41...");
                                if (!c.f(str, "sku_image_defaultWatchFace_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_defaultWatchFace_url text");
                                }
                                if (!c.f(str, "sku_image_defaultWatchFaceBlank_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_defaultWatchFaceBlank_url text");
                                }
                                if (!c.f(str, "sku_image_sideProfile_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_sideProfile_url text");
                                }
                                if (!c.f(str, "sku_image_tutorial_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_tutorial_url text");
                                }
                                if (!c.f(str, "sku_image_option1_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option1_url text");
                                }
                                if (!c.f(str, "sku_image_option2_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option2_url text");
                                }
                                if (!c.f(str, "sku_image_option3_url", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option3_url text");
                                }
                                z59 = true;
                                zC &= z59;
                            }
                            if (i14 < 42) {
                                logger6.warn("Executing upgradeTo42...");
                                if (!c.f(str, "trainingStatusPauseCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN trainingStatusPauseCapable integer default 0");
                                }
                                z64 = true;
                                zC &= z64;
                            }
                            if (i14 < 43) {
                                logger6.warn("Executing upgradeTo43...");
                                if (!c.f(str, "trainingStatusCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN trainingStatusCapable integer default 0");
                                }
                                z65 = true;
                                zC &= z65;
                            }
                            if (i14 < 44) {
                                logger6.warn("Executing upgradeTo44...");
                                c.g(sQLiteDatabase2);
                                z66 = true;
                                zC &= z66;
                            }
                            if (i14 < 45) {
                                logger4 = c.f144506a;
                                logger4.warn("Executing upgradeTo45...");
                                if (!c.f(str, "measurementUnitSettingCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN measurementUnitSettingCapable integer default 0");
                                }
                                z73 = true;
                                zC &= z73;
                            }
                            if (i14 < 46) {
                                logger3 = c.f144506a;
                                logger3.warn("Executing upgradeTo46...");
                                if (!c.f(str, "spectatorMessagingCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN spectatorMessagingCapable integer default 0");
                                }
                                z69 = true;
                                zC &= z69;
                            }
                            if (i14 < 47) {
                                logger2 = c.f144506a;
                                logger2.warn("Executing upgradeTo47...");
                                if (!c.f(str, "powerCurveCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN powerCurveCapable integer default 0");
                                }
                                if (!c.f(str, "secondaryWorkoutStepTargetCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN secondaryWorkoutStepTargetCapable integer default 0");
                                }
                                z68 = true;
                                zC &= z68;
                            }
                            if (i14 < 48) {
                                logger = c.f144506a;
                                logger.warn("Executing upgradeTo48...");
                                if (!c.f("devices", "assistancePlusCapable", sQLiteDatabase2)) {
                                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN assistancePlusCapable integer default 0");
                                }
                                z67 = true;
                                zC &= z67;
                            }
                            if (i14 < 49) {
                                zC &= c.i(sQLiteDatabase2);
                            }
                            if (i14 < 50) {
                                zC &= c.j(sQLiteDatabase2);
                            }
                            if (i14 < 51) {
                                zC &= c.k(sQLiteDatabase2);
                            }
                            if (i14 < 52) {
                                zC &= c.l(sQLiteDatabase2);
                            }
                            if (i14 < 53) {
                                zC &= c.m(sQLiteDatabase2);
                            }
                            if (i14 < 54) {
                                zC &= c.n(sQLiteDatabase2);
                            }
                            if (i14 < 55) {
                                zC &= c.o(sQLiteDatabase2);
                            }
                            if (i14 < 56) {
                                zC &= c.p(sQLiteDatabase2);
                            }
                            if (i14 < 57) {
                                zC &= c.q(sQLiteDatabase2);
                            }
                            if (i14 < 58) {
                                zC &= c.r(sQLiteDatabase2);
                            }
                            if (i14 < 59) {
                                zC &= c.s(sQLiteDatabase2);
                            }
                            if (i14 < 60) {
                                zC &= c.t(sQLiteDatabase2);
                            }
                            if (i14 < 61) {
                                zC &= c.u(sQLiteDatabase2);
                            }
                            if (i14 < 62) {
                                zC &= c.v(sQLiteDatabase2);
                            }
                            if (i14 < 63) {
                                zC &= c.w(sQLiteDatabase2);
                            }
                            if (i14 < 64) {
                                zC &= c.x(sQLiteDatabase2);
                            }
                            if (i14 < 65) {
                                zC &= c.y(sQLiteDatabase2);
                            }
                            if (i14 < 66) {
                                zC &= c.z(sQLiteDatabase2);
                            }
                            if (i14 < 67) {
                                zC &= c.A(sQLiteDatabase2);
                            }
                            if (i14 < 68) {
                                zC &= c.B(sQLiteDatabase2);
                            }
                            if (i14 < 69) {
                                zC &= c.C(sQLiteDatabase2);
                            }
                            if (!zC) {
                                logger5.warn(j.g(i14, i15, "onUpgrade: successful upgrade from version [", "] to [", "]"));
                                return;
                            }
                            logger5.error(j.g(i14, i15, "onUpgrade: failure from version [", "] to [", "]. As a fallback, dropping and re-creating the database..."));
                            sQLiteDatabase2.execSQL("drop table if exists json");
                            sQLiteDatabase2.execSQL("drop table if exists json_steps");
                            sQLiteDatabase2.execSQL("drop table if exists json_myfitnesspal_calories");
                            sQLiteDatabase2.execSQL("drop table if exists json_activities");
                            sQLiteDatabase2.execSQL("drop table if exists json_courses");
                            sQLiteDatabase2.execSQL("drop table if exists devices");
                            sQLiteDatabase2.execSQL("drop table if exists orphan_devices");
                            sQLiteDatabase2.execSQL("drop table if exists device_permission");
                            sQLiteDatabase2.execSQL("drop table if exists golf_downloaded_course");
                            sQLiteDatabase2.execSQL("drop table if exists golf_course_image_data");
                            onCreate(sQLiteDatabase);
                        }
                    }
                    sQLiteDatabase2 = sQLiteDatabase;
                    sQLiteDatabase2.execSQL("UPDATE devices SET capabilities = 0, sport_capabilities = 0;");
                    sQLiteDatabase2.setTransactionSuccessful();
                    sQLiteDatabase2.endTransaction();
                    z29 = true;
                } catch (SQLException e76) {
                    e = e76;
                    str = str2;
                }
                zC &= z29;
            } else {
                str = "devices";
            }
            if (i14 < 23) {
                sQLiteDatabase2.execSQL("alter table golf_downloaded_course add column map_type integer default 0");
                z34 = true;
                zC &= z34;
            }
            if (i14 < 24) {
                logger6.warn("Executing upgradeTo24...");
                if (!c.f(str, "training_video_url", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN training_video_url text");
                }
                z35 = true;
                zC &= z35;
            }
            if (i14 < 25) {
                logger6.warn("Executing upgradeTo25...");
                if (!c.f(str, "active_ind", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN active_ind integer");
                }
                z36 = true;
                zC &= z36;
            }
            if (i14 < 26) {
                logger6.warn("Executing upgradeTo26...");
                if (!c.f(str, "part_nbr", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN part_nbr text");
                }
                z37 = true;
                zC &= z37;
            }
            if (i14 < 27) {
                logger6.warn("Executing upgradeTo27...");
                sQLiteDatabase2.execSQL("create table if not exists orphan_devices (_id integer primary key autoincrement, unit_id integer not null, product_nbr text not null, mac_address text not null, product_display_name text, bt_friendly_name text, image_url text, part_nbr text); ");
                z38 = true;
                zC &= z38;
            }
            if (i14 < 28) {
                logger6.warn("Executing upgradeTo28...");
                if (!c.f(str, "fitpay_user_id", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN fitpay_user_id text");
                }
                if (!c.f(str, "nfc_se_id", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN nfc_se_id text");
                }
                if (!c.a(sQLiteDatabase2, "golf_course_image_data")) {
                    sQLiteDatabase2.execSQL("create table if not exists golf_course_image_data (_id integer primary key autoincrement, device_id integer not null, global_id integer not null, version integer default 0,part_nbr text not null, image_data blob not null, gma_data blob, unl_data blob, map_type integer not null);");
                }
                z39 = true;
                zC &= z39;
            }
            if (i14 < 29) {
                logger6.warn("Executing upgradeTo29...");
                if (!c.f(str, "application_key", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN application_key text");
                }
                z44 = true;
                zC &= z44;
            }
            if (i14 < 30) {
                logger6.warn("Executing upgradeTo30...");
                if (!c.f(str, "multi_link_support", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN multi_link_support integer default 0");
                }
                z45 = true;
                zC &= z45;
            }
            if (i14 < 31) {
                logger6.warn("Executing upgradeTo31...");
                if (!c.f(str, "activity_course_capable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN activity_course_capable integer default 0");
                }
                z46 = true;
                zC &= z46;
            }
            if (i14 < 32) {
                logger6.warn("Executing upgradeTo32...");
                sQLiteDatabase2.execSQL("drop table if exists device_capabilities");
                z47 = true;
                zC &= z47;
            }
            if (i14 < 33) {
                logger6.warn("Executing upgradeTo33...");
                if (!c.a(sQLiteDatabase2, "golf_course_image_data")) {
                    sQLiteDatabase2.execSQL("create table if not exists golf_course_image_data (_id integer primary key autoincrement, device_id integer not null, global_id integer not null, version integer default 0,part_nbr text not null, image_data blob not null, gma_data blob, unl_data blob, map_type integer not null);");
                } else if (!c.f("golf_course_image_data", "version", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE golf_course_image_data ADD COLUMN version integer default 0");
                }
                z48 = true;
                zC &= z48;
            }
            if (i14 < 34) {
                logger6.warn("Executing upgradeTo34...");
                if (!c.a(sQLiteDatabase2, "golf_downloaded_course")) {
                    sQLiteDatabase2.execSQL("create table if not exists golf_downloaded_course (_id integer primary key autoincrement, android_download_id integer, build_id integer not null, global_layout_id integer not null, binary blob, download_mgr_status_reason_id integer, download_status_id integer not null, saved_timestamp integer not null, name text, street text, city text, state text, postal_code text, country text, semi_circle_latitude integer not null, semi_circle_longitude integer not null, website_url text, email text, telephone text, telephone_extension text, hole_count integer, membership_type_id integer not null, designer text, year_designed text, map_type integer default 0, version integer default 0);");
                } else if (!c.f("golf_downloaded_course", "version", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE golf_downloaded_course ADD COLUMN version integer default 0");
                }
                z74 = true;
                zC &= z74;
            }
            if (i14 < 35) {
                logger6.warn("Executing upgradeTo35...");
                if (!c.f(str, "nfc_capable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN nfc_capable integer default 0");
                }
                z49 = true;
                zC &= z49;
            }
            if (i14 < 36) {
                logger6.warn("Executing upgradeTo36...");
                if (!c.f(str, "solarPanelUtilizationCapable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN solarPanelUtilizationCapable integer default 0");
                }
                z54 = true;
                zC &= z54;
            }
            if (i14 < 37) {
                logger6.warn("Executing upgradeTo37...");
                if (!c.f(str, "gcj02_course_capable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN gcj02_course_capable integer default 0");
                }
                z55 = true;
                zC &= z55;
            }
            if (i14 < 38) {
                logger6.warn("Executing upgradeTo38...");
                if (!c.f(str, "lowHrAlertCapable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN lowHrAlertCapable integer default 0");
                }
                z56 = true;
                zC &= z56;
            }
            if (i14 < 39) {
                logger6.warn("Executing upgradeTo39...");
                if (!c.f(str, "abnormalHeartRateAlertCapable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN abnormalHeartRateAlertCapable integer default 0");
                }
                z57 = true;
                zC &= z57;
            }
            if (i14 < 40) {
                logger6.warn("Executing upgradeTo40...");
                if (!c.f(str, "deviceSettingsFileName", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN deviceSettingsFileName text");
                }
                z58 = true;
                zC &= z58;
            }
            if (i14 < 41) {
                logger6.warn("Executing upgradeTo41...");
                if (!c.f(str, "sku_image_defaultWatchFace_url", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_defaultWatchFace_url text");
                }
                if (!c.f(str, "sku_image_defaultWatchFaceBlank_url", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_defaultWatchFaceBlank_url text");
                }
                if (!c.f(str, "sku_image_sideProfile_url", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_sideProfile_url text");
                }
                if (!c.f(str, "sku_image_tutorial_url", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_tutorial_url text");
                }
                if (!c.f(str, "sku_image_option1_url", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option1_url text");
                }
                if (!c.f(str, "sku_image_option2_url", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option2_url text");
                }
                if (!c.f(str, "sku_image_option3_url", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN sku_image_option3_url text");
                }
                z59 = true;
                zC &= z59;
            }
            if (i14 < 42) {
                logger6.warn("Executing upgradeTo42...");
                if (!c.f(str, "trainingStatusPauseCapable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN trainingStatusPauseCapable integer default 0");
                }
                z64 = true;
                zC &= z64;
            }
            if (i14 < 43) {
                logger6.warn("Executing upgradeTo43...");
                if (!c.f(str, "trainingStatusCapable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN trainingStatusCapable integer default 0");
                }
                z65 = true;
                zC &= z65;
            }
            if (i14 < 44) {
                logger6.warn("Executing upgradeTo44...");
                c.g(sQLiteDatabase2);
                z66 = true;
                zC &= z66;
            }
            if (i14 < 45) {
                logger4 = c.f144506a;
                logger4.warn("Executing upgradeTo45...");
                if (!c.f(str, "measurementUnitSettingCapable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN measurementUnitSettingCapable integer default 0");
                }
                z73 = true;
                zC &= z73;
            }
            if (i14 < 46) {
                logger3 = c.f144506a;
                logger3.warn("Executing upgradeTo46...");
                if (!c.f(str, "spectatorMessagingCapable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN spectatorMessagingCapable integer default 0");
                }
                z69 = true;
                zC &= z69;
            }
            if (i14 < 47) {
                logger2 = c.f144506a;
                logger2.warn("Executing upgradeTo47...");
                if (!c.f(str, "powerCurveCapable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN powerCurveCapable integer default 0");
                }
                if (!c.f(str, "secondaryWorkoutStepTargetCapable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN secondaryWorkoutStepTargetCapable integer default 0");
                }
                z68 = true;
                zC &= z68;
            }
            if (i14 < 48) {
                logger = c.f144506a;
                logger.warn("Executing upgradeTo48...");
                if (!c.f("devices", "assistancePlusCapable", sQLiteDatabase2)) {
                    sQLiteDatabase2.execSQL("ALTER TABLE devices ADD COLUMN assistancePlusCapable integer default 0");
                }
                z67 = true;
                zC &= z67;
            }
            if (i14 < 49) {
                zC &= c.i(sQLiteDatabase2);
            }
            if (i14 < 50) {
                zC &= c.j(sQLiteDatabase2);
            }
            if (i14 < 51) {
                zC &= c.k(sQLiteDatabase2);
            }
            if (i14 < 52) {
                zC &= c.l(sQLiteDatabase2);
            }
            if (i14 < 53) {
                zC &= c.m(sQLiteDatabase2);
            }
            if (i14 < 54) {
                zC &= c.n(sQLiteDatabase2);
            }
            if (i14 < 55) {
                zC &= c.o(sQLiteDatabase2);
            }
            if (i14 < 56) {
                zC &= c.p(sQLiteDatabase2);
            }
            if (i14 < 57) {
                zC &= c.q(sQLiteDatabase2);
            }
            if (i14 < 58) {
                zC &= c.r(sQLiteDatabase2);
            }
            if (i14 < 59) {
                zC &= c.s(sQLiteDatabase2);
            }
            if (i14 < 60) {
                zC &= c.t(sQLiteDatabase2);
            }
            if (i14 < 61) {
                zC &= c.u(sQLiteDatabase2);
            }
            if (i14 < 62) {
                zC &= c.v(sQLiteDatabase2);
            }
            if (i14 < 63) {
                zC &= c.w(sQLiteDatabase2);
            }
            if (i14 < 64) {
                zC &= c.x(sQLiteDatabase2);
            }
            if (i14 < 65) {
                zC &= c.y(sQLiteDatabase2);
            }
            if (i14 < 66) {
                zC &= c.z(sQLiteDatabase2);
            }
            if (i14 < 67) {
                zC &= c.A(sQLiteDatabase2);
            }
            if (i14 < 68) {
                zC &= c.B(sQLiteDatabase2);
            }
            if (i14 < 69) {
                zC &= c.C(sQLiteDatabase2);
            }
            if (!zC) {
                logger5.warn(j.g(i14, i15, "onUpgrade: successful upgrade from version [", "] to [", "]"));
                return;
            }
            logger5.error(j.g(i14, i15, "onUpgrade: failure from version [", "] to [", "]. As a fallback, dropping and re-creating the database..."));
            sQLiteDatabase2.execSQL("drop table if exists json");
            sQLiteDatabase2.execSQL("drop table if exists json_steps");
            sQLiteDatabase2.execSQL("drop table if exists json_myfitnesspal_calories");
            sQLiteDatabase2.execSQL("drop table if exists json_activities");
            sQLiteDatabase2.execSQL("drop table if exists json_courses");
            sQLiteDatabase2.execSQL("drop table if exists devices");
            sQLiteDatabase2.execSQL("drop table if exists orphan_devices");
            sQLiteDatabase2.execSQL("drop table if exists device_permission");
            sQLiteDatabase2.execSQL("drop table if exists golf_downloaded_course");
            sQLiteDatabase2.execSQL("drop table if exists golf_course_image_data");
            onCreate(sQLiteDatabase);
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
