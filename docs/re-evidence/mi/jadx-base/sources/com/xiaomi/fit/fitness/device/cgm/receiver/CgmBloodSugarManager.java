package com.xiaomi.fit.fitness.device.cgm.receiver;

import com.xiaomi.fit.data.common.constant.FitnessTestPref;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.db.FitnessSyncDataBase;
import com.xiaomi.fit.fitness.db.dao.CgmGlucoseDao;
import com.xiaomi.fit.fitness.db.dao.CgmGlucoseEntity;
import com.xiaomi.fit.fitness.device.cgm.receiver.CgmBloodSugarManager;
import com.xiaomi.fit.fitness.device.cgm.thirdparty.ThirdPartyDataManager;
import com.xiaomi.fit.fitness.device.cgm.utils.CGMDeviceUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.data.extentions.BloodSugarItemExtKt;
import com.xiaomi.fit.fitness.export.data.item.BloodSugarItem;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.export.sp.FitnessDataPreference;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.blood_sugar.BloodSugarExtKt;
import com.xiaomi.fitness.blood_sugar.BloodSugarManager;
import com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingManager;
import com.xiaomi.fitness.blood_sugar.BloodSugarRemindSettingModel;
import com.xiaomi.fitness.blood_sugar.GlucoseValue;
import com.xiaomi.fitness.device.manager.OnSpecificDeviceStatusListener;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.health.export.HealthPageExtKt;
import com.xiaomi.fitness.health.export.IHealthPage;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import defpackage.h4b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 '2\u00020\u0001:\u0001'B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001e\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0010H\u0002J\u001e\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u0017H\u0002J\b\u0010\u001c\u001a\u00020\u000bH\u0002J\u001a\u0010\u001d\u001a\u00020\u000b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0018\u0010!\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020#H\u0002J\u001e\u0010$\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00120\u0017H\u0002J\b\u0010&\u001a\u00020\u000bH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006("}, d2 = {"Lcom/xiaomi/fit/fitness/device/cgm/receiver/CgmBloodSugarManager;", "", "<init>", "()V", "glucoseDao", "Lcom/xiaomi/fit/fitness/db/dao/CgmGlucoseDao;", "getGlucoseDao", "()Lcom/xiaomi/fit/fitness/db/dao/CgmGlucoseDao;", "glucoseDao$delegate", "Lkotlin/Lazy;", "getGlucoseListAllByTimePeriod", "", "addGlucoseDataListener", "deviceModel", "Lcom/xiaomi/fitness/device/manager/export/WearableDeviceModel;", "convertGlucoseToItem", "Lcom/xiaomi/fit/fitness/export/data/item/BloodSugarItem;", "glucose", "Lcom/xiaomi/fitness/blood_sugar/GlucoseValue;", "convertGlucoseListToItemAndRecord", "did", "", "glucoseList", "", "onRealtimeGlucoseChanged", "item", "recordBloodSugarItem", "itemList", "addCgmDeviceStatusListener", "onCgmConnectedStatusChanged", "isConnected", "", "isAbnormalNotifyTime", "notifyAbnormalGlucose", "level", "", "insertGlucoseToLocalDB", "list", "uploadGlucoseToThirdPartyServer", "Companion", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCgmBloodSugarManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CgmBloodSugarManager.kt\ncom/xiaomi/fit/fitness/device/cgm/receiver/CgmBloodSugarManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,218:1\n1863#2:219\n1864#2:221\n1#3:220\n*S KotlinDebug\n*F\n+ 1 CgmBloodSugarManager.kt\ncom/xiaomi/fit/fitness/device/cgm/receiver/CgmBloodSugarManager\n*L\n97#1:219\n97#1:221\n*E\n"})
public final class CgmBloodSugarManager {
    private static final int LIMIT_UPLOAD_RAW_DATA = 50;

    @NotNull
    private static final String TAG = "CgmBloodSugarManager";

