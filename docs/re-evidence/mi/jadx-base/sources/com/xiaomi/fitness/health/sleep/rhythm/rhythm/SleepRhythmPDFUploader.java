package com.xiaomi.fitness.health.sleep.rhythm.rhythm;

import android.graphics.Canvas;
import android.graphics.pdf.PdfDocument;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.data.project.SleepDiaryReport;
import com.xiaomi.fit.fitness.export.data.project.SleepProjectReport;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.extensions.ViewExtKt;
import com.xiaomi.fitness.health.sleep.rhythm.data.ResearchPresignedUrlResponse;
import com.xiaomi.fitness.health.sleep.rhythm.diary.SleepDiaryUpdateFragment;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmPDFUploader;
import com.xiaomi.fitness.util.ExtUtilKt;
import defpackage.c0j;
import defpackage.eri;
import defpackage.im9;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001;B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jr\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u001aJj\u0010\u001b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u001a2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J,\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u001a2\u0006\u0010\b\u001a\u00020\tH\u0002JT\u0010!\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00070\u001aH\u0002J|\u0010%\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020\r2\u0006\u00100\u001a\u00020\r2\u0006\u00101\u001a\u0002022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u00070\u001aH\u0002J9\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00052\u0006\u00105\u001a\u0002062!\u00107\u001a\u001d\u0012\u0013\u0012\u00110$¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\u00070\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmPDFUploader;", "", "<init>", "()V", "TAG", "", "downLoadPDF", "", "startTime", "", "cycle", "", "pdfView", "Landroid/widget/LinearLayout;", "healthSleepRhythmReportView1", "healthSleepRhythmReportView2", "healthSleepRhythmReportView3", "healthSleepRhythmReportView4", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "project", "Lcom/xiaomi/fit/fitness/export/data/project/SleepProjectReport;", "sleepRhythmDataList", "", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartValue;", "isFinish", "Lkotlin/Function1;", "createDownLoadView", "projects", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmPDFUploader$SleepRhythmListItem;", "savePDFFile", "document", "Landroid/graphics/pdf/PdfDocument;", "initPage", "healthSleepRhythmReportView", "index", "", "drawPDF", "pageIndex", "pdfSleepDetailRv", "Landroidx/recyclerview/widget/RecyclerView;", "pdfDiaryListRv", "pdfRhythmChartListView", "pdfRhythmChartListTitle", "Landroid/widget/TextView;", "pdfRhythmDiaryTitle", "pdfSleepDetailTitle", "rhythmTitleDesView", "detailTitleDesView", "mSleepRhythmSleepItemAdapter", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmSleepItemAdapter;", "uploadPdf", "pdfFilePath", "uploadUrl", "Lcom/xiaomi/fitness/health/sleep/rhythm/data/ResearchPresignedUrlResponse;", "callResult", "Lkotlin/ParameterName;", "name", "success", "SleepRhythmListItem", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepRhythmPDFUploader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepRhythmPDFUploader.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmPDFUploader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,558:1\n1872#2,2:559\n1863#2,2:561\n1874#2:563\n1872#2,3:564\n1863#2,2:567\n1863#2,2:570\n1010#2,2:573\n216#3:569\n217#3:572\n*S KotlinDebug\n*F\n+ 1 SleepRhythmPDFUploader.kt\ncom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmPDFUploader\n*L\n75#1:559,2\n78#1:561,2\n75#1:563\n168#1:564,3\n365#1:567,2\n381#1:570,2\n391#1:573,2\n380#1:569\n380#1:572\n*E\n"})
public final class SleepRhythmPDFUploader {

    @NotNull
    public static final SleepRhythmPDFUploader INSTANCE = new SleepRhythmPDFUploader();

