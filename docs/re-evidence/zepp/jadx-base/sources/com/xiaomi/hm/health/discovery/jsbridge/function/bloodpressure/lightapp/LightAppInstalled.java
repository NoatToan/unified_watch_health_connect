package com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.lightapp;

import com.huami.flutter.appletcompanionplugin.HasJsAppInstalledCallback;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.device.health.blood_pressure.BloodPressureUtil;
import com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.IBloodPressureNotice;
import com.xiaomi.hm.health.lightappstore.LightAppStore;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.text.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/lightapp/LightAppInstalled;", "Lcom/xiaomi/hm/health/discovery/jsbridge/function/bloodpressure/IBloodPressureNotice;", "", "appId", "", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data", "handle", "type", "match", "<init>", "()V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class LightAppInstalled implements IBloodPressureNotice {

    @NotNull
    private static final String a = "LightAppInstalled";

    @NotNull
    private static final String b = "LIGHT_APP_ISINSTALLED";

    @NotNull
    private static final String c = "appId";

    @NotNull
    private static final String d = "{\"status\": \"success\",\"code\": \"2002001\",\"message\": \"app exist.\"}";

    @NotNull
    private static final String e = "{\"status\": \"success\",\"code\": \"2002002\",\"message\": \"app not exist.\"}";

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.lightapp.LightAppInstalled", f = "LightAppInstalled.kt", i = {}, l = {39}, m = "handle", n = {}, s = {})
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
            return LightAppInstalled.this.handle(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "e: " + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(String str, Continuation<? super Boolean> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        LightAppStore.hasJsAppInstalled(str, new HasJsAppInstalledCallback() { // from class: com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.lightapp.LightAppInstalled$hasJsAppInstalled$2$1
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.IBloodPressureNotice
    @Nullable
    public Object handle(@Nullable String str, @NotNull Continuation<? super String> continuation) {
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
        Object objA = aVar.a;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.c;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objA);
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(new JSONObject(str).getString("appId"));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.error$default(a, null, null, new b(thM3848exceptionOrNullimpl), 6, null);
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            String str2 = (String) objM3845constructorimpl;
            if (str2 == null || m.isBlank(str2)) {
                return e;
            }
            aVar.c = 1;
            objA = a(str2, aVar);
            if (objA == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objA);
        }
        if (((Boolean) objA).booleanValue()) {
            BloodPressureUtil.INSTANCE.setIS_DEVICE_INSTALL_JS_APP(true);
            return d;
        }
        BloodPressureUtil.INSTANCE.setIS_DEVICE_INSTALL_JS_APP(false);
        return e;
    }

    @Override // com.xiaomi.hm.health.discovery.jsbridge.function.bloodpressure.IBloodPressureNotice
    public boolean match(@NotNull String type) {
        return Intrinsics.areEqual(type, b);
    }
}
