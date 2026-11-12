package com.huami.bluetooth.profile.channel.module.auth;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule2;", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule;", "Lkotlinx/coroutines/CoroutineScope;", "", "apiLevel", "", "pubKey", "Lcom/huami/bluetooth/profile/channel/module/auth/StartAuthResponse;", "startCloudBiding", "Lcom/huami/bluetooth/profile/channel/module/auth/RequestAuthResponse;", "requestAuth", "cipher", "deAuthorize", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", DTransferConstants.SEARCH_KEY, "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "getModule", "()I", "module", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AuthModule2 extends AuthModule implements CoroutineScope {
    public static final int AUTH_MODULE_ID = 130;

    @NotNull
    private static final String r = "AuthModule2";
    private static final int s = 16;
    private static final int t = 48;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final ChannelApi channelController;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Empty response for de authorize";
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
            return "Empty response for random number request";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("Request random number error:", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return String.valueOf(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Start cloud binding with null response, maybe response timeout";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Start cloud bind response length error";
        }
    }

    public AuthModule2(@NotNull ChannelApi channelApi) {
        super(channelApi);
        this.channelController = channelApi;
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthModule
    public int deAuthorize(@NotNull byte[] cipher) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(new byte[]{7}, cipher), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                return AuthModuleKt.toUnSignInt(ArraysKt___ArraysKt.first(bArrSendCommand$default));
            }
        }
        HMLog.info(r, a.a);
        return 0;
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthModule, com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return 130;
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthModule
    @Nullable
    public RequestAuthResponse requestAuth(int apiLevel, @NotNull byte[] pubKey) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{4}, GattUtils.numberToBytes(apiLevel, 2)), new byte[]{2}), pubKey), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                try {
                    Result.Companion companion = Result.Companion;
                    BufByteDecoder bufByteDecoder = new BufByteDecoder(bArrSendCommand$default, 0, 2, null);
                    int i = bufByteDecoder.readByte();
                    if (i == 1) {
                        return new RequestAuthResponse(bufByteDecoder.readBytes(16), bufByteDecoder.readBytes(48));
                    }
                    HMLog.info(r, new c(i));
                    return null;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                    if (thM3848exceptionOrNullimpl != null) {
                        HMLog.info(r, new d(thM3848exceptionOrNullimpl));
                    }
                    return (RequestAuthResponse) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                }
            }
        }
        HMLog.info(r, b.a);
        return null;
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthModule
    @Nullable
    public StartAuthResponse startCloudBiding(int apiLevel, @NotNull byte[] pubKey) {
        byte[] bArrSendCommand$default = BaseModule.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{2}, GattUtils.numberToBytes(apiLevel, 2)), pubKey), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null) {
            if (!(bArrSendCommand$default.length == 0)) {
                try {
                    Result.Companion companion = Result.Companion;
                    BufByteDecoder bufByteDecoder = new BufByteDecoder(bArrSendCommand$default, 0, 2, null);
                    int i = bufByteDecoder.readByte();
                    if (i != 1) {
                        return new StartAuthResponse(i, null, null, null, 14, null);
                    }
                    if (bArrSendCommand$default.length == 65) {
                        return new StartAuthResponse(i, bufByteDecoder.readBytes(16), bufByteDecoder.readBytes(48), null, 8, null);
                    }
                    HMLog.info(r, f.a);
                    return null;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Object objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    return (StartAuthResponse) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                }
            }
        }
        HMLog.info(r, e.a);
        return null;
    }
}
