package com.xiaomi.fitness.health.todayhealth.ui.holder;

import android.graphics.Color;
import android.graphics.Typeface;
import android.text.Html;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ItemDecorationExtKt;
import com.xiaomi.fitness.common.extensions.ListExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.DisplayUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.todayhealth.model.HealthCheckViewModel;
import com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder;
import com.xiaomi.fitness.health.todayhealth.ui.items.AbnormalCardAdapter;
import com.xiaomi.fitness.health.todayhealth.ui.items.HealthRiskIndexTagAdapter;
import com.xiaomi.fitness.health.todayhealth.ui.items.VerticalItemDecoration;
import defpackage.c0j;
import defpackage.eri;
import defpackage.iji;
import defpackage.lpi;
import defpackage.qxi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 82\u00020\u0001:\u00018B\u001f\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b6\u00107JW\u0010\n\u001a\u00020\t2F\u0010\b\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0002j \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJW\u0010\f\u001a\u00020\t2F\u0010\b\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0002j \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004`\u0007H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JW\u0010\u0018\u001a\u00020\t2F\u0010\b\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0002j \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004`\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u000bJW\u0010\u0019\u001a\u00020\t2F\u0010\b\u001aB\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u0002j \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004`\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\r\u0010\u001a\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001bR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010*R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010*R\u0014\u00104\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010*R\u0014\u00105\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00102¨\u00069"}, d2 = {"Lcom/xiaomi/fitness/health/todayhealth/ui/holder/SummaryCardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Ljava/util/HashMap;", "", "", "", "", "Lkotlin/collections/HashMap;", "riskMap", "", "setAbnormalCardList", "(Ljava/util/HashMap;)V", "setRiskCountText", "checkedItemCount", "riskCount", "setTitleTv", "(II)V", "", "originalText", "Landroid/graphics/Typeface;", "typeface", "Landroid/text/SpannableString;", "setHighAble", "(Ljava/lang/String;Landroid/graphics/Typeface;)Landroid/text/SpannableString;", "setSummaryTitle", "setSummaryDesc", "bindData", "()V", "unBindData", "Landroid/view/View;", "view", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "healthCheckViewModel", "Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "Landroid/widget/TextView;", "riskCountTextView", "Landroid/widget/TextView;", "titleTv", "Landroid/widget/LinearLayout;", "riskDetailLayout", "Landroid/widget/LinearLayout;", "abnormalTitle", "Landroidx/recyclerview/widget/RecyclerView;", "riskItemsRecycler", "Landroidx/recyclerview/widget/RecyclerView;", "countTitle", "suggestionDes", "abnormalCardListRecycler", "<init>", "(Landroid/view/View;Lcom/xiaomi/fitness/health/todayhealth/model/HealthCheckViewModel;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nSummaryCardViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SummaryCardViewHolder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/holder/SummaryCardViewHolder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,270:1\n13467#2,3:271\n216#3,2:274\n*S KotlinDebug\n*F\n+ 1 SummaryCardViewHolder.kt\ncom/xiaomi/fitness/health/todayhealth/ui/holder/SummaryCardViewHolder\n*L\n215#1:271,3\n246#1:274,2\n*E\n"})
public final class SummaryCardViewHolder extends RecyclerView.d0 {

    @NotNull
    public static final String TAG = "SummaryCardViewHolder";

    @NotNull
    private final RecyclerView abnormalCardListRecycler;

    @NotNull
    private final TextView abnormalTitle;

    @NotNull
    private final TextView countTitle;

    @NotNull
    private final HealthCheckViewModel healthCheckViewModel;

    @NotNull
    private final LifecycleOwner lifecycleOwner;

    @NotNull
    private final TextView riskCountTextView;

    @NotNull
    private final LinearLayout riskDetailLayout;

    @NotNull
    private final RecyclerView riskItemsRecycler;

    @NotNull
    private final TextView suggestionDes;

    @NotNull
    private final TextView titleTv;

    @NotNull
    private final View view;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder$bindData$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder$bindData$1", f = "SummaryCardViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder$bindData$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder$bindData$1$1", f = "SummaryCardViewHolder.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<MutableStateFlow<Integer>> $riskSize;
            int label;
            final /* synthetic */ SummaryCardViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06351(SummaryCardViewHolder summaryCardViewHolder, Ref.ObjectRef<MutableStateFlow<Integer>> objectRef, Continuation<? super C06351> continuation) {
                super(2, continuation);
                this.this$0 = summaryCardViewHolder;
                this.$riskSize = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06351(this.this$0, this.$riskSize, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MutableStateFlow riskDateMapStateFlowByDate$default = HealthCheckViewModel.getRiskDateMapStateFlowByDate$default(this.this$0.healthCheckViewModel, null, 1, null);
                    final Ref.ObjectRef<MutableStateFlow<Integer>> objectRef = this.$riskSize;
                    final SummaryCardViewHolder summaryCardViewHolder = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder.bindData.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((HashMap<Integer, Map<Integer, List<Object>>>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(HashMap<Integer, Map<Integer, List<Object>>> map, Continuation<? super Unit> continuation) {
                            objectRef.element.setValue(Boxing.boxInt(map.size()));
                            summaryCardViewHolder.setSummaryTitle(map);
                            summaryCardViewHolder.setSummaryDesc(map);
                            summaryCardViewHolder.setRiskCountText(map);
                            summaryCardViewHolder.setAbnormalCardList(map);
                            Logger.i(SummaryCardViewHolder.TAG, "bindData riskMap=" + map);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (riskDateMapStateFlowByDate$default.collect(flowCollector, this) == coroutine_suspended) {
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
                return ((C06351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder$bindData$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder$bindData$1$2", f = "SummaryCardViewHolder.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<MutableStateFlow<Integer>> $riskSize;
            int label;
            final /* synthetic */ SummaryCardViewHolder this$0;

            /* JADX INFO: renamed from: com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder$bindData$1$2$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0000\u001a8\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\b0\u00012!\u0010\t\u001a\u001d\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u00072\u0015\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\bH\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Ljava/util/HashMap;", "", "", "Lkotlin/ParameterName;", "name", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FDESC, "checkedItemMap", "riskSize"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder$bindData$1$2$1", f = "SummaryCardViewHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C06371 extends SuspendLambda implements Function3<HashMap<Integer, Boolean>, Integer, Continuation<? super Pair<? extends HashMap<Integer, Boolean>, ? extends Integer>>, Object> {
                /* synthetic */ int I$0;
                /* synthetic */ Object L$0;
                int label;

                public C06371(Continuation<? super C06371> continuation) {
                    super(3, continuation);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Object invoke(HashMap<Integer, Boolean> map, Integer num, Continuation<? super Pair<? extends HashMap<Integer, Boolean>, ? extends Integer>> continuation) {
                    return invoke(map, num.intValue(), (Continuation<? super Pair<? extends HashMap<Integer, Boolean>, Integer>>) continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return new Pair((HashMap) this.L$0, Boxing.boxInt(this.I$0));
                }

                public final Object invoke(HashMap<Integer, Boolean> map, int i, Continuation<? super Pair<? extends HashMap<Integer, Boolean>, Integer>> continuation) {
                    C06371 c06371 = new C06371(continuation);
                    c06371.L$0 = map;
                    c06371.I$0 = i;
                    return c06371.invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SummaryCardViewHolder summaryCardViewHolder, Ref.ObjectRef<MutableStateFlow<Integer>> objectRef, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = summaryCardViewHolder;
                this.$riskSize = objectRef;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$riskSize, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFlowCombine = FlowKt.flowCombine(HealthCheckViewModel.getCheckedItemMapStateFlowByDate$default(this.this$0.healthCheckViewModel, null, 1, null), this.$riskSize.element, new C06371(null));
                    final SummaryCardViewHolder summaryCardViewHolder = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder.bindData.1.2.2
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((Pair<? extends HashMap<Integer, Boolean>, Integer>) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(Pair<? extends HashMap<Integer, Boolean>, Integer> pair, Continuation<? super Unit> continuation) {
                            HashMap<Integer, Boolean> mapComponent1 = pair.component1();
                            int iIntValue = pair.component2().intValue();
                            summaryCardViewHolder.setTitleTv(mapComponent1.size(), iIntValue);
                            Logger.i(SummaryCardViewHolder.TAG, "bindData checkedItemMap=" + mapComponent1 + ", riskSize=" + iIntValue);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowFlowCombine.collect(flowCollector, this) == coroutine_suspended) {
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

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = SummaryCardViewHolder.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Type inference failed for: r0v4, types: [T, kotlinx.coroutines.flow.MutableStateFlow] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = StateFlowKt.MutableStateFlow(Boxing.boxInt(0));
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C06351(SummaryCardViewHolder.this, objectRef, null), 3, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SummaryCardViewHolder.this, objectRef, null), 3, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryCardViewHolder(@NotNull View view, @NotNull HealthCheckViewModel healthCheckViewModel, @NotNull LifecycleOwner lifecycleOwner) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(healthCheckViewModel, "healthCheckViewModel");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        this.view = view;
        this.healthCheckViewModel = healthCheckViewModel;
        this.lifecycleOwner = lifecycleOwner;
        View viewFindViewById = view.findViewById(eri.f16994de);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.riskCountTextView = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(eri.oj);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.titleTv = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(eri.ee);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.riskDetailLayout = (LinearLayout) viewFindViewById3;
        View viewFindViewById4 = view.findViewById(eri.h);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.abnormalTitle = (TextView) viewFindViewById4;
        View viewFindViewById5 = view.findViewById(eri.fe);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById5, "findViewById(...)");
        this.riskItemsRecycler = (RecyclerView) viewFindViewById5;
        View viewFindViewById6 = this.itemView.findViewById(eri.jj);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById6, "findViewById(...)");
        this.countTitle = (TextView) viewFindViewById6;
        View viewFindViewById7 = this.itemView.findViewById(eri.Gh);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById7, "findViewById(...)");
        this.suggestionDes = (TextView) viewFindViewById7;
        View viewFindViewById8 = this.itemView.findViewById(eri.f);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById8, "findViewById(...)");
        this.abnormalCardListRecycler = (RecyclerView) viewFindViewById8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAbnormalCardList(HashMap<Integer, Map<Integer, List<Object>>> riskMap) {
        boolean z = !riskMap.isEmpty();
        ViewExtKt.setVisible(this.abnormalCardListRecycler, z);
        if (z) {
            int size = riskMap.size();
            Set<Map.Entry<Integer, Map<Integer, List<Object>>>> setEntrySet = riskMap.entrySet();
            Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
            Logger.i(TAG, "setAbnormalCardList riskMap size=" + size + " riskMap=" + CollectionsKt___CollectionsKt.joinToString$default(setEntrySet, null, null, null, 0, null, new Function1() { // from class: fpo
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SummaryCardViewHolder.setAbnormalCardList$lambda$0((Map.Entry) obj);
                }
            }, 31, null));
            AbnormalCardAdapter abnormalCardAdapter = new AbnormalCardAdapter(riskMap);
            ItemDecorationExtKt.clearAllItemDecorations(this.abnormalCardListRecycler);
            this.abnormalCardListRecycler.setAdapter(abnormalCardAdapter);
            this.abnormalCardListRecycler.addItemDecoration(new VerticalItemDecoration());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence setAbnormalCardList$lambda$0(Map.Entry it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return "key=" + it.getKey() + " value=" + it.getValue();
    }

    private final SpannableString setHighAble(String originalText, final Typeface typeface) {
        Spanned spannedFromHtml = Html.fromHtml(originalText);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml);
        SpannableString spannableString = new SpannableString(spannedFromHtml);
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannedFromHtml.length(), URLSpan.class);
        Intrinsics.checkNotNull(uRLSpanArr);
        for (URLSpan uRLSpan : uRLSpanArr) {
            spannableString.setSpan(new ClickableSpan() { // from class: com.xiaomi.fitness.health.todayhealth.ui.holder.SummaryCardViewHolder$setHighAble$1$clickableSpan$1
                @Override // android.text.style.ClickableSpan
                public void onClick(View widget) {
                    Intrinsics.checkNotNullParameter(widget, "widget");
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint ds) {
                    Intrinsics.checkNotNullParameter(ds, "ds");
                    super.updateDrawState(ds);
                    ds.setColor(ExtUtilsKt.getColor(iji.r3));
                    ds.setTypeface(typeface);
                    ds.setUnderlineText(false);
                }
            }, spannableString.getSpanStart(uRLSpan), spannableString.getSpanEnd(uRLSpan), 33);
            spannableString.removeSpan(uRLSpan);
        }
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setRiskCountText(HashMap<Integer, Map<Integer, List<Object>>> riskMap) {
        int size = riskMap.size();
        String quantityString = AppUtil.getApp().getResources().getQuantityString(qxi.o, size);
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String str = String.format(Locale.US, quantityString, Integer.valueOf(size));
        SpannableString spannableString = new SpannableString(str);
        Intrinsics.checkNotNull(str);
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, String.valueOf(size), 0, false, 6, (Object) null);
        int length = String.valueOf(size).length() + iIndexOf$default;
        spannableString.setSpan(new AbsoluteSizeSpan(36, true), iIndexOf$default, length, 33);
        Typeface typefaceAsResourceId = DisplayUtil.getTypefaceAsResourceId(ApplicationExtKt.getApplication(), lpi.e);
        if (typefaceAsResourceId == null) {
            typefaceAsResourceId = Typeface.DEFAULT_BOLD;
        }
        spannableString.setSpan(typefaceAsResourceId, iIndexOf$default, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF5050")), 0, str.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(16, true), 0, iIndexOf$default, 33);
        spannableString.setSpan(new AbsoluteSizeSpan(16, true), length, str.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(ExtUtilsKt.getDp(4), true), length, length + 1, 33);
        this.riskCountTextView.setText(spannableString);
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.view.getContext());
        flexboxLayoutManager.T(1);
        flexboxLayoutManager.U(0);
        this.riskItemsRecycler.setLayoutManager(flexboxLayoutManager);
        if (riskMap.size() <= 0) {
            ViewExtKt.gone(this.abnormalTitle);
            ViewExtKt.gone(this.riskDetailLayout);
            return;
        }
        HealthRiskIndexTagAdapter healthRiskIndexTagAdapter = new HealthRiskIndexTagAdapter(riskMap);
        ViewExtKt.visible(this.abnormalTitle);
        ViewExtKt.visible(this.riskDetailLayout);
        this.riskItemsRecycler.setAdapter(healthRiskIndexTagAdapter);
        ItemDecorationExtKt.clearAllItemDecorations(this.riskItemsRecycler);
        healthRiskIndexTagAdapter.notifyDataSetChanged();
        this.riskDetailLayout.requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSummaryDesc(HashMap<Integer, Map<Integer, List<Object>>> riskMap) {
        String quantityString;
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, Map<Integer, List<Object>>>> it = riskMap.entrySet().iterator();
        while (it.hasNext()) {
            int iIntValue = it.next().getKey().intValue();
            if (iIntValue == 4) {
                i = c0j.k7;
            } else if (iIntValue == 13) {
                i = c0j.r7;
            } else if (iIntValue == 6) {
                i = c0j.jh;
            } else if (iIntValue == 7) {
                i = c0j.v7;
            } else if (iIntValue != 25) {
                i = iIntValue != 26 ? c0j.t : c0j.O4;
            } else {
                i = c0j.P4;
            }
            ListExtKt.add(arrayList, Integer.valueOf(i));
        }
        if (riskMap.isEmpty()) {
            quantityString = ApplicationExtKt.getApplication().getString(c0j.Un);
            Intrinsics.checkNotNull(quantityString);
        } else {
            quantityString = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.v1, riskMap.size(), Integer.valueOf(riskMap.size()));
        }
        this.suggestionDes.setText(quantityString);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSummaryTitle(HashMap<Integer, Map<Integer, List<Object>>> riskMap) {
        Intrinsics.checkNotNull(riskMap.size() > 0 ? ApplicationExtKt.getApplication().getString(c0j.Vn) : ApplicationExtKt.getApplication().getString(c0j.Wn));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitleTv(int checkedItemCount, int riskCount) {
        String string;
        String quantityString;
        if (riskCount == 0 || checkedItemCount == 0) {
            ViewExtKt.visible(this.titleTv);
        } else {
            ViewExtKt.gone(this.titleTv);
        }
        if (checkedItemCount == 0) {
            string = ApplicationExtKt.getApplication().getString(c0j.kq);
        } else {
            string = riskCount == 0 ? ApplicationExtKt.getApplication().getString(c0j.Jn) : "";
        }
        Intrinsics.checkNotNull(string);
        this.titleTv.setText(string);
        if (checkedItemCount == 0) {
            ViewExtKt.gone(this.countTitle);
            quantityString = ApplicationExtKt.getApplication().getString(c0j.Kn);
        } else {
            ViewExtKt.visible(this.countTitle);
            quantityString = ResourceExtKt.getQuantityString(ApplicationExtKt.getApplication(), qxi.s1, checkedItemCount, Integer.valueOf(checkedItemCount));
        }
        Intrinsics.checkNotNull(quantityString);
        Typeface typefaceAsResourceId = DisplayUtil.getTypefaceAsResourceId(ApplicationExtKt.getApplication(), lpi.e);
        if (typefaceAsResourceId == null) {
            typefaceAsResourceId = Typeface.DEFAULT_BOLD;
        }
        Intrinsics.checkNotNull(typefaceAsResourceId);
        this.countTitle.setText(setHighAble(quantityString, typefaceAsResourceId));
    }

    public final void bindData() {
        unBindData();
        this.healthCheckViewModel.setSummaryCollectJob(BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this.lifecycleOwner), null, null, new AnonymousClass1(null), 3, null));
    }

    @NotNull
    public final View getView() {
        return this.view;
    }

    public final void unBindData() {
        Job summaryCollectJob = this.healthCheckViewModel.getSummaryCollectJob();
        if (summaryCollectJob != null) {
            Job.DefaultImpls.cancel$default(summaryCollectJob, (CancellationException) null, 1, (Object) null);
        }
        this.healthCheckViewModel.setSummaryCollectJob(null);
    }
}
