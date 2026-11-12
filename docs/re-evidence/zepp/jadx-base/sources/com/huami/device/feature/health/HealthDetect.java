package com.huami.device.feature.health;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.device.HealthDevice;
import com.huami.device.feature.health.device.HealthFunc;
import com.huami.device.feature.health.device.HealthFuncKt;
import com.huami.device.feature.health.device.IDeviceAppApi;
import com.huami.device.feature.health.settings.BaseSetting;
import com.huami.device.feature.health.user.HealthConfig;
import com.huami.device.feature.health.user.HealthConfigObserve;
import com.huami.device.feature.health.user.HealthDetectConfig;
import com.huami.device.feature.health.user.HealthSettingConfig;
import com.huami.device.feature.health.user.HrDetectSettingConfig;
import com.huami.device.feature.health.util.HealthExt;
import com.huami.device.feature.health.util.HealthExt$toLiveData$1$onActive$2;
import com.huami.discovery.bridge.bracelet.BraceletHandler;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.context.GlobalContext;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b-\u0010.J\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fJ\u0006\u0010\u0010\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\bJ\b\u0010\u0014\u001a\u00020\bH\u0007J\b\u0010\u0015\u001a\u00020\bH\u0007J\u0006\u0010\u0016\u001a\u00020\bJ\u0012\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0007J\u000e\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0017J\u001b\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010 \u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/huami/device/feature/health/HealthDetect;", "", "Landroid/content/Context;", "mContext", "Lcom/huami/device/feature/health/device/HealthDevice;", "device", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "appApi", "", "initHealth", "Lio/reactivex/functions/Consumer;", "Lcom/huami/device/feature/health/user/HealthConfig;", "consumer", "Lio/reactivex/disposables/Disposable;", "observeHealthConfig", "Landroidx/lifecycle/LiveData;", "getHealthConfig", "Lcom/huami/device/feature/health/user/HealthSettingConfig;", "getUserConfig", "saveHealthConfigToServer", "onDeviceConnect", "onDeviceBound", BraceletHandler.H5_PARAM_BACK_KEY_RELOAD, "", "resetToDevice", "resetUserConfig", Configs.Params.RESET, "syncUserConfigToDeviceSync", "syncUserConfigToDevice", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncUserConfigFromDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "a", "Lcom/huami/device/feature/health/device/IDeviceAppApi;", "sAppApi", "", "b", "Ljava/lang/String;", "TAG", "<init>", "()V", "health-base_release"}, k = 1, mv = {1, 5, 1})
@SuppressLint({"StaticFieldLeak"})
public final class HealthDetect {

