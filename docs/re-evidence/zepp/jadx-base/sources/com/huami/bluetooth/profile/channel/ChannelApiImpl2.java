package com.huami.bluetooth.profile.channel;

import androidx.core.app.NotificationCompat;
import com.amap.api.mapcore.util.hl;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.encrypt.EncryptApi;
import com.huami.bluetooth.profile.channel.encrypt.impl.EncryptApiImpl;
import com.huami.bluetooth.profile.channel.model.ChannelDataPacket;
import com.huami.bluetooth.profile.channel.model.ChannelRequest;
import com.huami.bluetooth.profile.channel.model.ChannelVersion;
import com.huami.bluetooth.profile.channel.model.FirstPacket;
import com.huami.bluetooth.profile.channel.module.BuiltInModule;
import com.huami.bluetooth.profile.channel.module.SupportModuleInfo;
import com.loc.z;
import com.xiaomi.hm.health.bt.debug.Debug;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 42\u00020\u0001:\u00014B\u001f\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00101\u001a\u00020\u0002¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J8\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J(\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0002H\u0016J\b\u0010\u0016\u001a\u00020\u0002H\u0016J0\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001b\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010(\u001a\u00020#8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelApiImpl2;", "Lcom/huami/bluetooth/profile/channel/BaseChannelApiImpl;", "", "moduleId", "", hl.k, "flag", "sessionId", "packetIndex", "totalSize", "module", "", "data", "Lcom/huami/bluetooth/profile/channel/model/ChannelDataPacket;", "createPacket", "byteArray", "parseDataPacket", SDKConstants.PARAM_SESSION_ID, "code", "index", "packetReply", "firstPacketSize", "subsequentHeadSize", "", "onPacketReceiveFinish", "Lcom/huami/bluetooth/profile/channel/model/ChannelRequest;", "request", NotificationCompat.CATEGORY_TRANSPORT, "(Lcom/huami/bluetooth/profile/channel/model/ChannelRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/encrypt/EncryptApi;", "l", "Lkotlin/Lazy;", z.j, "()Lcom/huami/bluetooth/profile/channel/encrypt/EncryptApi;", "encryptApi", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "m", "Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "getVersion", "()Lcom/huami/bluetooth/profile/channel/model/ChannelVersion;", "version", "Lkotlinx/coroutines/sync/Mutex;", GoogleApiAvailabilityLight.b, "Lkotlinx/coroutines/sync/Mutex;", "mutex", "Lcom/huami/bluetooth/profile/channel/Channel;", "channel", "Lcom/huami/bluetooth/profile/channel/ChannelCallbackHolder;", "channelCallbackHolder", "appId", "<init>", "(Lcom/huami/bluetooth/profile/channel/Channel;Lcom/huami/bluetooth/profile/channel/ChannelCallbackHolder;I)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ChannelApiImpl2 extends BaseChannelApiImpl {
    public static final int FIRST_PACKET_HEADER_SIZE = 11;
    public static final int REPLY_BYTE_LEN = 5;
    public static final int SUBSEQUENT_PACKET_HEADER_SIZE = 5;

    @NotNull
    private static final String o = "ChannelApi";

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy encryptApi;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final ChannelVersion version;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final Mutex mutex;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/encrypt/impl/EncryptApiImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<EncryptApiImpl> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EncryptApiImpl invoke() {
            return new EncryptApiImpl(ChannelApiImpl2.this.getAddress());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0010&\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/bluetooth/profile/channel/module/SupportModuleInfo;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<Map.Entry<? extends Integer, ? extends SupportModuleInfo>, CharSequence> {
        public static final b a = new b();

        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(@NotNull Map.Entry<Integer, SupportModuleInfo> entry) {
            return entry.getValue().toString();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.bluetooth.profile.channel.ChannelApiImpl2", f = "ChannelApiImpl2.kt", i = {0, 0, 1}, l = {145, 102}, m = NotificationCompat.CATEGORY_TRANSPORT, n = {"this", "request", "$receiver$iv"}, s = {"L$0", "L$1", "L$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return ChannelApiImpl2.this.transport(null, this);
        }
    }

    public ChannelApiImpl2(@NotNull Channel channel, @NotNull ChannelCallbackHolder channelCallbackHolder, int i) {
        super(channel, channelCallbackHolder, i);
        this.encryptApi = LazyKt__LazyJVMKt.lazy(new a());
        this.version = channel.version();
        this.mutex = MutexKt.Mutex$default(false, 1, null);
    }

    private final EncryptApi j() {
        return (EncryptApi) this.encryptApi.getValue();
    }

    private final boolean k(int moduleId) {
        SupportModuleInfo supportModuleInfo;
        Set<Map.Entry<Integer, SupportModuleInfo>> setEntrySet;
        if (!Intrinsics.areEqual(getVersion().getEncryptEnable(), Boolean.TRUE)) {
            return false;
        }
        Map<Integer, SupportModuleInfo> map = BuiltInModule.INSTANCE.getModuleListCached().get(getAddress());
        String strJoinToString$default = null;
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(setEntrySet, ", ", null, null, 0, null, b.a, 30, null);
        }
        Debug.fi(o, Intrinsics.stringPlus("Cached module list:", strJoinToString$default));
        if (map == null || map.isEmpty() || (supportModuleInfo = map.get(Integer.valueOf(moduleId))) == null) {
            return false;
        }
        return supportModuleInfo.getRequireEncryption();
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    @NotNull
    public ChannelDataPacket createPacket(int flag, int sessionId, int packetIndex, int totalSize, int module, @NotNull byte[] data) {
        return (flag & 1) > 0 ? new FirstPacket(flag, sessionId, packetIndex, totalSize, module, data, getAppId()) : new ChannelDataPacket(flag, sessionId, packetIndex, data, getAppId());
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    public int firstPacketSize() {
        return 11;
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl, com.huami.bluetooth.profile.channel.ChannelApi
    @NotNull
    public ChannelVersion getVersion() {
        return this.version;
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    public void onPacketReceiveFinish(int sessionID, int flag, int module, @NotNull byte[] data, int totalSize) throws InterruptedException {
        Object objM3845constructorimpl;
        if ((flag & 8) == 0) {
            super.onPacketReceiveFinish(sessionID, flag, module, data, totalSize);
            return;
        }
        try {
            Result.Companion companion = Result.Companion;
            deliverPacket(sessionID, module, ArraysKt___ArraysKt.sliceArray(j().decryptData(sessionID, totalSize, data), new IntRange(0, totalSize - 1)));
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(o, Intrinsics.stringPlus("Handle encrypt data failed:", thM3848exceptionOrNullimpl));
        }
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    @NotNull
    public byte[] packetReply(int module, int sessionID, int code, int index) {
        return new byte[]{(byte) module, (byte) getAppId(), (byte) sessionID, (byte) code, (byte) index};
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    @NotNull
    public ChannelDataPacket parseDataPacket(@NotNull byte[] byteArray) {
        try {
            Result.Companion companion = Result.Companion;
            int i = byteArray[2] & 255;
            if (i == getAppId()) {
                return ChannelDataPacket.INSTANCE.parseFromRawData(ChannelApiImpl2Kt.a(byteArray, 2));
            }
            Debug.fi(o, "Packet(" + i + ") not for this app(" + getAppId() + ')');
            return ChannelDataPacket.INSTANCE.getERROR_INSTANCE();
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
                objM3845constructorimpl = ChannelDataPacket.INSTANCE.getERROR_INSTANCE();
            }
            return (ChannelDataPacket) objM3845constructorimpl;
        }
    }

    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl
    public int subsequentHeadSize() {
        return 5;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // com.huami.bluetooth.profile.channel.BaseChannelApiImpl, com.huami.bluetooth.profile.channel.ChannelApi
    @Nullable
    public Object transport(@NotNull ChannelRequest channelRequest, @NotNull Continuation<? super Boolean> continuation) throws Throwable {
        c cVar;
        ChannelRequest channelRequest2;
        Mutex mutex;
        ChannelApiImpl2 channelApiImpl2;
        Object objM3845constructorimpl;
        Mutex mutex2;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i = cVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.f = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objTransport = cVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.f;
        try {
            try {
                if (i2 == 0) {
                    ResultKt.throwOnFailure(objTransport);
                    Mutex mutex3 = this.mutex;
                    cVar.a = this;
                    channelRequest2 = channelRequest;
                    cVar.b = channelRequest2;
                    cVar.c = mutex3;
                    cVar.f = 1;
                    if (mutex3.lock(null, cVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex = mutex3;
                    channelApiImpl2 = this;
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) cVar.a;
                        try {
                            ResultKt.throwOnFailure(objTransport);
                            Boolean boolBoxBoolean = Boxing.boxBoolean(((Boolean) objTransport).booleanValue());
                            mutex2.unlock(null);
                            return boolBoxBoolean;
                        } catch (Throwable th) {
                            th = th;
                            mutex2.unlock(null);
                            throw th;
                        }
                    }
                    Mutex mutex4 = (Mutex) cVar.c;
                    ChannelRequest channelRequest3 = (ChannelRequest) cVar.b;
                    channelApiImpl2 = (ChannelApiImpl2) cVar.a;
                    ResultKt.throwOnFailure(objTransport);
                    mutex = mutex4;
                    channelRequest2 = channelRequest3;
                }
                Result.Companion companion = Result.Companion;
                if (channelApiImpl2.k(channelRequest2.getModule())) {
                    byte[] bArrEncryptData = channelApiImpl2.j().encryptData(channelRequest2.getSessionId(), channelRequest2.getData());
                    channelApiImpl2.j().updateNOnce();
                    channelRequest2 = new ChannelRequest(channelRequest2.getModule(), bArrEncryptData, channelRequest2.getReplyFreq(), channelRequest2.getSessionId(), true, channelRequest2.getDataSize(), channelRequest2.getData(), false, 128, null);
                }
                objM3845constructorimpl = Result.m3845constructorimpl(channelRequest2);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                Debug.fi(o, Intrinsics.stringPlus("组装channel数据包发生异常:", thM3848exceptionOrNullimpl));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            ChannelRequest channelRequest4 = (ChannelRequest) objM3845constructorimpl;
            if (channelRequest4 == null) {
                Boolean boolBoxBoolean2 = Boxing.boxBoolean(false);
                mutex.unlock(null);
                return boolBoxBoolean2;
            }
            cVar.a = mutex;
            cVar.b = null;
            cVar.c = null;
            cVar.f = 2;
            objTransport = super.transport(channelRequest4, cVar);
            if (objTransport == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex2 = mutex;
            Boolean boolBoxBoolean3 = Boxing.boxBoolean(((Boolean) objTransport).booleanValue());
            mutex2.unlock(null);
            return boolBoxBoolean3;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
