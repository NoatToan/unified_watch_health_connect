package com.xiaomi.hm.health.device.earbud.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.gson.Gson;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.wheelview.event.EventAmPmUpdate;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.databases.model.Alarm;
import com.xiaomi.hm.health.device.BaseEarbudDeviceActivity;
import com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmActivity;
import com.xiaomi.hm.health.device.earbud.adapter.EarbudAlarmAdapter;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00014B\u0007¢\u0006\u0004\b2\u00103J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011J\"\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0014J\b\u0010\u001a\u001a\u00020\u0004H\u0014R\u001d\u0010\u001f\u001a\u00020\u00028T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010(\u001a\u00020$8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b&\u0010'R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u00100¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/activity/HmEarbudAlarmActivity;", "Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "u", "v", hl.k, "Lcom/xiaomi/hm/health/databases/model/Alarm;", "alarm", "l", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "observeData", "Lcom/huami/widget/wheelview/event/EventAmPmUpdate;", "event", "onEventMainThread", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "onDestroy", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "mViewModel", "", "e", "Z", "isEdit", "Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudAlarmAdapter;", "f", "o", "()Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudAlarmAdapter;", "mAdapter", "Landroid/content/BroadcastReceiver;", "g", "Landroid/content/BroadcastReceiver;", "mTimeChangReceiver", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "h", GoogleApiAvailabilityLight.b, "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudAlarmActivity extends BaseEarbudDeviceActivity<EarbudDeviceViewModel> implements KoinComponent {

    @NotNull
    private static final String i = "HmEarbudAlarmActivity";
    private static final int j = 10;
    private static final int k = 0;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isEdit;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private BroadcastReceiver mTimeChangReceiver;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EarbudDeviceViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mAdapter = LazyKt__LazyJVMKt.lazy(d.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudAlarmActivity.this.isEdit = false;
            HmEarbudAlarmActivity.this.o().setMShowDelete(false);
            HmEarbudAlarmActivity.this.v();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudAlarmActivity.this.isEdit = true;
            HmEarbudAlarmActivity.this.o().setMShowDelete(true);
            HmEarbudAlarmActivity.this.v();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudAlarmActivity.this.k();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/adapter/EarbudAlarmAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<EarbudAlarmAdapter> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final EarbudAlarmAdapter getA() {
            return new EarbudAlarmAdapter();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmEarbudAlarmActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmActivity$special$$inlined$inject$default$1
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), qualifier, objArr);
            }
        });
    }

    private final void initView() {
        BTStatusFragment.newInstance(R.id.status_content, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmActivity.initView.1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return HMDeviceType.EARBUD;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                super.onEnableChange(enable);
                HmEarbudAlarmActivity.this.findViewById(R.id.mask_view).setVisibility(enable ? 8 : 0);
            }
        });
        int i2 = R.id.alarm_list;
        ((RecyclerView) findViewById(i2)).setLayoutManager(new LinearLayoutManager(this));
        o().bindToRecyclerView((RecyclerView) findViewById(i2));
        o().setEmptyView(R.layout.view_earbud_alarm_empty);
        o().registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmActivity.initView.2
            @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
            public void onChanged() {
                super.onChanged();
                HmEarbudAlarmActivity.this.v();
            }
        });
        o().setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: t34
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i3) {
                HmEarbudAlarmActivity.p(this.a, baseQuickAdapter, view, i3);
            }
        });
        o().setOnItemChildClickListener(new BaseQuickAdapter.OnItemChildClickListener() { // from class: s34
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemChildClickListener
            public final void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i3) {
                HmEarbudAlarmActivity.q(this.a, baseQuickAdapter, view, i3);
            }
        });
        ExtKt.smartClick$default((TextView) findViewById(R.id.alarm_done), 0L, new a(), 1, null);
        ExtKt.smartClick$default((TextView) findViewById(R.id.alarm_edit), 0L, new b(), 1, null);
        ExtKt.smartClick$default((TextView) findViewById(R.id.alarm_add), 0L, new c(), 1, null);
        v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        if (o().getData().size() >= 10) {
            CustomToast.showShort(this, getString(R.string.add_alarm_tips, new Object[]{10}));
        } else {
            l(m());
        }
    }

    private final void l(Alarm alarm) {
        n().startEarbudAlarmSetActivity(this, alarm, 0);
    }

    private final Alarm m() {
        Object next;
        Integer index;
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            Iterator<T> it2 = o().getData().iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                index = ((Alarm) next).getIndex();
            } while (!(index != null && i2 == index.intValue()));
            Alarm alarm = (Alarm) next;
            if (!(alarm == null ? false : Intrinsics.areEqual(alarm.getVisible(), Boolean.TRUE))) {
                break;
            }
            if (i3 >= 10) {
                i2 = -1;
                break;
            }
            i2 = i3;
        }
        Alarm alarm2 = new Alarm();
        alarm2.setIndex(Integer.valueOf(i2));
        Boolean bool = Boolean.TRUE;
        alarm2.setEnabled(bool);
        alarm2.setVisible(bool);
        alarm2.setIsSmart(bool);
        alarm2.setIsSmartWakeup(Boolean.FALSE);
        alarm2.setMDays(0);
        alarm2.setCalendar(Long.valueOf(Calendar.getInstance().getTimeInMillis() + 60000));
        return alarm2;
    }

    private final DeviceXNavigator n() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EarbudAlarmAdapter o() {
        return (EarbudAlarmAdapter) this.mAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(HmEarbudAlarmActivity hmEarbudAlarmActivity, BaseQuickAdapter baseQuickAdapter, View view, int i2) {
        hmEarbudAlarmActivity.l(hmEarbudAlarmActivity.o().getData().get(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HmEarbudAlarmActivity hmEarbudAlarmActivity, BaseQuickAdapter baseQuickAdapter, View view, int i2) {
        if (view.getId() == R.id.alarm_delete) {
            hmEarbudAlarmActivity.getMViewModel().deleteAlarm(hmEarbudAlarmActivity.o().getData().get(i2));
        } else if (view.getId() == R.id.alarm_switch) {
            hmEarbudAlarmActivity.getMViewModel().enableAlarm(i2, hmEarbudAlarmActivity.o().getData().get(i2), ((SwitchCompat) view).isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(HmEarbudAlarmActivity hmEarbudAlarmActivity, List list) {
        if (list == null || list.isEmpty()) {
            ((TextView) hmEarbudAlarmActivity.findViewById(R.id.alarm_done)).performClick();
        }
        if (list == null) {
            return;
        }
        hmEarbudAlarmActivity.o().setNewData(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(HmEarbudAlarmActivity hmEarbudAlarmActivity, HmEarbudDevice hmEarbudDevice) {
        if (hmEarbudDevice != null && hmEarbudDevice.isAllConnected()) {
            hmEarbudAlarmActivity.getMViewModel().loadAlarm(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HmEarbudAlarmActivity hmEarbudAlarmActivity, View view) {
        hmEarbudAlarmActivity.onBackPressed();
    }

    private final void u() {
        if (this.mTimeChangReceiver != null) {
            return;
        }
        this.mTimeChangReceiver = new BroadcastReceiver() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudAlarmActivity$refreshAlarms$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@Nullable Context context, @Nullable Intent intent) {
                if (!Intrinsics.areEqual(intent == null ? null : intent.getAction(), "android.intent.action.TIME_SET")) {
                    if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.TIME_TICK")) {
                        return;
                    }
                }
                this.a.getMViewModel().loadAlarm(true);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        intentFilter.addAction("android.intent.action.TIME_SET");
        registerReceiver(this.mTimeChangReceiver, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v() {
        int size = o().getData().size();
        ((TextView) findViewById(R.id.alarm_tip)).setVisibility(size > 0 ? 0 : 8);
        if (this.isEdit) {
            ((TextView) findViewById(R.id.alarm_done)).setVisibility(0);
            ((TextView) findViewById(R.id.alarm_edit)).setVisibility(8);
            ((TextView) findViewById(R.id.alarm_add)).setVisibility(8);
        } else {
            ((TextView) findViewById(R.id.alarm_done)).setVisibility(8);
            ((TextView) findViewById(R.id.alarm_add)).setVisibility(0);
            ((TextView) findViewById(R.id.alarm_edit)).setVisibility(size <= 0 ? 8 : 0);
        }
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    @NotNull
    public EarbudDeviceViewModel getMViewModel() {
        return (EarbudDeviceViewModel) this.mViewModel.getValue();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void observeData() {
        super.observeData();
        getMViewModel().getAlarmListData().observe(this, new Observer() { // from class: r34
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudAlarmActivity.r(this.a, (List) obj);
            }
        });
        getMViewModel().getDeviceData().observe(this, new Observer() { // from class: q34
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudAlarmActivity.s(this.a, (HmEarbudDevice) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        String stringExtra;
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == -1) {
            Object objFromJson = null;
            if (data != null && (stringExtra = data.getStringExtra("args_alarm")) != null) {
                try {
                    objFromJson = new Gson().fromJson(stringExtra, (Class<Object>) Alarm.class);
                } catch (Exception e) {
                    HMLog.e(getTAG(), e.getLocalizedMessage(), e);
                }
            }
            Alarm alarm = (Alarm) objFromJson;
            if (alarm == null) {
                return;
            }
            getMViewModel().onAlarmAdd(alarm);
        }
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earbud_alarm);
        int i2 = R.id.tv_title_bar;
        ((RainbowTitleBar) findViewById(i2)).setNavigationOnClickListener(new View.OnClickListener() { // from class: p34
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmEarbudAlarmActivity.t(this.a, view);
            }
        });
        ((RainbowTitleBar) findViewById(i2)).setTitle(R.string.earbud_alarm);
        initView();
        observeData();
        u();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.mTimeChangReceiver;
        if (broadcastReceiver == null) {
            return;
        }
        unregisterReceiver(broadcastReceiver);
    }

    public final void onEventMainThread(@NotNull EventAmPmUpdate event) {
        o().notifyDataSetChanged();
    }
}
