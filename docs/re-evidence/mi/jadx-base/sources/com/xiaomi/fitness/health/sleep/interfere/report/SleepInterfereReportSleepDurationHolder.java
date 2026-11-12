package com.xiaomi.fitness.health.sleep.interfere.report;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.baseui.widget.LevelBarView;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.data.HealthPrefer;
import com.xiaomi.fitness.health.sleep.interfere.SleepInterfereReportViewModel;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepData;
import com.xiaomi.fitness.health.sleep.interfere.net.SleepInterferePlan;
import com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSleepDurationHolder;
import com.xiaomi.fitness.health.sleep.interfere.report.charts.SleepDurationStackedBarChart;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.gfe;
import defpackage.iji;
import defpackage.pni;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b8\u00109J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010&\u001a\n \"*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010)\u001a\n \"*\u0004\u0018\u00010(0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportSleepDurationHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "", "initLevelDescRecyclerview", "()V", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;", "plan", "updateWithPlan", "(Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepInterferePlan;)V", "", "Lcom/xiaomi/fitness/health/sleep/interfere/net/SleepData$NightSleepDuration$Daily;", "records", "refreshLevelItems", "(Ljava/util/List;)V", "", "diffMinutes", "updateHighLightTip", "(I)V", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "viewModel", "Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "getViewModel", "()Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "context", "Landroid/content/Context;", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepDurationStackedBarChart;", "chart", "Lcom/xiaomi/fitness/health/sleep/interfere/report/charts/SleepDurationStackedBarChart;", "Landroidx/recyclerview/widget/RecyclerView;", "levelDescRv", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/widget/TextView;", "tvHighLightTip", "Landroid/widget/TextView;", "durationView", "", "Lcom/xiaomi/fitness/baseui/widget/LevelBarView$LevelItem;", "levelItems", "Ljava/util/List;", "Lgfe;", "levelDescAdapter", "Lgfe;", "sleepTarget", "I", "<init>", "(Landroid/view/View;Landroidx/lifecycle/LifecycleOwner;Lcom/xiaomi/fitness/health/sleep/interfere/SleepInterfereReportViewModel;)V", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSleepInterfereReportSleepDurationHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepInterfereReportSleepDurationHolder.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportSleepDurationHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1#2:222\n295#3,2:223\n*S KotlinDebug\n*F\n+ 1 SleepInterfereReportSleepDurationHolder.kt\ncom/xiaomi/fitness/health/sleep/interfere/report/SleepInterfereReportSleepDurationHolder\n*L\n125#1:223,2\n*E\n"})
public final class SleepInterfereReportSleepDurationHolder extends RecyclerView.d0 {
    private final SleepDurationStackedBarChart chart;
    private final Context context;

    @NotNull
    private final TextView durationView;

    @Nullable
    private gfe levelDescAdapter;
    private final RecyclerView levelDescRv;

    @NotNull
    private final List<LevelBarView.LevelItem> levelItems;

    @NotNull
    private final LifecycleOwner lifecycleOwner;
    private int sleepTarget;

    @NotNull
    private final TextView tvHighLightTip;

    @NotNull
    private final View view;

