package com.huami.sky.ui.realtime;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.sky.lib.entity.MusicEntity;
import com.huami.sky.ui.R;
import com.huami.sky.ui.databinding.ActivitySkyMusicListBinding;
import com.huami.sky.ui.realtime.SkyMusicListActivity;
import com.huami.viewbindingx.InflateViewBinder;
import com.huami.viewbindingx.LifeViewBindingProperty;
import com.huami.viewbindingx.activity.ActivityViewBindingsKt;
import java.util.ArrayList;
import java.util.List;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0017\u001a\u00020\u00138B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/huami/sky/ui/realtime/SkyMusicListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "", "initView", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/sky/ui/databinding/ActivitySkyMusicListBinding;", "a", "Lcom/huami/viewbindingx/LifeViewBindingProperty;", GoogleApiAvailabilityLight.a, "()Lcom/huami/sky/ui/databinding/ActivitySkyMusicListBinding;", "binding", "Lcom/huami/sky/ui/realtime/SkyMusicListViewModel;", "b", "Lkotlin/Lazy;", "f", "()Lcom/huami/sky/ui/realtime/SkyMusicListViewModel;", "musicViewModel", "Lcom/huami/sky/ui/realtime/SkyMusicListAdapter;", "c", "e", "()Lcom/huami/sky/ui/realtime/SkyMusicListAdapter;", "musicListAdapter", "<init>", "()V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SkyMusicListActivity extends AppCompatActivity {
    public static final /* synthetic */ KProperty<Object>[] d;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LifeViewBindingProperty binding = ActivityViewBindingsKt.viewBinding(new SkyMusicListActivity$special$$inlined$viewBinding$1(new InflateViewBinder(ActivitySkyMusicListBinding.class)));

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy musicViewModel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy musicListAdapter;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/realtime/SkyMusicListAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SkyMusicListAdapter> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SkyMusicListAdapter getA() {
            return new SkyMusicListAdapter(new ArrayList());
        }
    }

    /* JADX INFO: renamed from: com.huami.sky.ui.realtime.SkyMusicListActivity$initView$3, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.sky.ui.realtime.SkyMusicListActivity$initView$3", f = "SkyMusicListActivity.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SkyMusicListActivity.this.new AnonymousClass3(continuation);
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
                Flow musicListFlow$default = SkyMusicListViewModel.getMusicListFlow$default(SkyMusicListActivity.this.f(), 0, 1, null);
                final SkyMusicListActivity skyMusicListActivity = SkyMusicListActivity.this;
                FlowCollector<List<? extends MusicEntity>> flowCollector = new FlowCollector<List<? extends MusicEntity>>() { // from class: com.huami.sky.ui.realtime.SkyMusicListActivity$initView$3$invokeSuspend$$inlined$collect$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public Object emit(List<? extends MusicEntity> list, @NotNull Continuation<? super Unit> continuation) {
                        skyMusicListActivity.e().setData(list);
                        return Unit.INSTANCE;
                    }
                };
                this.a = 1;
                if (musicListFlow$default.collect(flowCollector, this) == coroutine_suspended) {
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
        kPropertyArr[0] = Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SkyMusicListActivity.class), "binding", "getBinding()Lcom/huami/sky/ui/databinding/ActivitySkyMusicListBinding;"));
        d = kPropertyArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SkyMusicListActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sky.ui.realtime.SkyMusicListActivity$special$$inlined$viewModel$default$1
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
        this.musicViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SkyMusicListViewModel>() { // from class: com.huami.sky.ui.realtime.SkyMusicListActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sky.ui.realtime.SkyMusicListViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SkyMusicListViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SkyMusicListViewModel.class), function0, objArr);
            }
        });
        this.musicListAdapter = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final ActivitySkyMusicListBinding d() {
        return (ActivitySkyMusicListBinding) this.binding.getValue(this, d[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkyMusicListAdapter e() {
        return (SkyMusicListAdapter) this.musicListAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SkyMusicListViewModel f() {
        return (SkyMusicListViewModel) this.musicViewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SkyMusicListActivity skyMusicListActivity, View view) {
        skyMusicListActivity.finish();
    }

    private final void initView() {
        d().titleBar.setTitle(R.string.sky_music_list_title);
        d().titleBar.setNavigationOnClickListener(new View.OnClickListener() { // from class: fx6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SkyMusicListActivity.g(this.a, view);
            }
        });
        RecyclerView recyclerView = d().recyclerMusic;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.addItemDecoration(new DividerItemDecoration(recyclerView.getContext(), 1));
        recyclerView.setAdapter(e());
        e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new AnonymousClass3(null), 3, null);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(d().getRoot());
        initView();
    }
}
