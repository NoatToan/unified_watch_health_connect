package com.xiaomi.hm.health.device.earbud.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.injection.keeper.KeeperProxyApi;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.watch.companion.ecg.media.ExoMediaPlayHelper;
import com.loc.z;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.scwang.smartrefresh.layout.listener.OnLoadmoreListener;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.databases.model.EarbudMusicInfo;
import com.xiaomi.hm.health.device.earbud.adapter.EarbudCloudMusicAdapter;
import com.xiaomi.hm.health.device.earbud.fragment.EarbudCloudMusicFragment;
import com.xiaomi.hm.health.device.earbud.fragment.dialog.EarbudAddDownloadTipDialog;
import com.xiaomi.hm.health.device.earbud.model.EarbudDeviceLeftSizeResult;
import com.xiaomi.hm.health.device.earbud.service.EarbudMusicDownloadService;
import com.xiaomi.hm.health.device.earbud.service.MusicDownloadStatus;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudMusicViewModel;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 Q2\u00020\u00012\u00020\u0002:\u0001QB\u0007¢\u0006\u0004\bO\u0010PJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J&\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J\u0006\u0010\u001b\u001a\u00020\u0003J\b\u0010\u001c\u001a\u00020\u0003H\u0016R\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010'\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u001d\u0010,\u001a\u00020(8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R+\u0010;\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R+\u0010B\u001a\u00020<2\u0006\u00104\u001a\u00020<8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b=\u00106\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00102R\u001d\u0010I\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010\u001f\u001a\u0004\bG\u0010HR\u001d\u0010N\u001a\u00020J8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010\u001f\u001a\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/fragment/EarbudCloudMusicFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "z", "K", "Lcom/xiaomi/hm/health/databases/model/EarbudMusicInfo;", WebConstant.QueryParam.TYPE_MUSIC, "H", "l", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "E", "m", "L", "", "y", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "onCreateView", "onViewCreated", "onResume", "stopMusic", "onPause", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "a", "Lkotlin/Lazy;", "t", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudMusicViewModel;", "mViewModel", "Lcom/huami/watch/companion/ecg/media/ExoMediaPlayHelper;", "b", SOAP.XMLNS, "()Lcom/huami/watch/companion/ecg/media/ExoMediaPlayHelper;", "mPlayer", "Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudCloudMusicAdapter;", "c", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudCloudMusicAdapter;", "mAdapter", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", GoogleApiAvailabilityLight.a, "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDialog", "e", "Z", "mShowLoading", "<set-?>", "f", "Lkotlin/properties/ReadWriteProperty;", "r", "()Landroid/view/View;", "G", "(Landroid/view/View;)V", "mMusicLoadingView", "Landroid/widget/TextView;", "g", DTransferConstants.SEARCH_KEY, "()Landroid/widget/TextView;", "F", "(Landroid/widget/TextView;)V", "mLoadFailTipText", "h", "mNeedStopAudio", "Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "i", "o", "()Lcom/huami/devicex/injection/keeper/KeeperProxyApi;", "keeperProxyApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", z.j, GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class EarbudCloudMusicFragment extends Fragment implements KoinComponent {
    public static final /* synthetic */ KProperty<Object>[] k;
    private static final int l;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDialog;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mMusicLoadingView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final ReadWriteProperty mLoadFailTipText;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean mNeedStopAudio;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy keeperProxyApi;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EarbudMusicViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudCloudMusicFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudCloudMusicFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.requireActivity().getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPlayer = LazyKt__LazyJVMKt.lazy(e.a);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(d.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean mShowLoading = true;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "isPlay", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Boolean, Unit> {
        public final /* synthetic */ EarbudMusicInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EarbudMusicInfo earbudMusicInfo) {
            super(1);
            this.b = earbudMusicInfo;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            if (z) {
                EarbudCloudMusicFragment.this.p().setAuditionId(this.b.getId().longValue());
            } else {
                EarbudCloudMusicFragment.this.p().setAuditionId(-1L);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit getA() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            Toast.makeText(EarbudCloudMusicFragment.this.requireContext(), R.string.load_failed, 0).show();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/model/EarbudDeviceLeftSizeResult;", "result", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<EarbudDeviceLeftSizeResult, Unit> {
        public final /* synthetic */ EarbudMusicInfo b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EarbudMusicInfo earbudMusicInfo) {
            super(1);
            this.b = earbudMusicInfo;
        }

        public final void a(@NotNull EarbudDeviceLeftSizeResult earbudDeviceLeftSizeResult) {
            LoadingDialog loadingDialog = EarbudCloudMusicFragment.this.mLoadingDialog;
            if (loadingDialog != null) {
                loadingDialog.dismiss();
            }
            int status = earbudDeviceLeftSizeResult.getStatus();
            if (status == 2) {
                Toast.makeText(EarbudCloudMusicFragment.this.requireContext(), R.string.earbud_get_left_size_error, 0).show();
                return;
            }
            if (status == 3) {
                Toast.makeText(EarbudCloudMusicFragment.this.requireContext(), R.string.amazfit_watch_query_failed, 0).show();
                return;
            }
            if (earbudDeviceLeftSizeResult.getLeftSize() > 0) {
                EarbudCloudMusicFragment.this.L();
                return;
            }
            if (EarbudCloudMusicFragment.this.o().isShowEarbudDownloadTip()) {
                new EarbudAddDownloadTipDialog().show(EarbudCloudMusicFragment.this.getChildFragmentManager(), "Download Tip");
                EarbudCloudMusicFragment.this.o().setShowEarbudDeleteTip(false);
            }
            EarbudCloudMusicFragment.this.t().addMusicToDownload(this.b.getId().longValue());
            EarbudMusicInfo downloadingMusic = EarbudCloudMusicFragment.this.t().getDownloadingMusic();
            Long id = downloadingMusic == null ? null : downloadingMusic.getId();
            if (id == null || Intrinsics.areEqual(id, this.b.getId())) {
                EarbudMusicDownloadService.INSTANCE.startDownload(EarbudCloudMusicFragment.this.requireContext());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(EarbudDeviceLeftSizeResult earbudDeviceLeftSizeResult) {
            a(earbudDeviceLeftSizeResult);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudCloudMusicAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EarbudCloudMusicAdapter> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudCloudMusicAdapter getA() {
            return new EarbudCloudMusicAdapter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/media/ExoMediaPlayHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<ExoMediaPlayHelper> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExoMediaPlayHelper getA() {
            return new ExoMediaPlayHelper(true);
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[7];
        kPropertyArr[3] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(EarbudCloudMusicFragment.class), "mMusicLoadingView", "getMMusicLoadingView()Landroid/view/View;"));
        kPropertyArr[4] = Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(EarbudCloudMusicFragment.class), "mLoadFailTipText", "getMLoadFailTipText()Landroid/widget/TextView;"));
        k = kPropertyArr;
        INSTANCE = new Companion(null);
        l = 67;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EarbudCloudMusicFragment() {
        Delegates delegates = Delegates.INSTANCE;
        this.mMusicLoadingView = delegates.notNull();
        this.mLoadFailTipText = delegates.notNull();
        this.mNeedStopAudio = true;
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.keeperProxyApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<KeeperProxyApi>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudCloudMusicFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.keeper.KeeperProxyApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final KeeperProxyApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(KeeperProxyApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudCloudMusicFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(EarbudCloudMusicFragment earbudCloudMusicFragment, List list) {
        earbudCloudMusicFragment.mShowLoading = false;
        earbudCloudMusicFragment.K();
        if (list == null) {
            return;
        }
        earbudCloudMusicFragment.p().setNewData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(EarbudCloudMusicFragment earbudCloudMusicFragment, Boolean bool) {
        View view = earbudCloudMusicFragment.getView();
        ((SmartRefreshLayout) (view == null ? null : view.findViewById(R.id.pull_view))).finishLoadmore(Intrinsics.areEqual(bool, Boolean.TRUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(EarbudCloudMusicFragment earbudCloudMusicFragment, Boolean bool) {
        View view = earbudCloudMusicFragment.getView();
        ((SmartRefreshLayout) (view == null ? null : view.findViewById(R.id.pull_view))).setLoadmoreFinished(Intrinsics.areEqual(bool, Boolean.TRUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(EarbudCloudMusicFragment earbudCloudMusicFragment, MusicDownloadStatus musicDownloadStatus) {
        earbudCloudMusicFragment.p().setDownloadProgress(musicDownloadStatus);
    }

    private final void E(View view, EarbudMusicInfo music) throws Exception {
        Integer localStatus;
        Integer localStatus2;
        if (getActivity() == null) {
            return;
        }
        if (view.getId() == R.id.download_btn && (((localStatus = music.getLocalStatus()) != null && localStatus.intValue() == -1) || ((localStatus2 = music.getLocalStatus()) != null && localStatus2.intValue() == 0))) {
            m(music);
        }
        if (view.getId() == R.id.music_name) {
            long auditionId = p().getAuditionId();
            int i = l;
            if (auditionId == i && ((int) music.getId().longValue()) == i) {
                n().startEarbudBreathTrainActivity(requireActivity());
                this.mNeedStopAudio = false;
                l(music);
            }
        }
    }

    private final void F(TextView textView) {
        this.mLoadFailTipText.setValue(this, k[4], textView);
    }

    private final void G(View view) {
        this.mMusicLoadingView.setValue(this, k[3], view);
    }

    private final void H(final EarbudMusicInfo music) throws Exception {
        if (y()) {
            return;
        }
        if (o().isShowEarbudAuditionDialog()) {
            new AlertDialogFragment.Builder(requireActivity()).setMessage(getString(R.string.earbud_audition_message)).setCancelable(false).setNegativeButton(R.string.no_tip, new DialogInterface.OnClickListener() { // from class: ud1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) throws Exception {
                    EarbudCloudMusicFragment.I(this.a, music, dialogInterface, i);
                }
            }).setPositiveButton(R.string.i_know, new DialogInterface.OnClickListener() { // from class: vd1
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) throws Exception {
                    EarbudCloudMusicFragment.J(this.a, music, dialogInterface, i);
                }
            }).show(getChildFragmentManager(), "Size Not Enough");
        } else {
            l(music);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(EarbudCloudMusicFragment earbudCloudMusicFragment, EarbudMusicInfo earbudMusicInfo, DialogInterface dialogInterface, int i) throws Exception {
        earbudCloudMusicFragment.o().setShowEarbudAuditionDialog(false);
        earbudCloudMusicFragment.l(earbudMusicInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(EarbudCloudMusicFragment earbudCloudMusicFragment, EarbudMusicInfo earbudMusicInfo, DialogInterface dialogInterface, int i) throws Exception {
        earbudCloudMusicFragment.l(earbudMusicInfo);
    }

    private final void K() {
        r().setVisibility(this.mShowLoading ? 0 : 8);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        q().setText(NetUtil.isNetworkConnected(activity) ? R.string.earbud_empty_tip_with_net : R.string.earbud_empty_tip);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L() {
        new AlertDialogFragment.Builder(requireActivity()).setTitle(R.string.earbud_size_not_enough).setMessage(getString(R.string.earbud_size_not_enough_msg)).setCancelable(false).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.earbud_delete_now, new DialogInterface.OnClickListener() { // from class: sd1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                EarbudCloudMusicFragment.M(this.a, dialogInterface, i);
            }
        }).show(getChildFragmentManager(), "Size Not Enough");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(EarbudCloudMusicFragment earbudCloudMusicFragment, DialogInterface dialogInterface, int i) {
        earbudCloudMusicFragment.t().setShowDeviceMusic(true);
        earbudCloudMusicFragment.t().setShowDelete(true);
    }

    private final void initView() {
        p().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: ce1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i) throws Exception {
                EarbudCloudMusicFragment.u(this.a, baseQuickAdapter, view, i);
            }
        });
        p().setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: be1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i) throws Exception {
                EarbudCloudMusicFragment.v(this.a, baseQuickAdapter, view, i);
            }
        });
        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireActivity());
        View view = getView();
        ((RecyclerView) (view == null ? null : view.findViewById(R.id.music_list))).setLayoutManager(linearLayoutManager);
        EarbudCloudMusicAdapter earbudCloudMusicAdapterP = p();
        View view2 = getView();
        earbudCloudMusicAdapterP.bindToRecyclerView((RecyclerView) (view2 == null ? null : view2.findViewById(R.id.music_list)));
        p().setEmptyView(R.layout.view_earbud_music_empty);
        G(p().getEmptyView().findViewById(R.id.loading_content));
        F((TextView) p().getEmptyView().findViewById(R.id.tip));
        p().getEmptyView().setOnClickListener(new View.OnClickListener() { // from class: wd1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                EarbudCloudMusicFragment.w(this.a, view3);
            }
        });
        View view3 = getView();
        ((SmartRefreshLayout) (view3 == null ? null : view3.findViewById(R.id.pull_view))).setEnableRefresh(false);
        View view4 = getView();
        ((SmartRefreshLayout) (view4 == null ? null : view4.findViewById(R.id.pull_view))).setEnableLoadmore(true);
        View view5 = getView();
        ((SmartRefreshLayout) (view5 == null ? null : view5.findViewById(R.id.pull_view))).setEnableAutoLoadmore(true);
        View view6 = getView();
        ((SmartRefreshLayout) (view6 == null ? null : view6.findViewById(R.id.pull_view))).setEnableFooterTranslationContent(true);
        View view7 = getView();
        ((SmartRefreshLayout) (view7 == null ? null : view7.findViewById(R.id.pull_view))).setEnableLoadmoreWhenContentNotFull(true);
        View view8 = getView();
        ((SmartRefreshLayout) (view8 == null ? null : view8.findViewById(R.id.pull_view))).setOnLoadmoreListener(new OnLoadmoreListener() { // from class: td1
            @Override // com.scwang.smartrefresh.layout.listener.OnLoadmoreListener
            public final void onLoadmore(RefreshLayout refreshLayout) {
                EarbudCloudMusicFragment.x(this.a, refreshLayout);
            }
        });
        View view9 = getView();
        ((RecyclerView) (view9 != null ? view9.findViewById(R.id.music_list) : null)).addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.xiaomi.hm.health.device.earbud.fragment.EarbudCloudMusicFragment.initView.5
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NotNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
                if (dy > 0) {
                    List<EarbudMusicInfo> data = EarbudCloudMusicFragment.this.p().getData();
                    if (data == null || data.isEmpty()) {
                        return;
                    }
                    View view10 = EarbudCloudMusicFragment.this.getView();
                    if (((SmartRefreshLayout) (view10 == null ? null : view10.findViewById(R.id.pull_view))).getState() == RefreshState.None) {
                        View view11 = EarbudCloudMusicFragment.this.getView();
                        if (((SmartRefreshLayout) (view11 == null ? null : view11.findViewById(R.id.pull_view))).isLoadmoreFinished() || linearLayoutManager.findLastVisibleItemPosition() != EarbudCloudMusicFragment.this.p().getA() - 1) {
                            return;
                        }
                        View view12 = EarbudCloudMusicFragment.this.getView();
                        ((SmartRefreshLayout) (view12 != null ? view12.findViewById(R.id.pull_view) : null)).autoLoadmore();
                    }
                }
            }
        });
    }

    private final void l(EarbudMusicInfo music) throws Exception {
        if (y()) {
            return;
        }
        s().stop();
        s().setUrl(requireActivity(), music.getAudio(), null);
        s().play(new a(music), new b());
    }

    private final void m(EarbudMusicInfo music) {
        if (y()) {
            return;
        }
        LoadingDialog loadingDialog = this.mLoadingDialog;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        this.mLoadingDialog = LoadingDialog.showDialog(requireContext(), getString(R.string.loading));
        t().checkDeviceLeftSize(music, new c(music));
    }

    private final DeviceXNavigator n() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final KeeperProxyApi o() {
        return (KeeperProxyApi) this.keeperProxyApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarbudCloudMusicAdapter p() {
        return (EarbudCloudMusicAdapter) this.mAdapter.getValue();
    }

    private final TextView q() {
        return (TextView) this.mLoadFailTipText.getValue(this, k[4]);
    }

    private final View r() {
        return (View) this.mMusicLoadingView.getValue(this, k[3]);
    }

    private final ExoMediaPlayHelper s() {
        return (ExoMediaPlayHelper) this.mPlayer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarbudMusicViewModel t() {
        return (EarbudMusicViewModel) this.mViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(EarbudCloudMusicFragment earbudCloudMusicFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) throws Exception {
        Object obj = baseQuickAdapter.getData().get(i);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.EarbudMusicInfo");
        EarbudMusicInfo earbudMusicInfo = (EarbudMusicInfo) obj;
        long auditionId = earbudCloudMusicFragment.p().getAuditionId();
        Long id = earbudMusicInfo.getId();
        if (id != null && auditionId == id.longValue()) {
            earbudCloudMusicFragment.s().stop();
        } else {
            earbudCloudMusicFragment.H(earbudMusicInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(EarbudCloudMusicFragment earbudCloudMusicFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) throws Exception {
        Object obj = baseQuickAdapter.getData().get(i);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.xiaomi.hm.health.databases.model.EarbudMusicInfo");
        earbudCloudMusicFragment.E(view, (EarbudMusicInfo) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(EarbudCloudMusicFragment earbudCloudMusicFragment, View view) {
        if (earbudCloudMusicFragment.mShowLoading) {
            return;
        }
        earbudCloudMusicFragment.mShowLoading = true;
        earbudCloudMusicFragment.K();
        EarbudMusicViewModel.loadCloudMusic$default(earbudCloudMusicFragment.t(), false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(EarbudCloudMusicFragment earbudCloudMusicFragment, RefreshLayout refreshLayout) {
        EarbudMusicViewModel.loadCloudMusic$default(earbudCloudMusicFragment.t(), false, 1, null);
    }

    private final boolean y() {
        boolean z = !NetUtil.isNetworkConnected(requireContext());
        if (z) {
            Toast.makeText(requireContext(), R.string.no_network_connection, 0).show();
        }
        return z;
    }

    private final void z() {
        t().getMusicListData().observe(this, new Observer() { // from class: ae1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudCloudMusicFragment.A(this.a, (List) obj);
            }
        });
        t().getLoadMoreResult().observe(this, new Observer() { // from class: zd1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudCloudMusicFragment.B(this.a, (Boolean) obj);
            }
        });
        t().getCloudMusicLoadFinish().observe(this, new Observer() { // from class: yd1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudCloudMusicFragment.C(this.a, (Boolean) obj);
            }
        });
        t().getDownloadStatusData().observe(this, new Observer() { // from class: xd1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EarbudCloudMusicFragment.D(this.a, (MusicDownloadStatus) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_earbud_music_list, container, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        stopMusic();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        K();
        this.mNeedStopAudio = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        z();
    }

    public final void stopMusic() {
        if (this.mNeedStopAudio) {
            s().stop();
        }
    }
}