    @NotNull
    private final SleepInterfereReportViewModel viewModel;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSleepDurationHolder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSleepDurationHolder$1", f = "SleepInterfereReportSleepDurationHolder.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepInterfereReportSleepDurationHolder.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<SleepInterferePlan> planStateFlow = SleepInterfereReportSleepDurationHolder.this.getViewModel().getPlanStateFlow();
                final SleepInterfereReportSleepDurationHolder sleepInterfereReportSleepDurationHolder = SleepInterfereReportSleepDurationHolder.this;
                FlowCollector<? super SleepInterferePlan> flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.sleep.interfere.report.SleepInterfereReportSleepDurationHolder.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((SleepInterferePlan) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(SleepInterferePlan sleepInterferePlan, Continuation<? super Unit> continuation) {
                        if (sleepInterferePlan == null) {
                            return Unit.INSTANCE;
                        }
                        sleepInterfereReportSleepDurationHolder.updateWithPlan(sleepInterferePlan);
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (planStateFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepInterfereReportSleepDurationHolder(@NotNull View view, @NotNull LifecycleOwner lifecycleOwner, @NotNull SleepInterfereReportViewModel viewModel) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.view = view;
        this.lifecycleOwner = lifecycleOwner;
        this.viewModel = viewModel;
        this.context = view.getContext();
        this.chart = (SleepDurationStackedBarChart) view.findViewById(eri.rf);
        this.levelDescRv = (RecyclerView) view.findViewById(eri.ra);
        View viewFindViewById = view.findViewById(eri.vl);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.tvHighLightTip = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(eri.df);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.durationView = (TextView) viewFindViewById2;
        this.levelItems = new ArrayList();
        this.sleepTarget = HealthPrefer.INSTANCE.getSLEEP_GOAL_TIME_LOCAL();
        initLevelDescRecyclerview();
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new AnonymousClass1(null), 3, null);
    }

    private final void initLevelDescRecyclerview() {
        List<LevelBarView.LevelItem> list = this.levelItems;
        LevelBarView.LevelItem levelItem = new LevelBarView.LevelItem(iji.f3, c0j.Cf);
        levelItem.e = pni.s0;
        list.addAll(CollectionsKt__CollectionsJVMKt.listOf(levelItem));
        this.levelDescAdapter = new gfe(this.context, this.levelItems, 3);
        RecyclerView recyclerView = this.levelDescRv;
        recyclerView.setLayoutManager(new GridLayoutManager(recyclerView.getContext(), 3));
        recyclerView.setAdapter(this.levelDescAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
    }

    private final void refreshLevelItems(List<SleepData.NightSleepDuration.Daily> records) {
        this.levelItems.clear();
        if (refreshLevelItems$has(records, new Function1() { // from class: mom
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepInterfereReportSleepDurationHolder.refreshLevelItems$lambda$4((SleepData.NightSleepDuration.Daily) obj));
            }
        })) {
            this.levelItems.add(new LevelBarView.LevelItem(iji.e3, c0j.cf));
        }
        if (refreshLevelItems$has(records, new Function1() { // from class: nom
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepInterfereReportSleepDurationHolder.refreshLevelItems$lambda$5((SleepData.NightSleepDuration.Daily) obj));
            }
        })) {
            this.levelItems.add(new LevelBarView.LevelItem(iji.i3, c0j.lk));
        }
        if (refreshLevelItems$has(records, new Function1() { // from class: oom
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepInterfereReportSleepDurationHolder.refreshLevelItems$lambda$6((SleepData.NightSleepDuration.Daily) obj));
            }
        })) {
            this.levelItems.add(new LevelBarView.LevelItem(iji.g3, c0j.Nf));
        }
        if (refreshLevelItems$has(records, new Function1() { // from class: pom
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Boolean.valueOf(SleepInterfereReportSleepDurationHolder.refreshLevelItems$lambda$7((SleepData.NightSleepDuration.Daily) obj));
            }
        })) {
            this.levelItems.add(new LevelBarView.LevelItem(iji.h3, c0j.Wc));
        }
        List<LevelBarView.LevelItem> list = this.levelItems;
        LevelBarView.LevelItem levelItem = new LevelBarView.LevelItem(iji.f3, c0j.Cf);
        levelItem.e = pni.s0;
        list.add(levelItem);
        gfe gfeVar = this.levelDescAdapter;
        if (gfeVar != null) {
            gfeVar.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[ORIG_RETURN, RETURN] */
    private static final boolean refreshLevelItems$has(List<SleepData.NightSleepDuration.Daily> list, Function1<? super SleepData.NightSleepDuration.Daily, Boolean> function1) {
        for (Object obj : list) {
            if (function1.invoke2(obj).booleanValue()) {
                if (obj != null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj != null) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshLevelItems$lambda$4(SleepData.NightSleepDuration.Daily it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getDeepSleepMinutes() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshLevelItems$lambda$5(SleepData.NightSleepDuration.Daily it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getLightSleepMinutes() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshLevelItems$lambda$6(SleepData.NightSleepDuration.Daily it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getRemSleepMinutes() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean refreshLevelItems$lambda$7(SleepData.NightSleepDuration.Daily it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ((it.getTotalMinutes() - it.getDeepSleepMinutes()) - it.getLightSleepMinutes()) - it.getRemSleepMinutes() > 0;
    }

    private final void updateHighLightTip(int diffMinutes) {
        int iAbs = Math.abs(diffMinutes);
        String quantityString = "";
        if (diffMinutes != 0) {
            if (iAbs >= 60) {
                int i = iAbs / 60;
                int i2 = iAbs % 60;
                String quantityString2 = this.context.getResources().getQuantityString(qxi.K1, i, Integer.valueOf(i));
                Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
                quantityString = i2 > 0 ? this.context.getResources().getQuantityString(qxi.L1, i2, Integer.valueOf(i2)) : "";
                Intrinsics.checkNotNull(quantityString);
                if (LocaleUtil.isCN()) {
                    quantityString = quantityString2 + quantityString;
                } else {
                    quantityString = StringsKt__StringsKt.trim((CharSequence) (quantityString2 + " " + quantityString)).toString();
                }
            } else {
                quantityString = this.context.getResources().getQuantityString(qxi.q, iAbs, Integer.valueOf(iAbs));
                Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            }
        }
        if (diffMinutes > 0) {
            this.tvHighLightTip.setText(this.context.getString(c0j.me, quantityString));
            this.tvHighLightTip.setCompoundDrawablesWithIntrinsicBounds(pni.z0, 0, 0, 0);
        } else if (diffMinutes < 0) {
            this.tvHighLightTip.setText(this.context.getString(c0j.le, quantityString));
            this.tvHighLightTip.setCompoundDrawablesWithIntrinsicBounds(pni.v0, 0, 0, 0);
        } else {
            this.tvHighLightTip.setText(this.context.getString(c0j.ne));
            this.tvHighLightTip.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateWithPlan(SleepInterferePlan plan) {
        SleepData.NightSleepDuration nightSleepDuration;
        List<SleepData.NightSleepDuration.Daily> dailyRecords;
        SleepData sleep = plan.getReport().getSleep();
        if (sleep == null || (nightSleepDuration = sleep.getNightSleepDuration()) == null || (dailyRecords = nightSleepDuration.getDailyRecords()) == null) {
            return;
        }
        this.sleepTarget = this.viewModel.getSleepSettingRepository().getSleepGoal();
        SleepDurationStackedBarChart chart = this.chart;
        Intrinsics.checkNotNullExpressionValue(chart, "chart");
        ExtUtilKt.visible(chart);
        this.chart.setSleepDurationData(dailyRecords, this.sleepTarget);
        refreshLevelItems(dailyRecords);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        String hMFormatInMinutes$default = TimeDateUtil.getHMFormatInMinutes$default(context, nightSleepDuration.getAverageMinutes(), 0, 0, 0, 24, null);
        TextView textView = this.durationView;
        StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
        Context context2 = this.context;
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
        textView.setText(styledStringUtils.styleSmart(hMFormatInMinutes$default, context2, (116 & 2) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey, "380"), TuplesKt.to(SpanPropKey.FONT_SIZE, "40.33%"))), (116 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(spanPropKey, "600"))), (116 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, (116 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (116 & 32) != 0 ? Locale.getDefault() : null, (116 & 64) != 0));
        if (nightSleepDuration.getDiffMinutes() != null) {
            updateHighLightTip(nightSleepDuration.getDiffMinutes().intValue());
            if (ExtUtilKt.visible(this.tvHighLightTip) != null) {
                return;
            }
        }
        ExtUtilKt.gone(this.tvHighLightTip);
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
