package com.huami.bodymeasurements.temperature.model.repository.impl;

import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.remote.net.vo.ApiErrorResponse;
import com.huami.bodymeasurements.common.remote.net.vo.ApiResponse;
import com.huami.bodymeasurements.common.remote.net.vo.ApiSuccessResponse;
import com.huami.bodymeasurements.common.remote.userevents.bean.UserEventsItem;
import com.huami.bodymeasurements.temperature.model.converter.AllDayTempDataService;
import com.huami.bodymeasurements.temperature.model.converter.AllDayTempExKt;
import com.huami.bodymeasurements.temperature.model.device.TempDeviceApi;
import com.huami.bodymeasurements.temperature.model.device.dto.AllDayTemperatureDataDo;
import com.huami.bodymeasurements.temperature.model.local.dao.AllDayTempDao;
import com.huami.bodymeasurements.temperature.model.local.entity.AllDayTempEntity;
import com.huami.bodymeasurements.temperature.model.remote.TempWebApi;
import com.huami.bodymeasurements.temperature.model.remote.bean.AllDayTempBean;
import com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 =2\u00020\u0001:\u0001=B!\u0012\b\u00101\u001a\u0004\u0018\u00010/\u0012\u0006\u00104\u001a\u000202\u0012\u0006\u00107\u001a\u000205¢\u0006\u0004\b;\u0010<JK\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0082@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002J\u0016\u0010\u0016\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0002J!\u0010\u0017\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0014H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0!H\u0016J\u001b\u0010#\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u001fJ\u0013\u0010$\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010%JK\u0010,\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u00022\u0006\u0010+\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001b\u0010.\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010\u001fR\u0018\u00101\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0016\u0010:\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/repository/impl/AllDayTempRepositoryImpl;", "Lcom/huami/bodymeasurements/temperature/model/repository/TempBaseRepository;", "", "userId", "", "from", "to", "", "limit", "", "firstFetch", "Landroid/util/Pair;", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/AllDayTempBean;", "c", "(Ljava/lang/String;JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bodymeasurements/temperature/model/local/entity/AllDayTempEntity;", "data", "a", "newData", "b", "", "", "e", "f", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "getLocalTempBetweenTime", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLocalTemp", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestTemp", "Lkotlinx/coroutines/flow/Flow;", "getLatestTempFlow", "fetchTempFromServer", "cleanLocalTemp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "firmVersion", "saveAllDayTempFromDevice", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadUnSyncTempToServer", "Lcom/huami/bodymeasurements/temperature/model/device/TempDeviceApi;", "Lcom/huami/bodymeasurements/temperature/model/device/TempDeviceApi;", "deviceApi", "Lcom/huami/bodymeasurements/temperature/model/local/dao/AllDayTempDao;", "Lcom/huami/bodymeasurements/temperature/model/local/dao/AllDayTempDao;", "allDayTempDao", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "webApi", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "appNameValue", "<init>", "(Lcom/huami/bodymeasurements/temperature/model/device/TempDeviceApi;Lcom/huami/bodymeasurements/temperature/model/local/dao/AllDayTempDao;Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;)V", "Companion", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class AllDayTempRepositoryImpl implements TempBaseRepository {

    @NotNull
    public static final String TAG = "AllDayTempRepositoryImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final TempDeviceApi deviceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AllDayTempDao allDayTempDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TempWebApi webApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String appNameValue = getAppName();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl", f = "AllDayTempRepositoryImpl.kt", i = {0, 0, 1, 1, 1}, l = {111, 113}, m = "fetchAllDayTempFromServerByPage", n = {"this", "firstFetch", "this", AbstractJSONTokenResponse.RESPONSE, "firstFetch"}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public boolean c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return AllDayTempRepositoryImpl.this.c(null, 0L, 0L, 0, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ long b;
        public final /* synthetic */ long c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, long j, long j2, boolean z) {
            super(0);
            this.a = str;
            this.b = j;
            this.c = j2;
            this.d = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userId:" + this.a + ",from:" + this.b + ",to:" + this.c + ",firstFetch:" + this.d;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "fetch allDayTemperature from server is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<UserEventsItem<AllDayTempBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ApiResponse<UserEventsItem<AllDayTempBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fetch allDayTemperature from server success :", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<UserEventsItem<AllDayTempBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ApiResponse<UserEventsItem<AllDayTempBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fetch allDayTemperature from server failed:", ((ApiErrorResponse) this.a).getErrorMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bodymeasurements/temperature/model/local/entity/AllDayTempEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl$fetchAllDayTempFromServerByPage$dataSaveToDb$1", f = "AllDayTempRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AllDayTempEntity>>, Object> {
        public int a;
        public final /* synthetic */ ApiResponse<UserEventsItem<AllDayTempBean>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ApiResponse<UserEventsItem<AllDayTempBean>> apiResponse, Continuation<? super f> continuation) {
            super(2, continuation);
            this.b = apiResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AllDayTempEntity>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<AllDayTempEntity>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<AllDayTempEntity>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List items = ((UserEventsItem) ((ApiSuccessResponse) this.b).getBody()).getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
            Iterator it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(AllDayTempExKt.toAllDayTempEntity((AllDayTempBean) it2.next()));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl", f = "AllDayTempRepositoryImpl.kt", i = {0, 0, 0}, l = {90, 93}, m = "fetchTempFromServer", n = {"this", "userId", "endTime"}, s = {"L$0", "L$1", "J$0"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return AllDayTempRepositoryImpl.this.fetchTempFromServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ AllDayTempEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(AllDayTempEntity allDayTempEntity) {
            super(0);
            this.a = allDayTempEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("latestAllDay:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ ArrayList<TemperatureVo> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, ArrayList<TemperatureVo> arrayList) {
            super(0);
            this.a = str;
            this.b = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "userId:" + this.a + "--->result size:" + this.b.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ TemperatureVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(TemperatureVo temperatureVo) {
            super(0);
            this.a = temperatureVo;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("latestTemp :", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ArrayList<TemperatureVo> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(long j, long j2, String str, ArrayList<TemperatureVo> arrayList) {
            super(0);
            this.a = j;
            this.b = j2;
            this.c = str;
            this.d = arrayList;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start:" + this.a + ",end:" + this.b + ",userId:" + this.c + "--->result size:" + this.d.size();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl", f = "AllDayTempRepositoryImpl.kt", i = {}, l = {166, DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER}, m = "saveAllDayTempFromDevice", n = {}, s = {})
    public static final class l extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public int g;
        public int h;
        public /* synthetic */ Object i;
        public int k;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return AllDayTempRepositoryImpl.this.saveAllDayTempFromDevice(null, 0, 0, null, null, null, null, this);
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
            return "allDayTempFromDevice is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class n extends Lambda implements Function0<String> {
        public final /* synthetic */ List<AllDayTempEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List<AllDayTempEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("saveToDb data size:", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl", f = "AllDayTempRepositoryImpl.kt", i = {}, l = {FTPCodes.NAME_SYSTEM_TIME}, m = "uploadToServer", n = {}, s = {})
    public static final class o extends ContinuationImpl {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public int e;
        public int f;
        public /* synthetic */ Object g;
        public int i;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return AllDayTempRepositoryImpl.this.f(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class p extends Lambda implements Function0<String> {
        public final /* synthetic */ List<AllDayTempEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(List<AllDayTempEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("uploadToServer data size:", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class q extends Lambda implements Function0<String> {
        public static final q a = new q();

        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadAllDayTemp success";
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
            return "uploadAllDayTemp failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class s extends Lambda implements Function0<String> {
        public final /* synthetic */ List<AllDayTempEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(List<AllDayTempEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("unSyncData size:", Integer.valueOf(this.a.size()));
        }
    }

    public AllDayTempRepositoryImpl(@Nullable TempDeviceApi tempDeviceApi, @NotNull AllDayTempDao allDayTempDao, @NotNull TempWebApi tempWebApi) {
        this.deviceApi = tempDeviceApi;
        this.allDayTempDao = allDayTempDao;
        this.webApi = tempWebApi;
    }

    private final AllDayTempEntity a(AllDayTempEntity data) {
        AllDayTempEntity allDayTempByTimestamp = this.allDayTempDao.getAllDayTempByTimestamp(data.getTimestamp());
        if (allDayTempByTimestamp == null) {
            return null;
        }
        return AllDayTempDataService.INSTANCE.combineAllDayTemp(allDayTempByTimestamp, data);
    }

    private final AllDayTempEntity b(AllDayTempEntity newData) {
        AllDayTempEntity allDayTempEntityCombineAllDayTemp;
        AllDayTempEntity allDayTempByTimestamp = this.allDayTempDao.getAllDayTempByTimestamp(newData.getTimestamp());
        return (allDayTempByTimestamp == null || (allDayTempEntityCombineAllDayTemp = AllDayTempDataService.INSTANCE.combineAllDayTemp(allDayTempByTimestamp, newData)) == null) ? newData : allDayTempEntityCombineAllDayTemp;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:46:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(String str, long j2, long j3, int i2, boolean z, Continuation<? super Pair<Integer, AllDayTempBean>> continuation) throws Throwable {
        a aVar;
        boolean z2;
        Object objFetchAllDayTempByTimeRange;
        AllDayTempRepositoryImpl allDayTempRepositoryImpl;
        boolean z3;
        AllDayTempRepositoryImpl allDayTempRepositoryImpl2;
        ApiResponse apiResponse;
        List<AllDayTempEntity> list;
        Iterator<T> it2;
        Object next;
        Long lBoxLong;
        Object next2;
        Long lBoxLong2;
        AllDayTempEntity allDayTempEntityA;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i3 = aVar.f;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = aVar.f;
        Object obj2 = null;
        if (i4 != 0) {
            if (i4 == 1) {
                boolean z4 = aVar.c;
                allDayTempRepositoryImpl = (AllDayTempRepositoryImpl) aVar.a;
                ResultKt.throwOnFailure(obj);
                objFetchAllDayTempByTimeRange = obj;
                z2 = z4;
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z3 = aVar.c;
                apiResponse = (ApiResponse) aVar.b;
                allDayTempRepositoryImpl2 = (AllDayTempRepositoryImpl) aVar.a;
                ResultKt.throwOnFailure(obj);
                obj2 = obj2;
            }
            list = (List) obj;
            if (list.isEmpty()) {
                HMLog.info("AllDayTempRepositoryImpl", c.a);
                return new Pair(Boxing.boxInt(0), obj2);
            }
            allDayTempRepositoryImpl2.e(list);
            if (z3) {
                it2 = list.iterator();
                if (it2.hasNext()) {
                    next = it2.next();
                    if (it2.hasNext()) {
                        lBoxLong = Boxing.boxLong(((AllDayTempEntity) next).getTimestamp());
                        do {
                            next2 = it2.next();
                            lBoxLong2 = Boxing.boxLong(((AllDayTempEntity) next2).getTimestamp());
                            if (lBoxLong.compareTo(lBoxLong2) > 0) {
                                next = next2;
                                lBoxLong = lBoxLong2;
                            }
                        } while (it2.hasNext());
                    }
                } else {
                    next = obj2;
                }
                allDayTempEntityA = allDayTempRepositoryImpl2.a((AllDayTempEntity) next);
                if (allDayTempEntityA != null) {
                    allDayTempRepositoryImpl2.e(CollectionsKt__CollectionsKt.arrayListOf(allDayTempEntityA));
                }
            }
            HMLog.info("AllDayTempRepositoryImpl", new d(apiResponse));
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse;
            return new Pair(Boxing.boxInt(((UserEventsItem) apiSuccessResponse.getBody()).getItems().size()), ((UserEventsItem) apiSuccessResponse.getBody()).getNext());
        }
        ResultKt.throwOnFailure(obj);
        HMLog.info("AllDayTempRepositoryImpl", new b(str, j2, j3, z));
        TempWebApi tempWebApi = this.webApi;
        aVar.a = this;
        z2 = z;
        aVar.c = z2;
        aVar.f = 1;
        objFetchAllDayTempByTimeRange = tempWebApi.fetchAllDayTempByTimeRange(str, j2, j3, i2, aVar);
        if (objFetchAllDayTempByTimeRange == coroutine_suspended) {
            return coroutine_suspended;
        }
        allDayTempRepositoryImpl = this;
        ApiResponse apiResponse2 = (ApiResponse) objFetchAllDayTempByTimeRange;
        if (!(apiResponse2 instanceof ApiSuccessResponse)) {
            if (!(apiResponse2 instanceof ApiErrorResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.warn$default("AllDayTempRepositoryImpl", obj2, new e(apiResponse2), 2, obj2);
            return new Pair(Boxing.boxInt(0), obj2);
        }
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        f fVar = new f(apiResponse2, obj2);
        aVar.a = allDayTempRepositoryImpl;
        aVar.b = apiResponse2;
        aVar.c = z2;
        aVar.f = 2;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, fVar, aVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        z3 = z2;
        obj = objWithContext;
        allDayTempRepositoryImpl2 = allDayTempRepositoryImpl;
        apiResponse = apiResponse2;
        list = (List) obj;
        if (list.isEmpty()) {
            HMLog.info("AllDayTempRepositoryImpl", c.a);
            return new Pair(Boxing.boxInt(0), obj2);
        }
        allDayTempRepositoryImpl2.e(list);
        if (z3) {
            it2 = list.iterator();
            if (it2.hasNext()) {
                next = obj2;
            } else {
                next = it2.next();
                if (it2.hasNext()) {
                    lBoxLong = Boxing.boxLong(((AllDayTempEntity) next).getTimestamp());
                    do {
                        next2 = it2.next();
                        lBoxLong2 = Boxing.boxLong(((AllDayTempEntity) next2).getTimestamp());
                        if (lBoxLong.compareTo(lBoxLong2) > 0) {
                            next = next2;
                            lBoxLong = lBoxLong2;
                        }
                    } while (it2.hasNext());
                }
            }
            allDayTempEntityA = allDayTempRepositoryImpl2.a((AllDayTempEntity) next);
            if (allDayTempEntityA != null) {
                allDayTempRepositoryImpl2.e(CollectionsKt__CollectionsKt.arrayListOf(allDayTempEntityA));
            }
        }
        HMLog.info("AllDayTempRepositoryImpl", new d(apiResponse));
        ApiSuccessResponse apiSuccessResponse2 = (ApiSuccessResponse) apiResponse;
        return new Pair(Boxing.boxInt(((UserEventsItem) apiSuccessResponse2.getBody()).getItems().size()), ((UserEventsItem) apiSuccessResponse2.getBody()).getNext());
    }

    private final void e(List<AllDayTempEntity> data) {
        HMLog.info("AllDayTempRepositoryImpl", new n(data));
        this.allDayTempDao.insertOrUpdateAllDayTempList(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x007b  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x009a A[LOOP:1: B:25:0x0094->B:27:0x009a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d7 A[LOOP:0: B:35:0x00d1->B:37:0x00d7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00bd -> B:32:0x00c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object f(java.util.List<com.huami.bodymeasurements.temperature.model.local.entity.AllDayTempEntity> r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl.f(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object cleanLocalTemp(@NotNull Continuation<? super Unit> continuation) {
        this.allDayTempDao.clean();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cd -> B:38:0x00d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @org.jetbrains.annotations.Nullable
    public java.lang.Object fetchTempFromServer(@org.jetbrains.annotations.NotNull java.lang.String r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r25) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl.fetchTempFromServer(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object getAllLocalTemp(@NotNull String str, @NotNull Continuation<? super List<TemperatureVo>> continuation) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = this.allDayTempDao.getAllDayTempAll().iterator();
        while (it2.hasNext()) {
            arrayList.addAll(AllDayTempExKt.toTempList((AllDayTempEntity) it2.next()));
        }
        if (arrayList.size() > 1) {
            kotlin.collections.g.sortWith(arrayList, new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl$getAllLocalTemp$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureVo) t).getTimestamp()), Long.valueOf(((TemperatureVo) t2).getTimestamp()));
                }
            });
        }
        HMLog.info("AllDayTempRepositoryImpl", new i(str, arrayList));
        return arrayList;
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @NotNull
    public String getAppName() {
        return TempBaseRepository.DefaultImpls.getAppName(this);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return TempBaseRepository.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object getLatestTemp(@NotNull String str, @NotNull Continuation<? super TemperatureVo> continuation) {
        List<TemperatureVo> tempList;
        AllDayTempEntity latestAllDayTemp = this.allDayTempDao.getLatestAllDayTemp(str);
        TemperatureVo temperatureVo = null;
        Object next = null;
        temperatureVo = null;
        if (latestAllDayTemp != null && (tempList = AllDayTempExKt.toTempList(latestAllDayTemp)) != null) {
            Iterator<T> it2 = tempList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    Long lBoxLong = Boxing.boxLong(((TemperatureVo) next).getTimestamp());
                    do {
                        Object next2 = it2.next();
                        Long lBoxLong2 = Boxing.boxLong(((TemperatureVo) next2).getTimestamp());
                        if (lBoxLong.compareTo(lBoxLong2) < 0) {
                            next = next2;
                            lBoxLong = lBoxLong2;
                        }
                    } while (it2.hasNext());
                }
            }
            temperatureVo = (TemperatureVo) next;
        }
        HMLog.info("AllDayTempRepositoryImpl", new j(temperatureVo));
        return temperatureVo;
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @NotNull
    public Flow<TemperatureVo> getLatestTempFlow() {
        final Flow<AllDayTempEntity> latestAllDayTempFlow = this.allDayTempDao.getLatestAllDayTempFlow();
        return new Flow<TemperatureVo>() { // from class: com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl$getLatestTempFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl$getLatestTempFlow$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<AllDayTempEntity> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ AllDayTempRepositoryImpl$getLatestTempFlow$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl$getLatestTempFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl$getLatestTempFlow$$inlined$map$1$2", f = "AllDayTempRepositoryImpl.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, AllDayTempRepositoryImpl$getLatestTempFlow$$inlined$map$1 allDayTempRepositoryImpl$getLatestTempFlow$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = allDayTempRepositoryImpl$getLatestTempFlow$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(AllDayTempEntity allDayTempEntity, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    List<TemperatureVo> tempList;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        AllDayTempEntity allDayTempEntity2 = allDayTempEntity;
                        Object next = null;
                        if (allDayTempEntity2 != null && (tempList = AllDayTempExKt.toTempList(allDayTempEntity2)) != null) {
                            Iterator<T> it2 = tempList.iterator();
                            if (it2.hasNext()) {
                                next = it2.next();
                                if (it2.hasNext()) {
                                    Long lBoxLong = Boxing.boxLong(((TemperatureVo) next).getTimestamp());
                                    do {
                                        Object next2 = it2.next();
                                        Long lBoxLong2 = Boxing.boxLong(((TemperatureVo) next2).getTimestamp());
                                        if (lBoxLong.compareTo(lBoxLong2) < 0) {
                                            next = next2;
                                            lBoxLong = lBoxLong2;
                                        }
                                    } while (it2.hasNext());
                                }
                            }
                            next = (TemperatureVo) next;
                        }
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(next, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super TemperatureVo> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = latestAllDayTempFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object getLocalTempBetweenTime(long j2, long j3, @NotNull String str, @NotNull Continuation<? super List<TemperatureVo>> continuation) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = this.allDayTempDao.getAllDayTempBetweenTimestamp(j2, j3, str).iterator();
        while (it2.hasNext()) {
            arrayList.addAll(AllDayTempExKt.toTempList((AllDayTempEntity) it2.next()));
        }
        if (arrayList.size() > 1) {
            kotlin.collections.g.sortWith(arrayList, new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.repository.impl.AllDayTempRepositoryImpl$getLocalTempBetweenTime$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureVo) t).getTimestamp()), Long.valueOf(((TemperatureVo) t2).getTimestamp()));
                }
            });
        }
        HMLog.info("AllDayTempRepositoryImpl", new k(j2, j3, str, arrayList));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object saveAllDayTempFromDevice(@NotNull String str, int i2, int i3, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Continuation<? super Unit> continuation) {
        l lVar;
        String str6;
        String str7;
        int i4;
        int i5;
        String str8;
        String str9;
        String str10;
        AllDayTempRepositoryImpl allDayTempRepositoryImpl;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i6 = lVar.k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                lVar.k = i6 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        Object allDayTempFromDevice = lVar.i;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i7 = lVar.k;
        if (i7 != 0) {
            if (i7 == 1) {
                int i8 = lVar.h;
                int i9 = lVar.g;
                String str11 = (String) lVar.f;
                String str12 = (String) lVar.e;
                String str13 = (String) lVar.d;
                String str14 = (String) lVar.c;
                String str15 = (String) lVar.b;
                AllDayTempRepositoryImpl allDayTempRepositoryImpl2 = (AllDayTempRepositoryImpl) lVar.a;
                ResultKt.throwOnFailure(allDayTempFromDevice);
                str7 = str11;
                str6 = str12;
                str10 = str15;
                str8 = str14;
                i5 = i8;
                allDayTempRepositoryImpl = allDayTempRepositoryImpl2;
                str9 = str13;
                i4 = i9;
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(allDayTempFromDevice);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(allDayTempFromDevice);
        TempDeviceApi tempDeviceApi = this.deviceApi;
        if (tempDeviceApi == null) {
            return Unit.INSTANCE;
        }
        lVar.a = this;
        lVar.b = str;
        lVar.c = str2;
        lVar.d = str3;
        lVar.e = str4;
        lVar.f = str5;
        lVar.g = i2;
        lVar.h = i3;
        lVar.k = 1;
        allDayTempFromDevice = tempDeviceApi.getAllDayTempFromDevice(lVar);
        if (allDayTempFromDevice == coroutine_suspended) {
            return coroutine_suspended;
        }
        str6 = str4;
        str7 = str5;
        i4 = i2;
        i5 = i3;
        str8 = str2;
        str9 = str3;
        str10 = str;
        allDayTempRepositoryImpl = this;
        List<AllDayTemperatureDataDo> list = (List) allDayTempFromDevice;
        if (list.isEmpty()) {
            HMLog.info("AllDayTempRepositoryImpl", m.a);
            return Unit.INSTANCE;
        }
        List<AllDayTempEntity> deviceDataToAllDayTempList = AllDayTempDataService.INSTANCE.parseDeviceDataToAllDayTempList(list, str10, i4, i5, str8, str9, str6, allDayTempRepositoryImpl.appNameValue, str7);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(deviceDataToAllDayTempList, 10));
        Iterator<T> it2 = deviceDataToAllDayTempList.iterator();
        while (it2.hasNext()) {
            arrayList.add(allDayTempRepositoryImpl.b((AllDayTempEntity) it2.next()));
        }
        allDayTempRepositoryImpl.e(arrayList);
        lVar.a = null;
        lVar.b = null;
        lVar.c = null;
        lVar.d = null;
        lVar.e = null;
        lVar.f = null;
        lVar.k = 2;
        if (allDayTempRepositoryImpl.f(arrayList, lVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object uploadUnSyncTempToServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        List<AllDayTempEntity> unSyncAllDayTempList = this.allDayTempDao.getUnSyncAllDayTempList();
        HMLog.info("AllDayTempRepositoryImpl", new s(unSyncAllDayTempList));
        if (unSyncAllDayTempList.isEmpty()) {
            return Unit.INSTANCE;
        }
        Object objF = f(unSyncAllDayTempList, continuation);
        return objF == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objF : Unit.INSTANCE;
    }
}
