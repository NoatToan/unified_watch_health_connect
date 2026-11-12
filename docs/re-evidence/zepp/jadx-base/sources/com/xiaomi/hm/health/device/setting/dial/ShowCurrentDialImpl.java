package com.xiaomi.hm.health.device.setting.dial;

import android.widget.ImageView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.http.HttpError;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.device.channel.DeviceInfo;
import com.huami.watchfacesstore.device.channel.IDeviceManager;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ui.repo.WatchFaceRepo;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import com.xiaomi.hm.health.devicex.manage.coroutines.ExtKt;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 32\u00020\u00012\u00020\u0002:\u00013B\u0007¢\u0006\u0004\b1\u00102J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016JX\u0010\u0015\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2#\u0010\u0014\u001a\u001f\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J2\u0010\u0018\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J(\u0010\u0019\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u000e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tR\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001d\u0010*\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001e\u001a\u0004\b(\u0010)R\u001d\u0010-\u001a\u00020+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b#\u0010,R\u001d\u00100\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001e\u001a\u0004\b'\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00064"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/dial/ShowCurrentDialImpl;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/device/setting/dial/DialFetchApi;", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", LargeWatchSkinActivity.KEY_BEAN, "", "f", "", "toString", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "source", "Landroid/widget/ImageView;", "skin", "dial", "ivTransparent", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "onFinish", "displayDial", "(Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dialInfo", "showDial", "showCache", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "getDeviceConfigManager", "Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", "a", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.a, "()Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", "dialDao", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "b", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "deviceManager", "Lcom/xiaomi/hm/health/device/setting/dial/IDialKeeper;", "c", "e", "()Lcom/xiaomi/hm/health/device/setting/dial/IDialKeeper;", HMKeeperConstant.KEEP_XML, "Lcom/huami/devicex/manager/DeviceManagerApi;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/device/setting/dial/IDialConfig;", "()Lcom/xiaomi/hm/health/device/setting/dial/IDialConfig;", "dialConfig", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public class ShowCurrentDialImpl implements KoinComponent, DialFetchApi {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "ShowCurrentDialImpl";

    @Nullable
    private static MyWatchFaceBean g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialDao;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IDeviceManager deviceManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy dialConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/dial/ShowCurrentDialImpl$Companion;", "", "", "clearCache", "", "TAG", "Ljava/lang/String;", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "cachedWatchFaceInfo", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clearCache() {
            ShowCurrentDialImpl.g = null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Job;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl$displayDial$2", f = "ShowCurrentDialImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ HMDeviceSource c;
        public final /* synthetic */ ShowCurrentDialImpl d;
        public final /* synthetic */ ImageView e;
        public final /* synthetic */ ImageView f;
        public final /* synthetic */ ImageView g;
        public final /* synthetic */ Function1<Boolean, Unit> h;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl$displayDial$2$1", f = "ShowCurrentDialImpl.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0841a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Deferred<MyWatchFaceBean> b;
            public final /* synthetic */ ShowCurrentDialImpl c;
            public final /* synthetic */ HMDeviceSource d;
            public final /* synthetic */ ImageView e;
            public final /* synthetic */ ImageView f;
            public final /* synthetic */ ImageView g;
            public final /* synthetic */ Function1<Boolean, Unit> h;
            public final /* synthetic */ String i;
            public final /* synthetic */ Integer j;

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0842a extends Lambda implements Function0<String> {
                public final /* synthetic */ String a;
                public final /* synthetic */ Integer b;
                public final /* synthetic */ MyWatchFaceBean c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0842a(String str, Integer num, MyWatchFaceBean myWatchFaceBean) {
                    super(0);
                    this.a = str;
                    this.b = num;
                    this.c = myWatchFaceBean;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "displayDial deviceId: " + this.a + "; skinId: " + this.b + " and dial info: " + this.c;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0841a(Deferred<MyWatchFaceBean> deferred, ShowCurrentDialImpl showCurrentDialImpl, HMDeviceSource hMDeviceSource, ImageView imageView, ImageView imageView2, ImageView imageView3, Function1<? super Boolean, Unit> function1, String str, Integer num, Continuation<? super C0841a> continuation) {
                super(2, continuation);
                this.b = deferred;
                this.c = showCurrentDialImpl;
                this.d = hMDeviceSource;
                this.e = imageView;
                this.f = imageView2;
                this.g = imageView3;
                this.h = function1;
                this.i = str;
                this.j = num;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0841a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0841a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Deferred<MyWatchFaceBean> deferred = this.b;
                    this.a = 1;
                    obj = deferred.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                MyWatchFaceBean myWatchFaceBean = (MyWatchFaceBean) obj;
                HMLog.info(ShowCurrentDialImpl.f, new C0842a(this.i, this.j, myWatchFaceBean));
                Companion companion = ShowCurrentDialImpl.INSTANCE;
                ShowCurrentDialImpl.g = myWatchFaceBean;
                this.c.f(ShowCurrentDialImpl.g);
                boolean zShowDial = this.c.showDial(this.d, myWatchFaceBean, this.e, this.f, this.g);
                Function1<Boolean, Unit> function1 = this.h;
                if (function1 != null) {
                    function1.invoke(Boxing.boxBoolean(zShowDial));
                }
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl$displayDial$2$result$1", f = "ShowCurrentDialImpl.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MyWatchFaceBean>, Object> {
            public int a;
            public final /* synthetic */ Integer b;
            public final /* synthetic */ ShowCurrentDialImpl c;
            public final /* synthetic */ String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Integer num, ShowCurrentDialImpl showCurrentDialImpl, String str, Continuation<? super b> continuation) {
                super(2, continuation);
                this.b = num;
                this.c = showCurrentDialImpl;
                this.d = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.b, this.c, this.d, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super MyWatchFaceBean> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) throws HttpError {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Integer num = this.b;
                    if (num == null) {
                        return null;
                    }
                    ShowCurrentDialImpl showCurrentDialImpl = this.c;
                    String str = this.d;
                    int iIntValue = num.intValue();
                    WatchFaceRepo watchFaceRepoD = showCurrentDialImpl.d();
                    String strValueOf = String.valueOf(iIntValue);
                    this.a = 1;
                    obj = watchFaceRepoD.getMyWatchList(str, strValueOf, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (MyWatchFaceBean) CollectionsKt.firstOrNull((List) obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(HMDeviceSource hMDeviceSource, ShowCurrentDialImpl showCurrentDialImpl, ImageView imageView, ImageView imageView2, ImageView imageView3, Function1<? super Boolean, Unit> function1, Continuation<? super a> continuation) {
            super(2, continuation);
            this.c = hMDeviceSource;
            this.d = showCurrentDialImpl;
            this.e = imageView;
            this.f = imageView2;
            this.g = imageView3;
            this.h = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.c, this.d, this.e, this.f, this.g, this.h, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Job> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            String strValueOf = String.valueOf(this.c.getValue());
            Integer currentWatchFaceId = this.d.deviceManager.getCurrentWatchFaceId();
            return e.f(coroutineScope, Dispatchers.getMain().plus(ExtKt.getExceptionHandler()), null, new C0841a(e.b(coroutineScope, null, null, new b(currentWatchFaceId, this.d, strValueOf, null), 3, null), this.d, this.c, this.e, this.f, this.g, this.h, strValueOf, currentWatchFaceId, null), 2, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ MyWatchFaceBean a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MyWatchFaceBean myWatchFaceBean, String str) {
            super(0);
            this.a = myWatchFaceBean;
            this.b = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deviceImage is " + this.a.getDeviceImage() + "； image is " + this.b + "; transparentBackground " + this.a.getTransparentBackground();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ShowCurrentDialImpl() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.dialDao = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<WatchFaceRepo>() { // from class: com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.watchfacesstore.ui.repo.WatchFaceRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WatchFaceRepo invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(WatchFaceRepo.class), qualifier, objArr);
            }
        });
        this.deviceManager = KoinExtKt.getDeviceManager();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.keeper = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<IDialKeeper>() { // from class: com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.dial.IDialKeeper, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IDialKeeper invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IDialKeeper.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final DeviceManagerApi invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.dialConfig = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<IDialConfig>() { // from class: com.xiaomi.hm.health.device.setting.dial.ShowCurrentDialImpl$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.dial.IDialConfig, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IDialConfig invoke() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IDialConfig.class), objArr6, objArr7);
            }
        });
    }

    public static /* synthetic */ Object a(ShowCurrentDialImpl showCurrentDialImpl, HMDeviceSource hMDeviceSource, ImageView imageView, ImageView imageView2, ImageView imageView3, Function1 function1, Continuation continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(Dispatchers.getIO().plus(ExtKt.getExceptionHandler()), new a(hMDeviceSource, showCurrentDialImpl, imageView, imageView2, imageView3, function1, null), continuation);
        return objWithContext == kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    private final DeviceManagerApi b() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final IDialConfig c() {
        return (IDialConfig) this.dialConfig.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WatchFaceRepo d() {
        return (WatchFaceRepo) this.dialDao.getValue();
    }

    private final IDialKeeper e() {
        return (IDialKeeper) this.keeper.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(MyWatchFaceBean bean) {
        Device bindInfo;
        String sn;
        if (bean == null || (bindInfo = b().getBindInfo(HMDeviceType.MILI)) == null || (sn = bindInfo.getSn()) == null) {
            return;
        }
        e().addDialBean(sn, bean);
    }

    @Override // com.xiaomi.hm.health.device.setting.dial.DialFetchApi
    @Nullable
    public Object displayDial(@NotNull HMDeviceSource hMDeviceSource, @NotNull ImageView imageView, @NotNull ImageView imageView2, @NotNull ImageView imageView3, @Nullable Function1<? super Boolean, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        return a(this, hMDeviceSource, imageView, imageView2, imageView3, function1, continuation);
    }

    @NotNull
    public final DeviceConfigManager getDeviceConfigManager(@NotNull HMDeviceSource source) {
        return new DeviceConfigManager(new DeviceInfo(String.valueOf(source.getValue()), IntroduceShuffleFactoryKt.getString(ConfigHelperKt.getDeviceDesc(source)), c().getDeviceDialConfig(source)));
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.dial.DialFetchApi
    @NotNull
    public String getTag() {
        return DialFetchApi.DefaultImpls.getTag(this);
    }

    @Override // com.xiaomi.hm.health.device.setting.dial.DialFetchApi
    public boolean showCache(@NotNull HMDeviceSource source, @NotNull ImageView skin, @NotNull ImageView dial, @NotNull ImageView ivTransparent) {
        try {
            return showDial(source, g, skin, dial, ivTransparent);
        } catch (Exception e) {
            HMLog.e(f, e.toString(), new Object[0]);
            return false;
        }
    }

    public boolean showDial(@NotNull HMDeviceSource source, @Nullable MyWatchFaceBean dialInfo, @NotNull ImageView skin, @NotNull ImageView dial, @NotNull ImageView ivTransparent) {
        if (dialInfo == null) {
            return false;
        }
        DeviceConfigManager deviceConfigManager = getDeviceConfigManager(source);
        Pair<Integer, Integer> dialSize = deviceConfigManager.getDialSize();
        deviceConfigManager.setViewLayoutParams(dial, dialSize);
        deviceConfigManager.setViewLayoutParams(ivTransparent, dialSize);
        String gif = dialInfo.getGif();
        if (gif == null) {
            gif = dialInfo.getImage();
        }
        HMLog.info(f, new b(dialInfo, gif));
        ExtensionsKt.loadUrl(skin, dialInfo.getDeviceImage());
        ExtensionsKt.loadWithRadius(dial, gif, deviceConfigManager.getDialRadiusForDevicePage());
        ExtensionsKt.loadUrlAndHintColor(ivTransparent, dialInfo.getTransparentBackground(), dialInfo.getColor());
        String transparentBackground = dialInfo.getTransparentBackground();
        ViewExKt.setVisible(ivTransparent, !(transparentBackground == null || transparentBackground.length() == 0));
        String deviceImage = dialInfo.getDeviceImage();
        if (deviceImage == null || deviceImage.length() == 0) {
            return false;
        }
        return dialInfo.getImage().length() > 0;
    }

    @NotNull
    public String toString() {
        return f;
    }
}
