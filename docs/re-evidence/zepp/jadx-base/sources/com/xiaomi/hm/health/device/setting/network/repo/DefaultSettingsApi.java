package com.xiaomi.hm.health.device.setting.network.repo;

import com.google.gson.Gson;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.device.setting.network.bean.WatchSettings;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/network/repo/DefaultSettingsApi;", "", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Lcom/xiaomi/hm/health/device/setting/network/bean/WatchSettings;", "loadDefaultSettings", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "Ljava/lang/String;", DTransferConstants.URL, "b", "TAG", "", "c", "J", "TIMEOUT", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DefaultSettingsApi {

    @NotNull
    public static final DefaultSettingsApi INSTANCE = new DefaultSettingsApi();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String URL = "device/setting/huami.user.gt3.defaultsettings?deviceSource=";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "DefaultSettingsApi";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final long TIMEOUT = 3000;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.network.repo.DefaultSettingsApi", f = "DefaultSettingsApi.kt", i = {}, l = {31}, m = "loadDefaultSettings", n = {}, s = {})
    public static final class a extends ContinuationImpl {
        public /* synthetic */ Object a;
        public int c;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return DefaultSettingsApi.this.loadDefaultSettings(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ WatchSettings a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WatchSettings watchSettings) {
            super(0);
            this.a = watchSettings;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "watchSettings: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "onFailure: " + this.a;
        }
    }

    private DefaultSettingsApi() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object loadDefaultSettings(@NotNull HMDeviceSource hMDeviceSource, @NotNull Continuation<? super WatchSettings> continuation) {
        a aVar;
        Object objM3845constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objWithTimeoutOrNull = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
            DefaultSettingsApi$loadDefaultSettings$result$1 defaultSettingsApi$loadDefaultSettings$result$1 = new DefaultSettingsApi$loadDefaultSettings$result$1(HMServerDef.getHost() + URL + hMDeviceSource.getValue(), null);
            aVar.c = 1;
            objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(3000L, defaultSettingsApi$loadDefaultSettings$result$1, aVar);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithTimeoutOrNull);
        }
        String str = (String) objWithTimeoutOrNull;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl((WatchSettings) new Gson().fromJson(str, WatchSettings.class));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(TAG, null, null, new c(thM3848exceptionOrNullimpl), 6, null);
        }
        WatchSettings watchSettings = (WatchSettings) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
        HMLog.info(TAG, new b(watchSettings));
        return watchSettings;
    }
}
