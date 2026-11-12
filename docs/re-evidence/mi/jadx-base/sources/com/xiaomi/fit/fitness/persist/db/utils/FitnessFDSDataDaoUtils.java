package com.xiaomi.fit.fitness.persist.db.utils;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.mi.FitnessDataId;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessFileUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataRecorder;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdDao;
import com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity;
import com.xiaomi.fit.fitness.persist.db.utils.FitnessFDSDataDaoUtils;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataKey;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0002J\u000e\u0010\u0018\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0016J\u0016\u0010\u0019\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\u0014\u0010\u001d\u001a\u00020\u00152\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001bJ\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010!\u001a\u00020\"J$\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020&J$\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\"2\u0006\u0010%\u001a\u00020&J\u0014\u0010)\u001a\u00020\u00152\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006+"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/utils/FitnessFDSDataDaoUtils;", "", "<init>", "()V", "TAG", "", "fdsDataIdDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/FDSDataIdDao;", "getFdsDataIdDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/FDSDataIdDao;", "localPhoneSid", "getLocalPhoneSid", "()Ljava/lang/String;", "localPhoneSid$delegate", "Lkotlin/Lazy;", "recordFDSDataIdToDB", "", "sid", "dataId", "Lcom/xiaomi/fit/data/common/data/mi/FitnessDataId;", "uploadDataToFDS", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processLocalPhoneFdsId", "uploadNoLocalPhoneDataToFDS", "markFDSDataHasUpload", "entityList", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/FDSDataIdEntity;", "recordSportReportId", "sportList", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;", "getSportReportId", "limit", "", "getOneSportId", DailyRecordKey.sportType, "time", "", "getDailyFDSIds", "dailyType", "deleteSportId", "list", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFitnessFDSDataDaoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FitnessFDSDataDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/FitnessFDSDataDaoUtils\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,167:1\n37#2:168\n36#2,3:169\n37#2:174\n36#2,3:175\n37#2:178\n36#2,3:179\n37#2:182\n36#2,3:183\n1863#3,2:172\n*S KotlinDebug\n*F\n+ 1 FitnessFDSDataDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/FitnessFDSDataDaoUtils\n*L\n67#1:168\n67#1:169,3\n113#1:174\n113#1:175,3\n146#1:178\n146#1:179,3\n165#1:182\n165#1:183,3\n109#1:172,2\n*E\n"})
public final class FitnessFDSDataDaoUtils {

    @NotNull
    private static final String TAG = "FitnessFDSDataDaoUtils";

    @NotNull
    public static final FitnessFDSDataDaoUtils INSTANCE = new FitnessFDSDataDaoUtils();

