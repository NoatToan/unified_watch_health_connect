package com.xiaomi.hm.health.devicex.inject;

import android.app.Activity;
import com.huami.flutter.appletcompanionplugin.AppletPluginService;
import com.huami.flutter.appletcompanionplugin.HasJsAppInstalledCallback;
import com.huami.healthlabel.koin.ScopesAndQualifersKt;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.setting.SoftFeature;
import com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi;
import com.xiaomi.hm.health.device.setting.viewmodel.SoftFeatureCacheImpl;
import com.xiaomi.hm.health.device.setting.viewmodel.SoftFeatureCacheKt;
import com.xiaomi.hm.health.lightappstore.LightAppStore;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
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
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0013\u0010\r\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0006H\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001b\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/devicex/inject/JsAppApiImpl;", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/JsAppApi;", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "baseDevice", "Lcom/xiaomi/hm/health/device/setting/SoftFeature;", "softFeature", "", "supportJsApp", "", "cache", "Landroid/app/Activity;", "activity", "onDevicePageClick", "hasJsAppNeedUpgrade", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDeveloperModeOpen", "onJsAppDeveloperModePageClick", "", "appId", "hasJsAppInstalled", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCacheImpl;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCacheImpl;", "softFeatureCache", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class JsAppApiImpl implements JsAppApi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy softFeatureCache = LazyKt__LazyJVMKt.lazy(b.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.devicex.inject.JsAppApiImpl$hasJsAppNeedUpgrade$2", f = "JsAppApiImpl.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ HMDeviceSource b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HMDeviceSource hMDeviceSource, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = hMDeviceSource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppletPluginService appletPluginService = (AppletPluginService) ScopesAndQualifersKt.getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AppletPluginService.class), null, null);
                String strValueOf = String.valueOf(this.b.getValue());
                this.a = 1;
                obj = appletPluginService.hasJsAppNeedUpgrade(strValueOf, this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/viewmodel/SoftFeatureCacheImpl;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<SoftFeatureCacheImpl> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SoftFeatureCacheImpl getA() {
            return new SoftFeatureCacheImpl();
        }
    }

    private final SoftFeatureCacheImpl a() {
        return (SoftFeatureCacheImpl) this.softFeatureCache.getValue();
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi
    public void cache(@NotNull HMBaseDevice baseDevice, @NotNull SoftFeature softFeature, boolean supportJsApp) {
        SoftFeatureCacheKt.cache(a(), baseDevice, softFeature, supportJsApp);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi
    @Nullable
    public Object hasJsAppInstalled(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        LightAppStore.hasJsAppInstalled(str, new HasJsAppInstalledCallback() { // from class: com.xiaomi.hm.health.devicex.inject.JsAppApiImpl$hasJsAppInstalled$2$1
            @Override // com.huami.flutter.appletcompanionplugin.HasJsAppInstalledCallback
            public void onInstalledResultCallback(boolean result) {
                if (booleanRef.element) {
                    Continuation<Boolean> continuation2 = safeContinuation;
                    Boolean boolValueOf = Boolean.valueOf(result);
                    Result.Companion companion = Result.Companion;
                    continuation2.resumeWith(Result.m3845constructorimpl(boolValueOf));
                    booleanRef.element = false;
                }
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi
    @Nullable
    public Object hasJsAppNeedUpgrade(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI), null), continuation);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi
    public boolean isDeveloperModeOpen() {
        return LightAppStore.INSTANCE.isDeveloperModeOpen();
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi
    public void onDevicePageClick(@NotNull Activity activity) {
        LightAppStore.jumpAppStoreMainPage(activity);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.JsAppApi
    public void onJsAppDeveloperModePageClick(@NotNull Activity activity) {
        LightAppStore.jumpJsAppDeveloperModePage(activity);
    }
}
