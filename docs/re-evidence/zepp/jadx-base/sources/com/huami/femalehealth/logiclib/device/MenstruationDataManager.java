package com.huami.femalehealth.logiclib.device;

import android.util.LruCache;
import androidx.annotation.WorkerThread;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.FirebasePerformance;
import com.huami.android.vo.ApiErrorResponse;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.femalehealth.logiclib.api.DeleteType;
import com.huami.femalehealth.logiclib.api.FemaleHealthWebApi;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.api.pojo.Items;
import com.huami.femalehealth.logiclib.api.pojo.MenstruationRecordBean;
import com.huami.femalehealth.logiclib.api.pojo.MenstruationStatusBean;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.calculation.FHCalculation;
import com.huami.femalehealth.logiclib.calculation.Milli;
import com.huami.femalehealth.logiclib.db.FemaleHealthDb;
import com.huami.femalehealth.logiclib.db.dao.MenstruationSearchRepo;
import com.huami.femalehealth.logiclib.db.po.DeletedMenstruationSection;
import com.huami.femalehealth.logiclib.db.po.MenstruationRecord;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.dto.MenstruationConfigDto;
import com.huami.femalehealth.logiclib.dto.MenstruationDto;
import com.huami.femalehealth.logiclib.dto.MenstruationTotalDto;
import com.huami.femalehealth.logiclib.dto.Section;
import com.huami.femalehealth.logiclib.helper.AppExecutors;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateHelperKt;
import com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils;
import com.huami.femalehealth.logiclib.helper.ext.DtoExKt;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import com.huami.femalehealth.logiclib.helper.ext.PoExKt;
import com.huami.femalehealth.logiclib.manager.DataCacheManager;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.tools.log.HMLog;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.netty.util.internal.StringUtil;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.LongProgression;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u0089\u00012\u00020\u0001:\b\u008a\u0001\u0089\u0001\u008b\u0001\u008c\u0001B2\u0012\u0006\u0010r\u001a\u00020o\u0012\u0006\u0010v\u001a\u00020s\u0012\u0006\u0010y\u001a\u00020w\u0012\u0006\u0010|\u001a\u00020z\u0012\u0007\u0010\u0081\u0001\u001a\u00020}¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0016\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0012\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0002J5\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00112\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0018\u001a\u00020\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\fH\u0002JY\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\f2\u0006\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\nH\u0002¢\u0006\u0004\b\"\u0010#J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020%0\u00062\u0006\u0010$\u001a\u00020\u000fH\u0003JB\u0010,\u001a\u00020\u00172\u0006\u0010(\u001a\u00020'2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020'0\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010+\u001a\u00020\nH\u0002J\u0016\u0010.\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020'0\u0006H\u0002J/\u00101\u001a\u00020\n2\u001e\u00100\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060/\"\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J#\u00105\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b5\u00106J\u000e\u00109\u001a\u00020\u00042\u0006\u00108\u001a\u000207J\u000e\u0010<\u001a\u00020\u00042\u0006\u0010;\u001a\u00020:J\u0006\u0010=\u001a\u00020:J2\u0010B\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\b\b\u0002\u0010@\u001a\u00020\n2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010>J\u0012\u0010@\u001a\u00020\u00042\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>J\u001a\u0010C\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u0002072\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>J\u0015\u0010D\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\b\u0010F\u001a\u0004\u0018\u000107J#\u0010I\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\f2\b\u00101\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\bG\u0010HJ\b\u0010J\u001a\u00020\u0002H\u0007J\u000e\u0010M\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KJ\u0006\u0010N\u001a\u00020KJ\"\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010O\u001a\u00020\f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020'0Q2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J&\u0010V\u001a\u0014\u0012\u0004\u0012\u00020U\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060T2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J>\u0010Y\u001a\u00020\u00172\f\u0010W\u001a\b\u0012\u0004\u0012\u00020'0\u00062\f\u0010X\u001a\b\u0012\u0004\u0012\u00020'0\u00062\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u0014\u0010Z\u001a\b\u0012\u0004\u0012\u00020%0\u00062\u0006\u0010$\u001a\u00020\u000fJ!\u0010]\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u00172\n\b\u0002\u0010\\\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b]\u0010^J\u001e\u0010_\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\\\u001a\u00020\nJ\u0016\u0010c\u001a\u00020\n2\u0006\u0010`\u001a\u00020\u001a2\u0006\u0010b\u001a\u00020aJ1\u0010d\u001a\u00020\n2\u0006\u0010`\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\b\u0010\\\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bd\u0010eJ*\u0010h\u001a\u00020\u00172\f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010+\u001a\u00020\nJ\b\u0010i\u001a\u0004\u0018\u00010\u0002J\b\u0010j\u001a\u0004\u0018\u00010\u0002J<\u0010n\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010k\u001a\u00020\n2\u0006\u0010l\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010m\u001a\u00020\u000fR\u0016\u0010r\u001a\u00020o8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010v\u001a\u00020s8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010y\u001a\u00020w8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010xR\u0016\u0010|\u001a\u00020z8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010{R\u001b\u0010\u0081\u0001\u001a\u00020}8\u0006@\u0006¢\u0006\r\n\u0004\b1\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0083\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\"\u0010\u0082\u0001R'\u0010\u0086\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008d\u0001"}, d2 = {"Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "", "Lcom/huami/femalehealth/logiclib/dto/MenstruationTotalDto;", "dto", "", SOAP.XMLNS, "", "Lcom/huami/femalehealth/logiclib/dto/MenstruationDto;", "dtoList", "r", "", "resetHour", "", "m", "data", "", "expand", "Lkotlin/Pair;", "Ljava/util/Date;", hl.k, "(Ljava/util/List;Ljava/lang/Integer;)Lkotlin/Pair;", "deviceData", "dbData", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$MergeResult;", com.google.android.exoplayer2.text.ttml.b.r, "date", "", DTransferConstants.SEARCH_KEY, "menstruationList", "start", "end", "filledUpdateTime", "forceUpdateAllUT", "fromCache", "f", "(Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Long;ZZ)Ljava/util/List;", "limit", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "o", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Period;", "newPeriod", "dbPeriod", "newData", "keepAllWhenHeadNeighbor", com.loc.z.j, "periods", GoogleApiAvailabilityLight.a, "", "lists", "e", "([Ljava/util/List;)Z", "addDataFromDevice", "write", "doAddDataFromDevice", "(Lcom/huami/femalehealth/logiclib/dto/MenstruationTotalDto;Ljava/lang/Boolean;)V", "Lcom/huami/femalehealth/logiclib/dto/MenstruationConfigDto;", "config", "addConfFromDevice", "", "version", "setFwVer", "getFwVer", "Lcom/huami/femalehealth/logiclib/device/DeviceCallback;", "callback", "writeRecentToDevice", "writeRecentToDeviceCallBack", "writeToDevice", "writeConfigToDevice", "readFromDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readLocalConfFromApp", "updateDateRangeByUser$logiclib_release", "(Ljava/lang/Long;Ljava/lang/Long;)V", "updateDateRangeByUser", "prepareMenstruationTotalData", "Ljava/util/Calendar;", "c", "updateFemaleDataSyncTime", "getFemaleDataSyncTime", "dateTime", "findBelongPeriod", "", "scanToFindPeriods", "total", "", "Lcom/huami/femalehealth/logiclib/dto/Section;", "scanToFindSections", "devPairs", "dbPairs", "findConflictWithDevData", "updateFromCloud", "mergeResult", "isEnd", "handleMergeResult", "(Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$MergeResult;Ljava/lang/Boolean;)I", "cloudUploadHistory", "sId", "Lcom/huami/femalehealth/logiclib/api/DeleteType;", "type", "cloudDeleteHistory", "cloudModifyHistory", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;)Z", "newRecords", "oldRecords", "mergeMenstruation", "createInitMenstruationTotalDto", "getInitTotalDtoForFw", "isEdit", "isAddCoverTodayConsiderToday", "keepDuration", "calcCurrMenstruationDelPart", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "a", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "executors", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "b", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "api", "Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;", "Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/femalehealth/logiclib/device/DeviceDataTransfer;", "Lcom/huami/femalehealth/logiclib/device/DeviceDataTransfer;", "transfer", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "getSp", "()Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "sp", "B", "mFwVersion", "g", "Lkotlin/Pair;", "mDevDateRange", "<init>", "(Lcom/huami/femalehealth/logiclib/helper/AppExecutors;Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;Lcom/huami/femalehealth/logiclib/device/DeviceDataTransfer;Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;)V", "Companion", "Action", "MergeResult", "Period", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class MenstruationDataManager {
    public static final long DAY_MILLIS = 86400000;
    public static final int EXPAND_DAYS = 2;

    @NotNull
    public static final String FMT_MMDD_FOR_LOG = "MM-dd";
    public static final int LIMIT_BATCH_ALL = Integer.MAX_VALUE;
    public static final int LIMIT_BATCH_SMALL = 10;
    public static final int MAX_DAYS_REQUIRED = 150;
    public static final int RESULT_NET_FAIL = 1;
    public static final int RESULT_OK = 0;
    public static final int RESULT_SECTION_MISMATCH = 2;

    @NotNull
    public static final String TAG = "MenstruationDataManager";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors executors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthWebApi api;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthDb db;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final DeviceDataTransfer transfer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferencesUtils sp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private volatile byte mFwVersion = 1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private volatile Pair<? extends Date, ? extends Date> mDevDateRange;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final LruCache<String, List<MenstruationDto>> h = new LruCache<>(100);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Action;", "", "<init>", "(Ljava/lang/String;I)V", "ADD", FirebasePerformance.HttpMethod.DELETE, "MODIFY", "NO_ACTION", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public enum Action {
        ADD,
        DELETE,
        MODIFY,
        NO_ACTION
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\nR\u0016\u0010\u0010\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\nR\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\nR\u0016\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\nR\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0016\u0010\u0014\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR*\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00160\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Companion;", "", "", "result", "", "isResultSuccess", "", "DAY_MILLIS", "J", "EXPAND_DAYS", LogUtil.I, "", "FMT_MMDD_FOR_LOG", "Ljava/lang/String;", "LIMIT_BATCH_ALL", "LIMIT_BATCH_SMALL", "MAX_DAYS_REQUIRED", "RESULT_NET_FAIL", "RESULT_OK", "RESULT_SECTION_MISMATCH", "TAG", "Landroid/util/LruCache;", "", "Lcom/huami/femalehealth/logiclib/dto/MenstruationDto;", "fillCache", "Landroid/util/LruCache;", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isResultSuccess(int result) {
            return result == 0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J2\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bR(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$MergeResult;", "", "", "toString", "", "Lcom/huami/femalehealth/logiclib/dto/MenstruationDto;", "toAdd", "toDel", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Period;", "toModify", "copy", "a", "Ljava/util/List;", "getToAdd", "()Ljava/util/List;", "setToAdd", "(Ljava/util/List;)V", "b", "getToDel", "setToDel", "c", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Period;", "getToModify", "()Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Period;", "setToModify", "(Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Period;)V", "<init>", "()V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final class MergeResult {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private List<MenstruationDto> toAdd = new ArrayList();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        private List<MenstruationDto> toDel = new ArrayList();

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        private Period toModify;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ MergeResult copy$default(MergeResult mergeResult, List list, List list2, Period period, int i, Object obj) {
            if ((i & 1) != 0) {
                list = mergeResult.toAdd;
            }
            if ((i & 2) != 0) {
                list2 = mergeResult.toDel;
            }
            if ((i & 4) != 0) {
                period = mergeResult.toModify;
            }
            return mergeResult.copy(list, list2, period);
        }

        @NotNull
        public final MergeResult copy(@NotNull List<MenstruationDto> toAdd, @NotNull List<MenstruationDto> toDel, @Nullable Period toModify) {
            MergeResult mergeResult = new MergeResult();
            mergeResult.setToAdd(toAdd);
            mergeResult.setToDel(toDel);
            mergeResult.setToModify(toModify);
            return mergeResult;
        }

        @NotNull
        public final List<MenstruationDto> getToAdd() {
            return this.toAdd;
        }

        @NotNull
        public final List<MenstruationDto> getToDel() {
            return this.toDel;
        }

        @Nullable
        public final Period getToModify() {
            return this.toModify;
        }

        public final void setToAdd(@NotNull List<MenstruationDto> list) {
            this.toAdd = list;
        }

        public final void setToDel(@NotNull List<MenstruationDto> list) {
            this.toDel = list;
        }

        public final void setToModify(@Nullable Period period) {
            this.toModify = period;
        }

        @NotNull
        public String toString() {
            return "toAdd:\n" + this.toAdd + ", \ntoDel:\n" + this.toDel + "\ntoModify:" + this.toModify;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b9\u0010:J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u0004HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00102\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010)\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\"\u00105\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006;"}, d2 = {"Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Period;", "", "", "toString", "", "component1", "component2", "component3", "start", "end", EcgData.TIMESTAMP_SERVER_UPDATED, "copy", "", "hashCode", "other", "", "equals", "a", "J", "getStart", "()J", "b", "getEnd", "c", "getUpdateTime", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Action;", GoogleApiAvailabilityLight.a, "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Action;", "getAction", "()Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Action;", "setAction", "(Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager$Action;)V", "action", "e", "Ljava/lang/String;", "getSId", "()Ljava/lang/String;", "setSId", "(Ljava/lang/String;)V", "sId", "f", "Ljava/lang/Long;", "getNewStart", "()Ljava/lang/Long;", "setNewStart", "(Ljava/lang/Long;)V", "newStart", "g", "getNewEnd", "setNewEnd", "newEnd", "h", "Z", "isEnd", "()Z", "setEnd", "(Z)V", "<init>", "(JJJ)V", "logiclib_release"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class Period {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long start;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final long end;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final long updateTime;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        private String sId;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        private Action action = Action.NO_ACTION;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        private Long newStart = 0L;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        private Long newEnd = 0L;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private boolean isEnd = true;

        public Period(long j, long j2, long j3) {
            this.start = j;
            this.end = j2;
            this.updateTime = j3;
        }

        public static /* synthetic */ Period copy$default(Period period, long j, long j2, long j3, int i, Object obj) {
            if ((i & 1) != 0) {
                j = period.start;
            }
            long j4 = j;
            if ((i & 2) != 0) {
                j2 = period.end;
            }
            long j5 = j2;
            if ((i & 4) != 0) {
                j3 = period.updateTime;
            }
            return period.copy(j4, j5, j3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getStart() {
            return this.start;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final long getEnd() {
            return this.end;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final long getUpdateTime() {
            return this.updateTime;
        }

        @NotNull
        public final Period copy(long start, long end, long updateTime) {
            return new Period(start, end, updateTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Period)) {
                return false;
            }
            Period period = (Period) other;
            return this.start == period.start && this.end == period.end && this.updateTime == period.updateTime;
        }

        @NotNull
        public final Action getAction() {
            return this.action;
        }

        public final long getEnd() {
            return this.end;
        }

        @Nullable
        public final Long getNewEnd() {
            return this.newEnd;
        }

        @Nullable
        public final Long getNewStart() {
            return this.newStart;
        }

        @Nullable
        public final String getSId() {
            return this.sId;
        }

        public final long getStart() {
            return this.start;
        }

        public final long getUpdateTime() {
            return this.updateTime;
        }

        public int hashCode() {
            return (((defpackage.b.a(this.start) * 31) + defpackage.b.a(this.end)) * 31) + defpackage.b.a(this.updateTime);
        }

        /* JADX INFO: renamed from: isEnd, reason: from getter */
        public final boolean getIsEnd() {
            return this.isEnd;
        }

        public final void setAction(@NotNull Action action) {
            this.action = action;
        }

        public final void setEnd(boolean z) {
            this.isEnd = z;
        }

        public final void setNewEnd(@Nullable Long l) {
            this.newEnd = l;
        }

        public final void setNewStart(@Nullable Long l) {
            this.newStart = l;
        }

        public final void setSId(@Nullable String str) {
            this.sId = str;
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("s:");
            sb.append(NumberExtKt.dateFormat(this.start));
            sb.append(", e:");
            sb.append(NumberExtKt.dateFormat(this.end));
            sb.append(", newStart:");
            Long l = this.newStart;
            sb.append((Object) (l == null ? null : NumberExtKt.dateFormat(l.longValue())));
            sb.append(", newEnd:");
            Long l2 = this.newEnd;
            sb.append((Object) (l2 != null ? NumberExtKt.dateFormat(l2.longValue()) : null));
            sb.append(", update:updateTime, action=");
            sb.append(this.action);
            sb.append(", isEnd:");
            sb.append(this.isEnd);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationConfigDto a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MenstruationConfigDto menstruationConfigDto) {
            super(0);
            this.a = menstruationConfigDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("addConfFromDevice, config=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationDto> a;
        public final /* synthetic */ MenstruationDataManager b;
        public final /* synthetic */ Period c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(List<MenstruationDto> list, MenstruationDataManager menstruationDataManager, Period period) {
            super(0);
            this.a = list;
            this.b = menstruationDataManager;
            this.c = period;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "DEL dbPeriod=" + this.a + ", it.start=" + this.b.q(this.c.getStart());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a1 extends Lambda implements Function0<String> {
        public a1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("mDevDateRange:", MenstruationDataManager.this.mDevDateRange);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.device.MenstruationDataManager$addDataFromDevice$2", f = "MenstruationDataManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MenstruationTotalDto c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MenstruationTotalDto menstruationTotalDto, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = menstruationTotalDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationDataManager.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            MenstruationDataManager.this.doAddDataFromDevice(this.c, Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ Boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(Date date, Date date2, Boolean bool, boolean z, boolean z2) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = bool;
            this.d = z;
            this.e = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("sec1:");
            DateHelper dateHelper = DateHelper.INSTANCE;
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.a.getTime(), false, 2, null));
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.b.getTime(), false, 2, null));
            sb.append(StringUtil.SPACE);
            sb.append(this.c);
            sb.append(StringUtil.SPACE);
            sb.append(this.d);
            sb.append(StringUtil.SPACE);
            sb.append(this.e);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b1 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ Long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b1(long j, Long l) {
            super(0);
            this.a = j;
            this.b = l;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateDateRangeFromDevice, start=" + NumberExtKt.dateFormat(this.a) + ", end=" + NumberExtKt.dateFormat(this.b.longValue());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Date c;
        public final /* synthetic */ Date d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, boolean z2, Date date, Date date2, int i) {
            super(0);
            this.a = z;
            this.b = z2;
            this.c = date;
            this.d = date2;
            this.e = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "removeRange, isEdit=" + this.a + ", isAddCoverTodayConsiderToday=" + this.b + ", s=" + AidKt.toDateTriple(this.c) + ", e=" + AidKt.toDateTriple(this.d) + ", keepDur=" + this.e;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;
        public final /* synthetic */ Ref.IntRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(Ref.BooleanRef booleanRef, Ref.IntRef intRef) {
            super(0);
            this.a = booleanRef;
            this.b = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleMergeResult, cloudRet=" + this.a.element + ", result=" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c1 extends Lambda implements Function0<String> {
        public c1() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("updateDeviceDateRange, start=");
            DateHelper dateHelper = DateHelper.INSTANCE;
            sb.append(DateHelper.convertUTCDate$default(dateHelper, MenstruationDataManager.this.getSp().getDeviceDateRangeMin(), false, 2, null));
            sb.append(", end=");
            sb.append(DateHelper.convertUTCDate$default(dateHelper, MenstruationDataManager.this.getSp().getDeviceDateRangeMax(), false, 2, null));
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ Date c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Date date, Date date2, Date date3) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = date3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "removeRange, earliest=" + AidKt.toDateTriple(this.a) + ", latest=" + AidKt.toDateTriple(this.b) + ", newEnd=" + AidKt.toDateTriple(this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationDto a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(MenstruationDto menstruationDto) {
            super(0);
            this.a = menstruationDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("handleMergeResult, dto =", this.a.msg());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d1 extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationConfigDto a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d1(MenstruationConfigDto menstruationConfigDto) {
            super(0);
            this.a = menstruationConfigDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("writeConfigToDevice, data: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Date date, Date date2) {
            super(0);
            this.a = date;
            this.b = date2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "removeRange, delStart=" + AidKt.toDateTriple(this.a) + ", delEnd=" + AidKt.toDateTriple(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e0 extends Lambda implements Function0<String> {
        public final /* synthetic */ MergeResult a;
        public final /* synthetic */ Boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(MergeResult mergeResult, Boolean bool) {
            super(0);
            this.a = mergeResult;
            this.b = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleMergeResult, mergeResult=" + this.a + ", isEnd=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e1 extends Lambda implements Function0<String> {
        public final /* synthetic */ List<List<MenstruationVo>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e1(List<? extends List<MenstruationVo>> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("writeRecentToDevice, data: ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("cloudDeleteHistory, sId=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f0 extends Lambda implements Function0<String> {
        public static final f0 a = new f0();

        public f0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleMergeResult, modify";
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
            return "cloudDeleteHistory, success";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<String> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(Ref.ObjectRef<String> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("handleMergeResult, del and add, sId = ", this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "cloudUploadHistory fail";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ Ref.ObjectRef<String> c;
        public final /* synthetic */ Map.Entry<Section, List<MenstruationDto>> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h0(Date date, Date date2, Ref.ObjectRef<String> objectRef, Map.Entry<Section, ? extends List<MenstruationDto>> entry) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = objectRef;
            this.d = entry;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleMergeResult, del and add, s=" + NumberExtKt.dateFormat(this.a.getTime()) + ", e=" + NumberExtKt.dateFormat(this.b.getTime()) + ", sId=" + ((Object) this.c.element) + " datas={" + this.d.getValue() + '}';
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationRecordBean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(MenstruationRecordBean menstruationRecordBean) {
            super(0);
            this.a = menstruationRecordBean;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("cloudModifyHistory, bean=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i0 extends Lambda implements Function0<String> {
        public static final i0 a = new i0();

        public i0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleMergeResult, del and add, delete section mismatch";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<MenstruationRecordBean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ApiResponse<MenstruationRecordBean> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("cloudModifyHistory fail ", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j0 extends Lambda implements Function0<String> {
        public static final j0 a = new j0();

        public j0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "--------------------------------";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Date date, Date date2, boolean z) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("cloudUploadHistory, start=$");
            DateHelper dateHelper = DateHelper.INSTANCE;
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.a.getTime(), false, 2, null));
            sb.append(", end=");
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.b.getTime(), false, 2, null));
            sb.append(", isEnd=");
            sb.append(this.c);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ Boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k0(Date date, Date date2, Boolean bool, boolean z, boolean z2) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = bool;
            this.d = z;
            this.e = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("sec:");
            DateHelper dateHelper = DateHelper.INSTANCE;
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.a.getTime(), false, 2, null));
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.b.getTime(), false, 2, null));
            sb.append(StringUtil.SPACE);
            sb.append(this.c);
            sb.append(StringUtil.SPACE);
            sb.append(this.d);
            sb.append(StringUtil.SPACE);
            sb.append(this.e);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationRecordBean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MenstruationRecordBean menstruationRecordBean) {
            super(0);
            this.a = menstruationRecordBean;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("cloudUploadHistory, resp.body=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l0 extends Lambda implements Function0<String> {
        public static final l0 a = new l0();

        public l0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleMergeResult, add only";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "cloudUploadHistory fail";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m0 extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m0(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("loadHistory, limit=", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public static final n a = new n();

        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "createInitMenstruationTotalDto, db empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n0 extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<Items<HistoryItemBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n0(ApiResponse<Items<HistoryItemBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("loadHistory, error=", ((ApiErrorResponse) this.a).getErrorMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationTotalDto a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(MenstruationTotalDto menstruationTotalDto) {
            super(0);
            this.a = menstruationTotalDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("createInitMenstruationTotalDto, dto=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o0 extends Lambda implements Function0<String> {
        public static final o0 a = new o0();

        public o0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadHistory, empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Period> a;
        public final /* synthetic */ Ref.BooleanRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(List<Period> list, Ref.BooleanRef booleanRef) {
            super(0);
            this.a = list;
            this.b = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "decideIsEndField, periods=" + this.a + ", isEnd=" + this.b.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p0 extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Period> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(List<Period> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("mergeMenstruation, newRecords should only contains single period, newPeriod.size=", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationDto>[] a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<MenstruationDto>[] listArr, boolean z) {
            super(0);
            this.a = listArr;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "decideIsEndFieldForDtoList, lists=" + this.a + ", isEnd=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q0 extends Lambda implements Function0<String> {
        public final /* synthetic */ MergeResult a;
        public final /* synthetic */ List<Period> b;
        public final /* synthetic */ List<Period> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q0(MergeResult mergeResult, List<Period> list, List<Period> list2) {
            super(0);
            this.a = mergeResult;
            this.b = list;
            this.c = list2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "mergeMenstruation, result=" + this.a + ", newPeriod=" + this.b + ", oldPeriod=" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public static final r a = new r();

        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fill from cache";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.BooleanRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(Ref.BooleanRef booleanRef) {
            super(0);
            this.a = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("mergeMenstruation, clean merge ", Boolean.valueOf(this.a.element));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ Long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Long l) {
            super(0);
            this.a = l;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fill, with updateTime=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s0 extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Period> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(List<Period> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("mergeMenstruationWithDevData devPairs:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationDto> a;
        public final /* synthetic */ List<MenstruationDto> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(List<MenstruationDto> list, List<MenstruationDto> list2) {
            super(0);
            this.a = list;
            this.b = list2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "findConflict, newData=" + this.a + ", dbData=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t0 extends Lambda implements Function0<String> {
        public final /* synthetic */ List<DeletedMenstruationSection> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(List<DeletedMenstruationSection> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("mergeMenstruationWithDevData delRecords:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("findConflict, case 1, isBridge=", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u0 extends Lambda implements Function0<String> {
        public final /* synthetic */ List<Period> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(List<Period> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("mergeMenstruationWithDevData devPairs:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public static final v a = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "findConflict, case 2";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v0 extends Lambda implements Function0<String> {
        public v0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("prepareMenstruationTotalData, devDateRange=", MenstruationDataManager.this.mDevDateRange);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w extends Lambda implements Function0<String> {
        public static final w a = new w();

        public w() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "findConflict, case 3";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class w0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.LongRef a;
        public final /* synthetic */ Ref.LongRef b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w0(Ref.LongRef longRef, Ref.LongRef longRef2) {
            super(0);
            this.a = longRef;
            this.b = longRef2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("prepareMenstruationTotalData, totalStart=");
            DateHelper dateHelper = DateHelper.INSTANCE;
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.a.element, false, 2, null));
            sb.append(", totalEnd=");
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.b.element, false, 2, null));
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x extends Lambda implements Function0<String> {
        public static final x a = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "多端合并";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class x0 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x0(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("prepareMenstruationTotalData, upTime=", Long.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class y extends Lambda implements Function0<String> {
        public final /* synthetic */ Period b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Period period) {
            super(0);
            this.b = period;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("dev no conflict, dev.updateTime=", MenstruationDataManager.this.q(this.b.getUpdateTime()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.device.MenstruationDataManager", f = "MenstruationDataManager.kt", i = {0}, l = {224}, m = "readFromDevice", n = {"this"}, s = {"L$0"})
    public static final class y0 extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public y0(Continuation<? super y0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return MenstruationDataManager.this.readFromDevice(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationDto> a;
        public final /* synthetic */ MenstruationDataManager b;
        public final /* synthetic */ Period c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(List<MenstruationDto> list, MenstruationDataManager menstruationDataManager, Period period) {
            super(0);
            this.a = list;
            this.b = menstruationDataManager;
            this.c = period;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "ADD devPeriod=" + this.a + ", it.start=" + this.b.q(this.c.getStart());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class z0 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z0(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fill method spend time ", Long.valueOf(this.a));
        }
    }

    public MenstruationDataManager(@NotNull AppExecutors appExecutors, @NotNull FemaleHealthWebApi femaleHealthWebApi, @NotNull FemaleHealthDb femaleHealthDb, @NotNull DeviceDataTransfer deviceDataTransfer, @NotNull SharedPreferencesUtils sharedPreferencesUtils) {
        this.executors = appExecutors;
        this.api = femaleHealthWebApi;
        this.db = femaleHealthDb;
        this.transfer = deviceDataTransfer;
        this.sp = sharedPreferencesUtils;
    }

    private final boolean d(List<Period> periods) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        boolean z2 = true;
        booleanRef.element = true;
        if (!(periods instanceof Collection) || !periods.isEmpty()) {
            Iterator<T> it2 = periods.iterator();
            do {
                if (!it2.hasNext()) {
                    z2 = false;
                    break;
                }
            } while (!(!((Period) it2.next()).getIsEnd()));
        } else {
            z2 = false;
            break;
        }
        if (z2) {
            booleanRef.element = false;
        }
        HMLog.debug("xys_MenstruationDataManager", new p(periods, booleanRef));
        return booleanRef.element;
    }

    private final boolean e(List<MenstruationDto>... lists) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (List<MenstruationDto> list : lists) {
            arrayList.addAll(list);
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!((MenstruationDto) it2.next()).m3360isEnd()) {
                    z2 = true;
                    break;
                }
            }
        }
        boolean z3 = !z2;
        HMLog.debug("xys_MenstruationDataManager", new q(lists, z3));
        return z3;
    }

    private final List<MenstruationDto> f(List<MenstruationDto> menstruationList, Date start, Date end, Long filledUpdateTime, boolean forceUpdateAllUT, boolean fromCache) {
        List list;
        List<MenstruationDto> list2;
        int size;
        List list3;
        Object next;
        int size2;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
        if ((menstruationList == null || menstruationList.isEmpty()) && start == null && end == null) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        String strH = h(start, end, menstruationList);
        List<MenstruationDto> list4 = h.get(strH);
        if (list4 != null && fromCache) {
            HMLog.warn$default("xys_MenstruationDataManager", null, r.a, 2, null);
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) CollectionsKt___CollectionsKt.plus((Collection) list4, (Iterable) menstruationList));
            if (forceUpdateAllUT && (size2 = mutableList.size()) > 0) {
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    ((MenstruationDto) mutableList.get(i2)).setUpdateTime(filledUpdateTime);
                    if (i3 >= size2) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return CollectionsKt___CollectionsKt.sortedWith(mutableList, new Comparator() { // from class: com.huami.femalehealth.logiclib.device.MenstruationDataManager$fill$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t2, T t3) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationDto) t2).getTime()), Long.valueOf(((MenstruationDto) t3).getTime()));
                }
            });
        }
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(menstruationList, new Comparator() { // from class: com.huami.femalehealth.logiclib.device.MenstruationDataManager$fill$$inlined$sortedBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationDto) t2).getTime()), Long.valueOf(((MenstruationDto) t3).getTime()));
            }
        });
        Long lValueOf = start == null ? null : Long.valueOf(start.getTime());
        long time = lValueOf == null ? ((MenstruationDto) CollectionsKt.first(listSortedWith)).getTime() : lValueOf.longValue();
        Long lValueOf2 = end == null ? null : Long.valueOf(end.getTime());
        long time2 = lValueOf2 == null ? ((MenstruationDto) CollectionsKt.last(listSortedWith)).getTime() : lValueOf2.longValue();
        List mutableList2 = CollectionsKt___CollectionsKt.toMutableList((Collection) menstruationList);
        List<MenstruationDto> mutableList3 = CollectionsKt___CollectionsKt.toMutableList((Collection) menstruationList);
        ArrayList arrayList = new ArrayList();
        long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(time, time2, 86400000L);
        if (time <= progressionLastElement) {
            while (true) {
                long j2 = 86400000 + time;
                Iterator it2 = listSortedWith.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list3 = listSortedWith;
                        next = null;
                        break;
                    }
                    next = it2.next();
                    list3 = listSortedWith;
                    if (Intrinsics.areEqual(i(((MenstruationDto) next).getTime(), simpleDateFormat), i(time, simpleDateFormat))) {
                        break;
                    }
                    listSortedWith = list3;
                }
                if (((MenstruationDto) next) == null && !arrayList.contains(i(time, simpleDateFormat))) {
                    MenstruationDto menstruationDto = new MenstruationDto(time, false, filledUpdateTime);
                    mutableList2.add(menstruationDto);
                    mutableList3.add(menstruationDto);
                    arrayList.add(i(time, simpleDateFormat));
                }
                if (time == progressionLastElement) {
                    break;
                }
                listSortedWith = list3;
                time = j2;
            }
        }
        if (!forceUpdateAllUT || (size = mutableList2.size()) <= 0) {
            list = mutableList2;
            list2 = mutableList3;
        } else {
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                list = mutableList2;
                list2 = mutableList3;
                list.set(i4, MenstruationDto.copy$default((MenstruationDto) mutableList2.get(i4), 0L, false, filledUpdateTime, 3, null));
                if (i5 >= size) {
                    break;
                }
                i4 = i5;
                mutableList2 = list;
                mutableList3 = list2;
            }
        }
        HMLog.debug("xys_MenstruationDataManager", new s(filledUpdateTime));
        h.put(strH, list2);
        return CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: com.huami.femalehealth.logiclib.device.MenstruationDataManager$fill$$inlined$sortedBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationDto) t2).getTime()), Long.valueOf(((MenstruationDto) t3).getTime()));
            }
        });
    }

    public static /* synthetic */ List g(MenstruationDataManager menstruationDataManager, List list, Date date, Date date2, Long l2, boolean z2, boolean z3, int i2, Object obj) {
        return menstruationDataManager.f(list, (i2 & 2) != 0 ? null : date, (i2 & 4) != 0 ? null : date2, (i2 & 8) != 0 ? null : l2, z2, (i2 & 32) != 0 ? false : z3);
    }

    private static final String h(Date date, Date date2, List<MenstruationDto> list) {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(((MenstruationDto) it2.next()).getTime()));
        }
        sb.append(CollectionsKt___CollectionsKt.joinToString$default(arrayList, " ", null, null, 0, null, null, 62, null));
        sb.append(date == null ? null : Long.valueOf(date.getTime()));
        sb.append(date2 != null ? Long.valueOf(date2.getTime()) : null);
        return sb.toString();
    }

    public static /* synthetic */ int handleMergeResult$default(MenstruationDataManager menstruationDataManager, MergeResult mergeResult, Boolean bool, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bool = null;
        }
        return menstruationDataManager.handleMergeResult(mergeResult, bool);
    }

    private static final String i(long j2, SimpleDateFormat simpleDateFormat) {
        return DateHelper.INSTANCE.convertUTCDateString(j2, simpleDateFormat);
    }

    private final MergeResult j(Period newPeriod, List<Period> dbPeriod, List<MenstruationDto> newData, List<MenstruationDto> dbData, boolean keepAllWhenHeadNeighbor) {
        Object next;
        Object obj;
        Object next2;
        Object next3;
        Object next4;
        Period period;
        Period period2;
        Object next5;
        Object next6;
        MenstruationDto menstruationDto;
        Period period3;
        HMLog.verbose("xys_MenstruationDataManager", new t(newData, dbData));
        MergeResult mergeResult = new MergeResult();
        Iterator<T> it2 = dbPeriod.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            period3 = (Period) next;
        } while (!(newPeriod.getStart() > period3.getEnd() && newPeriod.getStart() <= DateHelperKt.offset(new Date(period3.getEnd()), 2).getTime()));
        Period period4 = (Period) next;
        Iterator<T> it3 = dbPeriod.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            Object next7 = it3.next();
            Period period5 = (Period) next7;
            if (newPeriod.getEnd() >= DateHelperKt.offset(new Date(period5.getStart()), -2).getTime() && newPeriod.getEnd() < period5.getStart()) {
                obj = next7;
                break;
            }
        }
        Period period6 = (Period) obj;
        if (period4 != null) {
            Iterator<T> it4 = dbPeriod.iterator();
            do {
                if (!it4.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it4.next();
            } while (!(newPeriod.getStart() == DateHelperKt.offset(new Date(((Period) next5).getStart()), -1).getTime()));
            Period period7 = (Period) next5;
            boolean z2 = period7 != null;
            HMLog.verbose("xys_MenstruationDataManager", new u(z2));
            if (z2) {
                long start = period4.getStart();
                long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(start, period7.getEnd(), 86400000L);
                if (start <= progressionLastElement) {
                    while (true) {
                        long j2 = start + 86400000;
                        List<MenstruationDto> toAdd = mergeResult.getToAdd();
                        MenstruationDto menstruationDto2 = new MenstruationDto(start, true, null, 4, null);
                        menstruationDto2.setEnd(Boolean.valueOf(d(CollectionsKt__CollectionsKt.listOf((Object[]) new Period[]{period4, period7}))));
                        Unit unit = Unit.INSTANCE;
                        toAdd.add(menstruationDto2);
                        Iterator<T> it5 = dbData.iterator();
                        do {
                            if (!it5.hasNext()) {
                                next6 = null;
                                break;
                            }
                            next6 = it5.next();
                            menstruationDto = (MenstruationDto) next6;
                        } while (!(menstruationDto.getTime() == start && menstruationDto.getInPeriod()));
                        MenstruationDto menstruationDto3 = (MenstruationDto) next6;
                        if (menstruationDto3 != null) {
                            mergeResult.getToDel().add(menstruationDto3);
                            Unit unit2 = Unit.INSTANCE;
                        }
                        if (start == progressionLastElement) {
                            break;
                        }
                        start = j2;
                    }
                }
            } else {
                long end = keepAllWhenHeadNeighbor ? newPeriod.getEnd() : newPeriod.getStart();
                long end2 = period4.getEnd() + 86400000;
                long progressionLastElement2 = ProgressionUtilKt.getProgressionLastElement(end2, end, 86400000L);
                if (end2 <= progressionLastElement2) {
                    while (true) {
                        long j3 = end2 + 86400000;
                        mergeResult.getToAdd().add(new MenstruationDto(end2, true, null, 4, null));
                        if (end2 == progressionLastElement2) {
                            break;
                        }
                        end2 = j3;
                    }
                }
                mergeResult.setToModify(Period.copy$default(period4, 0L, 0L, 0L, 7, null));
                mergeResult.getToModify().setNewStart(Long.valueOf(period4.getStart()));
                mergeResult.getToModify().setNewEnd(Long.valueOf(end));
                mergeResult.getToModify().setSId(period4.getSId());
                mergeResult.getToModify().setEnd(period4.getIsEnd());
            }
        } else if (period6 != null) {
            HMLog.verbose("xys_MenstruationDataManager", v.a);
            LongProgression longProgressionStep = kotlin.ranges.e.step(kotlin.ranges.e.until(newPeriod.getStart(), period6.getStart()), 86400000L);
            long first = longProgressionStep.getFirst();
            long last = longProgressionStep.getLast();
            long step = longProgressionStep.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    long j4 = first + step;
                    mergeResult.getToAdd().add(new MenstruationDto(first, true, null, 4, null));
                    if (first == last) {
                        break;
                    }
                    first = j4;
                }
            }
            mergeResult.setToModify(Period.copy$default(period6, 0L, 0L, 0L, 7, null));
            mergeResult.getToModify().setNewStart(Long.valueOf(newPeriod.getStart()));
            mergeResult.getToModify().setNewEnd(Long.valueOf(period6.getEnd()));
            mergeResult.getToModify().setSId(period6.getSId());
            mergeResult.getToModify().setEnd(d(CollectionsKt__CollectionsKt.listOf((Object[]) new Period[]{newPeriod, period6})));
        } else {
            HMLog.verbose("xys_MenstruationDataManager", w.a);
            Iterator<T> it6 = dbPeriod.iterator();
            do {
                if (!it6.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it6.next();
                period2 = (Period) next2;
            } while (!(period2.getStart() <= newPeriod.getStart() && period2.getEnd() >= newPeriod.getStart()));
            Period period8 = (Period) next2;
            Iterator<T> it7 = dbPeriod.iterator();
            do {
                if (!it7.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it7.next();
                period = (Period) next3;
            } while (!(period.getStart() <= newPeriod.getEnd() && period.getEnd() >= newPeriod.getEnd()));
            Period period9 = (Period) next3;
            long start2 = period8 == null ? newPeriod.getStart() : period8.getStart();
            long end3 = period9 == null ? newPeriod.getEnd() : period9.getEnd();
            List<MenstruationDto> toDel = mergeResult.getToDel();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : dbData) {
                long time = ((MenstruationDto) obj2).getTime();
                if (start2 <= time && time <= end3) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                if (((MenstruationDto) obj3).getInPeriod()) {
                    arrayList2.add(obj3);
                }
            }
            toDel.addAll(arrayList2);
            List<MenstruationDto> toAdd2 = mergeResult.getToAdd();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : newData) {
                long time2 = ((MenstruationDto) obj4).getTime();
                if (start2 <= time2 && time2 <= end3) {
                    arrayList3.add(obj4);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj5 : arrayList3) {
                if (((MenstruationDto) obj5).getInPeriod()) {
                    arrayList4.add(obj5);
                }
            }
            toAdd2.addAll(arrayList4);
            List list = CollectionsKt___CollectionsKt.toList(mergeResult.getToAdd());
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) dbData);
            ArrayList arrayList5 = new ArrayList();
            for (Object obj6 : mutableList) {
                long time3 = ((MenstruationDto) obj6).getTime();
                if (start2 <= time3 && time3 <= end3) {
                    arrayList5.add(obj6);
                }
            }
            ArrayList arrayList6 = new ArrayList();
            for (Object obj7 : arrayList5) {
                if (((MenstruationDto) obj7).getInPeriod()) {
                    arrayList6.add(obj7);
                }
            }
            List<MenstruationDto> toAdd3 = mergeResult.getToAdd();
            ArrayList arrayList7 = new ArrayList();
            for (Object obj8 : arrayList6) {
                MenstruationDto menstruationDto4 = (MenstruationDto) obj8;
                Iterator it8 = list.iterator();
                do {
                    if (!it8.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it8.next();
                } while (!(((MenstruationDto) next4).getTime() == menstruationDto4.getTime()));
                if (next4 == null) {
                    arrayList7.add(obj8);
                }
            }
            toAdd3.addAll(arrayList7);
            boolean zE = e(newData, arrayList6);
            Iterator<T> it9 = mergeResult.getToAdd().iterator();
            while (it9.hasNext()) {
                ((MenstruationDto) it9.next()).setEnd(Boolean.valueOf(zE));
            }
        }
        return mergeResult;
    }

    private final Pair<Date, Date> k(List<MenstruationDto> data, Integer expand) {
        long jLongValue;
        long jLongValue2;
        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(data, new Comparator() { // from class: com.huami.femalehealth.logiclib.device.MenstruationDataManager$findDateRange$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationDto) t2).getTime()), Long.valueOf(((MenstruationDto) t3).getTime()));
            }
        });
        MenstruationDto menstruationDto = (MenstruationDto) CollectionsKt.firstOrNull(listSortedWith);
        MenstruationDto menstruationDto2 = (MenstruationDto) CollectionsKt.lastOrNull(listSortedWith);
        Long lValueOf = menstruationDto == null ? null : Long.valueOf(menstruationDto.getTime());
        if (lValueOf == null) {
            jLongValue = new Date().getTime() - (((long) (expand == null ? 0 : expand.intValue())) * 86400000);
        } else {
            jLongValue = lValueOf.longValue();
        }
        Date date = new Date(jLongValue);
        Long lValueOf2 = menstruationDto2 != null ? Long.valueOf(menstruationDto2.getTime()) : null;
        if (lValueOf2 == null) {
            jLongValue2 = new Date().getTime() + (((long) (expand != null ? expand.intValue() : 0)) * 86400000);
        } else {
            jLongValue2 = lValueOf2.longValue();
        }
        return new Pair<>(date, new Date(jLongValue2));
    }

    public static /* synthetic */ Pair l(MenstruationDataManager menstruationDataManager, List list, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = 0;
        }
        return menstruationDataManager.k(list, num);
    }

    private final long m(boolean resetHour) {
        return DateHelper.offsetDayGetCalendar$default(DateHelper.INSTANCE, -150, 0L, resetHour, 2, null).getTimeInMillis();
    }

    public static /* synthetic */ long n(MenstruationDataManager menstruationDataManager, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return menstruationDataManager.m(z2);
    }

    @WorkerThread
    private final List<HistoryItemBean> o(int limit) {
        List<HistoryItemBean> listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        HMLog.debug("xys_MenstruationDataManager", new m0(limit));
        ApiResponse apiResponseLoadHistory$default = DataCacheManager.loadHistory$default(DataCacheManager.INSTANCE, limit, null, null, false, 12, null);
        if (apiResponseLoadHistory$default instanceof ApiSuccessResponse) {
            return ((Items) ((ApiSuccessResponse) apiResponseLoadHistory$default).getBody()).getItems();
        }
        if (apiResponseLoadHistory$default instanceof ApiErrorResponse) {
            HMLog.warn$default("xys_MenstruationDataManager", null, new n0(apiResponseLoadHistory$default), 2, null);
            return listEmptyList;
        }
        HMLog.warn$default("xys_MenstruationDataManager", null, o0.a, 2, null);
        return listEmptyList;
    }

    private final MergeResult p(List<MenstruationDto> deviceData, List<MenstruationDto> dbData) {
        List<Period> listScanToFindPeriods = scanToFindPeriods(deviceData);
        HMLog.info(TAG, new s0(listScanToFindPeriods));
        List<Period> listScanToFindPeriods2 = scanToFindPeriods(dbData);
        List<DeletedMenstruationSection> listFindAll = this.db.deleteHistoryDao().findAll();
        HMLog.info(TAG, new t0(listFindAll));
        Iterator<Period> it2 = listScanToFindPeriods.iterator();
        if ((!listScanToFindPeriods.isEmpty()) && (!listFindAll.isEmpty())) {
            for (DeletedMenstruationSection deletedMenstruationSection : listFindAll) {
                while (it2.hasNext()) {
                    Period next = it2.next();
                    if (next.getStart() == deletedMenstruationSection.getStartTime() && next.getEnd() == deletedMenstruationSection.getEndTime() && deletedMenstruationSection.getUpdateTime() != null && next.getUpdateTime() <= deletedMenstruationSection.getUpdateTime().longValue()) {
                        it2.remove();
                    }
                }
            }
        }
        HMLog.info(TAG, new u0(listScanToFindPeriods));
        return findConflictWithDevData(listScanToFindPeriods, listScanToFindPeriods2, deviceData, dbData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String q(long date) {
        return DateHelper.convertUTCDate$default(DateHelper.INSTANCE, date, false, 2, null);
    }

    private final void r(List<MenstruationDto> dtoList) {
        Object next;
        Object next2;
        Iterator<T> it2 = dtoList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                long time = ((MenstruationDto) next).getTime();
                do {
                    Object next3 = it2.next();
                    long time2 = ((MenstruationDto) next3).getTime();
                    if (time > time2) {
                        next = next3;
                        time = time2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        MenstruationDto menstruationDto = (MenstruationDto) next;
        Long lValueOf = menstruationDto == null ? null : Long.valueOf(menstruationDto.getTime());
        long jN = lValueOf == null ? n(this, false, 1, null) : lValueOf.longValue();
        Iterator<T> it3 = dtoList.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                long time3 = ((MenstruationDto) next2).getTime();
                do {
                    Object next4 = it3.next();
                    long time4 = ((MenstruationDto) next4).getTime();
                    if (time3 < time4) {
                        next2 = next4;
                        time3 = time4;
                    }
                } while (it3.hasNext());
            }
        } else {
            next2 = null;
        }
        MenstruationDto menstruationDto2 = (MenstruationDto) next2;
        Long lValueOf2 = menstruationDto2 != null ? Long.valueOf(menstruationDto2.getTime()) : null;
        if (lValueOf2 != null) {
            this.mDevDateRange = new Pair<>(new Date(jN), new Date(lValueOf2.longValue()));
            HMLog.info("xys_MenstruationDataManager", new b1(jN, lValueOf2));
        }
    }

    private final void s(MenstruationTotalDto dto) {
        Object next;
        Object next2;
        if (dto != null) {
            SharedPreferencesUtils sp = getSp();
            Iterator<T> it2 = dto.getRecords().iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    long time = ((MenstruationDto) next).getTime();
                    do {
                        Object next3 = it2.next();
                        long time2 = ((MenstruationDto) next3).getTime();
                        if (time > time2) {
                            next = next3;
                            time = time2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            MenstruationDto menstruationDto = (MenstruationDto) next;
            Long lValueOf = menstruationDto == null ? null : Long.valueOf(menstruationDto.getTime());
            sp.setDeviceDateRangeMin(lValueOf == null ? n(this, false, 1, null) : lValueOf.longValue());
            SharedPreferencesUtils sp2 = getSp();
            long deviceDateRangeMax = getSp().getDeviceDateRangeMax();
            Iterator<T> it3 = dto.getRecords().iterator();
            if (it3.hasNext()) {
                next2 = it3.next();
                if (it3.hasNext()) {
                    long time3 = ((MenstruationDto) next2).getTime();
                    do {
                        Object next4 = it3.next();
                        long time4 = ((MenstruationDto) next4).getTime();
                        if (time3 < time4) {
                            next2 = next4;
                            time3 = time4;
                        }
                    } while (it3.hasNext());
                }
            } else {
                next2 = null;
            }
            MenstruationDto menstruationDto2 = (MenstruationDto) next2;
            Long lValueOf2 = menstruationDto2 != null ? Long.valueOf(menstruationDto2.getTime()) : null;
            sp2.setDeviceDateRangeMax(Math.max(deviceDateRangeMax, lValueOf2 == null ? System.currentTimeMillis() : lValueOf2.longValue()));
        }
        HMLog.info("xys_MenstruationDataManager", new c1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(MenstruationDataManager menstruationDataManager, MenstruationConfigDto menstruationConfigDto, DeviceCallback deviceCallback) {
        menstruationDataManager.transfer.writeConfigToDevice(menstruationConfigDto, deviceCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(MenstruationDataManager menstruationDataManager, List list, DeviceCallback deviceCallback) {
        menstruationDataManager.transfer.writeRecentToDevice(list, deviceCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(MenstruationTotalDto menstruationTotalDto, MenstruationDataManager menstruationDataManager, MenstruationDataManager$writeToDevice$localCallback$1 menstruationDataManager$writeToDevice$localCallback$1) {
        MenstruationTotalDto menstruationTotalDto2;
        if (menstruationTotalDto == null) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(AidKt.resetZeroHour(new Date()));
            calendar.add(5, 1);
            long jCurrentTimeMillis = System.currentTimeMillis();
            ArrayList arrayList = new ArrayList(150);
            for (int i2 = 0; i2 < 150; i2++) {
                calendar.add(5, -1);
                arrayList.add(new MenstruationDto(calendar.getTimeInMillis(), false, Long.valueOf(jCurrentTimeMillis)));
            }
            List listReversed = CollectionsKt___CollectionsKt.reversed(arrayList);
            byte b2 = menstruationDataManager.mFwVersion;
            byte cycleLen = (byte) menstruationDataManager.getSp().getCycleLen();
            byte periodLen = (byte) menstruationDataManager.getSp().getPeriodLen();
            MenstruationDto menstruationDto = (MenstruationDto) CollectionsKt.firstOrNull(listReversed);
            menstruationTotalDto2 = new MenstruationTotalDto(b2, cycleLen, periodLen, 0L, 0L, menstruationDto != null ? menstruationDto.getTime() : 0L, listReversed.size(), listReversed);
        } else {
            menstruationTotalDto2 = menstruationTotalDto;
        }
        menstruationDataManager.transfer.writeToDevice(menstruationTotalDto2, menstruationDataManager$writeToDevice$localCallback$1);
        menstruationDataManager.db.deleteHistoryDao().clearAll();
    }

    public static /* synthetic */ void writeConfigToDevice$default(MenstruationDataManager menstruationDataManager, MenstruationConfigDto menstruationConfigDto, DeviceCallback deviceCallback, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            deviceCallback = null;
        }
        menstruationDataManager.writeConfigToDevice(menstruationConfigDto, deviceCallback);
    }

    public static /* synthetic */ void writeRecentToDevice$default(MenstruationDataManager menstruationDataManager, DeviceCallback deviceCallback, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            deviceCallback = null;
        }
        menstruationDataManager.writeRecentToDevice(deviceCallback);
    }

    public static /* synthetic */ void writeToDevice$default(MenstruationDataManager menstruationDataManager, MenstruationTotalDto menstruationTotalDto, DeviceCallback deviceCallback, boolean z2, DeviceCallback deviceCallback2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            deviceCallback = null;
        }
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        if ((i2 & 8) != 0) {
            deviceCallback2 = null;
        }
        menstruationDataManager.writeToDevice(menstruationTotalDto, deviceCallback, z2, deviceCallback2);
    }

    public final void addConfFromDevice(@NotNull MenstruationConfigDto config) {
        HMLog.info("xys_MenstruationDataManager", new a(config));
    }

    public final void addDataFromDevice(@Nullable MenstruationTotalDto data) {
        if (data != null) {
            r(data.getRecords());
            this.mFwVersion = data.getVersion();
        }
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new b(data, null), 2, null);
    }

    @Nullable
    public final Pair<Date, Date> calcCurrMenstruationDelPart(boolean isEdit, boolean isAddCoverTodayConsiderToday, @NotNull Date start, @NotNull Date end, int keepDuration) {
        Date date = AidKt.toDate(DateHelper.nowDate$default(DateHelper.INSTANCE, 0L, 1, null));
        HistoryItemBean historyItemBeanQueryLastMenstruation2 = MenstruationSearchRepo.INSTANCE.queryLastMenstruation2(date);
        boolean zContains = historyItemBeanQueryLastMenstruation2 == null ? false : DtoExKt.contains(historyItemBeanQueryLastMenstruation2, date);
        HMLog.info("xys_MenstruationDataManager", new c(isEdit, isAddCoverTodayConsiderToday, start, end, keepDuration));
        if ((historyItemBeanQueryLastMenstruation2 != null && zContains && isAddCoverTodayConsiderToday) || isEdit) {
            Date dateMax = DateHelperKt.max(end, historyItemBeanQueryLastMenstruation2.getMenstrualEndTime().longValue());
            Date dateMin = DateHelperKt.min(start, historyItemBeanQueryLastMenstruation2.getMenstrualPeriod());
            Date dateMin2 = DateHelperKt.min(dateMax, DateHelperKt.offset(dateMin, keepDuration - 1));
            HMLog.info("xys_MenstruationDataManager", new d(dateMin, dateMax, dateMin2));
            if (dateMin2.before(dateMax)) {
                Date dateMax2 = DateHelperKt.max(DateHelperKt.offset(date, 1), DateHelperKt.offset(dateMin2, 1));
                Date dateMax3 = DateHelperKt.max(DateHelperKt.offset(date, 1), dateMax);
                HMLog.info("xys_MenstruationDataManager", new e(dateMax2, dateMax3));
                return new Pair<>(dateMax2, dateMax3);
            }
        }
        return null;
    }

    public final boolean cloudDeleteHistory(@NotNull String sId, @NotNull DeleteType type) {
        HMLog.info("xys_MenstruationDataManager", new f(sId));
        if (this.api.deleteMenstruation(sId, type) instanceof ApiSuccessResponse) {
            HMLog.info("xys_MenstruationDataManager", g.a);
            return true;
        }
        HMLog.error$default("xys_MenstruationDataManager", null, null, h.a, 6, null);
        return false;
    }

    @WorkerThread
    public final boolean cloudModifyHistory(@NotNull String sId, @NotNull Date start, @NotNull Date end, @Nullable Boolean isEnd) {
        String id;
        MenstruationRecordBean menstruationRecordBean = new MenstruationRecordBean((Integer) null, (Integer) null, (String) null, (Long) null, (Long) null, (Long) null, (String) null, (Long) null, 255, (DefaultConstructorMarker) null);
        boolean isEnd2 = isEnd == null ? MenstruationSearchRepo.INSTANCE.getIsEnd(sId) : isEnd.booleanValue();
        menstruationRecordBean.setId(sId);
        menstruationRecordBean.setMenstrualPeriod(Long.valueOf(start.getTime()));
        menstruationRecordBean.setMenstrualEndTime(Long.valueOf(end.getTime()));
        menstruationRecordBean.setMonth(Long.valueOf(DateHelperKt.getMonthDate(start).getTime()));
        menstruationRecordBean.setEnd(Integer.valueOf(MenstruationRecordBean.INSTANCE.endInt(isEnd2)));
        menstruationRecordBean.setCycle(0);
        HMLog.info("xys_MenstruationDataManager", new i(menstruationRecordBean));
        ApiResponse<MenstruationRecordBean> apiResponseMenstruationEdit = this.api.menstruationEdit(menstruationRecordBean);
        if (!(apiResponseMenstruationEdit instanceof ApiSuccessResponse)) {
            HMLog.error$default("xys_MenstruationDataManager", null, null, new j(apiResponseMenstruationEdit), 6, null);
            return false;
        }
        MenstruationRecordBean menstruationRecordBean2 = (MenstruationRecordBean) ((ApiSuccessResponse) apiResponseMenstruationEdit).getBody();
        if (Intrinsics.areEqual(menstruationRecordBean2.getEnd(), menstruationRecordBean.getEnd()) || (id = menstruationRecordBean2.getId()) == null) {
            return true;
        }
        this.api.menstruationEndClick(id, isEnd2);
        return true;
    }

    public final boolean cloudUploadHistory(@NotNull Date start, @NotNull Date end, boolean isEnd) {
        int iDiff;
        HMLog.info("xys_MenstruationDataManager", new k(start, end, isEnd));
        HistoryItemBean historyItemBeanQueryLastMenstruation2 = MenstruationSearchRepo.INSTANCE.queryLastMenstruation2(DateHelperKt.offset(start, -1));
        if (historyItemBeanQueryLastMenstruation2 == null || (iDiff = DateHelperKt.diff(start, new Date(historyItemBeanQueryLastMenstruation2.getMenstrualEndTime().longValue()))) <= 0) {
            iDiff = 0;
        }
        MenstruationRecordBean menstruationRecordBean = new MenstruationRecordBean((Integer) null, (Integer) null, (String) null, (Long) null, (Long) null, (Long) null, (String) null, (Long) null, 255, (DefaultConstructorMarker) null);
        menstruationRecordBean.setMenstrualPeriod(Long.valueOf(start.getTime()));
        menstruationRecordBean.setMenstrualEndTime(Long.valueOf(end.getTime()));
        menstruationRecordBean.setCycle(Integer.valueOf(iDiff));
        menstruationRecordBean.setMonth(Long.valueOf(DateHelperKt.getMonthDate(start).getTime()));
        menstruationRecordBean.setEnd(isEnd ? 1 : 0);
        ApiResponse<MenstruationRecordBean> apiResponseMenstruationBegin = this.api.menstruationBegin(menstruationRecordBean);
        if (apiResponseMenstruationBegin instanceof ApiSuccessResponse) {
            HMLog.info("xys_MenstruationDataManager", new l((MenstruationRecordBean) ((ApiSuccessResponse) apiResponseMenstruationBegin).getBody()));
            return true;
        }
        HMLog.error$default("xys_MenstruationDataManager", null, null, m.a, 6, null);
        return false;
    }

    @Nullable
    public final MenstruationTotalDto createInitMenstruationTotalDto() {
        HistoryItemBean historyItemBeanQueryLastMenstruation2 = MenstruationSearchRepo.INSTANCE.queryLastMenstruation2(DateHelper.INSTANCE.today().getTime());
        if (historyItemBeanQueryLastMenstruation2 == null) {
            HMLog.warn$default("xys_MenstruationDataManager", null, n.a, 2, null);
            return null;
        }
        List<MenstruationDto> menstruationDtoList = DtoExKt.toMenstruationDtoList(historyItemBeanQueryLastMenstruation2);
        byte mFwVersion = getMFwVersion();
        byte cycleLen = (byte) this.sp.getCycleLen();
        byte periodLen = (byte) this.sp.getPeriodLen();
        Long lValueOf = Long.valueOf(historyItemBeanQueryLastMenstruation2.getMenstrualPeriod());
        Long menstrualEndTime = historyItemBeanQueryLastMenstruation2.getMenstrualEndTime();
        MenstruationTotalDto menstruationTotalDto = new MenstruationTotalDto(mFwVersion, cycleLen, periodLen, lValueOf, Long.valueOf(menstrualEndTime == null ? 0L : menstrualEndTime.longValue()), historyItemBeanQueryLastMenstruation2.getMenstrualPeriod(), menstruationDtoList.size(), menstruationDtoList);
        HMLog.info("xys_MenstruationDataManager", new o(menstruationTotalDto));
        return menstruationTotalDto;
    }

    @WorkerThread
    public final void doAddDataFromDevice(@Nullable MenstruationTotalDto data, @Nullable Boolean write) {
        if (data == null || !(!data.getRecords().isEmpty())) {
            if (write == null || !write.booleanValue()) {
                return;
            }
            writeToDevice$default(this, getInitTotalDtoForFw(), null, false, null, 14, null);
            return;
        }
        List<MenstruationDto> listG = g(this, data.getRecords(), null, null, null, false, false, 46, null);
        Pair<Date, Date> pairK = k(listG, 2);
        List<MenstruationRecord> listFindByDateRangeKeepComplete = MenstruationSearchRepo.INSTANCE.findByDateRangeKeepComplete(pairK.getFirst(), pairK.getSecond());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindByDateRangeKeepComplete, 10));
        Iterator<T> it2 = listFindByDateRangeKeepComplete.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoExKt.toMenstruationDto((MenstruationRecord) it2.next()));
        }
        handleMergeResult$default(this, p(listG, g(this, arrayList, null, null, null, false, false, 46, null)), null, 2, null);
        if (write == null || !write.booleanValue()) {
            return;
        }
        writeToDevice$default(this, prepareMenstruationTotalData(), null, false, null, 14, null);
    }

    @NotNull
    public final List<MenstruationDto> findBelongPeriod(long dateTime, @NotNull List<MenstruationDto> dtoList) {
        Object obj;
        Object next;
        int size;
        int i2;
        if (!dtoList.isEmpty()) {
            Iterator<T> it2 = dtoList.iterator();
            do {
                obj = null;
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((MenstruationDto) next).getTime() == dateTime));
            if (next != null) {
                for (Object obj2 : dtoList) {
                    if (((MenstruationDto) obj2).getTime() == dateTime) {
                        obj = obj2;
                        break;
                    }
                }
                if (((MenstruationDto) obj).getInPeriod()) {
                    List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(dtoList, new Comparator() { // from class: com.huami.femalehealth.logiclib.device.MenstruationDataManager$findBelongPeriod$$inlined$sortedBy$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t2, T t3) {
                            return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationDto) t2).getTime()), Long.valueOf(((MenstruationDto) t3).getTime()));
                        }
                    });
                    Iterator it3 = listSortedWith.iterator();
                    int i3 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        if (((MenstruationDto) it3.next()).getTime() == dateTime) {
                            break;
                        }
                        i3++;
                    }
                    int size2 = listSortedWith.size();
                    if (i3 >= size2) {
                        size = -1;
                        break;
                    }
                    size = i3;
                    while (true) {
                        int i4 = size + 1;
                        if (!((MenstruationDto) listSortedWith.get(size)).getInPeriod()) {
                            break;
                        }
                        if (i4 >= size2) {
                            size = -1;
                            break;
                        }
                        size = i4;
                    }
                    if (size == -1) {
                        size = listSortedWith.size();
                    }
                    if (i3 < 0) {
                        i2 = -1;
                        break;
                    }
                    while (true) {
                        int i5 = i3 - 1;
                        if (!((MenstruationDto) listSortedWith.get(i3)).getInPeriod()) {
                            i2 = i3 + 1;
                            break;
                        }
                        if (i5 < 0) {
                            i2 = -1;
                            break;
                        }
                        i3 = i5;
                    }
                    int i6 = i2 != -1 ? i2 : 0;
                    return (i6 < 0 || size > listSortedWith.size() || i6 >= size) ? CollectionsKt__CollectionsKt.emptyList() : listSortedWith.subList(i6, size);
                }
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public final MergeResult findConflictWithDevData(@NotNull List<Period> devPairs, @NotNull List<Period> dbPairs, @NotNull List<MenstruationDto> deviceData, @NotNull List<MenstruationDto> dbData) {
        HMLog.info("xys_MenstruationDataManager", x.a);
        MergeResult mergeResult = new MergeResult();
        List<Period> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(devPairs, new Comparator() { // from class: com.huami.femalehealth.logiclib.device.MenstruationDataManager$findConflictWithDevData$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationDataManager.Period) t3).getUpdateTime()), Long.valueOf(((MenstruationDataManager.Period) t2).getUpdateTime()));
            }
        });
        List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(dbPairs, new Comparator() { // from class: com.huami.femalehealth.logiclib.device.MenstruationDataManager$findConflictWithDevData$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationDataManager.Period) t3).getUpdateTime()), Long.valueOf(((MenstruationDataManager.Period) t2).getUpdateTime()));
            }
        });
        for (Period period : listSortedWith) {
            long start = period.getStart();
            long end = period.getEnd();
            Iterator it2 = listSortedWith2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    if (period.getAction() != Action.NO_ACTION) {
                        break;
                    }
                    HMLog.info("xys_MenstruationDataManager", new y(period));
                    period.setAction(Action.ADD);
                    break;
                }
                Period period2 = (Period) it2.next();
                Action action = period2.getAction();
                Action action2 = Action.DELETE;
                if (action != action2) {
                    if (period.getAction() == action2) {
                        break;
                    }
                    long j2 = start - 172800000;
                    long progressionLastElement = ProgressionUtilKt.getProgressionLastElement(j2, end + 172800000, 86400000L);
                    if (j2 <= progressionLastElement) {
                        while (true) {
                            long j3 = j2 + 86400000;
                            long jResetZeroHour = AidKt.resetZeroHour(j2);
                            if (jResetZeroHour >= period2.getStart() && jResetZeroHour <= period2.getEnd()) {
                                if (period.getUpdateTime() <= period2.getUpdateTime()) {
                                    period2.setAction(Action.ADD);
                                    period.setAction(Action.DELETE);
                                    break;
                                }
                                period.setAction(Action.ADD);
                                period2.setAction(Action.DELETE);
                                break;
                            }
                            if (j2 == progressionLastElement) {
                                break;
                            }
                            j2 = j3;
                        }
                    }
                }
            }
        }
        ArrayList<Period> arrayList = new ArrayList();
        Iterator<T> it3 = devPairs.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (((Period) next).getAction() == Action.ADD) {
                arrayList.add(next);
            }
        }
        for (Period period3 : arrayList) {
            List<MenstruationDto> listFindBelongPeriod = findBelongPeriod(period3.getStart(), deviceData);
            HMLog.debug("xys_MenstruationDataManager", new z(listFindBelongPeriod, this, period3));
            mergeResult.getToAdd().addAll(listFindBelongPeriod);
        }
        ArrayList<Period> arrayList2 = new ArrayList();
        for (Object obj : dbPairs) {
            if (((Period) obj).getAction() == Action.DELETE) {
                arrayList2.add(obj);
            }
        }
        for (Period period4 : arrayList2) {
            List<MenstruationDto> listFindBelongPeriod2 = findBelongPeriod(period4.getStart(), dbData);
            HMLog.debug("xys_MenstruationDataManager", new a0(listFindBelongPeriod2, this, period4));
            mergeResult.getToDel().addAll(listFindBelongPeriod2);
        }
        return mergeResult;
    }

    @NotNull
    public final Calendar getFemaleDataSyncTime() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.sp.getSyncTime());
        return calendar;
    }

    /* JADX INFO: renamed from: getFwVer, reason: from getter */
    public final byte getMFwVersion() {
        return this.mFwVersion;
    }

    @Nullable
    public final MenstruationTotalDto getInitTotalDtoForFw() {
        List<MenstruationRecord> listFindAll = MenstruationSearchRepo.INSTANCE.findAll();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindAll, 10));
        Iterator<T> it2 = listFindAll.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoExKt.toMenstruationDto((MenstruationRecord) it2.next()));
        }
        Map<Section, List<MenstruationDto>> mapScanToFindSections = scanToFindSections(arrayList);
        if (mapScanToFindSections.isEmpty()) {
            return null;
        }
        return mapScanToFindSections.size() == 1 ? createInitMenstruationTotalDto() : prepareMenstruationTotalData();
    }

    @NotNull
    public final SharedPreferencesUtils getSp() {
        return this.sp;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0263  */
    /* JADX WARN: Code duplicated, block: B:95:0x02fb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v49, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v66, types: [T, java.lang.String] */
    public final int handleMergeResult(@NotNull MergeResult mergeResult, @Nullable Boolean isEnd) {
        boolean z2;
        boolean z3;
        String sId;
        HMLog.info("xys_MenstruationDataManager", new e0(mergeResult, isEnd));
        HashMap map = new HashMap();
        List listPlus = CollectionsKt___CollectionsKt.plus((Collection) mergeResult.getToAdd(), (Iterable) mergeResult.getToDel());
        ArrayList arrayList = new ArrayList();
        Iterator it2 = listPlus.iterator();
        while (it2.hasNext()) {
            String sId2 = ((MenstruationDto) it2.next()).getSId();
            if (sId2 != null) {
                arrayList.add(sId2);
            }
        }
        Iterator it3 = CollectionsKt___CollectionsKt.toList(CollectionsKt___CollectionsKt.toSet(arrayList)).iterator();
        while (it3.hasNext()) {
            ApiResponse<List<HistoryDetailBean>> apiResponseLoadHistoryDetail = DataCacheManager.INSTANCE.loadHistoryDetail((String) it3.next());
            if (apiResponseLoadHistoryDetail instanceof ApiSuccessResponse) {
                for (HistoryDetailBean historyDetailBean : (Iterable) ((ApiSuccessResponse) apiResponseLoadHistoryDetail).getBody()) {
                    map.put(Long.valueOf(AidKt.resetZeroHour(historyDetailBean.getMenstruationTime())), new Triple(historyDetailBean.getPain(), historyDetailBean.getBlood(), historyDetailBean.getMood()));
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        Ref.IntRef intRef = new Ref.IntRef();
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        long jResetZeroHour = AidKt.resetZeroHour(DateHelper.INSTANCE.today().getTime().getTime());
        if (mergeResult.getToModify() != null) {
            HMLog.debug("xys_MenstruationDataManager", f0.a);
            Period toModify = mergeResult.getToModify();
            if (toModify != null && (sId = toModify.getSId()) != null) {
                booleanRef.element = cloudModifyHistory(sId, new Date(mergeResult.getToModify().getNewStart().longValue()), new Date(mergeResult.getToModify().getNewEnd().longValue()), Boolean.valueOf(isEnd == null ? mergeResult.getToModify().getIsEnd() : isEnd.booleanValue()));
                Unit unit2 = Unit.INSTANCE;
            }
        } else if ((!mergeResult.getToDel().isEmpty()) && (!mergeResult.getToAdd().isEmpty())) {
            Iterator<T> it4 = scanToFindSections(mergeResult.getToDel()).entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry entry = (Map.Entry) it4.next();
                Date date = new Date(((Section) entry.getKey()).getStart());
                long j2 = jResetZeroHour;
                Date date2 = new Date(((Section) entry.getKey()).getEnd());
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = MenstruationSearchRepo.INSTANCE.findMenstruationServerId(date, date2);
                HMLog.debug("xys_MenstruationDataManager", new g0(objectRef));
                try {
                    if (objectRef.element == 0) {
                        objectRef.element = ((MenstruationDto) ((List) entry.getValue()).get(0)).getSId();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                HMLog.debug("xys_MenstruationDataManager", new h0(date, date2, objectRef, entry));
                T t2 = objectRef.element;
                if (t2 == 0) {
                    intRef.element = 2;
                    HMLog.error$default("xys_MenstruationDataManager", null, null, i0.a, 6, null);
                    return intRef.element;
                }
                booleanRef.element = booleanRef.element && cloudDeleteHistory((String) t2, DeleteType.TYPE_MERGE);
                jResetZeroHour = j2;
            }
            long j3 = jResetZeroHour;
            HMLog.debug("xys_MenstruationDataManager", j0.a);
            Iterator it5 = scanToFindSections(mergeResult.getToAdd()).entrySet().iterator();
            while (it5.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it5.next();
                Date date3 = new Date(((Section) entry2.getKey()).getStart());
                Date date4 = new Date(((Section) entry2.getKey()).getEnd());
                MenstruationDto menstruationDto = (MenstruationDto) CollectionsKt.firstOrNull((List) entry2.getValue());
                boolean zM3360isEnd = menstruationDto == null ? true : menstruationDto.m3360isEnd();
                Iterator it6 = it5;
                HMLog.info("xys_MenstruationDataManager", new k0(date3, date4, isEnd, zM3360isEnd, AidKt.resetZeroHour(date4.getTime()) > j3));
                if (booleanRef.element) {
                    if (isEnd != null) {
                        zM3360isEnd = isEnd.booleanValue();
                    }
                    if (cloudUploadHistory(date3, date4, zM3360isEnd)) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                } else {
                    z3 = false;
                }
                booleanRef.element = z3;
                it5 = it6;
            }
        } else {
            HMLog.debug("xys_MenstruationDataManager", l0.a);
            Iterator it7 = scanToFindSections(mergeResult.getToAdd()).entrySet().iterator();
            while (it7.hasNext()) {
                Map.Entry entry3 = (Map.Entry) it7.next();
                Date date5 = new Date(((Section) entry3.getKey()).getStart());
                Date date6 = new Date(((Section) entry3.getKey()).getEnd());
                MenstruationDto menstruationDto2 = (MenstruationDto) CollectionsKt.firstOrNull((List) entry3.getValue());
                boolean zM3360isEnd2 = menstruationDto2 == null ? true : menstruationDto2.m3360isEnd();
                Iterator it8 = it7;
                HMLog.info("xys_MenstruationDataManager", new b0(date5, date6, isEnd, zM3360isEnd2, AidKt.resetZeroHour(date6.getTime()) > jResetZeroHour));
                if (booleanRef.element) {
                    if (isEnd != null) {
                        zM3360isEnd2 = isEnd.booleanValue();
                    }
                    if (cloudUploadHistory(date5, date6, zM3360isEnd2)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                booleanRef.element = z2;
                it7 = it8;
            }
        }
        intRef.element = !booleanRef.element ? 1 : 0;
        HMLog.info("xys_MenstruationDataManager", new c0(booleanRef, intRef));
        for (MenstruationDto menstruationDto3 : mergeResult.getToAdd()) {
            HMLog.info("xys_MenstruationDataManager", new d0(menstruationDto3));
            String sId3 = menstruationDto3.getSId();
            if (sId3 != null) {
                long jResetZeroHour2 = AidKt.resetZeroHour(menstruationDto3.getTime());
                Triple triple = (Triple) map.get(Long.valueOf(jResetZeroHour2));
                this.api.menstruationStatus(new MenstruationStatusBean((String) null, sId3, Long.valueOf(jResetZeroHour2), triple == null ? null : (Integer) triple.getSecond(), triple == null ? null : (Integer) triple.getThird(), triple == null ? null : (Integer) triple.getFirst(), 1, (DefaultConstructorMarker) null));
                Unit unit3 = Unit.INSTANCE;
            }
        }
        return intRef.element;
    }

    @NotNull
    public final MergeResult mergeMenstruation(@NotNull List<MenstruationDto> newRecords, @NotNull List<MenstruationDto> oldRecords, boolean keepAllWhenHeadNeighbor) {
        List<Period> listScanToFindPeriods = scanToFindPeriods(newRecords);
        List<Period> listScanToFindPeriods2 = scanToFindPeriods(oldRecords);
        if (listScanToFindPeriods.size() != 1) {
            HMLog.error$default("xys_MenstruationDataManager", null, null, new p0(listScanToFindPeriods), 6, null);
        }
        MergeResult mergeResultJ = j(listScanToFindPeriods.get(0), listScanToFindPeriods2, newRecords, oldRecords, keepAllWhenHeadNeighbor);
        HMLog.info("xys_MenstruationDataManager", new q0(mergeResultJ, listScanToFindPeriods, listScanToFindPeriods2));
        if ((!mergeResultJ.getToAdd().isEmpty()) && mergeResultJ.getToAdd().size() == mergeResultJ.getToDel().size()) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.element = true;
            int i2 = 0;
            for (Object obj : mergeResultJ.getToAdd()) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if (!((MenstruationDto) obj).compare(mergeResultJ.getToDel().get(i2))) {
                    booleanRef.element = false;
                }
                i2 = i3;
            }
            HMLog.info("xys_MenstruationDataManager", new r0(booleanRef));
            if (booleanRef.element) {
                mergeResultJ.setToAdd(new ArrayList());
                mergeResultJ.setToDel(new ArrayList());
            }
        }
        return mergeResultJ;
    }

    @WorkerThread
    @NotNull
    public final MenstruationTotalDto prepareMenstruationTotalData() {
        Object next;
        Object next2;
        if (this.mDevDateRange == null) {
            this.mDevDateRange = new Pair<>(new Date(this.sp.getDeviceDateRangeMin()), new Date(this.sp.getDeviceDateRangeMax()));
        }
        HMLog.info("xys_MenstruationDataManager", new v0());
        Date time = DateHelper.INSTANCE.today().getTime();
        Pair pair = new Pair(DateHelperKt.offset(time, -150), time);
        MenstruationSearchRepo menstruationSearchRepo = MenstruationSearchRepo.INSTANCE;
        HistoryItemBean historyItemBeanQueryLastMenstruation2 = menstruationSearchRepo.queryLastMenstruation2(time);
        List<MenstruationRecord> listFindByDateRangeKeepComplete = menstruationSearchRepo.findByDateRangeKeepComplete((Date) pair.getFirst(), (Date) pair.getSecond());
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindByDateRangeKeepComplete, 10));
        Iterator<T> it2 = listFindByDateRangeKeepComplete.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoExKt.toMenstruationDto((MenstruationRecord) it2.next()));
        }
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long time2 = ((MenstruationDto) next).getTime();
                do {
                    Object next3 = it3.next();
                    long time3 = ((MenstruationDto) next3).getTime();
                    if (time2 > time3) {
                        next = next3;
                        time2 = time3;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        MenstruationDto menstruationDto = (MenstruationDto) next;
        Iterator it4 = arrayList.iterator();
        if (it4.hasNext()) {
            next2 = it4.next();
            if (it4.hasNext()) {
                long time4 = ((MenstruationDto) next2).getTime();
                do {
                    Object next4 = it4.next();
                    long time5 = ((MenstruationDto) next4).getTime();
                    if (time4 < time5) {
                        next2 = next4;
                        time4 = time5;
                    }
                } while (it4.hasNext());
            }
        } else {
            next2 = null;
        }
        MenstruationDto menstruationDto2 = (MenstruationDto) next2;
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = ((Date) pair.getFirst()).getTime();
        Ref.LongRef longRef2 = new Ref.LongRef();
        longRef2.element = ((Date) pair.getSecond()).getTime();
        if (menstruationDto == null) {
            Pair<? extends Date, ? extends Date> pair2 = this.mDevDateRange;
            if (pair2 != null) {
                longRef.element = pair2.getFirst().getTime();
            }
        } else {
            longRef.element = menstruationDto.getTime();
            Pair<? extends Date, ? extends Date> pair3 = this.mDevDateRange;
            if (pair3 != null) {
                longRef.element = Math.min(menstruationDto.getTime(), pair3.getFirst().getTime());
            }
        }
        if (menstruationDto2 == null) {
            Pair<? extends Date, ? extends Date> pair4 = this.mDevDateRange;
            if (pair4 != null) {
                longRef2.element = pair4.getSecond().getTime();
            }
        } else {
            longRef2.element = menstruationDto2.getTime();
            Pair<? extends Date, ? extends Date> pair5 = this.mDevDateRange;
            if (pair5 != null) {
                longRef2.element = Math.max(menstruationDto2.getTime(), pair5.getSecond().getTime());
            }
        }
        HMLog.debug("xys_MenstruationDataManager", new w0(longRef, longRef2));
        long jCurrentTimeMillis = System.currentTimeMillis();
        HMLog.info("xys_MenstruationDataManager", new x0(jCurrentTimeMillis));
        List listG = g(this, CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.huami.femalehealth.logiclib.device.MenstruationDataManager$prepareMenstruationTotalData$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationDto) t2).getTime()), Long.valueOf(((MenstruationDto) t3).getTime()));
            }
        }), new Date(longRef.element), new Date(longRef2.element), Long.valueOf(jCurrentTimeMillis), false, false, 32, null);
        if (listG.size() > 150) {
            listG = listG.subList(listG.size() - 150, listG.size());
        }
        List list = listG;
        byte mFwVersion = getMFwVersion();
        byte cycleLen = (byte) this.sp.getCycleLen();
        byte periodLen = (byte) this.sp.getPeriodLen();
        Long lValueOf = historyItemBeanQueryLastMenstruation2 == null ? null : Long.valueOf(historyItemBeanQueryLastMenstruation2.getMenstrualPeriod());
        Long menstrualEndTime = historyItemBeanQueryLastMenstruation2 != null ? historyItemBeanQueryLastMenstruation2.getMenstrualEndTime() : null;
        MenstruationDto menstruationDto3 = (MenstruationDto) CollectionsKt.firstOrNull(list);
        return new MenstruationTotalDto(mFwVersion, cycleLen, periodLen, lValueOf, menstrualEndTime, menstruationDto3 == null ? 0L : menstruationDto3.getTime(), list.size(), list);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object readFromDevice(@NotNull Continuation<? super MenstruationTotalDto> continuation) {
        y0 y0Var;
        MenstruationDataManager menstruationDataManager;
        if (continuation instanceof y0) {
            y0Var = (y0) continuation;
            int i2 = y0Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y0Var.d = i2 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(continuation);
            }
        } else {
            y0Var = new y0(continuation);
        }
        Object fromDevice = y0Var.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = y0Var.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(fromDevice);
            DeviceDataTransfer deviceDataTransfer = this.transfer;
            y0Var.a = this;
            y0Var.d = 1;
            fromDevice = deviceDataTransfer.readFromDevice(y0Var);
            if (fromDevice == coroutine_suspended) {
                return coroutine_suspended;
            }
            menstruationDataManager = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            menstruationDataManager = (MenstruationDataManager) y0Var.a;
            ResultKt.throwOnFailure(fromDevice);
        }
        MenstruationTotalDto menstruationTotalDto = (MenstruationTotalDto) fromDevice;
        if (menstruationTotalDto != null) {
            menstruationDataManager.r(menstruationTotalDto.getRecords());
            menstruationDataManager.s(menstruationTotalDto);
        }
        return menstruationTotalDto;
    }

    @Nullable
    public final MenstruationConfigDto readLocalConfFromApp() {
        if (this.sp.getFirstTime()) {
            return null;
        }
        return new MenstruationConfigDto(Boolean.valueOf(this.sp.getHwNotify()), Boolean.valueOf(this.sp.getHwBeforeMenstruationDay() > 0), Byte.valueOf((byte) this.sp.getHwBeforeMenstruationDay()), Boolean.valueOf(this.sp.getHwBeforeOvulationDay() > 0), Byte.valueOf((byte) this.sp.getHwBeforeOvulationDay()), Boolean.valueOf(this.sp.getEnablePredict()));
    }

    @NotNull
    public final List<Period> scanToFindPeriods(@NotNull List<MenstruationDto> data) {
        String sId;
        long time;
        long time2;
        long jLongValue;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = CollectionsKt___CollectionsKt.sortedWith(data, new Comparator() { // from class: com.huami.femalehealth.logiclib.device.MenstruationDataManager$scanToFindPeriods$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t2, T t3) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((MenstruationDto) t2).getTime()), Long.valueOf(((MenstruationDto) t3).getTime()));
            }
        }).iterator();
        boolean zM3360isEnd = true;
        loop0: while (true) {
            sId = null;
            time = 0;
            time2 = 0;
            jLongValue = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break loop0;
                }
                MenstruationDto menstruationDto = (MenstruationDto) it2.next();
                if (menstruationDto.getInPeriod()) {
                    if (time == 0) {
                        time = menstruationDto.getTime();
                    }
                    if (menstruationDto.getTime() > time2) {
                        time2 = menstruationDto.getTime();
                    }
                    Long updateTime = menstruationDto.getUpdateTime();
                    jLongValue = updateTime == null ? 0L : updateTime.longValue();
                    sId = menstruationDto.getSId();
                    zM3360isEnd = menstruationDto.m3360isEnd();
                } else if (time <= 0 || time2 <= 0 || time > time2) {
                }
            }
            Period period = new Period(time, time2, jLongValue);
            period.setSId(sId);
            period.setEnd(zM3360isEnd);
            arrayList.add(period);
        }
        if (time > 0 && time2 > 0 && time <= time2) {
            Period period2 = new Period(time, time2, jLongValue);
            period2.setSId(sId);
            period2.setEnd(zM3360isEnd);
            arrayList.add(period2);
        }
        return arrayList;
    }

    @NotNull
    public final Map<Section, List<MenstruationDto>> scanToFindSections(@NotNull List<MenstruationDto> total) {
        long time;
        long time2;
        long jLongValue;
        Boolean isEnd;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator it2 = g(this, total, null, null, null, false, false, 14, null).iterator();
        loop0: while (true) {
            time = 0;
            time2 = 0;
            jLongValue = 0;
            isEnd = null;
            while (true) {
                if (!it2.hasNext()) {
                    break loop0;
                }
                MenstruationDto menstruationDto = (MenstruationDto) it2.next();
                if (menstruationDto.getInPeriod()) {
                    if (time == 0) {
                        time = menstruationDto.getTime();
                    }
                    if (menstruationDto.getTime() > time2) {
                        time2 = menstruationDto.getTime();
                    }
                    Long updateTime = menstruationDto.getUpdateTime();
                    jLongValue = updateTime == null ? 0L : updateTime.longValue();
                    isEnd = menstruationDto.getIsEnd();
                    arrayList.add(menstruationDto);
                } else if (time <= 0 || time2 <= 0 || time > time2) {
                }
            }
            linkedHashMap.put(new Section(time, time2, jLongValue, null, 8, null), arrayList);
            arrayList = new ArrayList();
        }
        if (time > 0 && time2 > 0 && time <= time2) {
            linkedHashMap.put(new Section(time, time2, jLongValue, isEnd), arrayList);
        }
        HMLog.info(TAG, new z0(System.currentTimeMillis() - jCurrentTimeMillis));
        return linkedHashMap;
    }

    public final void setFwVer(byte version) {
        this.mFwVersion = version;
    }

    public final void updateDateRangeByUser$logiclib_release(@Nullable Long s2, @Nullable Long e2) {
        if (s2 != null) {
            long jLongValue = s2.longValue();
            getSp().setDeviceDateRangeMin(Math.min(getSp().getDeviceDateRangeMin(), jLongValue));
            this.mDevDateRange = new Pair<>(new Date(Math.min(jLongValue, getSp().getDeviceDateRangeMin())), new Date(getSp().getDeviceDateRangeMax()));
        }
        if (e2 != null) {
            long jLongValue2 = e2.longValue();
            getSp().setDeviceDateRangeMax(Math.max(getSp().getDeviceDateRangeMax(), jLongValue2));
            this.mDevDateRange = new Pair<>(new Date(getSp().getDeviceDateRangeMin()), new Date(Math.max(jLongValue2, getSp().getDeviceDateRangeMax())));
        }
        HMLog.info("xys_MenstruationDataManager", new a1());
    }

    public final void updateFemaleDataSyncTime(@NotNull Calendar c2) {
        this.sp.setSyncTime(c2.getTimeInMillis());
    }

    @NotNull
    public final List<HistoryItemBean> updateFromCloud(int limit) {
        return o(limit);
    }

    public final void writeConfigToDevice(@NotNull final MenstruationConfigDto data, @Nullable final DeviceCallback callback) {
        HMLog.info("xys_MenstruationDataManager", new d1(data));
        this.executors.getDiskIO().execute(new Runnable() { // from class: uz4
            @Override // java.lang.Runnable
            public final void run() {
                MenstruationDataManager.t(this.a, data, callback);
            }
        });
    }

    public final void writeRecentToDevice(@Nullable final DeviceCallback callback) {
        final List<List<MenstruationVo>> preMenstruation = FHCalculation.Assist.INSTANCE.getPreMenstruation(new Milli(AidKt.resetZeroHour(new Date()).getTime()), 4);
        HMLog.info("xys_MenstruationDataManager", new e1(preMenstruation));
        this.executors.getDiskIO().execute(new Runnable() { // from class: vz4
            @Override // java.lang.Runnable
            public final void run() {
                MenstruationDataManager.u(this.a, preMenstruation, callback);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.huami.femalehealth.logiclib.device.MenstruationDataManager$writeToDevice$localCallback$1] */
    public final void writeToDevice(@Nullable final MenstruationTotalDto data, @Nullable final DeviceCallback callback, final boolean writeRecentToDevice, @Nullable final DeviceCallback writeRecentToDeviceCallBack) {
        final ?? r1 = new DeviceCallback() { // from class: com.huami.femalehealth.logiclib.device.MenstruationDataManager$writeToDevice$localCallback$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.femalehealth.logiclib.device.MenstruationDataManager$writeToDevice$localCallback$1$onFinish$1", f = "MenstruationDataManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ MenstruationDataManager b;
                public final /* synthetic */ DeviceCallback c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(MenstruationDataManager menstruationDataManager, DeviceCallback deviceCallback, Continuation<? super a> continuation) {
                    super(2, continuation);
                    this.b = menstruationDataManager;
                    this.c = deviceCallback;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new a(this.b, this.c, continuation);
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
                    this.b.writeRecentToDevice(this.c);
                    return Unit.INSTANCE;
                }
            }

            @Override // com.huami.femalehealth.logiclib.device.DeviceCallback
            public void onFinish(boolean success) {
                DeviceCallback deviceCallback = callback;
                if (deviceCallback != null) {
                    deviceCallback.onFinish(success);
                }
                if (writeRecentToDevice) {
                    e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(this, writeRecentToDeviceCallBack, null), 2, null);
                }
            }
        };
        this.executors.getDiskIO().execute(new Runnable() { // from class: wz4
            @Override // java.lang.Runnable
            public final void run() {
                MenstruationDataManager.v(data, this, r1);
            }
        });
    }
}
