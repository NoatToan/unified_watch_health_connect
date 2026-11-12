package com.xiaomi.hm.health.play.card.intelligence;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.hmwatchmanager.R;
import com.huami.worldclock.bean.WorldClockBean;
import com.xiaomi.hm.health.databinding.LayoutToolAlarmBinding;
import com.xiaomi.hm.health.play.card.AbstractDeviceCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.WorldClockItemDecoration;
import com.xiaomi.hm.health.play.card.intelligence.WorldClockRender;
import com.xiaomi.hm.health.play.intelligence.IntelligenceViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016J\b\u0010\u0014\u001a\u00020\u0005H\u0016J\b\u0010\u0015\u001a\u00020\u0005H\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/WorldClockRender;", "Lcom/xiaomi/hm/health/play/card/AbstractDeviceCardRender;", "Lcom/xiaomi/hm/health/databinding/LayoutToolAlarmBinding;", "", "deviceNotConnected", "", GoogleApiAvailabilityLight.b, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "setCommonData", "setDeviceData", "onDeviceNotActive", "onDeviceNotConnected", "onClear", "Lcom/xiaomi/hm/health/play/intelligence/IntelligenceViewModel;", hl.k, "Lkotlin/Lazy;", "m", "()Lcom/xiaomi/hm/health/play/intelligence/IntelligenceViewModel;", "intelligenceViewModel", "", "Lcom/huami/worldclock/bean/WorldClockBean;", "l", "Ljava/util/List;", "worldClockList", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WorldClockRender extends AbstractDeviceCardRender<LayoutToolAlarmBinding> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy intelligenceViewModel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final List<WorldClockBean> worldClockList;

    /* JADX WARN: Multi-variable type inference failed */
    public WorldClockRender(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.intelligence.WorldClockRender$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks2 = componentCallbacks;
                return companion.from((ViewModelStoreOwner) componentCallbacks2, componentCallbacks2 instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks2 : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.intelligenceViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<IntelligenceViewModel>() { // from class: com.xiaomi.hm.health.play.card.intelligence.WorldClockRender$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.intelligence.IntelligenceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IntelligenceViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(IntelligenceViewModel.class), function0, objArr);
            }
        });
        this.worldClockList = new ArrayList();
        m().getMinuteTimeChangeLiveData().observe(lifecycleOwner, new Observer() { // from class: gx8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WorldClockRender.k(this.a, (Integer) obj);
            }
        });
        m().getWorldClockList().observe(lifecycleOwner, new Observer() { // from class: hx8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WorldClockRender.l(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(WorldClockRender worldClockRender, Integer num) {
        worldClockRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(WorldClockRender worldClockRender, List list) {
        worldClockRender.worldClockList.clear();
        worldClockRender.worldClockList.addAll(list);
        worldClockRender.updateUi();
    }

    private final IntelligenceViewModel m() {
        return (IntelligenceViewModel) this.intelligenceViewModel.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void n(boolean deviceNotConnected) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        int size = this.worldClockList.size();
        layoutToolAlarmBinding.toolAlarmNotActive.setVisibility(deviceNotConnected ? 0 : 8);
        layoutToolAlarmBinding.toolNoAlarm.setVisibility((deviceNotConnected || size > 0) ? 8 : 0);
        layoutToolAlarmBinding.toolAlarmRecycler.setVisibility((deviceNotConnected || size <= 0) ? 8 : 0);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull Context context, @NotNull CardUiData uiParams) {
        super.initData(context, uiParams);
        m().getWorldCityList();
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender, com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        m().getMinuteTimeChangeLiveData().removeObservers(getLifecycleOwner());
        m().getWorldClockList().removeObservers(getLifecycleOwner());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotActive() {
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmNotActive.setText(R.string.play_device_not_active);
        n(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotConnected() {
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmNotActive.setText(R.string.training_playing_hr_exception_device_disconnect);
        n(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setCommonData(@NotNull Context context, @NotNull CardUiData uiParams) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        layoutToolAlarmBinding.toolAlarm.setText(context.getResources().getString(R.string.app_sort_world_clock));
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.play_icon_world_clock);
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        layoutToolAlarmBinding.toolAlarm.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setDeviceData(@NotNull Context context, @NotNull CardUiData uiParams) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        int size = this.worldClockList.size();
        layoutToolAlarmBinding.toolNoAlarm.setText(context.getResources().getString(R.string.play_tool_not_world_clock));
        n(false);
        if (size > 0) {
            layoutToolAlarmBinding.toolAlarmRecycler.setPadding((int) ViewUtils.dp2px(context, 10.0f), (int) ViewUtils.dp2px(context, 15.0f), (int) ViewUtils.dp2px(context, 10.0f), (int) ViewUtils.dp2px(context, 15.0f));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.setOrientation(0);
            layoutToolAlarmBinding.toolAlarmRecycler.setLayoutManager(linearLayoutManager);
            if (layoutToolAlarmBinding.toolAlarmRecycler.getItemDecorationCount() == 0) {
                layoutToolAlarmBinding.toolAlarmRecycler.addItemDecoration(new WorldClockItemDecoration((int) ViewUtils.dp2px(context, 30.0f)));
            }
            layoutToolAlarmBinding.toolAlarmRecycler.setAdapter(new WorldClockAdapter(context, size > 10 ? this.worldClockList.subList(0, 10) : this.worldClockList));
        }
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public LayoutToolAlarmBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return LayoutToolAlarmBinding.inflate(inflater, rootView, true);
    }
}
