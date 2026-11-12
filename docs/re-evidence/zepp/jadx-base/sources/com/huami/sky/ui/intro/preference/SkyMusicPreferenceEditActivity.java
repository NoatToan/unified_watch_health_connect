package com.huami.sky.ui.intro.preference;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.arch.core.Fail;
import com.huami.arch.core.LiveDataExtensionKt;
import com.huami.arch.core.Loading;
import com.huami.arch.core.State;
import com.huami.arch.core.StateBuilder;
import com.huami.arch.core.Success;
import com.huami.sky.lib.entity.MusicPreference;
import com.huami.sky.lib.entity.MusicPreferenceItem;
import com.huami.sky.ui.R;
import com.huami.sky.ui.analytic.SkyPlayEventKt;
import com.huami.sky.ui.analytic.SkyPreferenceEventKt;
import com.huami.sky.ui.databinding.ActivitySkyPreferenceBinding;
import com.huami.sky.ui.intro.preference.SkyMusicPreferenceEditActivity;
import com.huami.sky.ui.view.SkyAlertFragment;
import com.huami.util.net.NetUtil;
import com.huami.widget.toast.CustomToast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001d\u0010\u000f\u001a\u00020\n8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceEditActivity;", "Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceBaseActivity;", "", "l", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "initViews", "initObservers", "onBackPressed", "Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceViewModel;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", hl.k, "()Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceViewModel;", "preferenceViewModel", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyMusicPreferenceEditActivity extends SkyMusicPreferenceBaseActivity {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy preferenceViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lcom/huami/sky/lib/entity/MusicPreference;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<MusicPreference>, Unit> {

        /* JADX INFO: renamed from: com.huami.sky.ui.intro.preference.SkyMusicPreferenceEditActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "Lcom/huami/sky/lib/entity/MusicPreference;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0558a extends Lambda implements Function1<Loading<? extends MusicPreference>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceEditActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0558a(SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity) {
                super(1);
                this.a = skyMusicPreferenceEditActivity;
            }

            public final void a(@NotNull Loading<MusicPreference> loading) {
                this.a.setLoadingVisible(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends MusicPreference> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "Lcom/huami/sky/lib/entity/MusicPreference;", "res", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function1<Success<? extends MusicPreference>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceEditActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity) {
                super(1);
                this.a = skyMusicPreferenceEditActivity;
            }

            public final void a(@NotNull Success<MusicPreference> success) {
                MusicPreference value = success.getValue();
                if (value == null) {
                    return;
                }
                SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity = this.a;
                skyMusicPreferenceEditActivity.getViewBinding().groupNetwork.setVisibility(8);
                skyMusicPreferenceEditActivity.getViewBinding().listSelectView.setDataSource(value);
                skyMusicPreferenceEditActivity.getViewBinding().save.setVisibility(0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends MusicPreference> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Lcom/huami/sky/lib/entity/MusicPreference;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Fail<? extends MusicPreference>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceEditActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity) {
                super(1);
                this.a = skyMusicPreferenceEditActivity;
            }

            public final void a(@NotNull Fail<MusicPreference> fail) {
                this.a.l();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends MusicPreference> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/sky/lib/entity/MusicPreference;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<State<? extends MusicPreference>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceEditActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity) {
                super(1);
                this.a = skyMusicPreferenceEditActivity;
            }

            public final void a(@NotNull State<MusicPreference> state) {
                this.a.getViewBinding().titleBar.setVisibility(0);
                this.a.setLoadingVisible(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State<? extends MusicPreference> state) {
                a(state);
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<MusicPreference> stateBuilder) {
            stateBuilder.onLoading(new C0558a(SkyMusicPreferenceEditActivity.this));
            stateBuilder.onSuccess(new b(SkyMusicPreferenceEditActivity.this));
            stateBuilder.onFail(new c(SkyMusicPreferenceEditActivity.this));
            stateBuilder.onCompleted(new d(SkyMusicPreferenceEditActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<MusicPreference> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<StateBuilder<Boolean>, Unit> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function1<Loading<? extends Boolean>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceEditActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity) {
                super(1);
                this.a = skyMusicPreferenceEditActivity;
            }

            public final void a(@NotNull Loading<Boolean> loading) {
                this.a.setLoadingVisible(true);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Loading<? extends Boolean> loading) {
                a(loading);
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: renamed from: com.huami.sky.ui.intro.preference.SkyMusicPreferenceEditActivity$b$b, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Success;", "", "res", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0559b extends Lambda implements Function1<Success<? extends Boolean>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceEditActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0559b(SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity) {
                super(1);
                this.a = skyMusicPreferenceEditActivity;
            }

            public final void a(@NotNull Success<Boolean> success) {
                if (Intrinsics.areEqual(success.getValue(), Boolean.TRUE)) {
                    this.a.finish();
                } else {
                    CustomToast.showShort(this.a.getApplicationContext(), R.string.sky_play_network_disconnect);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends Boolean> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Fail<? extends Boolean>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceEditActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity) {
                super(1);
                this.a = skyMusicPreferenceEditActivity;
            }

            public final void a(@NotNull Fail<Boolean> fail) {
                CustomToast.showShort(this.a.getApplicationContext(), R.string.sky_play_network_disconnect);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends Boolean> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<State<? extends Boolean>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceEditActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity) {
                super(1);
                this.a = skyMusicPreferenceEditActivity;
            }

            public final void a(@NotNull State<Boolean> state) {
                this.a.setLoadingVisible(false);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(State<? extends Boolean> state) {
                a(state);
                return Unit.INSTANCE;
            }
        }

        public b() {
            super(1);
        }

        public final void a(@NotNull StateBuilder<Boolean> stateBuilder) {
            stateBuilder.onLoading(new a(SkyMusicPreferenceEditActivity.this));
            stateBuilder.onSuccess(new C0559b(SkyMusicPreferenceEditActivity.this));
            stateBuilder.onFail(new c(SkyMusicPreferenceEditActivity.this));
            stateBuilder.onCompleted(new d(SkyMusicPreferenceEditActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<Boolean> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/view/SkyAlertFragment;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<SkyAlertFragment, Unit> {
        public c() {
            super(1);
        }

        public final void a(@NotNull SkyAlertFragment skyAlertFragment) {
            SkyMusicPreferenceEditActivity.this.finish();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SkyAlertFragment skyAlertFragment) {
            a(skyAlertFragment);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<ParametersHolder> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ParametersHolder getA() {
            return ParametersHolderKt.parametersOf(Boolean.TRUE);
        }
    }

    public SkyMusicPreferenceEditActivity() {
        final d dVar = d.a;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.intro.preference.SkyMusicPreferenceEditActivity$special$$inlined$viewModel$default$1
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
        final Qualifier qualifier = null;
        this.preferenceViewModel = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<SkyMusicPreferenceViewModel>() { // from class: com.huami.sky.ui.intro.preference.SkyMusicPreferenceEditActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.intro.preference.SkyMusicPreferenceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SkyMusicPreferenceViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SkyMusicPreferenceViewModel.class), function0, dVar);
            }
        });
    }

    private final SkyMusicPreferenceViewModel k() {
        return (SkyMusicPreferenceViewModel) this.preferenceViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        getViewBinding().groupNetwork.setVisibility(0);
        getViewBinding().skyNetworkTip.setText(!NetUtil.INSTANCE.networkInfo().isNetworkConnect() ? getString(R.string.sky_play_network_disconnect) : getString(R.string.sky_play_network_error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity, View view) {
        skyMusicPreferenceEditActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(ActivitySkyPreferenceBinding activitySkyPreferenceBinding, SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity, View view) {
        List<MusicPreferenceItem> second;
        Pair<String, List<MusicPreferenceItem>> selectItems = activitySkyPreferenceBinding.listSelectView.getSelectItems();
        skyMusicPreferenceEditActivity.k().saveMusicPreference(selectItems);
        if (selectItems == null || (second = selectItems.getSecond()) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(second, 10));
        Iterator<T> it2 = second.iterator();
        while (it2.hasNext()) {
            arrayList.add(Integer.valueOf(((MusicPreferenceItem) it2.next()).getId()));
        }
        SkyPreferenceEventKt.recordPreferenceSaveEvent(true, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(SkyMusicPreferenceEditActivity skyMusicPreferenceEditActivity, View view) {
        skyMusicPreferenceEditActivity.k().requestMusicPreferenceInfo();
    }

    @Override // com.huami.sky.ui.intro.preference.SkyMusicPreferenceBaseActivity
    public void initObservers() {
        LiveDataExtensionKt.observeState$default(k().getPreferenceLiveData(), this, null, new a(), 2, null);
        LiveDataExtensionKt.observeState$default(k().getSaveLiveData(), this, null, new b(), 2, null);
    }

    @Override // com.huami.sky.ui.intro.preference.SkyMusicPreferenceBaseActivity
    public void initViews() {
        final ActivitySkyPreferenceBinding viewBinding = getViewBinding();
        viewBinding.titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: nx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyMusicPreferenceEditActivity.m(this.a, view);
            }
        });
        setSaveEnableStyle(true);
        viewBinding.save.setOnClickListener(new View.OnClickListener() { // from class: lx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyMusicPreferenceEditActivity.n(viewBinding, this, view);
            }
        });
        viewBinding.skyPlayRetry.setOnClickListener(new View.OnClickListener() { // from class: mx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyMusicPreferenceEditActivity.o(this.a, view);
            }
        });
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (k().isSelectedChanged(getViewBinding().listSelectView.getSelectItems())) {
            new SkyAlertFragment().showDialog(this, null, Integer.valueOf(R.string.sky_question_cancel), R.string.sky_preference_exit, R.string.sky_preference_warning, (32 & 32) != 0 ? SkyAlertFragment.a.a : null, new c());
        } else {
            finish();
        }
    }

    @Override // com.huami.sky.ui.intro.preference.SkyMusicPreferenceBaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
        SkyPlayEventKt.recordEvent$default(SkyPreferenceEventKt.AIMUSIC_PREFERENCE_V, "1", null, null, null, 28, null);
    }
}