    /* JADX INFO: renamed from: localPhoneSid$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy localPhoneSid = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: tq9
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FitnessFDSDataDaoUtils.localPhoneSid_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.FitnessFDSDataDaoUtils$uploadNoLocalPhoneDataToFDS$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.FitnessFDSDataDaoUtils", f = "FitnessFDSDataDaoUtils.kt", i = {0, 0, 0, 0, 0}, l = {95}, m = "uploadNoLocalPhoneDataToFDS", n = {"this", "uploadInstance", "successList", "id", "dataId"}, s = {"L$0", "L$1", "L$2", "L$4", "L$5"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
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
            return FitnessFDSDataDaoUtils.this.uploadNoLocalPhoneDataToFDS(this);
        }
    }

    private FitnessFDSDataDaoUtils() {
    }

    private final FDSDataIdDao getFdsDataIdDao() {
        return FitnessDatabase.INSTANCE.getInstance().fdsDataIdDao();
    }

    private final String getLocalPhoneSid() {
        return (String) localPhoneSid.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String localPhoneSid_delegate$lambda$0() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalPhoneSid();
    }

    private final void markFDSDataHasUpload(List<FDSDataIdEntity> entityList) {
        List<FDSDataIdEntity> list = entityList;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<T> it = entityList.iterator();
        while (it.hasNext()) {
            ((FDSDataIdEntity) it.next()).setUpload(true);
        }
        FDSDataIdDao fdsDataIdDao = getFdsDataIdDao();
        FDSDataIdEntity[] fDSDataIdEntityArr = (FDSDataIdEntity[]) list.toArray(new FDSDataIdEntity[0]);
        fdsDataIdDao.update((FDSDataIdEntity[]) Arrays.copyOf(fDSDataIdEntityArr, fDSDataIdEntityArr.length));
    }

    private final void processLocalPhoneFdsId() {
        String currentPhoneSid = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid();
        if (TextUtils.equals(currentPhoneSid, getLocalPhoneSid())) {
            FitnessLogUtils.i(TAG, "uploadLocalDataToFDS: no local phone server sid");
            return;
        }
        List<FDSDataIdEntity> theDeviceAllIds = getFdsDataIdDao().getTheDeviceAllIds(getLocalPhoneSid());
        List<FDSDataIdEntity> list = theDeviceAllIds;
        if (list == null || list.isEmpty()) {
            return;
        }
        FitnessLogUtils.i(TAG, "processLocalPhoneFdsId: size(" + theDeviceAllIds.size() + ")");
        for (FDSDataIdEntity fDSDataIdEntity : theDeviceAllIds) {
            FitnessDataId fitnessDataId = new FitnessDataId(fDSDataIdEntity.getIdBytes());
            byte[] file = FitnessFileUtils.INSTANCE.readFile(FitnessFileUtils.getFDSDataFile(ApplicationExtKt.getApplication(), fDSDataIdEntity.getSid(), fitnessDataId));
            if (file != null && file.length != 0) {
                FitnessDataExtKt.getInstance(FitnessDataRecorder.INSTANCE).recordFDSData(currentPhoneSid, fitnessDataId, file);
            }
        }
        FDSDataIdDao fdsDataIdDao = getFdsDataIdDao();
        FDSDataIdEntity[] fDSDataIdEntityArr = (FDSDataIdEntity[]) theDeviceAllIds.toArray(new FDSDataIdEntity[0]);
        fdsDataIdDao.delete((FDSDataIdEntity[]) Arrays.copyOf(fDSDataIdEntityArr, fDSDataIdEntityArr.length));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:42:0x013b  */
    /* JADX WARN: Code duplicated, block: B:48:0x014d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0140 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0111 -> B:40:0x0114). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object uploadNoLocalPhoneDataToFDS(kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.db.utils.FitnessFDSDataDaoUtils.uploadNoLocalPhoneDataToFDS(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void deleteSportId(@NotNull List<FDSDataIdEntity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        List<FDSDataIdEntity> list2 = list;
        if (list2.isEmpty()) {
            return;
        }
        FDSDataIdDao fdsDataIdDao = getFdsDataIdDao();
        FDSDataIdEntity[] fDSDataIdEntityArr = (FDSDataIdEntity[]) list2.toArray(new FDSDataIdEntity[0]);
        fdsDataIdDao.delete((FDSDataIdEntity[]) Arrays.copyOf(fDSDataIdEntityArr, fDSDataIdEntityArr.length));
    }

    @NotNull
    public final List<FDSDataIdEntity> getDailyFDSIds(@NotNull String sid, int dailyType, long time) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        return getFdsDataIdDao().getDailyFDSIds(sid, dailyType, time);
    }

    @NotNull
    public final List<FDSDataIdEntity> getOneSportId(@NotNull String sid, int sportType, long time) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        return getFdsDataIdDao().getSportFDSIds(sid, sportType, time);
    }

    @NotNull
    public final List<FDSDataIdEntity> getSportReportId(int limit) {
        return getFdsDataIdDao().getSportReportIds(limit);
    }

    public final boolean recordFDSDataIdToDB(@NotNull String sid, @NotNull FitnessDataId dataId) {
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(dataId, "dataId");
        FDSDataIdEntity fDSDataIdEntity = new FDSDataIdEntity(sid, dataId.toByteArray());
        fDSDataIdEntity.setTime(dataId.getTimeStamp());
        fDSDataIdEntity.setDailyType(dataId.getDailyType());
        fDSDataIdEntity.setSportType(dataId.getSportType());
        fDSDataIdEntity.setFileType(dataId.getFileType());
        fDSDataIdEntity.setUpload(false);
        getFdsDataIdDao().insert(fDSDataIdEntity);
        return true;
    }

    public final void recordSportReportId(@NotNull List<SportReportEntity> sportList) {
        Intrinsics.checkNotNullParameter(sportList, "sportList");
        ArrayList arrayList = new ArrayList();
        for (SportReportEntity sportReportEntity : sportList) {
            FitnessPersistUtils fitnessPersistUtils = FitnessPersistUtils.INSTANCE;
            SportBasicReport sportBasicReport = (SportBasicReport) fitnessPersistUtils.fromJson(sportReportEntity.getValue(), SportBasicReport.class);
            if (sportBasicReport != null) {
                FitnessDataId fitnessDataIdBuild = new FitnessDataId.Builder().timeStampInSec(sportBasicReport.getTimeStamp()).timeZoneIn15Min(sportBasicReport.getTzIn15Min()).sportType(sportBasicReport.getProtoType()).fileType(1).version(sportBasicReport.getVersion()).build();
                FDSDataIdEntity fDSDataIdEntity = new FDSDataIdEntity(sportReportEntity.getSid(), fitnessDataIdBuild.toByteArray());
                fDSDataIdEntity.setTime(fitnessDataIdBuild.getTimeStamp());
                fDSDataIdEntity.setDailyType(fitnessDataIdBuild.getDailyType());
                fDSDataIdEntity.setSportType(fitnessDataIdBuild.getSportType());
                fDSDataIdEntity.setFileType(fitnessDataIdBuild.getFileType());
                fDSDataIdEntity.setUpload(true);
                fDSDataIdEntity.setExtra(fitnessPersistUtils.toJson(new FitnessDataKey(sportReportEntity.getSid(), sportReportEntity.getKey(), sportReportEntity.getTime())));
                arrayList.add(fDSDataIdEntity);
            }
        }
        FDSDataIdDao fdsDataIdDao = getFdsDataIdDao();
        FDSDataIdEntity[] fDSDataIdEntityArr = (FDSDataIdEntity[]) arrayList.toArray(new FDSDataIdEntity[0]);
        fdsDataIdDao.insert((FDSDataIdEntity[]) Arrays.copyOf(fDSDataIdEntityArr, fDSDataIdEntityArr.length));
    }

    @Nullable
    public final Object uploadDataToFDS(@NotNull Continuation<? super Unit> continuation) {
        processLocalPhoneFdsId();
        Object objUploadNoLocalPhoneDataToFDS = uploadNoLocalPhoneDataToFDS(continuation);
        return objUploadNoLocalPhoneDataToFDS == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUploadNoLocalPhoneDataToFDS : Unit.INSTANCE;
    }
}
