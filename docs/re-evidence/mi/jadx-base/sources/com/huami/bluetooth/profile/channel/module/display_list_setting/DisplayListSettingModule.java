package com.huami.bluetooth.profile.channel.module.display_list_setting;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.ChannelResponse;
import defpackage.DisplayListVersion;
import defpackage.d4;
import defpackage.o8;
import defpackage.q8;
import defpackage.r0;
import defpackage.r3;
import defpackage.t5t;
import defpackage.tet;
import defpackage.y2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ&\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004J\u001c\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\u0004R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayListSettingModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "", "bytes", "", "responseCode", "", "timeout", "sendCommandIgnoreReply", "", "init", "queryVersion", "Ln8;", "queryVersionAndType", "type", "", "supportAppSort", "supportSecScreen", "supportCtlCenter", "", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", "displayItems", "updateList", "queryList", "", "commandToResponseCode", "Ljava/util/Map;", "Lr3;", "channelApi", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 38)
public final class DisplayListSettingModule extends a {
    private static final int CMD_QUERY_LIST = 3;
    private static final int CMD_REPLY_QUERY_LIST = 4;
    private static final int CMD_REPLY_UPDATE_LIST = 6;
    private static final int CMD_UPDATE_LIST = 5;
    private static final int CMD_VERSION_QUERY = 1;
    private static final int CMD_VERSION_RESPONSE_CODE = 2;
    private static final int CODE_SUCCESS = 1;
    private static final int ENABLE_FLAG = 1;
    public static final int LIST_SETTING_MODULE_ID = 38;
    private static final int NOTIFY_LIST_CHANGE = 7;
    private static final int RETURN_TYPE_CTRL_CENTER = 4;
    private static final int RETURN_TYPE_LIST = 1;
    private static final int RETURN_TYPE_SEC_SCREEN = 2;

    @NotNull
    private static final String TAG = "ListSettingModule";
    public static final int TYPE_APP_LIST = 1;
    public static final int TYPE_CTRL_CENTER = 3;
    public static final int TYPE_SEC_SCREEN = 2;

    @NotNull
    private final Map<Integer, Integer> commandToResponseCode;

