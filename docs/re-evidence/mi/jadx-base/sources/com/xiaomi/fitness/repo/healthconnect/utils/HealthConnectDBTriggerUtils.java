package com.xiaomi.fitness.repo.healthconnect.utils;

import android.app.Application;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.ActiveCaloriesBurnedRecord;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.OxygenSaturationRecord;
import androidx.health.connect.client.records.SleepSessionRecord;
import androidx.health.connect.client.records.StepsRecord;
import androidx.sqlite.db.SupportSQLiteDatabase;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectPreference;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00140\u0013H\u0082@¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0006\u0010\u0018\u001a\u00020\u0010J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectDBTriggerUtils;", "", "<init>", "()V", "TAG", "", "HEALTH_CONNECT_SYNC_INFO_TABLE_NAME", "INSERT_TRIGGER_COLUMN_STR", "STEP_TRIGGER_INFO", "Lcom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectDBTriggerUtils$TriggerInfo;", "HR_TRIGGER_INFO", "CALORIE_TRIGGER_INFO", "SLEEP_TRIGGER_INFO", "SPO2_TRIGGER_INFO", "REPORT_INSERT_TRIGGER_INFO", "updateTriggersIfNeeded", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectAuthedRecordTypeInfo", "Lkotlin/Pair;", "", "addDailyInsertTriggerInner", "triggerInfo", "addReportInsertTrigger", "removeTriggers", "removeTriggerInner", "triggerName", "TriggerInfo", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHealthConnectDBTriggerUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HealthConnectDBTriggerUtils.kt\ncom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectDBTriggerUtils\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,230:1\n1863#2,2:231\n1863#2,2:233\n*S KotlinDebug\n*F\n+ 1 HealthConnectDBTriggerUtils.kt\ncom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectDBTriggerUtils\n*L\n81#1:231,2\n85#1:233,2\n*E\n"})
public final class HealthConnectDBTriggerUtils {

    @NotNull
    private static final TriggerInfo CALORIE_TRIGGER_INFO;

    @NotNull
    private static final String HEALTH_CONNECT_SYNC_INFO_TABLE_NAME = "health_connect_sync_info";

    @NotNull
    private static final String INSERT_TRIGGER_COLUMN_STR = "`uid`, `dataType`, `type`, `sid`, `key`, `time`, `timeZoneOffset`, `value`, `status`, `isDeleted`";

    @NotNull
    private static final TriggerInfo REPORT_INSERT_TRIGGER_INFO;

    @NotNull
    private static final String TAG = "HealthConnectDBTriggerUtils";

    @NotNull
    public static final HealthConnectDBTriggerUtils INSTANCE = new HealthConnectDBTriggerUtils();

    @NotNull
    private static final TriggerInfo STEP_TRIGGER_INFO = new TriggerInfo("_trigger_health_connect_step_insert", FitnessDBConstants.TABLE_STEP, "step", null, 8, null);

    @NotNull
    private static final TriggerInfo HR_TRIGGER_INFO = new TriggerInfo("_trigger_health_connect_hr_insert", FitnessDBConstants.TABLE_HEART_RATE, "hr", "_trigger_health_connect_hr_delete");

    @NotNull
    private static final TriggerInfo SLEEP_TRIGGER_INFO = new TriggerInfo("_trigger_health_connect_sleep_insert", FitnessDBConstants.TABLE_SLEEP, "sleep", "_trigger_health_connect_sleep_delete");

    @NotNull
    private static final TriggerInfo SPO2_TRIGGER_INFO = new TriggerInfo("_trigger_health_connect_spo2_insert", "spo2_record", "spo2", "_trigger_health_connect_spo2_delete");

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectDBTriggerUtils$collectAuthedRecordTypeInfo$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectDBTriggerUtils", f = "HealthConnectDBTriggerUtils.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {110, 119, 128, 137, 146}, m = "collectAuthedRecordTypeInfo", n = {"addTriggers", "deleteTriggers", "addTriggers", "deleteTriggers", "addTriggers", "deleteTriggers", "addTriggers", "deleteTriggers", "addTriggers", "deleteTriggers"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectDBTriggerUtils.this.collectAuthedRecordTypeInfo(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectDBTriggerUtils$updateTriggersIfNeeded$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectDBTriggerUtils", f = "HealthConnectDBTriggerUtils.kt", i = {0, 1}, l = {80, 91}, m = "updateTriggersIfNeeded", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class C28191 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28191(Continuation<? super C28191> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HealthConnectDBTriggerUtils.this.updateTriggersIfNeeded(this);
        }
    }

