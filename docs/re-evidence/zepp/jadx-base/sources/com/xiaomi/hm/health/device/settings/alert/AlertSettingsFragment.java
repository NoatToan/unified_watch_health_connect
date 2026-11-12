package com.xiaomi.hm.health.device.settings.alert;

import android.content.ComponentCallbacks;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p010navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.devicex.R;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseui.fragment.BaseNavFragment;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.setting.DeviceCenter;
import com.xiaomi.hm.health.device.settings.alert.AlertSettingsFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J&\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u001a\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0014R\u001d\u0010\u0018\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001c\u001a\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/settings/alert/AlertSettingsFragment;", "Lcom/xiaomi/hm/health/baseui/fragment/BaseNavFragment;", "Lcom/xiaomi/hm/health/device/settings/alert/ItemAction;", "action", "", "f", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "onResume", "", "tag", "Lcom/xiaomi/hm/health/device/settings/alert/AlertItemFactory;", "b", "Lkotlin/Lazy;", "c", "()Lcom/xiaomi/hm/health/device/settings/alert/AlertItemFactory;", "alertItemFactory", "Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", GoogleApiAvailabilityLight.a, "()Lcom/xiaomi/hm/health/device/setting/DeviceCenter;", "deviceCenter", "<init>", "()V", "a", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class AlertSettingsFragment extends BaseNavFragment {

    @Deprecated
    @NotNull
    public static final String TAG = "AlertSettingsFragment";

    @NotNull
    private static final a d = new a(null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy alertItemFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceCenter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/xiaomi/hm/health/device/settings/alert/AlertSettingsFragment$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlertSettingsFragment() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.alertItemFactory = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<AlertItemFactory>() { // from class: com.xiaomi.hm.health.device.settings.alert.AlertSettingsFragment$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.settings.alert.AlertItemFactory, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final AlertItemFactory getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(AlertItemFactory.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceCenter = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceCenter>() { // from class: com.xiaomi.hm.health.device.settings.alert.AlertSettingsFragment$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.DeviceCenter, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceCenter getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceCenter.class), objArr2, objArr3);
            }
        });
    }

    private final AlertItemFactory c() {
        return (AlertItemFactory) this.alertItemFactory.getValue();
    }

    private final DeviceCenter d() {
        return (DeviceCenter) this.deviceCenter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(AlertSettingsFragment alertSettingsFragment, View view) {
        alertSettingsFragment.requireActivity().onBackPressed();
    }

    private final void f(ItemAction action) {
        Integer actionId = action.getActionId();
        Intent intent = new Intent(requireActivity(), action.getClz());
        if (actionId == null) {
            startActivity(intent);
            return;
        }
        try {
            Bundle bundle = new Bundle();
            if (actionId.intValue() == R.id.action_to_appAlertActivity) {
                bundle.putInt("deviceType", HMDeviceType.MILI.getValue());
            }
            FragmentKt.findNavController(this).navigate(actionId.intValue(), bundle);
        } catch (IllegalStateException e) {
            HMLog.wtf(TAG, e);
            startActivity(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(AnonymousClass1 anonymousClass1, AlertSettingsFragment alertSettingsFragment, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Item item = anonymousClass1.getItem(i);
        if (item == null) {
            return;
        }
        alertSettingsFragment.f(item.getAction());
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = getContentView();
        if (contentView == null) {
            contentView = inflater.inflate(R.layout.fragment_alert_settings, container, false);
            setContentView(contentView);
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) contentView.findViewById(R.id.title_bar);
            if (rainbowTitleBar != null) {
                rainbowTitleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: wb
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        AlertSettingsFragment.e(this.a, view);
                    }
                });
            }
        }
        return contentView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        View view = getView();
        RecyclerView.Adapter adapter = ((RecyclerView) (view == null ? null : view.findViewById(R.id.rc_container))).getAdapter();
        if (adapter == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.recyclerview.widget.RecyclerView$Adapter, com.chad.library.adapter.base.BaseQuickAdapter, com.xiaomi.hm.health.device.settings.alert.AlertSettingsFragment$onViewCreated$1] */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        NotificationManager.getInstance().getAppsRepo().setCurrentDeviceType(HMDeviceType.MILI);
        View view2 = getView();
        View viewFindViewById = view2 == null ? null : view2.findViewById(R.id.rc_container);
        final ?? r0 = new BaseQuickAdapter<Item, BaseViewHolder>(R.layout.item_alert_setting) { // from class: com.xiaomi.hm.health.device.settings.alert.AlertSettingsFragment.onViewCreated.1
            @Override // com.chad.library.adapter.base.BaseQuickAdapter
            public void convert(@NotNull BaseViewHolder helper, @NotNull Item item) {
                helper.setText(R.id.tv_title, item.getType().getName());
                helper.setText(R.id.tv_state, item.getState().description());
            }
        };
        r0.setNewData(c().create(d().getDeviceSource()));
        r0.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() { // from class: xb
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view3, int i) {
                AlertSettingsFragment.g(r0, this, baseQuickAdapter, view3, i);
            }
        });
        Unit unit = Unit.INSTANCE;
        ((RecyclerView) viewFindViewById).setAdapter(r0);
    }

    @Override // com.xiaomi.hm.health.baseui.fragment.BaseNavFragment
    @NotNull
    public String tag() {
        return TAG;
    }
}
