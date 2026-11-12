package com.huami.bluetooth.profile.channel.module.lumberjack.impl;

import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.base.BaseApiImpl;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.lumberjack.LaumberjackApi;
import com.huami.bluetooth.profile.channel.module.lumberjack.LogCallback;
import com.huami.bluetooth.profile.channel.module.lumberjack.LogStream;
import com.huami.bluetooth.profile.channel.module.lumberjack.Version;
import com.huami.bluetooth.profile.channel.module.lumberjack.impl.codec.LogStreamCodec;
import com.huami.bluetooth.profile.channel.module.lumberjack.impl.codec.VersionCodec;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.loc.z;
import com.tekartik.sqflite.Constant;
import com.xiaomi.ai.core.AivsConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00019B\u000f\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00132\u0006\u0010\u0019\u001a\u00020\u0010H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0013H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\u0010\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0004H\u0014J\u0018\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014R\u001c\u0010)\u001a\u00020\u00168\u0014@\u0014X\u0094D¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R)\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00040.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b0\u00101R)\u00104\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00040.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b3\u00101¨\u0006:"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/base/BaseApiImpl;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackCommand;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/LaumberjackApi;", "", "data", "", "m", hl.k, z.j, com.google.android.exoplayer2.text.ttml.b.r, "o", GoogleApiAvailabilityLight.b, "Lcom/huami/bluetooth/profile/channel/module/lumberjack/LogStream;", "logStream", "g", "", "code", "f", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/Version;", "queryVersion", "", "domain", "openStream", AivsConfig.Tts.AUDIO_TYPE_STREAM, "", "closeStream", "closeAll", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/LogCallback;", "callback", "registerLogCallback", "unregisterLogCallback", "rawData", "parseCommand", Constant.h, "handleCommand", GoogleApiAvailabilityLight.a, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "Ljava/util/concurrent/CopyOnWriteArrayList;", "e", "Ljava/util/concurrent/CopyOnWriteArrayList;", "logCallback", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lkotlin/Lazy;", "i", "()Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "versionCodec", "h", "logCodec", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/BaseModule;)V", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LaumberjackApiImpl extends BaseApiImpl<LaumberjackCommand> implements LaumberjackApi {

    @Deprecated
    public static final int ERROR_CODE_BYTES = 1;

    @Deprecated
    public static final int STREAM_ID_BYTES = 1;

    @NotNull
    private static final a h = new a(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final CopyOnWriteArrayList<LogCallback> logCallback;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy versionCodec;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy logCodec;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"com/huami/bluetooth/profile/channel/module/lumberjack/impl/LaumberjackApiImpl$a", "", "", "ERROR_CODE_BYTES", LogUtil.I, "STREAM_ID_BYTES", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/codec/LogStreamCodec;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LogStreamCodec> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LogStreamCodec invoke() {
            return new LogStreamCodec();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/codec/VersionCodec;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<VersionCodec> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final VersionCodec invoke() {
            return new VersionCodec();
        }
    }

    public LaumberjackApiImpl(@NotNull BaseModule baseModule) {
        super(baseModule);
        this.tag = "LaumberjackApiImpl";
        this.logCallback = new CopyOnWriteArrayList<>();
        this.versionCodec = LazyKt__LazyJVMKt.lazy(c.a);
        this.logCodec = LazyKt__LazyJVMKt.lazy(b.a);
    }

    private final void f(int code) {
        Iterator<LogCallback> it2 = this.logCallback.iterator();
        while (it2.hasNext()) {
            it2.next().onError(code);
        }
    }

    private final void g(LogStream logStream) {
        Iterator<LogCallback> it2 = this.logCallback.iterator();
        while (it2.hasNext()) {
            it2.next().onReceive(logStream);
        }
    }

    private final Codec<LogStream, byte[]> h() {
        return (Codec) this.logCodec.getValue();
    }

    private final Codec<Version, byte[]> i() {
        return (Codec) this.versionCodec.getValue();
    }

    private final void j(byte[] data) {
        int int$default = ByteUtilsKt.toInt$default(data, 1, 0, 2, null);
        if (int$default == 1) {
            dispatchResponse(LaumberjackCommand.CloseLogStream.INSTANCE, Boolean.TRUE);
        } else {
            BaseApiImpl.dispatchError$default(this, LaumberjackCommand.CloseLogStream.INSTANCE, int$default, null, 4, null);
        }
    }

    private final void k(byte[] data) {
        int int$default = ByteUtilsKt.toInt$default(data, 1, 0, 2, null);
        if (int$default == 1) {
            dispatchResponse(LaumberjackCommand.OpenLogStream.INSTANCE, Integer.valueOf(ByteUtilsKt.toInt(data, 1, 1)));
        } else {
            BaseApiImpl.dispatchError$default(this, LaumberjackCommand.OpenLogStream.INSTANCE, int$default, null, 4, null);
        }
    }

    private final void m(byte[] data) {
        dispatchResponse(LaumberjackCommand.QueryVersion.INSTANCE, i().decode(data));
    }

    private final void n(byte[] data) {
        if (data.length < 1) {
            throw new RuntimeException("No error Code!");
        }
        f(ByteUtilsKt.toInt$default(data, 1, 0, 2, null));
    }

    private final void o(byte[] data) {
        g(h().decode(data));
    }

    private final void p() {
        BaseApiImpl.sendRequestNoResponse$default(this, LaumberjackCommand.Pong.INSTANCE, null, 0L, 6, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.lumberjack.LaumberjackApi
    @NotNull
    public Response<Boolean> closeAll() {
        return BaseApiImpl.sendRequest$default(this, LaumberjackCommand.CloseLogStream.INSTANCE, new byte[]{1}, 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.lumberjack.LaumberjackApi
    @NotNull
    public Response<Boolean> closeStream(int stream) {
        return BaseApiImpl.sendRequest$default(this, LaumberjackCommand.CloseLogStream.INSTANCE, new byte[]{0, (byte) stream}, 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    @NotNull
    public String getTag() {
        return this.tag;
    }

    @Override // com.huami.bluetooth.profile.channel.module.lumberjack.LaumberjackApi
    @NotNull
    public Response<Integer> openStream(@NotNull String domain) {
        return BaseApiImpl.sendRequest$default(this, LaumberjackCommand.OpenLogStream.INSTANCE, ArraysKt___ArraysJvmKt.plus(domain.getBytes(Charsets.UTF_8), (byte) 0), 0L, 4, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.lumberjack.LaumberjackApi
    @NotNull
    public Response<Version> queryVersion() {
        return BaseApiImpl.sendRequest$default(this, LaumberjackCommand.QueryVersion.INSTANCE, null, 0L, 6, null);
    }

    @Override // com.huami.bluetooth.profile.channel.module.lumberjack.LaumberjackApi
    public void registerLogCallback(@NotNull LogCallback callback) {
        this.logCallback.addIfAbsent(callback);
    }

    @Override // com.huami.bluetooth.profile.channel.module.lumberjack.LaumberjackApi
    public void unregisterLogCallback(@NotNull LogCallback callback) {
        this.logCallback.remove(callback);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    public void handleCommand(@NotNull LaumberjackCommand cmd, @NotNull byte[] data) {
        if (Intrinsics.areEqual(cmd, LaumberjackCommand.VersionResult.INSTANCE)) {
            m(data);
            return;
        }
        if (Intrinsics.areEqual(cmd, LaumberjackCommand.OpenLogStreamResult.INSTANCE)) {
            k(data);
            return;
        }
        if (Intrinsics.areEqual(cmd, LaumberjackCommand.CloseLogStreamResult.INSTANCE)) {
            j(data);
            return;
        }
        if (Intrinsics.areEqual(cmd, LaumberjackCommand.LogStream.INSTANCE)) {
            o(data);
        } else if (Intrinsics.areEqual(cmd, LaumberjackCommand.Ping.INSTANCE)) {
            p();
        } else {
            if (!Intrinsics.areEqual(cmd, LaumberjackCommand.Exception.INSTANCE)) {
                throw new RuntimeException("Invalid device command！");
            }
            n(data);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.BaseApiImpl
    @NotNull
    public LaumberjackCommand parseCommand(@NotNull byte[] rawData) {
        return LaumberjackCommand.INSTANCE.toCommand(rawData);
    }
}
