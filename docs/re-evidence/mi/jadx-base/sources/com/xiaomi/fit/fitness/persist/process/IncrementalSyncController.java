package com.xiaomi.fit.fitness.persist.process;

import android.text.TextUtils;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.mibi.sdk.common.MibiSdkConstants;
import com.xiaomi.fit.data.common.constant.SyncTriggerSource;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SportReportEntity;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.FitnessFDSDataDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.ServerRequestDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.SportReportDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.SwitchSongDaoUtils;
import com.xiaomi.fit.fitness.persist.db.utils.TrainingPlanWeekDaoUtils;
import com.xiaomi.fit.fitness.persist.process.IncrementalSyncController;
import com.xiaomi.fit.fitness.persist.server.FitnessDataRequest;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataKey;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataModel;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByTimeParams;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByTimeResponse;
import com.xiaomi.fit.fitness.persist.server.data.GetProjectByWMResponse;
import com.xiaomi.fit.fitness.persist.server.data.LatestFitnessDataModel;
import com.xiaomi.fit.fitness.persist.server.data.MarkMigrate;
import com.xiaomi.fit.fitness.persist.server.data.ProjectDataModel;
import com.xiaomi.fit.fitness.persist.server.data.ProjectPersistKey;
import com.xiaomi.fit.fitness.persist.server.data.SportReportModel;
import com.xiaomi.fit.fitness.persist.server.data.SportSyncInfo;
import com.xiaomi.fit.fitness.persist.sp.FitnessDataCorePreference;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fit.fitness.persist.utils.FitnessServerSyncTracker;
import com.xiaomi.fitness.aggregation.health.dao.ProjectEntityDaoProxy;
import com.xiaomi.fitness.aggregation.health.entity.ProjectEntity;
import com.xiaomi.fitness.aggregation.health.entity.ProjectEntityKt;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.login.export.RegionExtKt;
import com.xiaomi.fitness.login.export.RegionManager;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.mi_connect_sdk.BuildConfig;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 X2\u00020\u0001:\u0001XB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\u0013H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0017\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u0016\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u001d\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0011J\u001c\u0010\u001e\u001a\u00020\u00152\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 H\u0082@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u000e\u0010%\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0011J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020'0 2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J \u0010(\u001a\u00020\u00102\b\b\u0001\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010,J \u0010-\u001a\u00020\u00102\b\b\u0001\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010,J \u0010.\u001a\u00020\u00102\b\b\u0001\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010,J\u000e\u0010/\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u00100\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0011J\"\u00101\u001a\u00020\u00152\b\u00102\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u00103\u001a\u000204H\u0082@¢\u0006\u0002\u00105J\u000e\u00106\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0011J\u001e\u00107\u001a\u00020\u00132\u000e\u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010 H\u0082@¢\u0006\u0002\u0010\"J\u000e\u0010:\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u0016\u0010;\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ\u000e\u0010<\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u0010=\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u0016\u0010>\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ\u000e\u0010?\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u0010@\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u0010A\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u0010B\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0011J \u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020*2\b\b\u0002\u0010E\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010,J&\u0010F\u001a\u00020\u00152\u0006\u0010D\u001a\u00020*2\u0006\u0010G\u001a\u00020*2\u0006\u0010E\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010HJ&\u0010I\u001a\u00020\u00152\u0006\u0010D\u001a\u00020*2\u0006\u0010G\u001a\u00020*2\u0006\u0010E\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010HJ&\u0010J\u001a\b\u0012\u0004\u0012\u00020K0 2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0 2\b\u0010N\u001a\u0004\u0018\u00010*H\u0002J\u001c\u0010O\u001a\b\u0012\u0004\u0012\u00020P0 2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002J\u001e\u0010Q\u001a\u00020\u00152\u0006\u0010D\u001a\u00020*2\u0006\u0010E\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010,J\u001c\u0010R\u001a\b\u0012\u0004\u0012\u00020P0 2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020M0 H\u0002J\u0016\u0010S\u001a\u00020\u00132\u0006\u0010T\u001a\u00020*H\u0086@¢\u0006\u0002\u0010UJ\u001c\u0010V\u001a\u00020\u00152\f\u0010$\u001a\b\u0012\u0004\u0012\u00020W0 H\u0086@¢\u0006\u0002\u0010\"R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006Y"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/IncrementalSyncController;", "Lcom/xiaomi/fit/fitness/persist/process/CloudSyncBaseRequest;", "<init>", "()V", "mFitnessRequest", "Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "getMFitnessRequest", "()Lcom/xiaomi/fit/fitness/persist/server/FitnessDataRequest;", "mFitnessRequest$delegate", "Lkotlin/Lazy;", "sportSyncFinishController", "Lcom/xiaomi/fit/fitness/persist/process/SportSyncFinishController;", "getSportSyncFinishController", "()Lcom/xiaomi/fit/fitness/persist/process/SportSyncFinishController;", "sportSyncFinishController$delegate", "syncSportWithServer", "Lcom/xiaomi/fit/fitness/persist/process/SyncRequestResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncTrainingPlan", "", "pushSwitchSong2Server", "", "pushSportFDSData", "pullHomeRecentSportReport", "pullSportReportByWaterMark", "localWatermark", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushSportReport2Server", "pushNewSportReport2Server", "pushSportReport", "uploadList", "", "Lcom/xiaomi/fit/fitness/persist/db/internal/SportReportEntity;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSportReportKey", "sportList", "pushDeletedSportReport2Server", "convertToServerSportModel", "Lcom/xiaomi/fit/fitness/persist/server/data/SportReportModel;", "syncFitnessDataWithServer", "source", "", "isForeground", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncMedicalDataWithServer", "syncProjectDataWithServer", "pushAllProjectData2Server", "pushDeletedProjectData2Server", "pullProjectDataByWM", "watermark", "limit", "", "(Ljava/lang/Long;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pullProjectDataByTime", "saveProjectDataToDB", "dataList", "Lcom/xiaomi/fit/fitness/persist/server/data/ProjectDataModel;", "pushAllFitnessData2Server", "pullFitnessDataByWaterMark", "pullHomeRecentFitnessData", "pushAllMedicalData2Server", "pullMedicalDataByWaterMark", "pullRecentMedicalData", "pullRecentFitnessData", "pullRecentAllDayData", "pullRecentSingleData", "pushFitnessData2Server", "persistKey", "isMedicalData", "pushLocalPhoneData", "localPhoneSid", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pushDeviceFitnessData", "convertToServerRecordModel", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "recordList", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "replaceSid", "extractSportReportKey", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataKey;", "pushDeletedDailyData", "extractFitnessDataKey", "markMigrateNewApp", "userId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reportSportSyncInfo", "Lcom/xiaomi/fit/fitness/persist/server/data/SportSyncInfo;", "Companion", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nIncrementalSyncController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IncrementalSyncController.kt\ncom/xiaomi/fit/fitness/persist/process/IncrementalSyncController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,742:1\n1557#2:743\n1628#2,3:744\n1557#2:747\n1628#2,3:748\n1557#2:751\n1628#2,3:752\n*S KotlinDebug\n*F\n+ 1 IncrementalSyncController.kt\ncom/xiaomi/fit/fitness/persist/process/IncrementalSyncController\n*L\n338#1:743\n338#1:744,3\n344#1:747\n344#1:748,3\n363#1:751\n363#1:752,3\n*E\n"})
public final class IncrementalSyncController extends CloudSyncBaseRequest {
    private static final int LIMIT_UP_FITNESS_DATA = 60;
    private static final int LIMIT_UP_SPORT_REPORT = 20;

    @NotNull
    private static final String TAG = "IncrementalSyncController";

