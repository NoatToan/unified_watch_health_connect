package com.huami.device.feature.health.user;

import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.settings.HrIntervalSetting;
import com.huami.device.feature.health.settings.HrModeSetting;
import com.huami.device.feature.health.settings.RemSetting;
import com.huami.device.feature.health.util.HealthExt;
import com.huami.device.feature.health.util.HealthExt$runCatchingAndElse$2$1;
import com.huami.tools.log.HMLog;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0002J\u001d\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fJ\u0006\u0010\u000f\u001a\u00020\fR\u0019\u0010\u0015\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u001a\u001a\u0004\u0018\u00010\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/device/feature/health/user/HealthConfig;", "", "", "isDeviceAlldayHrMeasure", "", "freq", "isDeviceOpenPaiWithCheckFreq", "isDeviceRemEnable", "openDeviceAlldayHrMessure", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "openDeviceRem", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "adjustConfig", "resetOnBind", "resetToDefault", "Lcom/huami/device/feature/health/user/HealthSettingConfig;", "a", "Lcom/huami/device/feature/health/user/HealthSettingConfig;", "getUserConfig", "()Lcom/huami/device/feature/health/user/HealthSettingConfig;", "userConfig", "Lcom/huami/device/feature/health/device/HealthDevice;", "b", "Lkotlin/Lazy;", "()Lcom/huami/device/feature/health/device/HealthDevice;", "mDevice", "<init>", "(Lcom/huami/device/feature/health/user/HealthSettingConfig;)V", "Companion", "health-base_release"}, k = 1, mv = {1, 5, 1})
public final class HealthConfig {

