package com.xiaomi.fitness.repo.healthconnect.biz.sport;

import android.app.Application;
import android.text.TextUtils;
import androidx.health.connect.client.HealthConnectClient;
import androidx.health.connect.client.permission.HealthPermission;
import androidx.health.connect.client.records.DistanceRecord;
import androidx.health.connect.client.records.ElevationGainedRecord;
import androidx.health.connect.client.records.ExerciseRoute;
import androidx.health.connect.client.records.ExerciseSessionRecord;
import androidx.health.connect.client.records.HeartRateRecord;
import androidx.health.connect.client.records.Record;
import androidx.health.connect.client.records.SpeedRecord;
import androidx.health.connect.client.records.StepsCadenceRecord;
import androidx.health.connect.client.records.metadata.Device;
import androidx.health.connect.client.response.InsertRecordsResponse;
import androidx.health.connect.client.units.Length;
import androidx.health.connect.client.units.Velocity;
import com.xiaomi.fit.data.common.data.sport.Location;
import com.xiaomi.fit.data.common.data.sport.SportBasicReport;
import com.xiaomi.fit.data.common.data.sport.SportRecordItem;
import com.xiaomi.fit.data.common.data.sport.SportRecordKey;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.export.api.FitnessDataGetter;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.SportReportKey;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.FitnessDatabase;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDao;
import com.xiaomi.fit.fitness.persist.db.internal.HealthConnectSyncDaoEntity;
import com.xiaomi.fit.fitness.persist.db.utils.SportReportDaoUtils;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.repo.healthconnect.BizTypeConstants;
import com.xiaomi.fitness.repo.healthconnect.biz.HealthConnectExtKt;
import com.xiaomi.fitness.repo.healthconnect.biz.daily.BaseSyncBiz;
import com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz;
import com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectIdGenerator;
import com.xiaomi.fitness.repo.healthconnect.utils.HealthConnectUtils;
import com.xiaomi.fitness.trail.export.SportRecordApiKt;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.xr5;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0016\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0082@¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\"J\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\u0006\u0010 \u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010%J+\u0010&\u001a\b\u0012\u0004\u0012\u00020$0\u001b2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020$0)j\b\u0012\u0004\u0012\u00020$`(H\u0002¢\u0006\u0002\u0010*J\u001a\u0010+\u001a\u0004\u0018\u00010,2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0005H\u0002J<\u0010-\u001a\u00020.2$\u0010/\u001a \u0012\u0004\u0012\u000200\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b0\u00120\u00122\u0006\u00102\u001a\u00020\u001cH\u0082@¢\u0006\u0002\u00103J\u0016\u00104\u001a\u00020\u00172\u0006\u00105\u001a\u000201H\u0082@¢\u0006\u0002\u00106J$\u00107\u001a\u00020.2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u001b2\u0006\u0010 \u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010:J$\u0010;\u001a\u00020.2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u001b2\u0006\u0010 \u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010:J$\u0010<\u001a\u00020.2\f\u00108\u001a\b\u0012\u0004\u0012\u0002090\u001b2\u0006\u0010 \u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010:J\u0016\u0010=\u001a\u00020.2\u0006\u0010 \u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010%J\u0016\u0010>\u001a\u00020.2\u0006\u0010 \u001a\u00020\u001cH\u0082@¢\u0006\u0002\u0010%J \u0010?\u001a\u00020,2\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\u00052\u0006\u0010A\u001a\u00020\u0005H\u0002J\u0018\u0010B\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000fR.\u0010\u0011\u001a\"\u0012\u0004\u0012\u00020\u0005\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u00140\u00130\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/xiaomi/fitness/repo/healthconnect/biz/sport/SportSyncBiz;", "", "<init>", "()V", "TAG", "", "dbGetter", "Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "getDbGetter", "()Lcom/xiaomi/fit/fitness/export/api/FitnessDataGetter;", "dbGetter$delegate", "Lkotlin/Lazy;", "healthConnectSyncDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDao;", "getHealthConnectSyncDao", "()Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDao;", "healthConnectSyncDao$delegate", "exercisePermissionMap", "", "Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "Landroidx/health/connect/client/records/Record;", "syncBiz", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordSportReportToHealthConnect", "reportList", "", "Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildHealthConnectData", "Landroidx/health/connect/client/records/ExerciseSessionRecord;", "report", "uid", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildLocationList", "Landroidx/health/connect/client/records/ExerciseRoute$Location;", "(Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "filterGpsList", "routes", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "(Ljava/util/ArrayList;)Ljava/util/List;", "buildHealthConnectSyncDaoEntity", "Lcom/xiaomi/fit/fitness/persist/db/internal/HealthConnectSyncDaoEntity;", "recordSportRecordData", "", "record", "", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;", "basicReport", "(Ljava/util/Map;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkPermissionByKey", "key", "(Lcom/xiaomi/fit/data/common/data/sport/SportRecordKey;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordStepCadenceRecord", "recordList", "Lcom/xiaomi/fit/data/common/data/sport/SportRecordItem;", "(Ljava/util/List;Lcom/xiaomi/fit/data/common/data/sport/SportBasicReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recordHrRecord", "recordSpeedRecord", "recordElevationRecord", "recordDistanceRecord", "buildRecordEntityByType", "type", "recordId", "generateClientRecordId", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSportSyncBiz.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SportSyncBiz.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/sport/SportSyncBiz\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,717:1\n1863#2,2:718\n1863#2,2:720\n1872#2,3:722\n1863#2,2:726\n1010#2,2:729\n1863#2,2:735\n1863#2,2:737\n1863#2,2:739\n216#3:725\n217#3:728\n216#3:731\n216#3,2:732\n217#3:734\n*S KotlinDebug\n*F\n+ 1 SportSyncBiz.kt\ncom/xiaomi/fitness/repo/healthconnect/biz/sport/SportSyncBiz\n*L\n109#1:718,2\n131#1:720,2\n156#1:722,3\n260#1:726,2\n280#1:729,2\n406#1:735,2\n468#1:737,2\n527#1:739,2\n256#1:725\n256#1:728\n320#1:731\n334#1:732,2\n320#1:734\n*E\n"})
public final class SportSyncBiz {

    @NotNull
    private final Map<String, Pair<String, KClass<? extends Record>>> exercisePermissionMap;

    @NotNull
    private final String TAG = "SportSyncBiz";

