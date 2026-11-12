package com.xiaomi.hm.health.device.service;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceWrapper;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.device.setting.find.FindPhoneModel;
import com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b'\u0010(J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\u001d\u0010\u000b\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0010J7\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010&\u001a\u00020#8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)"}, d2 = {"Lcom/xiaomi/hm/health/device/service/FindPhoneDecorator;", "Lcom/xiaomi/hm/health/device/setting/life/feature/inject/FindPhoneApi;", "Lkotlinx/coroutines/CoroutineScope;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "bleDevice", "", "c", "onDeviceDisconnect", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isIncall", "startFindPhone", "(Landroid/content/Context;ZLcom/xiaomi/hm/health/bt/device/HMBaseDevice;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fromDevice", "device", "stopFindPhone", "enable", "enableRing", "(Landroid/content/Context;Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/device/service/FindPhoneWrapper;", "a", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/device/service/FindPhoneWrapper;", "findPhoneV1Api", "Lcom/xiaomi/hm/health/device/setting/find/FindPhoneModel;", "b", "()Lcom/xiaomi/hm/health/device/setting/find/FindPhoneModel;", "findPhoneV2Api", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class FindPhoneDecorator implements FindPhoneApi, CoroutineScope {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy findPhoneV1Api = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy findPhoneV2Api = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CompletableJob job = JobKt__JobKt.d(null, 1, null);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneDecorator", f = "FindPhoneDecorator.kt", i = {0, 0, 0, 0, 0}, l = {76, 77}, m = "enableRing", n = {"this", DbUtils.Const.Table.CONTEXT, "device", "enable", "isIncall"}, s = {"L$0", "L$1", "L$2", "Z$0", "Z$1"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public boolean d;
        public boolean e;
        public /* synthetic */ Object f;
        public int h;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return FindPhoneDecorator.this.enableRing(null, null, false, false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/service/FindPhoneWrapper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<FindPhoneWrapper> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FindPhoneWrapper getA() {
            return FindPhoneWrapper.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindPhoneModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<FindPhoneModel> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FindPhoneModel getA() {
            return new FindPhoneModel();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneDecorator$innerDeviceDisconnected$1", f = "FindPhoneDecorator.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindPhoneDecorator.this.new d(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindPhoneWrapper findPhoneWrapperA = FindPhoneDecorator.this.a();
                Context context = this.c;
                this.a = 1;
                if (findPhoneWrapperA.onDeviceDisconnect(context, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.service.FindPhoneDecorator$innerDeviceDisconnected$2", f = "FindPhoneDecorator.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindPhoneDecorator.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FindPhoneModel findPhoneModelB = FindPhoneDecorator.this.b();
                Context context = this.c;
                this.a = 1;
                if (findPhoneModelB.onDeviceDisconnect(context, this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public final FindPhoneWrapper a() {
        return (FindPhoneWrapper) this.findPhoneV1Api.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FindPhoneModel b() {
        return (FindPhoneModel) this.findPhoneV2Api.getValue();
    }

    private final int c(HMBaseDevice bleDevice) {
        if (bleDevice == null) {
            return 1;
        }
        return FindDeviceWrapper.INSTANCE.protocolVersion(bleDevice);
    }

    private final void d(Context context) {
        kotlinx.coroutines.e.f(this, null, null, new d(context, null), 3, null);
        kotlinx.coroutines.e.f(this, null, null, new e(context, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object enableRing(@Nullable Context context, @Nullable HMBaseDevice hMBaseDevice, boolean z, boolean z2, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        FindPhoneDecorator findPhoneDecorator;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.h = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar.h;
        if (i2 != 0) {
            if (i2 == 1) {
                z2 = aVar.e;
                z = aVar.d;
                hMBaseDevice = (HMBaseDevice) aVar.c;
                context = (Context) aVar.b;
                findPhoneDecorator = (FindPhoneDecorator) aVar.a;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        aVar.a = this;
        aVar.b = context;
        aVar.c = hMBaseDevice;
        aVar.d = z;
        aVar.e = z2;
        aVar.h = 1;
        if (FindPhoneApi.DefaultImpls.enableRing(this, context, hMBaseDevice, z, z2, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        findPhoneDecorator = this;
        Context context2 = context;
        HMBaseDevice hMBaseDevice2 = hMBaseDevice;
        boolean z3 = z;
        boolean z4 = z2;
        FindPhoneModel findPhoneModelB = findPhoneDecorator.b();
        aVar.a = null;
        aVar.b = null;
        aVar.c = null;
        aVar.h = 2;
        if (findPhoneModelB.enableRing(context2, hMBaseDevice2, z3, z4, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return Dispatchers.getIO().plus(this.job);
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object onDeviceDisconnect(@Nullable Context context, @NotNull Continuation<? super Unit> continuation) {
        d(context);
        return Unit.INSTANCE;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object startFindPhone(@NotNull Context context, boolean z, @Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Unit> continuation) {
        if (c(hMBaseDevice) < 2) {
            Object objStartFindPhone = a().startFindPhone(context, z, hMBaseDevice, continuation);
            return objStartFindPhone == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objStartFindPhone : Unit.INSTANCE;
        }
        Object objStartFindPhone2 = b().startFindPhone(context, z, hMBaseDevice, continuation);
        return objStartFindPhone2 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objStartFindPhone2 : Unit.INSTANCE;
    }

    @Override // com.xiaomi.hm.health.device.setting.life.feature.inject.FindPhoneApi
    @Nullable
    public Object stopFindPhone(@Nullable Context context, boolean z, @Nullable HMBaseDevice hMBaseDevice, @NotNull Continuation<? super Unit> continuation) {
        if (c(hMBaseDevice) < 2) {
            Object objStopFindPhone = a().stopFindPhone(context, z, hMBaseDevice, continuation);
            return objStopFindPhone == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objStopFindPhone : Unit.INSTANCE;
        }
        Object objStopFindPhone2 = b().stopFindPhone(context, z, hMBaseDevice, continuation);
        return objStopFindPhone2 == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objStopFindPhone2 : Unit.INSTANCE;
    }
}
