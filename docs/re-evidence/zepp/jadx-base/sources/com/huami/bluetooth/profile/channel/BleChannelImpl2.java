package com.huami.bluetooth.profile.channel;

import com.huami.bluetooth.profile.channel.impl.ReplyParseV2Impl;
import com.huami.bluetooth.profile.channel.model.BleChannelLink;
import com.huami.bluetooth.profile.characteristic.DataCallback;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.d;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/BleChannelImpl2;", "Lcom/huami/bluetooth/profile/channel/BleChannelImpl;", "", "b", "c", "", HTTP.CONTENT_RANGE_BYTES, "Lcom/huami/bluetooth/profile/channel/ResponseRequire;", "responseRequire", "Lcom/huami/bluetooth/profile/channel/DataSendResponse;", "sendData", "([BLcom/huami/bluetooth/profile/channel/ResponseRequire;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;", "h", "Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;", "bleChannelLink", "Lkotlinx/coroutines/channels/Channel;", "i", "Lkotlinx/coroutines/channels/Channel;", "downLinkNotifyChannel", "Lcom/huami/bluetooth/profile/channel/impl/ReplyParseV2Impl;", z.j, "Lcom/huami/bluetooth/profile/channel/impl/ReplyParseV2Impl;", "replyParseApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/model/BleChannelLink;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class BleChannelImpl2 extends BleChannelImpl {

    @NotNull
    private static final String k = "BleChannelImpl2";
    private static final int l = 15000;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final BleChannelLink bleChannelLink;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final kotlinx.coroutines.channels.Channel<byte[]> downLinkNotifyChannel;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final ReplyParseV2Impl replyParseApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BleChannelImpl2", f = "BleChannelImpl2.kt", i = {0}, l = {64}, m = "sendData", n = {"startTime"}, s = {"J$0"})
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
            return BleChannelImpl2.this.sendData(null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BleChannelImpl2$sendData$response$1", f = "BleChannelImpl2.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super byte[]>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return BleChannelImpl2.this.new b(continuation);
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
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.channels.Channel channel = BleChannelImpl2.this.downLinkNotifyChannel;
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

    public BleChannelImpl2(@NotNull BleChannelLink bleChannelLink) {
        super(bleChannelLink);
        this.bleChannelLink = bleChannelLink;
        this.downLinkNotifyChannel = ChannelKt.Channel(1);
        this.replyParseApi = new ReplyParseV2Impl();
        b();
    }

    private final void b() {
        try {
            Debug.fi(k, Intrinsics.stringPlus("Register down link notify result: ", Boolean.valueOf(this.bleChannelLink.getGattPeripheral().registerNotification(getDownLinkCharacteristic(), new DataCallback() { // from class: com.huami.bluetooth.profile.channel.BleChannelImpl2$initNotify$ret$1

                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bluetooth.profile.channel.BleChannelImpl2$initNotify$ret$1$onReceived$1$1", f = "BleChannelImpl2.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
                public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int a;
                    public final /* synthetic */ BleChannelImpl2 b;
                    public final /* synthetic */ byte[] c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(BleChannelImpl2 bleChannelImpl2, byte[] bArr, Continuation<? super a> continuation) {
                        super(2, continuation);
                        this.b = bleChannelImpl2;
                        this.c = bArr;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new a(this.b, this.c, continuation);
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
                            kotlinx.coroutines.channels.Channel channel = this.b.downLinkNotifyChannel;
                            byte[] bArr = this.c;
                            this.a = 1;
                            if (channel.send(bArr, this) == coroutine_suspended) {
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

                @Override // com.huami.bluetooth.profile.characteristic.DataCallback
                public void onReceived(@NotNull byte[] data) {
                    Object objM3845constructorimpl;
                    BleChannelImpl2 bleChannelImpl2 = this.a;
                    try {
                        Result.Companion companion = Result.Companion;
                        Debug.fi("BleChannelImpl2", Intrinsics.stringPlus("reply ", ByteArrayKt.toHexString(data)));
                        d.b(null, new a(bleChannelImpl2, data, null), 1, null);
                        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    }
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        Debug.fi("BleChannelImpl2", Intrinsics.stringPlus("handle data failed:", thM3848exceptionOrNullimpl));
                    }
                }
            }))));
        } catch (Exception e) {
            Debug.fi(k, Intrinsics.stringPlus("Init exception:", e));
        }
    }

    private final void c() {
        this.bleChannelLink.getGattPeripheral().unregisterNotification(getDownLinkCharacteristic());
        b();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0076  */
    /* JADX WARN: Code duplicated, block: B:25:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0089 -> B:26:0x008c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // com.huami.bluetooth.profile.channel.BleChannelImpl, com.huami.bluetooth.profile.channel.Channel
    @org.jetbrains.annotations.Nullable
    public java.lang.Object sendData(@org.jetbrains.annotations.NotNull byte[] r17, @org.jetbrains.annotations.NotNull com.huami.bluetooth.profile.channel.ResponseRequire r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super com.huami.bluetooth.profile.channel.DataSendResponse> r19) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.bluetooth.profile.channel.BleChannelImpl2.sendData(byte[], com.huami.bluetooth.profile.channel.ResponseRequire, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
