package com.xiaomi.hm.health.play.card.intelligence;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.CustomToast;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.databinding.LayoutToolAlarmBinding;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.alarm.AlarmClockManager;
import com.xiaomi.hm.health.play.card.AbstractDeviceCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.intelligence.AlarmRender;
import com.xiaomi.hm.health.play.intelligence.IntelligenceViewModel;
import com.xiaomi.hm.health.ui.smartplay.MiBandAlarmActivity;
import com.xiaomi.hm.health.ui.smartplay.SetAlarmActivity;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002J\u0018\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0018\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u001c\u001a\u00020\u0005H\u0016J\b\u0010\u001d\u001a\u00020\u0005H\u0016J\b\u0010\u001e\u001a\u00020\u0005H\u0016R\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u00101\u001a\n .*\u0004\u0018\u00010-0-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001c\u00105\u001a\b\u0012\u0004\u0012\u000203028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00104¨\u0006:"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/AlarmRender;", "Lcom/xiaomi/hm/health/play/card/AbstractDeviceCardRender;", "Lcom/xiaomi/hm/health/databinding/LayoutToolAlarmBinding;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "t", "", "isDeviceActive", DTransferConstants.SEARCH_KEY, "deviceConnected", "w", com.google.android.exoplayer2.text.ttml.b.r, "", "position", "isDone", "r", SOAP.XMLNS, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "setCommonData", "setDeviceData", "onDeviceNotConnected", "onDeviceNotActive", "onClear", "Lcom/xiaomi/hm/health/play/intelligence/IntelligenceViewModel;", hl.k, "Lkotlin/Lazy;", "o", "()Lcom/xiaomi/hm/health/play/intelligence/IntelligenceViewModel;", "intelligenceViewModel", "Landroidx/fragment/app/FragmentActivity;", "l", "Landroidx/fragment/app/FragmentActivity;", "mActivity", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "m", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingHelper", "Lcom/xiaomi/hm/health/device/alarm/AlarmClockManager;", "kotlin.jvm.PlatformType", GoogleApiAvailabilityLight.b, "Lcom/xiaomi/hm/health/device/alarm/AlarmClockManager;", "alarmManager", "", "Lcom/xiaomi/hm/health/databases/model/Alarm;", "Ljava/util/List;", "alarmList", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class AlarmRender extends AbstractDeviceCardRender<LayoutToolAlarmBinding> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy intelligenceViewModel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    private FragmentActivity mActivity;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingHelper;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final AlarmClockManager alarmManager;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    private List<Alarm> alarmList;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function2<Integer, Boolean, Unit> {
        public a(AlarmRender alarmRender) {
            super(2, alarmRender, AlarmRender.class, "onDone", "onDone(IZ)V", 0);
        }

        public final void a(int i, boolean z) {
            ((AlarmRender) this.receiver).r(i, z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, Boolean bool) {
            a(num.intValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public b(AlarmRender alarmRender) {
            super(1, alarmRender, AlarmRender.class, "onEdit", "onEdit(I)V", 0);
        }

        public final void a(int i) {
            ((AlarmRender) this.receiver).s(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "添加闹钟时id是：" + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlarmRender(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.intelligence.AlarmRender$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.intelligenceViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<IntelligenceViewModel>() { // from class: com.xiaomi.hm.health.play.card.intelligence.AlarmRender$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.intelligence.IntelligenceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final IntelligenceViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(IntelligenceViewModel.class), function0, objArr);
            }
        });
        this.alarmManager = AlarmClockManager.getInstance();
        this.alarmList = new ArrayList();
        if (lifecycleOwner instanceof FragmentActivity) {
            this.mActivity = (FragmentActivity) lifecycleOwner;
            this.loadingHelper = new LoadingDialogHelper((Activity) lifecycleOwner);
        }
        o().getAlarmLiveData().observe(lifecycleOwner, new Observer() { // from class: ib
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AlarmRender.m(this.a, (List) obj);
            }
        });
        o().getSwitchAlarmLiveData().observe(lifecycleOwner, new Observer() { // from class: jb
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                AlarmRender.n(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(AlarmRender alarmRender, List list) {
        alarmRender.alarmList.clear();
        alarmRender.alarmList.addAll(list);
        alarmRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(AlarmRender alarmRender, List list) {
        LoadingDialogHelper loadingDialogHelper = alarmRender.loadingHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.hideLoading();
        }
        alarmRender.alarmList = list;
        alarmRender.updateUi();
    }

    private final IntelligenceViewModel o() {
        return (IntelligenceViewModel) this.intelligenceViewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p(final Context context) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        List<Alarm> list = this.alarmList;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.alarmList.size();
        layoutToolAlarmBinding.toolAlarmRecycler.setLayoutManager(new LinearLayoutManager(context) { // from class: com.xiaomi.hm.health.play.card.intelligence.AlarmRender$initRecycler$1$1
            public final /* synthetic */ Context a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context);
                this.a = context;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        });
        layoutToolAlarmBinding.toolAlarmRecycler.setAdapter(new AlarmAdapter(context, size > 4 ? this.alarmList.subList(0, 4) : this.alarmList, this.alarmManager, new a(this), new b(this)));
    }

    private final boolean q(boolean isDeviceActive) {
        if (isDeviceActive) {
            return HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI) != HMDeviceSource.VDEVICE;
        }
        boolean z = false;
        for (Device device : HMDeviceManager.getDeviceListOrdered()) {
            HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
            Integer device_type = device.getDevice_type();
            z = (device_type == null || device_type.intValue() != HMDeviceType.MILI.getValue() || hMDeviceSourceFromValue == HMDeviceSource.MILI_ANETO) ? false : true;
            if (z) {
                return true;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(int position, boolean isDone) {
        LoadingDialogHelper loadingDialogHelper = this.loadingHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showLoading(R.string.play_tool_syncing);
        }
        o().switchAlarm(this.alarmList, position, isDone);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(int position) {
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity == null) {
            return;
        }
        SetAlarmActivity.launch(fragmentActivity, 0, this.alarmList.get(position).getIndex().intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void t(final Context context) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        layoutToolAlarmBinding.toolAlarmAdd.setOnClickListener(new View.OnClickListener() { // from class: hb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlarmRender.u(this.a, view);
            }
        });
        layoutToolAlarmBinding.toolAlarmMore.setOnClickListener(new View.OnClickListener() { // from class: gb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AlarmRender.v(context, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(AlarmRender alarmRender, View view) {
        FragmentActivity fragmentActivity = alarmRender.mActivity;
        if (fragmentActivity == null) {
            return;
        }
        if (!alarmRender.isConnected()) {
            alarmRender.showDeviceNotConnectTip(fragmentActivity);
            return;
        }
        int availableId = alarmRender.alarmManager.getAvailableId();
        HMLog.info$default(null, new c(availableId), 1, null);
        if (alarmRender.alarmManager.isNormalAlarmSize()) {
            if (availableId < 0 || availableId > 2) {
                CustomToast.showShort(fragmentActivity, fragmentActivity.getResources().getString(R.string.add_alarm_tips, 3));
                return;
            } else {
                SetAlarmActivity.launch(fragmentActivity, 1, availableId);
                return;
            }
        }
        if (availableId < 0 || availableId > 9) {
            CustomToast.showShort(fragmentActivity, fragmentActivity.getResources().getString(R.string.add_alarm_tips, 10));
        } else {
            SetAlarmActivity.launch(fragmentActivity, 1, availableId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) MiBandAlarmActivity.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void w(boolean deviceConnected, boolean isDeviceActive) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        int size = this.alarmList.size();
        boolean zQ = q(isDeviceActive);
        int i = 8;
        if (zQ) {
            layoutToolAlarmBinding.toolAlarmSubTitle.setVisibility(8);
            layoutToolAlarmBinding.toolAlarmAdd.setVisibility(0);
            layoutToolAlarmBinding.toolAlarmAddIcon.setVisibility(0);
        } else {
            layoutToolAlarmBinding.toolAlarmSubTitle.setVisibility(0);
            layoutToolAlarmBinding.toolAlarmAdd.setVisibility(8);
            layoutToolAlarmBinding.toolAlarmAddIcon.setVisibility(8);
        }
        layoutToolAlarmBinding.toolAlarmNotActive.setVisibility((!zQ || deviceConnected) ? 8 : 0);
        layoutToolAlarmBinding.toolNoAlarm.setVisibility((zQ && deviceConnected && size <= 0) ? 0 : 8);
        layoutToolAlarmBinding.toolAlarmRecycler.setVisibility((zQ && deviceConnected && size > 0) ? 0 : 8);
        ConstraintLayout constraintLayout = layoutToolAlarmBinding.toolAlarmMore;
        if (zQ && deviceConnected && size > 4) {
            i = 0;
        }
        constraintLayout.setVisibility(i);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull Context context, @NotNull CardUiData uiParams) {
        super.initData(context, uiParams);
        o().getShowAlarm();
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender, com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        o().getAlarmLiveData().removeObservers(getLifecycleOwner());
        o().getSwitchAlarmLiveData().removeObservers(getLifecycleOwner());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotActive() {
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmNotActive.setText(R.string.play_device_not_active);
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmSubTitle.setText(R.string.play_device_not_active);
        w(false, false);
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmAdd.setClickable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotConnected() {
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmNotActive.setText(R.string.training_playing_hr_exception_device_disconnect);
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmSubTitle.setText(R.string.training_playing_hr_exception_device_disconnect);
        w(false, true);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setCommonData(@NotNull Context context, @NotNull CardUiData uiParams) {
        t(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setDeviceData(@NotNull Context context, @NotNull CardUiData uiParams) {
        w(true, true);
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmSubTitle.setText(R.string.play_tool_alarm_subtitle);
        p(context);
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmAdd.setClickable(true);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public LayoutToolAlarmBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return LayoutToolAlarmBinding.inflate(inflater, rootView, true);
    }
}
