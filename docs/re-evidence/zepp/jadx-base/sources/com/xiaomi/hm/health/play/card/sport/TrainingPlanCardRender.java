package com.xiaomi.hm.health.play.card.sport;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.training.di.koin.ScopesAndQualifersKt;
import com.huami.training.dto.TrainingPlanState;
import com.huami.training.navigation.NavigationController;
import com.huami.training.ui.entrance.EntranceViewModel;
import com.huami.training.vo.Resource;
import com.huami.training.vo.TrainingPlanVo;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watchfacesstore.ext.ExtensionsKt;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.xiaomi.hm.health.databinding.PlayCardTrainingPlanBinding;
import com.xiaomi.hm.health.di.koin.scope.ScopesKt;
import com.xiaomi.hm.health.play.card.AbstractCardRender;
import com.xiaomi.hm.health.play.card.CardUiData;
import com.xiaomi.hm.health.play.card.sport.TrainingPlanCardRender;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.qualifier.QualifierKt;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b3\u00104J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0019\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0019\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010)\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010(R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010+R\u001d\u00100\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\"\u001a\u0004\b!\u0010/R\u001d\u00102\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b\u001b\u0010/¨\u00065"}, d2 = {"Lcom/xiaomi/hm/health/play/card/sport/TrainingPlanCardRender;", "Lcom/xiaomi/hm/health/play/card/AbstractCardRender;", "Lcom/xiaomi/hm/health/databinding/PlayCardTrainingPlanBinding;", "", "hasPlan", "", "m", GoogleApiAvailabilityLight.b, "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/training/vo/TrainingPlanVo;", "trainingPlanData", "o", com.google.android.exoplayer2.text.ttml.b.r, "r", DTransferConstants.SEARCH_KEY, "Lcom/xiaomi/hm/health/play/card/CardUiData;", "uiParams", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "rootView", "getLayoutViewBinding", "setUiData", "onCardClick", "Landroidx/lifecycle/LifecycleOwner;", "g", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/huami/training/ui/entrance/EntranceViewModel;", "h", "Lkotlin/Lazy;", z.j, "()Lcom/huami/training/ui/entrance/EntranceViewModel;", "viewModel", "Lcom/huami/training/navigation/NavigationController;", "i", "()Lcom/huami/training/navigation/NavigationController;", "navigationController", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "isMale", "Landroid/graphics/drawable/GradientDrawable;", hl.k, "()Landroid/graphics/drawable/GradientDrawable;", "drawableNoPlan", "l", "drawableHasPlan", "<init>", "(Landroidx/lifecycle/LifecycleOwner;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class TrainingPlanCardRender extends AbstractCardRender<PlayCardTrainingPlanBinding> {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy navigationController;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isMale;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    private final Lazy drawableNoPlan;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy drawableHasPlan;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TrainingPlanState.values().length];
            iArr[TrainingPlanState.WAIT.ordinal()] = 1;
            iArr[TrainingPlanState.TODAY_FINISHED.ordinal()] = 2;
            iArr[TrainingPlanState.TODAY_REST.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/drawable/GradientDrawable;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<GradientDrawable> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GradientDrawable getA() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(ExtensionsKt.getDp(17.0f));
            gradientDrawable.setColor(Color.parseColor("#F2F2F2"));
            return gradientDrawable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/graphics/drawable/GradientDrawable;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<GradientDrawable> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GradientDrawable getA() {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(ExtensionsKt.getDp(17.0f));
            gradientDrawable.setColor(Color.parseColor("#B3FF312E"));
            return gradientDrawable;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/training/navigation/NavigationController;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<NavigationController> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final NavigationController getA() {
            return (NavigationController) ScopesAndQualifersKt.trainingScope(KoinJavaComponent.getKoin()).get(Reflection.getOrCreateKotlinClass(NavigationController.class), null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TrainingPlanCardRender(@NotNull LifecycleOwner lifecycleOwner) {
        this.lifecycleOwner = lifecycleOwner;
        final ComponentCallbacks componentCallbacks = (ComponentCallbacks) lifecycleOwner;
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.xiaomi.hm.health.play.card.sport.TrainingPlanCardRender$special$$inlined$viewModel$default$1
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
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<EntranceViewModel>() { // from class: com.xiaomi.hm.health.play.card.sport.TrainingPlanCardRender$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.training.ui.entrance.EntranceViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final EntranceViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(componentCallbacks, qualifier, Reflection.getOrCreateKotlinClass(EntranceViewModel.class), function0, objArr);
            }
        });
        this.navigationController = LazyKt__LazyJVMKt.lazy(c.a);
        this.isMale = (Function0) ScopesKt.userScope(KoinJavaComponent.getKoin()).get(Reflection.getOrCreateKotlinClass(Function0.class), QualifierKt.named("Gender"), null);
        this.drawableNoPlan = LazyKt__LazyJVMKt.lazy(b.a);
        this.drawableHasPlan = LazyKt__LazyJVMKt.lazy(a.a);
    }

    private final GradientDrawable g() {
        return (GradientDrawable) this.drawableHasPlan.getValue();
    }

    private final GradientDrawable h() {
        return (GradientDrawable) this.drawableNoPlan.getValue();
    }

    private final NavigationController i() {
        return (NavigationController) this.navigationController.getValue();
    }

    private final EntranceViewModel j() {
        return (EntranceViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(TrainingPlanCardRender trainingPlanCardRender, Resource resource) {
        trainingPlanCardRender.updateUi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(TrainingPlanCardRender trainingPlanCardRender, Context context, View view) {
        Resource<TrainingPlanVo> value = trainingPlanCardRender.j().getTrainingPlan().getValue();
        Unit unit = null;
        if (value != null && value.getData() != null) {
            trainingPlanCardRender.i().navigateToPlanDetailPage(context);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            trainingPlanCardRender.i().navigateToCreatePlanPage(context);
        }
    }

    private final void m(boolean hasPlan) {
        if (hasPlan) {
            getBinding().getRoot().setBackgroundColor(0);
            TypefaceTextView typefaceTextView = getBinding().tvTrainingPlanStart;
            typefaceTextView.setBackground(g());
            typefaceTextView.setTextColor(Color.parseColor("#FF312E"));
            typefaceTextView.setTextSize(14.0f);
            getBinding().tvTrainingPlan.setTextColor(Color.parseColor("#666666"));
            getBinding().tvTrainingPlanTitle.setTextColor(Color.parseColor("#191919"));
            return;
        }
        getBinding().getRoot().setBackgroundResource(this.isMale.getA().booleanValue() ? R.drawable.play_training_bg_male : R.drawable.play_training_bg_female);
        TypefaceTextView typefaceTextView2 = getBinding().tvTrainingPlanStart;
        typefaceTextView2.setBackground(h());
        typefaceTextView2.setTextColor(-1);
        typefaceTextView2.setTextSize(13.0f);
        typefaceTextView2.setText(R.string.play_tool_training_plan_start);
        getBinding().tvTrainingPlan.setTextColor(Color.parseColor("#B3FFFFFF"));
        TypefaceTextView typefaceTextView3 = getBinding().tvTrainingPlanTitle;
        typefaceTextView3.setText(R.string.play_tool_training_plan_not_start);
        typefaceTextView3.setTextColor(-1);
    }

    private final void n() {
        m(false);
    }

    private final void o(Context context, TrainingPlanVo trainingPlanData) {
        m(true);
        getBinding().tvTrainingPlanTitle.setText(trainingPlanData.getName());
        getBinding().tvTrainingPlanStart.setText(context.getResources().getQuantityString(R.plurals.tr_wait_x_days_then_begin, trainingPlanData.getWaitDays(), Integer.valueOf(trainingPlanData.getWaitDays())));
    }

    private final void p(Context context, TrainingPlanVo trainingPlanData) {
        m(true);
        getBinding().tvTrainingPlanTitle.setText(trainingPlanData.getName());
        getBinding().tvTrainingPlanStart.setText(context.getString(R.string.play_tool_training_plan_progress, trainingPlanData.getDayIndex(), Integer.valueOf(trainingPlanData.getTotalDays())));
    }

    private final void q(TrainingPlanVo trainingPlanData) {
        m(true);
        getBinding().tvTrainingPlanTitle.setText(trainingPlanData.getName());
        getBinding().tvTrainingPlanStart.setText(R.string.tr_today_is_rest);
    }

    private final void r(Context context, TrainingPlanVo trainingPlanData) {
        m(true);
        getBinding().tvTrainingPlanTitle.setText(trainingPlanData.getName());
        getBinding().tvTrainingPlanStart.setText(context.getString(R.string.play_tool_training_plan_progress_continue, trainingPlanData.getDayIndex(), Integer.valueOf(trainingPlanData.getTotalDays())));
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void initData(@NotNull final Context context, @NotNull CardUiData uiParams) {
        j().getTrainingPlan().observe(this.lifecycleOwner, new Observer() { // from class: lx7
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                TrainingPlanCardRender.k(this.a, (Resource) obj);
            }
        });
        getBinding().tvTrainingPlanStart.setOnClickListener(new View.OnClickListener() { // from class: kx7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TrainingPlanCardRender.l(this.a, context, view);
            }
        });
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void onCardClick(@NotNull Context context, @NotNull CardUiData uiParams) {
        Resource<TrainingPlanVo> value = j().getTrainingPlan().getValue();
        if (value == null || value.getData() == null) {
            return;
        }
        i().navigateToPlanDetailPage(context);
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    public void setUiData(@NotNull Context context, @NotNull CardUiData uiParams) {
        TrainingPlanVo data;
        Resource<TrainingPlanVo> value = j().getTrainingPlan().getValue();
        Unit unit = null;
        if (value != null && (data = value.getData()) != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[data.getState().ordinal()];
            if (i == 1) {
                o(context, data);
            } else if (i == 2) {
                r(context, data);
            } else if (i != 3) {
                p(context, data);
            } else {
                q(data);
            }
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            n();
        }
    }

    @Override // com.xiaomi.hm.health.play.card.AbstractCardRender
    @NotNull
    public PlayCardTrainingPlanBinding getLayoutViewBinding(@NotNull LayoutInflater inflater, @NotNull ViewGroup rootView) {
        return PlayCardTrainingPlanBinding.inflate(inflater, rootView, true);
    }
}
