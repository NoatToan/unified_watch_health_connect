package com.huami.bluetooth.profile.channel.module.auth;

import com.huami.bluetooth.profile.channel.module.a;
import com.mibi.sdk.common.CommonConstants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.smarthome.framework.plugin.rn.report.RnReportConst;
import defpackage.RequestAuthResponse;
import defpackage.StartAuthResponse;
import defpackage.le;
import defpackage.r0;
import defpackage.r3;
import defpackage.tet;
import defpackage.w2;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0005H\u0016R\u0014\u0010\u000f\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule2;", "Lcom/huami/bluetooth/profile/channel/module/auth/AuthModule;", "Lkotlinx/coroutines/CoroutineScope;", "", "apiLevel", "", CommonConstants.KEY_PUB_KEY, "Lut;", "startCloudBiding", "Llq;", "requestAuth", "cipher", "deAuthorize", "getModule", "()I", RnReportConst.ApiReport.PARAM_MODULE, "Lr3;", "channelController", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class AuthModule2 extends AuthModule {
    public static final int AUTH_MODULE_ID = 130;
    private static final int ECDH_PUB_KEY_LEN = 48;
    private static final int RANDOM_NUMBER_LENGTH = 16;

    @NotNull
    private static final String TAG = "AuthModule2";

    @NotNull
    private final r3 channelController;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b t = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Empty response for de authorize";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c t = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Empty response for random number request";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.t = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Request random number error:" + this.t;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Throwable th) {
            super(0);
            this.t = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return String.valueOf(this.t);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f t = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Start cloud binding with null response, maybe response timeout";
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", PluginDeviceInfo.FMODEL, "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g t = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return "Start cloud bind response length error";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthModule2(@NotNull r3 channelController) {
        super(channelController);
        Intrinsics.checkNotNullParameter(channelController, "channelController");
        this.channelController = channelController;
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthModule
    public int deAuthorize(@NotNull byte[] cipher) {
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(new byte[]{7}, cipher), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default != null && bArrSendCommand$default.length != 0) {
            return r0.a(ArraysKt___ArraysKt.first(bArrSendCommand$default));
        }
        le.c(TAG, b.t);
        return 0;
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthModule, com.huami.bluetooth.profile.channel.module.a
    public int getModule() {
        return 130;
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthModule
    @Nullable
    public RequestAuthResponse requestAuth(int apiLevel, @NotNull byte[] pubKey) {
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        byte[] bArrR = tet.r(apiLevel, 2);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(apiLevel.toLong(), 2)");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{4}, bArrR), new byte[]{2}), pubKey), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            le.c(TAG, c.t);
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            w2 w2Var = new w2(bArrSendCommand$default, 0, 2, null);
            int iC = w2Var.c();
            if (iC == 1) {
                return new RequestAuthResponse(w2Var.a(16), w2Var.a(48));
            }
            le.c(TAG, new d(iC));
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
            if (thM889exceptionOrNullimpl != null) {
                le.c(TAG, new e(thM889exceptionOrNullimpl));
            }
            return (RequestAuthResponse) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.auth.AuthModule
    @Nullable
    public StartAuthResponse startCloudBiding(int apiLevel, @NotNull byte[] pubKey) {
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        byte[] bArrR = tet.r(apiLevel, 2);
        Intrinsics.checkNotNullExpressionValue(bArrR, "numberToBytes(apiLevel.toLong(), 2)");
        byte[] bArrSendCommand$default = a.sendCommand$default(this, ArraysKt___ArraysJvmKt.plus(ArraysKt___ArraysJvmKt.plus(new byte[]{2}, bArrR), pubKey), 0, 0L, 6, (Object) null);
        if (bArrSendCommand$default == null || bArrSendCommand$default.length == 0) {
            le.c(TAG, f.t);
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            w2 w2Var = new w2(bArrSendCommand$default, 0, 2, null);
            int iC = w2Var.c();
            if (iC != 1) {
                return new StartAuthResponse(iC, null, null, null, 14, null);
            }
            if (bArrSendCommand$default.length == 65) {
                return new StartAuthResponse(iC, w2Var.a(16), w2Var.a(48), null, 8, null);
            }
            le.c(TAG, g.t);
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Object objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
            return (StartAuthResponse) (Result.m892isFailureimpl(objM886constructorimpl) ? null : objM886constructorimpl);
        }
    }
}
