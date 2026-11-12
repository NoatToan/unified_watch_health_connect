package com.huami.watchfacesstore.ui.manager;

import androidx.arch.core.util.Function;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.Fail;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.Success;
import com.huami.http.HttpError;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.huami.watchfacesstore.bean.WatchData;
import com.huami.watchfacesstore.device.DeviceConfigManager;
import com.huami.watchfacesstore.device.WFDeviceManager;
import com.huami.watchfacesstore.device.WFDeviceManagerFactory;
import com.huami.watchfacesstore.device.channel.DeviceInfo;
import com.huami.watchfacesstore.device.channel.IDeviceManager;
import com.huami.watchfacesstore.device.channel.WFChannel;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.watchfacesstore.ext.StateKt;
import com.huami.watchfacesstore.repo.HistoryRecordRepo;
import com.huami.watchfacesstore.repo.WatchFaceStatusRepo;
import com.huami.watchfacesstore.ui.base.BaseViewModel;
import com.huami.watchfacesstore.ui.manager.WatchManagerViewModel;
import com.huami.watchfacesstore.ui.repo.WatchFaceRepo;
import com.loc.z;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.language.CommonLanguageSettingFragment;
import com.xiaomi.hm.health.device.watchskinstore.ui.LargeWatchSkinActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b`\u0010aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R+\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u001a0\u00190\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR+\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u00190\u00188\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR+\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u00190\u00188\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010\u001c\u001a\u0004\b%\u0010\u001eR1\u0010*\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b0'0\u00190\u00188\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010\u001eR\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001f\u0010>\u001a\b\u0012\u0004\u0012\u00020;0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010\u001c\u001a\u0004\b=\u0010\u001eR\u001f\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0\u00188\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010\u001c\u001a\u0004\b@\u0010\u001eR\u001f\u0010D\u001a\b\u0012\u0004\u0012\u00020;0\u00188\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010\u001c\u001a\u0004\bC\u0010\u001eR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010J\u001a\b\u0012\u0004\u0012\u00020;0\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010\u001cR\u001f\u0010P\u001a\b\u0012\u0004\u0012\u00020;0K8\u0006@\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR(\u0010R\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u00190\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u001cR+\u0010U\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001a0\u00190K8\u0006@\u0006¢\u0006\f\n\u0004\bS\u0010M\u001a\u0004\bT\u0010OR\u0019\u0010X\u001a\u00020;8\u0006@\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR=\u0010_\u001a \u0012\u001c\u0012\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000b Z*\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00190\u00190K8\u0006@\u0006¢\u0006\u0012\n\u0004\b[\u0010M\u0012\u0004\b]\u0010^\u001a\u0004\b\\\u0010O¨\u0006b"}, d2 = {"Lcom/huami/watchfacesstore/ui/manager/WatchManagerViewModel;", "Lcom/huami/watchfacesstore/ui/base/BaseViewModel;", "", "c", "b", "initHeaderViewStatus", "getMyWatchFaceList", "collectPurchase", "getAllData", "", "index", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", LargeWatchSkinActivity.KEY_BEAN, "setWatchFaceById", "Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", "a", "Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;", CommonLanguageSettingFragment.KEY_REPO, "Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;", "Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;", "historyRecordRepo", "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;", "watchFaceStatusRepo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/huami/arch/core/State;", "", GoogleApiAvailabilityLight.a, "Landroidx/lifecycle/MutableLiveData;", "getMyWatchFaceLiveData", "()Landroidx/lifecycle/MutableLiveData;", "myWatchFaceLiveData", "Lcom/huami/watchfacesstore/bean/WatchData;", "e", "getCollectLiveData", "collectLiveData", "f", "getLocalLiveData", "localLiveData", "Lkotlin/Pair;", "g", "getChangeLiveData", "changeLiveData", "Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "h", "Lcom/huami/watchfacesstore/device/channel/DeviceInfo;", "deviceInfo", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "i", "Lcom/huami/watchfacesstore/device/channel/IDeviceManager;", "deviceManager", "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", z.j, "Lcom/huami/watchfacesstore/device/DeviceConfigManager;", "deviceConfig", "Lcom/huami/watchfacesstore/device/channel/WFChannel;", hl.k, "Lcom/huami/watchfacesstore/device/channel/WFChannel;", "channel", "", "l", "getBleOpenLiveData", "bleOpenLiveData", "m", "getConnectLiveData", "connectLiveData", GoogleApiAvailabilityLight.b, "getBatteryLiveData", "batteryLiveData", "Lcom/huami/watchfacesstore/device/WFDeviceManager;", "o", "Lcom/huami/watchfacesstore/device/WFDeviceManager;", "wfDeviceManager", com.google.android.exoplayer2.text.ttml.b.r, "_emptyLiveData", "Landroidx/lifecycle/LiveData;", DTransferConstants.SEARCH_KEY, "Landroidx/lifecycle/LiveData;", "getEmptyLiveData", "()Landroidx/lifecycle/LiveData;", "emptyLiveData", "r", "_historyLiveData", SOAP.XMLNS, "getHistoryLiveData", "historyLiveData", "t", "Z", "isSupportPay", "()Z", "kotlin.jvm.PlatformType", "u", "getHeaderLiveData", "getHeaderLiveData$annotations", "()V", "headerLiveData", "<init>", "(Lcom/huami/watchfacesstore/ui/repo/WatchFaceRepo;Lcom/huami/watchfacesstore/repo/HistoryRecordRepo;Lcom/huami/watchfacesstore/repo/WatchFaceStatusRepo;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class WatchManagerViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceRepo repo;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HistoryRecordRepo historyRecordRepo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final WatchFaceStatusRepo watchFaceStatusRepo;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<List<MyWatchFaceBean>>> myWatchFaceLiveData;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<List<WatchData>>> collectLiveData;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<List<WatchData>>> localLiveData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<Pair<Integer, MyWatchFaceBean>>> changeLiveData;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final DeviceInfo deviceInfo;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final IDeviceManager deviceManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final DeviceConfigManager deviceConfig;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final WFChannel channel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> bleOpenLiveData;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Integer> connectLiveData;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> batteryLiveData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final WFDeviceManager wfDeviceManager;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> _emptyLiveData;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> emptyLiveData;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<State<List<WatchData>>> _historyLiveData;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    private final LiveData<State<List<WatchData>>> historyLiveData;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final boolean isSupportPay;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @NotNull
    private final LiveData<State<MyWatchFaceBean>> headerLiveData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$getCollectAndHistoryData$1", f = "WatchManagerViewModel.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$getCollectAndHistoryData$1$1", f = "WatchManagerViewModel.kt", i = {0, 1}, l = {160, 161}, m = "invokeSuspend", n = {"collectRequest", "historyData"}, s = {"L$0", "L$0"})
        public static final class C0693a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            private /* synthetic */ Object b;
            public final /* synthetic */ WatchManagerViewModel c;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$a$a$a, reason: collision with other inner class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class C0694a extends Lambda implements Function0<String> {
                public final /* synthetic */ List<WatchData> a;
                public final /* synthetic */ List<WatchData> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0694a(List<WatchData> list, List<WatchData> list2) {
                    super(0);
                    this.a = list;
                    this.b = list2;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "historyData: " + this.a + " collectData: " + this.b;
                }
            }

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$a$a$b */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$getCollectAndHistoryData$1$1$collectRequest$1", f = "WatchManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WatchData>>, Object> {
                public int a;
                public final /* synthetic */ WatchManagerViewModel b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(WatchManagerViewModel watchManagerViewModel, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.b = watchManagerViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WatchData>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super List<WatchData>>) continuation);
                }

                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<WatchData>> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    if (this.a != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return WatchFaceRepo.getCollectionLists$default(this.b.repo, this.b.deviceInfo.getDeviceId(), 0, 0, 6, null).getData();
                }
            }

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$a$a$c */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            @DebugMetadata(c = "com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$getCollectAndHistoryData$1$1$historyRequest$1", f = "WatchManagerViewModel.kt", i = {}, l = {158}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WatchData>>, Object> {
                public int a;
                public final /* synthetic */ WatchManagerViewModel b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(WatchManagerViewModel watchManagerViewModel, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.b = watchManagerViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new c(this.b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WatchData>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super List<WatchData>>) continuation);
                }

                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<WatchData>> continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                    int i = this.a;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        HistoryRecordRepo historyRecordRepo = this.b.historyRecordRepo;
                        String deviceId = this.b.deviceInfo.getDeviceId();
                        this.a = 1;
                        obj = HistoryRecordRepo.DefaultImpls.getHistoryRecord$default(historyRecordRepo, deviceId, 0, 0, this, 6, null);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0693a(WatchManagerViewModel watchManagerViewModel, Continuation<? super C0693a> continuation) {
                super(2, continuation);
                this.c = watchManagerViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0693a c0693a = new C0693a(this.c, continuation);
                c0693a.b = obj;
                return c0693a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                return ((C0693a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x00a2  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Deferred deferred;
                List list;
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        deferred = (Deferred) this.b;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        list = (List) this.b;
                        ResultKt.throwOnFailure(obj);
                    }
                    List list2 = (List) obj;
                    HMLog.info("WatchManagerViewModel", new C0694a(list, list2));
                    this.c.getCollectLiveData().postValue(new Success(list2));
                    this.c._historyLiveData.postValue(new Success(list));
                    this.c._emptyLiveData.postValue(Boxing.boxBoolean(!list2.isEmpty() && list.isEmpty()));
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                Deferred deferredB = e.b(coroutineScope, null, null, new c(this.c, null), 3, null);
                Deferred deferredB2 = e.b(coroutineScope, null, null, new b(this.c, null), 3, null);
                this.b = deferredB2;
                this.a = 1;
                Object objAwait = deferredB.await(this);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
                deferred = deferredB2;
                obj = objAwait;
                List list3 = (List) obj;
                this.b = list3;
                this.a = 2;
                Object objAwait2 = deferred.await(this);
                if (objAwait2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list = list3;
                obj = objAwait2;
                List list4 = (List) obj;
                HMLog.info("WatchManagerViewModel", new C0694a(list, list4));
                this.c.getCollectLiveData().postValue(new Success(list4));
                this.c._historyLiveData.postValue(new Success(list));
                this.c._emptyLiveData.postValue(Boxing.boxBoolean(!list4.isEmpty() && list.isEmpty()));
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
            public final String invoke() {
                return "getCollectAndHistoryData error";
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchManagerViewModel.this.new a(continuation);
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
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C0693a c0693a = new C0693a(WatchManagerViewModel.this, null);
                    this.a = 1;
                    if (CoroutineScopeKt.coroutineScope(c0693a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Exception e) {
                HMLog.error$default("WatchManagerViewModel", null, e, b.a, 2, null);
                WatchManagerViewModel.this.getCollectLiveData().postValue(new Fail(e));
                WatchManagerViewModel.this._historyLiveData.postValue(new Fail(e));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$getCollectAndLocalData$1", f = "WatchManagerViewModel.kt", i = {0, 1}, l = {142, 143}, m = "invokeSuspend", n = {"collectRequest", "localData"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ List<WatchData> a;
            public final /* synthetic */ List<WatchData> b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List<WatchData> list, List<WatchData> list2) {
                super(0);
                this.a = list;
                this.b = list2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "localData: " + this.a + " collectData: " + this.b;
            }
        }

        /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$getCollectAndLocalData$1$collectRequest$1", f = "WatchManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0695b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WatchData>>, Object> {
            public int a;
            public final /* synthetic */ WatchManagerViewModel b;

            /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$b$b$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "get collect error";
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0695b(WatchManagerViewModel watchManagerViewModel, Continuation<? super C0695b> continuation) {
                super(2, continuation);
                this.b = watchManagerViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new C0695b(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WatchData>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<WatchData>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<WatchData>> continuation) {
                return ((C0695b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objM3845constructorimpl;
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                WatchManagerViewModel watchManagerViewModel = this.b;
                try {
                    Result.Companion companion = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(WatchFaceRepo.getCollectionLists$default(watchManagerViewModel.repo, watchManagerViewModel.deviceInfo.getDeviceId(), 0, 0, 6, null).getData());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
                Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (thM3848exceptionOrNullimpl == null) {
                    return objM3845constructorimpl;
                }
                HMLog.error$default("WatchManagerViewModel", null, thM3848exceptionOrNullimpl, a.a, 2, null);
                return null;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/watchfacesstore/bean/WatchData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$getCollectAndLocalData$1$localRequest$1", f = "WatchManagerViewModel.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends WatchData>>, Object> {
            public int a;
            public final /* synthetic */ WatchManagerViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(WatchManagerViewModel watchManagerViewModel, Continuation<? super c> continuation) {
                super(2, continuation);
                this.b = watchManagerViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new c(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends WatchData>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<WatchData>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<WatchData>> continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                int i = this.a;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    WatchFaceRepo watchFaceRepo = this.b.repo;
                    String deviceId = this.b.deviceInfo.getDeviceId();
                    this.a = 1;
                    obj = watchFaceRepo.getLocalWatchFaceInfoList(deviceId, this);
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

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = WatchManagerViewModel.this.new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0076  */
        /* JADX WARN: Code duplicated, block: B:26:0x0095  */
        /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Deferred deferred;
            List list;
            List list2;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            Unit unit = null;
            if (i != 0) {
                if (i == 1) {
                    deferred = (Deferred) this.b;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) this.b;
                    ResultKt.throwOnFailure(obj);
                }
                list2 = (List) obj;
                HMLog.info("WatchManagerViewModel", new a(list, list2));
                if (list2 != null) {
                    WatchManagerViewModel watchManagerViewModel = WatchManagerViewModel.this;
                    watchManagerViewModel.getCollectLiveData().postValue(new Success(list2));
                    watchManagerViewModel._emptyLiveData.postValue(Boxing.boxBoolean(!list2.isEmpty() && list.isEmpty()));
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    WatchManagerViewModel.this.getCollectLiveData().postValue(new Fail(new Throwable()));
                }
                WatchManagerViewModel.this.getLocalLiveData().postValue(new Success(list));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.b;
            Deferred deferredB = e.b(coroutineScope, null, null, new c(WatchManagerViewModel.this, null), 3, null);
            Deferred deferredB2 = e.b(coroutineScope, null, null, new C0695b(WatchManagerViewModel.this, null), 3, null);
            this.b = deferredB2;
            this.a = 1;
            Object objAwait = deferredB.await(this);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            deferred = deferredB2;
            obj = objAwait;
            List list3 = (List) obj;
            this.b = list3;
            this.a = 2;
            Object objAwait2 = deferred.await(this);
            if (objAwait2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = list3;
            obj = objAwait2;
            list2 = (List) obj;
            HMLog.info("WatchManagerViewModel", new a(list, list2));
            if (list2 != null) {
                WatchManagerViewModel watchManagerViewModel2 = WatchManagerViewModel.this;
                watchManagerViewModel2.getCollectLiveData().postValue(new Success(list2));
                watchManagerViewModel2._emptyLiveData.postValue(Boxing.boxBoolean(!list2.isEmpty() && list.isEmpty()));
                unit = Unit.INSTANCE;
            }
            if (unit == null) {
                WatchManagerViewModel.this.getCollectLiveData().postValue(new Fail(new Throwable()));
            }
            WatchManagerViewModel.this.getLocalLiveData().postValue(new Success(list));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$getMyWatchFaceList$1", f = "WatchManagerViewModel.kt", i = {0}, l = {104}, m = "invokeSuspend", n = {"currentId"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements Function1<Continuation<? super State<? extends List<? extends MyWatchFaceBean>>>, Object> {
        public Object a;
        public int b;

        public c(Continuation<? super c> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return WatchManagerViewModel.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends List<? extends MyWatchFaceBean>>> continuation) {
            return invoke2((Continuation<? super State<? extends List<MyWatchFaceBean>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<? extends List<MyWatchFaceBean>>> continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws HttpError {
            Integer num;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String strJoinToString$default = ArraysKt___ArraysKt.joinToString$default(WatchManagerViewModel.this.deviceManager.getAllWatchFaceIds(), (CharSequence) ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
                Integer currentWatchFaceId = WatchManagerViewModel.this.deviceManager.getCurrentWatchFaceId();
                WatchFaceRepo watchFaceRepo = WatchManagerViewModel.this.repo;
                String deviceId = WatchManagerViewModel.this.deviceInfo.getDeviceId();
                this.a = currentWatchFaceId;
                this.b = 1;
                obj = watchFaceRepo.getMyWatchList(deviceId, strJoinToString$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                num = currentWatchFaceId;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                num = (Integer) this.a;
                ResultKt.throwOnFailure(obj);
            }
            List<MyWatchFaceBean> list = (List) obj;
            for (MyWatchFaceBean myWatchFaceBean : list) {
                int builtinId = myWatchFaceBean.getBuiltinId();
                if (num != null && builtinId == num.intValue()) {
                    myWatchFaceBean.setSelected(true);
                }
            }
            return new Success(list);
        }
    }

    /* JADX INFO: renamed from: com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$collectPurchase$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$collectPurchase$1", f = "WatchManagerViewModel.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WatchManagerViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Integer> flowObserverPurchased = WatchManagerViewModel.this.watchFaceStatusRepo.observerPurchased();
                final WatchManagerViewModel watchManagerViewModel = WatchManagerViewModel.this;
                FlowCollector<Integer> flowCollector = new FlowCollector<Integer>() { // from class: com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$collectPurchase$1$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Integer num, @NotNull Continuation<? super Unit> continuation) {
                        num.intValue();
                        watchManagerViewModel.getAllData();
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowObserverPurchased.collect(flowCollector, this) == coroutine_suspended) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000H\u008a@"}, d2 = {"Lcom/huami/arch/core/State;", "Lkotlin/Pair;", "", "Lcom/huami/watchfacesstore/bean/MyWatchFaceBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$setWatchFaceById$1", f = "WatchManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function1<Continuation<? super State<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>>>, Object> {
        public int a;
        public final /* synthetic */ MyWatchFaceBean c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MyWatchFaceBean myWatchFaceBean, int i, Continuation<? super d> continuation) {
            super(1, continuation);
            this.c = myWatchFaceBean;
            this.d = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return WatchManagerViewModel.this.new d(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super State<? extends Pair<? extends Integer, ? extends MyWatchFaceBean>>> continuation) {
            return invoke2((Continuation<? super State<Pair<Integer, MyWatchFaceBean>>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@Nullable Continuation<? super State<Pair<Integer, MyWatchFaceBean>>> continuation) {
            return ((d) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return WatchManagerViewModel.this.wfDeviceManager.setWatchFaceById(this.c.getBuiltinId()) ? new Success(TuplesKt.to(Boxing.boxInt(this.d), this.c)) : new Fail(new Throwable());
        }
    }

    public WatchManagerViewModel(@NotNull WatchFaceRepo watchFaceRepo, @NotNull HistoryRecordRepo historyRecordRepo, @NotNull WatchFaceStatusRepo watchFaceStatusRepo) {
        this.repo = watchFaceRepo;
        this.historyRecordRepo = historyRecordRepo;
        this.watchFaceStatusRepo = watchFaceStatusRepo;
        MutableLiveData<State<List<MyWatchFaceBean>>> mutableLiveData = new MutableLiveData<>();
        this.myWatchFaceLiveData = mutableLiveData;
        this.collectLiveData = new MutableLiveData<>();
        this.localLiveData = new MutableLiveData<>();
        this.changeLiveData = new MutableLiveData<>();
        this.deviceInfo = KoinExtKt.getDeviceInfo();
        this.deviceManager = KoinExtKt.getDeviceManager();
        DeviceConfigManager deviceConfigManager = KoinExtKt.getDeviceConfigManager();
        this.deviceConfig = deviceConfigManager;
        WFChannel wFChannel = (WFChannel) KoinExtKt.getBleChannel();
        this.channel = wFChannel;
        this.bleOpenLiveData = wFChannel.getBleOpenLiveData();
        this.connectLiveData = wFChannel.getConnectLiveData();
        this.batteryLiveData = wFChannel.getBatteryLiveData();
        this.wfDeviceManager = WFDeviceManagerFactory.INSTANCE.getHMDeviceManager();
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this._emptyLiveData = mutableLiveData2;
        this.emptyLiveData = mutableLiveData2;
        MutableLiveData<State<List<WatchData>>> mutableLiveData3 = new MutableLiveData<>();
        this._historyLiveData = mutableLiveData3;
        this.historyLiveData = Transformations.map(mutableLiveData3, new Function<State<? extends List<? extends WatchData>>, State<? extends List<? extends WatchData>>>() { // from class: com.huami.watchfacesstore.ui.manager.WatchManagerViewModel$special$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final State<? extends List<? extends WatchData>> apply(State<? extends List<? extends WatchData>> state) {
                return StateKt.toHistoryData(state);
            }
        });
        this.isSupportPay = deviceConfigManager.isSupportPay();
        getAllData();
        this.headerLiveData = Transformations.switchMap(mutableLiveData, new Function() { // from class: pg8
            @Override // androidx.arch.core.util.Function
            public final Object apply(Object obj) {
                return WatchManagerViewModel.e((State) obj);
            }
        });
    }

    private final void b() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new a(null), 2, null);
    }

    private final void c() {
        e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getDefault(), null, new b(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveData e(State state) {
        Object fail;
        MutableLiveData mutableLiveData = new MutableLiveData();
        if (state instanceof Loading) {
            fail = new Loading();
        } else if (state instanceof Success) {
            List list = (List) ((Success) state).getValue();
            Object obj = null;
            if (list != null) {
                for (Object obj2 : list) {
                    if (((MyWatchFaceBean) obj2).isSelected()) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (MyWatchFaceBean) obj;
            }
            fail = new Success(obj);
        } else {
            if (!(state instanceof Fail)) {
                throw new NoWhenBranchMatchedException();
            }
            fail = new Fail(((Fail) state).getError());
        }
        mutableLiveData.setValue(fail);
        return mutableLiveData;
    }

    public static /* synthetic */ void getHeaderLiveData$annotations() {
    }

    public final void collectPurchase() {
        e.f(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    public final void getAllData() {
        if (this.isSupportPay) {
            b();
        } else {
            c();
        }
    }

    @NotNull
    public final MutableLiveData<Boolean> getBatteryLiveData() {
        return this.batteryLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getBleOpenLiveData() {
        return this.bleOpenLiveData;
    }

    @NotNull
    public final MutableLiveData<State<Pair<Integer, MyWatchFaceBean>>> getChangeLiveData() {
        return this.changeLiveData;
    }

    @NotNull
    public final MutableLiveData<State<List<WatchData>>> getCollectLiveData() {
        return this.collectLiveData;
    }

    @NotNull
    public final MutableLiveData<Integer> getConnectLiveData() {
        return this.connectLiveData;
    }

    @NotNull
    public final LiveData<Boolean> getEmptyLiveData() {
        return this.emptyLiveData;
    }

    @NotNull
    public final LiveData<State<MyWatchFaceBean>> getHeaderLiveData() {
        return this.headerLiveData;
    }

    @NotNull
    public final LiveData<State<List<WatchData>>> getHistoryLiveData() {
        return this.historyLiveData;
    }

    @NotNull
    public final MutableLiveData<State<List<WatchData>>> getLocalLiveData() {
        return this.localLiveData;
    }

    public final void getMyWatchFaceList() {
        if (this.deviceConfig.isSupportDialDelete()) {
            startWithLoading(this.myWatchFaceLiveData, new c(null));
        } else {
            this.myWatchFaceLiveData.setValue(new Fail(new Throwable("unSupportDialDelete")));
        }
    }

    @NotNull
    public final MutableLiveData<State<List<MyWatchFaceBean>>> getMyWatchFaceLiveData() {
        return this.myWatchFaceLiveData;
    }

    public final void initHeaderViewStatus() {
        if (this.deviceManager.isBluetoothEnable()) {
            this.connectLiveData.setValue(Integer.valueOf(this.deviceManager.isConnected() ? 0 : 1));
        } else {
            this.bleOpenLiveData.setValue(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: isSupportPay, reason: from getter */
    public final boolean getIsSupportPay() {
        return this.isSupportPay;
    }

    public final void setWatchFaceById(int index, @NotNull MyWatchFaceBean bean) {
        startWithLoading(this.changeLiveData, new d(bean, index, null));
    }
}
