package com.huami.bluetooth.profile.channel.module.schedule.action;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleCallback;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleCmd;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleModule;
import com.huami.bluetooth.profile.channel.module.schedule.dto.AddOrUpdateRequest;
import com.huami.bluetooth.profile.channel.module.schedule.dto.IdsRequest;
import com.huami.bluetooth.profile.channel.module.schedule.dto.SyncRequest;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleVersion;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.mifit.sportlib.common.DataTypeSource;
import com.loc.z;
import com.unionpay.tsmservice.data.Constant;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.menstruation.MenstruationHelperKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 P2\u00020\u0001:\u0001PB\u000f\u0012\u0006\u0010/\u001a\u00020-¢\u0006\u0004\bN\u0010OJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\rH\u0016J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0014\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u001b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u0014\u0018\u00010\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\u0006\u0010 \u001a\u00020\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J'\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b$\u0010\u001cJ'\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001cJ!\u0010'\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b'\u0010\u001cJ#\u0010+\u001a\u00020\u00042\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010*\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u001d\u00104\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u001d\u00108\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00102\u001a\u0004\b6\u00107R\u0018\u0010;\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010<R\u0018\u0010@\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?RV\u0010G\u001aB\u0012\u0004\u0012\u00020B\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00140\u00100C0Aj \u0012\u0004\u0012\u00020B\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00140\u00100C`D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FRJ\u0010I\u001a6\u0012\u0004\u0012\u00020B\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100C0Aj\u001a\u0012\u0004\u0012\u00020B\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100C`D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010FRV\u0010K\u001aB\u0012\u0004\u0012\u00020B\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u00100C0Aj \u0012\u0004\u0012\u00020B\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00140\u00100C`D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010FRJ\u0010M\u001a6\u0012\u0004\u0012\u00020B\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100C0Aj\u001a\u0012\u0004\u0012\u00020B\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00100C`D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/action/ScheduleImpl;", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "", "data", "", "a", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "e", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "callback", "register", "", "moduleId", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCallback;", "", "enableSchedule", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "queryProtocolVersion", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "queryDataChanged", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCacheVersion", "", "ids", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "queryData", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "addOrUpdate", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "delete", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceList", "deleteBySource", "items", "syncDataToDevice", "clearDataChangedStatus", "", "msg", "errorCode", "onError", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleModule;", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleModule;", "model", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/QueryResultAction;", "b", "Lkotlin/Lazy;", "()Lcom/huami/bluetooth/profile/channel/module/schedule/action/QueryResultAction;", "queryResultAction", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/UpdateDeleteResultAction;", "c", "()Lcom/huami/bluetooth/profile/channel/module/schedule/action/UpdateDeleteResultAction;", "updateDeleteResultAction", GoogleApiAvailabilityLight.a, "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCallback;", "scheduleCallback", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "dataTransferCallback", "f", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "mVersion", "Ljava/util/HashMap;", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCmd;", "Lkotlinx/coroutines/channels/Channel;", "Lkotlin/collections/HashMap;", "g", "Ljava/util/HashMap;", "cacheChannel", "h", "cacheChannelVersion", "i", "cacheChannelDataChanged", z.j, "cacheChannelBoolean", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleModule;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ScheduleImpl implements ScheduleApi {
    public static final int SCHEDULE = 7;
    private static final long k = 3000;
    private static final long l = 5000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ScheduleModule model;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy queryResultAction = LazyKt__LazyJVMKt.lazy(j.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy updateDeleteResultAction = LazyKt__LazyJVMKt.lazy(m.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ScheduleCallback scheduleCallback;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private DataTransferCallback dataTransferCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private volatile ScheduleVersion mVersion;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final HashMap<ScheduleCmd, Channel<Response<List<ScheduleModel>>>> cacheChannel;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final HashMap<ScheduleCmd, Channel<Response<ScheduleVersion>>> cacheChannelVersion;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final HashMap<ScheduleCmd, Channel<Response<List<ScheduleStatus>>>> cacheChannelDataChanged;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final HashMap<ScheduleCmd, Channel<Response<Boolean>>> cacheChannelBoolean;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$1", f = "ScheduleImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<byte[], Continuation<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull byte[] bArr, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(bArr, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = ScheduleImpl.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            byte[] bArr = (byte[]) this.b;
            if (bArr.length == 0) {
                return Unit.INSTANCE;
            }
            ScheduleImpl.this.a(bArr);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$addOrUpdate$2", f = "ScheduleImpl.kt", i = {}, l = {132, 140}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int a;
        public final /* synthetic */ ScheduleModel c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$addOrUpdate$2$1", f = "ScheduleImpl.kt", i = {}, l = {141}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
            public int a;
            public final /* synthetic */ Channel<Response<Boolean>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<Boolean>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Response<Boolean>> channel = this.b;
                    this.a = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ScheduleModel scheduleModel, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = scheduleModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleImpl.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0095  */
        /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Boolean boolBoxBoolean;
            Response response;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response == null) {
                    return Response.INSTANCE.timeout();
                }
                return response;
            }
            ResultKt.throwOnFailure(obj);
            ScheduleImpl scheduleImpl = ScheduleImpl.this;
            this.a = 1;
            obj = scheduleImpl.requestCacheVersion(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            ScheduleVersion scheduleVersion = (ScheduleVersion) obj;
            HashMap map = ScheduleImpl.this.cacheChannelBoolean;
            ScheduleCmd scheduleCmd = ScheduleCmd.RESULT_ADD_OR_UPDATE;
            Channel channelChannel$default = (Channel) map.get(scheduleCmd);
            if (channelChannel$default == null) {
                channelChannel$default = ChannelKt.Channel$default(0, 1, null);
                ScheduleImpl.this.cacheChannelBoolean.put(scheduleCmd, channelChannel$default);
            }
            byte[] bArrCmd = new AddOrUpdateRequest(this.c, (scheduleVersion == null || (boolBoxBoolean = Boxing.boxBoolean(scheduleVersion.getSupportLocation())) == null) ? false : boolBoxBoolean.booleanValue()).cmd();
            BaseModule.sendData$default(ScheduleImpl.this.model, bArrCmd, 0, 2, null);
            DataTransferCallback dataTransferCallback = ScheduleImpl.this.dataTransferCallback;
            if (dataTransferCallback != null) {
                dataTransferCallback.onSend(bArrCmd);
            }
            a aVar = new a(channelChannel$default, null);
            this.a = 2;
            obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            response = (Response) obj;
            if (response == null) {
                return Response.INSTANCE.timeout();
            }
            return response;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$clearDataChangedStatus$2", f = "ScheduleImpl.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ List<Long> b;
        public final /* synthetic */ ScheduleImpl c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$clearDataChangedStatus$2$2", f = "ScheduleImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;

            public a(Continuation<? super a> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(continuation);
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
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Long> list, ScheduleImpl scheduleImpl, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = list;
            this.c = scheduleImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
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
                byte[] cmd = new IdsRequest(ScheduleCmd.CMD_CLEAR_DATA_CHANGED_STATUS, this.b).toCmd();
                ScheduleImpl scheduleImpl = this.c;
                BaseModule.sendData$default(scheduleImpl.model, cmd, 0, 2, null);
                DataTransferCallback dataTransferCallback = scheduleImpl.dataTransferCallback;
                if (dataTransferCallback != null) {
                    dataTransferCallback.onSend(cmd);
                }
                a aVar = new a(null);
                this.a = 1;
                obj = TimeoutKt.withTimeoutOrNull(5000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$delete$2", f = "ScheduleImpl.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int a;
        public final /* synthetic */ long c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$delete$2$1", f = "ScheduleImpl.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
            public int a;
            public final /* synthetic */ Channel<Response<Boolean>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<Boolean>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Response<Boolean>> channel = this.b;
                    this.a = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleImpl.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = ScheduleImpl.this.cacheChannelBoolean;
                ScheduleCmd scheduleCmd = ScheduleCmd.RESULT_DELETE;
                Channel channelChannel$default = (Channel) map.get(scheduleCmd);
                if (channelChannel$default == null) {
                    channelChannel$default = ChannelKt.Channel$default(0, 1, null);
                    ScheduleImpl.this.cacheChannelBoolean.put(scheduleCmd, channelChannel$default);
                }
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{ScheduleCmd.CMD_DELETE.toByte()}, GattUtils.numberToBytes(this.c, 4));
                BaseModule.sendData$default(ScheduleImpl.this.model, bArrPlus, 0, 2, null);
                DataTransferCallback dataTransferCallback = ScheduleImpl.this.dataTransferCallback;
                if (dataTransferCallback != null) {
                    dataTransferCallback.onSend(bArrPlus);
                }
                a aVar = new a(channelChannel$default, null);
                this.a = 1;
                obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            return response == null ? Response.INSTANCE.timeout() : response;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$deleteBySource$2", f = "ScheduleImpl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_CHECKERS}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int a;
        public final /* synthetic */ List<Integer> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$deleteBySource$2$2", f = "ScheduleImpl.kt", i = {}, l = {175}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
            public int a;
            public final /* synthetic */ Channel<Response<Boolean>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<Boolean>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Response<Boolean>> channel = this.b;
                    this.a = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<Integer> list, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleImpl.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = ScheduleImpl.this.cacheChannelBoolean;
                ScheduleCmd scheduleCmd = ScheduleCmd.RESULT_DELETE_BY_SOURCE;
                Channel channelChannel$default = (Channel) map.get(scheduleCmd);
                if (channelChannel$default == null) {
                    channelChannel$default = ChannelKt.Channel$default(0, 1, null);
                    ScheduleImpl.this.cacheChannelBoolean.put(scheduleCmd, channelChannel$default);
                }
                byte[] bArrPlus = ArraysKt___ArraysJvmKt.plus(new byte[]{ScheduleCmd.CMD_DELETE_BY_SOURCE.toByte()}, ByteUtilsKt.toByteArray(this.c.size(), 2));
                List<Integer> list = this.c;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(Boxing.boxByte((byte) ((Number) it2.next()).intValue()));
                }
                BaseModule.sendData$default(ScheduleImpl.this.model, ArraysKt___ArraysJvmKt.plus(bArrPlus, (Collection<Byte>) arrayList), 0, 2, null);
                a aVar = new a(channelChannel$default, null);
                this.a = 1;
                obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            return response == null ? Response.INSTANCE.timeout() : response;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$dispatcher$1", f = "ScheduleImpl.kt", i = {2, 3, 4, 5, 6}, l = {224, 228, 235, 240, Constant.PLAIN_TEXT_MAX_LENGTH, 250, 260}, m = "invokeSuspend", n = {AbstractJSONTokenResponse.RESPONSE, AbstractJSONTokenResponse.RESPONSE, AbstractJSONTokenResponse.RESPONSE, AbstractJSONTokenResponse.RESPONSE, AbstractJSONTokenResponse.RESPONSE}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ byte[] c;
        public final /* synthetic */ ScheduleImpl d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(byte[] bArr, ScheduleImpl scheduleImpl, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = bArr;
            this.d = scheduleImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:107:0x01b5  */
        /* JADX WARN: Code duplicated, block: B:108:0x01b7 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0016, B:151:0x0263, B:154:0x026c, B:10:0x001f, B:122:0x01f4, B:125:0x01fe, B:13:0x0028, B:105:0x01ad, B:108:0x01b7, B:16:0x0031, B:88:0x0166, B:91:0x0170, B:19:0x003a, B:71:0x011f, B:74:0x0129, B:20:0x003f, B:25:0x004a, B:40:0x0099, B:51:0x00ce, B:75:0x012e, B:92:0x0175, B:109:0x01bc, B:126:0x0203, B:138:0x022b, B:141:0x0234, B:143:0x023a, B:146:0x0255, B:129:0x020c, B:131:0x0212, B:134:0x021e, B:137:0x0227, B:112:0x01c5, B:114:0x01cb, B:117:0x01e6, B:95:0x017e, B:97:0x0184, B:100:0x019f, B:78:0x0137, B:80:0x013d, B:83:0x0158, B:54:0x00d7, B:56:0x00dd, B:63:0x00fe, B:66:0x0111, B:59:0x00ef, B:62:0x00fa, B:43:0x00a2, B:45:0x00a8, B:48:0x00c4, B:28:0x0059, B:30:0x005f, B:32:0x0071, B:34:0x007c, B:37:0x008f), top: B:159:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:124:0x01fc  */
        /* JADX WARN: Code duplicated, block: B:125:0x01fe A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0016, B:151:0x0263, B:154:0x026c, B:10:0x001f, B:122:0x01f4, B:125:0x01fe, B:13:0x0028, B:105:0x01ad, B:108:0x01b7, B:16:0x0031, B:88:0x0166, B:91:0x0170, B:19:0x003a, B:71:0x011f, B:74:0x0129, B:20:0x003f, B:25:0x004a, B:40:0x0099, B:51:0x00ce, B:75:0x012e, B:92:0x0175, B:109:0x01bc, B:126:0x0203, B:138:0x022b, B:141:0x0234, B:143:0x023a, B:146:0x0255, B:129:0x020c, B:131:0x0212, B:134:0x021e, B:137:0x0227, B:112:0x01c5, B:114:0x01cb, B:117:0x01e6, B:95:0x017e, B:97:0x0184, B:100:0x019f, B:78:0x0137, B:80:0x013d, B:83:0x0158, B:54:0x00d7, B:56:0x00dd, B:63:0x00fe, B:66:0x0111, B:59:0x00ef, B:62:0x00fa, B:43:0x00a2, B:45:0x00a8, B:48:0x00c4, B:28:0x0059, B:30:0x005f, B:32:0x0071, B:34:0x007c, B:37:0x008f), top: B:159:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:153:0x026b  */
        /* JADX WARN: Code duplicated, block: B:154:0x026c A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0016, B:151:0x0263, B:154:0x026c, B:10:0x001f, B:122:0x01f4, B:125:0x01fe, B:13:0x0028, B:105:0x01ad, B:108:0x01b7, B:16:0x0031, B:88:0x0166, B:91:0x0170, B:19:0x003a, B:71:0x011f, B:74:0x0129, B:20:0x003f, B:25:0x004a, B:40:0x0099, B:51:0x00ce, B:75:0x012e, B:92:0x0175, B:109:0x01bc, B:126:0x0203, B:138:0x022b, B:141:0x0234, B:143:0x023a, B:146:0x0255, B:129:0x020c, B:131:0x0212, B:134:0x021e, B:137:0x0227, B:112:0x01c5, B:114:0x01cb, B:117:0x01e6, B:95:0x017e, B:97:0x0184, B:100:0x019f, B:78:0x0137, B:80:0x013d, B:83:0x0158, B:54:0x00d7, B:56:0x00dd, B:63:0x00fe, B:66:0x0111, B:59:0x00ef, B:62:0x00fa, B:43:0x00a2, B:45:0x00a8, B:48:0x00c4, B:28:0x0059, B:30:0x005f, B:32:0x0071, B:34:0x007c, B:37:0x008f), top: B:159:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:73:0x0127  */
        /* JADX WARN: Code duplicated, block: B:74:0x0129 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0016, B:151:0x0263, B:154:0x026c, B:10:0x001f, B:122:0x01f4, B:125:0x01fe, B:13:0x0028, B:105:0x01ad, B:108:0x01b7, B:16:0x0031, B:88:0x0166, B:91:0x0170, B:19:0x003a, B:71:0x011f, B:74:0x0129, B:20:0x003f, B:25:0x004a, B:40:0x0099, B:51:0x00ce, B:75:0x012e, B:92:0x0175, B:109:0x01bc, B:126:0x0203, B:138:0x022b, B:141:0x0234, B:143:0x023a, B:146:0x0255, B:129:0x020c, B:131:0x0212, B:134:0x021e, B:137:0x0227, B:112:0x01c5, B:114:0x01cb, B:117:0x01e6, B:95:0x017e, B:97:0x0184, B:100:0x019f, B:78:0x0137, B:80:0x013d, B:83:0x0158, B:54:0x00d7, B:56:0x00dd, B:63:0x00fe, B:66:0x0111, B:59:0x00ef, B:62:0x00fa, B:43:0x00a2, B:45:0x00a8, B:48:0x00c4, B:28:0x0059, B:30:0x005f, B:32:0x0071, B:34:0x007c, B:37:0x008f), top: B:159:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:90:0x016e  */
        /* JADX WARN: Code duplicated, block: B:91:0x0170 A[Catch: Exception -> 0x0044, TryCatch #0 {Exception -> 0x0044, blocks: (B:7:0x0016, B:151:0x0263, B:154:0x026c, B:10:0x001f, B:122:0x01f4, B:125:0x01fe, B:13:0x0028, B:105:0x01ad, B:108:0x01b7, B:16:0x0031, B:88:0x0166, B:91:0x0170, B:19:0x003a, B:71:0x011f, B:74:0x0129, B:20:0x003f, B:25:0x004a, B:40:0x0099, B:51:0x00ce, B:75:0x012e, B:92:0x0175, B:109:0x01bc, B:126:0x0203, B:138:0x022b, B:141:0x0234, B:143:0x023a, B:146:0x0255, B:129:0x020c, B:131:0x0212, B:134:0x021e, B:137:0x0227, B:112:0x01c5, B:114:0x01cb, B:117:0x01e6, B:95:0x017e, B:97:0x0184, B:100:0x019f, B:78:0x0137, B:80:0x013d, B:83:0x0158, B:54:0x00d7, B:56:0x00dd, B:63:0x00fe, B:66:0x0111, B:59:0x00ef, B:62:0x00fa, B:43:0x00a2, B:45:0x00a8, B:48:0x00c4, B:28:0x0059, B:30:0x005f, B:32:0x0071, B:34:0x007c, B:37:0x008f), top: B:159:0x0007 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Boolean boolBoxBoolean;
            Response<List<ScheduleModel>> response;
            Response<List<ScheduleModel>> response2;
            Response<Boolean> responseInsertOrUpdate;
            Response<Boolean> response3;
            Response<Boolean> responseDelete;
            Response<Boolean> response4;
            Response<Boolean> responseSync;
            Response<Boolean> response5;
            ScheduleCallback scheduleCallback;
            Response<Boolean> responseDelete2;
            Response<Boolean> response6;
            ScheduleCallback scheduleCallback2;
            ScheduleCallback scheduleCallback3;
            ScheduleCallback scheduleCallback4;
            ScheduleCallback scheduleCallback5;
            ScheduleCallback scheduleCallback6;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            try {
                switch (this.b) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        Byte bFirstOrNull = ArraysKt___ArraysKt.firstOrNull(this.c);
                        ScheduleCmd scheduleCmd = ScheduleCmd.RESULT_QUERY_PROTOCOL_VERSION;
                        byte b = scheduleCmd.toByte();
                        if (bFirstOrNull != null && bFirstOrNull.byteValue() == b) {
                            Response<ScheduleVersion> responseResponseProtocolVersion = this.d.b().responseProtocolVersion(this.c);
                            this.d.mVersion = responseResponseProtocolVersion instanceof Success ? (ScheduleVersion) ((Success) responseResponseProtocolVersion).getData() : null;
                            Channel channel = (Channel) this.d.cacheChannelVersion.get(scheduleCmd);
                            if (channel != null) {
                                this.b = 1;
                                if (channel.send(responseResponseProtocolVersion, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } else {
                            ScheduleCmd scheduleCmd2 = ScheduleCmd.RESULT_QUERY_DATA_CHANGED;
                            byte b2 = scheduleCmd2.toByte();
                            if (bFirstOrNull != null && bFirstOrNull.byteValue() == b2) {
                                Response<List<ScheduleStatus>> responseResponseDataChanged = this.d.b().responseDataChanged(this.c);
                                Channel channel2 = (Channel) this.d.cacheChannelDataChanged.get(scheduleCmd2);
                                if (channel2 != null) {
                                    this.b = 2;
                                    if (channel2.send(responseResponseDataChanged, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } else {
                                ScheduleCmd scheduleCmd3 = ScheduleCmd.RESULT_QUERY_DATA;
                                byte b3 = scheduleCmd3.toByte();
                                if (bFirstOrNull != null && bFirstOrNull.byteValue() == b3) {
                                    QueryResultAction queryResultActionB = this.d.b();
                                    byte[] bArr = this.c;
                                    ScheduleVersion scheduleVersion = this.d.mVersion;
                                    response = queryResultActionB.response(bArr, (scheduleVersion == null || (boolBoxBoolean = Boxing.boxBoolean(scheduleVersion.getSupportLocation())) == null) ? false : boolBoxBoolean.booleanValue());
                                    Channel channel3 = (Channel) this.d.cacheChannel.get(scheduleCmd3);
                                    if (channel3 != null) {
                                        this.a = response;
                                        this.b = 3;
                                        if (channel3.send(response, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                        response2 = response;
                                        response = response2;
                                    }
                                    scheduleCallback2 = this.d.scheduleCallback;
                                    if (scheduleCallback2 == null) {
                                        scheduleCallback2.onQueryDeviceDataResult(response);
                                    }
                                } else {
                                    ScheduleCmd scheduleCmd4 = ScheduleCmd.RESULT_ADD_OR_UPDATE;
                                    byte b4 = scheduleCmd4.toByte();
                                    if (bFirstOrNull != null && bFirstOrNull.byteValue() == b4) {
                                        responseInsertOrUpdate = this.d.c().insertOrUpdate(this.c);
                                        Channel channel4 = (Channel) this.d.cacheChannelBoolean.get(scheduleCmd4);
                                        if (channel4 != null) {
                                            this.a = responseInsertOrUpdate;
                                            this.b = 4;
                                            if (channel4.send(responseInsertOrUpdate, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            response3 = responseInsertOrUpdate;
                                            responseInsertOrUpdate = response3;
                                        }
                                        scheduleCallback3 = this.d.scheduleCallback;
                                        if (scheduleCallback3 == null) {
                                            scheduleCallback3.onAddOrUpdateResult(responseInsertOrUpdate);
                                        }
                                    } else {
                                        ScheduleCmd scheduleCmd5 = ScheduleCmd.RESULT_DELETE;
                                        byte b5 = scheduleCmd5.toByte();
                                        if (bFirstOrNull != null && bFirstOrNull.byteValue() == b5) {
                                            responseDelete = this.d.c().delete(this.c);
                                            Channel channel5 = (Channel) this.d.cacheChannelBoolean.get(scheduleCmd5);
                                            if (channel5 != null) {
                                                this.a = responseDelete;
                                                this.b = 5;
                                                if (channel5.send(responseDelete, this) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                response4 = responseDelete;
                                                responseDelete = response4;
                                            }
                                            scheduleCallback4 = this.d.scheduleCallback;
                                            if (scheduleCallback4 == null) {
                                                scheduleCallback4.onDeleteResult(responseDelete);
                                            }
                                        } else {
                                            ScheduleCmd scheduleCmd6 = ScheduleCmd.RESULT_SYNC_DATA;
                                            byte b6 = scheduleCmd6.toByte();
                                            if (bFirstOrNull != null && bFirstOrNull.byteValue() == b6) {
                                                responseSync = this.d.c().sync(this.c);
                                                Channel channel6 = (Channel) this.d.cacheChannelBoolean.get(scheduleCmd6);
                                                if (channel6 != null) {
                                                    this.a = responseSync;
                                                    this.b = 6;
                                                    if (channel6.send(responseSync, this) == coroutine_suspended) {
                                                        return coroutine_suspended;
                                                    }
                                                    response5 = responseSync;
                                                    responseSync = response5;
                                                }
                                                scheduleCallback5 = this.d.scheduleCallback;
                                                if (scheduleCallback5 == null) {
                                                    scheduleCallback5.onSyncDataToDeviceResult(responseSync);
                                                }
                                            } else {
                                                byte b7 = ScheduleCmd.NOTIFY_DATA_CHANGED.toByte();
                                                if (bFirstOrNull != null && bFirstOrNull.byteValue() == b7) {
                                                    ScheduleStatus scheduleStatusE = this.d.e(this.c);
                                                    if (scheduleStatusE != null && (scheduleCallback = this.d.scheduleCallback) != null) {
                                                        scheduleCallback.onDeviceScheduleChange(scheduleStatusE);
                                                    }
                                                } else {
                                                    ScheduleCmd scheduleCmd7 = ScheduleCmd.RESULT_DELETE_BY_SOURCE;
                                                    byte b8 = scheduleCmd7.toByte();
                                                    if (bFirstOrNull != null && bFirstOrNull.byteValue() == b8) {
                                                        responseDelete2 = this.d.c().delete(this.c);
                                                        Channel channel7 = (Channel) this.d.cacheChannelBoolean.get(scheduleCmd7);
                                                        if (channel7 != null) {
                                                            this.a = responseDelete2;
                                                            this.b = 7;
                                                            if (channel7.send(responseDelete2, this) == coroutine_suspended) {
                                                                return coroutine_suspended;
                                                            }
                                                            response6 = responseDelete2;
                                                            responseDelete2 = response6;
                                                        }
                                                        scheduleCallback6 = this.d.scheduleCallback;
                                                        if (scheduleCallback6 == null) {
                                                            scheduleCallback6.onDeleteResult(responseDelete2);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    case 1:
                    case 2:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    case 3:
                        response2 = (Response) this.a;
                        ResultKt.throwOnFailure(obj);
                        response = response2;
                        scheduleCallback2 = this.d.scheduleCallback;
                        if (scheduleCallback2 == null) {
                            scheduleCallback2.onQueryDeviceDataResult(response);
                        }
                        return Unit.INSTANCE;
                    case 4:
                        response3 = (Response) this.a;
                        ResultKt.throwOnFailure(obj);
                        responseInsertOrUpdate = response3;
                        scheduleCallback3 = this.d.scheduleCallback;
                        if (scheduleCallback3 == null) {
                            scheduleCallback3.onAddOrUpdateResult(responseInsertOrUpdate);
                        }
                        return Unit.INSTANCE;
                    case 5:
                        response4 = (Response) this.a;
                        ResultKt.throwOnFailure(obj);
                        responseDelete = response4;
                        scheduleCallback4 = this.d.scheduleCallback;
                        if (scheduleCallback4 == null) {
                            scheduleCallback4.onDeleteResult(responseDelete);
                        }
                        return Unit.INSTANCE;
                    case 6:
                        response5 = (Response) this.a;
                        ResultKt.throwOnFailure(obj);
                        responseSync = response5;
                        scheduleCallback5 = this.d.scheduleCallback;
                        if (scheduleCallback5 == null) {
                            scheduleCallback5.onSyncDataToDeviceResult(responseSync);
                        }
                        return Unit.INSTANCE;
                    case 7:
                        response6 = (Response) this.a;
                        ResultKt.throwOnFailure(obj);
                        responseDelete2 = response6;
                        scheduleCallback6 = this.d.scheduleCallback;
                        if (scheduleCallback6 == null) {
                            scheduleCallback6.onDeleteResult(responseDelete2);
                        }
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } catch (Exception e) {
                this.d.onError(Intrinsics.stringPlus("解析出错 ", e.getStackTrace()), Boxing.boxInt(0));
                Debug.e("ScheduleApi", "error", e);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryData$2", f = "ScheduleImpl.kt", i = {}, l = {113, 122}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<List<? extends ScheduleModel>>>, Object> {
        public int a;
        public final /* synthetic */ List<Long> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryData$2$2", f = "ScheduleImpl.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<List<? extends ScheduleModel>>>, Object> {
            public int a;
            public final /* synthetic */ Channel<Response<List<ScheduleModel>>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<List<ScheduleModel>>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<List<? extends ScheduleModel>>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Response<List<ScheduleModel>>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<List<ScheduleModel>>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Response<List<ScheduleModel>>> channel = this.b;
                    this.a = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<Long> list, Continuation<? super g> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleImpl.this.new g(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<List<? extends ScheduleModel>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Response<List<ScheduleModel>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<List<ScheduleModel>>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x007f  */
        /* JADX WARN: Code duplicated, block: B:27:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Response response;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                response = (Response) obj;
                if (response == null) {
                    return Response.INSTANCE.timeout();
                }
                return response;
            }
            ResultKt.throwOnFailure(obj);
            ScheduleImpl scheduleImpl = ScheduleImpl.this;
            this.a = 1;
            if (scheduleImpl.requestCacheVersion(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            HashMap map = ScheduleImpl.this.cacheChannel;
            ScheduleCmd scheduleCmd = ScheduleCmd.RESULT_QUERY_DATA;
            Channel channelChannel$default = (Channel) map.get(scheduleCmd);
            if (channelChannel$default == null) {
                channelChannel$default = ChannelKt.Channel$default(0, 1, null);
                ScheduleImpl.this.cacheChannel.put(scheduleCmd, channelChannel$default);
            }
            byte[] cmd = new IdsRequest(ScheduleCmd.CMD_QUERY_DATA, this.c).toCmd();
            ScheduleImpl scheduleImpl2 = ScheduleImpl.this;
            BaseModule.sendData$default(scheduleImpl2.model, cmd, 0, 2, null);
            DataTransferCallback dataTransferCallback = scheduleImpl2.dataTransferCallback;
            if (dataTransferCallback != null) {
                dataTransferCallback.onSend(cmd);
            }
            a aVar = new a(channelChannel$default, null);
            this.a = 2;
            obj = TimeoutKt.withTimeoutOrNull(5000L, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            response = (Response) obj;
            if (response == null) {
                return Response.INSTANCE.timeout();
            }
            return response;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryDataChanged$2", f = "ScheduleImpl.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<List<? extends ScheduleStatus>>>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryDataChanged$2$2", f = "ScheduleImpl.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<List<? extends ScheduleStatus>>>, Object> {
            public int a;
            public final /* synthetic */ Channel<Response<List<ScheduleStatus>>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<List<ScheduleStatus>>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<List<? extends ScheduleStatus>>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super Response<List<ScheduleStatus>>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<List<ScheduleStatus>>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Response<List<ScheduleStatus>>> channel = this.b;
                    this.a = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleImpl.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<List<? extends ScheduleStatus>>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super Response<List<ScheduleStatus>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<List<ScheduleStatus>>> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = ScheduleImpl.this.cacheChannelDataChanged;
                ScheduleCmd scheduleCmd = ScheduleCmd.RESULT_QUERY_DATA_CHANGED;
                Channel channelChannel$default = (Channel) map.get(scheduleCmd);
                if (channelChannel$default == null) {
                    channelChannel$default = ChannelKt.Channel$default(0, 1, null);
                    ScheduleImpl.this.cacheChannelDataChanged.put(scheduleCmd, channelChannel$default);
                }
                byte[] byteArray = ScheduleCmd.CMD_QUERY_DATA_CHANGED.toByteArray();
                ScheduleImpl scheduleImpl = ScheduleImpl.this;
                BaseModule.sendData$default(scheduleImpl.model, byteArray, 0, 2, null);
                DataTransferCallback dataTransferCallback = scheduleImpl.dataTransferCallback;
                if (dataTransferCallback != null) {
                    dataTransferCallback.onSend(byteArray);
                }
                a aVar = new a(channelChannel$default, null);
                this.a = 1;
                obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            return response == null ? Response.INSTANCE.timeout() : response;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryProtocolVersion$2", f = "ScheduleImpl.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<ScheduleVersion>>, Object> {
        public int a;
        public final /* synthetic */ Boolean c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$queryProtocolVersion$2$1", f = "ScheduleImpl.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<ScheduleVersion>>, Object> {
            public int a;
            public final /* synthetic */ Channel<Response<ScheduleVersion>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<ScheduleVersion>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<ScheduleVersion>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Response<ScheduleVersion>> channel = this.b;
                    this.a = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Boolean bool, Continuation<? super i> continuation) {
            super(2, continuation);
            this.c = bool;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleImpl.this.new i(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<ScheduleVersion>> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = ScheduleImpl.this.cacheChannelVersion;
                ScheduleCmd scheduleCmd = ScheduleCmd.RESULT_QUERY_PROTOCOL_VERSION;
                Channel channelChannel$default = (Channel) map.get(scheduleCmd);
                if (channelChannel$default == null) {
                    channelChannel$default = ChannelKt.Channel$default(0, 1, null);
                    ScheduleImpl.this.cacheChannelVersion.put(scheduleCmd, channelChannel$default);
                }
                byte[] byteArray = ScheduleCmd.CMD_QUERY_PROTOCOL_VERSION.toByteArray();
                Boolean bool = this.c;
                if (bool != null) {
                    ArraysKt___ArraysJvmKt.plus(byteArray, !bool.booleanValue() ? (byte) 1 : (byte) 0);
                }
                BaseModule.sendData$default(ScheduleImpl.this.model, byteArray, 0, 2, null);
                DataTransferCallback dataTransferCallback = ScheduleImpl.this.dataTransferCallback;
                if (dataTransferCallback != null) {
                    dataTransferCallback.onSend(byteArray);
                }
                a aVar = new a(channelChannel$default, null);
                this.a = 1;
                obj = TimeoutKt.withTimeoutOrNull(3000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            return response == null ? Response.INSTANCE.timeout() : response;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/action/QueryResultAction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<QueryResultAction> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final QueryResultAction invoke() {
            return new QueryResultAction();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl", f = "ScheduleImpl.kt", i = {0}, l = {106}, m = "requestCacheVersion", n = {"this"}, s = {"L$0"})
    public static final class k extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public k(Continuation<? super k> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ScheduleImpl.this.requestCacheVersion(this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$syncDataToDevice$2", f = "ScheduleImpl.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
        public int a;
        public final /* synthetic */ List<ScheduleModel> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.schedule.action.ScheduleImpl$syncDataToDevice$2$2", f = "ScheduleImpl.kt", i = {}, l = {DataTypeSource.SPORT_TYPE_NO_GPS_SOCCER}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Response<Boolean>>, Object> {
            public int a;
            public final /* synthetic */ Channel<Response<Boolean>> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Channel<Response<Boolean>> channel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel<Response<Boolean>> channel = this.b;
                    this.a = 1;
                    obj = channel.receive(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(List<ScheduleModel> list, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ScheduleImpl.this.new l(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Response<Boolean>> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HashMap map = ScheduleImpl.this.cacheChannelBoolean;
                ScheduleCmd scheduleCmd = ScheduleCmd.RESULT_SYNC_DATA;
                Channel channelChannel$default = (Channel) map.get(scheduleCmd);
                if (channelChannel$default == null) {
                    channelChannel$default = ChannelKt.Channel$default(0, 1, null);
                    ScheduleImpl.this.cacheChannelBoolean.put(scheduleCmd, channelChannel$default);
                }
                byte[] cmd = new SyncRequest(this.c).toCmd();
                ScheduleImpl scheduleImpl = ScheduleImpl.this;
                BaseModule.sendData$default(scheduleImpl.model, cmd, 0, 2, null);
                DataTransferCallback dataTransferCallback = scheduleImpl.dataTransferCallback;
                if (dataTransferCallback != null) {
                    dataTransferCallback.onSend(cmd);
                }
                a aVar = new a(channelChannel$default, null);
                this.a = 1;
                obj = TimeoutKt.withTimeoutOrNull(5000L, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Response response = (Response) obj;
            return response == null ? Response.INSTANCE.timeout() : response;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/action/UpdateDeleteResultAction;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class m extends Lambda implements Function0<UpdateDeleteResultAction> {
        public static final m a = new m();

        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UpdateDeleteResultAction invoke() {
            return new UpdateDeleteResultAction();
        }
    }

    public ScheduleImpl(@NotNull ScheduleModule scheduleModule) {
        this.model = scheduleModule;
        scheduleModule.registerMessageCallback(new a(null));
        this.cacheChannel = new HashMap<>();
        this.cacheChannelVersion = new HashMap<>();
        this.cacheChannelDataChanged = new HashMap<>();
        this.cacheChannelBoolean = new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(byte[] data) {
        DataTransferCallback dataTransferCallback = this.dataTransferCallback;
        if (dataTransferCallback != null) {
            dataTransferCallback.onReceive(data);
        }
        kotlinx.coroutines.e.f(this.model, null, null, new f(data, this, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QueryResultAction b() {
        return (QueryResultAction) this.queryResultAction.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UpdateDeleteResultAction c() {
        return (UpdateDeleteResultAction) this.updateDeleteResultAction.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduleStatus e(byte[] data) {
        if (data.length == 7) {
            return new ScheduleStatus(GattUtils.bytesToLong(data, 2, 4), data[1], 0L, 4, null);
        }
        Debug.fi(MenstruationHelperKt.TAG, "parse device change schedule error");
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object addOrUpdate(@NotNull ScheduleModel scheduleModel, @NotNull Continuation<? super Response<Boolean>> continuation) {
        return BuildersKt.withContext(this.model.getCoroutineContext(), new b(scheduleModel, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object clearDataChangedStatus(@NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation) {
        return BuildersKt.withContext(this.model.getCoroutineContext(), new c(list, this, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object delete(long j2, @NotNull Continuation<? super Response<Boolean>> continuation) {
        return BuildersKt.withContext(this.model.getCoroutineContext(), new d(j2, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object deleteBySource(@NotNull List<Integer> list, @NotNull Continuation<? super Response<Boolean>> continuation) {
        return BuildersKt.withContext(this.model.getCoroutineContext(), new e(list, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public int moduleId() {
        return 7;
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public void onError(@Nullable String msg, @Nullable Integer errorCode) {
        ScheduleCallback scheduleCallback = this.scheduleCallback;
        if (scheduleCallback == null) {
            return;
        }
        scheduleCallback.onError(msg, errorCode);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object queryData(@NotNull List<Long> list, @NotNull Continuation<? super Response<List<ScheduleModel>>> continuation) {
        return BuildersKt.withContext(this.model.getCoroutineContext(), new g(list, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object queryDataChanged(@NotNull Continuation<? super Response<List<ScheduleStatus>>> continuation) {
        return BuildersKt.withContext(this.model.getCoroutineContext(), new h(null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object queryProtocolVersion(@Nullable Boolean bool, @NotNull Continuation<? super Response<ScheduleVersion>> continuation) {
        return BuildersKt.withContext(this.model.getCoroutineContext(), new i(bool, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public void register(@NotNull DataTransferCallback callback) {
        this.dataTransferCallback = callback;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object requestCacheVersion(@NotNull Continuation<? super ScheduleVersion> continuation) {
        k kVar;
        ScheduleImpl scheduleImpl;
        if (continuation instanceof k) {
            kVar = (k) continuation;
            int i2 = kVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kVar.d = i2 - Integer.MIN_VALUE;
            } else {
                kVar = new k(continuation);
            }
        } else {
            kVar = new k(continuation);
        }
        Object obj = kVar.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = kVar.d;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.mVersion == null) {
                kVar.a = this;
                kVar.d = 1;
                if (ScheduleApi.DefaultImpls.queryProtocolVersion$default(this, null, kVar, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            scheduleImpl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            scheduleImpl = (ScheduleImpl) kVar.a;
            ResultKt.throwOnFailure(obj);
        }
        return scheduleImpl.mVersion;
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object syncDataToDevice(@NotNull List<ScheduleModel> list, @NotNull Continuation<? super Response<Boolean>> continuation) {
        return BuildersKt.withContext(this.model.getCoroutineContext(), new l(list, null), continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public void register(@NotNull ScheduleCallback callback) {
        this.scheduleCallback = callback;
    }
}
