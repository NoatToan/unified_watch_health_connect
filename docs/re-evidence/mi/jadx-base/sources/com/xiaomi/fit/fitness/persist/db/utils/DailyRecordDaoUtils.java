package com.xiaomi.fit.fitness.persist.db.utils;

import android.database.sqlite.SQLiteException;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.amap.api.maps.utils.SpatialRelationUtil;
import com.google.gson.Gson;
import com.tencent.wcdb.FileUtils;
import com.xiaomi.fit.data.common.log.FitnessLogUtils;
import com.xiaomi.fit.data.common.util.FitnessDateUtils;
import com.xiaomi.fit.fitness.DailyRecordItemModel;
import com.xiaomi.fit.fitness.FitnessDBKey;
import com.xiaomi.fit.fitness.export.api.FitnessServerSyncer;
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import com.xiaomi.fit.fitness.export.data.aggregation.record.BodyComposition;
import com.xiaomi.fit.fitness.export.data.annotation.EcgInterpretStatus;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.data.item.DailyRecordItem;
import com.xiaomi.fit.fitness.export.data.item.DayNightSleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.WomenHealthSymptoms;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fit.fitness.persist.db.FitnessDBConstants;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseDao;
import com.xiaomi.fit.fitness.persist.db.internal.DailyRecordBaseEntity;
import com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao;
import com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentEntity;
import com.xiaomi.fit.fitness.persist.db.internal.WeightItemDao;
import com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils;
import com.xiaomi.fit.fitness.persist.server.data.FitnessDataModel;
import com.xiaomi.fit.fitness.persist.utils.FitnessPersistUtils;
import com.xiaomi.fit.fitness.remote.FitnessServerHistorySync;
import com.xiaomi.fitness.aggregation.health.entity.CloudContract;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.repo.curse.CurseTimeItem;
import com.xiaomi.fitness.repo.curse.CurseUtilKt;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0014J\"\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001bH\u0002J\u001e\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u0014H\u0002J&\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$J&\u0010%\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$J6\u0010&\u001a\b\u0012\u0004\u0012\u00020 0\u00142\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0(2\u0006\u0010)\u001a\u00020*2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010+\u001a\u00020\u0017J\u001c\u0010,\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020 0\u0014J'\u0010-\u001a\u00020\u00122\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020*2\n\b\u0002\u00101\u001a\u0004\u0018\u00010*¢\u0006\u0002\u00102JB\u00103\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u0014042\u0006\u0010.\u001a\u00020/2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00106\u001a\u00020$JS\u00107\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u0014042\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00106\u001a\u00020$2\u0012\u00108\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000509\"\u00020\u0005¢\u0006\u0002\u0010:J8\u0010;\u001a\b\u0012\u0004\u0012\u0002050\u00142\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u0010<\u001a\u00020$H\u0002Jj\u0010=\u001a\b\u0012\u0004\u0012\u00020 0\u00142\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0(2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u0010<\u001a\u00020$2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020\u00172\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0005H\u0002JH\u0010@\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u0014040A2\u0006\u0010.\u001a\u00020/2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00106\u001a\u00020$J<\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u00140A2\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00106\u001a\u00020$Jf\u0010C\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020 0\u00140D2\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0(2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u0010<\u001a\u00020$2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020\u0017H\u0002J\\\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u0010<\u001a\u00020$2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020\u00172\n\b\u0002\u0010?\u001a\u0004\u0018\u00010\u0005H\u0002J4\u0010H\u001a\b\u0012\u0004\u0012\u0002050\u00142\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020*2\u0006\u00106\u001a\u00020$2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$J6\u0010N\u001a\b\u0012\u0004\u0012\u00020*0\u00142\u0006\u0010O\u001a\u00020P2\u0006\u0010Q\u001a\u00020\u00052\u0006\u0010K\u001a\u00020*2\u0006\u0010L\u001a\u00020$2\u0006\u0010M\u001a\u00020$H\u0002J0\u0010R\u001a\u0004\u0018\u0001052\u0006\u0010\u0018\u001a\u00020\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010S\u001a\u00020*2\b\b\u0002\u00106\u001a\u00020$JP\u0010T\u001a\b\u0012\u0004\u0012\u0002050\u00142\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00106\u001a\u00020$2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010UJ\\\u0010V\u001a\b\u0012\u0004\u0012\u0002050\u00142\u0006\u0010\u0018\u001a\u00020\u00052\n\b\u0001\u0010W\u001a\u0004\u0018\u00010$2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00106\u001a\u00020$2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010XJZ\u0010T\u001a\b\u0012\u0004\u0012\u0002050\u00142\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00106\u001a\u00020$2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020\u00172\b\u0010?\u001a\u0004\u0018\u00010\u0005H\u0082@¢\u0006\u0002\u0010YJ\\\u0010T\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u0014042\u0006\u0010Z\u001a\u00020/2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00106\u001a\u00020$2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010>\u001a\u00020\u0017H\u0086@¢\u0006\u0002\u0010[J\u001e\u0010\\\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010#\u001a\u00020$J\u001c\u0010]\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010^\u001a\b\u0012\u0004\u0012\u00020_0\u0014J/\u0010`\u001a\u0004\u0018\u0001052\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010a\u001a\u00020*2\b\u0010b\u001a\u0004\u0018\u00010$¢\u0006\u0002\u0010cJ/\u0010d\u001a\u0004\u0018\u00010 2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010a\u001a\u00020*2\b\u0010b\u001a\u0004\u0018\u00010$¢\u0006\u0002\u0010eJ2\u0010f\u001a\u0004\u0018\u00010 2\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020 0(2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00052\u0006\u0010a\u001a\u00020*H\u0002J\u001c\u0010h\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00052\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020 0\u0014J4\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00050\u00142\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020*2\u0006\u00101\u001a\u00020*2\u0006\u00106\u001a\u00020$H\u0086@¢\u0006\u0002\u0010jJ\f\u0010k\u001a\b\u0012\u0004\u0012\u00020l0\u0014J\u0010\u0010m\u001a\u0004\u0018\u00010n2\u0006\u0010o\u001a\u00020*J\u001c\u0010m\u001a\b\u0012\u0004\u0012\u00020n0\u00142\u0006\u0010p\u001a\u00020*2\u0006\u0010q\u001a\u00020*J&\u0010r\u001a\b\u0012\u0004\u0012\u00020l0\u00142\u0006\u0010p\u001a\u00020*2\u0006\u0010q\u001a\u00020*2\b\b\u0002\u0010s\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u000e\u0010\u000f¨\u0006t"}, d2 = {"Lcom/xiaomi/fit/fitness/persist/db/utils/DailyRecordDaoUtils;", "", "<init>", "()V", "TAG", "", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "mGson$delegate", "Lkotlin/Lazy;", "serverSyncer", "Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "getServerSyncer", "()Lcom/xiaomi/fit/fitness/export/api/FitnessServerSyncer;", "serverSyncer$delegate", "recordServerDailyDataToDB", "", "dataList", "", "Lcom/xiaomi/fit/fitness/persist/server/data/FitnessDataModel;", "recordDailyRecordToDB", "", "persistKey", "sid", "recordList", "Lcom/xiaomi/fit/fitness/DailyRecordItemModel;", "reprocessModelRecordIfNeed", "model", "insertDailyRecordToDb", "entityList", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "getDailyRecordNotUpload", "localPhoneSid", "limit", "", "getLocalPhoneRecordToUpload", "queryAllItemEntity", "dao", "Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseDao;", "upperTime", "", "desc", "markDailyRecordHasUploaded", "requestFromServer", "dataType", "Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;", "startTime", "endTime", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JLjava/lang/Long;)V", "getAllDailyRecord", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "zoneOffsetInSec", "getTheDailyItems", "keys", "", "(Ljava/lang/String;JJI[Ljava/lang/String;)Ljava/util/Map;", "getTheItemRecord", CloudContract.COL_ZONE_OFFSET, "queryDailyRecord", "reverse", "extraQueryStr", "getAllDailyRecordAsync", "Landroidx/lifecycle/LiveData;", "getDailyRecordAsync", "queryDailyRecordAsync", "Lkotlinx/coroutines/flow/Flow;", "getSQLiteQuery", "Landroidx/sqlite/db/SimpleSQLiteQuery;", "tableName", "getWeightDayRecords", "bodyComp", "Lcom/xiaomi/fit/fitness/export/data/aggregation/record/BodyComposition;", "middleTime", "leftDays", "rightDays", "getWeightDistTime", "weightRecordDao", "Lcom/xiaomi/fit/fitness/persist/db/internal/WeightItemDao;", "colBodyComp", "getRecentOneData", "maxTime", "getLimitedDataRecord", "(Ljava/lang/String;Ljava/lang/String;JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTheEcgRecord", "interpretStatus", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;JJIIZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "homeDataType", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;Ljava/lang/String;JJIIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSoftDeletedDailyData", "softDeleteDailyRecord", "dataKeyList", "Lcom/xiaomi/fit/fitness/FitnessDBKey;", "getTheDailyRecord", "time", "toZoneOffsetInSec", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;)Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;", "getSleepSegmentEntity", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/Integer;)Lcom/xiaomi/fit/fitness/persist/db/internal/DailyRecordBaseEntity;", "getTheOneDailyRecord", "key", "hardDeleteDailyRecord", "getTheRecordSource", "(Lcom/xiaomi/fit/fitness/export/data/annotation/HomeDataType;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCurseRecord", "Lcom/xiaomi/fitness/repo/curse/CurseTimeItem;", "getSymptom", "Lcom/xiaomi/fit/fitness/export/data/item/WomenHealthSymptoms;", "time0TZ", "start0TZ", "end0TZ", "getCurseTimeItemList", "hasDelete", "fitness-data-core_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDailyRecordDaoUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DailyRecordDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/DailyRecordDaoUtils\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,775:1\n216#2,2:776\n216#2,2:778\n1863#3,2:780\n37#4:782\n36#4,3:783\n53#5:786\n55#5:790\n53#5:791\n55#5:795\n50#6:787\n55#6:789\n50#6:792\n55#6:794\n107#7:788\n107#7:793\n*S KotlinDebug\n*F\n+ 1 DailyRecordDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/DailyRecordDaoUtils\n*L\n67#1:776,2\n74#1:778,2\n250#1:780,2\n261#1:782\n261#1:783,3\n345#1:786\n345#1:790\n363#1:791\n363#1:795\n345#1:787\n345#1:789\n363#1:792\n363#1:794\n345#1:788\n363#1:793\n*E\n"})
public final class DailyRecordDaoUtils {

    @NotNull
    private static final String TAG = "DailyRecordDaoUtils";

    @NotNull
    public static final DailyRecordDaoUtils INSTANCE = new DailyRecordDaoUtils();

    /* JADX INFO: renamed from: mGson$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mGson = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: vj5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DailyRecordDaoUtils.mGson_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: serverSyncer$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy serverSyncer = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wj5
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return DailyRecordDaoUtils.serverSyncer_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getAllDailyRecordAsync$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getAllDailyRecordAsync$1", f = "DailyRecordDaoUtils.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LiveDataScope<Map<String, ? extends List<? extends DailyRecordItem>>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<Map<String, List<DailyRecordItem>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                Map mapEmptyMap = MapsKt__MapsKt.emptyMap();
                this.label = 1;
                if (liveDataScope.emit(mapEmptyMap, this) == coroutine_suspended) {
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
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<Map<String, ? extends List<? extends DailyRecordItem>>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<Map<String, List<DailyRecordItem>>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getDailyRecordAsync$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "", "Lcom/xiaomi/fit/fitness/export/data/item/DailyRecordItem;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getDailyRecordAsync$1", f = "DailyRecordDaoUtils.kt", i = {}, l = {SpatialRelationUtil.A_CIRCLE_DEGREE}, m = "invokeSuspend", n = {}, s = {})
    public static final class C16041 extends SuspendLambda implements Function2<LiveDataScope<List<? extends DailyRecordItem>>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public C16041(Continuation<? super C16041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C16041 c16041 = new C16041(continuation);
            c16041.L$0 = obj;
            return c16041;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LiveDataScope<List<DailyRecordItem>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C16041) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                this.label = 1;
                if (liveDataScope.emit(listEmptyList, this) == coroutine_suspended) {
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
        public /* bridge */ /* synthetic */ Object invoke(LiveDataScope<List<? extends DailyRecordItem>> liveDataScope, Continuation<? super Unit> continuation) {
            return invoke2((LiveDataScope<List<DailyRecordItem>>) liveDataScope, continuation);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getLimitedDataRecord$2, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils", f = "DailyRecordDaoUtils.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {537, 547}, m = "getLimitedDataRecord", n = {"this", "persistKey", "sid", "extraQueryStr", "startTime", "endTime", "zoneOffsetInSec", "limit", "reverse", "this", "persistKey", "sid", "extraQueryStr", "dao", "entityList", "startTime", "endTime", "zoneOffsetInSec", "limit", "reverse", "retryStartTime"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "J$1", "I$0", "I$1", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "J$1", "I$0", "I$1", "Z$0", "J$2"})
    public static final class AnonymousClass2 extends ContinuationImpl {
        int I$0;
        int I$1;
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DailyRecordDaoUtils.this.getLimitedDataRecord(null, null, 0L, 0L, 0, 0, false, null, this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getLimitedDataRecord$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils", f = "DailyRecordDaoUtils.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {588}, m = "getLimitedDataRecord", n = {"this", "homeDataType", "sid", "dao", "entityList", "startTime", "endTime", "zoneOffsetInSec", "limit", "reverse", "retryStartTime", "hasNewData"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "J$1", "I$0", "I$1", "Z$0", "J$2", "I$2"})
    public static final class AnonymousClass3 extends ContinuationImpl {
        int I$0;
        int I$1;
        int I$2;
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DailyRecordDaoUtils.this.getLimitedDataRecord((HomeDataType) null, (String) null, 0L, 0L, 0, 0, false, (Continuation<? super Map<String, ? extends List<? extends DailyRecordItem>>>) this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getTheRecordSource$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils", f = "DailyRecordDaoUtils.kt", i = {0}, l = {723}, m = "getTheRecordSource", n = {"dataType"}, s = {"L$0"})
    public static final class C16051 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C16051(Continuation<? super C16051> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DailyRecordDaoUtils.this.getTheRecordSource(null, 0L, 0L, 0, this);
        }
    }

    private DailyRecordDaoUtils() {
    }

    public static /* synthetic */ List getCurseTimeItemList$default(DailyRecordDaoUtils dailyRecordDaoUtils, long j, long j2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return dailyRecordDaoUtils.getCurseTimeItemList(j, j2, z);
    }

    private final Gson getMGson() {
        return (Gson) mGson.getValue();
    }

    public static /* synthetic */ DailyRecordItem getRecentOneData$default(DailyRecordDaoUtils dailyRecordDaoUtils, String str, String str2, long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            j = 0;
        }
        long j2 = j;
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return dailyRecordDaoUtils.getRecentOneData(str, str3, j2, i);
    }

    private final SimpleSQLiteQuery getSQLiteQuery(String tableName, String persistKey, String sid, long startTime, long endTime, int zoneOffset, int limit, boolean reverse, String extraQueryStr) {
        long j = zoneOffset;
        long j2 = startTime + j;
        long j3 = endTime + j;
        StringBuilder sb = new StringBuilder("SELECT * FROM " + tableName + " WHERE");
        if (j2 > 0 && startTime > 0) {
            sb.append(" " + FitnessDBConstants.COL_TIME_0_TZ + " >= " + j2 + " AND");
        }
        if (j3 > 0 && endTime > 0) {
            sb.append(" " + FitnessDBConstants.COL_TIME_0_TZ + " < " + j3 + " AND");
        }
        sb.append(" isDeleted = 0");
        if (!TextUtils.isEmpty(persistKey)) {
            sb.append(" AND key = '" + persistKey + "'");
        }
        if (!TextUtils.isEmpty(sid)) {
            sb.append(" AND sid = '" + sid + "'");
        }
        if (!TextUtils.isEmpty(extraQueryStr)) {
            sb.append(" AND " + extraQueryStr);
        }
        sb.append(" ORDER BY " + FitnessDBConstants.COL_TIME_0_TZ + " " + (reverse ? "DESC" : "ASC"));
        if (limit > 0) {
            sb.append(" LIMIT " + limit);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return new SimpleSQLiteQuery(string);
    }

    public static /* synthetic */ SimpleSQLiteQuery getSQLiteQuery$default(DailyRecordDaoUtils dailyRecordDaoUtils, String str, String str2, String str3, long j, long j2, int i, int i2, boolean z, String str4, int i3, Object obj) {
        return dailyRecordDaoUtils.getSQLiteQuery(str, str2, str3, j, j2, i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? true : z, (i3 & 256) != 0 ? null : str4);
    }

    private final FitnessServerSyncer getServerSyncer() {
        return (FitnessServerSyncer) serverSyncer.getValue();
    }

    private final List<DailyRecordItem> getTheItemRecord(String persistKey, String sid, long startTime, long endTime, int zoneOffset) {
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao != null) {
            try {
                return ItemEntityUtil.INSTANCE.convertEntityToItemListByKey(persistKey, queryDailyRecord$default(this, dailyRecordDao, persistKey, sid, startTime, endTime, zoneOffset, 0, false, null, FileUtils.S_IRWXU, null), Integer.valueOf(zoneOffset));
            } catch (Exception e) {
                FitnessLogUtils.INSTANCE.w(TAG, "getTheItemRecord: queryDailyRecord", e);
                return CollectionsKt__CollectionsKt.emptyList();
            }
        }
        FitnessLogUtils.i(TAG, persistKey + " no support db");
        List<DailyRecordItem> listEmptyList = Collections.emptyList();
        Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
        return listEmptyList;
    }

    private final DailyRecordBaseEntity getTheOneDailyRecord(DailyRecordBaseDao<? extends DailyRecordBaseEntity> dao, String sid, String key, long time) {
        StringBuilder sb = new StringBuilder("SELECT * FROM " + dao.getTableName() + " WHERE ");
        sb.append("time = " + time + " AND ");
        sb.append("sid = '" + sid + "' AND ");
        sb.append("key = '" + key + "'");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        List<T> dailyRecord = dao.getDailyRecord(new SimpleSQLiteQuery(string));
        List<T> list = dailyRecord;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (DailyRecordBaseEntity) dailyRecord.get(0);
    }

    private final List<Long> getWeightDistTime(WeightItemDao weightRecordDao, String colBodyComp, long middleTime, int leftDays, int rightDays) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(Long.valueOf(middleTime));
        if (leftDays > 0) {
            linkedHashSet.addAll(weightRecordDao.getRecordTime(new SimpleSQLiteQuery("SELECT DISTINCT zeroTimeIn0Tz FROM " + weightRecordDao.getTableName() + " WHERE timeIn0Tz < " + middleTime + " AND " + colBodyComp + " IS NOT NULL AND " + colBodyComp + " > 0 AND isDeleted = 0 ORDER BY zeroTimeIn0Tz DESC LIMIT " + leftDays)));
        }
        if (rightDays > 0) {
            linkedHashSet.addAll(weightRecordDao.getRecordTime(new SimpleSQLiteQuery("SELECT DISTINCT zeroTimeIn0Tz FROM " + weightRecordDao.getTableName() + " WHERE timeIn0Tz >= " + middleTime + " AND " + colBodyComp + " IS NOT NULL AND " + colBodyComp + " > 0 AND isDeleted = 0 ORDER BY zeroTimeIn0Tz ASC LIMIT " + rightDays)));
        }
        return CollectionsKt___CollectionsKt.toList(linkedHashSet);
    }

    private final boolean insertDailyRecordToDb(String persistKey, List<? extends DailyRecordBaseEntity> entityList) {
        if (entityList.isEmpty()) {
            FitnessLogUtils.i(TAG, "insertDailyRecordToDb: key = " + persistKey + ", but no record");
            return true;
        }
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao != null) {
            dailyRecordDao.insertAll(entityList);
            return true;
        }
        FitnessLogUtils.w(TAG, persistKey + " not support db");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Gson mGson_delegate$lambda$0() {
        return new Gson();
    }

    public static /* synthetic */ List queryAllItemEntity$default(DailyRecordDaoUtils dailyRecordDaoUtils, DailyRecordBaseDao dailyRecordBaseDao, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        return dailyRecordDaoUtils.queryAllItemEntity(dailyRecordBaseDao, j, i, z);
    }

    private final List<DailyRecordBaseEntity> queryDailyRecord(DailyRecordBaseDao<? extends DailyRecordBaseEntity> dao, String persistKey, String sid, long startTime, long endTime, int zoneOffset, int limit, boolean reverse, String extraQueryStr) {
        return dao.getDailyRecord(getSQLiteQuery(dao.getTableName(), persistKey, sid, startTime, endTime, zoneOffset, limit, reverse, extraQueryStr));
    }

    public static /* synthetic */ List queryDailyRecord$default(DailyRecordDaoUtils dailyRecordDaoUtils, DailyRecordBaseDao dailyRecordBaseDao, String str, String str2, long j, long j2, int i, int i2, boolean z, String str3, int i3, Object obj) {
        return dailyRecordDaoUtils.queryDailyRecord(dailyRecordBaseDao, str, str2, j, j2, i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? true : z, (i3 & 256) != 0 ? null : str3);
    }

    private final Flow<List<DailyRecordBaseEntity>> queryDailyRecordAsync(DailyRecordBaseDao<? extends DailyRecordBaseEntity> dao, String persistKey, String sid, long startTime, long endTime, int zoneOffset, int limit, boolean reverse) {
        return dao.getDailyRecordAsync(getSQLiteQuery$default(this, dao.getTableName(), persistKey, sid, startTime, endTime, zoneOffset, limit, reverse, null, 256, null));
    }

    public static /* synthetic */ Flow queryDailyRecordAsync$default(DailyRecordDaoUtils dailyRecordDaoUtils, DailyRecordBaseDao dailyRecordBaseDao, String str, String str2, long j, long j2, int i, int i2, boolean z, int i3, Object obj) {
        return dailyRecordDaoUtils.queryDailyRecordAsync(dailyRecordBaseDao, str, str2, j, j2, i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? true : z);
    }

    private final DailyRecordItemModel reprocessModelRecordIfNeed(String persistKey, String sid, DailyRecordItemModel model) {
        if (TextUtils.equals(persistKey, "sleep")) {
            DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao("sleep");
            Intrinsics.checkNotNull(dailyRecordDao, "null cannot be cast to non-null type com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao");
            SleepSegmentDao sleepSegmentDao = (SleepSegmentDao) dailyRecordDao;
            for (SleepSegmentEntity sleepSegmentEntity : sleepSegmentDao.getUnCompleteSegments(sid)) {
                if (((SleepSegmentReport) getMGson().fromJson(sleepSegmentEntity.getValue(), SleepSegmentReport.class)).getBedTime() <= model.getTime()) {
                    FitnessLogUtils.i(TAG, "deleteSleepSegment unComplete(" + sleepSegmentEntity.getTime() + ")");
                    sleepSegmentDao.delete(sleepSegmentEntity);
                }
            }
            return model;
        }
        if (!DailyRecordDaoRepo.INSTANCE.hasOneDateRecordOneDay(persistKey)) {
            return model;
        }
        if (model.getZoneOffsetInSec() != 0) {
            long jChangeToDestZeroTimeOneDay = FitnessDateUtils.changeToDestZeroTimeOneDay(model.getTime(), model.getZoneOffsetInSec(), 0);
            model.setTime(jChangeToDestZeroTimeOneDay);
            model.setZoneOffsetInSec(0);
            model.getItem().setTimestamp(jChangeToDestZeroTimeOneDay);
        }
        if (TextUtils.equals(persistKey, FitnessPersistKey.DaytimeSleep) || TextUtils.equals(persistKey, FitnessPersistKey.NightSleep)) {
            DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao2 = DailyRecordDaoRepo.getDailyRecordDao(FitnessPersistKey.NightSleep);
            Intrinsics.checkNotNull(dailyRecordDao2, "null cannot be cast to non-null type com.xiaomi.fit.fitness.persist.db.internal.SleepSegmentDao");
            DailyRecordBaseEntity theOneDailyRecord = getTheOneDailyRecord((SleepSegmentDao) dailyRecordDao2, sid, persistKey, model.getTime());
            if (theOneDailyRecord != null) {
                DayNightSleepReport dayNightSleepReport = (DayNightSleepReport) getMGson().fromJson(theOneDailyRecord.getValue(), DayNightSleepReport.class);
                if (dayNightSleepReport.getWakeUpTime() > model.getTime()) {
                    FitnessLogUtils.i(TAG, "db wakeUpTime(" + dayNightSleepReport.getWakeUpTime() + ") later than " + model.getTime() + ", so abort this");
                    return null;
                }
            }
        }
        return model;
    }

    public static /* synthetic */ void requestFromServer$default(DailyRecordDaoUtils dailyRecordDaoUtils, HomeDataType homeDataType, long j, Long l, int i, Object obj) {
        if ((i & 4) != 0) {
            l = null;
        }
        dailyRecordDaoUtils.requestFromServer(homeDataType, j, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FitnessServerSyncer serverSyncer_delegate$lambda$1() {
        return FitnessDataExtKt.getInstance(FitnessServerSyncer.INSTANCE);
    }

    @NotNull
    public final List<CurseTimeItem> getAllCurseRecord() {
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(FitnessPersistKey.WomenHealthStatus);
        if (dailyRecordDao == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<T> dailyRecord = dailyRecordDao.getDailyRecord(new SimpleSQLiteQuery("select * from " + dailyRecordDao.getTableName() + " where key='menstruation' and isDeleted = 0"));
        Intrinsics.checkNotNull(dailyRecord, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.persist.db.internal.WomenHealthRecordEntity>");
        return CurseUtilKt.toCurseStatus(dailyRecord);
    }

    @NotNull
    public final Map<String, List<DailyRecordItem>> getAllDailyRecord(@NotNull HomeDataType dataType, @Nullable String sid, long startTime, long endTime, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.INSTANCE.getDailyRecordDao(dataType);
        if (dailyRecordDao == null) {
            FitnessLogUtils.i(TAG, dataType + " no support db");
            Map<String, List<DailyRecordItem>> mapEmptyMap = Collections.emptyMap();
            Intrinsics.checkNotNullExpressionValue(mapEmptyMap, "emptyMap(...)");
            return mapEmptyMap;
        }
        FitnessLogUtils.i(TAG, "getDailyRecord dataType = " + dataType + ", sid = " + sid + ", startTime = " + startTime + ", endTime = " + endTime);
        List<? extends DailyRecordBaseEntity> listQueryDailyRecord$default = queryDailyRecord$default(this, dailyRecordDao, null, sid, startTime, endTime, zoneOffsetInSec, 0, false, null, FileUtils.S_IRWXU, null);
        int size = listQueryDailyRecord$default.size();
        StringBuilder sb = new StringBuilder();
        sb.append("getDailyRecord dataType = ");
        sb.append(dataType);
        sb.append(", size = ");
        sb.append(size);
        FitnessLogUtils.i(TAG, sb.toString());
        Map<String, List<DailyRecordItem>> mutableMap = MapsKt__MapsKt.toMutableMap(ItemEntityUtil.INSTANCE.convertEntityToItemMap(listQueryDailyRecord$default, Integer.valueOf(zoneOffsetInSec)));
        if (dataType == HomeDataType.HR) {
            mutableMap.put(FitnessPersistKey.RestHr, getTheItemRecord(FitnessPersistKey.RestHr, sid, startTime, endTime, zoneOffsetInSec));
        }
        return mutableMap;
    }

    @NotNull
    public final LiveData<Map<String, List<DailyRecordItem>>> getAllDailyRecordAsync(@NotNull final HomeDataType dataType, @Nullable String sid, final long startTime, final long endTime, final int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.INSTANCE.getDailyRecordDao(dataType);
        if (dailyRecordDao != null) {
            final Flow flowQueryDailyRecordAsync$default = queryDailyRecordAsync$default(this, dailyRecordDao, null, sid, startTime, endTime, zoneOffsetInSec, 0, false, 192, null);
            return FlowLiveDataConversions.asLiveData$default(new Flow<Map<String, ? extends List<? extends DailyRecordItem>>>() { // from class: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getAllDailyRecordAsync$$inlined$map$1

                /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getAllDailyRecordAsync$$inlined$map$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DailyRecordDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/DailyRecordDaoUtils\n*L\n1#1,222:1\n54#2:223\n347#3,2:224\n346#3,5:226\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ HomeDataType $dataType$inlined;
                    final /* synthetic */ long $endTime$inlined;
                    final /* synthetic */ long $startTime$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ int $zoneOffsetInSec$inlined;

                    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getAllDailyRecordAsync$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getAllDailyRecordAsync$$inlined$map$1$2", f = "DailyRecordDaoUtils.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, HomeDataType homeDataType, long j, long j2, int i) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$dataType$inlined = homeDataType;
                        this.$startTime$inlined = j;
                        this.$endTime$inlined = j2;
                        this.$zoneOffsetInSec$inlined = i;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
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
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            List<? extends DailyRecordBaseEntity> list = (List) obj;
                            FitnessLogUtils.i("DailyRecordDaoUtils", "getAllDailyRecordAsync: dataType = " + this.$dataType$inlined + ", startTime = " + this.$startTime$inlined + ", endTime = " + this.$endTime$inlined + ", size=" + list.size());
                            Map<String, List<DailyRecordItem>> mapConvertEntityToItemMap = ItemEntityUtil.INSTANCE.convertEntityToItemMap(list, Boxing.boxInt(this.$zoneOffsetInSec$inlined));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(mapConvertEntityToItemMap, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector<? super Map<String, ? extends List<? extends DailyRecordItem>>> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flowQueryDailyRecordAsync$default.collect(new AnonymousClass2(flowCollector, dataType, startTime, endTime, zoneOffsetInSec), continuation);
                    return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, Dispatchers.getIO(), 0L, 2, (Object) null);
        }
        FitnessLogUtils.i(TAG, dataType + " no support db");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new AnonymousClass1(null), 3, (Object) null);
    }

    @NotNull
    public final List<CurseTimeItem> getCurseTimeItemList(long start0TZ, long end0TZ, boolean hasDelete) {
        String str;
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(FitnessPersistKey.WomenHealthStatus);
        if (dailyRecordDao == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        if (hasDelete) {
            str = "select * from " + dailyRecordDao.getTableName() + " where key='menstruation' and time>=" + start0TZ + "  and time <= " + end0TZ + " order by time ";
        } else {
            str = "select * from " + dailyRecordDao.getTableName() + " where key='menstruation' and time>=" + start0TZ + "  and time <= " + end0TZ + " and isDeleted = 0 order by time";
        }
        List<T> dailyRecord = dailyRecordDao.getDailyRecord(new SimpleSQLiteQuery(str));
        Intrinsics.checkNotNull(dailyRecord, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.persist.db.internal.WomenHealthRecordEntity>");
        return CurseUtilKt.toCurseStatus(dailyRecord);
    }

    @NotNull
    public final LiveData<List<DailyRecordItem>> getDailyRecordAsync(@NotNull final String persistKey, @Nullable String sid, final long startTime, final long endTime, final int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao != null) {
            final Flow flowQueryDailyRecordAsync$default = queryDailyRecordAsync$default(this, dailyRecordDao, persistKey, sid, startTime, endTime, zoneOffsetInSec, 0, false, 192, null);
            return FlowLiveDataConversions.asLiveData$default(new Flow<List<? extends DailyRecordItem>>() { // from class: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getDailyRecordAsync$$inlined$map$1

                /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getDailyRecordAsync$$inlined$map$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 DailyRecordDaoUtils.kt\ncom/xiaomi/fit/fitness/persist/db/utils/DailyRecordDaoUtils\n*L\n1#1,222:1\n54#2:223\n365#3,2:224\n364#3,5:226\n*E\n"})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ long $endTime$inlined;
                    final /* synthetic */ String $persistKey$inlined;
                    final /* synthetic */ long $startTime$inlined;
                    final /* synthetic */ FlowCollector $this_unsafeFlow;
                    final /* synthetic */ int $zoneOffsetInSec$inlined;

                    /* JADX INFO: renamed from: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getDailyRecordAsync$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    @DebugMetadata(c = "com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils$getDailyRecordAsync$$inlined$map$1$2", f = "DailyRecordDaoUtils.kt", i = {}, l = {SportReportBaseParser.ReportType.targetValueNumber}, m = "emit", n = {}, s = {})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(FlowCollector flowCollector, String str, long j, long j2, int i) {
                        this.$this_unsafeFlow = flowCollector;
                        this.$persistKey$inlined = str;
                        this.$startTime$inlined = j;
                        this.$endTime$inlined = j2;
                        this.$zoneOffsetInSec$inlined = i;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object obj, @NotNull Continuation continuation) {
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
                        Object obj2 = anonymousClass1.result;
                        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj2);
                            FlowCollector flowCollector = this.$this_unsafeFlow;
                            List<? extends DailyRecordBaseEntity> list = (List) obj;
                            FitnessLogUtils.i("DailyRecordDaoUtils", "getDailyRecordAsync: key=" + this.$persistKey$inlined + ", startTime = " + this.$startTime$inlined + ", endTime = " + this.$endTime$inlined + ", size=" + list.size());
                            List<DailyRecordItem> listConvertEntityToItemListByKey = ItemEntityUtil.INSTANCE.convertEntityToItemListByKey(this.$persistKey$inlined, list, Boxing.boxInt(this.$zoneOffsetInSec$inlined));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(listConvertEntityToItemListByKey, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj2);
                        }
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector<? super List<? extends DailyRecordItem>> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flowQueryDailyRecordAsync$default.collect(new AnonymousClass2(flowCollector, persistKey, startTime, endTime, zoneOffsetInSec), continuation);
                    return objCollect == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, Dispatchers.getIO(), 0L, 2, (Object) null);
        }
        FitnessLogUtils.i(TAG, persistKey + " no support db");
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C16041(null), 3, (Object) null);
    }

    @Nullable
    public final List<DailyRecordBaseEntity> getDailyRecordNotUpload(@NotNull String persistKey, @NotNull String localPhoneSid, int limit) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(localPhoneSid, "localPhoneSid");
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao == null) {
            FitnessLogUtils.i(TAG, persistKey + " no support db");
            return null;
        }
        StringBuilder sb = new StringBuilder("SELECT * FROM " + dailyRecordDao.getTableName() + " WHERE ");
        sb.append("isUpload = 0 AND ");
        sb.append("sid != '" + localPhoneSid + "'");
        sb.append(" AND time > 0");
        if (Intrinsics.areEqual(dailyRecordDao, DailyRecordDaoRepo.getDailyRecordDao("sleep"))) {
            sb.append(" AND isComplete = 1");
        }
        if (limit > 0) {
            sb.append(" LIMIT " + limit);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return dailyRecordDao.getDailyRecord(new SimpleSQLiteQuery(string));
    }

    @Nullable
    public final Object getLimitedDataRecord(@NotNull String str, @Nullable String str2, long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<? extends DailyRecordItem>> continuation) {
        return getLimitedDataRecord(str, str2, j, j2, i, i2, z, null, continuation);
    }

    @Nullable
    public final List<DailyRecordBaseEntity> getLocalPhoneRecordToUpload(@NotNull String persistKey, @NotNull String localPhoneSid, int limit) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(localPhoneSid, "localPhoneSid");
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao == null) {
            FitnessLogUtils.i(TAG, persistKey + " no support db");
            return null;
        }
        StringBuilder sb = new StringBuilder("SELECT * FROM " + dailyRecordDao.getTableName() + " WHERE ");
        sb.append("isUpload = 0 AND ");
        sb.append("sid = '" + localPhoneSid + "'");
        sb.append("sid = '" + DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getLocalPhoneSid() + "'");
        sb.append(" AND time > 0");
        if (Intrinsics.areEqual(dailyRecordDao, DailyRecordDaoRepo.getDailyRecordDao("sleep"))) {
            sb.append(" AND isComplete = 1");
        }
        if (limit > 0) {
            sb.append(" LIMIT " + limit);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return dailyRecordDao.getDailyRecord(new SimpleSQLiteQuery(string));
    }

    @Nullable
    public final DailyRecordItem getRecentOneData(@NotNull String persistKey, @Nullable String sid, long maxTime, int zoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        try {
            DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
            if (dailyRecordDao == null) {
                return null;
            }
            List<? extends DailyRecordBaseEntity> listQueryDailyRecord$default = queryDailyRecord$default(this, dailyRecordDao, persistKey, sid, 0L, maxTime, zoneOffsetInSec, 1, true, null, 256, null);
            List<? extends DailyRecordBaseEntity> list = listQueryDailyRecord$default;
            if (list != null && !list.isEmpty()) {
                List<DailyRecordItem> listConvertEntityToItemListByKey = ItemEntityUtil.INSTANCE.convertEntityToItemListByKey(persistKey, listQueryDailyRecord$default, Integer.valueOf(zoneOffsetInSec));
                List<DailyRecordItem> list2 = listConvertEntityToItemListByKey;
                if (list2 != null && !list2.isEmpty()) {
                    return listConvertEntityToItemListByKey.get(0);
                }
                return null;
            }
            FitnessLogUtils.i(TAG, persistKey + ", no data");
            return null;
        } catch (Exception e) {
            FitnessLogUtils.INSTANCE.w(TAG, "getTheItemRecord: queryDailyRecord", e);
            return null;
        }
    }

    @Nullable
    public final DailyRecordBaseEntity getSleepSegmentEntity(@NotNull String persistKey, @NotNull String sid, long time, @Nullable Integer toZoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(sid, "sid");
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao == null) {
            FitnessLogUtils.w(TAG, persistKey + " no support db");
            return null;
        }
        StringBuilder sb = new StringBuilder("SELECT * FROM " + dailyRecordDao.getTableName() + " WHERE ");
        sb.append("time = " + time + " AND ");
        sb.append("sid = '" + sid + "'");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        List<T> dailyRecord = dailyRecordDao.getDailyRecord(new SimpleSQLiteQuery(string));
        Logger.i("getSleepSegmentEntity", "getSleepSegmentEntity  list size is " + dailyRecord.size());
        if (dailyRecord.isEmpty()) {
            return null;
        }
        return (DailyRecordBaseEntity) dailyRecord.get(0);
    }

    @Nullable
    public final List<DailyRecordBaseEntity> getSoftDeletedDailyData(@NotNull String persistKey, int limit) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao == null) {
            FitnessLogUtils.i(TAG, "not support delete persistKey = " + persistKey);
            return null;
        }
        StringBuilder sb = new StringBuilder("SELECT * FROM " + dailyRecordDao.getTableName() + " WHERE ");
        sb.append("isDeleted = 1");
        if (limit > 0) {
            sb.append(" LIMIT " + limit);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return dailyRecordDao.getDailyRecord(new SimpleSQLiteQuery(string));
    }

    @Nullable
    public final WomenHealthSymptoms getSymptom(long time0TZ) {
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(FitnessPersistKey.WomenHealthSymptoms);
        if (dailyRecordDao == null) {
            return null;
        }
        List<T> dailyRecord = dailyRecordDao.getDailyRecord(new SimpleSQLiteQuery("select * from " + dailyRecordDao.getTableName() + " where key='menstrual_symptoms' and time=" + time0TZ + " and isDeleted = 0"));
        Intrinsics.checkNotNull(dailyRecord, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.persist.db.internal.WomenHealthRecordEntity>");
        return (WomenHealthSymptoms) CollectionsKt___CollectionsKt.firstOrNull((List) CurseUtilKt.toCurseSymptom(dailyRecord));
    }

    @NotNull
    public final Map<String, List<DailyRecordItem>> getTheDailyItems(@Nullable String sid, long startTime, long endTime, int zoneOffsetInSec, @NotNull String... keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : keys) {
            linkedHashMap.put(str, getTheItemRecord(str, sid, startTime, endTime, zoneOffsetInSec));
        }
        return linkedHashMap;
    }

    @Nullable
    public final DailyRecordItem getTheDailyRecord(@NotNull String persistKey, @NotNull String sid, long time, @Nullable Integer toZoneOffsetInSec) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(sid, "sid");
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao != null) {
            DailyRecordBaseEntity theOneDailyRecord = getTheOneDailyRecord(dailyRecordDao, sid, persistKey, time);
            if (theOneDailyRecord == null) {
                return null;
            }
            return ItemEntityUtil.INSTANCE.convertEntityToItem(theOneDailyRecord, toZoneOffsetInSec);
        }
        FitnessLogUtils.w(TAG, persistKey + " no support db");
        return null;
    }

    @Nullable
    public final Object getTheEcgRecord(@NotNull String str, @EcgInterpretStatus @Nullable Integer num, @Nullable String str2, long j, long j2, int i, int i2, boolean z, @NotNull Continuation<? super List<? extends DailyRecordItem>> continuation) {
        String str3;
        if (num == null) {
            str3 = null;
        } else {
            str3 = "analyzedStatus = " + num;
        }
        return getLimitedDataRecord(str, str2, j, j2, i, i2, z, str3, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    @Nullable
    public final Object getTheRecordSource(@NotNull HomeDataType homeDataType, long j, long j2, int i, @NotNull Continuation<? super List<String>> continuation) {
        C16051 c16051;
        HomeDataType homeDataType2 = homeDataType;
        if (continuation instanceof C16051) {
            c16051 = (C16051) continuation;
            int i2 = c16051.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16051.label = i2 - Integer.MIN_VALUE;
            } else {
                c16051 = new C16051(continuation);
            }
        } else {
            c16051 = new C16051(continuation);
        }
        Object recordSource = c16051.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c16051.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(recordSource);
            FitnessLogUtils.i(TAG, "getTheRecordSource(" + homeDataType2 + ")-[" + j + ", " + j2 + "], " + i);
            DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.INSTANCE.getDailyRecordDao(homeDataType2);
            if (dailyRecordDao == null) {
                return CollectionsKt__CollectionsKt.emptyList();
            }
            long j3 = i;
            long j4 = j + j3;
            long j5 = j3 + j2;
            StringBuilder sb = new StringBuilder("SELECT DISTINCT sid FROM " + dailyRecordDao.getTableName() + " WHERE ");
            if (j4 > 0 && j > 0) {
                sb.append(FitnessDBConstants.COL_TIME_0_TZ + " >= " + j4 + " AND ");
            }
            if (j5 > 0 && j2 > 0) {
                sb.append(FitnessDBConstants.COL_TIME_0_TZ + " < " + j5 + " AND ");
            }
            sb.append("isDeleted = 0");
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            SimpleSQLiteQuery simpleSQLiteQuery = new SimpleSQLiteQuery(string);
            c16051.L$0 = homeDataType2;
            c16051.label = 1;
            recordSource = dailyRecordDao.getRecordSource(simpleSQLiteQuery, c16051);
            if (recordSource == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            homeDataType2 = (HomeDataType) c16051.L$0;
            ResultKt.throwOnFailure(recordSource);
        }
        List list = (List) recordSource;
        FitnessLogUtils.i(TAG, "getTheRecordSource(" + homeDataType2 + ")- result(" + list.size() + ")");
        return list;
    }

    @NotNull
    public final List<DailyRecordItem> getWeightDayRecords(@NotNull BodyComposition bodyComp, long middleTime, int zoneOffsetInSec, int leftDays, int rightDays) {
        Intrinsics.checkNotNullParameter(bodyComp, "bodyComp");
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao("weight");
        Intrinsics.checkNotNull(dailyRecordDao, "null cannot be cast to non-null type com.xiaomi.fit.fitness.persist.db.internal.WeightItemDao");
        WeightItemDao weightItemDao = (WeightItemDao) dailyRecordDao;
        String weightColumnInfo = weightItemDao.getWeightColumnInfo(bodyComp);
        List<Long> weightDistTime = getWeightDistTime(weightItemDao, weightColumnInfo, middleTime, leftDays, rightDays);
        FitnessLogUtils.i(TAG, "getRecordTime: leftDays = " + leftDays + ", rightDays = " + rightDays + ", resultDaySize = " + weightDistTime.size());
        if (weightDistTime.isEmpty()) {
            List<DailyRecordItem> listEmptyList = Collections.emptyList();
            Intrinsics.checkNotNullExpressionValue(listEmptyList, "emptyList(...)");
            return listEmptyList;
        }
        List<Long> list = weightDistTime;
        Long l = (Long) CollectionsKt___CollectionsKt.maxOrNull((Iterable) list);
        Long l2 = (Long) CollectionsKt___CollectionsKt.minOrNull((Iterable) list);
        Intrinsics.checkNotNull(l2);
        long jLongValue = l2.longValue();
        Intrinsics.checkNotNull(l);
        long jLongValue2 = l.longValue() + TimeUnit.DAYS.toSeconds(1L);
        return ItemEntityUtil.INSTANCE.convertEntityToItemListByKey("weight", weightItemDao.getDailyRecord(new SimpleSQLiteQuery("SELECT * FROM " + weightItemDao.getTableName() + " WHERE timeIn0Tz >= " + jLongValue + " AND timeIn0Tz < " + jLongValue2 + " AND " + weightColumnInfo + " IS NOT NULL AND " + weightColumnInfo + " > 0 AND isDeleted = 0 ORDER BY timeIn0Tz DESC")), Integer.valueOf(zoneOffsetInSec));
    }

    public final void hardDeleteDailyRecord(@NotNull String persistKey, @NotNull List<? extends DailyRecordBaseEntity> recordList) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        if (recordList.isEmpty()) {
            FitnessLogUtils.i(TAG, "hardDeleteDailyRecord: no record");
            return;
        }
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao != null) {
            dailyRecordDao.deleteAll(recordList);
            return;
        }
        FitnessLogUtils.i(TAG, "hardDeleteDailyRecord: " + persistKey + " no support db");
    }

    public final void markDailyRecordHasUploaded(@NotNull String persistKey, @NotNull List<? extends DailyRecordBaseEntity> recordList) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        if (recordList.isEmpty()) {
            FitnessLogUtils.i(TAG, "markDailyRecordHasUploaded: no record");
            return;
        }
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao != null) {
            Iterator<T> it = recordList.iterator();
            while (it.hasNext()) {
                ((DailyRecordBaseEntity) it.next()).setUpload(true);
            }
            dailyRecordDao.updateAll(recordList);
            return;
        }
        FitnessLogUtils.i(TAG, "markDailyRecordHasUploaded: " + persistKey + " no support db ");
    }

    @NotNull
    public final List<DailyRecordBaseEntity> queryAllItemEntity(@NotNull DailyRecordBaseDao<? extends DailyRecordBaseEntity> dao, long upperTime, int limit, boolean desc) {
        Intrinsics.checkNotNullParameter(dao, "dao");
        StringBuilder sb = new StringBuilder("SELECT * FROM " + dao.getTableName() + " WHERE ");
        sb.append(FitnessDBConstants.COL_TIME_0_TZ + " < " + upperTime + " ");
        sb.append("order by " + FitnessDBConstants.COL_TIME_0_TZ + " " + (desc ? "desc" : "asc") + " ");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit ");
        sb2.append(limit);
        sb2.append(" ");
        sb.append(sb2.toString());
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return dao.getDailyRecord(new SimpleSQLiteQuery(string));
    }

    public final boolean recordDailyRecordToDB(@NotNull String persistKey, @NotNull String sid, @NotNull List<DailyRecordItemModel> recordList) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        String message;
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(sid, "sid");
        Intrinsics.checkNotNullParameter(recordList, "recordList");
        Class<? extends DailyRecordBaseEntity> recordEntityClass = DailyRecordDaoRepo.INSTANCE.getRecordEntityClass(persistKey);
        boolean zInsertDailyRecordToDb = false;
        if (recordEntityClass == null) {
            FitnessLogUtils.w(TAG, "no record entity class " + persistKey);
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<DailyRecordItemModel> it = recordList.iterator();
        while (it.hasNext()) {
            DailyRecordItemModel dailyRecordItemModelReprocessModelRecordIfNeed = reprocessModelRecordIfNeed(persistKey, sid, it.next());
            if (dailyRecordItemModelReprocessModelRecordIfNeed != null) {
                DailyRecordBaseEntity dailyRecordBaseEntityNewInstance = recordEntityClass.getConstructor(String.class, String.class, Long.TYPE).newInstance(persistKey, sid, Long.valueOf(dailyRecordItemModelReprocessModelRecordIfNeed.getTime()));
                dailyRecordBaseEntityNewInstance.setFromLocalRecord(dailyRecordItemModelReprocessModelRecordIfNeed);
                Intrinsics.checkNotNull(dailyRecordBaseEntityNewInstance);
                arrayList.add(dailyRecordBaseEntityNewInstance);
            }
        }
        try {
            zInsertDailyRecordToDb = insertDailyRecordToDb(persistKey, arrayList);
        } catch (SQLiteException e) {
            if (Build.VERSION.SDK_INT != 30 || (message = e.getMessage()) == null || !StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "exists", false, 2, (Object) null)) {
                throw e;
            }
            Logger.i(TAG, "insertAll SQLiteException " + e);
        }
        FitnessLogUtils.i(TAG, "recordDailyRecordToDB: persistKey=" + persistKey + ", sid=" + sid + ", recordSize=" + arrayList.size());
        return zInsertDailyRecordToDb;
    }

    public final void recordServerDailyDataToDB(@NotNull List<FitnessDataModel> dataList) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (FitnessDataModel fitnessDataModel : dataList) {
            Class<? extends DailyRecordBaseEntity> recordEntityClass = DailyRecordDaoRepo.INSTANCE.getRecordEntityClass(fitnessDataModel.getKey());
            if (recordEntityClass == null) {
                FitnessLogUtils.w(TAG, "no record entity class " + fitnessDataModel.getKey());
            } else {
                DailyRecordBaseEntity dailyRecordBaseEntityNewInstance = recordEntityClass.getConstructor(String.class, String.class, Long.TYPE).newInstance(fitnessDataModel.getKey(), fitnessDataModel.getSid(), Long.valueOf(fitnessDataModel.getTime()));
                if (fitnessDataModel.getIsDeleted() != null) {
                    Boolean isDeleted = fitnessDataModel.getIsDeleted();
                    Intrinsics.checkNotNull(isDeleted);
                    if (isDeleted.booleanValue()) {
                        List mapValueList = FitnessPersistUtils.INSTANCE.getMapValueList(linkedHashMap2, fitnessDataModel.getKey());
                        Intrinsics.checkNotNull(dailyRecordBaseEntityNewInstance);
                        mapValueList.add(dailyRecordBaseEntityNewInstance);
                    }
                }
                dailyRecordBaseEntityNewInstance.setFromServerRecord(fitnessDataModel);
                List mapValueList2 = FitnessPersistUtils.INSTANCE.getMapValueList(linkedHashMap, fitnessDataModel.getKey());
                Intrinsics.checkNotNull(dailyRecordBaseEntityNewInstance);
                mapValueList2.add(dailyRecordBaseEntityNewInstance);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            FitnessLogUtils.i(TAG, "recordServerDataToDB: persistKey = " + entry.getKey() + ", size = " + ((List) entry.getValue()).size());
            INSTANCE.insertDailyRecordToDb((String) entry.getKey(), (List) entry.getValue());
        }
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            FitnessLogUtils.i(TAG, "recordServerDataToDB: delete persistKey = " + entry2.getKey() + ", size = " + ((List) entry2.getValue()).size());
            INSTANCE.hardDeleteDailyRecord((String) entry2.getKey(), (List) entry2.getValue());
        }
    }

    public final void requestFromServer(@NotNull HomeDataType dataType, long startTime, @Nullable Long endTime) {
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        long jLongValue = endTime != null ? endTime.longValue() : TimeUnit.DAYS.toSeconds(7L) + startTime;
        List<String> supportKeysByHomeType = DailyRecordDaoRepo.INSTANCE.getSupportKeysByHomeType(dataType);
        FitnessServerSyncer serverSyncer2 = getServerSyncer();
        String[] strArr = (String[]) supportKeysByHomeType.toArray(new String[0]);
        serverSyncer2.pullServerFitnessData(startTime, jLongValue, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final boolean softDeleteDailyRecord(@NotNull String persistKey, @NotNull List<FitnessDBKey> dataKeyList) {
        Intrinsics.checkNotNullParameter(persistKey, "persistKey");
        Intrinsics.checkNotNullParameter(dataKeyList, "dataKeyList");
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(persistKey);
        if (dailyRecordDao == null) {
            FitnessLogUtils.w(TAG, persistKey + " no support db");
            return false;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (FitnessDBKey fitnessDBKey : dataKeyList) {
            DailyRecordBaseEntity theOneDailyRecord = getTheOneDailyRecord(dailyRecordDao, fitnessDBKey.getSid(), persistKey, fitnessDBKey.getTime());
            if (theOneDailyRecord != null) {
                if (theOneDailyRecord.getIsUpload()) {
                    theOneDailyRecord.setDeleted(true);
                    arrayList.add(theOneDailyRecord);
                } else {
                    arrayList2.add(theOneDailyRecord);
                }
            }
        }
        dailyRecordDao.updateAll(arrayList);
        hardDeleteDailyRecord(persistKey, arrayList2);
        FitnessLogUtils.i(TAG, "softDeleteDailyRecord(" + persistKey + "): update(" + arrayList.size() + "), delete(" + arrayList2.size() + ")");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:42:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:43:0x020c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    public final Object getLimitedDataRecord(String str, String str2, long j, long j2, int i, int i2, boolean z, String str3, Continuation<? super List<? extends DailyRecordItem>> continuation) {
        AnonymousClass2 anonymousClass2;
        DailyRecordDaoUtils dailyRecordDaoUtils;
        String str4;
        String str5;
        long j3;
        int i3;
        long j4;
        int i4;
        String str6;
        boolean z2;
        int i5;
        boolean z3;
        long time;
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordBaseDao;
        long j5;
        String str7;
        DailyRecordDaoUtils dailyRecordDaoUtils2;
        int i6;
        String str8;
        long j6;
        String str9;
        boolean z4;
        long j7;
        List<DailyRecordBaseEntity> listQueryDailyRecord;
        boolean zBooleanValue;
        List<DailyRecordBaseEntity> list;
        if (continuation instanceof AnonymousClass2) {
            anonymousClass2 = (AnonymousClass2) continuation;
            int i7 = anonymousClass2.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                anonymousClass2.label = i7 - Integer.MIN_VALUE;
            } else {
                anonymousClass2 = new AnonymousClass2(continuation);
            }
        } else {
            anonymousClass2 = new AnonymousClass2(continuation);
        }
        AnonymousClass2 anonymousClass3 = anonymousClass2;
        Object obj = anonymousClass3.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = anonymousClass3.label;
        String str10 = "persistKey = ";
        String str11 = TAG;
        if (i8 != 0) {
            if (i8 == 1) {
                boolean z5 = anonymousClass3.Z$0;
                int i9 = anonymousClass3.I$1;
                int i10 = anonymousClass3.I$0;
                long j8 = anonymousClass3.J$1;
                long j9 = anonymousClass3.J$0;
                String str12 = (String) anonymousClass3.L$3;
                str6 = (String) anonymousClass3.L$2;
                String str13 = (String) anonymousClass3.L$1;
                DailyRecordDaoUtils dailyRecordDaoUtils3 = (DailyRecordDaoUtils) anonymousClass3.L$0;
                ResultKt.throwOnFailure(obj);
                str5 = str13;
                j3 = j8;
                str4 = str12;
                z2 = z5;
                i3 = i10;
                j4 = j9;
                dailyRecordDaoUtils = dailyRecordDaoUtils3;
                i4 = i9;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j10 = anonymousClass3.J$2;
                boolean z6 = anonymousClass3.Z$0;
                int i11 = anonymousClass3.I$1;
                int i12 = anonymousClass3.I$0;
                long j11 = anonymousClass3.J$1;
                long j12 = anonymousClass3.J$0;
                List<DailyRecordBaseEntity> list2 = (List) anonymousClass3.L$5;
                DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordBaseDao2 = (DailyRecordBaseDao) anonymousClass3.L$4;
                String str14 = (String) anonymousClass3.L$3;
                String str15 = (String) anonymousClass3.L$2;
                String str16 = (String) anonymousClass3.L$1;
                dailyRecordDaoUtils2 = (DailyRecordDaoUtils) anonymousClass3.L$0;
                ResultKt.throwOnFailure(obj);
                str8 = str14;
                str9 = str16;
                i5 = i11;
                str11 = TAG;
                str10 = "persistKey = ";
                dailyRecordBaseDao = dailyRecordBaseDao2;
                str7 = str15;
                i6 = i12;
                j7 = j10;
                z4 = z6;
                listQueryDailyRecord = list2;
                j5 = j12;
                j6 = j11;
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            String str17 = str11;
            FitnessLogUtils.i(str17, str10 + str9 + ", hasNewData = " + zBooleanValue + ", retryStartTime = " + j7);
            if (zBooleanValue) {
                listQueryDailyRecord = dailyRecordDaoUtils2.queryDailyRecord(dailyRecordBaseDao, str9, str7, j5, j6, i6, i5, z4, str8);
            }
            list = listQueryDailyRecord;
            if (list == null && !list.isEmpty()) {
                return ItemEntityUtil.INSTANCE.convertEntityToItemListByKey(str9, listQueryDailyRecord, Boxing.boxInt(i6));
            }
            FitnessLogUtils.i(str17, str9 + ", no data");
            return CollectionsKt__CollectionsKt.emptyList();
        }
        ResultKt.throwOnFailure(obj);
        FitnessLogUtils.i(TAG, "persistKey = " + str + ", startTime = " + j + ", endTime = " + j2 + ", limit = " + i2);
        FitnessServerHistorySync companion = FitnessServerHistorySync.INSTANCE.getInstance();
        anonymousClass3.L$0 = this;
        anonymousClass3.L$1 = str;
        anonymousClass3.L$2 = str2;
        anonymousClass3.L$3 = str3;
        anonymousClass3.J$0 = j;
        anonymousClass3.J$1 = j2;
        anonymousClass3.I$0 = i;
        anonymousClass3.I$1 = i2;
        anonymousClass3.Z$0 = z;
        anonymousClass3.label = 1;
        if (companion.pullPagingFullFitnessData(str, j, j2, anonymousClass3) == coroutine_suspended) {
            return coroutine_suspended;
        }
        dailyRecordDaoUtils = this;
        str4 = str3;
        str5 = str;
        j3 = j2;
        i3 = i;
        j4 = j;
        i4 = i2;
        str6 = str2;
        z2 = z;
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(str5);
        if (dailyRecordDao == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        DailyRecordDaoUtils dailyRecordDaoUtils4 = dailyRecordDaoUtils;
        String str18 = str4;
        long j13 = j3;
        int i13 = i3;
        boolean z7 = z2;
        i5 = i4;
        long j14 = j4;
        String str19 = str6;
        List<DailyRecordBaseEntity> listQueryDailyRecord2 = dailyRecordDaoUtils.queryDailyRecord(dailyRecordDao, str5, str6, j4, j13, i13, i5, z7, str18);
        List<DailyRecordBaseEntity> list3 = listQueryDailyRecord2;
        if (list3 == null || list3.isEmpty()) {
            z3 = z7;
            time = j14;
        } else {
            z3 = z7;
            time = ((DailyRecordBaseEntity) (z3 ? CollectionsKt___CollectionsKt.last((List) listQueryDailyRecord2) : CollectionsKt___CollectionsKt.first((List) listQueryDailyRecord2))).getTime();
        }
        FitnessServerHistorySync companion2 = FitnessServerHistorySync.INSTANCE.getInstance();
        anonymousClass3.L$0 = dailyRecordDaoUtils4;
        anonymousClass3.L$1 = str5;
        anonymousClass3.L$2 = str19;
        anonymousClass3.L$3 = str18;
        dailyRecordBaseDao = dailyRecordDao;
        anonymousClass3.L$4 = dailyRecordBaseDao;
        anonymousClass3.L$5 = listQueryDailyRecord2;
        j5 = j14;
        anonymousClass3.J$0 = j5;
        anonymousClass3.J$1 = j13;
        anonymousClass3.I$0 = i13;
        anonymousClass3.I$1 = i5;
        anonymousClass3.Z$0 = z3;
        anonymousClass3.J$2 = time;
        anonymousClass3.label = 2;
        Object objPullPagingFullFitnessData = companion2.pullPagingFullFitnessData(str5, time, j13, anonymousClass3);
        if (objPullPagingFullFitnessData == coroutine_suspended) {
            return coroutine_suspended;
        }
        str7 = str19;
        dailyRecordDaoUtils2 = dailyRecordDaoUtils4;
        i6 = i13;
        str8 = str18;
        j6 = j13;
        String str20 = str5;
        obj = objPullPagingFullFitnessData;
        str9 = str20;
        z4 = z3;
        j7 = time;
        listQueryDailyRecord = listQueryDailyRecord2;
        zBooleanValue = ((Boolean) obj).booleanValue();
        String str110 = str11;
        FitnessLogUtils.i(str110, str10 + str9 + ", hasNewData = " + zBooleanValue + ", retryStartTime = " + j7);
        if (zBooleanValue) {
            listQueryDailyRecord = dailyRecordDaoUtils2.queryDailyRecord(dailyRecordBaseDao, str9, str7, j5, j6, i6, i5, z4, str8);
        }
        list = listQueryDailyRecord;
        if (list == null) {
        }
        FitnessLogUtils.i(str110, str9 + ", no data");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final List<WomenHealthSymptoms> getSymptom(long start0TZ, long end0TZ) {
        DailyRecordBaseDao<? extends DailyRecordBaseEntity> dailyRecordDao = DailyRecordDaoRepo.getDailyRecordDao(FitnessPersistKey.WomenHealthSymptoms);
        if (dailyRecordDao == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List<T> dailyRecord = dailyRecordDao.getDailyRecord(new SimpleSQLiteQuery("select * from " + dailyRecordDao.getTableName() + " where key='menstrual_symptoms' and time>=" + start0TZ + " and time<=" + end0TZ + " and isDeleted = 0"));
        Intrinsics.checkNotNull(dailyRecord, "null cannot be cast to non-null type kotlin.collections.List<com.xiaomi.fit.fitness.persist.db.internal.WomenHealthRecordEntity>");
        return CurseUtilKt.toCurseSymptom(dailyRecord);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x013d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0180 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0181  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0181 -> B:35:0x0186). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getLimitedDataRecord(@org.jetbrains.annotations.NotNull com.xiaomi.fit.fitness.export.data.annotation.HomeDataType r29, @org.jetbrains.annotations.Nullable java.lang.String r30, long r31, long r33, int r35, int r36, boolean r37, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.util.List<? extends com.xiaomi.fit.fitness.export.data.item.DailyRecordItem>>> r38) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.fit.fitness.persist.db.utils.DailyRecordDaoUtils.getLimitedDataRecord(com.xiaomi.fit.fitness.export.data.annotation.HomeDataType, java.lang.String, long, long, int, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
