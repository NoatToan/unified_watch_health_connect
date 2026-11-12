package com.huami.ai.speech.xiaoai.capability;

import com.huami.ai.notify.EngineExceptionNotify;
import com.huami.ai.speech.xiaoai.auth.XiaoMiToken;
import com.huami.tools.log.HMLog;
import com.xiaomi.ai.android.capability.ErrorCapability;
import com.xiaomi.ai.api.StdStatuses;
import com.xiaomi.ai.error.AivsError;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010\u000b\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001d\u0010\u000f\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/ErrorCapabilityImpl;", "Lcom/xiaomi/ai/android/capability/ErrorCapability;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/ai/error/AivsError;", "aivsError", "", "onError", "Lcom/huami/ai/notify/EngineExceptionNotify;", "a", "Lkotlin/Lazy;", "()Lcom/huami/ai/notify/EngineExceptionNotify;", "engineExceptionNotify", "Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "b", "()Lcom/huami/ai/speech/xiaoai/auth/XiaoMiToken;", "xiaoMiToken", "<init>", "()V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class ErrorCapabilityImpl extends ErrorCapability implements KoinComponent {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy engineExceptionNotify;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy xiaoMiToken;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ AivsError a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AivsError aivsError) {
            super(0);
            this.a = aivsError;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "MI AI SDK Error! ErrorCode:" + this.a.getErrorCode() + ",ErrorMessage:" + ((Object) this.a.getErrorMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ErrorCapabilityImpl() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.engineExceptionNotify = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<EngineExceptionNotify>() { // from class: com.huami.ai.speech.xiaoai.capability.ErrorCapabilityImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.notify.EngineExceptionNotify, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final EngineExceptionNotify invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(EngineExceptionNotify.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.xiaoMiToken = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<XiaoMiToken>() { // from class: com.huami.ai.speech.xiaoai.capability.ErrorCapabilityImpl$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.ai.speech.xiaoai.auth.XiaoMiToken, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final XiaoMiToken invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(XiaoMiToken.class), objArr2, objArr3);
            }
        });
    }

    private final EngineExceptionNotify a() {
        return (EngineExceptionNotify) this.engineExceptionNotify.getValue();
    }

    private final XiaoMiToken b() {
        return (XiaoMiToken) this.xiaoMiToken.getValue();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.ai.android.capability.ErrorCapability
    public void onError(@NotNull AivsError aivsError) {
        HMLog.warn$default("speech", null, new a(aivsError), 2, null);
        int errorCode = aivsError.getErrorCode();
        if (errorCode == 401) {
            b().clearInValidToken();
            a().engineException(18);
            return;
        }
        if (errorCode == 500) {
            a().engineException(6);
            return;
        }
        if (errorCode != 40110024) {
            if (errorCode == 42910001) {
                a().engineException(7);
                return;
            }
            switch (errorCode) {
                case StdStatuses.CONNECT_FAILED /* 40010006 */:
                    a().engineException(2);
                    break;
                case StdStatuses.NETWORK_DISABLED /* 40010007 */:
                    a().engineException(3);
                    break;
                default:
                    switch (errorCode) {
                        case StdStatuses.INVALID_ACCESS_TOKEN /* 40110014 */:
                        case StdStatuses.ACCESS_TOKEN_EXPIRED /* 40110015 */:
                        case StdStatuses.INVALID_REFRESH_TOKEN /* 40110016 */:
                        case StdStatuses.REFRESH_TOKEN_EXPIRED /* 40110017 */:
                        case StdStatuses.TOKEN_EXPIRED /* 40110018 */:
                        case StdStatuses.INVALID_TOKEN /* 40110019 */:
                            break;
                        default:
                            switch (errorCode) {
                                case StdStatuses.ASR_TIME_OUT /* 50010004 */:
                                    a().engineException(5);
                                    break;
                                case StdStatuses.TTS_TIME_OUT /* 50010005 */:
                                    a().engineException(4);
                                    break;
                            }
                            break;
                    }
                case StdStatuses.CONNECTION_INTERRUPT /* 40010008 */:
                    a().engineException(1);
                    break;
            }
            return;
        }
        a().engineException(16);
    }
}
