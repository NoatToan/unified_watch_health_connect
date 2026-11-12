package com.xiaomi.hm.health.play.card.intelligence.nfc;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.nfc.door.DoorCardInfo;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.accessdoor.helper.Resource;
import com.huami.wallet.accessdoor.viewmodel.DoorEntranceViewModel;
import com.huami.wallet.lib.entity.BusCardSimple2;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.wallet.ui.navigation.NavigationController;
import com.huami.wallet.ui.viewmodel.EntranceViewModel;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.watchfacesstore.ext.KoinExtKt;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import com.xiaomi.hm.health.databinding.PlayCardNfcLayoutBinding;
import com.xiaomi.hm.health.nfc.NfcStatus;
import com.xiaomi.hm.health.nfc.WalletFragment;
import com.xiaomi.hm.health.play.card.AbstractDeviceCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u001f\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010+\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R\u001d\u00100\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010/¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/nfc/NFCCardRender;", "Lcom/xiaomi/hm/health/play/card/AbstractDeviceCardRender;", "Lcom/xiaomi/hm/health/databinding/PlayCardNfcLayoutBinding;", "Lorg/koin/core/component/KoinComponent;", "Lcom/xiaomi/hm/health/nfc/NfcStatus;", "nfcStatus", "", "m", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "setCommonData", "setDeviceData", "onDeviceNotConnected", "onDeviceNotActive", "onClear", "Lcom/xiaomi/hm/health/play/card/intelligence/nfc/EmptyFragment;", hl.k, "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/play/card/intelligence/nfc/EmptyFragment;", "mFragment", "Lcom/huami/wallet/ui/navigation/NavigationController;", "l", "()Lcom/huami/wallet/ui/navigation/NavigationController;", "walletNavigationController", "Lcom/huami/wallet/ui/viewmodel/EntranceViewModel;", "Lcom/huami/wallet/ui/viewmodel/EntranceViewModel;", "walletEntranceViewModel", "Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel;", GoogleApiAvailabilityLight.b, "Lcom/huami/wallet/accessdoor/viewmodel/DoorEntranceViewModel;", "doorEntranceViewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "o", z.j, "()Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Landroidx/fragment/app/FragmentActivity;", com.google.android.exoplayer2.text.ttml.b.r, "i", "()Landroidx/fragment/app/FragmentActivity;", "fragmentActivity", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NFCCardRender extends AbstractDeviceCardRender<PlayCardNfcLayoutBinding> implements KoinComponent {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy mFragment;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy walletNavigationController;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private EntranceViewModel walletEntranceViewModel;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    private DoorEntranceViewModel doorEntranceViewModel;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingDialogHelper;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    private final Lazy fragmentActivity;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NfcStatus.values().length];
            iArr[NfcStatus.DEVICE_NOT_CONNECTED.ordinal()] = 1;
            iArr[NfcStatus.NETWORK_NOT_CONNECTED.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/fragment/app/FragmentActivity;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<FragmentActivity> {
        public final /* synthetic */ LifecycleOwner a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LifecycleOwner lifecycleOwner) {
            super(0);
            this.a = lifecycleOwner;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final FragmentActivity getA() {
            return (FragmentActivity) this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ NfcStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NfcStatus nfcStatus) {
            super(0);
            this.a = nfcStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "jump error " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/NfcStatus;", "nfcStatus", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<NfcStatus, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull NfcStatus nfcStatus) {
            NFCCardRender.this.m(nfcStatus);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NfcStatus nfcStatus) {
            a(nfcStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/nfc/NfcStatus;", "nfcStatus", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<NfcStatus, Unit> {
        public d() {
            super(1);
        }

        public final void a(@NotNull NfcStatus nfcStatus) {
            NFCCardRender.this.m(nfcStatus);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NfcStatus nfcStatus) {
            a(nfcStatus);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<LoadingDialogHelper> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper getA() {
            return new LoadingDialogHelper(NFCCardRender.this.i());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/nfc/EmptyFragment;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<EmptyFragment> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EmptyFragment getA() {
            return new EmptyFragment();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NFCCardRender(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        this.mFragment = LazyKt__LazyJVMKt.lazy(f.a);
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.walletNavigationController = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<NavigationController>() { // from class: com.xiaomi.hm.health.play.card.intelligence.nfc.NFCCardRender$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.wallet.ui.navigation.NavigationController, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final NavigationController getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(NavigationController.class), qualifier, objArr);
            }
        });
        this.loadingDialogHelper = LazyKt__LazyJVMKt.lazy(new e());
        this.fragmentActivity = LazyKt__LazyJVMKt.lazy(new a(lifecycleOwner));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentActivity i() {
        return (FragmentActivity) this.fragmentActivity.getValue();
    }

    private final LoadingDialogHelper j() {
        return (LoadingDialogHelper) this.loadingDialogHelper.getValue();
    }

    private final EmptyFragment k() {
        return (EmptyFragment) this.mFragment.getValue();
    }

    private final NavigationController l() {
        return (NavigationController) this.walletNavigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(NfcStatus nfcStatus) {
        int i = WhenMappings.$EnumSwitchMapping$0[nfcStatus.ordinal()];
        if (i == 1) {
            CustomToast.showShort(KoinExtKt.getAppContext(), R.string.device_disconnect_tip);
        } else if (i != 2) {
            HMLog.info("NFCCardRender", new b(nfcStatus));
        } else {
            CustomToast.showShort(KoinExtKt.getAppContext(), R.string.no_network_connection);
        }
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull Context context, @NotNull CardUiData uiParams) {
        super.initData(context, uiParams);
        k().inject(i());
        if (uiParams.getPlayTool().isDeviceActive()) {
            final EmptyFragment emptyFragmentK = k();
            EntranceViewModel entranceViewModel = (EntranceViewModel) ComponentCallbackExtKt.getViewModel(emptyFragmentK, null, Reflection.getOrCreateKotlinClass(EntranceViewModel.class), new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.intelligence.nfc.NFCCardRender$initData$$inlined$getViewModel$default$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final ViewModelOwner getA() {
                    ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                    ComponentCallbacks componentCallbacks = emptyFragmentK;
                    return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
                }
            }, null);
            this.walletEntranceViewModel = entranceViewModel;
            if (entranceViewModel != null) {
                WalletFragment.INSTANCE.bindBusView(((PlayCardNfcLayoutBinding) getBinding()).nfcBus, (Activity) getLifecycleOwner(), getLifecycleOwner(), l(), j(), entranceViewModel, new c());
            }
            final EmptyFragment emptyFragmentK2 = k();
            DoorEntranceViewModel doorEntranceViewModel = (DoorEntranceViewModel) ComponentCallbackExtKt.getViewModel(emptyFragmentK2, null, Reflection.getOrCreateKotlinClass(DoorEntranceViewModel.class), new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.intelligence.nfc.NFCCardRender$initData$$inlined$getViewModel$default$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final ViewModelOwner getA() {
                    ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                    ComponentCallbacks componentCallbacks = emptyFragmentK2;
                    return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
                }
            }, null);
            this.doorEntranceViewModel = doorEntranceViewModel;
            if (doorEntranceViewModel == null) {
                return;
            }
            WalletFragment.INSTANCE.bindDoorView(((PlayCardNfcLayoutBinding) getBinding()).nfcDoor, (Activity) getLifecycleOwner(), getLifecycleOwner(), j(), doorEntranceViewModel, new d());
        }
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender, com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        MutableLiveData<Resource<Boolean>> mutableLiveDataIsDefaultCardLiveData;
        MutableLiveData<Resource<List<DoorCardInfo>>> getCardListLiveData;
        MutableLiveData<com.huami.wallet.lib.entity.Resource<List<BusCardSimple2>>> mutableLiveData;
        MutableLiveData<com.huami.wallet.lib.entity.Resource<String>> mutableLiveData2;
        super.onClear();
        k().removeSelfFromActivity(i());
        EntranceViewModel entranceViewModel = this.walletEntranceViewModel;
        if (entranceViewModel != null && (mutableLiveData2 = entranceViewModel.cplcLiveData) != null) {
            mutableLiveData2.removeObservers(getLifecycleOwner());
        }
        EntranceViewModel entranceViewModel2 = this.walletEntranceViewModel;
        if (entranceViewModel2 != null && (mutableLiveData = entranceViewModel2.installedBusCards) != null) {
            mutableLiveData.removeObservers(getLifecycleOwner());
        }
        DoorEntranceViewModel doorEntranceViewModel = this.doorEntranceViewModel;
        if (doorEntranceViewModel != null && (getCardListLiveData = doorEntranceViewModel.getGetCardListLiveData()) != null) {
            getCardListLiveData.removeObservers(getLifecycleOwner());
        }
        DoorEntranceViewModel doorEntranceViewModel2 = this.doorEntranceViewModel;
        if (doorEntranceViewModel2 == null || (mutableLiveDataIsDefaultCardLiveData = doorEntranceViewModel2.isDefaultCardLiveData()) == null) {
            return;
        }
        mutableLiveDataIsDefaultCardLiveData.removeObservers(getLifecycleOwner());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotActive() {
        ((PlayCardNfcLayoutBinding) getBinding()).nfcBus.setClickable(false);
        ((PlayCardNfcLayoutBinding) getBinding()).nfcDoor.setClickable(false);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotConnected() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setCommonData(@NotNull Context context, @NotNull CardUiData uiParams) {
        Integer toolIconRes = uiParams.getPlayTool().getToolIconRes();
        if (toolIconRes != null) {
            ((PlayCardNfcLayoutBinding) getBinding()).llTitle.ivIcon.setImageResource(toolIconRes.intValue());
        }
        Integer toolNameRes = uiParams.getPlayTool().getToolNameRes();
        if (toolNameRes != null) {
            ((PlayCardNfcLayoutBinding) getBinding()).llTitle.tvName.setText(toolNameRes.intValue());
        }
        ExtensionsKt.visible(((PlayCardNfcLayoutBinding) getBinding()).llTitle.tvEnd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setDeviceData(@NotNull Context context, @NotNull CardUiData uiParams) {
        ((PlayCardNfcLayoutBinding) getBinding()).nfcBus.setClickable(true);
        ((PlayCardNfcLayoutBinding) getBinding()).nfcDoor.setClickable(true);
        ((PlayCardNfcLayoutBinding) getBinding()).tvDesc.setVisibility(8);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public PlayCardNfcLayoutBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return PlayCardNfcLayoutBinding.inflate(inflater, rootView, true);
    }
}
