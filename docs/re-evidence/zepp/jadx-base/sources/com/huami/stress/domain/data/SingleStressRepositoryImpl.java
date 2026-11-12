package com.huami.stress.domain.data;

import androidx.exifinterface.media.ExifInterface;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.huami.stress.domain.data.converter.SingleStressApiBeanExKt;
import com.huami.stress.domain.data.converter.SingleStressDaoBeanExKt;
import com.huami.stress.domain.data.converter.SingleStressExKt;
import com.huami.stress.domain.data.device.StressDeviceApi;
import com.huami.stress.domain.data.device.bean.StressDeviceBean;
import com.huami.stress.domain.data.local.bean.SingleStressDaoBean;
import com.huami.stress.domain.data.local.dao.SingleStressDao;
import com.huami.stress.domain.data.remote.StressWebApi;
import com.huami.stress.domain.data.remote.bean.GetSingleStressListResponse;
import com.huami.stress.domain.data.remote.bean.SingleStressApiBean;
import com.huami.stress.domain.data.remote.net.ApiErrorResponse;
import com.huami.stress.domain.data.remote.net.ApiResponse;
import com.huami.stress.domain.data.remote.net.ApiSuccessResponse;
import com.huami.stress.domain.model.SingleStress;
import com.huami.stress.domain.repository.SingleStressRepository;
import com.huami.stress.domain.service.StressService;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bodyfat.utils.ParamKey;
import java.util.ArrayList;
import java.util.Calendar;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 C2\u00020\u0001:\u0001CB\u001f\u0012\u0006\u0010:\u001a\u000208\u0012\u0006\u0010=\u001a\u00020;\u0012\u0006\u0010@\u001a\u00020>¢\u0006\u0004\bA\u0010BJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJA\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ)\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001aJ\u0010\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180 H\u0016J#\u0010#\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$Js\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*2\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010,H\u0096@ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001b\u00102\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00101J!\u00103\u001a\b\u0012\u0004\u0012\u00020\u00180\u00122\u0006\u0010+\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b3\u00104J!\u00106\u001a\u00020\u00072\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00180\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u00107R\u0016\u0010:\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00109R\u0016\u0010=\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010<R\u0016\u0010@\u001a\u00020>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010?\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006D"}, d2 = {"Lcom/huami/stress/domain/data/SingleStressRepositoryImpl;", "Lcom/huami/stress/domain/repository/SingleStressRepository;", "", "userId", "", "fromTime", "endTime", "", "b", "(Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "from", "to", "", "limit", "Lkotlin/Pair;", "Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;", "a", "(Ljava/lang/String;JJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", "unSyncData", "", "c", "(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/model/SingleStress;", "getSingleStressListFromLocal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "start", "end", "getSingleStressListFromLocalBetweenStamp", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLatestSingleStressFromLocal", "Lkotlinx/coroutines/flow/Flow;", "getLatestSingleStressFromLocalFlow", "timestamp", "deleteSingleStress", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deviceType", "deviceSource", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "Ljava/util/Calendar;", "calendar", "Lkotlin/Function2;", "saveSyncTime", "saveSingleStressFromDevice", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveSingleStressFromServer", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncSingleStressToServer", "getSingleStressListByDay", "(Ljava/util/Calendar;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "list", "saveSingleStressToLocal", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/stress/domain/data/local/dao/SingleStressDao;", "Lcom/huami/stress/domain/data/local/dao/SingleStressDao;", "singleStressDao", "Lcom/huami/stress/domain/data/device/StressDeviceApi;", "Lcom/huami/stress/domain/data/device/StressDeviceApi;", "deviceApi", "Lcom/huami/stress/domain/data/remote/StressWebApi;", "Lcom/huami/stress/domain/data/remote/StressWebApi;", "webApi", "<init>", "(Lcom/huami/stress/domain/data/local/dao/SingleStressDao;Lcom/huami/stress/domain/data/device/StressDeviceApi;Lcom/huami/stress/domain/data/remote/StressWebApi;)V", "Companion", "domain_release"}, k = 1, mv = {1, 5, 1})
public final class SingleStressRepositoryImpl implements SingleStressRepository {
    public static final int DATA_LOAD_SIZE = 1000;
    public static final int DATA_UPLOAD_LIMIT = 600;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final SingleStressDao singleStressDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final StressDeviceApi deviceApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final StressWebApi webApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {0, 0, 0, 3}, l = {73, 77, 82, 84}, m = "deleteSingleStress", n = {"this", "userId", "timestamp", AbstractJSONTokenResponse.RESPONSE}, s = {"L$0", "L$1", "J$0", "L$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public long c;
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
            return SingleStressRepositoryImpl.this.deleteSingleStress(null, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {}, l = {61}, m = "getLatestSingleStressFromLocal", n = {}, s = {})
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
            return SingleStressRepositoryImpl.this.getLatestSingleStressFromLocal(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {}, l = {235}, m = "getSingleStressListByDay", n = {}, s = {})
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
            return SingleStressRepositoryImpl.this.getSingleStressListByDay(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {}, l = {43, 45}, m = "getSingleStressListFromLocal", n = {}, s = {})
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
            return SingleStressRepositoryImpl.this.getSingleStressListFromLocal(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/model/SingleStress;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl$getSingleStressListFromLocal$2", f = "SingleStressRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SingleStress>>, Object> {
        public int a;
        public final /* synthetic */ List<SingleStressDaoBean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<SingleStressDaoBean> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SingleStress>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SingleStress>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<SingleStress>> continuation) {
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
            List<SingleStressDaoBean> list = this.b;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(SingleStressDaoBeanExKt.toSingleStress((SingleStressDaoBean) it2.next()));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {}, l = {55}, m = "getSingleStressListFromLocalBetweenStamp", n = {}, s = {})
    public static final class f extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return SingleStressRepositoryImpl.this.getSingleStressListFromLocalBetweenStamp(0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 2}, l = {106, 116, 128}, m = "saveSingleStressFromDevice", n = {"this", "userId", "deviceId", ParamKey.deviceMac, ParamKey.deviceSn, "calendar", "saveSyncTime", "deviceType", "deviceSource", "data"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1", "L$2"})
    public static final class g extends ContinuationImpl {
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

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return SingleStressRepositoryImpl.this.saveSingleStressFromDevice(null, 0, 0, null, null, null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl$saveSingleStressFromDevice$data$1", f = "SingleStressRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SingleStressDaoBean>>, Object> {
        public int a;
        public final /* synthetic */ Pair<Boolean, List<StressDeviceBean>> b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;
        public final /* synthetic */ int e;
        public final /* synthetic */ int f;
        public final /* synthetic */ String g;
        public final /* synthetic */ String h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Pair<Boolean, ? extends List<StressDeviceBean>> pair, String str, String str2, int i, int i2, String str3, String str4, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = pair;
            this.c = str;
            this.d = str2;
            this.e = i;
            this.f = i2;
            this.g = str3;
            this.h = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, this.c, this.d, this.e, this.f, this.g, this.h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SingleStressDaoBean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SingleStressDaoBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<SingleStressDaoBean>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return StressService.INSTANCE.parseDeviceDataToSingleStressList(this.b.getSecond(), this.c, this.d, this.e, this.f, this.g, this.h);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {0, 0}, l = {151, 153, 155}, m = "saveSingleStressFromServer", n = {"this", "userId"}, s = {"L$0", "L$1"})
    public static final class i extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return SingleStressRepositoryImpl.this.saveSingleStressFromServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {0, 1, 1, 2, 2}, l = {DataTypeSource.SPORT_TYPE_BOULDERING, DataTypeSource.SPORT_TYPE_TAP_DANCE, 192}, m = "saveSingleStressFromServerByPage", n = {"this", "this", AbstractJSONTokenResponse.RESPONSE, "this", AbstractJSONTokenResponse.RESPONSE}, s = {"L$0", "L$0", "L$1", "L$0", "L$1"})
    public static final class j extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return SingleStressRepositoryImpl.this.a(null, 0L, 0L, 0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl$saveSingleStressFromServerByPage$dataSaveToDb$1", f = "SingleStressRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SingleStressDaoBean>>, Object> {
        public int a;
        public final /* synthetic */ ApiResponse<GetSingleStressListResponse> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ApiResponse<GetSingleStressListResponse> apiResponse, Continuation<? super k> continuation) {
            super(2, continuation);
            this.b = apiResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SingleStressDaoBean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SingleStressDaoBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<SingleStressDaoBean>> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<SingleStressApiBean> items = ((GetSingleStressListResponse) ((ApiSuccessResponse) this.b).getBody()).getItems();
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
            Iterator<T> it2 = items.iterator();
            while (it2.hasNext()) {
                arrayList.add(SingleStressApiBeanExKt.toSingleStressDaoBean((SingleStressApiBean) it2.next()));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1}, l = {170, DataTypeSource.SPORT_TYPE_CHESS}, m = "saveSingleStressFromServerByTimeRange", n = {"this", "userId", "endTime", "this", "userId", "endTime"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
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
            return SingleStressRepositoryImpl.this.b(null, 0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {0}, l = {241, 246}, m = "saveSingleStressToLocal", n = {"this"}, s = {"L$0"})
    public static final class m extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public m(Continuation<? super m> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SingleStressRepositoryImpl.this.saveSingleStressToLocal(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl$saveSingleStressToLocal$data$1", f = "SingleStressRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SingleStressDaoBean>>, Object> {
        public int a;
        public final /* synthetic */ List<SingleStress> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(List<SingleStress> list, Continuation<? super n> continuation) {
            super(2, continuation);
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new n(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SingleStressDaoBean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SingleStressDaoBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<SingleStressDaoBean>> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<SingleStress> list = this.b;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(SingleStressExKt.toStressDaoBean((SingleStress) it2.next()));
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {0, 0, 1, 1}, l = {206, 219}, m = "syncSingleStressToServer", n = {"this", "userId", "sourListSize", "subCount"}, s = {"L$0", "L$1", "I$0", "I$1"})
    public static final class o extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public int d;
        public int e;
        public int f;
        public int g;
        public /* synthetic */ Object h;
        public int j;

        public o(Continuation<? super o> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.h = obj;
            this.j |= Integer.MIN_VALUE;
            return SingleStressRepositoryImpl.this.syncSingleStressToServer(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl", f = "SingleStressRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 2, 2, 3, 3}, l = {255, WeightingState.state_weight_overload, WeightingState.state_bodyfat_detail, 271}, m = "uploadDataToServer", n = {"this", "userId", "unSyncData", "this", "unSyncData", "this", AbstractJSONTokenResponse.RESPONSE, "this", AbstractJSONTokenResponse.RESPONSE}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class p extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public p(Continuation<? super p> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return SingleStressRepositoryImpl.this.c(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/data/local/bean/SingleStressDaoBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl$uploadDataToServer$dataToSaveToDb$1", f = "SingleStressRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SingleStressDaoBean>>, Object> {
        public int a;
        public final /* synthetic */ List<SingleStressDaoBean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(List<SingleStressDaoBean> list, Continuation<? super q> continuation) {
            super(2, continuation);
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new q(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SingleStressDaoBean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SingleStressDaoBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<SingleStressDaoBean>> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<SingleStressDaoBean> list = this.b;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (SingleStressDaoBean singleStressDaoBean : list) {
                singleStressDaoBean.setSyncStatus(true);
                arrayList.add(singleStressDaoBean);
            }
            return arrayList;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/stress/domain/data/remote/bean/SingleStressApiBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl$uploadDataToServer$updateData$1", f = "SingleStressRepositoryImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends SingleStressApiBean>>, Object> {
        public int a;
        public final /* synthetic */ List<SingleStressDaoBean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(List<SingleStressDaoBean> list, Continuation<? super r> continuation) {
            super(2, continuation);
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new r(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends SingleStressApiBean>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<SingleStressApiBean>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<SingleStressApiBean>> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<SingleStressDaoBean> list = this.b;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(SingleStressDaoBeanExKt.toSingleStressApiBean((SingleStressDaoBean) it2.next()));
            }
            return arrayList;
        }
    }

    public SingleStressRepositoryImpl(@NotNull SingleStressDao singleStressDao, @NotNull StressDeviceApi stressDeviceApi, @NotNull StressWebApi stressWebApi) {
        this.singleStressDao = singleStressDao;
        this.deviceApi = stressDeviceApi;
        this.webApi = stressWebApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00a6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(String str, long j2, long j3, int i2, Continuation<? super Pair<Integer, SingleStressApiBean>> continuation) throws Throwable {
        j jVar;
        SingleStressRepositoryImpl singleStressRepositoryImpl;
        ApiResponse apiResponse;
        SingleStressDao singleStressDao;
        SingleStressRepositoryImpl singleStressRepositoryImpl2;
        ApiResponse apiResponse2;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i3 = jVar.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jVar.e = i3 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        } else {
            jVar = new j(continuation);
        }
        Object singleStressByTimeRange = jVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = jVar.e;
        if (i4 != 0) {
            if (i4 == 1) {
                singleStressRepositoryImpl = (SingleStressRepositoryImpl) jVar.a;
                ResultKt.throwOnFailure(singleStressByTimeRange);
            } else if (i4 == 2) {
                ApiResponse apiResponse3 = (ApiResponse) jVar.b;
                SingleStressRepositoryImpl singleStressRepositoryImpl3 = (SingleStressRepositoryImpl) jVar.a;
                ResultKt.throwOnFailure(singleStressByTimeRange);
                apiResponse = apiResponse3;
                singleStressRepositoryImpl = singleStressRepositoryImpl3;
                singleStressDao = singleStressRepositoryImpl.singleStressDao;
                jVar.a = singleStressRepositoryImpl;
                jVar.b = apiResponse;
                jVar.e = 3;
                if (singleStressDao.insertOrUpdateSingleStress((List) singleStressByTimeRange, jVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                singleStressRepositoryImpl2 = singleStressRepositoryImpl;
                apiResponse2 = apiResponse;
            } else {
                if (i4 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiResponse2 = (ApiResponse) jVar.b;
                singleStressRepositoryImpl2 = (SingleStressRepositoryImpl) jVar.a;
                ResultKt.throwOnFailure(singleStressByTimeRange);
            }
            HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl2), Intrinsics.stringPlus("get single stress from server success ", apiResponse2), new Object[0]);
            ApiSuccessResponse apiSuccessResponse = (ApiSuccessResponse) apiResponse2;
            return new Pair(Boxing.boxInt(((GetSingleStressListResponse) apiSuccessResponse.getBody()).getItems().size()), ((GetSingleStressListResponse) apiSuccessResponse.getBody()).getNext());
        }
        ResultKt.throwOnFailure(singleStressByTimeRange);
        StressWebApi stressWebApi = this.webApi;
        jVar.a = this;
        jVar.e = 1;
        singleStressByTimeRange = stressWebApi.getSingleStressByTimeRange(str, j2, j3, i2, jVar);
        if (singleStressByTimeRange == coroutine_suspended) {
            return coroutine_suspended;
        }
        singleStressRepositoryImpl = this;
        ApiResponse apiResponse4 = (ApiResponse) singleStressByTimeRange;
        if (!(apiResponse4 instanceof ApiSuccessResponse)) {
            if (!(apiResponse4 instanceof ApiErrorResponse)) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.e(LogTagUtilsKt.getTAG(singleStressRepositoryImpl), Intrinsics.stringPlus("get single stress from server error: ", apiResponse4), new Object[0]);
            return new Pair(Boxing.boxInt(0), null);
        }
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        k kVar = new k(apiResponse4, null);
        jVar.a = singleStressRepositoryImpl;
        jVar.b = apiResponse4;
        jVar.e = 2;
        Object objWithContext = BuildersKt.withContext(coroutineDispatcher, kVar, jVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        apiResponse = apiResponse4;
        singleStressByTimeRange = objWithContext;
        singleStressDao = singleStressRepositoryImpl.singleStressDao;
        jVar.a = singleStressRepositoryImpl;
        jVar.b = apiResponse;
        jVar.e = 3;
        if (singleStressDao.insertOrUpdateSingleStress((List) singleStressByTimeRange, jVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        singleStressRepositoryImpl2 = singleStressRepositoryImpl;
        apiResponse2 = apiResponse;
        HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl2), Intrinsics.stringPlus("get single stress from server success ", apiResponse2), new Object[0]);
        ApiSuccessResponse apiSuccessResponse2 = (ApiSuccessResponse) apiResponse2;
        return new Pair(Boxing.boxInt(((GetSingleStressListResponse) apiSuccessResponse2.getBody()).getItems().size()), ((GetSingleStressListResponse) apiSuccessResponse2.getBody()).getNext());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ac -> B:28:0x00af). Please report as a decompilation issue!!! */
    public final Object b(String str, long j2, long j3, Continuation<? super Unit> continuation) throws Throwable {
        l lVar;
        String str2;
        long j4;
        SingleStressRepositoryImpl singleStressRepositoryImpl;
        Pair pair;
        String str3;
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
        l lVar2 = lVar;
        Object objA = lVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = lVar2.f;
        if (i3 != 0) {
            if (i3 == 1) {
                long j6 = lVar2.c;
                String str4 = (String) lVar2.b;
                singleStressRepositoryImpl = (SingleStressRepositoryImpl) lVar2.a;
                ResultKt.throwOnFailure(objA);
                j4 = j6;
                str2 = str4;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j5 = lVar2.c;
                str3 = (String) lVar2.b;
                singleStressRepositoryImpl = (SingleStressRepositoryImpl) lVar2.a;
                ResultKt.throwOnFailure(objA);
            }
            pair = (Pair) objA;
            if (((Number) pair.getFirst()).intValue() == 1000 || pair.getSecond() == null) {
                return Unit.INSTANCE;
            }
            long timestamp = ((SingleStressApiBean) pair.getSecond()).getTimestamp();
            lVar2.a = singleStressRepositoryImpl;
            lVar2.b = str3;
            lVar2.c = j5;
            lVar2.f = 2;
            objA = singleStressRepositoryImpl.a(str3, timestamp, j5, 1000, lVar2);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
            pair = (Pair) objA;
            if (((Number) pair.getFirst()).intValue() == 1000) {
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objA);
        lVar2.a = this;
        str2 = str;
        lVar2.b = str2;
        j4 = j3;
        lVar2.c = j4;
        lVar2.f = 1;
        objA = a(str, j2, j3, 1000, lVar2);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        singleStressRepositoryImpl = this;
        pair = (Pair) objA;
        str3 = str2;
        j5 = j4;
        if (((Number) pair.getFirst()).intValue() == 1000) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:43:0x010b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, List<SingleStressDaoBean> list, Continuation<? super Boolean> continuation) throws Throwable {
        p pVar;
        Object obj;
        List<SingleStressDaoBean> list2;
        SingleStressRepositoryImpl singleStressRepositoryImpl;
        List<SingleStressDaoBean> list3;
        ApiResponse apiResponse;
        Object objWithContext;
        ApiResponse apiResponse2;
        SingleStressDao singleStressDao;
        if (continuation instanceof p) {
            pVar = (p) continuation;
            int i2 = pVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.f = i2 - Integer.MIN_VALUE;
            } else {
                pVar = new p(continuation);
            }
        } else {
            pVar = new p(continuation);
        }
        Object obj2 = pVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = pVar.f;
        boolean z = true;
        if (i3 != 0) {
            if (i3 == 1) {
                List<SingleStressDaoBean> list4 = (List) pVar.c;
                str = (String) pVar.b;
                SingleStressRepositoryImpl singleStressRepositoryImpl2 = (SingleStressRepositoryImpl) pVar.a;
                ResultKt.throwOnFailure(obj2);
                list2 = list4;
                singleStressRepositoryImpl = singleStressRepositoryImpl2;
                obj = obj2;
            } else {
                if (i3 == 2) {
                    list3 = (List) pVar.b;
                    singleStressRepositoryImpl = (SingleStressRepositoryImpl) pVar.a;
                    ResultKt.throwOnFailure(obj2);
                    apiResponse = (ApiResponse) obj2;
                    if (apiResponse instanceof ApiSuccessResponse) {
                        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                        q qVar = new q(list3, null);
                        pVar.a = singleStressRepositoryImpl;
                        pVar.b = apiResponse;
                        pVar.f = 3;
                        objWithContext = BuildersKt.withContext(coroutineDispatcher, qVar, pVar);
                        if (objWithContext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj2 = objWithContext;
                        apiResponse2 = apiResponse;
                        singleStressDao = singleStressRepositoryImpl.singleStressDao;
                        pVar.a = singleStressRepositoryImpl;
                        pVar.b = apiResponse2;
                        pVar.f = 4;
                        if (singleStressDao.insertOrUpdateSingleStress((List) obj2, pVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (apiResponse instanceof ApiErrorResponse) {
                            throw new NoWhenBranchMatchedException();
                        }
                        HMLog.e(LogTagUtilsKt.getTAG(singleStressRepositoryImpl), Intrinsics.stringPlus("upload single stress data to server error: ", apiResponse), new Object[0]);
                        z = false;
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i3 == 3) {
                    apiResponse2 = (ApiResponse) pVar.b;
                    singleStressRepositoryImpl = (SingleStressRepositoryImpl) pVar.a;
                    ResultKt.throwOnFailure(obj2);
                    singleStressDao = singleStressRepositoryImpl.singleStressDao;
                    pVar.a = singleStressRepositoryImpl;
                    pVar.b = apiResponse2;
                    pVar.f = 4;
                    if (singleStressDao.insertOrUpdateSingleStress((List) obj2, pVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    apiResponse2 = (ApiResponse) pVar.b;
                    singleStressRepositoryImpl = (SingleStressRepositoryImpl) pVar.a;
                    ResultKt.throwOnFailure(obj2);
                }
            }
            HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl), Intrinsics.stringPlus("upload single stress data to server success: ", apiResponse2), new Object[0]);
            return Boxing.boxBoolean(z);
        }
        ResultKt.throwOnFailure(obj2);
        HMLog.i(LogTagUtilsKt.getTAG(this), "upload Data to server", new Object[0]);
        CoroutineDispatcher coroutineDispatcher2 = Dispatchers.getDefault();
        r rVar = new r(list, null);
        pVar.a = this;
        pVar.b = str;
        pVar.c = list;
        pVar.f = 1;
        Object objWithContext2 = BuildersKt.withContext(coroutineDispatcher2, rVar, pVar);
        if (objWithContext2 == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj = objWithContext2;
        list2 = list;
        singleStressRepositoryImpl = this;
        StressWebApi stressWebApi = singleStressRepositoryImpl.webApi;
        pVar.a = singleStressRepositoryImpl;
        pVar.b = list2;
        pVar.c = null;
        pVar.f = 2;
        Object objUploadSingleStress = stressWebApi.uploadSingleStress(str, (List) obj, pVar);
        if (objUploadSingleStress == coroutine_suspended) {
            return coroutine_suspended;
        }
        List<SingleStressDaoBean> list5 = list2;
        obj2 = objUploadSingleStress;
        list3 = list5;
        apiResponse = (ApiResponse) obj2;
        if (apiResponse instanceof ApiSuccessResponse) {
            CoroutineDispatcher coroutineDispatcher3 = Dispatchers.getDefault();
            q qVar2 = new q(list3, null);
            pVar.a = singleStressRepositoryImpl;
            pVar.b = apiResponse;
            pVar.f = 3;
            objWithContext = BuildersKt.withContext(coroutineDispatcher3, qVar2, pVar);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj2 = objWithContext;
            apiResponse2 = apiResponse;
            singleStressDao = singleStressRepositoryImpl.singleStressDao;
            pVar.a = singleStressRepositoryImpl;
            pVar.b = apiResponse2;
            pVar.f = 4;
            if (singleStressDao.insertOrUpdateSingleStress((List) obj2, pVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl), Intrinsics.stringPlus("upload single stress data to server success: ", apiResponse2), new Object[0]);
        } else {
            if (apiResponse instanceof ApiErrorResponse) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.e(LogTagUtilsKt.getTAG(singleStressRepositoryImpl), Intrinsics.stringPlus("upload single stress data to server error: ", apiResponse), new Object[0]);
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:51:0x0111  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.SingleStressRepository
    @Nullable
    public Object deleteSingleStress(@NotNull String str, long j2, @NotNull Continuation<? super Boolean> continuation) {
        a aVar;
        Object obj;
        long j3;
        String str2;
        SingleStressRepositoryImpl singleStressRepositoryImpl;
        SingleStressRepositoryImpl singleStressRepositoryImpl2;
        long j4;
        ApiResponse apiResponse;
        SingleStressDao singleStressDao;
        SingleStressRepositoryImpl singleStressRepositoryImpl3;
        ApiResponse apiResponse2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj2 = aVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar.f;
        boolean z = true;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            HMLog.i(LogTagUtilsKt.getTAG(this), "deleteSingleStress", new Object[0]);
            SingleStressDao singleStressDao2 = this.singleStressDao;
            aVar.a = this;
            aVar.b = str;
            aVar.c = j2;
            aVar.f = 1;
            Object singleStressByTimestamp = singleStressDao2.getSingleStressByTimestamp(j2, aVar);
            if (singleStressByTimestamp == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = singleStressByTimestamp;
            j3 = j2;
            str2 = str;
            singleStressRepositoryImpl = this;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    singleStressRepositoryImpl = (SingleStressRepositoryImpl) aVar.a;
                    ResultKt.throwOnFailure(obj2);
                    HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl), "delete single stress from local direct", new Object[0]);
                    return Boxing.boxBoolean(true);
                }
                if (i3 == 3) {
                    j4 = aVar.c;
                    singleStressRepositoryImpl2 = (SingleStressRepositoryImpl) aVar.a;
                    ResultKt.throwOnFailure(obj2);
                    apiResponse = (ApiResponse) obj2;
                    if (apiResponse instanceof ApiSuccessResponse) {
                        singleStressDao = singleStressRepositoryImpl2.singleStressDao;
                        aVar.a = singleStressRepositoryImpl2;
                        aVar.b = apiResponse;
                        aVar.f = 4;
                        if (singleStressDao.deleteSingleStressByTime(j4, aVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        singleStressRepositoryImpl3 = singleStressRepositoryImpl2;
                        apiResponse2 = apiResponse;
                    } else {
                        if (apiResponse instanceof ApiErrorResponse) {
                            throw new NoWhenBranchMatchedException();
                        }
                        HMLog.e(LogTagUtilsKt.getTAG(singleStressRepositoryImpl2), Intrinsics.stringPlus("delete single stress error: ", apiResponse), new Object[0]);
                        z = false;
                    }
                    return Boxing.boxBoolean(z);
                }
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiResponse2 = (ApiResponse) aVar.b;
                singleStressRepositoryImpl3 = (SingleStressRepositoryImpl) aVar.a;
                ResultKt.throwOnFailure(obj2);
                HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl3), Intrinsics.stringPlus("delete single stress success: ", apiResponse2), new Object[0]);
                return Boxing.boxBoolean(z);
            }
            long j5 = aVar.c;
            String str3 = (String) aVar.b;
            SingleStressRepositoryImpl singleStressRepositoryImpl4 = (SingleStressRepositoryImpl) aVar.a;
            ResultKt.throwOnFailure(obj2);
            str2 = str3;
            singleStressRepositoryImpl = singleStressRepositoryImpl4;
            obj = obj2;
            j3 = j5;
        }
        SingleStressDaoBean singleStressDaoBean = (SingleStressDaoBean) obj;
        if (singleStressDaoBean == null) {
            return Boxing.boxBoolean(false);
        }
        if (!singleStressDaoBean.getSyncStatus()) {
            SingleStressDao singleStressDao3 = singleStressRepositoryImpl.singleStressDao;
            aVar.a = singleStressRepositoryImpl;
            aVar.b = null;
            aVar.f = 2;
            if (singleStressDao3.deleteSingleStressByTime(j3, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl), "delete single stress from local direct", new Object[0]);
            return Boxing.boxBoolean(true);
        }
        StressWebApi stressWebApi = singleStressRepositoryImpl.webApi;
        aVar.a = singleStressRepositoryImpl;
        aVar.b = null;
        aVar.c = j3;
        aVar.f = 3;
        Object objDeleteSingleStress = stressWebApi.deleteSingleStress(str2, j3, aVar);
        if (objDeleteSingleStress == coroutine_suspended) {
            return coroutine_suspended;
        }
        long j6 = j3;
        singleStressRepositoryImpl2 = singleStressRepositoryImpl;
        obj2 = objDeleteSingleStress;
        j4 = j6;
        apiResponse = (ApiResponse) obj2;
        if (apiResponse instanceof ApiSuccessResponse) {
            singleStressDao = singleStressRepositoryImpl2.singleStressDao;
            aVar.a = singleStressRepositoryImpl2;
            aVar.b = apiResponse;
            aVar.f = 4;
            if (singleStressDao.deleteSingleStressByTime(j4, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            singleStressRepositoryImpl3 = singleStressRepositoryImpl2;
            apiResponse2 = apiResponse;
            HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl3), Intrinsics.stringPlus("delete single stress success: ", apiResponse2), new Object[0]);
        } else {
            if (apiResponse instanceof ApiErrorResponse) {
                throw new NoWhenBranchMatchedException();
            }
            HMLog.e(LogTagUtilsKt.getTAG(singleStressRepositoryImpl2), Intrinsics.stringPlus("delete single stress error: ", apiResponse), new Object[0]);
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.SingleStressRepository
    @Nullable
    public Object getLatestSingleStressFromLocal(@NotNull Continuation<? super SingleStress> continuation) {
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
        Object objLoadLatestSingleStress = bVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objLoadLatestSingleStress);
            HMLog.i(LogTagUtilsKt.getTAG(this), "getLatestSingleStressFromLocal", new Object[0]);
            SingleStressDao singleStressDao = this.singleStressDao;
            bVar.c = 1;
            objLoadLatestSingleStress = singleStressDao.loadLatestSingleStress(bVar);
            if (objLoadLatestSingleStress == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLoadLatestSingleStress);
        }
        SingleStressDaoBean singleStressDaoBean = (SingleStressDaoBean) objLoadLatestSingleStress;
        if (singleStressDaoBean == null) {
            return null;
        }
        return SingleStressDaoBeanExKt.toSingleStress(singleStressDaoBean);
    }

    @Override // com.huami.stress.domain.repository.SingleStressRepository
    @NotNull
    public Flow<SingleStress> getLatestSingleStressFromLocalFlow() {
        HMLog.i(LogTagUtilsKt.getTAG(this), "getLatestSingleStressFromLocalFlow", new Object[0]);
        final Flow<SingleStressDaoBean> flowLoadLatestSingleStressFlow = this.singleStressDao.loadLatestSingleStressFlow();
        return FlowKt.distinctUntilChanged(new Flow<SingleStress>() { // from class: com.huami.stress.domain.data.SingleStressRepositoryImpl$getLatestSingleStressFromLocalFlow$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.stress.domain.data.SingleStressRepositoryImpl$getLatestSingleStressFromLocalFlow$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<SingleStressDaoBean> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ SingleStressRepositoryImpl$getLatestSingleStressFromLocalFlow$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.stress.domain.data.SingleStressRepositoryImpl$getLatestSingleStressFromLocalFlow$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.stress.domain.data.SingleStressRepositoryImpl$getLatestSingleStressFromLocalFlow$$inlined$map$1$2", f = "SingleStressRepositoryImpl.kt", i = {}, l = {135}, m = "emit", n = {}, s = {})
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

                public AnonymousClass2(FlowCollector flowCollector, SingleStressRepositoryImpl$getLatestSingleStressFromLocalFlow$$inlined$map$1 singleStressRepositoryImpl$getLatestSingleStressFromLocalFlow$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = singleStressRepositoryImpl$getLatestSingleStressFromLocalFlow$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(SingleStressDaoBean singleStressDaoBean, @NotNull Continuation continuation) {
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
                        SingleStressDaoBean singleStressDaoBean2 = singleStressDaoBean;
                        SingleStress singleStress = singleStressDaoBean2 == null ? null : SingleStressDaoBeanExKt.toSingleStress(singleStressDaoBean2);
                        anonymousClass1.b = 1;
                        if (flowCollector.emit(singleStress, anonymousClass1) == coroutine_suspended) {
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
            public Object collect(@NotNull FlowCollector<? super SingleStress> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowLoadLatestSingleStressFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.SingleStressRepository
    @Nullable
    public Object getSingleStressListByDay(@NotNull Calendar calendar, @NotNull Continuation<? super List<SingleStress>> continuation) {
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
        c cVar2 = cVar;
        Object singleStressByBetweenTimestamp = cVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = cVar2.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(singleStressByBetweenTimestamp);
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.add(5, 1);
            long timeInMillis2 = calendar.getTimeInMillis() - 1;
            SingleStressDao singleStressDao = this.singleStressDao;
            cVar2.c = 1;
            singleStressByBetweenTimestamp = singleStressDao.getSingleStressByBetweenTimestamp(timeInMillis, timeInMillis2, cVar2);
            if (singleStressByBetweenTimestamp == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(singleStressByBetweenTimestamp);
        }
        Iterable iterable = (Iterable) singleStressByBetweenTimestamp;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(SingleStressDaoBeanExKt.toSingleStress((SingleStressDaoBean) it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.SingleStressRepository
    @Nullable
    public Object getSingleStressListFromLocal(@NotNull Continuation<? super List<SingleStress>> continuation) throws Throwable {
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
        Object objLoadSingleStressList = dVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.c;
        if (i3 != 0) {
            if (i3 == 1) {
                ResultKt.throwOnFailure(objLoadSingleStressList);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objLoadSingleStressList);
            }
        }
        ResultKt.throwOnFailure(objLoadSingleStressList);
        HMLog.i(LogTagUtilsKt.getTAG(this), "getSingleStressListFromLocal", new Object[0]);
        SingleStressDao singleStressDao = this.singleStressDao;
        dVar.c = 1;
        objLoadSingleStressList = singleStressDao.loadSingleStressList(dVar);
        if (objLoadSingleStressList == coroutine_suspended) {
            return coroutine_suspended;
        }
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        e eVar = new e((List) objLoadSingleStressList, null);
        dVar.c = 2;
        objLoadSingleStressList = BuildersKt.withContext(coroutineDispatcher, eVar, dVar);
        return objLoadSingleStressList == coroutine_suspended ? coroutine_suspended : objLoadSingleStressList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.SingleStressRepository
    @Nullable
    public Object getSingleStressListFromLocalBetweenStamp(long j2, long j3, @NotNull Continuation<? super List<SingleStress>> continuation) {
        f fVar;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i2 = fVar.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fVar.c = i2 - Integer.MIN_VALUE;
            } else {
                fVar = new f(continuation);
            }
        } else {
            fVar = new f(continuation);
        }
        f fVar2 = fVar;
        Object singleStressByBetweenTimestamp = fVar2.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = fVar2.c;
        if (i3 == 0) {
            ResultKt.throwOnFailure(singleStressByBetweenTimestamp);
            HMLog.i(LogTagUtilsKt.getTAG(this), "getSingleStressListFromLocalBetweenStamp", new Object[0]);
            SingleStressDao singleStressDao = this.singleStressDao;
            fVar2.c = 1;
            singleStressByBetweenTimestamp = singleStressDao.getSingleStressByBetweenTimestamp(j2, j3, fVar2);
            if (singleStressByBetweenTimestamp == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(singleStressByBetweenTimestamp);
        }
        Iterable iterable = (Iterable) singleStressByBetweenTimestamp;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(SingleStressDaoBeanExKt.toSingleStress((SingleStressDaoBean) it2.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0165 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x016d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0195 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0198  */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    @Override // com.huami.stress.domain.repository.SingleStressRepository
    @Nullable
    public Object saveSingleStressFromDevice(@NotNull String str, int i2, int i3, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Calendar calendar, @Nullable Function2<? super Long, ? super Boolean, Unit> function2, @NotNull Continuation<? super Pair<Boolean, Long>> continuation) throws Throwable {
        g gVar;
        Function2<? super Long, ? super Boolean, Unit> function3;
        int i4;
        int i5;
        String str5;
        String str6;
        String str7;
        String str8;
        SingleStressRepositoryImpl singleStressRepositoryImpl;
        Calendar calendar2;
        long timeInMillis;
        Object objWithContext;
        Function2<? super Long, ? super Boolean, Unit> function4;
        List<SingleStressDaoBean> list;
        SingleStressDao singleStressDao;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i6 = gVar.l;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gVar.l = i6 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object deviceSingleStress = gVar.j;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i7 = gVar.l;
        if (i7 != 0) {
            if (i7 == 1) {
                int i8 = gVar.i;
                int i9 = gVar.h;
                Function2<? super Long, ? super Boolean, Unit> function5 = (Function2) gVar.g;
                calendar2 = (Calendar) gVar.f;
                String str9 = (String) gVar.e;
                String str10 = (String) gVar.d;
                String str11 = (String) gVar.c;
                String str12 = (String) gVar.b;
                singleStressRepositoryImpl = (SingleStressRepositoryImpl) gVar.a;
                ResultKt.throwOnFailure(deviceSingleStress);
                i5 = i8;
                i4 = i9;
                str6 = str11;
                str5 = str12;
                str8 = str9;
                str7 = str10;
                function3 = function5;
            } else if (i7 == 2) {
                Function2<? super Long, ? super Boolean, Unit> function6 = (Function2) gVar.b;
                SingleStressRepositoryImpl singleStressRepositoryImpl2 = (SingleStressRepositoryImpl) gVar.a;
                ResultKt.throwOnFailure(deviceSingleStress);
                singleStressRepositoryImpl = singleStressRepositoryImpl2;
                function4 = function6;
                objWithContext = deviceSingleStress;
                timeInMillis = 0;
                list = (List) objWithContext;
                singleStressDao = singleStressRepositoryImpl.singleStressDao;
                gVar.a = singleStressRepositoryImpl;
                gVar.b = function4;
                gVar.c = list;
                gVar.l = 3;
                if (singleStressDao.insertOrUpdateSingleStress(list, gVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) gVar.c;
                function4 = (Function2) gVar.b;
                SingleStressRepositoryImpl singleStressRepositoryImpl3 = (SingleStressRepositoryImpl) gVar.a;
                ResultKt.throwOnFailure(deviceSingleStress);
                singleStressRepositoryImpl = singleStressRepositoryImpl3;
                timeInMillis = 0;
            }
            if (!list.isEmpty()) {
                Calendar calendar3 = Calendar.getInstance();
                calendar3.setTimeInMillis(list.get(list.size() - 1).getTimestamp());
                calendar3.add(14, 1000);
                timeInMillis = calendar3.getTimeInMillis();
            }
            if (!list.isEmpty()) {
                if (function4 != null) {
                    function4.invoke(Boxing.boxLong(timeInMillis), Boxing.boxBoolean(false));
                }
                HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl), Intrinsics.stringPlus("update singleStress device sync time:", Boxing.boxLong(timeInMillis)), new Object[0]);
            }
            return new Pair(Boxing.boxBoolean(true), Boxing.boxLong(timeInMillis));
        }
        ResultKt.throwOnFailure(deviceSingleStress);
        StressDeviceApi stressDeviceApi = this.deviceApi;
        gVar.a = this;
        gVar.b = str;
        gVar.c = str2;
        gVar.d = str3;
        gVar.e = str4;
        gVar.f = calendar;
        function3 = function2;
        gVar.g = function3;
        gVar.h = i2;
        gVar.i = i3;
        gVar.l = 1;
        deviceSingleStress = stressDeviceApi.getDeviceSingleStress(i2, i3, calendar, gVar);
        if (deviceSingleStress == coroutine_suspended) {
            return coroutine_suspended;
        }
        i4 = i2;
        i5 = i3;
        str5 = str;
        str6 = str2;
        str7 = str3;
        str8 = str4;
        singleStressRepositoryImpl = this;
        calendar2 = calendar;
        Pair pair = (Pair) deviceSingleStress;
        HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl), "repository get singleStress from device, time: " + calendar2.getTimeInMillis() + "  dataSize:" + ((List) pair.getSecond()).size() + "，data:" + pair.getSecond(), new Object[0]);
        if (!((Boolean) pair.getFirst()).booleanValue()) {
            return new Pair(Boxing.boxBoolean(false), Boxing.boxLong(0L));
        }
        timeInMillis = 0;
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        h hVar = new h(pair, str5, str6, i5, i4, str7, str8, null);
        gVar.a = singleStressRepositoryImpl;
        gVar.b = function3;
        gVar.c = null;
        gVar.d = null;
        gVar.e = null;
        gVar.f = null;
        gVar.g = null;
        gVar.l = 2;
        objWithContext = BuildersKt.withContext(coroutineDispatcher, hVar, gVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        function4 = function3;
        list = (List) objWithContext;
        singleStressDao = singleStressRepositoryImpl.singleStressDao;
        gVar.a = singleStressRepositoryImpl;
        gVar.b = function4;
        gVar.c = list;
        gVar.l = 3;
        if (singleStressDao.insertOrUpdateSingleStress(list, gVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        if (!list.isEmpty()) {
            Calendar calendar4 = Calendar.getInstance();
            calendar4.setTimeInMillis(list.get(list.size() - 1).getTimestamp());
            calendar4.add(14, 1000);
            timeInMillis = calendar4.getTimeInMillis();
        }
        if (!list.isEmpty()) {
            if (function4 != null) {
                function4.invoke(Boxing.boxLong(timeInMillis), Boxing.boxBoolean(false));
            }
            HMLog.i(LogTagUtilsKt.getTAG(singleStressRepositoryImpl), Intrinsics.stringPlus("update singleStress device sync time:", Boxing.boxLong(timeInMillis)), new Object[0]);
        }
        return new Pair(Boxing.boxBoolean(true), Boxing.boxLong(timeInMillis));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.SingleStressRepository
    @Nullable
    public Object saveSingleStressFromServer(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        i iVar;
        SingleStressRepositoryImpl singleStressRepositoryImpl;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.e = i2 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        i iVar2 = iVar;
        Object latestSyncedSingleStress = iVar2.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = iVar2.e;
        if (i3 == 0) {
            ResultKt.throwOnFailure(latestSyncedSingleStress);
            HMLog.i(LogTagUtilsKt.getTAG(this), "saveSingleStressFromServer", new Object[0]);
            SingleStressDao singleStressDao = this.singleStressDao;
            iVar2.a = this;
            iVar2.b = str;
            iVar2.e = 1;
            latestSyncedSingleStress = singleStressDao.getLatestSyncedSingleStress(iVar2);
            if (latestSyncedSingleStress == coroutine_suspended) {
                return coroutine_suspended;
            }
            singleStressRepositoryImpl = this;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    ResultKt.throwOnFailure(latestSyncedSingleStress);
                    return Unit.INSTANCE;
                }
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(latestSyncedSingleStress);
                return Unit.INSTANCE;
            }
            str = (String) iVar2.b;
            singleStressRepositoryImpl = (SingleStressRepositoryImpl) iVar2.a;
            ResultKt.throwOnFailure(latestSyncedSingleStress);
        }
        SingleStressDaoBean singleStressDaoBean = (SingleStressDaoBean) latestSyncedSingleStress;
        if (singleStressDaoBean == null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            iVar2.a = null;
            iVar2.b = null;
            iVar2.e = 2;
            if (singleStressRepositoryImpl.b(str, jCurrentTimeMillis, 0L, iVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long timestamp = singleStressDaoBean.getTimestamp();
        iVar2.a = null;
        iVar2.b = null;
        iVar2.e = 3;
        if (singleStressRepositoryImpl.b(str, jCurrentTimeMillis2, timestamp, iVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.stress.domain.repository.SingleStressRepository
    @Nullable
    public Object saveSingleStressToLocal(@NotNull List<SingleStress> list, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        m mVar;
        SingleStressRepositoryImpl singleStressRepositoryImpl;
        if (continuation instanceof m) {
            mVar = (m) continuation;
            int i2 = mVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.d = i2 - Integer.MIN_VALUE;
            } else {
                mVar = new m(continuation);
            }
        } else {
            mVar = new m(continuation);
        }
        Object objWithContext = mVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = mVar.d;
        if (i3 != 0) {
            if (i3 == 1) {
                singleStressRepositoryImpl = (SingleStressRepositoryImpl) mVar.a;
                ResultKt.throwOnFailure(objWithContext);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objWithContext);
        CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
        n nVar = new n(list, null);
        mVar.a = this;
        mVar.d = 1;
        objWithContext = BuildersKt.withContext(coroutineDispatcher, nVar, mVar);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        singleStressRepositoryImpl = this;
        SingleStressDao singleStressDao = singleStressRepositoryImpl.singleStressDao;
        mVar.a = null;
        mVar.d = 2;
        if (singleStressDao.insertOrUpdateSingleStress((List) objWithContext, mVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00c8 -> B:38:0x00c9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.huami.stress.domain.repository.SingleStressRepository
    @org.jetbrains.annotations.Nullable
    public java.lang.Object syncSingleStressToServer(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r19) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.stress.domain.data.SingleStressRepositoryImpl.syncSingleStressToServer(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
