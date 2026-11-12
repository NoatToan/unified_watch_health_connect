package com.xiaomi.fit.fitness.persist.process;

import android.text.TextUtils;
import com.xiaomi.fit.data.common.data.sport.util.FitnessSportTypeUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fit.fitness.persist.db.internal.FDSDataIdEntity;
import com.xiaomi.fit.fitness.persist.db.utils.FitnessFDSDataDaoUtils;
import com.xiaomi.fit.fitness.persist.process.SportSyncFinishController;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataKey;
import com.xiaomi.fit.fitness.persist.server.data.SportSyncInfo;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.net.extensions.ScopeExtKt;
import com.xiaomi.fitness.net.scope.AndroidScope;
import defpackage.e3b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u001c\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\tH\u0002J(\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J$\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u0016H\u0002J\"\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\tH\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/SportSyncFinishController;", "", "<init>", "()V", "uploadSportSyncInfo", "", "reportSportSyncInfo", "sportReportList", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/FDSDataIdEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUpSportSyncInfo", "Lcom/xiaomi/fit/fitness/persist/server/data/SportSyncInfo;", "sportReport", "getSportSyncInfo", DailyRecordKey.sportType, "", "sportKey", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataKey;", "entityList", "getSportFileState", "trackCodeMap", "", "getFileTrackPointMap", "sportEntityList", "getFileTrackPointCode", "sportEntity", "getNoGpsTrackPointCode", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportSyncFinishController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSyncFinishController.kt\ncom/xiaomi/fit/fitness/persist/process/SportSyncFinishController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,191:1\n1863#2,2:192\n1863#2,2:198\n216#3,2:194\n216#3,2:196\n*S KotlinDebug\n*F\n+ 1 SportSyncFinishController.kt\ncom/xiaomi/fit/fitness/persist/process/SportSyncFinishController\n*L\n67#1:192,2\n166#1:198,2\n114#1:194,2\n124#1:196,2\n*E\n"})
public final class SportSyncFinishController {
    private static final int FILE_STATE_GPS = 2;
    private static final int FILE_STATE_NOT_RECORD_NO_GPS = 0;
    private static final int FILE_STATE_RECORD = 1;
    private static final int FILE_STATE_RECORD_GPS = 3;
    private static final int LIMIT_UP_SPORT_INFO = 100;
    private static final int NOT_UPLOAD_TO_SERVER = -1;
    private static final int SUCCESS = 0;

    @NotNull
    private static final String TAG = "SportSyncFinishController";
    private static final int TRACK_POINT_NOT_UP_GPS_SWITCH = 1001;
    private static final int TRACK_POINT_NO_GPS = 1003;
    private static final int TRACK_POINT_NO_GPS_FOR_PERMISSION = 1002;
    private static final int TRACK_POINT_NO_RECORD = 1004;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final SportSyncFinishController instance = new SportSyncFinishController();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/SportSyncFinishController$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/persist/process/SportSyncFinishController;", "getInstance", "()Lcom/xiaomi/fit/fitness/persist/process/SportSyncFinishController;", "TAG", "", "FILE_STATE_NOT_RECORD_NO_GPS", "", "FILE_STATE_RECORD", "FILE_STATE_GPS", "FILE_STATE_RECORD_GPS", "SUCCESS", "NOT_UPLOAD_TO_SERVER", "TRACK_POINT_NOT_UP_GPS_SWITCH", "TRACK_POINT_NO_GPS_FOR_PERMISSION", "TRACK_POINT_NO_GPS", "TRACK_POINT_NO_RECORD", "LIMIT_UP_SPORT_INFO", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SportSyncFinishController getInstance() {
            return SportSyncFinishController.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.SportSyncFinishController$reportSportSyncInfo$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.SportSyncFinishController", f = "SportSyncFinishController.kt", i = {0, 0, 0}, l = {75}, m = "reportSportSyncInfo", n = {"sportReportList", "sportSyncInfoList", "deleteReportList"}, s = {"L$0", "L$1", "L$2"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return SportSyncFinishController.this.reportSportSyncInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.SportSyncFinishController$uploadSportSyncInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.SportSyncFinishController$uploadSportSyncInfo$1", f = "SportSyncFinishController.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16561 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C16561(Continuation<? super C16561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SportSyncFinishController.this.new C16561(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<FDSDataIdEntity> sportReportId = FitnessFDSDataDaoUtils.INSTANCE.getSportReportId(100);
                List<FDSDataIdEntity> list = sportReportId;
                if (list == null || list.isEmpty()) {
                    FitnessLogUtils.i(SportSyncFinishController.TAG, "no sport sync info to upload");
                    return Unit.INSTANCE;
                }
                FitnessLogUtils.i(SportSyncFinishController.TAG, "reportSportSyncInfo size(" + sportReportId.size() + ")");
                SportSyncFinishController sportSyncFinishController = SportSyncFinishController.this;
                this.label = 1;
                if (sportSyncFinishController.reportSportSyncInfo(sportReportId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C16561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SportSyncFinishController() {
    }

    private final int getFileTrackPointCode(FDSDataIdEntity sportEntity) {
        if (sportEntity.getIsUpload()) {
            return 0;
        }
        return (sportEntity.getFileType() == 2 && FitnessPersistUtils.INSTANCE.notUploadGps2Server()) ? 1001 : -1;
    }

    private final Map<Integer, Integer> getFileTrackPointMap(List<FDSDataIdEntity> sportEntityList) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FDSDataIdEntity fDSDataIdEntity : sportEntityList) {
            if (fDSDataIdEntity.getFileType() != 1) {
                linkedHashMap.put(Integer.valueOf(fDSDataIdEntity.getFileType()), Integer.valueOf(getFileTrackPointCode(fDSDataIdEntity)));
            }
        }
        return linkedHashMap;
    }

    private final int getNoGpsTrackPointCode() {
        return (e3b.b() && e3b.a()) ? 1003 : 1002;
    }

    private final int getSportFileState(int sportType, Map<Integer, Integer> trackCodeMap) {
        if (trackCodeMap != null) {
            trackCodeMap.isEmpty();
        }
        boolean zSupportGpsSport = FitnessSportTypeUtils.INSTANCE.supportGpsSport(sportType);
        int size = trackCodeMap.size();
        if (size != 1) {
            return size != 2 ? 0 : 3;
        }
        if (zSupportGpsSport) {
            if (trackCodeMap.get(2) != null) {
                trackCodeMap.put(0, 1004);
                return 2;
            }
            trackCodeMap.put(2, Integer.valueOf(getNoGpsTrackPointCode()));
        }
        return 1;
    }

    private final SportSyncInfo getSportSyncInfo(int sportType, FitnessDataKey sportKey, List<FDSDataIdEntity> entityList) {
        Map<Integer, Integer> fileTrackPointMap = getFileTrackPointMap(entityList);
        Iterator<Map.Entry<Integer, Integer>> it = fileTrackPointMap.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().intValue() == -1) {
                return null;
            }
        }
        SportSyncInfo sportSyncInfo = new SportSyncInfo(sportKey);
        sportSyncInfo.setFileState(getSportFileState(sportType, fileTrackPointMap));
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<Integer, Integer> entry : fileTrackPointMap.entrySet()) {
            if (entry.getValue().intValue() != 0) {
                arrayList.add(entry.getValue());
            }
        }
        sportSyncInfo.setTrackPoint(arrayList);
        return sportSyncInfo;
    }

    private final SportSyncInfo getUpSportSyncInfo(FDSDataIdEntity sportReport) {
        FitnessDataKey fitnessDataKey;
        if (TextUtils.isEmpty(sportReport.getExtra())) {
            SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(sportReport.getSportType());
            if (sportReportKey == null) {
                return null;
            }
            fitnessDataKey = new FitnessDataKey(sportReport.getSid(), sportReportKey.getKey(), sportReport.getTime());
        } else {
            FitnessPersistUtils fitnessPersistUtils = FitnessPersistUtils.INSTANCE;
            String extra = sportReport.getExtra();
            Intrinsics.checkNotNull(extra);
            fitnessDataKey = (FitnessDataKey) fitnessPersistUtils.fromJson(extra, FitnessDataKey.class);
        }
        if (fitnessDataKey == null) {
            return null;
        }
        return getSportSyncInfo(sportReport.getSportType(), fitnessDataKey, FitnessFDSDataDaoUtils.INSTANCE.getOneSportId(sportReport.getSid(), sportReport.getSportType(), sportReport.getTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object reportSportSyncInfo(List<FDSDataIdEntity> list, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        List<FDSDataIdEntity> arrayList;
        List list2;
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
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            ArrayList arrayList2 = new ArrayList();
            arrayList = new ArrayList<>();
            for (FDSDataIdEntity fDSDataIdEntity : list) {
                SportSyncInfo upSportSyncInfo = getUpSportSyncInfo(fDSDataIdEntity);
                if (upSportSyncInfo != null) {
                    arrayList2.add(upSportSyncInfo);
                    arrayList.add(fDSDataIdEntity);
                }
            }
            IncrementalSyncController companion = IncrementalSyncController.INSTANCE.getInstance();
            anonymousClass1.L$0 = list;
            anonymousClass1.L$1 = arrayList2;
            anonymousClass1.L$2 = arrayList;
            anonymousClass1.label = 1;
            Object objReportSportSyncInfo = companion.reportSportSyncInfo(arrayList2, anonymousClass1);
            if (objReportSportSyncInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            list2 = arrayList2;
            obj = objReportSportSyncInfo;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List<FDSDataIdEntity> list3 = (List) anonymousClass1.L$2;
            list2 = (List) anonymousClass1.L$1;
            List<FDSDataIdEntity> list4 = (List) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            arrayList = list3;
            list = list4;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        FitnessLogUtils.i(TAG, "sport size = " + list.size() + ", up size = " + list2.size() + ", success = " + zBooleanValue);
        if (zBooleanValue) {
            FitnessFDSDataDaoUtils.INSTANCE.deleteSportId(arrayList);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadSportSyncInfo$lambda$0(AndroidScope androidScope, Throwable it) {
        Intrinsics.checkNotNullParameter(androidScope, "$this$catch");
        Intrinsics.checkNotNullParameter(it, "it");
        FitnessLogUtils.e(TAG, "reportSportSyncInfo", it);
        return Unit.INSTANCE;
    }

    public final void uploadSportSyncInfo() {
        ScopeExtKt.scopeNet(Dispatchers.getDefault(), new C16561(null)).m503catch(new Function2() { // from class: v3o
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SportSyncFinishController.uploadSportSyncInfo$lambda$0((AndroidScope) obj, (Throwable) obj2);
            }
        });
    }
}