    /* JADX INFO: renamed from: dbGetter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy dbGetter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: t3o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportSyncBiz.dbGetter_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: healthConnectSyncDao$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthConnectSyncDao = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: u3o
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SportSyncBiz.healthConnectSyncDao_delegate$lambda$1();
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SportRecordKey.values().length];
            try {
                iArr[SportRecordKey.Hr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SportRecordKey.Speed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SportRecordKey.StepsFrequency.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$buildHealthConnectData$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz", f = "SportSyncBiz.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {SportReportBaseParser.ReportType.avgDescentRate, SportReportBaseParser.ReportType.divingOTU}, m = "buildHealthConnectData", n = {"this", "report", "uid", "sportName", "currentZoneOffset", "convertType", "this", "report", "uid", "sportName", "currentZoneOffset", "convertType"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return SportSyncBiz.this.buildHealthConnectData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$buildLocationList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz", f = "SportSyncBiz.kt", i = {0, 0, 0}, l = {255}, m = "buildLocationList", n = {"this", "report", "locationList"}, s = {"L$0", "L$1", "L$2"})
    public static final class C28101 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C28101(Continuation<? super C28101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSyncBiz.this.buildLocationList(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordDistanceRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz", f = "SportSyncBiz.kt", i = {0, 0, 1, 1}, l = {634, 671}, m = "recordDistanceRecord", n = {"this", "report", "this", "report"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C28111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C28111(Continuation<? super C28111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSyncBiz.this.recordDistanceRecord(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordElevationRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz", f = "SportSyncBiz.kt", i = {0, 0, 1, 1}, l = {575, 617}, m = "recordElevationRecord", n = {"this", "report", "this", "report"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class C28121 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C28121(Continuation<? super C28121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSyncBiz.this.recordElevationRecord(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordHrRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz", f = "SportSyncBiz.kt", i = {0, 0, 0, 1, 1}, l = {457, 501}, m = "recordHrRecord", n = {"this", "recordList", "report", "this", "report"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class C28131 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C28131(Continuation<? super C28131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSyncBiz.this.recordHrRecord(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordSpeedRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz", f = "SportSyncBiz.kt", i = {0, 0, 0, 1, 1, 1}, l = {SportSummary.VRESION_204, 561}, m = "recordSpeedRecord", n = {"this", "recordList", "report", "this", "report", "samples"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class C28141 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C28141(Continuation<? super C28141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSyncBiz.this.recordSpeedRecord(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordSportRecordData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz", f = "SportSyncBiz.kt", i = {0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {336, 339, 343, 350, 363, 364}, m = "recordSportRecordData", n = {"this", "basicReport", "it", "this", "basicReport", "this", "basicReport", "this", "basicReport", "this", "basicReport"}, s = {"L$0", "L$1", "L$4", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class C28151 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C28151(Continuation<? super C28151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSyncBiz.this.recordSportRecordData(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordSportReportToHealthConnect$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz", f = "SportSyncBiz.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3}, l = {132, 135, 136, 153}, m = "recordSportReportToHealthConnect", n = {"this", "uid", "healthConnectDataList", "healthSyncDataList", "report", "this", "uid", "healthConnectDataList", "healthSyncDataList", "report", "healthConnectData", "healthSyncData", "this", "uid", "healthConnectDataList", "healthSyncDataList", "healthConnectData", "healthSyncData", "this", "uid", "healthSyncDataList"}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$0", "L$1", "L$2"})
    public static final class C28161 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public C28161(Continuation<? super C28161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSyncBiz.this.recordSportReportToHealthConnect(null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordStepCadenceRecord$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz", f = "SportSyncBiz.kt", i = {0, 0, 0, 1, 1, 1}, l = {395, 440}, m = "recordStepCadenceRecord", n = {"this", "recordList", "report", "this", "report", "samples"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
    public static final class C28171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C28171(Continuation<? super C28171> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSyncBiz.this.recordStepCadenceRecord(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$syncBiz$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz", f = "SportSyncBiz.kt", i = {0, 1}, l = {92, 118}, m = "syncBiz", n = {"this", "this"}, s = {"L$0", "L$0"})
    public static final class C28181 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C28181(Continuation<? super C28181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportSyncBiz.this.syncBiz(this);
        }
    }

    public SportSyncBiz() {
        HealthPermission.Companion companion = HealthPermission.INSTANCE;
        this.exercisePermissionMap = MapsKt__MapsKt.mapOf(TuplesKt.to("sport", new Pair(companion.getWritePermission(Reflection.getOrCreateKotlinClass(ExerciseSessionRecord.class)), Reflection.getOrCreateKotlinClass(ExerciseSessionRecord.class))), TuplesKt.to("speed", new Pair(companion.getWritePermission(Reflection.getOrCreateKotlinClass(SpeedRecord.class)), Reflection.getOrCreateKotlinClass(SpeedRecord.class))), TuplesKt.to(BizTypeConstants.STEP_CADENCE, new Pair(companion.getWritePermission(Reflection.getOrCreateKotlinClass(StepsCadenceRecord.class)), Reflection.getOrCreateKotlinClass(StepsCadenceRecord.class))), TuplesKt.to("hr", new Pair(companion.getWritePermission(Reflection.getOrCreateKotlinClass(HeartRateRecord.class)), Reflection.getOrCreateKotlinClass(HeartRateRecord.class))), TuplesKt.to(BizTypeConstants.ELEVATION, new Pair(companion.getWritePermission(Reflection.getOrCreateKotlinClass(ElevationGainedRecord.class)), Reflection.getOrCreateKotlinClass(ElevationGainedRecord.class))), TuplesKt.to("distance", new Pair(companion.getWritePermission(Reflection.getOrCreateKotlinClass(DistanceRecord.class)), Reflection.getOrCreateKotlinClass(DistanceRecord.class))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object buildHealthConnectData(SportBasicReport sportBasicReport, String str, Continuation<? super ExerciseSessionRecord> continuation) {
        AnonymousClass1 anonymousClass1;
        int iConvertMiToHealthConnectType;
        SportSyncBiz sportSyncBiz;
        String str2;
        String str3;
        int i;
        List list;
        String str4;
        String str5;
        int i2;
        int i3;
        String str6;
        SportSyncBiz sportSyncBiz2;
        SportBasicReport sportBasicReport2;
        int i4;
        String str7;
        List list2;
        SportBasicReport sportBasicReport3 = sportBasicReport;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i5 = anonymousClass1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i5 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objBuildLocationList = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i6 = anonymousClass1.label;
        if (i6 != 0) {
            if (i6 == 1) {
                int i7 = anonymousClass1.I$1;
                int i8 = anonymousClass1.I$0;
                String str8 = (String) anonymousClass1.L$3;
                str3 = (String) anonymousClass1.L$2;
                SportBasicReport sportBasicReport4 = (SportBasicReport) anonymousClass1.L$1;
                sportSyncBiz = (SportSyncBiz) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objBuildLocationList);
                iConvertMiToHealthConnectType = i7;
                sportBasicReport3 = sportBasicReport4;
                str2 = str8;
                i = i8;
            } else {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i4 = anonymousClass1.I$1;
                i3 = anonymousClass1.I$0;
                str7 = (String) anonymousClass1.L$3;
                str6 = (String) anonymousClass1.L$2;
                sportBasicReport2 = (SportBasicReport) anonymousClass1.L$1;
                sportSyncBiz2 = (SportSyncBiz) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objBuildLocationList);
            }
            list = (List) objBuildLocationList;
            Logger.d(sportSyncBiz2.TAG, "gps size:" + list.size());
            i2 = i4;
            str5 = str7;
            str4 = str6;
            sportBasicReport3 = sportBasicReport2;
            i = i3;
            list2 = list;
            if (list2 != null || list2.isEmpty()) {
                Instant instantOfEpochSecond = Instant.ofEpochSecond(sportBasicReport3.getStartTime());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(i);
                Instant instantOfEpochSecond2 = Instant.ofEpochSecond(sportBasicReport3.getEndTime());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
                return new ExerciseSessionRecord(instantOfEpochSecond, zoneOffsetOfTotalSeconds, instantOfEpochSecond2, ZoneOffset.ofTotalSeconds(i), i2, str5, (String) null, new androidx.health.connect.client.records.metadata.Metadata(null, null, null, HealthConnectIdGenerator.INSTANCE.generateTimeRangeClientRecordId(str4, 1, "sport", sportBasicReport3.getStartTime(), sportBasicReport3.getEndTime()), System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null), (List) null, (List) null, (ExerciseRoute) null, 1792, (DefaultConstructorMarker) null);
            }
            Instant instantOfEpochSecond3 = Instant.ofEpochSecond(sportBasicReport3.getStartTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond3, "ofEpochSecond(...)");
            ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(i);
            Instant instantOfEpochSecond4 = Instant.ofEpochSecond(sportBasicReport3.getEndTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond4, "ofEpochSecond(...)");
            return new ExerciseSessionRecord(instantOfEpochSecond3, zoneOffsetOfTotalSeconds2, instantOfEpochSecond4, ZoneOffset.ofTotalSeconds(i), i2, (String) null, (String) null, new androidx.health.connect.client.records.metadata.Metadata(null, null, null, HealthConnectIdGenerator.INSTANCE.generateTimeRangeClientRecordId(str4, 1, "sport", sportBasicReport3.getStartTime(), sportBasicReport3.getEndTime()), System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null), (List) null, (List) null, new ExerciseRoute(list), 768, (DefaultConstructorMarker) null);
        }
        ResultKt.throwOnFailure(objBuildLocationList);
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        iConvertMiToHealthConnectType = TypeConvert.INSTANCE.convertMiToHealthConnectType(sportBasicReport.getSportType());
        String sportReportCourseName = SportRecordApiKt.getSportRecordApi().getSportReportCourseName(sportBasicReport3);
        HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
        Application application = ApplicationExtKt.getApplication();
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = sportBasicReport3;
        anonymousClass1.L$2 = str;
        anonymousClass1.L$3 = sportReportCourseName;
        anonymousClass1.I$0 = currentTZOffsetInSec;
        anonymousClass1.I$1 = iConvertMiToHealthConnectType;
        anonymousClass1.label = 1;
        Object objHasPermission = healthConnectUtils.hasPermission(application, HealthPermission.PERMISSION_WRITE_EXERCISE_ROUTE, anonymousClass1);
        if (objHasPermission == coroutine_suspended) {
            return coroutine_suspended;
        }
        sportSyncBiz = this;
        str2 = sportReportCourseName;
        str3 = str;
        i = currentTZOffsetInSec;
        objBuildLocationList = objHasPermission;
        if (((Boolean) objBuildLocationList).booleanValue()) {
            anonymousClass1.L$0 = sportSyncBiz;
            anonymousClass1.L$1 = sportBasicReport3;
            anonymousClass1.L$2 = str3;
            anonymousClass1.L$3 = str2;
            anonymousClass1.I$0 = i;
            anonymousClass1.I$1 = iConvertMiToHealthConnectType;
            anonymousClass1.label = 2;
            objBuildLocationList = sportSyncBiz.buildLocationList(sportBasicReport3, anonymousClass1);
            if (objBuildLocationList == coroutine_suspended) {
                return coroutine_suspended;
            }
            i3 = i;
            str6 = str3;
            sportSyncBiz2 = sportSyncBiz;
            sportBasicReport2 = sportBasicReport3;
            i4 = iConvertMiToHealthConnectType;
            str7 = str2;
            list = (List) objBuildLocationList;
            Logger.d(sportSyncBiz2.TAG, "gps size:" + list.size());
            i2 = i4;
            str5 = str7;
            str4 = str6;
            sportBasicReport3 = sportBasicReport2;
            i = i3;
        } else {
            list = null;
            str4 = str3;
            str5 = str2;
            i2 = iConvertMiToHealthConnectType;
        }
        list2 = list;
        if (list2 != null) {
        }
        Instant instantOfEpochSecond5 = Instant.ofEpochSecond(sportBasicReport3.getStartTime());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond5, "ofEpochSecond(...)");
        ZoneOffset zoneOffsetOfTotalSeconds3 = ZoneOffset.ofTotalSeconds(i);
        Instant instantOfEpochSecond6 = Instant.ofEpochSecond(sportBasicReport3.getEndTime());
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond6, "ofEpochSecond(...)");
        return new ExerciseSessionRecord(instantOfEpochSecond5, zoneOffsetOfTotalSeconds3, instantOfEpochSecond6, ZoneOffset.ofTotalSeconds(i), i2, str5, (String) null, new androidx.health.connect.client.records.metadata.Metadata(null, null, null, HealthConnectIdGenerator.INSTANCE.generateTimeRangeClientRecordId(str4, 1, "sport", sportBasicReport3.getStartTime(), sportBasicReport3.getEndTime()), System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null), (List) null, (List) null, (ExerciseRoute) null, 1792, (DefaultConstructorMarker) null);
    }

    private final HealthConnectSyncDaoEntity buildHealthConnectSyncDaoEntity(SportBasicReport report, String uid) {
        String key;
        if (report.getSid() == null) {
            return null;
        }
        String sid = report.getSid();
        Intrinsics.checkNotNull(sid);
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(report.getSportType());
        if (sportReportKey == null || (key = sportReportKey.getKey()) == null) {
            key = "";
        }
        return new HealthConnectSyncDaoEntity(uid, 1, "sport", sid, key, report.getTimeStamp(), FitnessDateUtils.getTzOffsetInSecBy15min(report.getTzIn15Min()), FitnessPersistUtils.INSTANCE.toJson(report), "", 1, 0, null, null, null, null, 30720, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object buildLocationList(SportBasicReport sportBasicReport, Continuation<? super List<ExerciseRoute.Location>> continuation) {
        C28101 c28101;
        ArrayList<ExerciseRoute.Location> arrayList;
        SportSyncBiz sportSyncBiz;
        Object sportGpsData;
        SportBasicReport sportBasicReport2 = sportBasicReport;
        if (continuation instanceof C28101) {
            c28101 = (C28101) continuation;
            int i = c28101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28101.label = i - Integer.MIN_VALUE;
            } else {
                c28101 = new C28101(continuation);
            }
        } else {
            c28101 = new C28101(continuation);
        }
        Object obj = c28101.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            arrayList = new ArrayList<>();
            if (TextUtils.isEmpty(sportBasicReport.getSid())) {
                sportSyncBiz = this;
            } else {
                FitnessDataGetter dbGetter = getDbGetter();
                String sid = sportBasicReport.getSid();
                Intrinsics.checkNotNull(sid);
                c28101.L$0 = this;
                c28101.L$1 = sportBasicReport2;
                c28101.L$2 = arrayList;
                c28101.label = 1;
                sportGpsData = dbGetter.getSportGpsData(sid, sportBasicReport2, c28101);
                if (sportGpsData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sportSyncBiz = this;
            }
            return sportSyncBiz.filterGpsList(arrayList);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList<ExerciseRoute.Location> arrayList2 = (ArrayList) c28101.L$2;
        SportBasicReport sportBasicReport3 = (SportBasicReport) c28101.L$1;
        SportSyncBiz sportSyncBiz2 = (SportSyncBiz) c28101.L$0;
        ResultKt.throwOnFailure(obj);
        arrayList = arrayList2;
        sportBasicReport2 = sportBasicReport3;
        sportSyncBiz = sportSyncBiz2;
        sportGpsData = obj;
        Iterator it = ((Map) sportGpsData).entrySet().iterator();
        while (it.hasNext()) {
            List<Location> list = (List) MapsKt__MapsKt.toMutableMap((Map) ((Map.Entry) it.next()).getValue()).get(SportRecordKey.Gps);
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.data.common.data.sport.Location>");
            for (Location location : list) {
                long j = location.startTimeStamp;
                if (j >= sportBasicReport2.getStartTime() && j <= sportBasicReport2.getEndTime()) {
                    Instant instantOfEpochSecond = Instant.ofEpochSecond(location.startTimeStamp);
                    Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                    arrayList.add(new ExerciseRoute.Location(instantOfEpochSecond, location.latitude, location.longitude, null, null, null, 56, null));
                }
            }
        }
        return sportSyncBiz.filterGpsList(arrayList);
    }

    private final HealthConnectSyncDaoEntity buildRecordEntityByType(SportBasicReport report, String type, String recordId) {
        String key;
        String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
        String str = userId == null ? "" : userId;
        String sid = report.getSid();
        String str2 = sid == null ? "" : sid;
        SportReportKey sportReportKey = FitnessPersistKey.INSTANCE.getSportReportKey(report.getSportType());
        return new HealthConnectSyncDaoEntity(str, 1, type, str2, (sportReportKey == null || (key = sportReportKey.getKey()) == null) ? "" : key, report.getStartTime(), FitnessDateUtils.getTzOffsetInSecBy15min(report.getTzIn15Min()), "", "", 1, 0, recordId, generateClientRecordId(report, type), Long.valueOf(report.getStartTime()), Long.valueOf(report.getEndTime()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object checkPermissionByKey(SportRecordKey sportRecordKey, Continuation<? super Boolean> continuation) {
        int i = WhenMappings.$EnumSwitchMapping$0[sportRecordKey.ordinal()];
        if (i == 1) {
            return HealthConnectUtils.INSTANCE.hasPermission(ApplicationExtKt.getApplication(), HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(HeartRateRecord.class)), continuation);
        }
        if (i == 2) {
            return HealthConnectUtils.INSTANCE.hasPermission(ApplicationExtKt.getApplication(), HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(SpeedRecord.class)), continuation);
        }
        if (i != 3) {
            return Boxing.boxBoolean(false);
        }
        return HealthConnectUtils.INSTANCE.hasPermission(ApplicationExtKt.getApplication(), HealthPermission.INSTANCE.getWritePermission(Reflection.getOrCreateKotlinClass(StepsCadenceRecord.class)), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessDataGetter dbGetter_delegate$lambda$0() {
        return FitnessDataExtKt.getInstance(FitnessDataGetter.INSTANCE);
    }

    private final List<ExerciseRoute.Location> filterGpsList(ArrayList<ExerciseRoute.Location> routes) {
        if (routes.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (routes.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(routes, new Comparator() { // from class: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$filterGpsList$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(((ExerciseRoute.Location) t).getTime(), ((ExerciseRoute.Location) t2).getTime());
                }
            });
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(routes.get(0));
        int size = routes.size();
        for (int i = 1; i < size; i++) {
            if (!Intrinsics.areEqual(((ExerciseRoute.Location) arrayList.get(arrayList.size() - 1)).getTime(), routes.get(i).getTime())) {
                arrayList.add(routes.get(i));
            }
        }
        return arrayList;
    }

    private final String generateClientRecordId(SportBasicReport report, String type) {
        HealthConnectIdGenerator healthConnectIdGenerator = HealthConnectIdGenerator.INSTANCE;
        String userId = AccountManagerExtKt.getInstance(AccountManager.INSTANCE).getUserId();
        if (userId == null) {
            userId = "";
        }
        return healthConnectIdGenerator.generateTimeRangeClientRecordId(userId, 1, type, report.getStartTime(), report.getEndTime());
    }

    private final FitnessDataGetter getDbGetter() {
        return (FitnessDataGetter) this.dbGetter.getValue();
    }

    private final HealthConnectSyncDao getHealthConnectSyncDao() {
        return (HealthConnectSyncDao) this.healthConnectSyncDao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HealthConnectSyncDao healthConnectSyncDao_delegate$lambda$1() {
        return FitnessDatabase.INSTANCE.getInstance().healthConnectSyncDao();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object recordDistanceRecord(SportBasicReport sportBasicReport, Continuation<? super Unit> continuation) {
        C28111 c28111;
        SportSyncBiz sportSyncBiz;
        SportBasicReport sportBasicReport2;
        SportSyncBiz sportSyncBiz2;
        SportBasicReport sportBasicReport3;
        if (continuation instanceof C28111) {
            c28111 = (C28111) continuation;
            int i = c28111.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28111.label = i - Integer.MIN_VALUE;
            } else {
                c28111 = new C28111(continuation);
            }
        } else {
            c28111 = new C28111(continuation);
        }
        Object objHasPermission = c28111.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28111.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHasPermission);
            HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
            Application application = ApplicationExtKt.getApplication();
            Pair<String, KClass<? extends Record>> pair = this.exercisePermissionMap.get("distance");
            Intrinsics.checkNotNull(pair);
            String first = pair.getFirst();
            c28111.L$0 = this;
            c28111.L$1 = sportBasicReport;
            c28111.label = 1;
            objHasPermission = healthConnectUtils.hasPermission(application, first, c28111);
            if (objHasPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportSyncBiz = this;
            sportBasicReport2 = sportBasicReport;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sportBasicReport3 = (SportBasicReport) c28111.L$1;
                sportSyncBiz2 = (SportSyncBiz) c28111.L$0;
                try {
                    ResultKt.throwOnFailure(objHasPermission);
                    Logger.i(sportSyncBiz2.TAG, "insert sport distance!!:" + sportBasicReport3.getDistance());
                    sportSyncBiz2.getHealthConnectSyncDao().insert(sportSyncBiz2.buildRecordEntityByType(sportBasicReport3, "distance", ((InsertRecordsResponse) objHasPermission).getRecordIdsList().get(0)));
                } catch (Exception e) {
                    e = e;
                    Logger.e(sportSyncBiz2.TAG, "recordDistanceRecord exception:" + e.getMessage(), e);
                }
                return Unit.INSTANCE;
            }
            sportBasicReport2 = (SportBasicReport) c28111.L$1;
            sportSyncBiz = (SportSyncBiz) c28111.L$0;
            ResultKt.throwOnFailure(objHasPermission);
        }
        if (!((Boolean) objHasPermission).booleanValue()) {
            Logger.i(sportSyncBiz.TAG, "lack sport distance permission!!");
            return Unit.INSTANCE;
        }
        if (sportBasicReport2.getDistance() <= 0) {
            Logger.i(sportSyncBiz.TAG, "report distance is null or zero!!");
            return Unit.INSTANCE;
        }
        try {
            Instant instantOfEpochSecond = Instant.ofEpochSecond(sportBasicReport2.getStartTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
            Instant instantOfEpochSecond2 = Instant.ofEpochSecond(sportBasicReport2.getEndTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
            DistanceRecord distanceRecord = new DistanceRecord(instantOfEpochSecond, ZoneOffset.ofTotalSeconds(FitnessDateUtils.getTzOffsetInSecBy15min(sportBasicReport2.getTzIn15Min())), instantOfEpochSecond2, ZoneOffset.ofTotalSeconds(FitnessDateUtils.getTzOffsetInSecBy15min(sportBasicReport2.getTzIn15Min())), Length.INSTANCE.meters(sportBasicReport2.getDistance()), new androidx.health.connect.client.records.metadata.Metadata(null, null, null, sportSyncBiz.generateClientRecordId(sportBasicReport2, BizTypeConstants.ELEVATION), System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null));
            HealthConnectClient orCreate$default = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, ApplicationExtKt.getApplication(), null, 2, null);
            ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(distanceRecord);
            c28111.L$0 = sportSyncBiz;
            c28111.L$1 = sportBasicReport2;
            c28111.label = 2;
            objHasPermission = orCreate$default.insertRecords(arrayListArrayListOf, c28111);
            if (objHasPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportBasicReport3 = sportBasicReport2;
            sportSyncBiz2 = sportSyncBiz;
            Logger.i(sportSyncBiz2.TAG, "insert sport distance!!:" + sportBasicReport3.getDistance());
            sportSyncBiz2.getHealthConnectSyncDao().insert(sportSyncBiz2.buildRecordEntityByType(sportBasicReport3, "distance", ((InsertRecordsResponse) objHasPermission).getRecordIdsList().get(0)));
            return Unit.INSTANCE;
        } catch (Exception e2) {
            e = e2;
            sportSyncBiz2 = sportSyncBiz;
            Logger.e(sportSyncBiz2.TAG, "recordDistanceRecord exception:" + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object recordElevationRecord(SportBasicReport sportBasicReport, Continuation<? super Unit> continuation) {
        C28121 c28121;
        SportSyncBiz sportSyncBiz;
        SportBasicReport sportBasicReport2;
        SportSyncBiz sportSyncBiz2;
        SportBasicReport sportBasicReport3;
        if (continuation instanceof C28121) {
            c28121 = (C28121) continuation;
            int i = c28121.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28121.label = i - Integer.MIN_VALUE;
            } else {
                c28121 = new C28121(continuation);
            }
        } else {
            c28121 = new C28121(continuation);
        }
        Object objHasPermission = c28121.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28121.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHasPermission);
            HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
            Application application = ApplicationExtKt.getApplication();
            Pair<String, KClass<? extends Record>> pair = this.exercisePermissionMap.get(BizTypeConstants.ELEVATION);
            Intrinsics.checkNotNull(pair);
            String first = pair.getFirst();
            c28121.L$0 = this;
            c28121.L$1 = sportBasicReport;
            c28121.label = 1;
            objHasPermission = healthConnectUtils.hasPermission(application, first, c28121);
            if (objHasPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportSyncBiz = this;
            sportBasicReport2 = sportBasicReport;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sportBasicReport3 = (SportBasicReport) c28121.L$1;
                sportSyncBiz2 = (SportSyncBiz) c28121.L$0;
                try {
                    ResultKt.throwOnFailure(objHasPermission);
                    Logger.i(sportSyncBiz2.TAG, "insert sport elevation!!:" + sportBasicReport3.getRiseHeight());
                    sportSyncBiz2.getHealthConnectSyncDao().insert(sportSyncBiz2.buildRecordEntityByType(sportBasicReport3, BizTypeConstants.ELEVATION, ((InsertRecordsResponse) objHasPermission).getRecordIdsList().get(0)));
                } catch (Exception e) {
                    e = e;
                    Logger.e(sportSyncBiz2.TAG, "recordElevationRecord exception:" + e.getMessage(), e);
                }
                return Unit.INSTANCE;
            }
            sportBasicReport2 = (SportBasicReport) c28121.L$1;
            sportSyncBiz = (SportSyncBiz) c28121.L$0;
            ResultKt.throwOnFailure(objHasPermission);
        }
        if (!((Boolean) objHasPermission).booleanValue()) {
            Logger.i(sportSyncBiz.TAG, "lack sport elevation permission!!");
            return Unit.INSTANCE;
        }
        Float riseHeight = sportBasicReport2.getRiseHeight();
        if ((riseHeight != null ? riseHeight.floatValue() : 0.0f) <= 0.0f) {
            Logger.i(sportSyncBiz.TAG, "report rise height is null");
            return Unit.INSTANCE;
        }
        try {
            Instant instantOfEpochSecond = Instant.ofEpochSecond(sportBasicReport2.getStartTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
            Instant instantOfEpochSecond2 = Instant.ofEpochSecond(sportBasicReport2.getEndTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(FitnessDateUtils.getTzOffsetInSecBy15min(sportBasicReport2.getTzIn15Min()));
            ZoneOffset zoneOffsetOfTotalSeconds2 = ZoneOffset.ofTotalSeconds(FitnessDateUtils.getTzOffsetInSecBy15min(sportBasicReport2.getTzIn15Min()));
            Length.Companion companion = Length.INSTANCE;
            Float riseHeight2 = sportBasicReport2.getRiseHeight();
            ElevationGainedRecord elevationGainedRecord = new ElevationGainedRecord(instantOfEpochSecond, zoneOffsetOfTotalSeconds, instantOfEpochSecond2, zoneOffsetOfTotalSeconds2, companion.meters(xr5.e(1, riseHeight2 != null ? riseHeight2.floatValue() : 0.0f)), new androidx.health.connect.client.records.metadata.Metadata(null, null, null, sportSyncBiz.generateClientRecordId(sportBasicReport2, BizTypeConstants.ELEVATION), System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null));
            HealthConnectClient orCreate$default = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, ApplicationExtKt.getApplication(), null, 2, null);
            ArrayList arrayListArrayListOf = CollectionsKt__CollectionsKt.arrayListOf(elevationGainedRecord);
            c28121.L$0 = sportSyncBiz;
            c28121.L$1 = sportBasicReport2;
            c28121.label = 2;
            objHasPermission = orCreate$default.insertRecords(arrayListArrayListOf, c28121);
            if (objHasPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportBasicReport3 = sportBasicReport2;
            sportSyncBiz2 = sportSyncBiz;
            Logger.i(sportSyncBiz2.TAG, "insert sport elevation!!:" + sportBasicReport3.getRiseHeight());
            sportSyncBiz2.getHealthConnectSyncDao().insert(sportSyncBiz2.buildRecordEntityByType(sportBasicReport3, BizTypeConstants.ELEVATION, ((InsertRecordsResponse) objHasPermission).getRecordIdsList().get(0)));
            return Unit.INSTANCE;
        } catch (Exception e2) {
            e = e2;
            sportSyncBiz2 = sportSyncBiz;
            Logger.e(sportSyncBiz2.TAG, "recordElevationRecord exception:" + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object recordHrRecord(List<SportRecordItem> list, SportBasicReport sportBasicReport, Continuation<? super Unit> continuation) {
        C28131 c28131;
        SportSyncBiz sportSyncBiz;
        List<SportRecordItem> list2;
        SportBasicReport sportBasicReport2;
        SportSyncBiz sportSyncBiz2;
        SportBasicReport sportBasicReport3;
        if (continuation instanceof C28131) {
            c28131 = (C28131) continuation;
            int i = c28131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28131.label = i - Integer.MIN_VALUE;
            } else {
                c28131 = new C28131(continuation);
            }
        } else {
            c28131 = new C28131(continuation);
        }
        Object objHasPermission = c28131.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28131.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHasPermission);
            HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
            Application application = ApplicationExtKt.getApplication();
            Pair<String, KClass<? extends Record>> pair = this.exercisePermissionMap.get("hr");
            Intrinsics.checkNotNull(pair);
            String first = pair.getFirst();
            c28131.L$0 = this;
            c28131.L$1 = list;
            c28131.L$2 = sportBasicReport;
            c28131.label = 1;
            objHasPermission = healthConnectUtils.hasPermission(application, first, c28131);
            if (objHasPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportSyncBiz = this;
            list2 = list;
            sportBasicReport2 = sportBasicReport;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sportBasicReport3 = (SportBasicReport) c28131.L$1;
                sportSyncBiz2 = (SportSyncBiz) c28131.L$0;
                try {
                    ResultKt.throwOnFailure(objHasPermission);
                    sportSyncBiz2.getHealthConnectSyncDao().insert(sportSyncBiz2.buildRecordEntityByType(sportBasicReport3, "hr", ((InsertRecordsResponse) objHasPermission).getRecordIdsList().get(0)));
                } catch (Exception e) {
                    e = e;
                    Logger.e(sportSyncBiz2.TAG, "syncLast30DaysRecordsFromHealthConnectSynInfo exception:" + e.getMessage(), e);
                }
                return Unit.INSTANCE;
            }
            sportBasicReport2 = (SportBasicReport) c28131.L$2;
            list2 = (List) c28131.L$1;
            sportSyncBiz = (SportSyncBiz) c28131.L$0;
            ResultKt.throwOnFailure(objHasPermission);
        }
        if (!((Boolean) objHasPermission).booleanValue()) {
            Logger.i(sportSyncBiz.TAG, "lack hr write permission!!");
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        ArrayList arrayList2 = new ArrayList();
        for (SportRecordItem sportRecordItem : list2) {
            long jLongValue = sportRecordItem.getValue().longValue();
            if (1 <= jLongValue && jLongValue < 301) {
                Instant instantOfEpochSecond = Instant.ofEpochSecond(sportRecordItem.getStartTime());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                arrayList2.add(new HeartRateRecord.Sample(instantOfEpochSecond, sportRecordItem.getValue().longValue()));
                sportSyncBiz = sportSyncBiz;
                Logger.d(sportSyncBiz.TAG, "record hr:" + sportRecordItem.getValue());
            }
        }
        if (arrayList2.isEmpty()) {
            Logger.i(sportSyncBiz.TAG, "hr record sample empty!!");
            return Unit.INSTANCE;
        }
        try {
            Instant instantOfEpochSecond2 = Instant.ofEpochSecond(sportBasicReport2.getStartTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(currentTZOffsetInSec);
            Instant instantOfEpochSecond3 = Instant.ofEpochSecond(sportBasicReport2.getEndTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond3, "ofEpochSecond(...)");
            arrayList.add(new HeartRateRecord(instantOfEpochSecond2, zoneOffsetOfTotalSeconds, instantOfEpochSecond3, ZoneOffset.ofTotalSeconds(currentTZOffsetInSec), arrayList2, new androidx.health.connect.client.records.metadata.Metadata(null, null, null, sportSyncBiz.generateClientRecordId(sportBasicReport2, "hr"), System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null)));
            HealthConnectClient orCreate$default = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, ApplicationExtKt.getApplication(), null, 2, null);
            c28131.L$0 = sportSyncBiz;
            c28131.L$1 = sportBasicReport2;
            c28131.L$2 = null;
            c28131.label = 2;
            objHasPermission = orCreate$default.insertRecords(arrayList, c28131);
            if (objHasPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportBasicReport3 = sportBasicReport2;
            sportSyncBiz2 = sportSyncBiz;
            sportSyncBiz2.getHealthConnectSyncDao().insert(sportSyncBiz2.buildRecordEntityByType(sportBasicReport3, "hr", ((InsertRecordsResponse) objHasPermission).getRecordIdsList().get(0)));
            return Unit.INSTANCE;
        } catch (Exception e2) {
            e = e2;
            sportSyncBiz2 = sportSyncBiz;
            Logger.e(sportSyncBiz2.TAG, "syncLast30DaysRecordsFromHealthConnectSynInfo exception:" + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object recordSpeedRecord(List<SportRecordItem> list, SportBasicReport sportBasicReport, Continuation<? super Unit> continuation) {
        C28141 c28141;
        SportSyncBiz sportSyncBiz;
        List<SportRecordItem> list2;
        SportBasicReport sportBasicReport2;
        SportSyncBiz sportSyncBiz2;
        ArrayList arrayList;
        if (continuation instanceof C28141) {
            c28141 = (C28141) continuation;
            int i = c28141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28141.label = i - Integer.MIN_VALUE;
            } else {
                c28141 = new C28141(continuation);
            }
        } else {
            c28141 = new C28141(continuation);
        }
        Object objHasPermission = c28141.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28141.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHasPermission);
            HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
            Application application = ApplicationExtKt.getApplication();
            Pair<String, KClass<? extends Record>> pair = this.exercisePermissionMap.get("speed");
            Intrinsics.checkNotNull(pair);
            String first = pair.getFirst();
            c28141.L$0 = this;
            c28141.L$1 = list;
            c28141.L$2 = sportBasicReport;
            c28141.label = 1;
            objHasPermission = healthConnectUtils.hasPermission(application, first, c28141);
            if (objHasPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportSyncBiz = this;
            list2 = list;
            sportBasicReport2 = sportBasicReport;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = (ArrayList) c28141.L$2;
                sportBasicReport2 = (SportBasicReport) c28141.L$1;
                sportSyncBiz2 = (SportSyncBiz) c28141.L$0;
                try {
                    ResultKt.throwOnFailure(objHasPermission);
                    sportSyncBiz2.getHealthConnectSyncDao().insert(sportSyncBiz2.buildRecordEntityByType(sportBasicReport2, "speed", ((InsertRecordsResponse) objHasPermission).getRecordIdsList().get(0)));
                    Logger.i(sportSyncBiz2.TAG, "insert sport speed record!!:" + arrayList.size());
                } catch (Exception e) {
                    e = e;
                    Logger.e(sportSyncBiz2.TAG, "recordSpeedRecord exception:" + e.getMessage(), e);
                }
                return Unit.INSTANCE;
            }
            sportBasicReport2 = (SportBasicReport) c28141.L$2;
            list2 = (List) c28141.L$1;
            sportSyncBiz = (SportSyncBiz) c28141.L$0;
            ResultKt.throwOnFailure(objHasPermission);
        }
        if (!((Boolean) objHasPermission).booleanValue()) {
            Logger.i(sportSyncBiz.TAG, "lack speed write permission!!");
            return Unit.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        ArrayList arrayList3 = new ArrayList();
        for (SportRecordItem sportRecordItem : list2) {
            if (sportRecordItem.getValue().doubleValue() > 0.0d && sportRecordItem.getValue().doubleValue() < 1000000.0d) {
                Instant instantOfEpochSecond = Instant.ofEpochSecond(sportRecordItem.getStartTime());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                arrayList3.add(new SpeedRecord.Sample(instantOfEpochSecond, Velocity.INSTANCE.kilometersPerHour(sportRecordItem.getValue().doubleValue())));
                sportSyncBiz = sportSyncBiz;
                Logger.d(sportSyncBiz.TAG, "record speed:" + sportRecordItem.getValue());
            }
        }
        if (arrayList3.isEmpty()) {
            Logger.i(sportSyncBiz.TAG, "speed record empty!!");
            return Unit.INSTANCE;
        }
        try {
            Instant instantOfEpochSecond2 = Instant.ofEpochSecond(sportBasicReport2.getStartTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(currentTZOffsetInSec);
            Instant instantOfEpochSecond3 = Instant.ofEpochSecond(sportBasicReport2.getEndTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond3, "ofEpochSecond(...)");
            arrayList2.add(new SpeedRecord(instantOfEpochSecond2, zoneOffsetOfTotalSeconds, instantOfEpochSecond3, ZoneOffset.ofTotalSeconds(currentTZOffsetInSec), arrayList3, new androidx.health.connect.client.records.metadata.Metadata(null, null, null, sportSyncBiz.generateClientRecordId(sportBasicReport2, "speed"), System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null)));
            HealthConnectClient orCreate$default = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, ApplicationExtKt.getApplication(), null, 2, null);
            c28141.L$0 = sportSyncBiz;
            c28141.L$1 = sportBasicReport2;
            c28141.L$2 = arrayList3;
            c28141.label = 2;
            objHasPermission = orCreate$default.insertRecords(arrayList2, c28141);
            if (objHasPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList = arrayList3;
            sportSyncBiz2 = sportSyncBiz;
            sportSyncBiz2.getHealthConnectSyncDao().insert(sportSyncBiz2.buildRecordEntityByType(sportBasicReport2, "speed", ((InsertRecordsResponse) objHasPermission).getRecordIdsList().get(0)));
            Logger.i(sportSyncBiz2.TAG, "insert sport speed record!!:" + arrayList.size());
            return Unit.INSTANCE;
        } catch (Exception e2) {
            e = e2;
            sportSyncBiz2 = sportSyncBiz;
            Logger.e(sportSyncBiz2.TAG, "recordSpeedRecord exception:" + e.getMessage(), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x007a A[PHI: r12 r13 r14
      0x007a: PHI (r12v19 java.util.Iterator<java.util.Map$Entry<java.lang.Integer, ? extends java.util.Map<com.xiaomi.fit.data.common.data.sport.SportRecordKey, ? extends java.util.List<? extends java.lang.Object>>>>) = 
      (r12v2 java.util.Iterator<java.util.Map$Entry<java.lang.Integer, ? extends java.util.Map<com.xiaomi.fit.data.common.data.sport.SportRecordKey, ? extends java.util.List<? extends java.lang.Object>>>>)
      (r12v23 java.util.Iterator<java.util.Map$Entry<java.lang.Integer, ? extends java.util.Map<com.xiaomi.fit.data.common.data.sport.SportRecordKey, ? extends java.util.List<? extends java.lang.Object>>>>)
     binds: [B:16:0x006d, B:36:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r13v8 com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz) = 
      (r13v1 com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz)
      (r13v9 com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz)
     binds: [B:16:0x006d, B:36:0x00df] A[DONT_GENERATE, DONT_INLINE]
      0x007a: PHI (r14v14 com.xiaomi.fit.data.common.data.sport.SportBasicReport) = 
      (r14v2 com.xiaomi.fit.data.common.data.sport.SportBasicReport)
      (r14v15 com.xiaomi.fit.data.common.data.sport.SportBasicReport)
     binds: [B:16:0x006d, B:36:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0080  */
    /* JADX WARN: Code duplicated, block: B:21:0x0098  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:31:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:39:0x0119 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x011a  */
    /* JADX WARN: Code duplicated, block: B:43:0x0129  */
    /* JADX WARN: Code duplicated, block: B:45:0x013c  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:51:0x0165 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0170  */
    /* JADX WARN: Code duplicated, block: B:56:0x018b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x018c  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d3 -> B:35:0x00db). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0166 -> B:53:0x016a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:37:0x00e1
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object recordSportRecordData(java.util.Map<java.lang.Integer, ? extends java.util.Map<com.xiaomi.fit.data.common.data.sport.SportRecordKey, ? extends java.util.List<? extends java.lang.Object>>> r12, com.xiaomi.fit.data.common.data.sport.SportBasicReport r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz.recordSportRecordData(java.util.Map, com.xiaomi.fit.data.common.data.sport.SportBasicReport, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:32:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0112  */
    /* JADX WARN: Code duplicated, block: B:36:0x012b  */
    /* JADX WARN: Code duplicated, block: B:38:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x014f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0176 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x0185  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordSportReportToHealthConnect$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r13v1, types: [com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.xiaomi.fit.fitness.export.api.FitnessDataGetter] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordSportReportToHealthConnect$1] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordSportReportToHealthConnect$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz$recordSportReportToHealthConnect$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [androidx.health.connect.client.HealthConnectClient] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0174 -> B:43:0x0177). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0185 -> B:45:0x0189). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object recordSportReportToHealthConnect(java.util.List<com.xiaomi.fit.data.common.data.sport.SportBasicReport> r21, kotlin.coroutines.Continuation<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fitness.repo.healthconnect.biz.sport.SportSyncBiz.recordSportReportToHealthConnect(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object recordStepCadenceRecord(List<SportRecordItem> list, SportBasicReport sportBasicReport, Continuation<? super Unit> continuation) {
        C28171 c28171;
        SportSyncBiz sportSyncBiz;
        List<SportRecordItem> list2;
        SportBasicReport sportBasicReport2;
        SportSyncBiz sportSyncBiz2;
        ArrayList arrayList;
        if (continuation instanceof C28171) {
            c28171 = (C28171) continuation;
            int i = c28171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28171.label = i - Integer.MIN_VALUE;
            } else {
                c28171 = new C28171(continuation);
            }
        } else {
            c28171 = new C28171(continuation);
        }
        Object objHasPermission = c28171.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28171.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHasPermission);
            HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
            Application application = ApplicationExtKt.getApplication();
            Pair<String, KClass<? extends Record>> pair = this.exercisePermissionMap.get(BizTypeConstants.STEP_CADENCE);
            Intrinsics.checkNotNull(pair);
            String first = pair.getFirst();
            c28171.L$0 = this;
            c28171.L$1 = list;
            c28171.L$2 = sportBasicReport;
            c28171.label = 1;
            objHasPermission = healthConnectUtils.hasPermission(application, first, c28171);
            if (objHasPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            sportSyncBiz = this;
            list2 = list;
            sportBasicReport2 = sportBasicReport;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arrayList = (ArrayList) c28171.L$2;
                sportBasicReport2 = (SportBasicReport) c28171.L$1;
                sportSyncBiz2 = (SportSyncBiz) c28171.L$0;
                try {
                    ResultKt.throwOnFailure(objHasPermission);
                    Logger.i(sportSyncBiz2.TAG, "insert sport step cadence:" + arrayList.size());
                    sportSyncBiz2.getHealthConnectSyncDao().insert(sportSyncBiz2.buildRecordEntityByType(sportBasicReport2, BizTypeConstants.STEP_CADENCE, ((InsertRecordsResponse) objHasPermission).getRecordIdsList().get(0)));
                } catch (Exception e) {
                    e = e;
                    Logger.e(sportSyncBiz2.TAG, "syncLast30DaysRecordsFromHealthConnectSynInfo exception:" + e.getMessage(), e);
                }
                return Unit.INSTANCE;
            }
            sportBasicReport2 = (SportBasicReport) c28171.L$2;
            list2 = (List) c28171.L$1;
            sportSyncBiz = (SportSyncBiz) c28171.L$0;
            ResultKt.throwOnFailure(objHasPermission);
        }
        if (!((Boolean) objHasPermission).booleanValue()) {
            Logger.i(sportSyncBiz.TAG, "lack step cadence permission!!");
            return Unit.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        int currentTZOffsetInSec = FitnessDateUtils.getCurrentTZOffsetInSec();
        ArrayList arrayList3 = new ArrayList();
        for (SportRecordItem sportRecordItem : list2) {
            if (sportRecordItem.getValue().doubleValue() > 0.0d && sportRecordItem.getValue().doubleValue() <= 10000.0d) {
                Instant instantOfEpochSecond = Instant.ofEpochSecond(sportRecordItem.getStartTime());
                Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
                arrayList3.add(new StepsCadenceRecord.Sample(instantOfEpochSecond, sportRecordItem.getValue().doubleValue()));
                sportSyncBiz = sportSyncBiz;
                Logger.d(sportSyncBiz.TAG, "record step cadence:" + sportRecordItem.getValue());
            }
        }
        if (arrayList3.isEmpty()) {
            Logger.i(sportSyncBiz.TAG, "StepsCadenceRecord sample empty!!");
            return Unit.INSTANCE;
        }
        try {
            Instant instantOfEpochSecond2 = Instant.ofEpochSecond(sportBasicReport2.getStartTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
            ZoneOffset zoneOffsetOfTotalSeconds = ZoneOffset.ofTotalSeconds(currentTZOffsetInSec);
            Instant instantOfEpochSecond3 = Instant.ofEpochSecond(sportBasicReport2.getEndTime());
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond3, "ofEpochSecond(...)");
            arrayList2.add(new StepsCadenceRecord(instantOfEpochSecond2, zoneOffsetOfTotalSeconds, instantOfEpochSecond3, ZoneOffset.ofTotalSeconds(currentTZOffsetInSec), arrayList3, new androidx.health.connect.client.records.metadata.Metadata(null, null, null, sportSyncBiz.generateClientRecordId(sportBasicReport2, BizTypeConstants.STEP_CADENCE), System.currentTimeMillis(), new Device("xiaomi", null, 0, 6, null), 2, 7, null)));
            HealthConnectClient orCreate$default = HealthConnectClient.Companion.getOrCreate$default(HealthConnectClient.INSTANCE, ApplicationExtKt.getApplication(), null, 2, null);
            c28171.L$0 = sportSyncBiz;
            c28171.L$1 = sportBasicReport2;
            c28171.L$2 = arrayList3;
            c28171.label = 2;
            objHasPermission = orCreate$default.insertRecords(arrayList2, c28171);
            if (objHasPermission == coroutine_suspended) {
                return coroutine_suspended;
            }
            arrayList = arrayList3;
            sportSyncBiz2 = sportSyncBiz;
            Logger.i(sportSyncBiz2.TAG, "insert sport step cadence:" + arrayList.size());
            sportSyncBiz2.getHealthConnectSyncDao().insert(sportSyncBiz2.buildRecordEntityByType(sportBasicReport2, BizTypeConstants.STEP_CADENCE, ((InsertRecordsResponse) objHasPermission).getRecordIdsList().get(0)));
            return Unit.INSTANCE;
        } catch (Exception e2) {
            e = e2;
            sportSyncBiz2 = sportSyncBiz;
            Logger.e(sportSyncBiz2.TAG, "syncLast30DaysRecordsFromHealthConnectSynInfo exception:" + e.getMessage(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007c A[Catch: Exception -> 0x0048, TryCatch #1 {Exception -> 0x0048, blocks: (B:20:0x0044, B:29:0x0074, B:31:0x007c, B:33:0x0088, B:35:0x00a8, B:37:0x00b4, B:38:0x00bf, B:40:0x00c5, B:42:0x00d1, B:44:0x00dd, B:45:0x00f3), top: B:57:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0088 A[Catch: Exception -> 0x0048, TryCatch #1 {Exception -> 0x0048, blocks: (B:20:0x0044, B:29:0x0074, B:31:0x007c, B:33:0x0088, B:35:0x00a8, B:37:0x00b4, B:38:0x00bf, B:40:0x00c5, B:42:0x00d1, B:44:0x00dd, B:45:0x00f3), top: B:57:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8 A[Catch: Exception -> 0x0048, TryCatch #1 {Exception -> 0x0048, blocks: (B:20:0x0044, B:29:0x0074, B:31:0x007c, B:33:0x0088, B:35:0x00a8, B:37:0x00b4, B:38:0x00bf, B:40:0x00c5, B:42:0x00d1, B:44:0x00dd, B:45:0x00f3), top: B:57:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4 A[Catch: Exception -> 0x0048, TryCatch #1 {Exception -> 0x0048, blocks: (B:20:0x0044, B:29:0x0074, B:31:0x007c, B:33:0x0088, B:35:0x00a8, B:37:0x00b4, B:38:0x00bf, B:40:0x00c5, B:42:0x00d1, B:44:0x00dd, B:45:0x00f3), top: B:57:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5 A[Catch: Exception -> 0x0048, TryCatch #1 {Exception -> 0x0048, blocks: (B:20:0x0044, B:29:0x0074, B:31:0x007c, B:33:0x0088, B:35:0x00a8, B:37:0x00b4, B:38:0x00bf, B:40:0x00c5, B:42:0x00d1, B:44:0x00dd, B:45:0x00f3), top: B:57:0x0044 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0117 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0118  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object syncBiz(@NotNull Continuation<? super Boolean> continuation) {
        C28181 c28181;
        SportSyncBiz sportSyncBiz;
        SportSyncBiz sportSyncBiz2;
        List<HealthConnectSyncDaoEntity> unSyncedListByTimeRange;
        if (continuation instanceof C28181) {
            c28181 = (C28181) continuation;
            int i = c28181.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c28181.label = i - Integer.MIN_VALUE;
            } else {
                c28181 = new C28181(continuation);
            }
        } else {
            c28181 = new C28181(continuation);
        }
        Object objHasPermission = c28181.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c28181.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objHasPermission);
            try {
                HealthConnectUtils healthConnectUtils = HealthConnectUtils.INSTANCE;
                Application application = ApplicationExtKt.getApplication();
                Pair<String, KClass<? extends Record>> pair = this.exercisePermissionMap.get("sport");
                Intrinsics.checkNotNull(pair);
                String first = pair.getFirst();
                c28181.L$0 = this;
                c28181.label = 1;
                objHasPermission = healthConnectUtils.hasPermission(application, first, c28181);
                if (objHasPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sportSyncBiz2 = this;
                if (!((Boolean) objHasPermission).booleanValue()) {
                    Logger.i(sportSyncBiz2.TAG, "lack exercise permission!!");
                    return Boxing.boxBoolean(true);
                }
                long jCurrentTimeMillis = System.currentTimeMillis() / ((long) 1000);
                unSyncedListByTimeRange = sportSyncBiz2.getHealthConnectSyncDao().getUnSyncedListByTimeRange(1, "sport", jCurrentTimeMillis - ((long) BaseSyncBiz.RECORD_MAX_LIFETIME), jCurrentTimeMillis);
                if (unSyncedListByTimeRange.isEmpty()) {
                    Logger.i(sportSyncBiz2.TAG, "empty sport report");
                    return Boxing.boxBoolean(true);
                }
                ArrayList arrayList = new ArrayList();
                for (HealthConnectSyncDaoEntity healthConnectSyncDaoEntity : unSyncedListByTimeRange) {
                    if (HealthConnectExtKt.isSynced(healthConnectSyncDaoEntity)) {
                    }
                }
                Logger.i(sportSyncBiz2.TAG, ">>>>> start sync sport report:" + arrayList.size());
                c28181.L$0 = sportSyncBiz2;
                c28181.label = 2;
                objHasPermission = sportSyncBiz2.recordSportReportToHealthConnect(arrayList, c28181);
                if (objHasPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sportSyncBiz = sportSyncBiz2;
            } catch (Exception e) {
                e = e;
                sportSyncBiz = this;
                Logger.e(sportSyncBiz.TAG, "syncBiz exception:" + e.getMessage(), e);
                return Boxing.boxBoolean(true);
            }
        } else if (i2 == 1) {
            sportSyncBiz2 = (SportSyncBiz) c28181.L$0;
            try {
                ResultKt.throwOnFailure(objHasPermission);
                if (!((Boolean) objHasPermission).booleanValue()) {
                    Logger.i(sportSyncBiz2.TAG, "lack exercise permission!!");
                    return Boxing.boxBoolean(true);
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() / ((long) 1000);
                unSyncedListByTimeRange = sportSyncBiz2.getHealthConnectSyncDao().getUnSyncedListByTimeRange(1, "sport", jCurrentTimeMillis2 - ((long) BaseSyncBiz.RECORD_MAX_LIFETIME), jCurrentTimeMillis2);
                if (unSyncedListByTimeRange.isEmpty()) {
                    Logger.i(sportSyncBiz2.TAG, "empty sport report");
                    return Boxing.boxBoolean(true);
                }
                ArrayList arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                    if (HealthConnectExtKt.isSynced(healthConnectSyncDaoEntity) && !TextUtils.equals(healthConnectSyncDaoEntity.getSid(), "xiaomiwear_app_manually")) {
                        ListExtKt.add(arrayList2, SportReportDaoUtils.INSTANCE.getTheSportReport(healthConnectSyncDaoEntity.getSid(), healthConnectSyncDaoEntity.getKey(), healthConnectSyncDaoEntity.getTime()));
                    }
                }
                Logger.i(sportSyncBiz2.TAG, ">>>>> start sync sport report:" + arrayList2.size());
                c28181.L$0 = sportSyncBiz2;
                c28181.label = 2;
                objHasPermission = sportSyncBiz2.recordSportReportToHealthConnect(arrayList2, c28181);
                if (objHasPermission == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sportSyncBiz = sportSyncBiz2;
            } catch (Exception e2) {
                e = e2;
                sportSyncBiz = sportSyncBiz2;
                Logger.e(sportSyncBiz.TAG, "syncBiz exception:" + e.getMessage(), e);
                return Boxing.boxBoolean(true);
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sportSyncBiz = (SportSyncBiz) c28181.L$0;
            try {
                ResultKt.throwOnFailure(objHasPermission);
            } catch (Exception e3) {
                e = e3;
                Logger.e(sportSyncBiz.TAG, "syncBiz exception:" + e.getMessage(), e);
                return Boxing.boxBoolean(true);
            }
        }
        boolean zBooleanValue = ((Boolean) objHasPermission).booleanValue();
        Logger.i(sportSyncBiz.TAG, ">>>>> end sync sport report:" + zBooleanValue);
        return Boxing.boxBoolean(zBooleanValue);
    }
}