    static {
        int i = 8;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        CALORIE_TRIGGER_INFO = new TriggerInfo("_trigger_health_connect_calorie_insert", FitnessDBConstants.TABLE_CALORIE, "calorie", str, i, defaultConstructorMarker);
        REPORT_INSERT_TRIGGER_INFO = new TriggerInfo("_trigger_health_connect_report_insert", "sport_report", "sport", str, i, defaultConstructorMarker);
    }

    private HealthConnectDBTriggerUtils() {
    }

    private final void addDailyInsertTriggerInner(TriggerInfo triggerInfo) {
        SupportSQLiteDatabase writableDatabase = FitnessDatabase.INSTANCE.getInstance().getOpenHelper().getWritableDatabase();
        String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
        if (userId == null) {
            userId = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER IF NOT EXISTS ");
        sb.append(triggerInfo.getInsertTriggerName());
        sb.append(" AFTER INSERT ON ");
        sb.append(" " + triggerInfo.getOriginDbName() + " FOR EACH ROW WHEN new.isDeleted=0 AND new.time >= " + HealthConnectPreference.INSTANCE.getKEY_LAST_START_SYNC_TIME() + " ");
        sb.append(" BEGIN INSERT INTO ");
        sb.append(HEALTH_CONNECT_SYNC_INFO_TABLE_NAME);
        sb.append(" (");
        sb.append(INSERT_TRIGGER_COLUMN_STR);
        sb.append(")");
        sb.append(" VALUES(");
        sb.append(userId);
        sb.append(", 0, \"");
        sb.append(triggerInfo.getKey());
        sb.append("\" , new.sid, new.key, new.time, new.zoneOffsetInSec , new.value, 0, 0);");
        sb.append("END;");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        Logger.d(TAG, "add trigger:" + string);
        writableDatabase.execSQL(string);
    }

    private final void addReportInsertTrigger() {
        SupportSQLiteDatabase writableDatabase = FitnessDatabase.INSTANCE.getInstance().getOpenHelper().getWritableDatabase();
        String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
        if (userId == null) {
            userId = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TRIGGER IF NOT EXISTS ");
        TriggerInfo triggerInfo = REPORT_INSERT_TRIGGER_INFO;
        sb.append(triggerInfo.getInsertTriggerName());
        sb.append(" AFTER INSERT ON ");
        sb.append(" " + triggerInfo.getOriginDbName() + " FOR EACH ROW WHEN new.isDeleted=0 AND new.time >= " + HealthConnectPreference.INSTANCE.getKEY_LAST_START_SYNC_TIME() + " ");
        sb.append(" BEGIN INSERT INTO ");
        sb.append(HEALTH_CONNECT_SYNC_INFO_TABLE_NAME);
        sb.append(" (");
        sb.append(INSERT_TRIGGER_COLUMN_STR);
        sb.append(")");
        sb.append(" VALUES(");
        sb.append(userId);
        sb.append(", 1, \"");
        sb.append(triggerInfo.getKey());
        sb.append("\" ,new.sid, new.key, new.time, new.zoneOffsetInSec , new.value, 0, 0);");
        sb.append("END;");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        writableDatabase.execSQL(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:48:0x013f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0149  */
    /* JADX WARN: Code duplicated, block: B:53:0x014f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0172 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    /* JADX WARN: Code duplicated, block: B:60:0x017d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object collectAuthedRecordTypeInfo(Continuation<? super Pair<? extends List<TriggerInfo>, ? extends List<TriggerInfo>>> continuation) {
        AnonymousClass1 anonymousClass1;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objHasPermission = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                arrayList = (ArrayList) anonymousClass1.L$1;
                arrayList2 = (ArrayList) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objHasPermission);
            } else if (i2 == 2) {
                arrayList = (ArrayList) anonymousClass1.L$1;
                arrayList3 = (ArrayList) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objHasPermission);
                if (((Boolean) objHasPermission).booleanValue()) {
                    arrayList3.add(HR_TRIGGER_INFO);
                } else {
                    arrayList.add(HR_TRIGGER_INFO);
                }
                HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
                Application application = ApplicationExtKt.getApplication();
                String writePermission = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(SleepSessionRecord.class));
                anonymousClass1.L$0 = arrayList3;
                anonymousClass1.L$1 = arrayList;
                anonymousClass1.label = 3;
                objHasPermission = healthConnectUtils.hasPermission(application, writePermission, anonymousClass1);
                if (objHasPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList4 = arrayList3;
                if (((Boolean) objHasPermission).booleanValue()) {
                    arrayList4.add(SLEEP_TRIGGER_INFO);
                } else {
                    arrayList.add(SLEEP_TRIGGER_INFO);
                }
                HealthConnectUtils healthConnectUtils2 = HealthConnectUtils.INSTANCE;
                Application application2 = ApplicationExtKt.getApplication();
                String writePermission2 = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(ActiveCaloriesBurnedRecord.class));
                anonymousClass1.L$0 = arrayList4;
                anonymousClass1.L$1 = arrayList;
                anonymousClass1.label = 4;
                objHasPermission = healthConnectUtils2.hasPermission(application2, writePermission2, anonymousClass1);
                if (objHasPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList5 = arrayList4;
                if (((Boolean) objHasPermission).booleanValue()) {
                    arrayList5.add(CALORIE_TRIGGER_INFO);
                } else {
                    arrayList.add(CALORIE_TRIGGER_INFO);
                }
                HealthConnectUtils healthConnectUtils3 = HealthConnectUtils.INSTANCE;
                Application application3 = ApplicationExtKt.getApplication();
                String writePermission3 = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(OxygenSaturationRecord.class));
                anonymousClass1.L$0 = arrayList5;
                anonymousClass1.L$1 = arrayList;
                anonymousClass1.label = 5;
                objHasPermission = healthConnectUtils3.hasPermission(application3, writePermission3, anonymousClass1);
                if (objHasPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList6 = arrayList;
                arrayList7 = arrayList5;
            } else if (i2 == 3) {
                arrayList = (ArrayList) anonymousClass1.L$1;
                arrayList4 = (ArrayList) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objHasPermission);
                if (((Boolean) objHasPermission).booleanValue()) {
                    arrayList4.add(SLEEP_TRIGGER_INFO);
                } else {
                    arrayList.add(SLEEP_TRIGGER_INFO);
                }
                HealthConnectUtils healthConnectUtils4 = HealthConnectUtils.INSTANCE;
                Application application4 = ApplicationExtKt.getApplication();
                String writePermission4 = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(ActiveCaloriesBurnedRecord.class));
                anonymousClass1.L$0 = arrayList4;
                anonymousClass1.L$1 = arrayList;
                anonymousClass1.label = 4;
                objHasPermission = healthConnectUtils4.hasPermission(application4, writePermission4, anonymousClass1);
                if (objHasPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList5 = arrayList4;
                if (((Boolean) objHasPermission).booleanValue()) {
                    arrayList5.add(CALORIE_TRIGGER_INFO);
                } else {
                    arrayList.add(CALORIE_TRIGGER_INFO);
                }
                HealthConnectUtils healthConnectUtils5 = HealthConnectUtils.INSTANCE;
                Application application5 = ApplicationExtKt.getApplication();
                String writePermission5 = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(OxygenSaturationRecord.class));
                anonymousClass1.L$0 = arrayList5;
                anonymousClass1.L$1 = arrayList;
                anonymousClass1.label = 5;
                objHasPermission = healthConnectUtils5.hasPermission(application5, writePermission5, anonymousClass1);
                if (objHasPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList6 = arrayList;
                arrayList7 = arrayList5;
            } else if (i2 == 4) {
                arrayList = (ArrayList) anonymousClass1.L$1;
                arrayList5 = (ArrayList) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objHasPermission);
                if (((Boolean) objHasPermission).booleanValue()) {
                    arrayList5.add(CALORIE_TRIGGER_INFO);
                } else {
                    arrayList.add(CALORIE_TRIGGER_INFO);
                }
                HealthConnectUtils healthConnectUtils6 = HealthConnectUtils.INSTANCE;
                Application application6 = ApplicationExtKt.getApplication();
                String writePermission6 = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(OxygenSaturationRecord.class));
                anonymousClass1.L$0 = arrayList5;
                anonymousClass1.L$1 = arrayList;
                anonymousClass1.label = 5;
                objHasPermission = healthConnectUtils6.hasPermission(application6, writePermission6, anonymousClass1);
                if (objHasPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                arrayList6 = arrayList;
                arrayList7 = arrayList5;
            } else {
                if (i2 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList6 = (ArrayList) anonymousClass1.L$1;
                arrayList7 = (ArrayList) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objHasPermission);
            }
            if (((Boolean) objHasPermission).booleanValue()) {
                arrayList7.add(SPO2_TRIGGER_INFO);
            } else {
                arrayList6.add(SPO2_TRIGGER_INFO);
            }
            return new Pair(arrayList7, arrayList6);
        }
        ResultKt.throwOnFailure(objHasPermission);
        ArrayList arrayList8 = new ArrayList();
        arrayList = new ArrayList();
        HealthConnectUtils healthConnectUtils7 = HealthConnectUtils.INSTANCE;
        Application application7 = ApplicationExtKt.getApplication();
        String writePermission7 = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(StepsRecord.class));
        anonymousClass1.L$0 = arrayList8;
        anonymousClass1.L$1 = arrayList;
        anonymousClass1.label = 1;
        Object objHasPermission2 = healthConnectUtils7.hasPermission(application7, writePermission7, anonymousClass1);
        if (objHasPermission2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        arrayList2 = arrayList8;
        objHasPermission = objHasPermission2;
        if (((Boolean) objHasPermission).booleanValue()) {
            arrayList2.add(STEP_TRIGGER_INFO);
        } else {
            arrayList.add(STEP_TRIGGER_INFO);
        }
        HealthConnectUtils healthConnectUtils8 = HealthConnectUtils.INSTANCE;
        Application application8 = ApplicationExtKt.getApplication();
        String writePermission8 = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(HeartRateRecord.class));
        anonymousClass1.L$0 = arrayList2;
        anonymousClass1.L$1 = arrayList;
        anonymousClass1.label = 2;
        objHasPermission = healthConnectUtils8.hasPermission(application8, writePermission8, anonymousClass1);
        if (objHasPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        arrayList3 = arrayList2;
        if (((Boolean) objHasPermission).booleanValue()) {
            arrayList3.add(HR_TRIGGER_INFO);
        } else {
            arrayList.add(HR_TRIGGER_INFO);
        }
        HealthConnectUtils healthConnectUtils9 = HealthConnectUtils.INSTANCE;
        Application application9 = ApplicationExtKt.getApplication();
        String writePermission9 = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(SleepSessionRecord.class));
        anonymousClass1.L$0 = arrayList3;
        anonymousClass1.L$1 = arrayList;
        anonymousClass1.label = 3;
        objHasPermission = healthConnectUtils9.hasPermission(application9, writePermission9, anonymousClass1);
        if (objHasPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        arrayList4 = arrayList3;
        if (((Boolean) objHasPermission).booleanValue()) {
            arrayList4.add(SLEEP_TRIGGER_INFO);
        } else {
            arrayList.add(SLEEP_TRIGGER_INFO);
        }
        HealthConnectUtils healthConnectUtils10 = HealthConnectUtils.INSTANCE;
        Application application10 = ApplicationExtKt.getApplication();
        String writePermission10 = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(ActiveCaloriesBurnedRecord.class));
        anonymousClass1.L$0 = arrayList4;
        anonymousClass1.L$1 = arrayList;
        anonymousClass1.label = 4;
        objHasPermission = healthConnectUtils10.hasPermission(application10, writePermission10, anonymousClass1);
        if (objHasPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        arrayList5 = arrayList4;
        if (((Boolean) objHasPermission).booleanValue()) {
            arrayList5.add(CALORIE_TRIGGER_INFO);
        } else {
            arrayList.add(CALORIE_TRIGGER_INFO);
        }
        HealthConnectUtils healthConnectUtils11 = HealthConnectUtils.INSTANCE;
        Application application11 = ApplicationExtKt.getApplication();
        String writePermission11 = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(OxygenSaturationRecord.class));
        anonymousClass1.L$0 = arrayList5;
        anonymousClass1.L$1 = arrayList;
        anonymousClass1.label = 5;
        objHasPermission = healthConnectUtils11.hasPermission(application11, writePermission11, anonymousClass1);
        if (objHasPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        arrayList6 = arrayList;
        arrayList7 = arrayList5;
        if (((Boolean) objHasPermission).booleanValue()) {
            arrayList7.add(SPO2_TRIGGER_INFO);
        } else {
            arrayList6.add(SPO2_TRIGGER_INFO);
        }
        return new Pair(arrayList7, arrayList6);
    }

    private final void removeTriggerInner(String triggerName) {
        FitnessDatabase.INSTANCE.getInstance().getOpenHelper().getWritableDatabase().execSQL("DROP TRIGGER IF EXISTS " + triggerName);
    }

    public final void removeTriggers() {
        try {
            removeTriggerInner(STEP_TRIGGER_INFO.getInsertTriggerName());
            removeTriggerInner(HR_TRIGGER_INFO.getInsertTriggerName());
            removeTriggerInner(CALORIE_TRIGGER_INFO.getInsertTriggerName());
            removeTriggerInner(SPO2_TRIGGER_INFO.getInsertTriggerName());
            removeTriggerInner(SLEEP_TRIGGER_INFO.getInsertTriggerName());
            removeTriggerInner(REPORT_INSERT_TRIGGER_INFO.getInsertTriggerName());
            Logger.i(TAG, "remove all trigger!!");
        } catch (Exception e) {
            Logger.e(TAG, "remove trigger exception:" + e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0114 A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:13:0x002e, B:44:0x010c, B:46:0x0114, B:47:0x011d, B:20:0x0042, B:32:0x0080, B:33:0x008c, B:35:0x0092, B:36:0x00b6, B:37:0x00c0, B:39:0x00c6, B:40:0x00ee, B:23:0x0049, B:25:0x0055, B:28:0x0067, B:48:0x012c, B:52:0x0146), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011d A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:13:0x002e, B:44:0x010c, B:46:0x0114, B:47:0x011d, B:20:0x0042, B:32:0x0080, B:33:0x008c, B:35:0x0092, B:36:0x00b6, B:37:0x00c0, B:39:0x00c6, B:40:0x00ee, B:23:0x0049, B:25:0x0055, B:28:0x0067, B:48:0x012c, B:52:0x0146), top: B:57:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateTriggersIfNeeded(@NotNull Continuation<? super Unit> continuation) {
        C28191 c28191;
        HealthConnectDBTriggerUtils healthConnectDBTriggerUtils;
        HealthConnectDBTriggerUtils healthConnectDBTriggerUtils2;
        if (continuation instanceof C28191) {
            c28191 = (C28191) continuation;
            int i = c28191.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28191.label = i - Integer.MIN_VALUE;
            } else {
                c28191 = new C28191(continuation);
            }
        } else {
            c28191 = new C28191(continuation);
        }
        Object objCollectAuthedRecordTypeInfo = c28191.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28191.label;
        boolean z = true;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    healthConnectDBTriggerUtils = (HealthConnectDBTriggerUtils) c28191.L$0;
                    ResultKt.throwOnFailure(objCollectAuthedRecordTypeInfo);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    healthConnectDBTriggerUtils2 = (HealthConnectDBTriggerUtils) c28191.L$0;
                    ResultKt.throwOnFailure(objCollectAuthedRecordTypeInfo);
                }
                if (((Boolean) objCollectAuthedRecordTypeInfo).booleanValue()) {
                    healthConnectDBTriggerUtils2.addReportInsertTrigger();
                    Logger.i(TAG, "add sport report trigger");
                } else {
                    healthConnectDBTriggerUtils2.removeTriggerInner(REPORT_INSERT_TRIGGER_INFO.getInsertTriggerName());
                    Logger.i(TAG, "remove sport report trigger");
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(objCollectAuthedRecordTypeInfo);
            AccountManager.Companion companion = AccountManager.INSTANCE;
            if (AccountManagerExtKt.getInstance(companion).isLogin() && RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() != 0) {
                HealthConnectPreference.INSTANCE.setKEY_LAST_START_SYNC_TIME(System.currentTimeMillis() / ((long) 1000));
                c28191.L$0 = this;
                c28191.label = 1;
                objCollectAuthedRecordTypeInfo = collectAuthedRecordTypeInfo(c28191);
                if (objCollectAuthedRecordTypeInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
                healthConnectDBTriggerUtils = this;
            }
            boolean zIsLogin = AccountManagerExtKt.getInstance(companion).isLogin();
            if (RegionExtKt.getInstance(RegionManager.INSTANCE).getCurrentRegion().length() != 0) {
                z = false;
            }
            Logger.i(TAG, "user has not login or region is empty:" + zIsLogin + " - " + z);
            return Unit.INSTANCE;
            Pair pair = (Pair) objCollectAuthedRecordTypeInfo;
            for (TriggerInfo triggerInfo : (Iterable) pair.getFirst()) {
                INSTANCE.addDailyInsertTriggerInner(triggerInfo);
                Logger.i(TAG, "add trigger: " + triggerInfo.getInsertTriggerName());
            }
            for (TriggerInfo triggerInfo2 : (Iterable) pair.getSecond()) {
                INSTANCE.removeTriggerInner(triggerInfo2.getInsertTriggerName());
                Logger.i(TAG, "remove trigger: " + triggerInfo2.getInsertTriggerName());
            }
            HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
            Application application = ApplicationExtKt.getApplication();
            String writePermission = HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(ExerciseSessionRecord.class));
            c28191.L$0 = healthConnectDBTriggerUtils;
            c28191.label = 2;
            objCollectAuthedRecordTypeInfo = healthConnectUtils.hasPermission(application, writePermission, c28191);
            if (objCollectAuthedRecordTypeInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            healthConnectDBTriggerUtils2 = healthConnectDBTriggerUtils;
            if (((Boolean) objCollectAuthedRecordTypeInfo).booleanValue()) {
                healthConnectDBTriggerUtils2.addReportInsertTrigger();
                Logger.i(TAG, "add sport report trigger");
            } else {
                healthConnectDBTriggerUtils2.removeTriggerInner(REPORT_INSERT_TRIGGER_INFO.getInsertTriggerName());
                Logger.i(TAG, "remove sport report trigger");
            }
            return Unit.INSTANCE;
        } catch (Exception e) {
            Logger.e(TAG, "addTriggers exception:" + e.getMessage(), e);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/utils/HealthConnectDBTriggerUtils$TriggerInfo;", "", "insertTriggerName", "", "originDbName", "key", "deleteTriggerName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getInsertTriggerName", "()Ljava/lang/String;", "getOriginDbName", "getKey", "getDeleteTriggerName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TriggerInfo {

        @Nullable
        private final String deleteTriggerName;

        @NotNull
        private final String insertTriggerName;

        @Nullable
        private final String key;

        @NotNull
        private final String originDbName;

        public TriggerInfo(@NotNull String insertTriggerName, @NotNull String originDbName, @Nullable String str, @Nullable String str2) {
            Intrinsics.checkNotNullParameter(insertTriggerName, "insertTriggerName");
            Intrinsics.checkNotNullParameter(originDbName, "originDbName");
            this.insertTriggerName = insertTriggerName;
            this.originDbName = originDbName;
            this.key = str;
            this.deleteTriggerName = str2;
        }

        public static /* synthetic */ TriggerInfo copy$default(TriggerInfo triggerInfo, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = triggerInfo.insertTriggerName;
            }
            if ((i & 2) != 0) {
                str2 = triggerInfo.originDbName;
            }
            if ((i & 4) != 0) {
                str3 = triggerInfo.key;
            }
            if ((i & 8) != 0) {
                str4 = triggerInfo.deleteTriggerName;
            }
            return triggerInfo.copy(str, str2, str3, str4);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getInsertTriggerName() {
            return this.insertTriggerName;
        }

        @NotNull
        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOriginDbName() {
            return this.originDbName;
        }

        @Nullable
        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @Nullable
        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getDeleteTriggerName() {
            return this.deleteTriggerName;
        }

        @NotNull
        public final TriggerInfo copy(@NotNull String insertTriggerName, @NotNull String originDbName, @Nullable String key, @Nullable String deleteTriggerName) {
            Intrinsics.checkNotNullParameter(insertTriggerName, "insertTriggerName");
            Intrinsics.checkNotNullParameter(originDbName, "originDbName");
            return new TriggerInfo(insertTriggerName, originDbName, key, deleteTriggerName);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TriggerInfo)) {
                return false;
            }
            TriggerInfo triggerInfo = (TriggerInfo) other;
            return Intrinsics.areEqual(this.insertTriggerName, triggerInfo.insertTriggerName) && Intrinsics.areEqual(this.originDbName, triggerInfo.originDbName) && Intrinsics.areEqual(this.key, triggerInfo.key) && Intrinsics.areEqual(this.deleteTriggerName, triggerInfo.deleteTriggerName);
        }

        @Nullable
        public final String getDeleteTriggerName() {
            return this.deleteTriggerName;
        }

        @NotNull
        public final String getInsertTriggerName() {
            return this.insertTriggerName;
        }

        @Nullable
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getOriginDbName() {
            return this.originDbName;
        }

        public int hashCode() {
            int iHashCode = ((this.insertTriggerName.hashCode() * 31) + this.originDbName.hashCode()) * 31;
            String str = this.key;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deleteTriggerName;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TriggerInfo(insertTriggerName=" + this.insertTriggerName + ", originDbName=" + this.originDbName + ", key=" + this.key + ", deleteTriggerName=" + this.deleteTriggerName + ")";
        }

        public /* synthetic */ TriggerInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i & 8) != 0 ? null : str4);
        }
    }
}
