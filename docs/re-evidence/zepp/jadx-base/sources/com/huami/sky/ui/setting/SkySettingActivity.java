package com.huami.sky.ui.setting;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.huami.lib.rainbow.ListTile;
import com.huami.sky.lib.api.DeviceDataApi;
import com.huami.sky.lib.entity.DaysType;
import com.huami.sky.lib.entity.SleepReminderSettingInfo;
import com.huami.sky.ui.R;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.analytic.SkySettingEventKt;
import com.huami.sky.ui.databinding.ActivitySkySettingBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.service.SkyServiceHelperKt;
import com.huami.sky.ui.setting.SkySettingActivity;
import com.huami.sky.ui.sleepreminder.SkySleepReminderActivity;
import com.huami.sky.ui.utils.Constant;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import com.huami.web.service.WebItem;
import com.huami.web.service.WebViewService;
import com.loc.z;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014R\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\u00020\u00128B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/ui/setting/SkySettingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initViews", "initObservers", "Lcom/huami/sky/lib/entity/SleepReminderSettingInfo;", "reminderInfo", "", "i", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/sky/ui/databinding/ActivitySkySettingBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", hl.k, "()Lcom/huami/sky/ui/databinding/ActivitySkySettingBinding;", "viewBinding", "Lcom/huami/sky/ui/setting/SkySettingViewModel;", "b", "Lkotlin/Lazy;", z.j, "()Lcom/huami/sky/ui/setting/SkySettingViewModel;", "settingViewModel", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkySettingActivity extends AppCompatActivity {
    public static final /* synthetic */ KProperty<Object>[] c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty viewBinding = ActivityViewBindingsKt.viewBinding(new SkySettingActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivitySkySettingBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy settingViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DaysType.values().length];
            iArr[DaysType.WorkDay.ordinal()] = 1;
            iArr[DaysType.RestDay.ordinal()] = 2;
            iArr[DaysType.EveryDay.ordinal()] = 3;
            iArr[DaysType.Other.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Integer, CharSequence> {
        public a() {
            super(1);
        }

        @NotNull
        public final CharSequence a(int i) {
            return SkySettingActivity.this.getResources().getStringArray(R.array.sky_reminder_repeat_day)[i - 1];
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* JADX INFO: renamed from: com.huami.sky.ui.setting.SkySettingActivity$initObservers$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.setting.SkySettingActivity$initObservers$1", f = "SkySettingActivity.kt", i = {}, l = {117, 160}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.sky.ui.setting.SkySettingActivity$initObservers$1$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ SleepReminderSettingInfo a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SleepReminderSettingInfo sleepReminderSettingInfo) {
                super(0);
                this.a = sleepReminderSettingInfo;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "sleepReminderFlow: " + this.a;
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkySettingActivity.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            SkySettingViewModel skySettingViewModelJ = SkySettingActivity.this.j();
            this.a = 1;
            obj = skySettingViewModelJ.sleepReminderFlow(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            final SkySettingActivity skySettingActivity = SkySettingActivity.this;
            FlowCollector<SleepReminderSettingInfo> flowCollector = new FlowCollector<SleepReminderSettingInfo>() { // from class: com.huami.sky.ui.setting.SkySettingActivity$initObservers$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(SleepReminderSettingInfo sleepReminderSettingInfo, @NotNull Continuation<? super Unit> continuation) {
                    SleepReminderSettingInfo sleepReminderSettingInfo2 = sleepReminderSettingInfo;
                    HMLog.info("SkySettingActivity", new SkySettingActivity.AnonymousClass1.a(sleepReminderSettingInfo2));
                    ListTile listTile = skySettingActivity.k().reminderSetting;
                    listTile.setChecked(sleepReminderSettingInfo2.isOpen());
                    listTile.setSubtitle(skySettingActivity.i(sleepReminderSettingInfo2));
                    return listTile == a.getCOROUTINE_SUSPENDED() ? listTile : Unit.INSTANCE;
                }
            };
            this.a = 2;
            if (((Flow) obj).collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[2];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkySettingActivity.class), "viewBinding", "getViewBinding()Lcom/huami/sky/ui/databinding/ActivitySkySettingBinding;"));
        c = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkySettingActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.setting.SkySettingActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.settingViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkySettingViewModel>() { // from class: com.huami.sky.ui.setting.SkySettingActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.setting.SkySettingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SkySettingViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SkySettingViewModel.class), function0, objArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(SleepReminderSettingInfo reminderInfo) {
        String string;
        if (!reminderInfo.isOpen()) {
            return getString(R.string.sky_reminder_off);
        }
        DaysType daysType = reminderInfo.getDaysType();
        int i = daysType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[daysType.ordinal()];
        if (i == -1) {
            string = getString(R.string.sky_reminder_empty);
        } else if (i == 1) {
            string = getString(R.string.sky_reminder_workday);
        } else if (i == 2) {
            string = getString(R.string.sky_reminder_restday);
        } else if (i == 3) {
            string = getString(R.string.sky_reminder_everyday);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            string = CollectionsKt___CollectionsKt.joinToString$default(reminderInfo.getDays(), " ", null, null, 0, null, new a(), 30, null);
        }
        if (reminderInfo.getDaysType() == null) {
            return string;
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format("%s  %s", Arrays.copyOf(new Object[]{reminderInfo.getFormatTimeStr(), string}, 2));
        return str == null ? string : str;
    }

    private final void initObservers() {
        e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void initViews() {
        ActivitySkySettingBinding activitySkySettingBindingK = k();
        activitySkySettingBindingK.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: yy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySettingActivity.l(this.a, view);
            }
        });
        ListTile listTile = activitySkySettingBindingK.reminderSetting;
        SkyExtKt.setListTileColor(listTile);
        listTile.setSwitchViewCenter();
        listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: cz6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SkySettingActivity.m(this.a, compoundButton, z);
            }
        });
        listTile.setOnClickListener(new View.OnClickListener() { // from class: zy6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySettingActivity.n(this.a, view);
            }
        });
        SkyExtKt.setListTileColor(activitySkySettingBindingK.userFeedback);
        activitySkySettingBindingK.userFeedback.setOnClickListener(new View.OnClickListener() { // from class: az6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySettingActivity.o(this.a, view);
            }
        });
        ListTile listTile2 = activitySkySettingBindingK.watchClock;
        if (((DeviceDataApi) AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(DeviceDataApi.class), null, null)).isSupportAlarmClock()) {
            SkyExtKt.setListTileColor(listTile2);
            SettingItemType settingItemType = AlarmItem.INSTANCE;
            Pair<String, Function1<Context, Unit>> titleAndNavigationByItemType = settingItemType.getDeviceNavigation().getTitleAndNavigationByItemType(settingItemType);
            listTile2.setTitle(titleAndNavigationByItemType != null ? titleAndNavigationByItemType.getFirst() : null);
            listTile2.setOnClickListener(new View.OnClickListener() { // from class: xy6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SkySettingActivity.p(this.a, view);
                }
            });
        } else {
            listTile2.setVisibility(8);
        }
        ListTile listTile3 = activitySkySettingBindingK.scienceIntro;
        SkyExtKt.setListTileColor(listTile3);
        listTile3.setOnClickListener(new View.OnClickListener() { // from class: bz6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkySettingActivity.q(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkySettingViewModel j() {
        return (SkySettingViewModel) this.settingViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivitySkySettingBinding k() {
        return (ActivitySkySettingBinding) this.viewBinding.getValue(this, c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SkySettingActivity skySettingActivity, View view) {
        skySettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SkySettingActivity skySettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            SkySettingEventKt.recordReminderOpen(z);
            skySettingActivity.j().setReminderIsOpen(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(SkySettingActivity skySettingActivity, View view) {
        SkySleepReminderActivity.Companion.open$default(SkySleepReminderActivity.INSTANCE, skySettingActivity, false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SkySettingActivity skySettingActivity, View view) {
        SkyPlayEventKt.recordEvent(SkySettingEventKt.AIMUSIC_PLAYER_FEEDBACK_C);
        UserFeedBackItem.INSTANCE.getNavigation().invoke(skySettingActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(SkySettingActivity skySettingActivity, View view) {
        Function1<Context, Unit> navigation = AlarmItem.INSTANCE.getNavigation();
        if (navigation == null) {
            return;
        }
        navigation.invoke(skySettingActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(View view) {
        WebViewService webViewService = SkyServiceHelperKt.getWebViewService();
        WebItem webItem = new WebItem(Constant.ILLUSTRATE_WEB_URL);
        webItem.webTheme = "THEME_DARK";
        Unit unit = Unit.INSTANCE;
        webViewService.launch(webItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(k().getRoot());
        SkyPlayEventKt.recordEvent(SkySettingEventKt.AIMUSIC_SETTING_V);
        initViews();
        initObservers();
    }
}
