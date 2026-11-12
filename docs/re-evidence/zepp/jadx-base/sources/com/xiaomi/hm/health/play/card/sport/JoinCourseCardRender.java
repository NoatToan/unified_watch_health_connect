package com.xiaomi.hm.health.play.card.sport;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Observer;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.RecyclerView;
import com.amap.api.mapcore.util.hl;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.navigation.NavigationController;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.loc.z;
import com.xiaomi.hm.health.databinding.PlayCardJoinCourseBinding;
import com.xiaomi.hm.health.play.bean.PlayJoinCourseBean;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.DataNotifiers;
import com.xiaomi.hm.health.play.card.InvalidateLiveData;
import com.xiaomi.hm.health.play.card.sport.JoinCourseCardRender;
import com.xiaomi.hm.health.training.api.bus.TrainingBus;
import com.xiaomi.hm.health.training.api.entity.Resource;
import com.xiaomi.hm.health.training.api.entity.TrainingRecord;
import com.xiaomi.hm.health.traininglib.event.EventFinishCurrentTraining;
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
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016R\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001d\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR+\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u001e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010#R\u001d\u0010(\u001a\u00020%8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b&\u0010'R\u001d\u0010,\u001a\u00020)8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/xiaomi/hm/health/play/card/sport/JoinCourseCardRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/PlayCardJoinCourseBinding;", "Lorg/koin/core/component/KoinComponent;", "", SOAP.XMLNS, "t", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "setUiData", "Landroidx/lifecycle/LifecycleOwner;", "g", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/xiaomi/hm/health/play/card/sport/IJoinCourseRepo;", "h", "Lkotlin/Lazy;", hl.k, "()Lcom/xiaomi/hm/health/play/card/sport/IJoinCourseRepo;", "joinCourseRepoIml", "Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/hm/health/play/bean/PlayJoinCourseBean;", "i", "l", "()Landroidx/lifecycle/LiveData;", "liveData", "Lcom/xiaomi/hm/health/play/card/sport/JoinCourseAdapter;", z.j, "()Lcom/xiaomi/hm/health/play/card/sport/JoinCourseAdapter;", "adapter", "Lcom/huami/training/navigation/NavigationController;", "m", "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class JoinCourseCardRender extends AbstractCardRender<PlayCardJoinCourseBinding> implements KoinComponent {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy joinCourseRepoIml;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy liveData;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/sport/JoinCourseAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<JoinCourseAdapter> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JoinCourseAdapter getA() {
            return new JoinCourseAdapter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Resource<TrainingRecord> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Resource<TrainingRecord> resource) {
            super(0);
            this.a = resource;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "finishedCourseTraining: " + this.a.getData();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ EventFinishCurrentTraining a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EventFinishCurrentTraining eventFinishCurrentTraining) {
            super(0);
            this.a = eventFinishCurrentTraining;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            EventFinishCurrentTraining eventFinishCurrentTraining = this.a;
            return "freeTrainingFinishNotifier: " + (eventFinishCurrentTraining == null ? null : eventFinishCurrentTraining.trainingRecord);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0000H\n"}, d2 = {"Landroidx/lifecycle/LiveData;", "", "Lcom/xiaomi/hm/health/play/bean/PlayJoinCourseBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<LiveData<List<? extends PlayJoinCourseBean>>> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LiveData<List<PlayJoinCourseBean>> getA() {
            return JoinCourseCardRender.this.k().getJoinCourseList();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/navigation/NavigationController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<NavigationController> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NavigationController getA() {
            return (NavigationController) ScopesAndQualifersKt.trainingScope(JoinCourseCardRender.this.getKoin()).get(Reflection.getOrCreateKotlinClass(NavigationController.class), null, null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.play.card.sport.JoinCourseCardRender$refreshJoinCourseList$1", f = "JoinCourseCardRender.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/xiaomi/hm/health/play/bean/PlayJoinCourseBean;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.play.card.sport.JoinCourseCardRender$refreshJoinCourseList$1$list$1", f = "JoinCourseCardRender.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends PlayJoinCourseBean>>, Object> {
            public int a;
            public final /* synthetic */ JoinCourseCardRender b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(JoinCourseCardRender joinCourseCardRender, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = joinCourseCardRender;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends PlayJoinCourseBean>> continuation) {
                return invoke2(coroutineScope, (Continuation<? super List<PlayJoinCourseBean>>) continuation);
            }

            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<PlayJoinCourseBean>> continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
                if (this.a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return this.b.k().getJoinCourseListFromWeb();
            }
        }

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return JoinCourseCardRender.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(JoinCourseCardRender.this, null);
                this.a = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            List<PlayJoinCourseBean> list = (List) obj;
            if (list != null) {
                JoinCourseCardRender.this.j().updateData(list);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JoinCourseCardRender(@NotNull LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.joinCourseRepoIml = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<IJoinCourseRepo>() { // from class: com.xiaomi.hm.health.play.card.sport.JoinCourseCardRender$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.play.card.sport.IJoinCourseRepo, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final IJoinCourseRepo getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(IJoinCourseRepo.class), qualifier, objArr);
            }
        });
        this.liveData = LazyKt__LazyJVMKt.lazy(new d());
        this.adapter = LazyKt__LazyJVMKt.lazy(a.a);
        this.navigationController = LazyKt__LazyJVMKt.lazy(new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JoinCourseAdapter j() {
        return (JoinCourseAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final IJoinCourseRepo k() {
        return (IJoinCourseRepo) this.joinCourseRepoIml.getValue();
    }

    private final LiveData<List<PlayJoinCourseBean>> l() {
        return (LiveData) this.liveData.getValue();
    }

    private final NavigationController m() {
        return (NavigationController) this.navigationController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(JoinCourseCardRender joinCourseCardRender, Context context, View view) {
        joinCourseCardRender.m().navigateToTrainingFilterList(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(JoinCourseCardRender joinCourseCardRender, Context context, View view) {
        joinCourseCardRender.m().navigateToJoinedTrainingList(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(JoinCourseCardRender joinCourseCardRender, List list) {
        joinCourseCardRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(JoinCourseCardRender joinCourseCardRender, Resource resource) {
        joinCourseCardRender.s();
        HMLog.info("JoinCourseCardRender", new b(resource));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(JoinCourseCardRender joinCourseCardRender, EventFinishCurrentTraining eventFinishCurrentTraining) {
        joinCourseCardRender.s();
        HMLog.info("JoinCourseCardRender", new c(eventFinishCurrentTraining));
    }

    private final void s() {
        kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new f(null), 3, null);
    }

    private final void t() {
        PlayCardJoinCourseBinding binding = getBinding();
        ExtensionsKt.gone(binding.rlJoinCourse);
        ExtensionsKt.gone(binding.tvMore);
        binding.tvJoinCourseTitle.setText(R.string.tr_joined_course);
        ExtensionsKt.visible(binding.tvNoJoinCourse);
        ExtensionsKt.visible(binding.tvAddCourse);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull final Context context, @NotNull CardUiData uiParams) {
        PlayCardJoinCourseBinding binding = getBinding();
        RecyclerView recyclerView = binding.rlJoinCourse;
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(context, 1);
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.tr_item_divider);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
        }
        Unit unit = Unit.INSTANCE;
        recyclerView.addItemDecoration(dividerItemDecoration);
        binding.rlJoinCourse.setAdapter(j());
        binding.tvAddCourse.setOnClickListener(new View.OnClickListener() { // from class: ni4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JoinCourseCardRender.n(this.a, context, view);
            }
        });
        binding.tvMore.setOnClickListener(new View.OnClickListener() { // from class: mi4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JoinCourseCardRender.o(this.a, context, view);
            }
        });
        l().observe(this.lifecycleOwner, new Observer() { // from class: qi4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                JoinCourseCardRender.p(this.a, (List) obj);
            }
        });
        TrainingBus.finishedCourseTraining().observe(this.lifecycleOwner, new Observer() { // from class: oi4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                JoinCourseCardRender.q(this.a, (Resource) obj);
            }
        });
        InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getFreeTrainingFinishNotifier()).observe(this.lifecycleOwner, new Observer() { // from class: pi4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                JoinCourseCardRender.r(this.a, (EventFinishCurrentTraining) obj);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull Context context, @NotNull CardUiData uiParams) {
        List<PlayJoinCourseBean> value = l().getValue();
        if (!(value != null && (value.isEmpty() ^ true))) {
            t();
            return;
        }
        int size = l().getValue().size();
        PlayCardJoinCourseBinding binding = getBinding();
        binding.tvJoinCourseTitle.setText(context.getResources().getString(R.string.play_tool_join_course_title, Integer.valueOf(size)));
        ExtensionsKt.visible(binding.rlJoinCourse);
        ExtensionsKt.gone(binding.tvNoJoinCourse);
        ExtensionsKt.gone(binding.tvAddCourse);
        binding.tvMore.setVisibility(size <= 3 ? 8 : 0);
        j().updateData(l().getValue());
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public PlayCardJoinCourseBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return PlayCardJoinCourseBinding.inflate(inflater, rootView, true);
    }
}