    /* JADX INFO: renamed from: mFitnessRequest$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFitnessRequest = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: h7d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IncrementalSyncController.mFitnessRequest_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: sportSyncFinishController$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy sportSyncFinishController = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: i7d
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return IncrementalSyncController.sportSyncFinishController_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final IncrementalSyncController instance = new IncrementalSyncController();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/process/IncrementalSyncController$Companion;", "", "<init>", "()V", "instance", "Lcom/xiaomi/fit/fitness/persist/process/IncrementalSyncController;", "getInstance", "()Lcom/xiaomi/fit/fitness/persist/process/IncrementalSyncController;", "TAG", "", "LIMIT_UP_SPORT_REPORT", "", "LIMIT_UP_FITNESS_DATA", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final IncrementalSyncController getInstance() {
            return IncrementalSyncController.instance;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$markMigrateNewApp$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0}, l = {724}, m = "markMigrateNewApp", n = {"userId"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
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
            return IncrementalSyncController.this.markMigrateNewApp(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pullFitnessDataByWaterMark$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {}, l = {MibiSdkConstants.REQUEST_MIBI}, m = "pullFitnessDataByWaterMark", n = {}, s = {})
    public static final class C16271 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16271(Continuation<? super C16271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pullFitnessDataByWaterMark(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pullHomeRecentFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 1, 2, 2}, l = {439, 440, 441}, m = "pullHomeRecentFitnessData", n = {"this", "watermark", "watermark", "hasNewData"}, s = {"L$0", "J$0", "J$0", "Z$0"})
    public static final class C16281 extends ContinuationImpl {
        long J$0;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16281(Continuation<? super C16281> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pullHomeRecentFitnessData(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pullHomeRecentSportReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 1, 2, 2}, l = {105, 107, 108}, m = "pullHomeRecentSportReport", n = {"this", "watermark", "watermark", "hasData"}, s = {"L$0", "J$0", "J$0", "Z$0"})
    public static final class C16291 extends ContinuationImpl {
        long J$0;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16291(Continuation<? super C16291> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pullHomeRecentSportReport(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pullMedicalDataByWaterMark$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {}, l = {472}, m = "pullMedicalDataByWaterMark", n = {}, s = {})
    public static final class C16301 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16301(Continuation<? super C16301> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pullMedicalDataByWaterMark(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pullProjectDataByTime$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 1, 1, 2, 2, 3, 3}, l = {392, 393, 396, 397}, m = "pullProjectDataByTime", n = {"this", "this", "rhythmResult", "this", "rhythmResult", "rhythmResult", "dataResult"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class C16311 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16311(Continuation<? super C16311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pullProjectDataByTime(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pullProjectDataByWM$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 1, 1, 2, 2, 3}, l = {377, 378, 379, 383}, m = "pullProjectDataByWM", n = {"this", "this", "dataResult", "this", "dataResult", "hasData"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "I$0"})
    public static final class C16321 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16321(Continuation<? super C16321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pullProjectDataByWM(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pullRecentFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 1}, l = {508, 509}, m = "pullRecentFitnessData", n = {"this", "hasAllDayData"}, s = {"L$0", "Z$0"})
    public static final class C16331 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16331(Continuation<? super C16331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pullRecentFitnessData(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pullRecentMedicalData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 1, 2, 2}, l = {486, 492, 493}, m = "pullRecentMedicalData", n = {"this", "watermark", "watermark", "hasData"}, s = {"L$0", "J$0", "J$0", "Z$0"})
    public static final class C16341 extends ContinuationImpl {
        long J$0;
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16341(Continuation<? super C16341> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pullRecentMedicalData(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pullSportReportByWaterMark$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {}, l = {122}, m = "pullSportReportByWaterMark", n = {}, s = {})
    public static final class C16351 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16351(Continuation<? super C16351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pullSportReportByWaterMark(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushAllFitnessData2Server$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 0}, l = {412}, m = "pushAllFitnessData2Server", n = {"this", "keys", "hasData"}, s = {"L$0", "L$1", "I$0"})
    public static final class C16361 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16361(Continuation<? super C16361> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushAllFitnessData2Server(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushAllMedicalData2Server$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 0}, l = {459}, m = "pushAllMedicalData2Server", n = {"this", "keys", "hasData"}, s = {"L$0", "L$1", "I$0"})
    public static final class C16371 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16371(Continuation<? super C16371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushAllMedicalData2Server(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushAllProjectData2Server$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 1}, l = {342, 348}, m = "pushAllProjectData2Server", n = {"entityList", "hasData", "hasData"}, s = {"L$0", "I$0", "I$0"})
    public static final class C16381 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16381(Continuation<? super C16381> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushAllProjectData2Server(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushDeletedDailyData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {694, 696}, m = "pushDeletedDailyData", n = {"this", "persistKey", "entityList", "isMedicalData", "hasData", "this", "persistKey", "entityList", "isMedicalData", "hasData"}, s = {"L$0", "L$1", "L$2", "Z$0", "I$0", "L$0", "L$1", "L$2", "Z$0", "I$0"})
    public static final class C16391 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16391(Continuation<? super C16391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushDeletedDailyData(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushDeletedProjectData2Server$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 1, 1, 2}, l = {357, 367, BuildConfig.MiConnectVersionBuild}, m = "pushDeletedProjectData2Server", n = {"hasData", "entityList", "hasData", "hasData"}, s = {"I$0", "L$0", "I$0", "I$0"})
    public static final class C16401 extends ContinuationImpl {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16401(Continuation<? super C16401> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushDeletedProjectData2Server(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushDeletedSportReport2Server$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 0}, l = {209}, m = "pushDeletedSportReport2Server", n = {"this", "entityList", "dataKeyList"}, s = {"L$0", "L$1", "L$2"})
    public static final class C16411 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C16411(Continuation<? super C16411> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushDeletedSportReport2Server(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushDeviceFitnessData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1}, l = {638, GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH}, m = "pushDeviceFitnessData", n = {"this", "persistKey", "localPhoneSid", "entityList", "modelList", "isMedicalData", "hasData", "this", "persistKey", "localPhoneSid", "entityList", "modelList", "isMedicalData", "hasData"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "Z$0", "I$0"})
    public static final class C16421 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16421(Continuation<? super C16421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushDeviceFitnessData(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushFitnessData2Server$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {560, 566, 573}, m = "pushFitnessData2Server", n = {"this", "persistKey", "localPhoneSid", "isMedicalData", "this", "persistKey", "isMedicalData", "hasLocalPhoneData", "persistKey", "isMedicalData", "hasLocalPhoneData", "hasDeviceData"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "Z$0", "I$0", "L$0", "Z$0", "I$0", "I$1"})
    public static final class C16431 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16431(Continuation<? super C16431> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushFitnessData2Server(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushLocalPhoneData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {608, 610}, m = "pushLocalPhoneData", n = {"this", "persistKey", "localPhoneSid", "serverSid", "entityList", "modelList", "isMedicalData", "hasData", "this", "persistKey", "localPhoneSid", "serverSid", "entityList", "modelList", "isMedicalData", "hasData"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "I$0"})
    public static final class C16441 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16441(Continuation<? super C16441> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushLocalPhoneData(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushNewSportReport2Server$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 1}, l = {162, 174}, m = "pushNewSportReport2Server", n = {"this", "uploadList", "this"}, s = {"L$0", "L$2", "L$0"})
    public static final class C16451 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C16451(Continuation<? super C16451> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushNewSportReport2Server(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushSportFDSData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {}, l = {95}, m = "pushSportFDSData", n = {}, s = {})
    public static final class C16461 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16461(Continuation<? super C16461> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushSportFDSData(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushSportReport$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0}, l = {SportReportBaseParser.ReportType.exitTime}, m = "pushSportReport", n = {"this", "uploadList"}, s = {"L$0", "L$1"})
    public static final class C16471 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16471(Continuation<? super C16471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushSportReport(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushSportReport2Server$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 1}, l = {132, 133}, m = "pushSportReport2Server", n = {"this", "hasSportReport"}, s = {"L$0", "Z$0"})
    public static final class C16481 extends ContinuationImpl {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16481(Continuation<? super C16481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushSportReport2Server(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushSwitchSong2Server$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {}, l = {85}, m = "pushSwitchSong2Server", n = {}, s = {})
    public static final class C16491 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16491(Continuation<? super C16491> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.pushSwitchSong2Server(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$reportSportSyncInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {}, l = {736}, m = "reportSportSyncInfo", n = {}, s = {})
    public static final class C16501 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16501(Continuation<? super C16501> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.reportSportSyncInfo(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$syncFitnessDataWithServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3}, l = {242, 248, 255, 262}, m = "syncFitnessDataWithServer", n = {"this", "source", "isForeground", "this", "source", "tracker", "isForeground", "startTime", "this", "source", "tracker", "isForeground", "startTime", "source", "tracker", "pullRequestResult", "isForeground", "startTime"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "Z$0", "J$0", "L$0", "L$1", "L$2", "Z$0", "J$0", "L$0", "L$1", "L$2", "Z$0", "J$0"})
    public static final class C16511 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16511(Continuation<? super C16511> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.syncFitnessDataWithServer(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$syncMedicalDataWithServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 0, 1, 2, 3}, l = {272, 276, 281, 285}, m = "syncMedicalDataWithServer", n = {"this", "source", "isForeground", "this", "this", "pullRequestResult"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$0", "L$0"})
    public static final class C16521 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16521(Continuation<? super C16521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.syncMedicalDataWithServer(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$syncProjectDataWithServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 0, 0, 1, 2, 3, 4, 4, 5, 5, 6}, l = {293, 297, 298, 299, 308, 317, 322}, m = "syncProjectDataWithServer", n = {"this", "source", "isForeground", "this", "this", "this", "this", "localWatermark", "this", "pullRequestResult", "pullRequestResult"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class C16531 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C16531(Continuation<? super C16531> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.syncProjectDataWithServer(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$syncSportWithServer$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {0, 1, 2, 3, 3, 4, 4, 5, 5}, l = {49, 52, 57, 60, 61, 64}, m = "syncSportWithServer", n = {"this", "this", "this", "this", "pullSyncResult", "this", "pullSyncResult", "this", "pullSyncResult"}, s = {"L$0", "L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class C16541 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C16541(Continuation<? super C16541> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.syncSportWithServer(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$syncTrainingPlan$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.process.IncrementalSyncController", f = "IncrementalSyncController.kt", i = {}, l = {77}, m = "syncTrainingPlan", n = {}, s = {})
    public static final class C16551 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C16551(Continuation<? super C16551> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IncrementalSyncController.this.syncTrainingPlan(this);
        }
    }

    private IncrementalSyncController() {
    }

    private final List<FitnessDataModel> convertToServerRecordModel(List<? extends DailyRecordBaseEntity> recordList, String replaceSid) {
        ArrayList arrayList = new ArrayList();
        for (DailyRecordBaseEntity dailyRecordBaseEntity : recordList) {
            FitnessDataModel fitnessDataModel = new FitnessDataModel(replaceSid == null ? dailyRecordBaseEntity.getSid() : replaceSid, dailyRecordBaseEntity.getKey(), dailyRecordBaseEntity.getTime());
            fitnessDataModel.setZoneOffsetInSec(Integer.valueOf(dailyRecordBaseEntity.getZoneOffsetInSec()));
            fitnessDataModel.setZoneName(dailyRecordBaseEntity.getZoneName());
            fitnessDataModel.setValue(dailyRecordBaseEntity.getValue());
            arrayList.add(fitnessDataModel);
        }
        return arrayList;
    }

    private final List<SportReportModel> convertToServerSportModel(List<SportReportEntity> sportList) {
        ArrayList arrayList = new ArrayList();
        for (SportReportEntity sportReportEntity : sportList) {
            SportReportModel sportReportModel = new SportReportModel(sportReportEntity.getSid(), sportReportEntity.getKey(), sportReportEntity.getTime());
            sportReportModel.setCategory(sportReportEntity.getCategory());
            sportReportModel.setZoneOffsetInSec(Integer.valueOf(sportReportEntity.getZoneOffsetInSec()));
            sportReportModel.setZoneName(sportReportEntity.getZoneName());
            sportReportModel.setValue(sportReportEntity.getValue());
            arrayList.add(sportReportModel);
        }
        return arrayList;
    }

    private final List<FitnessDataKey> extractFitnessDataKey(List<? extends DailyRecordBaseEntity> recordList) {
        ArrayList arrayList = new ArrayList();
        for (DailyRecordBaseEntity dailyRecordBaseEntity : recordList) {
            arrayList.add(new FitnessDataKey(dailyRecordBaseEntity.getSid(), dailyRecordBaseEntity.getKey(), dailyRecordBaseEntity.getTime()));
        }
        return arrayList;
    }

    private final List<FitnessDataKey> extractSportReportKey(List<SportReportEntity> recordList) {
        ArrayList arrayList = new ArrayList();
        for (SportReportEntity sportReportEntity : recordList) {
            arrayList.add(new FitnessDataKey(sportReportEntity.getSid(), sportReportEntity.getKey(), sportReportEntity.getTime()));
        }
        return arrayList;
    }

    private final FitnessDataRequest getMFitnessRequest() {
        return (FitnessDataRequest) this.mFitnessRequest.getValue();
    }

    private final SportSyncFinishController getSportSyncFinishController() {
        return (SportSyncFinishController) this.sportSyncFinishController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataRequest mFitnessRequest_delegate$lambda$0() {
        return new FitnessDataRequest();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object pullFitnessDataByWaterMark(long j, Continuation<? super SyncRequestResult> continuation) {
        C16271 c16271;
        if (continuation instanceof C16271) {
            c16271 = (C16271) continuation;
            int i = c16271.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16271.label = i - Integer.MIN_VALUE;
            } else {
                c16271 = new C16271(continuation);
            }
        } else {
            c16271 = new C16271(continuation);
        }
        C16271 c16272 = c16271;
        Object objPullAndSaveFitnessDataByWM$default = c16272.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16272.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPullAndSaveFitnessDataByWM$default);
                c16272.label = 1;
                objPullAndSaveFitnessDataByWM$default = CloudSyncBaseRequest.pullAndSaveFitnessDataByWM$default(this, j, false, c16272, 2, null);
                if (objPullAndSaveFitnessDataByWM$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPullAndSaveFitnessDataByWM$default);
            }
            boolean zBooleanValue = ((Boolean) objPullAndSaveFitnessDataByWM$default).booleanValue();
            FitnessLogUtils.i(TAG, "pullFitnessDataByWaterMark: hasNewData = " + zBooleanValue);
            return new SyncRequestResult(true, zBooleanValue, false, null, null, false, 60, null);
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "pullFitnessDataByWaterMark", th);
            return new SyncRequestResult(false, null, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object pullHomeRecentFitnessData(Continuation<? super SyncRequestResult> continuation) {
        C16281 c16281;
        IncrementalSyncController incrementalSyncController;
        long jLongValue;
        boolean zBooleanValue;
        ServerRequestDaoUtils serverRequestDaoUtils;
        boolean z;
        long j;
        if (continuation instanceof C16281) {
            c16281 = (C16281) continuation;
            int i = c16281.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16281.label = i - Integer.MIN_VALUE;
            } else {
                c16281 = new C16281(continuation);
            }
        } else {
            c16281 = new C16281(continuation);
        }
        Object fitnessDataMaxWM = c16281.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16281.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    incrementalSyncController = (IncrementalSyncController) c16281.L$0;
                    ResultKt.throwOnFailure(fitnessDataMaxWM);
                } else if (i2 == 2) {
                    jLongValue = c16281.J$0;
                    ResultKt.throwOnFailure(fitnessDataMaxWM);
                    zBooleanValue = ((Boolean) fitnessDataMaxWM).booleanValue();
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    c16281.J$0 = jLongValue;
                    c16281.Z$0 = zBooleanValue;
                    c16281.label = 3;
                    if (serverRequestDaoUtils.updateFitnessMaxWatermark(jLongValue, c16281) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = zBooleanValue;
                    j = jLongValue;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = c16281.Z$0;
                    j = c16281.J$0;
                    ResultKt.throwOnFailure(fitnessDataMaxWM);
                    z = z2;
                }
                FitnessLogUtils.i(TAG, "pullHomeRecentFitnessData maxWatermark = " + j + ", hasNewData = " + z);
                return new SyncRequestResult(true, z, false, null, null, false, 60, null);
            }
            ResultKt.throwOnFailure(fitnessDataMaxWM);
            FitnessDataRequest mFitnessRequest = getMFitnessRequest();
            c16281.L$0 = this;
            c16281.label = 1;
            fitnessDataMaxWM = mFitnessRequest.getFitnessDataMaxWM(c16281);
            if (fitnessDataMaxWM == coroutine_suspended) {
                return coroutine_suspended;
            }
            incrementalSyncController = this;
            jLongValue = ((Number) fitnessDataMaxWM).longValue();
            c16281.L$0 = null;
            c16281.J$0 = jLongValue;
            c16281.label = 2;
            fitnessDataMaxWM = incrementalSyncController.pullRecentFitnessData(c16281);
            if (fitnessDataMaxWM == coroutine_suspended) {
                return coroutine_suspended;
            }
            zBooleanValue = ((Boolean) fitnessDataMaxWM).booleanValue();
            serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            c16281.J$0 = jLongValue;
            c16281.Z$0 = zBooleanValue;
            c16281.label = 3;
            if (serverRequestDaoUtils.updateFitnessMaxWatermark(jLongValue, c16281) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zBooleanValue;
            j = jLongValue;
            FitnessLogUtils.i(TAG, "pullHomeRecentFitnessData maxWatermark = " + j + ", hasNewData = " + z);
            return new SyncRequestResult(true, z, false, null, null, false, 60, null);
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "pullHomeRecentFitnessData", th);
            return new SyncRequestResult(false, null, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x0090 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object pullHomeRecentSportReport(Continuation<? super SyncRequestResult> continuation) {
        C16291 c16291;
        IncrementalSyncController incrementalSyncController;
        long j;
        boolean zBooleanValue;
        ServerRequestDaoUtils serverRequestDaoUtils;
        boolean z;
        long j2;
        if (continuation instanceof C16291) {
            c16291 = (C16291) continuation;
            int i = c16291.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16291.label = i - Integer.MIN_VALUE;
            } else {
                c16291 = new C16291(continuation);
            }
        } else {
            c16291 = new C16291(continuation);
        }
        Object sportMaxWatermark = c16291.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16291.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    incrementalSyncController = (IncrementalSyncController) c16291.L$0;
                    ResultKt.throwOnFailure(sportMaxWatermark);
                } else if (i2 == 2) {
                    j = c16291.J$0;
                    ResultKt.throwOnFailure(sportMaxWatermark);
                    zBooleanValue = ((Boolean) sportMaxWatermark).booleanValue();
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    c16291.J$0 = j;
                    c16291.Z$0 = zBooleanValue;
                    c16291.label = 3;
                    if (serverRequestDaoUtils.updateSportMaxWatermark(j, c16291) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = zBooleanValue;
                    j2 = j;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = c16291.Z$0;
                    j2 = c16291.J$0;
                    ResultKt.throwOnFailure(sportMaxWatermark);
                    z = z2;
                }
                FitnessLogUtils.i(TAG, "pullHomeRecentSportReport maxWatermark = " + j2 + ",hasData = " + z);
                return new SyncRequestResult(true, z, false, null, null, false, 60, null);
            }
            ResultKt.throwOnFailure(sportMaxWatermark);
            FitnessDataRequest mFitnessRequest = getMFitnessRequest();
            c16291.L$0 = this;
            c16291.label = 1;
            sportMaxWatermark = mFitnessRequest.getSportMaxWatermark(c16291);
            if (sportMaxWatermark == coroutine_suspended) {
                return coroutine_suspended;
            }
            incrementalSyncController = this;
            long jLongValue = ((Number) sportMaxWatermark).longValue();
            c16291.L$0 = null;
            c16291.J$0 = jLongValue;
            c16291.label = 2;
            sportMaxWatermark = CloudSyncBaseRequest.pullAndSaveLatestSportReport$default(incrementalSyncController, null, c16291, 1, null);
            if (sportMaxWatermark == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = jLongValue;
            zBooleanValue = ((Boolean) sportMaxWatermark).booleanValue();
            serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            c16291.J$0 = j;
            c16291.Z$0 = zBooleanValue;
            c16291.label = 3;
            if (serverRequestDaoUtils.updateSportMaxWatermark(j, c16291) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zBooleanValue;
            j2 = j;
            FitnessLogUtils.i(TAG, "pullHomeRecentSportReport maxWatermark = " + j2 + ",hasData = " + z);
            return new SyncRequestResult(true, z, false, null, null, false, 60, null);
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "pullHomeRecentSportReport", th);
            return new SyncRequestResult(false, null, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object pullMedicalDataByWaterMark(long j, Continuation<? super SyncRequestResult> continuation) {
        C16301 c16301;
        if (continuation instanceof C16301) {
            c16301 = (C16301) continuation;
            int i = c16301.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16301.label = i - Integer.MIN_VALUE;
            } else {
                c16301 = new C16301(continuation);
            }
        } else {
            c16301 = new C16301(continuation);
        }
        Object objPullAndSaveFitnessDataByWM = c16301.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16301.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPullAndSaveFitnessDataByWM);
                c16301.label = 1;
                objPullAndSaveFitnessDataByWM = pullAndSaveFitnessDataByWM(j, true, c16301);
                if (objPullAndSaveFitnessDataByWM == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPullAndSaveFitnessDataByWM);
            }
            boolean zBooleanValue = ((Boolean) objPullAndSaveFitnessDataByWM).booleanValue();
            FitnessLogUtils.i(TAG, "pullMedicalDataByWaterMark: hasNewData = " + zBooleanValue);
            return new SyncRequestResult(true, zBooleanValue, false, null, null, false, 60, null);
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "pullMedicalDataByWaterMark", th);
            return new SyncRequestResult(false, null, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00df A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:39:0x0108  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object pullProjectDataByTime(Continuation<? super Boolean> continuation) {
        C16311 c16311;
        IncrementalSyncController incrementalSyncController;
        IncrementalSyncController incrementalSyncController2;
        GetProjectByTimeResponse getProjectByTimeResponse;
        IncrementalSyncController incrementalSyncController3;
        GetProjectByTimeResponse getProjectByTimeResponse2;
        List<ProjectDataModel> dataList;
        GetProjectByTimeResponse getProjectByTimeResponse3;
        GetProjectByTimeResponse getProjectByTimeResponse4;
        List<ProjectDataModel> dataList2;
        Boolean boolBoxBoolean;
        List<ProjectDataModel> dataList3;
        List<ProjectDataModel> dataList4;
        if (continuation instanceof C16311) {
            c16311 = (C16311) continuation;
            int i = c16311.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16311.label = i - Integer.MIN_VALUE;
            } else {
                c16311 = new C16311(continuation);
            }
        } else {
            c16311 = new C16311(continuation);
        }
        Object projectDataByTime = c16311.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16311.label;
        boolean z = true;
        if (i2 != 0) {
            if (i2 == 1) {
                incrementalSyncController = (IncrementalSyncController) c16311.L$0;
                ResultKt.throwOnFailure(projectDataByTime);
            } else if (i2 == 2) {
                getProjectByTimeResponse = (GetProjectByTimeResponse) c16311.L$1;
                incrementalSyncController2 = (IncrementalSyncController) c16311.L$0;
                ResultKt.throwOnFailure(projectDataByTime);
                FitnessLogUtils.i(TAG, "pullRecentProjectData(sleep_wake_circle)-" + getProjectByTimeResponse);
                GetProjectByTimeParams getProjectByTimeParams = new GetProjectByTimeParams(ProjectPersistKey.KEY_SLEEP_DIARY, null, null, null, 30, false, 46, null);
                FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
                c16311.L$0 = incrementalSyncController2;
                c16311.L$1 = getProjectByTimeResponse;
                c16311.label = 3;
                projectDataByTime = companion.getProjectDataByTime(getProjectByTimeParams, c16311);
                if (projectDataByTime == coroutine_suspended) {
                    return coroutine_suspended;
                }
                incrementalSyncController3 = incrementalSyncController2;
                getProjectByTimeResponse2 = (GetProjectByTimeResponse) projectDataByTime;
                dataList = getProjectByTimeResponse2.getDataList();
                c16311.L$0 = getProjectByTimeResponse;
                c16311.L$1 = getProjectByTimeResponse2;
                c16311.label = 4;
                if (incrementalSyncController3.saveProjectDataToDB(dataList, c16311) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                getProjectByTimeResponse3 = getProjectByTimeResponse2;
                getProjectByTimeResponse4 = getProjectByTimeResponse;
            } else if (i2 == 3) {
                getProjectByTimeResponse = (GetProjectByTimeResponse) c16311.L$1;
                incrementalSyncController3 = (IncrementalSyncController) c16311.L$0;
                ResultKt.throwOnFailure(projectDataByTime);
                getProjectByTimeResponse2 = (GetProjectByTimeResponse) projectDataByTime;
                dataList = getProjectByTimeResponse2.getDataList();
                c16311.L$0 = getProjectByTimeResponse;
                c16311.L$1 = getProjectByTimeResponse2;
                c16311.label = 4;
                if (incrementalSyncController3.saveProjectDataToDB(dataList, c16311) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                getProjectByTimeResponse3 = getProjectByTimeResponse2;
                getProjectByTimeResponse4 = getProjectByTimeResponse;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                getProjectByTimeResponse3 = (GetProjectByTimeResponse) c16311.L$1;
                getProjectByTimeResponse4 = (GetProjectByTimeResponse) c16311.L$0;
                ResultKt.throwOnFailure(projectDataByTime);
            }
            dataList2 = getProjectByTimeResponse3.getDataList();
            if (dataList2 != null) {
                boolBoxBoolean = Boxing.boxBoolean(!dataList2.isEmpty());
            } else {
                boolBoxBoolean = null;
            }
            FitnessLogUtils.i(TAG, "pullRecentProjectData sleep_diary-" + boolBoxBoolean);
            dataList3 = getProjectByTimeResponse3.getDataList();
            if ((dataList3 != null || !(!dataList3.isEmpty())) && ((dataList4 = getProjectByTimeResponse4.getDataList()) == null || !(!dataList4.isEmpty()))) {
            }
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(projectDataByTime);
        GetProjectByTimeParams getProjectByTimeParams2 = new GetProjectByTimeParams(ProjectPersistKey.KEY_SLEEP_RHYTHM, null, null, null, 1, false, 46, null);
        FitnessDataRequest companion2 = FitnessDataRequest.INSTANCE.getInstance();
        c16311.L$0 = this;
        c16311.label = 1;
        projectDataByTime = companion2.getProjectDataByTime(getProjectByTimeParams2, c16311);
        if (projectDataByTime == coroutine_suspended) {
            return coroutine_suspended;
        }
        incrementalSyncController = this;
        GetProjectByTimeResponse getProjectByTimeResponse5 = (GetProjectByTimeResponse) projectDataByTime;
        List<ProjectDataModel> dataList5 = getProjectByTimeResponse5.getDataList();
        c16311.L$0 = incrementalSyncController;
        c16311.L$1 = getProjectByTimeResponse5;
        c16311.label = 2;
        if (incrementalSyncController.saveProjectDataToDB(dataList5, c16311) == coroutine_suspended) {
            return coroutine_suspended;
        }
        incrementalSyncController2 = incrementalSyncController;
        getProjectByTimeResponse = getProjectByTimeResponse5;
        FitnessLogUtils.i(TAG, "pullRecentProjectData(sleep_wake_circle)-" + getProjectByTimeResponse);
        GetProjectByTimeParams getProjectByTimeParams3 = new GetProjectByTimeParams(ProjectPersistKey.KEY_SLEEP_DIARY, null, null, null, 30, false, 46, null);
        FitnessDataRequest companion3 = FitnessDataRequest.INSTANCE.getInstance();
        c16311.L$0 = incrementalSyncController2;
        c16311.L$1 = getProjectByTimeResponse;
        c16311.label = 3;
        projectDataByTime = companion3.getProjectDataByTime(getProjectByTimeParams3, c16311);
        if (projectDataByTime == coroutine_suspended) {
            return coroutine_suspended;
        }
        incrementalSyncController3 = incrementalSyncController2;
        getProjectByTimeResponse2 = (GetProjectByTimeResponse) projectDataByTime;
        dataList = getProjectByTimeResponse2.getDataList();
        c16311.L$0 = getProjectByTimeResponse;
        c16311.L$1 = getProjectByTimeResponse2;
        c16311.label = 4;
        if (incrementalSyncController3.saveProjectDataToDB(dataList, c16311) == coroutine_suspended) {
            return coroutine_suspended;
        }
        getProjectByTimeResponse3 = getProjectByTimeResponse2;
        getProjectByTimeResponse4 = getProjectByTimeResponse;
        dataList2 = getProjectByTimeResponse3.getDataList();
        if (dataList2 != null) {
            boolBoxBoolean = Boxing.boxBoolean(!dataList2.isEmpty());
        } else {
            boolBoxBoolean = null;
        }
        FitnessLogUtils.i(TAG, "pullRecentProjectData sleep_diary-" + boolBoxBoolean);
        dataList3 = getProjectByTimeResponse3.getDataList();
        z = dataList3 != null ? false : false;
        return Boxing.boxBoolean(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00de  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object pullProjectDataByWM(Long l, int i, Continuation<? super Boolean> continuation) {
        C16321 c16321;
        IncrementalSyncController incrementalSyncController;
        GetProjectByWMResponse getProjectByWMResponse;
        ServerRequestDaoUtils serverRequestDaoUtils;
        long waterMark;
        List<ProjectDataModel> dataList;
        boolean z;
        Object objPullProjectDataByWM$default;
        int i2;
        if (continuation instanceof C16321) {
            c16321 = (C16321) continuation;
            int i3 = c16321.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c16321.label = i3 - Integer.MIN_VALUE;
            } else {
                c16321 = new C16321(continuation);
            }
        } else {
            c16321 = new C16321(continuation);
        }
        C16321 c16322 = c16321;
        Object projectDataByWM = c16322.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c16322.label;
        if (i4 != 0) {
            if (i4 == 1) {
                IncrementalSyncController incrementalSyncController2 = (IncrementalSyncController) c16322.L$0;
                ResultKt.throwOnFailure(projectDataByWM);
                incrementalSyncController = incrementalSyncController2;
            } else {
                if (i4 == 2) {
                    getProjectByWMResponse = (GetProjectByWMResponse) c16322.L$1;
                    incrementalSyncController = (IncrementalSyncController) c16322.L$0;
                    ResultKt.throwOnFailure(projectDataByWM);
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    waterMark = getProjectByWMResponse.getWaterMark();
                    c16322.L$0 = incrementalSyncController;
                    c16322.L$1 = getProjectByWMResponse;
                    c16322.label = 3;
                    if (serverRequestDaoUtils.updateProjectMaxWatermark(waterMark, c16322) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    dataList = getProjectByWMResponse.getDataList();
                    if (dataList == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (getProjectByWMResponse.getHasMore()) {
                        Long lBoxLong = Boxing.boxLong(getProjectByWMResponse.getWaterMark());
                        c16322.L$0 = null;
                        c16322.L$1 = null;
                        c16322.I$0 = z ? 1 : 0;
                        c16322.label = 4;
                        objPullProjectDataByWM$default = pullProjectDataByWM$default(incrementalSyncController, lBoxLong, 0, c16322, 2, null);
                        if (objPullProjectDataByWM$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Object[] objArr = z ? 1 : 0;
                        projectDataByWM = objPullProjectDataByWM$default;
                        i2 = objArr == true ? 1 : 0;
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i4 == 3) {
                    getProjectByWMResponse = (GetProjectByWMResponse) c16322.L$1;
                    incrementalSyncController = (IncrementalSyncController) c16322.L$0;
                    ResultKt.throwOnFailure(projectDataByWM);
                    dataList = getProjectByWMResponse.getDataList();
                    if (dataList == null && (!dataList.isEmpty())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (getProjectByWMResponse.getHasMore()) {
                        Long lBoxLong2 = Boxing.boxLong(getProjectByWMResponse.getWaterMark());
                        c16322.L$0 = null;
                        c16322.L$1 = null;
                        c16322.I$0 = z ? 1 : 0;
                        c16322.label = 4;
                        objPullProjectDataByWM$default = pullProjectDataByWM$default(incrementalSyncController, lBoxLong2, 0, c16322, 2, null);
                        if (objPullProjectDataByWM$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Object[] objArr2 = z ? 1 : 0;
                        projectDataByWM = objPullProjectDataByWM$default;
                        i2 = objArr2 == true ? 1 : 0;
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = c16322.I$0;
                ResultKt.throwOnFailure(projectDataByWM);
            }
            z = i2 == 0 || ((Boolean) projectDataByWM).booleanValue();
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(projectDataByWM);
        FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
        c16322.L$0 = this;
        c16322.label = 1;
        projectDataByWM = companion.getProjectDataByWM(l, c16322);
        if (projectDataByWM == coroutine_suspended) {
            return coroutine_suspended;
        }
        incrementalSyncController = this;
        GetProjectByWMResponse getProjectByWMResponse2 = (GetProjectByWMResponse) projectDataByWM;
        List<ProjectDataModel> dataList2 = getProjectByWMResponse2.getDataList();
        c16322.L$0 = incrementalSyncController;
        c16322.L$1 = getProjectByWMResponse2;
        c16322.label = 2;
        if (incrementalSyncController.saveProjectDataToDB(dataList2, c16322) == coroutine_suspended) {
            return coroutine_suspended;
        }
        getProjectByWMResponse = getProjectByWMResponse2;
        serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        waterMark = getProjectByWMResponse.getWaterMark();
        c16322.L$0 = incrementalSyncController;
        c16322.L$1 = getProjectByWMResponse;
        c16322.label = 3;
        if (serverRequestDaoUtils.updateProjectMaxWatermark(waterMark, c16322) == coroutine_suspended) {
            return coroutine_suspended;
        }
        dataList = getProjectByWMResponse.getDataList();
        if (dataList == null) {
            z = false;
        } else {
            z = false;
        }
        if (getProjectByWMResponse.getHasMore()) {
            Long lBoxLong3 = Boxing.boxLong(getProjectByWMResponse.getWaterMark());
            c16322.L$0 = null;
            c16322.L$1 = null;
            c16322.I$0 = z ? 1 : 0;
            c16322.label = 4;
            objPullProjectDataByWM$default = pullProjectDataByWM$default(incrementalSyncController, lBoxLong3, 0, c16322, 2, null);
            if (objPullProjectDataByWM$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            Object[] objArr3 = z ? 1 : 0;
            projectDataByWM = objPullProjectDataByWM$default;
            i2 = objArr3 == true ? 1 : 0;
            z = i2 == 0 || ((Boolean) projectDataByWM).booleanValue();
        }
        return Boxing.boxBoolean(z);
    }

    public static /* synthetic */ Object pullProjectDataByWM$default(IncrementalSyncController incrementalSyncController, Long l, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 30;
        }
        return incrementalSyncController.pullProjectDataByWM(l, i, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object pullRecentAllDayData(Continuation<? super Boolean> continuation) {
        long todayZeroTimeInSec = FitnessDateUtils.getTodayZeroTimeInSec();
        long seconds = TimeUnit.DAYS.toSeconds(1L);
        return CloudSyncBaseRequest.pullAndSaveFitnessDataByTime$default(this, null, null, todayZeroTimeInSec - seconds, todayZeroTimeInSec + (((long) 2) * seconds), null, false, continuation, 48, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pullRecentFitnessData(Continuation<? super Boolean> continuation) {
        C16331 c16331;
        IncrementalSyncController incrementalSyncController;
        boolean z;
        if (continuation instanceof C16331) {
            c16331 = (C16331) continuation;
            int i = c16331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16331.label = i - Integer.MIN_VALUE;
            } else {
                c16331 = new C16331(continuation);
            }
        } else {
            c16331 = new C16331(continuation);
        }
        Object objPullRecentAllDayData = c16331.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16331.label;
        boolean z2 = true;
        if (i2 != 0) {
            if (i2 == 1) {
                incrementalSyncController = (IncrementalSyncController) c16331.L$0;
                ResultKt.throwOnFailure(objPullRecentAllDayData);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = c16331.Z$0;
                ResultKt.throwOnFailure(objPullRecentAllDayData);
            }
            boolean zBooleanValue = ((Boolean) objPullRecentAllDayData).booleanValue();
            FitnessLogUtils.i(TAG, "pullRecentFitnessData: hasAllDayData = " + z + ", hasSingleData = " + zBooleanValue);
            if (!z && !zBooleanValue) {
                z2 = false;
            }
            return Boxing.boxBoolean(z2);
        }
        ResultKt.throwOnFailure(objPullRecentAllDayData);
        c16331.L$0 = this;
        c16331.label = 1;
        objPullRecentAllDayData = pullRecentAllDayData(c16331);
        if (objPullRecentAllDayData == coroutine_suspended) {
            return coroutine_suspended;
        }
        incrementalSyncController = this;
        boolean zBooleanValue2 = ((Boolean) objPullRecentAllDayData).booleanValue();
        c16331.L$0 = null;
        c16331.Z$0 = zBooleanValue2;
        c16331.label = 2;
        Object objPullRecentSingleData = incrementalSyncController.pullRecentSingleData(c16331);
        if (objPullRecentSingleData == coroutine_suspended) {
            return coroutine_suspended;
        }
        z = zBooleanValue2;
        objPullRecentAllDayData = objPullRecentSingleData;
        boolean zBooleanValue3 = ((Boolean) objPullRecentAllDayData).booleanValue();
        FitnessLogUtils.i(TAG, "pullRecentFitnessData: hasAllDayData = " + z + ", hasSingleData = " + zBooleanValue3);
        if (!z) {
            z2 = false;
        }
        return Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object pullRecentMedicalData(Continuation<? super SyncRequestResult> continuation) {
        C16341 c16341;
        IncrementalSyncController incrementalSyncController;
        long j;
        boolean zBooleanValue;
        ServerRequestDaoUtils serverRequestDaoUtils;
        boolean z;
        long j2;
        if (continuation instanceof C16341) {
            c16341 = (C16341) continuation;
            int i = c16341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16341.label = i - Integer.MIN_VALUE;
            } else {
                c16341 = new C16341(continuation);
            }
        } else {
            c16341 = new C16341(continuation);
        }
        Object medicalDataMaxWM = c16341.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16341.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    incrementalSyncController = (IncrementalSyncController) c16341.L$0;
                    ResultKt.throwOnFailure(medicalDataMaxWM);
                } else if (i2 == 2) {
                    j = c16341.J$0;
                    ResultKt.throwOnFailure(medicalDataMaxWM);
                    zBooleanValue = ((Boolean) medicalDataMaxWM).booleanValue();
                    serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                    c16341.J$0 = j;
                    c16341.Z$0 = zBooleanValue;
                    c16341.label = 3;
                    if (serverRequestDaoUtils.updateMedicalMaxWatermark(j, c16341) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z = zBooleanValue;
                    j2 = j;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z2 = c16341.Z$0;
                    j2 = c16341.J$0;
                    ResultKt.throwOnFailure(medicalDataMaxWM);
                    z = z2;
                }
                FitnessLogUtils.i(TAG, "pullRecentMedicalData maxWatermark = " + j2 + ", hasNewData = " + z);
                return new SyncRequestResult(true, z, false, null, null, false, 60, null);
            }
            ResultKt.throwOnFailure(medicalDataMaxWM);
            FitnessDataRequest mFitnessRequest = getMFitnessRequest();
            c16341.L$0 = this;
            c16341.label = 1;
            medicalDataMaxWM = mFitnessRequest.getMedicalDataMaxWM(c16341);
            if (medicalDataMaxWM == coroutine_suspended) {
                return coroutine_suspended;
            }
            incrementalSyncController = this;
            long jLongValue = ((Number) medicalDataMaxWM).longValue();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new LatestFitnessDataModel(FitnessPersistKey.BloodPressureMedical, 1, null, 4, null));
            arrayList.add(new LatestFitnessDataModel(FitnessPersistKey.EcgMedical, 1, null, 4, null));
            c16341.L$0 = null;
            c16341.J$0 = jLongValue;
            c16341.label = 2;
            medicalDataMaxWM = incrementalSyncController.pullAndSaveLatestFitnessData(arrayList, true, c16341);
            if (medicalDataMaxWM == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = jLongValue;
            zBooleanValue = ((Boolean) medicalDataMaxWM).booleanValue();
            serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            c16341.J$0 = j;
            c16341.Z$0 = zBooleanValue;
            c16341.label = 3;
            if (serverRequestDaoUtils.updateMedicalMaxWatermark(j, c16341) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zBooleanValue;
            j2 = j;
            FitnessLogUtils.i(TAG, "pullRecentMedicalData maxWatermark = " + j2 + ", hasNewData = " + z);
            return new SyncRequestResult(true, z, false, null, null, false, 60, null);
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "pullRecentMedicalData", th);
            return new SyncRequestResult(false, null, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object pullRecentSingleData(Continuation<? super Boolean> continuation) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new LatestFitnessDataModel("abnormal_heart_beat", 1, null, 4, null));
        arrayList.add(new LatestFitnessDataModel("blood_pressure", 1, null, 4, null));
        arrayList.add(new LatestFitnessDataModel(FitnessPersistKey.Vo2Max, 1, null, 4, null));
        arrayList.add(new LatestFitnessDataModel("pai", 7, null, 4, null));
        arrayList.add(new LatestFitnessDataModel("weight", 7, null, 4, null));
        arrayList.add(new LatestFitnessDataModel(FitnessPersistKey.WomenHealthStatus, 1, null, 4, null));
        arrayList.add(new LatestFitnessDataModel(FitnessPersistKey.RunningIndicator, 1, null, 4, null));
        arrayList.add(new LatestFitnessDataModel("energy", 1, null, 4, null));
        arrayList.add(new LatestFitnessDataModel(FitnessPersistKey.ManualTemperature, 1, null, 4, null));
        arrayList.add(new LatestFitnessDataModel(FitnessPersistKey.TrainingLoad, 1, null, 4, null));
        arrayList.add(new LatestFitnessDataModel("headset", 1, null, 4, null));
        return CloudSyncBaseRequest.pullAndSaveLatestFitnessData$default(this, arrayList, false, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public final Object pullSportReportByWaterMark(long j, Continuation<? super SyncRequestResult> continuation) {
        C16351 c16351;
        if (continuation instanceof C16351) {
            c16351 = (C16351) continuation;
            int i = c16351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16351.label = i - Integer.MIN_VALUE;
            } else {
                c16351 = new C16351(continuation);
            }
        } else {
            c16351 = new C16351(continuation);
        }
        Object objPullAndSaveSportReportByWM = c16351.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16351.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objPullAndSaveSportReportByWM);
                c16351.label = 1;
                objPullAndSaveSportReportByWM = pullAndSaveSportReportByWM(j, c16351);
                if (objPullAndSaveSportReportByWM == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objPullAndSaveSportReportByWM);
            }
            return new SyncRequestResult(true, ((Boolean) objPullAndSaveSportReportByWM).booleanValue(), false, null, null, false, 60, null);
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "pullSportReportByWaterMark", th);
            return new SyncRequestResult(false, null, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x005d A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:12:0x003c, B:25:0x0084, B:31:0x0092, B:21:0x005d, B:32:0x0095, B:19:0x0050), top: B:36:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:27:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007c -> B:25:0x0084). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object pushAllFitnessData2Server(kotlin.coroutines.Continuation<? super com.xiaomi.fit.fitness.persist.process.SyncRequestResult> r20) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController.pushAllFitnessData2Server(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:12:0x003c, B:25:0x0076, B:31:0x0084, B:21:0x005b, B:32:0x008b, B:19:0x004e), top: B:36:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:23:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:30:0x0083  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0070 -> B:25:0x0076). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object pushAllMedicalData2Server(kotlin.coroutines.Continuation<? super com.xiaomi.fit.fitness.persist.process.SyncRequestResult> r20) {
        /*
            r19 = this;
            r0 = r20
            boolean r1 = r0 instanceof com.xiaomi.fit.fitness.persist.process.IncrementalSyncController.C16371
            if (r1 == 0) goto L17
            r1 = r0
            com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushAllMedicalData2Server$1 r1 = (com.xiaomi.fit.fitness.persist.process.IncrementalSyncController.C16371) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.label = r2
            r2 = r19
            goto L1e
        L17:
            com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushAllMedicalData2Server$1 r1 = new com.xiaomi.fit.fitness.persist.process.IncrementalSyncController$pushAllMedicalData2Server$1
            r2 = r19
            r1.<init>(r0)
        L1e:
            java.lang.Object r0 = r1.result
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.label
            java.lang.String r5 = "IncrementalSyncController"
            r6 = 0
            r7 = 1
            if (r4 == 0) goto L4b
            if (r4 != r7) goto L43
            int r4 = r1.I$2
            int r8 = r1.I$1
            int r9 = r1.I$0
            java.lang.Object r10 = r1.L$1
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.lang.Object r11 = r1.L$0
            com.xiaomi.fit.fitness.persist.process.IncrementalSyncController r11 = (com.xiaomi.fit.fitness.persist.process.IncrementalSyncController) r11
            kotlin.ResultKt.throwOnFailure(r0)     // Catch: java.lang.Throwable -> L40
            goto L76
        L40:
            r0 = move-exception
            goto Laf
        L43:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L4b:
            kotlin.ResultKt.throwOnFailure(r0)
            com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoRepo r0 = com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoRepo.INSTANCE     // Catch: java.lang.Throwable -> L40
            java.lang.String[] r0 = r0.getMedicalDataKeys()     // Catch: java.lang.Throwable -> L40
            int r4 = r0.length     // Catch: java.lang.Throwable -> L40
            r10 = r0
            r0 = r2
            r8 = r6
            r11 = r8
        L59:
            if (r8 >= r4) goto L8b
            r9 = r10[r8]     // Catch: java.lang.Throwable -> L40
            r1.L$0 = r0     // Catch: java.lang.Throwable -> L40
            r1.L$1 = r10     // Catch: java.lang.Throwable -> L40
            r1.I$0 = r11     // Catch: java.lang.Throwable -> L40
            r1.I$1 = r8     // Catch: java.lang.Throwable -> L40
            r1.I$2 = r4     // Catch: java.lang.Throwable -> L40
            r1.label = r7     // Catch: java.lang.Throwable -> L40
            java.lang.Object r9 = r0.pushFitnessData2Server(r9, r7, r1)     // Catch: java.lang.Throwable -> L40
            if (r9 != r3) goto L70
            return r3
        L70:
            r18 = r11
            r11 = r0
            r0 = r9
            r9 = r18
        L76:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L40
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L40
            if (r9 != 0) goto L83
            if (r0 == 0) goto L81
            goto L83
        L81:
            r0 = r6
            goto L84
        L83:
            r0 = r7
        L84:
            int r8 = r8 + r7
            r18 = r11
            r11 = r0
            r0 = r18
            goto L59
        L8b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r0.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r1 = "pushAllMedicalData2Server: hasData = "
            r0.append(r1)     // Catch: java.lang.Throwable -> L40
            r0.append(r11)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L40
            com.xiaomi.fit.data.common.log.FitnessLogUtils.i(r5, r0)     // Catch: java.lang.Throwable -> L40
            com.xiaomi.fit.fitness.persist.process.SyncRequestResult r0 = new com.xiaomi.fit.fitness.persist.process.SyncRequestResult     // Catch: java.lang.Throwable -> L40
            r16 = 60
            r17 = 0
            r10 = 1
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch: java.lang.Throwable -> L40
            goto Lbf
        Laf:
            java.lang.String r1 = "pushAllMedicalData2Server"
            com.xiaomi.fit.data.common.log.FitnessLogUtils.e(r5, r1, r0)
            com.xiaomi.fit.fitness.persist.process.SyncRequestResult r1 = new com.xiaomi.fit.fitness.persist.process.SyncRequestResult
            r3 = 0
            java.lang.String r0 = r0.getMessage()
            r1.<init>(r6, r3, r0)
            r0 = r1
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.process.IncrementalSyncController.pushAllMedicalData2Server(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af A[LOOP:1: B:32:0x00a9->B:34:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0097 -> B:17:0x0047). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ce -> B:17:0x0047). Please report as a decompilation issue!!! */
    public final Object pushAllProjectData2Server(Continuation<? super Boolean> continuation) throws IOException {
        C16381 c16381;
        int i;
        List<ProjectEntity> notUpLoadProjectList;
        ArrayList arrayList;
        Iterator it;
        ProjectEntityDaoProxy projectEntityDaoProxy;
        if (continuation instanceof C16381) {
            c16381 = (C16381) continuation;
            int i2 = c16381.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16381.label = i2 - Integer.MIN_VALUE;
            } else {
                c16381 = new C16381(continuation);
            }
        } else {
            c16381 = new C16381(continuation);
        }
        Object objUpProjectData = c16381.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c16381.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUpProjectData);
            i = 0;
        } else if (i3 == 1) {
            i = c16381.I$0;
            notUpLoadProjectList = (List) c16381.L$0;
            ResultKt.throwOnFailure(objUpProjectData);
            if (((Boolean) objUpProjectData).booleanValue()) {
                List<ProjectEntity> list = notUpLoadProjectList;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    ((ProjectEntity) it.next()).setUpload(true);
                    arrayList.add(Unit.INSTANCE);
                }
                projectEntityDaoProxy = ProjectEntityDaoProxy.INSTANCE;
                c16381.L$0 = null;
                c16381.I$0 = 1;
                c16381.label = 2;
                if (projectEntityDaoProxy.updateAllProjectData(notUpLoadProjectList, c16381) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = 1;
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c16381.I$0;
            ResultKt.throwOnFailure(objUpProjectData);
        }
        notUpLoadProjectList = ProjectEntityDaoProxy.INSTANCE.getNotUpLoadProjectList();
        List<ProjectEntity> list2 = notUpLoadProjectList;
        if (list2 != null || list2.isEmpty()) {
            FitnessLogUtils.d(TAG, "pushAllProjectData2Server: no more record()");
            return Boxing.boxBoolean(i != 0);
        }
        List<ProjectEntity> list3 = notUpLoadProjectList;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ProjectEntityKt.toProjectDataModel((ProjectEntity) it2.next()));
        }
        FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
        c16381.L$0 = notUpLoadProjectList;
        c16381.I$0 = i;
        c16381.label = 1;
        objUpProjectData = companion.upProjectData(arrayList2, c16381);
        if (objUpProjectData == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (((Boolean) objUpProjectData).booleanValue()) {
            List<ProjectEntity> list4 = notUpLoadProjectList;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
            it = list4.iterator();
            while (it.hasNext()) {
                ((ProjectEntity) it.next()).setUpload(true);
                arrayList.add(Unit.INSTANCE);
            }
            projectEntityDaoProxy = ProjectEntityDaoProxy.INSTANCE;
            c16381.L$0 = null;
            c16381.I$0 = 1;
            c16381.label = 2;
            if (projectEntityDaoProxy.updateAllProjectData(notUpLoadProjectList, c16381) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i = 1;
        }
        notUpLoadProjectList = ProjectEntityDaoProxy.INSTANCE.getNotUpLoadProjectList();
        List<ProjectEntity> list5 = notUpLoadProjectList;
        if (list5 != null) {
        }
        FitnessLogUtils.d(TAG, "pushAllProjectData2Server: no more record()");
        return Boxing.boxBoolean(i != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x0079  */
    /* JADX WARN: Code duplicated, block: B:37:0x0111  */
    /* JADX WARN: Code duplicated, block: B:41:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00cd -> B:34:0x00d8). Please report as a decompilation issue!!! */
    public final Object pushDeletedDailyData(String str, boolean z, Continuation<? super Boolean> continuation) {
        C16391 c16391;
        IncrementalSyncController incrementalSyncController;
        String str2;
        C16391 c16392;
        IncrementalSyncController incrementalSyncController2;
        int i;
        boolean z2;
        List<DailyRecordBaseEntity> softDeletedDailyData;
        List<DailyRecordBaseEntity> list;
        String str3;
        boolean z3;
        int i2;
        boolean zBooleanValue;
        if (continuation instanceof C16391) {
            c16391 = (C16391) continuation;
            int i3 = c16391.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c16391.label = i3 - Integer.MIN_VALUE;
                incrementalSyncController = this;
            } else {
                incrementalSyncController = this;
                c16391 = incrementalSyncController.new C16391(continuation);
            }
        } else {
            incrementalSyncController = this;
            c16391 = incrementalSyncController.new C16391(continuation);
        }
        Object obj = c16391.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c16391.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            str2 = str;
            c16392 = c16391;
            incrementalSyncController2 = incrementalSyncController;
            i = 0;
            z2 = z;
            softDeletedDailyData = DailyRecordDaoUtils.INSTANCE.getSoftDeletedDailyData(str2, 60);
            list = softDeletedDailyData;
            if (list != null) {
            }
            FitnessLogUtils.d(TAG, "pushDeletedDailyData: no more record(" + str2 + ")");
            return Boxing.boxBoolean(i != 0);
        }
        if (i4 == 1) {
            i2 = c16391.I$0;
            z3 = c16391.Z$0;
            softDeletedDailyData = (List) c16391.L$2;
            str3 = (String) c16391.L$1;
            incrementalSyncController2 = (IncrementalSyncController) c16391.L$0;
            ResultKt.throwOnFailure(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            int i5 = i2;
            c16392 = c16391;
            z2 = z3;
            i = i5;
            FitnessLogUtils.i(TAG, "pushDeletedDailyData(result-" + zBooleanValue + "), " + str3 + "(medical-" + z2 + "), size=" + softDeletedDailyData.size());
            if (zBooleanValue) {
                DailyRecordDaoUtils.INSTANCE.hardDeleteDailyRecord(str3, softDeletedDailyData);
                i = 1;
            }
            str2 = str3;
            softDeletedDailyData = DailyRecordDaoUtils.INSTANCE.getSoftDeletedDailyData(str2, 60);
            list = softDeletedDailyData;
            if (list != null || list.isEmpty()) {
                FitnessLogUtils.d(TAG, "pushDeletedDailyData: no more record(" + str2 + ")");
                return Boxing.boxBoolean(i != 0);
            }
            List<FitnessDataKey> listExtractFitnessDataKey = incrementalSyncController2.extractFitnessDataKey(softDeletedDailyData);
            if (z2) {
                FitnessDataRequest mFitnessRequest = incrementalSyncController2.getMFitnessRequest();
                c16392.L$0 = incrementalSyncController2;
                c16392.L$1 = str2;
                c16392.L$2 = softDeletedDailyData;
                c16392.Z$0 = z2;
                c16392.I$0 = i;
                c16392.label = 1;
                Object objDeleteMedicalData = mFitnessRequest.deleteMedicalData(listExtractFitnessDataKey, c16392);
                if (objDeleteMedicalData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = str2;
                int i6 = i;
                z3 = z2;
                c16391 = c16392;
                i2 = i6;
                zBooleanValue = ((Boolean) objDeleteMedicalData).booleanValue();
            } else {
                FitnessDataRequest mFitnessRequest2 = incrementalSyncController2.getMFitnessRequest();
                c16392.L$0 = incrementalSyncController2;
                c16392.L$1 = str2;
                c16392.L$2 = softDeletedDailyData;
                c16392.Z$0 = z2;
                c16392.I$0 = i;
                c16392.label = 2;
                Object objDeleteFitnessData = mFitnessRequest2.deleteFitnessData(listExtractFitnessDataKey, c16392);
                if (objDeleteFitnessData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str3 = str2;
                obj = objDeleteFitnessData;
                int i7 = i;
                z3 = z2;
                c16391 = c16392;
                i2 = i7;
            }
            int i8 = i2;
            c16392 = c16391;
            z2 = z3;
            i = i8;
            FitnessLogUtils.i(TAG, "pushDeletedDailyData(result-" + zBooleanValue + "), " + str3 + "(medical-" + z2 + "), size=" + softDeletedDailyData.size());
            if (zBooleanValue) {
                DailyRecordDaoUtils.INSTANCE.hardDeleteDailyRecord(str3, softDeletedDailyData);
                i = 1;
            }
            str2 = str3;
            softDeletedDailyData = DailyRecordDaoUtils.INSTANCE.getSoftDeletedDailyData(str2, 60);
            list = softDeletedDailyData;
            if (list != null) {
            }
            FitnessLogUtils.d(TAG, "pushDeletedDailyData: no more record(" + str2 + ")");
            return Boxing.boxBoolean(i != 0);
        }
        if (i4 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = c16391.I$0;
        z3 = c16391.Z$0;
        softDeletedDailyData = (List) c16391.L$2;
        str3 = (String) c16391.L$1;
        incrementalSyncController2 = (IncrementalSyncController) c16391.L$0;
        ResultKt.throwOnFailure(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        int i9 = i2;
        c16392 = c16391;
        z2 = z3;
        i = i9;
        FitnessLogUtils.i(TAG, "pushDeletedDailyData(result-" + zBooleanValue + "), " + str3 + "(medical-" + z2 + "), size=" + softDeletedDailyData.size());
        if (zBooleanValue) {
            DailyRecordDaoUtils.INSTANCE.hardDeleteDailyRecord(str3, softDeletedDailyData);
            i = 1;
        }
        str2 = str3;
        softDeletedDailyData = DailyRecordDaoUtils.INSTANCE.getSoftDeletedDailyData(str2, 60);
        list = softDeletedDailyData;
        if (list != null) {
        }
        FitnessLogUtils.d(TAG, "pushDeletedDailyData: no more record(" + str2 + ")");
        return Boxing.boxBoolean(i != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:21:0x005e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    /* JADX WARN: Code duplicated, block: B:25:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b0 -> B:41:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c1 -> B:19:0x0050). Please report as a decompilation issue!!! */
    public final Object pushDeletedProjectData2Server(Continuation<? super Boolean> continuation) throws IOException {
        C16401 c16401;
        int i;
        List<ProjectEntity> list;
        int i2;
        ProjectEntityDaoProxy projectEntityDaoProxy;
        List<ProjectEntity> list2;
        Object deletedDataList;
        if (continuation instanceof C16401) {
            c16401 = (C16401) continuation;
            int i3 = c16401.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c16401.label = i3 - Integer.MIN_VALUE;
            } else {
                c16401 = new C16401(continuation);
            }
        } else {
            c16401 = new C16401(continuation);
        }
        Object objDeleteProjectData = c16401.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c16401.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objDeleteProjectData);
            i = 0;
            ProjectEntityDaoProxy projectEntityDaoProxy2 = ProjectEntityDaoProxy.INSTANCE;
            c16401.L$0 = null;
            c16401.I$0 = i;
            c16401.label = 1;
            deletedDataList = projectEntityDaoProxy2.getDeletedDataList(c16401);
            if (deletedDataList == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = i;
            objDeleteProjectData = deletedDataList;
            list = (List) objDeleteProjectData;
            list2 = list;
            if (list2 != null) {
            }
            FitnessLogUtils.d(TAG, "pushAllProjectData2Server: no more record()");
            return Boxing.boxBoolean(i2 != 0);
        }
        if (i4 == 1) {
            i2 = c16401.I$0;
            ResultKt.throwOnFailure(objDeleteProjectData);
            list = (List) objDeleteProjectData;
            list2 = list;
            if (list2 != null) {
            }
            FitnessLogUtils.d(TAG, "pushAllProjectData2Server: no more record()");
            return Boxing.boxBoolean(i2 != 0);
        }
        if (i4 == 2) {
            i2 = c16401.I$0;
            list = (List) c16401.L$0;
            ResultKt.throwOnFailure(objDeleteProjectData);
            if (((Boolean) objDeleteProjectData).booleanValue()) {
                projectEntityDaoProxy = ProjectEntityDaoProxy.INSTANCE;
                c16401.L$0 = null;
                c16401.I$0 = 1;
                c16401.label = 3;
                if (projectEntityDaoProxy.hardDelete(list, c16401) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = 1;
            }
            ProjectEntityDaoProxy projectEntityDaoProxy3 = ProjectEntityDaoProxy.INSTANCE;
            c16401.L$0 = null;
            c16401.I$0 = i;
            c16401.label = 1;
            deletedDataList = projectEntityDaoProxy3.getDeletedDataList(c16401);
            if (deletedDataList == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = i;
            objDeleteProjectData = deletedDataList;
            list = (List) objDeleteProjectData;
            list2 = list;
            if (list2 != null || list2.isEmpty()) {
                FitnessLogUtils.d(TAG, "pushAllProjectData2Server: no more record()");
                return Boxing.boxBoolean(i2 != 0);
            }
            List<ProjectEntity> list3 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(ProjectEntityKt.toProjectDataKey((ProjectEntity) it.next()));
            }
            FitnessDataRequest companion = FitnessDataRequest.INSTANCE.getInstance();
            c16401.L$0 = list;
            c16401.I$0 = i2;
            c16401.label = 2;
            objDeleteProjectData = companion.deleteProjectData(arrayList, c16401);
            if (objDeleteProjectData == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) objDeleteProjectData).booleanValue()) {
                projectEntityDaoProxy = ProjectEntityDaoProxy.INSTANCE;
                c16401.L$0 = null;
                c16401.I$0 = 1;
                c16401.label = 3;
                if (projectEntityDaoProxy.hardDelete(list, c16401) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i = 1;
            }
            ProjectEntityDaoProxy projectEntityDaoProxy4 = ProjectEntityDaoProxy.INSTANCE;
            c16401.L$0 = null;
            c16401.I$0 = i;
            c16401.label = 1;
            deletedDataList = projectEntityDaoProxy4.getDeletedDataList(c16401);
            if (deletedDataList == coroutine_suspended) {
                return coroutine_suspended;
            }
            i2 = i;
            objDeleteProjectData = deletedDataList;
            list = (List) objDeleteProjectData;
            list2 = list;
            if (list2 != null) {
            }
            FitnessLogUtils.d(TAG, "pushAllProjectData2Server: no more record()");
            return Boxing.boxBoolean(i2 != 0);
        }
        if (i4 != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = c16401.I$0;
        ResultKt.throwOnFailure(objDeleteProjectData);
        i = i2;
        ProjectEntityDaoProxy projectEntityDaoProxy5 = ProjectEntityDaoProxy.INSTANCE;
        c16401.L$0 = null;
        c16401.I$0 = i;
        c16401.label = 1;
        deletedDataList = projectEntityDaoProxy5.getDeletedDataList(c16401);
        if (deletedDataList == coroutine_suspended) {
            return coroutine_suspended;
        }
        i2 = i;
        objDeleteProjectData = deletedDataList;
        list = (List) objDeleteProjectData;
        list2 = list;
        if (list2 != null) {
        }
        FitnessLogUtils.d(TAG, "pushAllProjectData2Server: no more record()");
        return Boxing.boxBoolean(i2 != 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006c -> B:23:0x006f). Please report as a decompilation issue!!! */
    public final Object pushDeletedSportReport2Server(Continuation<? super Boolean> continuation) {
        C16411 c16411;
        boolean z;
        IncrementalSyncController incrementalSyncController;
        List<SportReportEntity> deletedSportReport;
        List<SportReportEntity> list;
        List<FitnessDataKey> listExtractSportReportKey;
        if (continuation instanceof C16411) {
            c16411 = (C16411) continuation;
            int i = c16411.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16411.label = i - Integer.MIN_VALUE;
            } else {
                c16411 = new C16411(continuation);
            }
        } else {
            c16411 = new C16411(continuation);
        }
        Object objDeleteSportReports = c16411.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16411.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objDeleteSportReports);
            z = false;
            incrementalSyncController = this;
            deletedSportReport = SportReportDaoUtils.INSTANCE.getDeletedSportReport(20);
            list = deletedSportReport;
            if (list != null || list.isEmpty()) {
                FitnessLogUtils.i(TAG, "pushDeletedSportReport2Server: no more record");
                return Boxing.boxBoolean(z);
            }
            listExtractSportReportKey = incrementalSyncController.extractSportReportKey(deletedSportReport);
            FitnessDataRequest mFitnessRequest = incrementalSyncController.getMFitnessRequest();
            c16411.L$0 = incrementalSyncController;
            c16411.L$1 = deletedSportReport;
            c16411.L$2 = listExtractSportReportKey;
            c16411.label = 1;
            objDeleteSportReports = mFitnessRequest.deleteSportReports(listExtractSportReportKey, c16411);
            if (objDeleteSportReports == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            listExtractSportReportKey = (List) c16411.L$2;
            deletedSportReport = (List) c16411.L$1;
            incrementalSyncController = (IncrementalSyncController) c16411.L$0;
            ResultKt.throwOnFailure(objDeleteSportReports);
        }
        boolean zBooleanValue = ((Boolean) objDeleteSportReports).booleanValue();
        FitnessLogUtils.i(TAG, "pushDeletedSportReport2Server: result(" + zBooleanValue + "), size(" + listExtractSportReportKey.size() + ")");
        if (zBooleanValue) {
            SportReportDaoUtils.INSTANCE.hardDeleteSportReport(deletedSportReport);
        }
        z = true;
        deletedSportReport = SportReportDaoUtils.INSTANCE.getDeletedSportReport(20);
        list = deletedSportReport;
        if (list != null) {
        }
        FitnessLogUtils.i(TAG, "pushDeletedSportReport2Server: no more record");
        return Boxing.boxBoolean(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:19:0x008a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0131  */
    /* JADX WARN: Code duplicated, block: B:39:0x013a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
    /* JADX WARN: Code duplicated, block: B:43:0x0159  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00eb -> B:34:0x00f8). Please report as a decompilation issue!!! */
    public final Object pushDeviceFitnessData(String str, String str2, boolean z, Continuation<? super Boolean> continuation) {
        C16421 c16421;
        IncrementalSyncController incrementalSyncController;
        String str3;
        boolean z2;
        C16421 c16422;
        IncrementalSyncController incrementalSyncController2;
        int i;
        String str4;
        List<DailyRecordBaseEntity> dailyRecordNotUpload;
        List<DailyRecordBaseEntity> list;
        boolean z3;
        String str5;
        String str6;
        boolean z4;
        int i2;
        List<FitnessDataModel> list2;
        boolean zBooleanValue;
        List<DailyRecordBaseEntity> list3;
        int i3;
        if (continuation instanceof C16421) {
            c16421 = (C16421) continuation;
            int i4 = c16421.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c16421.label = i4 - Integer.MIN_VALUE;
                incrementalSyncController = this;
            } else {
                incrementalSyncController = this;
                c16421 = incrementalSyncController.new C16421(continuation);
            }
        } else {
            incrementalSyncController = this;
            c16421 = incrementalSyncController.new C16421(continuation);
        }
        Object obj = c16421.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c16421.label;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            str3 = str;
            z2 = z;
            c16422 = c16421;
            incrementalSyncController2 = incrementalSyncController;
            i = 0;
            str4 = str2;
            dailyRecordNotUpload = DailyRecordDaoUtils.INSTANCE.getDailyRecordNotUpload(str3, str4, 60);
            list = dailyRecordNotUpload;
            if (list != null) {
            }
            FitnessLogUtils.d(TAG, "pushDeviceFitnessData: no more record(" + str3 + ")");
            if (i != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return Boxing.boxBoolean(z3);
        }
        if (i5 == 1) {
            i2 = c16421.I$0;
            z4 = c16421.Z$0;
            list2 = (List) c16421.L$4;
            dailyRecordNotUpload = (List) c16421.L$3;
            str6 = (String) c16421.L$2;
            str5 = (String) c16421.L$1;
            incrementalSyncController2 = (IncrementalSyncController) c16421.L$0;
            ResultKt.throwOnFailure(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            boolean z5 = z4;
            c16422 = c16421;
            str4 = str6;
            list3 = dailyRecordNotUpload;
            i3 = i2;
            z2 = z5;
            FitnessLogUtils.i(TAG, "pushDeviceFitnessData(result=" + zBooleanValue + "): " + str5 + "(medical-" + z2 + "), size=" + list2.size());
            if (zBooleanValue) {
                DailyRecordDaoUtils.INSTANCE.markDailyRecordHasUploaded(str5, list3);
                i = 1;
            } else {
                i = i3;
            }
            str3 = str5;
            dailyRecordNotUpload = DailyRecordDaoUtils.INSTANCE.getDailyRecordNotUpload(str3, str4, 60);
            list = dailyRecordNotUpload;
            if (list != null || list.isEmpty()) {
                FitnessLogUtils.d(TAG, "pushDeviceFitnessData: no more record(" + str3 + ")");
                if (i != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boxing.boxBoolean(z3);
            }
            List<FitnessDataModel> listConvertToServerRecordModel = incrementalSyncController2.convertToServerRecordModel(dailyRecordNotUpload, null);
            if (z2) {
                FitnessDataRequest mFitnessRequest = incrementalSyncController2.getMFitnessRequest();
                c16422.L$0 = incrementalSyncController2;
                c16422.L$1 = str3;
                c16422.L$2 = str4;
                c16422.L$3 = dailyRecordNotUpload;
                c16422.L$4 = listConvertToServerRecordModel;
                c16422.Z$0 = z2;
                c16422.I$0 = i;
                c16422.label = 1;
                Object objUploadMedicalData = mFitnessRequest.uploadMedicalData(listConvertToServerRecordModel, c16422);
                if (objUploadMedicalData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str5 = str3;
                str6 = str4;
                c16421 = c16422;
                z4 = z2;
                i2 = i;
                list2 = listConvertToServerRecordModel;
                zBooleanValue = ((Boolean) objUploadMedicalData).booleanValue();
            } else {
                FitnessDataRequest mFitnessRequest2 = incrementalSyncController2.getMFitnessRequest();
                c16422.L$0 = incrementalSyncController2;
                c16422.L$1 = str3;
                c16422.L$2 = str4;
                c16422.L$3 = dailyRecordNotUpload;
                c16422.L$4 = listConvertToServerRecordModel;
                c16422.Z$0 = z2;
                c16422.I$0 = i;
                c16422.label = 2;
                Object objUploadFitnessData = mFitnessRequest2.uploadFitnessData(listConvertToServerRecordModel, c16422);
                if (objUploadFitnessData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str5 = str3;
                obj = objUploadFitnessData;
                str6 = str4;
                c16421 = c16422;
                z4 = z2;
                i2 = i;
                list2 = listConvertToServerRecordModel;
            }
            boolean z6 = z4;
            c16422 = c16421;
            str4 = str6;
            list3 = dailyRecordNotUpload;
            i3 = i2;
            z2 = z6;
            FitnessLogUtils.i(TAG, "pushDeviceFitnessData(result=" + zBooleanValue + "): " + str5 + "(medical-" + z2 + "), size=" + list2.size());
            if (zBooleanValue) {
                DailyRecordDaoUtils.INSTANCE.markDailyRecordHasUploaded(str5, list3);
                i = 1;
            } else {
                i = i3;
            }
            str3 = str5;
            dailyRecordNotUpload = DailyRecordDaoUtils.INSTANCE.getDailyRecordNotUpload(str3, str4, 60);
            list = dailyRecordNotUpload;
            if (list != null) {
            }
            FitnessLogUtils.d(TAG, "pushDeviceFitnessData: no more record(" + str3 + ")");
            if (i != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return Boxing.boxBoolean(z3);
        }
        if (i5 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = c16421.I$0;
        z4 = c16421.Z$0;
        list2 = (List) c16421.L$4;
        dailyRecordNotUpload = (List) c16421.L$3;
        str6 = (String) c16421.L$2;
        str5 = (String) c16421.L$1;
        incrementalSyncController2 = (IncrementalSyncController) c16421.L$0;
        ResultKt.throwOnFailure(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        boolean z7 = z4;
        c16422 = c16421;
        str4 = str6;
        list3 = dailyRecordNotUpload;
        i3 = i2;
        z2 = z7;
        FitnessLogUtils.i(TAG, "pushDeviceFitnessData(result=" + zBooleanValue + "): " + str5 + "(medical-" + z2 + "), size=" + list2.size());
        if (zBooleanValue) {
            DailyRecordDaoUtils.INSTANCE.markDailyRecordHasUploaded(str5, list3);
            i = 1;
        } else {
            i = i3;
        }
        str3 = str5;
        dailyRecordNotUpload = DailyRecordDaoUtils.INSTANCE.getDailyRecordNotUpload(str3, str4, 60);
        list = dailyRecordNotUpload;
        if (list != null) {
        }
        FitnessLogUtils.d(TAG, "pushDeviceFitnessData: no more record(" + str3 + ")");
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boxing.boxBoolean(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00bf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    /* JADX WARN: Code duplicated, block: B:62:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x0106  */
    /* JADX WARN: Code duplicated, block: B:65:0x0108  */
    /* JADX WARN: Code duplicated, block: B:68:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v14 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v21, types: [int] */
    /* JADX WARN: Type inference failed for: r13v23, types: [int] */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [int] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v17, types: [int] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7, types: [int] */
    /* JADX WARN: Type inference failed for: r14v9 */
    public final Object pushFitnessData2Server(String str, boolean z, Continuation<? super Boolean> continuation) {
        C16431 c16431;
        String localPhoneSid;
        IncrementalSyncController incrementalSyncController;
        Object objPushLocalPhoneData;
        String str2;
        ?? r13;
        IncrementalSyncController incrementalSyncController2;
        boolean z2;
        ?? r14;
        ?? BooleanValue;
        boolean z3;
        Exception e;
        String str3;
        Object objPushDeletedDailyData;
        boolean zBooleanValue;
        ?? r15;
        ?? r16;
        boolean z4;
        boolean z5;
        if (continuation instanceof C16431) {
            c16431 = (C16431) continuation;
            int i = c16431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16431.label = i - Integer.MIN_VALUE;
            } else {
                c16431 = new C16431(continuation);
            }
        } else {
            c16431 = new C16431(continuation);
        }
        Object objPushDeviceFitnessData = c16431.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16431.label;
        boolean z6 = true;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPushDeviceFitnessData);
            localPhoneSid = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalPhoneSid();
            try {
                c16431.L$0 = this;
                c16431.L$1 = str;
                c16431.L$2 = localPhoneSid;
                c16431.Z$0 = z;
                c16431.label = 1;
                objPushLocalPhoneData = pushLocalPhoneData(str, localPhoneSid, z, c16431);
                if (objPushLocalPhoneData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                incrementalSyncController = this;
                boolean zBooleanValue2 = ((Boolean) objPushLocalPhoneData).booleanValue();
                str2 = str;
                r13 = zBooleanValue2;
                c16431.L$0 = incrementalSyncController;
                c16431.L$1 = str2;
                c16431.L$2 = null;
                c16431.Z$0 = z;
                c16431.I$0 = r13;
                c16431.label = 2;
                objPushDeviceFitnessData = incrementalSyncController.pushDeviceFitnessData(str2, localPhoneSid, z, c16431);
                if (objPushDeviceFitnessData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                incrementalSyncController2 = incrementalSyncController;
                r13 = r13;
                boolean z7 = z;
                r14 = r13;
                BooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                z2 = z7;
                c16431.L$0 = str2;
                c16431.L$1 = null;
                c16431.L$2 = null;
                c16431.Z$0 = z2;
                c16431.I$0 = r14;
                c16431.I$1 = BooleanValue;
                c16431.label = 3;
                objPushDeletedDailyData = incrementalSyncController2.pushDeletedDailyData(str2, z2, c16431);
                if (objPushDeletedDailyData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z3 = z2;
                objPushDeviceFitnessData = objPushDeletedDailyData;
                str3 = str2;
                BooleanValue = BooleanValue;
                r14 = r14;
                zBooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                r16 = BooleanValue;
                r15 = r14;
            } catch (Exception e2) {
                e = e2;
                incrementalSyncController = this;
                FitnessLogUtils.i(TAG, "pushLocalPhoneData", e);
                str2 = str;
                r13 = 0;
                c16431.L$0 = incrementalSyncController;
                c16431.L$1 = str2;
                c16431.L$2 = null;
                c16431.Z$0 = z;
                c16431.I$0 = r13;
                c16431.label = 2;
                objPushDeviceFitnessData = incrementalSyncController.pushDeviceFitnessData(str2, localPhoneSid, z, c16431);
                if (objPushDeviceFitnessData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                incrementalSyncController2 = incrementalSyncController;
                r13 = r13;
                boolean z8 = z;
                r14 = r13;
                BooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                z2 = z8;
                c16431.L$0 = str2;
                c16431.L$1 = null;
                c16431.L$2 = null;
                c16431.Z$0 = z2;
                c16431.I$0 = r14;
                c16431.I$1 = BooleanValue;
                c16431.label = 3;
                objPushDeletedDailyData = incrementalSyncController2.pushDeletedDailyData(str2, z2, c16431);
                if (objPushDeletedDailyData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z3 = z2;
                objPushDeviceFitnessData = objPushDeletedDailyData;
                str3 = str2;
                BooleanValue = BooleanValue;
                r14 = r14;
                zBooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                r16 = BooleanValue;
                r15 = r14;
                if (r15 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (r16 != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                FitnessLogUtils.i(TAG, "pushFitnessData(" + str3 + ")(medical-" + z3 + "): hasPhoneData=" + z4 + ", hasDeviceData=" + z5 + ", hasDeleteData=" + zBooleanValue);
                if (r15 == 0) {
                    z6 = false;
                }
                return Boxing.boxBoolean(z6);
            }
        } else if (i2 == 1) {
            z = c16431.Z$0;
            String str4 = (String) c16431.L$2;
            String str5 = (String) c16431.L$1;
            incrementalSyncController = (IncrementalSyncController) c16431.L$0;
            try {
                try {
                    ResultKt.throwOnFailure(objPushDeviceFitnessData);
                    localPhoneSid = str4;
                    str = str5;
                    objPushLocalPhoneData = objPushDeviceFitnessData;
                    try {
                        boolean zBooleanValue3 = ((Boolean) objPushLocalPhoneData).booleanValue();
                        str2 = str;
                        r13 = zBooleanValue3;
                    } catch (Exception e3) {
                        e = e3;
                        FitnessLogUtils.i(TAG, "pushLocalPhoneData", e);
                        str2 = str;
                        r13 = 0;
                    }
                } catch (Exception e4) {
                    localPhoneSid = str4;
                    str = str5;
                    e = e4;
                    FitnessLogUtils.i(TAG, "pushLocalPhoneData", e);
                    str2 = str;
                    r13 = 0;
                    c16431.L$0 = incrementalSyncController;
                    c16431.L$1 = str2;
                    c16431.L$2 = null;
                    c16431.Z$0 = z;
                    c16431.I$0 = r13;
                    c16431.label = 2;
                    objPushDeviceFitnessData = incrementalSyncController.pushDeviceFitnessData(str2, localPhoneSid, z, c16431);
                    if (objPushDeviceFitnessData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    incrementalSyncController2 = incrementalSyncController;
                    r13 = r13;
                    boolean z9 = z;
                    r14 = r13;
                    BooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                    z2 = z9;
                    c16431.L$0 = str2;
                    c16431.L$1 = null;
                    c16431.L$2 = null;
                    c16431.Z$0 = z2;
                    c16431.I$0 = r14;
                    c16431.I$1 = BooleanValue;
                    c16431.label = 3;
                    objPushDeletedDailyData = incrementalSyncController2.pushDeletedDailyData(str2, z2, c16431);
                    if (objPushDeletedDailyData == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z3 = z2;
                    objPushDeviceFitnessData = objPushDeletedDailyData;
                    str3 = str2;
                    BooleanValue = BooleanValue;
                    r14 = r14;
                    zBooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                    r16 = BooleanValue;
                    r15 = r14;
                    if (r15 != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (r16 != 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    FitnessLogUtils.i(TAG, "pushFitnessData(" + str3 + ")(medical-" + z3 + "): hasPhoneData=" + z4 + ", hasDeviceData=" + z5 + ", hasDeleteData=" + zBooleanValue);
                    if (r15 == 0) {
                        z6 = false;
                    }
                    return Boxing.boxBoolean(z6);
                }
                c16431.L$0 = incrementalSyncController;
                c16431.L$1 = str2;
                c16431.L$2 = null;
                c16431.Z$0 = z;
                c16431.I$0 = r13;
                c16431.label = 2;
                objPushDeviceFitnessData = incrementalSyncController.pushDeviceFitnessData(str2, localPhoneSid, z, c16431);
                if (objPushDeviceFitnessData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                incrementalSyncController2 = incrementalSyncController;
                r13 = r13;
                boolean z10 = z;
                r14 = r13;
                BooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                z2 = z10;
                c16431.L$0 = str2;
                c16431.L$1 = null;
                c16431.L$2 = null;
                c16431.Z$0 = z2;
                c16431.I$0 = r14;
                c16431.I$1 = BooleanValue;
                c16431.label = 3;
                objPushDeletedDailyData = incrementalSyncController2.pushDeletedDailyData(str2, z2, c16431);
                if (objPushDeletedDailyData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z3 = z2;
                objPushDeviceFitnessData = objPushDeletedDailyData;
                str3 = str2;
                BooleanValue = BooleanValue;
                r14 = r14;
                zBooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                r16 = BooleanValue;
                r15 = r14;
            } catch (Exception e5) {
                e = e5;
                incrementalSyncController2 = incrementalSyncController;
                FitnessLogUtils.i(TAG, "pushDeviceFitnessData", e);
                z2 = z;
                r14 = r13;
                BooleanValue = 0;
            }
        } else if (i2 == 2) {
            r13 = c16431.I$0;
            z = c16431.Z$0;
            str2 = (String) c16431.L$1;
            incrementalSyncController2 = (IncrementalSyncController) c16431.L$0;
            try {
                ResultKt.throwOnFailure(objPushDeviceFitnessData);
                r13 = r13;
                boolean z11 = z;
                r14 = r13;
                BooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                z2 = z11;
            } catch (Exception e6) {
                e = e6;
                FitnessLogUtils.i(TAG, "pushDeviceFitnessData", e);
                z2 = z;
                r14 = r13;
                BooleanValue = 0;
            }
            try {
                c16431.L$0 = str2;
                c16431.L$1 = null;
                c16431.L$2 = null;
                c16431.Z$0 = z2;
                c16431.I$0 = r14;
                c16431.I$1 = BooleanValue;
                c16431.label = 3;
                objPushDeletedDailyData = incrementalSyncController2.pushDeletedDailyData(str2, z2, c16431);
                if (objPushDeletedDailyData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z3 = z2;
                objPushDeviceFitnessData = objPushDeletedDailyData;
                str3 = str2;
                BooleanValue = BooleanValue;
                r14 = r14;
                zBooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                r16 = BooleanValue;
                r15 = r14;
            } catch (Exception e7) {
                z3 = z2;
                e = e7;
                str3 = str2;
                FitnessLogUtils.i(TAG, "pushDeletedDailyData", e);
                zBooleanValue = false;
                r16 = BooleanValue;
                r15 = r14;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            BooleanValue = c16431.I$1;
            r14 = c16431.I$0;
            z3 = c16431.Z$0;
            str3 = (String) c16431.L$0;
            try {
                ResultKt.throwOnFailure(objPushDeviceFitnessData);
                BooleanValue = BooleanValue;
                r14 = r14;
                zBooleanValue = ((Boolean) objPushDeviceFitnessData).booleanValue();
                r16 = BooleanValue;
                r15 = r14;
            } catch (Exception e8) {
                e = e8;
                FitnessLogUtils.i(TAG, "pushDeletedDailyData", e);
                zBooleanValue = false;
                r16 = BooleanValue;
                r15 = r14;
            }
        }
        if (r15 != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (r16 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        FitnessLogUtils.i(TAG, "pushFitnessData(" + str3 + ")(medical-" + z3 + "): hasPhoneData=" + z4 + ", hasDeviceData=" + z5 + ", hasDeleteData=" + zBooleanValue);
        if (r15 == 0 && r16 == 0 && !zBooleanValue) {
            z6 = false;
        }
        return Boxing.boxBoolean(z6);
    }

    public static /* synthetic */ Object pushFitnessData2Server$default(IncrementalSyncController incrementalSyncController, String str, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return incrementalSyncController.pushFitnessData2Server(str, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x00af  */
    /* JADX WARN: Code duplicated, block: B:41:0x0163  */
    /* JADX WARN: Code duplicated, block: B:42:0x0173  */
    /* JADX WARN: Code duplicated, block: B:45:0x0196  */
    /* JADX WARN: Code duplicated, block: B:46:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x011a -> B:38:0x012a). Please report as a decompilation issue!!! */
    public final Object pushLocalPhoneData(String str, String str2, boolean z, Continuation<? super Boolean> continuation) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        C16441 c16441;
        IncrementalSyncController incrementalSyncController;
        String str3;
        String str4;
        C16441 c16442;
        IncrementalSyncController incrementalSyncController2;
        int i;
        String str5;
        boolean z2;
        List<DailyRecordBaseEntity> localPhoneRecordToUpload;
        List<DailyRecordBaseEntity> list;
        boolean z3;
        String str6;
        boolean z4;
        String str7;
        int i2;
        List<FitnessDataModel> list2;
        boolean zBooleanValue;
        List<DailyRecordBaseEntity> list3;
        int i3;
        String str8;
        if (continuation instanceof C16441) {
            c16441 = (C16441) continuation;
            int i4 = c16441.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c16441.label = i4 - Integer.MIN_VALUE;
                incrementalSyncController = this;
            } else {
                incrementalSyncController = this;
                c16441 = incrementalSyncController.new C16441(continuation);
            }
        } else {
            incrementalSyncController = this;
            c16441 = incrementalSyncController.new C16441(continuation);
        }
        Object obj = c16441.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c16441.label;
        int i6 = 2;
        int i7 = 1;
        if (i5 == 0) {
            ResultKt.throwOnFailure(obj);
            String currentPhoneSid = DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentPhoneSid();
            str3 = str2;
            if (TextUtils.equals(currentPhoneSid, str3)) {
                FitnessLogUtils.i(TAG, "pushLocalPhoneData: no local phone server sid");
                return Boxing.boxBoolean(false);
            }
            str4 = currentPhoneSid;
            c16442 = c16441;
            incrementalSyncController2 = incrementalSyncController;
            i = 0;
            str5 = str;
            z2 = z;
            localPhoneRecordToUpload = DailyRecordDaoUtils.INSTANCE.getLocalPhoneRecordToUpload(str5, str3, 60);
            list = localPhoneRecordToUpload;
            if (list != null) {
            }
            FitnessLogUtils.d(TAG, "pushLocalPhoneData: no more record(" + str5 + ")");
            if (i != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return Boxing.boxBoolean(z3);
        }
        if (i5 == 1) {
            i2 = c16441.I$0;
            z4 = c16441.Z$0;
            list2 = (List) c16441.L$5;
            localPhoneRecordToUpload = (List) c16441.L$4;
            str4 = (String) c16441.L$3;
            str7 = (String) c16441.L$2;
            str6 = (String) c16441.L$1;
            incrementalSyncController2 = (IncrementalSyncController) c16441.L$0;
            ResultKt.throwOnFailure(obj);
            zBooleanValue = ((Boolean) obj).booleanValue();
            boolean z5 = z4;
            c16442 = c16441;
            z2 = z5;
            list3 = localPhoneRecordToUpload;
            i3 = i2;
            str3 = str7;
            str8 = str4;
            FitnessLogUtils.i(TAG, "pushLocalPhoneData(result=" + zBooleanValue + "): " + str6 + "(medical-" + z2 + "), size=" + list2.size());
            if (zBooleanValue) {
                DailyRecordDaoUtils dailyRecordDaoUtils = DailyRecordDaoUtils.INSTANCE;
                dailyRecordDaoUtils.hardDeleteDailyRecord(str6, list3);
                dailyRecordDaoUtils.recordServerDailyDataToDB(list2);
                str4 = str8;
                str5 = str6;
                i6 = 2;
                i7 = 1;
                i = 1;
            } else {
                i = i3;
                str4 = str8;
                str5 = str6;
                i6 = 2;
                i7 = 1;
            }
            localPhoneRecordToUpload = DailyRecordDaoUtils.INSTANCE.getLocalPhoneRecordToUpload(str5, str3, 60);
            list = localPhoneRecordToUpload;
            if (list != null || list.isEmpty()) {
                FitnessLogUtils.d(TAG, "pushLocalPhoneData: no more record(" + str5 + ")");
                if (i != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                return Boxing.boxBoolean(z3);
            }
            List<FitnessDataModel> listConvertToServerRecordModel = incrementalSyncController2.convertToServerRecordModel(localPhoneRecordToUpload, str4);
            if (z2) {
                FitnessDataRequest mFitnessRequest = incrementalSyncController2.getMFitnessRequest();
                c16442.L$0 = incrementalSyncController2;
                c16442.L$1 = str5;
                c16442.L$2 = str3;
                c16442.L$3 = str4;
                c16442.L$4 = localPhoneRecordToUpload;
                c16442.L$5 = listConvertToServerRecordModel;
                c16442.Z$0 = z2;
                c16442.I$0 = i;
                c16442.label = i7;
                Object objUploadMedicalData = mFitnessRequest.uploadMedicalData(listConvertToServerRecordModel, c16442);
                if (objUploadMedicalData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str6 = str5;
                C16441 c16443 = c16442;
                z4 = z2;
                c16441 = c16443;
                str7 = str3;
                i2 = i;
                list2 = listConvertToServerRecordModel;
                zBooleanValue = ((Boolean) objUploadMedicalData).booleanValue();
            } else {
                FitnessDataRequest mFitnessRequest2 = incrementalSyncController2.getMFitnessRequest();
                c16442.L$0 = incrementalSyncController2;
                c16442.L$1 = str5;
                c16442.L$2 = str3;
                c16442.L$3 = str4;
                c16442.L$4 = localPhoneRecordToUpload;
                c16442.L$5 = listConvertToServerRecordModel;
                c16442.Z$0 = z2;
                c16442.I$0 = i;
                c16442.label = i6;
                Object objUploadFitnessData = mFitnessRequest2.uploadFitnessData(listConvertToServerRecordModel, c16442);
                if (objUploadFitnessData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str6 = str5;
                obj = objUploadFitnessData;
                C16441 c16444 = c16442;
                z4 = z2;
                c16441 = c16444;
                str7 = str3;
                i2 = i;
                list2 = listConvertToServerRecordModel;
            }
            boolean z6 = z4;
            c16442 = c16441;
            z2 = z6;
            list3 = localPhoneRecordToUpload;
            i3 = i2;
            str3 = str7;
            str8 = str4;
            FitnessLogUtils.i(TAG, "pushLocalPhoneData(result=" + zBooleanValue + "): " + str6 + "(medical-" + z2 + "), size=" + list2.size());
            if (zBooleanValue) {
                DailyRecordDaoUtils dailyRecordDaoUtils2 = DailyRecordDaoUtils.INSTANCE;
                dailyRecordDaoUtils2.hardDeleteDailyRecord(str6, list3);
                dailyRecordDaoUtils2.recordServerDailyDataToDB(list2);
                str4 = str8;
                str5 = str6;
                i6 = 2;
                i7 = 1;
                i = 1;
            } else {
                i = i3;
                str4 = str8;
                str5 = str6;
                i6 = 2;
                i7 = 1;
            }
            localPhoneRecordToUpload = DailyRecordDaoUtils.INSTANCE.getLocalPhoneRecordToUpload(str5, str3, 60);
            list = localPhoneRecordToUpload;
            if (list != null) {
            }
            FitnessLogUtils.d(TAG, "pushLocalPhoneData: no more record(" + str5 + ")");
            if (i != 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            return Boxing.boxBoolean(z3);
        }
        if (i5 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i2 = c16441.I$0;
        z4 = c16441.Z$0;
        list2 = (List) c16441.L$5;
        localPhoneRecordToUpload = (List) c16441.L$4;
        str4 = (String) c16441.L$3;
        str7 = (String) c16441.L$2;
        str6 = (String) c16441.L$1;
        incrementalSyncController2 = (IncrementalSyncController) c16441.L$0;
        ResultKt.throwOnFailure(obj);
        zBooleanValue = ((Boolean) obj).booleanValue();
        boolean z7 = z4;
        c16442 = c16441;
        z2 = z7;
        list3 = localPhoneRecordToUpload;
        i3 = i2;
        str3 = str7;
        str8 = str4;
        FitnessLogUtils.i(TAG, "pushLocalPhoneData(result=" + zBooleanValue + "): " + str6 + "(medical-" + z2 + "), size=" + list2.size());
        if (zBooleanValue) {
            DailyRecordDaoUtils dailyRecordDaoUtils3 = DailyRecordDaoUtils.INSTANCE;
            dailyRecordDaoUtils3.hardDeleteDailyRecord(str6, list3);
            dailyRecordDaoUtils3.recordServerDailyDataToDB(list2);
            str4 = str8;
            str5 = str6;
            i6 = 2;
            i7 = 1;
            i = 1;
        } else {
            i = i3;
            str4 = str8;
            str5 = str6;
            i6 = 2;
            i7 = 1;
        }
        localPhoneRecordToUpload = DailyRecordDaoUtils.INSTANCE.getLocalPhoneRecordToUpload(str5, str3, 60);
        list = localPhoneRecordToUpload;
        if (list != null) {
        }
        FitnessLogUtils.d(TAG, "pushLocalPhoneData: no more record(" + str5 + ")");
        if (i != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        return Boxing.boxBoolean(z3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00c6 -> B:25:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cf -> B:25:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x010c -> B:25:0x00a3). Please report as a decompilation issue!!! */
    public final Object pushNewSportReport2Server(Continuation<? super Boolean> continuation) {
        C16451 c16451;
        IncrementalSyncController incrementalSyncController;
        Iterator it;
        List<SportReportEntity> list;
        if (continuation instanceof C16451) {
            c16451 = (C16451) continuation;
            int i = c16451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16451.label = i - Integer.MIN_VALUE;
            } else {
                c16451 = new C16451(continuation);
            }
        } else {
            c16451 = new C16451(continuation);
        }
        Object obj = c16451.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16451.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            FitnessLogUtils.i(TAG, "pushSportReport2Server");
            List<SportReportEntity> sportNotUploadToServer = SportReportDaoUtils.INSTANCE.getSportNotUploadToServer();
            if (sportNotUploadToServer.isEmpty()) {
                FitnessLogUtils.i(TAG, "pushSportReport2Server: no sportRecord");
                return Boxing.boxBoolean(false);
            }
            List listComputeBatchGroupList = FitnessPersistUtils.INSTANCE.computeBatchGroupList(sportNotUploadToServer, 20);
            FitnessLogUtils.i(TAG, "pushSportReport2Server: sportSize = " + sportNotUploadToServer.size() + ", batchSize = " + listComputeBatchGroupList.size());
            incrementalSyncController = this;
            it = listComputeBatchGroupList.iterator();
        } else if (i2 == 1) {
            list = (List) c16451.L$2;
            it = (Iterator) c16451.L$1;
            incrementalSyncController = (IncrementalSyncController) c16451.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e) {
                FitnessLogUtils.i(TAG, "pushSportReport", e);
                if ((e instanceof ApiException) && ((ApiException) e).getErrorCode() == -8) {
                    FitnessLogUtils.i(TAG, "sportReport: reSerialize and upload");
                    for (SportReportEntity sportReportEntity : list) {
                        FitnessPersistUtils fitnessPersistUtils = FitnessPersistUtils.INSTANCE;
                        SportBasicReport sportBasicReport = (SportBasicReport) fitnessPersistUtils.fromJson(sportReportEntity.getValue(), SportBasicReport.class);
                        if (sportBasicReport != null) {
                            sportReportEntity.setValue(fitnessPersistUtils.toJson(sportBasicReport));
                        }
                    }
                    c16451.L$0 = incrementalSyncController;
                    c16451.L$1 = it;
                    c16451.L$2 = null;
                    c16451.label = 2;
                    if (incrementalSyncController.pushSportReport(list, c16451) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Iterator it2 = (Iterator) c16451.L$1;
            IncrementalSyncController incrementalSyncController2 = (IncrementalSyncController) c16451.L$0;
            ResultKt.throwOnFailure(obj);
            incrementalSyncController = incrementalSyncController2;
            it = it2;
        }
        while (it.hasNext()) {
            list = (List) it.next();
            c16451.L$0 = incrementalSyncController;
            c16451.L$1 = it;
            c16451.L$2 = list;
            c16451.label = 1;
            if (incrementalSyncController.pushSportReport(list, c16451) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Boxing.boxBoolean(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pushSportFDSData(Continuation<? super Boolean> continuation) {
        C16461 c16461;
        if (continuation instanceof C16461) {
            c16461 = (C16461) continuation;
            int i = c16461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16461.label = i - Integer.MIN_VALUE;
            } else {
                c16461 = new C16461(continuation);
            }
        } else {
            c16461 = new C16461(continuation);
        }
        Object obj = c16461.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16461.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                FitnessFDSDataDaoUtils fitnessFDSDataDaoUtils = FitnessFDSDataDaoUtils.INSTANCE;
                c16461.label = 1;
                if (fitnessFDSDataDaoUtils.uploadDataToFDS(c16461) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "pushSportFDSData", th);
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pushSportReport(List<SportReportEntity> list, Continuation<? super Boolean> continuation) {
        C16471 c16471;
        IncrementalSyncController incrementalSyncController;
        if (continuation instanceof C16471) {
            c16471 = (C16471) continuation;
            int i = c16471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16471.label = i - Integer.MIN_VALUE;
            } else {
                c16471 = new C16471(continuation);
            }
        } else {
            c16471 = new C16471(continuation);
        }
        Object objUploadSportReports = c16471.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16471.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objUploadSportReports);
            List<SportReportModel> listConvertToServerSportModel = convertToServerSportModel(list);
            FitnessDataRequest mFitnessRequest = getMFitnessRequest();
            c16471.L$0 = this;
            c16471.L$1 = list;
            c16471.label = 1;
            objUploadSportReports = mFitnessRequest.uploadSportReports(listConvertToServerSportModel, c16471);
            if (objUploadSportReports == coroutine_suspended) {
                return coroutine_suspended;
            }
            incrementalSyncController = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) c16471.L$1;
            incrementalSyncController = (IncrementalSyncController) c16471.L$0;
            ResultKt.throwOnFailure(objUploadSportReports);
        }
        boolean zBooleanValue = ((Boolean) objUploadSportReports).booleanValue();
        FitnessLogUtils.i(TAG, "pushSportReport2Server, result = " + zBooleanValue);
        if (zBooleanValue) {
            SportReportDaoUtils.INSTANCE.markSportReportHasUploaded(list);
            incrementalSyncController.saveSportReportKey(list);
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x009b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object pushSportReport2Server(Continuation<? super SyncRequestResult> continuation) {
        C16481 c16481;
        IncrementalSyncController incrementalSyncController;
        boolean z;
        boolean z2;
        if (continuation instanceof C16481) {
            c16481 = (C16481) continuation;
            int i = c16481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16481.label = i - Integer.MIN_VALUE;
            } else {
                c16481 = new C16481(continuation);
            }
        } else {
            c16481 = new C16481(continuation);
        }
        Object objPushNewSportReport2Server = c16481.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16481.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    incrementalSyncController = (IncrementalSyncController) c16481.L$0;
                    ResultKt.throwOnFailure(objPushNewSportReport2Server);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z = c16481.Z$0;
                    ResultKt.throwOnFailure(objPushNewSportReport2Server);
                }
                boolean zBooleanValue = ((Boolean) objPushNewSportReport2Server).booleanValue();
                FitnessLogUtils.i(TAG, "pushSportReport2Server: hasSportReport = " + z + ", hasDeleteSport = " + zBooleanValue);
                if (!z || zBooleanValue) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return new SyncRequestResult(true, z2, false, null, null, false, 60, null);
            }
            ResultKt.throwOnFailure(objPushNewSportReport2Server);
            c16481.L$0 = this;
            c16481.label = 1;
            objPushNewSportReport2Server = pushNewSportReport2Server(c16481);
            if (objPushNewSportReport2Server == coroutine_suspended) {
                return coroutine_suspended;
            }
            incrementalSyncController = this;
            boolean zBooleanValue2 = ((Boolean) objPushNewSportReport2Server).booleanValue();
            c16481.L$0 = null;
            c16481.Z$0 = zBooleanValue2;
            c16481.label = 2;
            Object objPushDeletedSportReport2Server = incrementalSyncController.pushDeletedSportReport2Server(c16481);
            if (objPushDeletedSportReport2Server == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = zBooleanValue2;
            objPushNewSportReport2Server = objPushDeletedSportReport2Server;
            boolean zBooleanValue3 = ((Boolean) objPushNewSportReport2Server).booleanValue();
            FitnessLogUtils.i(TAG, "pushSportReport2Server: hasSportReport = " + z + ", hasDeleteSport = " + zBooleanValue3);
            if (z) {
                z2 = true;
            } else {
                z2 = true;
            }
            return new SyncRequestResult(true, z2, false, null, null, false, 60, null);
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "pushSportReport2Server", th);
            return new SyncRequestResult(false, null, th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object pushSwitchSong2Server(Continuation<? super Boolean> continuation) {
        C16491 c16491;
        if (continuation instanceof C16491) {
            c16491 = (C16491) continuation;
            int i = c16491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16491.label = i - Integer.MIN_VALUE;
            } else {
                c16491 = new C16491(continuation);
            }
        } else {
            c16491 = new C16491(continuation);
        }
        Object obj = c16491.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16491.label;
        boolean z = true;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                SwitchSongDaoUtils switchSongDaoUtils = SwitchSongDaoUtils.INSTANCE;
                c16491.label = 1;
                if (switchSongDaoUtils.uploadSwitchSong$fitness_data_core_chinaProductRelease(c16491) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            FitnessLogUtils.e(TAG, "push switchSong to server exception", e);
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object saveProjectDataToDB(List<ProjectDataModel> list, Continuation<? super Unit> continuation) {
        List<ProjectDataModel> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return Unit.INSTANCE;
        }
        Object objInsertProjectDataFromServer = ProjectEntityDaoProxy.INSTANCE.insertProjectDataFromServer(list, continuation);
        return objInsertProjectDataFromServer == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInsertProjectDataFromServer : Unit.INSTANCE;
    }

    private final void saveSportReportKey(final List<SportReportEntity> sportList) {
        ExecutorHelper.getBackgroundPool().execute(new Runnable() { // from class: j7d
            @Override // java.lang.Runnable
            public final void run() {
                IncrementalSyncController.saveSportReportKey$lambda$2(sportList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void saveSportReportKey$lambda$2(List sportList) {
        Intrinsics.checkNotNullParameter(sportList, "$sportList");
        FitnessFDSDataDaoUtils.INSTANCE.recordSportReportId(sportList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SportSyncFinishController sportSyncFinishController_delegate$lambda$1() {
        return SportSyncFinishController.INSTANCE.getInstance();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object syncTrainingPlan(Continuation<? super Unit> continuation) {
        C16551 c16551;
        if (continuation instanceof C16551) {
            c16551 = (C16551) continuation;
            int i = c16551.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16551.label = i - Integer.MIN_VALUE;
            } else {
                c16551 = new C16551(continuation);
            }
        } else {
            c16551 = new C16551(continuation);
        }
        Object obj = c16551.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16551.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                TrainingPlanWeekDaoUtils trainingPlanWeekDaoUtils = TrainingPlanWeekDaoUtils.INSTANCE;
                c16551.label = 1;
                if (trainingPlanWeekDaoUtils.syncTrainingPlanInfo(c16551) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            FitnessLogUtils.e(TAG, "syncTrainingPlan exception", e);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object markMigrateNewApp(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
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
        Object objMarkMigrate = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objMarkMigrate);
            if (!Intrinsics.areEqual(str, FitnessDataCorePreference.INSTANCE.getMARK_NEW_MIGRATE_USER_V2())) {
                MarkMigrate markMigrate = new MarkMigrate(FitnessDateUtils.getCurrentTZOffsetInSec(), (AppUtil.INSTANCE.isPlayChannel() || !RegionExtKt.isInland(RegionExtKt.getInstance(RegionManager.INSTANCE))) ? null : Boxing.boxBoolean(true));
                FitnessDataRequest mFitnessRequest = getMFitnessRequest();
                anonymousClass1.L$0 = str;
                anonymousClass1.label = 1;
                objMarkMigrate = mFitnessRequest.markMigrate(markMigrate, anonymousClass1);
                if (objMarkMigrate == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) anonymousClass1.L$0;
        ResultKt.throwOnFailure(objMarkMigrate);
        if (((Boolean) objMarkMigrate).booleanValue()) {
            FitnessDataCorePreference.INSTANCE.setMARK_NEW_MIGRATE_USER_V2(str);
        }
        FitnessLogUtils.i(TAG, "markMigrateNewApp: has done");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object reportSportSyncInfo(@NotNull List<SportSyncInfo> list, @NotNull Continuation<? super Boolean> continuation) {
        C16501 c16501;
        boolean zBooleanValue;
        if (continuation instanceof C16501) {
            c16501 = (C16501) continuation;
            int i = c16501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16501.label = i - Integer.MIN_VALUE;
            } else {
                c16501 = new C16501(continuation);
            }
        } else {
            c16501 = new C16501(continuation);
        }
        Object objReportSportSyncInfo = c16501.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16501.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objReportSportSyncInfo);
                List<SportSyncInfo> list2 = list;
                if (list2 == null || list2.isEmpty()) {
                    FitnessLogUtils.i(TAG, "reportSportSyncInfo: no sport");
                    return Boxing.boxBoolean(true);
                }
                FitnessDataRequest mFitnessRequest = getMFitnessRequest();
                c16501.label = 1;
                objReportSportSyncInfo = mFitnessRequest.reportSportSyncInfo(list, c16501);
                if (objReportSportSyncInfo == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objReportSportSyncInfo);
            }
            zBooleanValue = ((Boolean) objReportSportSyncInfo).booleanValue();
        } catch (Throwable th) {
            FitnessLogUtils.e(TAG, "reportSportSyncInfo", th);
            zBooleanValue = false;
        }
        return Boxing.boxBoolean(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x013c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x013d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object syncFitnessDataWithServer(@SyncTriggerSource @NotNull String str, boolean z, @NotNull Continuation<? super SyncRequestResult> continuation) {
        C16511 c16511;
        String str2;
        boolean z2;
        IncrementalSyncController incrementalSyncController;
        String str3;
        boolean z3;
        IncrementalSyncController incrementalSyncController2;
        FitnessServerSyncTracker fitnessServerSyncTracker;
        long j;
        long j2;
        String str4;
        FitnessServerSyncTracker fitnessServerSyncTracker2;
        IncrementalSyncController incrementalSyncController3;
        SyncRequestResult syncRequestResult;
        FitnessServerSyncTracker fitnessServerSyncTracker3;
        long jCurrentTimeMillis;
        FitnessServerSyncTracker fitnessServerSyncTracker4;
        String str5;
        boolean z4;
        long j3;
        SyncRequestResult syncRequestResult2;
        if (continuation instanceof C16511) {
            c16511 = (C16511) continuation;
            int i = c16511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16511.label = i - Integer.MIN_VALUE;
            } else {
                c16511 = new C16511(continuation);
            }
        } else {
            c16511 = new C16511(continuation);
        }
        Object fitnessMaxWatermark = c16511.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16511.label;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z5 = c16511.Z$0;
                String str6 = (String) c16511.L$1;
                incrementalSyncController = (IncrementalSyncController) c16511.L$0;
                ResultKt.throwOnFailure(fitnessMaxWatermark);
                z2 = z5;
                str2 = str6;
            } else if (i2 == 2) {
                j2 = c16511.J$0;
                z3 = c16511.Z$0;
                fitnessServerSyncTracker2 = (FitnessServerSyncTracker) c16511.L$2;
                str4 = (String) c16511.L$1;
                incrementalSyncController3 = (IncrementalSyncController) c16511.L$0;
                ResultKt.throwOnFailure(fitnessMaxWatermark);
                SyncRequestResult syncRequestResult3 = (SyncRequestResult) fitnessMaxWatermark;
                syncRequestResult3.setFirstCloudSync(true);
                fitnessServerSyncTracker2.trackHomeRecentPullFitness(j2, syncRequestResult3);
                syncRequestResult = syncRequestResult3;
                fitnessServerSyncTracker3 = fitnessServerSyncTracker2;
                str3 = str4;
                jCurrentTimeMillis = System.currentTimeMillis();
                c16511.L$0 = str3;
                c16511.L$1 = fitnessServerSyncTracker3;
                c16511.L$2 = syncRequestResult;
                c16511.Z$0 = z3;
                c16511.J$0 = jCurrentTimeMillis;
                c16511.label = 4;
                fitnessMaxWatermark = incrementalSyncController3.pushAllFitnessData2Server(c16511);
                if (fitnessMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fitnessServerSyncTracker4 = fitnessServerSyncTracker3;
                str5 = str3;
                z4 = z3;
                j3 = jCurrentTimeMillis;
                syncRequestResult2 = syncRequestResult;
            } else if (i2 == 3) {
                long j4 = c16511.J$0;
                z3 = c16511.Z$0;
                FitnessServerSyncTracker fitnessServerSyncTracker5 = (FitnessServerSyncTracker) c16511.L$2;
                String str7 = (String) c16511.L$1;
                IncrementalSyncController incrementalSyncController4 = (IncrementalSyncController) c16511.L$0;
                ResultKt.throwOnFailure(fitnessMaxWatermark);
                fitnessServerSyncTracker = fitnessServerSyncTracker5;
                str3 = str7;
                incrementalSyncController2 = incrementalSyncController4;
                j = j4;
                SyncRequestResult syncRequestResult4 = (SyncRequestResult) fitnessMaxWatermark;
                fitnessServerSyncTracker.trackIncPullFitness(str3, j, syncRequestResult4, z3);
                syncRequestResult = syncRequestResult4;
                fitnessServerSyncTracker3 = fitnessServerSyncTracker;
                incrementalSyncController3 = incrementalSyncController2;
                jCurrentTimeMillis = System.currentTimeMillis();
                c16511.L$0 = str3;
                c16511.L$1 = fitnessServerSyncTracker3;
                c16511.L$2 = syncRequestResult;
                c16511.Z$0 = z3;
                c16511.J$0 = jCurrentTimeMillis;
                c16511.label = 4;
                fitnessMaxWatermark = incrementalSyncController3.pushAllFitnessData2Server(c16511);
                if (fitnessMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                fitnessServerSyncTracker4 = fitnessServerSyncTracker3;
                str5 = str3;
                z4 = z3;
                j3 = jCurrentTimeMillis;
                syncRequestResult2 = syncRequestResult;
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j5 = c16511.J$0;
                boolean z6 = c16511.Z$0;
                SyncRequestResult syncRequestResult5 = (SyncRequestResult) c16511.L$2;
                FitnessServerSyncTracker fitnessServerSyncTracker6 = (FitnessServerSyncTracker) c16511.L$1;
                String str8 = (String) c16511.L$0;
                ResultKt.throwOnFailure(fitnessMaxWatermark);
                syncRequestResult2 = syncRequestResult5;
                str5 = str8;
                fitnessServerSyncTracker4 = fitnessServerSyncTracker6;
                z4 = z6;
                j3 = j5;
            }
            fitnessServerSyncTracker4.trackPushFitnessData(str5, j3, (SyncRequestResult) fitnessMaxWatermark, z4);
            return syncRequestResult2;
        }
        ResultKt.throwOnFailure(fitnessMaxWatermark);
        ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
        c16511.L$0 = this;
        str2 = str;
        c16511.L$1 = str2;
        z2 = z;
        c16511.Z$0 = z2;
        c16511.label = 1;
        fitnessMaxWatermark = serverRequestDaoUtils.getFitnessMaxWatermark(c16511);
        if (fitnessMaxWatermark == coroutine_suspended) {
            return coroutine_suspended;
        }
        incrementalSyncController = this;
        Long l = (Long) fitnessMaxWatermark;
        FitnessServerSyncTracker companion = FitnessServerSyncTracker.INSTANCE.getInstance();
        if (l == null) {
            FitnessLogUtils.i(TAG, "pullHomeRecentFitnessData");
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            c16511.L$0 = incrementalSyncController;
            c16511.L$1 = str2;
            c16511.L$2 = companion;
            c16511.Z$0 = z2;
            c16511.J$0 = jCurrentTimeMillis2;
            c16511.label = 2;
            fitnessMaxWatermark = incrementalSyncController.pullHomeRecentFitnessData(c16511);
            if (fitnessMaxWatermark == coroutine_suspended) {
                return coroutine_suspended;
            }
            j2 = jCurrentTimeMillis2;
            IncrementalSyncController incrementalSyncController5 = incrementalSyncController;
            str4 = str2;
            z3 = z2;
            fitnessServerSyncTracker2 = companion;
            incrementalSyncController3 = incrementalSyncController5;
            SyncRequestResult syncRequestResult6 = (SyncRequestResult) fitnessMaxWatermark;
            syncRequestResult6.setFirstCloudSync(true);
            fitnessServerSyncTracker2.trackHomeRecentPullFitness(j2, syncRequestResult6);
            syncRequestResult = syncRequestResult6;
            fitnessServerSyncTracker3 = fitnessServerSyncTracker2;
            str3 = str4;
            jCurrentTimeMillis = System.currentTimeMillis();
            c16511.L$0 = str3;
            c16511.L$1 = fitnessServerSyncTracker3;
            c16511.L$2 = syncRequestResult;
            c16511.Z$0 = z3;
            c16511.J$0 = jCurrentTimeMillis;
            c16511.label = 4;
            fitnessMaxWatermark = incrementalSyncController3.pushAllFitnessData2Server(c16511);
            if (fitnessMaxWatermark == coroutine_suspended) {
                return coroutine_suspended;
            }
            fitnessServerSyncTracker4 = fitnessServerSyncTracker3;
            str5 = str3;
            z4 = z3;
            j3 = jCurrentTimeMillis;
            syncRequestResult2 = syncRequestResult;
            fitnessServerSyncTracker4.trackPushFitnessData(str5, j3, (SyncRequestResult) fitnessMaxWatermark, z4);
            return syncRequestResult2;
        }
        FitnessLogUtils.i(TAG, "pullFitnessDataByWM: watermark = " + l);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        long jLongValue = l.longValue();
        c16511.L$0 = incrementalSyncController;
        c16511.L$1 = str2;
        c16511.L$2 = companion;
        c16511.Z$0 = z2;
        c16511.J$0 = jCurrentTimeMillis3;
        c16511.label = 3;
        fitnessMaxWatermark = incrementalSyncController.pullFitnessDataByWaterMark(jLongValue, c16511);
        if (fitnessMaxWatermark == coroutine_suspended) {
            return coroutine_suspended;
        }
        str3 = str2;
        z3 = z2;
        incrementalSyncController2 = incrementalSyncController;
        fitnessServerSyncTracker = companion;
        j = jCurrentTimeMillis3;
        SyncRequestResult syncRequestResult7 = (SyncRequestResult) fitnessMaxWatermark;
        fitnessServerSyncTracker.trackIncPullFitness(str3, j, syncRequestResult7, z3);
        syncRequestResult = syncRequestResult7;
        fitnessServerSyncTracker3 = fitnessServerSyncTracker;
        incrementalSyncController3 = incrementalSyncController2;
        jCurrentTimeMillis = System.currentTimeMillis();
        c16511.L$0 = str3;
        c16511.L$1 = fitnessServerSyncTracker3;
        c16511.L$2 = syncRequestResult;
        c16511.Z$0 = z3;
        c16511.J$0 = jCurrentTimeMillis;
        c16511.label = 4;
        fitnessMaxWatermark = incrementalSyncController3.pushAllFitnessData2Server(c16511);
        if (fitnessMaxWatermark == coroutine_suspended) {
            return coroutine_suspended;
        }
        fitnessServerSyncTracker4 = fitnessServerSyncTracker3;
        str5 = str3;
        z4 = z3;
        j3 = jCurrentTimeMillis;
        syncRequestResult2 = syncRequestResult;
        fitnessServerSyncTracker4.trackPushFitnessData(str5, j3, (SyncRequestResult) fitnessMaxWatermark, z4);
        return syncRequestResult2;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object syncMedicalDataWithServer(@SyncTriggerSource @NotNull String str, boolean z, @NotNull Continuation<? super SyncRequestResult> continuation) {
        C16521 c16521;
        Object obj;
        boolean z2;
        String str2;
        IncrementalSyncController incrementalSyncController;
        SyncRequestResult syncRequestResult;
        IncrementalSyncController incrementalSyncController2;
        SyncRequestResult syncRequestResult2;
        if (continuation instanceof C16521) {
            c16521 = (C16521) continuation;
            int i = c16521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16521.label = i - Integer.MIN_VALUE;
            } else {
                c16521 = new C16521(continuation);
            }
        } else {
            c16521 = new C16521(continuation);
        }
        Object objPullMedicalDataByWaterMark = c16521.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c16521.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objPullMedicalDataByWaterMark);
            ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
            c16521.L$0 = this;
            c16521.L$1 = str;
            c16521.Z$0 = z;
            c16521.label = 1;
            Object medicalMaxWatermark = serverRequestDaoUtils.getMedicalMaxWatermark(c16521);
            if (medicalMaxWatermark == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = medicalMaxWatermark;
            z2 = z;
            str2 = str;
            incrementalSyncController = this;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    incrementalSyncController = (IncrementalSyncController) c16521.L$0;
                    ResultKt.throwOnFailure(objPullMedicalDataByWaterMark);
                    syncRequestResult = (SyncRequestResult) objPullMedicalDataByWaterMark;
                    syncRequestResult.setFirstCloudSync(true);
                    incrementalSyncController2 = incrementalSyncController;
                    syncRequestResult2 = syncRequestResult;
                    c16521.L$0 = syncRequestResult2;
                    c16521.label = 4;
                    if (incrementalSyncController2.pushAllMedicalData2Server(c16521) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return syncRequestResult2;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SyncRequestResult syncRequestResult3 = (SyncRequestResult) c16521.L$0;
                    ResultKt.throwOnFailure(objPullMedicalDataByWaterMark);
                    return syncRequestResult3;
                }
                incrementalSyncController = (IncrementalSyncController) c16521.L$0;
                ResultKt.throwOnFailure(objPullMedicalDataByWaterMark);
                syncRequestResult = (SyncRequestResult) objPullMedicalDataByWaterMark;
                incrementalSyncController2 = incrementalSyncController;
                syncRequestResult2 = syncRequestResult;
                c16521.L$0 = syncRequestResult2;
                c16521.label = 4;
                if (incrementalSyncController2.pushAllMedicalData2Server(c16521) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return syncRequestResult2;
            }
            boolean z3 = c16521.Z$0;
            String str3 = (String) c16521.L$1;
            IncrementalSyncController incrementalSyncController3 = (IncrementalSyncController) c16521.L$0;
            ResultKt.throwOnFailure(objPullMedicalDataByWaterMark);
            str2 = str3;
            incrementalSyncController = incrementalSyncController3;
            obj = objPullMedicalDataByWaterMark;
            z2 = z3;
        }
        Long l = (Long) obj;
        if (l != null) {
            FitnessLogUtils.i(TAG, "pullMedicalDataByWM: watermark = " + l);
            long jLongValue = l.longValue();
            c16521.L$0 = incrementalSyncController;
            c16521.L$1 = null;
            c16521.label = 3;
            objPullMedicalDataByWaterMark = incrementalSyncController.pullMedicalDataByWaterMark(jLongValue, c16521);
            if (objPullMedicalDataByWaterMark == coroutine_suspended) {
                return coroutine_suspended;
            }
            syncRequestResult = (SyncRequestResult) objPullMedicalDataByWaterMark;
            incrementalSyncController2 = incrementalSyncController;
            syncRequestResult2 = syncRequestResult;
            c16521.L$0 = syncRequestResult2;
            c16521.label = 4;
            if (incrementalSyncController2.pushAllMedicalData2Server(c16521) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return syncRequestResult2;
        }
        FitnessLogUtils.i(TAG, "pullRecentMedicalData(" + str2 + ")-" + z2);
        c16521.L$0 = incrementalSyncController;
        c16521.L$1 = null;
        c16521.label = 2;
        objPullMedicalDataByWaterMark = incrementalSyncController.pullRecentMedicalData(c16521);
        if (objPullMedicalDataByWaterMark == coroutine_suspended) {
            return coroutine_suspended;
        }
        syncRequestResult = (SyncRequestResult) objPullMedicalDataByWaterMark;
        syncRequestResult.setFirstCloudSync(true);
        incrementalSyncController2 = incrementalSyncController;
        syncRequestResult2 = syncRequestResult;
        c16521.L$0 = syncRequestResult2;
        c16521.label = 4;
        if (incrementalSyncController2.pushAllMedicalData2Server(c16521) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return syncRequestResult2;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00df  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0127  */
    /* JADX WARN: Code duplicated, block: B:66:0x014c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x014d  */
    /* JADX WARN: Code duplicated, block: B:76:0x018f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x00b1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0127, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.xiaomi.fit.fitness.persist.process.SyncRequestResult, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43 */
    /* JADX WARN: Type inference failed for: r3v44 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.xiaomi.fit.fitness.persist.process.IncrementalSyncController, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.xiaomi.fit.fitness.persist.process.IncrementalSyncController] */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Nullable
    public final Object syncProjectDataWithServer(@SyncTriggerSource @NotNull String str, boolean z, @NotNull Continuation<? super SyncRequestResult> continuation) {
        C16531 c16531;
        ?? r4;
        ?? r3;
        SyncRequestResult syncRequestResult;
        ?? r5;
        Object objPushAllProjectData2Server;
        ?? r2;
        String str2;
        boolean z2;
        IncrementalSyncController incrementalSyncController;
        Long l;
        IncrementalSyncController incrementalSyncController2;
        Long l2;
        IncrementalSyncController incrementalSyncController3;
        long jLongValue;
        ServerRequestDaoUtils serverRequestDaoUtils;
        IncrementalSyncController incrementalSyncController4;
        IncrementalSyncController incrementalSyncController5;
        if (continuation instanceof C16531) {
            c16531 = (C16531) continuation;
            int i = c16531.label;
            r4 = -2147483648;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16531.label = i - Integer.MIN_VALUE;
            } else {
                c16531 = new C16531(continuation);
            }
        } else {
            c16531 = new C16531(continuation);
        }
        Object projectMaxWatermark = c16531.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r6 = c16531.label;
        boolean zBooleanValue = false;
        try {
            try {
                switch (r6) {
                    case 0:
                        ResultKt.throwOnFailure(projectMaxWatermark);
                        ServerRequestDaoUtils serverRequestDaoUtils2 = ServerRequestDaoUtils.INSTANCE;
                        c16531.L$0 = this;
                        str2 = str;
                        c16531.L$1 = str2;
                        z2 = z;
                        c16531.Z$0 = z2;
                        c16531.label = 1;
                        projectMaxWatermark = serverRequestDaoUtils2.getProjectMaxWatermark(c16531);
                        if (projectMaxWatermark == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        incrementalSyncController = this;
                        l = (Long) projectMaxWatermark;
                        if (l != null) {
                            FitnessLogUtils.i(TAG, "pullRecentProjectData(" + str2 + ")-" + z2);
                            try {
                                FitnessDataRequest mFitnessRequest = incrementalSyncController.getMFitnessRequest();
                                c16531.L$0 = incrementalSyncController;
                                c16531.L$1 = null;
                                c16531.label = 2;
                                projectMaxWatermark = mFitnessRequest.getProjectMaxWaterMark(c16531);
                                if (projectMaxWatermark == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                incrementalSyncController3 = incrementalSyncController;
                                jLongValue = ((Number) projectMaxWatermark).longValue();
                                serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                                c16531.L$0 = incrementalSyncController3;
                                c16531.label = 3;
                                incrementalSyncController4 = incrementalSyncController3;
                                if (serverRequestDaoUtils.updateProjectMaxWatermark(jLongValue, c16531) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c16531.L$0 = incrementalSyncController4;
                                c16531.label = 4;
                                projectMaxWatermark = incrementalSyncController4.pullProjectDataByTime(c16531);
                                r6 = incrementalSyncController4;
                                if (projectMaxWatermark == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                zBooleanValue = ((Boolean) projectMaxWatermark).booleanValue();
                                r3 = r6;
                                syncRequestResult = new SyncRequestResult(true, zBooleanValue, false, null, null, true, 28, null);
                                r5 = r3;
                                SyncRequestResult syncRequestResult2 = syncRequestResult;
                                c16531.L$0 = r5;
                                c16531.L$1 = syncRequestResult2;
                                c16531.label = 6;
                                objPushAllProjectData2Server = r5.pushAllProjectData2Server(c16531);
                                r6 = syncRequestResult2;
                                r4 = r5;
                                if (objPushAllProjectData2Server == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                try {
                                    c16531.L$0 = r6;
                                    c16531.L$1 = null;
                                    c16531.label = 7;
                                    if (r4.pushDeletedProjectData2Server(c16531) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    return r6;
                                } catch (Exception e) {
                                    e = e;
                                    r2 = r6;
                                    FitnessLogUtils.i(TAG, "pushDeletedDailyData", e);
                                    return r2;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                r6 = incrementalSyncController;
                                FitnessLogUtils.i(TAG, "pullRecentProjectData", e);
                                r3 = r6;
                            }
                        } else {
                            FitnessLogUtils.i(TAG, "pullProjectDataByWM: watermark = " + l);
                            try {
                                c16531.L$0 = incrementalSyncController;
                                c16531.L$1 = l;
                                c16531.label = 5;
                                projectMaxWatermark = pullProjectDataByWM$default(incrementalSyncController, l, 0, c16531, 2, null);
                                if (projectMaxWatermark == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                incrementalSyncController2 = incrementalSyncController;
                                l2 = l;
                                zBooleanValue = ((Boolean) projectMaxWatermark).booleanValue();
                                incrementalSyncController5 = incrementalSyncController2;
                                syncRequestResult = new SyncRequestResult(true, zBooleanValue, false, null, null, false, 60, null);
                                r5 = incrementalSyncController5;
                                SyncRequestResult syncRequestResult3 = syncRequestResult;
                                c16531.L$0 = r5;
                                c16531.L$1 = syncRequestResult3;
                                c16531.label = 6;
                                objPushAllProjectData2Server = r5.pushAllProjectData2Server(c16531);
                                r6 = syncRequestResult3;
                                r4 = r5;
                                if (objPushAllProjectData2Server == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                c16531.L$0 = r6;
                                c16531.L$1 = null;
                                c16531.label = 7;
                                if (r4.pushDeletedProjectData2Server(c16531) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                return r6;
                            } catch (Exception e3) {
                                e = e3;
                                incrementalSyncController2 = incrementalSyncController;
                                l2 = l;
                                FitnessLogUtils.i(TAG, "pullProjectDataByWM: watermark = " + l2, e);
                                incrementalSyncController5 = incrementalSyncController2;
                            }
                        }
                        break;
                    case 1:
                        boolean z3 = c16531.Z$0;
                        String str3 = (String) c16531.L$1;
                        IncrementalSyncController incrementalSyncController6 = (IncrementalSyncController) c16531.L$0;
                        ResultKt.throwOnFailure(projectMaxWatermark);
                        incrementalSyncController = incrementalSyncController6;
                        z2 = z3;
                        str2 = str3;
                        l = (Long) projectMaxWatermark;
                        if (l != null) {
                            FitnessLogUtils.i(TAG, "pullProjectDataByWM: watermark = " + l);
                            c16531.L$0 = incrementalSyncController;
                            c16531.L$1 = l;
                            c16531.label = 5;
                            projectMaxWatermark = pullProjectDataByWM$default(incrementalSyncController, l, 0, c16531, 2, null);
                            if (projectMaxWatermark == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            incrementalSyncController2 = incrementalSyncController;
                            l2 = l;
                            zBooleanValue = ((Boolean) projectMaxWatermark).booleanValue();
                            incrementalSyncController5 = incrementalSyncController2;
                            syncRequestResult = new SyncRequestResult(true, zBooleanValue, false, null, null, false, 60, null);
                            r5 = incrementalSyncController5;
                            SyncRequestResult syncRequestResult4 = syncRequestResult;
                            c16531.L$0 = r5;
                            c16531.L$1 = syncRequestResult4;
                            c16531.label = 6;
                            objPushAllProjectData2Server = r5.pushAllProjectData2Server(c16531);
                            r6 = syncRequestResult4;
                            r4 = r5;
                            if (objPushAllProjectData2Server == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            c16531.L$0 = r6;
                            c16531.L$1 = null;
                            c16531.label = 7;
                            if (r4.pushDeletedProjectData2Server(c16531) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            return r6;
                        }
                        FitnessLogUtils.i(TAG, "pullRecentProjectData(" + str2 + ")-" + z2);
                        FitnessDataRequest mFitnessRequest2 = incrementalSyncController.getMFitnessRequest();
                        c16531.L$0 = incrementalSyncController;
                        c16531.L$1 = null;
                        c16531.label = 2;
                        projectMaxWatermark = mFitnessRequest2.getProjectMaxWaterMark(c16531);
                        if (projectMaxWatermark == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        incrementalSyncController3 = incrementalSyncController;
                        jLongValue = ((Number) projectMaxWatermark).longValue();
                        serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                        c16531.L$0 = incrementalSyncController3;
                        c16531.label = 3;
                        incrementalSyncController4 = incrementalSyncController3;
                        if (serverRequestDaoUtils.updateProjectMaxWatermark(jLongValue, c16531) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c16531.L$0 = incrementalSyncController4;
                        c16531.label = 4;
                        projectMaxWatermark = incrementalSyncController4.pullProjectDataByTime(c16531);
                        r6 = incrementalSyncController4;
                        if (projectMaxWatermark == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zBooleanValue = ((Boolean) projectMaxWatermark).booleanValue();
                        r3 = r6;
                        syncRequestResult = new SyncRequestResult(true, zBooleanValue, false, null, null, true, 28, null);
                        r5 = r3;
                        SyncRequestResult syncRequestResult5 = syncRequestResult;
                        c16531.L$0 = r5;
                        c16531.L$1 = syncRequestResult5;
                        c16531.label = 6;
                        objPushAllProjectData2Server = r5.pushAllProjectData2Server(c16531);
                        r6 = syncRequestResult5;
                        r4 = r5;
                        if (objPushAllProjectData2Server == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c16531.L$0 = r6;
                        c16531.L$1 = null;
                        c16531.label = 7;
                        if (r4.pushDeletedProjectData2Server(c16531) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return r6;
                    case 2:
                        IncrementalSyncController incrementalSyncController7 = (IncrementalSyncController) c16531.L$0;
                        ResultKt.throwOnFailure(projectMaxWatermark);
                        incrementalSyncController3 = incrementalSyncController7;
                        jLongValue = ((Number) projectMaxWatermark).longValue();
                        serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                        c16531.L$0 = incrementalSyncController3;
                        c16531.label = 3;
                        incrementalSyncController4 = incrementalSyncController3;
                        if (serverRequestDaoUtils.updateProjectMaxWatermark(jLongValue, c16531) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c16531.L$0 = incrementalSyncController4;
                        c16531.label = 4;
                        projectMaxWatermark = incrementalSyncController4.pullProjectDataByTime(c16531);
                        r6 = incrementalSyncController4;
                        if (projectMaxWatermark == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zBooleanValue = ((Boolean) projectMaxWatermark).booleanValue();
                        r3 = r6;
                        syncRequestResult = new SyncRequestResult(true, zBooleanValue, false, null, null, true, 28, null);
                        r5 = r3;
                        SyncRequestResult syncRequestResult6 = syncRequestResult;
                        c16531.L$0 = r5;
                        c16531.L$1 = syncRequestResult6;
                        c16531.label = 6;
                        objPushAllProjectData2Server = r5.pushAllProjectData2Server(c16531);
                        r6 = syncRequestResult6;
                        r4 = r5;
                        if (objPushAllProjectData2Server == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c16531.L$0 = r6;
                        c16531.L$1 = null;
                        c16531.label = 7;
                        if (r4.pushDeletedProjectData2Server(c16531) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return r6;
                    case 3:
                        IncrementalSyncController incrementalSyncController8 = (IncrementalSyncController) c16531.L$0;
                        ResultKt.throwOnFailure(projectMaxWatermark);
                        incrementalSyncController4 = incrementalSyncController8;
                        c16531.L$0 = incrementalSyncController4;
                        c16531.label = 4;
                        projectMaxWatermark = incrementalSyncController4.pullProjectDataByTime(c16531);
                        r6 = incrementalSyncController4;
                        if (projectMaxWatermark == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        zBooleanValue = ((Boolean) projectMaxWatermark).booleanValue();
                        r3 = r6;
                        syncRequestResult = new SyncRequestResult(true, zBooleanValue, false, null, null, true, 28, null);
                        r5 = r3;
                        SyncRequestResult syncRequestResult7 = syncRequestResult;
                        c16531.L$0 = r5;
                        c16531.L$1 = syncRequestResult7;
                        c16531.label = 6;
                        objPushAllProjectData2Server = r5.pushAllProjectData2Server(c16531);
                        r6 = syncRequestResult7;
                        r4 = r5;
                        if (objPushAllProjectData2Server == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c16531.L$0 = r6;
                        c16531.L$1 = null;
                        c16531.label = 7;
                        if (r4.pushDeletedProjectData2Server(c16531) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return r6;
                    case 4:
                        IncrementalSyncController incrementalSyncController9 = (IncrementalSyncController) c16531.L$0;
                        ResultKt.throwOnFailure(projectMaxWatermark);
                        r6 = incrementalSyncController9;
                        zBooleanValue = ((Boolean) projectMaxWatermark).booleanValue();
                        r3 = r6;
                        syncRequestResult = new SyncRequestResult(true, zBooleanValue, false, null, null, true, 28, null);
                        r5 = r3;
                        SyncRequestResult syncRequestResult8 = syncRequestResult;
                        c16531.L$0 = r5;
                        c16531.L$1 = syncRequestResult8;
                        c16531.label = 6;
                        objPushAllProjectData2Server = r5.pushAllProjectData2Server(c16531);
                        r6 = syncRequestResult8;
                        r4 = r5;
                        if (objPushAllProjectData2Server == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c16531.L$0 = r6;
                        c16531.L$1 = null;
                        c16531.label = 7;
                        if (r4.pushDeletedProjectData2Server(c16531) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return r6;
                    case 5:
                        l2 = (Long) c16531.L$1;
                        incrementalSyncController2 = (IncrementalSyncController) c16531.L$0;
                        try {
                            ResultKt.throwOnFailure(projectMaxWatermark);
                            incrementalSyncController2 = incrementalSyncController2;
                            zBooleanValue = ((Boolean) projectMaxWatermark).booleanValue();
                            incrementalSyncController5 = incrementalSyncController2;
                            break;
                        } catch (Exception e4) {
                            e = e4;
                            FitnessLogUtils.i(TAG, "pullProjectDataByWM: watermark = " + l2, e);
                            incrementalSyncController5 = incrementalSyncController2;
                        }
                        syncRequestResult = new SyncRequestResult(true, zBooleanValue, false, null, null, false, 60, null);
                        r5 = incrementalSyncController5;
                        SyncRequestResult syncRequestResult9 = syncRequestResult;
                        c16531.L$0 = r5;
                        c16531.L$1 = syncRequestResult9;
                        c16531.label = 6;
                        objPushAllProjectData2Server = r5.pushAllProjectData2Server(c16531);
                        r6 = syncRequestResult9;
                        r4 = r5;
                        if (objPushAllProjectData2Server == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        c16531.L$0 = r6;
                        c16531.L$1 = null;
                        c16531.label = 7;
                        if (r4.pushDeletedProjectData2Server(c16531) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return r6;
                    case 6:
                        SyncRequestResult syncRequestResult10 = (SyncRequestResult) c16531.L$1;
                        IncrementalSyncController incrementalSyncController10 = (IncrementalSyncController) c16531.L$0;
                        ResultKt.throwOnFailure(projectMaxWatermark);
                        r6 = syncRequestResult10;
                        r4 = incrementalSyncController10;
                        c16531.L$0 = r6;
                        c16531.L$1 = null;
                        c16531.label = 7;
                        if (r4.pushDeletedProjectData2Server(c16531) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return r6;
                    case 7:
                        r2 = (SyncRequestResult) c16531.L$0;
                        try {
                            ResultKt.throwOnFailure(projectMaxWatermark);
                            return r2;
                        } catch (Exception e5) {
                            e = e5;
                            FitnessLogUtils.i(TAG, "pushDeletedDailyData", e);
                            return r2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e6) {
                FitnessLogUtils.i(TAG, "pushAllProjectData2Server", e6);
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x0092 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x009b, please report this as an issue */
    @Nullable
    public final Object syncSportWithServer(@NotNull Continuation<? super SyncRequestResult> continuation) {
        C16541 c16541;
        IncrementalSyncController incrementalSyncController;
        Long l;
        SyncRequestResult syncRequestResult;
        IncrementalSyncController incrementalSyncController2;
        SyncRequestResult syncRequestResult2;
        SyncRequestResult syncRequestResult3;
        IncrementalSyncController incrementalSyncController3;
        if (continuation instanceof C16541) {
            c16541 = (C16541) continuation;
            int i = c16541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16541.label = i - Integer.MIN_VALUE;
            } else {
                c16541 = new C16541(continuation);
            }
        } else {
            c16541 = new C16541(continuation);
        }
        Object sportMaxWatermark = c16541.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c16541.label) {
            case 0:
                ResultKt.throwOnFailure(sportMaxWatermark);
                ServerRequestDaoUtils serverRequestDaoUtils = ServerRequestDaoUtils.INSTANCE;
                c16541.L$0 = this;
                c16541.label = 1;
                sportMaxWatermark = serverRequestDaoUtils.getSportMaxWatermark(c16541);
                if (sportMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                incrementalSyncController = this;
                l = (Long) sportMaxWatermark;
                if (l == null) {
                    FitnessLogUtils.i(TAG, "pullHomeRecentSportReport");
                    c16541.L$0 = incrementalSyncController;
                    c16541.label = 2;
                    sportMaxWatermark = incrementalSyncController.pullHomeRecentSportReport(c16541);
                    if (sportMaxWatermark == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult = (SyncRequestResult) sportMaxWatermark;
                    syncRequestResult.setFirstCloudSync(true);
                    incrementalSyncController2 = incrementalSyncController;
                    syncRequestResult2 = syncRequestResult;
                    c16541.L$0 = incrementalSyncController2;
                    c16541.L$1 = syncRequestResult2;
                    c16541.label = 4;
                    if (incrementalSyncController2.pushSportReport2Server(c16541) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c16541.L$0 = incrementalSyncController2;
                    c16541.L$1 = syncRequestResult2;
                    c16541.label = 5;
                    if (incrementalSyncController2.pushSportFDSData(c16541) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c16541.L$0 = incrementalSyncController2;
                    c16541.L$1 = syncRequestResult2;
                    c16541.label = 6;
                    if (incrementalSyncController2.pushSwitchSong2Server(c16541) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult3 = syncRequestResult2;
                    incrementalSyncController3 = incrementalSyncController2;
                    incrementalSyncController3.getSportSyncFinishController().uploadSportSyncInfo();
                    return syncRequestResult3;
                }
                FitnessLogUtils.i(TAG, "pullSportReportByWaterMark: watermark = " + l);
                long jLongValue = l.longValue();
                c16541.L$0 = incrementalSyncController;
                c16541.label = 3;
                sportMaxWatermark = incrementalSyncController.pullSportReportByWaterMark(jLongValue, c16541);
                if (sportMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                syncRequestResult = (SyncRequestResult) sportMaxWatermark;
                incrementalSyncController2 = incrementalSyncController;
                syncRequestResult2 = syncRequestResult;
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 4;
                if (incrementalSyncController2.pushSportReport2Server(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 5;
                if (incrementalSyncController2.pushSportFDSData(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 6;
                if (incrementalSyncController2.pushSwitchSong2Server(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                syncRequestResult3 = syncRequestResult2;
                incrementalSyncController3 = incrementalSyncController2;
                incrementalSyncController3.getSportSyncFinishController().uploadSportSyncInfo();
                return syncRequestResult3;
            case 1:
                incrementalSyncController = (IncrementalSyncController) c16541.L$0;
                ResultKt.throwOnFailure(sportMaxWatermark);
                l = (Long) sportMaxWatermark;
                if (l == null) {
                    FitnessLogUtils.i(TAG, "pullHomeRecentSportReport");
                    c16541.L$0 = incrementalSyncController;
                    c16541.label = 2;
                    sportMaxWatermark = incrementalSyncController.pullHomeRecentSportReport(c16541);
                    if (sportMaxWatermark == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult = (SyncRequestResult) sportMaxWatermark;
                    syncRequestResult.setFirstCloudSync(true);
                    incrementalSyncController2 = incrementalSyncController;
                    syncRequestResult2 = syncRequestResult;
                    c16541.L$0 = incrementalSyncController2;
                    c16541.L$1 = syncRequestResult2;
                    c16541.label = 4;
                    if (incrementalSyncController2.pushSportReport2Server(c16541) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c16541.L$0 = incrementalSyncController2;
                    c16541.L$1 = syncRequestResult2;
                    c16541.label = 5;
                    if (incrementalSyncController2.pushSportFDSData(c16541) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c16541.L$0 = incrementalSyncController2;
                    c16541.L$1 = syncRequestResult2;
                    c16541.label = 6;
                    if (incrementalSyncController2.pushSwitchSong2Server(c16541) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    syncRequestResult3 = syncRequestResult2;
                    incrementalSyncController3 = incrementalSyncController2;
                    incrementalSyncController3.getSportSyncFinishController().uploadSportSyncInfo();
                    return syncRequestResult3;
                }
                FitnessLogUtils.i(TAG, "pullSportReportByWaterMark: watermark = " + l);
                long jLongValue2 = l.longValue();
                c16541.L$0 = incrementalSyncController;
                c16541.label = 3;
                sportMaxWatermark = incrementalSyncController.pullSportReportByWaterMark(jLongValue2, c16541);
                if (sportMaxWatermark == coroutine_suspended) {
                    return coroutine_suspended;
                }
                syncRequestResult = (SyncRequestResult) sportMaxWatermark;
                incrementalSyncController2 = incrementalSyncController;
                syncRequestResult2 = syncRequestResult;
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 4;
                if (incrementalSyncController2.pushSportReport2Server(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 5;
                if (incrementalSyncController2.pushSportFDSData(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 6;
                if (incrementalSyncController2.pushSwitchSong2Server(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                syncRequestResult3 = syncRequestResult2;
                incrementalSyncController3 = incrementalSyncController2;
                incrementalSyncController3.getSportSyncFinishController().uploadSportSyncInfo();
                return syncRequestResult3;
            case 2:
                incrementalSyncController = (IncrementalSyncController) c16541.L$0;
                ResultKt.throwOnFailure(sportMaxWatermark);
                syncRequestResult = (SyncRequestResult) sportMaxWatermark;
                syncRequestResult.setFirstCloudSync(true);
                incrementalSyncController2 = incrementalSyncController;
                syncRequestResult2 = syncRequestResult;
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 4;
                if (incrementalSyncController2.pushSportReport2Server(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 5;
                if (incrementalSyncController2.pushSportFDSData(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 6;
                if (incrementalSyncController2.pushSwitchSong2Server(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                syncRequestResult3 = syncRequestResult2;
                incrementalSyncController3 = incrementalSyncController2;
                incrementalSyncController3.getSportSyncFinishController().uploadSportSyncInfo();
                return syncRequestResult3;
            case 3:
                incrementalSyncController = (IncrementalSyncController) c16541.L$0;
                ResultKt.throwOnFailure(sportMaxWatermark);
                syncRequestResult = (SyncRequestResult) sportMaxWatermark;
                incrementalSyncController2 = incrementalSyncController;
                syncRequestResult2 = syncRequestResult;
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 4;
                if (incrementalSyncController2.pushSportReport2Server(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 5;
                if (incrementalSyncController2.pushSportFDSData(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 6;
                if (incrementalSyncController2.pushSwitchSong2Server(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                syncRequestResult3 = syncRequestResult2;
                incrementalSyncController3 = incrementalSyncController2;
                incrementalSyncController3.getSportSyncFinishController().uploadSportSyncInfo();
                return syncRequestResult3;
            case 4:
                syncRequestResult2 = (SyncRequestResult) c16541.L$1;
                incrementalSyncController2 = (IncrementalSyncController) c16541.L$0;
                ResultKt.throwOnFailure(sportMaxWatermark);
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 5;
                if (incrementalSyncController2.pushSportFDSData(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 6;
                if (incrementalSyncController2.pushSwitchSong2Server(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                syncRequestResult3 = syncRequestResult2;
                incrementalSyncController3 = incrementalSyncController2;
                incrementalSyncController3.getSportSyncFinishController().uploadSportSyncInfo();
                return syncRequestResult3;
            case 5:
                syncRequestResult2 = (SyncRequestResult) c16541.L$1;
                incrementalSyncController2 = (IncrementalSyncController) c16541.L$0;
                ResultKt.throwOnFailure(sportMaxWatermark);
                c16541.L$0 = incrementalSyncController2;
                c16541.L$1 = syncRequestResult2;
                c16541.label = 6;
                if (incrementalSyncController2.pushSwitchSong2Server(c16541) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                syncRequestResult3 = syncRequestResult2;
                incrementalSyncController3 = incrementalSyncController2;
                incrementalSyncController3.getSportSyncFinishController().uploadSportSyncInfo();
                return syncRequestResult3;
            case 6:
                syncRequestResult3 = (SyncRequestResult) c16541.L$1;
                incrementalSyncController3 = (IncrementalSyncController) c16541.L$0;
                ResultKt.throwOnFailure(sportMaxWatermark);
                incrementalSyncController3.getSportSyncFinishController().uploadSportSyncInfo();
                return syncRequestResult3;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