    @NotNull
    public static final HealthDetect INSTANCE = new HealthDetect();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static IDeviceAppApi sAppApi = null;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "HealthDetect";
    public static Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.HealthDetect$onDeviceBound$1", f = "HealthDetect.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Iterator it2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                it2 = HealthFuncKt.getAllFuncList().iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) this.a;
                ResultKt.throwOnFailure(obj);
            }
            while (it2.hasNext()) {
                BaseSetting service = ((HealthFunc) it2.next()).getService();
                if (service != null) {
                    this.a = it2;
                    this.b = 1;
                    if (service.onDeviceBound(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.HealthDetect$onDeviceConnect$1", f = "HealthDetect.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Iterator it2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                it2 = HealthFuncKt.getAllFuncList().iterator();
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it2 = (Iterator) this.a;
                ResultKt.throwOnFailure(obj);
            }
            while (it2.hasNext()) {
                BaseSetting service = ((HealthFunc) it2.next()).getService();
                if (service != null) {
                    this.a = it2;
                    this.b = 1;
                    if (service.onDeviceConnect(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.HealthDetect$resetUserConfig$1", f = "HealthDetect.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0031  */
        /* JADX WARN: Code duplicated, block: B:16:0x0048 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:17:0x0049  */
        /* JADX WARN: Code duplicated, block: B:22:0x003e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:9:0x002b->B:24:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:18:0x004e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.b
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r1 = r5.a
                java.util.Iterator r1 = (java.util.Iterator) r1
                kotlin.ResultKt.throwOnFailure(r6)
                r3 = r1
                r1 = r0
                r0 = r5
                goto L4e
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                kotlin.ResultKt.throwOnFailure(r6)
                java.util.List r6 = com.huami.device.feature.health.device.HealthFuncKt.getAllFuncList()
                java.util.Iterator r6 = r6.iterator()
                r1 = r6
                r6 = r5
            L2b:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L54
                java.lang.Object r3 = r1.next()
                com.huami.device.feature.health.device.HealthFunc r3 = (com.huami.device.feature.health.device.HealthFunc) r3
                com.huami.device.feature.health.settings.BaseSetting r3 = r3.getService()
                if (r3 != 0) goto L3e
                goto L2b
            L3e:
                r6.a = r1
                r6.b = r2
                java.lang.Object r3 = r3.syncUserConfigToDevice(r6)
                if (r3 != r0) goto L49
                return r0
            L49:
                r4 = r0
                r0 = r6
                r6 = r3
                r3 = r1
                r1 = r4
            L4e:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                r6 = r0
                r0 = r1
                r1 = r3
                goto L2b
            L54:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huami.device.feature.health.HealthDetect.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.HealthDetect", f = "HealthDetect.kt", i = {}, l = {128}, m = "syncUserConfigFromDevice", n = {}, s = {})
    public static final class d extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return HealthDetect.this.syncUserConfigFromDevice(this);
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
            return "syncUserConfigFromDevice";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ HealthFunc<?> a;
        public final /* synthetic */ BaseSetting<?> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(HealthFunc<?> healthFunc, BaseSetting<?> baseSetting) {
            super(0);
            this.a = healthFunc;
            this.b = baseSetting;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sync device config: " + this.a.getKey() + "(" + this.a.getDesc() + "), service: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.HealthDetect", f = "HealthDetect.kt", i = {}, l = {116}, m = "syncUserConfigToDevice", n = {}, s = {})
    public static final class g extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return HealthDetect.this.syncUserConfigToDevice(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "syncUserConfig reset: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ HealthFunc<?> a;
        public final /* synthetic */ BaseSetting<?> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(HealthFunc<?> healthFunc, BaseSetting<?> baseSetting) {
            super(0);
            this.a = healthFunc;
            this.b = baseSetting;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "sync health item: " + this.a.getKey() + "(" + this.a.getDesc() + "), service: " + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.device.feature.health.HealthDetect$syncUserConfigToDeviceSync$1", f = "HealthDetect.kt", i = {}, l = {101}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z, Continuation<? super j> continuation) {
            super(2, continuation);
            this.b = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthDetect healthDetect = HealthDetect.INSTANCE;
                boolean z = this.b;
                this.a = 1;
                if (healthDetect.syncUserConfigToDevice(z, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private HealthDetect() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Throwable th) {
    }

    public static /* synthetic */ void resetUserConfig$default(HealthDetect healthDetect, boolean z, int i2, Object obj) throws InterruptedException {
        if ((i2 & 1) != 0) {
            z = false;
        }
        healthDetect.resetUserConfig(z);
    }

    @NotNull
    public final Context getContext() {
        Context context2 = context;
        if (context2 != null) {
            return context2;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final HealthConfig getHealthConfig() {
        HealthSettingConfig healthDetectConfig;
        HealthConfig healthConfig;
        HealthSettingConfig healthSettingConfig = null;
        Object[] objArr = 0;
        HealthDevice healthDevice = (HealthDevice) GlobalContext.INSTANCE.get().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(HealthDevice.class), null, null);
        int i2 = 1;
        if (healthDevice == null) {
            healthConfig = null;
        } else {
            if ((healthDevice.isHealthDetect() || healthDevice.isHuamiOs()) ? false : true) {
                IDeviceAppApi iDeviceAppApi = sAppApi;
                if (iDeviceAppApi == null) {
                    iDeviceAppApi = null;
                }
                healthDetectConfig = new HrDetectSettingConfig(healthDevice, iDeviceAppApi);
            } else {
                IDeviceAppApi iDeviceAppApi2 = sAppApi;
                if (iDeviceAppApi2 == null) {
                    iDeviceAppApi2 = null;
                }
                healthDetectConfig = new HealthDetectConfig(healthDevice, iDeviceAppApi2);
            }
            healthConfig = new HealthConfig(healthDetectConfig);
        }
        return healthConfig == null ? new HealthConfig(healthSettingConfig, i2, objArr == true ? 1 : 0) : healthConfig;
    }

    @NotNull
    public final HealthSettingConfig getUserConfig() {
        return getHealthConfig().getUserConfig();
    }

    public final void initHealth(@NotNull Context mContext, @NotNull HealthDevice device, @NotNull IDeviceAppApi appApi) {
        setContext(mContext);
        sAppApi = appApi;
        HealthKoinModule.INSTANCE.initHealth(device);
        HealthConfigObserve.INSTANCE.getDefault().post(getHealthConfig().getUserConfig());
    }

    @NotNull
    public final Disposable observeHealthConfig(@NotNull Consumer<HealthConfig> consumer) {
        return HealthConfigObserve.INSTANCE.getDefault().toObservable().subscribe(consumer, new Consumer() { // from class: rv3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HealthDetect.b((Throwable) obj);
            }
        });
    }

    @Deprecated(message = "为了防止外部版本号不一致问题，废弃但保留该方法", replaceWith = @ReplaceWith(expression = "syncUserConfigFromDevice", imports = {}))
    public final void onDeviceBound() throws InterruptedException {
        kotlinx.coroutines.d.b(null, new a(null), 1, null);
    }

    @Deprecated(message = "为了防止外部版本号不一致问题，废弃但保留该方法", replaceWith = @ReplaceWith(expression = "syncUserConfigFromDevice", imports = {}))
    public final void onDeviceConnect() throws InterruptedException {
        kotlinx.coroutines.d.b(null, new b(null), 1, null);
    }

    public final void reload() {
        HealthConfigObserve.INSTANCE.getDefault().post(getUserConfig());
    }

    @Deprecated(message = "为了防止外部版本号不一致问题，废弃但保留该方法", replaceWith = @ReplaceWith(expression = "syncUserConfigToDevice", imports = {}))
    public final void resetUserConfig(boolean resetToDevice) throws InterruptedException {
        getUserConfig().resetToDefault();
        if (resetToDevice) {
            kotlinx.coroutines.d.b(null, new c(null), 1, null);
        }
    }

    public final void saveHealthConfigToServer() {
        getUserConfig().save(true);
    }

    public final void setContext(@NotNull Context context2) {
        context = context2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0071 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:? A[LOOP:0: B:15:0x0048->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006f -> B:23:0x0072). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object syncUserConfigFromDevice(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.huami.device.feature.health.HealthDetect.d
            if (r0 == 0) goto L13
            r0 = r8
            com.huami.device.feature.health.HealthDetect$d r0 = (com.huami.device.feature.health.HealthDetect.d) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.huami.device.feature.health.HealthDetect$d r0 = new com.huami.device.feature.health.HealthDetect$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.d
            java.lang.String r3 = "HealthDetect"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r2 = r0.a
            java.util.Iterator r2 = (java.util.Iterator) r2
            kotlin.ResultKt.throwOnFailure(r8)
            goto L72
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
            com.huami.device.feature.health.HealthDetect$e r8 = com.huami.device.feature.health.HealthDetect.e.a
            com.huami.tools.log.HMLog.info(r3, r8)
            java.util.List r8 = com.huami.device.feature.health.device.HealthFuncKt.getAllFuncList()
            java.util.Iterator r8 = r8.iterator()
            r2 = r8
        L48:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L75
            java.lang.Object r8 = r2.next()
            com.huami.device.feature.health.device.HealthFunc r8 = (com.huami.device.feature.health.device.HealthFunc) r8
            com.huami.device.feature.health.settings.BaseSetting r5 = r8.getService()
            com.huami.device.feature.health.HealthDetect$f r6 = new com.huami.device.feature.health.HealthDetect$f
            r6.<init>(r8, r5)
            com.huami.tools.log.HMLog.info(r3, r6)
            com.huami.device.feature.health.settings.BaseSetting r8 = r8.getService()
            if (r8 != 0) goto L67
            goto L48
        L67:
            r0.a = r2
            r0.d = r4
            java.lang.Object r8 = r8.syncUserConfigFromDevice(r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L48
        L75:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.device.feature.health.HealthDetect.syncUserConfigFromDevice(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[LOOP:0: B:18:0x0053->B:32:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x007a -> B:26:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object syncUserConfigToDevice(boolean r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.huami.device.feature.health.HealthDetect.g
            if (r0 == 0) goto L13
            r0 = r8
            com.huami.device.feature.health.HealthDetect$g r0 = (com.huami.device.feature.health.HealthDetect.g) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.huami.device.feature.health.HealthDetect$g r0 = new com.huami.device.feature.health.HealthDetect$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.d
            java.lang.String r3 = "HealthDetect"
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            java.lang.Object r7 = r0.a
            java.util.Iterator r7 = (java.util.Iterator) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L7d
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            kotlin.ResultKt.throwOnFailure(r8)
            com.huami.device.feature.health.HealthDetect$h r8 = new com.huami.device.feature.health.HealthDetect$h
            r8.<init>(r7)
            com.huami.tools.log.HMLog.info(r3, r8)
            if (r7 == 0) goto L4b
            com.huami.device.feature.health.user.HealthSettingConfig r7 = r6.getUserConfig()
            r7.resetToDefault()
        L4b:
            java.util.List r7 = com.huami.device.feature.health.device.HealthFuncKt.getAllFuncList()
            java.util.Iterator r7 = r7.iterator()
        L53:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L80
            java.lang.Object r8 = r7.next()
            com.huami.device.feature.health.device.HealthFunc r8 = (com.huami.device.feature.health.device.HealthFunc) r8
            com.huami.device.feature.health.settings.BaseSetting r2 = r8.getService()
            com.huami.device.feature.health.HealthDetect$i r5 = new com.huami.device.feature.health.HealthDetect$i
            r5.<init>(r8, r2)
            com.huami.tools.log.HMLog.info(r3, r5)
            com.huami.device.feature.health.settings.BaseSetting r8 = r8.getService()
            if (r8 != 0) goto L72
            goto L53
        L72:
            r0.a = r7
            r0.d = r4
            java.lang.Object r8 = r8.syncUserConfigToDevice(r0)
            if (r8 != r1) goto L7d
            return r1
        L7d:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            goto L53
        L80:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huami.device.feature.health.HealthDetect.syncUserConfigToDevice(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void syncUserConfigToDeviceSync(boolean reset) throws InterruptedException {
        kotlinx.coroutines.d.b(null, new j(reset, null), 1, null);
    }

    @NotNull
    public final LiveData<HealthConfig> observeHealthConfig() {
        HealthExt healthExt = HealthExt.INSTANCE;
        final Observable<HealthConfig> observable = HealthConfigObserve.INSTANCE.getDefault().toObservable();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        return new MutableLiveData<HealthConfig>() { // from class: com.huami.device.feature.health.HealthDetect$observeHealthConfig$$inlined$toLiveData$1
            /* JADX WARN: Type inference failed for: r1v3, types: [T, io.reactivex.disposables.Disposable] */
            @Override // androidx.p008lifecycle.LiveData
            public void onActive() {
                objectRef.element = observable.observeOn(Schedulers.io()).subscribeOn(Schedulers.io()).subscribe(new Consumer() { // from class: com.huami.device.feature.health.HealthDetect$observeHealthConfig$$inlined$toLiveData$1.1
                    @Override // io.reactivex.functions.Consumer
                    public final void accept(T t) {
                        postValue(t);
                    }
                }, HealthExt$toLiveData$1$onActive$2.INSTANCE);
            }

            @Override // androidx.p008lifecycle.LiveData
            public void onInactive() {
                Disposable disposable = (Disposable) objectRef.element;
                if (disposable == null) {
                    return;
                }
                if (!(!disposable.isDisposed())) {
                    disposable = null;
                }
                if (disposable == null) {
                    return;
                }
                disposable.dispose();
            }
        };
    }
}
