package com.xiaomi.fitness.health.sleep.ui.adapter;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import com.example.statistics.export.IOnetrack;
import com.example.statistics.export.OneTrackExtKt;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.ui.adapter.SleepInterpretationHolder;
import com.xiaomi.fitness.health.sleep.utils.SleepInterpretationExtKt;
import defpackage.eri;
import defpackage.gak;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J:\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0018\u0010\u0018\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00110\u001a0\u0019H\u0002J\b\u0010\u001c\u001a\u00020\u0011H\u0002J,\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0!H\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/ui/adapter/SleepInterpretationHolder;", "", "itemView", "Landroid/view/View;", "lifecycleScope", "Landroidx/lifecycle/LifecycleCoroutineScope;", "<init>", "(Landroid/view/View;Landroidx/lifecycle/LifecycleCoroutineScope;)V", "getItemView", "()Landroid/view/View;", "previewTextTv", "Landroid/widget/TextView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "bindSleepInterprAndAdvice", "", "segmentReport", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "allDaySleepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "readFileAndBindUi", "mLifecycleScope", "successWeakReference", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function1;", "", "reportOneTrackMapOnExpose", "bindSleepInterprWithUi", "previewText", "", "interprList", "", "adviceList", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepInterpretationHolder {

    @NotNull
    public static final String TAG = "SleepInterpretationHolder";

    @NotNull
    public static final String URL_SLEEP_RESEARCH_SOCIETY = "https://cdn.web-global.fds.api.mi-img.com/hlth-operate/appres/images/health/sleep/sleep_research_society.png?Expires=9223372036854775807&GalaxyAccessKeyId=AK7GLVK7GPCJW6HOWC&Signature=Z+QjZ8Tt6P2TuBNMS/VuC3+QXu0=";

    @NotNull
    private final ConstraintLayout container;

    @NotNull
    private final View itemView;

    @NotNull
    private final LifecycleCoroutineScope lifecycleScope;

    @NotNull
    private final TextView previewTextTv;

    @NotNull
    private final RecyclerView recycler;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.adapter.SleepInterpretationHolder$readFileAndBindUi$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.adapter.SleepInterpretationHolder$readFileAndBindUi$1", f = "SleepInterpretationHolder.kt", i = {}, l = {80, 89}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AllDaySleepReport $allDaySleepReport;
        final /* synthetic */ SleepSegmentReport $segmentReport;
        final /* synthetic */ WeakReference<Function1<Boolean, Unit>> $successWeakReference;
        int label;
        final /* synthetic */ SleepInterpretationHolder this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.adapter.SleepInterpretationHolder$readFileAndBindUi$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.adapter.SleepInterpretationHolder$readFileAndBindUi$1$1", f = "SleepInterpretationHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06171 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ WeakReference<Function1<Boolean, Unit>> $successWeakReference;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C06171(WeakReference<Function1<Boolean, Unit>> weakReference, Continuation<? super C06171> continuation) {
                super(2, continuation);
                this.$successWeakReference = weakReference;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06171(this.$successWeakReference, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1<Boolean, Unit> function1 = this.$successWeakReference.get();
                if (function1 == null) {
                    return null;
                }
                function1.invoke2(Boxing.boxBoolean(false));
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06171) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.ui.adapter.SleepInterpretationHolder$readFileAndBindUi$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.ui.adapter.SleepInterpretationHolder$readFileAndBindUi$1$2", f = "SleepInterpretationHolder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ List<String> $adviceList;
            final /* synthetic */ List<String> $interprList;
            final /* synthetic */ String $previewText;
            final /* synthetic */ WeakReference<Function1<Boolean, Unit>> $successWeakReference;
            int label;
            final /* synthetic */ SleepInterpretationHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(List<String> list, List<String> list2, WeakReference<Function1<Boolean, Unit>> weakReference, SleepInterpretationHolder sleepInterpretationHolder, String str, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$interprList = list;
                this.$adviceList = list2;
                this.$successWeakReference = weakReference;
                this.this$0 = sleepInterpretationHolder;
                this.$previewText = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.$interprList, this.$adviceList, this.$successWeakReference, this.this$0, this.$previewText, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                if (!this.$interprList.isEmpty() && !this.$adviceList.isEmpty()) {
                    this.this$0.bindSleepInterprWithUi(this.$previewText, this.$interprList, this.$adviceList);
                    Function1<Boolean, Unit> function1 = this.$successWeakReference.get();
                    if (function1 != null) {
                        function1.invoke2(Boxing.boxBoolean(true));
                    }
                    this.this$0.reportOneTrackMapOnExpose();
                    return Unit.INSTANCE;
                }
                Logger.i(SleepInterpretationHolder.TAG, "readFileAndBindUi interprList size=" + this.$interprList.size() + " adviceList size=" + this.$adviceList.size());
                Function1<Boolean, Unit> function2 = this.$successWeakReference.get();
                if (function2 != null) {
                    function2.invoke2(Boxing.boxBoolean(false));
                }
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SleepSegmentReport sleepSegmentReport, AllDaySleepReport allDaySleepReport, WeakReference<Function1<Boolean, Unit>> weakReference, SleepInterpretationHolder sleepInterpretationHolder, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$segmentReport = sleepSegmentReport;
            this.$allDaySleepReport = allDaySleepReport;
            this.$successWeakReference = weakReference;
            this.this$0 = sleepInterpretationHolder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$segmentReport, this.$allDaySleepReport, this.$successWeakReference, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            Map<String, String> fileAndConstructMap = SleepInterpretationExtKt.readFileAndConstructMap();
            if (fileAndConstructMap.isEmpty()) {
                MainCoroutineDispatcher main = Dispatchers.getMain();
                C06171 c06171 = new C06171(this.$successWeakReference, null);
                this.label = 1;
                if (BuildersKt.withContext(main, c06171, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            List<String> interprStringList = SleepInterpretationExtKt.getInterprStringList(fileAndConstructMap, this.$segmentReport, this.$allDaySleepReport);
            List<String> adviceStringList = SleepInterpretationExtKt.getAdviceStringList(fileAndConstructMap, this.$segmentReport, this.$allDaySleepReport);
            String previewText = SleepInterpretationExtKt.getPreviewText(this.$allDaySleepReport, this.$segmentReport);
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(interprStringList, adviceStringList, this.$successWeakReference, this.this$0, previewText, null);
            this.label = 2;
            if (BuildersKt.withContext(main2, anonymousClass2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SleepInterpretationHolder(@NotNull View itemView, @NotNull LifecycleCoroutineScope lifecycleScope) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(lifecycleScope, "lifecycleScope");
        this.itemView = itemView;
        this.lifecycleScope = lifecycleScope;
        View viewFindViewById = itemView.findViewById(eri.bd);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.previewTextTv = (TextView) viewFindViewById;
        View viewFindViewById2 = itemView.findViewById(eri.ag);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.recycler = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(eri.Zf);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.container = (ConstraintLayout) viewFindViewById3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSleepInterprAndAdvice$lambda$1(final SleepInterpretationHolder this$0, SleepSegmentReport segmentReport, AllDaySleepReport allDaySleepReport) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(segmentReport, "$segmentReport");
        Intrinsics.checkNotNullParameter(allDaySleepReport, "$allDaySleepReport");
        this$0.readFileAndBindUi(this$0.lifecycleScope, segmentReport, allDaySleepReport, new WeakReference<>(new Function1() { // from class: mpm
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SleepInterpretationHolder.bindSleepInterprAndAdvice$lambda$1$lambda$0(this.f27071a, ((Boolean) obj).booleanValue());
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSleepInterprAndAdvice$lambda$1$lambda$0(SleepInterpretationHolder this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewExtKt.setVisible(this$0.container, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSleepInterprAndAdvice$lambda$2(SleepInterpretationHolder this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ViewExtKt.setVisible(this$0.container, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindSleepInterprWithUi(String previewText, List<String> interprList, List<String> adviceList) {
        SleepInterpretationAdapter sleepInterpretationAdapter = new SleepInterpretationAdapter();
        sleepInterpretationAdapter.refreshText(interprList, adviceList);
        this.recycler.setAdapter(sleepInterpretationAdapter);
        SleepInterpretationExtKt.clearAllItemDecorations(this.recycler);
        this.recycler.addItemDecoration(new gak(ExtUtilsKt.getDp(10)));
        this.previewTextTv.setText(previewText);
    }

    private final void readFileAndBindUi(LifecycleCoroutineScope mLifecycleScope, SleepSegmentReport segmentReport, AllDaySleepReport allDaySleepReport, WeakReference<Function1<Boolean, Unit>> successWeakReference) {
        BuildersKt__Builders_commonKt.launch$default(mLifecycleScope, Dispatchers.getIO(), null, new AnonymousClass1(segmentReport, allDaySleepReport, successWeakReference, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportOneTrackMapOnExpose() {
        OneTrackExtKt.getInstance(IOnetrack.INSTANCE).reportData("expose_v3", MapsKt__MapsKt.mapOf(TuplesKt.to("tip", "56.37.2.1.35835"), TuplesKt.to("name", "sleep_Interpretation_suggestions_card")));
    }

    public final void bindSleepInterprAndAdvice(@NotNull final SleepSegmentReport segmentReport, @NotNull final AllDaySleepReport allDaySleepReport) {
        Intrinsics.checkNotNullParameter(segmentReport, "segmentReport");
        Intrinsics.checkNotNullParameter(allDaySleepReport, "allDaySleepReport");
        boolean zIfCurtLocaleSleepAdviceFileExists = SleepInterpretationExtKt.ifCurtLocaleSleepAdviceFileExists();
        Logger.i(TAG, "bindSleepInterprAndAdvice sleepAdviceFileExit=" + zIfCurtLocaleSleepAdviceFileExists);
        if (zIfCurtLocaleSleepAdviceFileExists) {
            readFileAndBindUi(this.lifecycleScope, segmentReport, allDaySleepReport, new WeakReference<>(new Function1() { // from class: lpm
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SleepInterpretationHolder.bindSleepInterprAndAdvice$lambda$2(this.f25304a, ((Boolean) obj).booleanValue());
                }
            }));
        } else {
            SleepInterpretationExtKt.downloadSleepAdviceIfNeedAndProceed(this.lifecycleScope, new Function0() { // from class: kpm
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SleepInterpretationHolder.bindSleepInterprAndAdvice$lambda$1(this.f24143a, segmentReport, allDaySleepReport);
                }
            });
        }
    }

    @NotNull
    public final View getItemView() {
        return this.itemView;
    }
}
