package com.huami.bloodpressure_ui.day;

import android.util.SparseArray;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.ViewModelKt;
import com.huami.bloodpressure_core.dc.local.BloodPressureDbVo;
import com.huami.bloodpressure_core.di.KoinExKt;
import com.huami.bloodpressure_core.url.IBPResearchConfig;
import com.huami.bloodpressure_ui.base.BaseBloodPressureChartViewModel;
import com.huami.bloodpressure_ui.chart.BarChartVo;
import com.huami.bloodpressure_ui.chart.BloodPressureChartBuilder;
import com.huami.bloodpressure_ui.ext.BloodPressureDbExKt;
import com.huami.bloodpressure_ui.ext.BloodPressureWrap;
import com.huami.chart.data.ChartData;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\t\u001a\u00020\u00048B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/huami/bloodpressure_ui/day/BloodPressureDayChartViewModel;", "Lcom/huami/bloodpressure_ui/base/BaseBloodPressureChartViewModel;", "", "Lcom/huami/bloodpressure_core/dc/local/BloodPressureDbVo;", "Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "f", "Lkotlin/Lazy;", "a", "()Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "mResearchConfig", "", "g", "Ljava/lang/String;", "TAG", "Landroidx/lifecycle/LiveData;", "Lcom/huami/bloodpressure_ui/chart/BloodPressureChartBuilder;", "h", "Landroidx/lifecycle/LiveData;", "getCurrentChartData", "()Landroidx/lifecycle/LiveData;", "currentChartData", "<init>", "()V", "bloodpressure-ui_release"}, k = 1, mv = {1, 5, 1})
public final class BloodPressureDayChartViewModel extends BaseBloodPressureChartViewModel<List<? extends BloodPressureDbVo>> {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy mResearchConfig = LazyKt__LazyJVMKt.lazy(j.a);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final String TAG = "BloodPressureDayChart";

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final LiveData<BloodPressureChartBuilder> currentChartData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bloodpressure_ui/chart/BarChartVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends BarChartVo<Number>>> {
        public final /* synthetic */ List<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<BarChartVo<Number>> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends BarChartVo<Number>> getA() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0004\n\u0000\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n"}, d2 = {"", "Lcom/huami/bloodpressure_ui/chart/BarChartVo;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<List<? extends BarChartVo<Number>>> {
        public final /* synthetic */ List<BarChartVo<Number>> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<BarChartVo<Number>> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final List<? extends BarChartVo<Number>> getA() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<SparseArray<ChartData>> {
        public final /* synthetic */ SparseArray<ChartData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SparseArray<ChartData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final SparseArray<ChartData> getA() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Landroid/util/SparseArray;", "Lcom/huami/chart/data/ChartData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<SparseArray<ChartData>> {
        public final /* synthetic */ SparseArray<ChartData> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SparseArray<ChartData> sparseArray) {
            super(0);
            this.a = sparseArray;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final SparseArray<ChartData> getA() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n"}, d2 = {"", "", "Lcom/huami/bloodpressure_ui/ext/BloodPressureWrap;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Map<Integer, ? extends BloodPressureWrap>> {
        public final /* synthetic */ Map<Integer, BloodPressureWrap> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Map<Integer, BloodPressureWrap> map) {
            super(0);
            this.a = map;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Map<Integer, ? extends BloodPressureWrap> getA() {
            return this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodPressureWrap a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BloodPressureWrap bloodPressureWrap) {
            super(0);
            this.a = bloodPressureWrap;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "maxDbp " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodPressureWrap a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BloodPressureWrap bloodPressureWrap) {
            super(0);
            this.a = bloodPressureWrap;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "maxSbp " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodPressureWrap a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(BloodPressureWrap bloodPressureWrap) {
            super(0);
            this.a = bloodPressureWrap;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "minDbp " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ BloodPressureWrap a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(BloodPressureWrap bloodPressureWrap) {
            super(0);
            this.a = bloodPressureWrap;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "minSbp " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bloodpressure_core/url/IBPResearchConfig;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<IBPResearchConfig> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final IBPResearchConfig getA() {
            return (IBPResearchConfig) KoinExKt.bloodPressureScope(KoinExKt.bloodPressureScope().getKoin()).get(Reflection.getOrCreateKotlinClass(IBPResearchConfig.class), null, null);
        }
    }

    public BloodPressureDayChartViewModel() {
        final Flow flowAsFlow = FlowLiveDataConversions.asFlow(get_currentChartList());
        this.currentChartData = FlowLiveDataConversions.asLiveData$default(FlowKt.flowOn(new Flow<BloodPressureChartBuilder>() { // from class: com.huami.bloodpressure_ui.day.BloodPressureDayChartViewModel$special$$inlined$map$1

            /* JADX INFO: renamed from: com.huami.bloodpressure_ui.day.BloodPressureDayChartViewModel$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/FlowCollector;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 1, mv = {1, 5, 1})
            public static final class AnonymousClass2 implements FlowCollector<List<? extends BloodPressureDbVo>> {
                public final /* synthetic */ FlowCollector a;
                public final /* synthetic */ BloodPressureDayChartViewModel$special$$inlined$map$1 b;

                /* JADX INFO: renamed from: com.huami.bloodpressure_ui.day.BloodPressureDayChartViewModel$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0096@¨\u0006\u0006"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlin/coroutines/Continuation;", "", "continuation", "", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1", "emit"}, k = 3, mv = {1, 5, 1})
                @DebugMetadata(c = "com.huami.bloodpressure_ui.day.BloodPressureDayChartViewModel$special$$inlined$map$1$2", f = "BloodPressureDayChartViewModel.kt", i = {}, l = {271}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {
                    public /* synthetic */ Object a;
                    public int b;
                    public Object c;
                    public Object d;
                    public Object e;
                    public Object f;
                    public Object g;
                    public Object h;
                    public Object i;
                    public Object j;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, BloodPressureDayChartViewModel$special$$inlined$map$1 bloodPressureDayChartViewModel$special$$inlined$map$1) {
                    this.a = flowCollector;
                    this.b = bloodPressureDayChartViewModel$special$$inlined$map$1;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public Object emit(List<? extends BloodPressureDbVo> list, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    Object next;
                    Object next2;
                    Object next3;
                    Object next4;
                    Object next5;
                    BloodPressureDbVo bp;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.b;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj = anonymousClass1.a;
                    Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.b;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        FlowCollector flowCollector = this.a;
                        List<? extends BloodPressureDbVo> list2 = list;
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(this.get_currentTimeStamp().longValue());
                        Date time = calendar.getTime();
                        List<BloodPressureWrap> wrap = list2 == null ? null : BloodPressureDbExKt.toWrap(list2);
                        if (wrap == null) {
                            wrap = CollectionsKt__CollectionsKt.emptyList();
                        }
                        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(wrap, 
                        /*  JADX ERROR: Method code generation error
                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0069: INVOKE (r8v1 'listSortedWith' java.util.List) = 
                              (r4v5 'wrap' java.util.List<com.huami.bloodpressure_ui.ext.BloodPressureWrap>)
                              (wrap java.util.Comparator:0x0066: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:7) call: com.huami.bloodpressure_ui.day.BloodPressureDayChartViewModel$currentChartData$lambda-13$$inlined$sortedByDescending$1.<init>():void type: CONSTRUCTOR)
                             STATIC call: kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(java.lang.Iterable, java.util.Comparator):java.util.List A[DECLARE_VAR, MD:<T>:(java.lang.Iterable<? extends T>, java.util.Comparator<? super T>):java.util.List<T> (m)] (LINE:7) in method: com.huami.bloodpressure_ui.day.BloodPressureDayChartViewModel$special$$inlined$map$1.2.emit(java.util.List<? extends com.huami.bloodpressure_core.dc.local.BloodPressureDbVo>, kotlin.coroutines.Continuation):java.lang.Object, file: classes6.dex
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.huami.bloodpressure_ui.day.BloodPressureDayChartViewModel$currentChartData$lambda-13$$inlined$sortedByDescending$1, state: NOT_LOADED
                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                            	... 21 more
                            */
                        /*
                            Method dump skipped, instruction units count: 819
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.huami.bloodpressure_ui.day.BloodPressureDayChartViewModel$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector<? super BloodPressureChartBuilder> flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flowAsFlow.collect(new AnonymousClass2(flowCollector, this), continuation);
                    return objCollect == a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            }, Dispatchers.getDefault()), ViewModelKt.getViewModelScope(this).getCoroutineContext().plus(Dispatchers.getMain()), 0L, 2, (Object) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final IBPResearchConfig a() {
            return (IBPResearchConfig) this.mResearchConfig.getValue();
        }

        @NotNull
        public final LiveData<BloodPressureChartBuilder> getCurrentChartData() {
            return this.currentChartData;
        }
    }
