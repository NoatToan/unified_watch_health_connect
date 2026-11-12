package com.huami.bluetooth.profile.channel.module.display_list_setting;

import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.auth.AuthModuleKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.d;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 38)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J&\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0004J\u001c\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\u0016\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\u0004R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayListSettingModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", HTTP.CONTENT_RANGE_BYTES, "", "responseCode", "", "timeout", "c", "", PointCategory.INIT, "queryVersion", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayListVersion;", "queryVersionAndType", "type", "", "supportAppSort", "supportSecScreen", "supportCtlCenter", "", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayBean;", "displayItems", "updateList", "queryList", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayParser;", "g", "Lcom/huami/bluetooth/profile/channel/module/display_list_setting/DisplayParser;", "displayParser", "", "h", "Ljava/util/Map;", "commandToResponseCode", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class DisplayListSettingModule extends BaseModule {
    public static final int LIST_SETTING_MODULE_ID = 38;
    public static final int TYPE_APP_LIST = 1;
    public static final int TYPE_CTRL_CENTER = 3;
    public static final int TYPE_SEC_SCREEN = 2;
    private static final int i = 1;
    private static final int j = 2;
    private static final int k = 4;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 3;
    private static final int o = 4;
    private static final int p = 5;
    private static final int q = 6;
    private static final int r = 7;
    private static final int s = 1;
    private static final int t = 1;

    @NotNull
    private static final String u = "ListSettingModule";

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final DisplayParser displayParser;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<Integer, Integer> commandToResponseCode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {

        /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule$init$1$1", f = "DisplayListSettingModule.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0327a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ ChannelResponse b;
            public final /* synthetic */ DisplayListSettingModule c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0327a(ChannelResponse channelResponse, DisplayListSettingModule displayListSettingModule, Continuation<? super C0327a> continuation) {
                super(2, continuation);
                this.b = channelResponse;
                this.c = displayListSettingModule;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0327a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0327a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.b.getData().length == 0) {
                        Debug.fi(DisplayListSettingModule.u, "Response no payload");
                        return Unit.INSTANCE;
                    }
                    int unSignInt = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(this.b.getData()));
                    Integer numSecond = AuthModuleKt.second(this.b.getData());
                    if (unSignInt == 7 && numSecond != null) {
                        DisplaySettingNotifyHolder.INSTANCE.onNotify(numSecond.intValue());
                        return Unit.INSTANCE;
                    }
                    byte[] bArrSubArrayWithoutFirstElement = ByteArrayKt.subArrayWithoutFirstElement(this.b.getData());
                    Channel channel = (Channel) this.c.getMsgChannels().get(Boxing.boxInt(unSignInt));
                    if (channel != null) {
                        this.a = 1;
                        if (channel.send(bArrSubArrayWithoutFirstElement, this) == coroutine_suspended) {
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

        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) throws InterruptedException {
            d.b(null, new C0327a(channelResponse, DisplayListSettingModule.this, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) throws InterruptedException {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule$sendCommandIgnoreReply$1", f = "DisplayListSettingModule.kt", i = {}, l = {155, 156}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ byte[] d;
        public final /* synthetic */ long e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.bluetooth.profile.channel.module.display_list_setting.DisplayListSettingModule$sendCommandIgnoreReply$1$1", f = "DisplayListSettingModule.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
            public int a;
            public final /* synthetic */ DisplayListSettingModule b;
            public final /* synthetic */ int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DisplayListSettingModule displayListSettingModule, int i, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = displayListSettingModule;
                this.c = i;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Channel channel = (Channel) this.b.getMsgChannels().get(Boxing.boxInt(this.c));
                    if (channel == null) {
                        return null;
                    }
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
                return (byte[]) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i, byte[] bArr, long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = bArr;
            this.e = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return DisplayListSettingModule.this.new b(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super byte[]> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
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
                return (byte[]) obj;
            }
            ResultKt.throwOnFailure(obj);
            DisplayListSettingModule.this.getMsgChannels().put(Boxing.boxInt(this.c), ChannelKt.Channel(-1));
            DisplayListSettingModule displayListSettingModule = DisplayListSettingModule.this;
            byte[] bArr = this.d;
            this.a = 1;
            if (BaseModule.sendDataWithResult$default(displayListSettingModule, bArr, 0, false, this, 6, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            long j = this.e;
            a aVar = new a(DisplayListSettingModule.this, this.c, null);
            this.a = 2;
            obj = TimeoutKt.withTimeoutOrNull(j, aVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (byte[]) obj;
        }
    }

    public DisplayListSettingModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.displayParser = new DisplayParser();
        this.commandToResponseCode = r.mapOf(TuplesKt.to(1, 2), TuplesKt.to(5, 6), TuplesKt.to(3, 4));
    }

    private final byte[] c(byte[] bytes, int responseCode, long timeout) {
        return (byte[]) d.b(null, new b(responseCode, bytes, timeout, null), 1, null);
    }

    public static /* synthetic */ byte[] d(DisplayListSettingModule displayListSettingModule, byte[] bArr, int i2, long j2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArr));
        }
        if ((i3 & 4) != 0) {
            j2 = 15000;
        }
        return displayListSettingModule.c(bArr, i2, j2);
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new a(), 2, null);
    }

    @Nullable
    public final List<DisplayBean> queryList(int type) {
        byte[] bArr = {3, (byte) type};
        Integer num = this.commandToResponseCode.get(3);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrD = d(this, bArr, num.intValue(), 0L, 4, null);
        if (bArrD != null) {
            if (!(bArrD.length == 0)) {
                if (type == AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArrD))) {
                    return this.displayParser.parseBean(ByteArrayKt.subArrayWithoutFirstElement(bArrD));
                }
                Debug.fi(u, "type not match");
                return null;
            }
        }
        return null;
    }

    public final int queryVersion() {
        byte[] bArr = {1};
        Integer num = this.commandToResponseCode.get(1);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrD = d(this, bArr, num.intValue(), 0L, 4, null);
        if (bArrD != null) {
            if (!(bArrD.length == 0)) {
                return ArraysKt___ArraysKt.first(bArrD) & 255;
            }
        }
        Debug.fi(u, "Query version failed no response");
        return -1;
    }

    @NotNull
    public final DisplayListVersion queryVersionAndType() {
        int i2 = 0;
        byte[] bArr = {1};
        Integer num = this.commandToResponseCode.get(1);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrD = d(this, bArr, num.intValue(), 0L, 4, null);
        if (bArrD != null) {
            if (!(bArrD.length == 0)) {
                int iFirst = ArraysKt___ArraysKt.first(bArrD) & 255;
                if (iFirst > 1 && bArrD.length > 1) {
                    i2 = bArrD[1] & 255;
                }
                return new DisplayListVersion(iFirst, i2);
            }
        }
        Debug.fi(u, "Query version failed no response");
        return new DisplayListVersion(-1, 0);
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

    public final boolean updateList(int type, @NotNull List<DisplayBean> displayItems) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(5);
        byteArrayOutputStream.write(type);
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) displayItems.size()));
        Iterator<T> it2 = displayItems.iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(((DisplayBean) it2.next()).toBleBytes());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Integer num = this.commandToResponseCode.get(5);
        if (num == null) {
            throw new IllegalStateException("No response code".toString());
        }
        byte[] bArrD = d(this, byteArray, num.intValue(), 0L, 4, null);
        if (bArrD == null) {
            return false;
        }
        if (bArrD.length == 0) {
            return false;
        }
        if (ArraysKt___ArraysKt.first(bArrD) != ((byte) type)) {
            Debug.fi(u, "updateList type mismatch");
            return false;
        }
        Integer numSecond = AuthModuleKt.second(bArrD);
        Debug.fi(u, Intrinsics.stringPlus("set display list response code:", numSecond));
        return numSecond != null && numSecond.intValue() == 1;
    }
}
