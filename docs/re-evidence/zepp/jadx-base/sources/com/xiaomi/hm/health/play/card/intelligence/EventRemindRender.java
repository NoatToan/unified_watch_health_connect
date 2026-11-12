package com.xiaomi.hm.health.play.card.intelligence;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.analytics.DbUtils;
import com.huami.utils.easypermission.manager.SpaceItemDecoration;
import com.huami.watch.hmwatchmanager.R;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.databinding.LayoutToolAlarmBinding;
import com.xiaomi.hm.health.play.card.AbstractDeviceCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.intelligence.EventRemindRender;
import com.xiaomi.hm.health.play.intelligence.IntelligenceViewModel;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindActivity;
import com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager;
import com.xiaomi.hm.health.ui.smartplay.eventremind.SetEventActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0017\u001a\u00020\u0005H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/play/card/intelligence/EventRemindRender;", "Lcom/xiaomi/hm/health/play/card/AbstractDeviceCardRender;", "Lcom/xiaomi/hm/health/databinding/LayoutToolAlarmBinding;", "", "deviceNotConnected", "", "r", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "o", "", "position", GoogleApiAvailabilityLight.b, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "setCommonData", "setDeviceData", "onDeviceNotActive", "onDeviceNotConnected", "onClear", "Lcom/xiaomi/hm/health/play/intelligence/IntelligenceViewModel;", hl.k, "Lkotlin/Lazy;", "m", "()Lcom/xiaomi/hm/health/play/intelligence/IntelligenceViewModel;", "intelligenceViewModel", "", "Lcom/xiaomi/hm/health/databases/model/Reminder;", "l", "Ljava/util/List;", "reminderList", "Landroidx/fragment/app/FragmentActivity;", "Landroidx/fragment/app/FragmentActivity;", "mActivity", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class EventRemindRender extends AbstractDeviceCardRender<LayoutToolAlarmBinding> {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy intelligenceViewModel;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private List<Reminder> reminderList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    private FragmentActivity mActivity;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public a(EventRemindRender eventRemindRender) {
            super(1, eventRemindRender, EventRemindRender.class, "onEdit", "onEdit(I)V", 0);
        }

        public final void a(int i) {
            ((EventRemindRender) this.receiver).n(i);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            a(num.intValue());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EventRemindRender(@NotNull LifecycleOwner lifecycleOwner) {
        super(lifecycleOwner);
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.intelligence.EventRemindRender$special$$inlined$viewModel$default$1
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
        this.intelligenceViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<IntelligenceViewModel>() { // from class: com.xiaomi.hm.health.play.card.intelligence.EventRemindRender$special$$inlined$viewModel$default$2
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
        this.reminderList = new ArrayList();
        if (lifecycleOwner instanceof FragmentActivity) {
            this.mActivity = (FragmentActivity) lifecycleOwner;
        }
        m().getReminderLiveData().observe(lifecycleOwner, new Observer() { // from class: ot1
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                EventRemindRender.l(this.a, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(EventRemindRender eventRemindRender, List list) {
        eventRemindRender.reminderList = list;
        eventRemindRender.updateUi();
    }

    private final IntelligenceViewModel m() {
        return (IntelligenceViewModel) this.intelligenceViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int position) {
        FragmentActivity fragmentActivity = this.mActivity;
        if (fragmentActivity == null) {
            return;
        }
        fragmentActivity.startActivity(new Intent(fragmentActivity, (Class<?>) SetEventActivity.class).putExtra("event", this.reminderList.get(position)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void o(final Context context) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        layoutToolAlarmBinding.toolAlarmAdd.setOnClickListener(new View.OnClickListener() { // from class: nt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EventRemindRender.p(this.a, context, view);
            }
        });
        layoutToolAlarmBinding.toolAlarmMore.setOnClickListener(new View.OnClickListener() { // from class: mt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                EventRemindRender.q(context, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(EventRemindRender eventRemindRender, Context context, View view) {
        if (!eventRemindRender.isConnected()) {
            eventRemindRender.showDeviceNotConnectTip(context);
        } else if (EventRemindManager.getInstance().getEnableIndex() == -1) {
            IconToast.showError(context, R.string.event_remind_full);
        } else {
            context.startActivity(new Intent(context, (Class<?>) SetEventActivity.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Context context, View view) {
        context.startActivity(new Intent(context, (Class<?>) EventRemindActivity.class));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void r(boolean deviceNotConnected) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        layoutToolAlarmBinding.toolAlarmNotActive.setVisibility(deviceNotConnected ? 0 : 8);
        int size = this.reminderList.size();
        layoutToolAlarmBinding.toolNoAlarm.setVisibility((deviceNotConnected || size > 0) ? 8 : 0);
        layoutToolAlarmBinding.toolAlarmRecycler.setVisibility((deviceNotConnected || size <= 0) ? 8 : 0);
        layoutToolAlarmBinding.toolAlarmMore.setVisibility((deviceNotConnected || size <= 4) ? 8 : 0);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull Context context, @NotNull CardUiData uiParams) {
        super.initData(context, uiParams);
        m().getEnableReminders();
        EventRemindManager.readRemindersFromDevice();
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender, com.xiaomi.hm.health.play.card.AbstractCardRender, com.xiaomi.hm.health.play.card.ICardRender
    public void onClear() {
        super.onClear();
        m().getReminderLiveData().removeObservers(getLifecycleOwner());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotActive() {
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmNotActive.setText(R.string.play_device_not_active);
        r(true);
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmAdd.setClickable(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void onDeviceNotConnected() {
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmNotActive.setText(R.string.training_playing_hr_exception_device_disconnect);
        r(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setCommonData(@NotNull Context context, @NotNull CardUiData uiParams) {
        Drawable drawable;
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        Integer toolNameRes = uiParams.getPlayTool().getToolNameRes();
        if (toolNameRes != null) {
            layoutToolAlarmBinding.toolAlarm.setText(toolNameRes.intValue());
        }
        Integer toolIconRes = uiParams.getPlayTool().getToolIconRes();
        if (toolIconRes != null && (drawable = ContextCompat.getDrawable(context, toolIconRes.intValue())) != null) {
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            ((LayoutToolAlarmBinding) getBinding()).toolAlarm.setCompoundDrawablesRelative(drawable, null, null, null);
        }
        layoutToolAlarmBinding.toolNoAlarm.setText(uiParams.getPlayTool().getSubLongTitleRes());
        o(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.hm.health.play.card.AbstractDeviceCardRender
    public void setDeviceData(@NotNull final Context context, @NotNull CardUiData uiParams) {
        LayoutToolAlarmBinding layoutToolAlarmBinding = (LayoutToolAlarmBinding) getBinding();
        r(false);
        int size = this.reminderList.size();
        if (size > 0) {
            layoutToolAlarmBinding.toolAlarmRecycler.setLayoutManager(new LinearLayoutManager(context) { // from class: com.xiaomi.hm.health.play.card.intelligence.EventRemindRender$setDeviceData$1$1
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
            if (layoutToolAlarmBinding.toolAlarmRecycler.getItemDecorationCount() == 0) {
                layoutToolAlarmBinding.toolAlarmRecycler.addItemDecoration(new SpaceItemDecoration((int) ViewUtils.dp2px(context, 10.0f)));
            }
            layoutToolAlarmBinding.toolAlarmRecycler.setAdapter(new ReminderAdapter(context, size > 4 ? this.reminderList.subList(0, 4) : this.reminderList, new a(this)));
        }
        ((LayoutToolAlarmBinding) getBinding()).toolAlarmAdd.setClickable(true);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public LayoutToolAlarmBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return LayoutToolAlarmBinding.inflate(inflater, rootView, true);
    }
}