    @NotNull
    public static final String TAG = "SleepRhythmPDFUploader";

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmPDFUploader$savePDFFile$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmPDFUploader$savePDFFile$1", f = "SleepRhythmPDFUploader.kt", i = {}, l = {214}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25181 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PdfDocument $document;
        final /* synthetic */ Function1<String, Unit> $isFinish;
        final /* synthetic */ long $startTime;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmPDFUploader$savePDFFile$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmPDFUploader$savePDFFile$1$1", f = "SleepRhythmPDFUploader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06161 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function1<String, Unit> $isFinish;
            final /* synthetic */ String $path;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06161(Function1<? super String, Unit> function1, String str, Continuation<? super C06161> continuation) {
                super(2, continuation);
                this.$isFinish = function1;
                this.$path = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06161(this.$isFinish, this.$path, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Function1<String, Unit> function1 = this.$isFinish;
                String str = this.$path;
                Intrinsics.checkNotNull(str);
                function1.invoke2(str);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06161) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C25181(long j, PdfDocument pdfDocument, Function1<? super String, Unit> function1, Continuation<? super C25181> continuation) {
            super(2, continuation);
            this.$startTime = j;
            this.$document = pdfDocument;
            this.$isFinish = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25181(this.$startTime, this.$document, this.$isFinish, continuation);
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
                    String str = ResourceExtKt.getString(c0j.Cj) + TimeUtils.formatDate("yyyyMMdd", Boxing.boxLong(this.$startTime * ((long) 1000)));
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    SleepRhythmPDFUploader$savePDFFile$1$path$1 sleepRhythmPDFUploader$savePDFFile$1$path$1 = new SleepRhythmPDFUploader$savePDFFile$1$path$1(file, str, this.$document, null);
                    this.label = 1;
                    obj = BuildersKt.withContext(io2, sleepRhythmPDFUploader$savePDFFile$1$path$1, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.$document.close();
                AnyExtKt.main$default(null, new C06161(this.$isFinish, (String) obj, null), 1, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private SleepRhythmPDFUploader() {
    }

    private final void createDownLoadView(final LinearLayout pdfView, LinearLayout healthSleepRhythmReportView1, LinearLayout healthSleepRhythmReportView2, LinearLayout healthSleepRhythmReportView3, LinearLayout healthSleepRhythmReportView4, BaseActivity context, final List<SleepRhythmListItem> projects, final Function1<? super String, Unit> isFinish, final long startTime, int cycle) {
        if (projects.isEmpty()) {
            return;
        }
        final PdfDocument pdfDocument = new PdfDocument();
        ViewExtKt.visible(pdfView);
        int i = 0;
        for (Object obj : projects) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SleepRhythmListItem sleepRhythmListItem = (SleepRhythmListItem) obj;
            if (i == 0) {
                INSTANCE.initPage(context, healthSleepRhythmReportView1, sleepRhythmListItem, pdfDocument, i, startTime, cycle, new Function1() { // from class: wum
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SleepRhythmPDFUploader.createDownLoadView$lambda$6$lambda$2(projects, pdfDocument, isFinish, startTime, pdfView, ((Boolean) obj2).booleanValue());
                    }
                });
            }
            if (i == 1) {
                INSTANCE.initPage(context, healthSleepRhythmReportView2, sleepRhythmListItem, pdfDocument, i, startTime, cycle, new Function1() { // from class: xum
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SleepRhythmPDFUploader.createDownLoadView$lambda$6$lambda$3(projects, pdfDocument, isFinish, startTime, pdfView, ((Boolean) obj2).booleanValue());
                    }
                });
            }
            if (i == 2) {
                INSTANCE.initPage(context, healthSleepRhythmReportView3, sleepRhythmListItem, pdfDocument, i, startTime, cycle, new Function1() { // from class: yum
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SleepRhythmPDFUploader.createDownLoadView$lambda$6$lambda$4(projects, pdfDocument, isFinish, startTime, pdfView, ((Boolean) obj2).booleanValue());
                    }
                });
            }
            if (i == 3) {
                INSTANCE.initPage(context, healthSleepRhythmReportView4, sleepRhythmListItem, pdfDocument, i, startTime, cycle, new Function1() { // from class: zum
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return SleepRhythmPDFUploader.createDownLoadView$lambda$6$lambda$5(projects, pdfDocument, isFinish, startTime, pdfView, ((Boolean) obj2).booleanValue());
                    }
                });
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDownLoadView$lambda$6$lambda$2(List projects, PdfDocument document, Function1 isFinish, long j, LinearLayout pdfView, boolean z) {
        Intrinsics.checkNotNullParameter(projects, "$projects");
        Intrinsics.checkNotNullParameter(document, "$document");
        Intrinsics.checkNotNullParameter(isFinish, "$isFinish");
        Intrinsics.checkNotNullParameter(pdfView, "$pdfView");
        if (z && projects.size() - 1 == 0) {
            INSTANCE.savePDFFile(document, isFinish, j);
            ExtUtilKt.gone(pdfView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDownLoadView$lambda$6$lambda$3(List projects, PdfDocument document, Function1 isFinish, long j, LinearLayout pdfView, boolean z) {
        Intrinsics.checkNotNullParameter(projects, "$projects");
        Intrinsics.checkNotNullParameter(document, "$document");
        Intrinsics.checkNotNullParameter(isFinish, "$isFinish");
        Intrinsics.checkNotNullParameter(pdfView, "$pdfView");
        if (z && 1 == projects.size() - 1) {
            INSTANCE.savePDFFile(document, isFinish, j);
            ExtUtilKt.gone(pdfView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDownLoadView$lambda$6$lambda$4(List projects, PdfDocument document, Function1 isFinish, long j, LinearLayout pdfView, boolean z) {
        Intrinsics.checkNotNullParameter(projects, "$projects");
        Intrinsics.checkNotNullParameter(document, "$document");
        Intrinsics.checkNotNullParameter(isFinish, "$isFinish");
        Intrinsics.checkNotNullParameter(pdfView, "$pdfView");
        if (z && 2 == projects.size() - 1) {
            INSTANCE.savePDFFile(document, isFinish, j);
            ExtUtilKt.gone(pdfView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createDownLoadView$lambda$6$lambda$5(List projects, PdfDocument document, Function1 isFinish, long j, LinearLayout pdfView, boolean z) {
        Intrinsics.checkNotNullParameter(projects, "$projects");
        Intrinsics.checkNotNullParameter(document, "$document");
        Intrinsics.checkNotNullParameter(isFinish, "$isFinish");
        Intrinsics.checkNotNullParameter(pdfView, "$pdfView");
        if (z && 3 == projects.size() - 1) {
            INSTANCE.savePDFFile(document, isFinish, j);
            ExtUtilKt.gone(pdfView);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawPDF(PdfDocument document, int pageIndex, BaseActivity context, RecyclerView pdfSleepDetailRv, RecyclerView pdfDiaryListRv, RecyclerView pdfRhythmChartListView, TextView pdfRhythmChartListTitle, TextView pdfRhythmDiaryTitle, TextView pdfSleepDetailTitle, LinearLayout rhythmTitleDesView, LinearLayout detailTitleDesView, SleepRhythmSleepItemAdapter mSleepRhythmSleepItemAdapter, Function1<? super Boolean, Unit> isFinish) {
        int iComputeHorizontalScrollRange = pdfDiaryListRv.computeHorizontalScrollRange();
        int height = pdfDiaryListRv.getHeight();
        int width = pdfRhythmChartListView.getWidth();
        int iComputeVerticalScrollRange = pdfRhythmChartListView.computeVerticalScrollRange();
        int iComputeVerticalScrollRange2 = pdfSleepDetailRv.computeVerticalScrollRange();
        Logger.i(TAG, "index" + pageIndex + " == draw  pdfDiaryListRvWidth = " + iComputeHorizontalScrollRange + " pdfDiaryListRvHeight= " + height + "  pdfRhythmChartListViewWidth = " + width + " pdfRhythmChartListViewHeight" + iComputeVerticalScrollRange + " pdfSleepDetailRvHeight = " + iComputeVerticalScrollRange2 + " pdfSleepDetailRvWidth" + pdfSleepDetailRv.getWidth() + " totalWidth = 3339 totalHeight11641");
        PdfDocument.Page pageStartPage = document.startPage(new PdfDocument.PageInfo.Builder(3339, 11641, pageIndex + 1).create());
        Canvas canvas = pageStartPage.getCanvas();
        View view = new View(context);
        if (UIUtils.isNightMode(ApplicationExtKt.getApplication())) {
            view.setBackgroundColor(-16777216);
        } else {
            view.setBackgroundColor(-1);
        }
        view.layout(0, 0, 3339, 11641);
        view.draw(canvas);
        canvas.translate(ExtUtilsKt.getDp(Float.valueOf(16.0f)), ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfRhythmChartListTitle.draw(canvas);
        canvas.translate(0.0f, pdfRhythmChartListTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        rhythmTitleDesView.draw(canvas);
        canvas.translate(0.0f, rhythmTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfRhythmChartListView.layout(0, 0, 3339 - ExtUtilsKt.getDp(Float.valueOf(32.0f)), pdfRhythmChartListTitle.getHeight() + iComputeVerticalScrollRange + rhythmTitleDesView.getHeight());
        pdfRhythmChartListView.draw(canvas);
        canvas.translate(0.0f, iComputeVerticalScrollRange + pdfRhythmChartListTitle.getHeight() + rhythmTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfRhythmDiaryTitle.layout(0, pdfRhythmChartListTitle.getHeight() + iComputeVerticalScrollRange + ExtUtilsKt.getDp(Float.valueOf(16.0f)), pdfRhythmDiaryTitle.getWidth(), pdfRhythmDiaryTitle.getHeight() + iComputeVerticalScrollRange + pdfRhythmChartListTitle.getHeight() + rhythmTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfRhythmDiaryTitle.draw(canvas);
        canvas.translate(0.0f, pdfRhythmChartListTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfDiaryListRv.layout(0, pdfRhythmDiaryTitle.getHeight() + iComputeVerticalScrollRange + pdfRhythmChartListTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)), Math.min(iComputeHorizontalScrollRange, 3339 - ExtUtilsKt.getDp(Float.valueOf(32.0f))), pdfRhythmDiaryTitle.getHeight() + height + iComputeVerticalScrollRange + pdfRhythmChartListTitle.getHeight() + rhythmTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfDiaryListRv.draw(canvas);
        canvas.translate(0.0f, height + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        int i = height + iComputeVerticalScrollRange;
        pdfSleepDetailTitle.layout(0, pdfRhythmDiaryTitle.getHeight() + i + pdfRhythmChartListTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)), pdfSleepDetailTitle.getWidth(), pdfSleepDetailTitle.getHeight() + height + iComputeVerticalScrollRange + pdfRhythmDiaryTitle.getHeight() + pdfRhythmChartListTitle.getHeight() + rhythmTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfSleepDetailTitle.draw(canvas);
        canvas.translate(0.0f, pdfSleepDetailTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        detailTitleDesView.draw(canvas);
        canvas.translate(0.0f, detailTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        canvas.translate(0.0f, detailTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        ViewExtKt.setWidth(pdfSleepDetailRv, 3339 - ExtUtilsKt.getDp(Float.valueOf(32.0f)));
        mSleepRhythmSleepItemAdapter.notifyDataSetChanged();
        pdfSleepDetailRv.layout(0, i + pdfRhythmDiaryTitle.getHeight() + pdfRhythmChartListTitle.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)), 3339 - ExtUtilsKt.getDp(Float.valueOf(32.0f)), iComputeVerticalScrollRange2 + height + iComputeVerticalScrollRange + pdfRhythmDiaryTitle.getHeight() + pdfRhythmChartListTitle.getHeight() + rhythmTitleDesView.getHeight() + detailTitleDesView.getHeight() + ExtUtilsKt.getDp(Float.valueOf(16.0f)));
        pdfSleepDetailRv.draw(canvas);
        document.finishPage(pageStartPage);
        isFinish.invoke2(Boolean.TRUE);
    }

    private final void initPage(final BaseActivity context, LinearLayout healthSleepRhythmReportView, SleepRhythmListItem project, final PdfDocument document, final int index, long startTime, int cycle, final Function1<? super Boolean, Unit> isFinish) {
        List<SleepRhythmChatListAdapter.SleepRhythmChartValue> arrayList;
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
        final TextView textView = (TextView) healthSleepRhythmReportView.findViewById(eri.Cc);
        final RecyclerView recyclerView = (RecyclerView) healthSleepRhythmReportView.findViewById(eri.Dc);
        final TextView textView2 = (TextView) healthSleepRhythmReportView.findViewById(eri.Gc);
        final RecyclerView recyclerView2 = (RecyclerView) healthSleepRhythmReportView.findViewById(eri.Fc);
        final TextView textView3 = (TextView) healthSleepRhythmReportView.findViewById(eri.Ec);
        final RecyclerView recyclerView3 = (RecyclerView) healthSleepRhythmReportView.findViewById(eri.Bc);
        final LinearLayout linearLayout = (LinearLayout) healthSleepRhythmReportView.findViewById(eri.G6);
        final LinearLayout linearLayout2 = (LinearLayout) healthSleepRhythmReportView.findViewById(eri.c6);
        SleepRhythmChatListAdapter sleepRhythmChatListAdapter = new SleepRhythmChatListAdapter(new ArrayList());
        final SleepRhythmSleepItemAdapter sleepRhythmSleepItemAdapter = new SleepRhythmSleepItemAdapter(new ArrayList());
        SleepRhythmDiaryListAdapter sleepRhythmDiaryListAdapter = new SleepRhythmDiaryListAdapter(new ArrayList());
        recyclerView2.setAdapter(sleepRhythmSleepItemAdapter);
        recyclerView.setAdapter(sleepRhythmChatListAdapter);
        recyclerView.addItemDecoration(new SleepDiaryUpdateFragment.SpaceItemDecoration());
        recyclerView3.setAdapter(sleepRhythmDiaryListAdapter);
        recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmPDFUploader.initPage.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Ref.BooleanRef booleanRef4 = booleanRef;
                booleanRef4.element = true;
                Ref.BooleanRef booleanRef5 = booleanRef2;
                if (booleanRef5.element) {
                    Ref.BooleanRef booleanRef6 = booleanRef3;
                    if (booleanRef6.element) {
                        booleanRef4.element = false;
                        booleanRef5.element = false;
                        booleanRef6.element = false;
                        recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        SleepRhythmPDFUploader sleepRhythmPDFUploader = SleepRhythmPDFUploader.INSTANCE;
                        PdfDocument pdfDocument = document;
                        int i = index;
                        BaseActivity baseActivity = context;
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
                        LinearLayout linearLayout3 = linearLayout;
                        Intrinsics.checkNotNull(linearLayout3);
                        LinearLayout linearLayout4 = linearLayout2;
                        Intrinsics.checkNotNull(linearLayout4);
                        sleepRhythmPDFUploader.drawPDF(pdfDocument, i, baseActivity, recyclerView4, recyclerView5, recyclerView6, textView4, textView5, textView6, linearLayout3, linearLayout4, sleepRhythmSleepItemAdapter, isFinish);
                    }
                }
            }
        });
        recyclerView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmPDFUploader.initPage.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Ref.BooleanRef booleanRef4 = booleanRef2;
                booleanRef4.element = true;
                Ref.BooleanRef booleanRef5 = booleanRef;
                if (booleanRef5.element) {
                    Ref.BooleanRef booleanRef6 = booleanRef3;
                    if (booleanRef6.element) {
                        booleanRef5.element = false;
                        booleanRef4.element = false;
                        booleanRef6.element = false;
                        recyclerView3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        SleepRhythmPDFUploader sleepRhythmPDFUploader = SleepRhythmPDFUploader.INSTANCE;
                        PdfDocument pdfDocument = document;
                        int i = index;
                        BaseActivity baseActivity = context;
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
                        LinearLayout linearLayout3 = linearLayout;
                        Intrinsics.checkNotNull(linearLayout3);
                        LinearLayout linearLayout4 = linearLayout2;
                        Intrinsics.checkNotNull(linearLayout4);
                        sleepRhythmPDFUploader.drawPDF(pdfDocument, i, baseActivity, recyclerView4, recyclerView5, recyclerView6, textView4, textView5, textView6, linearLayout3, linearLayout4, sleepRhythmSleepItemAdapter, isFinish);
                    }
                }
            }
        });
        recyclerView2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmPDFUploader.initPage.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                Ref.BooleanRef booleanRef4 = booleanRef3;
                booleanRef4.element = true;
                Ref.BooleanRef booleanRef5 = booleanRef;
                if (booleanRef5.element) {
                    Ref.BooleanRef booleanRef6 = booleanRef2;
                    if (booleanRef6.element) {
                        booleanRef5.element = false;
                        booleanRef6.element = false;
                        booleanRef4.element = false;
                        recyclerView2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        SleepRhythmPDFUploader sleepRhythmPDFUploader = SleepRhythmPDFUploader.INSTANCE;
                        PdfDocument pdfDocument = document;
                        int i = index;
                        BaseActivity baseActivity = context;
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
                        LinearLayout linearLayout3 = linearLayout;
                        Intrinsics.checkNotNull(linearLayout3);
                        LinearLayout linearLayout4 = linearLayout2;
                        Intrinsics.checkNotNull(linearLayout4);
                        sleepRhythmPDFUploader.drawPDF(pdfDocument, i, baseActivity, recyclerView4, recyclerView5, recyclerView6, textView4, textView5, textView6, linearLayout3, linearLayout4, sleepRhythmSleepItemAdapter, isFinish);
                    }
                }
            }
        });
        List<SleepRhythmChatListAdapter.SleepRhythmChartValue> sleepRhythmChatItem = project.getSleepRhythmChatItem();
        if (sleepRhythmChatItem == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) sleepRhythmChatItem)) == null) {
            arrayList = new ArrayList<>();
        }
        sleepRhythmChatListAdapter.updateDataList(arrayList, startTime, cycle);
        Map<Long, SleepDiaryReport> sleepDiaryInfoList = project.getSleepDiaryInfoList();
        if (sleepDiaryInfoList != null && !sleepDiaryInfoList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            for (SleepDiaryReport sleepDiaryReport : CollectionsKt___CollectionsKt.toMutableList((Collection) project.getSleepDiaryInfoList().values())) {
                List<Integer> fallAsleepAgainDuration = sleepDiaryReport.getFallAsleepAgainDuration();
                sleepDiaryReport.setAwakeCount(fallAsleepAgainDuration != null ? Integer.valueOf(fallAsleepAgainDuration.size()) : null);
                arrayList2.add(sleepDiaryReport);
            }
            sleepRhythmDiaryListAdapter.updateDataList(SleepRhythmHandle.INSTANCE.convertItemList(arrayList2));
        }
        Map<Long, List<SleepSegmentReport>> sleepReport = project.getSleepReport();
        if (sleepReport == null || sleepReport.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        Map<Long, List<SleepSegmentReport>> sleepReport2 = project.getSleepReport();
        Intrinsics.checkNotNull(sleepReport2);
        for (Map.Entry<Long, List<SleepSegmentReport>> entry : sleepReport2.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            for (SleepSegmentReport sleepSegmentReport : entry.getValue()) {
                if (sleepSegmentReport.hasStageData()) {
                    arrayList3.add(new SleepRhythmSleepItemAdapter.SleepSegmentReportItem(jLongValue, sleepSegmentReport));
                }
            }
        }
        if (arrayList3.size() > 1) {
            CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList3, new Comparator() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmPDFUploader$initPage$$inlined$sortBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((SleepRhythmSleepItemAdapter.SleepSegmentReportItem) t).getTime()), Long.valueOf(((SleepRhythmSleepItemAdapter.SleepSegmentReportItem) t2).getTime()));
                }
            });
        }
        sleepRhythmSleepItemAdapter.updateDataList(arrayList3, startTime, cycle, false);
    }

    private final void savePDFFile(PdfDocument document, Function1<? super String, Unit> isFinish, long startTime) {
        AnyExtKt.io$default(null, new C25181(startTime, document, isFinish, null), 1, null);
    }

    public final void downLoadPDF(long startTime, int cycle, @NotNull LinearLayout pdfView, @NotNull LinearLayout healthSleepRhythmReportView1, @NotNull LinearLayout healthSleepRhythmReportView2, @NotNull LinearLayout healthSleepRhythmReportView3, @NotNull LinearLayout healthSleepRhythmReportView4, @NotNull BaseActivity context, @Nullable SleepProjectReport project, @NotNull List<SleepRhythmChatListAdapter.SleepRhythmChartValue> sleepRhythmDataList, @NotNull Function1<? super String, Unit> isFinish) {
        Intrinsics.checkNotNullParameter(pdfView, "pdfView");
        Intrinsics.checkNotNullParameter(healthSleepRhythmReportView1, "healthSleepRhythmReportView1");
        Intrinsics.checkNotNullParameter(healthSleepRhythmReportView2, "healthSleepRhythmReportView2");
        Intrinsics.checkNotNullParameter(healthSleepRhythmReportView3, "healthSleepRhythmReportView3");
        Intrinsics.checkNotNullParameter(healthSleepRhythmReportView4, "healthSleepRhythmReportView4");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sleepRhythmDataList, "sleepRhythmDataList");
        Intrinsics.checkNotNullParameter(isFinish, "isFinish");
        if (project == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!sleepRhythmDataList.isEmpty()) {
            Iterator it = CollectionsKt___CollectionsKt.chunked(sleepRhythmDataList, 7).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                List<SleepRhythmChatListAdapter.SleepRhythmChartValue> list = (List) next;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (SleepRhythmChatListAdapter.SleepRhythmChartValue sleepRhythmChartValue : list) {
                    Map<Long, SleepDiaryReport> sleepDiaryInfoList = project.getSleepDiaryInfoList();
                    if ((sleepDiaryInfoList != null ? sleepDiaryInfoList.get(Long.valueOf(sleepRhythmChartValue.getTime())) : null) != null) {
                        Long lValueOf = Long.valueOf(sleepRhythmChartValue.getTime());
                        Map<Long, SleepDiaryReport> sleepDiaryInfoList2 = project.getSleepDiaryInfoList();
                        Intrinsics.checkNotNull(sleepDiaryInfoList2);
                        SleepDiaryReport sleepDiaryReport = sleepDiaryInfoList2.get(Long.valueOf(sleepRhythmChartValue.getTime()));
                        Intrinsics.checkNotNull(sleepDiaryReport);
                        linkedHashMap.put(lValueOf, sleepDiaryReport);
                    }
                    Map<Long, List<SleepSegmentReport>> sleepReport = project.getSleepReport();
                    if ((sleepReport != null ? sleepReport.get(Long.valueOf(sleepRhythmChartValue.getTime())) : null) != null) {
                        Long lValueOf2 = Long.valueOf(sleepRhythmChartValue.getTime());
                        Map<Long, List<SleepSegmentReport>> sleepReport2 = project.getSleepReport();
                        Intrinsics.checkNotNull(sleepReport2);
                        List<SleepSegmentReport> list2 = sleepReport2.get(Long.valueOf(sleepRhythmChartValue.getTime()));
                        Intrinsics.checkNotNull(list2);
                        linkedHashMap2.put(lValueOf2, list2);
                    }
                    it = it;
                }
                arrayList.add(new SleepRhythmListItem(linkedHashMap, linkedHashMap2, list));
                it = it;
                i = i2;
            }
        }
        createDownLoadView(pdfView, healthSleepRhythmReportView1, healthSleepRhythmReportView2, healthSleepRhythmReportView3, healthSleepRhythmReportView4, context, arrayList, isFinish, startTime, cycle);
    }

    public final void uploadPdf(@NotNull String pdfFilePath, @NotNull ResearchPresignedUrlResponse uploadUrl, @NotNull final Function1<? super Boolean, Unit> callResult) {
        Intrinsics.checkNotNullParameter(pdfFilePath, "pdfFilePath");
        Intrinsics.checkNotNullParameter(uploadUrl, "uploadUrl");
        Intrinsics.checkNotNullParameter(callResult, "callResult");
        new OkHttpClient().newCall(new Request.Builder().url(uploadUrl.getUrl()).method(uploadUrl.getMethod(), RequestBody.Companion.create$default(RequestBody.INSTANCE, new File(pdfFilePath), (MediaType) null, 1, (Object) null)).build()).enqueue(new Callback() { // from class: com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmPDFUploader.uploadPdf.1
            @Override // okhttp3.Callback
            public void onFailure(Call call, IOException e) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(e, "e");
            }

            @Override // okhttp3.Callback
            public void onResponse(Call call, Response response) {
                Intrinsics.checkNotNullParameter(call, "call");
                Intrinsics.checkNotNullParameter(response, "response");
                response.request().url().getUrl();
                callResult.invoke2(Boolean.valueOf(response.isSuccessful()));
            }
        });
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u001d\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003JQ\u0010\u0015\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR%\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmPDFUploader$SleepRhythmListItem;", "", "sleepDiaryInfoList", "", "", "Lcom/xiaomi/fit/fitness/export/data/project/SleepDiaryReport;", "sleepReport", "", "Lcom/xiaomi/fit/fitness/export/data/item/SleepSegmentReport;", "sleepRhythmChatItem", "Lcom/xiaomi/fitness/health/sleep/rhythm/rhythm/SleepRhythmChatListAdapter$SleepRhythmChartValue;", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "getSleepDiaryInfoList", "()Ljava/util/Map;", "getSleepReport", "getSleepRhythmChatItem", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SleepRhythmListItem {

        @Nullable
        private final Map<Long, SleepDiaryReport> sleepDiaryInfoList;

        @Nullable
        private final Map<Long, List<SleepSegmentReport>> sleepReport;

        @Nullable
        private final List<SleepRhythmChatListAdapter.SleepRhythmChartValue> sleepRhythmChatItem;

        /* JADX WARN: Multi-variable type inference failed */
        public SleepRhythmListItem(@Nullable Map<Long, SleepDiaryReport> map, @Nullable Map<Long, ? extends List<SleepSegmentReport>> map2, @Nullable List<SleepRhythmChatListAdapter.SleepRhythmChartValue> list) {
            this.sleepDiaryInfoList = map;
            this.sleepReport = map2;
            this.sleepRhythmChatItem = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SleepRhythmListItem copy$default(SleepRhythmListItem sleepRhythmListItem, Map map, Map map2, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                map = sleepRhythmListItem.sleepDiaryInfoList;
            }
            if ((i & 2) != 0) {
                map2 = sleepRhythmListItem.sleepReport;
            }
            if ((i & 4) != 0) {
                list = sleepRhythmListItem.sleepRhythmChatItem;
            }
            return sleepRhythmListItem.copy(map, map2, list);
        }

        @Nullable
        public final Map<Long, SleepDiaryReport> component1() {
            return this.sleepDiaryInfoList;
        }

        @Nullable
        public final Map<Long, List<SleepSegmentReport>> component2() {
            return this.sleepReport;
        }

        @Nullable
        public final List<SleepRhythmChatListAdapter.SleepRhythmChartValue> component3() {
            return this.sleepRhythmChatItem;
        }

        @NotNull
        public final SleepRhythmListItem copy(@Nullable Map<Long, SleepDiaryReport> sleepDiaryInfoList, @Nullable Map<Long, ? extends List<SleepSegmentReport>> sleepReport, @Nullable List<SleepRhythmChatListAdapter.SleepRhythmChartValue> sleepRhythmChatItem) {
            return new SleepRhythmListItem(sleepDiaryInfoList, sleepReport, sleepRhythmChatItem);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SleepRhythmListItem)) {
                return false;
            }
            SleepRhythmListItem sleepRhythmListItem = (SleepRhythmListItem) other;
            return Intrinsics.areEqual(this.sleepDiaryInfoList, sleepRhythmListItem.sleepDiaryInfoList) && Intrinsics.areEqual(this.sleepReport, sleepRhythmListItem.sleepReport) && Intrinsics.areEqual(this.sleepRhythmChatItem, sleepRhythmListItem.sleepRhythmChatItem);
        }

        @Nullable
        public final Map<Long, SleepDiaryReport> getSleepDiaryInfoList() {
            return this.sleepDiaryInfoList;
        }

        @Nullable
        public final Map<Long, List<SleepSegmentReport>> getSleepReport() {
            return this.sleepReport;
        }

        @Nullable
        public final List<SleepRhythmChatListAdapter.SleepRhythmChartValue> getSleepRhythmChatItem() {
            return this.sleepRhythmChatItem;
        }

        public int hashCode() {
            Map<Long, SleepDiaryReport> map = this.sleepDiaryInfoList;
            int iHashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<Long, List<SleepSegmentReport>> map2 = this.sleepReport;
            int iHashCode2 = (iHashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
            List<SleepRhythmChatListAdapter.SleepRhythmChartValue> list = this.sleepRhythmChatItem;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "SleepRhythmListItem(sleepDiaryInfoList=" + this.sleepDiaryInfoList + ", sleepReport=" + this.sleepReport + ", sleepRhythmChatItem=" + this.sleepRhythmChatItem + ")";
        }

        public /* synthetic */ SleepRhythmListItem(Map map, Map map2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2, list);
        }
    }
}
