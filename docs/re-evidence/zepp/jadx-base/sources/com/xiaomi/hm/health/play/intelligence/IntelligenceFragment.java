package com.xiaomi.hm.health.play.intelligence;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.event.EventAccountStatus;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.hmwatchmanager.R;
import com.huami.worldclock.event.WorldClockChangeEvent;
import com.xiaomi.hm.health.databinding.FragmentPlayBaseBinding;
import com.xiaomi.hm.health.device.event.HMDeviceAlarmEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.HMDeviceUnUseUnbindEvent;
import com.xiaomi.hm.health.device.settings.todo.TodoChangeEvent;
import com.xiaomi.hm.health.device.settings.todo.TodoListViewModel;
import com.xiaomi.hm.health.play.PlayTabType;
import com.xiaomi.hm.health.play.PlayTool;
import com.xiaomi.hm.health.play.PlayViewModel;
import com.xiaomi.hm.health.play.base.PlayBaseFragment;
import com.xiaomi.hm.health.play.card.CardManager;
import com.xiaomi.hm.health.play.intelligence.IntelligenceFragment;
import com.xiaomi.hm.health.smalltool.model.ToolKey;
import com.xiaomi.hm.health.ui.smartplay.eventremind.ReminderChangedEvent;
import de.greenrobot.event.EventBus;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.FragmentExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-.B\u0007¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0011J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0012R\u001a\u0010\u0016\u001a\u00060\u0013R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001c\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010!\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001d\u0010&\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010\u0019\u001a\u0004\b$\u0010%R\u001d\u0010*\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/play/intelligence/IntelligenceFragment;", "Lcom/xiaomi/hm/health/play/base/PlayBaseFragment;", "Lcom/xiaomi/hm/health/databinding/FragmentPlayBaseBinding;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "initBinding", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onDestroy", "Lcom/huami/worldclock/event/WorldClockChangeEvent;", "event", "onEvent", "Lcom/xiaomi/hm/health/ui/smartplay/eventremind/ReminderChangedEvent;", "onEventMainThread", "Lcom/xiaomi/hm/health/device/event/HMDeviceAlarmEvent;", "Lcom/xiaomi/hm/health/device/settings/todo/TodoChangeEvent;", "Lcom/xiaomi/hm/health/play/intelligence/IntelligenceFragment$TimeChangeReceiver;", "b", "Lcom/xiaomi/hm/health/play/intelligence/IntelligenceFragment$TimeChangeReceiver;", "timeChangeReceiver", "Lcom/xiaomi/hm/health/play/card/CardManager;", "c", "Lkotlin/Lazy;", "f", "()Lcom/xiaomi/hm/health/play/card/CardManager;", "cardManager", "Lcom/xiaomi/hm/health/play/PlayViewModel;", GoogleApiAvailabilityLight.a, "h", "()Lcom/xiaomi/hm/health/play/PlayViewModel;", "playViewModel", "Lcom/xiaomi/hm/health/play/intelligence/IntelligenceViewModel;", "e", "g", "()Lcom/xiaomi/hm/health/play/intelligence/IntelligenceViewModel;", "intelligenceViewModel", "Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel;", "i", "()Lcom/xiaomi/hm/health/device/settings/todo/TodoListViewModel;", "todoListViewModel", "<init>", "()V", "Companion", "TimeChangeReceiver", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class IntelligenceFragment extends PlayBaseFragment<FragmentPlayBaseBinding> {

    @NotNull
    private static final String g = "IntelligenceFragment";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private TimeChangeReceiver timeChangeReceiver;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy playViewModel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy intelligenceViewModel;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy todoListViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/play/intelligence/IntelligenceFragment$TimeChangeReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Intent;", "intent", "", "onReceive", "<init>", "(Lcom/xiaomi/hm/health/play/intelligence/IntelligenceFragment;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public final class TimeChangeReceiver extends BroadcastReceiver {
        public TimeChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@Nullable Context context, @Nullable Intent intent) {
            if (intent == null) {
                return;
            }
            IntelligenceFragment intelligenceFragment = IntelligenceFragment.this;
            if (Intrinsics.areEqual(intent.getAction(), "android.intent.action.TIME_TICK")) {
                intelligenceFragment.g().minuteTimeChange();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/CardManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CardManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardManager invoke() {
            return new CardManager(IntelligenceFragment.this.requireContext(), IntelligenceFragment.this.requireActivity());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ List<PlayTool> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<PlayTool> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "toolLiveData get Intelligence tools:  " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceConnectionEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
            super(0);
            this.a = hMDeviceConnectionEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deviceConnectLiveData " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceBindEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HMDeviceBindEvent hMDeviceBindEvent) {
            super(0);
            this.a = hMDeviceBindEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "deviceBoundLiveData " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ HMDeviceUnUseUnbindEvent a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(HMDeviceUnUseUnbindEvent hMDeviceUnUseUnbindEvent) {
            super(0);
            this.a = hMDeviceUnUseUnbindEvent;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "unUseDeviceBoundLiveData " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ EventAccountStatus a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(EventAccountStatus eventAccountStatus) {
            super(0);
            this.a = eventAccountStatus;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "loginLiveData " + this.a.getStatus();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IntelligenceFragment() {
        super(R.layout.fragment_play_base);
        this.cardManager = LazyKt__LazyJVMKt.lazy(new a());
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.intelligence.IntelligenceFragment$special$$inlined$sharedViewModel$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.playViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<PlayViewModel>() { // from class: com.xiaomi.hm.health.play.intelligence.IntelligenceFragment$special$$inlined$sharedViewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.PlayViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final PlayViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(PlayViewModel.class), function0, objArr);
            }
        });
        final Function0<ViewModelOwner> function1 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.intelligence.IntelligenceFragment$special$$inlined$sharedViewModel$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.intelligenceViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<IntelligenceViewModel>() { // from class: com.xiaomi.hm.health.play.intelligence.IntelligenceFragment$special$$inlined$sharedViewModel$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.play.intelligence.IntelligenceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final IntelligenceViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, objArr2, Reflection.getOrCreateKotlinClass(IntelligenceViewModel.class), function1, objArr3);
            }
        });
        final Function0<ViewModelOwner> function2 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.intelligence.IntelligenceFragment$special$$inlined$sharedViewModel$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                return ViewModelOwner.INSTANCE.from(this.requireActivity(), this.requireActivity());
            }
        };
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.todoListViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<TodoListViewModel>() { // from class: com.xiaomi.hm.health.play.intelligence.IntelligenceFragment$special$$inlined$sharedViewModel$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.xiaomi.hm.health.device.settings.todo.TodoListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TodoListViewModel invoke() {
                return FragmentExtKt.getSharedViewModel(this, objArr4, Reflection.getOrCreateKotlinClass(TodoListViewModel.class), function2, objArr5);
            }
        });
    }

    private final CardManager f() {
        return (CardManager) this.cardManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IntelligenceViewModel g() {
        return (IntelligenceViewModel) this.intelligenceViewModel.getValue();
    }

    private final PlayViewModel h() {
        return (PlayViewModel) this.playViewModel.getValue();
    }

    private final TodoListViewModel i() {
        return (TodoListViewModel) this.todoListViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(IntelligenceFragment intelligenceFragment, List list) {
        HMLog.info(g, new b(list));
        intelligenceFragment.f().updateCardUi(list, PlayTabType.INTELLIGENCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(IntelligenceFragment intelligenceFragment, HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        if (hMDeviceConnectionEvent == null) {
            return;
        }
        HMLog.info(g, new c(hMDeviceConnectionEvent));
        if (hMDeviceConnectionEvent.isConnected()) {
            intelligenceFragment.h().loadSupportSorTools(PlayTabType.INTELLIGENCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(IntelligenceFragment intelligenceFragment, HMDeviceBindEvent hMDeviceBindEvent) {
        if (hMDeviceBindEvent == null) {
            return;
        }
        HMLog.info(g, new d(hMDeviceBindEvent));
        intelligenceFragment.f().removeCardInstance(ToolKey.NFC_WALLET, ToolKey.WATCHFACE_SETTING);
        intelligenceFragment.h().loadSupportSorTools(PlayTabType.INTELLIGENCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(IntelligenceFragment intelligenceFragment, HMDeviceUnUseUnbindEvent hMDeviceUnUseUnbindEvent) {
        if (hMDeviceUnUseUnbindEvent == null) {
            return;
        }
        HMLog.info(g, new e(hMDeviceUnUseUnbindEvent));
        intelligenceFragment.h().loadSupportSorTools(PlayTabType.INTELLIGENCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(IntelligenceFragment intelligenceFragment, EventAccountStatus eventAccountStatus) {
        if (eventAccountStatus == null) {
            return;
        }
        HMLog.info(g, new f(eventAccountStatus));
        if (eventAccountStatus.getStatus() == 2) {
            intelligenceFragment.f().removeCardInstance(ToolKey.NFC_WALLET, ToolKey.WATCHFACE_SETTING);
            intelligenceFragment.h().loadSupportSorTools(PlayTabType.INTELLIGENCE);
        }
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    public void initView() {
        LinearLayout root = getBinding().getRoot();
        RecyclerView cardContainer = f().getCardContainer();
        cardContainer.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        Unit unit = Unit.INSTANCE;
        root.addView(cardContainer);
        h().getIntelligenceLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: zf4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntelligenceFragment.j(this.a, (List) obj);
            }
        });
        h().getDeviceConnectLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: xf4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntelligenceFragment.k(this.a, (HMDeviceConnectionEvent) obj);
            }
        });
        h().getDeviceBoundLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: wf4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntelligenceFragment.l(this.a, (HMDeviceBindEvent) obj);
            }
        });
        h().getUnUseDeviceBoundLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: yf4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntelligenceFragment.m(this.a, (HMDeviceUnUseUnbindEvent) obj);
            }
        });
        h().getLoginLiveData().observe(getViewLifecycleOwner(), new Observer() { // from class: vf4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                IntelligenceFragment.n(this.a, (EventAccountStatus) obj);
            }
        });
        h().loadSupportSorTools(PlayTabType.INTELLIGENCE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_TICK");
        this.timeChangeReceiver = new TimeChangeReceiver();
        Context context = getContext();
        if (context != null) {
            TimeChangeReceiver timeChangeReceiver = this.timeChangeReceiver;
            Objects.requireNonNull(timeChangeReceiver);
            context.registerReceiver(timeChangeReceiver, intentFilter);
        }
        EventBus.getDefault().register(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Context context = getContext();
        if (context != null) {
            TimeChangeReceiver timeChangeReceiver = this.timeChangeReceiver;
            Objects.requireNonNull(timeChangeReceiver);
            context.unregisterReceiver(timeChangeReceiver);
        }
        EventBus.getDefault().unregister(this);
    }

    public final void onEvent(@NotNull WorldClockChangeEvent event) {
        g().getWorldCityList();
    }

    public final void onEventMainThread(@NotNull ReminderChangedEvent event) {
        g().getEnableReminders();
    }

    @Override // com.xiaomi.hm.health.play.base.PlayBaseFragment
    @NotNull
    public FragmentPlayBaseBinding initBinding(@NotNull View view) {
        return FragmentPlayBaseBinding.bind(view);
    }

    public final void onEvent(@NotNull TodoChangeEvent event) {
        i().loadData();
    }

    public final void onEventMainThread(@NotNull HMDeviceAlarmEvent event) {
        g().getShowAlarm();
    }
}
