package com.huami.bodymeasurements.temperature.model.repository.impl;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bodymeasurements.common.remote.net.vo.ApiErrorResponse;
import com.huami.bodymeasurements.common.remote.net.vo.ApiResponse;
import com.huami.bodymeasurements.common.remote.net.vo.ApiSuccessResponse;
import com.huami.bodymeasurements.common.remote.userevents.bean.UserEventsItem;
import com.huami.bodymeasurements.temperature.model.converter.SingleTempExKt;
import com.huami.bodymeasurements.temperature.model.device.TempDeviceApi;
import com.huami.bodymeasurements.temperature.model.device.dto.SingleTemperatureDo;
import com.huami.bodymeasurements.temperature.model.local.dao.SingleTempDao;
import com.huami.bodymeasurements.temperature.model.local.entity.SingleTempEntity;
import com.huami.bodymeasurements.temperature.model.remote.TempWebApi;
import com.huami.bodymeasurements.temperature.model.remote.bean.SingleTempBean;
import com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository;
import com.huami.bodymeasurements.temperature.view.vo.TemperatureVo;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u0001:\u00018B!\u0012\b\u0010,\u001a\u0004\u0018\u00010*\u0012\u0006\u0010/\u001a\u00020-\u0012\u0006\u00102\u001a\u000200¢\u0006\u0004\b6\u00107JA\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002J!\u0010\u0012\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u001cH\u0016J\u001b\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001aJ\u0013\u0010\u001f\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JK\u0010'\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001aR\u0018\u0010,\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010.R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u00101R\u0016\u00105\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lcom/huami/bodymeasurements/temperature/model/repository/impl/SingleTempRepositoryImpl;", "Lcom/huami/bodymeasurements/temperature/model/repository/TempBaseRepository;", "", "userId", "", "from", "to", "", "limit", "Lkotlin/Pair;", "Lcom/huami/bodymeasurements/temperature/model/remote/bean/SingleTempBean;", "a", "(Ljava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bodymeasurements/temperature/model/local/entity/SingleTempEntity;", "data", "", "b", "c", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "Lcom/huami/bodymeasurements/temperature/view/vo/TemperatureVo;", "getLocalTempBetweenTime", "(JJLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllLocalTemp", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestTemp", "Lkotlinx/coroutines/flow/Flow;", "getLatestTempFlow", "fetchTempFromServer", "cleanLocalTemp", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "firmVersion", "saveSingleTempFromDevice", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadUnSyncTempToServer", "Lcom/huami/bodymeasurements/temperature/model/device/TempDeviceApi;", "Lcom/huami/bodymeasurements/temperature/model/device/TempDeviceApi;", "deviceApi", "Lcom/huami/bodymeasurements/temperature/model/local/dao/SingleTempDao;", "Lcom/huami/bodymeasurements/temperature/model/local/dao/SingleTempDao;", "singleTempDao", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;", "webApi", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "appNameValue", "<init>", "(Lcom/huami/bodymeasurements/temperature/model/device/TempDeviceApi;Lcom/huami/bodymeasurements/temperature/model/local/dao/SingleTempDao;Lcom/huami/bodymeasurements/temperature/model/remote/TempWebApi;)V", "Companion", "temperature_release"}, k = 1, mv = {1, 5, 1})
public final class SingleTempRepositoryImpl implements TempBaseRepository {

