package com.huami.ai.speech.simplify.inject.impl.miai;

import com.huami.account.XiaomiTokenMananger;
import com.huami.ai.speech.xiaoai.auth.XiaoMiToken;
import com.huami.ai.uitls.DeviceUtilsKt;
import com.huami.bluetooth.profile.channel.module.voice.command.ErrorCommand;
import com.huami.passport.ErrorCode;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\u0012\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/huami/ai/speech/simplify/inject/impl/miai/XiaoMiTokenImpl;", "Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "", "a", "clearInValidToken", "", "getAuthCode", "", "needRefresh", "getToken", "Lkotlin/Function0;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "Lkotlin/jvm/functions/Function0;", "deviceFunc", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "Companion", "speech-simplify_release"}, k = 1, mv = {1, 5, 1})
public final class XiaoMiTokenImpl implements XiaoMiToken {

    @NotNull
    public static final String TOKEN_CLEAR_TAG = "MiTokenClear";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Function0<HMBaseDevice> deviceFunc;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "清理失效 token";
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
            return "获取 token 失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("发送授权失败的指令：", this.a);
        }
    }

    /* JADX INFO: renamed from: com.huami.ai.speech.simplify.inject.impl.miai.XiaoMiTokenImpl$getToken$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.ai.speech.simplify.inject.impl.miai.XiaoMiTokenImpl$getToken$1", f = "XiaoMiTokenImpl.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
        public boolean a;
        public Object b;
        public int c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ XiaoMiTokenImpl e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, XiaoMiTokenImpl xiaoMiTokenImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.d = z;
            this.e = xiaoMiTokenImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super String> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                boolean z = this.d;
                final XiaoMiTokenImpl xiaoMiTokenImpl = this.e;
                this.b = xiaoMiTokenImpl;
                this.a = z;
                this.c = 1;
                final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(this));
                XiaomiTokenMananger.getXiaomiAccessTokenForXiaoAi(new XiaomiTokenMananger.OnGetTokenCallback() { // from class: com.huami.ai.speech.simplify.inject.impl.miai.XiaoMiTokenImpl$getToken$1$1$1

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class a extends Lambda implements Function0<String> {
                        public static final a a = new a();

                        public a() {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            return "get token empty";
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
                            return "get token onError";
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class c extends Lambda implements Function0<String> {
                        public final /* synthetic */ String a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public c(String str) {
                            super(0);
                            this.a = str;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            String str = this.a;
                            return Intrinsics.stringPlus("get token old: size -> ", Integer.valueOf(str == null ? 0 : str.length()));
                        }
                    }

                    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                    public static final class d extends Lambda implements Function0<String> {
                        public final /* synthetic */ String a;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public d(String str) {
                            super(0);
                            this.a = str;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        @Nullable
                        public final String invoke() {
                            String str = this.a;
                            return Intrinsics.stringPlus("get token: size -> ", Integer.valueOf(str == null ? 0 : str.length()));
                        }
                    }

                    @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
                    public void empty() {
                        HMLog.info("speech", a.a);
                        xiaoMiTokenImpl.a();
                    }

                    @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
                    public void onError(@Nullable ErrorCode errorCode) {
                        HMLog.info("speech", b.a);
                        xiaoMiTokenImpl.a();
                    }

                    @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
                    public void onRefreshFaild(@Nullable String oldAccessToken) {
                        HMLog.info("speech", new c(oldAccessToken));
                        if (oldAccessToken == null) {
                            xiaoMiTokenImpl.a();
                            return;
                        }
                        Continuation<String> continuation = safeContinuation;
                        Result.Companion companion = Result.Companion;
                        continuation.resumeWith(Result.m3845constructorimpl(oldAccessToken));
                    }

                    @Override // com.huami.account.XiaomiTokenMananger.OnGetTokenCallback
                    public void onSuccess(@Nullable String newAccessToken) {
                        HMLog.info("speech", new d(newAccessToken));
                        if (newAccessToken == null) {
                            xiaoMiTokenImpl.a();
                            return;
                        }
                        Continuation<String> continuation = safeContinuation;
                        Result.Companion companion = Result.Companion;
                        continuation.resumeWith(Result.m3845constructorimpl(newAccessToken));
                    }
                }, z);
                obj = safeContinuation.getOrThrow();
                if (obj == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(this);
                }
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

    /* JADX WARN: Multi-variable type inference failed */
    public XiaoMiTokenImpl(@NotNull Function0<? extends HMBaseDevice> function0) {
        this.deviceFunc = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a() {
        HMLog.info(TOKEN_CLEAR_TAG, b.a);
        HMBaseDevice hMBaseDeviceInvoke = this.deviceFunc.invoke();
        HMLog.info("speech", new c(hMBaseDeviceInvoke != null ? Boolean.valueOf(DeviceUtilsKt.sendCommand$default(hMBaseDeviceInvoke, new ErrorCommand(6, "token need refresh"), null, 2, null)) : null));
        XiaomiTokenMananger.clearXiaomiToken();
        XiaomiTokenMananger.clearAllDeviceToken();
    }

    @Override // com.huami.ai.speech.xiaoai.auth.XiaoMiToken
    public void clearInValidToken() {
        HMLog.info(TOKEN_CLEAR_TAG, a.a);
        XiaomiTokenMananger.clearXiaomiToken();
        XiaomiTokenMananger.clearAllDeviceToken();
    }

    @Override // com.huami.ai.speech.xiaoai.auth.XiaoMiToken
    @NotNull
    public String getAuthCode() {
        return "";
    }

    @Override // com.huami.ai.speech.xiaoai.auth.XiaoMiToken
    @NotNull
    public String getToken(boolean needRefresh) {
        return (String) d.b(null, new AnonymousClass1(needRefresh, this, null), 1, null);
    }
}
