package com.huami.femalehealth.logiclib.repo;

import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.vo.ApiResponse;
import com.huami.android.vo.ApiSuccessResponse;
import com.huami.android.vo.Resource;
import com.huami.femalehealth.logiclib.api.DeleteType;
import com.huami.femalehealth.logiclib.api.FemaleHealthWebApi;
import com.huami.femalehealth.logiclib.api.pojo.HistoryDetailBean;
import com.huami.femalehealth.logiclib.api.pojo.HistoryItemBean;
import com.huami.femalehealth.logiclib.api.pojo.Items;
import com.huami.femalehealth.logiclib.api.pojo.MenstruationRecordBean;
import com.huami.femalehealth.logiclib.api.pojo.MenstruationStatusBean;
import com.huami.femalehealth.logiclib.calculation.AidKt;
import com.huami.femalehealth.logiclib.db.FemaleHealthDb;
import com.huami.femalehealth.logiclib.db.dao.MenstruationSearchRepo;
import com.huami.femalehealth.logiclib.db.po.DeletedMenstruationSection;
import com.huami.femalehealth.logiclib.db.po.MenstruationRecord;
import com.huami.femalehealth.logiclib.db.po.MenstruationWithSymptoms;
import com.huami.femalehealth.logiclib.db.po.Symptom;
import com.huami.femalehealth.logiclib.device.DeviceStatus;
import com.huami.femalehealth.logiclib.device.MenstruationDataManager;
import com.huami.femalehealth.logiclib.dto.MenstruationDto;
import com.huami.femalehealth.logiclib.dto.MenstruationTotalDto;
import com.huami.femalehealth.logiclib.dto.Section;
import com.huami.femalehealth.logiclib.dto.SymptomType;
import com.huami.femalehealth.logiclib.event.EventMenstruationOperation;
import com.huami.femalehealth.logiclib.helper.AppExecutors;
import com.huami.femalehealth.logiclib.helper.DateHelper;
import com.huami.femalehealth.logiclib.helper.DateHelperKt;
import com.huami.femalehealth.logiclib.helper.SharedPreferencesUtils;
import com.huami.femalehealth.logiclib.helper.ext.BeanExKt;
import com.huami.femalehealth.logiclib.helper.ext.DtoExKt;
import com.huami.femalehealth.logiclib.helper.ext.NumberExtKt;
import com.huami.femalehealth.logiclib.helper.ext.PoExKt;
import com.huami.femalehealth.logiclib.helper.ext.PoToVoKt;
import com.huami.femalehealth.logiclib.manager.DataCacheManager;
import com.huami.femalehealth.logiclib.manager.FHUploadPermissionManager;
import com.huami.femalehealth.logiclib.repo.MenstruationRepo;
import com.huami.femalehealth.logiclib.vo.MenstruationVo;
import com.huami.femalehealth.logiclib.vo.SettingVo;
import com.huami.tools.log.HMLog;
import com.huami.watch.notification.TransportUri;
import com.xiaomi.infra.galaxy.fds.Common;
import de.greenrobot.event.EventBus;
import io.netty.util.internal.StringUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0083\u00012\u00020\u0001:\u0002\u0083\u0001B9\u0012\u0006\u0010b\u001a\u00020_\u0012\u0006\u0010f\u001a\u00020c\u0012\u0006\u0010j\u001a\u00020g\u0012\u0006\u0010m\u001a\u00020k\u0012\u0006\u0010q\u001a\u00020n\u0012\u0006\u0010t\u001a\u00020r¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0013\u0010\u0010\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0015\u001a\u00020\fH\u0002J3\u0010\u001b\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0005H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010!\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u0004\u0018\u00010\u00172\u0006\u0010!\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010#J)\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00162\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\"\u0010%J\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\u001e\u0010)\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005JI\u0010.\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020\u00052\b\b\u0002\u0010,\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b.\u0010/JA\u00104\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\n2\u0006\u00103\u001a\u000202H\u0086@ø\u0001\u0000¢\u0006\u0004\b4\u00105JM\u0010=\u001a\u0016\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00020<0\u0016\u0018\u00010:2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002062\u0006\u00108\u001a\u00020\n2\b\b\u0002\u00109\u001a\u00020-H\u0086@ø\u0001\u0000¢\u0006\u0004\b=\u0010>JK\u0010D\u001a\u00020-2\u0006\u0010?\u001a\u00020\n2\u0006\u0010@\u001a\u00020\u00022\u0006\u0010A\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u000e\u0010F\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005J\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016J\u0013\u0010H\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\bH\u0010\u0011J(\u0010L\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0018\u0010K\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u0016\u0012\u0004\u0012\u00020\f0IJ\u001d\u0010O\u001a\u0004\u0018\u00010M2\u0006\u0010N\u001a\u00020MH\u0086@ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ \u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020T0\u00160S0R2\u0006\u0010Q\u001a\u00020\u0002J\u001d\u0010W\u001a\u00020\f2\b\b\u0002\u0010V\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\bW\u0010\u0014J7\u0010X\u001a\u00020\f2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0006\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\bX\u0010\u001cJ&\u0010^\u001a\u00020\f2\u0006\u0010Y\u001a\u00020-2\u0006\u0010Z\u001a\u00020-2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020\u0005R\u0016\u0010b\u001a\u00020_8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010f\u001a\u00020c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010j\u001a\u00020g8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010m\u001a\u00020k8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010lR\u0016\u0010q\u001a\u00020n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010t\u001a\u00020r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010sR(\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00050u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\u001a\u0010\u0080\u0001\u001a\u00020|8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010}\u001a\u0004\b~\u0010\u007f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0084\u0001"}, d2 = {"Lcom/huami/femalehealth/logiclib/repo/MenstruationRepo;", "", "Ljava/util/Date;", "start", "end", "", "isEnd", "", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationRecord;", "g", "", "id", "", "f", "serverId", GoogleApiAvailabilityLight.a, "h", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mergeDev", "l", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "i", "", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "webList", "mergeDevice", "syncDevice", com.loc.z.j, "(Ljava/util/List;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dateList", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "getMenstruationOfDay", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "date", "getLastMenstruation", "(Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLastMenstruation2", "(Ljava/util/Date;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAllFromCloud", "sDate", "eDate", "menstruationEndByDateRange", "keepAllWhenHeadNeighbor", "forceMergeResultIsEnd", "dropFeature", "", TransportUri.ACTION_ADD, "(Ljava/util/Date;Ljava/util/Date;ZZZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "entire", "sid", "Lcom/huami/femalehealth/logiclib/api/DeleteType;", "type", "delete", "(Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/lang/String;Lcom/huami/femalehealth/logiclib/api/DeleteType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Pair;", "toDelDate", "excludeId", "expandDay", "", "Lcom/huami/femalehealth/logiclib/dto/Section;", "Lcom/huami/femalehealth/logiclib/dto/MenstruationDto;", "deleteInvolved", "(Lkotlin/Pair;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sId", "oldStart", "oldEnd", "involvedExists", "involvedPeriodHasUnfinished", "modify", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeToDeviceIfConnectAndRefresh", "queryAll", "checkUnsyncData", "Lkotlin/Function1;", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryDetailBean;", "refresh", "getCartStatus", "Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationStatusBean;", "menstruationStatusBean", "setCardStatus", "(Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationStatusBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastDate", "Landroidx/lifecycle/LiveData;", "Lcom/huami/android/vo/Resource;", "Lcom/huami/femalehealth/logiclib/db/po/MenstruationWithSymptoms;", "loadLiveMenstruationWithSymptoms", "needClearNet", "clearLocalMenstruation", "syncDeviceFromNet", "periodContinueTime", "periodCycle", "", "lastPeriodStartTime", "smartSwitch", "setInitSetting", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "a", "Lcom/huami/femalehealth/logiclib/helper/AppExecutors;", "appExecutors", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "b", "Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;", "webApi", "Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;", "c", "Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;", UserDataStore.DATE_OF_BIRTH, "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;", "manager", "Lcom/huami/femalehealth/logiclib/repo/SettingRepo;", "e", "Lcom/huami/femalehealth/logiclib/repo/SettingRepo;", "settingRepo", "Lcom/huami/femalehealth/logiclib/device/DeviceStatus;", "Lcom/huami/femalehealth/logiclib/device/DeviceStatus;", "deviceStatus", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/MutableLiveData;", "getTrigger", "()Landroidx/lifecycle/MutableLiveData;", "setTrigger", "(Landroidx/lifecycle/MutableLiveData;)V", "trigger", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "getSp", "()Lcom/huami/femalehealth/logiclib/helper/SharedPreferencesUtils;", "sp", "<init>", "(Lcom/huami/femalehealth/logiclib/helper/AppExecutors;Lcom/huami/femalehealth/logiclib/api/FemaleHealthWebApi;Lcom/huami/femalehealth/logiclib/db/FemaleHealthDb;Lcom/huami/femalehealth/logiclib/device/MenstruationDataManager;Lcom/huami/femalehealth/logiclib/repo/SettingRepo;Lcom/huami/femalehealth/logiclib/device/DeviceStatus;)V", "Companion", "logiclib_release"}, k = 1, mv = {1, 5, 1})
public final class MenstruationRepo {
    public static final long DAY_MILLIS = 86400000;