    @NotNull
    public static final String TAG = "SingleTempRepositoryImpl";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private final TempDeviceApi deviceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final SingleTempDao singleTempDao;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final TempWebApi webApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String appNameValue = getAppName();

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl", f = "SingleTempRepositoryImpl.kt", i = {0, 1, 1}, l = {97, 99}, m = "fetchSingleTempFromServerByPage", n = {"this", "this", AbstractJSONTokenResponse.RESPONSE}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return SingleTempRepositoryImpl.this.a(null, 0L, 0L, 0, this);
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
            return "fetch singleTemperature from server is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<UserEventsItem<SingleTempBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ApiResponse<UserEventsItem<SingleTempBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fetch singleTemperature from server success :", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ ApiResponse<UserEventsItem<SingleTempBean>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ApiResponse<UserEventsItem<SingleTempBean>> apiResponse) {
            super(0);
            this.a = apiResponse;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("fetch singleTemperature from server failed:", ((ApiErrorResponse) this.a).getErrorMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/bodymeasurements/temperature/model/local/entity/SingleTempEntity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl$fetchSingleTempFromServerByPage$dataSaveToDb$1", f = "SingleTempRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SingleTempEntity>>, Object> {
        public int a;
        public final /* synthetic */ ApiResponse<UserEventsItem<SingleTempBean>> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ApiResponse<UserEventsItem<SingleTempBean>> apiResponse, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = apiResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SingleTempEntity>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SingleTempEntity>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<SingleTempEntity>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                arrayList.add(SingleTempExKt.toSingleTempEntity((SingleTempBean) it2.next()));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl", f = "SingleTempRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1}, l = {82, 86}, m = "fetchTempFromServer", n = {"this", "userId", "endTime", "this", "userId", "endTime"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return SingleTempRepositoryImpl.this.fetchTempFromServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ SingleTempEntity a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(SingleTempEntity singleTempEntity) {
            super(0);
            this.a = singleTempEntity;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("latestSingleTemp:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ ArrayList<TemperatureVo> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, ArrayList<TemperatureVo> arrayList) {
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
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ TemperatureVo a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(TemperatureVo temperatureVo) {
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
    public static final class j extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ long b;
        public final /* synthetic */ String c;
        public final /* synthetic */ ArrayList<TemperatureVo> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(long j, long j2, String str, ArrayList<TemperatureVo> arrayList) {
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
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl", f = "SingleTempRepositoryImpl.kt", i = {}, l = {137, 159}, m = "saveSingleTempFromDevice", n = {}, s = {})
    public static final class k extends ContinuationImpl {
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

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return SingleTempRepositoryImpl.this.saveSingleTempFromDevice(null, 0, 0, null, null, null, null, this);
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
            return "singleTempFromDevice is empty";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<String> {
        public final /* synthetic */ List<SingleTempEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(List<SingleTempEntity> list) {
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
    @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl", f = "SingleTempRepositoryImpl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING}, m = "uploadToServer", n = {}, s = {})
    public static final class n extends ContinuationImpl {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public int e;
        public int f;
        public /* synthetic */ Object g;
        public int i;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return SingleTempRepositoryImpl.this.c(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class o extends Lambda implements Function0<String> {
        public final /* synthetic */ List<SingleTempEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(List<SingleTempEntity> list) {
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
    public static final class p extends Lambda implements Function0<String> {
        public static final p a = new p();

        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "uploadSingleTemp success";
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
            return "uploadSingleTemp failed";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class r extends Lambda implements Function0<String> {
        public final /* synthetic */ List<SingleTempEntity> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(List<SingleTempEntity> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("unSyncData size:", Integer.valueOf(this.a.size()));
        }
    }

    public SingleTempRepositoryImpl(@Nullable TempDeviceApi tempDeviceApi, @NotNull SingleTempDao singleTempDao, @NotNull TempWebApi tempWebApi) {
        this.deviceApi = tempDeviceApi;
        this.singleTempDao = singleTempDao;
        this.webApi = tempWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, long j2, long j3, int i2, Continuation<? super Pair<Integer, SingleTempBean>> continuation) throws Throwable {
        a aVar;
        SingleTempRepositoryImpl singleTempRepositoryImpl;
        ApiResponse apiResponse;
        SingleTempRepositoryImpl singleTempRepositoryImpl2;
        List<SingleTempEntity> list;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i3 = aVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.e = i3 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objFetchSingleTempByTimeRange = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = aVar.e;
        if (i4 != 0) {
            if (i4 == 1) {
                singleTempRepositoryImpl = (SingleTempRepositoryImpl) aVar.a;
                ResultKt.throwOnFailure(objFetchSingleTempByTimeRange);
            } else {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiResponse = (ApiResponse) aVar.b;
                singleTempRepositoryImpl2 = (SingleTempRepositoryImpl) aVar.a;
                ResultKt.throwOnFailure(objFetchSingleTempByTimeRange);
            }
            list = (List) objFetchSingleTempByTimeRange;
            if (list.isEmpty()) {
                HMLog.info("SingleTempRepositoryImpl", b.a);
                new Pair(Boxing.boxInt(0), null);
            }
            singleTempRepositoryImpl2.b(list);
            HMLog.info("SingleTempRepositoryImpl", new c(apiResponse));
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse;
            return new Pair(Boxing.boxInt(((UserEventsItem) apiSuccessResponse.getBody()).getItems().size()), ((UserEventsItem) apiSuccessResponse.getBody()).getNext());
        }
        ResultKt.throwOnFailure(objFetchSingleTempByTimeRange);
        TempWebApi tempWebApi = this.webApi;
        aVar.a = this;
        aVar.e = 1;
        objFetchSingleTempByTimeRange = tempWebApi.fetchSingleTempByTimeRange(str, j2, j3, i2, aVar);
        if (objFetchSingleTempByTimeRange == coroutine_suspended) {
            return coroutine_suspended;
        }
        singleTempRepositoryImpl = this;
        ApiResponse apiResponse2 = (ApiResponse) objFetchSingleTempByTimeRange;
        if (!(apiResponse2 instanceof ApiSuccessResponse)) {
            if (!(apiResponse2 instanceof ApiErrorResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.warn$default("SingleTempRepositoryImpl", null, new d(apiResponse2), 2, null);
            return new Pair(Boxing.boxInt(0), null);
        }
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        e eVar = new e(apiResponse2, null);
        aVar.a = singleTempRepositoryImpl;
        aVar.b = apiResponse2;
        aVar.e = 2;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, eVar, aVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        SingleTempRepositoryImpl singleTempRepositoryImpl3 = singleTempRepositoryImpl;
        apiResponse = apiResponse2;
        objFetchSingleTempByTimeRange = objWithContext;
        singleTempRepositoryImpl2 = singleTempRepositoryImpl3;
        list = (List) objFetchSingleTempByTimeRange;
        if (list.isEmpty()) {
            HMLog.info("SingleTempRepositoryImpl", b.a);
            new Pair(Boxing.boxInt(0), null);
        }
        singleTempRepositoryImpl2.b(list);
        HMLog.info("SingleTempRepositoryImpl", new c(apiResponse));
        ApiSuccessResponse apiSuccessResponse2 = (ApiSuccessResponse) apiResponse;
        return new Pair(Boxing.boxInt(((UserEventsItem) apiSuccessResponse2.getBody()).getItems().size()), ((UserEventsItem) apiSuccessResponse2.getBody()).getNext());
    }

    private final void b(List<SingleTempEntity> data) {
        HMLog.info("SingleTempRepositoryImpl", new m(data));
        this.singleTempDao.insertOrUpdateSingleTemp(data);
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
    public final java.lang.Object c(java.util.List<com.huami.bodymeasurements.temperature.model.local.entity.SingleTempEntity> r20, kotlin.coroutines.Continuation<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl.c(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object cleanLocalTemp(@NotNull Continuation<? super Unit> continuation) {
        this.singleTempDao.clean();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object fetchTempFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        f fVar;
        SingleTempRepositoryImpl singleTempRepositoryImpl;
        String str2;
        long j2;
        Long lBoxLong;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.f = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object objA = fVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar2.f;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objA);
            SingleTempEntity latestSingleTemp = this.singleTempDao.getLatestSingleTemp(str);
            HMLog.info("SingleTempRepositoryImpl", new g(latestSingleTemp));
            long jLongValue = 0;
            if (latestSingleTemp != null && (lBoxLong = Boxing.boxLong(latestSingleTemp.getTimestamp())) != null) {
                jLongValue = lBoxLong.longValue();
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            fVar2.a = this;
            fVar2.b = str;
            fVar2.c = jCurrentTimeMillis;
            fVar2.f = 1;
            objA = a(str, jLongValue, jCurrentTimeMillis, 1000, fVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            singleTempRepositoryImpl = this;
            str2 = str;
            j2 = jCurrentTimeMillis;
        } else {
            if (i3 != 1 && i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = fVar2.c;
            str2 = (String) fVar2.b;
            singleTempRepositoryImpl = (SingleTempRepositoryImpl) fVar2.a;
            ResultKt.throwOnFailure(objA);
        }
        do {
            Pair pair = (Pair) objA;
            if (((Number) pair.getFirst()).intValue() != 1000 || pair.getSecond() == null) {
                return Unit.INSTANCE;
            }
            long timestamp = ((SingleTempBean) pair.getSecond()).getTimestamp();
            fVar2.a = singleTempRepositoryImpl;
            fVar2.b = str2;
            fVar2.c = j2;
            fVar2.f = 2;
            objA = singleTempRepositoryImpl.a(str2, timestamp, j2, 1000, fVar2);
        } while (objA != coroutine_suspended);
        return coroutine_suspended;
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object getAllLocalTemp(@NotNull String str, @NotNull Continuation<? super List<TemperatureVo>> continuation) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = this.singleTempDao.getSingleTempAll().iterator();
        while (it2.hasNext()) {
            arrayList.add(SingleTempExKt.toTemperatureVo((SingleTempEntity) it2.next()));
        }
        if (arrayList.size() > 1) {
            kotlin.collections.g.sortWith(arrayList, new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl$getAllLocalTemp$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureVo) t).getTimestamp()), Long.valueOf(((TemperatureVo) t2).getTimestamp()));
                }
            });
        }
        HMLog.info("SingleTempRepositoryImpl", new h(str, arrayList));
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
        SingleTempEntity latestSingleTemp = this.singleTempDao.getLatestSingleTemp(str);
        TemperatureVo temperatureVo = latestSingleTemp == null ? null : SingleTempExKt.toTemperatureVo(latestSingleTemp);
        HMLog.info("SingleTempRepositoryImpl", new i(temperatureVo));
        return temperatureVo;
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @NotNull
    public Flow<TemperatureVo> getLatestTempFlow() {
        final Flow<SingleTempEntity> latestSingleTempFlow = this.singleTempDao.getLatestSingleTempFlow();
        return new Flow<TemperatureVo>() { // from class: com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl$getLatestTempFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl$getLatestTempFlow$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<SingleTempEntity> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ SingleTempRepositoryImpl$getLatestTempFlow$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl$getLatestTempFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl$getLatestTempFlow$$inlined$map$1$2", f = "SingleTempRepositoryImpl.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, SingleTempRepositoryImpl$getLatestTempFlow$$inlined$map$1 singleTempRepositoryImpl$getLatestTempFlow$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = singleTempRepositoryImpl$getLatestTempFlow$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(SingleTempEntity singleTempEntity, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
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
                        SingleTempEntity singleTempEntity2 = singleTempEntity;
                        TemperatureVo temperatureVo = singleTempEntity2 == null ? null : SingleTempExKt.toTemperatureVo(singleTempEntity2);
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(temperatureVo, anonymousClass1) == coroutine_suspended) {
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
                Object objCollect = latestSingleTempFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object getLocalTempBetweenTime(long j2, long j3, @NotNull String str, @NotNull Continuation<? super List<TemperatureVo>> continuation) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = this.singleTempDao.getSingleTempBetweenTimestamp(j2, j3, str).iterator();
        while (it2.hasNext()) {
            arrayList.add(SingleTempExKt.toTemperatureVo((SingleTempEntity) it2.next()));
        }
        CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.huami.bodymeasurements.temperature.model.repository.impl.SingleTempRepositoryImpl$getLocalTempBetweenTime$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((TemperatureVo) t).getTimestamp()), Long.valueOf(((TemperatureVo) t2).getTimestamp()));
            }
        });
        HMLog.info("SingleTempRepositoryImpl", new j(j2, j3, str, arrayList));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object saveSingleTempFromDevice(@NotNull String str, int i2, int i3, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull Continuation<? super Unit> continuation) {
        k kVar;
        String str6;
        SingleTempRepositoryImpl singleTempRepositoryImpl;
        Object obj;
        String str7;
        String str8;
        String str9;
        String str10;
        int i4;
        int i5;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i6 = kVar.k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                kVar.k = i6 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object obj2 = kVar.i;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i7 = kVar.k;
        if (i7 != 0) {
            if (i7 == 1) {
                int i8 = kVar.h;
                int i9 = kVar.g;
                String str11 = (String) kVar.f;
                String str12 = (String) kVar.e;
                String str13 = (String) kVar.d;
                String str14 = (String) kVar.c;
                String str15 = (String) kVar.b;
                SingleTempRepositoryImpl singleTempRepositoryImpl2 = (SingleTempRepositoryImpl) kVar.a;
                ResultKt.throwOnFailure(obj2);
                i5 = i8;
                str10 = str11;
                str9 = str12;
                str8 = str13;
                str7 = str14;
                str6 = str15;
                singleTempRepositoryImpl = singleTempRepositoryImpl2;
                obj = obj2;
                i4 = i9;
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj2);
        TempDeviceApi tempDeviceApi = this.deviceApi;
        if (tempDeviceApi == null) {
            return Unit.INSTANCE;
        }
        kVar.a = this;
        str6 = str;
        kVar.b = str6;
        kVar.c = str2;
        kVar.d = str3;
        kVar.e = str4;
        kVar.f = str5;
        kVar.g = i2;
        kVar.h = i3;
        kVar.k = 1;
        Object singleTempFromDevice = tempDeviceApi.getSingleTempFromDevice(kVar);
        if (singleTempFromDevice == coroutine_suspended) {
            return coroutine_suspended;
        }
        singleTempRepositoryImpl = this;
        obj = singleTempFromDevice;
        str7 = str2;
        str8 = str3;
        str9 = str4;
        str10 = str5;
        i4 = i2;
        i5 = i3;
        List list = (List) obj;
        if (list.isEmpty()) {
            HMLog.info("SingleTempRepositoryImpl", l.a);
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList2 = arrayList;
            arrayList2.add(SingleTempExKt.toSingleTempEntity((SingleTemperatureDo) it2.next(), str6, i4, i5, str7, str8, str9, singleTempRepositoryImpl.appNameValue, str10));
            singleTempRepositoryImpl = singleTempRepositoryImpl;
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = arrayList;
        SingleTempRepositoryImpl singleTempRepositoryImpl3 = singleTempRepositoryImpl;
        singleTempRepositoryImpl3.b(arrayList3);
        kVar.a = null;
        kVar.b = null;
        kVar.c = null;
        kVar.d = null;
        kVar.e = null;
        kVar.f = null;
        kVar.k = 2;
        if (singleTempRepositoryImpl3.c(arrayList3, kVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.bodymeasurements.temperature.model.repository.TempBaseRepository
    @Nullable
    public Object uploadUnSyncTempToServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        List<SingleTempEntity> unSyncSingleTempList = this.singleTempDao.getUnSyncSingleTempList();
        HMLog.info("SingleTempRepositoryImpl", new r(unSyncSingleTempList));
        if (unSyncSingleTempList.isEmpty()) {
            return Unit.INSTANCE;
        }
        Object objC = c(unSyncSingleTempList, continuation);
        return objC == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objC : Unit.INSTANCE;
    }
}
