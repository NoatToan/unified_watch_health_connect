package com.huami.sky.ui.setting;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.ui.R;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.analytic.SkySettingEventKt;
import com.huami.sky.ui.databinding.ActivitySkyPlaySettingBinding;
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.setting.SkyPlaySettingActivity;
import com.huami.sky.ui.utils.SkyDateFormatKt;
import com.huami.tools.log.HMLog;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/huami/sky/ui/setting/SkyPlaySettingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initViews", "initObservers", "", "seconds", GoogleApiAvailabilityLight.b, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/sky/ui/databinding/ActivitySkyPlaySettingBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", "h", "()Lcom/huami/sky/ui/databinding/ActivitySkyPlaySettingBinding;", "mViewBinding", "Lcom/huami/sky/ui/setting/SkyPlaySettingViewModel;", "b", "Lkotlin/Lazy;", "i", "()Lcom/huami/sky/ui/setting/SkyPlaySettingViewModel;", "playSettingViewModel", "Lcom/huami/sky/ui/setting/PlaySettingPickDialog;", "c", "g", "()Lcom/huami/sky/ui/setting/PlaySettingPickDialog;", "mPlaySettingPickDialog", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyPlaySettingActivity extends AppCompatActivity {
    public static final /* synthetic */ KProperty<Object>[] d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty mViewBinding = ActivityViewBindingsKt.viewBinding(new SkyPlaySettingActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivitySkyPlaySettingBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy playSettingViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy mPlaySettingPickDialog;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/setting/PlaySettingPickDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<PlaySettingPickDialog> {

        /* JADX INFO: renamed from: com.huami.sky.ui.setting.SkyPlaySettingActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous parameter 0>", "item", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0572a extends Lambda implements Function2<Integer, Integer, Unit> {
            public final /* synthetic */ SkyPlaySettingActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0572a(SkyPlaySettingActivity skyPlaySettingActivity) {
                super(2);
                this.a = skyPlaySettingActivity;
            }

            public final void a(int i, int i2) {
                SkySettingEventKt.recordPlayStopTimeEvent(i2);
                this.a.i().setPlayDuration(i2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Integer num, Integer num2) {
                a(num.intValue(), num2.intValue());
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final PlaySettingPickDialog invoke() {
            PlaySettingPickDialog playSettingPickDialog = new PlaySettingPickDialog();
            playSettingPickDialog.setCompleteListener(new C0572a(SkyPlaySettingActivity.this));
            return playSettingPickDialog;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "formatSecond " + this.a;
        }
    }

    /* JADX INFO: renamed from: com.huami.sky.ui.setting.SkyPlaySettingActivity$initObservers$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.setting.SkyPlaySettingActivity$initObservers$2", f = "SkyPlaySettingActivity.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.sky.ui.setting.SkyPlaySettingActivity$initObservers$2$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "getPlayDuration: " + this.a;
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlaySettingActivity.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Integer> playDuration = SkyPlaySettingActivity.this.i().getPlayDuration();
                final SkyPlaySettingActivity skyPlaySettingActivity = SkyPlaySettingActivity.this;
                FlowCollector<Integer> flowCollector = new FlowCollector<Integer>() { // from class: com.huami.sky.ui.setting.SkyPlaySettingActivity$initObservers$2$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Integer num, @NotNull Continuation<? super Unit> continuation) {
                        int iIntValue = num.intValue();
                        HMLog.info("SkyPlaySettingActivity", new SkyPlaySettingActivity.AnonymousClass2.a(iIntValue));
                        skyPlaySettingActivity.g().setCurrentItem(iIntValue);
                        skyPlaySettingActivity.h().playTimeSetting.setTips(PlaySettingPickDialogKt.formatMinutesToString(skyPlaySettingActivity, iIntValue));
                        skyPlaySettingActivity.n(iIntValue * 60);
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (playDuration.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.huami.sky.ui.setting.SkyPlaySettingActivity$initObservers$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.setting.SkyPlaySettingActivity$initObservers$3", f = "SkyPlaySettingActivity.kt", i = {}, l = {138}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: com.huami.sky.ui.setting.SkyPlaySettingActivity$initObservers$3$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(0);
                this.a = i;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "timeChange: " + this.a;
            }
        }

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyPlaySettingActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Integer> flowObserverPlayTimeChange = SkyPlaySettingActivity.this.i().observerPlayTimeChange();
                final SkyPlaySettingActivity skyPlaySettingActivity = SkyPlaySettingActivity.this;
                FlowCollector<Integer> flowCollector = new FlowCollector<Integer>() { // from class: com.huami.sky.ui.setting.SkyPlaySettingActivity$initObservers$3$invokeSuspend$$inlined$collect$1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(Integer num, @NotNull Continuation<? super Unit> continuation) {
                        int iIntValue = num.intValue();
                        HMLog.info("SkyPlaySettingActivity", new SkyPlaySettingActivity.AnonymousClass3.a(iIntValue));
                        if (iIntValue == 0) {
                            SkyPlaySettingActivity skyPlaySettingActivity2 = skyPlaySettingActivity;
                            skyPlaySettingActivity2.n(skyPlaySettingActivity2.g().getCurrentItem() * 60);
                        } else {
                            skyPlaySettingActivity.n(iIntValue);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (flowObserverPlayTimeChange.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        KProperty<Object>[] kPropertyArr = new KProperty[3];
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkyPlaySettingActivity.class), "mViewBinding", "getMViewBinding()Lcom/huami/sky/ui/databinding/ActivitySkyPlaySettingBinding;"));
        d = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkyPlaySettingActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.setting.SkyPlaySettingActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ViewModelOwner invoke() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.playSettingViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkyPlaySettingViewModel>() { // from class: com.huami.sky.ui.setting.SkyPlaySettingActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.setting.SkyPlaySettingViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyPlaySettingViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SkyPlaySettingViewModel.class), function0, objArr);
            }
        });
        this.mPlaySettingPickDialog = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlaySettingPickDialog g() {
        return (PlaySettingPickDialog) this.mPlaySettingPickDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivitySkyPlaySettingBinding h() {
        return (ActivitySkyPlaySettingBinding) this.mViewBinding.getValue(this, d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkyPlaySettingViewModel i() {
        return (SkyPlaySettingViewModel) this.playSettingViewModel.getValue();
    }

    private final void initObservers() {
        i().isSmartCloseVisible().observe(this, new Observer() { // from class: ny6
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SkyPlaySettingActivity.j(this.a, (Boolean) obj);
            }
        });
        e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass2(null), 3, null);
        e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(null), 3, null);
    }

    private final void initViews() {
        ActivitySkyPlaySettingBinding activitySkyPlaySettingBindingH = h();
        activitySkyPlaySettingBindingH.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: ky6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlaySettingActivity.k(this.a, view);
            }
        });
        SkyExtKt.setListTileColor(activitySkyPlaySettingBindingH.playStopSetting);
        activitySkyPlaySettingBindingH.playStopSetting.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: my6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SkyPlaySettingActivity.l(this.a, compoundButton, z);
            }
        });
        SkyExtKt.setListTileColor(activitySkyPlaySettingBindingH.playTimeSetting);
        activitySkyPlaySettingBindingH.playTimeSetting.setOnClickListener(new View.OnClickListener() { // from class: ly6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyPlaySettingActivity.m(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(SkyPlaySettingActivity skyPlaySettingActivity, Boolean bool) {
        skyPlaySettingActivity.h().playStopSetting.setVisibility(bool.booleanValue() ? 0 : 8);
        if (bool.booleanValue()) {
            e.f(LifecycleOwnerKt.getLifecycleScope(skyPlaySettingActivity), null, null, new SkyPlaySettingActivity$initObservers$1$1(skyPlaySettingActivity, bool, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SkyPlaySettingActivity skyPlaySettingActivity, View view) {
        skyPlaySettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(SkyPlaySettingActivity skyPlaySettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            SkyPlayEventKt.recordEvent(z ? SkySettingEventKt.AIMUSIC_AISLEEP_OPEN_C : SkySettingEventKt.AIMUSIC_AISLEEP_CLOSE_C);
            skyPlaySettingActivity.i().setSmartPLayClose(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SkyPlaySettingActivity skyPlaySettingActivity, View view) {
        skyPlaySettingActivity.g().show(skyPlaySettingActivity.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int seconds) {
        if (seconds == -60) {
            h().playTimeSetting.setSubtitle(getString(R.string.sky_music_timeStopTips_off));
            return;
        }
        String strSecondsFormat = SkyDateFormatKt.secondsFormat(this, seconds);
        HMLog.info("SkyPlaySettingActivity", new b(strSecondsFormat));
        if (strSecondsFormat == null) {
            return;
        }
        h().playTimeSetting.setSubtitle(getString(R.string.sky_music_timeStopTips_on, new Object[]{strSecondsFormat}));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(h().getRoot());
        initViews();
        initObservers();
    }
}
