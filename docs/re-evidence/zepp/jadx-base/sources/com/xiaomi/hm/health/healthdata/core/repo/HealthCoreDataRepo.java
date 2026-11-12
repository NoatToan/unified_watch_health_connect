package com.xiaomi.hm.health.healthdata.core.repo;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.ui.areas.SelectAreaActivity;
import com.huami.bodymeasurements.temperature.model.koin.ScopesKt;
import com.huami.devicex.injection.data.HealthDataApi;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.usecase.GetCombineStressBetweenStampUseCase;
import com.huami.tools.log.HMLog;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bodyfat.manager.WeightInfoManager;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.databases.model.WeightInfos;
import com.xiaomi.hm.health.databases.model.WeightInfosDao;
import com.xiaomi.hm.health.di.koin.module.AccountModuleKt;
import com.xiaomi.hm.health.healthdata.core.UserDataRemoteAPI;
import com.xiaomi.hm.health.healthdata.core.converter.DataTypeConverter;
import com.xiaomi.hm.health.healthdata.core.dao.BloodPressureDecoration;
import com.xiaomi.hm.health.healthdata.core.dao.SyncLogDao;
import com.xiaomi.hm.health.healthdata.core.dao.UserHealthDataDao;
import com.xiaomi.hm.health.healthdata.core.dto.AvgItemDto;
import com.xiaomi.hm.health.healthdata.core.dto.BpDto;
import com.xiaomi.hm.health.healthdata.core.dto.DataItemDto;
import com.xiaomi.hm.health.healthdata.core.entity.SyncLogEntity;
import com.xiaomi.hm.health.healthdata.core.entity.UserDataEntity;
import com.xiaomi.hm.health.healthdata.core.third.ThirdDataDtApi;
import com.xiaomi.hm.health.healthdata.core.third.ThirdDataOperationFactory;
import com.xiaomi.hm.health.healthdata.dto.DataType;
import com.xiaomi.hm.health.healthdata.dto.HealthDataType;
import com.xiaomi.hm.health.healthdata.dto.StressDataType;
import com.xiaomi.hm.health.healthdata.dto.TemperatureDataType;
import com.xiaomi.hm.health.healthdata.utils.HealthDataTimeUtils;
import com.xiaomi.hm.health.healthdata.utils.HealthDataUtils;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.temperature.model.Temperature;
import com.xiaomi.hm.health.temperature.usecase.GetAllTypeTempBetweenTimeStampUseCase;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.LongRange;
import kotlin.text.l;
import kotlin.text.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.flow.FlowKt;
import org.cybergarage.soap.SOAP;
import org.greenrobot.greendao.Property;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 j2\u00020\u0001:\u0001jB\u001f\u0012\u0006\u0010Q\u001a\u00020O\u0012\u0006\u0010T\u001a\u00020R\u0012\u0006\u0010W\u001a\u00020U¢\u0006\u0004\bh\u0010iJ#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0005H\u0002J$\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bH\u0002J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0003H\u0002J(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00140\u0019H\u0002J\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0002J\u0018\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\nH\u0002J\u0010\u0010$\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001fH\u0002J\u0010\u0010%\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001fH\u0002J\u0010\u0010&\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001fH\u0002J\u0010\u0010'\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001fH\u0002J\u0010\u0010(\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001fH\u0002J\u0010\u0010)\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001fH\u0002J\u0012\u0010+\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u001fH\u0002J\u0006\u0010,\u001a\u00020\u0005J!\u0010-\u001a\u00020\"2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b-\u0010.J\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\bJ\"\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\bJ\u001b\u00103\u001a\u00020\n2\u0006\u0010\u000f\u001a\u000202H\u0086@ø\u0001\u0000¢\u0006\u0004\b3\u00104J\"\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020\bJ\u0014\u00106\u001a\b\u0012\u0004\u0012\u00020\u00030\u00142\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u00108\u001a\u00020\"2\u0006\u00107\u001a\u00020\u0003J\u001c\u0010;\u001a\b\u0012\u0004\u0012\u00020:0\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u001fJ\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020:0\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\u001fJ\u001c\u0010>\u001a\b\u0012\u0004\u0012\u00020:0\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u001fJ\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020:0\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010=\u001a\u00020\u001fJ\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020:0\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u001fJ\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00020:0\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010@\u001a\u00020\u001fJ\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020C0\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001fJ\u0014\u0010E\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010 \u001a\u00020\u001fJ2\u0010G\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0F\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0F0F2\u0006\u0010 \u001a\u00020\u001fJ2\u0010H\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0F\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0F0F2\u0006\u0010 \u001a\u00020\u001fJ\u0014\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010@\u001a\u00020\u001fJ2\u0010J\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0F\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0F0F2\u0006\u0010@\u001a\u00020\u001fJ\u0014\u0010K\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u00109\u001a\u00020\u001fJ2\u0010L\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0F\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0F0F2\u0006\u00109\u001a\u00020\u001fJ\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00142\u0006\u0010=\u001a\u00020\u001fJ2\u0010N\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0F\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0F0F2\u0006\u0010=\u001a\u00020\u001fR\u0016\u0010Q\u001a\u00020O8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010PR\u0016\u0010T\u001a\u00020R8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010SR\u0016\u0010W\u001a\u00020U8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010VR\u001e\u0010[\u001a\n Y*\u0004\u0018\u00010X0X8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010ZR\u001d\u0010`\u001a\u00020\\8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010]\u001a\u0004\b^\u0010_RJ\u0010f\u001a6\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140b0aj\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140b`c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR2\u0010g\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b0aj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b`c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006k"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo;", "Lorg/koin/core/component/KoinComponent;", "", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", "data", "", "o", "([Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;)V", "", "size", "", "nextTime", "e", "(ILjava/lang/Long;)V", "Lcom/xiaomi/hm/health/healthdata/dto/HealthDataType;", "type", SOAP.XMLNS, "r", "count", "Landroidx/lifecycle/LiveData;", "", GoogleApiAvailabilityLight.a, "c", "rawData", "b", "", "", "Lcom/xiaomi/hm/health/healthdata/core/dao/BloodPressureDecoration;", "Lcom/xiaomi/hm/health/healthdata/core/dto/BpDto;", DTransferConstants.SEARCH_KEY, "a", "Ljava/util/Date;", "day", "timestamp", "", com.google.android.exoplayer2.text.ttml.b.r, z.j, "i", hl.k, "l", "m", GoogleApiAvailabilityLight.b, "date", "h", "syncUserData", Constant.METHOD_INSERT, "([Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;)Z", "limit", "top", "topByLiveData", "Lcom/xiaomi/hm/health/healthdata/dto/DataType;", "latestTime", "(Lcom/xiaomi/hm/health/healthdata/dto/DataType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "topLiveData", "findAllByType", "entity", "delete", "month", "Lcom/xiaomi/hm/health/healthdata/core/dto/AvgItemDto;", "findAllByMonth", "findAvgByMonth", "year", "findAllByYear", "findAvgByYear", "week", "findAllByWeek", "findAvgByWeek", "Lcom/xiaomi/hm/health/healthdata/core/dto/DataItemDto;", "findByDay", "findBpByDay", "Lkotlin/Pair;", "findBpRangeByDay", "findLastBpRangeByDay", "findBpByWeek", "findBpRangeByWeek", "findBpByMonth", "findBpRangeByMonth", "findBpByYear", "findBpRangeByYear", "Lcom/xiaomi/hm/health/healthdata/core/dao/UserHealthDataDao;", "Lcom/xiaomi/hm/health/healthdata/core/dao/UserHealthDataDao;", "healthDataDao", "Lcom/xiaomi/hm/health/healthdata/core/dao/SyncLogDao;", "Lcom/xiaomi/hm/health/healthdata/core/dao/SyncLogDao;", "syncLogDao", "Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;", "remoteApi", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "tag", "Lcom/huami/devicex/injection/data/HealthDataApi;", "Lkotlin/Lazy;", "g", "()Lcom/huami/devicex/injection/data/HealthDataApi;", "healthDataApi", "Ljava/util/HashMap;", "Landroidx/lifecycle/MutableLiveData;", "Lkotlin/collections/HashMap;", "f", "Ljava/util/HashMap;", "mapOfTopData", "mapOfTopDataLimits", "<init>", "(Lcom/xiaomi/hm/health/healthdata/core/dao/UserHealthDataDao;Lcom/xiaomi/hm/health/healthdata/core/dao/SyncLogDao;Lcom/xiaomi/hm/health/healthdata/core/UserDataRemoteAPI;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class HealthCoreDataRepo implements KoinComponent {
    private static final int h = 7;
    private static final int i = 23;
    private static final int j = 59;
    private static final int k = 59;
    private static final int l = 999;
    private static final int m = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final UserHealthDataDao healthDataDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SyncLogDao syncLogDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final UserDataRemoteAPI remoteApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String tag = HealthCoreDataRepo.class.getSimpleName();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy healthDataApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final HashMap<HealthDataType, MutableLiveData<List<UserDataEntity>>> mapOfTopData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final HashMap<HealthDataType, Integer> mapOfTopDataLimits;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MutableLiveData<Boolean> n = new MutableLiveData<>();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\nR\u0016\u0010\u000e\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u000f\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/hm/health/healthdata/core/repo/HealthCoreDataRepo$Companion;", "", "Landroidx/lifecycle/MutableLiveData;", "", "updateOldDataTrigger", "Landroidx/lifecycle/MutableLiveData;", "getUpdateOldDataTrigger", "()Landroidx/lifecycle/MutableLiveData;", "", "firstOfMonth", LogUtil.I, "lastHour", "lastMS", "lastMinute", "lastSecond", "weekDaySize", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MutableLiveData<Boolean> getUpdateOldDataTrigger() {
            return HealthCoreDataRepo.n;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HealthDataType.values().length];
            iArr[HealthDataType.BMI.ordinal()] = 1;
            iArr[HealthDataType.BODY_FAT.ordinal()] = 2;
            iArr[HealthDataType.WATER.ordinal()] = 3;
            iArr[HealthDataType.VISCERAL_FAT.ordinal()] = 4;
            iArr[HealthDataType.MUSCLE.ordinal()] = 5;
            iArr[HealthDataType.PROTEIN.ordinal()] = 6;
            iArr[HealthDataType.BASAL_METABOLISM.ordinal()] = 7;
            iArr[HealthDataType.BONE.ordinal()] = 8;
            iArr[HealthDataType.SKELETAL_MUSCLE.ordinal()] = 9;
            iArr[HealthDataType.SUBCUTANEOUS_FAT.ordinal()] = 10;
            iArr[HealthDataType.TEMPERATURE.ordinal()] = 11;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo$finishSyncData$2$1", f = "HealthCoreDataRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HealthCoreDataRepo.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            HealthCoreDataRepo.this.r();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo", f = "HealthCoreDataRepo.kt", i = {}, l = {216, SelectAreaActivity.REQUEST_SELECT_AREA_ONLY}, m = "latestTime", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return HealthCoreDataRepo.this.latestTime(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ DataType a;
        public final /* synthetic */ Ref.LongRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DataType dataType, Ref.LongRef longRef) {
            super(0);
            this.a = dataType;
            this.b = longRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "latestTime..." + this.a + ",latestTime:" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "began sync user data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "response is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ List<UserDataEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(List<UserDataEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sync user data size [" + this.a.size() + "]";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sync user data over.";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/xiaomi/hm/health/healthdata/core/entity/UserDataEntity;", GoogleApiAvailabilityLight.b, "o", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo$topByLiveData$1", f = "HealthCoreDataRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function3<List<? extends UserDataEntity>, List<? extends UserDataEntity>, Continuation<? super List<? extends UserDataEntity>>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public /* synthetic */ Object c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(int i, Continuation<? super j> continuation) {
            super(3, continuation);
            this.d = i;
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull List<UserDataEntity> list, @NotNull List<UserDataEntity> list2, @Nullable Continuation<? super List<UserDataEntity>> continuation) {
            j jVar = new j(this.d, continuation);
            jVar.b = list;
            jVar.c = list2;
            return jVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CollectionsKt___CollectionsKt.take(DataTypeConverter.INSTANCE.concatTwoListAndSort(true, (List) this.b, (List) this.c), this.d);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo$updateLiveDataByTypeAndLimit$1", f = "HealthCoreDataRepo.kt", i = {}, l = {259}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HealthDataType c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo$updateLiveDataByTypeAndLimit$1$1", f = "HealthCoreDataRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ HealthCoreDataRepo b;
            public final /* synthetic */ HealthDataType c;
            public final /* synthetic */ int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(HealthCoreDataRepo healthCoreDataRepo, HealthDataType healthDataType, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = healthCoreDataRepo;
                this.c = healthDataType;
                this.d = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                MutableLiveData mutableLiveData = (MutableLiveData) this.b.mapOfTopData.get(this.c);
                if (mutableLiveData != null) {
                    mutableLiveData.postValue(this.b.top(this.c, this.d));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(HealthDataType healthDataType, Continuation<? super k> continuation) {
            super(2, continuation);
            this.c = healthDataType;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return HealthCoreDataRepo.this.new k(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Integer numBoxInt = (Integer) HealthCoreDataRepo.this.mapOfTopDataLimits.get(this.c);
                if (numBoxInt == null) {
                    numBoxInt = Boxing.boxInt(1);
                }
                int iIntValue = numBoxInt.intValue();
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(HealthCoreDataRepo.this, this.c, iIntValue, null);
                this.a = 1;
                if (BuildersKt.withContext(io2, aVar, this) == coroutine_suspended) {
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthCoreDataRepo(@NotNull UserHealthDataDao userHealthDataDao, @NotNull SyncLogDao syncLogDao, @NotNull UserDataRemoteAPI userDataRemoteAPI) {
        this.healthDataDao = userHealthDataDao;
        this.syncLogDao = syncLogDao;
        this.remoteApi = userDataRemoteAPI;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.healthDataApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<HealthDataApi>() { // from class: com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.data.HealthDataApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final HealthDataApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(HealthDataApi.class), qualifier, objArr);
            }
        });
        WeightInfoManager.getManager().addChangeListener(WeightMangerDbObserver.INSTANCE);
        Transformations.map(n, new Function<Boolean, Unit>() { // from class: com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Unit apply(Boolean bool) {
                try {
                    if (bool.booleanValue()) {
                        this.a.r();
                    }
                } catch (Throwable th) {
                    HMLog.warn(this.a.tag, th, HealthCoreDataRepo.a.a);
                }
                return Unit.INSTANCE;
            }
        });
        this.mapOfTopData = new HashMap<>();
        this.mapOfTopDataLimits = new HashMap<>();
    }

    private final List<BloodPressureDecoration> a(List<UserDataEntity> data) {
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(data, 10));
        Iterator<T> it2 = data.iterator();
        while (it2.hasNext()) {
            arrayList.add(new BloodPressureDecoration((UserDataEntity) it2.next()));
        }
        return CollectionsKt___CollectionsKt.toList(arrayList);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0015. Please report as an issue. */
    private final UserDataEntity b(HealthDataType type, UserDataEntity rawData) {
        Float floatOrNull;
        String strValueOf;
        Integer intOrNull;
        String eventValue = rawData.getEventValue();
        Pair<Float, Float> healthDataRange = HealthDataUtils.INSTANCE.getHealthDataRange(type);
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
                if (eventValue != null && (floatOrNull = kotlin.text.k.toFloatOrNull(eventValue)) != null) {
                    if (!(floatOrNull.floatValue() > 0.0f)) {
                        floatOrNull = null;
                    }
                    if (floatOrNull != null) {
                        float fFloatValue = floatOrNull.floatValue();
                        if (fFloatValue < healthDataRange.getFirst().floatValue()) {
                            strValueOf = String.valueOf(healthDataRange.getFirst().floatValue());
                        } else {
                            strValueOf = fFloatValue > healthDataRange.getSecond().floatValue() ? String.valueOf(healthDataRange.getSecond().floatValue()) : String.valueOf(fFloatValue);
                        }
                        eventValue = strValueOf;
                        break;
                    }
                }
                eventValue = null;
                break;
            case 7:
                if (eventValue != null && (intOrNull = l.toIntOrNull(eventValue)) != null) {
                    if (!(intOrNull.intValue() > 0)) {
                        intOrNull = null;
                    }
                    if (intOrNull != null) {
                        int iIntValue = intOrNull.intValue();
                        float f2 = iIntValue;
                        if (f2 < healthDataRange.getFirst().floatValue()) {
                            strValueOf = String.valueOf(healthDataRange.getFirst().floatValue());
                        } else {
                            strValueOf = f2 > healthDataRange.getSecond().floatValue() ? String.valueOf(healthDataRange.getSecond().floatValue()) : String.valueOf(iIntValue);
                        }
                        eventValue = strValueOf;
                        break;
                    }
                }
                eventValue = null;
                break;
        }
        UserDataEntity userDataEntity = new UserDataEntity(rawData.getId(), rawData.getUserId(), rawData.getType(), rawData.getUploadTime(), rawData.getLastUpdateTime(), eventValue, rawData.getExtValue(), rawData.getDateStr());
        userDataEntity.setOldData(rawData.getIsOldData());
        return userDataEntity;
    }

    private final List<UserDataEntity> c(HealthDataType type) {
        List<WeightInfos> infosDesc = WeightInfoManager.getManager().getInfosDesc(Long.parseLong(BFCallback.getHMPersonInfo().getUserid()));
        ThirdDataDtApi thirdDataDtApiCreateOpAction = ThirdDataOperationFactory.INSTANCE.createOpAction(type);
        List<UserDataEntity> listConvert = thirdDataDtApiCreateOpAction == null ? null : thirdDataDtApiCreateOpAction.convert(infosDesc);
        return listConvert == null ? CollectionsKt__CollectionsKt.emptyList() : listConvert;
    }

    private final LiveData<List<UserDataEntity>> d(final HealthDataType type, int count) {
        Property property;
        long validUid = HMLoginManager.getValidUid();
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                property = WeightInfosDao.Properties.Bmi;
                break;
            case 2:
                property = WeightInfosDao.Properties.Body_fat;
                break;
            case 3:
                property = WeightInfosDao.Properties.Moisture;
                break;
            case 4:
                property = WeightInfosDao.Properties.Visceral_fat;
                break;
            case 5:
                property = WeightInfosDao.Properties.Muscle;
                break;
            case 6:
                property = WeightInfosDao.Properties.Pmr;
                break;
            case 7:
                property = WeightInfosDao.Properties.Basal_metabolism;
                break;
            case 8:
                property = WeightInfosDao.Properties.Bone_mass;
                break;
            default:
                return new LiveData<List<? extends UserDataEntity>>() { // from class: com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo$findOldDataByTypeByLiveData$column$1
                    {
                        postValue(CollectionsKt__CollectionsKt.emptyList());
                    }
                };
        }
        return Transformations.map(WeightInfoManager.getManager().getInfosByLiveData(validUid, count, property), new Function<List<WeightInfos>, List<? extends UserDataEntity>>() { // from class: com.xiaomi.hm.health.healthdata.core.repo.HealthCoreDataRepo$findOldDataByTypeByLiveData$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final List<? extends UserDataEntity> apply(List<WeightInfos> list) {
                List<WeightInfos> list2 = list;
                ThirdDataDtApi thirdDataDtApiCreateOpAction = ThirdDataOperationFactory.INSTANCE.createOpAction(type);
                List<UserDataEntity> listConvert = thirdDataDtApiCreateOpAction == null ? null : thirdDataDtApiCreateOpAction.convert(list2);
                return listConvert == null ? CollectionsKt__CollectionsKt.emptyList() : listConvert;
            }
        });
    }

    private final void e(int size, Long nextTime) {
        SyncLogEntity syncLogEntityCopy$default;
        SyncLogEntity syncLogEntityFindLast = this.syncLogDao.findLast();
        if (syncLogEntityFindLast == null || (syncLogEntityCopy$default = SyncLogEntity.copy$default(syncLogEntityFindLast, null, null, null, Calendar.getInstance().getTime(), Integer.valueOf(size), true, nextTime, 7, null)) == null) {
            return;
        }
        this.syncLogDao.update(syncLogEntityCopy$default);
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new c(null), 2, null);
    }

    public static /* synthetic */ void f(HealthCoreDataRepo healthCoreDataRepo, int i2, Long l2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        if ((i3 & 2) != 0) {
            l2 = null;
        }
        healthCoreDataRepo.e(i2, l2);
    }

    private final HealthDataApi g() {
        return (HealthDataApi) this.healthDataApi.getValue();
    }

    private final int h(Date date) {
        if (date == null) {
            return 0;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(11);
    }

    private final long i(Date d2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d2);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    private final long j(Date d2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d2);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long k(Date d2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d2);
        calendar.setFirstDayOfWeek(m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null) ? 1 : 2);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long l(Date d2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d2);
        calendar.setFirstDayOfWeek(m.startsWith$default(Locale.getDefault().getCountry(), Locale.ENGLISH.toString(), false, 2, null) ? 1 : 2);
        calendar.set(7, calendar.getFirstDayOfWeek() + 6);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    private final long m(Date d2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d2);
        calendar.set(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    private final long n(Date d2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d2);
        calendar.set(6, calendar.getActualMaximum(6));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, 999);
        return calendar.getTimeInMillis();
    }

    private final void o(UserDataEntity... data) {
        int length = data.length;
        int i2 = 0;
        while (i2 < length) {
            UserDataEntity userDataEntity = data[i2];
            i2++;
            Date uploadTime = userDataEntity.getUploadTime();
            if (uploadTime != null && this.healthDataDao.isRecordExits(uploadTime.getTime()) == 0) {
                this.healthDataDao.insert(userDataEntity);
            }
        }
    }

    private final boolean p(Date day, long timestamp) {
        return TimeUtils.isTheSameDay(day.getTime(), timestamp);
    }

    private final List<BpDto> q(Map<Object, ? extends List<BloodPressureDecoration>> data) {
        Object next;
        Object next2;
        Object next3;
        Object next4;
        UserDataEntity data2;
        UserDataEntity data3;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<Object, ? extends List<BloodPressureDecoration>> entry : data.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((List) entry2.getValue()).size() < 2) {
                BloodPressureDecoration bloodPressureDecoration = (BloodPressureDecoration) CollectionsKt.first((List) entry2.getValue());
                String low = bloodPressureDecoration.getLow();
                String height = bloodPressureDecoration.getHeight();
                if (low != null && height != null) {
                    arrayList.add(new BpDto(String.valueOf(bloodPressureDecoration.getData().getId()), HealthDataType.BLOOD_PRESSURE, new Pair(Integer.valueOf(bloodPressureDecoration.getLowOrZero()), 0), new Pair(Integer.valueOf(bloodPressureDecoration.getHeightOrZero()), 0), bloodPressureDecoration.getData().getUploadTime()));
                }
            } else {
                Iterator it2 = ((Iterable) entry2.getValue()).iterator();
                Date uploadTime = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        int lowOrZero = ((BloodPressureDecoration) next).getLowOrZero();
                        do {
                            Object next5 = it2.next();
                            int lowOrZero2 = ((BloodPressureDecoration) next5).getLowOrZero();
                            if (lowOrZero < lowOrZero2) {
                                next = next5;
                                lowOrZero = lowOrZero2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = null;
                }
                BloodPressureDecoration bloodPressureDecoration2 = (BloodPressureDecoration) next;
                int lowOrZero3 = bloodPressureDecoration2 == null ? 0 : bloodPressureDecoration2.getLowOrZero();
                Iterator it3 = ((Iterable) entry2.getValue()).iterator();
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (it3.hasNext()) {
                        int lowOrZero4 = ((BloodPressureDecoration) next2).getLowOrZero();
                        do {
                            Object next6 = it3.next();
                            int lowOrZero5 = ((BloodPressureDecoration) next6).getLowOrZero();
                            if (lowOrZero4 > lowOrZero5) {
                                next2 = next6;
                                lowOrZero4 = lowOrZero5;
                            }
                        } while (it3.hasNext());
                    }
                } else {
                    next2 = null;
                }
                BloodPressureDecoration bloodPressureDecoration3 = (BloodPressureDecoration) next2;
                int lowOrZero6 = bloodPressureDecoration3 == null ? 0 : bloodPressureDecoration3.getLowOrZero();
                Iterator it4 = ((Iterable) entry2.getValue()).iterator();
                if (it4.hasNext()) {
                    next3 = it4.next();
                    if (it4.hasNext()) {
                        int heightOrZero = ((BloodPressureDecoration) next3).getHeightOrZero();
                        do {
                            Object next7 = it4.next();
                            int heightOrZero2 = ((BloodPressureDecoration) next7).getHeightOrZero();
                            if (heightOrZero < heightOrZero2) {
                                next3 = next7;
                                heightOrZero = heightOrZero2;
                            }
                        } while (it4.hasNext());
                    }
                } else {
                    next3 = null;
                }
                BloodPressureDecoration bloodPressureDecoration4 = (BloodPressureDecoration) next3;
                int heightOrZero3 = bloodPressureDecoration4 == null ? 0 : bloodPressureDecoration4.getHeightOrZero();
                Iterator it5 = ((Iterable) entry2.getValue()).iterator();
                if (it5.hasNext()) {
                    next4 = it5.next();
                    if (it5.hasNext()) {
                        int heightOrZero4 = ((BloodPressureDecoration) next4).getHeightOrZero();
                        do {
                            Object next8 = it5.next();
                            int heightOrZero5 = ((BloodPressureDecoration) next8).getHeightOrZero();
                            if (heightOrZero4 > heightOrZero5) {
                                next4 = next8;
                                heightOrZero4 = heightOrZero5;
                            }
                        } while (it5.hasNext());
                    }
                } else {
                    next4 = null;
                }
                BloodPressureDecoration bloodPressureDecoration5 = (BloodPressureDecoration) next4;
                int heightOrZero6 = bloodPressureDecoration5 != null ? bloodPressureDecoration5.getHeightOrZero() : 0;
                if (lowOrZero3 != 0 && lowOrZero6 != 0 && heightOrZero3 != 0 && heightOrZero6 != 0) {
                    BloodPressureDecoration bloodPressureDecoration6 = (BloodPressureDecoration) CollectionsKt.firstOrNull((List) entry2.getValue());
                    String strValueOf = String.valueOf((bloodPressureDecoration6 == null || (data2 = bloodPressureDecoration6.getData()) == null) ? null : data2.getId());
                    HealthDataType healthDataType = HealthDataType.BLOOD_PRESSURE;
                    Pair pair = new Pair(Integer.valueOf(lowOrZero6), Integer.valueOf(lowOrZero3));
                    Pair pair2 = new Pair(Integer.valueOf(heightOrZero6), Integer.valueOf(heightOrZero3));
                    BloodPressureDecoration bloodPressureDecoration7 = (BloodPressureDecoration) CollectionsKt.firstOrNull((List) entry2.getValue());
                    if (bloodPressureDecoration7 != null && (data3 = bloodPressureDecoration7.getData()) != null) {
                        uploadTime = data3.getUploadTime();
                    }
                    arrayList.add(new BpDto(strValueOf, healthDataType, pair, pair2, uploadTime));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        Iterator<T> it2 = this.mapOfTopData.keySet().iterator();
        while (it2.hasNext()) {
            s((HealthDataType) it2.next());
        }
    }

    private final void s(HealthDataType type) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new k(type, null), 3, null);
    }

    public final boolean delete(@NotNull UserDataEntity entity) {
        if (!this.remoteApi.delete(entity)) {
            return false;
        }
        if (!entity.getIsOldData()) {
            UserHealthDataDao userHealthDataDao = this.healthDataDao;
            Date uploadTime = entity.getUploadTime();
            if (userHealthDataDao.delete(uploadTime == null ? 0L : uploadTime.getTime()) < 0) {
                return false;
            }
            r();
            return true;
        }
        HealthDataType type = entity.getType();
        if (type == null) {
            return false;
        }
        ThirdDataDtApi thirdDataDtApiCreateOpAction = ThirdDataOperationFactory.INSTANCE.createOpAction(type);
        Boolean boolValueOf = thirdDataDtApiCreateOpAction == null ? null : Boolean.valueOf(thirdDataDtApiCreateOpAction.delete(entity));
        if (boolValueOf == null) {
            return false;
        }
        return boolValueOf.booleanValue();
    }

    @NotNull
    public final List<AvgItemDto> findAllByMonth(@NotNull HealthDataType type, @NotNull Date month) {
        AvgItemDto avgItemDto;
        long j2 = j(month);
        long jI = i(month);
        List<UserDataEntity> listC = c(type);
        ArrayList<UserDataEntity> arrayList = new ArrayList();
        for (Object obj : listC) {
            LongRange longRange = new LongRange(j2, jI);
            Date uploadTime = ((UserDataEntity) obj).getUploadTime();
            Long lValueOf = uploadTime == null ? null : Long.valueOf(uploadTime.getTime());
            if (lValueOf != null && longRange.contains(lValueOf.longValue())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (UserDataEntity userDataEntity : arrayList) {
            Date uploadTime2 = userDataEntity.getUploadTime();
            arrayList2.add(new AvgItemDto("", uploadTime2 == null ? month : uploadTime2, type, String.valueOf(userDataEntity.getEventValue()), true, null, 32, null));
        }
        List<UserDataEntity> listFindBetweenUploadTime = this.healthDataDao.findBetweenUploadTime(type, j2, jI);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindBetweenUploadTime, 10));
        for (UserDataEntity userDataEntity2 : listFindBetweenUploadTime) {
            if (type != HealthDataType.BLOOD_PRESSURE) {
                Date uploadTime3 = userDataEntity2.getUploadTime();
                avgItemDto = new AvgItemDto("", uploadTime3 == null ? month : uploadTime3, type, String.valueOf(userDataEntity2.getEventValue()), false, null, 32, null);
            } else {
                BloodPressureDecoration bloodPressureDecoration = new BloodPressureDecoration(userDataEntity2);
                Date uploadTime4 = userDataEntity2.getUploadTime();
                Date date = uploadTime4 == null ? month : uploadTime4;
                avgItemDto = new AvgItemDto("", date, type, bloodPressureDecoration.getLow() + "," + bloodPressureDecoration.getHeight(), false, null, 32, null);
            }
            arrayList3.add(avgItemDto);
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    @NotNull
    public final List<UserDataEntity> findAllByType(@NotNull HealthDataType type) {
        return DataTypeConverter.INSTANCE.concatTwoListAndSort(true, this.healthDataDao.findByType(type), c(type));
    }

    @NotNull
    public final List<AvgItemDto> findAllByWeek(@NotNull HealthDataType type, @NotNull Date week) {
        AvgItemDto avgItemDto;
        long jK = k(week);
        long jL = l(week);
        List<UserDataEntity> listC = c(type);
        ArrayList<UserDataEntity> arrayList = new ArrayList();
        for (Object obj : listC) {
            LongRange longRange = new LongRange(jK, jL);
            Date uploadTime = ((UserDataEntity) obj).getUploadTime();
            Long lValueOf = uploadTime == null ? null : Long.valueOf(uploadTime.getTime());
            if (lValueOf != null && longRange.contains(lValueOf.longValue())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (UserDataEntity userDataEntity : arrayList) {
            Date uploadTime2 = userDataEntity.getUploadTime();
            arrayList2.add(new AvgItemDto("", uploadTime2 == null ? week : uploadTime2, type, String.valueOf(userDataEntity.getEventValue()), true, null, 32, null));
        }
        List<UserDataEntity> listFindBetweenUploadTime = this.healthDataDao.findBetweenUploadTime(type, jK, jL);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindBetweenUploadTime, 10));
        for (UserDataEntity userDataEntity2 : listFindBetweenUploadTime) {
            if (type != HealthDataType.BLOOD_PRESSURE) {
                Date uploadTime3 = userDataEntity2.getUploadTime();
                avgItemDto = new AvgItemDto("", uploadTime3 == null ? week : uploadTime3, type, String.valueOf(userDataEntity2.getEventValue()), false, null, 32, null);
            } else {
                BloodPressureDecoration bloodPressureDecoration = new BloodPressureDecoration(userDataEntity2);
                Date uploadTime4 = userDataEntity2.getUploadTime();
                Date date = uploadTime4 == null ? week : uploadTime4;
                avgItemDto = new AvgItemDto("", date, type, bloodPressureDecoration.getLow() + "," + bloodPressureDecoration.getHeight(), false, null, 32, null);
            }
            arrayList3.add(avgItemDto);
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    @NotNull
    public final List<AvgItemDto> findAllByYear(@NotNull HealthDataType type, @NotNull Date year) {
        AvgItemDto avgItemDto;
        long jM = m(year);
        long jN = n(year);
        List<UserDataEntity> listC = c(type);
        ArrayList<UserDataEntity> arrayList = new ArrayList();
        for (Object obj : listC) {
            LongRange longRange = new LongRange(jM, jN);
            Date uploadTime = ((UserDataEntity) obj).getUploadTime();
            Long lValueOf = uploadTime == null ? null : Long.valueOf(uploadTime.getTime());
            if (lValueOf != null && longRange.contains(lValueOf.longValue())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (UserDataEntity userDataEntity : arrayList) {
            Date uploadTime2 = userDataEntity.getUploadTime();
            arrayList2.add(new AvgItemDto("", uploadTime2 == null ? year : uploadTime2, type, String.valueOf(userDataEntity.getEventValue()), true, null, 32, null));
        }
        List<UserDataEntity> listFindBetweenUploadTime = this.healthDataDao.findBetweenUploadTime(type, jM, jN);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindBetweenUploadTime, 10));
        for (UserDataEntity userDataEntity2 : listFindBetweenUploadTime) {
            if (type != HealthDataType.BLOOD_PRESSURE) {
                Date uploadTime3 = userDataEntity2.getUploadTime();
                avgItemDto = new AvgItemDto("", uploadTime3 == null ? year : uploadTime3, type, String.valueOf(userDataEntity2.getEventValue()), false, null, 32, null);
            } else {
                BloodPressureDecoration bloodPressureDecoration = new BloodPressureDecoration(userDataEntity2);
                Date uploadTime4 = userDataEntity2.getUploadTime();
                Date date = uploadTime4 == null ? year : uploadTime4;
                avgItemDto = new AvgItemDto("", date, type, bloodPressureDecoration.getLow() + "," + bloodPressureDecoration.getHeight(), false, null, 32, null);
            }
            arrayList3.add(avgItemDto);
        }
        ArrayList arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        return arrayList4;
    }

    @NotNull
    public final List<AvgItemDto> findAvgByMonth(@NotNull HealthDataType type, @NotNull Date month) {
        Double doubleOrNull;
        Double doubleOrNull2;
        Double doubleOrNull3;
        long j2 = j(month);
        long jI = i(month);
        List<UserDataEntity> listC = c(type);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listC.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            LongRange longRange = new LongRange(j2, jI);
            Date uploadTime = ((UserDataEntity) next).getUploadTime();
            Long lValueOf = uploadTime != null ? Long.valueOf(uploadTime.getTime()) : null;
            if (lValueOf != null && longRange.contains(lValueOf.longValue())) {
                arrayList.add(next);
            }
        }
        List<UserDataEntity> listFindBetweenUploadTime = this.healthDataDao.findBetweenUploadTime(type, j2, jI);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(listFindBetweenUploadTime);
        Unit unit = Unit.INSTANCE;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(b(type, (UserDataEntity) it3.next()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!(((UserDataEntity) obj).getEventValue() == null)) {
                arrayList4.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            String dateStr = ((UserDataEntity) obj2).getDateStr();
            String strSubstring = dateStr == null ? null : dateStr.substring(0, 7);
            Object arrayList5 = linkedHashMap.get(strSubstring);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(strSubstring, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        ArrayList arrayList6 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it4 = linkedHashMap2.entrySet().iterator();
        while (it4.hasNext()) {
            Iterable iterable = (Iterable) ((Map.Entry) it4.next()).getValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : iterable) {
                String dateStr2 = ((UserDataEntity) obj3).getDateStr();
                Object arrayList7 = linkedHashMap3.get(dateStr2);
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                    linkedHashMap3.put(dateStr2, arrayList7);
                }
                ((List) arrayList7).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                if (type != HealthDataType.BLOOD_PRESSURE) {
                    Iterator it5 = ((Iterable) entry2.getValue()).iterator();
                    double dDoubleValue = 0.0d;
                    while (it5.hasNext()) {
                        String eventValue = ((UserDataEntity) it5.next()).getEventValue();
                        dDoubleValue += (eventValue == null || (doubleOrNull = kotlin.text.k.toDoubleOrNull(eventValue)) == null) ? 0.0d : doubleOrNull.doubleValue();
                    }
                    arrayList6.add(new AvgItemDto("", ((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime(), type, String.valueOf(dDoubleValue / ((double) ((List) entry2.getValue()).size())), false, HealthDataTimeUtils.INSTANCE.formatTimeYMD(((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime().getTime())));
                } else {
                    Iterable iterable2 = (Iterable) entry2.getValue();
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    Iterator it6 = iterable2.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(new BloodPressureDecoration((UserDataEntity) it6.next()));
                    }
                    Iterator it7 = arrayList8.iterator();
                    double dDoubleValue2 = 0.0d;
                    while (it7.hasNext()) {
                        String low = ((BloodPressureDecoration) it7.next()).getLow();
                        dDoubleValue2 += (low == null || (doubleOrNull3 = kotlin.text.k.toDoubleOrNull(low)) == null) ? 0.0d : doubleOrNull3.doubleValue();
                    }
                    Iterator it8 = arrayList8.iterator();
                    double dDoubleValue3 = 0.0d;
                    while (it8.hasNext()) {
                        String height = ((BloodPressureDecoration) it8.next()).getHeight();
                        dDoubleValue3 += (height == null || (doubleOrNull2 = kotlin.text.k.toDoubleOrNull(height)) == null) ? 0.0d : doubleOrNull2.doubleValue();
                    }
                    int size = ((List) entry2.getValue()).size();
                    double d2 = size;
                    arrayList6.add(new AvgItemDto("", ((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime(), type, (dDoubleValue2 / d2) + "," + (dDoubleValue3 / d2), false, HealthDataTimeUtils.INSTANCE.formatTimeYMD(((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime().getTime())));
                }
            }
        }
        return arrayList6;
    }

    @NotNull
    public final List<AvgItemDto> findAvgByWeek(@NotNull HealthDataType type, @NotNull Date week) {
        Double doubleOrNull;
        Double doubleOrNull2;
        Double doubleOrNull3;
        long jK = k(week);
        long jL = l(week);
        List<UserDataEntity> listC = c(type);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listC.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            LongRange longRange = new LongRange(jK, jL);
            Date uploadTime = ((UserDataEntity) next).getUploadTime();
            Long lValueOf = uploadTime == null ? null : Long.valueOf(uploadTime.getTime());
            if (lValueOf != null && longRange.contains(lValueOf.longValue())) {
                arrayList.add(next);
            }
        }
        List<UserDataEntity> listFindBetweenUploadTime = this.healthDataDao.findBetweenUploadTime(type, jK, jL);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(listFindBetweenUploadTime);
        Unit unit = Unit.INSTANCE;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(b(type, (UserDataEntity) it3.next()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!(((UserDataEntity) obj).getEventValue() == null)) {
                arrayList4.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            String dateStr = ((UserDataEntity) obj2).getDateStr();
            Object arrayList5 = linkedHashMap.get(dateStr);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(dateStr, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        ArrayList arrayList6 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it4 = linkedHashMap2.entrySet().iterator();
        while (it4.hasNext()) {
            Iterable iterable = (Iterable) ((Map.Entry) it4.next()).getValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : iterable) {
                String dateStr2 = ((UserDataEntity) obj3).getDateStr();
                Object arrayList7 = linkedHashMap3.get(dateStr2);
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                    linkedHashMap3.put(dateStr2, arrayList7);
                }
                ((List) arrayList7).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                if (type != HealthDataType.BLOOD_PRESSURE) {
                    Iterator it5 = ((Iterable) entry2.getValue()).iterator();
                    double dDoubleValue = 0.0d;
                    while (it5.hasNext()) {
                        String eventValue = ((UserDataEntity) it5.next()).getEventValue();
                        dDoubleValue += (eventValue == null || (doubleOrNull = kotlin.text.k.toDoubleOrNull(eventValue)) == null) ? 0.0d : doubleOrNull.doubleValue();
                    }
                    arrayList6.add(new AvgItemDto("", ((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime(), type, String.valueOf(dDoubleValue / ((double) ((List) entry2.getValue()).size())), false, HealthDataTimeUtils.INSTANCE.formatTimeYMD(((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime().getTime())));
                } else {
                    Iterable iterable2 = (Iterable) entry2.getValue();
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    Iterator it6 = iterable2.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(new BloodPressureDecoration((UserDataEntity) it6.next()));
                    }
                    Iterator it7 = arrayList8.iterator();
                    double dDoubleValue2 = 0.0d;
                    while (it7.hasNext()) {
                        String low = ((BloodPressureDecoration) it7.next()).getLow();
                        dDoubleValue2 += (low == null || (doubleOrNull3 = kotlin.text.k.toDoubleOrNull(low)) == null) ? 0.0d : doubleOrNull3.doubleValue();
                    }
                    Iterator it8 = arrayList8.iterator();
                    double dDoubleValue3 = 0.0d;
                    while (it8.hasNext()) {
                        String height = ((BloodPressureDecoration) it8.next()).getHeight();
                        dDoubleValue3 += (height == null || (doubleOrNull2 = kotlin.text.k.toDoubleOrNull(height)) == null) ? 0.0d : doubleOrNull2.doubleValue();
                    }
                    int size = ((List) entry2.getValue()).size();
                    double d2 = size;
                    arrayList6.add(new AvgItemDto("", ((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime(), type, (dDoubleValue2 / d2) + "," + (dDoubleValue3 / d2), false, HealthDataTimeUtils.INSTANCE.formatTimeYMD(((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime().getTime())));
                }
            }
        }
        return arrayList6;
    }

    @NotNull
    public final List<AvgItemDto> findAvgByYear(@NotNull HealthDataType type, @NotNull Date year) {
        int i2;
        Double doubleOrNull;
        Double doubleOrNull2;
        Double doubleOrNull3;
        long jM = m(year);
        long jN = n(year);
        List<UserDataEntity> listC = c(type);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listC.iterator();
        while (true) {
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            LongRange longRange = new LongRange(jM, jN);
            Date uploadTime = ((UserDataEntity) next).getUploadTime();
            Long lValueOf = uploadTime == null ? null : Long.valueOf(uploadTime.getTime());
            if (lValueOf != null && longRange.contains(lValueOf.longValue())) {
                arrayList.add(next);
            }
        }
        List<UserDataEntity> listFindBetweenUploadTime = this.healthDataDao.findBetweenUploadTime(type, jM, jN);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(listFindBetweenUploadTime);
        Unit unit = Unit.INSTANCE;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(b(type, (UserDataEntity) it3.next()));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!(((UserDataEntity) obj).getEventValue() == null)) {
                arrayList4.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            String dateStr = ((UserDataEntity) obj2).getDateStr();
            CharSequence charSequenceSubSequence = dateStr == null ? null : dateStr.subSequence(0, 4);
            Object arrayList5 = linkedHashMap.get(charSequenceSubSequence);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(charSequenceSubSequence, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        ArrayList arrayList6 = new ArrayList();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (!((List) entry.getValue()).isEmpty()) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it4 = linkedHashMap2.entrySet().iterator();
        while (it4.hasNext()) {
            Iterable iterable = (Iterable) ((Map.Entry) it4.next()).getValue();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Object obj3 : iterable) {
                String dateStr2 = ((UserDataEntity) obj3).getDateStr();
                String strSubstring = dateStr2 == null ? null : dateStr2.substring(i2, 7);
                Object arrayList7 = linkedHashMap3.get(strSubstring);
                if (arrayList7 == null) {
                    arrayList7 = new ArrayList();
                    linkedHashMap3.put(strSubstring, arrayList7);
                }
                ((List) arrayList7).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                if (type != HealthDataType.BLOOD_PRESSURE) {
                    int size = ((List) entry2.getValue()).size();
                    Iterator it5 = ((Iterable) entry2.getValue()).iterator();
                    double dDoubleValue = 0.0d;
                    while (it5.hasNext()) {
                        String eventValue = ((UserDataEntity) it5.next()).getEventValue();
                        dDoubleValue += (eventValue == null || (doubleOrNull3 = kotlin.text.k.toDoubleOrNull(eventValue)) == null) ? 0.0d : doubleOrNull3.doubleValue();
                    }
                    arrayList6.add(new AvgItemDto("", ((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime(), type, String.valueOf(dDoubleValue / ((double) size)), false, HealthDataTimeUtils.INSTANCE.formatTimeYM(((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime().getTime())));
                } else {
                    int size2 = ((List) entry2.getValue()).size();
                    Iterable iterable2 = (Iterable) entry2.getValue();
                    ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                    Iterator it6 = iterable2.iterator();
                    while (it6.hasNext()) {
                        arrayList8.add(new BloodPressureDecoration((UserDataEntity) it6.next()));
                    }
                    Iterator it7 = arrayList8.iterator();
                    double dDoubleValue2 = 0.0d;
                    while (it7.hasNext()) {
                        String low = ((BloodPressureDecoration) it7.next()).getLow();
                        dDoubleValue2 += (low == null || (doubleOrNull2 = kotlin.text.k.toDoubleOrNull(low)) == null) ? 0.0d : doubleOrNull2.doubleValue();
                    }
                    Iterator it8 = arrayList8.iterator();
                    double dDoubleValue3 = 0.0d;
                    while (it8.hasNext()) {
                        String height = ((BloodPressureDecoration) it8.next()).getHeight();
                        dDoubleValue3 += (height == null || (doubleOrNull = kotlin.text.k.toDoubleOrNull(height)) == null) ? 0.0d : doubleOrNull.doubleValue();
                    }
                    double d2 = size2;
                    arrayList6.add(new AvgItemDto("", ((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime(), type, (dDoubleValue2 / d2) + "," + (dDoubleValue3 / d2), false, HealthDataTimeUtils.INSTANCE.formatTimeYM(((UserDataEntity) CollectionsKt.first((List) entry2.getValue())).getUploadTime().getTime())));
                }
                i2 = 0;
            }
        }
        return arrayList6;
    }

    @NotNull
    public final List<BpDto> findBpByDay(@NotNull Date day) {
        String strConvertDate2str = DataTypeConverter.INSTANCE.convertDate2str(day);
        List<UserDataEntity> listFindInDay = strConvertDate2str == null ? null : this.healthDataDao.findInDay(HealthDataType.BLOOD_PRESSURE, strConvertDate2str);
        if (listFindInDay == null) {
            listFindInDay = CollectionsKt__CollectionsKt.emptyList();
        }
        List<BloodPressureDecoration> listA = a(listFindInDay);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listA) {
            Integer numValueOf = Integer.valueOf(((BloodPressureDecoration) obj).getHour());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        List<BpDto> listQ = q(linkedHashMap);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listQ, 10));
        for (BpDto bpDto : listQ) {
            Calendar calendar = Calendar.getInstance();
            Date uploadTime = bpDto.getUploadTime();
            if (uploadTime != null) {
                calendar.setTime(uploadTime);
                calendar.set(12, 0);
                calendar.set(13, 0);
            }
            arrayList2.add(new BpDto(bpDto.getId(), bpDto.getSubType(), bpDto.getLowValue(), bpDto.getHeightValue(), calendar.getTime()));
        }
        return arrayList2;
    }

    @NotNull
    public final List<BpDto> findBpByMonth(@NotNull Date month) {
        List<UserDataEntity> listFindBetweenUploadTime = DataTypeConverter.INSTANCE.convertDate2str(month) == null ? null : this.healthDataDao.findBetweenUploadTime(HealthDataType.BLOOD_PRESSURE, j(month), i(month));
        if (listFindBetweenUploadTime == null) {
            listFindBetweenUploadTime = CollectionsKt__CollectionsKt.emptyList();
        }
        List<BloodPressureDecoration> listA = a(listFindBetweenUploadTime);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (!(((BloodPressureDecoration) obj).getDateStr().length() == 0)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            String dateStr = ((BloodPressureDecoration) obj2).getDateStr();
            Object arrayList2 = linkedHashMap.get(dateStr);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(dateStr, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        return q(linkedHashMap);
    }

    @NotNull
    public final List<BpDto> findBpByWeek(@NotNull Date week) {
        List<UserDataEntity> listFindBetweenUploadTime = DataTypeConverter.INSTANCE.convertDate2str(week) == null ? null : this.healthDataDao.findBetweenUploadTime(HealthDataType.BLOOD_PRESSURE, k(week), l(week));
        if (listFindBetweenUploadTime == null) {
            listFindBetweenUploadTime = CollectionsKt__CollectionsKt.emptyList();
        }
        List<BloodPressureDecoration> listA = a(listFindBetweenUploadTime);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (!(((BloodPressureDecoration) obj).getDateStr().length() == 0)) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList) {
            String dateStr = ((BloodPressureDecoration) obj2).getDateStr();
            Object arrayList2 = linkedHashMap.get(dateStr);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(dateStr, arrayList2);
            }
            ((List) arrayList2).add(obj2);
        }
        return q(linkedHashMap);
    }

    @NotNull
    public final List<BpDto> findBpByYear(@NotNull Date year) {
        List<UserDataEntity> listFindBetweenUploadTime = DataTypeConverter.INSTANCE.convertDate2str(year) == null ? null : this.healthDataDao.findBetweenUploadTime(HealthDataType.BLOOD_PRESSURE, m(year), n(year));
        if (listFindBetweenUploadTime == null) {
            listFindBetweenUploadTime = CollectionsKt__CollectionsKt.emptyList();
        }
        List<BloodPressureDecoration> listA = a(listFindBetweenUploadTime);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listA.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (!(((BloodPressureDecoration) next).getDateStr().length() == 0)) {
                arrayList.add(next);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList) {
            String strSubstring = ((BloodPressureDecoration) obj).getDateStr().substring(0, 7);
            Object arrayList2 = linkedHashMap.get(strSubstring);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(strSubstring, arrayList2);
            }
            ((List) arrayList2).add(obj);
        }
        return q(linkedHashMap);
    }

    @NotNull
    public final Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> findBpRangeByDay(@NotNull Date day) {
        String strConvertDate2str = DataTypeConverter.INSTANCE.convertDate2str(day);
        List<UserDataEntity> listFindInDay = strConvertDate2str == null ? null : this.healthDataDao.findInDay(HealthDataType.BLOOD_PRESSURE, strConvertDate2str);
        if (listFindInDay == null) {
            listFindInDay = CollectionsKt__CollectionsKt.emptyList();
        }
        List<BloodPressureDecoration> listA = a(listFindInDay);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listA, 10));
        Iterator<T> it2 = listA.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((BloodPressureDecoration) it2.next()).getLowOrZero()));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList);
        int iIntValue = num == null ? 0 : num.intValue();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listA, 10));
        Iterator<T> it3 = listA.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((BloodPressureDecoration) it3.next()).getLowOrZero()));
        }
        Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList2);
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listA, 10));
        Iterator<T> it4 = listA.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((BloodPressureDecoration) it4.next()).getHeightOrZero()));
        }
        Integer num3 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList3);
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listA, 10));
        Iterator<T> it5 = listA.iterator();
        while (it5.hasNext()) {
            arrayList4.add(Integer.valueOf(((BloodPressureDecoration) it5.next()).getHeightOrZero()));
        }
        Integer num4 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList4);
        return new Pair<>(new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)), new Pair(Integer.valueOf(iIntValue3), Integer.valueOf(num4 != null ? num4.intValue() : 0)));
    }

    @NotNull
    public final Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> findBpRangeByMonth(@NotNull Date month) {
        List<UserDataEntity> listFindBetweenUploadTime;
        if (DataTypeConverter.INSTANCE.convertDate2str(month) == null) {
            listFindBetweenUploadTime = null;
        } else {
            listFindBetweenUploadTime = this.healthDataDao.findBetweenUploadTime(HealthDataType.BLOOD_PRESSURE, j(month), i(month));
        }
        if (listFindBetweenUploadTime == null) {
            listFindBetweenUploadTime = CollectionsKt__CollectionsKt.emptyList();
        }
        List<BloodPressureDecoration> listA = a(listFindBetweenUploadTime);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listA.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if ((((BloodPressureDecoration) next).getDateStr().length() == 0 ? 1 : 0) == 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((BloodPressureDecoration) it3.next()).getLowOrZero()));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        int iIntValue = num == null ? 0 : num.intValue();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((BloodPressureDecoration) it4.next()).getLowOrZero()));
        }
        Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList3);
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(Integer.valueOf(((BloodPressureDecoration) it5.next()).getHeightOrZero()));
        }
        Integer num3 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList4);
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList5.add(Integer.valueOf(((BloodPressureDecoration) it6.next()).getHeightOrZero()));
        }
        Integer num4 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList5);
        return new Pair<>(new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)), new Pair(Integer.valueOf(iIntValue3), Integer.valueOf(num4 != null ? num4.intValue() : 0)));
    }

    @NotNull
    public final Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> findBpRangeByWeek(@NotNull Date week) {
        List<UserDataEntity> listFindBetweenUploadTime;
        if (DataTypeConverter.INSTANCE.convertDate2str(week) == null) {
            listFindBetweenUploadTime = null;
        } else {
            listFindBetweenUploadTime = this.healthDataDao.findBetweenUploadTime(HealthDataType.BLOOD_PRESSURE, k(week), l(week));
        }
        if (listFindBetweenUploadTime == null) {
            listFindBetweenUploadTime = CollectionsKt__CollectionsKt.emptyList();
        }
        List<BloodPressureDecoration> listA = a(listFindBetweenUploadTime);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listA.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if ((((BloodPressureDecoration) next).getDateStr().length() == 0 ? 1 : 0) == 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((BloodPressureDecoration) it3.next()).getLowOrZero()));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        int iIntValue = num == null ? 0 : num.intValue();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((BloodPressureDecoration) it4.next()).getLowOrZero()));
        }
        Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList3);
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(Integer.valueOf(((BloodPressureDecoration) it5.next()).getHeightOrZero()));
        }
        Integer num3 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList4);
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList5.add(Integer.valueOf(((BloodPressureDecoration) it6.next()).getHeightOrZero()));
        }
        Integer num4 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList5);
        return new Pair<>(new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)), new Pair(Integer.valueOf(iIntValue3), Integer.valueOf(num4 != null ? num4.intValue() : 0)));
    }

    @NotNull
    public final Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> findBpRangeByYear(@NotNull Date year) {
        List<UserDataEntity> listFindBetweenUploadTime;
        if (DataTypeConverter.INSTANCE.convertDate2str(year) == null) {
            listFindBetweenUploadTime = null;
        } else {
            listFindBetweenUploadTime = this.healthDataDao.findBetweenUploadTime(HealthDataType.BLOOD_PRESSURE, m(year), n(year));
        }
        if (listFindBetweenUploadTime == null) {
            listFindBetweenUploadTime = CollectionsKt__CollectionsKt.emptyList();
        }
        List<BloodPressureDecoration> listA = a(listFindBetweenUploadTime);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = listA.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if ((((BloodPressureDecoration) next).getDateStr().length() == 0 ? 1 : 0) == 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((BloodPressureDecoration) it3.next()).getLowOrZero()));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        int iIntValue = num == null ? 0 : num.intValue();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((BloodPressureDecoration) it4.next()).getLowOrZero()));
        }
        Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList3);
        int iIntValue2 = num2 == null ? 0 : num2.intValue();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(Integer.valueOf(((BloodPressureDecoration) it5.next()).getHeightOrZero()));
        }
        Integer num3 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList4);
        int iIntValue3 = num3 == null ? 0 : num3.intValue();
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList5.add(Integer.valueOf(((BloodPressureDecoration) it6.next()).getHeightOrZero()));
        }
        Integer num4 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList5);
        return new Pair<>(new Pair(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2)), new Pair(Integer.valueOf(iIntValue3), Integer.valueOf(num4 != null ? num4.intValue() : 0)));
    }

    @NotNull
    public final List<DataItemDto> findByDay(@NotNull HealthDataType type, @NotNull Date day) {
        try {
            List<UserDataEntity> listC = c(type);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listC) {
                Date uploadTime = ((UserDataEntity) obj).getUploadTime();
                if (p(day, uploadTime == null ? 0L : uploadTime.getTime())) {
                    arrayList.add(obj);
                }
            }
            DataTypeConverter dataTypeConverter = DataTypeConverter.INSTANCE;
            String strConvertDate2str = dataTypeConverter.convertDate2str(day);
            List<UserDataEntity> listFindInDay = strConvertDate2str == null ? null : this.healthDataDao.findInDay(type, strConvertDate2str);
            if (listFindInDay == null) {
                listFindInDay = CollectionsKt__CollectionsKt.emptyList();
            }
            List<UserDataEntity> listConcatTwoListAndSort = dataTypeConverter.concatTwoListAndSort(true, arrayList, listFindInDay);
            ArrayList<UserDataEntity> arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listConcatTwoListAndSort, 10));
            Iterator<T> it2 = listConcatTwoListAndSort.iterator();
            while (it2.hasNext()) {
                arrayList2.add(b(type, (UserDataEntity) it2.next()));
            }
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            for (UserDataEntity userDataEntity : arrayList2) {
                String strValueOf = String.valueOf(userDataEntity.getId());
                Date uploadTime2 = userDataEntity.getUploadTime();
                String eventValue = userDataEntity.getEventValue();
                if (eventValue == null) {
                    eventValue = "";
                }
                String str = eventValue;
                boolean isOldData = userDataEntity.getIsOldData();
                Date uploadTime3 = userDataEntity.getUploadTime();
                arrayList3.add(new DataItemDto(strValueOf, uploadTime2, str, type, isOldData, uploadTime3 == null ? null : HealthDataTimeUtils.INSTANCE.formatTimeYMDHHmm(uploadTime3.getTime())));
            }
            return CollectionsKt___CollectionsKt.toList(arrayList3);
        } catch (Exception e2) {
            HMLog.warn(this.tag, e2, b.a);
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    @NotNull
    public final Pair<Pair<Integer, Integer>, Pair<Integer, Integer>> findLastBpRangeByDay(@NotNull Date day) {
        Object next;
        String strConvertDate2str = DataTypeConverter.INSTANCE.convertDate2str(day);
        List<UserDataEntity> listFindInDay = strConvertDate2str == null ? null : this.healthDataDao.findInDay(HealthDataType.BLOOD_PRESSURE, strConvertDate2str);
        if (listFindInDay == null) {
            listFindInDay = CollectionsKt__CollectionsKt.emptyList();
        }
        List<BloodPressureDecoration> listA = a(listFindInDay);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listA) {
            Integer numValueOf = Integer.valueOf(((BloodPressureDecoration) obj).getHour());
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int iIntValue = ((Number) ((Map.Entry) next).getKey()).intValue();
                do {
                    Object next2 = it2.next();
                    int iIntValue2 = ((Number) ((Map.Entry) next2).getKey()).intValue();
                    if (iIntValue < iIntValue2) {
                        next = next2;
                        iIntValue = iIntValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        List listEmptyList = entry != null ? (List) entry.getValue() : null;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listEmptyList, 10));
        Iterator it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(Integer.valueOf(((BloodPressureDecoration) it3.next()).getLowOrZero()));
        }
        Integer num = (Integer) CollectionsKt.minOrNull((Iterable) arrayList2);
        int iIntValue3 = num == null ? 0 : num.intValue();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listEmptyList, 10));
        Iterator it4 = listEmptyList.iterator();
        while (it4.hasNext()) {
            arrayList3.add(Integer.valueOf(((BloodPressureDecoration) it4.next()).getLowOrZero()));
        }
        Integer num2 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList3);
        int iIntValue4 = num2 == null ? 0 : num2.intValue();
        ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listEmptyList, 10));
        Iterator it5 = listEmptyList.iterator();
        while (it5.hasNext()) {
            arrayList4.add(Integer.valueOf(((BloodPressureDecoration) it5.next()).getHeightOrZero()));
        }
        Integer num3 = (Integer) CollectionsKt.minOrNull((Iterable) arrayList4);
        int iIntValue5 = num3 == null ? 0 : num3.intValue();
        ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listEmptyList, 10));
        Iterator it6 = listEmptyList.iterator();
        while (it6.hasNext()) {
            arrayList5.add(Integer.valueOf(((BloodPressureDecoration) it6.next()).getHeightOrZero()));
        }
        Integer num4 = (Integer) CollectionsKt.maxOrNull((Iterable) arrayList5);
        return new Pair<>(new Pair(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue4)), new Pair(Integer.valueOf(iIntValue5), Integer.valueOf(num4 != null ? num4.intValue() : 0)));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean insert(@NotNull UserDataEntity... data) {
        Date time = Calendar.getInstance().getTime();
        ArrayList arrayList = new ArrayList(data.length);
        int length = data.length;
        int i2 = 0;
        while (i2 < length) {
            UserDataEntity userDataEntity = data[i2];
            i2++;
            Date uploadTime = userDataEntity.getUploadTime();
            Date date = uploadTime == null ? time : uploadTime;
            arrayList.add(userDataEntity.copy((SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 1) != 0 ? userDataEntity.id : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 2) != 0 ? userDataEntity.userId : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 4) != 0 ? userDataEntity.type : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 8) != 0 ? userDataEntity.uploadTime : date, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 16) != 0 ? userDataEntity.lastUpdateTime : date, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 32) != 0 ? userDataEntity.eventValue : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 64) != 0 ? userDataEntity.extValue : null, (SelectAreaActivity.REQUEST_SELECT_AREA_ONLY & 128) != 0 ? userDataEntity.dateStr : DataTypeConverter.INSTANCE.convertDate2str(date)));
        }
        Object[] array = arrayList.toArray(new UserDataEntity[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        UserDataEntity[] userDataEntityArr = (UserDataEntity[]) array;
        boolean zCreate = this.remoteApi.create((UserDataEntity[]) Arrays.copyOf(userDataEntityArr, userDataEntityArr.length));
        if (zCreate) {
            this.healthDataDao.insert((UserDataEntity[]) Arrays.copyOf(userDataEntityArr, userDataEntityArr.length));
            r();
        }
        return zCreate;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00d6 A[LOOP:1: B:35:0x00d0->B:37:0x00d6, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:52:0x014c A[LOOP:0: B:50:0x0146->B:52:0x014c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object latestTime(@NotNull DataType dataType, @NotNull Continuation<? super Long> continuation) {
        d dVar;
        Ref.LongRef longRef;
        DataType dataType2;
        Ref.LongRef longRef2;
        HealthCoreDataRepo healthCoreDataRepo;
        Date uploadTime;
        Long lBoxLong;
        ArrayList arrayList;
        Iterator it2;
        Long l2;
        ArrayList arrayList2;
        Iterator it3;
        Long l3;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.f = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        d dVar2 = dVar;
        Object obj = dVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar2.f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            longRef = new Ref.LongRef();
            longRef.element = System.currentTimeMillis();
            if (dataType instanceof HealthDataType) {
                UserDataEntity userDataEntity = (UserDataEntity) CollectionsKt.firstOrNull((List) top((HealthDataType) dataType, 1));
                if (userDataEntity != null && (uploadTime = userDataEntity.getUploadTime()) != null && (lBoxLong = Boxing.boxLong(uploadTime.getTime())) != null) {
                    longRef.element = lBoxLong.longValue();
                }
            } else if (dataType instanceof StressDataType) {
                GetCombineStressBetweenStampUseCase getCombineStressBetweenStampUseCaseLoadGetCombineStressBetweenStampUseCase = g().loadGetCombineStressBetweenStampUseCase();
                long registerDate = AccountModuleKt.getAccountService().getRegisterDate();
                long jCurrentTimeMillis = System.currentTimeMillis();
                dVar2.a = this;
                dVar2.b = dataType;
                dVar2.c = longRef;
                dVar2.f = 1;
                Object objExecute = getCombineStressBetweenStampUseCaseLoadGetCombineStressBetweenStampUseCase.execute(registerDate, jCurrentTimeMillis, dVar2);
                if (objExecute == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dataType2 = dataType;
                longRef2 = longRef;
                obj = objExecute;
                healthCoreDataRepo = this;
                Iterable iterable = (Iterable) obj;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
                it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Boxing.boxLong(((SingleStress) it2.next()).getTimestamp()));
                }
                l2 = (Long) CollectionsKt.maxOrNull((Iterable) arrayList);
                if (l2 != null) {
                    longRef2.element = l2.longValue();
                }
                longRef = longRef2;
                dataType = dataType2;
            } else if (dataType instanceof TemperatureDataType) {
                GetAllTypeTempBetweenTimeStampUseCase getAllTypeTempBetweenTimeStampUseCase = (GetAllTypeTempBetweenTimeStampUseCase) ScopesKt.temperatureScope(GlobalContext.INSTANCE.get()).get(Reflection.getOrCreateKotlinClass(GetAllTypeTempBetweenTimeStampUseCase.class), null, null);
                long registerDate2 = AccountModuleKt.getAccountService().getRegisterDate();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                dVar2.a = this;
                dVar2.b = dataType;
                dVar2.c = longRef;
                dVar2.f = 2;
                Object objExecute2 = getAllTypeTempBetweenTimeStampUseCase.execute(registerDate2, jCurrentTimeMillis2, dVar2);
                if (objExecute2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                dataType2 = dataType;
                longRef2 = longRef;
                obj = objExecute2;
                healthCoreDataRepo = this;
                Iterable iterable2 = (Iterable) obj;
                arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10));
                it3 = iterable2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Boxing.boxLong(((Temperature) it3.next()).getTimestamp()));
                }
                l3 = (Long) CollectionsKt.maxOrNull((Iterable) arrayList2);
                if (l3 != null) {
                    longRef2.element = l3.longValue();
                }
                longRef = longRef2;
                dataType = dataType2;
            }
            healthCoreDataRepo = this;
        } else if (i3 == 1) {
            longRef2 = (Ref.LongRef) dVar2.c;
            dataType2 = (DataType) dVar2.b;
            healthCoreDataRepo = (HealthCoreDataRepo) dVar2.a;
            ResultKt.throwOnFailure(obj);
            Iterable iterable3 = (Iterable) obj;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable3, 10));
            it2 = iterable3.iterator();
            while (it2.hasNext()) {
                arrayList.add(Boxing.boxLong(((SingleStress) it2.next()).getTimestamp()));
            }
            l2 = (Long) CollectionsKt.maxOrNull((Iterable) arrayList);
            if (l2 != null) {
                longRef2.element = l2.longValue();
            }
            longRef = longRef2;
            dataType = dataType2;
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            longRef2 = (Ref.LongRef) dVar2.c;
            dataType2 = (DataType) dVar2.b;
            healthCoreDataRepo = (HealthCoreDataRepo) dVar2.a;
            ResultKt.throwOnFailure(obj);
            Iterable iterable4 = (Iterable) obj;
            arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable4, 10));
            it3 = iterable4.iterator();
            while (it3.hasNext()) {
                arrayList2.add(Boxing.boxLong(((Temperature) it3.next()).getTimestamp()));
            }
            l3 = (Long) CollectionsKt.maxOrNull((Iterable) arrayList2);
            if (l3 != null) {
                longRef2.element = l3.longValue();
            }
            longRef = longRef2;
            dataType = dataType2;
        }
        HMLog.info(healthCoreDataRepo.tag, new e(dataType, longRef));
        return Boxing.boxLong(longRef.element);
    }

    public final void syncUserData() {
        HMLog.debug(this.tag, f.a);
        SyncLogEntity syncLogEntityFindLast = this.syncLogDao.findLast();
        this.syncLogDao.insert(new SyncLogEntity(null, HMPersonInfo.getInstance().getUserInfo().getUserid(), Calendar.getInstance().getTime(), null, null, false, syncLogEntityFindLast == null ? null : syncLogEntityFindLast.getNextTime(), 57, null));
        List<UserDataEntity> listSyncUserData = this.remoteApi.syncUserData(syncLogEntityFindLast == null ? null : syncLogEntityFindLast.getNextTime());
        if (listSyncUserData.isEmpty()) {
            HMLog.debug(this.tag, g.a);
            f(this, 0, null, 3, null);
            return;
        }
        HMLog.debug(this.tag, new h(listSyncUserData));
        Object[] array = listSyncUserData.toArray(new UserDataEntity[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        UserDataEntity[] userDataEntityArr = (UserDataEntity[]) array;
        o((UserDataEntity[]) Arrays.copyOf(userDataEntityArr, userDataEntityArr.length));
        int size = listSyncUserData.size();
        Date uploadTime = ((UserDataEntity) CollectionsKt.last((List) listSyncUserData)).getUploadTime();
        e(size, uploadTime != null ? Long.valueOf(uploadTime.getTime()) : null);
        HMLog.debug(this.tag, i.a);
    }

    @NotNull
    public final List<UserDataEntity> top(@NotNull HealthDataType type, int limit) {
        return CollectionsKt___CollectionsKt.take(DataTypeConverter.INSTANCE.concatTwoListAndSort(true, this.healthDataDao.getTop(type, limit), CollectionsKt___CollectionsKt.take(c(type), limit)), limit);
    }

    @NotNull
    public final LiveData<List<UserDataEntity>> topByLiveData(@NotNull HealthDataType type, int limit) {
        return FlowLiveDataConversions.asLiveData$default(FlowKt.flowCombine(FlowLiveDataConversions.asFlow(this.healthDataDao.getTopByLiveData(type, limit)), FlowLiveDataConversions.asFlow(d(type, limit)), new j(limit, null)), (CoroutineContext) null, 0L, 3, (Object) null);
    }

    @NotNull
    public final LiveData<List<UserDataEntity>> topLiveData(@NotNull HealthDataType type, int limit) {
        MutableLiveData<List<UserDataEntity>> mutableLiveData = this.mapOfTopData.get(type);
        if (mutableLiveData == null) {
            mutableLiveData = new MutableLiveData<>();
        }
        this.mapOfTopData.put(type, mutableLiveData);
        this.mapOfTopDataLimits.put(type, Integer.valueOf(limit));
        s(type);
        return mutableLiveData;
    }
}
