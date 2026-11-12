package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfDocument;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.LightValueItem;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.item.body;
import com.xiaomi.fit.fitness.export.data.project.SleepBedTimeReport;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepMedicationDetail;
import com.xiaomi.fit.fitness.export.data.project.SleepNapSituation;
import com.xiaomi.fit.fitness.export.data.project.SleepProjectReport;
import com.xiaomi.fit.fitness.export.data.project.SleepWakeTimeReport;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.device.manager.internal.extetions.LogExtKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle;
import com.xiaomi.fitness.repo.RepositoryManager;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.eri;
import defpackage.im9;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001UB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 J*\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"*\u00020$2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020 2\b\b\u0002\u0010'\u001a\u00020\u001bJ\u008e\u0001\u0010(\u001a\u00020)2\u0014\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010,0+2\u001a\u0010-\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u001d\u0018\u00010.2\u001a\u00100\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u001d\u0018\u00010.2\u001a\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u001d\u0018\u00010.2\u001a\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002050\u001d\u0018\u00010.H\u0002JZ\u00106\u001a\u00020)2\u0006\u0010%\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020 2\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010$2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020)0?Jl\u0010@\u001a\u00020)2\u0006\u0010:\u001a\u00020;2\u0006\u00107\u001a\u0002082\u0006\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020B2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020F2\u0006\u0010I\u001a\u0002082\u0006\u0010J\u001a\u0002082\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020)0?H\u0002J\"\u0010K\u001a\u0004\u0018\u00010L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020 2\u0006\u0010P\u001a\u00020 H\u0002J\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\"2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020T0\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0017\u0010\u0018¨\u0006V"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmHandle;", "", "<init>", "()V", "TAG", "", "SLEEP_RHYTHM_CHART_MAX_VALUE", "", "SLEEP_RHYTHM_LIGHT_MAX_VALUE", "SLEEP_RHYTHM_BODY_MAX_VALUE", "mSleepRhythmDiaryListAdapter", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter;", "getMSleepRhythmDiaryListAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter;", "mSleepRhythmDiaryListAdapter$delegate", "Lkotlin/Lazy;", "mSleepRhythmSleepItemAdapter", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter;", "getMSleepRhythmSleepItemAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter;", "mSleepRhythmSleepItemAdapter$delegate", "mSleepRhythmChatListAdapter", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter;", "getMSleepRhythmChatListAdapter", "()Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter;", "mSleepRhythmChatListAdapter$delegate", "hasConsecutiveDays", "", "timestamps", "", "", "days", "", "convertBasicSleepData", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartValue;", "Lcom/xiaomi/fit/fitness/export/data/project/SleepProjectReport;", "startTime", "cycle", "showOut", "addToChartListMap", "", "resultMap", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmHandle$SortSleepRhythmChartValue;", "bodyMomentumList", "", "Lcom/xiaomi/fit/fitness/export/data/item/BodyMomentumItem;", "lightValueList", "Lcom/xiaomi/fit/fitness/export/data/item/LightValueItem;", "bedTimeReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepBedTimeReport;", "sleepTimeReport", "Lcom/xiaomi/fit/fitness/export/data/project/SleepWakeTimeReport;", "createDownLoadView", "pdfView", "Landroid/widget/LinearLayout;", "healthSleepRhythmReportView", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "project", "sleepRhythmReports", "isFinish", "Lkotlin/Function1;", "drawPDF", "pdfSleepDetailRv", "Landroidx/recyclerview/widget/RecyclerView;", "pdfDiaryListRv", "pdfRhythmChartListView", "pdfRhythmChartListTitle", "Landroid/widget/TextView;", "pdfRhythmDiaryTitle", "pdfSleepDetailTitle", "rhythmTitleDesView", "detailTitleDesView", "createPDFBitmap", "Landroid/graphics/Bitmap;", "file", "Ljava/io/File;", "width", "height", "convertItemList", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmDiaryListAdapter$SleepDiaryTransform;", "mutableList", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "SortSleepRhythmChartValue", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmHandle.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmHandle\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,679:1\n575#2:680\n216#2,2:730\n216#2:732\n217#2:735\n1#3:681\n1#3:684\n1872#4,2:682\n1485#4:685\n1510#4,3:686\n1513#4,3:696\n1246#4,2:701\n295#4,2:703\n1249#4:705\n1485#4:706\n1510#4,3:707\n1513#4,3:717\n1246#4,2:722\n295#4,2:724\n1249#4:726\n1874#4:727\n1010#4,2:728\n1863#4,2:733\n1010#4,2:736\n1971#4,14:738\n1971#4,14:752\n1971#4,14:766\n1863#4,2:780\n1872#4,3:782\n381#5,7:689\n462#5:699\n412#5:700\n381#5,7:710\n462#5:720\n412#5:721\n*S KotlinDebug\n*F\n+ 1 SleepRhythmHandle.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmHandle\n*L\n110#1:680\n217#1:730,2\n340#1:732\n340#1:735\n110#1:681\n110#1:682,2\n178#1:685\n178#1:686,3\n178#1:696,3\n178#1:701,2\n179#1:703,2\n178#1:705\n181#1:706\n181#1:707,3\n181#1:717,3\n181#1:722,2\n182#1:724,2\n181#1:726\n110#1:727\n195#1:728,2\n341#1:733,2\n351#1:736,2\n617#1:738,14\n619#1:752,14\n621#1:766,14\n640#1:780,2\n663#1:782,3\n178#1:689,7\n178#1:699\n178#1:700\n181#1:710,7\n181#1:720\n181#1:721\n*E\n"})
public final class SleepRhythmHandle {
    private static final float SLEEP_RHYTHM_BODY_MAX_VALUE = 10000.0f;
    public static final float SLEEP_RHYTHM_CHART_MAX_VALUE = 10000.0f;
    private static final float SLEEP_RHYTHM_LIGHT_MAX_VALUE = 1000.0f;

    @NotNull
    public static final String TAG = "SleepRhythm";

    @NotNull
    public static final SleepRhythmHandle INSTANCE = new SleepRhythmHandle();

