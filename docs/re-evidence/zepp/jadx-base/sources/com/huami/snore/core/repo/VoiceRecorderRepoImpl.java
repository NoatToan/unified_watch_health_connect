package com.huami.snore.core.repo;

import android.content.Context;
import android.text.TextUtils;
import androidx.multidex.MultiDexExtractor;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.android.vo.Resource;
import com.huami.snore.core.cloud.api.RemoteVoiceDataApi;
import com.huami.snore.core.cloud.api.request.UploadVoiceDataRequest;
import com.huami.snore.core.cloud.api.response.SnoreEventsResponse;
import com.huami.snore.core.converter.SnoreDataTypeConvert;
import com.huami.snore.core.db.entity.VoiceRecorderEntity;
import com.huami.snore.core.util.NetUtil;
import com.huami.snore.core.util.ZipUtil;
import com.huami.snore.core.vo.VoiceListingModel;
import com.huami.snore.core.vo.VoiceShowInfo;
import com.huami.tools.analytics.DbUtils;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.Header;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020'¢\u0006\u0004\b+\u0010,J#\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016J#\u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0016J\"\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016J\u001d\u0010\u001d\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00192\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0016J+\u0010!\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00160\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/huami/snore/core/repo/VoiceRecorderRepoImpl;", "Lcom/huami/snore/core/repo/IVoiceRecorderRepo;", "", "Lcom/huami/snore/core/db/entity/VoiceRecorderEntity;", "data", "", "a", "([Lcom/huami/snore/core/db/entity/VoiceRecorderEntity;)V", "Ljava/util/Date;", "startTime", "endTime", "Lcom/huami/snore/core/vo/VoiceListingModel;", "Lcom/huami/snore/core/vo/VoiceShowInfo;", "loadRecorderData", "", "syncSnoreData", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "startDate", "endDate", "Lkotlinx/coroutines/flow/Flow;", "Lcom/huami/android/vo/Resource;", "", "deleteWithinTimeData", "Landroidx/lifecycle/LiveData;", "", "getRecorderCount", "info", "deleteSnoreInfo", "(Lcom/huami/snore/core/vo/VoiceShowInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "uploadSnoreInfo", "deleteLocalWithinTimeData", "(Landroid/content/Context;Ljava/util/Date;Ljava/util/Date;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "downLoadFile", "Lcom/huami/snore/core/repo/LocalVoiceDataApi;", "Lcom/huami/snore/core/repo/LocalVoiceDataApi;", "localApi", "Lcom/huami/snore/core/cloud/api/RemoteVoiceDataApi;", "b", "Lcom/huami/snore/core/cloud/api/RemoteVoiceDataApi;", "remoteApi", "<init>", "(Lcom/huami/snore/core/repo/LocalVoiceDataApi;Lcom/huami/snore/core/cloud/api/RemoteVoiceDataApi;)V", "snore_release"}, k = 1, mv = {1, 5, 1})
public final class VoiceRecorderRepoImpl implements IVoiceRecorderRepo {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LocalVoiceDataApi localApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final RemoteVoiceDataApi remoteApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.core.repo.VoiceRecorderRepoImpl", f = "VoiceRecorderRepoImpl.kt", i = {0, 0}, l = {112, 113}, m = "deleteSnoreInfo", n = {"this", "info"}, s = {"L$0", "L$1"})
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
            return VoiceRecorderRepoImpl.this.deleteSnoreInfo(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/huami/android/vo/Resource;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.core.repo.VoiceRecorderRepoImpl$deleteWithinTimeData$1", f = "VoiceRecorderRepoImpl.kt", i = {1, 1}, l = {60, 63, 70, 74, 75, 77}, m = "invokeSuspend", n = {"$this$flow", "recordList"}, s = {"L$0", "L$1"})
    public static final class b extends SuspendLambda implements Function2<FlowCollector<? super Resource<? extends Boolean>>, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        private /* synthetic */ Object c;
        public final /* synthetic */ Date e;
        public final /* synthetic */ Date f;
        public final /* synthetic */ Context g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Date date, Date date2, Context context, Continuation<? super b> continuation) {
            super(2, continuation);
            this.e = date;
            this.f = date2;
            this.g = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = VoiceRecorderRepoImpl.this.new b(this.e, this.f, this.g, continuation);
            bVar.c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super Resource<? extends Boolean>> flowCollector, Continuation<? super Unit> continuation) {
            return invoke2((FlowCollector<? super Resource<Boolean>>) flowCollector, continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull FlowCollector<? super Resource<Boolean>> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x008c  */
        /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ec A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ff A[PHI: r14
          0x00ff: PHI (r14v10 kotlinx.coroutines.flow.FlowCollector) = (r14v5 kotlinx.coroutines.flow.FlowCollector), (r14v11 kotlinx.coroutines.flow.FlowCollector) binds: [B:31:0x00b6, B:42:0x00fd] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:44:0x0101  */
        /* JADX WARN: Code duplicated, block: B:46:0x0107  */
        /* JADX WARN: Code duplicated, block: B:48:0x011e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:49:0x011f  */
        /* JADX WARN: Code duplicated, block: B:52:0x0131 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:53:0x0132  */
        /* JADX WARN: Code duplicated, block: B:55:0x0145 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:59:0x00a1 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:61:0x0086 A[SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FlowCollector flowCollector;
            List<VoiceRecorderEntity> listLoadWithinTimeDataList;
            ArrayList arrayList;
            Context context;
            VoiceRecorderRepoImpl voiceRecorderRepoImpl;
            Date date;
            Date date2;
            Object objDeleteSnoreData;
            FlowCollector flowCollector2;
            boolean zBooleanValue;
            boolean zBooleanValue2;
            Resource resourceError$default;
            LocalVoiceDataApi localVoiceDataApi;
            Date date3;
            Date date4;
            FlowCollector flowCollector3;
            Boolean boolBoxBoolean;
            Resource resourceSuccess$default;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            switch (this.b) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    flowCollector = (FlowCollector) this.c;
                    listLoadWithinTimeDataList = VoiceRecorderRepoImpl.this.localApi.loadWithinTimeDataList(this.e, this.f);
                    if (listLoadWithinTimeDataList.isEmpty()) {
                        Resource resourceSuccess$default2 = Resource.Companion.success$default(Resource.INSTANCE, null, 1, null);
                        this.b = 1;
                        if (flowCollector.emit(resourceSuccess$default2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    Resource resourceLoading$default = Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null);
                    this.c = flowCollector;
                    this.a = listLoadWithinTimeDataList;
                    this.b = 2;
                    if (flowCollector.emit(resourceLoading$default, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    arrayList = new ArrayList();
                    for (Object obj2 : listLoadWithinTimeDataList) {
                        if (Boxing.boxBoolean(((VoiceRecorderEntity) obj2).getUploaded()).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!Boxing.boxBoolean(!arrayList.isEmpty()).booleanValue()) {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        zBooleanValue2 = true;
                    } else {
                        context = this.g;
                        voiceRecorderRepoImpl = VoiceRecorderRepoImpl.this;
                        date = this.e;
                        date2 = this.f;
                        if (NetUtil.INSTANCE.isNetworkConnect(context)) {
                            RemoteVoiceDataApi remoteVoiceDataApi = voiceRecorderRepoImpl.remoteApi;
                            long j = 1000;
                            long time = date.getTime() / j;
                            long time2 = date2.getTime() / j;
                            this.c = flowCollector;
                            this.a = null;
                            this.b = 3;
                            objDeleteSnoreData = remoteVoiceDataApi.deleteSnoreData(time, time2, this);
                            if (objDeleteSnoreData == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            flowCollector2 = flowCollector;
                            obj = objDeleteSnoreData;
                            FlowCollector flowCollector4 = flowCollector2;
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            flowCollector = flowCollector4;
                        } else {
                            zBooleanValue = false;
                        }
                        boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                        if (boolBoxBoolean == null) {
                            zBooleanValue2 = true;
                        } else {
                            zBooleanValue2 = boolBoxBoolean.booleanValue();
                        }
                    }
                    if (zBooleanValue2) {
                        localVoiceDataApi = VoiceRecorderRepoImpl.this.localApi;
                        date3 = this.e;
                        date4 = this.f;
                        this.c = flowCollector;
                        this.a = null;
                        this.b = 4;
                        if (localVoiceDataApi.deleteWithinTimeData(date3, date4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        flowCollector3 = flowCollector;
                        resourceSuccess$default = Resource.Companion.success$default(Resource.INSTANCE, null, 1, null);
                        this.c = null;
                        this.b = 5;
                        if (flowCollector3.emit(resourceSuccess$default, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        resourceError$default = Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null);
                        this.c = null;
                        this.a = null;
                        this.b = 6;
                        if (flowCollector.emit(resourceError$default, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 2:
                    listLoadWithinTimeDataList = (List) this.a;
                    FlowCollector flowCollector5 = (FlowCollector) this.c;
                    ResultKt.throwOnFailure(obj);
                    flowCollector = flowCollector5;
                    arrayList = new ArrayList();
                    while (r1.hasNext()) {
                        if (Boxing.boxBoolean(((VoiceRecorderEntity) obj2).getUploaded()).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!Boxing.boxBoolean(!arrayList.isEmpty()).booleanValue()) {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        zBooleanValue2 = true;
                    } else {
                        context = this.g;
                        voiceRecorderRepoImpl = VoiceRecorderRepoImpl.this;
                        date = this.e;
                        date2 = this.f;
                        if (NetUtil.INSTANCE.isNetworkConnect(context)) {
                            zBooleanValue = false;
                        } else {
                            RemoteVoiceDataApi remoteVoiceDataApi2 = voiceRecorderRepoImpl.remoteApi;
                            long j2 = 1000;
                            long time3 = date.getTime() / j2;
                            long time4 = date2.getTime() / j2;
                            this.c = flowCollector;
                            this.a = null;
                            this.b = 3;
                            objDeleteSnoreData = remoteVoiceDataApi2.deleteSnoreData(time3, time4, this);
                            if (objDeleteSnoreData == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            flowCollector2 = flowCollector;
                            obj = objDeleteSnoreData;
                            FlowCollector flowCollector6 = flowCollector2;
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            flowCollector = flowCollector6;
                        }
                        boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                        if (boolBoxBoolean == null) {
                            zBooleanValue2 = true;
                        } else {
                            zBooleanValue2 = boolBoxBoolean.booleanValue();
                        }
                    }
                    if (zBooleanValue2) {
                        localVoiceDataApi = VoiceRecorderRepoImpl.this.localApi;
                        date3 = this.e;
                        date4 = this.f;
                        this.c = flowCollector;
                        this.a = null;
                        this.b = 4;
                        if (localVoiceDataApi.deleteWithinTimeData(date3, date4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        flowCollector3 = flowCollector;
                        resourceSuccess$default = Resource.Companion.success$default(Resource.INSTANCE, null, 1, null);
                        this.c = null;
                        this.b = 5;
                        if (flowCollector3.emit(resourceSuccess$default, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        resourceError$default = Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null);
                        this.c = null;
                        this.a = null;
                        this.b = 6;
                        if (flowCollector.emit(resourceError$default, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                case 3:
                    flowCollector2 = (FlowCollector) this.c;
                    ResultKt.throwOnFailure(obj);
                    FlowCollector flowCollector7 = flowCollector2;
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    flowCollector = flowCollector7;
                    boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                    if (boolBoxBoolean == null) {
                        zBooleanValue2 = true;
                    } else {
                        zBooleanValue2 = boolBoxBoolean.booleanValue();
                    }
                    if (zBooleanValue2) {
                        localVoiceDataApi = VoiceRecorderRepoImpl.this.localApi;
                        date3 = this.e;
                        date4 = this.f;
                        this.c = flowCollector;
                        this.a = null;
                        this.b = 4;
                        if (localVoiceDataApi.deleteWithinTimeData(date3, date4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        flowCollector3 = flowCollector;
                        resourceSuccess$default = Resource.Companion.success$default(Resource.INSTANCE, null, 1, null);
                        this.c = null;
                        this.b = 5;
                        if (flowCollector3.emit(resourceSuccess$default, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        resourceError$default = Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null);
                        this.c = null;
                        this.a = null;
                        this.b = 6;
                        if (flowCollector.emit(resourceError$default, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                case 4:
                    flowCollector3 = (FlowCollector) this.c;
                    ResultKt.throwOnFailure(obj);
                    resourceSuccess$default = Resource.Companion.success$default(Resource.INSTANCE, null, 1, null);
                    this.c = null;
                    this.b = 5;
                    if (flowCollector3.emit(resourceSuccess$default, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.core.repo.VoiceRecorderRepoImpl$downLoadFile$1", f = "VoiceRecorderRepoImpl.kt", i = {}, l = {203}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ VoiceShowInfo b;
        public final /* synthetic */ MutableLiveData<Resource<String>> c;
        public final /* synthetic */ VoiceRecorderRepoImpl d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.snore.core.repo.VoiceRecorderRepoImpl$downLoadFile$1$1", f = "VoiceRecorderRepoImpl.kt", i = {}, l = {206}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ VoiceShowInfo b;
            public final /* synthetic */ MutableLiveData<Resource<String>> c;
            public final /* synthetic */ VoiceRecorderRepoImpl d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(VoiceShowInfo voiceShowInfo, MutableLiveData<Resource<String>> mutableLiveData, VoiceRecorderRepoImpl voiceRecorderRepoImpl, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = voiceShowInfo;
                this.c = mutableLiveData;
                this.d = voiceRecorderRepoImpl;
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

            /* JADX WARN: Code duplicated, block: B:20:0x0044  */
            /* JADX WARN: Code duplicated, block: B:21:0x0046  */
            /* JADX WARN: Code duplicated, block: B:24:0x0053  */
            /* JADX WARN: Code duplicated, block: B:26:0x0072  */
            /* JADX WARN: Code duplicated, block: B:32:0x0085  */
            /* JADX WARN: Code duplicated, block: B:34:0x0088  */
            /* JADX WARN: Code duplicated, block: B:35:0x0092  */
            /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
            /* JADX WARN: Code duplicated, block: B:39:0x00a5  */
            /* JADX WARN: Code duplicated, block: B:41:0x00b0  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Date startTime;
                SnoreEventsResponse snoreEventsResponse;
                VoiceRecorderRepoImpl voiceRecorderRepoImpl;
                MutableLiveData<Resource<String>> mutableLiveData;
                String filePath;
                File file;
                File fileDownloadFile;
                List<File> listUnzip;
                boolean z;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    VoiceShowInfo voiceShowInfo = this.b;
                    if (voiceShowInfo == null || (startTime = voiceShowInfo.getStartTime()) == null) {
                        snoreEventsResponse = null;
                    } else {
                        RemoteVoiceDataApi remoteVoiceDataApi = this.d.remoteApi;
                        long time = startTime.getTime() / ((long) 1000);
                        this.a = 1;
                        obj = remoteVoiceDataApi.findSnoreData(time, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    if (snoreEventsResponse == null) {
                        filePath = null;
                    } else {
                        VoiceShowInfo voiceShowInfo2 = this.b;
                        voiceRecorderRepoImpl = this.d;
                        mutableLiveData = this.c;
                        filePath = voiceShowInfo2.getFilePath();
                        if (filePath == null) {
                            filePath = null;
                        } else {
                            file = new File(m.replace$default(filePath, ".wav", MultiDexExtractor.EXTRACTED_SUFFIX, false, 4, (Object) null));
                            fileDownloadFile = voiceRecorderRepoImpl.remoteApi.downloadFile(file, snoreEventsResponse.getUrl());
                            if (fileDownloadFile != null) {
                                listUnzip = ZipUtil.unzip(fileDownloadFile, file.getParentFile());
                                if (listUnzip != null || listUnzip.isEmpty()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    mutableLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                                } else {
                                    mutableLiveData.postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                                }
                                if (fileDownloadFile.exists()) {
                                    fileDownloadFile.delete();
                                }
                            } else {
                                mutableLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                            }
                        }
                    }
                    if (filePath == null) {
                        this.c.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                snoreEventsResponse = (SnoreEventsResponse) obj;
                if (snoreEventsResponse == null) {
                    filePath = null;
                } else {
                    VoiceShowInfo voiceShowInfo3 = this.b;
                    voiceRecorderRepoImpl = this.d;
                    mutableLiveData = this.c;
                    filePath = voiceShowInfo3.getFilePath();
                    if (filePath == null) {
                        filePath = null;
                    } else {
                        file = new File(m.replace$default(filePath, ".wav", MultiDexExtractor.EXTRACTED_SUFFIX, false, 4, (Object) null));
                        fileDownloadFile = voiceRecorderRepoImpl.remoteApi.downloadFile(file, snoreEventsResponse.getUrl());
                        if (fileDownloadFile != null) {
                            listUnzip = ZipUtil.unzip(fileDownloadFile, file.getParentFile());
                            if (listUnzip != null) {
                                z = true;
                            } else {
                                z = true;
                            }
                            if (z) {
                                mutableLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                            } else {
                                mutableLiveData.postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                            }
                            if (fileDownloadFile.exists()) {
                                fileDownloadFile.delete();
                            }
                        } else {
                            mutableLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                        }
                    }
                }
                if (filePath == null) {
                    this.c.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(VoiceShowInfo voiceShowInfo, MutableLiveData<Resource<String>> mutableLiveData, VoiceRecorderRepoImpl voiceRecorderRepoImpl, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = voiceShowInfo;
            this.c = mutableLiveData;
            this.d = voiceRecorderRepoImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, this.d, continuation);
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
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(this.b, this.c, this.d, null);
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

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.core.repo.VoiceRecorderRepoImpl", f = "VoiceRecorderRepoImpl.kt", i = {0}, l = {47}, m = "syncSnoreData", n = {"this"}, s = {"L$0"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return VoiceRecorderRepoImpl.this.syncSnoreData(0L, 0L, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.snore.core.repo.VoiceRecorderRepoImpl$uploadSnoreInfo$1$1", f = "VoiceRecorderRepoImpl.kt", i = {}, l = {168}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;
        public final /* synthetic */ VoiceShowInfo d;
        public final /* synthetic */ VoiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1 e;
        public final /* synthetic */ MutableLiveData<Resource<String>> f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.snore.core.repo.VoiceRecorderRepoImpl$uploadSnoreInfo$1$1$1", f = "VoiceRecorderRepoImpl.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ VoiceRecorderRepoImpl b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ VoiceShowInfo d;
            public final /* synthetic */ VoiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1 e;
            public final /* synthetic */ MutableLiveData<Resource<String>> f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(VoiceRecorderRepoImpl voiceRecorderRepoImpl, Context context, VoiceShowInfo voiceShowInfo, VoiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1 voiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1, MutableLiveData<Resource<String>> mutableLiveData, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = voiceRecorderRepoImpl;
                this.c = context;
                this.d = voiceShowInfo;
                this.e = voiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1;
                this.f = mutableLiveData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RemoteVoiceDataApi remoteVoiceDataApi = this.b.remoteApi;
                    Context context = this.c;
                    String filePath = this.d.getFilePath();
                    Date startTime = this.d.getStartTime();
                    UploadVoiceDataRequest uploadVoiceDataRequest = new UploadVoiceDataRequest(startTime == null ? null : Boxing.boxLong(startTime.getTime() / ((long) 1000)), Boxing.boxLong(this.d.getDuration() / ((long) 1000)));
                    VoiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1 voiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1 = this.e;
                    this.a = 1;
                    obj = remoteVoiceDataApi.uploadSnoreData(context, filePath, uploadVoiceDataRequest, voiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (TextUtils.isEmpty((String) obj)) {
                    this.f.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, VoiceShowInfo voiceShowInfo, VoiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1 voiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1, MutableLiveData<Resource<String>> mutableLiveData, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = context;
            this.d = voiceShowInfo;
            this.e = voiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1;
            this.f = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return VoiceRecorderRepoImpl.this.new e(this.c, this.d, this.e, this.f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(VoiceRecorderRepoImpl.this, this.c, this.d, this.e, this.f, null);
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

    public VoiceRecorderRepoImpl(@NotNull LocalVoiceDataApi localVoiceDataApi, @NotNull RemoteVoiceDataApi remoteVoiceDataApi) {
        this.localApi = localVoiceDataApi;
        this.remoteApi = remoteVoiceDataApi;
    }

    private final void a(VoiceRecorderEntity... data) {
        ArrayList arrayList = new ArrayList();
        for (VoiceRecorderEntity voiceRecorderEntity : data) {
            Date startTime = voiceRecorderEntity.getStartTime();
            if (startTime != null) {
                List<VoiceRecorderEntity> listFindByStartTime = this.localApi.findByStartTime(startTime);
                if (!listFindByStartTime.isEmpty()) {
                    voiceRecorderEntity.setId(listFindByStartTime.get(0).getId());
                    this.localApi.update(voiceRecorderEntity);
                } else {
                    arrayList.add(voiceRecorderEntity);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.localApi.insert(arrayList);
        }
    }

    @Override // com.huami.snore.core.repo.IVoiceRecorderRepo
    @Nullable
    public Object deleteLocalWithinTimeData(@NotNull Context context, @NotNull Date date, @NotNull Date date2, @NotNull Continuation<? super Unit> continuation) {
        Object objDeleteWithinTimeData = this.localApi.deleteWithinTimeData(date, date2, continuation);
        return objDeleteWithinTimeData == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objDeleteWithinTimeData : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.snore.core.repo.IVoiceRecorderRepo
    @Nullable
    public Object deleteSnoreInfo(@Nullable VoiceShowInfo voiceShowInfo, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        VoiceRecorderRepoImpl voiceRecorderRepoImpl;
        Date startTime;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.e;
        if (i2 != 0) {
            if (i2 == 1) {
                voiceShowInfo = (VoiceShowInfo) aVar.b;
                voiceRecorderRepoImpl = (VoiceRecorderRepoImpl) aVar.a;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        LocalVoiceDataApi localVoiceDataApi = this.localApi;
        String filePath = voiceShowInfo == null ? null : voiceShowInfo.getFilePath();
        aVar.a = this;
        aVar.b = voiceShowInfo;
        aVar.e = 1;
        if (localVoiceDataApi.deleteByFilePath(filePath, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        voiceRecorderRepoImpl = this;
        RemoteVoiceDataApi remoteVoiceDataApi = voiceRecorderRepoImpl.remoteApi;
        Long lBoxLong = (voiceShowInfo == null || (startTime = voiceShowInfo.getStartTime()) == null) ? null : Boxing.boxLong(startTime.getTime() / ((long) 1000));
        aVar.a = null;
        aVar.b = null;
        aVar.e = 2;
        if (remoteVoiceDataApi.deleteSnoreData(lBoxLong, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // com.huami.snore.core.repo.IVoiceRecorderRepo
    @NotNull
    public Flow<Resource<Boolean>> deleteWithinTimeData(@NotNull Context context, @NotNull Date startDate, @NotNull Date endDate) {
        return FlowKt.flow(new b(startDate, endDate, context, null));
    }

    @Override // com.huami.snore.core.repo.IVoiceRecorderRepo
    @NotNull
    public LiveData<Resource<String>> downLoadFile(@Nullable VoiceShowInfo info) {
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new c(info, mutableLiveData, this, null), 3, null);
        return mutableLiveData;
    }

    @Override // com.huami.snore.core.repo.IVoiceRecorderRepo
    @NotNull
    public LiveData<Integer> getRecorderCount(@Nullable Date startTime, @Nullable Date endTime) {
        if (startTime == null || endTime == null) {
            return new MutableLiveData();
        }
        LiveData<Integer> recorderCount = this.localApi.getRecorderCount(startTime, endTime);
        return recorderCount == null ? new MutableLiveData() : recorderCount;
    }

    @Override // com.huami.snore.core.repo.IVoiceRecorderRepo
    @Nullable
    public VoiceListingModel<VoiceShowInfo> loadRecorderData(@Nullable Date startTime, @Nullable Date endTime) {
        if (startTime == null || endTime == null) {
            return null;
        }
        return this.localApi.loadRecorderData(startTime, endTime);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.snore.core.repo.IVoiceRecorderRepo
    @Nullable
    public Object syncSnoreData(long j, long j2, @NotNull Continuation<? super Unit> continuation) {
        d dVar;
        VoiceRecorderRepoImpl voiceRecorderRepoImpl;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i = dVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.d = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        d dVar2 = dVar;
        Object objSyncSnoreData = dVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = dVar2.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objSyncSnoreData);
            RemoteVoiceDataApi remoteVoiceDataApi = this.remoteApi;
            dVar2.a = this;
            dVar2.d = 1;
            objSyncSnoreData = remoteVoiceDataApi.syncSnoreData(j, j2, dVar2);
            if (objSyncSnoreData == coroutine_suspended) {
                return coroutine_suspended;
            }
            voiceRecorderRepoImpl = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            voiceRecorderRepoImpl = (VoiceRecorderRepoImpl) dVar2.a;
            ResultKt.throwOnFailure(objSyncSnoreData);
        }
        Iterable iterable = (Iterable) objSyncSnoreData;
        SnoreDataTypeConvert snoreDataTypeConvert = SnoreDataTypeConvert.INSTANCE;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it2 = iterable.iterator();
        while (it2.hasNext()) {
            arrayList.add(snoreDataTypeConvert.convertResp2Entity((SnoreEventsResponse) it2.next()));
        }
        Object[] array = arrayList.toArray(new VoiceRecorderEntity[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        VoiceRecorderEntity[] voiceRecorderEntityArr = (VoiceRecorderEntity[]) array;
        voiceRecorderRepoImpl.a((VoiceRecorderEntity[]) Arrays.copyOf(voiceRecorderEntityArr, voiceRecorderEntityArr.length));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.huami.snore.core.repo.VoiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1] */
    @Override // com.huami.snore.core.repo.IVoiceRecorderRepo
    @NotNull
    public LiveData<Resource<String>> uploadSnoreInfo(@NotNull Context context, @Nullable final VoiceShowInfo info) {
        final MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(Resource.Companion.loading$default(Resource.INSTANCE, null, 1, null));
        if (info != null) {
            kotlinx.coroutines.e.f(GlobalScope.INSTANCE, null, null, new e(context, info, new AsyncHttpResponseHandler() { // from class: com.huami.snore.core.repo.VoiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.snore.core.repo.VoiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1$onSuccess$1", f = "VoiceRecorderRepoImpl.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
                public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ VoiceRecorderRepoImpl b;
                    public final /* synthetic */ VoiceShowInfo c;
                    public final /* synthetic */ MutableLiveData<Resource<String>> d;

                    /* JADX INFO: renamed from: com.huami.snore.core.repo.VoiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1$a$a, reason: collision with other inner class name */
                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    @DebugMetadata(c = "com.huami.snore.core.repo.VoiceRecorderRepoImpl$uploadSnoreInfo$1$handler$1$onSuccess$1$1", f = "VoiceRecorderRepoImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    public static final class C0601a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        public int a;
                        public final /* synthetic */ VoiceRecorderRepoImpl b;
                        public final /* synthetic */ VoiceShowInfo c;
                        public final /* synthetic */ MutableLiveData<Resource<String>> d;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C0601a(VoiceRecorderRepoImpl voiceRecorderRepoImpl, VoiceShowInfo voiceShowInfo, MutableLiveData<Resource<String>> mutableLiveData, Continuation<? super C0601a> continuation) {
                            super(2, continuation);
                            this.b = voiceRecorderRepoImpl;
                            this.c = voiceShowInfo;
                            this.d = mutableLiveData;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            return new C0601a(this.b, this.c, this.d, continuation);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        @Nullable
                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                            return ((C0601a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                            if (this.a != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            List<VoiceRecorderEntity> listFindByStartTime = this.b.localApi.findByStartTime(this.c.getStartTime());
                            if (!listFindByStartTime.isEmpty()) {
                                VoiceRecorderEntity voiceRecorderEntity = listFindByStartTime.get(0);
                                voiceRecorderEntity.setUploaded(true);
                                this.b.localApi.update(voiceRecorderEntity);
                            }
                            String filePath = this.c.getFilePath();
                            File file = new File(filePath == null ? null : m.replace$default(filePath, ".wav", MultiDexExtractor.EXTRACTED_SUFFIX, false, 4, (Object) null));
                            if (file.exists()) {
                                file.delete();
                            }
                            this.d.postValue(Resource.Companion.success$default(Resource.INSTANCE, null, 1, null));
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(VoiceRecorderRepoImpl voiceRecorderRepoImpl, VoiceShowInfo voiceShowInfo, MutableLiveData<Resource<String>> mutableLiveData, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.b = voiceRecorderRepoImpl;
                        this.c = voiceShowInfo;
                        this.d = mutableLiveData;
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
                        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                        int i = this.a;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            CoroutineDispatcher io2 = Dispatchers.getIO();
                            C0601a c0601a = new C0601a(this.b, this.c, this.d, null);
                            this.a = 1;
                            if (BuildersKt.withContext(io2, c0601a, this) == coroutine_suspended) {
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

                @Override // com.loopj.android.http.AsyncHttpResponseHandler
                public void onFailure(int statusCode, @Nullable Header[] headers, @Nullable byte[] responseBody, @Nullable Throwable error) {
                    mutableLiveData.postValue(Resource.Companion.error$default(Resource.INSTANCE, null, null, 3, null));
                }

                @Override // com.loopj.android.http.AsyncHttpResponseHandler
                public void onSuccess(int statusCode, @Nullable Header[] headers, @Nullable byte[] responseBody) {
                    e.f(GlobalScope.INSTANCE, null, null, new a(this.a, info, mutableLiveData, null), 3, null);
                }
            }, mutableLiveData, null), 3, null);
        }
        return mutableLiveData;
    }
}