    @NotNull
    private final o8 displayParser;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm4;", com.xiaomi.onetrack.api.b.I, "", PluginDeviceInfo.FMODEL, "(Lm4;)V"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function1<ChannelResponse, Unit> {

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule$init$1$1", f = "DisplayListSettingModule.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int t;
            public final /* synthetic */ ChannelResponse u;
            public final /* synthetic */ DisplayListSettingModule v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ChannelResponse channelResponse, DisplayListSettingModule displayListSettingModule, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = channelResponse;
                this.v = displayListSettingModule;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.u.getData().length == 0) {
                        t5t.d(DisplayListSettingModule.TAG, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    int iA = r0.a(ArraysKt___ArraysKt.first(this.u.getData()));
                    Integer numA = r0.a(this.u.getData());
                    if (iA == 7 && numA != null) {
                        q8.f31209a.a(numA.intValue());
                        return Unit.INSTANCE;
                    }
                    byte[] bArrA = y2.a(this.u.getData());
                    Channel channel = (Channel) this.v.getMsgChannels().get(Boxing.boxInt(iA));
                    if (channel != null) {
                        this.t = 1;
                        if (channel.send(bArrA, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
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

        public b() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse response) throws InterruptedException {
            Intrinsics.checkNotNullParameter(response, "response");
            BuildersKt__BuildersKt.runBlocking$default(null, new a(response, DisplayListSettingModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule$sendCommandIgnoreReply$1", f = "DisplayListSettingModule.kt", i = {}, l = {158, 159}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int t;
        public final /* synthetic */ int v;
        public final /* synthetic */ byte[] w;
        public final /* synthetic */ long x;

        @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule$sendCommandIgnoreReply$1$1", f = "DisplayListSettingModule.kt", i = {}, l = {159}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int t;
            public final /* synthetic */ DisplayListSettingModule u;
            public final /* synthetic */ int v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DisplayListSettingModule displayListSettingModule, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.u = displayListSettingModule;
                this.v = i;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.u, this.v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.t;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = (Channel) this.u.getMsgChannels().get(Boxing.boxInt(this.v));
                    if (channel == null) {
                        return null;
                    }
                    this.t = 1;
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
                return (byte[]) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, byte[] bArr, long j, Continuation<? super c> continuation) {
            super(2, continuation);
            this.v = i;
            this.w = bArr;
            this.x = j;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayListSettingModule.this.new c(this.v, this.w, this.x, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.t;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
            ResultKt.throwOnFailure(obj);
            DisplayListSettingModule.this.getMsgChannels().put(Boxing.boxInt(this.v), ChannelKt.Channel$default(-1, null, null, 6, null));
            DisplayListSettingModule displayListSettingModule = DisplayListSettingModule.this;
            byte[] bArr = this.w;
            this.t = 1;
            if (com.huami.bluetooth.profile.channel.module.a.sendDataWithResult$default(displayListSettingModule, bArr, 0, false, this, 6, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            long j = this.x;
            a aVar = new a(DisplayListSettingModule.this, this.v, null);
            this.t = 2;
            obj = TimeoutKt.withTimeoutOrNull(j, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayListSettingModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
        this.displayParser = new o8();
        this.commandToResponseCode = MapsKt__MapsKt.mapOf(TuplesKt.to(1, 2), TuplesKt.to(5, 6), TuplesKt.to(3, 4));
    }

    private final byte[] sendCommandIgnoreReply(byte[] bytes, int responseCode, long timeout) {
        return (byte[]) BuildersKt__BuildersKt.runBlocking$default(null, new c(responseCode, bytes, timeout, null), 1, null);
    }

    public static /* synthetic */ byte[] sendCommandIgnoreReply$default(DisplayListSettingModule displayListSettingModule, byte[] bArr, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = r0.a(ArraysKt___ArraysKt.first(bArr));
        }
        if ((i2 & 4) != 0) {
            j = 15000;
        }
        return displayListSettingModule.sendCommandIgnoreReply(bArr, i, j);
    }

    @Override // com.huami.bluetooth.profile.channel.module.a
    public void init() {
        a.registerCallback$default(this, getModule(), false, new b(), 2, null);
    }

    @Nullable
    public final List<DisplayBean> queryList(int type) {
        byte[] bArr = {3, (byte) type};
        Integer num = this.commandToResponseCode.get(3);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommandIgnoreReply$default = sendCommandIgnoreReply$default(this, bArr, num.intValue(), 0L, 4, null);
        if (bArrSendCommandIgnoreReply$default == null || bArrSendCommandIgnoreReply$default.length == 0) {
            return null;
        }
        if (type != r0.a(ArraysKt___ArraysKt.first(bArrSendCommandIgnoreReply$default))) {
            t5t.d(TAG, "type not match");
            return null;
        }
        o8 o8Var = this.displayParser;
        byte[] bArrA = y2.a(bArrSendCommandIgnoreReply$default);
        t5t.d(TAG, "queryList: " + tet.x(bArrA));
        return o8Var.a(bArrA);
    }

    public final int queryVersion() {
        byte[] bArr = {1};
        Integer num = this.commandToResponseCode.get(1);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommandIgnoreReply$default = sendCommandIgnoreReply$default(this, bArr, num.intValue(), 0L, 4, null);
        if (bArrSendCommandIgnoreReply$default != null && bArrSendCommandIgnoreReply$default.length != 0) {
            return ArraysKt___ArraysKt.first(bArrSendCommandIgnoreReply$default) & 255;
        }
        t5t.d(TAG, "Query version failed no response");
        return -1;
    }

    @NotNull
    public final DisplayListVersion queryVersionAndType() {
        int i = 0;
        byte[] bArr = {1};
        Integer num = this.commandToResponseCode.get(1);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommandIgnoreReply$default = sendCommandIgnoreReply$default(this, bArr, num.intValue(), 0L, 4, null);
        if (bArrSendCommandIgnoreReply$default == null || bArrSendCommandIgnoreReply$default.length == 0) {
            t5t.d(TAG, "Query version failed no response");
            return new DisplayListVersion(-1, 0);
        }
        int iFirst = ArraysKt___ArraysKt.first(bArrSendCommandIgnoreReply$default) & 255;
        if (iFirst > 1 && bArrSendCommandIgnoreReply$default.length > 1) {
            i = bArrSendCommandIgnoreReply$default[1] & 255;
        }
        return new DisplayListVersion(iFirst, i);
    }

    public final boolean supportAppSort(int type) {
        return (type & 1) == 1;
    }

    public final boolean supportCtlCenter(int type) {
        return (type & 4) == 4;
    }

    public final boolean supportSecScreen(int type) {
        return (type & 2) == 2;
    }

    public final boolean updateList(int type, @NotNull List<DisplayBean> displayItems) throws IOException {
        Intrinsics.checkNotNullParameter(displayItems, "displayItems");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(5);
        byteArrayOutputStream.write(type);
        byteArrayOutputStream.write(tet.s((short) displayItems.size()));
        Iterator<T> it = displayItems.iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(((DisplayBean) it.next()).toBleBytes());
        }
        t5t.d(TAG, "updateList: " + tet.x(byteArrayOutputStream.toByteArray()));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
        Integer num = this.commandToResponseCode.get(5);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrSendCommandIgnoreReply$default = sendCommandIgnoreReply$default(this, byteArray, num.intValue(), 0L, 4, null);
        if (bArrSendCommandIgnoreReply$default == null || bArrSendCommandIgnoreReply$default.length == 0) {
            return false;
        }
        if (ArraysKt___ArraysKt.first(bArrSendCommandIgnoreReply$default) != ((byte) type)) {
            t5t.d(TAG, "updateList type mismatch");
            return false;
        }
        Integer numA = r0.a(bArrSendCommandIgnoreReply$default);
        t5t.d(TAG, "set display list response code:" + numA);
        return numA != null && numA.intValue() == 1;
    }
}
