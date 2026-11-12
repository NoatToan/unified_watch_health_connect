package com.xiaomi.hm.health.device.assistant.smart;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.view.OnBackPressedCallback;
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherKt;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.devicex.R;
import com.huami.devicex.databinding.FragmentSmartCardsSettingBinding;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.loc.z;
import com.xiaomi.hm.health.device.assistant.smart.SmartCardSettingFragment;
import com.xiaomi.hm.health.device.assistant.smart.vo.DisplayItemVoConvert;
import com.xiaomi.hm.health.device.assistant.smart.vo.ItemVo;
import com.xiaomi.hm.health.device.assistant.viewmodel.SmartCardsSettingViewModel;
import com.xiaomi.hm.health.device.assistant.viewmodel.UpdateStatus;
import com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment;
import com.xiaomi.hm.health.device.setting.viewmodel.FeatureViewModel;
import com.xiaomi.hm.health.device.setting.vo.ConnectStatus;
import com.xiaomi.hm.health.device.setting.vo.DeviceConnectedVo;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b5\u00106J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0003H\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u000f\u001a\u00020\u0003H\u0002J$\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\u001a\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010$\u001a\u0004\u0018\u00010 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R\u001d\u0010-\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b+\u0010,R\u001d\u00101\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001c\u001a\u0004\b/\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u00103¨\u00067"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/SmartCardSettingFragment;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/AbstractDeviceFragment;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "", z.j, "z", "", "limitSize", "w", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "isEnable", "B", DTransferConstants.SEARCH_KEY, com.google.android.exoplayer2.text.ttml.b.r, "C", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Landroidx/activity/OnBackPressedDispatcher;", "g", "Lkotlin/Lazy;", "l", "()Landroidx/activity/OnBackPressedDispatcher;", "dispatcher", "Lcom/xiaomi/hm/health/device/assistant/viewmodel/SmartCardsSettingViewModel;", "h", "o", "()Lcom/xiaomi/hm/health/device/assistant/viewmodel/SmartCardsSettingViewModel;", "smartCardsViewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "i", GoogleApiAvailabilityLight.b, "()Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingHelper", "Lcom/xiaomi/hm/health/device/assistant/smart/AssistantCardAdapter;", hl.k, "()Lcom/xiaomi/hm/health/device/assistant/smart/AssistantCardAdapter;", "adapter", "Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVoConvert;", "m", "()Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVoConvert;", "displayMapper", "Lcom/huami/devicex/databinding/FragmentSmartCardsSettingBinding;", "Lcom/huami/devicex/databinding/FragmentSmartCardsSettingBinding;", "_binding", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SmartCardSettingFragment extends AbstractDeviceFragment implements KoinComponentAdapter {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy dispatcher = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy smartCardsViewModel = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingHelper = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy displayMapper = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private FragmentSmartCardsSettingBinding _binding;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateStatus.values().length];
            iArr[UpdateStatus.LOADING.ordinal()] = 1;
            iArr[UpdateStatus.SUCCESS.ordinal()] = 2;
            iArr[UpdateStatus.SAVING.ordinal()] = 3;
            iArr[UpdateStatus.SAVE_FAIL.ordinal()] = 4;
            iArr[UpdateStatus.SAVE_SUCCESS.ordinal()] = 5;
            iArr[UpdateStatus.FAIL.ordinal()] = 6;
            iArr[UpdateStatus.TIMEOUT.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/AssistantCardAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<AssistantCardAdapter> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.assistant.smart.SmartCardSettingFragment$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class C0802a extends FunctionReferenceImpl implements Function0<Unit> {
            public C0802a(SmartCardSettingFragment smartCardSettingFragment) {
                super(0, smartCardSettingFragment, SmartCardSettingFragment.class, "resortAction", "resortAction()V", 0);
            }

            public final void a() {
                ((SmartCardSettingFragment) this.receiver).z();
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public /* bridge */ /* synthetic */ Unit getA() {
                a();
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Integer, Unit> {
            public b(SmartCardSettingFragment smartCardSettingFragment) {
                super(1, smartCardSettingFragment, SmartCardSettingFragment.class, "onLimitAction", "onLimitAction(I)V", 0);
            }

            public final void a(int i) {
                ((SmartCardSettingFragment) this.receiver).w(i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                a(num.intValue());
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AssistantCardAdapter getA() {
            return new AssistantCardAdapter(new C0802a(SmartCardSettingFragment.this), new b(SmartCardSettingFragment.this), 0, 4, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedDispatcher;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<OnBackPressedDispatcher> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final OnBackPressedDispatcher getA() {
            return SmartCardSettingFragment.this.requireActivity().getOnBackPressedDispatcher();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/smart/vo/DisplayItemVoConvert;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<DisplayItemVoConvert> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DisplayItemVoConvert getA() {
            return new DisplayItemVoConvert();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<LoadingDialogHelper> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper getA() {
            return new LoadingDialogHelper(SmartCardSettingFragment.this.requireActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<OnBackPressedCallback, Unit> {
        public e() {
            super(1);
        }

        public final void a(@NotNull OnBackPressedCallback onBackPressedCallback) {
            onBackPressedCallback.setEnabled(true);
            SmartCardSettingFragment.this.j();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OnBackPressedCallback onBackPressedCallback) {
            a(onBackPressedCallback);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/assistant/viewmodel/SmartCardsSettingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<SmartCardsSettingViewModel> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SmartCardsSettingViewModel getA() {
            return (SmartCardsSettingViewModel) SmartCardSettingFragment.this.loadViewModel(SmartCardsSettingViewModel.class);
        }
    }

    private final void A() {
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding = this._binding;
        Objects.requireNonNull(fragmentSmartCardsSettingBinding);
        if (!fragmentSmartCardsSettingBinding.tvSave.isEnabled()) {
            FragmentKt.findNavController(this).navigateUp();
            return;
        }
        SmartCardsSettingViewModel smartCardsSettingViewModelO = o();
        if (smartCardsSettingViewModelO == null) {
            return;
        }
        smartCardsSettingViewModelO.updateCards(k().getData());
    }

    private final void B(boolean isEnable) {
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding = this._binding;
        Objects.requireNonNull(fragmentSmartCardsSettingBinding);
        ViewExKt.setVisible(fragmentSmartCardsSettingBinding.maskView, isEnable);
    }

    private final void C() {
        new AlertDialogFragment.Builder(getContext()).setMessage(R.string.sort_save_cancle).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: u37
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SmartCardSettingFragment.D(dialogInterface, i);
            }
        }).setPositiveButton(R.string.give_up, new DialogInterface.OnClickListener() { // from class: t37
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SmartCardSettingFragment.E(this.a, dialogInterface, i);
            }
        }).create().show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(SmartCardSettingFragment smartCardSettingFragment, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        FragmentKt.findNavController(smartCardSettingFragment).navigateUp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding = this._binding;
        Objects.requireNonNull(fragmentSmartCardsSettingBinding);
        if (fragmentSmartCardsSettingBinding.tvSave.isEnabled()) {
            C();
        } else {
            FragmentKt.findNavController(this).navigateUp();
        }
    }

    private final AssistantCardAdapter k() {
        return (AssistantCardAdapter) this.adapter.getValue();
    }

    private final OnBackPressedDispatcher l() {
        return (OnBackPressedDispatcher) this.dispatcher.getValue();
    }

    private final DisplayItemVoConvert m() {
        return (DisplayItemVoConvert) this.displayMapper.getValue();
    }

    private final LoadingDialogHelper n() {
        return (LoadingDialogHelper) this.loadingHelper.getValue();
    }

    private final SmartCardsSettingViewModel o() {
        return (SmartCardsSettingViewModel) this.smartCardsViewModel.getValue();
    }

    private final void p() {
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding = this._binding;
        Objects.requireNonNull(fragmentSmartCardsSettingBinding);
        fragmentSmartCardsSettingBinding.rvAppCards.setLayoutManager(new LinearLayoutManager(getContext()));
        AssistantCardAdapter assistantCardAdapterK = k();
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding2 = this._binding;
        Objects.requireNonNull(fragmentSmartCardsSettingBinding2);
        assistantCardAdapterK.bindToRecyclerView(fragmentSmartCardsSettingBinding2.rvAppCards);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(new SimpleItemTouchHelperCallback(k()));
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding3 = this._binding;
        Objects.requireNonNull(fragmentSmartCardsSettingBinding3);
        itemTouchHelper.attachToRecyclerView(fragmentSmartCardsSettingBinding3.rvAppCards);
    }

    private final void q() {
        MutableLiveData<UpdateStatus> statueLiveData;
        MutableLiveData<List<ItemVo>> appCardsLiveData;
        MutableLiveData<Integer> limitLiveData;
        MutableLiveData<DeviceConnectedVo> syncStatusLiveData;
        FeatureViewModel featureViewModel = getFeatureViewModel();
        if (featureViewModel != null && (syncStatusLiveData = featureViewModel.getSyncStatusLiveData()) != null) {
            syncStatusLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: y37
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    SmartCardSettingFragment.r(this.a, (DeviceConnectedVo) obj);
                }
            });
        }
        SmartCardsSettingViewModel smartCardsSettingViewModelO = o();
        if (smartCardsSettingViewModelO != null && (limitLiveData = smartCardsSettingViewModelO.getLimitLiveData()) != null) {
            limitLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: z37
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    SmartCardSettingFragment.s(this.a, (Integer) obj);
                }
            });
        }
        SmartCardsSettingViewModel smartCardsSettingViewModelO2 = o();
        if (smartCardsSettingViewModelO2 != null && (appCardsLiveData = smartCardsSettingViewModelO2.getAppCardsLiveData()) != null) {
            appCardsLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: a47
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    SmartCardSettingFragment.t(this.a, (List) obj);
                }
            });
        }
        SmartCardsSettingViewModel smartCardsSettingViewModelO3 = o();
        if (smartCardsSettingViewModelO3 == null || (statueLiveData = smartCardsSettingViewModelO3.getStatueLiveData()) == null) {
            return;
        }
        statueLiveData.observe(getViewLifecycleOwner(), new Observer() { // from class: x37
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SmartCardSettingFragment.u(this.a, (UpdateStatus) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SmartCardSettingFragment smartCardSettingFragment, DeviceConnectedVo deviceConnectedVo) {
        smartCardSettingFragment.B(deviceConnectedVo.getConnectStatus() != ConnectStatus.CONNECTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(SmartCardSettingFragment smartCardSettingFragment, Integer num) {
        smartCardSettingFragment.k().setLimitSize(num.intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(SmartCardSettingFragment smartCardSettingFragment, List list) {
        if (list == null) {
            return;
        }
        smartCardSettingFragment.k().setNewData(smartCardSettingFragment.m().convertListForDisplay(list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final SmartCardSettingFragment smartCardSettingFragment, UpdateStatus updateStatus) {
        if (updateStatus == null) {
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[updateStatus.ordinal()]) {
            case 1:
                smartCardSettingFragment.n().showLoading();
                break;
            case 2:
                smartCardSettingFragment.n().hideLoading();
                break;
            case 3:
                smartCardSettingFragment.n().showLoading(R.string.saving);
                break;
            case 4:
                smartCardSettingFragment.n().setFail(R.string.save_failed);
                break;
            case 5:
                smartCardSettingFragment.n().setSuccess(R.string.saving_success);
                SmartCardsSettingViewModel smartCardsSettingViewModelO = smartCardSettingFragment.o();
                MutableLiveData<UpdateStatus> statueLiveData = smartCardsSettingViewModelO == null ? null : smartCardsSettingViewModelO.getStatueLiveData();
                if (statueLiveData != null) {
                    statueLiveData.setValue(null);
                }
                FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding = smartCardSettingFragment._binding;
                Objects.requireNonNull(fragmentSmartCardsSettingBinding);
                fragmentSmartCardsSettingBinding.tvSave.postDelayed(new Runnable() { // from class: b47
                    @Override // java.lang.Runnable
                    public final void run() {
                        SmartCardSettingFragment.v(this.a);
                    }
                }, 1500L);
                break;
            case 6:
            case 7:
                smartCardSettingFragment.n().setFail(R.string.load_fail);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SmartCardSettingFragment smartCardSettingFragment) {
        if (smartCardSettingFragment.isVisible()) {
            FragmentKt.findNavController(smartCardSettingFragment).navigateUp();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(int limitSize) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(SmartCardSettingFragment smartCardSettingFragment, View view) {
        smartCardSettingFragment.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(SmartCardSettingFragment smartCardSettingFragment, View view) {
        smartCardSettingFragment.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z() {
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding = this._binding;
        Objects.requireNonNull(fragmentSmartCardsSettingBinding);
        fragmentSmartCardsSettingBinding.tvSave.setEnabled(true);
        k().notifyDataSetChanged();
    }

    @Override // com.xiaomi.hm.health.device.setting.ui.subview.AbstractDeviceFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBindingInflate = FragmentSmartCardsSettingBinding.inflate(inflater, container, false);
        this._binding = fragmentSmartCardsSettingBindingInflate;
        Objects.requireNonNull(fragmentSmartCardsSettingBindingInflate);
        return fragmentSmartCardsSettingBindingInflate.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        OnBackPressedDispatcherKt.addCallback$default(l(), getViewLifecycleOwner(), false, new e(), 2, null);
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding = this._binding;
        Objects.requireNonNull(fragmentSmartCardsSettingBinding);
        fragmentSmartCardsSettingBinding.btnBack.setOnClickListener(new View.OnClickListener() { // from class: w37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SmartCardSettingFragment.x(this.a, view2);
            }
        });
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding2 = this._binding;
        Objects.requireNonNull(fragmentSmartCardsSettingBinding2);
        fragmentSmartCardsSettingBinding2.tvSave.setEnabled(false);
        FragmentSmartCardsSettingBinding fragmentSmartCardsSettingBinding3 = this._binding;
        Objects.requireNonNull(fragmentSmartCardsSettingBinding3);
        fragmentSmartCardsSettingBinding3.tvSave.setOnClickListener(new View.OnClickListener() { // from class: v37
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SmartCardSettingFragment.y(this.a, view2);
            }
        });
        p();
        q();
        SmartCardsSettingViewModel smartCardsSettingViewModelO = o();
        if (smartCardsSettingViewModelO == null) {
            return;
        }
        smartCardsSettingViewModelO.loadAppCards();
    }
}
