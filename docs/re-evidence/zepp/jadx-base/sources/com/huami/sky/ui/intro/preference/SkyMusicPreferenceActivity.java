package com.huami.sky.ui.intro.preference;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
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
import com.huami.sky.ui.ext.SkyExtKt;
import com.huami.sky.ui.intro.SkyInitActivityObserver;
import com.huami.sky.ui.intro.preference.SkyMusicPreferenceActivity;
import com.huami.sky.ui.sleepreminder.SkySleepReminderActivity;
import com.loc.z;
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
import kotlin.jvm.functions.Function3;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0007\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceActivity;", "Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceBaseActivity;", "", "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "initViews", "initObservers", "Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceViewModel;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", z.j, "()Lcom/huami/sky/ui/intro/preference/SkyMusicPreferenceViewModel;", "preferenceViewModel", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyMusicPreferenceActivity extends SkyMusicPreferenceBaseActivity {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy preferenceViewModel;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/StateBuilder;", "Lcom/huami/sky/lib/entity/MusicPreference;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<StateBuilder<MusicPreference>, Unit> {

        /* JADX INFO: renamed from: com.huami.sky.ui.intro.preference.SkyMusicPreferenceActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Loading;", "Lcom/huami/sky/lib/entity/MusicPreference;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0557a extends Lambda implements Function1<Loading<? extends MusicPreference>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0557a(SkyMusicPreferenceActivity skyMusicPreferenceActivity) {
                super(1);
                this.a = skyMusicPreferenceActivity;
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
            public final /* synthetic */ SkyMusicPreferenceActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(SkyMusicPreferenceActivity skyMusicPreferenceActivity) {
                super(1);
                this.a = skyMusicPreferenceActivity;
            }

            public final void a(@NotNull Success<MusicPreference> success) {
                MusicPreference value = success.getValue();
                if (value == null) {
                    return;
                }
                SkyMusicPreferenceActivity skyMusicPreferenceActivity = this.a;
                skyMusicPreferenceActivity.getViewBinding().listSelectView.setDataSource(value);
                skyMusicPreferenceActivity.showOtherLayout();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Success<? extends MusicPreference> success) {
                a(success);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/Fail;", "Lcom/huami/sky/lib/entity/MusicPreference;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function1<Fail<? extends MusicPreference>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(SkyMusicPreferenceActivity skyMusicPreferenceActivity) {
                super(1);
                this.a = skyMusicPreferenceActivity;
            }

            public final void a(@NotNull Fail<MusicPreference> fail) {
                this.a.m();
                this.a.finish();
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Fail<? extends MusicPreference> fail) {
                a(fail);
                return Unit.INSTANCE;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lcom/huami/arch/core/State;", "Lcom/huami/sky/lib/entity/MusicPreference;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function1<State<? extends MusicPreference>, Unit> {
            public final /* synthetic */ SkyMusicPreferenceActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(SkyMusicPreferenceActivity skyMusicPreferenceActivity) {
                super(1);
                this.a = skyMusicPreferenceActivity;
            }

            public final void a(@NotNull State<MusicPreference> state) {
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
            stateBuilder.onLoading(new C0557a(SkyMusicPreferenceActivity.this));
            stateBuilder.onSuccess(new b(SkyMusicPreferenceActivity.this));
            stateBuilder.onFail(new c(SkyMusicPreferenceActivity.this));
            stateBuilder.onCompleted(new d(SkyMusicPreferenceActivity.this));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(StateBuilder<MusicPreference> stateBuilder) {
            a(stateBuilder);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "", "<anonymous parameter 2>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function3<String, Integer, Boolean, Unit> {
        public final /* synthetic */ ActivitySkyPreferenceBinding b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ActivitySkyPreferenceBinding activitySkyPreferenceBinding) {
            super(3);
            this.b = activitySkyPreferenceBinding;
        }

        public final void a(@NotNull String str, int i, boolean z) {
            List<MusicPreferenceItem> second;
            SkyMusicPreferenceActivity skyMusicPreferenceActivity = SkyMusicPreferenceActivity.this;
            Pair<String, List<MusicPreferenceItem>> selectItems = this.b.listSelectView.getSelectItems();
            skyMusicPreferenceActivity.setSaveEnableStyle((selectItems == null || (second = selectItems.getSecond()) == null || !(second.isEmpty() ^ true)) ? false : true);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(String str, Integer num, Boolean bool) {
            a(str, num.intValue(), bool.booleanValue());
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<ParametersHolder> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ParametersHolder invoke() {
            return ParametersHolderKt.parametersOf(Boolean.FALSE);
        }
    }

    public SkyMusicPreferenceActivity() {
        final c cVar = c.a;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.intro.preference.SkyMusicPreferenceActivity$special$$inlined$viewModel$default$1
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
        final Qualifier qualifier = null;
        this.preferenceViewModel = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<SkyMusicPreferenceViewModel>() { // from class: com.huami.sky.ui.intro.preference.SkyMusicPreferenceActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.intro.preference.SkyMusicPreferenceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SkyMusicPreferenceViewModel invoke() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SkyMusicPreferenceViewModel.class), function0, cVar);
            }
        });
    }

    private final SkyMusicPreferenceViewModel j() {
        return (SkyMusicPreferenceViewModel) this.preferenceViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(SkyMusicPreferenceActivity skyMusicPreferenceActivity, View view) {
        SkyPlayEventKt.recordEvent(SkyPreferenceEventKt.AIMUSIC_PREFERENCE_SKIP_C);
        skyMusicPreferenceActivity.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ActivitySkyPreferenceBinding activitySkyPreferenceBinding, SkyMusicPreferenceActivity skyMusicPreferenceActivity, View view) {
        List<MusicPreferenceItem> second;
        Pair<String, List<MusicPreferenceItem>> selectItems = activitySkyPreferenceBinding.listSelectView.getSelectItems();
        skyMusicPreferenceActivity.j().saveMusicPreference(selectItems);
        if (selectItems != null && (second = selectItems.getSecond()) != null) {
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(second, 10));
            Iterator<T> it2 = second.iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((MusicPreferenceItem) it2.next()).getId()));
            }
            SkyPreferenceEventKt.recordPreferenceSaveEvent(false, arrayList);
        }
        skyMusicPreferenceActivity.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        SkySleepReminderActivity.INSTANCE.open(this, true);
    }

    @Override // com.huami.sky.ui.intro.preference.SkyMusicPreferenceBaseActivity
    public void initObservers() {
        LiveDataExtensionKt.observeState$default(j().getPreferenceLiveData(), this, null, new a(), 2, null);
    }

    @Override // com.huami.sky.ui.intro.preference.SkyMusicPreferenceBaseActivity
    public void initViews() {
        final ActivitySkyPreferenceBinding viewBinding = getViewBinding();
        setSaveEnableStyle(false);
        TextView textView = viewBinding.skip;
        SkyExtKt.setTextColorRes(textView, R.color.s46, Double.valueOf(0.6d));
        textView.setOnClickListener(new View.OnClickListener() { // from class: jx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyMusicPreferenceActivity.k(this.a, view);
            }
        });
        viewBinding.save.setOnClickListener(new View.OnClickListener() { // from class: ix6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyMusicPreferenceActivity.l(viewBinding, this, view);
            }
        });
        viewBinding.listSelectView.setItemClickListener(new b(viewBinding));
    }

    @Override // com.huami.sky.ui.intro.preference.SkyMusicPreferenceBaseActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getLifecycle().addObserver(new SkyInitActivityObserver(this));
        initViews();
        SkyPlayEventKt.recordEvent$default(SkyPreferenceEventKt.AIMUSIC_PREFERENCE_V, "0", null, null, null, 28, null);
    }
}
