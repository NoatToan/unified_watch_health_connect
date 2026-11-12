package com.xiaomi.hm.health.device.earbud.viewmodel;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.MediatorLiveData;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.Transformations;
import androidx.p008lifecycle.ViewModelKt;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.watch.util.I18nUtil;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.earbud.model.CurrentMusicState;
import com.xiaomi.hm.health.bt.profile.earbud.model.MusicControlCmd;
import com.xiaomi.hm.health.bt.profile.earbud.model.RestModeInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.TomatoModeInfo;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfoDao;
import com.xiaomi.hm.health.device.earbud.model.EarbudDeviceLeftSizeResult;
import com.xiaomi.hm.health.device.earbud.model.EarbudLoadingType;
import com.xiaomi.hm.health.device.earbud.repo.EarbudCloudDataRepo;
import com.xiaomi.hm.health.device.earbud.service.EarbudMusicDownloadObserver;
import com.xiaomi.hm.health.device.earbud.service.MusicDownloadStatus;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel;
import com.xiaomi.hm.health.device.webapi.earbud.EarbudCloudMusicData;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\b\u0010\u0083\u0001\u001a\u00030\u0082\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u001e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0010J\u0006\u0010\u0013\u001a\u00020\u0002J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0015\u001a\u00020\u0002J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u0017\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018J\u0018\u0010\u001c\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001b\u001a\u00020\u0010J\u000e\u0010\u001d\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010 \u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0010J\u000e\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0010J\b\u0010#\u001a\u0004\u0018\u00010\"J1\u0010+\u001a\u00020\u00022\u0006\u0010$\u001a\u00020\"2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00110&¢\u0006\f\b'\u0012\b\b(\u0012\u0004\b\b()\u0012\u0004\u0012\u00020\u00020%J\u000e\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u0007J\u000e\u0010/\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0002J\b\u00101\u001a\u00020\u0002H\u0014R\u001d\u00107\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u001f\u0010E\u001a\b\u0012\u0004\u0012\u00020@0?8\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u001f\u0010H\u001a\b\u0012\u0004\u0012\u00020\n0?8\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010DR\u0019\u0010N\u001a\u00020I8\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010T\u001a\u00020O8\u0006@\u0006¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR%\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0V0U8\u0006@\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR\u001f\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00100U8\u0006@\u0006¢\u0006\f\n\u0004\b\\\u0010X\u001a\u0004\b]\u0010ZR%\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0V0?8\u0006@\u0006¢\u0006\f\n\u0004\b`\u0010B\u001a\u0004\ba\u0010DR\u001f\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00100U8\u0006@\u0006¢\u0006\f\n\u0004\bc\u0010X\u001a\u0004\bd\u0010ZR\u001f\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00100U8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010X\u001a\u0004\bf\u0010ZR\u001f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00100U8\u0006@\u0006¢\u0006\f\n\u0004\bh\u0010X\u001a\u0004\bi\u0010ZR\u001f\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00100U8\u0006@\u0006¢\u0006\f\n\u0004\bk\u0010X\u001a\u0004\bl\u0010ZR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00100U8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010XR\u001f\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00100p8\u0006@\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR'\u0010y\u001a\u0010\u0012\f\u0012\n v*\u0004\u0018\u00010,0,0p8\u0006@\u0006¢\u0006\f\n\u0004\bw\u0010r\u001a\u0004\bx\u0010tR\u001f\u0010}\u001a\b\u0012\u0004\u0012\u00020z0U8\u0006@\u0006¢\u0006\f\n\u0004\b{\u0010X\u001a\u0004\b|\u0010ZR\u0018\u0010\u0081\u0001\u001a\u00020~8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0086\u0001"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "", "loadMusicState", "", "volume", "setVolume", "", "musicId", "switchMusic", "", "minute", "status", "setRest", "restMinute", "setTomato", "", "isClear", "loadCloudMusic", "refreshCloudMusic", "loadDeviceMusic", "refreshDeviceMusic", "addMusicToDownload", "deleteMusic", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/MusicControlCmd;", Constant.h, "musicControl", "isCancel", "removeDownload", "forceDownload", "getMusicSize", "show", "setShowDeviceMusic", "setShowDelete", "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfo;", "getDownloadingMusic", WebConstant.QueryParam.TYPE_MUSIC, "Lkotlin/Function1;", "Lcom/xiaomi/hm/health/device/earbud/model/EarbudDeviceLeftSizeResult;", "Lkotlin/ParameterName;", "name", "size", "callback", "checkDeviceLeftSize", "", "getMusicName", "isDark", "setDarkMode", "refreshMusicNames", "onCleared", "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfoDao;", "x", "Lkotlin/Lazy;", "v", "()Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfoDao;", "dao", "Lcom/xiaomi/hm/health/device/earbud/repo/EarbudCloudDataRepo;", "y", "Lcom/xiaomi/hm/health/device/earbud/repo/EarbudCloudDataRepo;", "cloudRepo", "z", LogUtil.I, DTransferConstants.PAGE, "Landroidx/lifecycle/MediatorLiveData;", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/CurrentMusicState;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroidx/lifecycle/MediatorLiveData;", "getMusicStateData", "()Landroidx/lifecycle/MediatorLiveData;", "musicStateData", "B", "getVolumeData", "volumeData", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/RestLiveData;", "C", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/RestLiveData;", "getRestData", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/RestLiveData;", "restData", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/TomatoLiveData;", LogUtil.D, "Lcom/xiaomi/hm/health/device/earbud/viewmodel/TomatoLiveData;", "getTomatoData", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/TomatoLiveData;", "tomatoData", "Landroidx/lifecycle/MutableLiveData;", "", "E", "Landroidx/lifecycle/MutableLiveData;", "getMusicListData", "()Landroidx/lifecycle/MutableLiveData;", "musicListData", "F", "getCloudMusicLoadFinish", "cloudMusicLoadFinish", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/DeviceMusicSection;", "G", "getLocalMusicData", "localMusicData", "H", "getShowDeviceMusic", "showDeviceMusic", "getShowDelete", "showDelete", "J", "getShowNetTip", "showNetTip", "K", "getLoadMoreResult", "loadMoreResult", "L", "isDarkMode", "Landroidx/lifecycle/LiveData;", "M", "Landroidx/lifecycle/LiveData;", "getTitleBarDarkMode", "()Landroidx/lifecycle/LiveData;", "titleBarDarkMode", "kotlin.jvm.PlatformType", "N", "getLocaleData", "localeData", "Lcom/xiaomi/hm/health/device/earbud/service/MusicDownloadStatus;", "O", "getDownloadStatusData", "downloadStatusData", "Lio/reactivex/disposables/Disposable;", "P", "Lio/reactivex/disposables/Disposable;", "mDisposable", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudMusicViewModel extends EarbudDeviceViewModel {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<CurrentMusicState> musicStateData;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<Integer> volumeData;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final RestLiveData restData;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final TomatoLiveData tomatoData;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<EarbudMusicInfo>> musicListData;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> cloudMusicLoadFinish;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    private final MediatorLiveData<List<DeviceMusicSection>> localMusicData;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showDeviceMusic;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showDelete;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> showNetTip;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> loadMoreResult;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> isDarkMode;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    private final LiveData<Boolean> titleBarDarkMode;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    @NotNull
    private final LiveData<String> localeData;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<MusicDownloadStatus> downloadStatusData;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    @NotNull
    private final Disposable mDisposable;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy dao;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final EarbudCloudDataRepo cloudRepo;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private int page;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$2$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
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
            MediatorLiveData<Integer> volumeData = EarbudMusicViewModel.this.getVolumeData();
            Short volume = EarbudMusicViewModel.this.getMDeviceRepo().getVolume();
            volumeData.postValue(volume == null ? null : Boxing.boxInt(volume.shortValue()));
            return Boxing.boxBoolean(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$addMusicToDownload$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
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
            EarbudMusicViewModel.this.getMDeviceRepo().addToDownload(this.c);
            EarbudMusicViewModel.this.refreshCloudMusic();
            EarbudMusicViewModel.this.getLocalMusicData().postValue(EarbudMusicViewModel.this.getMDeviceRepo().onDownloadStatusChanged());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$checkDeviceLeftSize$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ EarbudMusicInfo c;
        public final /* synthetic */ Function1<EarbudDeviceLeftSizeResult, Unit> d;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$checkDeviceLeftSize$1$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            public int a;
            public final /* synthetic */ Function1<EarbudDeviceLeftSizeResult, Unit> b;
            public final /* synthetic */ EarbudDeviceLeftSizeResult c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Function1<? super EarbudDeviceLeftSizeResult, Unit> function1, EarbudDeviceLeftSizeResult earbudDeviceLeftSizeResult, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = function1;
                this.c = earbudDeviceLeftSizeResult;
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
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.b.invoke(this.c);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(EarbudMusicInfo earbudMusicInfo, Function1<? super EarbudDeviceLeftSizeResult, Unit> function1, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = earbudMusicInfo;
            this.d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new c(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.e.f(CoroutineScopeKt.MainScope(), null, null, new a(this.d, EarbudMusicViewModel.this.getMDeviceRepo().checkDeviceLeftSize(this.c), null), 3, null);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfoDao;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EarbudMusicInfoDao> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudMusicInfoDao invoke() {
            return HMDaoManager.getInstance().getEarbudMusicInfoDao();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$deleteMusic$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, Continuation<? super e> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new e(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean boolBoxBoolean = Boxing.boxBoolean(EarbudMusicViewModel.this.getMDeviceRepo().deleteMusic(this.c));
            if (!Boxing.boxBoolean(boolBoxBoolean.booleanValue()).booleanValue()) {
                boolBoxBoolean = null;
            }
            boolean z = false;
            if (boolBoxBoolean != null) {
                EarbudMusicViewModel earbudMusicViewModel = EarbudMusicViewModel.this;
                boolBoxBoolean.booleanValue();
                earbudMusicViewModel.loadMusicState();
                earbudMusicViewModel.loadDeviceMusic();
                earbudMusicViewModel.refreshCloudMusic();
                if (boolBoxBoolean.booleanValue()) {
                    z = true;
                }
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$forceDownload$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(long j, Continuation<? super f> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new f(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudMusicViewModel.this.getMDeviceRepo().forceDownload(this.c);
            EarbudMusicDownloadObserver.INSTANCE.getInstance().start(this.c);
            EarbudMusicViewModel.this.refreshCloudMusic();
            EarbudMusicViewModel.this.getLocalMusicData().postValue(EarbudMusicViewModel.this.getMDeviceRepo().onDownloadStatusChanged());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$loadCloudMusic$1", f = "EarbudMusicViewModel.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public int b;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(boolean z, Continuation<? super g> continuation) {
            super(2, continuation);
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new g(this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                List<EarbudMusicInfo> value = EarbudMusicViewModel.this.getMusicListData().getValue();
                if (value == null) {
                    value = new ArrayList<>();
                }
                if (this.d) {
                    EarbudMusicViewModel.this.page = 1;
                    value.clear();
                }
                EarbudCloudMusicData musicList = EarbudMusicViewModel.this.cloudRepo.getMusicList(EarbudMusicViewModel.this.page);
                boolean z = musicList != null;
                if (musicList != null) {
                    booleanRef2.element = EarbudMusicViewModel.this.page == musicList.getTotalPage();
                    List<EarbudMusicInfo> data = musicList.getData();
                    if (data != null) {
                        if (!Boxing.boxBoolean(!data.isEmpty()).booleanValue()) {
                            data = null;
                        }
                        if (data != null) {
                            EarbudMusicViewModel.this.page++;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : data) {
                                if (Boxing.boxBoolean(!((EarbudMusicInfo) obj2).getOfficialBuiltin().booleanValue()).booleanValue()) {
                                    arrayList.add(obj2);
                                }
                            }
                            value.addAll(arrayList);
                        }
                    }
                }
                if (EarbudMusicViewModel.this.page > 1) {
                    EarbudMusicViewModel.this.getShowNetTip().postValue(Boxing.boxBoolean(!z));
                    EarbudMusicViewModel.this.getLoadMoreResult().postValue(Boxing.boxBoolean(z));
                }
                EarbudMusicViewModel.this.getMusicListData().postValue(value);
                EarbudMusicViewModel.this.refreshDeviceMusic();
                this.a = booleanRef2;
                this.b = 1;
                if (DelayKt.delay(1000L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = (Ref.BooleanRef) this.a;
                ResultKt.throwOnFailure(obj);
            }
            EarbudMusicViewModel.this.getCloudMusicLoadFinish().postValue(Boxing.boxBoolean(booleanRef.element));
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$loadDeviceMusic$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new h(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudMusicViewModel.this.getLocalMusicData().postValue(EarbudMusicViewModel.this.getMDeviceRepo().getMusicList());
            EarbudMusicViewModel.this.getMusicStateData().postValue(EarbudMusicViewModel.this.getMusicStateData().getValue());
            EarbudMusicViewModel.this.refreshCloudMusic();
            return Boxing.boxBoolean(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$loadMusicState$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;

        public i(Continuation<? super i> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new i(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CurrentMusicState currentMusicState = EarbudMusicViewModel.this.getMDeviceRepo().getCurrentMusicState();
            EarbudMusicViewModel.this.getMusicStateData().postValue(currentMusicState);
            if (currentMusicState != null) {
                EarbudMusicViewModel earbudMusicViewModel = EarbudMusicViewModel.this;
                if (currentMusicState.isModeRest()) {
                    earbudMusicViewModel.getTomatoData().postValue(null);
                    earbudMusicViewModel.getRestData().startTask(earbudMusicViewModel.getMDeviceRepo().getRestInfo());
                } else if (currentMusicState.isModeTomato()) {
                    earbudMusicViewModel.getRestData().postValue(null);
                    TomatoModeInfo tomatoInfo = earbudMusicViewModel.getMDeviceRepo().getTomatoInfo();
                    earbudMusicViewModel.getTomatoData().setRest(tomatoInfo.getRemainTime() == 0);
                    earbudMusicViewModel.getTomatoData().startTask(tomatoInfo);
                } else {
                    earbudMusicViewModel.getRestData().postValue(null);
                    earbudMusicViewModel.getTomatoData().postValue(null);
                }
            }
            return Boxing.boxBoolean(true);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/viewmodel/OnActiveLiveData;", "", "liveData", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function1<OnActiveLiveData<String>, Unit> {
        public j() {
            super(1);
        }

        public final void a(@NotNull OnActiveLiveData<String> onActiveLiveData) {
            onActiveLiveData.postValue(I18nUtil.getLocaleStr(EarbudMusicViewModel.this.getApplication()));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnActiveLiveData<String> onActiveLiveData) {
            a(onActiveLiveData);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$mDisposable$1$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public k(Continuation<? super k> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new k(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudMusicViewModel.this.refreshCloudMusic();
            EarbudMusicViewModel.this.getLocalMusicData().postValue(EarbudMusicViewModel.this.getMDeviceRepo().onDownloadStatusChanged());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$musicControl$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class l extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ MusicControlCmd c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MusicControlCmd musicControlCmd, Continuation<? super l> continuation) {
            super(2, continuation);
            this.c = musicControlCmd;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new l(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((l) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CurrentMusicState value;
            boolean z;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean boolBoxBoolean = Boxing.boxBoolean(EarbudMusicViewModel.this.getMDeviceRepo().musicControl(this.c));
            if (!Boxing.boxBoolean(boolBoxBoolean.booleanValue()).booleanValue()) {
                boolBoxBoolean = null;
            }
            if (boolBoxBoolean != null) {
                MusicControlCmd musicControlCmd = this.c;
                EarbudMusicViewModel earbudMusicViewModel = EarbudMusicViewModel.this;
                boolBoxBoolean.booleanValue();
                MusicControlCmd musicControlCmd2 = MusicControlCmd.PLAY;
                if ((musicControlCmd == musicControlCmd2 || musicControlCmd == MusicControlCmd.PAUSE) && (value = earbudMusicViewModel.getMusicStateData().getValue()) != null) {
                    value.setState(musicControlCmd == musicControlCmd2 ? 1 : 0);
                    earbudMusicViewModel.getMusicStateData().postValue(value);
                }
                z = boolBoxBoolean.booleanValue();
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$refreshCloudMusic$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class m extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public m(Continuation<? super m> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new m(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((m) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<EarbudMusicInfo> value = EarbudMusicViewModel.this.getMusicListData().getValue();
            if (value != null) {
                EarbudMusicViewModel earbudMusicViewModel = EarbudMusicViewModel.this;
                MutableLiveData<List<EarbudMusicInfo>> musicListData = earbudMusicViewModel.getMusicListData();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10));
                for (EarbudMusicInfo earbudMusicInfo : value) {
                    EarbudMusicInfo earbudMusicInfoLoad = earbudMusicViewModel.v().load(earbudMusicInfo.getId());
                    if (earbudMusicInfoLoad != null) {
                        earbudMusicInfo = earbudMusicInfoLoad;
                    }
                    arrayList.add(earbudMusicInfo);
                }
                musicListData.postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$refreshDeviceMusic$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class n extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public n(Continuation<? super n> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new n(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            T t;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            List<DeviceMusicSection> value = EarbudMusicViewModel.this.getLocalMusicData().getValue();
            if (value != null) {
                if (!Boxing.boxBoolean(!value.isEmpty()).booleanValue()) {
                    value = null;
                }
                if (value != null) {
                    EarbudMusicViewModel earbudMusicViewModel = EarbudMusicViewModel.this;
                    MediatorLiveData<List<DeviceMusicSection>> localMusicData = earbudMusicViewModel.getLocalMusicData();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(value, 10));
                    for (DeviceMusicSection deviceMusicSection : value) {
                        if (!deviceMusicSection.isHeader) {
                            EarbudMusicInfo earbudMusicInfoLoad = earbudMusicViewModel.v().load(((EarbudMusicInfo) deviceMusicSection.t).getId());
                            if (earbudMusicInfoLoad == null) {
                                t = earbudMusicInfoLoad;
                                t = (EarbudMusicInfo) deviceMusicSection.t;
                            }
                            t = earbudMusicInfoLoad;
                            deviceMusicSection.t = t;
                        }
                        arrayList.add(deviceMusicSection);
                    }
                    localMusicData.postValue(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$refreshMusicNames$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public o(Continuation<? super o> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new o(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            EarbudMusicViewModel.this.cloudRepo.refreshMusicNames();
            EarbudMusicViewModel.this.refreshCloudMusic();
            EarbudMusicViewModel.this.refreshDeviceMusic();
            EarbudMusicViewModel.this.getMusicStateData().postValue(EarbudMusicViewModel.this.getMusicStateData().getValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$removeDownload$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class p extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(long j, boolean z, Continuation<? super p> continuation) {
            super(2, continuation);
            this.c = j;
            this.d = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new p(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((p) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Long lRemoveDownload = EarbudMusicViewModel.this.getMDeviceRepo().removeDownload(this.c, this.d);
            if (lRemoveDownload != null) {
                EarbudMusicDownloadObserver.INSTANCE.getInstance().start(lRemoveDownload.longValue());
            }
            EarbudMusicViewModel.this.refreshCloudMusic();
            EarbudMusicViewModel.this.getLocalMusicData().postValue(EarbudMusicViewModel.this.getMDeviceRepo().onDownloadStatusChanged());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$setRest$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class q extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(int i, int i2, Continuation<? super q> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new q(this.c, this.d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean restMode = EarbudMusicViewModel.this.getMDeviceRepo().setRestMode(this.c, this.d);
            if (restMode != null) {
                if (!Boxing.boxBoolean(restMode.booleanValue()).booleanValue()) {
                    restMode = null;
                }
                if (restMode != null) {
                    int i = this.d;
                    EarbudMusicViewModel earbudMusicViewModel = EarbudMusicViewModel.this;
                    int i2 = this.c;
                    restMode.booleanValue();
                    if (i == 2) {
                        CurrentMusicState value = earbudMusicViewModel.getMusicStateData().getValue();
                        if (value != null) {
                            value.setMode(1);
                            earbudMusicViewModel.getMusicStateData().postValue(value);
                        }
                        earbudMusicViewModel.getTomatoData().postValue(null);
                        RestLiveData restData = earbudMusicViewModel.getRestData();
                        RestModeInfo restModeInfo = new RestModeInfo();
                        restModeInfo.setTimeInMinute(i2);
                        restModeInfo.setRemainTimeInMinute(i2);
                        Unit unit = Unit.INSTANCE;
                        restData.startTask(restModeInfo);
                    } else if (i == 3) {
                        earbudMusicViewModel.getRestData().postValue(null);
                        CurrentMusicState value2 = earbudMusicViewModel.getMusicStateData().getValue();
                        if (value2 != null) {
                            value2.setMode(0);
                            earbudMusicViewModel.getMusicStateData().postValue(value2);
                        }
                    }
                    z = restMode.booleanValue();
                }
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$setTomato$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class r extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(int i, int i2, int i3, Continuation<? super r> continuation) {
            super(2, continuation);
            this.c = i;
            this.d = i2;
            this.e = i3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new r(this.c, this.d, this.e, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((r) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            CurrentMusicState value;
            boolean z;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean tomatoMode = EarbudMusicViewModel.this.getMDeviceRepo().setTomatoMode(this.c, this.d, this.e);
            if (tomatoMode != null) {
                TomatoModeInfo tomatoModeInfo = null;
                if (!Boxing.boxBoolean(tomatoMode.booleanValue()).booleanValue()) {
                    tomatoMode = null;
                }
                if (tomatoMode != null) {
                    int i = this.e;
                    EarbudMusicViewModel earbudMusicViewModel = EarbudMusicViewModel.this;
                    int i2 = this.c;
                    int i3 = this.d;
                    tomatoMode.booleanValue();
                    if (i == 1) {
                        earbudMusicViewModel.getTomatoData().setRest(true);
                        tomatoModeInfo = new TomatoModeInfo();
                        tomatoModeInfo.setTimeInMinute(i2);
                        tomatoModeInfo.setRemainTimeInMinute(0);
                        tomatoModeInfo.setRestTimeInMinute(i3);
                        tomatoModeInfo.setRestRemainTimeInMinute(i3);
                    } else if (i == 2) {
                        CurrentMusicState value2 = earbudMusicViewModel.getMusicStateData().getValue();
                        if (value2 != null) {
                            value2.setMode(2);
                            earbudMusicViewModel.getMusicStateData().postValue(value2);
                        }
                        earbudMusicViewModel.getRestData().postValue(null);
                        earbudMusicViewModel.getTomatoData().setRest(false);
                        tomatoModeInfo = new TomatoModeInfo();
                        tomatoModeInfo.setTimeInMinute(i2);
                        tomatoModeInfo.setRemainTimeInMinute(i2);
                        tomatoModeInfo.setRestTimeInMinute(i3);
                        tomatoModeInfo.setRestRemainTimeInMinute(i3);
                    } else if (i == 3 && (value = earbudMusicViewModel.getMusicStateData().getValue()) != null) {
                        value.setMode(0);
                        earbudMusicViewModel.getMusicStateData().postValue(value);
                    }
                    earbudMusicViewModel.getTomatoData().startTask(tomatoModeInfo);
                    z = tomatoMode.booleanValue();
                }
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$setVolume$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class s extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ short c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(short s, Continuation<? super s> continuation) {
            super(2, continuation);
            this.c = s;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new s(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001a  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean volume = EarbudMusicViewModel.this.getMDeviceRepo().setVolume(this.c);
            if (volume != null) {
                if (!Boxing.boxBoolean(volume.booleanValue()).booleanValue()) {
                    volume = null;
                }
                if (volume != null) {
                    EarbudMusicViewModel earbudMusicViewModel = EarbudMusicViewModel.this;
                    short s = this.c;
                    volume.booleanValue();
                    earbudMusicViewModel.getVolumeData().postValue(Boxing.boxInt(s));
                    z = volume.booleanValue();
                }
            }
            return Boxing.boxBoolean(z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel$switchMusic$1", f = "EarbudMusicViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class t extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ long c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(long j, Continuation<? super t> continuation) {
            super(2, continuation);
            this.c = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EarbudMusicViewModel.this.new t(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((t) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x001b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Boolean currentMusic = EarbudMusicViewModel.this.getMDeviceRepo().setCurrentMusic((int) this.c);
            if (currentMusic != null) {
                if (!Boxing.boxBoolean(currentMusic.booleanValue()).booleanValue()) {
                    currentMusic = null;
                }
                if (currentMusic != null) {
                    EarbudMusicViewModel earbudMusicViewModel = EarbudMusicViewModel.this;
                    long j = this.c;
                    currentMusic.booleanValue();
                    CurrentMusicState value = earbudMusicViewModel.getMusicStateData().getValue();
                    if (value != null) {
                        value.setMusicId((int) j);
                        value.setState(1);
                        earbudMusicViewModel.getMusicStateData().postValue(value);
                    }
                    z = currentMusic.booleanValue();
                }
            }
            return Boxing.boxBoolean(z);
        }
    }

    public EarbudMusicViewModel(@NotNull Application application) {
        super(application);
        this.dao = LazyKt__LazyJVMKt.lazy(d.a);
        this.cloudRepo = new EarbudCloudDataRepo();
        this.page = 1;
        MediatorLiveData<CurrentMusicState> mediatorLiveData = new MediatorLiveData<>();
        this.musicStateData = mediatorLiveData;
        MediatorLiveData<Integer> mediatorLiveData2 = new MediatorLiveData<>();
        this.volumeData = mediatorLiveData2;
        this.restData = new RestLiveData();
        this.tomatoData = new TomatoLiveData();
        this.musicListData = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.cloudMusicLoadFinish = mutableLiveData;
        MediatorLiveData<List<DeviceMusicSection>> mediatorLiveData3 = new MediatorLiveData<>();
        this.localMusicData = mediatorLiveData3;
        MutableLiveData<Boolean> mutableLiveData2 = new MutableLiveData<>();
        this.showDeviceMusic = mutableLiveData2;
        MutableLiveData<Boolean> mutableLiveData3 = new MutableLiveData<>();
        this.showDelete = mutableLiveData3;
        this.showNetTip = new MutableLiveData<>();
        this.loadMoreResult = new MutableLiveData<>();
        MutableLiveData<Boolean> mutableLiveData4 = new MutableLiveData<>();
        this.isDarkMode = mutableLiveData4;
        this.titleBarDarkMode = Transformations.distinctUntilChanged(mutableLiveData4);
        this.localeData = Transformations.distinctUntilChanged(new OnActiveLiveData(new j()));
        this.downloadStatusData = new MutableLiveData<>();
        this.mDisposable = EarbudMusicDownloadObserver.INSTANCE.getInstance().safeObserve(new Consumer() { // from class: ef1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                EarbudMusicViewModel.w(this.a, (MusicDownloadStatus) obj);
            }
        });
        mediatorLiveData.addSource(getDeviceData(), new Observer() { // from class: bf1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudMusicViewModel.s(this.a, (HmEarbudDevice) obj);
            }
        });
        mediatorLiveData2.addSource(getDeviceData(), new Observer() { // from class: cf1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudMusicViewModel.t(this.a, (HmEarbudDevice) obj);
            }
        });
        Boolean bool = Boolean.FALSE;
        mutableLiveData.postValue(bool);
        loadCloudMusic$default(this, false, 1, null);
        mediatorLiveData3.addSource(getDeviceData(), new Observer() { // from class: df1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudMusicViewModel.u(this.a, (HmEarbudDevice) obj);
            }
        });
        mutableLiveData2.postValue(Boolean.TRUE);
        mutableLiveData3.postValue(bool);
        loadMusicState();
        loadDeviceMusic();
    }

    public static /* synthetic */ void loadCloudMusic$default(EarbudMusicViewModel earbudMusicViewModel, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        earbudMusicViewModel.loadCloudMusic(z);
    }

    public static /* synthetic */ void removeDownload$default(EarbudMusicViewModel earbudMusicViewModel, long j2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        earbudMusicViewModel.removeDownload(j2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(EarbudMusicViewModel earbudMusicViewModel, HmEarbudDevice hmEarbudDevice) {
        earbudMusicViewModel.loadMusicState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(EarbudMusicViewModel earbudMusicViewModel, HmEarbudDevice hmEarbudDevice) {
        earbudMusicViewModel.earbudLaunch(null, true, earbudMusicViewModel.new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(EarbudMusicViewModel earbudMusicViewModel, HmEarbudDevice hmEarbudDevice) {
        earbudMusicViewModel.loadDeviceMusic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarbudMusicInfoDao v() {
        return (EarbudMusicInfoDao) this.dao.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(EarbudMusicViewModel earbudMusicViewModel, MusicDownloadStatus musicDownloadStatus) {
        if (musicDownloadStatus.getStatus() == 0 || musicDownloadStatus.getStatus() == 2) {
            kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(earbudMusicViewModel), Dispatchers.getIO(), null, earbudMusicViewModel.new k(null), 2, null);
        }
        earbudMusicViewModel.getDownloadStatusData().postValue(musicDownloadStatus);
    }

    public final void addMusicToDownload(long musicId) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new b(musicId, null), 2, null);
    }

    public final void checkDeviceLeftSize(@NotNull EarbudMusicInfo music, @NotNull Function1<? super EarbudDeviceLeftSizeResult, Unit> callback) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new c(music, callback, null), 2, null);
    }

    public final void deleteMusic(long musicId) {
        earbudLaunch(EarbudLoadingType.SET_MUSIC, true, new e(musicId, null));
    }

    public final void forceDownload(long musicId) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new f(musicId, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> getCloudMusicLoadFinish() {
        return this.cloudMusicLoadFinish;
    }

    @NotNull
    public final MutableLiveData<MusicDownloadStatus> getDownloadStatusData() {
        return this.downloadStatusData;
    }

    @Nullable
    public final EarbudMusicInfo getDownloadingMusic() {
        return getMDeviceRepo().getDownloadingMusic();
    }

    @NotNull
    public final MutableLiveData<Boolean> getLoadMoreResult() {
        return this.loadMoreResult;
    }

    @NotNull
    public final MediatorLiveData<List<DeviceMusicSection>> getLocalMusicData() {
        return this.localMusicData;
    }

    @NotNull
    public final LiveData<String> getLocaleData() {
        return this.localeData;
    }

    @NotNull
    public final MutableLiveData<List<EarbudMusicInfo>> getMusicListData() {
        return this.musicListData;
    }

    @NotNull
    public final String getMusicName(long musicId) {
        return getMDeviceRepo().getMusicName(musicId);
    }

    public final int getMusicSize(long musicId) {
        return getMDeviceRepo().getMusicSize(musicId);
    }

    @NotNull
    public final MediatorLiveData<CurrentMusicState> getMusicStateData() {
        return this.musicStateData;
    }

    @NotNull
    public final RestLiveData getRestData() {
        return this.restData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowDelete() {
        return this.showDelete;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowDeviceMusic() {
        return this.showDeviceMusic;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowNetTip() {
        return this.showNetTip;
    }

    @NotNull
    public final LiveData<Boolean> getTitleBarDarkMode() {
        return this.titleBarDarkMode;
    }

    @NotNull
    public final TomatoLiveData getTomatoData() {
        return this.tomatoData;
    }

    @NotNull
    public final MediatorLiveData<Integer> getVolumeData() {
        return this.volumeData;
    }

    public final void loadCloudMusic(boolean isClear) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new g(isClear, null), 2, null);
    }

    public final void loadDeviceMusic() {
        earbudLaunch(null, true, new h(null));
    }

    public final void loadMusicState() {
        earbudLaunch(null, true, new i(null));
    }

    public final void musicControl(@NotNull MusicControlCmd cmd) {
        earbudLaunch(EarbudLoadingType.SET_MUSIC, true, new l(cmd, null));
    }

    @Override // androidx.p008lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.tomatoData.cancelTask();
        this.restData.cancelTask();
        Disposable disposable = this.mDisposable;
        if (disposable.isDisposed()) {
            disposable = null;
        }
        if (disposable == null) {
            return;
        }
        disposable.dispose();
    }

    public final void refreshCloudMusic() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new m(null), 2, null);
    }

    public final void refreshDeviceMusic() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new n(null), 2, null);
    }

    public final void refreshMusicNames() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new o(null), 2, null);
    }

    public final void removeDownload(long musicId, boolean isCancel) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new p(musicId, isCancel, null), 2, null);
    }

    public final void setDarkMode(boolean isDark) {
        this.isDarkMode.postValue(Boolean.valueOf(isDark));
    }

    public final void setRest(int minute, int status) {
        earbudLaunch(EarbudLoadingType.SET_MUSIC, true, new q(minute, status, null));
    }

    public final void setShowDelete(boolean show) {
        if (Intrinsics.areEqual(Boolean.valueOf(show), this.showDelete.getValue())) {
            return;
        }
        this.showDelete.postValue(Boolean.valueOf(show));
    }

    public final void setShowDeviceMusic(boolean show) {
        this.showDeviceMusic.postValue(Boolean.valueOf(show));
    }

    public final void setTomato(int minute, int restMinute, int status) {
        earbudLaunch(EarbudLoadingType.SET_MUSIC, true, new r(minute, restMinute, status, null));
    }

    public final void setVolume(short volume) {
        earbudLaunch(EarbudLoadingType.SET_VOLUME, true, new s(volume, null));
    }

    public final void switchMusic(long musicId) {
        earbudLaunch(EarbudLoadingType.SET_MUSIC, true, new t(musicId, null));
    }
}