    /* JADX INFO: renamed from: mSleepRhythmDiaryListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mSleepRhythmDiaryListAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: wtm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepRhythmHandle.mSleepRhythmDiaryListAdapter_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: mSleepRhythmSleepItemAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mSleepRhythmSleepItemAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: xtm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepRhythmHandle.mSleepRhythmSleepItemAdapter_delegate$lambda$1();
        }
    });

    /* JADX INFO: renamed from: mSleepRhythmChatListAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mSleepRhythmChatListAdapter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: ytm
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepRhythmHandle.mSleepRhythmChatListAdapter_delegate$lambda$2();
        }
    });

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0003JS\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006#"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmHandle$SortSleepRhythmChartValue;", "", "time", "", "lightValue", "", "Lcom/xiaomi/fit/fitness/export/data/item/LightValueItem;", "bodyValue", "Lcom/xiaomi/fit/fitness/export/data/item/BodyMomentumItem;", "bedValue", "Lcom/xiaomi/fit/fitness/export/data/project/SleepBedTimeReport;", "sleepValue", "Lcom/xiaomi/fit/fitness/export/data/project/SleepWakeTimeReport;", "<init>", "(JLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getTime", "()J", "getLightValue", "()Ljava/util/List;", "getBodyValue", "getBedValue", "getSleepValue", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SortSleepRhythmChartValue {

        @NotNull
        private final List<SleepBedTimeReport> bedValue;

        @NotNull
        private final List<body> bodyValue;

        @NotNull
        private final List<LightValueItem> lightValue;

        @NotNull
        private final List<SleepWakeTimeReport> sleepValue;
        private final long time;

        public SortSleepRhythmChartValue(long j, @NotNull List<LightValueItem> lightValue, @NotNull List<body> bodyValue, @NotNull List<SleepBedTimeReport> bedValue, @NotNull List<SleepWakeTimeReport> sleepValue) {
            Intrinsics.checkNotNullParameter(lightValue, "lightValue");
            Intrinsics.checkNotNullParameter(bodyValue, "bodyValue");
            Intrinsics.checkNotNullParameter(bedValue, "bedValue");
            Intrinsics.checkNotNullParameter(sleepValue, "sleepValue");
            this.time = j;
            this.lightValue = lightValue;
            this.bodyValue = bodyValue;
            this.bedValue = bedValue;
            this.sleepValue = sleepValue;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SortSleepRhythmChartValue copy$default(SortSleepRhythmChartValue sortSleepRhythmChartValue, long j, List list, List list2, List list3, List list4, int i, Object obj) {
            if ((i & 1) != 0) {
                j = sortSleepRhythmChartValue.time;
            }
            long j2 = j;
            if ((i & 2) != 0) {
                list = sortSleepRhythmChartValue.lightValue;
            }
            List list5 = list;
            if ((i & 4) != 0) {
                list2 = sortSleepRhythmChartValue.bodyValue;
            }
            List list6 = list2;
            if ((i & 8) != 0) {
                list3 = sortSleepRhythmChartValue.bedValue;
            }
            List list7 = list3;
            if ((i & 16) != 0) {
                list4 = sortSleepRhythmChartValue.sleepValue;
            }
            return sortSleepRhythmChartValue.copy(j2, list5, list6, list7, list4);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final long getTime() {
            return this.time;
        }

        @NotNull
        public final List<LightValueItem> component2() {
            return this.lightValue;
        }

        @NotNull
        public final List<body> component3() {
            return this.bodyValue;
        }

        @NotNull
        public final List<SleepBedTimeReport> component4() {
            return this.bedValue;
        }

        @NotNull
        public final List<SleepWakeTimeReport> component5() {
            return this.sleepValue;
        }

        @NotNull
        public final SortSleepRhythmChartValue copy(long time, @NotNull List<LightValueItem> lightValue, @NotNull List<body> bodyValue, @NotNull List<SleepBedTimeReport> bedValue, @NotNull List<SleepWakeTimeReport> sleepValue) {
            Intrinsics.checkNotNullParameter(lightValue, "lightValue");
            Intrinsics.checkNotNullParameter(bodyValue, "bodyValue");
            Intrinsics.checkNotNullParameter(bedValue, "bedValue");
            Intrinsics.checkNotNullParameter(sleepValue, "sleepValue");
            return new SortSleepRhythmChartValue(time, lightValue, bodyValue, bedValue, sleepValue);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SortSleepRhythmChartValue)) {
                return false;
            }
            SortSleepRhythmChartValue sortSleepRhythmChartValue = (SortSleepRhythmChartValue) other;
            return this.time == sortSleepRhythmChartValue.time && Intrinsics.areEqual(this.lightValue, sortSleepRhythmChartValue.lightValue) && Intrinsics.areEqual(this.bodyValue, sortSleepRhythmChartValue.bodyValue) && Intrinsics.areEqual(this.bedValue, sortSleepRhythmChartValue.bedValue) && Intrinsics.areEqual(this.sleepValue, sortSleepRhythmChartValue.sleepValue);
        }

        @NotNull
        public final List<SleepBedTimeReport> getBedValue() {
            return this.bedValue;
        }

        @NotNull
        public final List<body> getBodyValue() {
            return this.bodyValue;
        }

        @NotNull
        public final List<LightValueItem> getLightValue() {
            return this.lightValue;
        }

        @NotNull
        public final List<SleepWakeTimeReport> getSleepValue() {
            return this.sleepValue;
        }

        public final long getTime() {
            return this.time;
        }

        public int hashCode() {
            return (((((((Long.hashCode(this.time) * 31) + this.lightValue.hashCode()) * 31) + this.bodyValue.hashCode()) * 31) + this.bedValue.hashCode()) * 31) + this.sleepValue.hashCode();
        }

        @NotNull
        public String toString() {
            return "SortSleepRhythmChartValue(time=" + this.time + ", lightValue=" + this.lightValue + ", bodyValue=" + this.bodyValue + ", bedValue=" + this.bedValue + ", sleepValue=" + this.sleepValue + ")";
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle$drawPDF$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle$drawPDF$1", f = "SleepRhythmHandle.kt", i = {}, l = {564}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BaseActivity $context;
        final /* synthetic */ PdfDocument $document;
        final /* synthetic */ Function1<String, Unit> $isFinish;
        final /* synthetic */ LinearLayout $pdfView;
        final /* synthetic */ int $totalHeight;
        final /* synthetic */ int $totalWidth;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle$drawPDF$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle$drawPDF$1$1", f = "SleepRhythmHandle.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06151 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PdfDocument $document;
            final /* synthetic */ Function1<String, Unit> $isFinish;
            final /* synthetic */ String $path;
            final /* synthetic */ LinearLayout $pdfView;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06151(LinearLayout linearLayout, Function1<? super String, Unit> function1, String str, PdfDocument pdfDocument, Continuation<? super C06151> continuation) {
                super(2, continuation);
                this.$pdfView = linearLayout;
                this.$isFinish = function1;
                this.$path = str;
                this.$document = pdfDocument;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06151(this.$pdfView, this.$isFinish, this.$path, this.$document, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ExtUtilKt.gone(this.$pdfView);
                Function1<String, Unit> function1 = this.$isFinish;
                String str = this.$path;
                Intrinsics.checkNotNull(str);
                function1.invoke2(str);
                this.$document.close();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06151) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PdfDocument pdfDocument, int i, int i2, BaseActivity baseActivity, LinearLayout linearLayout, Function1<? super String, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$document = pdfDocument;
            this.$totalWidth = i;
            this.$totalHeight = i2;
            this.$context = baseActivity;
            this.$pdfView = linearLayout;
            this.$isFinish = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$document, this.$totalWidth, this.$totalHeight, this.$context, this.$pdfView, this.$isFinish, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    File file = new File(im9.L());
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    SleepRhythmHandle$drawPDF$1$path$1 sleepRhythmHandle$drawPDF$1$path$1 = new SleepRhythmHandle$drawPDF$1$path$1(file, this.$document, this.$totalWidth, this.$totalHeight, this.$context, null);
                    this.label = 1;
                    obj = BuildersKt.withContext(io2, sleepRhythmHandle$drawPDF$1$path$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                AnyExtKt.main$default(null, new C06151(this.$pdfView, this.$isFinish, (String) obj, this.$document, null), 1, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SleepRhythmHandle() {
    }

    private final void addToChartListMap(Map<Long, SortSleepRhythmChartValue> resultMap, Map<Long, ? extends List<body>> bodyMomentumList, Map<Long, ? extends List<LightValueItem>> lightValueList, Map<Long, ? extends List<SleepBedTimeReport>> bedTimeReport, Map<Long, ? extends List<SleepWakeTimeReport>> sleepTimeReport) {
        Iterator<Map.Entry<Long, SortSleepRhythmChartValue>> it = resultMap.entrySet().iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().getKey().longValue();
            long time_one_day_in_millis = (TimeUtils.INSTANCE.getTIME_ONE_DAY_IN_MILLIS() / ((long) 1000)) + jLongValue;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            if (bodyMomentumList != null && !bodyMomentumList.isEmpty()) {
                List<body> list = bodyMomentumList.get(Long.valueOf(jLongValue));
                List mutableList = list != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list) : null;
                List<body> list2 = bodyMomentumList.get(Long.valueOf(time_one_day_in_millis));
                List mutableList2 = list2 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list2) : null;
                if (mutableList != null) {
                    arrayList.addAll(mutableList);
                }
                if (mutableList2 != null) {
                    arrayList.addAll(mutableList2);
                }
            }
            if (lightValueList != null && !lightValueList.isEmpty()) {
                List<LightValueItem> list3 = lightValueList.get(Long.valueOf(jLongValue));
                List mutableList3 = list3 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list3) : null;
                List<LightValueItem> list4 = lightValueList.get(Long.valueOf(time_one_day_in_millis));
                List mutableList4 = list4 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list4) : null;
                if (mutableList3 != null) {
                    arrayList2.addAll(mutableList3);
                }
                if (mutableList4 != null) {
                    arrayList2.addAll(mutableList4);
                }
            }
            if (bedTimeReport != null && !bedTimeReport.isEmpty()) {
                List<SleepBedTimeReport> list5 = bedTimeReport.get(Long.valueOf(jLongValue));
                List mutableList5 = list5 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list5) : null;
                List<SleepBedTimeReport> list6 = bedTimeReport.get(Long.valueOf(time_one_day_in_millis));
                List mutableList6 = list6 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list6) : null;
                if (mutableList5 != null) {
                    arrayList3.addAll(mutableList5);
                }
                if (mutableList6 != null) {
                    arrayList3.addAll(mutableList6);
                }
            }
            if (sleepTimeReport != null && !sleepTimeReport.isEmpty()) {
                List<SleepWakeTimeReport> list7 = sleepTimeReport.get(Long.valueOf(jLongValue));
                List mutableList7 = list7 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list7) : null;
                List<SleepWakeTimeReport> list8 = sleepTimeReport.get(Long.valueOf(time_one_day_in_millis));
                List mutableList8 = list8 != null ? CollectionsKt___CollectionsKt.toMutableList((Collection) list8) : null;
                if (mutableList7 != null) {
                    arrayList4.addAll(mutableList7);
                }
                if (mutableList8 != null) {
                    arrayList4.addAll(mutableList8);
                }
            }
            resultMap.put(Long.valueOf(jLongValue), new SortSleepRhythmChartValue(jLongValue, arrayList2, arrayList, arrayList3, arrayList4));
        }
    }

    public static /* synthetic */ List convertBasicSleepData$default(SleepRhythmHandle sleepRhythmHandle, SleepProjectReport sleepProjectReport, long j, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return sleepRhythmHandle.convertBasicSleepData(sleepProjectReport, j, i, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap createPDFBitmap(File file, int width, int height) {
        if (!file.exists()) {
            return null;
        }
        PdfRenderer pdfRenderer = new PdfRenderer(ParcelFileDescriptor.open(file, 268435456));
        pdfRenderer.getPageCount();
        PdfRenderer.Page pageOpenPage = pdfRenderer.openPage(0);
        Intrinsics.checkNotNullExpressionValue(pageOpenPage, "openPage(...)");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas();
        canvas.drawColor(-1);
        canvas.drawBitmap(bitmapCreateBitmap, 0.0f, 0.0f, (Paint) null);
        pageOpenPage.render(bitmapCreateBitmap, new Rect(0, 0, width, height), null, 1);
        pageOpenPage.close();
        pdfRenderer.close();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawPDF(BaseActivity context, LinearLayout pdfView, RecyclerView pdfSleepDetailRv, RecyclerView pdfDiaryListRv, RecyclerView pdfRhythmChartListView, TextView pdfRhythmChartListTitle, TextView pdfRhythmDiaryTitle, TextView pdfSleepDetailTitle, LinearLayout rhythmTitleDesView, LinearLayout detailTitleDesView, Function1<? super String, Unit> isFinish) {
        int iComputeHorizontalScrollRange = pdfDiaryListRv.computeHorizontalScrollRange();
        int height = pdfDiaryListRv.getHeight();
        int width = pdfRhythmChartListView.getWidth();
        int iComputeVerticalScrollRange = pdfRhythmChartListView.computeVerticalScrollRange();
        int iComputeVerticalScrollRange2 = pdfSleepDetailRv.computeVerticalScrollRange();
        int width2 = pdfSleepDetailRv.getWidth();
        int iMax = Math.max(iComputeHorizontalScrollRange, Math.max(width, width2));
        int dp = ExtUtilsKt.getDp(Float.valueOf(100.0f)) + iMax;
        int i = height + iComputeVerticalScrollRange;
        int height2 = i + iComputeVerticalScrollRange2 + rhythmTitleDesView.getHeight() + detailTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(400.0f));
        Logger.i(TAG, "draw  pdfDiaryListRvWidth = " + iComputeHorizontalScrollRange + " pdfDiaryListRvHeight= " + height + "  pdfRhythmChartListViewWidth = " + width + " pdfRhythmChartListViewHeight" + iComputeVerticalScrollRange + " pdfSleepDetailRvHeight = " + iComputeVerticalScrollRange2 + " pdfSleepDetailRvWidth" + width2 + " totalWidth = " + dp + " totalHeight" + height2);
        PdfDocument pdfDocument = new PdfDocument();
        PdfDocument.Page pageStartPage = pdfDocument.startPage(new PdfDocument.PageInfo.Builder(dp, height2, 1).create());
        Canvas canvas = pageStartPage.getCanvas();
        View view = new View(context);
        if (UIUtils.isNightMode(ApplicationExtKt.getApplication())) {
            view.setBackgroundColor(-16777216);
        } else {
            view.setBackgroundColor(-1);
        }
        view.layout(0, 0, dp, height2);
        view.draw(canvas);
        canvas.translate(ExtUtilsKt.getDp(Float.valueOf(16.0f)), ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfRhythmChartListTitle.draw(canvas);
        canvas.translate(0.0f, pdfRhythmChartListTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        rhythmTitleDesView.draw(canvas);
        canvas.translate(0.0f, rhythmTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfRhythmChartListView.layout(0, 0, iMax, pdfRhythmChartListTitle.getHeight() + iComputeVerticalScrollRange + rhythmTitleDesView.getHeight());
        pdfRhythmChartListView.draw(canvas);
        canvas.translate(0.0f, iComputeVerticalScrollRange + pdfRhythmChartListTitle.getHeight() + rhythmTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfRhythmDiaryTitle.layout(0, pdfRhythmChartListTitle.getHeight() + iComputeVerticalScrollRange + ExtUtilsKt.getDp(Float.valueOf(16.0f)), pdfRhythmDiaryTitle.getWidth(), pdfRhythmDiaryTitle.getHeight() + iComputeVerticalScrollRange + pdfRhythmChartListTitle.getHeight() + rhythmTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfRhythmDiaryTitle.draw(canvas);
        canvas.translate(0.0f, pdfRhythmChartListTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfDiaryListRv.layout(0, pdfRhythmDiaryTitle.getHeight() + iComputeVerticalScrollRange + pdfRhythmChartListTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)), iMax, pdfRhythmDiaryTitle.getHeight() + height + iComputeVerticalScrollRange + pdfRhythmChartListTitle.getHeight() + rhythmTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfDiaryListRv.draw(canvas);
        canvas.translate(0.0f, height + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfSleepDetailTitle.layout(0, pdfRhythmDiaryTitle.getHeight() + i + pdfRhythmChartListTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)), pdfSleepDetailTitle.getWidth(), pdfSleepDetailTitle.getHeight() + height + iComputeVerticalScrollRange + pdfRhythmDiaryTitle.getHeight() + pdfRhythmChartListTitle.getHeight() + rhythmTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfSleepDetailTitle.draw(canvas);
        ViewExtKt.setWidth(pdfSleepDetailRv, iMax);
        getMSleepRhythmSleepItemAdapter().notifyDataSetChanged();
        canvas.translate(0.0f, pdfSleepDetailTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        detailTitleDesView.draw(canvas);
        canvas.translate(0.0f, detailTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        canvas.translate(0.0f, detailTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfSleepDetailRv.layout(0, i + pdfRhythmDiaryTitle.getHeight() + pdfRhythmChartListTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)), iMax, iComputeVerticalScrollRange2 + height + iComputeVerticalScrollRange + pdfRhythmDiaryTitle.getHeight() + pdfRhythmChartListTitle.getHeight() + rhythmTitleDesView.getHeight() + detailTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfSleepDetailRv.draw(canvas);
        pdfDocument.finishPage(pageStartPage);
        AnyExtKt.io$default(null, new AnonymousClass1(pdfDocument, dp, height2, context, pdfView, isFinish, null), 1, null);
    }

    private final SleepRhythmChatListAdapter getMSleepRhythmChatListAdapter() {
        return (SleepRhythmChatListAdapter) mSleepRhythmChatListAdapter.getValue();
    }

    private final SleepRhythmDiaryListAdapter getMSleepRhythmDiaryListAdapter() {
        return (SleepRhythmDiaryListAdapter) mSleepRhythmDiaryListAdapter.getValue();
    }

    private final SleepRhythmSleepItemAdapter getMSleepRhythmSleepItemAdapter() {
        return (SleepRhythmSleepItemAdapter) mSleepRhythmSleepItemAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmChatListAdapter mSleepRhythmChatListAdapter_delegate$lambda$2() {
        return new SleepRhythmChatListAdapter(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmDiaryListAdapter mSleepRhythmDiaryListAdapter_delegate$lambda$0() {
        return new SleepRhythmDiaryListAdapter(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SleepRhythmSleepItemAdapter mSleepRhythmSleepItemAdapter_delegate$lambda$1() {
        return new SleepRhythmSleepItemAdapter(new ArrayList());
    }

    @NotNull
    public final List<SleepRhythmChatListAdapter.SleepRhythmChartValue> convertBasicSleepData(@NotNull SleepProjectReport sleepProjectReport, long j, int i, boolean z) {
        int i2;
        ArrayList arrayList;
        Iterator it;
        long j2;
        ArrayList arrayList2;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        int bodyMomentum;
        Object next7;
        Object next8;
        int lightValue;
        Intrinsics.checkNotNullParameter(sleepProjectReport, "<this>");
        ArrayList arrayList3 = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = 1000;
            if (i4 >= i) {
                break;
            }
            long j3 = 1000;
            long jCurrentTimeMillis = System.currentTimeMillis() / j3;
            long j4 = i4;
            TimeUtils timeUtils = TimeUtils.INSTANCE;
            if (jCurrentTimeMillis > j + ((timeUtils.getTIME_ONE_DAY_IN_MILLIS() * j4) / j3)) {
                linkedHashMap.put(Long.valueOf(j + ((j4 * timeUtils.getTIME_ONE_DAY_IN_MILLIS()) / j3)), null);
            }
            i4++;
        }
        addToChartListMap(linkedHashMap, sleepProjectReport.getBodyMomentumList(), sleepProjectReport.getLightValueList(), sleepProjectReport.getBedTimeReport(), sleepProjectReport.getSleepTimeReport());
        LogExtKt.logi(TAG, "resultMap:" + linkedHashMap);
        Iterator it2 = linkedHashMap.entrySet().iterator();
        int i5 = 0;
        while (it2.hasNext()) {
            Object next9 = it2.next();
            int i6 = i5 + 1;
            if (i5 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) next9;
            long jLongValue = ((Number) entry.getKey()).longValue();
            SortSleepRhythmChartValue sortSleepRhythmChartValue = (SortSleepRhythmChartValue) entry.getValue();
            if (!z || i5 <= 3) {
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                long j5 = i2;
                Calendar dayZero0ClockCalendar = TimeUtils.getDayZero0ClockCalendar(jLongValue * j5);
                Intrinsics.checkNotNull(dayZero0ClockCalendar);
                long timeInMillis = dayZero0ClockCalendar.getTimeInMillis() / j5;
                List<LightValueItem> lightValue2 = sortSleepRhythmChartValue != null ? sortSleepRhythmChartValue.getLightValue() : null;
                List<body> bodyValue = sortSleepRhythmChartValue != null ? sortSleepRhythmChartValue.getBodyValue() : null;
                List<SleepWakeTimeReport> sleepValue = sortSleepRhythmChartValue != null ? sortSleepRhythmChartValue.getSleepValue() : null;
                List<SleepBedTimeReport> bedValue = sortSleepRhythmChartValue != null ? sortSleepRhythmChartValue.getBedValue() : null;
                IntProgression intProgressionStep = RangesKt___RangesKt.step(RangesKt___RangesKt.until(i3, 2880), 2);
                int first = intProgressionStep.getFirst();
                int last = intProgressionStep.getLast();
                int step = intProgressionStep.getStep();
                if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                    while (true) {
                        arrayList = arrayList3;
                        it = it2;
                        long j6 = timeInMillis + ((long) (first * 60));
                        j2 = jLongValue;
                        long j7 = timeInMillis + ((long) ((first + 1) * 60));
                        List<LightValueItem> list = lightValue2;
                        if (list == null || list.isEmpty()) {
                            i6 = i6;
                        } else {
                            List<LightValueItem> list2 = lightValue2;
                            Iterator<T> it3 = list2.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next7 = null;
                                    break;
                                }
                                next7 = it3.next();
                            } while (((LightValueItem) next7).getTime() != j6);
                            LightValueItem lightValueItem = (LightValueItem) next7;
                            Iterator<T> it4 = list2.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next8 = null;
                                    break;
                                }
                                next8 = it4.next();
                            } while (((LightValueItem) next8).getTime() != j7);
                            LightValueItem lightValueItem2 = (LightValueItem) next8;
                            if (lightValueItem != null && lightValueItem2 != null) {
                                lightValue = (lightValueItem.getLightValue() + lightValueItem2.getLightValue()) / 2;
                            } else if (lightValueItem != null) {
                                lightValue = lightValueItem.getLightValue();
                            } else {
                                if (lightValueItem2 != null) {
                                    lightValue = lightValueItem2.getLightValue();
                                } else {
                                    lightValue = 0;
                                }
                                arrayList4.add(new SleepRhythmChatListAdapter.SleepRhythmChartItem(j6, lightValue * 10.0f));
                            }
                            arrayList4.add(new SleepRhythmChatListAdapter.SleepRhythmChartItem(j6, lightValue * 10.0f));
                        }
                        List<body> list3 = bodyValue;
                        if (list3 != null && !list3.isEmpty()) {
                            List<body> list4 = bodyValue;
                            Iterator<T> it5 = list4.iterator();
                            do {
                                if (!it5.hasNext()) {
                                    next5 = null;
                                    break;
                                }
                                next5 = it5.next();
                            } while (((body) next5).getTime() != j6);
                            body bodyVar = (body) next5;
                            Iterator<T> it6 = list4.iterator();
                            do {
                                if (!it6.hasNext()) {
                                    next6 = null;
                                    break;
                                }
                                next6 = it6.next();
                            } while (((body) next6).getTime() != j7);
                            body bodyVar2 = (body) next6;
                            if (bodyVar != null && bodyVar2 != null) {
                                bodyMomentum = (bodyVar.getBodyMomentum() + bodyVar2.getBodyMomentum()) / 2;
                            } else if (bodyVar != null) {
                                bodyMomentum = bodyVar.getBodyMomentum();
                            } else {
                                bodyMomentum = bodyVar2 != null ? bodyVar2.getBodyMomentum() : 0;
                            }
                            arrayList5.add(new SleepRhythmChatListAdapter.SleepRhythmChartItem(j6, bodyMomentum * 1.0f));
                        }
                        List<SleepWakeTimeReport> list5 = sleepValue;
                        if (list5 != null && !list5.isEmpty()) {
                            Iterator<T> it7 = sleepValue.iterator();
                            while (true) {
                                if (!it7.hasNext()) {
                                    next4 = null;
                                    break;
                                }
                                next4 = it7.next();
                                SleepWakeTimeReport sleepWakeTimeReport = (SleepWakeTimeReport) next4;
                                if (sleepWakeTimeReport.getStartTime() <= j6 && j6 <= sleepWakeTimeReport.getEndTime()) {
                                    break;
                                }
                            }
                            arrayList7.add(((SleepWakeTimeReport) next4) != null ? new SleepRhythmChatListAdapter.SleepRhythmChartItem(j7, 10000.0f) : new SleepRhythmChatListAdapter.SleepRhythmChartItem(j7, 0.0f));
                        }
                        List<SleepBedTimeReport> list6 = bedValue;
                        if (list6 != null && !list6.isEmpty()) {
                            Iterator<T> it8 = bedValue.iterator();
                            while (true) {
                                if (!it8.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it8.next();
                                SleepBedTimeReport sleepBedTimeReport = (SleepBedTimeReport) next3;
                                if (sleepBedTimeReport.getStartTime() <= j6 && j6 <= sleepBedTimeReport.getEndTime()) {
                                    break;
                                }
                            }
                            arrayList6.add(((SleepBedTimeReport) next3) != null ? new SleepRhythmChatListAdapter.SleepRhythmChartItem(j7, 2000.0f) : new SleepRhythmChatListAdapter.SleepRhythmChartItem(j7, 0.0f));
                        }
                        if (first == last) {
                            break;
                        }
                        first += step;
                        arrayList3 = arrayList;
                        it2 = it;
                        jLongValue = j2;
                        i6 = i6;
                    }
                } else {
                    arrayList = arrayList3;
                    it = it2;
                    i6 = i6;
                    j2 = jLongValue;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj : arrayList6) {
                    Long lValueOf = Long.valueOf(((SleepRhythmChatListAdapter.SleepRhythmChartItem) obj).getTime());
                    Object arrayList8 = linkedHashMap2.get(lValueOf);
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                        linkedHashMap2.put(lValueOf, arrayList8);
                    }
                    ((List) arrayList8).add(obj);
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap2.size()));
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    Object key = entry2.getKey();
                    Iterator it9 = ((Iterable) entry2.getValue()).iterator();
                    do {
                        if (!it9.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it9.next();
                    } while (!(!(((SleepRhythmChatListAdapter.SleepRhythmChartItem) next2).getValue() == 0.0f)));
                    SleepRhythmChatListAdapter.SleepRhythmChartItem sleepRhythmChartItem = (SleepRhythmChatListAdapter.SleepRhythmChartItem) next2;
                    if (sleepRhythmChartItem == null) {
                        sleepRhythmChartItem = (SleepRhythmChatListAdapter.SleepRhythmChartItem) CollectionsKt___CollectionsKt.first((List) entry2.getValue());
                    }
                    linkedHashMap3.put(key, sleepRhythmChartItem);
                }
                List mutableList = CollectionsKt___CollectionsKt.toMutableList(linkedHashMap3.values());
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Object obj2 : arrayList7) {
                    Long lValueOf2 = Long.valueOf(((SleepRhythmChatListAdapter.SleepRhythmChartItem) obj2).getTime());
                    Object arrayList9 = linkedHashMap4.get(lValueOf2);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        linkedHashMap4.put(lValueOf2, arrayList9);
                    }
                    ((List) arrayList9).add(obj2);
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap4.size()));
                for (Map.Entry entry3 : linkedHashMap4.entrySet()) {
                    Object key2 = entry3.getKey();
                    Iterator it10 = ((Iterable) entry3.getValue()).iterator();
                    do {
                        if (!it10.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it10.next();
                    } while (!(!(((SleepRhythmChatListAdapter.SleepRhythmChartItem) next).getValue() == 0.0f)));
                    SleepRhythmChatListAdapter.SleepRhythmChartItem sleepRhythmChartItem2 = (SleepRhythmChatListAdapter.SleepRhythmChartItem) next;
                    if (sleepRhythmChartItem2 == null) {
                        sleepRhythmChartItem2 = (SleepRhythmChatListAdapter.SleepRhythmChartItem) CollectionsKt___CollectionsKt.first((List) entry3.getValue());
                    }
                    linkedHashMap5.put(key2, sleepRhythmChartItem2);
                }
                SleepRhythmChatListAdapter.SleepRhythmChartValue sleepRhythmChartValue = new SleepRhythmChatListAdapter.SleepRhythmChartValue(j2, arrayList4, arrayList5, mutableList, CollectionsKt___CollectionsKt.toMutableList(linkedHashMap5.values()));
                arrayList2 = arrayList;
                arrayList2.add(sleepRhythmChartValue);
            } else {
                it = it2;
                i6 = i6;
                arrayList2 = arrayList3;
            }
            arrayList3 = arrayList2;
            it2 = it;
            i5 = i6;
            i3 = 0;
            i2 = 1000;
        }
        ArrayList arrayList10 = arrayList3;
        if (arrayList10.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList10, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle$convertBasicSleepData$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepRhythmChatListAdapter.SleepRhythmChartValue) t).getTime()), Long.valueOf(((SleepRhythmChatListAdapter.SleepRhythmChartValue) t2).getTime()));
                }
            });
        }
        return arrayList10;
    }

    @NotNull
    public final List<SleepRhythmDiaryListAdapter.SleepDiaryTransform> convertItemList(@NotNull List<SleepDiaryReport> mutableList) {
        Object next;
        Object next2;
        Object next3;
        int dp;
        int dp2;
        int dp3;
        List<SleepMedicationDetail> medicationBeforeBedtime;
        List<SleepMedicationDetail> medicationBeforeBedtime2;
        List<SleepMedicationDetail> medicationBeforeBedtime3;
        List<Integer> fallAsleepAgainDuration;
        List<Integer> fallAsleepAgainDuration2;
        List<Integer> fallAsleepAgainDuration3;
        List<SleepNapSituation> napSituation;
        List<SleepNapSituation> napSituation2;
        List<SleepNapSituation> napSituation3;
        Intrinsics.checkNotNullParameter(mutableList, "mutableList");
        ArrayList arrayList = new ArrayList();
        List<SleepDiaryReport> list = mutableList;
        Iterator<T> it = list.iterator();
        int i = 0;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                List<SleepNapSituation> napSituation4 = ((SleepDiaryReport) next).getNapSituation();
                int size = napSituation4 != null ? napSituation4.size() : 0;
                do {
                    Object next4 = it.next();
                    List<SleepNapSituation> napSituation5 = ((SleepDiaryReport) next4).getNapSituation();
                    int size2 = napSituation5 != null ? napSituation5.size() : 0;
                    if (size < size2) {
                        next = next4;
                        size = size2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        SleepDiaryReport sleepDiaryReport = (SleepDiaryReport) next;
        Iterator<T> it2 = list.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                List<SleepMedicationDetail> medicationBeforeBedtime4 = ((SleepDiaryReport) next2).getMedicationBeforeBedtime();
                int size3 = medicationBeforeBedtime4 != null ? medicationBeforeBedtime4.size() : 0;
                do {
                    Object next5 = it2.next();
                    List<SleepMedicationDetail> medicationBeforeBedtime5 = ((SleepDiaryReport) next5).getMedicationBeforeBedtime();
                    int size4 = medicationBeforeBedtime5 != null ? medicationBeforeBedtime5.size() : 0;
                    if (size3 < size4) {
                        next2 = next5;
                        size3 = size4;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        SleepDiaryReport sleepDiaryReport2 = (SleepDiaryReport) next2;
        Iterator<T> it3 = list.iterator();
        if (it3.hasNext()) {
            next3 = it3.next();
            if (it3.hasNext()) {
                List<Integer> fallAsleepAgainDuration4 = ((SleepDiaryReport) next3).getFallAsleepAgainDuration();
                int size5 = fallAsleepAgainDuration4 != null ? fallAsleepAgainDuration4.size() : 0;
                do {
                    Object next6 = it3.next();
                    List<Integer> fallAsleepAgainDuration5 = ((SleepDiaryReport) next6).getFallAsleepAgainDuration();
                    int size6 = fallAsleepAgainDuration5 != null ? fallAsleepAgainDuration5.size() : 0;
                    if (size5 < size6) {
                        next3 = next6;
                        size5 = size6;
                    }
                } while (it3.hasNext());
            }
        } else {
            next3 = null;
        }
        SleepDiaryReport sleepDiaryReport3 = (SleepDiaryReport) next3;
        CollectionsKt___CollectionsKt.indexOf((List<? extends SleepDiaryReport>) ((List<? extends Object>) mutableList), sleepDiaryReport);
        CollectionsKt___CollectionsKt.indexOf((List<? extends SleepDiaryReport>) ((List<? extends Object>) mutableList), sleepDiaryReport2);
        CollectionsKt___CollectionsKt.indexOf((List<? extends SleepDiaryReport>) ((List<? extends Object>) mutableList), sleepDiaryReport3);
        if (((sleepDiaryReport == null || (napSituation3 = sleepDiaryReport.getNapSituation()) == null) ? null : Integer.valueOf(napSituation3.size())) == null || (((napSituation = sleepDiaryReport.getNapSituation()) != null && napSituation.size() == 0) || ((napSituation2 = sleepDiaryReport.getNapSituation()) != null && napSituation2.size() == 1))) {
            dp = ExtUtilsKt.getDp(Float.valueOf(45.0f));
        } else {
            int dp4 = ExtUtilsKt.getDp(Float.valueOf(55.0f));
            List<SleepNapSituation> napSituation6 = sleepDiaryReport.getNapSituation();
            Integer numValueOf = napSituation6 != null ? Integer.valueOf(napSituation6.size()) : null;
            Intrinsics.checkNotNull(numValueOf);
            dp = dp4 + (numValueOf.intValue() * ExtUtilsKt.getDp(Float.valueOf(20.0f)));
        }
        if (((sleepDiaryReport3 == null || (fallAsleepAgainDuration3 = sleepDiaryReport3.getFallAsleepAgainDuration()) == null) ? null : Integer.valueOf(fallAsleepAgainDuration3.size())) == null || (((fallAsleepAgainDuration = sleepDiaryReport3.getFallAsleepAgainDuration()) != null && fallAsleepAgainDuration.size() == 0) || ((fallAsleepAgainDuration2 = sleepDiaryReport3.getFallAsleepAgainDuration()) != null && fallAsleepAgainDuration2.size() == 1))) {
            dp2 = ExtUtilsKt.getDp(Float.valueOf(45.0f));
        } else {
            int dp5 = ExtUtilsKt.getDp(Float.valueOf(55.0f));
            List<Integer> fallAsleepAgainDuration6 = sleepDiaryReport3.getFallAsleepAgainDuration();
            Integer numValueOf2 = fallAsleepAgainDuration6 != null ? Integer.valueOf(fallAsleepAgainDuration6.size()) : null;
            Intrinsics.checkNotNull(numValueOf2);
            dp2 = dp5 + ((numValueOf2.intValue() + 1) * ExtUtilsKt.getDp(Float.valueOf(20.0f)));
        }
        int dp6 = ExtUtilsKt.getDp(Float.valueOf(55.0f));
        if (sleepDiaryReport2 != null && (medicationBeforeBedtime3 = sleepDiaryReport2.getMedicationBeforeBedtime()) != null) {
            for (SleepMedicationDetail sleepMedicationDetail : medicationBeforeBedtime3) {
                if (sleepMedicationDetail.getMedicationName().length() > 16) {
                    dp6 = ExtUtilsKt.getDp(Float.valueOf(70.0f));
                }
                if (sleepMedicationDetail.getMedicationName().length() > 25) {
                    dp6 = ExtUtilsKt.getDp(Float.valueOf(80.0f));
                }
            }
        }
        if (((sleepDiaryReport2 == null || (medicationBeforeBedtime2 = sleepDiaryReport2.getMedicationBeforeBedtime()) == null) ? null : Integer.valueOf(medicationBeforeBedtime2.size())) == null || ((medicationBeforeBedtime = sleepDiaryReport2.getMedicationBeforeBedtime()) != null && medicationBeforeBedtime.size() == 0)) {
            dp3 = ExtUtilsKt.getDp(Float.valueOf(45.0f));
        } else {
            int dp7 = ExtUtilsKt.getDp(Float.valueOf(55.0f)) + ExtUtilsKt.getDp(Float.valueOf(45.0f));
            List<SleepMedicationDetail> medicationBeforeBedtime6 = sleepDiaryReport2.getMedicationBeforeBedtime();
            Integer numValueOf3 = medicationBeforeBedtime6 != null ? Integer.valueOf(medicationBeforeBedtime6.size()) : null;
            Intrinsics.checkNotNull(numValueOf3);
            dp3 = dp7 + (numValueOf3.intValue() * dp6);
        }
        arrayList.add(new SleepRhythmDiaryListAdapter.SleepDiaryTransform(dp3, dp, dp2, null));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new SleepRhythmDiaryListAdapter.SleepDiaryTransform(dp3, dp, dp2, (SleepDiaryReport) obj));
            i = i2;
        }
        return arrayList;
    }

    public final void createDownLoadView(long startTime, int cycle, @NotNull final LinearLayout pdfView, @NotNull LinearLayout healthSleepRhythmReportView, @NotNull final BaseActivity context, @Nullable SleepProjectReport project, @NotNull List<SleepRhythmChatListAdapter.SleepRhythmChartValue> sleepRhythmReports, @NotNull final Function1<? super String, Unit> isFinish) {
        Intrinsics.checkNotNullParameter(pdfView, "pdfView");
        Intrinsics.checkNotNullParameter(healthSleepRhythmReportView, "healthSleepRhythmReportView");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sleepRhythmReports, "sleepRhythmReports");
        Intrinsics.checkNotNullParameter(isFinish, "isFinish");
        if (project == null) {
            return;
        }
        ExtUtilKt.visible(pdfView);
        final TextView textView = (TextView) healthSleepRhythmReportView.findViewById(eri.Cc);
        final RecyclerView recyclerView = (RecyclerView) healthSleepRhythmReportView.findViewById(eri.Dc);
        final TextView textView2 = (TextView) healthSleepRhythmReportView.findViewById(eri.Gc);
        final RecyclerView recyclerView2 = (RecyclerView) healthSleepRhythmReportView.findViewById(eri.Fc);
        final TextView textView3 = (TextView) healthSleepRhythmReportView.findViewById(eri.Ec);
        final RecyclerView recyclerView3 = (RecyclerView) healthSleepRhythmReportView.findViewById(eri.Bc);
        final LinearLayout linearLayout = (LinearLayout) healthSleepRhythmReportView.findViewById(eri.G6);
        final LinearLayout linearLayout2 = (LinearLayout) healthSleepRhythmReportView.findViewById(eri.c6);
        recyclerView.setAdapter(getMSleepRhythmChatListAdapter());
        recyclerView.addItemDecoration(new SleepDiaryUpdateFragment.SpaceItemDecoration());
        recyclerView3.setLayoutManager(new LinearLayoutManager(context, 0, false));
        recyclerView3.setAdapter(getMSleepRhythmDiaryListAdapter());
        recyclerView2.setAdapter(getMSleepRhythmSleepItemAdapter());
        getMSleepRhythmChatListAdapter().updateDataList(sleepRhythmReports, startTime, cycle);
        Map<Long, SleepDiaryReport> sleepDiaryInfoList = project.getSleepDiaryInfoList();
        if (sleepDiaryInfoList != null && !sleepDiaryInfoList.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Map<Long, SleepDiaryReport> sleepDiaryInfoList2 = project.getSleepDiaryInfoList();
            Intrinsics.checkNotNull(sleepDiaryInfoList2);
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) sleepDiaryInfoList2.values());
            for (int size = mutableList.size() - 1; -1 < size; size--) {
                SleepDiaryReport sleepDiaryReport = (SleepDiaryReport) mutableList.get(size);
                List<Integer> fallAsleepAgainDuration = sleepDiaryReport.getFallAsleepAgainDuration();
                sleepDiaryReport.setAwakeCount(fallAsleepAgainDuration != null ? Integer.valueOf(fallAsleepAgainDuration.size()) : null);
                arrayList.add(sleepDiaryReport);
            }
            getMSleepRhythmDiaryListAdapter().updateDataList(convertItemList(arrayList));
        }
        Map<Long, List<SleepSegmentReport>> sleepReport = project.getSleepReport();
        if (sleepReport != null && !sleepReport.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            Map<Long, List<SleepSegmentReport>> sleepReport2 = project.getSleepReport();
            Intrinsics.checkNotNull(sleepReport2);
            Iterator<Map.Entry<Long, List<SleepSegmentReport>>> it = sleepReport2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Long, List<SleepSegmentReport>> next = it.next();
                long jLongValue = next.getKey().longValue();
                for (SleepSegmentReport sleepSegmentReport : next.getValue()) {
                    Iterator<Map.Entry<Long, List<SleepSegmentReport>>> it2 = it;
                    if (sleepSegmentReport.hasStageData()) {
                        arrayList2.add(new SleepRhythmSleepItemAdapter.SleepSegmentReportItem(jLongValue, sleepSegmentReport));
                    }
                    it = it2;
                }
            }
            if (arrayList2.size() > 1) {
                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList2, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle$createDownLoadView$$inlined$sortBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepRhythmSleepItemAdapter.SleepSegmentReportItem) t).getTime()), Long.valueOf(((SleepRhythmSleepItemAdapter.SleepSegmentReportItem) t2).getTime()));
                    }
                });
            }
            getMSleepRhythmSleepItemAdapter().updateDataList(arrayList2, startTime, cycle, false);
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle.createDownLoadView.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                booleanRef.element = true;
                if (booleanRef2.element && booleanRef3.element) {
                    SleepRhythmHandle sleepRhythmHandle = SleepRhythmHandle.INSTANCE;
                    BaseActivity baseActivity = context;
                    LinearLayout linearLayout3 = pdfView;
                    RecyclerView recyclerView4 = recyclerView2;
                    Intrinsics.checkNotNull(recyclerView4);
                    RecyclerView recyclerView5 = recyclerView3;
                    Intrinsics.checkNotNull(recyclerView5);
                    RecyclerView recyclerView6 = recyclerView;
                    Intrinsics.checkNotNull(recyclerView6);
                    TextView textView4 = textView;
                    Intrinsics.checkNotNull(textView4);
                    TextView textView5 = textView3;
                    Intrinsics.checkNotNull(textView5);
                    TextView textView6 = textView2;
                    Intrinsics.checkNotNull(textView6);
                    LinearLayout linearLayout4 = linearLayout;
                    Intrinsics.checkNotNull(linearLayout4);
                    LinearLayout linearLayout5 = linearLayout2;
                    Intrinsics.checkNotNull(linearLayout5);
                    sleepRhythmHandle.drawPDF(baseActivity, linearLayout3, recyclerView4, recyclerView5, recyclerView6, textView4, textView5, textView6, linearLayout4, linearLayout5, isFinish);
                }
                recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        recyclerView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle.createDownLoadView.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                booleanRef2.element = true;
                if (booleanRef.element && booleanRef3.element) {
                    SleepRhythmHandle sleepRhythmHandle = SleepRhythmHandle.INSTANCE;
                    BaseActivity baseActivity = context;
                    LinearLayout linearLayout3 = pdfView;
                    RecyclerView recyclerView4 = recyclerView2;
                    Intrinsics.checkNotNull(recyclerView4);
                    RecyclerView recyclerView5 = recyclerView3;
                    Intrinsics.checkNotNull(recyclerView5);
                    RecyclerView recyclerView6 = recyclerView;
                    Intrinsics.checkNotNull(recyclerView6);
                    TextView textView4 = textView;
                    Intrinsics.checkNotNull(textView4);
                    TextView textView5 = textView3;
                    Intrinsics.checkNotNull(textView5);
                    TextView textView6 = textView2;
                    Intrinsics.checkNotNull(textView6);
                    LinearLayout linearLayout4 = linearLayout;
                    Intrinsics.checkNotNull(linearLayout4);
                    LinearLayout linearLayout5 = linearLayout2;
                    Intrinsics.checkNotNull(linearLayout5);
                    sleepRhythmHandle.drawPDF(baseActivity, linearLayout3, recyclerView4, recyclerView5, recyclerView6, textView4, textView5, textView6, linearLayout4, linearLayout5, isFinish);
                }
                recyclerView3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
        recyclerView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmHandle.createDownLoadView.6
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                booleanRef3.element = true;
                if (booleanRef.element && booleanRef2.element) {
                    SleepRhythmHandle sleepRhythmHandle = SleepRhythmHandle.INSTANCE;
                    BaseActivity baseActivity = context;
                    LinearLayout linearLayout3 = pdfView;
                    RecyclerView recyclerView4 = recyclerView2;
                    Intrinsics.checkNotNull(recyclerView4);
                    RecyclerView recyclerView5 = recyclerView3;
                    Intrinsics.checkNotNull(recyclerView5);
                    RecyclerView recyclerView6 = recyclerView;
                    Intrinsics.checkNotNull(recyclerView6);
                    TextView textView4 = textView;
                    Intrinsics.checkNotNull(textView4);
                    TextView textView5 = textView3;
                    Intrinsics.checkNotNull(textView5);
                    TextView textView6 = textView2;
                    Intrinsics.checkNotNull(textView6);
                    LinearLayout linearLayout4 = linearLayout;
                    Intrinsics.checkNotNull(linearLayout4);
                    LinearLayout linearLayout5 = linearLayout2;
                    Intrinsics.checkNotNull(linearLayout5);
                    sleepRhythmHandle.drawPDF(baseActivity, linearLayout3, recyclerView4, recyclerView5, recyclerView6, textView4, textView5, textView6, linearLayout4, linearLayout5, isFinish);
                }
                recyclerView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        });
    }

    public final boolean hasConsecutiveDays(@NotNull List<Long> timestamps, int days) {
        Intrinsics.checkNotNullParameter(timestamps, "timestamps");
        if (timestamps.size() < days) {
            return false;
        }
        List listSorted = CollectionsKt___CollectionsKt.sorted(timestamps);
        int size = listSorted.size() - days;
        if (size >= 0) {
            int i = 0;
            while (true) {
                for (int i2 = 1; i2 < days; i2++) {
                    int i3 = i + i2;
                    if (((Number) listSorted.get(i3)).longValue() != ((Number) listSorted.get(i3 - 1)).longValue() + ((long) RepositoryManager.GAP_A_DAY)) {
                        if (i != size) {
                            i++;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
}
