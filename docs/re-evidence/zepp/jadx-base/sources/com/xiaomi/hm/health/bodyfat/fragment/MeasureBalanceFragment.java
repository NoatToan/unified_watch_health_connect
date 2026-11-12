package com.xiaomi.hm.health.bodyfat.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.p008lifecycle.LifecycleOwnerKt;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProviders;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.bluetooth.profile.channel.module.ScaleBalanceData;
import com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureSuccess;
import com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureTimeout;
import com.huami.bluetooth.profile.channel.module.scale.BalanceResult;
import com.huami.bluetooth.profile.channel.module.scale.Failure;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bodyfat.R;
import com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment;
import com.xiaomi.hm.health.bodyfat.model.MeasureBalanceState;
import com.xiaomi.hm.health.bodyfat.view.BodyFatCircleProgressView;
import com.xiaomi.hm.health.bodyfat.viewmodel.MeasureBalanceViewModel;
import com.xiaomi.hm.health.databases.model.UserInfos;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u000e8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/MeasureBalanceFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "Lcom/xiaomi/hm/health/bodyfat/viewmodel/MeasureBalanceViewModel;", "a", "Lkotlin/Lazy;", "b", "()Lcom/xiaomi/hm/health/bodyfat/viewmodel/MeasureBalanceViewModel;", "viewModel", "", "J", "secondInMills", "", "c", "Z", "isCountDown", "<init>", "()V", "Companion", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
public final class MeasureBalanceFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final long secondInMills;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isCountDown;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/fragment/MeasureBalanceFragment$Companion;", "", "", "isGuest", "Landroidx/fragment/app/Fragment;", "newInstance", "<init>", "()V", "bodyfat_midongRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Fragment newInstance(boolean isGuest) {
            MeasureBalanceFragment measureBalanceFragment = new MeasureBalanceFragment();
            Bundle bundle = new Bundle();
            bundle.putBoolean("IS_GUEST", isGuest);
            Unit unit = Unit.INSTANCE;
            measureBalanceFragment.setArguments(bundle);
            return measureBalanceFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment$onViewCreated$1$1", f = "MeasureBalanceFragment.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"it"}, s = {"I$3"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public Object a;
        public Object b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        public final /* synthetic */ BodyFatCircleProgressView h;
        public final /* synthetic */ int i;
        public final /* synthetic */ MeasureBalanceFragment j;
        public final /* synthetic */ TextView k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BodyFatCircleProgressView bodyFatCircleProgressView, int i, MeasureBalanceFragment measureBalanceFragment, TextView textView, Continuation<? super a> continuation) {
            super(2, continuation);
            this.h = bodyFatCircleProgressView;
            this.i = i;
            this.j = measureBalanceFragment;
            this.k = textView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.h, this.i, this.j, this.k, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0049  */
        /* JADX WARN: Code duplicated, block: B:12:0x0069 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0067 -> B:13:0x006a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.g
                r2 = 1
                if (r1 == 0) goto L28
                if (r1 != r2) goto L20
                int r1 = r10.f
                int r3 = r10.e
                int r4 = r10.d
                int r5 = r10.c
                java.lang.Object r6 = r10.b
                android.widget.TextView r6 = (android.widget.TextView) r6
                java.lang.Object r7 = r10.a
                com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment r7 = (com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment) r7
                kotlin.ResultKt.throwOnFailure(r11)
                r11 = r10
                goto L6a
            L20:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L28:
                kotlin.ResultKt.throwOnFailure(r11)
                com.xiaomi.hm.health.bodyfat.view.BodyFatCircleProgressView r11 = r10.h
                int r1 = r10.i
                long r3 = (long) r1
                com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment r1 = r10.j
                long r5 = com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment.access$getSecondInMills$p(r1)
                long r3 = r3 * r5
                r11.start(r3)
                int r11 = r10.i
                com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment r1 = r10.j
                android.widget.TextView r3 = r10.k
                r4 = 0
                r5 = r11
                r7 = r1
                r6 = r3
                r11 = r10
                r3 = r5
            L47:
                if (r4 >= r3) goto L75
                java.lang.Integer r1 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
                int r1 = r1.intValue()
                long r8 = com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment.access$getSecondInMills$p(r7)
                r11.a = r7
                r11.b = r6
                r11.c = r5
                r11.d = r4
                r11.e = r3
                r11.f = r1
                r11.g = r2
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r8, r11)
                if (r8 != r0) goto L6a
                return r0
            L6a:
                int r1 = r5 - r1
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r6.setText(r1)
                int r4 = r4 + r2
                goto L47
            L75:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ BalanceResult<ScaleBalanceData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BalanceResult<ScaleBalanceData> balanceResult) {
            super(0);
            this.a = balanceResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "BalanceMeasureSuccess, progress=" + ((ScaleBalanceData) ((BalanceMeasureSuccess) this.a).getData()).getProgress() + ",duration=" + ((ScaleBalanceData) ((BalanceMeasureSuccess) this.a).getData()).getDuration() + ",status=" + ((ScaleBalanceData) ((BalanceMeasureSuccess) this.a).getData()).getStatus() + ",score=" + ((ScaleBalanceData) ((BalanceMeasureSuccess) this.a).getData()).getScore();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ BalanceResult<ScaleBalanceData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BalanceResult<ScaleBalanceData> balanceResult) {
            super(0);
            this.a = balanceResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "BalanceMeasureFailure, code=" + ((Failure) this.a).getCode() + ",msg=" + ((Failure) this.a).getMsg();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "BalanceMeasureTimeout";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bodyfat/viewmodel/MeasureBalanceViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<MeasureBalanceViewModel> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MeasureBalanceViewModel getA() {
            return (MeasureBalanceViewModel) ViewModelProviders.of(MeasureBalanceFragment.this.requireActivity()).get(MeasureBalanceViewModel.class);
        }
    }

    public MeasureBalanceFragment() {
        super(R.layout.fragment_measure_balance_score);
        this.viewModel = LazyKt__LazyJVMKt.lazy(new e());
        this.secondInMills = 1000L;
        this.isCountDown = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasureBalanceViewModel b() {
        return (MeasureBalanceViewModel) this.viewModel.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(final MeasureBalanceFragment measureBalanceFragment, BodyFatCircleProgressView bodyFatCircleProgressView, TextView textView, final BalanceResult balanceResult) {
        FragmentManager supportFragmentManager;
        FragmentTransaction fragmentTransactionBeginTransaction;
        FragmentTransaction fragmentTransactionAdd;
        if (!(balanceResult instanceof BalanceMeasureSuccess)) {
            if (balanceResult instanceof Failure) {
                HMLog.info("MeasureBalanceFragment", new c(balanceResult));
                measureBalanceFragment.b().getPageIndex().postValue(MeasureBalanceState.Failure.INSTANCE);
                return;
            } else {
                if (balanceResult instanceof BalanceMeasureTimeout) {
                    HMLog.info("MeasureBalanceFragment", d.a);
                    measureBalanceFragment.b().getPageIndex().postValue(MeasureBalanceState.Failure.INSTANCE);
                    return;
                }
                return;
            }
        }
        if (measureBalanceFragment.isCountDown) {
            measureBalanceFragment.isCountDown = false;
            Integer progress = ((ScaleBalanceData) ((BalanceMeasureSuccess) balanceResult).getData()).getProgress();
            kotlinx.coroutines.e.f(LifecycleOwnerKt.getLifecycleScope(measureBalanceFragment), null, null, new a(bodyFatCircleProgressView, 29 - (progress == null ? 0 : progress.intValue()), measureBalanceFragment, textView, null), 3, null);
        }
        HMLog.info("MeasureBalanceFragment", new b(balanceResult));
        BalanceMeasureSuccess balanceMeasureSuccess = (BalanceMeasureSuccess) balanceResult;
        if (((ScaleBalanceData) balanceMeasureSuccess.getData()).getStatus() == ScaleBalanceData.MeasureStatus.STATUS_MEASURE_FINISH) {
            Bundle arguments = measureBalanceFragment.getArguments();
            if (arguments == null ? false : arguments.getBoolean("IS_GUEST")) {
                MutableLiveData<MeasureBalanceState> pageIndex = measureBalanceFragment.b().getPageIndex();
                MeasureBalanceState.Success success = MeasureBalanceState.Success.INSTANCE;
                Integer score = ((ScaleBalanceData) balanceMeasureSuccess.getData()).getScore();
                success.setValue(score == null ? 0L : score.intValue());
                Unit unit = Unit.INSTANCE;
                pageIndex.postValue(success);
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Integer score2 = ((ScaleBalanceData) balanceMeasureSuccess.getData()).getScore();
            ChooseUserFragment chooseUserFragmentNewInstance = ChooseUserFragment.INSTANCE.newInstance(new ChooseUserFragment.WeightData(0.0f, jCurrentTimeMillis, 0, 0.0f, score2 == null ? 0 : score2.intValue(), false, 32, null), new ChooseUserFragment.ChooseUserListener() { // from class: com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment$onViewCreated$1$chooseUserFragment$1
                @Override // com.xiaomi.hm.health.bodyfat.fragment.ChooseUserFragment.ChooseUserListener
                public void chooseUser(@NotNull UserInfos userInfos) {
                    MeasureBalanceViewModel measureBalanceViewModelB = this.a.b();
                    Context contextRequireContext = this.a.requireContext();
                    Integer score3 = ((ScaleBalanceData) ((BalanceMeasureSuccess) balanceResult).getData()).getScore();
                    measureBalanceViewModelB.saveBalanceData(contextRequireContext, userInfos, score3 == null ? 0 : score3.intValue(), System.currentTimeMillis());
                }
            }, new ChooseUserFragment.DismissListener() { // from class: com.xiaomi.hm.health.bodyfat.fragment.MeasureBalanceFragment$onViewCreated$1$chooseUserFragment$2
                @Override // com.xiaomi.hm.health.bodyfat.fragment.ChooseUserFragment.DismissListener
                public void dismissFragment() {
                    this.a.requireActivity().finish();
                }
            });
            FragmentActivity activity = measureBalanceFragment.getActivity();
            if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null || (fragmentTransactionBeginTransaction = supportFragmentManager.beginTransaction()) == null || (fragmentTransactionAdd = fragmentTransactionBeginTransaction.add(android.R.id.content, chooseUserFragmentNewInstance)) == null) {
                return;
            }
            fragmentTransactionAdd.commit();
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        final BodyFatCircleProgressView bodyFatCircleProgressView = (BodyFatCircleProgressView) view.findViewById(R.id.progress_view);
        final TextView textView = (TextView) view.findViewById(R.id.text_count);
        b().getMeasureResult().observe(getViewLifecycleOwner(), new Observer() { // from class: pv4
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                MeasureBalanceFragment.c(this.a, bodyFatCircleProgressView, textView, (BalanceResult) obj);
            }
        });
    }
}