    @NotNull
    private static final String c = "HealthConfig";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final HealthSettingConfig userConfig;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDevice;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/huami/device/feature/health/device/HealthDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HealthDevice> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HealthDevice invoke() {
            return (HealthDevice) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(HealthDevice.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.user.HealthConfig", f = "HealthConfig.kt", i = {0, 0, 1, 1}, l = {145, 148}, m = "openDeviceAlldayHrMessure", n = {"tag$iv", "default$iv", "tag$iv", "default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return HealthConfig.this.openDeviceAlldayHrMessure(0, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.user.HealthConfig", f = "HealthConfig.kt", i = {0, 0, 1, 1}, l = {162, 165}, m = "openDeviceRem", n = {"tag$iv", "default$iv", "tag$iv", "default$iv"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public /* synthetic */ Object c;
        public int e;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return HealthConfig.this.openDeviceRem(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public HealthConfig(@NotNull HealthSettingConfig healthSettingConfig) {
        this.userConfig = healthSettingConfig;
        this.mDevice = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final HealthDevice a() {
        return (HealthDevice) this.mDevice.getValue();
    }

    public static /* synthetic */ boolean isDeviceOpenPaiWithCheckFreq$default(HealthConfig healthConfig, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 1;
        }
        return healthConfig.isDeviceOpenPaiWithCheckFreq(i);
    }

    public static /* synthetic */ Object openDeviceAlldayHrMessure$default(HealthConfig healthConfig, int i, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = healthConfig.getUserConfig().getFreq();
        }
        return healthConfig.openDeviceAlldayHrMessure(i, continuation);
    }

    public final void adjustConfig() {
        this.userConfig.adjustConfig();
        HealthConfigObserve.INSTANCE.getDefault().post(this.userConfig);
    }

    @NotNull
    public final HealthSettingConfig getUserConfig() {
        return this.userConfig;
    }

    public final boolean isDeviceAlldayHrMeasure() {
        HealthDevice healthDeviceA = a();
        if (healthDeviceA == null) {
            return false;
        }
        if (!healthDeviceA.isForceHrAndRemEnable()) {
            HealthExt healthExt = HealthExt.INSTANCE;
            if (healthExt.isHrDetectMode(healthDeviceA)) {
                int hrDetectType = getUserConfig().getHrDetectType();
                if (hrDetectType != 2 && hrDetectType != 3) {
                    if (hrDetectType != 4) {
                        return false;
                    }
                    return healthExt.isSupportAtrial(healthDeviceA);
                }
            } else if (!getUserConfig().getHrEnable() && (!healthExt.isSupportAtrial(healthDeviceA) || !getUserConfig().getAtrialFibEnable())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isDeviceOpenPaiWithCheckFreq(int freq) {
        HealthDevice healthDeviceA = a();
        if (healthDeviceA == null) {
            return false;
        }
        if (!healthDeviceA.isForceHrAndRemEnable()) {
            HealthExt healthExt = HealthExt.INSTANCE;
            if (healthExt.isHrDetectMode(healthDeviceA)) {
                int hrDetectType = getUserConfig().getHrDetectType();
                if (hrDetectType != 2) {
                    if (hrDetectType != 3) {
                        if (hrDetectType != 4) {
                            return false;
                        }
                        return healthExt.isSupportAtrial(healthDeviceA);
                    }
                    if (getUserConfig().getFreq() > 1) {
                        return false;
                    }
                } else if (getUserConfig().getFreq() > 1) {
                    return false;
                }
            } else if ((!getUserConfig().getHrEnable() || getUserConfig().getFreq() > 1) && (!healthExt.isSupportAtrial(healthDeviceA) || !getUserConfig().getAtrialFibEnable())) {
                return false;
            }
        }
        return true;
    }

    public final boolean isDeviceRemEnable() {
        HealthDevice healthDeviceA = a();
        if (healthDeviceA == null) {
            return false;
        }
        if (!healthDeviceA.isForceHrAndRemEnable()) {
            HealthExt healthExt = HealthExt.INSTANCE;
            if (healthExt.isHrDetectMode(healthDeviceA)) {
                int hrDetectType = getUserConfig().getHrDetectType();
                if (hrDetectType != 1 && hrDetectType != 3) {
                    if (hrDetectType != 4) {
                        return false;
                    }
                    return healthExt.isSupportAtrial(healthDeviceA);
                }
            } else if (!getUserConfig().getHrSleepEnable() && (!healthExt.isSupportAtrial(healthDeviceA) || !getUserConfig().getAtrialFibEnable())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00c1 A[PHI: r0 r9
      0x00c1: PHI (r0v13 java.lang.String) = (r0v8 java.lang.String), (r0v24 java.lang.String), (r0v25 java.lang.String) binds: [B:55:0x00cd, B:50:0x00be, B:64:0x00f0] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r9v17 java.lang.Boolean) = (r9v8 java.lang.Boolean), (r9v25 java.lang.Boolean), (r9v26 java.lang.Boolean) binds: [B:55:0x00cd, B:50:0x00be, B:64:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.device.feature.health.user.HealthConfig$b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r10v16, types: [com.huami.device.feature.health.settings.device.SetToDevice] */
    /* JADX WARN: Type inference failed for: r9v0, types: [int] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12, types: [com.huami.device.feature.health.settings.device.SetToDevice] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Nullable
    public final Object openDeviceAlldayHrMessure(int i, @NotNull Continuation<? super Boolean> continuation) {
        ?? bVar;
        Object objM3845constructorimpl;
        ?? r9;
        ?? r0;
        ?? setToDevice;
        String str;
        Boolean bool;
        String str2;
        Boolean bool2;
        ?? setToDevice2;
        String str3;
        Boolean bool3;
        if (continuation instanceof b) {
            b bVar2 = (b) continuation;
            int i2 = bVar2.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar2.e = i2 - Integer.MIN_VALUE;
                bVar = bVar2;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.e;
        int i4 = 2;
        boolean z = true;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                HealthExt healthExt = HealthExt.INSTANCE;
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                try {
                    Result.Companion companion = Result.Companion;
                    if (isDeviceAlldayHrMeasure() && getUserConfig().getFreq() == i) {
                        bVar = c;
                        i = boolBoxBoolean;
                    } else {
                        HealthDevice healthDeviceA = a();
                        if ((healthDeviceA == null || healthExt.isHrDetectMode(healthDeviceA)) ? false : true) {
                            HrIntervalSetting service = HealthFunc.HR_INTERVAL.INSTANCE.getService();
                            if (service != null && (setToDevice = service.getSetToDevice()) != 0) {
                                Integer numBoxInt = Boxing.boxInt(i);
                                bVar.a = c;
                                bVar.b = boolBoxBoolean;
                                bVar.e = 2;
                                obj = setToDevice.set(numBoxInt, bVar);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str = c;
                                bool = boolBoxBoolean;
                                str2 = str;
                                bool2 = bool;
                                bVar = str;
                                i = bool;
                                if (!((Boolean) obj).booleanValue()) {
                                }
                            }
                            z = false;
                            bVar = str2;
                            i = bool2;
                        } else {
                            if (getUserConfig().getHrDetectType() != 0) {
                                i4 = 3;
                            }
                            getUserConfig().setFreq(i);
                            HrModeSetting service2 = HealthFunc.HR_MODE.INSTANCE.getService();
                            if (service2 != null && (setToDevice2 = service2.getSetToDevice()) != 0) {
                                Integer numBoxInt2 = Boxing.boxInt(i4);
                                bVar.a = c;
                                bVar.b = boolBoxBoolean;
                                bVar.e = 1;
                                obj = setToDevice2.set(numBoxInt2, bVar);
                                if (obj == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                str3 = c;
                                bool3 = boolBoxBoolean;
                                str2 = str3;
                                bool2 = bool3;
                                bVar = str3;
                                i = bool3;
                                if (!((Boolean) obj).booleanValue()) {
                                    z = false;
                                    bVar = str2;
                                    i = bool2;
                                }
                            }
                        }
                        str2 = c;
                        bool2 = boolBoxBoolean;
                        z = false;
                        bVar = str2;
                        i = bool2;
                    }
                } catch (Throwable th) {
                    th = th;
                    bVar = c;
                    i = boolBoxBoolean;
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    r0 = bVar;
                    r9 = i;
                }
            } else if (i3 == 1) {
                Boolean bool4 = (Boolean) bVar.b;
                String str4 = (String) bVar.a;
                ResultKt.throwOnFailure(obj);
                str3 = str4;
                bool3 = bool4;
                str2 = str3;
                bool2 = bool3;
                bVar = str3;
                i = bool3;
                if (!((Boolean) obj).booleanValue()) {
                    z = false;
                    bVar = str2;
                    i = bool2;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Boolean bool5 = (Boolean) bVar.b;
                String str5 = (String) bVar.a;
                ResultKt.throwOnFailure(obj);
                str = str5;
                bool = bool5;
                str2 = str;
                bool2 = bool;
                bVar = str;
                i = bool;
                if (!((Boolean) obj).booleanValue()) {
                    z = false;
                    bVar = str2;
                    i = bool2;
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(z));
            r0 = bVar;
            r9 = i;
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl == null) {
            return objM3845constructorimpl;
        }
        HMLog.error(r0, "", thM3848exceptionOrNullimpl, new HealthExt$runCatchingAndElse$2$1(thM3848exceptionOrNullimpl));
        return r9;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[PHI: r0 r1
      0x0062: PHI (r0v13 java.lang.String) = (r0v10 java.lang.String), (r0v25 java.lang.String), (r0v26 java.lang.String) binds: [B:25:0x0060, B:49:0x00ae, B:63:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x0062: PHI (r1v11 java.lang.Object) = (r1v8 java.lang.Object), (r1v9 java.lang.Object), (r1v12 java.lang.Object) binds: [B:25:0x0060, B:49:0x00ae, B:63:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.device.feature.health.user.HealthConfig$c, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r3v5, types: [com.huami.device.feature.health.settings.device.SetToDevice] */
    /* JADX WARN: Type inference failed for: r9v17, types: [com.huami.device.feature.health.settings.device.SetToDevice] */
    @Nullable
    public final Object openDeviceRem(@NotNull Continuation<? super Boolean> continuation) {
        ?? cVar;
        Object objM3845constructorimpl;
        ?? r0;
        String str;
        String str2;
        String str3;
        if (continuation instanceof c) {
            c cVar2 = (c) continuation;
            int i = cVar2.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.e = i - Integer.MIN_VALUE;
                cVar = cVar2;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.c;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = cVar.e;
        boolean z = false;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                HealthExt healthExt = HealthExt.INSTANCE;
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                try {
                    Result.Companion companion = Result.Companion;
                    if (isDeviceRemEnable()) {
                        str3 = c;
                        coroutine_suspended = boolBoxBoolean;
                        z = true;
                        cVar = str3;
                    } else {
                        HealthDevice healthDeviceA = a();
                        if ((healthDeviceA == null || healthExt.isHrDetectMode(healthDeviceA)) ? false : true) {
                            RemSetting service = HealthFunc.REM.INSTANCE.getService();
                            if (service != null) {
                                ?? setToDevice = service.getSetToDevice();
                                if (setToDevice != 0) {
                                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(true);
                                    cVar.a = c;
                                    cVar.b = boolBoxBoolean;
                                    cVar.e = 2;
                                    obj = setToDevice.set(boolBoxBoolean2, cVar);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    str = c;
                                    coroutine_suspended = boolBoxBoolean;
                                    cVar = str;
                                    if (((Boolean) obj).booleanValue()) {
                                        str3 = str;
                                        z = true;
                                        cVar = str3;
                                    }
                                }
                            }
                        } else {
                            int i3 = getUserConfig().getHrDetectType() == 0 ? 1 : 3;
                            HrModeSetting service2 = HealthFunc.HR_MODE.INSTANCE.getService();
                            if (service2 != null) {
                                ?? setToDevice2 = service2.getSetToDevice();
                                if (setToDevice2 != 0) {
                                    Integer numBoxInt = Boxing.boxInt(i3);
                                    cVar.a = c;
                                    cVar.b = boolBoxBoolean;
                                    cVar.e = 1;
                                    obj = setToDevice2.set(numBoxInt, cVar);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    str2 = c;
                                    coroutine_suspended = boolBoxBoolean;
                                    str3 = str2;
                                    cVar = str2;
                                    if (((Boolean) obj).booleanValue()) {
                                        z = true;
                                        cVar = str3;
                                    }
                                }
                            }
                        }
                        cVar = c;
                        coroutine_suspended = boolBoxBoolean;
                    }
                } catch (Throwable th) {
                    th = th;
                    cVar = c;
                    coroutine_suspended = boolBoxBoolean;
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                    r0 = cVar;
                }
            } else if (i2 == 1) {
                coroutine_suspended = (Boolean) cVar.b;
                String str4 = (String) cVar.a;
                ResultKt.throwOnFailure(obj);
                str2 = str4;
                str3 = str2;
                cVar = str2;
                if (((Boolean) obj).booleanValue()) {
                    z = true;
                    cVar = str3;
                }
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                coroutine_suspended = (Boolean) cVar.b;
                String str5 = (String) cVar.a;
                ResultKt.throwOnFailure(obj);
                str = str5;
                cVar = str;
                if (((Boolean) obj).booleanValue()) {
                    str3 = str;
                    z = true;
                    cVar = str3;
                }
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(z));
            r0 = cVar;
        } catch (Throwable th2) {
            th = th2;
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl == null) {
            return objM3845constructorimpl;
        }
        HMLog.error(r0, "", thM3848exceptionOrNullimpl, new HealthExt$runCatchingAndElse$2$1(thM3848exceptionOrNullimpl));
        return coroutine_suspended;
    }

    public final void resetOnBind() {
        this.userConfig.resetOnBind();
        HealthConfigObserve.INSTANCE.getDefault().post(this.userConfig);
    }

    public final void resetToDefault() {
        this.userConfig.resetToDefault();
        HealthConfigObserve.INSTANCE.getDefault().post(this.userConfig);
    }

    public /* synthetic */ HealthConfig(HealthSettingConfig healthSettingConfig, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new HealthSettingConfig() { // from class: com.huami.device.feature.health.user.HealthConfig.1

            /* JADX INFO: renamed from: b, reason: from kotlin metadata */
            private int hrDetectType;

            /* JADX INFO: renamed from: c, reason: from kotlin metadata */
            private boolean hrEnable;

            /* JADX INFO: renamed from: e, reason: from kotlin metadata */
            private boolean atrialFibEnable;

            /* JADX INFO: renamed from: f, reason: from kotlin metadata */
            private boolean atrialSleepNotDisturb;

            /* JADX INFO: renamed from: g, reason: from kotlin metadata */
            private boolean warningEnable;

            /* JADX INFO: renamed from: i, reason: from kotlin metadata */
            private int highWarningValue;

            /* JADX INFO: renamed from: j, reason: from kotlin metadata */
            private int lowWarningValue;

            /* JADX INFO: renamed from: k, reason: from kotlin metadata */
            private boolean hrSleepEnable;

            /* JADX INFO: renamed from: l, reason: from kotlin metadata */
            private boolean sleepAssistEnable;

            /* JADX INFO: renamed from: m, reason: from kotlin metadata */
            private boolean sportHrCheckEnable;

            /* JADX INFO: renamed from: n, reason: from kotlin metadata */
            private boolean osaEnable;

            /* JADX INFO: renamed from: o, reason: from kotlin metadata */
            private boolean smartSpo2Enable;

            /* JADX INFO: renamed from: p, reason: from kotlin metadata */
            private int lowSpo2AlertValue;

            /* JADX INFO: renamed from: q, reason: from kotlin metadata */
            private boolean pressureEnable;

            /* JADX INFO: renamed from: r, reason: from kotlin metadata */
            private boolean pressureAlertEnable;

            /* JADX INFO: renamed from: s, reason: from kotlin metadata */
            private boolean needMigrationHRWay;

            /* JADX INFO: renamed from: d, reason: from kotlin metadata */
            private int freq = 1;

            /* JADX INFO: renamed from: h, reason: from kotlin metadata */
            private int warningValue = 100;

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void commitChange(boolean syncToServer) {
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public boolean getAtrialFibEnable() {
                return this.atrialFibEnable;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public boolean getAtrialSleepNotDisturb() {
                return this.atrialSleepNotDisturb;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public int getFreq() {
                return this.freq;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public int getHighWarningValue() {
                return this.highWarningValue;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public int getHrDetectType() {
                return this.hrDetectType;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public boolean getHrEnable() {
                return this.hrEnable;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public boolean getHrSleepEnable() {
                return this.hrSleepEnable;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public int getLowSpo2AlertValue() {
                return this.lowSpo2AlertValue;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public int getLowWarningValue() {
                return this.lowWarningValue;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            /* JADX INFO: renamed from: getNeedMigrationHRWay, reason: from getter */
            public boolean getCom.huami.device.feature.health.user.HrDetectSettingConfig.H java.lang.String() {
                return this.needMigrationHRWay;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public boolean getOsaEnable() {
                return this.osaEnable;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public boolean getPressureAlertEnable() {
                return this.pressureAlertEnable;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public boolean getPressureEnable() {
                return this.pressureEnable;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            /* JADX INFO: renamed from: getSleepAssistEnable, reason: from getter */
            public boolean getCom.huami.device.feature.health.user.HrDetectSettingConfig.G java.lang.String() {
                return this.sleepAssistEnable;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public boolean getSmartSpo2Enable() {
                return this.smartSpo2Enable;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public boolean getSportHrCheckEnable() {
                return this.sportHrCheckEnable;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            /* JADX INFO: renamed from: getWarningEnable, reason: from getter */
            public boolean getCom.huami.device.feature.health.user.HrDetectSettingConfig.E java.lang.String() {
                return this.warningEnable;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public int getWarningValue() {
                return this.warningValue;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void resetOnBind() {
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void resetToDefault() {
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setAtrialFibEnable(boolean z) {
                this.atrialFibEnable = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setAtrialSleepNotDisturb(boolean z) {
                this.atrialSleepNotDisturb = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setFreq(int i2) {
                this.freq = i2;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setHighWarningValue(int i2) {
                this.highWarningValue = i2;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setHrDetectType(int i2) {
                this.hrDetectType = i2;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setHrEnable(boolean z) {
                this.hrEnable = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setHrSleepEnable(boolean z) {
                this.hrSleepEnable = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setLowSpo2AlertValue(int i2) {
                this.lowSpo2AlertValue = i2;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setLowWarningValue(int i2) {
                this.lowWarningValue = i2;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setNeedMigrationHRWay(boolean z) {
                this.needMigrationHRWay = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setOsaEnable(boolean z) {
                this.osaEnable = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setPressureAlertEnable(boolean z) {
                this.pressureAlertEnable = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setPressureEnable(boolean z) {
                this.pressureEnable = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setSleepAssistEnable(boolean z) {
                this.sleepAssistEnable = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setSmartSpo2Enable(boolean z) {
                this.smartSpo2Enable = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setSportHrCheckEnable(boolean z) {
                this.sportHrCheckEnable = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setWarningEnable(boolean z) {
                this.warningEnable = z;
            }

            @Override // com.huami.device.feature.health.user.HealthSettingConfig
            public void setWarningValue(int i2) {
                this.warningValue = i2;
            }
        } : healthSettingConfig);
    }
}
