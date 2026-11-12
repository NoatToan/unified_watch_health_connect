package com.xiaomi.fitness.health.sleep.interfere.report;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import coil.Coil;
import coil.ImageLoader;
import coil.request.ImageRequest;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.recyclerview.decoration.GridVerticalDividerItemDecoration;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel;
import com.xiaomi.fitness.health.sleep.interfere.net.ReportTask;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.widget.view.RoundImageView;
import defpackage.eri;
import defpackage.iji;
import defpackage.ni4;
import defpackage.pni;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\n \u0012*\u0004\u0018\u00010\u00110\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\n \u0012*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0019\u001a\n \u0012*\u0004\u0018\u00010\u00180\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\n \u0012*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\n \u0012*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0017¨\u0006%"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportSummaryHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "viewModel", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "getViewModel", "()Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Landroid/widget/TextView;", "completedDaysTextView", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereSummaryAdapter;", "adapter", "Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereSummaryAdapter;", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", "userImg", "Lcom/xiaomi/fitness/widget/view/RoundImageView;", CommonConstants.KEY_USER_NAME, "<init>", "(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class SleepInterfereReportSummaryHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "SleepInterfereReportSummaryHolder";

    @NotNull
    private final SleepInterfereSummaryAdapter adapter;
    private final TextView completedDaysTextView;
    private final Context context;

    @NotNull
    private final LifecycleOwner lifecycleOwner;
    private final RecyclerView recyclerView;
    private final RoundImageView userImg;
    private final TextView userName;

    @NotNull
    private final View view;

    @NotNull
    private final SleepInterfereReportViewModel viewModel;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSummaryHolder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSummaryHolder$1", f = "SleepInterfereReportSummaryHolder.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereReportSummaryHolder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<SleepInterferePlan> planStateFlow = SleepInterfereReportSummaryHolder.this.getViewModel().getPlanStateFlow();
                C06071 c06071 = new C06071(SleepInterfereReportSummaryHolder.this);
                this.label = 1;
                if (planStateFlow.collect(c06071, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSummaryHolder$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        @SourceDebugExtension({"SMAP\nSleepInterfereReportSummaryHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereReportSummaryHolder.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportSummaryHolder$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Extensions.kt\ncoil/-SingletonExtensions\n*L\n1#1,117:1\n774#2:118\n865#2,2:119\n54#3,3:121\n24#3:124\n59#3,6:125\n*S KotlinDebug\n*F\n+ 1 SleepInterfereReportSummaryHolder.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportSummaryHolder$1$1\n*L\n100#1:118\n100#1:119,2\n106#1:121,3\n106#1:124\n106#1:125,6\n*E\n"})
        public static final class C06071<T> implements FlowCollector {
            final /* synthetic */ SleepInterfereReportSummaryHolder this$0;

            public C06071(SleepInterfereReportSummaryHolder sleepInterfereReportSummaryHolder) {
                this.this$0 = sleepInterfereReportSummaryHolder;
            }

            /* JADX WARN: Code duplicated, block: B:29:0x0110  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            public final Object emit(SleepInterferePlan sleepInterferePlan, Continuation<? super Unit> continuation) {
                SleepInterfereReportSummaryHolder$1$1$emit$1 sleepInterfereReportSummaryHolder$1$1$emit$1;
                List<T> listEmptyList;
                String str;
                C06071<T> c06071;
                String userName;
                if (continuation instanceof SleepInterfereReportSummaryHolder$1$1$emit$1) {
                    sleepInterfereReportSummaryHolder$1$1$emit$1 = (SleepInterfereReportSummaryHolder$1$1$emit$1) continuation;
                    int i = sleepInterfereReportSummaryHolder$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        sleepInterfereReportSummaryHolder$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        sleepInterfereReportSummaryHolder$1$1$emit$1 = new SleepInterfereReportSummaryHolder$1$1$emit$1(this, continuation);
                    }
                } else {
                    sleepInterfereReportSummaryHolder$1$1$emit$1 = new SleepInterfereReportSummaryHolder$1$1$emit$1(this, continuation);
                }
                Object miAccountCoreInfo$default = sleepInterfereReportSummaryHolder$1$1$emit$1.result;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = sleepInterfereReportSummaryHolder$1$1$emit$1.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(miAccountCoreInfo$default);
                    if (sleepInterferePlan == null) {
                        return Unit.INSTANCE;
                    }
                    int completedDaysCount = sleepInterferePlan.getReport().getCompletedDaysCount();
                    StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
                    Context context = this.this$0.context;
                    Intrinsics.checkNotNullExpressionValue(context, "access$getContext$p(...)");
                    int i3 = qxi.M1;
                    SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
                    this.this$0.completedDaysTextView.setText(styledStringUtils.getStyledString(context, i3, completedDaysCount, (1008 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey, "330"), TuplesKt.to(SpanPropKey.FONT_SIZE, "31%"))), (1008 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(new StyledStringUtils.StyledArg(Boxing.boxInt(completedDaysCount), new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey, "600"), TuplesKt.to(SpanPropKey.MARGIN, "10dp"))))), (1008 & 16) != 0, (1008 & 32) != 0 ? Locale.getDefault() : null, (1008 & 64) != 0, (1008 & 128) != 0 ? null : null, (1008 & 256) != 0 ? MapsKt__MapsKt.emptyMap() : null, (1008 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null));
                    final List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"TIMELY_SLEEP", "TIMELY_WAKE_UP", "LIMIT_NAPS", "EXERCISE_30MIN", "BREATH_RELAX", "SLEEP_TIP"});
                    List<ReportTask> tasks = sleepInterferePlan.getReport().getTasks();
                    if (tasks != null) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : tasks) {
                            if (listListOf.contains(((ReportTask) t).getType())) {
                                arrayList.add(t);
                            }
                        }
                        final Comparator comparator = new Comparator() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSummaryHolder$1$1$emit$$inlined$compareByDescending$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t2, T t3) {
                                return ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((ReportTask) t3).getCompleteCount()), Integer.valueOf(((ReportTask) t2).getCompleteCount()));
                            }
                        };
                        listEmptyList = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSummaryHolder$1$1$emit$$inlined$thenBy$1
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // java.util.Comparator
                            public final int compare(T t2, T t3) {
                                int iCompare = comparator.compare(t2, t3);
                                return iCompare != 0 ? iCompare : ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(listListOf.indexOf(((ReportTask) t2).getType())), Integer.valueOf(listListOf.indexOf(((ReportTask) t3).getType())));
                            }
                        });
                        if (listEmptyList == null) {
                            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                        }
                    } else {
                        listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                    }
                    this.this$0.adapter.submitList(listEmptyList);
                    UserInfoManager accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
                    sleepInterfereReportSummaryHolder$1$1$emit$1.L$0 = this;
                    sleepInterfereReportSummaryHolder$1$1$emit$1.label = 1;
                    str = null;
                    miAccountCoreInfo$default = UserInfoManager.getMiAccountCoreInfo$default(accountManagerExtKt, false, sleepInterfereReportSummaryHolder$1$1$emit$1, 1, null);
                    if (miAccountCoreInfo$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    c06071 = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c06071 = (C06071) sleepInterfereReportSummaryHolder$1$1$emit$1.L$0;
                    ResultKt.throwOnFailure(miAccountCoreInfo$default);
                    str = null;
                }
                AccountCoreInfo accountCoreInfo = (AccountCoreInfo) miAccountCoreInfo$default;
                RoundImageView roundImageView = c06071.this$0.userImg;
                Intrinsics.checkNotNullExpressionValue(roundImageView, "access$getUserImg$p(...)");
                String avatarAddress = accountCoreInfo != null ? accountCoreInfo.getAvatarAddress() : str;
                ImageLoader imageLoader = Coil.imageLoader(roundImageView.getContext());
                ImageRequest.Builder builderTarget = new ImageRequest.Builder(roundImageView.getContext()).data(avatarAddress).target(roundImageView);
                builderTarget.allowHardware(false);
                builderTarget.bitmapConfig(Bitmap.Config.ARGB_8888);
                builderTarget.placeholder(pni.K1);
                builderTarget.error(pni.K1);
                imageLoader.enqueue(builderTarget.build());
                TextView textView = c06071.this$0.userName;
                if (accountCoreInfo == null || (userName = accountCoreInfo.getUserName()) == null) {
                    userName = "";
                }
                textView.setText(userName);
                return Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((SleepInterferePlan) obj, (Continuation<? super Unit>) continuation);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepInterfereReportSummaryHolder(@NotNull View view, @NotNull LifecycleOwner lifecycleOwner, @NotNull SleepInterfereReportViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.lifecycleOwner = lifecycleOwner;
        this.viewModel = viewModel;
        Context context = view.getContext();
        this.context = context;
        this.completedDaysTextView = (TextView) view.findViewById(eri.U1);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(eri.Ih);
        this.recyclerView = recyclerView;
        SleepInterfereSummaryAdapter sleepInterfereSummaryAdapter = new SleepInterfereSummaryAdapter();
        this.adapter = sleepInterfereSummaryAdapter;
        this.userImg = (RoundImageView) view.findViewById(eri.Ko);
        this.userName = (TextView) view.findViewById(eri.Lo);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 2));
        recyclerView.addItemDecoration(new GridVerticalDividerItemDecoration(ni4.c(context, iji.s3), 0, 0, 0, 14, null));
        recyclerView.setAdapter(sleepInterfereSummaryAdapter);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    @NotNull
    public final SleepInterfereReportViewModel getViewModel() {
        return this.viewModel;
    }
}