    @NotNull
    public static final String TAG = "MenstruationRepo";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AppExecutors appExecutors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthWebApi webApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final FemaleHealthDb db;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MenstruationDataManager manager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final SettingRepo settingRepo;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final DeviceStatus deviceStatus;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private MutableLiveData<Boolean> trigger = new MutableLiveData<>(Boolean.TRUE);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final SharedPreferencesUtils sp;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ boolean c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Date date, Date date2, boolean z, boolean z2, boolean z3) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("add, start=");
            DateHelper dateHelper = DateHelper.INSTANCE;
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.a.getTime(), false, 2, null));
            sb.append(", end=");
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.b.getTime(), false, 2, null));
            sb.append(", isEnd=");
            sb.append(this.c);
            sb.append(", keepAllWhenHeadNeighbor=");
            sb.append(this.d);
            sb.append(", forceMergeResultIsEnd=");
            sb.append(this.e);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a0 extends Lambda implements Function0<String> {
        public static final a0 a = new a0();

        public a0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loadLiveMenstruationWithSymptoms, lastMenstruation is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<MenstruationRecord> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<MenstruationRecord> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            List<MenstruationRecord> list = this.a;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(DateHelper.convertUTCDate$default(DateHelper.INSTANCE, ((MenstruationRecord) it2.next()).getDate().getTime(), false, 2, null));
            }
            return Intrinsics.stringPlus("newRecords:", arrayList);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ String b;
        public final /* synthetic */ long c;
        public final /* synthetic */ Long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(Date date, String str, long j, Long l) {
            super(0);
            this.a = date;
            this.b = str;
            this.c = j;
            this.d = l;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("loadLiveMenstruationWithSymptoms, lastDate=");
            sb.append(this.a);
            sb.append(", id=");
            sb.append(this.b);
            sb.append(", start=");
            sb.append(NumberExtKt.dateFormat(this.c));
            sb.append(", last=");
            Long l = this.d;
            sb.append((Object) (l == null ? null : NumberExtKt.dateFormat(l.longValue())));
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo$add$4", f = "MenstruationRepo.kt", i = {}, l = {249}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationRepo.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationRepo menstruationRepo = MenstruationRepo.this;
                this.a = 1;
                if (menstruationRepo.l(true, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MenstruationRepo.this.i();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(Date date, Date date2, boolean z) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("menstruationEndByDateRange:");
            DateHelper dateHelper = DateHelper.INSTANCE;
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.a.getTime(), false, 2, null));
            sb.append(" -> ");
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.b.getTime(), false, 2, null));
            sb.append("  ");
            sb.append(this.c);
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Map.Entry<Section, List<MenstruationDto>> a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Map.Entry<Section, ? extends List<MenstruationDto>> entry, boolean z, boolean z2) {
            super(0);
            this.a = entry;
            this.b = z;
            this.c = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "checkUnsyncData, need upload, " + NumberExtKt.dateFormat(this.a.getKey().getStart()) + '-' + NumberExtKt.dateFormat(this.a.getKey().getEnd()) + ", unSync=" + this.b + ", isEnd=" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d0 extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationRecord a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(MenstruationRecord menstruationRecord) {
            super(0);
            this.a = menstruationRecord;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("menstruationEndByDateRange dao :", this.a);
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
            StringBuilder sb = new StringBuilder();
            sb.append("delete 2:");
            DateHelper dateHelper = DateHelper.INSTANCE;
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.a.getTime(), false, 2, null));
            sb.append(StringUtil.SPACE);
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.b.getTime(), false, 2, null));
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(String str, boolean z) {
            super(0);
            this.a = str;
            this.b = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "menstruationEndById:" + this.a + " -> " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Date c;
        public final /* synthetic */ Date d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, long j2, Date date, Date date2) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = date;
            this.d = date2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "根据时间戳删除失败 dbFirst.date.time:" + this.a + " dbLast.date.time:" + this.b + "start.time:" + this.c.getTime() + "end.time:" + this.d.getTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f0 extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ ApiResponse<MenstruationRecordBean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(String str, ApiResponse<MenstruationRecordBean> apiResponse) {
            super(0);
            this.a = str;
            this.b = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "menstruationEndById success:" + this.a + " -> " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo$delete$13", f = "MenstruationRepo.kt", i = {}, l = {373}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationRepo.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationRepo menstruationRepo = MenstruationRepo.this;
                this.a = 1;
                if (menstruationRepo.l(false, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MenstruationRepo.this.i();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g0 extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<MenstruationRecordBean> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ApiResponse<MenstruationRecordBean> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("menstruationEnd:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo", f = "MenstruationRepo.kt", i = {0, 0, 0, 0, 0, 0}, l = {274}, m = "delete", n = {"this", "start", "end", "entire", "sid", "type"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    public static final class h extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public /* synthetic */ Object g;
        public int i;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return MenstruationRepo.this.delete(null, null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h0 extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ Date c;
        public final /* synthetic */ Date d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(Date date, Date date2, Date date3, Date date4) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = date3;
            this.d = date4;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "modify, oldStart=" + NumberExtKt.dateFormat(this.a.getTime()) + ", oldEnd=" + NumberExtKt.dateFormat(this.b.getTime()) + ", start=" + NumberExtKt.dateFormat(this.c.getTime()) + ", end=" + NumberExtKt.dateFormat(this.d.getTime());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Date date, Date date2) {
            super(0);
            this.a = date;
            this.b = date2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete, start=" + NumberExtKt.dateFormat(this.a.getTime()) + ", end=" + NumberExtKt.dateFormat(this.b.getTime());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(boolean z, boolean z2, boolean z3) {
            super(0);
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "modify, involvedExists=" + this.a + ", involvedPeriodHasUnfinished=" + this.b + ", isEnd=" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ HistoryItemBean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Date date, Date date2, HistoryItemBean historyItemBean) {
            super(0);
            this.a = date;
            this.b = date2;
            this.c = historyItemBean;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "delete section: " + NumberExtKt.dateFormat(this.a.getTime()) + " - " + NumberExtKt.dateFormat(this.b.getTime()) + ", last=" + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j0 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(long j, int i) {
            super(0);
            this.a = j;
            this.b = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "prepareNewMenstruation, updateTime=" + this.a + " daysBetween:" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ Date d;
        public final /* synthetic */ Date e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Boolean bool, long j, long j2, Date date, Date date2) {
            super(0);
            this.a = bool;
            this.b = j;
            this.c = j2;
            this.d = date;
            this.e = date2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("entire:");
            sb.append(this.a);
            sb.append(" dbFirst.date.time:");
            DateHelper dateHelper = DateHelper.INSTANCE;
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.b, false, 2, null));
            sb.append(" dbLast.date.time:");
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.c, false, 2, null));
            sb.append("start.time:");
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.d.getTime(), false, 2, null));
            sb.append("end.time:");
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.e.getTime(), false, 2, null));
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo", f = "MenstruationRepo.kt", i = {0, 0}, l = {477}, m = "readDeviceBeforeOperation", n = {"this", "t1"}, s = {"L$0", "J$0"})
    public static final class k0 extends ContinuationImpl {
        public Object a;
        public long b;
        public /* synthetic */ Object c;
        public int e;

        public k0(Continuation<? super k0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return MenstruationRepo.this.h(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public static final l a = new l();

        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "case1";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l0 extends Lambda implements Function0<String> {
        public final /* synthetic */ MenstruationTotalDto a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l0(MenstruationTotalDto menstruationTotalDto) {
            super(0);
            this.a = menstruationTotalDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("readDeviceBeforeOperation, deviceDto=", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("serverId:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m0 extends Lambda implements Function0<String> {
        public static final m0 a = new m0();

        public m0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "no uplode permission";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Date date, Date date2) {
            super(0);
            this.a = date;
            this.b = date2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            StringBuilder sb = new StringBuilder();
            sb.append("delete:");
            DateHelper dateHelper = DateHelper.INSTANCE;
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.a.getTime(), false, 2, null));
            sb.append(StringUtil.SPACE);
            sb.append(DateHelper.convertUTCDate$default(dateHelper, this.b.getTime(), false, 2, null));
            return sb.toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n0 extends Lambda implements Function0<String> {
        public static final n0 a = new n0();

        public n0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "readDeviceBeforeOperation, not connected";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.IntRef a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Ref.IntRef intRef) {
            super(0);
            this.a = intRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("result：", Integer.valueOf(this.a.element));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o0 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("readDeviceBeforeOperation, time cost: ", Float.valueOf((this.a - this.b) / 1000.0f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(Boolean bool, String str, boolean z) {
            super(0);
            this.a = bool;
            this.b = str;
            this.c = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "case2 " + this.a + StringUtil.SPACE + this.b + StringUtil.SPACE + this.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/femalehealth/logiclib/api/pojo/MenstruationStatusBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo$setCardStatus$2", f = "MenstruationRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class p0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MenstruationStatusBean>, Object> {
        public int a;
        public final /* synthetic */ MenstruationStatusBean c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ ApiResponse<MenstruationStatusBean> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ApiResponse<MenstruationStatusBean> apiResponse) {
                super(0);
                this.a = apiResponse;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("menstruationStatus:", this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p0(MenstruationStatusBean menstruationStatusBean, Continuation<? super p0> continuation) {
            super(2, continuation);
            this.c = menstruationStatusBean;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationRepo.this.new p0(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super MenstruationStatusBean> continuation) {
            return ((p0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ApiResponse<MenstruationStatusBean> apiResponseMenstruationStatus = MenstruationRepo.this.webApi.menstruationStatus(this.c);
            if (!(apiResponseMenstruationStatus instanceof ApiSuccessResponse)) {
                return null;
            }
            HMLog.debug("xys", new a(apiResponseMenstruationStatus));
            return (MenstruationStatusBean) ((ApiSuccessResponse) apiResponseMenstruationStatus).getBody();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo", f = "MenstruationRepo.kt", i = {0, 0, 0, 0}, l = {Common.HTTP_STATUS_METHOD_NOT_ALLOWED}, m = "deleteInvolved", n = {"this", "toDelDate", "excludeId", "expandDay"}, s = {"L$0", "L$1", "L$2", "I$0"})
    public static final class q extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public /* synthetic */ Object e;
        public int g;

        public q(Continuation<? super q> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return MenstruationRepo.this.deleteInvolved(null, null, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo", f = "MenstruationRepo.kt", i = {0, 0, 0}, l = {498}, m = "writeToDeviceIfConnect", n = {"this", "mergeDev", "t1"}, s = {"L$0", "Z$0", "J$0"})
    public static final class q0 extends ContinuationImpl {
        public Object a;
        public boolean b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public q0(Continuation<? super q0> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return MenstruationRepo.this.l(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ Pair<Date, Date> a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(Pair<? extends Date, ? extends Date> pair, String str) {
            super(0);
            this.a = pair;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deleteInvolved, toDelDate=" + this.a + ", excludeId=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ MenstruationTotalDto b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r0(boolean z, MenstruationTotalDto menstruationTotalDto) {
            super(0);
            this.a = z;
            this.b = menstruationTotalDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "writeToDeviceIfConnect, mergeDev=" + this.a + ", deviceDto from device=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(Date date, Date date2) {
            super(0);
            this.a = date;
            this.b = date2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deleteInvolved, no need to delete, start=" + NumberExtKt.dateFormat(this.a.getTime()) + ", end=" + NumberExtKt.dateFormat(this.b.getTime());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s0 extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ MenstruationTotalDto b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s0(boolean z, MenstruationTotalDto menstruationTotalDto) {
            super(0);
            this.a = z;
            this.b = menstruationTotalDto;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "writeToDeviceIfConnect, mergeDev=" + this.a + ", prepare dto from db=" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t extends Lambda implements Function0<String> {
        public final /* synthetic */ Date a;
        public final /* synthetic */ Date b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(Date date, Date date2) {
            super(0);
            this.a = date;
            this.b = date2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deleteInvolved, start=" + NumberExtKt.dateFormat(this.a.getTime()) + ", end=" + NumberExtKt.dateFormat(this.b.getTime());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class t0 extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t0(long j, long j2) {
            super(0);
            this.a = j;
            this.b = j2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("writeToDeviceIfConnect, time cost: ", Float.valueOf((this.a - this.b) / 1000.0f));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class u extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<List<HistoryDetailBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ApiResponse<List<HistoryDetailBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getCartStatus:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo$writeToDeviceIfConnectAndRefresh$1", f = "MenstruationRepo.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
    public static final class u0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u0(boolean z, Continuation<? super u0> continuation) {
            super(2, continuation);
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MenstruationRepo.this.new u0(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((u0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MenstruationRepo menstruationRepo = MenstruationRepo.this;
                boolean z = this.c;
                this.a = 1;
                if (menstruationRepo.l(z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            MenstruationRepo.this.i();
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class v extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<List<HistoryDetailBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ApiResponse<List<HistoryDetailBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getCartStatus:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo$getLastMenstruation$2", f = "MenstruationRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class w extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public final /* synthetic */ Date b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(Date date, Continuation<? super w> continuation) {
            super(2, continuation);
            this.b = date;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new w(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MenstruationVo>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<MenstruationVo>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((w) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return DtoExKt.toMenstruationVoList(MenstruationSearchRepo.INSTANCE.queryLastMenstruation2(this.b));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo$getLastMenstruation$4", f = "MenstruationRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class x extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ boolean c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Ref.ObjectRef<Date> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.ObjectRef<Date> objectRef) {
                super(0);
                this.a = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("getLastMenstruation, varDate=", this.a.element);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(Date date, boolean z, Continuation<? super x> continuation) {
            super(2, continuation);
            this.b = date;
            this.c = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new x(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MenstruationVo>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<MenstruationVo>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.Date] */
        /* JADX WARN: Type inference failed for: r1v6, types: [T, java.util.Date] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            HistoryItemBean historyItemBeanQueryLastMenstruation2;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new Date(this.b.getTime());
            while (true) {
                HMLog.info("xys_MenstruationRepo", new a(objectRef));
                historyItemBeanQueryLastMenstruation2 = MenstruationSearchRepo.INSTANCE.queryLastMenstruation2((Date) objectRef.element);
                if (historyItemBeanQueryLastMenstruation2 == null || historyItemBeanQueryLastMenstruation2.isEnd() == this.c) {
                    break;
                }
                objectRef.element = new Date(historyItemBeanQueryLastMenstruation2.getMenstrualPeriod() - 86400000);
            }
            return DtoExKt.toMenstruationVoList(historyItemBeanQueryLastMenstruation2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/femalehealth/logiclib/api/pojo/HistoryItemBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo$getLastMenstruation2$2", f = "MenstruationRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class y extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HistoryItemBean>, Object> {
        public int a;
        public final /* synthetic */ Date b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(Date date, Continuation<? super y> continuation) {
            super(2, continuation);
            this.b = date;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new y(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super HistoryItemBean> continuation) {
            return ((y) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return MenstruationSearchRepo.INSTANCE.queryLastMenstruation2(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/femalehealth/logiclib/vo/MenstruationVo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.femalehealth.logiclib.repo.MenstruationRepo$getMenstruationOfDay$2", f = "MenstruationRepo.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class z extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends MenstruationVo>>, Object> {
        public int a;
        public final /* synthetic */ Date b;
        public final /* synthetic */ Date c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(Date date, Date date2, Continuation<? super z> continuation) {
            super(2, continuation);
            this.b = date;
            this.c = date2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new z(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends MenstruationVo>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<MenstruationVo>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<MenstruationVo>> continuation) {
            return ((z) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<MenstruationRecord> listFindByDateRange = MenstruationSearchRepo.INSTANCE.findByDateRange(this.b, this.c);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindByDateRange, 10));
            Iterator<T> it2 = listFindByDateRange.iterator();
            while (it2.hasNext()) {
                arrayList.add(PoToVoKt.toMenstruationVo((MenstruationRecord) it2.next()));
            }
            return arrayList;
        }
    }

    public MenstruationRepo(@NotNull AppExecutors appExecutors, @NotNull FemaleHealthWebApi femaleHealthWebApi, @NotNull FemaleHealthDb femaleHealthDb, @NotNull MenstruationDataManager menstruationDataManager, @NotNull SettingRepo settingRepo, @NotNull DeviceStatus deviceStatus) {
        this.appExecutors = appExecutors;
        this.webApi = femaleHealthWebApi;
        this.db = femaleHealthDb;
        this.manager = menstruationDataManager;
        this.settingRepo = settingRepo;
        this.deviceStatus = deviceStatus;
        this.sp = menstruationDataManager.getSp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(String str, Function1 function1) {
        ApiResponse<List<HistoryDetailBean>> apiResponseLoadHistoryDetail = DataCacheManager.INSTANCE.loadHistoryDetail(str);
        if (!(apiResponseLoadHistoryDetail instanceof ApiSuccessResponse)) {
            HMLog.error$default("xys", null, null, new v(apiResponseLoadHistoryDetail), 6, null);
        } else {
            function1.invoke(((ApiSuccessResponse) apiResponseLoadHistoryDetail).getBody());
            HMLog.debug("xys", new u(apiResponseLoadHistoryDetail));
        }
    }

    public static /* synthetic */ Object clearLocalMenstruation$default(MenstruationRepo menstruationRepo, boolean z2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return menstruationRepo.clearLocalMenstruation(z2, continuation);
    }

    private final void d(String serverId) {
        List<MenstruationRecord> listFindByServerId = MenstruationSearchRepo.INSTANCE.findByServerId(serverId);
        if (listFindByServerId.isEmpty()) {
            return;
        }
        this.db.deleteHistoryDao().insert(new DeletedMenstruationSection(serverId, ((MenstruationRecord) CollectionsKt.first((List) listFindByServerId)).getDate().getTime(), ((MenstruationRecord) CollectionsKt.last((List) listFindByServerId)).getDate().getTime(), ((MenstruationRecord) CollectionsKt.last((List) listFindByServerId)).getCom.huami.ecg.core.db.entity.EcgData.TIMESTAMP_SERVER_UPDATED java.lang.String()));
    }

    public static /* synthetic */ Object delete$default(MenstruationRepo menstruationRepo, Date date, Date date2, Boolean bool, String str, DeleteType deleteType, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = null;
        }
        return menstruationRepo.delete(date, date2, bool, str, deleteType, continuation);
    }

    public static /* synthetic */ Object deleteInvolved$default(MenstruationRepo menstruationRepo, Pair pair, String str, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 2;
        }
        return menstruationRepo.deleteInvolved(pair, str, i2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Date date, MediatorLiveData mediatorLiveData) {
        Object next;
        HistoryItemBean historyItemBeanQueryLastMenstruation2 = MenstruationSearchRepo.INSTANCE.queryLastMenstruation2(date);
        if (historyItemBeanQueryLastMenstruation2 == null) {
            HMLog.warn$default("xys_MenstruationRepo", null, a0.a, 2, null);
            return;
        }
        String id = historyItemBeanQueryLastMenstruation2.getId();
        long menstrualPeriod = historyItemBeanQueryLastMenstruation2.getMenstrualPeriod();
        Long menstrualEndTime = historyItemBeanQueryLastMenstruation2.getMenstrualEndTime();
        HMLog.info("xys_MenstruationRepo", new b0(date, id, menstrualPeriod, menstrualEndTime));
        if (menstrualEndTime == null) {
            return;
        }
        ApiResponse<List<HistoryDetailBean>> apiResponseLoadHistoryDetail = DataCacheManager.INSTANCE.loadHistoryDetail(id);
        if (apiResponseLoadHistoryDetail instanceof ApiSuccessResponse) {
            List list = (List) ((ApiSuccessResponse) apiResponseLoadHistoryDetail).getBody();
            List<MenstruationRecord> menstruationRecordList = DtoExKt.toMenstruationRecordList(historyItemBeanQueryLastMenstruation2);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(menstruationRecordList, 10));
            for (MenstruationRecord menstruationRecord : menstruationRecordList) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!(menstruationRecord.getDate().getTime() == AidKt.resetZeroHour(((HistoryDetailBean) next).getMenstruationTime())));
                HistoryDetailBean historyDetailBean = (HistoryDetailBean) next;
                arrayList.add(historyDetailBean != null ? new MenstruationWithSymptoms(menstruationRecord, CollectionsKt__CollectionsKt.listOf((Object[]) new Symptom[]{BeanExKt.toSymptomPo(historyDetailBean, SymptomType.PAIN), BeanExKt.toSymptomPo(historyDetailBean, SymptomType.MOOD), BeanExKt.toSymptomPo(historyDetailBean, SymptomType.BLOOD)})) : new MenstruationWithSymptoms(menstruationRecord, CollectionsKt__CollectionsKt.emptyList()));
            }
            mediatorLiveData.postValue(Resource.INSTANCE.success(arrayList));
        }
    }

    private final void f(String id, boolean isEnd) {
        HMLog.info("xys_MenstruationRepo", new e0(id, isEnd));
        ApiResponse<MenstruationRecordBean> apiResponseMenstruationEdit = this.webApi.menstruationEdit(new MenstruationRecordBean((Integer) null, Integer.valueOf(isEnd ? 1 : 0), id, (Long) null, (Long) null, (Long) null, (String) null, Long.valueOf(System.currentTimeMillis()), 121, (DefaultConstructorMarker) null));
        if (apiResponseMenstruationEdit instanceof ApiSuccessResponse) {
            HMLog.info("xys_MenstruationRepo", new f0(id, apiResponseMenstruationEdit));
        } else {
            HMLog.error$default("xys_MenstruationRepo", null, null, new g0(apiResponseMenstruationEdit), 6, null);
        }
    }

    private final List<MenstruationRecord> g(Date start, Date end, boolean isEnd) {
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iDaysBetween = DateHelper.INSTANCE.daysBetween(start, end);
        HMLog.info("xys_MenstruationRepo", new j0(jCurrentTimeMillis, iDaysBetween));
        if (iDaysBetween > 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                MenstruationRecord menstruationRecord = new MenstruationRecord(AidKt.toDate(DateHelper.INSTANCE.offsetDay(i2, start.getTime())), true);
                menstruationRecord.setUpdateTime(Long.valueOf(jCurrentTimeMillis));
                menstruationRecord.setEnd(Boolean.valueOf(isEnd));
                arrayList.add(menstruationRecord);
                if (i3 >= iDaysBetween) {
                    break;
                }
                i2 = i3;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Continuation<? super Unit> continuation) {
        k0 k0Var;
        long jCurrentTimeMillis;
        MenstruationRepo menstruationRepo;
        long j2;
        if (continuation instanceof k0) {
            k0Var = (k0) continuation;
            int i2 = k0Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k0Var.e = i2 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(continuation);
            }
        } else {
            k0Var = new k0(continuation);
        }
        Object fromDevice = k0Var.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = k0Var.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(fromDevice);
            jCurrentTimeMillis = System.currentTimeMillis();
            if (!this.deviceStatus.isConnected()) {
                HMLog.info("xys_MenstruationRepo", n0.a);
            } else if (FHUploadPermissionManager.INSTANCE.getHasPermission()) {
                MenstruationDataManager menstruationDataManager = this.manager;
                k0Var.a = this;
                k0Var.b = jCurrentTimeMillis;
                k0Var.e = 1;
                fromDevice = menstruationDataManager.readFromDevice(k0Var);
                if (fromDevice == coroutine_suspended) {
                    return coroutine_suspended;
                }
                menstruationRepo = this;
                j2 = jCurrentTimeMillis;
            } else {
                HMLog.info("xys_MenstruationRepo", m0.a);
            }
            HMLog.info("xys_MenstruationRepo", new o0(System.currentTimeMillis(), jCurrentTimeMillis));
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = k0Var.b;
        menstruationRepo = (MenstruationRepo) k0Var.a;
        ResultKt.throwOnFailure(fromDevice);
        MenstruationTotalDto menstruationTotalDto = (MenstruationTotalDto) fromDevice;
        HMLog.info("xys_MenstruationRepo", new l0(menstruationTotalDto));
        menstruationRepo.manager.doAddDataFromDevice(menstruationTotalDto, Boxing.boxBoolean(false));
        jCurrentTimeMillis = j2;
        HMLog.info("xys_MenstruationRepo", new o0(System.currentTimeMillis(), jCurrentTimeMillis));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        EventBus.getDefault().post(new EventMenstruationOperation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object j(List<HistoryItemBean> list, boolean z2, boolean z3, Continuation<? super Unit> continuation) {
        if (list.isEmpty()) {
            if (z3) {
                Object objL = l(false, continuation);
                return objL == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objL : Unit.INSTANCE;
            }
        } else if (z3) {
            Object objL2 = l(z2, continuation);
            return objL2 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objL2 : Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object k(MenstruationRepo menstruationRepo, List list, boolean z2, boolean z3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        return menstruationRepo.j(list, z2, z3, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object l(boolean z2, Continuation<? super Unit> continuation) {
        q0 q0Var;
        long jCurrentTimeMillis;
        MenstruationRepo menstruationRepo;
        long j2;
        boolean z3 = z2;
        if (continuation instanceof q0) {
            q0Var = (q0) continuation;
            int i2 = q0Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.f = i2 - Integer.MIN_VALUE;
            } else {
                q0Var = new q0(continuation);
            }
        } else {
            q0Var = new q0(continuation);
        }
        Object fromDevice = q0Var.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = q0Var.f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(fromDevice);
            jCurrentTimeMillis = System.currentTimeMillis();
            if (this.deviceStatus.isConnected()) {
                if (z3 && FHUploadPermissionManager.INSTANCE.getHasPermission()) {
                    MenstruationDataManager menstruationDataManager = this.manager;
                    q0Var.a = this;
                    q0Var.b = z3;
                    q0Var.c = jCurrentTimeMillis;
                    q0Var.f = 1;
                    fromDevice = menstruationDataManager.readFromDevice(q0Var);
                    if (fromDevice == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    menstruationRepo = this;
                    j2 = jCurrentTimeMillis;
                } else {
                    MenstruationTotalDto menstruationTotalDtoPrepareMenstruationTotalData = this.manager.prepareMenstruationTotalData();
                    HMLog.info("xys_MenstruationRepo", new s0(z3, menstruationTotalDtoPrepareMenstruationTotalData));
                    MenstruationDataManager.writeToDevice$default(this.manager, menstruationTotalDtoPrepareMenstruationTotalData, null, false, null, 14, null);
                }
            }
            HMLog.info("xys_MenstruationRepo", new t0(System.currentTimeMillis(), jCurrentTimeMillis));
            return Unit.INSTANCE;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j2 = q0Var.c;
        z3 = q0Var.b;
        menstruationRepo = (MenstruationRepo) q0Var.a;
        ResultKt.throwOnFailure(fromDevice);
        MenstruationTotalDto menstruationTotalDto = (MenstruationTotalDto) fromDevice;
        HMLog.info("xys_MenstruationRepo", new r0(z3, menstruationTotalDto));
        menstruationRepo.manager.doAddDataFromDevice(menstruationTotalDto, Boxing.boxBoolean(true));
        jCurrentTimeMillis = j2;
        HMLog.info("xys_MenstruationRepo", new t0(System.currentTimeMillis(), jCurrentTimeMillis));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object syncDeviceFromNet$default(MenstruationRepo menstruationRepo, List list, boolean z2, boolean z3, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = null;
        }
        if ((i2 & 4) != 0) {
            z3 = true;
        }
        return menstruationRepo.syncDeviceFromNet(list, z2, z3, continuation);
    }

    @Nullable
    public final Object add(@NotNull Date date, @NotNull Date date2, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull Continuation<? super Integer> continuation) {
        HMLog.info("xys_MenstruationRepo", new a(date, date2, z2, z3, z4));
        this.manager.updateDateRangeByUser$logiclib_release(Boxing.boxLong(date.getTime()), Boxing.boxLong(date2.getTime()));
        List<MenstruationRecord> listG = g(date, date2, z2);
        HMLog.info("xys_MenstruationRepo", new b(listG));
        List<MenstruationRecord> listFindRecords = MenstruationSearchRepo.INSTANCE.findRecords(true, true, DateHelperKt.offset(date, -2), DateHelperKt.offset(date2, 2));
        if (listG == null || listG.isEmpty()) {
            return Boxing.boxInt(0);
        }
        MenstruationDataManager menstruationDataManager = this.manager;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listG, 10));
        Iterator<T> it2 = listG.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoExKt.toMenstruationDto((MenstruationRecord) it2.next()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindRecords, 10));
        Iterator<T> it3 = listFindRecords.iterator();
        while (it3.hasNext()) {
            arrayList2.add(PoExKt.toMenstruationDto((MenstruationRecord) it3.next()));
        }
        MenstruationDataManager.MergeResult mergeResultMergeMenstruation = menstruationDataManager.mergeMenstruation(arrayList, arrayList2, z3);
        if (z5) {
            List<MenstruationDto> toAdd = mergeResultMergeMenstruation.getToAdd();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : toAdd) {
                if (Boxing.boxBoolean(((MenstruationDto) obj).getTime() <= DateHelper.INSTANCE.today().getTime().getTime()).booleanValue()) {
                    arrayList3.add(obj);
                }
            }
            mergeResultMergeMenstruation = MenstruationDataManager.MergeResult.copy$default(mergeResultMergeMenstruation, CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList3), null, null, 6, null);
        }
        int iHandleMergeResult = z4 ? this.manager.handleMergeResult(mergeResultMergeMenstruation, Boxing.boxBoolean(z2)) : MenstruationDataManager.handleMergeResult$default(this.manager, mergeResultMergeMenstruation, null, 2, null);
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new c(null), 2, null);
        return Boxing.boxInt(iHandleMergeResult);
    }

    @Nullable
    public final Object checkUnsyncData(@NotNull Continuation<? super Unit> continuation) {
        Boolean isSyncServer;
        List<MenstruationRecord> listFindAll = MenstruationSearchRepo.INSTANCE.findAll();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindAll, 10));
        Iterator<T> it2 = listFindAll.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoExKt.toMenstruationDto((MenstruationRecord) it2.next()));
        }
        Iterator<T> it3 = this.manager.scanToFindSections(arrayList).entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            Iterable iterable = (Iterable) entry.getValue();
            boolean z2 = false;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it4 = iterable.iterator();
                do {
                    if (!it4.hasNext()) {
                        z2 = true;
                        break;
                    }
                    isSyncServer = ((MenstruationDto) it4.next()).getIsSyncServer();
                } while (!Boxing.boxBoolean(isSyncServer == null ? false : isSyncServer.booleanValue()).booleanValue());
            } else {
                z2 = true;
                break;
            }
            if (z2) {
                Boolean isEnd = ((MenstruationDto) CollectionsKt.first((List) entry.getValue())).getIsEnd();
                boolean zBooleanValue = isEnd != null ? isEnd.booleanValue() : true;
                HMLog.info("xys_MenstruationRepo", new d(entry, z2, zBooleanValue));
                this.manager.cloudUploadHistory(new Date(((Section) entry.getKey()).getStart()), new Date(((Section) entry.getKey()).getEnd()), zBooleanValue);
            }
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object clearLocalMenstruation(boolean z2, @NotNull Continuation<? super Unit> continuation) {
        i();
        if (z2) {
            DataCacheManager.INSTANCE.clear();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Nullable
    public final Object delete(@NotNull Date date, @NotNull Date date2, @Nullable Boolean bool, @Nullable String str, @NotNull DeleteType deleteType, @NotNull Continuation<? super Integer> continuation) {
        h hVar;
        String str2;
        DeleteType deleteType2;
        MenstruationRepo menstruationRepo;
        int i2;
        int i3;
        int i4;
        Date date3 = date;
        Date date4 = date2;
        Boolean bool2 = bool;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i5 = hVar.i;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                hVar.i = i5 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object obj = hVar.g;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i6 = hVar.i;
        if (i6 == 0) {
            ResultKt.throwOnFailure(obj);
            HMLog.info("xys_MenstruationRepo", new i(date3, date4));
            if (bool2 == null || !bool.booleanValue()) {
                str2 = str;
                deleteType2 = deleteType;
            } else {
                hVar.a = this;
                hVar.b = date3;
                hVar.c = date4;
                hVar.d = bool2;
                str2 = str;
                hVar.e = str2;
                deleteType2 = deleteType;
                hVar.f = deleteType2;
                hVar.i = 1;
                if (h(hVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            menstruationRepo = this;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DeleteType deleteType3 = (DeleteType) hVar.f;
            String str3 = (String) hVar.e;
            bool2 = (Boolean) hVar.d;
            Date date5 = (Date) hVar.c;
            Date date6 = (Date) hVar.b;
            menstruationRepo = (MenstruationRepo) hVar.a;
            ResultKt.throwOnFailure(obj);
            str2 = str3;
            date4 = date5;
            deleteType2 = deleteType3;
            date3 = date6;
        }
        Ref.IntRef intRef = new Ref.IntRef();
        menstruationRepo.manager.updateDateRangeByUser$logiclib_release(Boxing.boxLong(date3.getTime()), Boxing.boxLong(date4.getTime()));
        MenstruationSearchRepo menstruationSearchRepo = MenstruationSearchRepo.INSTANCE;
        HistoryItemBean historyItemBeanQueryLastMenstruation2 = menstruationSearchRepo.queryLastMenstruation2(date4);
        HMLog.info("xys_MenstruationRepo", new j(date3, date4, historyItemBeanQueryLastMenstruation2));
        if (historyItemBeanQueryLastMenstruation2 == null) {
            return Boxing.boxInt(intRef.element);
        }
        long menstrualPeriod = historyItemBeanQueryLastMenstruation2.getMenstrualPeriod();
        long jLongValue = historyItemBeanQueryLastMenstruation2.getMenstrualEndTime().longValue();
        HMLog.info("xys_MenstruationRepo", new k(bool2, menstrualPeriod, jLongValue, date3, date4));
        if (menstrualPeriod == date3.getTime() && jLongValue == date4.getTime()) {
            HMLog.info("xys_MenstruationRepo", l.a);
            String strFindMenstruationServerId = menstruationSearchRepo.findMenstruationServerId(date3, date4);
            HMLog.info("xys_MenstruationRepo", new m(strFindMenstruationServerId));
            if (strFindMenstruationServerId != null) {
                HMLog.info("xys_MenstruationRepo", new n(date3, date4));
                if (menstruationRepo.manager.cloudDeleteHistory(strFindMenstruationServerId, deleteType2)) {
                    menstruationRepo.d(strFindMenstruationServerId);
                    i4 = 0;
                } else {
                    i4 = 1;
                }
            } else {
                i4 = 0;
            }
            intRef.element = i4;
            HMLog.info("xys_MenstruationRepo", new o(intRef));
        } else if (jLongValue == date4.getTime()) {
            String id = historyItemBeanQueryLastMenstruation2.getId();
            boolean z2 = historyItemBeanQueryLastMenstruation2.getEnd() == 1;
            HMLog.info("xys_MenstruationRepo", new p(bool2, id, z2));
            if (Intrinsics.areEqual(bool2, Boxing.boxBoolean(true))) {
                if (menstruationRepo.manager.cloudDeleteHistory(id, deleteType2)) {
                    menstruationRepo.d(id);
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                intRef.element = i3;
            } else {
                if (menstruationRepo.manager.cloudModifyHistory(id, new Date(menstrualPeriod), DateHelperKt.offset(date3, -1), Boxing.boxBoolean(z2))) {
                    HMLog.info("xys_MenstruationRepo", new e(date3, date4));
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                intRef.element = i2;
            }
        } else {
            HMLog.error$default("xys_MenstruationRepo", null, null, new f(menstrualPeriod, jLongValue, date3, date4), 6, null);
            intRef.element = 1;
            if (str2 != null && (menstruationRepo.webApi.deleteMenstruation(str2, DeleteType.TYPE_MERGE) instanceof ApiSuccessResponse)) {
                intRef.element = 0;
                menstruationRepo.d(str2);
            }
        }
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, menstruationRepo.new g(null), 2, null);
        return Boxing.boxInt(intRef.element);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object deleteInvolved(@NotNull Pair<? extends Date, ? extends Date> pair, @NotNull String str, int i2, @NotNull Continuation<? super Map<Section, ? extends List<MenstruationDto>>> continuation) {
        q qVar;
        MenstruationRepo menstruationRepo;
        if (continuation instanceof q) {
            qVar = (q) continuation;
            int i3 = qVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.g = i3 - Integer.MIN_VALUE;
            } else {
                qVar = new q(continuation);
            }
        } else {
            qVar = new q(continuation);
        }
        Object obj = qVar.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = qVar.g;
        boolean z2 = true;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            HMLog.info("xys_MenstruationRepo", new r(pair, str));
            qVar.a = this;
            qVar.b = pair;
            qVar.c = str;
            qVar.d = i2;
            qVar.g = 1;
            if (h(qVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            menstruationRepo = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = qVar.d;
            str = (String) qVar.c;
            pair = (Pair) qVar.b;
            menstruationRepo = (MenstruationRepo) qVar.a;
            ResultKt.throwOnFailure(obj);
        }
        Date first = pair.getFirst();
        Date second = pair.getSecond();
        menstruationRepo.manager.updateDateRangeByUser$logiclib_release(Boxing.boxLong(first.getTime()), Boxing.boxLong(second.getTime()));
        List<MenstruationRecord> listFindRecords = MenstruationSearchRepo.INSTANCE.findRecords(false, true, DateHelperKt.offset(first, -i2), DateHelperKt.offset(second, i2));
        if (listFindRecords != null && !listFindRecords.isEmpty()) {
            z2 = false;
        }
        if (z2) {
            HMLog.warn$default("xys_MenstruationRepo", null, new s(first, second), 2, null);
            return null;
        }
        MenstruationDataManager menstruationDataManager = menstruationRepo.manager;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindRecords, 10));
        Iterator<T> it2 = listFindRecords.iterator();
        while (it2.hasNext()) {
            arrayList.add(PoExKt.toMenstruationDto((MenstruationRecord) it2.next()));
        }
        Map<Section, List<MenstruationDto>> mapScanToFindSections = menstruationDataManager.scanToFindSections(arrayList);
        for (Map.Entry<Section, List<MenstruationDto>> entry : mapScanToFindSections.entrySet()) {
            Date date = new Date(entry.getKey().getStart());
            Date date2 = new Date(entry.getKey().getEnd());
            String strFindMenstruationServerId = MenstruationSearchRepo.INSTANCE.findMenstruationServerId(date, date2);
            if (!Intrinsics.areEqual(str, strFindMenstruationServerId)) {
                if (strFindMenstruationServerId != null) {
                    Boxing.boxBoolean(menstruationRepo.manager.cloudDeleteHistory(strFindMenstruationServerId, DeleteType.TYPE_MERGE));
                }
                HMLog.debug("xys_MenstruationRepo", new t(date, date2));
            }
        }
        return mapScanToFindSections;
    }

    public final void getCartStatus(@NotNull final String id, @NotNull final Function1<? super List<HistoryDetailBean>, Unit> refresh) {
        this.appExecutors.getNetworkIO().execute(new Runnable() { // from class: e05
            @Override // java.lang.Runnable
            public final void run() {
                MenstruationRepo.c(id, refresh);
            }
        });
    }

    @Nullable
    public final Object getLastMenstruation(@NotNull Date date, @NotNull Continuation<? super List<MenstruationVo>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new w(date, null), continuation);
    }

    @Nullable
    public final Object getLastMenstruation2(@NotNull Date date, @NotNull Continuation<? super HistoryItemBean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new y(date, null), continuation);
    }

    @Nullable
    public final Object getMenstruationOfDay(@NotNull List<? extends Date> list, @NotNull Continuation<? super List<MenstruationVo>> continuation) {
        Object next;
        Object next2;
        if (list == null || list.isEmpty()) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                Long lBoxLong = Boxing.boxLong(((Date) next).getTime());
                do {
                    Object next3 = it2.next();
                    Long lBoxLong2 = Boxing.boxLong(((Date) next3).getTime());
                    if (lBoxLong.compareTo(lBoxLong2) > 0) {
                        next = next3;
                        lBoxLong = lBoxLong2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Date date = (Date) next;
        Iterator<T> it3 = list.iterator();
        if (it3.hasNext()) {
            next2 = it3.next();
            if (it3.hasNext()) {
                Long lBoxLong3 = Boxing.boxLong(((Date) next2).getTime());
                do {
                    Object next4 = it3.next();
                    Long lBoxLong4 = Boxing.boxLong(((Date) next4).getTime());
                    if (lBoxLong3.compareTo(lBoxLong4) < 0) {
                        next2 = next4;
                        lBoxLong3 = lBoxLong4;
                    }
                } while (it3.hasNext());
            }
        } else {
            next2 = null;
        }
        return BuildersKt.withContext(Dispatchers.getIO(), new z(date, (Date) next2, null), continuation);
    }

    @NotNull
    public final SharedPreferencesUtils getSp() {
        return this.sp;
    }

    @NotNull
    public final MutableLiveData<Boolean> getTrigger() {
        return this.trigger;
    }

    @NotNull
    public final LiveData<Resource<List<MenstruationWithSymptoms>>> loadLiveMenstruationWithSymptoms(@NotNull final Date lastDate) {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        this.appExecutors.getDiskIO().execute(new Runnable() { // from class: f05
            @Override // java.lang.Runnable
            public final void run() {
                MenstruationRepo.e(lastDate, mediatorLiveData);
            }
        });
        return mediatorLiveData;
    }

    public final void menstruationEndByDateRange(@NotNull Date sDate, @NotNull Date eDate, boolean isEnd) {
        String sId;
        HMLog.info("xys_MenstruationRepo", new c0(sDate, eDate, isEnd));
        List<MenstruationRecord> listFindByDateRange = MenstruationSearchRepo.INSTANCE.findByDateRange(sDate, eDate);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listFindByDateRange, 10));
        for (MenstruationRecord menstruationRecord : listFindByDateRange) {
            HMLog.info("xys_MenstruationRepo", new d0(menstruationRecord));
            arrayList.add(menstruationRecord);
        }
        MenstruationRecord menstruationRecord2 = (MenstruationRecord) CollectionsKt.firstOrNull((List) arrayList);
        if (menstruationRecord2 == null || (sId = menstruationRecord2.getSId()) == null) {
            return;
        }
        f(sId, isEnd);
    }

    @Nullable
    public final Object modify(@NotNull String str, @NotNull Date date, @NotNull Date date2, @NotNull Date date3, @NotNull Date date4, boolean z2, boolean z3, @NotNull Continuation<? super Integer> continuation) {
        HMLog.info("xys_MenstruationRepo", new h0(date, date2, date3, date4));
        boolean z4 = false;
        if ((!z2 || !z3) && date4.getTime() <= DateHelper.INSTANCE.today().getTimeInMillis()) {
            z4 = true;
        }
        HMLog.info("xys_MenstruationRepo", new i0(z2, z3, z4));
        return Boxing.boxInt(!this.manager.cloudModifyHistory(str, date3, date4, Boxing.boxBoolean(z4)) ? 1 : 0);
    }

    @NotNull
    public final List<MenstruationVo> queryAll() {
        List<MenstruationRecord> listFindAll = MenstruationSearchRepo.INSTANCE.findAll();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listFindAll) {
            if (((MenstruationRecord) obj).getInPeriod()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(PoToVoKt.toMenstruationVo((MenstruationRecord) it2.next()));
        }
        return arrayList2;
    }

    @Nullable
    public final Object setCardStatus(@NotNull MenstruationStatusBean menstruationStatusBean, @NotNull Continuation<? super MenstruationStatusBean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new p0(menstruationStatusBean, null), continuation);
    }

    public final void setInitSetting(int periodContinueTime, int periodCycle, long lastPeriodStartTime, boolean smartSwitch) {
        this.settingRepo.setInitSetting(new SettingVo(1, 1, false, periodContinueTime, false, 1, 1, false, smartSwitch, lastPeriodStartTime, periodCycle));
    }

    public final void setTrigger(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        this.trigger = mutableLiveData;
    }

    @Nullable
    public final Object syncDeviceFromNet(@Nullable List<HistoryItemBean> list, boolean z2, boolean z3, @NotNull Continuation<? super Unit> continuation) {
        if (list != null) {
            Object objJ = j(list, z2, z3, continuation);
            return objJ == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objJ : Unit.INSTANCE;
        }
        ApiResponse apiResponseLoadAllHistory$default = DataCacheManager.loadAllHistory$default(DataCacheManager.INSTANCE, false, 1, null);
        if (!(apiResponseLoadAllHistory$default instanceof ApiSuccessResponse)) {
            return Unit.INSTANCE;
        }
        Object objJ2 = j(((Items) ((ApiSuccessResponse) apiResponseLoadAllHistory$default).getBody()).getItems(), z2, z3, continuation);
        return objJ2 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objJ2 : Unit.INSTANCE;
    }

    @NotNull
    public final List<HistoryItemBean> updateAllFromCloud() {
        return this.manager.updateFromCloud(Integer.MAX_VALUE);
    }

    public final void writeToDeviceIfConnectAndRefresh(boolean mergeDev) {
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new u0(mergeDev, null), 2, null);
    }

    @Nullable
    public final Object getLastMenstruation(@NotNull Date date, boolean z2, @NotNull Continuation<? super List<MenstruationVo>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new x(date, z2, null), continuation);
    }
}
