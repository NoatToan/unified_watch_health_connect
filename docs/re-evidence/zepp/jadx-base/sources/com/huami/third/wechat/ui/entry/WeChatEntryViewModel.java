package com.huami.third.wechat.ui.entry;

import android.content.Context;
import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleEventObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.HMLoginManager;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.account.service.proxy.KoinProxyKt;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.third.wechat.api.DataSourceApi;
import com.huami.third.wechat.entity.DeviceListApiEntity;
import com.huami.third.wechat.ui.AnalyzeUtilsKt;
import com.huami.third.wechat.ui.WeChatParams;
import com.huami.third.wechat.ui.bind.bind.DeviceBindInfo;
import com.huami.third.wechat.ui.bind.bind.DeviceBindState;
import com.huami.third.wechat.ui.bind.bind.IDeviceHelper;
import com.huami.third.wechat.ui.bind.result.WeChatBindSuccessFragment;
import com.huami.third.wechat.ui.entry.WeChatEntryViewModel;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.web.service.WebViewService;
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d\u0012\u0006\u0010$\u001a\u00020!¢\u0006\u0004\b:\u0010;J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u0006\u0010\r\u001a\u00020\u0006J\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0004J\u0006\u0010\u0014\u001a\u00020\u0006R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R%\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040&0\t8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R$\u00101\u001a\u0010\u0012\f\u0012\n 0*\u0004\u0018\u00010/0/0%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\n028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00103R\u0016\u00107\u001a\u0002058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00106R\u0019\u00109\u001a\b\u0012\u0004\u0012\u00020\n0\t8F@\u0006¢\u0006\u0006\u001a\u0004\b8\u0010-¨\u0006<"}, d2 = {"Lcom/huami/third/wechat/ui/entry/WeChatEntryViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/huami/third/wechat/entity/DeviceListApiEntity;", "apiDeviceItem", "Lcom/huami/third/wechat/ui/bind/bind/DeviceBindInfo;", "g", "", "i", "h", "Landroidx/lifecycle/LiveData;", "", "checkBindState", "checkShowWeChatSportBindEntry", "getSupportedDevice", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/lifecycle/Lifecycle;", "lifecycle", "bindInfo", "goToWeChatDeviceBind", "showWechatSportType", "Lcom/huami/third/wechat/api/DataSourceApi;", "a", "Lcom/huami/third/wechat/api/DataSourceApi;", "dataSourceApi", "Lcom/huami/third/wechat/ui/bind/bind/IDeviceHelper;", "b", "Lcom/huami/third/wechat/ui/bind/bind/IDeviceHelper;", "deviceHelper", "Lcom/huami/account/service/AccountService;", "c", "Lcom/huami/account/service/AccountService;", "accountService", "Lcom/huami/web/service/WebViewService;", GoogleApiAvailabilityLight.a, "Lcom/huami/web/service/WebViewService;", "webViewService", "Landroidx/lifecycle/MutableLiveData;", "", "e", "Landroidx/lifecycle/MutableLiveData;", "_bindInfoLiveData", "f", "Landroidx/lifecycle/LiveData;", "getBindInfoLiveData", "()Landroidx/lifecycle/LiveData;", "bindInfoLiveData", "", "kotlin.jvm.PlatformType", "requesting", "Landroidx/lifecycle/MediatorLiveData;", "Landroidx/lifecycle/MediatorLiveData;", "_showRequestLoading", "Landroidx/lifecycle/LifecycleEventObserver;", "Landroidx/lifecycle/LifecycleEventObserver;", "refreshObserver", "getShowRequestLoading", "showRequestLoading", "<init>", "(Lcom/huami/third/wechat/api/DataSourceApi;Lcom/huami/third/wechat/ui/bind/bind/IDeviceHelper;Lcom/huami/account/service/AccountService;Lcom/huami/web/service/WebViewService;)V", "wechat-ui_release"}, k = 1, mv = {1, 5, 1})
public final class WeChatEntryViewModel extends ViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DataSourceApi dataSourceApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final IDeviceHelper deviceHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final AccountService accountService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final WebViewService webViewService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<DeviceBindInfo>> _bindInfoLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final LiveData<List<DeviceBindInfo>> bindInfoLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> requesting;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Boolean> _showRequestLoading;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final LifecycleEventObserver refreshObserver;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.third.wechat.ui.entry.WeChatEntryViewModel$checkBindState$1", f = "WeChatEntryViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ MutableLiveData<Boolean> b;
        public final /* synthetic */ WeChatEntryViewModel c;

        /* JADX INFO: renamed from: com.huami.third.wechat.ui.entry.WeChatEntryViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.third.wechat.ui.entry.WeChatEntryViewModel$checkBindState$1$1", f = "WeChatEntryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0617a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ WeChatEntryViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0617a(WeChatEntryViewModel weChatEntryViewModel, Continuation<? super C0617a> continuation) {
                super(2, continuation);
                this.b = weChatEntryViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0617a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0617a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.h();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableLiveData<Boolean> mutableLiveData, WeChatEntryViewModel weChatEntryViewModel, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = mutableLiveData;
            this.c = weChatEntryViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.b.postValue(Boxing.boxBoolean(this.c.dataSourceApi.checkBindState()));
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                C0617a c0617a = new C0617a(this.c, null);
                this.a = 1;
                if (BuildersKt.withContext(immediate, c0617a, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "用户非大陆用户，或者未满14周岁";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.third.wechat.ui.entry.WeChatEntryViewModel$getSupportedDevice$1", f = "WeChatEntryViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.third.wechat.ui.entry.WeChatEntryViewModel$getSupportedDevice$1$1", f = "WeChatEntryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ WeChatEntryViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WeChatEntryViewModel weChatEntryViewModel, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = weChatEntryViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
                this.b.h();
                return Unit.INSTANCE;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeChatEntryViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                List<DeviceListApiEntity> listCheckDeviceSupport = WeChatEntryViewModel.this.dataSourceApi.checkDeviceSupport(WeChatEntryViewModel.this.deviceHelper.getAllBoundDevices());
                if (listCheckDeviceSupport == null) {
                    WeChatEntryViewModel.this._bindInfoLiveData.postValue(CollectionsKt__CollectionsKt.emptyList());
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listCheckDeviceSupport) {
                        if (Boxing.boxBoolean(((DeviceListApiEntity) obj2).isSupport() != -1).booleanValue()) {
                            arrayList.add(obj2);
                        }
                    }
                    WeChatEntryViewModel weChatEntryViewModel = WeChatEntryViewModel.this;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(weChatEntryViewModel.g((DeviceListApiEntity) it2.next()));
                    }
                    WeChatEntryViewModel.this._bindInfoLiveData.postValue(arrayList2);
                }
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                a aVar = new a(WeChatEntryViewModel.this, null);
                this.a = 1;
                if (BuildersKt.withContext(immediate, aVar, this) == coroutine_suspended) {
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
    @DebugMetadata(c = "com.huami.third.wechat.ui.entry.WeChatEntryViewModel$goToWeChatDeviceBind$1", f = "WeChatEntryViewModel.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ DeviceBindInfo c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ Lifecycle e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.third.wechat.ui.entry.WeChatEntryViewModel$goToWeChatDeviceBind$1$1", f = "WeChatEntryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ WeChatEntryViewModel b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ DeviceBindInfo d;
            public final /* synthetic */ Lifecycle e;
            public final /* synthetic */ String f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(WeChatEntryViewModel weChatEntryViewModel, Context context, DeviceBindInfo deviceBindInfo, Lifecycle lifecycle, String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = weChatEntryViewModel;
                this.c = context;
                this.d = deviceBindInfo;
                this.e = lifecycle;
                this.f = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, this.d, this.e, this.f, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
                this.b.h();
                IWXAPI iwxapiCreateWXAPI = WXAPIFactory.createWXAPI(this.c, ((WeChatParams) KoinProxyKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(WeChatParams.class), null, null)).getAppID());
                WXLaunchMiniProgram.Req req = new WXLaunchMiniProgram.Req();
                String str = this.f;
                req.userName = WeChatBindSuccessFragment.WECHAT_USER_NAME;
                req.path = WeChatBindSuccessFragment.WECHAT_ADD_DEVICE_PATH_PREFIX + str;
                req.miniprogramType = 0;
                iwxapiCreateWXAPI.sendReq(req);
                AnalyzeUtilsKt.analytics(AnalyzeUtilsKt.EVENT_ENTER_WECHAT_SPORT_ADD, this.d.getDeviceName());
                this.e.removeObserver(this.b.refreshObserver);
                this.e.addObserver(this.b.refreshObserver);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DeviceBindInfo deviceBindInfo, Context context, Lifecycle lifecycle, Continuation<? super d> continuation) {
            super(2, continuation);
            this.c = deviceBindInfo;
            this.d = context;
            this.e = lifecycle;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeChatEntryViewModel.this.new d(this.c, this.d, this.e, continuation);
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
                String bindTicket = WeChatEntryViewModel.this.dataSourceApi.getBindTicket(this.c.getDeviceSource(), this.c.getDeviceSn());
                MainCoroutineDispatcher immediate = Dispatchers.getMain().getImmediate();
                a aVar = new a(WeChatEntryViewModel.this, this.d, this.c, this.e, bindTicket, null);
                this.a = 1;
                if (BuildersKt.withContext(immediate, aVar, this) == coroutine_suspended) {
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

    public WeChatEntryViewModel(@NotNull DataSourceApi dataSourceApi, @NotNull IDeviceHelper iDeviceHelper, @NotNull AccountService accountService, @NotNull WebViewService webViewService) {
        this.dataSourceApi = dataSourceApi;
        this.deviceHelper = iDeviceHelper;
        this.accountService = accountService;
        this.webViewService = webViewService;
        MutableLiveData<List<DeviceBindInfo>> mutableLiveData = new MutableLiveData<>();
        this._bindInfoLiveData = mutableLiveData;
        this.bindInfoLiveData = mutableLiveData;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>(0);
        this.requesting = mutableLiveData2;
        final MediatorLiveData<Boolean> mediatorLiveData = new MediatorLiveData<>();
        mediatorLiveData.addSource(mutableLiveData2, new Observer() { // from class: vn8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeChatEntryViewModel.e(mediatorLiveData, (Integer) obj);
            }
        });
        Unit unit = Unit.INSTANCE;
        this._showRequestLoading = mediatorLiveData;
        this.refreshObserver = new LifecycleEventObserver() { // from class: un8
            @Override // androidx.p008lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                WeChatEntryViewModel.j(this.a, lifecycleOwner, event);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(MediatorLiveData mediatorLiveData, Integer num) {
        boolean z = num.intValue() > 0;
        if (Intrinsics.areEqual(mediatorLiveData.getValue(), Boolean.valueOf(z))) {
            return;
        }
        mediatorLiveData.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(MediatorLiveData mediatorLiveData, List list) {
        mediatorLiveData.setValue(Boolean.valueOf(!list.isEmpty()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceBindInfo g(DeviceListApiEntity apiDeviceItem) {
        return new DeviceBindInfo(apiDeviceItem.getDeviceDisplayName(), apiDeviceItem.getSn(), apiDeviceItem.getDeviceSource(), DeviceBindState.INSTANCE.bindState(apiDeviceItem.isSupport()), this.deviceHelper.getDeviceShapeBySource(apiDeviceItem.getDeviceSource()), apiDeviceItem.getILnkImSdkId(), apiDeviceItem.getBleAddress(), apiDeviceItem.isActive());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h() {
        this.requesting.setValue(Integer.valueOf(this.requesting.getValue().intValue() - 1));
    }

    private final void i() {
        this.requesting.setValue(Integer.valueOf(this.requesting.getValue().intValue() + 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(WeChatEntryViewModel weChatEntryViewModel, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            weChatEntryViewModel.getSupportedDevice();
        }
    }

    @NotNull
    public final LiveData<Boolean> checkBindState() {
        MutableLiveData mutableLiveData = new MutableLiveData();
        i();
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new a(mutableLiveData, this, null), 2, null);
        return mutableLiveData;
    }

    @NotNull
    public final LiveData<Boolean> checkShowWeChatSportBindEntry() {
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        if (AccountServiceExtKt.isCN(this.accountService) && HMLoginManager.isAdultGlobal()) {
            getSupportedDevice();
            mediatorLiveData.addSource(this._bindInfoLiveData, new Observer() { // from class: wn8
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    WeChatEntryViewModel.f(mediatorLiveData, (List) obj);
                }
            });
            return mediatorLiveData;
        }
        HMLog.info("wechat", b.a);
        mediatorLiveData.setValue(Boolean.FALSE);
        return mediatorLiveData;
    }

    @NotNull
    public final LiveData<List<DeviceBindInfo>> getBindInfoLiveData() {
        return this.bindInfoLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getShowRequestLoading() {
        return this._showRequestLoading;
    }

    public final void getSupportedDevice() {
        i();
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(null), 2, null);
    }

    public final void goToWeChatDeviceBind(@NotNull Context context, @NotNull Lifecycle lifecycle, @NotNull DeviceBindInfo bindInfo) {
        i();
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new d(bindInfo, context, lifecycle, null), 2, null);
    }

    public final void showWechatSportType() {
        this.webViewService.launch(HMServerDef.getUrl("/t/posts/watch?meta_key=tag&category=106&meta_value=faq"));
    }
}
