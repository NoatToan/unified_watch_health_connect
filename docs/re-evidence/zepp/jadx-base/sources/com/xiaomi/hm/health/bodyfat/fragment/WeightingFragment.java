package com.xiaomi.hm.health.bodyfat.fragment;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.amap.api.mapcore.util.hl;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.arch.helper.Resource;
import com.huami.arch.helper.Status;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.widget.toast.CustomToast;
import com.loc.z;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.callback.WeightingState;
import com.xiaomi.hm.health.bodyfat.databinding.FragmentWeightingBinding;
import com.xiaomi.hm.health.bodyfat.databinding.LayoutWeightTitleAndViewBinding;
import com.xiaomi.hm.health.bodyfat.fragment.WeightingFragment;
import com.xiaomi.hm.health.bodyfat.utils.BFCallback;
import com.xiaomi.hm.health.bodyfat.utils.ExtentionUtilsKt;
import com.xiaomi.hm.health.bodyfat.utils.HMWeightUtils;
import com.xiaomi.hm.health.bodyfat.utils.ScaleSettingUpdateUtil;
import com.xiaomi.hm.health.bodyfat.utils.StatEvent;
import com.xiaomi.hm.health.bodyfat.viewmodel.MainWeightingViewModel;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.model.MeasureData;
import com.xiaomi.hm.health.bt.model.MeasureState;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.databases.model.UserInfos;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b<\u0010=J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0012\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010*R\u0016\u00103\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010*R\u001d\u00107\u001a\u0002048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b-\u00106R\u001f\u0010;\u001a\u0004\u0018\u0001088F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b9\u0010:¨\u0006>"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/WeightingFragment;", "Landroidx/fragment/app/Fragment;", "", "msg", "", "e", "Lcom/xiaomi/hm/health/bt/model/WeightAdvData;", "data", "", z.j, "initViewModel", "Lcom/xiaomi/hm/health/databases/model/UserInfos;", "userInfos", "i", "tips", hl.k, "m", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", ViewHierarchyConstants.VIEW_KEY, "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentWeightingBinding;", "a", "Lcom/xiaomi/hm/health/bodyfat/databinding/FragmentWeightingBinding;", "binding", "Lcom/xiaomi/hm/health/bodyfat/databinding/LayoutWeightTitleAndViewBinding;", "b", "Lcom/xiaomi/hm/health/bodyfat/databinding/LayoutWeightTitleAndViewBinding;", "includeBinding", "c", "Ljava/lang/String;", "prefix", "Lcom/xiaomi/hm/health/bt/model/MeasureState;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/model/MeasureState;", EcgData.MEASURE_STATE, "Z", "weightSuccess", "", "f", "J", "timeDelayWhenExit", "g", "showUnknownUser", "h", "showMatchUserTips", "Lcom/xiaomi/hm/health/bodyfat/fragment/MatchUserTipsDialog;", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/bodyfat/fragment/MatchUserTipsDialog;", "matchUserTipsDialog", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "getViewModel", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "viewModel", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class WeightingFragment extends Fragment {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private FragmentWeightingBinding binding;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private LayoutWeightTitleAndViewBinding includeBinding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private MeasureState measureState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean weightSuccess;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean showUnknownUser;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean showMatchUserTips;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String prefix = "WeightingFragment";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long timeDelayWhenExit = 2000;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy matchUserTipsDialog = LazyKt__LazyJVMKt.lazy(c.a);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel = LazyKt__LazyJVMKt.lazy(new d());

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MeasureState.values().length];
            iArr[MeasureState.MEASURING_FINISHED.ordinal()] = 1;
            iArr[MeasureState.MEASURING_IMPEDANCE.ordinal()] = 2;
            iArr[MeasureState.MEASURING_PRESSURE.ordinal()] = 3;
            iArr[MeasureState.MEASURING_HR.ordinal()] = 4;
            iArr[MeasureState.MEASURING_WEIGHT.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Status.values().length];
            iArr2[Status.ERROR.ordinal()] = 1;
            iArr2[Status.SUCCESS.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.fragment.WeightingFragment$exit$1", f = "WeightingFragment.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightingFragment.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = WeightingFragment.this.timeDelayWhenExit;
                this.a = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            FragmentActivity activity = WeightingFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.fragment.WeightingFragment$initViewModel$2$1", f = "WeightingFragment.kt", i = {}, l = {FTPCodes.NAME_SYSTEM_TIME, 217}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Resource<UserInfos> c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.fragment.WeightingFragment$initViewModel$2$1$result$1", f = "WeightingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
            public int a;
            public final /* synthetic */ WeightingFragment b;
            public final /* synthetic */ Resource<UserInfos> c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(WeightingFragment weightingFragment, Resource<? extends UserInfos> resource, Continuation<? super a> continuation) {
                super(2, continuation);
                this.b = weightingFragment;
                this.c = resource;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new a(this.b, this.c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
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
                return Boxing.boxBoolean(this.b.i(this.c.getData()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Resource<? extends UserInfos> resource, Continuation<? super b> continuation) {
            super(2, continuation);
            this.c = resource;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WeightingFragment.this.new b(this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0055  */
        /* JADX WARN: Code duplicated, block: B:22:0x005e  */
        /* JADX WARN: Code duplicated, block: B:35:0x0085  */
        /* JADX WARN: Code duplicated, block: B:38:0x008e  */
        /* JADX WARN: Code duplicated, block: B:39:0x0092  */
        /* JADX WARN: Code duplicated, block: B:42:0x009b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            MainWeightingViewModel viewModel;
            MutableLiveData<WeightAdvData> weightData;
            WeightAdvData value;
            MeasureState measureState;
            MainWeightingViewModel viewModel2;
            MainWeightingViewModel viewModel3;
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
                if (!((Boolean) obj).booleanValue()) {
                    viewModel = WeightingFragment.this.getViewModel();
                    if ((viewModel != null || (weightData = viewModel.getWeightData()) == null || (value = weightData.getValue()) == null || (measureState = value.getMeasureState()) == null || measureState.getValue() != MeasureState.MEASURING_FINISHED.getValue()) ? false : true) {
                        viewModel3 = WeightingFragment.this.getViewModel();
                        if (viewModel3 != null) {
                            viewModel3.switchPage(WeightingState.state_weight_detail);
                        }
                    } else {
                        viewModel2 = WeightingFragment.this.getViewModel();
                        if (viewModel2 != null) {
                            viewModel2.switchPage(258);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ScaleSettingUpdateUtil scaleSettingUpdateUtil = ScaleSettingUpdateUtil.INSTANCE;
            this.a = 1;
            obj = scaleSettingUpdateUtil.isMeasureBody(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                a aVar = new a(WeightingFragment.this, this.c, null);
                this.a = 2;
                obj = BuildersKt.withContext(main, aVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                    viewModel = WeightingFragment.this.getViewModel();
                    if ((viewModel != null || (weightData = viewModel.getWeightData()) == null || (value = weightData.getValue()) == null || (measureState = value.getMeasureState()) == null || measureState.getValue() != MeasureState.MEASURING_FINISHED.getValue()) ? false : true) {
                        viewModel3 = WeightingFragment.this.getViewModel();
                        if (viewModel3 != null) {
                            viewModel3.switchPage(WeightingState.state_weight_detail);
                        }
                    } else {
                        viewModel2 = WeightingFragment.this.getViewModel();
                        if (viewModel2 != null) {
                            viewModel2.switchPage(258);
                        }
                    }
                }
            } else {
                MainWeightingViewModel viewModel4 = WeightingFragment.this.getViewModel();
                if (viewModel4 != null) {
                    viewModel4.switchPage(WeightingState.state_weight_detail);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/MatchUserTipsDialog;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<MatchUserTipsDialog> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MatchUserTipsDialog getA() {
            return new MatchUserTipsDialog();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/MainWeightingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<MainWeightingViewModel> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MainWeightingViewModel getA() {
            FragmentActivity activity = WeightingFragment.this.getActivity();
            if (activity == null) {
                return null;
            }
            return (MainWeightingViewModel) new ViewModelProvider(activity).get(MainWeightingViewModel.class);
        }
    }

    private final void e(String msg) {
        CustomToast.makeText(getActivity(), msg, 1).show();
        e.f(LifecycleOwnerKt.getLifecycleScope(this), null, null, new a(null), 3, null);
    }

    private final MatchUserTipsDialog f() {
        return (MatchUserTipsDialog) this.matchUserTipsDialog.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x0172  */
    /* JADX WARN: Code duplicated, block: B:95:0x0164  */
    /* JADX WARN: Code duplicated, block: B:98:0x016b  */
    public static final void g(WeightingFragment weightingFragment, WeightAdvData weightAdvData) {
        MainWeightingViewModel viewModel;
        MainWeightingViewModel viewModel2;
        MainWeightingViewModel viewModel3;
        if (weightingFragment.showUnknownUser) {
            return;
        }
        if (weightAdvData.isOverload() && (viewModel3 = weightingFragment.getViewModel()) != null) {
            viewModel3.switchPage(WeightingState.state_weight_overload);
        }
        MeasureState measureState = weightAdvData.getMeasureState();
        int i = measureState == null ? -1 : WhenMappings.$EnumSwitchMapping$0[measureState.ordinal()];
        boolean z = false;
        if (i == 1) {
            MeasureState measureState2 = weightingFragment.measureState;
            MeasureState measureState3 = MeasureState.MEASURING_FINISHED;
            if (measureState2 != measureState3) {
                weightingFragment.measureState = measureState3;
                if (weightingFragment.j(weightAdvData)) {
                    Analytics.recordEvent(new CountEventBuilder(HMWeightUtils.getScaleAnalyticsType()).setValue(StatEvent.Notstable));
                    Analytics.recordEvent(new CountEventBuilder(HMWeightUtils.getScaleAnalyticsType()).setValue(StatEvent.Measure_NotOver));
                    weightingFragment.e(weightingFragment.getString(R.string.weight_instable_left_title));
                } else if (BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()) {
                    MeasureData measureData = weightAdvData.getMeasureData();
                    if (measureData != null && measureData.getFamilyId() == -2) {
                        MainWeightingViewModel viewModel4 = weightingFragment.getViewModel();
                        if ((viewModel4 == null || viewModel4.getIsGuest()) ? false : true) {
                            weightingFragment.e(weightingFragment.getString(R.string.tips_choose_user_first));
                        } else {
                            viewModel = weightingFragment.getViewModel();
                            if (viewModel != null) {
                                MeasureData measureData2 = weightAdvData.getMeasureData();
                                viewModel.setChooseUser(measureData2 != null ? Long.valueOf(measureData2.getFamilyId()) : null);
                            }
                        }
                    } else {
                        viewModel = weightingFragment.getViewModel();
                        if (viewModel != null) {
                            MeasureData measureData3 = weightAdvData.getMeasureData();
                            viewModel.setChooseUser(measureData3 != null ? Long.valueOf(measureData3.getFamilyId()) : null);
                        }
                    }
                }
            }
        } else if (i == 2 || i == 3 || i == 4) {
            if (BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()) {
                if (weightingFragment.showMatchUserTips) {
                    weightingFragment.f().dismiss();
                }
                MainWeightingViewModel viewModel5 = weightingFragment.getViewModel();
                if (viewModel5 != null) {
                    MeasureData measureData4 = weightAdvData.getMeasureData();
                    viewModel5.setChooseUser(measureData4 != null ? Long.valueOf(measureData4.getFamilyId()) : null);
                }
            }
        } else if (i == 5) {
            MeasureData measureData5 = weightAdvData.getMeasureData();
            if (measureData5 != null && measureData5.measureResult() == 1) {
                weightingFragment.weightSuccess = true;
                if (weightAdvData.isPart()) {
                    FragmentWeightingBinding fragmentWeightingBinding = weightingFragment.binding;
                    Objects.requireNonNull(fragmentWeightingBinding);
                    fragmentWeightingBinding.smallWeightTips.setVisibility(0);
                } else {
                    int boundWeightDeviceSourceValue = BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue();
                    if (boundWeightDeviceSourceValue == HMDeviceSource.WEIGHT_BODYFAT.getValue() || boundWeightDeviceSourceValue == HMDeviceSource.WEIGHT_BFS.getValue()) {
                        MainWeightingViewModel viewModel6 = weightingFragment.getViewModel();
                        if (viewModel6 != null) {
                            viewModel6.switchPage(258);
                        }
                    } else {
                        if ((boundWeightDeviceSourceValue == HMDeviceSource.WEIGHT.getValue() || boundWeightDeviceSourceValue == HMDeviceSource.WEIGHT_SCALE2.getValue()) && (viewModel2 = weightingFragment.getViewModel()) != null) {
                            viewModel2.switchPage(WeightingState.state_weight_detail);
                        }
                    }
                }
            }
        }
        MeasureData measureData6 = weightAdvData.getMeasureData();
        if (measureData6 != null && measureData6.isMatchingUser()) {
            z = true;
        }
        if (z && !weightingFragment.showMatchUserTips) {
            weightingFragment.showMatchUserTips = true;
            FragmentActivity activity = weightingFragment.getActivity();
            if (activity != null) {
                activity.getSupportFragmentManager().beginTransaction().add(android.R.id.content, weightingFragment.f()).commit();
            }
        }
        ExtentionUtilsKt.measureStateLog(weightingFragment.prefix, weightAdvData.getMeasureState(), weightAdvData.getMeasureData());
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding = weightingFragment.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding);
        layoutWeightTitleAndViewBinding.number.setText(HMWeightUtils.getWeightValueStringForDisplay(weightAdvData.getValueKg(), weightAdvData.getType()));
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding2 = weightingFragment.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding2);
        layoutWeightTitleAndViewBinding2.numberUnit.setText(HMWeightUtils.toUnitStr(weightingFragment.getActivity(), weightAdvData.getType()));
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding3 = weightingFragment.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding3);
        layoutWeightTitleAndViewBinding3.weightChart.setValue(weightAdvData.getValueKg());
        weightingFragment.measureState = weightAdvData.getMeasureState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(WeightingFragment weightingFragment, Resource resource) {
        MutableLiveData<WeightAdvData> weightData;
        if (BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()) {
            if (weightingFragment.f().isVisible()) {
                weightingFragment.f().dismiss();
            }
            int i = WhenMappings.$EnumSwitchMapping$1[resource.getStatus().ordinal()];
            if (i == 1) {
                weightingFragment.m();
                return;
            }
            if (i != 2) {
                return;
            }
            MainWeightingViewModel viewModel = weightingFragment.getViewModel();
            if (viewModel != null) {
                MainWeightingViewModel viewModel2 = weightingFragment.getViewModel();
                viewModel.saveWeightData((viewModel2 == null || (weightData = viewModel2.getWeightData()) == null) ? null : weightData.getValue());
            }
            MainWeightingViewModel viewModel3 = weightingFragment.getViewModel();
            if (!(viewModel3 != null && viewModel3.getIsGuest())) {
                e.f(LifecycleOwnerKt.getLifecycleScope(weightingFragment), Dispatchers.getIO(), null, weightingFragment.new b(resource, null), 2, null);
                return;
            }
            MainWeightingViewModel viewModel4 = weightingFragment.getViewModel();
            if (viewModel4 == null) {
                return;
            }
            viewModel4.switchPage(258);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i(UserInfos userInfos) {
        String measureTips = HMWeightUtils.getMeasureTips(userInfos, getActivity());
        if (!(measureTips.length() > 0)) {
            return false;
        }
        k(measureTips);
        return true;
    }

    private final void initViewModel() {
        MutableLiveData<Resource<UserInfos>> chooseUser;
        MutableLiveData<WeightAdvData> weightData;
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding = this.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding);
        layoutWeightTitleAndViewBinding.title.setText(getString(R.string.weighting_weight_title));
        LayoutWeightTitleAndViewBinding layoutWeightTitleAndViewBinding2 = this.includeBinding;
        Objects.requireNonNull(layoutWeightTitleAndViewBinding2);
        layoutWeightTitleAndViewBinding2.weightChart.setMaxValue(HMWeightUtils.getScaleMaxValue());
        MainWeightingViewModel viewModel = getViewModel();
        if (viewModel != null && (weightData = viewModel.getWeightData()) != null) {
            weightData.observe(getViewLifecycleOwner(), new Observer() { // from class: bu8
                @Override // androidx.p008lifecycle.Observer
                public final void onChanged(Object obj) {
                    WeightingFragment.g(this.a, (WeightAdvData) obj);
                }
            });
        }
        MainWeightingViewModel viewModel2 = getViewModel();
        if (viewModel2 == null || (chooseUser = viewModel2.getChooseUser()) == null) {
            return;
        }
        chooseUser.observe(getViewLifecycleOwner(), new Observer() { // from class: au8
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                WeightingFragment.h(this.a, (Resource) obj);
            }
        });
    }

    private final boolean j(WeightAdvData data) {
        if (BFCallback.getHMDeviceManager().getBoundWeightDeviceSourceValue() == HMDeviceSource.WEIGHT_AMAZFIT_SCALE.getValue()) {
            if (!this.weightSuccess) {
                MeasureData measureData = data.getMeasureData();
                if (measureData != null && measureData.getFamilyId() == -2) {
                    return true;
                }
            }
        } else if (!this.weightSuccess) {
            return true;
        }
        return false;
    }

    private final void k(String tips) {
        new AlertDialogFragment.Builder(getActivity()).setNeutralButton(getString(R.string.got_it), new DialogInterface.OnClickListener() { // from class: yt8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WeightingFragment.l(this.a, dialogInterface, i);
            }
        }).setMessage(tips).setCancelable(true).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(WeightingFragment weightingFragment, DialogInterface dialogInterface, int i) {
        MainWeightingViewModel viewModel = weightingFragment.getViewModel();
        if (viewModel == null) {
            return;
        }
        viewModel.switchPage(WeightingState.state_weight_detail);
    }

    private final void m() {
        this.showUnknownUser = true;
        new AlertDialogFragment.Builder(getActivity()).setNeutralButton(getString(R.string.got_it), new DialogInterface.OnClickListener() { // from class: zt8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                WeightingFragment.n(this.a, dialogInterface, i);
            }
        }).setMessage(getString(R.string.tips_choose_error_user)).setCancelable(false).show(getChildFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(WeightingFragment weightingFragment, DialogInterface dialogInterface, int i) {
        FragmentActivity activity = weightingFragment.getActivity();
        if (activity == null) {
            return;
        }
        activity.finish();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Nullable
    public final MainWeightingViewModel getViewModel() {
        return (MainWeightingViewModel) this.viewModel.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentWeightingBinding fragmentWeightingBindingInflate = FragmentWeightingBinding.inflate(inflater);
        this.binding = fragmentWeightingBindingInflate;
        Objects.requireNonNull(fragmentWeightingBindingInflate);
        this.includeBinding = LayoutWeightTitleAndViewBinding.bind(fragmentWeightingBindingInflate.getRoot());
        FragmentWeightingBinding fragmentWeightingBinding = this.binding;
        Objects.requireNonNull(fragmentWeightingBinding);
        return fragmentWeightingBinding.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViewModel();
    }
}
