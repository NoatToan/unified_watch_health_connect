package com.huami.stress.domain.data;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.heartrate.constant.ConstantKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.stress.domain.data.converter.AllDayStressApiBeanExKt;
import com.huami.stress.domain.data.converter.AllDayStressDaoBeanEXKt;
import com.huami.stress.domain.data.device.StressDeviceApi;
import com.huami.stress.domain.data.device.bean.StressDeviceBean;
import com.huami.stress.domain.data.local.bean.AllDayStressDaoBean;
import com.huami.stress.domain.data.local.dao.AllDayStressDao;
import com.huami.stress.domain.data.remote.StressWebApi;
import com.huami.stress.domain.data.remote.bean.AllDayStressApiBean;
import com.huami.stress.domain.data.remote.bean.GetAllDayStressListResponse;
import com.huami.stress.domain.data.remote.net.ApiErrorResponse;
import com.huami.stress.domain.data.remote.net.ApiResponse;
import com.huami.stress.domain.data.remote.net.ApiSuccessResponse;
import com.huami.stress.domain.model.AllDayStress;
import com.huami.stress.domain.repository.AllDayStressRepository;
import com.huami.stress.domain.service.StressService;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.huami.widget.wheelview.Constant;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001FB\u001f\u0012\u0006\u0010<\u001a\u00020:\u0012\u0006\u0010?\u001a\u00020=\u0012\u0006\u0010C\u001a\u00020@¢\u0006\u0004\bD\u0010EJ\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJK\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0 H\u0016J\u001d\u0010#\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J)\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00182\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010(Js\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u00102\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u001a\u00101\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b\u0018\u000100H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b4\u00105J%\u00106\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001b\u00108\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b8\u00105J\u001b\u00109\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b9\u00105R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u0016\u0010C\u001a\u00020@8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006G"}, d2 = {"Lcom/huami/stress/domain/data/AllDayStressRepositoryImpl;", "Lcom/huami/stress/domain/repository/AllDayStressRepository;", "Lcom/huami/stress/domain/data/local/bean/AllDayStressDaoBean;", "data", "a", "(Lcom/huami/stress/domain/data/local/bean/AllDayStressDaoBean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "userId", "", "fromTime", "endTime", "", GoogleApiAvailabilityLight.a, "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "from", "to", "", "limit", "", "firstFetch", "Lkotlin/Pair;", "Lcom/huami/stress/domain/data/remote/bean/AllDayStressApiBean;", "b", "(Ljava/lang/String;JJIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "unSyncData", "e", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/model/AllDayStress;", "getTodayAllDayStressFromLocal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestAllDayStressFromLocal", "Lkotlinx/coroutines/flow/Flow;", "getLatestAllDayStressFromLocalFlow", "timestamp", "getAllDayStressFromLocalByTimestamp", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "getAllDayStressFromLocalBetweenStamp", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "Ljava/util/Calendar;", "calendar", "Lkotlin/Function2;", "saveSyncTime", "saveAllDayStressFromDevice", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLatestAllDayStressFromServer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAllDayStressFromServerByTime", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveAllDayStressFromServer", "syncAllDayStressToServer", "Lcom/huami/stress/domain/data/local/dao/AllDayStressDao;", "Lcom/huami/stress/domain/data/local/dao/AllDayStressDao;", "allDayStressDao", "Lcom/huami/stress/domain/data/device/StressDeviceApi;", "Lcom/huami/stress/domain/data/device/StressDeviceApi;", "deviceApi", "Lcom/huami/stress/domain/data/remote/StressWebApi;", "c", "Lcom/huami/stress/domain/data/remote/StressWebApi;", "webApi", "<init>", "(Lcom/huami/stress/domain/data/local/dao/AllDayStressDao;Lcom/huami/stress/domain/data/device/StressDeviceApi;Lcom/huami/stress/domain/data/remote/StressWebApi;)V", "Companion", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class AllDayStressRepositoryImpl implements AllDayStressRepository {
    public static final int DATA_LOAD_SIZE = 1000;
    public static final int DATA_UPLOAD_LIMIT = 7;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final AllDayStressDao allDayStressDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final StressDeviceApi deviceApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final StressWebApi webApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {0}, l = {134}, m = "combineLocalData", n = {"data"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.a(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {}, l = {67}, m = "getAllDayStressFromLocalBetweenStamp", n = {}, s = {})
    public static final class b extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.getAllDayStressFromLocalBetweenStamp(0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {}, l = {59}, m = "getAllDayStressFromLocalByTimestamp", n = {}, s = {})
    public static final class c extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.getAllDayStressFromLocalByTimestamp(0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {}, l = {48}, m = "getLatestAllDayStressFromLocal", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.getLatestAllDayStressFromLocal(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {}, l = {43}, m = "getTodayAllDayStressFromLocal", n = {}, s = {})
    public static final class e extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.getTodayAllDayStressFromLocal(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 3}, l = {82, 95, 108, 112}, m = "saveAllDayStressFromDevice", n = {"this", "userId", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "calendar", "saveSyncTime", "deviceType", "deviceSource", "destination$iv$iv", "it", "combineDataList"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$2", "L$4", "L$2"})
    public static final class f extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public int h;
        public int i;
        public /* synthetic */ Object j;
        public int l;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.saveAllDayStressFromDevice(null, 0, 0, null, null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/data/local/bean/AllDayStressDaoBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl$saveAllDayStressFromDevice$serviceData$1", f = "AllDayStressRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AllDayStressDaoBean>>, Object> {
        public int a;
        public final /* synthetic */ Pair<Boolean, List<StressDeviceBean>> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;
        public final /* synthetic */ String f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Pair<Boolean, ? extends List<StressDeviceBean>> pair, String str, int i, int i2, String str2, String str3, String str4, Continuation<? super g> continuation) {
            super(2, continuation);
            this.b = pair;
            this.c = str;
            this.d = i;
            this.e = i2;
            this.f = str2;
            this.g = str3;
            this.h = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new g(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AllDayStressDaoBean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<AllDayStressDaoBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<AllDayStressDaoBean>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return StressService.INSTANCE.parseDeviceDataToAllDayStressList(this.b.getSecond(), this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {0, 0}, l = {DataTypeSource.SPORT_TYPE_MODERN_DANCE, DataTypeSource.SPORT_TYPE_TAP_DANCE, 189}, m = "saveAllDayStressFromServer", n = {"this", "userId"}, s = {"L$0", "L$1"})
    public static final class h extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.saveAllDayStressFromServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {0, 0, 1, 1, 1, 3}, l = {219, 222, 232, 235, 237, 240, Constant.HEIGHT_MAX, 246}, m = "saveAllDayStressFromServerByPage", n = {"this", "firstFetch", "this", AbstractJSONTokenResponse.RESPONSE, "firstFetch", "combineData"}, s = {"L$0", "Z$0", "L$0", "L$1", "Z$0", "L$2"})
    public static final class i extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public boolean d;
        public /* synthetic */ Object e;
        public int g;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.e = obj;
            this.g |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.b(null, 0L, 0L, 0, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/data/local/bean/AllDayStressDaoBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl$saveAllDayStressFromServerByPage$dataSaveToDb$1", f = "AllDayStressRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AllDayStressDaoBean>>, Object> {
        public int a;
        public final /* synthetic */ ApiResponse<GetAllDayStressListResponse> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ApiResponse<GetAllDayStressListResponse> apiResponse, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = apiResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AllDayStressDaoBean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<AllDayStressDaoBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<AllDayStressDaoBean>> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<AllDayStressApiBean> items = ((GetAllDayStressListResponse) ((ApiSuccessResponse) this.b).getBody()).getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(AllDayStressApiBeanExKt.toAllDayStressDaoBean((AllDayStressApiBean) it2.next()));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {0, 0}, l = {DataTypeSource.SPORT_TYPE_SNOWSHOE_HIKING, DataTypeSource.SPORT_TYPE_SHOOT}, m = "saveAllDayStressFromServerByTime", n = {"this", "timestamp"}, s = {"L$0", "J$0"})
    public static final class k extends ContinuationImpl {
        public Object a;
        public long b;
        public /* synthetic */ Object c;
        public int e;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.saveAllDayStressFromServerByTime(null, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1}, l = {204, 207}, m = "saveAllDayStressFromServerByTimeRange", n = {"this", "userId", "endTime", "this", "userId", "endTime"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
    public static final class l extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
        public /* synthetic */ Object d;
        public int f;

        public l(Continuation<? super l> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.d(null, 0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {0, 1, 1, 1, 2, 2, 3, 3}, l = {147, 153, 156, 159}, m = "saveLatestAllDayStressFromServer", n = {"this", "this", AbstractJSONTokenResponse.RESPONSE, "data", "this", AbstractJSONTokenResponse.RESPONSE, "this", AbstractJSONTokenResponse.RESPONSE}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1"})
    public static final class m extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.saveLatestAllDayStressFromServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {0, 0, 1, 1}, l = {WeightingState.state_weight_overload, 275}, m = "syncAllDayStressToServer", n = {"this", "userId", "sourListSize", "subCount"}, s = {"L$0", "L$1", "I$0", "I$1"})
    public static final class n extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public int e;
        public int f;
        public int g;
        public /* synthetic */ Object h;
        public int j;

        public n(Continuation<? super n> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.syncAllDayStressToServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl", f = "AllDayStressRepositoryImpl.kt", i = {0, 0, 0, 1, 1}, l = {ConstantKt.DRAW_END_INDEX, 295, 298}, m = "uploadDataToServer", n = {"this", "userId", "unSyncData", "this", "unSyncData"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
    public static final class o extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return AllDayStressRepositoryImpl.this.e(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/data/remote/bean/AllDayStressApiBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl$uploadDataToServer$updateData$1", f = "AllDayStressRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends AllDayStressApiBean>>, Object> {
        public int a;
        public final /* synthetic */ List<AllDayStressDaoBean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(List<AllDayStressDaoBean> list, Continuation<? super p> continuation) {
            super(2, continuation);
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new p(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends AllDayStressApiBean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<AllDayStressApiBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<AllDayStressApiBean>> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<AllDayStressDaoBean> list = this.b;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(AllDayStressDaoBeanEXKt.toAllDayStressApiBean((AllDayStressDaoBean) it2.next()));
            }
            return arrayList;
        }
    }

    public AllDayStressRepositoryImpl(@NotNull AllDayStressDao allDayStressDao, @NotNull StressDeviceApi stressDeviceApi, @NotNull StressWebApi stressWebApi) {
        this.allDayStressDao = allDayStressDao;
        this.deviceApi = stressDeviceApi;
        this.webApi = stressWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(AllDayStressDaoBean allDayStressDaoBean, Continuation<? super AllDayStressDaoBean> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.d = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object allDayStressByTimestamp = aVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(allDayStressByTimestamp);
            AllDayStressDao allDayStressDao = this.allDayStressDao;
            long timestamp = allDayStressDaoBean.getTimestamp();
            aVar.a = allDayStressDaoBean;
            aVar.d = 1;
            allDayStressByTimestamp = allDayStressDao.getAllDayStressByTimestamp(timestamp, aVar);
            if (allDayStressByTimestamp == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            allDayStressDaoBean = (AllDayStressDaoBean) aVar.a;
            ResultKt.throwOnFailure(allDayStressByTimestamp);
        }
        AllDayStressDaoBean allDayStressDaoBean2 = (AllDayStressDaoBean) allDayStressByTimestamp;
        if ((allDayStressDaoBean2 == null || TextUtils.equals(allDayStressDaoBean2.getData(), allDayStressDaoBean.getData())) ? false : true) {
            return StressService.INSTANCE.combineAllDayStress(allDayStressDaoBean, allDayStressDaoBean2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ff A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0100  */
    /* JADX WARN: Code duplicated, block: B:43:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0116  */
    /* JADX WARN: Code duplicated, block: B:47:0x0127 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:50:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0138  */
    /* JADX WARN: Code duplicated, block: B:53:0x0148 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x017c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0180  */
    /* JADX WARN: Code duplicated, block: B:60:0x0199  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(String str, long j2, long j3, int i2, boolean z, Continuation<? super Pair<Integer, AllDayStressApiBean>> continuation) throws Throwable {
        i iVar;
        boolean z2;
        Object allDayStressByTimeRange;
        AllDayStressRepositoryImpl allDayStressRepositoryImpl;
        ApiResponse apiResponse;
        Object objWithContext;
        boolean z3;
        ApiResponse apiResponse2;
        List<AllDayStressDaoBean> list;
        AllDayStressDao allDayStressDao;
        AllDayStressDao allDayStressDao2;
        Object objA;
        List<AllDayStressDaoBean> list2;
        AllDayStressDaoBean allDayStressDaoBean;
        AllDayStressDao allDayStressDao3;
        AllDayStressDao allDayStressDao4;
        AllDayStressDaoBean allDayStressDaoBean2;
        AllDayStressRepositoryImpl allDayStressRepositoryImpl2;
        ApiResponse apiResponse3;
        AllDayStressDao allDayStressDao5;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i3 = iVar.g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.g = i3 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.e;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        switch (iVar.g) {
            case 0:
                ResultKt.throwOnFailure(obj);
                StressWebApi stressWebApi = this.webApi;
                iVar.a = this;
                z2 = z;
                iVar.d = z2;
                iVar.g = 1;
                allDayStressByTimeRange = stressWebApi.getAllDayStressByTimeRange(str, j2, j3, i2, iVar);
                if (allDayStressByTimeRange == coroutine_suspended) {
                    return coroutine_suspended;
                }
                allDayStressRepositoryImpl = this;
                apiResponse = (ApiResponse) allDayStressByTimeRange;
                if (apiResponse instanceof ApiSuccessResponse) {
                    if (apiResponse instanceof ApiErrorResponse) {
                        throw new NoWhenBranchMatchedException();
                    }
                    HMLog.e(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl), Intrinsics.stringPlus("get allDayStress from server error: ", apiResponse), new Object[0]);
                    return new Pair(Boxing.boxInt(0), null);
                }
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                j jVar = new j(apiResponse, null);
                iVar.a = allDayStressRepositoryImpl;
                iVar.b = apiResponse;
                iVar.d = z2;
                iVar.g = 2;
                objWithContext = BuildersKt.withContext(coroutineDispatcher, jVar, iVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z3 = z2;
                obj = objWithContext;
                apiResponse2 = apiResponse;
                list = (List) obj;
                if (!z3) {
                    allDayStressDao = allDayStressRepositoryImpl.allDayStressDao;
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.g = 8;
                    if (allDayStressDao.insertOrUpdateAllDayStressList(list, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (!list.isEmpty()) {
                    AllDayStressDaoBean allDayStressDaoBean3 = list.get(0);
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.c = list;
                    iVar.g = 3;
                    objA = allDayStressRepositoryImpl.a(allDayStressDaoBean3, iVar);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = list;
                    obj = objA;
                    allDayStressDaoBean = (AllDayStressDaoBean) obj;
                    if (allDayStressDaoBean != null) {
                        allDayStressDao4 = allDayStressRepositoryImpl.allDayStressDao;
                        iVar.a = allDayStressRepositoryImpl;
                        iVar.b = apiResponse2;
                        iVar.c = allDayStressDaoBean;
                        iVar.g = 4;
                        if (allDayStressDao4.insertOrUpdateAllDayStressList(list2, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        allDayStressDaoBean2 = allDayStressDaoBean;
                        allDayStressDao5 = allDayStressRepositoryImpl.allDayStressDao;
                        iVar.a = allDayStressRepositoryImpl;
                        iVar.b = apiResponse2;
                        iVar.c = null;
                        iVar.g = 5;
                        if (allDayStressDao5.insertOrUpdateAllDayStress(allDayStressDaoBean2, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        allDayStressDao3 = allDayStressRepositoryImpl.allDayStressDao;
                        iVar.a = allDayStressRepositoryImpl;
                        iVar.b = apiResponse2;
                        iVar.c = null;
                        iVar.g = 6;
                        if (allDayStressDao3.insertOrUpdateAllDayStressList(list2, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    allDayStressDao2 = allDayStressRepositoryImpl.allDayStressDao;
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.g = 7;
                    if (allDayStressDao2.insertOrUpdateAllDayStressList(list, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                allDayStressRepositoryImpl2 = allDayStressRepositoryImpl;
                apiResponse3 = apiResponse2;
                HMLog.i(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl2), Intrinsics.stringPlus("get allDayStress from server sucdess ", apiResponse3), new Object[0]);
                ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse3;
                return new Pair(Boxing.boxInt(((GetAllDayStressListResponse) apiSuccessResponse.getBody()).getItems().size()), ((GetAllDayStressListResponse) apiSuccessResponse.getBody()).getNext());
            case 1:
                boolean z4 = iVar.d;
                allDayStressRepositoryImpl = (AllDayStressRepositoryImpl) iVar.a;
                ResultKt.throwOnFailure(obj);
                allDayStressByTimeRange = obj;
                z2 = z4;
                apiResponse = (ApiResponse) allDayStressByTimeRange;
                if (apiResponse instanceof ApiSuccessResponse) {
                    if (apiResponse instanceof ApiErrorResponse) {
                        throw new NoWhenBranchMatchedException();
                    }
                    HMLog.e(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl), Intrinsics.stringPlus("get allDayStress from server error: ", apiResponse), new Object[0]);
                    return new Pair(Boxing.boxInt(0), null);
                }
                CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
                j jVar2 = new j(apiResponse, null);
                iVar.a = allDayStressRepositoryImpl;
                iVar.b = apiResponse;
                iVar.d = z2;
                iVar.g = 2;
                objWithContext = BuildersKt.withContext(coroutineDispatcher2, jVar2, iVar);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                z3 = z2;
                obj = objWithContext;
                apiResponse2 = apiResponse;
                list = (List) obj;
                if (!z3) {
                    allDayStressDao = allDayStressRepositoryImpl.allDayStressDao;
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.g = 8;
                    if (allDayStressDao.insertOrUpdateAllDayStressList(list, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (!list.isEmpty()) {
                    AllDayStressDaoBean allDayStressDaoBean4 = list.get(0);
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.c = list;
                    iVar.g = 3;
                    objA = allDayStressRepositoryImpl.a(allDayStressDaoBean4, iVar);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = list;
                    obj = objA;
                    allDayStressDaoBean = (AllDayStressDaoBean) obj;
                    if (allDayStressDaoBean != null) {
                        allDayStressDao4 = allDayStressRepositoryImpl.allDayStressDao;
                        iVar.a = allDayStressRepositoryImpl;
                        iVar.b = apiResponse2;
                        iVar.c = allDayStressDaoBean;
                        iVar.g = 4;
                        if (allDayStressDao4.insertOrUpdateAllDayStressList(list2, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        allDayStressDaoBean2 = allDayStressDaoBean;
                        allDayStressDao5 = allDayStressRepositoryImpl.allDayStressDao;
                        iVar.a = allDayStressRepositoryImpl;
                        iVar.b = apiResponse2;
                        iVar.c = null;
                        iVar.g = 5;
                        if (allDayStressDao5.insertOrUpdateAllDayStress(allDayStressDaoBean2, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        allDayStressDao3 = allDayStressRepositoryImpl.allDayStressDao;
                        iVar.a = allDayStressRepositoryImpl;
                        iVar.b = apiResponse2;
                        iVar.c = null;
                        iVar.g = 6;
                        if (allDayStressDao3.insertOrUpdateAllDayStressList(list2, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    allDayStressDao2 = allDayStressRepositoryImpl.allDayStressDao;
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.g = 7;
                    if (allDayStressDao2.insertOrUpdateAllDayStressList(list, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                allDayStressRepositoryImpl2 = allDayStressRepositoryImpl;
                apiResponse3 = apiResponse2;
                HMLog.i(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl2), Intrinsics.stringPlus("get allDayStress from server sucdess ", apiResponse3), new Object[0]);
                ApiSuccessResponse apiSuccessResponse2 = (ApiSuccessResponse) apiResponse3;
                return new Pair(Boxing.boxInt(((GetAllDayStressListResponse) apiSuccessResponse2.getBody()).getItems().size()), ((GetAllDayStressListResponse) apiSuccessResponse2.getBody()).getNext());
            case 2:
                z3 = iVar.d;
                ApiResponse apiResponse4 = (ApiResponse) iVar.b;
                AllDayStressRepositoryImpl allDayStressRepositoryImpl3 = (AllDayStressRepositoryImpl) iVar.a;
                ResultKt.throwOnFailure(obj);
                apiResponse2 = apiResponse4;
                allDayStressRepositoryImpl = allDayStressRepositoryImpl3;
                list = (List) obj;
                if (!z3) {
                    allDayStressDao = allDayStressRepositoryImpl.allDayStressDao;
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.g = 8;
                    if (allDayStressDao.insertOrUpdateAllDayStressList(list, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (!list.isEmpty()) {
                    AllDayStressDaoBean allDayStressDaoBean5 = list.get(0);
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.c = list;
                    iVar.g = 3;
                    objA = allDayStressRepositoryImpl.a(allDayStressDaoBean5, iVar);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = list;
                    obj = objA;
                    allDayStressDaoBean = (AllDayStressDaoBean) obj;
                    if (allDayStressDaoBean != null) {
                        allDayStressDao4 = allDayStressRepositoryImpl.allDayStressDao;
                        iVar.a = allDayStressRepositoryImpl;
                        iVar.b = apiResponse2;
                        iVar.c = allDayStressDaoBean;
                        iVar.g = 4;
                        if (allDayStressDao4.insertOrUpdateAllDayStressList(list2, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        allDayStressDaoBean2 = allDayStressDaoBean;
                        allDayStressDao5 = allDayStressRepositoryImpl.allDayStressDao;
                        iVar.a = allDayStressRepositoryImpl;
                        iVar.b = apiResponse2;
                        iVar.c = null;
                        iVar.g = 5;
                        if (allDayStressDao5.insertOrUpdateAllDayStress(allDayStressDaoBean2, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        allDayStressDao3 = allDayStressRepositoryImpl.allDayStressDao;
                        iVar.a = allDayStressRepositoryImpl;
                        iVar.b = apiResponse2;
                        iVar.c = null;
                        iVar.g = 6;
                        if (allDayStressDao3.insertOrUpdateAllDayStressList(list2, iVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    allDayStressDao2 = allDayStressRepositoryImpl.allDayStressDao;
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.g = 7;
                    if (allDayStressDao2.insertOrUpdateAllDayStressList(list, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                allDayStressRepositoryImpl2 = allDayStressRepositoryImpl;
                apiResponse3 = apiResponse2;
                HMLog.i(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl2), Intrinsics.stringPlus("get allDayStress from server sucdess ", apiResponse3), new Object[0]);
                ApiSuccessResponse apiSuccessResponse3 = (ApiSuccessResponse) apiResponse3;
                return new Pair(Boxing.boxInt(((GetAllDayStressListResponse) apiSuccessResponse3.getBody()).getItems().size()), ((GetAllDayStressListResponse) apiSuccessResponse3.getBody()).getNext());
            case 3:
                list2 = (List) iVar.c;
                ApiResponse apiResponse5 = (ApiResponse) iVar.b;
                AllDayStressRepositoryImpl allDayStressRepositoryImpl4 = (AllDayStressRepositoryImpl) iVar.a;
                ResultKt.throwOnFailure(obj);
                apiResponse2 = apiResponse5;
                allDayStressRepositoryImpl = allDayStressRepositoryImpl4;
                allDayStressDaoBean = (AllDayStressDaoBean) obj;
                if (allDayStressDaoBean != null) {
                    allDayStressDao4 = allDayStressRepositoryImpl.allDayStressDao;
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.c = allDayStressDaoBean;
                    iVar.g = 4;
                    if (allDayStressDao4.insertOrUpdateAllDayStressList(list2, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    allDayStressDaoBean2 = allDayStressDaoBean;
                    allDayStressDao5 = allDayStressRepositoryImpl.allDayStressDao;
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.c = null;
                    iVar.g = 5;
                    if (allDayStressDao5.insertOrUpdateAllDayStress(allDayStressDaoBean2, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    allDayStressDao3 = allDayStressRepositoryImpl.allDayStressDao;
                    iVar.a = allDayStressRepositoryImpl;
                    iVar.b = apiResponse2;
                    iVar.c = null;
                    iVar.g = 6;
                    if (allDayStressDao3.insertOrUpdateAllDayStressList(list2, iVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                allDayStressRepositoryImpl2 = allDayStressRepositoryImpl;
                apiResponse3 = apiResponse2;
                HMLog.i(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl2), Intrinsics.stringPlus("get allDayStress from server sucdess ", apiResponse3), new Object[0]);
                ApiSuccessResponse apiSuccessResponse4 = (ApiSuccessResponse) apiResponse3;
                return new Pair(Boxing.boxInt(((GetAllDayStressListResponse) apiSuccessResponse4.getBody()).getItems().size()), ((GetAllDayStressListResponse) apiSuccessResponse4.getBody()).getNext());
            case 4:
                allDayStressDaoBean2 = (AllDayStressDaoBean) iVar.c;
                ApiResponse apiResponse6 = (ApiResponse) iVar.b;
                AllDayStressRepositoryImpl allDayStressRepositoryImpl5 = (AllDayStressRepositoryImpl) iVar.a;
                ResultKt.throwOnFailure(obj);
                apiResponse2 = apiResponse6;
                allDayStressRepositoryImpl = allDayStressRepositoryImpl5;
                allDayStressDao5 = allDayStressRepositoryImpl.allDayStressDao;
                iVar.a = allDayStressRepositoryImpl;
                iVar.b = apiResponse2;
                iVar.c = null;
                iVar.g = 5;
                if (allDayStressDao5.insertOrUpdateAllDayStress(allDayStressDaoBean2, iVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                allDayStressRepositoryImpl2 = allDayStressRepositoryImpl;
                apiResponse3 = apiResponse2;
                HMLog.i(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl2), Intrinsics.stringPlus("get allDayStress from server sucdess ", apiResponse3), new Object[0]);
                ApiSuccessResponse apiSuccessResponse5 = (ApiSuccessResponse) apiResponse3;
                return new Pair(Boxing.boxInt(((GetAllDayStressListResponse) apiSuccessResponse5.getBody()).getItems().size()), ((GetAllDayStressListResponse) apiSuccessResponse5.getBody()).getNext());
            case 5:
            case 6:
            case 7:
            case 8:
                apiResponse3 = (ApiResponse) iVar.b;
                allDayStressRepositoryImpl2 = (AllDayStressRepositoryImpl) iVar.a;
                ResultKt.throwOnFailure(obj);
                HMLog.i(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl2), Intrinsics.stringPlus("get allDayStress from server sucdess ", apiResponse3), new Object[0]);
                ApiSuccessResponse apiSuccessResponse6 = (ApiSuccessResponse) apiResponse3;
                return new Pair(Boxing.boxInt(((GetAllDayStressListResponse) apiSuccessResponse6.getBody()).getItems().size()), ((GetAllDayStressListResponse) apiSuccessResponse6.getBody()).getNext());
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static /* synthetic */ Object c(AllDayStressRepositoryImpl allDayStressRepositoryImpl, String str, long j2, long j3, int i2, boolean z, Continuation continuation, int i3, Object obj) {
        return allDayStressRepositoryImpl.b(str, j2, j3, i2, (i3 & 16) != 0 ? true : z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0092  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ba -> B:29:0x00bd). Please report as a decompilation issue!!! */
    public final Object d(String str, long j2, long j3, Continuation<? super Unit> continuation) throws Throwable {
        l lVar;
        String str2;
        long j4;
        AllDayStressRepositoryImpl allDayStressRepositoryImpl;
        Pair pair;
        AllDayStressRepositoryImpl allDayStressRepositoryImpl2;
        l lVar2;
        Object obj;
        long j5;
        if (continuation instanceof l) {
            lVar = (l) continuation;
            int i2 = lVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lVar.f = i2 - Integer.MIN_VALUE;
            } else {
                lVar = new l(continuation);
            }
        } else {
            lVar = new l(continuation);
        }
        l lVar3 = lVar;
        Object objC = lVar3.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = lVar3.f;
        int i4 = 2;
        if (i3 != 0) {
            if (i3 == 1) {
                j4 = lVar3.c;
                String str3 = (String) lVar3.b;
                allDayStressRepositoryImpl = (AllDayStressRepositoryImpl) lVar3.a;
                ResultKt.throwOnFailure(objC);
                str2 = str3;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                long j6 = lVar3.c;
                String str4 = (String) lVar3.b;
                AllDayStressRepositoryImpl allDayStressRepositoryImpl3 = (AllDayStressRepositoryImpl) lVar3.a;
                ResultKt.throwOnFailure(objC);
                str2 = str4;
                allDayStressRepositoryImpl2 = allDayStressRepositoryImpl3;
                lVar2 = lVar3;
                obj = coroutine_suspended;
                j5 = j6;
            }
            pair = (Pair) objC;
            i4 = 2;
            if (((Number) pair.getFirst()).intValue() == 1000 || pair.getSecond() == null) {
                return Unit.INSTANCE;
            }
            long timestamp = ((AllDayStressApiBean) pair.getSecond()).getTimestamp();
            lVar2.a = allDayStressRepositoryImpl2;
            lVar2.b = str2;
            lVar2.c = j5;
            lVar2.f = i4;
            Object obj2 = obj;
            l lVar4 = lVar2;
            Object objB = allDayStressRepositoryImpl2.b(str2, timestamp, j5, 1000, false, lVar2);
            if (objB == obj2) {
                return obj2;
            }
            lVar2 = lVar4;
            objC = objB;
            obj = obj2;
            pair = (Pair) objC;
            i4 = 2;
            if (((Number) pair.getFirst()).intValue() == 1000) {
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objC);
        lVar3.a = this;
        str2 = str;
        lVar3.b = str2;
        lVar3.c = j3;
        lVar3.f = 1;
        objC = c(this, str, j2, j3, 1000, false, lVar3, 16, null);
        if (objC == coroutine_suspended) {
            return coroutine_suspended;
        }
        j4 = j3;
        allDayStressRepositoryImpl = this;
        pair = (Pair) objC;
        allDayStressRepositoryImpl2 = allDayStressRepositoryImpl;
        lVar2 = lVar3;
        obj = coroutine_suspended;
        j5 = j4;
        if (((Number) pair.getFirst()).intValue() == 1000) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0096  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ad A[LOOP:0: B:29:0x00a7->B:31:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, List<AllDayStressDaoBean> list, Continuation<? super Boolean> continuation) throws Throwable {
        o oVar;
        AllDayStressRepositoryImpl allDayStressRepositoryImpl;
        List<AllDayStressDaoBean> list2;
        AllDayStressRepositoryImpl allDayStressRepositoryImpl2;
        ApiResponse apiResponse;
        AllDayStressDao allDayStressDao;
        ArrayList arrayList;
        ApiResponse apiResponse2;
        if (continuation instanceof o) {
            oVar = (o) continuation;
            int i2 = oVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.f = i2 - Integer.MIN_VALUE;
            } else {
                oVar = new o(continuation);
            }
        } else {
            oVar = new o(continuation);
        }
        Object objWithContext = oVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = oVar.f;
        boolean z = false;
        if (i3 != 0) {
            if (i3 == 1) {
                list = (List) oVar.c;
                str = (String) oVar.b;
                allDayStressRepositoryImpl = (AllDayStressRepositoryImpl) oVar.a;
                ResultKt.throwOnFailure(objWithContext);
            } else {
                if (i3 == 2) {
                    list2 = (List) oVar.b;
                    allDayStressRepositoryImpl2 = (AllDayStressRepositoryImpl) oVar.a;
                    ResultKt.throwOnFailure(objWithContext);
                    apiResponse = (ApiResponse) objWithContext;
                    if (apiResponse instanceof ApiSuccessResponse) {
                        allDayStressDao = allDayStressRepositoryImpl2.allDayStressDao;
                        arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                        for (AllDayStressDaoBean allDayStressDaoBean : list2) {
                            allDayStressDaoBean.setSyncStatus(true);
                            arrayList.add(allDayStressDaoBean);
                        }
                        oVar.a = allDayStressRepositoryImpl2;
                        oVar.b = apiResponse;
                        oVar.f = 3;
                        if (allDayStressDao.insertOrUpdateAllDayStressList(arrayList, oVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResponse2 = apiResponse;
                    } else {
                        if (apiResponse instanceof ApiErrorResponse) {
                            throw new NoWhenBranchMatchedException();
                        }
                        HMLog.e(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl2), Intrinsics.stringPlus("upload allDayStress error: ", apiResponse), new Object[0]);
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiResponse2 = (ApiResponse) oVar.b;
                allDayStressRepositoryImpl2 = (AllDayStressRepositoryImpl) oVar.a;
                ResultKt.throwOnFailure(objWithContext);
            }
            HMLog.i(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl2), Intrinsics.stringPlus("upload allDayStress success: ", apiResponse2), new Object[0]);
            z = true;
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(objWithContext);
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        p pVar = new p(list, null);
        oVar.a = this;
        oVar.b = str;
        oVar.c = list;
        oVar.f = 1;
        objWithContext = BuildersKt.withContext(coroutineDispatcher, pVar, oVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        allDayStressRepositoryImpl = this;
        StressWebApi stressWebApi = allDayStressRepositoryImpl.webApi;
        oVar.a = allDayStressRepositoryImpl;
        oVar.b = list;
        oVar.c = null;
        oVar.f = 2;
        objWithContext = stressWebApi.uploadAllDayStress(str, (List) objWithContext, oVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        list2 = list;
        allDayStressRepositoryImpl2 = allDayStressRepositoryImpl;
        apiResponse = (ApiResponse) objWithContext;
        if (apiResponse instanceof ApiSuccessResponse) {
            allDayStressDao = allDayStressRepositoryImpl2.allDayStressDao;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            while (r10.hasNext()) {
                allDayStressDaoBean.setSyncStatus(true);
                arrayList.add(allDayStressDaoBean);
            }
            oVar.a = allDayStressRepositoryImpl2;
            oVar.b = apiResponse;
            oVar.f = 3;
            if (allDayStressDao.insertOrUpdateAllDayStressList(arrayList, oVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            apiResponse2 = apiResponse;
            HMLog.i(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl2), Intrinsics.stringPlus("upload allDayStress success: ", apiResponse2), new Object[0]);
            z = true;
        } else {
            if (apiResponse instanceof ApiErrorResponse) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.e(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl2), Intrinsics.stringPlus("upload allDayStress error: ", apiResponse), new Object[0]);
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.AllDayStressRepository
    @Nullable
    public Object getAllDayStressFromLocalBetweenStamp(long j2, long j3, @NotNull Continuation<? super List<AllDayStress>> continuation) {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.c = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        b bVar2 = bVar;
        Object allDayStressByBetweenTimestamp = bVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar2.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(allDayStressByBetweenTimestamp);
            HMLog.i(LogTagUtilsKt.getTAG(this), "getAllDayStressFromLocalBetweenStamp execute", new Object[0]);
            AllDayStressDao allDayStressDao = this.allDayStressDao;
            bVar2.c = 1;
            allDayStressByBetweenTimestamp = allDayStressDao.getAllDayStressByBetweenTimestamp(j2, j3, bVar2);
            if (allDayStressByBetweenTimestamp == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(allDayStressByBetweenTimestamp);
        }
        Iterable iterable = (Iterable) allDayStressByBetweenTimestamp;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(AllDayStressDaoBeanEXKt.toAllDayStress((AllDayStressDaoBean) it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.AllDayStressRepository
    @Nullable
    public Object getAllDayStressFromLocalByTimestamp(long j2, @NotNull Continuation<? super AllDayStress> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.c = i2 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object allDayStressByTimestamp = cVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(allDayStressByTimestamp);
            HMLog.i(LogTagUtilsKt.getTAG(this), Intrinsics.stringPlus("getAllDayStressFromLocalByTimestamp execute ", Boxing.boxLong(j2)), new Object[0]);
            AllDayStressDao allDayStressDao = this.allDayStressDao;
            cVar.c = 1;
            allDayStressByTimestamp = allDayStressDao.getAllDayStressByTimestamp(j2, cVar);
            if (allDayStressByTimestamp == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(allDayStressByTimestamp);
        }
        AllDayStressDaoBean allDayStressDaoBean = (AllDayStressDaoBean) allDayStressByTimestamp;
        if (allDayStressDaoBean == null) {
            return null;
        }
        return AllDayStressDaoBeanEXKt.toAllDayStress(allDayStressDaoBean);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.AllDayStressRepository
    @Nullable
    public Object getLatestAllDayStressFromLocal(@NotNull Continuation<? super AllDayStress> continuation) {
        d dVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.c = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object latestAllDayStress = dVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(latestAllDayStress);
            HMLog.i(LogTagUtilsKt.getTAG(this), "getLatestAllDayStressFromLocal execute", new Object[0]);
            AllDayStressDao allDayStressDao = this.allDayStressDao;
            dVar.c = 1;
            latestAllDayStress = allDayStressDao.getLatestAllDayStress(dVar);
            if (latestAllDayStress == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(latestAllDayStress);
        }
        AllDayStressDaoBean allDayStressDaoBean = (AllDayStressDaoBean) latestAllDayStress;
        if (allDayStressDaoBean == null) {
            return null;
        }
        return AllDayStressDaoBeanEXKt.toAllDayStress(allDayStressDaoBean);
    }

    @Override // com.huami.stress.domain.repository.AllDayStressRepository
    @NotNull
    public Flow<AllDayStress> getLatestAllDayStressFromLocalFlow() {
        HMLog.i(LogTagUtilsKt.getTAG(this), "getLatestAllDayStressFromLocalFlow execute", new Object[0]);
        final Flow<AllDayStressDaoBean> latestAllDayStressFlow = this.allDayStressDao.getLatestAllDayStressFlow();
        return FlowKt.distinctUntilChanged(new Flow<AllDayStress>() { // from class: com.huami.stress.domain.data.AllDayStressRepositoryImpl$getLatestAllDayStressFromLocalFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.stress.domain.data.AllDayStressRepositoryImpl$getLatestAllDayStressFromLocalFlow$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<AllDayStressDaoBean> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ AllDayStressRepositoryImpl$getLatestAllDayStressFromLocalFlow$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.stress.domain.data.AllDayStressRepositoryImpl$getLatestAllDayStressFromLocalFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.stress.domain.data.AllDayStressRepositoryImpl$getLatestAllDayStressFromLocalFlow$$inlined$map$1$2", f = "AllDayStressRepositoryImpl.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, AllDayStressRepositoryImpl$getLatestAllDayStressFromLocalFlow$$inlined$map$1 allDayStressRepositoryImpl$getLatestAllDayStressFromLocalFlow$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = allDayStressRepositoryImpl$getLatestAllDayStressFromLocalFlow$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(AllDayStressDaoBean allDayStressDaoBean, @NotNull Continuation continuation) {
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
                        AllDayStressDaoBean allDayStressDaoBean2 = allDayStressDaoBean;
                        AllDayStress allDayStress = allDayStressDaoBean2 == null ? null : AllDayStressDaoBeanEXKt.toAllDayStress(allDayStressDaoBean2);
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(allDayStress, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super AllDayStress> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = latestAllDayStressFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.AllDayStressRepository
    @Nullable
    public Object getTodayAllDayStressFromLocal(@NotNull Continuation<? super AllDayStress> continuation) {
        e eVar;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.c = i2 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object allDayStressByTimestamp = eVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = eVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(allDayStressByTimestamp);
            HMLog.i(LogTagUtilsKt.getTAG(this), "getTodayAllDayStressFromLocal execute", new Object[0]);
            long allDayStressTimestamp = StressService.INSTANCE.getAllDayStressTimestamp(System.currentTimeMillis());
            AllDayStressDao allDayStressDao = this.allDayStressDao;
            eVar.c = 1;
            allDayStressByTimestamp = allDayStressDao.getAllDayStressByTimestamp(allDayStressTimestamp, eVar);
            if (allDayStressByTimestamp == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(allDayStressByTimestamp);
        }
        AllDayStressDaoBean allDayStressDaoBean = (AllDayStressDaoBean) allDayStressByTimestamp;
        if (allDayStressDaoBean == null) {
            return null;
        }
        return AllDayStressDaoBeanEXKt.toAllDayStress(allDayStressDaoBean);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01af  */
    /* JADX WARN: Code duplicated, block: B:37:0x01ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01cb -> B:39:0x01d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.huami.stress.domain.repository.AllDayStressRepository
    @org.jetbrains.annotations.Nullable
    public java.lang.Object saveAllDayStressFromDevice(@org.jetbrains.annotations.NotNull java.lang.String r27, int r28, int r29, @org.jetbrains.annotations.NotNull java.lang.String r30, @org.jetbrains.annotations.NotNull java.lang.String r31, @org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.NotNull java.util.Calendar r33, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Boolean, kotlin.Unit> r34, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Pair<java.lang.Boolean, java.lang.Long>> r35) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.stress.domain.data.AllDayStressRepositoryImpl.saveAllDayStressFromDevice(java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.util.Calendar, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.AllDayStressRepository
    @Nullable
    public Object saveAllDayStressFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        h hVar;
        AllDayStressRepositoryImpl allDayStressRepositoryImpl;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i2 = hVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.e = i2 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        h hVar2 = hVar;
        Object latestSyncedAllDayStress = hVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = hVar2.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(latestSyncedAllDayStress);
            HMLog.i(LogTagUtilsKt.getTAG(this), "saveAllDayStressFromServer", new Object[0]);
            AllDayStressDao allDayStressDao = this.allDayStressDao;
            hVar2.a = this;
            hVar2.b = str;
            hVar2.e = 1;
            latestSyncedAllDayStress = allDayStressDao.getLatestSyncedAllDayStress(hVar2);
            if (latestSyncedAllDayStress == coroutine_suspended) {
                return coroutine_suspended;
            }
            allDayStressRepositoryImpl = this;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    ResultKt.throwOnFailure(latestSyncedAllDayStress);
                    return Unit.INSTANCE;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(latestSyncedAllDayStress);
                return Unit.INSTANCE;
            }
            str = (String) hVar2.b;
            allDayStressRepositoryImpl = (AllDayStressRepositoryImpl) hVar2.a;
            ResultKt.throwOnFailure(latestSyncedAllDayStress);
        }
        AllDayStressDaoBean allDayStressDaoBean = (AllDayStressDaoBean) latestSyncedAllDayStress;
        if (allDayStressDaoBean == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            hVar2.a = null;
            hVar2.b = null;
            hVar2.e = 2;
            if (allDayStressRepositoryImpl.d(str, jCurrentTimeMillis, 0L, hVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long timestamp = allDayStressDaoBean.getTimestamp();
        hVar2.a = null;
        hVar2.b = null;
        hVar2.e = 3;
        if (allDayStressRepositoryImpl.d(str, jCurrentTimeMillis2, timestamp, hVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.AllDayStressRepository
    @Nullable
    public Object saveAllDayStressFromServerByTime(@NotNull String str, long j2, @NotNull Continuation<? super AllDayStress> continuation) {
        k kVar;
        AllDayStressRepositoryImpl allDayStressRepositoryImpl;
        AllDayStressDaoBean allDayStressDaoBean;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.e = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object allDayStressByTimestamp = kVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.e;
        if (i3 != 0) {
            if (i3 == 1) {
                j2 = kVar.b;
                allDayStressRepositoryImpl = (AllDayStressRepositoryImpl) kVar.a;
                ResultKt.throwOnFailure(allDayStressByTimestamp);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(allDayStressByTimestamp);
            }
            allDayStressDaoBean = (AllDayStressDaoBean) allDayStressByTimestamp;
            if (allDayStressDaoBean == null) {
                return null;
            }
            return AllDayStressDaoBeanEXKt.toAllDayStress(allDayStressDaoBean);
        }
        ResultKt.throwOnFailure(allDayStressByTimestamp);
        long j3 = 1 + j2;
        kVar.a = this;
        kVar.b = j2;
        kVar.e = 1;
        if (d(str, j3, j2 - 1, kVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        allDayStressRepositoryImpl = this;
        AllDayStressDao allDayStressDao = allDayStressRepositoryImpl.allDayStressDao;
        kVar.a = null;
        kVar.e = 2;
        allDayStressByTimestamp = allDayStressDao.getAllDayStressByTimestamp(j2, kVar);
        if (allDayStressByTimestamp == coroutine_suspended) {
            return coroutine_suspended;
        }
        allDayStressDaoBean = (AllDayStressDaoBean) allDayStressByTimestamp;
        if (allDayStressDaoBean == null) {
            return null;
        }
        return AllDayStressDaoBeanEXKt.toAllDayStress(allDayStressDaoBean);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00da  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.stress.domain.repository.AllDayStressRepository
    @Nullable
    public Object saveLatestAllDayStressFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        m mVar;
        AllDayStressRepositoryImpl allDayStressRepositoryImpl;
        ApiResponse apiResponse;
        ApiResponse apiResponse2;
        AllDayStressDaoBean allDayStressDaoBean;
        AllDayStressDaoBean allDayStressDaoBean2;
        AllDayStressDao allDayStressDao;
        AllDayStressRepositoryImpl allDayStressRepositoryImpl2;
        ApiResponse apiResponse3;
        AllDayStressDao allDayStressDao2;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.f = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object allDayStress = mVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.f;
        if (i3 != 0) {
            if (i3 == 1) {
                allDayStressRepositoryImpl = (AllDayStressRepositoryImpl) mVar.a;
                ResultKt.throwOnFailure(allDayStress);
            } else if (i3 == 2) {
                AllDayStressDaoBean allDayStressDaoBean3 = (AllDayStressDaoBean) mVar.c;
                apiResponse2 = (ApiResponse) mVar.b;
                AllDayStressRepositoryImpl allDayStressRepositoryImpl3 = (AllDayStressRepositoryImpl) mVar.a;
                ResultKt.throwOnFailure(allDayStress);
                allDayStressDaoBean = allDayStressDaoBean3;
                allDayStressRepositoryImpl = allDayStressRepositoryImpl3;
                allDayStressDaoBean2 = (AllDayStressDaoBean) allDayStress;
                if (allDayStressDaoBean2 == null) {
                    allDayStressDao2 = allDayStressRepositoryImpl.allDayStressDao;
                    mVar.a = allDayStressRepositoryImpl;
                    mVar.b = apiResponse2;
                    mVar.c = null;
                    mVar.f = 3;
                    if (allDayStressDao2.insertOrUpdateAllDayStress(allDayStressDaoBean, mVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    allDayStressDao = allDayStressRepositoryImpl.allDayStressDao;
                    mVar.a = allDayStressRepositoryImpl;
                    mVar.b = apiResponse2;
                    mVar.c = null;
                    mVar.f = 4;
                    if (allDayStressDao.insertOrUpdateAllDayStress(allDayStressDaoBean2, mVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                allDayStressRepositoryImpl2 = allDayStressRepositoryImpl;
                apiResponse3 = apiResponse2;
            } else {
                if (i3 != 3 && i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiResponse3 = (ApiResponse) mVar.b;
                allDayStressRepositoryImpl2 = (AllDayStressRepositoryImpl) mVar.a;
                ResultKt.throwOnFailure(allDayStress);
            }
            apiResponse = apiResponse3;
            allDayStressRepositoryImpl = allDayStressRepositoryImpl2;
            HMLog.i(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl), Intrinsics.stringPlus("get allDayStress from server success ", apiResponse), new Object[0]);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(allDayStress);
        HMLog.i(LogTagUtilsKt.getTAG(this), "saveTodayAllDayStressFromServer execute", new Object[0]);
        StressWebApi stressWebApi = this.webApi;
        long jCurrentTimeMillis = System.currentTimeMillis();
        mVar.a = this;
        mVar.f = 1;
        allDayStress = stressWebApi.getAllDayStress(str, jCurrentTimeMillis, 1, mVar);
        if (allDayStress == coroutine_suspended) {
            return coroutine_suspended;
        }
        allDayStressRepositoryImpl = this;
        apiResponse = (ApiResponse) allDayStress;
        if (apiResponse instanceof ApiSuccessResponse) {
            List<AllDayStressApiBean> items = ((GetAllDayStressListResponse) ((ApiSuccessResponse) apiResponse).getBody()).getItems();
            if (!items.isEmpty()) {
                AllDayStressDaoBean allDayStressDaoBean4 = AllDayStressApiBeanExKt.toAllDayStressDaoBean(items.get(0));
                mVar.a = allDayStressRepositoryImpl;
                mVar.b = apiResponse;
                mVar.c = allDayStressDaoBean4;
                mVar.f = 2;
                Object objA = allDayStressRepositoryImpl.a(allDayStressDaoBean4, mVar);
                if (objA == coroutine_suspended) {
                    return coroutine_suspended;
                }
                apiResponse2 = apiResponse;
                allDayStress = objA;
                allDayStressDaoBean = allDayStressDaoBean4;
                allDayStressDaoBean2 = (AllDayStressDaoBean) allDayStress;
                if (allDayStressDaoBean2 == null) {
                    allDayStressDao2 = allDayStressRepositoryImpl.allDayStressDao;
                    mVar.a = allDayStressRepositoryImpl;
                    mVar.b = apiResponse2;
                    mVar.c = null;
                    mVar.f = 3;
                    if (allDayStressDao2.insertOrUpdateAllDayStress(allDayStressDaoBean, mVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    allDayStressDao = allDayStressRepositoryImpl.allDayStressDao;
                    mVar.a = allDayStressRepositoryImpl;
                    mVar.b = apiResponse2;
                    mVar.c = null;
                    mVar.f = 4;
                    if (allDayStressDao.insertOrUpdateAllDayStress(allDayStressDaoBean2, mVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                allDayStressRepositoryImpl2 = allDayStressRepositoryImpl;
                apiResponse3 = apiResponse2;
                apiResponse = apiResponse3;
                allDayStressRepositoryImpl = allDayStressRepositoryImpl2;
            }
            HMLog.i(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl), Intrinsics.stringPlus("get allDayStress from server success ", apiResponse), new Object[0]);
        } else if (apiResponse instanceof ApiErrorResponse) {
            HMLog.e(LogTagUtilsKt.getTAG(allDayStressRepositoryImpl), Intrinsics.stringPlus("get allDayStress from server error: ", apiResponse), new Object[0]);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ca A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00cb -> B:38:0x00ce). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.huami.stress.domain.repository.AllDayStressRepository
    @org.jetbrains.annotations.Nullable
    public java.lang.Object syncAllDayStressToServer(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.stress.domain.data.AllDayStressRepositoryImpl.syncAllDayStressToServer(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