    /* JADX INFO: renamed from: glucoseDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy glucoseDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ns3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CgmBloodSugarManager.glucoseDao_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<CgmBloodSugarManager> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: os3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return CgmBloodSugarManager.instance_delegate$lambda$4();
        }
    });

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\u0004\u001a\u00020\u00058FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fit/fitness/device/cgm/receiver/CgmBloodSugarManager$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/device/cgm/receiver/CgmBloodSugarManager;", "getInstance", "()Lcom/xiaomi/fit/fitness/device/cgm/receiver/CgmBloodSugarManager;", "instance$delegate", "Lkotlin/Lazy;", "TAG", "", "LIMIT_UPLOAD_RAW_DATA", "", "fitness-sync_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final CgmBloodSugarManager getInstance() {
            return (CgmBloodSugarManager) CgmBloodSugarManager.instance$delegate.getValue();
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.cgm.receiver.CgmBloodSugarManager$insertGlucoseToLocalDB$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.cgm.receiver.CgmBloodSugarManager$insertGlucoseToLocalDB$1", f = "CgmBloodSugarManager.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nCgmBloodSugarManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CgmBloodSugarManager.kt\ncom/xiaomi/fit/fitness/device/cgm/receiver/CgmBloodSugarManager$insertGlucoseToLocalDB$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,218:1\n1863#2,2:219\n*S KotlinDebug\n*F\n+ 1 CgmBloodSugarManager.kt\ncom/xiaomi/fit/fitness/device/cgm/receiver/CgmBloodSugarManager$insertGlucoseToLocalDB$1\n*L\n178#1:219,2\n*E\n"})
    public static final class C15451 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $did;
        final /* synthetic */ List<GlucoseValue> $list;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ CgmBloodSugarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C15451(List<GlucoseValue> list, String str, CgmBloodSugarManager cgmBloodSugarManager, Continuation<? super C15451> continuation) {
            super(2, continuation);
            this.$list = list;
            this.$did = str;
            this.this$0 = cgmBloodSugarManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C15451(this.$list, this.$did, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CgmBloodSugarManager cgmBloodSugarManager;
            Iterator it;
            String str;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<GlucoseValue> list = this.$list;
                String str2 = this.$did;
                cgmBloodSugarManager = this.this$0;
                it = list.iterator();
                str = str2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) this.L$2;
                cgmBloodSugarManager = (CgmBloodSugarManager) this.L$1;
                String str3 = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                str = str3;
            }
            while (it.hasNext()) {
                GlucoseValue glucoseValue = (GlucoseValue) it.next();
                glucoseValue.getTime();
                glucoseValue.getDataType();
                long time = glucoseValue.getTime();
                int dataType = glucoseValue.getDataType();
                String strC = h4b.c(glucoseValue);
                Intrinsics.checkNotNullExpressionValue(strC, "toJsonString(...)");
                CgmGlucoseEntity cgmGlucoseEntity = new CgmGlucoseEntity(str, time, dataType, strC);
                this.L$0 = str;
                this.L$1 = cgmBloodSugarManager;
                this.L$2 = it;
                this.label = 1;
                if (cgmBloodSugarManager.getGlucoseDao().insert(new CgmGlucoseEntity[]{cgmGlucoseEntity}, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE).updateGlucoseUploadState(this.$list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.device.cgm.receiver.CgmBloodSugarManager$uploadGlucoseToThirdPartyServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.device.cgm.receiver.CgmBloodSugarManager$uploadGlucoseToThirdPartyServer$1", f = "CgmBloodSugarManager.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2}, l = {SportReportBaseParser.ReportType.algorithmDataSource, 208, 211}, m = "invokeSuspend", n = {"token", "appName", "modelList", "token", "appName", "modelList", "itemList", "token", "appName"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    public static final class C15461 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public C15461(Continuation<? super C15461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CgmBloodSugarManager.this.new C15461(continuation);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00ab A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:22:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:24:0x00bc  */
        /* JADX WARN: Code duplicated, block: B:27:0x00c6 A[LOOP:0: B:25:0x00c0->B:27:0x00c6, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:30:0x00f5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00f6  */
        /* JADX WARN: Code duplicated, block: B:34:0x0127  */
        /* JADX WARN: Code duplicated, block: B:36:0x013e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:37:0x013f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x013f -> B:17:0x0090). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.device.cgm.receiver.CgmBloodSugarManager.C15461.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C15461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private CgmBloodSugarManager() {
        addCgmDeviceStatusListener();
    }

    private final void addCgmDeviceStatusListener() {
        DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).addDeviceStatusListener(new OnSpecificDeviceStatusListener() { // from class: com.xiaomi.fit.fitness.device.cgm.receiver.CgmBloodSugarManager.addCgmDeviceStatusListener.1
            @Override // com.xiaomi.fitness.device.manager.OnSpecificDeviceStatusListener
            public void onSpecificDeviceConnectSuccess(String did, String model) {
                FitnessLogUtils.i(CgmBloodSugarManager.TAG, "onConnectSuccess(" + did + ")");
                CgmBloodSugarManager.this.onCgmConnectedStatusChanged(did, true);
            }

            @Override // com.xiaomi.fitness.device.manager.OnSpecificDeviceStatusListener
            public void onSpecificDeviceDisconnect(String did, String model) {
                FitnessLogUtils.i(CgmBloodSugarManager.TAG, "onDisconnect(" + did + ")");
                CgmBloodSugarManager.this.onCgmConnectedStatusChanged(did, false);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void convertGlucoseListToItemAndRecord(String did, List<GlucoseValue> glucoseList) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = glucoseList.iterator();
        while (it.hasNext()) {
            BloodSugarItem bloodSugarItemConvertGlucoseToItem = convertGlucoseToItem((GlucoseValue) it.next());
            if (bloodSugarItemConvertGlucoseToItem != null) {
                arrayList.add(bloodSugarItemConvertGlucoseToItem);
            }
        }
        recordBloodSugarItem(did, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BloodSugarItem convertGlucoseToItem(GlucoseValue glucose) {
        if (glucose.getDataType() != 2) {
            return null;
        }
        return new BloodSugarItem(glucose.getTime() / ((long) 1000), (float) glucose.getGlucose(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CgmGlucoseDao getGlucoseDao() {
        return (CgmGlucoseDao) this.glucoseDao.getValue();
    }

    private final void getGlucoseListAllByTimePeriod() {
        FitnessTestPref fitnessTestPref = FitnessTestPref.INSTANCE;
        if (fitnessTestPref.getENABLE_GET_BLOOD_SUGAR() && CGMDeviceUtils.INSTANCE.getCGMDevice() != null) {
            FitnessLogUtils.i(TAG, "getGlucoseListAllByTimePeriod");
            long jCurrentTimeMillis = System.currentTimeMillis();
            BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE).getGlucoseListAllByTimePeriod(jCurrentTimeMillis - TimeUnit.DAYS.toMillis(2L), jCurrentTimeMillis);
            fitnessTestPref.setENABLE_GET_BLOOD_SUGAR(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CgmGlucoseDao glucoseDao_delegate$lambda$0() {
        return FitnessSyncDataBase.INSTANCE.getInstance().cgmGlucoseDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void insertGlucoseToLocalDB(String did, List<GlucoseValue> list) {
        ScopeExtKt.scope(Dispatchers.getIO(), new C15451(list, did, this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CgmBloodSugarManager instance_delegate$lambda$4() {
        return new CgmBloodSugarManager();
    }

    private final boolean isAbnormalNotifyTime() {
        BloodSugarRemindSettingModel bloodSugarRemindSettingFromLocal = BloodSugarExtKt.getInstance(BloodSugarRemindSettingManager.INSTANCE).getBloodSugarRemindSettingFromLocal();
        FitnessLogUtils.i(TAG, "isNotifyTimeInterval: enable(" + bloodSugarRemindSettingFromLocal.getUnusualRemindEnable() + ")");
        boolean z = false;
        if (bloodSugarRemindSettingFromLocal.getUnusualRemindEnable()) {
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
            long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec();
            long remindTimesStartHour = ((long) (bloodSugarRemindSettingFromLocal.getRemindTimesStartHour() * 3600)) + todayZeroTimeInSec + ((long) (bloodSugarRemindSettingFromLocal.getRemindTimesStartMinutes() * 60));
            long remindTimesEndHour = todayZeroTimeInSec + ((long) (bloodSugarRemindSettingFromLocal.getRemindTimesEndHour() * 3600)) + ((long) (bloodSugarRemindSettingFromLocal.getRemindTimesEndMinutes() * 60));
            FitnessLogUtils.i(TAG, "notifyAbnormalGlucose: [" + remindTimesStartHour + ", " + remindTimesEndHour + "]");
            if (remindTimesStartHour <= jCurrentTimeMillis && jCurrentTimeMillis <= remindTimesEndHour) {
                int remindInterval = bloodSugarRemindSettingFromLocal.getRemindInterval() * 60;
                long notify_abnormal_glucose_time = FitnessDataPreference.INSTANCE.getNOTIFY_ABNORMAL_GLUCOSE_TIME();
                z = jCurrentTimeMillis - notify_abnormal_glucose_time > ((long) remindInterval);
                FitnessLogUtils.i(TAG, "notifyAbnormalGlucose(" + z + "): last notify(" + notify_abnormal_glucose_time + "), interval(" + remindInterval + ") ");
            }
        }
        return z;
    }

    private final void notifyAbnormalGlucose(BloodSugarItem item, int level) {
        FitnessLogUtils.i(TAG, "notifyAbnormalGlucose, level(" + level + ")");
        HealthPageExtKt.getInstance(IHealthPage.INSTANCE).notifyAbnormalGlucose(item, level);
        FitnessDataPreference.INSTANCE.setNOTIFY_ABNORMAL_GLUCOSE_TIME(System.currentTimeMillis() / ((long) 1000));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCgmConnectedStatusChanged(String did, boolean isConnected) {
        WearableDeviceModel deviceModelIfCGMDevice = CGMDeviceUtils.INSTANCE.getDeviceModelIfCGMDevice(did);
        if (deviceModelIfCGMDevice != null) {
            FitnessLogUtils.i(TAG, "CGM Device connect status changed (" + isConnected + ")");
            ThirdPartyDataManager.INSTANCE.getInstance().onCGmDeviceStatusChanged(deviceModelIfCGMDevice);
            if (isConnected) {
                BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE).getAllUnSyncGlucose();
                getGlucoseListAllByTimePeriod();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRealtimeGlucoseChanged(BloodSugarItem item) {
        int abnormalLevel$default = BloodSugarItemExtKt.getAbnormalLevel$default(item, null, 1, null);
        boolean z = abnormalLevel$default != 1 && isAbnormalNotifyTime();
        FitnessLogUtils.i(TAG, "onRealtimeGlucoseChanged,shouldNotifyToUser(" + z + ")");
        ThirdPartyDataManager.INSTANCE.getInstance().sendCurrentBloodSugarToWear(item, abnormalLevel$default, z);
        if (z) {
            notifyAbnormalGlucose(item, abnormalLevel$default);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordBloodSugarItem(String did, List<BloodSugarItem> itemList) {
        if (itemList.isEmpty()) {
            return;
        }
        FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).recordBloodSugar(did, FitnessDateUtils.getCurrentTZOffsetInSec(), itemList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void uploadGlucoseToThirdPartyServer() {
        ScopeExtKt.scope(Dispatchers.getIO(), new C15461(null));
    }

    public final void addGlucoseDataListener(@NotNull WearableDeviceModel deviceModel) {
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        BloodSugarExtKt.getInstance(BloodSugarManager.INSTANCE).getAllUnSyncGlucose();
        getGlucoseListAllByTimePeriod();
        final String did = deviceModel.getDid();
        FitnessLogUtils.i(TAG, "addGlucoseDataListener: cgm device(" + did + ")");
        BloodSugarExtKt.setGlucoseCallback(deviceModel, new BloodSugarManager.GlucoseCallback() { // from class: com.xiaomi.fit.fitness.device.cgm.receiver.CgmBloodSugarManager.addGlucoseDataListener.1
            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager.GlucoseCallback
            public void onResultGlucoseData(GlucoseValue glucoseValue) {
                Intrinsics.checkNotNullParameter(glucoseValue, "glucoseValue");
                FitnessLogUtils.i(CgmBloodSugarManager.TAG, "onResultGlucoseData: (" + glucoseValue + ")");
                BloodSugarItem bloodSugarItemConvertGlucoseToItem = CgmBloodSugarManager.this.convertGlucoseToItem(glucoseValue);
                if (bloodSugarItemConvertGlucoseToItem != null) {
                    CgmBloodSugarManager cgmBloodSugarManager = CgmBloodSugarManager.this;
                    String str = did;
                    List listSingletonList = Collections.singletonList(bloodSugarItemConvertGlucoseToItem);
                    Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
                    cgmBloodSugarManager.recordBloodSugarItem(str, listSingletonList);
                    cgmBloodSugarManager.onRealtimeGlucoseChanged(bloodSugarItemConvertGlucoseToItem);
                }
                CgmBloodSugarManager cgmBloodSugarManager2 = CgmBloodSugarManager.this;
                String str2 = did;
                List listSingletonList2 = Collections.singletonList(glucoseValue);
                Intrinsics.checkNotNullExpressionValue(listSingletonList2, "singletonList(...)");
                cgmBloodSugarManager2.insertGlucoseToLocalDB(str2, listSingletonList2);
            }

            @Override // com.xiaomi.fitness.blood_sugar.BloodSugarManager.GlucoseCallback
            public void onResultGlucoseHistoryData(List<GlucoseValue> list) {
                Intrinsics.checkNotNullParameter(list, "list");
                FitnessLogUtils.i(CgmBloodSugarManager.TAG, "onResultGlucoseHistoryData: (" + list.size() + ")");
                CgmBloodSugarManager.this.convertGlucoseListToItemAndRecord(did, list);
                CgmBloodSugarManager.this.insertGlucoseToLocalDB(did, list);
                CgmBloodSugarManager.this.uploadGlucoseToThirdPartyServer();
            }
        });
    }
}
