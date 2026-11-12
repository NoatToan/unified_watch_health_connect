package com.huami.ecg;

import androidx.p008lifecycle.LiveData;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bioid.WaveBioIdNative;
import com.huami.ecg.core.EcgCore;
import com.huami.ecg.core.db.EcgDataBase;
import com.huami.ecg.core.db.dao.EcgCacheTimeDao;
import com.huami.ecg.core.db.dao.EcgDao;
import com.huami.ecg.core.db.dao.EcgTagDao;
import com.huami.ecg.core.db.entity.EcgCacheTime;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.ecg.core.db.entity.EcgTag;
import com.huami.ecg.core.db.entity.EcgTagValue;
import com.huami.ecg.core.model.EcgAnalysisStatus;
import com.huami.ecg.core.model.EcgCloudData;
import com.huami.ecg.core.model.EcgHealthRecord;
import com.huami.ecg.core.model.EcgWebUrlKey;
import com.huami.ecg.core.model.FilterRecord;
import com.huami.ecg.core.model.SeniorInterpretOrg;
import com.huami.ecg.core.model.SeniorInterpretResult;
import com.huami.ecg.core.util.EcgFileUtil;
import com.huami.ecg.core.util.EcgRawFileOp;
import com.huami.ecg.core.util.EcgUtilKt;
import com.huami.ecg.core.util.TimeHelper;
import com.huami.ecg.core.util.ZipUtil;
import com.huami.ecg.core.web.EcgWebApi;
import com.huami.ecg.sync.health.config.QLingConfig;
import com.huami.ecg.sync.health.model.EcgInput;
import com.huami.ecg.sync.health.model.SimplifyDeviceInfo;
import com.huami.ecg.sync.health.model.UserProfile;
import com.huami.ecg.sync.health.parser.EcgDataParser;
import com.huami.ecg.util.NormalizedTools;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.ecg.analytics.EcgAnalyticsManagerKt;
import com.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u0082\u00012\u00020\u0001:\u0002\u0082\u0001B\t¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J \u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J+\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0011\u001a\u00020\u00072\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\fH\u0002J$\u0010\u001b\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002J$\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0002J\u0018\u0010 \u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u0007H\u0002J\u001a\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u001f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\fJ\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020!0#2\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020!J\u000e\u0010'\u001a\u00020\u00032\u0006\u0010%\u001a\u00020!J\u0012\u0010(\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\r\u001a\u00020\fJ\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020!0#2\b\b\u0002\u0010\r\u001a\u00020\fJ8\u0010-\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012J<\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00120#2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012JX\u0010.\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00122\u0006\u0010/\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00122\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u000100J0\u0010-\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00122\u0006\u00102\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012J4\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00120#2\u0006\u00102\u001a\u00020*2\u0006\u0010+\u001a\u00020*2\u0010\b\u0002\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0012J\u001c\u00104\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012J \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00120#2\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012J0\u00108\u001a\u0002062\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u00107\u001a\u000206J<\u00108\u001a\u0002062\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u00107\u001a\u000206J0\u0010:\u001a\u0002062\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u00107\u001a\u000206J@\u0010:\u001a\u0002062\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0002\u00107\u001a\u000206JH\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u00107\u001a\u0002062\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u0012JD\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010\u00122\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u00107\u001a\u000206J.\u0010>\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00122\u0006\u0010=\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u0012JB\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00120#2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020*2\u0006\u00107\u001a\u0002062\u0006\u0010\r\u001a\u00020\f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u0012J2\u0010B\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u00120#2\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020*2\u0006\u00107\u001a\u0002062\u0006\u0010\r\u001a\u00020\fJ>\u0010C\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00122\u0006\u0010?\u001a\u00020\u00072\u0006\u0010@\u001a\u00020*2\u0006\u00107\u001a\u0002062\u0006\u0010\r\u001a\u00020\f2\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u0012J\u000e\u0010D\u001a\u0002062\u0006\u0010%\u001a\u00020!J\u000e\u0010E\u001a\u00020\u00032\u0006\u0010%\u001a\u00020!J\u000e\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0007J\u0006\u0010G\u001a\u00020\u0003J\u0010\u0010I\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u000206J \u0010I\u001a\u00020\u00032\b\b\u0002\u0010H\u001a\u0002062\u000e\b\u0002\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u0012J\u000e\u0010J\u001a\u0002062\u0006\u0010%\u001a\u00020!J\u0006\u0010K\u001a\u00020\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\u0007J\u0014\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u001f\u001a\u00020\u0007J\u000e\u0010O\u001a\u00020\u00032\u0006\u0010N\u001a\u00020\u0002J\u0016\u0010Q\u001a\u0002062\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010P\u001a\u00020\u0015J\u0006\u0010R\u001a\u00020*J\u0006\u0010S\u001a\u00020\u0003J \u0010W\u001a\u0004\u0018\u00010V2\u0006\u0010%\u001a\u00020!2\u0006\u0010T\u001a\u0002062\u0006\u0010U\u001a\u000206J\u0016\u0010Z\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020XJ\u0016\u0010[\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010Y\u001a\u00020XJ\u0010\u0010\\\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u0007J\u0010\u0010\\\u001a\u0004\u0018\u00010\u00152\u0006\u0010%\u001a\u00020!J\u0006\u0010]\u001a\u00020\u0003J\u001e\u0010d\u001a\u00020\u00032\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bJ&\u0010g\u001a\u00020\u00032\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020b2\u0006\u0010f\u001a\u00020eJ\"\u0010k\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010i\u001a\u00020h2\b\b\u0002\u0010j\u001a\u00020\fJ\u0006\u0010l\u001a\u000206J\u0018\u0010n\u001a\u0004\u0018\u00010m2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010F\u001a\u00020\u0007R\u001d\u0010s\u001a\u00020o8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010p\u001a\u0004\bq\u0010rR\u001d\u0010w\u001a\u00020t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010p\u001a\u0004\bu\u0010vR\u001d\u0010{\u001a\u00020x8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010p\u001a\u0004\by\u0010zR\u001d\u0010\u007f\u001a\u00020|8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bq\u0010p\u001a\u0004\b}\u0010~¨\u0006\u0083\u0001"}, d2 = {"Lcom/huami/ecg/EcgDataRepo;", "", "Lcom/huami/ecg/core/db/entity/EcgTag;", "", "i", "b", "c", "", "time", "h", "startTime", "endTime", "", "userId", "a", GoogleApiAvailabilityLight.b, "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;)V", "timeStamp", "", "", "ppgRawData", "Ljava/io/File;", "l", "uid", "second", "", "normalizedEcgUVData", com.loc.z.j, "ppgData", hl.k, "ecgFile", "id", "m", "Lcom/huami/ecg/core/db/entity/EcgData;", "getEcg", "Landroidx/lifecycle/LiveData;", "getEcgData", EcgAnalyticsManagerKt.ECG, "saveEcg", "saveOrIgnoreEcg", "getLatestEcg", "getLatestEcgData", "", "limit", "userIds", PointCategory.LOAD, "loadData", "type", "", "equalMap", "offset", "ids", "loadTags", "loadTagsData", "", "forward", "loadFromNetSaveReplace", "apps", "loadFromNetSaveIgnore", "Lcom/huami/ecg/core/model/EcgCloudData;", "loadFromNet", "day", "getEcgListByDay", "toTime", "dateLimit", "getEcgList", "getLocalEcgList", "getLatestEcgList", "deleteEcg", "deleteEcgLocal", MeDongAuthActivity.ARGS_ECG, "refreshTags", "isLogout", "checkData", "uploadEcg", "checkUnSyncData", "getTagById", "getTagData", "tag", "saveEcgTag", "file", "saveEcgVoice", "getEcgCount", "clearData", "isSnapshot", "isEcg", "Lcom/huami/ecg/core/model/FilterRecord;", "getFilterRecord", "", "datas", "savePpgFile", "saveEcgFile", "getEcgRawFile", "clearFriendData", "Lcom/huami/ecg/sync/health/model/SimplifyDeviceInfo;", "deviceInfo", "Lcom/huami/ecg/sync/health/model/UserProfile;", "userProfile", "Lcom/huami/ecg/sync/health/model/EcgInput;", "ecgInput", "syncOfflineEcgData", "Lcom/huami/ecg/core/model/EcgHealthRecord;", "record", "syncOnlineEcgData", "Lcom/huami/ecg/core/model/EcgWebUrlKey;", "key", "appName", "getEcgAnalysisUrl", "deleteBioId", "Lcom/huami/ecg/core/model/EcgAnalysisStatus;", "updateEcgStatusFromServer", "Lcom/huami/ecg/core/web/EcgWebApi;", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/ecg/core/web/EcgWebApi;", "ecgApi", "Lcom/huami/ecg/core/db/dao/EcgDao;", "e", "()Lcom/huami/ecg/core/db/dao/EcgDao;", "ecgDao", "Lcom/huami/ecg/core/db/dao/EcgTagDao;", "g", "()Lcom/huami/ecg/core/db/dao/EcgTagDao;", "ecgTagDao", "Lcom/huami/ecg/core/db/dao/EcgCacheTimeDao;", "f", "()Lcom/huami/ecg/core/db/dao/EcgCacheTimeDao;", "ecgSyncTimeDao", "<init>", "()V", "Companion", "ecg-core_release"}, k = 1, mv = {1, 4, 0})
public final class EcgDataRepo {
    private static final String e = "EcgDataRepo";
    private static final int f = 5000;
    private static final int g = 1000;
    private static final int h = 864000000;
    private static final int i = 600000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final Lazy ecgApi = LazyKt__LazyJVMKt.lazy(f.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Lazy ecgDao = LazyKt__LazyJVMKt.lazy(g.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Lazy ecgTagDao = LazyKt__LazyJVMKt.lazy(i.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Lazy ecgSyncTimeDao = LazyKt__LazyJVMKt.lazy(h.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "request startTime:" + this.a + ", endTime:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a0 extends Lambda implements Function0<String> {
        public static final a0 a = new a0();

        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "start create ecg model";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ EcgCacheTime a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EcgCacheTime ecgCacheTime) {
            super(0);
            this.a = ecgCacheTime;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "current cached time:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b0 extends Lambda implements Function0<String> {
        public static final b0 a = new b0();

        public b0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "start save ppg raw data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "cache bingo!!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class c0 extends Lambda implements Function0<String> {
        public final /* synthetic */ EcgData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(EcgData ecgData) {
            super(0);
            this.a = ecgData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ecg model created:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "no cache matched";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class d0 extends Lambda implements Function0<String> {
        public static final d0 a = new d0();

        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "start save ecg ppg zip file";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ EcgCacheTime a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(EcgCacheTime ecgCacheTime) {
            super(0);
            this.a = ecgCacheTime;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "update cached time: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class e0 extends Lambda implements Function0<String> {
        public static final e0 a = new e0();

        public e0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "upload ecg to cloud";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/ecg/core/web/EcgWebApi;", "a", "()Lcom/huami/ecg/core/web/EcgWebApi;"}, k = 3, mv = {1, 4, 0})
    public static final class f extends Lambda implements Function0<EcgWebApi> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgWebApi invoke() {
            return new EcgWebApi();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/ecg/core/db/dao/EcgDao;", "a", "()Lcom/huami/ecg/core/db/dao/EcgDao;"}, k = 3, mv = {1, 4, 0})
    public static final class g extends Lambda implements Function0<EcgDao> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgDao invoke() {
            return EcgDataBase.INSTANCE.getInstance().ecgDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/ecg/core/db/dao/EcgCacheTimeDao;", "a", "()Lcom/huami/ecg/core/db/dao/EcgCacheTimeDao;"}, k = 3, mv = {1, 4, 0})
    public static final class h extends Lambda implements Function0<EcgCacheTimeDao> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgCacheTimeDao invoke() {
            return EcgDataBase.INSTANCE.getInstance().ecgCacheTimeDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/huami/ecg/core/db/dao/EcgTagDao;", "a", "()Lcom/huami/ecg/core/db/dao/EcgTagDao;"}, k = 3, mv = {1, 4, 0})
    public static final class i extends Lambda implements Function0<EcgTagDao> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EcgTagDao invoke() {
            return EcgDataBase.INSTANCE.getInstance().ecgTagDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "getEcgRawFile error:" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ecg file failed to create:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(long j, File file) {
            super(0);
            this.a = j;
            this.b = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ecg file existed and delete:" + this.a + ",path:" + this.b.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ecg file failed to save:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ppg file failed to create:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ File b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(long j, File file) {
            super(0);
            this.a = j;
            this.b = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ppg file existed and delete:" + this.a + ",path:" + this.b.getName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class q extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(long j) {
            super(0);
            this.a = j;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ppg file failed to save:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class s extends Lambda implements Function0<String> {
        public static final s a = new s();

        public s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "start normalize ecg raw data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class t extends Lambda implements Function0<String> {
        public static final t a = new t();

        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "start save ecg normalized data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class u extends Lambda implements Function0<String> {
        public static final u a = new u();

        public u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "start create ecg model";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class v extends Lambda implements Function0<String> {
        public static final v a = new v();

        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "start save ppg raw data";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class w extends Lambda implements Function0<String> {
        public final /* synthetic */ EcgData a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(EcgData ecgData) {
            super(0);
            this.a = ecgData;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "ecg model created:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class x extends Lambda implements Function0<String> {
        public static final x a = new x();

        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "start save ecg ppg zip file";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class y extends Lambda implements Function0<String> {
        public static final y a = new y();

        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "upload ecg to cloud";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class z extends Lambda implements Function0<String> {
        public static final z a = new z();

        public z() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "start save ecg normalized data";
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    private final void a(long startTime, long endTime, String userId) {
        String str;
        long j2;
        long j3;
        long j4 = startTime;
        long j5 = endTime;
        EcgCacheTime syncTime = f().getSyncTime(userId);
        long cacheStartDay = syncTime != null ? syncTime.getCacheStartDay() : -1L;
        long cacheEndDay = syncTime != null ? syncTime.getCacheEndDay() : -1L;
        HMLog.info(e, new a(j4, j5));
        HMLog.info(e, new b(syncTime));
        if (syncTime != null && j4 >= syncTime.getCacheStartDay() && j5 <= syncTime.getCacheEndDay()) {
            HMLog.info(e, c.a);
            return;
        }
        boolean z2 = true;
        if (syncTime != null) {
            if (j5 < cacheStartDay) {
                if (cacheStartDay - j5 > h) {
                    str = e;
                    j3 = j4;
                    j2 = j5;
                    j5 = cacheEndDay;
                    z2 = false;
                } else {
                    str = e;
                    j3 = j4;
                    j2 = cacheStartDay;
                    j5 = cacheEndDay;
                    cacheStartDay = j3;
                }
            } else if (j4 + 1 <= cacheStartDay && j5 > cacheStartDay && j5 <= cacheEndDay) {
                str = e;
                j3 = j4;
                j2 = cacheStartDay;
                j5 = cacheEndDay;
                cacheStartDay = j3;
            } else if (j4 >= cacheStartDay || j5 <= cacheEndDay) {
                str = e;
                if (cacheStartDay + 1 > j4 || cacheEndDay <= j4 || j5 <= cacheEndDay) {
                    if (j4 <= cacheEndDay || j5 <= cacheEndDay) {
                        loadFromNetSaveIgnore$default(this, startTime, endTime, 5000, userId, kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName()), false, 32, null);
                        HMLog.info(str, d.a);
                        return;
                    } else if (j4 - cacheEndDay > h) {
                        j3 = j4;
                        j2 = j5;
                        j5 = cacheEndDay;
                        z2 = false;
                    }
                }
                j2 = j5;
                j3 = cacheEndDay;
            } else {
                List listListOf = kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName());
                str = e;
                if (loadFromNetSaveIgnore$default(this, startTime, cacheStartDay, 5000, userId, listListOf, false, 32, null)) {
                    f().updateSyncTime(new EcgCacheTime(userId, startTime, cacheEndDay));
                } else {
                    j4 = cacheStartDay;
                }
            }
            if (loadFromNetSaveIgnore$default(this, j3, j2, 5000, userId, kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName()), false, 32, null) || !z2) {
            }
            EcgCacheTime ecgCacheTime = new EcgCacheTime(userId, cacheStartDay, j5);
            HMLog.info(str, new e(ecgCacheTime));
            f().updateSyncTime(ecgCacheTime);
            return;
        }
        str = e;
        j3 = j4;
        cacheStartDay = j3;
        j2 = j5;
        if (loadFromNetSaveIgnore$default(this, j3, j2, 5000, userId, kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName()), false, 32, null)) {
        }
    }

    private final void b() {
        List<EcgData> unSyncData$default = EcgDao.DefaultImpls.getUnSyncData$default(e(), null, 1, null);
        if (unSyncData$default != null) {
            for (EcgData ecgData : unSyncData$default) {
                if (ecgData.getServerUpdatedTime() == -1) {
                    uploadEcg(ecgData);
                } else if (d().updateEcg(ecgData)) {
                    ecgData.setServerUpdatedTime(System.currentTimeMillis());
                    ecgData.setLocalUpdatedTime(ecgData.getServerUpdatedTime());
                    e().insertOrReplace(ecgData);
                }
            }
        }
    }

    private final void c() {
        List<EcgTag> unSyncTag = g().getUnSyncTag();
        if (unSyncTag != null) {
            for (EcgTag ecgTag : unSyncTag) {
                if (d().saveEcgTag(ecgTag)) {
                    ecgTag.setSynced(1);
                    g().insertOrReplace(ecgTag);
                }
            }
        }
    }

    public static /* synthetic */ void checkData$default(EcgDataRepo ecgDataRepo, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        ecgDataRepo.checkData(z2);
    }

    private final EcgWebApi d() {
        return (EcgWebApi) this.ecgApi.getValue();
    }

    private final EcgDao e() {
        return (EcgDao) this.ecgDao.getValue();
    }

    private final EcgCacheTimeDao f() {
        return (EcgCacheTimeDao) this.ecgSyncTimeDao.getValue();
    }

    private final EcgTagDao g() {
        return (EcgTagDao) this.ecgTagDao.getValue();
    }

    public static /* synthetic */ EcgData getEcg$default(EcgDataRepo ecgDataRepo, long j2, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().userId();
        }
        return ecgDataRepo.getEcg(j2, str);
    }

    public static /* synthetic */ String getEcgAnalysisUrl$default(EcgDataRepo ecgDataRepo, long j2, EcgWebUrlKey ecgWebUrlKey, String str, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().appName();
        }
        return ecgDataRepo.getEcgAnalysisUrl(j2, ecgWebUrlKey, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveData getEcgList$default(EcgDataRepo ecgDataRepo, long j2, int i2, boolean z2, String str, List list, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            list = kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName());
        }
        return ecgDataRepo.getEcgList(j2, i2, z2, str, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List getEcgListByDay$default(EcgDataRepo ecgDataRepo, long j2, String str, List list, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list = kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName());
        }
        return ecgDataRepo.getEcgListByDay(j2, str, list);
    }

    public static /* synthetic */ EcgData getLatestEcg$default(EcgDataRepo ecgDataRepo, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().userId();
        }
        return ecgDataRepo.getLatestEcg(str);
    }

    public static /* synthetic */ LiveData getLatestEcgData$default(EcgDataRepo ecgDataRepo, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = EcgCore.INSTANCE.getWebSetting().userId();
        }
        return ecgDataRepo.getLatestEcgData(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List getLatestEcgList$default(EcgDataRepo ecgDataRepo, long j2, int i2, boolean z2, String str, List list, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            list = kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName());
        }
        return ecgDataRepo.getLatestEcgList(j2, i2, z2, str, list);
    }

    private final void h(long time) {
        List<EcgTag> ecgTagList = d().getEcgTagList(time - 1, time + 1);
        if (ecgTagList != null) {
            g().insertOrReplace(ecgTagList);
        }
    }

    private final void i(@NotNull EcgTag ecgTag) {
        if (ecgTag.isExpired()) {
            if (ecgTag.getSynced() == 0) {
                saveEcgTag(ecgTag);
            }
            List<EcgTag> ecgTagList = d().getEcgTagList(ecgTag.getCom.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity.ARGS_ECG java.lang.String() - 1, ecgTag.getCom.huami.watch.companion.ecg.ui.activity.MeDongAuthActivity.ARGS_ECG java.lang.String() + 1);
            if (ecgTagList != null) {
                g().insertOrReplace(ecgTagList);
            }
        }
    }

    private final File j(String uid, long second, double[] normalizedEcgUVData) {
        try {
            File ecgFile = EcgFileUtil.INSTANCE.getEcgFile(EcgCore.INSTANCE.getContext(), uid, second);
            if (ecgFile == null) {
                HMLog.info(e, new l(second));
                return null;
            }
            if (ecgFile.exists() && ecgFile.delete()) {
                HMLog.info(e, new m(second, ecgFile));
            }
            if (EcgRawFileOp.INSTANCE.saveData(normalizedEcgUVData, ecgFile)) {
                return ecgFile;
            }
            HMLog.info(e, new n(second));
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private final File k(String uid, long second, double[] ppgData) {
        try {
            File ppgFile = EcgFileUtil.INSTANCE.getPpgFile(EcgCore.INSTANCE.getContext(), uid, second);
            if (ppgFile == null) {
                HMLog.info(e, new o(second));
                return null;
            }
            if (ppgFile.exists() && ppgFile.delete()) {
                HMLog.info(e, new p(second, ppgFile));
            }
            if (EcgRawFileOp.INSTANCE.saveData(ppgData, ppgFile)) {
                return ppgFile;
            }
            HMLog.info(e, new q(second));
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private final File l(long timeStamp, List<Float> ppgRawData, String userId) {
        if (ppgRawData != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(ppgRawData, 10));
            Iterator<T> it2 = ppgRawData.iterator();
            while (it2.hasNext()) {
                arrayList.add(Double.valueOf(((Number) it2.next()).floatValue()));
            }
            double[] doubleArray = CollectionsKt___CollectionsKt.toDoubleArray(arrayList);
            if (doubleArray != null) {
                return k(userId, timeStamp, doubleArray);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List load$default(EcgDataRepo ecgDataRepo, long j2, long j3, int i2, List list, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            list = null;
        }
        return ecgDataRepo.load(j2, j3, i2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveData loadData$default(EcgDataRepo ecgDataRepo, long j2, long j3, int i2, List list, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            list = null;
        }
        return ecgDataRepo.loadData(j2, j3, i2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List loadFromNet$default(EcgDataRepo ecgDataRepo, long j2, long j3, int i2, String str, boolean z2, List list, int i3, Object obj) {
        return ecgDataRepo.loadFromNet(j2, j3, i2, str, (i3 & 16) != 0 ? false : z2, (List<String>) ((i3 & 32) != 0 ? kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName()) : list));
    }

    private final void m(File ecgFile, long id) throws Throwable {
        EcgFileUtil ecgFileUtil = EcgFileUtil.INSTANCE;
        EcgCore ecgCore = EcgCore.INSTANCE;
        File ecgZipFile = ecgFileUtil.getEcgZipFile(ecgCore.getContext(), ecgCore.getWebSetting().userId(), id);
        if (ecgZipFile.exists()) {
            ecgZipFile.delete();
        }
        ecgZipFile.createNewFile();
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(ecgFile);
        File ppgFile = ecgFileUtil.getPpgFile(ecgCore.getContext(), ecgCore.getWebSetting().userId(), id);
        if (ppgFile.exists()) {
            listMutableListOf.add(ppgFile);
        }
        Object[] array = listMutableListOf.toArray(new File[0]);
        if (array == null) {
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        ZipUtil.zip((File[]) array, ecgZipFile);
    }

    private final void n(String userId, Long startTime, Long endTime) {
        EcgCacheTime syncTime = f().getSyncTime(userId);
        if (syncTime == null) {
            syncTime = new EcgCacheTime(userId, 0L, 0L, 6, null);
        }
        if (startTime != null) {
            startTime.longValue();
            syncTime.setCacheStartDay(startTime.longValue());
        }
        if (endTime != null) {
            endTime.longValue();
            syncTime.setCacheEndDay(endTime.longValue());
        }
        f().updateSyncTime(syncTime);
    }

    public final void checkData(boolean isLogout) {
        checkData(isLogout, kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName()));
    }

    public final void checkUnSyncData() {
        if (getEcgCount() > 0) {
            c();
            b();
        }
    }

    public final void clearData() {
        e().clear();
        g().clear();
    }

    public final void clearFriendData() {
        EcgCacheTimeDao.DefaultImpls.clearFriendCache$default(f(), null, 1, null);
        EcgDao.DefaultImpls.clearFriendData$default(e(), null, 1, null);
    }

    public final boolean deleteBioId() {
        WaveBioIdNative waveBioIdNative = WaveBioIdNative.INSTANCE;
        long bioIdSampleTime$default = WaveBioIdNative.getBioIdSampleTime$default(waveBioIdNative, null, 1, null);
        if (bioIdSampleTime$default <= 0) {
            return true;
        }
        EcgData ecg$default = getEcg$default(this, bioIdSampleTime$default, null, 2, null);
        if (ecg$default == null) {
            WaveBioIdNative.updateBioIdSampleTime$default(waveBioIdNative, -1L, null, 2, null);
            return true;
        }
        boolean zDeleteEcg = deleteEcg(ecg$default);
        if (zDeleteEcg) {
            WaveBioIdNative.updateBioIdSampleTime$default(waveBioIdNative, -1L, null, 2, null);
        }
        return zDeleteEcg;
    }

    public final boolean deleteEcg(@NotNull EcgData ecg) {
        boolean zDeleteEcg = d().deleteEcg(ecg.getTimestamp(), ecg.getMeasureContentType(), ecg.getCom.huami.ecg.core.db.entity.EcgData.GROUP_ID java.lang.String());
        if (zDeleteEcg) {
            e().delete(ecg);
        }
        return zDeleteEcg;
    }

    public final void deleteEcgLocal(@NotNull EcgData ecg) {
        e().delete(ecg);
    }

    @Nullable
    public final EcgData getEcg(long id, @NotNull String userId) {
        TimeHelper timeHelper = TimeHelper.INSTANCE;
        loadFromNetSaveIgnore$default(this, timeHelper.getDayStartTime(id), timeHelper.getDayEndTime(id), 5000, userId, kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName()), false, 32, null);
        return e().get(id);
    }

    @Nullable
    public final String getEcgAnalysisUrl(long timeStamp, @NotNull EcgWebUrlKey key, @NotNull String appName) {
        EcgWebApi.EcgAnalysisUrlData ecgWebUrl = d().getEcgWebUrl(key, appName);
        if (ecgWebUrl == null) {
            return null;
        }
        return ecgWebUrl.getUrl() + "?dataTime=" + timeStamp;
    }

    public final int getEcgCount() {
        Integer numLoadCount = e().loadCount();
        if (numLoadCount != null) {
            return numLoadCount.intValue();
        }
        return 0;
    }

    @NotNull
    public final LiveData<EcgData> getEcgData(long id) {
        return e().getData(id);
    }

    @NotNull
    public final LiveData<List<EcgData>> getEcgList(long toTime, int dateLimit, boolean forward, @NotNull String userId, @NotNull List<String> apps) {
        long beforeDaysStartTime = TimeHelper.INSTANCE.getBeforeDaysStartTime(toTime, dateLimit);
        loadFromNetSaveIgnore$default(this, beforeDaysStartTime, toTime, 5000, userId, apps, false, 32, null);
        return e().getAllData(null, beforeDaysStartTime, toTime, null, -1, 5000, forward, kotlin.collections.q.mapOf(new Pair(EcgData.ERROR_CODE, "0")), CollectionsKt__CollectionsKt.mutableListOf(userId));
    }

    @Nullable
    public final List<EcgData> getEcgListByDay(long day, @NotNull String userId, @NotNull List<String> apps) {
        TimeHelper timeHelper = TimeHelper.INSTANCE;
        long dayStartTime = timeHelper.getDayStartTime(day);
        long dayEndTime = timeHelper.getDayEndTime(day);
        loadFromNetSaveIgnore$default(this, dayStartTime, dayEndTime, 5000, userId, apps, false, 32, null);
        return e().getAll(null, dayStartTime, dayEndTime, null, -1, 5000, false, kotlin.collections.q.mapOf(new Pair(EcgData.ERROR_CODE, "0")), CollectionsKt__CollectionsKt.mutableListOf(userId));
    }

    @Nullable
    public final File getEcgRawFile(long id) {
        EcgData ecg$default = getEcg$default(this, id, null, 2, null);
        if (ecg$default != null) {
            return getEcgRawFile(ecg$default);
        }
        return null;
    }

    @Nullable
    public final FilterRecord getFilterRecord(@NotNull EcgData ecg, boolean isSnapshot, boolean isEcg) {
        return isEcg ? EcgDataProcesser.INSTANCE.ecgFilterRecord(ecg, isSnapshot) : EcgDataProcesser.INSTANCE.ppgFilterRecord(ecg, isSnapshot);
    }

    @Nullable
    public final EcgData getLatestEcg(@NotNull String userId) {
        return e().getLatest(userId);
    }

    @NotNull
    public final LiveData<EcgData> getLatestEcgData(@NotNull String userId) {
        return e().getLatestData(userId);
    }

    @Nullable
    public final List<EcgData> getLatestEcgList(long toTime, int dateLimit, boolean forward, @NotNull String userId, @NotNull List<String> apps) {
        long beforeDaysStartTime = TimeHelper.INSTANCE.getBeforeDaysStartTime(toTime, dateLimit);
        loadFromNetSaveIgnore$default(this, beforeDaysStartTime, toTime, 5000, userId, apps, false, 32, null);
        return e().getAll(null, beforeDaysStartTime, toTime, null, -1, 5000, forward, kotlin.collections.q.mapOf(new Pair(EcgData.ERROR_CODE, "0")), CollectionsKt__CollectionsKt.mutableListOf(userId));
    }

    @NotNull
    public final LiveData<List<EcgData>> getLocalEcgList(long toTime, int dateLimit, boolean forward, @NotNull String userId) {
        return e().getAllData(null, TimeHelper.INSTANCE.getBeforeDaysStartTime(toTime, dateLimit), toTime, null, -1, 5000, forward, kotlin.collections.q.mapOf(new Pair(EcgData.ERROR_CODE, "0")), CollectionsKt__CollectionsKt.mutableListOf(userId));
    }

    @Nullable
    public final EcgTag getTagById(long id) {
        EcgTag ecgTag = g().get(id);
        if (ecgTag == null || !ecgTag.isExpired()) {
            return ecgTag;
        }
        h(id);
        return g().get(id);
    }

    @NotNull
    public final LiveData<EcgTag> getTagData(long id) {
        return g().getData(id);
    }

    @Nullable
    public final List<EcgData> load(long startTime, long endTime, int limit, @Nullable List<String> userIds) {
        return e().getAll(startTime, endTime, limit, userIds);
    }

    @NotNull
    public final LiveData<List<EcgData>> loadData(long startTime, long endTime, int limit, @Nullable List<String> userIds) {
        return e().getAllData(startTime, endTime, limit, userIds);
    }

    @Nullable
    public final List<EcgCloudData> loadFromNet(long startTime, long endTime, int limit, @NotNull String userId, boolean forward, @NotNull List<String> apps) {
        return d().getEcgList(startTime, endTime, limit, userId, apps, forward);
    }

    public final boolean loadFromNetSaveIgnore(long startTime, long endTime, int limit, @NotNull String userId, boolean forward) {
        return loadFromNetSaveIgnore(startTime, endTime, limit, userId, kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName()), forward);
    }

    public final boolean loadFromNetSaveReplace(long startTime, long endTime, int limit, @NotNull String userId, boolean forward) {
        return loadFromNetSaveReplace(startTime, endTime, limit, userId, kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName()), forward);
    }

    @Nullable
    public final List<EcgTag> loadTags(@NotNull List<Long> ids) {
        return g().getTags(ids);
    }

    @NotNull
    public final LiveData<List<EcgTag>> loadTagsData(@NotNull List<Long> ids) {
        return g().getTagsData(ids);
    }

    public final void refreshTags() {
        List<EcgTag> all = g().getAll();
        if (all != null) {
            Iterator<T> it2 = all.iterator();
            while (it2.hasNext()) {
                i((EcgTag) it2.next());
            }
        }
    }

    public final void saveEcg(@NotNull EcgData ecg) {
        e().insertOrReplace(ecg);
    }

    public final void saveEcgFile(long id, @NotNull byte[] datas) {
        try {
            EcgFileUtil ecgFileUtil = EcgFileUtil.INSTANCE;
            EcgCore ecgCore = EcgCore.INSTANCE;
            File ecgFile = ecgFileUtil.getEcgFile(ecgCore.getContext(), ecgCore.getWebSetting().userId(), id);
            kotlin.io.c.writeBytes(ecgFile, datas);
            File ecgZipFile = ecgFileUtil.getEcgZipFile(ecgCore.getContext(), ecgCore.getWebSetting().userId(), id);
            if (ecgZipFile.exists()) {
                ecgZipFile.delete();
            }
            ecgZipFile.createNewFile();
            List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(ecgFile);
            File ppgFile = ecgFileUtil.getPpgFile(ecgCore.getContext(), ecgCore.getWebSetting().userId(), id);
            if (ppgFile.exists()) {
                listMutableListOf.add(ppgFile);
            }
            Object[] array = listMutableListOf.toArray(new File[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            ZipUtil.zip((File[]) array, ecgZipFile);
        } catch (Exception e2) {
            HMLog.warn(e, e2, new k(e2));
        }
    }

    public final void saveEcgTag(@NotNull EcgTag tag) {
        if (d().saveEcgTag(tag)) {
            tag.setSynced(1);
        }
        g().insertOrReplace(tag);
    }

    public final boolean saveEcgVoice(long id, @NotNull File file) {
        String strUploadVoiceTag = d().uploadVoiceTag(file);
        if (strUploadVoiceTag == null) {
            return false;
        }
        EcgTag ecgTag = g().get(id);
        if (ecgTag == null) {
            ecgTag = new EcgTag();
            ecgTag.setEcgId(id);
            ecgTag.setSynced(0);
        }
        EcgTagValue value = ecgTag.getValue();
        if (value == null) {
            value = new EcgTagValue();
        }
        value.setVoiceTag(strUploadVoiceTag);
        ecgTag.setValue(value);
        g().insertOrReplace(ecgTag);
        saveEcgTag(ecgTag);
        return true;
    }

    public final void saveOrIgnoreEcg(@NotNull EcgData ecg) {
        e().insertIgnore(ecg);
    }

    public final void savePpgFile(long id, @NotNull byte[] datas) {
        try {
            EcgFileUtil ecgFileUtil = EcgFileUtil.INSTANCE;
            EcgCore ecgCore = EcgCore.INSTANCE;
            kotlin.io.c.writeBytes(ecgFileUtil.getPpgFile(ecgCore.getContext(), ecgCore.getWebSetting().userId(), id), datas);
        } catch (Exception e2) {
            HMLog.warn(e, e2, new r(e2));
        }
    }

    public final void syncOfflineEcgData(@NotNull SimplifyDeviceInfo deviceInfo, @NotNull UserProfile userProfile, @NotNull EcgInput ecgInput) throws Throwable {
        HMLog.info(e, s.a);
        double[] normalizedData = NormalizedTools.INSTANCE.getNormalizedData(ecgInput.getDeviceSource(), QLingConfig.INSTANCE.getCoeff(), ecgInput.getEcgRawData());
        HMLog.info(e, t.a);
        long timeInMillis = ecgInput.getTimestamp().getTimeInMillis() / ((long) 1000);
        File fileJ = j(userProfile.getUserId(), timeInMillis, normalizedData);
        if (fileJ != null) {
            EcgDataParser ecgDataParser = EcgDataParser.INSTANCE;
            EcgHealthRecord ecgHealthRecord = ecgDataParser.getEcgHealthRecord(ecgInput, null, normalizedData, userProfile);
            HMLog.info(e, u.a);
            EcgData ecgDataCreateEcgData = ecgDataParser.createEcgData(ecgInput, ecgHealthRecord, userProfile, deviceInfo);
            if (ecgDataCreateEcgData != null) {
                ecgDataCreateEcgData.setLocalECGRawUri(fileJ.getAbsolutePath());
                HMLog.info(e, v.a);
                File fileL = l(timeInMillis, ecgInput.getPpgData(), userProfile.getUserId());
                if (fileL != null) {
                    ecgDataCreateEcgData.setLocalPPGRawUri(fileL.getAbsolutePath());
                    ecgDataCreateEcgData.setMIsContainPPG(1);
                }
                HMLog.info(e, new w(ecgDataCreateEcgData));
                e().insertOrReplace(ecgDataCreateEcgData);
                HMLog.info(e, x.a);
                m(fileJ, timeInMillis);
                HMLog.info(e, y.a);
                b();
            }
        }
    }

    public final void syncOnlineEcgData(@NotNull SimplifyDeviceInfo deviceInfo, @NotNull UserProfile userProfile, @NotNull EcgInput ecgInput, @NotNull EcgHealthRecord record) throws Throwable {
        HMLog.info(e, z.a);
        long timeInMillis = ecgInput.getTimestamp().getTimeInMillis() / ((long) 1000);
        File fileJ = j(userProfile.getUserId(), timeInMillis, ecgInput.getNormalizedData());
        if (fileJ != null) {
            HMLog.info(e, a0.a);
            EcgData ecgDataCreateEcgData = EcgDataParser.INSTANCE.createEcgData(ecgInput, record, userProfile, deviceInfo);
            if (ecgDataCreateEcgData != null) {
                ecgDataCreateEcgData.setLocalECGRawUri(fileJ.getAbsolutePath());
                HMLog.info(e, b0.a);
                File fileL = l(timeInMillis, ecgInput.getPpgData(), userProfile.getUserId());
                if (fileL != null) {
                    ecgDataCreateEcgData.setLocalPPGRawUri(fileL.getAbsolutePath());
                    ecgDataCreateEcgData.setMIsContainPPG(1);
                }
                HMLog.info(e, new c0(ecgDataCreateEcgData));
                e().insertOrReplace(ecgDataCreateEcgData);
                HMLog.info(e, d0.a);
                m(fileJ, timeInMillis);
                HMLog.info(e, e0.a);
                b();
            }
        }
    }

    @Nullable
    public final EcgAnalysisStatus updateEcgStatusFromServer(@NotNull String userId, long ecgId) {
        EcgCloudData ecgCloudData;
        EcgData ecgData;
        SeniorInterpretOrg seniorInterpretOrg;
        List listLoadFromNet$default = loadFromNet$default(this, ecgId - 1, ecgId + 1, 1, userId, false, null, 48, null);
        SeniorInterpretResult ecgSeniorAnalysisResult = null;
        if (listLoadFromNet$default == null || (ecgCloudData = (EcgCloudData) CollectionsKt.firstOrNull(listLoadFromNet$default)) == null || (ecgData = e().get(ecgId)) == null) {
            return null;
        }
        ecgData.setDiagnosis(ecgCloudData.getDiagnosis());
        e().insertOrReplace(ecgData);
        EcgAnalysisStatus analysisStatus = EcgUtilKt.getAnalysisStatus(ecgData);
        List<SeniorInterpretOrg> ecgSeniorAnalysisOrgList = d().getEcgSeniorAnalysisOrgList();
        if (ecgSeniorAnalysisOrgList != null && (seniorInterpretOrg = (SeniorInterpretOrg) CollectionsKt.firstOrNull((List) ecgSeniorAnalysisOrgList)) != null) {
            ecgSeniorAnalysisResult = d().getEcgSeniorAnalysisResult(userId, String.valueOf(seniorInterpretOrg.getOrgId()), ecgData);
        }
        return EcgUtilKt.combine(analysisStatus, EcgUtilKt.getSeniorAnalysisStatus(ecgSeniorAnalysisResult));
    }

    public final boolean uploadEcg(@NotNull EcgData ecg) {
        EcgWebApi ecgWebApiD = d();
        EcgFileUtil ecgFileUtil = EcgFileUtil.INSTANCE;
        EcgCore ecgCore = EcgCore.INSTANCE;
        boolean zUploadEcg = ecgWebApiD.uploadEcg(ecg, ecgFileUtil.getEcgZipFile(ecgCore.getContext(), ecgCore.getWebSetting().userId(), ecg.getTimestamp()).getAbsolutePath());
        if (zUploadEcg) {
            ecg.setServerUpdatedTime(System.currentTimeMillis());
            ecg.setLocalUpdatedTime(ecg.getServerUpdatedTime());
            e().insertOrReplace(ecg);
        }
        return zUploadEcg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void checkData$default(EcgDataRepo ecgDataRepo, boolean z2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            list = kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName());
        }
        ecgDataRepo.checkData(z2, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List load$default(EcgDataRepo ecgDataRepo, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list = null;
        }
        return ecgDataRepo.load(i2, i3, list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean loadFromNetSaveIgnore$default(EcgDataRepo ecgDataRepo, long j2, long j3, int i2, String str, List list, boolean z2, int i3, Object obj) {
        return ecgDataRepo.loadFromNetSaveIgnore(j2, j3, i2, str, (i3 & 16) != 0 ? kotlin.collections.e.listOf(EcgCore.INSTANCE.getAppName()) : list, (i3 & 32) != 0 ? false : z2);
    }

    public final void checkData(boolean isLogout, @NotNull List<String> apps) {
        checkUnSyncData();
        if (isLogout) {
            return;
        }
        loadFromNetSaveIgnore(0L, System.currentTimeMillis() / ((long) 1000), 10, EcgCore.INSTANCE.getWebSetting().userId(), apps, false);
    }

    public final void deleteEcgLocal(long ecgId) {
        e().delete(ecgId);
    }

    @Nullable
    public final List<EcgData> load(int offset, int limit, @Nullable List<String> userIds) {
        return e().getAll(null, -1L, -1L, null, offset, limit, false, null, userIds);
    }

    @Nullable
    public final List<EcgData> loadData(@NotNull String type, long startTime, long endTime, int limit, @Nullable List<String> userIds, @Nullable Map<String, String> equalMap) {
        return e().getAll(type, startTime, endTime, null, -1, limit, false, equalMap, userIds);
    }

    @Nullable
    public final List<EcgCloudData> loadFromNet(long startTime, long endTime, int limit, @NotNull String userId, @NotNull List<String> apps, boolean forward) {
        return d().getEcgList(startTime, endTime, limit, userId, apps, forward);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveData loadData$default(EcgDataRepo ecgDataRepo, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            list = null;
        }
        return ecgDataRepo.loadData(i2, i3, list);
    }

    @Nullable
    public final File getEcgRawFile(@NotNull EcgData ecg) {
        try {
            File file = new File(ecg.getLocalECGRawUri());
            if (file.exists()) {
                return file;
            }
            File ecgFile = EcgDataProcesser.INSTANCE.getEcgFile(EcgCore.INSTANCE.getContext(), ecg, true);
            if (ecgFile == null || !ecgFile.exists()) {
                return ecgFile;
            }
            ecg.setLocalECGRawUri(ecgFile.getAbsolutePath());
            e().insertOrReplace(ecg);
            return ecgFile;
        } catch (Exception e2) {
            HMLog.error$default(e, null, null, new j(e2), 6, null);
            return null;
        }
    }

    @NotNull
    public final LiveData<List<EcgData>> loadData(int offset, int limit, @Nullable List<String> userIds) {
        return e().getAllData(null, -1L, -1L, null, offset, limit, false, null, userIds);
    }

    public final boolean loadFromNetSaveIgnore(long startTime, long endTime, int limit, @NotNull String userId, @NotNull List<String> apps, boolean forward) {
        List<EcgCloudData> listLoadFromNet = loadFromNet(startTime, endTime, limit, userId, apps, forward);
        if (listLoadFromNet == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listLoadFromNet, 10));
        Iterator<T> it2 = listLoadFromNet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((EcgCloudData) it2.next()).getEcg());
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            EcgData ecgData = e().get(((EcgData) it3.next()).getTimestamp());
            if (ecgData != null) {
                if (!(ecgData.getUserId().length() == 0)) {
                    ecgData = null;
                }
                if (ecgData != null) {
                    ecgData.setUserId(userId);
                    e().insertOrReplace(ecgData);
                }
            }
        }
        EcgDao ecgDaoE = e();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listLoadFromNet, 10));
        Iterator<T> it4 = listLoadFromNet.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((EcgCloudData) it4.next()).getEcg());
        }
        ecgDaoE.insertOrReplace(arrayList2);
        EcgTagDao ecgTagDaoG = g();
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listLoadFromNet, 10));
        Iterator<T> it5 = listLoadFromNet.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((EcgCloudData) it5.next()).getTag());
        }
        ecgTagDaoG.insertOrReplace(arrayList3);
        return true;
    }

    public final boolean loadFromNetSaveReplace(long startTime, long endTime, int limit, @NotNull String userId, @NotNull List<String> apps, boolean forward) {
        List<EcgCloudData> listLoadFromNet = loadFromNet(startTime, endTime, limit, userId, apps, forward);
        if (listLoadFromNet == null) {
            return false;
        }
        EcgDao ecgDaoE = e();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listLoadFromNet, 10));
        Iterator<T> it2 = listLoadFromNet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((EcgCloudData) it2.next()).getEcg());
        }
        ecgDaoE.insertOrReplace(arrayList);
        EcgTagDao ecgTagDaoG = g();
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listLoadFromNet, 10));
        Iterator<T> it3 = listLoadFromNet.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((EcgCloudData) it3.next()).getTag());
        }
        ecgTagDaoG.insertOrReplace(arrayList2);
        return true;
    }
}
