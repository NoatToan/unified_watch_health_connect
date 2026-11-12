package com.xiaomi.hm.health.device.setting.find;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.find.DeviceFindStatus;
import com.huami.bluetooth.profile.channel.module.find.FindDeviceModule;
import com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi;
import com.huami.bluetooth.profile.channel.module.find.IFindDeviceCallback;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseBleDevice;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t*\u0001/\u0018\u0000 52\u00020\u0001:\u0002\u00046B\u0007¢\u0006\u0004\b3\u00104J\u001b\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bJ\u0010\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0012\u001a\u00020\u000bR\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0014R\u001c\u0010\u001a\u001a\u00020\u00168\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR$\u0010&\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindDeviceModel;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/device/setting/find/PageType;", "needShowType", "a", "(Lcom/xiaomi/hm/health/device/setting/find/PageType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/channel/module/find/DeviceFindStatus;", "status", "b", "Lcom/xiaomi/hm/health/bt/device/HMBaseBleDevice;", "device", "", "attachToDevice", "detachFromDevice", "startFindDevice", "", "sendStopCmd", "stopFindDevice", "resetStatus", "Lkotlinx/coroutines/CompletableJob;", "Lkotlinx/coroutines/CompletableJob;", "job", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceBleCmdApi;", "c", "Lcom/huami/bluetooth/profile/channel/module/find/IFindDeviceBleCmdApi;", "cmdApi", "Lcom/xiaomi/hm/health/device/setting/find/IFindDevicePage;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/device/setting/find/IFindDevicePage;", "getPage", "()Lcom/xiaomi/hm/health/device/setting/find/IFindDevicePage;", "setPage", "(Lcom/xiaomi/hm/health/device/setting/find/IFindDevicePage;)V", DTransferConstants.PAGE, "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceModel$PageStatus;", "e", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceModel$PageStatus;", "pageStatus", "Lkotlinx/coroutines/Job;", "f", "Lkotlinx/coroutines/Job;", "findDeviceJob", "com/xiaomi/hm/health/device/setting/find/FindDeviceModel$findDeviceCallback$1", "g", "Lcom/xiaomi/hm/health/device/setting/find/FindDeviceModel$findDeviceCallback$1;", "findDeviceCallback", "<init>", "()V", "h", "PageStatus", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class FindDeviceModel implements CoroutineScope {

    @NotNull
    private static final a h = new a(null);

    @Deprecated
    private static final long i = 60000;

    @Deprecated
    @NotNull
    private static final String j = "FindDeviceModel";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CompletableJob job;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final CoroutineContext coroutineContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private IFindDeviceBleCmdApi cmdApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private IFindDevicePage page;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private PageStatus pageStatus;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Job findDeviceJob;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final FindDeviceModel$findDeviceCallback$1 findDeviceCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DeviceFindStatus.values().length];
            iArr[DeviceFindStatus.ConnectHeadset.ordinal()] = 1;
            iArr[DeviceFindStatus.Alert.ordinal()] = 2;
            iArr[DeviceFindStatus.Shake.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"com/xiaomi/hm/health/device/setting/find/FindDeviceModel$a", "", "", "MINUTE", "J", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HMBaseBleDevice a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HMBaseBleDevice hMBaseBleDevice) {
            super(0);
            this.a = hMBaseBleDevice;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "attach to device, source: " + this.a.getDeviceSource();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "detached!!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.find.FindDeviceModel", f = "FindDeviceModel.kt", i = {0, 0, 0, 1}, l = {98, 119}, m = "handleShowType", n = {"this", "needShowType", "userChoiceAwait", "this"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class d extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return FindDeviceModel.this.a(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ PageType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(PageType pageType) {
            super(0);
            this.a = pageType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "handleShowType: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ Boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Boolean bool) {
            super(0);
            this.a = bool;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "enable ring result: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ PageType a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(PageType pageType) {
            super(0);
            this.a = pageType;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "user choice: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/xiaomi/hm/health/device/setting/find/PageType;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.find.FindDeviceModel$handleShowType$userChoice$1", f = "FindDeviceModel.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PageType>, Object> {
        public int a;
        public final /* synthetic */ CompletableDeferred<PageType> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(CompletableDeferred<PageType> completableDeferred, Continuation<? super h> continuation) {
            super(2, continuation);
            this.b = completableDeferred;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super PageType> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CompletableDeferred<PageType> completableDeferred = this.b;
                this.a = 1;
                obj = completableDeferred.await(this);
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public static final i a = new i();

        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startFindDevice return as finding";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.find.FindDeviceModel$startFindDevice$2", f = "FindDeviceModel.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ DeviceFindStatus a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceFindStatus deviceFindStatus) {
                super(0);
                this.a = deviceFindStatus;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "find device status: " + this.a;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Boolean bool) {
                super(0);
                this.a = bool;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "stop result: " + this.a;
            }
        }

        public j(Continuation<? super j> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindDeviceModel.this.new j(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0044  */
        /* JADX WARN: Code duplicated, block: B:21:0x004e A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x004c -> B:22:0x004f). Please report as a decompilation issue!!! */
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
                int r1 = r5.a
                java.lang.String r2 = "FindDeviceModel"
                r3 = 1
                if (r1 == 0) goto L1a
                if (r1 != r3) goto L12
                kotlin.ResultKt.throwOnFailure(r6)
                r1 = r5
                goto L4f
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                kotlin.ResultKt.throwOnFailure(r6)
                com.xiaomi.hm.health.device.setting.find.FindDeviceModel r6 = com.xiaomi.hm.health.device.setting.find.FindDeviceModel.this
                com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi r6 = com.xiaomi.hm.health.device.setting.find.FindDeviceModel.access$getCmdApi$p(r6)
                if (r6 != 0) goto L28
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L28:
                com.huami.bluetooth.profile.channel.module.find.DeviceFindStatus r6 = r6.findDeviceWithStatus()
                com.xiaomi.hm.health.device.setting.find.FindDeviceModel$j$a r1 = new com.xiaomi.hm.health.device.setting.find.FindDeviceModel$j$a
                r1.<init>(r6)
                com.huami.tools.log.HMLog.info(r2, r1)
                if (r6 != 0) goto L39
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            L39:
                com.xiaomi.hm.health.device.setting.find.FindDeviceModel r1 = com.xiaomi.hm.health.device.setting.find.FindDeviceModel.this
                com.xiaomi.hm.health.device.setting.find.PageType r6 = com.xiaomi.hm.health.device.setting.find.FindDeviceModel.access$needShowPageType(r1, r6)
                r1 = r5
            L40:
                com.xiaomi.hm.health.device.setting.find.PageType r4 = com.xiaomi.hm.health.device.setting.find.PageType.None
                if (r6 == r4) goto L52
                com.xiaomi.hm.health.device.setting.find.FindDeviceModel r4 = com.xiaomi.hm.health.device.setting.find.FindDeviceModel.this
                r1.a = r3
                java.lang.Object r6 = com.xiaomi.hm.health.device.setting.find.FindDeviceModel.access$handleShowType(r4, r6, r1)
                if (r6 != r0) goto L4f
                return r0
            L4f:
                com.xiaomi.hm.health.device.setting.find.PageType r6 = (com.xiaomi.hm.health.device.setting.find.PageType) r6
                goto L40
            L52:
                com.xiaomi.hm.health.device.setting.find.FindDeviceModel r6 = com.xiaomi.hm.health.device.setting.find.FindDeviceModel.this
                com.huami.bluetooth.profile.channel.module.find.IFindDeviceBleCmdApi r6 = com.xiaomi.hm.health.device.setting.find.FindDeviceModel.access$getCmdApi$p(r6)
                if (r6 != 0) goto L5c
                r6 = 0
                goto L64
            L5c:
                boolean r6 = r6.stopFindDevice()
                java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            L64:
                com.xiaomi.hm.health.device.setting.find.FindDeviceModel$j$b r0 = new com.xiaomi.hm.health.device.setting.find.FindDeviceModel$j$b
                r0.<init>(r6)
                com.huami.tools.log.HMLog.info(r2, r0)
                com.xiaomi.hm.health.device.setting.find.FindDeviceModel r6 = com.xiaomi.hm.health.device.setting.find.FindDeviceModel.this
                com.xiaomi.hm.health.device.setting.find.FindDeviceModel$PageStatus r6 = com.xiaomi.hm.health.device.setting.find.FindDeviceModel.access$getPageStatus$p(r6)
                r6.resetStatus()
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.device.setting.find.FindDeviceModel.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "stop find device, send stop cmd: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.find.FindDeviceModel$stopFindDevice$2", f = "FindDeviceModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Boolean a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Boolean bool) {
                super(0);
                this.a = bool;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "stop result: " + this.a;
            }
        }

        public l(Continuation<? super l> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FindDeviceModel.this.new l(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IFindDeviceBleCmdApi iFindDeviceBleCmdApi = FindDeviceModel.this.cmdApi;
            HMLog.info(FindDeviceModel.j, new a(iFindDeviceBleCmdApi == null ? null : Boxing.boxBoolean(iFindDeviceBleCmdApi.stopFindDevice())));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.find.FindDeviceModel$resetStatus$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.find.FindDeviceModel$resetStatus$1", f = "FindDeviceModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ PageType b;
        public final /* synthetic */ FindDeviceModel c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.find.FindDeviceModel$resetStatus$1$WhenMappings */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PageType.values().length];
                iArr[PageType.ShowAlert.ordinal()] = 1;
                iArr[PageType.ShowShake.ordinal()] = 2;
                iArr[PageType.ShowUserChoice.ordinal()] = 3;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PageType pageType, FindDeviceModel findDeviceModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.b = pageType;
            this.c = findDeviceModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new AnonymousClass1(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IFindDevicePage page;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()];
            if (i == 1) {
                IFindDevicePage page2 = this.c.getPage();
                if (page2 != null) {
                    page2.dismissDeviceAlertDialog();
                }
            } else if (i == 2) {
                IFindDevicePage page3 = this.c.getPage();
                if (page3 != null) {
                    page3.dismissDeviceShakeDialog();
                }
            } else if (i == 3 && (page = this.c.getPage()) != null) {
                page.dismissDeviceConHeadsetDialog();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.xiaomi.hm.health.device.setting.find.FindDeviceModel$findDeviceCallback$1] */
    public FindDeviceModel() {
        CompletableJob completableJobD = JobKt__JobKt.d(null, 1, null);
        this.job = completableJobD;
        this.coroutineContext = completableJobD;
        this.pageStatus = new PageStatus(PageType.None, null, false, 4, null);
        this.findDeviceCallback = new IFindDeviceCallback() { // from class: com.xiaomi.hm.health.device.setting.find.FindDeviceModel$findDeviceCallback$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "job already canceled";
                }
            }

            @Override // com.huami.bluetooth.profile.channel.module.find.IFindDeviceCallback
            public void onFindDeviceStart() {
            }

            @Override // com.huami.bluetooth.profile.channel.module.find.IFindDeviceCallback
            public void onFindDeviceStop() {
                Job job = this.a.findDeviceJob;
                if (!(job != null && job.isCancelled())) {
                    Job job2 = this.a.findDeviceJob;
                    if (!(job2 != null && job2.isCompleted())) {
                        this.a.stopFindDevice(false);
                        return;
                    }
                }
                HMLog.info("FindDeviceModel", a.a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:25:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(PageType pageType, Continuation<? super PageType> continuation) {
        d dVar;
        CompletableDeferred completableDeferredCompletableDeferred$default;
        PageType pageType2;
        FindDeviceModel findDeviceModel;
        PageType pageType3;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i2 = dVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.f = i2 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objWithTimeoutOrNull = dVar.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = dVar.f;
        if (i3 != 0) {
            if (i3 == 1) {
                CompletableDeferred completableDeferred = (CompletableDeferred) dVar.c;
                PageType pageType4 = (PageType) dVar.b;
                FindDeviceModel findDeviceModel2 = (FindDeviceModel) dVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
                completableDeferredCompletableDeferred$default = completableDeferred;
                pageType2 = pageType4;
                findDeviceModel = findDeviceModel2;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                findDeviceModel = (FindDeviceModel) dVar.a;
                ResultKt.throwOnFailure(objWithTimeoutOrNull);
            }
            pageType3 = (PageType) objWithTimeoutOrNull;
            if (pageType3 == PageType.ShowAlert) {
                IFindDeviceBleCmdApi iFindDeviceBleCmdApi = findDeviceModel.cmdApi;
                HMLog.info(j, new f(iFindDeviceBleCmdApi != null ? Boxing.boxBoolean(iFindDeviceBleCmdApi.enableRing(true)) : null));
            }
            HMLog.info(j, new g(pageType3));
            if (pageType3 == null) {
                return PageType.None;
            }
            return pageType3;
        }
        ResultKt.throwOnFailure(objWithTimeoutOrNull);
        HMLog.info(j, new e(pageType));
        completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        FindDeviceModel$handleShowType$3 findDeviceModel$handleShowType$3 = new FindDeviceModel$handleShowType$3(pageType, this, completableDeferredCompletableDeferred$default, null);
        dVar.a = this;
        dVar.b = pageType;
        dVar.c = completableDeferredCompletableDeferred$default;
        dVar.f = 1;
        if (BuildersKt.withContext(main, findDeviceModel$handleShowType$3, dVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        pageType2 = pageType;
        findDeviceModel = this;
        findDeviceModel.pageStatus = new PageStatus(pageType2, completableDeferredCompletableDeferred$default, false, 4, null);
        h hVar = new h(completableDeferredCompletableDeferred$default, null);
        dVar.a = findDeviceModel;
        dVar.b = null;
        dVar.c = null;
        dVar.f = 2;
        objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(60000L, hVar, dVar);
        if (objWithTimeoutOrNull == coroutine_suspended) {
            return coroutine_suspended;
        }
        pageType3 = (PageType) objWithTimeoutOrNull;
        if (pageType3 == PageType.ShowAlert) {
            IFindDeviceBleCmdApi iFindDeviceBleCmdApi2 = findDeviceModel.cmdApi;
            HMLog.info(j, new f(iFindDeviceBleCmdApi2 != null ? Boxing.boxBoolean(iFindDeviceBleCmdApi2.enableRing(true)) : null));
        }
        HMLog.info(j, new g(pageType3));
        if (pageType3 == null) {
            return PageType.None;
        }
        return pageType3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PageType b(DeviceFindStatus status) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i2 == 1) {
            return PageType.ShowUserChoice;
        }
        if (i2 != 2) {
            return i2 != 3 ? PageType.None : PageType.ShowShake;
        }
        return PageType.ShowAlert;
    }

    public static /* synthetic */ boolean stopFindDevice$default(FindDeviceModel findDeviceModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        return findDeviceModel.stopFindDevice(z);
    }

    public final void attachToDevice(@NotNull HMBaseBleDevice device) {
        FindDeviceModule findDeviceModule = (FindDeviceModule) device.getChannelModule(FindDeviceModule.class);
        IFindDeviceBleCmdApi findDeviceApi = findDeviceModule == null ? null : findDeviceModule.getFindDeviceApi();
        this.cmdApi = findDeviceApi;
        if (findDeviceApi != null) {
            findDeviceApi.registerFindDeviceCallback(this.findDeviceCallback);
        }
        HMLog.info(j, new b(device));
    }

    public final void detachFromDevice() {
        HMLog.info(j, c.a);
        CompletableDeferred<PageType> awaitAction = this.pageStatus.getAwaitAction();
        if (awaitAction != null) {
            awaitAction.complete(PageType.None);
        }
        this.pageStatus.resetStatus();
        IFindDeviceBleCmdApi iFindDeviceBleCmdApi = this.cmdApi;
        if (iFindDeviceBleCmdApi != null) {
            iFindDeviceBleCmdApi.unregisterFindDeviceCallback(this.findDeviceCallback);
        }
        this.cmdApi = null;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Nullable
    public final IFindDevicePage getPage() {
        return this.page;
    }

    public final void resetStatus() {
        CompletableDeferred<PageType> awaitAction = this.pageStatus.getAwaitAction();
        if (awaitAction != null) {
            awaitAction.complete(PageType.None);
        }
        kotlinx.coroutines.e.f(this, null, null, new AnonymousClass1(this.pageStatus.getType(), this, null), 3, null);
        this.pageStatus.resetStatus();
    }

    public final void setPage(@Nullable IFindDevicePage iFindDevicePage) {
        this.page = iFindDevicePage;
    }

    public final void startFindDevice() {
        if (this.pageStatus.getType() != PageType.None) {
            HMLog.info(j, i.a);
        } else {
            this.findDeviceJob = kotlinx.coroutines.e.f(this, Dispatchers.getIO(), null, new j(null), 2, null);
        }
    }

    public final boolean stopFindDevice(boolean sendStopCmd) {
        HMLog.info(j, new k(sendStopCmd));
        Job job = this.findDeviceJob;
        if (job != null) {
            job.cancel(new CancellationException("stop find device, sendStopCmd: " + sendStopCmd));
        }
        if (sendStopCmd) {
            kotlinx.coroutines.e.f(this, null, null, new l(null), 3, null);
        }
        resetStatus();
        return true;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b&\u0010'J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u0011\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J/\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/xiaomi/hm/health/device/setting/find/FindDeviceModel$PageStatus;", "", "", "resetStatus", "Lcom/xiaomi/hm/health/device/setting/find/PageType;", "component1", "Lkotlinx/coroutines/CompletableDeferred;", "component2", "", "component3", "type", "awaitAction", "needSendStop", "copy", "", "toString", "", "hashCode", "other", "equals", "a", "Lcom/xiaomi/hm/health/device/setting/find/PageType;", "getType", "()Lcom/xiaomi/hm/health/device/setting/find/PageType;", "setType", "(Lcom/xiaomi/hm/health/device/setting/find/PageType;)V", "b", "Lkotlinx/coroutines/CompletableDeferred;", "getAwaitAction", "()Lkotlinx/coroutines/CompletableDeferred;", "setAwaitAction", "(Lkotlinx/coroutines/CompletableDeferred;)V", "c", "Z", "getNeedSendStop", "()Z", "setNeedSendStop", "(Z)V", "<init>", "(Lcom/xiaomi/hm/health/device/setting/find/PageType;Lkotlinx/coroutines/CompletableDeferred;Z)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final /* data */ class PageStatus {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        private PageType type;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @Nullable
        private CompletableDeferred<PageType> awaitAction;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private boolean needSendStop;

        public PageStatus(@NotNull PageType pageType, @Nullable CompletableDeferred<PageType> completableDeferred, boolean z) {
            this.type = pageType;
            this.awaitAction = completableDeferred;
            this.needSendStop = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PageStatus copy$default(PageStatus pageStatus, PageType pageType, CompletableDeferred completableDeferred, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                pageType = pageStatus.type;
            }
            if ((i & 2) != 0) {
                completableDeferred = pageStatus.awaitAction;
            }
            if ((i & 4) != 0) {
                z = pageStatus.needSendStop;
            }
            return pageStatus.copy(pageType, completableDeferred, z);
        }

        @NotNull
        /* JADX INFO: renamed from: component1, reason: from getter */
        public final PageType getType() {
            return this.type;
        }

        @Nullable
        public final CompletableDeferred<PageType> component2() {
            return this.awaitAction;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getNeedSendStop() {
            return this.needSendStop;
        }

        @NotNull
        public final PageStatus copy(@NotNull PageType type, @Nullable CompletableDeferred<PageType> awaitAction, boolean needSendStop) {
            return new PageStatus(type, awaitAction, needSendStop);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageStatus)) {
                return false;
            }
            PageStatus pageStatus = (PageStatus) other;
            return this.type == pageStatus.type && Intrinsics.areEqual(this.awaitAction, pageStatus.awaitAction) && this.needSendStop == pageStatus.needSendStop;
        }

        @Nullable
        public final CompletableDeferred<PageType> getAwaitAction() {
            return this.awaitAction;
        }

        public final boolean getNeedSendStop() {
            return this.needSendStop;
        }

        @NotNull
        public final PageType getType() {
            return this.type;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public int hashCode() {
            int iHashCode = this.type.hashCode() * 31;
            CompletableDeferred<PageType> completableDeferred = this.awaitAction;
            int iHashCode2 = (iHashCode + (completableDeferred == null ? 0 : completableDeferred.hashCode())) * 31;
            boolean z = this.needSendStop;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            return iHashCode2 + r1;
        }

        public final void resetStatus() {
            this.type = PageType.None;
            this.awaitAction = null;
        }

        public final void setAwaitAction(@Nullable CompletableDeferred<PageType> completableDeferred) {
            this.awaitAction = completableDeferred;
        }

        public final void setNeedSendStop(boolean z) {
            this.needSendStop = z;
        }

        public final void setType(@NotNull PageType pageType) {
            this.type = pageType;
        }

        @NotNull
        public String toString() {
            return "PageStatus(type=" + this.type + ", awaitAction=" + this.awaitAction + ", needSendStop=" + this.needSendStop + ")";
        }

        public /* synthetic */ PageStatus(PageType pageType, CompletableDeferred completableDeferred, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(pageType, completableDeferred, (i & 4) != 0 ? true : z);
        }
    }
}
