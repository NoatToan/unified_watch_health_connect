package com.mi.health.rainbow;

import android.R;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.widget.RemoteViews;
import com.mi.health.HealthBaseAppWidgetProvider;
import com.mi.health.qrcode.QRCodeExportKt;
import com.mi.health.utils.UiUtils;
import com.xiaomi.fit.data.common.data.aireco.AirEcoIntentionConstants;
import com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyMHStrengthReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStandReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.GoalItem;
import com.xiaomi.fit.fitness.export.data.aggregation.record.CalorieRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.MHStrengthRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StandRecord;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportSummary;
import defpackage.cli;
import defpackage.ezi;
import defpackage.ni4;
import defpackage.pqi;
import defpackage.rmi;
import defpackage.tti;
import defpackage.ymi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u001a\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J$\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J&\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017J0\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ8\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u001e\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160!0 H\u0002J(\u0010\"\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0002J0\u0010%\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bJ&\u0010&\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017Jt\u0010'\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010*\u001a\u00020\u001a2\b\b\u0002\u0010+\u001a\u00020\u001a2\b\b\u0002\u0010,\u001a\u00020\u001a2\b\b\u0002\u0010-\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u00100J.\u00101\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001eH\u0082@¢\u0006\u0002\u00102J8\u00103\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u001e\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160!0 H\u0002J\b\u00104\u001a\u00020\u0016H\u0002J\b\u00105\u001a\u00020\u0016H\u0002J\b\u00106\u001a\u00020\u0016H\u0002J\b\u00107\u001a\u00020\u0016H\u0014J\u0010\u00108\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u0016H\u0002J\b\u0010:\u001a\u00020\u0016H\u0002J\"\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<2\b\u0010>\u001a\u0004\u0018\u00010?2\b\b\u0002\u0010@\u001a\u00020\u0016H\u0002J(\u0010A\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/mi/health/rainbow/WidgetRainbowProvider_2_2;", "Lcom/mi/health/HealthBaseAppWidgetProvider;", "<init>", "()V", "TAG", "", "onRecentDataChanged", "", "ctx", "Landroid/content/Context;", "onReceive", "context", "intent", "Landroid/content/Intent;", "onUpdate", "wMgr", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "onWidgetUpdate", "doUpdateWidgetOs3", "appWidgetId", "", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showEmptyDataOs3", "grant", "", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateWidgetValueOs3", "remoteViews", "Landroid/widget/RemoteViews;", "goalProgressMap", "", "Lkotlin/Pair;", "setEmptyStringOs3", "textId", "unitStringId", "showEmptyData", "doUpdateWidget", "createRainbowBarChartBitmaps", "rainbowReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;", "alwaysEmptyBitmap", "showEmptyDirectly", "drawZeroAsCircle", "bitmapWidth", "bitmapHeight", "ceilToNearest", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyGoalReport;Landroid/appwidget/AppWidgetManager;IZZZIIILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doFinalUpdate", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/widget/RemoteViews;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateWidgetValue", "getWidgetLayout", "getRainbowIconWidthId", "getRainbowIconHeightId", "getSizeType", "getItemIcon", "itemType", "getMainIcon", "convertReportToDataValues", "", "", "report", "", "totalSegments", "setEmptyString", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWidgetRainbowProvider_2_2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetRainbowProvider_2_2.kt\ncom/mi/health/rainbow/WidgetRainbowProvider_2_2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,974:1\n329#2:975\n1#3:976\n1863#4,2:977\n1863#4,2:979\n1863#4,2:981\n1863#4,2:983\n*S KotlinDebug\n*F\n+ 1 WidgetRainbowProvider_2_2.kt\ncom/mi/health/rainbow/WidgetRainbowProvider_2_2\n*L\n695#1:975\n901#1:977,2\n908#1:979,2\n915#1:981,2\n922#1:983,2\n*E\n"})
public class WidgetRainbowProvider_2_2 extends HealthBaseAppWidgetProvider {

    @NotNull
    private String TAG = RainbowConstants.TAG;

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$createRainbowBarChartBitmaps$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_RAINBOW_2_2, f = "WidgetRainbowProvider_2_2.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {502, 512, SportSummary.VERSION_205, 544, QRCodeExportKt.REQUEST_QR_SCAN}, m = "createRainbowBarChartBitmaps", n = {"this", "context", "remoteViews", "rainbowReport", "wMgr", "appWidgetId", "alwaysEmptyBitmap", "drawZeroAsCircle", "this", "context", "remoteViews", "rainbowReport", "wMgr", "appWidgetId", "alwaysEmptyBitmap", "drawZeroAsCircle", "this", "context", "remoteViews", "wMgr", "resultFlow", "isStand", "appWidgetId", "alwaysEmptyBitmap", "drawZeroAsCircle"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "Z$0", "Z$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetRainbowProvider_2_2.this.createRainbowBarChartBitmaps(null, null, null, null, 0, false, false, false, 0, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$createRainbowBarChartBitmaps$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.rainbow.WidgetRainbowProvider_2_2$createRainbowBarChartBitmaps$2", f = "WidgetRainbowProvider_2_2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nWidgetRainbowProvider_2_2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WidgetRainbowProvider_2_2.kt\ncom/mi/health/rainbow/WidgetRainbowProvider_2_2$createRainbowBarChartBitmaps$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,974:1\n1#2:975\n*E\n"})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.BooleanRef $isStand;
        final /* synthetic */ DailyGoalReport $rainbowReport;
        final /* synthetic */ Ref.ObjectRef<StateFlow<Map<HomeDataType, Object>>> $resultFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.ObjectRef<StateFlow<Map<HomeDataType, Object>>> objectRef, DailyGoalReport dailyGoalReport, Ref.BooleanRef booleanRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$resultFlow = objectRef;
            this.$rainbowReport = dailyGoalReport;
            this.$isStand = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$resultFlow, this.$rainbowReport, this.$isStand, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            T homeDataFlowWithTag;
            List<GoalItem> listGoalList;
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            IHomeDataRepository homeDataRepository = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getHomeDataRepository();
            Ref.ObjectRef<StateFlow<Map<HomeDataType, Object>>> objectRef = this.$resultFlow;
            DailyGoalReport dailyGoalReport = this.$rainbowReport;
            Object obj2 = null;
            if (dailyGoalReport != null && (listGoalList = dailyGoalReport.goalList()) != null) {
                for (Object obj3 : listGoalList) {
                    if (((GoalItem) obj3).getType() == 3) {
                        obj2 = obj3;
                        break;
                    }
                }
                obj2 = (GoalItem) obj2;
            }
            if (obj2 != null) {
                this.$isStand.element = true;
                homeDataFlowWithTag = homeDataRepository.getHomeDataFlowWithTag(CollectionsKt__CollectionsKt.listOf((Object[]) new HomeDataType[]{HomeDataType.CALORIE, HomeDataType.STEP, HomeDataType.VALID_STAND}), "days");
            } else {
                homeDataFlowWithTag = homeDataRepository.getHomeDataFlowWithTag(CollectionsKt__CollectionsKt.listOf((Object[]) new HomeDataType[]{HomeDataType.CALORIE, HomeDataType.STEP, HomeDataType.MH_STRENGTH}), "days");
            }
            objectRef.element = homeDataFlowWithTag;
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3<T> implements FlowCollector {
        final /* synthetic */ boolean $alwaysEmptyBitmap;
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ Context $context;
        final /* synthetic */ boolean $drawZeroAsCircle;
        final /* synthetic */ Ref.BooleanRef $isStand;
        final /* synthetic */ RemoteViews $remoteViews;
        final /* synthetic */ AppWidgetManager $wMgr;

        public AnonymousClass3(Context context, AppWidgetManager appWidgetManager, int i, RemoteViews remoteViews, boolean z, boolean z2, Ref.BooleanRef booleanRef) {
            this.$context = context;
            this.$wMgr = appWidgetManager;
            this.$appWidgetId = i;
            this.$remoteViews = remoteViews;
            this.$drawZeroAsCircle = z;
            this.$alwaysEmptyBitmap = z2;
            this.$isStand = booleanRef;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return emit((Map<HomeDataType, ? extends Object>) obj, (Continuation<? super Unit>) continuation);
        }

        /* JADX WARN: Code duplicated, block: B:105:0x047e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:46:0x01d1  */
        /* JADX WARN: Code duplicated, block: B:48:0x01dd  */
        /* JADX WARN: Code duplicated, block: B:50:0x022b A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:51:0x022c  */
        /* JADX WARN: Code duplicated, block: B:54:0x023c  */
        /* JADX WARN: Code duplicated, block: B:55:0x023f  */
        /* JADX WARN: Code duplicated, block: B:57:0x024b  */
        /* JADX WARN: Code duplicated, block: B:59:0x0296 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:60:0x0297  */
        /* JADX WARN: Code duplicated, block: B:62:0x02a4  */
        /* JADX WARN: Code duplicated, block: B:65:0x02ae  */
        /* JADX WARN: Code duplicated, block: B:67:0x02ba  */
        /* JADX WARN: Code duplicated, block: B:69:0x0307 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:70:0x0308  */
        /* JADX WARN: Code duplicated, block: B:73:0x0318  */
        /* JADX WARN: Code duplicated, block: B:74:0x031c  */
        /* JADX WARN: Code duplicated, block: B:76:0x032a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0019  */
        /* JADX WARN: Code duplicated, block: B:86:0x0396  */
        /* JADX WARN: Code duplicated, block: B:88:0x03a2  */
        /* JADX WARN: Code duplicated, block: B:90:0x03ea A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:92:0x03f6  */
        /* JADX WARN: Code duplicated, block: B:93:0x03fa  */
        /* JADX WARN: Code duplicated, block: B:95:0x0409  */
        public final Object emit(Map<HomeDataType, ? extends Object> map, Continuation<? super Unit> continuation) {
            WidgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1 widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1;
            Object obj;
            AnonymousClass3<T> anonymousClass3;
            Object obj2;
            RemoteViews remoteViews;
            Object obj3;
            RemoteViews remoteViews2;
            AnonymousClass3<T> anonymousClass4;
            Object obj4;
            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2;
            boolean z;
            Context context;
            boolean z2;
            RemoteViews remoteViews3;
            Object objCreateBarChartBitmap;
            Map<HomeDataType, ? extends Object> map2;
            AnonymousClass3<T> anonymousClass5;
            RemoteViews remoteViews4;
            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_3;
            Context context2;
            boolean z3;
            RemoteViews remoteViews5;
            Object objCreateBarChartBitmap2;
            RemoteViews remoteViews6;
            Object obj5;
            boolean z4;
            Object objCreateBarChartBitmap3;
            Map<HomeDataType, ? extends Object> map3;
            AnonymousClass3<T> anonymousClass6;
            RemoteViews remoteViews7;
            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_4;
            Context context3;
            boolean z5;
            RemoteViews remoteViews8;
            AnonymousClass3<T> anonymousClass7;
            Object objCreateBarChartBitmap4;
            RemoteViews remoteViews9;
            Object obj6;
            AnonymousClass3<T> anonymousClass8;
            boolean z6;
            Object objCreateBarChartBitmap5;
            AnonymousClass3<T> anonymousClass9;
            RemoteViews remoteViews10;
            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_5;
            Context context4;
            boolean z7;
            RemoteViews remoteViews11;
            RemoteViews remoteViews12;
            AnonymousClass3<T> anonymousClass10;
            Object objCreateBarChartBitmap6;
            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_6;
            Context context5;
            AppWidgetManager appWidgetManager;
            int i;
            RemoteViews remoteViews13;
            Map<HomeDataType, ? extends Object> map4 = map;
            if (continuation instanceof WidgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) {
                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1 = (WidgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) continuation;
                int i2 = widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = i2 - Integer.MIN_VALUE;
                } else {
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1 = new WidgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1(this, continuation);
                }
            } else {
                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1 = new WidgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1(this, continuation);
            }
            Object obj7 = widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.result;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label) {
                case 0:
                    ResultKt.throwOnFailure(obj7);
                    if (map.isEmpty()) {
                        return Unit.INSTANCE;
                    }
                    Object obj8 = map4.get(HomeDataType.CALORIE);
                    if (obj8 == null) {
                        obj = coroutine_suspended;
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_7 = WidgetRainbowProvider_2_2.this;
                        boolean z8 = this.$alwaysEmptyBitmap;
                        Context context6 = this.$context;
                        boolean z9 = this.$drawZeroAsCircle;
                        RemoteViews remoteViews14 = this.$remoteViews;
                        if (z8) {
                            List listConvertReportToDataValues = widgetRainbowProvider_2_7.convertReportToDataValues(null, 48);
                            UiUtils uiUtils = UiUtils.INSTANCE;
                            int dp = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp2 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color = Color.parseColor("#FF612E");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = this;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews14;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 2;
                            Object objCreateBarChartBitmap7 = uiUtils.createBarChartBitmap(context6, listConvertReportToDataValues, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp2, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 20, (4816 & 2048) != 0 ? false : z9, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap7 == obj) {
                                return obj;
                            }
                            anonymousClass3 = this;
                            obj2 = objCreateBarChartBitmap7;
                            remoteViews = remoteViews14;
                            remoteViews.setImageViewBitmap(pqi.c, (Bitmap) obj2);
                        }
                        anonymousClass4 = anonymousClass3;
                        obj4 = map4.get(HomeDataType.STEP);
                        if (obj4 != null) {
                            widgetRainbowProvider_2_3 = WidgetRainbowProvider_2_2.this;
                            context2 = anonymousClass4.$context;
                            z3 = anonymousClass4.$drawZeroAsCircle;
                            remoteViews5 = anonymousClass4.$remoteViews;
                            if (obj4 instanceof DailyStepReport) {
                                List listConvertReportToDataValues$default = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_3, obj4, 0, 2, null);
                                UiUtils uiUtils2 = UiUtils.INSTANCE;
                                int dp3 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                                int dp4 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                                int color2 = Color.parseColor("#FFB21D");
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews5;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 3;
                                objCreateBarChartBitmap2 = uiUtils2.createBarChartBitmap(context2, listConvertReportToDataValues$default, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp3, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp4, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color2, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 100, (4816 & 2048) != 0 ? false : z3, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                                if (objCreateBarChartBitmap2 == obj) {
                                    return obj;
                                }
                                map2 = map4;
                                remoteViews6 = remoteViews5;
                                anonymousClass5 = anonymousClass4;
                                remoteViews6.setImageViewBitmap(pqi.o, (Bitmap) objCreateBarChartBitmap2);
                                map4 = map2;
                                anonymousClass4 = anonymousClass5;
                            }
                        } else {
                            widgetRainbowProvider_2_2 = WidgetRainbowProvider_2_2.this;
                            z = anonymousClass4.$alwaysEmptyBitmap;
                            context = anonymousClass4.$context;
                            z2 = anonymousClass4.$drawZeroAsCircle;
                            remoteViews3 = anonymousClass4.$remoteViews;
                            if (z) {
                                List listConvertReportToDataValues2 = widgetRainbowProvider_2_2.convertReportToDataValues(null, 48);
                                UiUtils uiUtils3 = UiUtils.INSTANCE;
                                int dp5 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                                int dp6 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                                int color3 = Color.parseColor("#FF612E");
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews3;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 4;
                                objCreateBarChartBitmap = uiUtils3.createBarChartBitmap(context, listConvertReportToDataValues2, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp5, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp6, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color3, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 20, (4816 & 2048) != 0 ? false : z2, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                                if (objCreateBarChartBitmap == obj) {
                                    return obj;
                                }
                                map2 = map4;
                                anonymousClass5 = anonymousClass4;
                                remoteViews4 = remoteViews3;
                                remoteViews4.setImageViewBitmap(pqi.c, (Bitmap) objCreateBarChartBitmap);
                                map4 = map2;
                                anonymousClass4 = anonymousClass5;
                            }
                        }
                        obj5 = map4.get(HomeDataType.MH_STRENGTH);
                        if (obj5 != null) {
                            widgetRainbowProvider_2_4 = WidgetRainbowProvider_2_2.this;
                            context3 = anonymousClass4.$context;
                            z5 = anonymousClass4.$drawZeroAsCircle;
                            remoteViews8 = anonymousClass4.$remoteViews;
                            if (obj5 instanceof DailyMHStrengthReport) {
                                List listConvertReportToDataValues$default2 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_4, obj5, 0, 2, null);
                                UiUtils uiUtils4 = UiUtils.INSTANCE;
                                int dp7 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                                int dp8 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                                int color4 = Color.parseColor("#33A9FF");
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews8;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 5;
                                anonymousClass7 = anonymousClass4;
                                objCreateBarChartBitmap4 = uiUtils4.createBarChartBitmap(context3, listConvertReportToDataValues$default2, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp7, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp8, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color4, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 10, (4816 & 2048) != 0 ? false : z5, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                                if (objCreateBarChartBitmap4 == obj) {
                                    return obj;
                                }
                                map3 = map4;
                                remoteViews9 = remoteViews8;
                                anonymousClass6 = anonymousClass7;
                                remoteViews9.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap4);
                                map4 = map3;
                                anonymousClass4 = anonymousClass6;
                            }
                        } else {
                            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_8 = WidgetRainbowProvider_2_2.this;
                            z4 = anonymousClass4.$alwaysEmptyBitmap;
                            Ref.BooleanRef booleanRef = anonymousClass4.$isStand;
                            Context context7 = anonymousClass4.$context;
                            boolean z10 = anonymousClass4.$drawZeroAsCircle;
                            RemoteViews remoteViews15 = anonymousClass4.$remoteViews;
                            if (z4) {
                            }
                            anonymousClass4 = anonymousClass4;
                        }
                        obj6 = map4.get(HomeDataType.VALID_STAND);
                        if (obj6 != null) {
                            widgetRainbowProvider_2_5 = WidgetRainbowProvider_2_2.this;
                            context4 = anonymousClass4.$context;
                            z7 = anonymousClass4.$drawZeroAsCircle;
                            remoteViews11 = anonymousClass4.$remoteViews;
                            if (obj6 instanceof DailyStandReport) {
                                List listConvertReportToDataValues3 = widgetRainbowProvider_2_5.convertReportToDataValues(obj6, 24);
                                UiUtils uiUtils5 = UiUtils.INSTANCE;
                                int dp9 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                                int dp10 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                                int color5 = Color.parseColor("#36D167");
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = remoteViews11;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 7;
                                remoteViews12 = remoteViews11;
                                anonymousClass10 = anonymousClass4;
                                objCreateBarChartBitmap6 = uiUtils5.createBarChartBitmap(context4, listConvertReportToDataValues3, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp9, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp10, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color5, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.25f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 1, (4816 & 2048) != 0 ? false : z7, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                                if (objCreateBarChartBitmap6 == obj) {
                                    return obj;
                                }
                                remoteViews12.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap6);
                                anonymousClass4 = anonymousClass10;
                            }
                        } else {
                            anonymousClass8 = anonymousClass4;
                            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_9 = WidgetRainbowProvider_2_2.this;
                            z6 = anonymousClass8.$alwaysEmptyBitmap;
                            Ref.BooleanRef booleanRef2 = anonymousClass8.$isStand;
                            Context context8 = anonymousClass8.$context;
                            boolean z11 = anonymousClass8.$drawZeroAsCircle;
                            RemoteViews remoteViews16 = anonymousClass8.$remoteViews;
                            if (z6) {
                            }
                            anonymousClass4 = anonymousClass8;
                        }
                        widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                        context5 = anonymousClass4.$context;
                        appWidgetManager = anonymousClass4.$wMgr;
                        i = anonymousClass4.$appWidgetId;
                        remoteViews13 = anonymousClass4.$remoteViews;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                        if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                            return obj;
                        }
                        return Unit.INSTANCE;
                    }
                    WidgetRainbowProvider_2_2 widgetRainbowProvider_2_10 = WidgetRainbowProvider_2_2.this;
                    Context context9 = this.$context;
                    boolean z12 = this.$drawZeroAsCircle;
                    RemoteViews remoteViews17 = this.$remoteViews;
                    if (obj8 instanceof DailyCalorieReport) {
                        List listConvertReportToDataValues$default3 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_10, obj8, 0, 2, null);
                        UiUtils uiUtils6 = UiUtils.INSTANCE;
                        int dp11 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                        int dp12 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                        int color6 = Color.parseColor("#FF612E");
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = this;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews17;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 1;
                        obj = coroutine_suspended;
                        Object objCreateBarChartBitmap8 = uiUtils6.createBarChartBitmap(context9, listConvertReportToDataValues$default3, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp11, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp12, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color6, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 20, (4816 & 2048) != 0 ? false : z12, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                        if (objCreateBarChartBitmap8 == obj) {
                            return obj;
                        }
                        anonymousClass3 = this;
                        obj3 = objCreateBarChartBitmap8;
                        remoteViews2 = remoteViews17;
                        remoteViews2.setImageViewBitmap(pqi.c, (Bitmap) obj3);
                        anonymousClass4 = anonymousClass3;
                        obj4 = map4.get(HomeDataType.STEP);
                        if (obj4 != null) {
                            widgetRainbowProvider_2_3 = WidgetRainbowProvider_2_2.this;
                            context2 = anonymousClass4.$context;
                            z3 = anonymousClass4.$drawZeroAsCircle;
                            remoteViews5 = anonymousClass4.$remoteViews;
                            if (obj4 instanceof DailyStepReport) {
                                List listConvertReportToDataValues$default4 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_3, obj4, 0, 2, null);
                                UiUtils uiUtils7 = UiUtils.INSTANCE;
                                int dp13 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                                int dp14 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                                int color7 = Color.parseColor("#FFB21D");
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews5;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 3;
                                objCreateBarChartBitmap2 = uiUtils7.createBarChartBitmap(context2, listConvertReportToDataValues$default4, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp13, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp14, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color7, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 100, (4816 & 2048) != 0 ? false : z3, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                                if (objCreateBarChartBitmap2 == obj) {
                                    return obj;
                                }
                                map2 = map4;
                                remoteViews6 = remoteViews5;
                                anonymousClass5 = anonymousClass4;
                                remoteViews6.setImageViewBitmap(pqi.o, (Bitmap) objCreateBarChartBitmap2);
                                map4 = map2;
                                anonymousClass4 = anonymousClass5;
                            }
                        } else {
                            widgetRainbowProvider_2_2 = WidgetRainbowProvider_2_2.this;
                            z = anonymousClass4.$alwaysEmptyBitmap;
                            context = anonymousClass4.$context;
                            z2 = anonymousClass4.$drawZeroAsCircle;
                            remoteViews3 = anonymousClass4.$remoteViews;
                            if (z) {
                                List listConvertReportToDataValues4 = widgetRainbowProvider_2_2.convertReportToDataValues(null, 48);
                                UiUtils uiUtils8 = UiUtils.INSTANCE;
                                int dp15 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                                int dp16 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                                int color8 = Color.parseColor("#FF612E");
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews3;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 4;
                                objCreateBarChartBitmap = uiUtils8.createBarChartBitmap(context, listConvertReportToDataValues4, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp15, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp16, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color8, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 20, (4816 & 2048) != 0 ? false : z2, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                                if (objCreateBarChartBitmap == obj) {
                                    return obj;
                                }
                                map2 = map4;
                                anonymousClass5 = anonymousClass4;
                                remoteViews4 = remoteViews3;
                                remoteViews4.setImageViewBitmap(pqi.c, (Bitmap) objCreateBarChartBitmap);
                                map4 = map2;
                                anonymousClass4 = anonymousClass5;
                            }
                        }
                        obj5 = map4.get(HomeDataType.MH_STRENGTH);
                        if (obj5 != null) {
                            widgetRainbowProvider_2_4 = WidgetRainbowProvider_2_2.this;
                            context3 = anonymousClass4.$context;
                            z5 = anonymousClass4.$drawZeroAsCircle;
                            remoteViews8 = anonymousClass4.$remoteViews;
                            if (obj5 instanceof DailyMHStrengthReport) {
                                List listConvertReportToDataValues$default5 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_4, obj5, 0, 2, null);
                                UiUtils uiUtils9 = UiUtils.INSTANCE;
                                int dp17 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                                int dp18 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                                int color9 = Color.parseColor("#33A9FF");
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews8;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 5;
                                anonymousClass7 = anonymousClass4;
                                objCreateBarChartBitmap4 = uiUtils9.createBarChartBitmap(context3, listConvertReportToDataValues$default5, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp17, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp18, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color9, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 10, (4816 & 2048) != 0 ? false : z5, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                                if (objCreateBarChartBitmap4 == obj) {
                                    return obj;
                                }
                                map3 = map4;
                                remoteViews9 = remoteViews8;
                                anonymousClass6 = anonymousClass7;
                                remoteViews9.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap4);
                                map4 = map3;
                                anonymousClass4 = anonymousClass6;
                            }
                        } else {
                            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_11 = WidgetRainbowProvider_2_2.this;
                            z4 = anonymousClass4.$alwaysEmptyBitmap;
                            Ref.BooleanRef booleanRef3 = anonymousClass4.$isStand;
                            Context context10 = anonymousClass4.$context;
                            boolean z13 = anonymousClass4.$drawZeroAsCircle;
                            RemoteViews remoteViews18 = anonymousClass4.$remoteViews;
                            if (z4 || booleanRef3.element) {
                                anonymousClass4 = anonymousClass4;
                            } else {
                                List listConvertReportToDataValues5 = widgetRainbowProvider_2_11.convertReportToDataValues(null, 48);
                                UiUtils uiUtils10 = UiUtils.INSTANCE;
                                int dp19 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                                int dp20 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                                int color10 = Color.parseColor("#FF612E");
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews18;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 6;
                                AnonymousClass3<T> anonymousClass11 = anonymousClass4;
                                objCreateBarChartBitmap3 = uiUtils10.createBarChartBitmap(context10, listConvertReportToDataValues5, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp19, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp20, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color10, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 20, (4816 & 2048) != 0 ? false : z13, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                                if (objCreateBarChartBitmap3 == obj) {
                                    return obj;
                                }
                                map3 = map4;
                                anonymousClass6 = anonymousClass11;
                                remoteViews7 = remoteViews18;
                                remoteViews7.setImageViewBitmap(pqi.c, (Bitmap) objCreateBarChartBitmap3);
                                map4 = map3;
                                anonymousClass4 = anonymousClass6;
                            }
                        }
                        obj6 = map4.get(HomeDataType.VALID_STAND);
                        if (obj6 != null) {
                            widgetRainbowProvider_2_5 = WidgetRainbowProvider_2_2.this;
                            context4 = anonymousClass4.$context;
                            z7 = anonymousClass4.$drawZeroAsCircle;
                            remoteViews11 = anonymousClass4.$remoteViews;
                            if (obj6 instanceof DailyStandReport) {
                                List listConvertReportToDataValues6 = widgetRainbowProvider_2_5.convertReportToDataValues(obj6, 24);
                                UiUtils uiUtils11 = UiUtils.INSTANCE;
                                int dp21 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                                int dp110 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                                int color11 = Color.parseColor("#36D167");
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = remoteViews11;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 7;
                                remoteViews12 = remoteViews11;
                                anonymousClass10 = anonymousClass4;
                                objCreateBarChartBitmap6 = uiUtils11.createBarChartBitmap(context4, listConvertReportToDataValues6, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp21, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp110, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color11, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.25f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 1, (4816 & 2048) != 0 ? false : z7, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                                if (objCreateBarChartBitmap6 == obj) {
                                    return obj;
                                }
                                remoteViews12.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap6);
                                anonymousClass4 = anonymousClass10;
                            }
                        } else {
                            anonymousClass8 = anonymousClass4;
                            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_12 = WidgetRainbowProvider_2_2.this;
                            z6 = anonymousClass8.$alwaysEmptyBitmap;
                            Ref.BooleanRef booleanRef4 = anonymousClass8.$isStand;
                            Context context11 = anonymousClass8.$context;
                            boolean z14 = anonymousClass8.$drawZeroAsCircle;
                            RemoteViews remoteViews19 = anonymousClass8.$remoteViews;
                            if (z6 || !booleanRef4.element) {
                                anonymousClass4 = anonymousClass8;
                            } else {
                                List listConvertReportToDataValues7 = widgetRainbowProvider_2_12.convertReportToDataValues(null, 24);
                                UiUtils uiUtils12 = UiUtils.INSTANCE;
                                int dp22 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                                int dp23 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                                int color12 = Color.parseColor("#FF612E");
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass8;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = remoteViews19;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                                widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 8;
                                objCreateBarChartBitmap5 = uiUtils12.createBarChartBitmap(context11, listConvertReportToDataValues7, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp22, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp23, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color12, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 20, (4816 & 2048) != 0 ? false : z14, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                                if (objCreateBarChartBitmap5 == obj) {
                                    return obj;
                                }
                                anonymousClass9 = anonymousClass8;
                                remoteViews10 = remoteViews19;
                                remoteViews10.setImageViewBitmap(pqi.c, (Bitmap) objCreateBarChartBitmap5);
                                anonymousClass4 = anonymousClass9;
                            }
                        }
                        widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                        context5 = anonymousClass4.$context;
                        appWidgetManager = anonymousClass4.$wMgr;
                        i = anonymousClass4.$appWidgetId;
                        remoteViews13 = anonymousClass4.$remoteViews;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                        widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                        if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                            return obj;
                        }
                        return Unit.INSTANCE;
                    }
                    obj = coroutine_suspended;
                    anonymousClass3 = this;
                    anonymousClass4 = anonymousClass3;
                    obj4 = map4.get(HomeDataType.STEP);
                    if (obj4 != null) {
                        widgetRainbowProvider_2_3 = WidgetRainbowProvider_2_2.this;
                        context2 = anonymousClass4.$context;
                        z3 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews5 = anonymousClass4.$remoteViews;
                        if (obj4 instanceof DailyStepReport) {
                            List listConvertReportToDataValues$default6 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_3, obj4, 0, 2, null);
                            UiUtils uiUtils13 = UiUtils.INSTANCE;
                            int dp111 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp112 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color13 = Color.parseColor("#FFB21D");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews5;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 3;
                            objCreateBarChartBitmap2 = uiUtils13.createBarChartBitmap(context2, listConvertReportToDataValues$default6, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp111, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp112, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color13, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 100, (4816 & 2048) != 0 ? false : z3, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap2 == obj) {
                                return obj;
                            }
                            map2 = map4;
                            remoteViews6 = remoteViews5;
                            anonymousClass5 = anonymousClass4;
                            remoteViews6.setImageViewBitmap(pqi.o, (Bitmap) objCreateBarChartBitmap2);
                            map4 = map2;
                            anonymousClass4 = anonymousClass5;
                        }
                    } else {
                        widgetRainbowProvider_2_2 = WidgetRainbowProvider_2_2.this;
                        z = anonymousClass4.$alwaysEmptyBitmap;
                        context = anonymousClass4.$context;
                        z2 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews3 = anonymousClass4.$remoteViews;
                        if (z) {
                            List listConvertReportToDataValues8 = widgetRainbowProvider_2_2.convertReportToDataValues(null, 48);
                            UiUtils uiUtils14 = UiUtils.INSTANCE;
                            int dp113 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp114 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color14 = Color.parseColor("#FF612E");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews3;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 4;
                            objCreateBarChartBitmap = uiUtils14.createBarChartBitmap(context, listConvertReportToDataValues8, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp113, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp114, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color14, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 20, (4816 & 2048) != 0 ? false : z2, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap == obj) {
                                return obj;
                            }
                            map2 = map4;
                            anonymousClass5 = anonymousClass4;
                            remoteViews4 = remoteViews3;
                            remoteViews4.setImageViewBitmap(pqi.c, (Bitmap) objCreateBarChartBitmap);
                            map4 = map2;
                            anonymousClass4 = anonymousClass5;
                        }
                    }
                    obj5 = map4.get(HomeDataType.MH_STRENGTH);
                    if (obj5 != null) {
                        widgetRainbowProvider_2_4 = WidgetRainbowProvider_2_2.this;
                        context3 = anonymousClass4.$context;
                        z5 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews8 = anonymousClass4.$remoteViews;
                        if (obj5 instanceof DailyMHStrengthReport) {
                            List listConvertReportToDataValues$default7 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_4, obj5, 0, 2, null);
                            UiUtils uiUtils15 = UiUtils.INSTANCE;
                            int dp115 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp116 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color15 = Color.parseColor("#33A9FF");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews8;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 5;
                            anonymousClass7 = anonymousClass4;
                            objCreateBarChartBitmap4 = uiUtils15.createBarChartBitmap(context3, listConvertReportToDataValues$default7, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp115, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp116, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color15, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 10, (4816 & 2048) != 0 ? false : z5, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap4 == obj) {
                                return obj;
                            }
                            map3 = map4;
                            remoteViews9 = remoteViews8;
                            anonymousClass6 = anonymousClass7;
                            remoteViews9.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap4);
                            map4 = map3;
                            anonymousClass4 = anonymousClass6;
                        }
                    } else {
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_13 = WidgetRainbowProvider_2_2.this;
                        z4 = anonymousClass4.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef5 = anonymousClass4.$isStand;
                        Context context12 = anonymousClass4.$context;
                        boolean z15 = anonymousClass4.$drawZeroAsCircle;
                        RemoteViews remoteViews110 = anonymousClass4.$remoteViews;
                        if (z4) {
                        }
                        anonymousClass4 = anonymousClass4;
                    }
                    obj6 = map4.get(HomeDataType.VALID_STAND);
                    if (obj6 != null) {
                        widgetRainbowProvider_2_5 = WidgetRainbowProvider_2_2.this;
                        context4 = anonymousClass4.$context;
                        z7 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews11 = anonymousClass4.$remoteViews;
                        if (obj6 instanceof DailyStandReport) {
                            List listConvertReportToDataValues9 = widgetRainbowProvider_2_5.convertReportToDataValues(obj6, 24);
                            UiUtils uiUtils16 = UiUtils.INSTANCE;
                            int dp24 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp117 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color16 = Color.parseColor("#36D167");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = remoteViews11;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 7;
                            remoteViews12 = remoteViews11;
                            anonymousClass10 = anonymousClass4;
                            objCreateBarChartBitmap6 = uiUtils16.createBarChartBitmap(context4, listConvertReportToDataValues9, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp24, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp117, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color16, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.25f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 1, (4816 & 2048) != 0 ? false : z7, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap6 == obj) {
                                return obj;
                            }
                            remoteViews12.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap6);
                            anonymousClass4 = anonymousClass10;
                        }
                    } else {
                        anonymousClass8 = anonymousClass4;
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_14 = WidgetRainbowProvider_2_2.this;
                        z6 = anonymousClass8.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef6 = anonymousClass8.$isStand;
                        Context context13 = anonymousClass8.$context;
                        boolean z16 = anonymousClass8.$drawZeroAsCircle;
                        RemoteViews remoteViews111 = anonymousClass8.$remoteViews;
                        if (z6) {
                        }
                        anonymousClass4 = anonymousClass8;
                    }
                    widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                    context5 = anonymousClass4.$context;
                    appWidgetManager = anonymousClass4.$wMgr;
                    i = anonymousClass4.$appWidgetId;
                    remoteViews13 = anonymousClass4.$remoteViews;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                    if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                        return obj;
                    }
                    return Unit.INSTANCE;
                case 1:
                    RemoteViews remoteViews20 = (RemoteViews) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2;
                    Map<HomeDataType, ? extends Object> map5 = (Map) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1;
                    anonymousClass3 = (AnonymousClass3) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0;
                    ResultKt.throwOnFailure(obj7);
                    obj3 = obj7;
                    obj = coroutine_suspended;
                    remoteViews2 = remoteViews20;
                    map4 = map5;
                    remoteViews2.setImageViewBitmap(pqi.c, (Bitmap) obj3);
                    anonymousClass4 = anonymousClass3;
                    obj4 = map4.get(HomeDataType.STEP);
                    if (obj4 != null) {
                        widgetRainbowProvider_2_3 = WidgetRainbowProvider_2_2.this;
                        context2 = anonymousClass4.$context;
                        z3 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews5 = anonymousClass4.$remoteViews;
                        if (obj4 instanceof DailyStepReport) {
                            List listConvertReportToDataValues$default8 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_3, obj4, 0, 2, null);
                            UiUtils uiUtils17 = UiUtils.INSTANCE;
                            int dp118 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp119 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color17 = Color.parseColor("#FFB21D");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews5;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 3;
                            objCreateBarChartBitmap2 = uiUtils17.createBarChartBitmap(context2, listConvertReportToDataValues$default8, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp118, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp119, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color17, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 100, (4816 & 2048) != 0 ? false : z3, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap2 == obj) {
                                return obj;
                            }
                            map2 = map4;
                            remoteViews6 = remoteViews5;
                            anonymousClass5 = anonymousClass4;
                            remoteViews6.setImageViewBitmap(pqi.o, (Bitmap) objCreateBarChartBitmap2);
                            map4 = map2;
                            anonymousClass4 = anonymousClass5;
                        }
                    } else {
                        widgetRainbowProvider_2_2 = WidgetRainbowProvider_2_2.this;
                        z = anonymousClass4.$alwaysEmptyBitmap;
                        context = anonymousClass4.$context;
                        z2 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews3 = anonymousClass4.$remoteViews;
                        if (z) {
                            List listConvertReportToDataValues10 = widgetRainbowProvider_2_2.convertReportToDataValues(null, 48);
                            UiUtils uiUtils18 = UiUtils.INSTANCE;
                            int dp1110 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp1111 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color18 = Color.parseColor("#FF612E");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews3;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 4;
                            objCreateBarChartBitmap = uiUtils18.createBarChartBitmap(context, listConvertReportToDataValues10, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp1110, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp1111, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color18, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 20, (4816 & 2048) != 0 ? false : z2, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap == obj) {
                                return obj;
                            }
                            map2 = map4;
                            anonymousClass5 = anonymousClass4;
                            remoteViews4 = remoteViews3;
                            remoteViews4.setImageViewBitmap(pqi.c, (Bitmap) objCreateBarChartBitmap);
                            map4 = map2;
                            anonymousClass4 = anonymousClass5;
                        }
                    }
                    obj5 = map4.get(HomeDataType.MH_STRENGTH);
                    if (obj5 != null) {
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_15 = WidgetRainbowProvider_2_2.this;
                        z4 = anonymousClass4.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef7 = anonymousClass4.$isStand;
                        Context context14 = anonymousClass4.$context;
                        boolean z17 = anonymousClass4.$drawZeroAsCircle;
                        RemoteViews remoteViews112 = anonymousClass4.$remoteViews;
                        if (z4) {
                        }
                        anonymousClass4 = anonymousClass4;
                        break;
                    } else {
                        widgetRainbowProvider_2_4 = WidgetRainbowProvider_2_2.this;
                        context3 = anonymousClass4.$context;
                        z5 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews8 = anonymousClass4.$remoteViews;
                        if (obj5 instanceof DailyMHStrengthReport) {
                            List listConvertReportToDataValues$default9 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_4, obj5, 0, 2, null);
                            UiUtils uiUtils19 = UiUtils.INSTANCE;
                            int dp1112 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp1113 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color19 = Color.parseColor("#33A9FF");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews8;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 5;
                            anonymousClass7 = anonymousClass4;
                            objCreateBarChartBitmap4 = uiUtils19.createBarChartBitmap(context3, listConvertReportToDataValues$default9, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp1112, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp1113, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color19, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 10, (4816 & 2048) != 0 ? false : z5, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap4 == obj) {
                                return obj;
                            }
                            map3 = map4;
                            remoteViews9 = remoteViews8;
                            anonymousClass6 = anonymousClass7;
                            remoteViews9.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap4);
                            map4 = map3;
                            anonymousClass4 = anonymousClass6;
                        }
                    }
                    obj6 = map4.get(HomeDataType.VALID_STAND);
                    if (obj6 != null) {
                        anonymousClass8 = anonymousClass4;
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_16 = WidgetRainbowProvider_2_2.this;
                        z6 = anonymousClass8.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef8 = anonymousClass8.$isStand;
                        Context context15 = anonymousClass8.$context;
                        boolean z18 = anonymousClass8.$drawZeroAsCircle;
                        RemoteViews remoteViews113 = anonymousClass8.$remoteViews;
                        if (z6) {
                        }
                        anonymousClass4 = anonymousClass8;
                        break;
                    } else {
                        widgetRainbowProvider_2_5 = WidgetRainbowProvider_2_2.this;
                        context4 = anonymousClass4.$context;
                        z7 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews11 = anonymousClass4.$remoteViews;
                        if (obj6 instanceof DailyStandReport) {
                            List listConvertReportToDataValues11 = widgetRainbowProvider_2_5.convertReportToDataValues(obj6, 24);
                            UiUtils uiUtils110 = UiUtils.INSTANCE;
                            int dp25 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp1114 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color110 = Color.parseColor("#36D167");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = remoteViews11;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 7;
                            remoteViews12 = remoteViews11;
                            anonymousClass10 = anonymousClass4;
                            objCreateBarChartBitmap6 = uiUtils110.createBarChartBitmap(context4, listConvertReportToDataValues11, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp25, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp1114, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color110, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.25f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 1, (4816 & 2048) != 0 ? false : z7, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap6 == obj) {
                                return obj;
                            }
                            remoteViews12.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap6);
                            anonymousClass4 = anonymousClass10;
                        }
                    }
                    widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                    context5 = anonymousClass4.$context;
                    appWidgetManager = anonymousClass4.$wMgr;
                    i = anonymousClass4.$appWidgetId;
                    remoteViews13 = anonymousClass4.$remoteViews;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                    if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                        return obj;
                    }
                    return Unit.INSTANCE;
                case 2:
                    RemoteViews remoteViews21 = (RemoteViews) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2;
                    Map<HomeDataType, ? extends Object> map6 = (Map) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1;
                    anonymousClass3 = (AnonymousClass3) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0;
                    ResultKt.throwOnFailure(obj7);
                    obj2 = obj7;
                    obj = coroutine_suspended;
                    remoteViews = remoteViews21;
                    map4 = map6;
                    remoteViews.setImageViewBitmap(pqi.c, (Bitmap) obj2);
                    anonymousClass4 = anonymousClass3;
                    obj4 = map4.get(HomeDataType.STEP);
                    if (obj4 != null) {
                        widgetRainbowProvider_2_3 = WidgetRainbowProvider_2_2.this;
                        context2 = anonymousClass4.$context;
                        z3 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews5 = anonymousClass4.$remoteViews;
                        if (obj4 instanceof DailyStepReport) {
                            List listConvertReportToDataValues$default10 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_3, obj4, 0, 2, null);
                            UiUtils uiUtils111 = UiUtils.INSTANCE;
                            int dp1115 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp1116 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color111 = Color.parseColor("#FFB21D");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews5;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 3;
                            objCreateBarChartBitmap2 = uiUtils111.createBarChartBitmap(context2, listConvertReportToDataValues$default10, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp1115, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp1116, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color111, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 100, (4816 & 2048) != 0 ? false : z3, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap2 == obj) {
                                return obj;
                            }
                            map2 = map4;
                            remoteViews6 = remoteViews5;
                            anonymousClass5 = anonymousClass4;
                            remoteViews6.setImageViewBitmap(pqi.o, (Bitmap) objCreateBarChartBitmap2);
                            map4 = map2;
                            anonymousClass4 = anonymousClass5;
                        }
                    } else {
                        widgetRainbowProvider_2_2 = WidgetRainbowProvider_2_2.this;
                        z = anonymousClass4.$alwaysEmptyBitmap;
                        context = anonymousClass4.$context;
                        z2 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews3 = anonymousClass4.$remoteViews;
                        if (z) {
                            List listConvertReportToDataValues12 = widgetRainbowProvider_2_2.convertReportToDataValues(null, 48);
                            UiUtils uiUtils112 = UiUtils.INSTANCE;
                            int dp1117 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp1118 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color112 = Color.parseColor("#FF612E");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews3;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 4;
                            objCreateBarChartBitmap = uiUtils112.createBarChartBitmap(context, listConvertReportToDataValues12, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp1117, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp1118, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color112, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 20, (4816 & 2048) != 0 ? false : z2, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap == obj) {
                                return obj;
                            }
                            map2 = map4;
                            anonymousClass5 = anonymousClass4;
                            remoteViews4 = remoteViews3;
                            remoteViews4.setImageViewBitmap(pqi.c, (Bitmap) objCreateBarChartBitmap);
                            map4 = map2;
                            anonymousClass4 = anonymousClass5;
                        }
                    }
                    obj5 = map4.get(HomeDataType.MH_STRENGTH);
                    if (obj5 != null) {
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_17 = WidgetRainbowProvider_2_2.this;
                        z4 = anonymousClass4.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef9 = anonymousClass4.$isStand;
                        Context context16 = anonymousClass4.$context;
                        boolean z19 = anonymousClass4.$drawZeroAsCircle;
                        RemoteViews remoteViews114 = anonymousClass4.$remoteViews;
                        if (z4) {
                        }
                        anonymousClass4 = anonymousClass4;
                        break;
                    } else {
                        widgetRainbowProvider_2_4 = WidgetRainbowProvider_2_2.this;
                        context3 = anonymousClass4.$context;
                        z5 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews8 = anonymousClass4.$remoteViews;
                        if (obj5 instanceof DailyMHStrengthReport) {
                            List listConvertReportToDataValues$default11 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_4, obj5, 0, 2, null);
                            UiUtils uiUtils113 = UiUtils.INSTANCE;
                            int dp1119 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp11110 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color113 = Color.parseColor("#33A9FF");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews8;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 5;
                            anonymousClass7 = anonymousClass4;
                            objCreateBarChartBitmap4 = uiUtils113.createBarChartBitmap(context3, listConvertReportToDataValues$default11, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp1119, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp11110, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color113, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 10, (4816 & 2048) != 0 ? false : z5, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap4 == obj) {
                                return obj;
                            }
                            map3 = map4;
                            remoteViews9 = remoteViews8;
                            anonymousClass6 = anonymousClass7;
                            remoteViews9.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap4);
                            map4 = map3;
                            anonymousClass4 = anonymousClass6;
                        }
                    }
                    obj6 = map4.get(HomeDataType.VALID_STAND);
                    if (obj6 != null) {
                        anonymousClass8 = anonymousClass4;
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_18 = WidgetRainbowProvider_2_2.this;
                        z6 = anonymousClass8.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef10 = anonymousClass8.$isStand;
                        Context context17 = anonymousClass8.$context;
                        boolean z110 = anonymousClass8.$drawZeroAsCircle;
                        RemoteViews remoteViews115 = anonymousClass8.$remoteViews;
                        if (z6) {
                        }
                        anonymousClass4 = anonymousClass8;
                        break;
                    } else {
                        widgetRainbowProvider_2_5 = WidgetRainbowProvider_2_2.this;
                        context4 = anonymousClass4.$context;
                        z7 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews11 = anonymousClass4.$remoteViews;
                        if (obj6 instanceof DailyStandReport) {
                            List listConvertReportToDataValues13 = widgetRainbowProvider_2_5.convertReportToDataValues(obj6, 24);
                            UiUtils uiUtils114 = UiUtils.INSTANCE;
                            int dp26 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp11111 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color114 = Color.parseColor("#36D167");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = remoteViews11;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 7;
                            remoteViews12 = remoteViews11;
                            anonymousClass10 = anonymousClass4;
                            objCreateBarChartBitmap6 = uiUtils114.createBarChartBitmap(context4, listConvertReportToDataValues13, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp26, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp11111, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color114, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.25f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 1, (4816 & 2048) != 0 ? false : z7, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap6 == obj) {
                                return obj;
                            }
                            remoteViews12.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap6);
                            anonymousClass4 = anonymousClass10;
                        }
                    }
                    widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                    context5 = anonymousClass4.$context;
                    appWidgetManager = anonymousClass4.$wMgr;
                    i = anonymousClass4.$appWidgetId;
                    remoteViews13 = anonymousClass4.$remoteViews;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                    if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                        return obj;
                    }
                    return Unit.INSTANCE;
                case 3:
                    remoteViews6 = (RemoteViews) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2;
                    Map<HomeDataType, ? extends Object> map7 = (Map) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1;
                    anonymousClass5 = (AnonymousClass3) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0;
                    ResultKt.throwOnFailure(obj7);
                    map2 = map7;
                    objCreateBarChartBitmap2 = obj7;
                    obj = coroutine_suspended;
                    remoteViews6.setImageViewBitmap(pqi.o, (Bitmap) objCreateBarChartBitmap2);
                    map4 = map2;
                    anonymousClass4 = anonymousClass5;
                    obj5 = map4.get(HomeDataType.MH_STRENGTH);
                    if (obj5 != null) {
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_19 = WidgetRainbowProvider_2_2.this;
                        z4 = anonymousClass4.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef11 = anonymousClass4.$isStand;
                        Context context18 = anonymousClass4.$context;
                        boolean z111 = anonymousClass4.$drawZeroAsCircle;
                        RemoteViews remoteViews116 = anonymousClass4.$remoteViews;
                        if (z4) {
                        }
                        anonymousClass4 = anonymousClass4;
                        break;
                    } else {
                        widgetRainbowProvider_2_4 = WidgetRainbowProvider_2_2.this;
                        context3 = anonymousClass4.$context;
                        z5 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews8 = anonymousClass4.$remoteViews;
                        if (obj5 instanceof DailyMHStrengthReport) {
                            List listConvertReportToDataValues$default12 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_4, obj5, 0, 2, null);
                            UiUtils uiUtils115 = UiUtils.INSTANCE;
                            int dp11112 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp11113 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color115 = Color.parseColor("#33A9FF");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews8;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 5;
                            anonymousClass7 = anonymousClass4;
                            objCreateBarChartBitmap4 = uiUtils115.createBarChartBitmap(context3, listConvertReportToDataValues$default12, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp11112, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp11113, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color115, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 10, (4816 & 2048) != 0 ? false : z5, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap4 == obj) {
                                return obj;
                            }
                            map3 = map4;
                            remoteViews9 = remoteViews8;
                            anonymousClass6 = anonymousClass7;
                            remoteViews9.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap4);
                            map4 = map3;
                            anonymousClass4 = anonymousClass6;
                        }
                    }
                    obj6 = map4.get(HomeDataType.VALID_STAND);
                    if (obj6 != null) {
                        anonymousClass8 = anonymousClass4;
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_110 = WidgetRainbowProvider_2_2.this;
                        z6 = anonymousClass8.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef12 = anonymousClass8.$isStand;
                        Context context19 = anonymousClass8.$context;
                        boolean z112 = anonymousClass8.$drawZeroAsCircle;
                        RemoteViews remoteViews117 = anonymousClass8.$remoteViews;
                        if (z6) {
                        }
                        anonymousClass4 = anonymousClass8;
                        break;
                    } else {
                        widgetRainbowProvider_2_5 = WidgetRainbowProvider_2_2.this;
                        context4 = anonymousClass4.$context;
                        z7 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews11 = anonymousClass4.$remoteViews;
                        if (obj6 instanceof DailyStandReport) {
                            List listConvertReportToDataValues14 = widgetRainbowProvider_2_5.convertReportToDataValues(obj6, 24);
                            UiUtils uiUtils116 = UiUtils.INSTANCE;
                            int dp27 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp11114 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color116 = Color.parseColor("#36D167");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = remoteViews11;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 7;
                            remoteViews12 = remoteViews11;
                            anonymousClass10 = anonymousClass4;
                            objCreateBarChartBitmap6 = uiUtils116.createBarChartBitmap(context4, listConvertReportToDataValues14, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp27, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp11114, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color116, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.25f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 1, (4816 & 2048) != 0 ? false : z7, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap6 == obj) {
                                return obj;
                            }
                            remoteViews12.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap6);
                            anonymousClass4 = anonymousClass10;
                        }
                    }
                    widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                    context5 = anonymousClass4.$context;
                    appWidgetManager = anonymousClass4.$wMgr;
                    i = anonymousClass4.$appWidgetId;
                    remoteViews13 = anonymousClass4.$remoteViews;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                    if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                        return obj;
                    }
                    return Unit.INSTANCE;
                case 4:
                    remoteViews4 = (RemoteViews) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2;
                    Map<HomeDataType, ? extends Object> map8 = (Map) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1;
                    anonymousClass5 = (AnonymousClass3) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0;
                    ResultKt.throwOnFailure(obj7);
                    map2 = map8;
                    objCreateBarChartBitmap = obj7;
                    obj = coroutine_suspended;
                    remoteViews4.setImageViewBitmap(pqi.c, (Bitmap) objCreateBarChartBitmap);
                    map4 = map2;
                    anonymousClass4 = anonymousClass5;
                    obj5 = map4.get(HomeDataType.MH_STRENGTH);
                    if (obj5 != null) {
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_111 = WidgetRainbowProvider_2_2.this;
                        z4 = anonymousClass4.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef13 = anonymousClass4.$isStand;
                        Context context110 = anonymousClass4.$context;
                        boolean z113 = anonymousClass4.$drawZeroAsCircle;
                        RemoteViews remoteViews118 = anonymousClass4.$remoteViews;
                        if (z4) {
                        }
                        anonymousClass4 = anonymousClass4;
                        break;
                    } else {
                        widgetRainbowProvider_2_4 = WidgetRainbowProvider_2_2.this;
                        context3 = anonymousClass4.$context;
                        z5 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews8 = anonymousClass4.$remoteViews;
                        if (obj5 instanceof DailyMHStrengthReport) {
                            List listConvertReportToDataValues$default13 = WidgetRainbowProvider_2_2.convertReportToDataValues$default(widgetRainbowProvider_2_4, obj5, 0, 2, null);
                            UiUtils uiUtils117 = UiUtils.INSTANCE;
                            int dp11115 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp11116 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color117 = Color.parseColor("#33A9FF");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = map4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = remoteViews8;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 5;
                            anonymousClass7 = anonymousClass4;
                            objCreateBarChartBitmap4 = uiUtils117.createBarChartBitmap(context3, listConvertReportToDataValues$default13, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp11115, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp11116, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color117, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 10, (4816 & 2048) != 0 ? false : z5, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap4 == obj) {
                                return obj;
                            }
                            map3 = map4;
                            remoteViews9 = remoteViews8;
                            anonymousClass6 = anonymousClass7;
                            remoteViews9.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap4);
                            map4 = map3;
                            anonymousClass4 = anonymousClass6;
                        }
                    }
                    obj6 = map4.get(HomeDataType.VALID_STAND);
                    if (obj6 != null) {
                        anonymousClass8 = anonymousClass4;
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_112 = WidgetRainbowProvider_2_2.this;
                        z6 = anonymousClass8.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef14 = anonymousClass8.$isStand;
                        Context context111 = anonymousClass8.$context;
                        boolean z114 = anonymousClass8.$drawZeroAsCircle;
                        RemoteViews remoteViews119 = anonymousClass8.$remoteViews;
                        if (z6) {
                        }
                        anonymousClass4 = anonymousClass8;
                        break;
                    } else {
                        widgetRainbowProvider_2_5 = WidgetRainbowProvider_2_2.this;
                        context4 = anonymousClass4.$context;
                        z7 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews11 = anonymousClass4.$remoteViews;
                        if (obj6 instanceof DailyStandReport) {
                            List listConvertReportToDataValues15 = widgetRainbowProvider_2_5.convertReportToDataValues(obj6, 24);
                            UiUtils uiUtils118 = UiUtils.INSTANCE;
                            int dp28 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp11117 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color118 = Color.parseColor("#36D167");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = remoteViews11;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 7;
                            remoteViews12 = remoteViews11;
                            anonymousClass10 = anonymousClass4;
                            objCreateBarChartBitmap6 = uiUtils118.createBarChartBitmap(context4, listConvertReportToDataValues15, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp28, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp11117, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color118, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.25f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 1, (4816 & 2048) != 0 ? false : z7, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap6 == obj) {
                                return obj;
                            }
                            remoteViews12.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap6);
                            anonymousClass4 = anonymousClass10;
                        }
                    }
                    widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                    context5 = anonymousClass4.$context;
                    appWidgetManager = anonymousClass4.$wMgr;
                    i = anonymousClass4.$appWidgetId;
                    remoteViews13 = anonymousClass4.$remoteViews;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                    if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                        return obj;
                    }
                    return Unit.INSTANCE;
                case 5:
                    remoteViews9 = (RemoteViews) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2;
                    Map<HomeDataType, ? extends Object> map9 = (Map) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1;
                    anonymousClass6 = (AnonymousClass3) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0;
                    ResultKt.throwOnFailure(obj7);
                    map3 = map9;
                    objCreateBarChartBitmap4 = obj7;
                    obj = coroutine_suspended;
                    remoteViews9.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap4);
                    map4 = map3;
                    anonymousClass4 = anonymousClass6;
                    obj6 = map4.get(HomeDataType.VALID_STAND);
                    if (obj6 != null) {
                        anonymousClass8 = anonymousClass4;
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_113 = WidgetRainbowProvider_2_2.this;
                        z6 = anonymousClass8.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef15 = anonymousClass8.$isStand;
                        Context context112 = anonymousClass8.$context;
                        boolean z115 = anonymousClass8.$drawZeroAsCircle;
                        RemoteViews remoteViews1110 = anonymousClass8.$remoteViews;
                        if (z6) {
                        }
                        anonymousClass4 = anonymousClass8;
                        break;
                    } else {
                        widgetRainbowProvider_2_5 = WidgetRainbowProvider_2_2.this;
                        context4 = anonymousClass4.$context;
                        z7 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews11 = anonymousClass4.$remoteViews;
                        if (obj6 instanceof DailyStandReport) {
                            List listConvertReportToDataValues16 = widgetRainbowProvider_2_5.convertReportToDataValues(obj6, 24);
                            UiUtils uiUtils119 = UiUtils.INSTANCE;
                            int dp29 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp11118 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color119 = Color.parseColor("#36D167");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = remoteViews11;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 7;
                            remoteViews12 = remoteViews11;
                            anonymousClass10 = anonymousClass4;
                            objCreateBarChartBitmap6 = uiUtils119.createBarChartBitmap(context4, listConvertReportToDataValues16, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp29, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp11118, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color119, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.25f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 1, (4816 & 2048) != 0 ? false : z7, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap6 == obj) {
                                return obj;
                            }
                            remoteViews12.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap6);
                            anonymousClass4 = anonymousClass10;
                        }
                    }
                    widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                    context5 = anonymousClass4.$context;
                    appWidgetManager = anonymousClass4.$wMgr;
                    i = anonymousClass4.$appWidgetId;
                    remoteViews13 = anonymousClass4.$remoteViews;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                    if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                        return obj;
                    }
                    return Unit.INSTANCE;
                case 6:
                    remoteViews7 = (RemoteViews) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2;
                    Map<HomeDataType, ? extends Object> map10 = (Map) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1;
                    anonymousClass6 = (AnonymousClass3) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0;
                    ResultKt.throwOnFailure(obj7);
                    map3 = map10;
                    objCreateBarChartBitmap3 = obj7;
                    obj = coroutine_suspended;
                    remoteViews7.setImageViewBitmap(pqi.c, (Bitmap) objCreateBarChartBitmap3);
                    map4 = map3;
                    anonymousClass4 = anonymousClass6;
                    obj6 = map4.get(HomeDataType.VALID_STAND);
                    if (obj6 != null) {
                        anonymousClass8 = anonymousClass4;
                        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_114 = WidgetRainbowProvider_2_2.this;
                        z6 = anonymousClass8.$alwaysEmptyBitmap;
                        Ref.BooleanRef booleanRef16 = anonymousClass8.$isStand;
                        Context context113 = anonymousClass8.$context;
                        boolean z116 = anonymousClass8.$drawZeroAsCircle;
                        RemoteViews remoteViews1111 = anonymousClass8.$remoteViews;
                        if (z6) {
                        }
                        anonymousClass4 = anonymousClass8;
                        break;
                    } else {
                        widgetRainbowProvider_2_5 = WidgetRainbowProvider_2_2.this;
                        context4 = anonymousClass4.$context;
                        z7 = anonymousClass4.$drawZeroAsCircle;
                        remoteViews11 = anonymousClass4.$remoteViews;
                        if (obj6 instanceof DailyStandReport) {
                            List listConvertReportToDataValues17 = widgetRainbowProvider_2_5.convertReportToDataValues(obj6, 24);
                            UiUtils uiUtils1110 = UiUtils.INSTANCE;
                            int dp210 = ExtUtilsKt.getDp(Boxing.boxInt(492));
                            int dp11119 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                            int color1110 = Color.parseColor("#36D167");
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = anonymousClass4;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = remoteViews11;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                            widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 7;
                            remoteViews12 = remoteViews11;
                            anonymousClass10 = anonymousClass4;
                            objCreateBarChartBitmap6 = uiUtils1110.createBarChartBitmap(context4, listConvertReportToDataValues17, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp210, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp11119, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color1110, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.25f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 1, (4816 & 2048) != 0 ? false : z7, (4816 & 4096) != 0 ? null : null, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1);
                            if (objCreateBarChartBitmap6 == obj) {
                                return obj;
                            }
                            remoteViews12.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap6);
                            anonymousClass4 = anonymousClass10;
                        }
                    }
                    widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                    context5 = anonymousClass4.$context;
                    appWidgetManager = anonymousClass4.$wMgr;
                    i = anonymousClass4.$appWidgetId;
                    remoteViews13 = anonymousClass4.$remoteViews;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                    if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                        return obj;
                    }
                    return Unit.INSTANCE;
                case 7:
                    remoteViews12 = (RemoteViews) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1;
                    AnonymousClass3<T> anonymousClass12 = (AnonymousClass3) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0;
                    ResultKt.throwOnFailure(obj7);
                    anonymousClass10 = anonymousClass12;
                    objCreateBarChartBitmap6 = obj7;
                    obj = coroutine_suspended;
                    remoteViews12.setImageViewBitmap(pqi.f30648r, (Bitmap) objCreateBarChartBitmap6);
                    anonymousClass4 = anonymousClass10;
                    widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                    context5 = anonymousClass4.$context;
                    appWidgetManager = anonymousClass4.$wMgr;
                    i = anonymousClass4.$appWidgetId;
                    remoteViews13 = anonymousClass4.$remoteViews;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                    if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                        return obj;
                    }
                    return Unit.INSTANCE;
                case 8:
                    remoteViews10 = (RemoteViews) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1;
                    AnonymousClass3<T> anonymousClass13 = (AnonymousClass3) widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0;
                    ResultKt.throwOnFailure(obj7);
                    anonymousClass9 = anonymousClass13;
                    objCreateBarChartBitmap5 = obj7;
                    obj = coroutine_suspended;
                    remoteViews10.setImageViewBitmap(pqi.c, (Bitmap) objCreateBarChartBitmap5);
                    anonymousClass4 = anonymousClass9;
                    widgetRainbowProvider_2_6 = WidgetRainbowProvider_2_2.this;
                    context5 = anonymousClass4.$context;
                    appWidgetManager = anonymousClass4.$wMgr;
                    i = anonymousClass4.$appWidgetId;
                    remoteViews13 = anonymousClass4.$remoteViews;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$0 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$1 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.L$2 = null;
                    widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1.label = 9;
                    if (widgetRainbowProvider_2_6.doFinalUpdate(context5, appWidgetManager, i, remoteViews13, widgetRainbowProvider_2_2$createRainbowBarChartBitmaps$3$emit$1) == obj) {
                        return obj;
                    }
                    return Unit.INSTANCE;
                case 9:
                    ResultKt.throwOnFailure(obj7);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$doFinalUpdate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_RAINBOW_2_2, f = "WidgetRainbowProvider_2_2.kt", i = {}, l = {691}, m = "doFinalUpdate", n = {}, s = {})
    public static final class C14801 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C14801(Continuation<? super C14801> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetRainbowProvider_2_2.this.doFinalUpdate(null, null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$doFinalUpdate$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.rainbow.WidgetRainbowProvider_2_2$doFinalUpdate$2", f = "WidgetRainbowProvider_2_2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14812 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ Bundle $options;
        final /* synthetic */ RemoteViews $remoteViews;
        final /* synthetic */ AppWidgetManager $wMgr;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14812(AppWidgetManager appWidgetManager, int i, Bundle bundle, RemoteViews remoteViews, Continuation<? super C14812> continuation) {
            super(2, continuation);
            this.$wMgr = appWidgetManager;
            this.$appWidgetId = i;
            this.$options = bundle;
            this.$remoteViews = remoteViews;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14812(this.$wMgr, this.$appWidgetId, this.$options, this.$remoteViews, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$wMgr.updateAppWidgetOptions(this.$appWidgetId, this.$options);
            this.$wMgr.updateAppWidget(this.$appWidgetId, this.$remoteViews);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14812) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$doUpdateWidget$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_RAINBOW_2_2, f = "WidgetRainbowProvider_2_2.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {453, 471, 479, 482}, m = "doUpdateWidget", n = {"this", "context", "wMgr", "rainbowReport", "appWidgetId", "this", "context", "wMgr", "appWidgetId", "this", "context", "wMgr", "appWidgetId"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
    public static final class C14821 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C14821(Continuation<? super C14821> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetRainbowProvider_2_2.this.doUpdateWidget(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$doUpdateWidget$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.rainbow.WidgetRainbowProvider_2_2$doUpdateWidget$2", f = "WidgetRainbowProvider_2_2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14832 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<DailyGoalReport> $rainbowReport;
        final /* synthetic */ long $today;
        int label;
        final /* synthetic */ WidgetRainbowProvider_2_2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14832(Ref.ObjectRef<DailyGoalReport> objectRef, long j, WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2, Continuation<? super C14832> continuation) {
            super(2, continuation);
            this.$rainbowReport = objectRef;
            this.$today = j;
            this.this$0 = widgetRainbowProvider_2_2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14832(this.$rainbowReport, this.$today, this.this$0, continuation);
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [T, com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$rainbowReport.element = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRainbowRepository().getDailyReportSync(this.$today);
            Logger.i(this.this$0.TAG, "update rainbow widget: load report = " + this.$rainbowReport.element);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$doUpdateWidgetOs3$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_RAINBOW_2_2, f = "WidgetRainbowProvider_2_2.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3}, l = {161, 175, SportReportBaseParser.ReportType.minWaterTemperature, 203, 206}, m = "doUpdateWidgetOs3", n = {"this", "context", "wMgr", "rainbowReport", "appWidgetId", "this", "context", "wMgr", "report", "goalProgressMap", "rainbowBitmap", "remoteViews", "appWidgetId", "this", "context", "wMgr", "appWidgetId", "this", "context", "wMgr", "appWidgetId"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
    public static final class C14841 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C14841(Continuation<? super C14841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetRainbowProvider_2_2.this.doUpdateWidgetOs3(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$doUpdateWidgetOs3$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.rainbow.WidgetRainbowProvider_2_2$doUpdateWidgetOs3$2", f = "WidgetRainbowProvider_2_2.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14852 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<DailyGoalReport> $rainbowReport;
        final /* synthetic */ long $today;
        int label;
        final /* synthetic */ WidgetRainbowProvider_2_2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14852(Ref.ObjectRef<DailyGoalReport> objectRef, long j, WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2, Continuation<? super C14852> continuation) {
            super(2, continuation);
            this.$rainbowReport = objectRef;
            this.$today = j;
            this.this$0 = widgetRainbowProvider_2_2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14852(this.$rainbowReport, this.$today, this.this$0, continuation);
        }

        /* JADX WARN: Type inference failed for: r4v5, types: [T, com.xiaomi.fit.fitness.export.data.aggregation.DailyGoalReport] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$rainbowReport.element = FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRainbowRepository().getDailyReportSync(this.$today);
            Logger.i(this.this$0.TAG, "update rainbow widget: load report = " + this.$rainbowReport.element);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14852) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$onWidgetUpdate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.rainbow.WidgetRainbowProvider_2_2$onWidgetUpdate$1", f = "WidgetRainbowProvider_2_2.kt", i = {}, l = {131, 135, 145, 150}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14861 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int[] $appWidgetIds;
        final /* synthetic */ Context $context;
        final /* synthetic */ AppWidgetManager $wMgr;
        int I$0;
        int I$1;
        Object L$0;
        int label;
        final /* synthetic */ WidgetRainbowProvider_2_2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14861(Context context, WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2, int[] iArr, AppWidgetManager appWidgetManager, Continuation<? super C14861> continuation) {
            super(2, continuation);
            this.$context = context;
            this.this$0 = widgetRainbowProvider_2_2;
            this.$appWidgetIds = iArr;
            this.$wMgr = appWidgetManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14861(this.$context, this.this$0, this.$appWidgetIds, this.$wMgr, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:56:0x0115  */
        /* JADX WARN: Code duplicated, block: B:58:0x012d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c2 -> B:38:0x00c5). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e4 -> B:44:0x00e7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0109 -> B:53:0x010c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x012b -> B:59:0x012e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mi.health.rainbow.WidgetRainbowProvider_2_2.C14861.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.rainbow.WidgetRainbowProvider_2_2$showEmptyDataOs3$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_RAINBOW_2_2, f = "WidgetRainbowProvider_2_2.kt", i = {0, 0, 0, 0, 0, 0}, l = {215, 230, 244, SportSummary.VERSION_105, 275}, m = "showEmptyDataOs3", n = {"this", "context", "wMgr", "remoteViews", "appWidgetId", "grant"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "Z$0"})
    public static final class C14871 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C14871(Continuation<? super C14871> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WidgetRainbowProvider_2_2.this.showEmptyDataOs3(null, null, 0, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Float> convertReportToDataValues(Object report, int totalSegments) {
        ArrayList arrayList = new ArrayList(totalSegments);
        for (int i = 0; i < totalSegments; i++) {
            arrayList.add(Float.valueOf(0.0f));
        }
        if (report == null) {
            return arrayList;
        }
        if (report instanceof DailyCalorieReport) {
            for (CalorieRecord calorieRecord : ((DailyCalorieReport) report).getCalRecords()) {
                int timeSegmentIndex = UiUtils.INSTANCE.getTimeSegmentIndex(calorieRecord.getTime(), totalSegments);
                arrayList.set(timeSegmentIndex, Float.valueOf(((Number) arrayList.get(timeSegmentIndex)).floatValue() + calorieRecord.getCalories()));
            }
        } else if (report instanceof DailyStepReport) {
            for (StepRecord stepRecord : ((DailyStepReport) report).getStepRecords()) {
                int timeSegmentIndex2 = UiUtils.INSTANCE.getTimeSegmentIndex(stepRecord.getTime(), totalSegments);
                arrayList.set(timeSegmentIndex2, Float.valueOf(((Number) arrayList.get(timeSegmentIndex2)).floatValue() + stepRecord.getSteps()));
            }
        } else if (report instanceof DailyMHStrengthReport) {
            for (MHStrengthRecord mHStrengthRecord : ((DailyMHStrengthReport) report).getRecordList()) {
                int timeSegmentIndex3 = UiUtils.INSTANCE.getTimeSegmentIndex(mHStrengthRecord.getTime(), totalSegments);
                arrayList.set(timeSegmentIndex3, Float.valueOf(((Number) arrayList.get(timeSegmentIndex3)).floatValue() + mHStrengthRecord.getMinutes()));
            }
        } else {
            if (!(report instanceof DailyStandReport)) {
                throw new IllegalArgumentException("Unsupported report type: " + Reflection.getOrCreateKotlinClass(report.getClass()).getSimpleName());
            }
            for (StandRecord standRecord : ((DailyStandReport) report).getStandDetail()) {
                int timeSegmentIndex4 = UiUtils.INSTANCE.getTimeSegmentIndex(standRecord.getTime(), totalSegments);
                arrayList.set(timeSegmentIndex4, Float.valueOf(((Number) arrayList.get(timeSegmentIndex4)).floatValue() + standRecord.getStandCount()));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List convertReportToDataValues$default(WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2, Object obj, int i, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: convertReportToDataValues");
        }
        if ((i2 & 2) != 0) {
            i = 48;
        }
        return widgetRainbowProvider_2_2.convertReportToDataValues(obj, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:30:0x0166 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x0167  */
    /* JADX WARN: Code duplicated, block: B:35:0x01ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x01af  */
    /* JADX WARN: Code duplicated, block: B:39:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x01e3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x0213 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object createRainbowBarChartBitmaps(Context context, RemoteViews remoteViews, DailyGoalReport dailyGoalReport, AppWidgetManager appWidgetManager, int i, boolean z, boolean z2, boolean z3, int i2, int i3, int i4, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Object obj;
        Context context2;
        RemoteViews remoteViews2;
        DailyGoalReport dailyGoalReport2;
        AppWidgetManager appWidgetManager2;
        int i5;
        boolean z4;
        boolean z5;
        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2;
        Context context3;
        RemoteViews remoteViews3;
        DailyGoalReport dailyGoalReport3;
        AppWidgetManager appWidgetManager3;
        int i6;
        boolean z6;
        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_3;
        Object obj2;
        Ref.ObjectRef objectRef;
        Ref.BooleanRef booleanRef;
        CoroutineDispatcher io2;
        AnonymousClass2 anonymousClass2;
        Object obj3;
        Ref.ObjectRef objectRef2;
        int i7;
        StateFlow stateFlow;
        AnonymousClass3 anonymousClass3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i8 = anonymousClass1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i8 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj4 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = anonymousClass1.label;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj4);
            if (z2) {
                List<Float> listConvertReportToDataValues = convertReportToDataValues(null, 48);
                UiUtils uiUtils = UiUtils.INSTANCE;
                int dp = ExtUtilsKt.getDp(Boxing.boxInt(492));
                int dp2 = ExtUtilsKt.getDp(Boxing.boxInt(122));
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = context;
                anonymousClass1.L$2 = remoteViews;
                anonymousClass1.L$3 = dailyGoalReport;
                anonymousClass1.L$4 = appWidgetManager;
                anonymousClass1.I$0 = i;
                anonymousClass1.Z$0 = z;
                anonymousClass1.Z$1 = z3;
                anonymousClass1.label = 1;
                obj = coroutine_suspended;
                Object objCreateBarChartBitmap = uiUtils.createBarChartBitmap(context, listConvertReportToDataValues, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : dp, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : dp2, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : 0, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 100, (4816 & 2048) != 0 ? false : z3, (4816 & 4096) != 0 ? null : null, anonymousClass1);
                if (objCreateBarChartBitmap == obj) {
                    return obj;
                }
                context3 = context;
                remoteViews3 = remoteViews;
                dailyGoalReport3 = dailyGoalReport;
                appWidgetManager3 = appWidgetManager;
                i6 = i;
                z6 = z;
                widgetRainbowProvider_2_3 = this;
                obj2 = objCreateBarChartBitmap;
                z5 = z3;
                Bitmap bitmap = (Bitmap) obj2;
                remoteViews3.setImageViewBitmap(pqi.c, bitmap);
                remoteViews3.setImageViewBitmap(pqi.o, bitmap);
                remoteViews3.setImageViewBitmap(pqi.f30648r, bitmap);
                anonymousClass1.L$0 = widgetRainbowProvider_2_3;
                anonymousClass1.L$1 = context3;
                anonymousClass1.L$2 = remoteViews3;
                anonymousClass1.L$3 = dailyGoalReport3;
                anonymousClass1.L$4 = appWidgetManager3;
                anonymousClass1.I$0 = i6;
                anonymousClass1.Z$0 = z6;
                anonymousClass1.Z$1 = z5;
                anonymousClass1.label = 2;
                if (widgetRainbowProvider_2_3.doFinalUpdate(context3, appWidgetManager3, i6, remoteViews3, anonymousClass1) == obj) {
                    return obj;
                }
                z4 = z6;
                i5 = i6;
                appWidgetManager2 = appWidgetManager3;
                dailyGoalReport2 = dailyGoalReport3;
                remoteViews2 = remoteViews3;
                context2 = context3;
                widgetRainbowProvider_2_2 = widgetRainbowProvider_2_3;
            } else {
                obj = coroutine_suspended;
                context2 = context;
                remoteViews2 = remoteViews;
                dailyGoalReport2 = dailyGoalReport;
                appWidgetManager2 = appWidgetManager;
                i5 = i;
                z4 = z;
                z5 = z3;
                widgetRainbowProvider_2_2 = this;
            }
            objectRef = new Ref.ObjectRef();
            booleanRef = new Ref.BooleanRef();
            io2 = Dispatchers.getIO();
            obj3 = null;
            anonymousClass2 = new AnonymousClass2(objectRef, dailyGoalReport2, booleanRef, null);
            anonymousClass1.L$0 = widgetRainbowProvider_2_2;
            anonymousClass1.L$1 = context2;
            anonymousClass1.L$2 = remoteViews2;
            anonymousClass1.L$3 = appWidgetManager2;
            anonymousClass1.L$4 = objectRef;
            anonymousClass1.L$5 = booleanRef;
            anonymousClass1.I$0 = i5;
            anonymousClass1.Z$0 = z4;
            anonymousClass1.Z$1 = z5;
            anonymousClass1.label = 3;
            if (BuildersKt.withContext(io2, anonymousClass2, anonymousClass1) == obj) {
                return obj;
            }
            objectRef2 = objectRef;
            i7 = i5;
            stateFlow = (StateFlow) objectRef2.element;
            if (stateFlow != null) {
                anonymousClass1.L$0 = obj3;
                anonymousClass1.L$1 = obj3;
                anonymousClass1.L$2 = obj3;
                anonymousClass1.L$3 = obj3;
                anonymousClass1.L$4 = obj3;
                anonymousClass1.L$5 = obj3;
                anonymousClass1.label = 5;
                if (showEmptyData$default(widgetRainbowProvider_2_2, context2, appWidgetManager2, i7, false, anonymousClass1, 8, null) == obj) {
                    return obj;
                }
                return Unit.INSTANCE;
            }
            anonymousClass3 = widgetRainbowProvider_2_2.new AnonymousClass3(context2, appWidgetManager2, i7, remoteViews2, z5, z4, booleanRef);
            anonymousClass1.L$0 = obj3;
            anonymousClass1.L$1 = obj3;
            anonymousClass1.L$2 = obj3;
            anonymousClass1.L$3 = obj3;
            anonymousClass1.L$4 = obj3;
            anonymousClass1.L$5 = obj3;
            anonymousClass1.label = 4;
            if (stateFlow.collect(anonymousClass3, anonymousClass1) == obj) {
                return obj;
            }
            throw new KotlinNothingValueException();
        }
        if (i9 == 1) {
            z5 = anonymousClass1.Z$1;
            z6 = anonymousClass1.Z$0;
            i6 = anonymousClass1.I$0;
            appWidgetManager3 = (AppWidgetManager) anonymousClass1.L$4;
            dailyGoalReport3 = (DailyGoalReport) anonymousClass1.L$3;
            remoteViews3 = (RemoteViews) anonymousClass1.L$2;
            context3 = (Context) anonymousClass1.L$1;
            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_4 = (WidgetRainbowProvider_2_2) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj4);
            widgetRainbowProvider_2_3 = widgetRainbowProvider_2_4;
            obj2 = obj4;
            obj = coroutine_suspended;
            Bitmap bitmap2 = (Bitmap) obj2;
            remoteViews3.setImageViewBitmap(pqi.c, bitmap2);
            remoteViews3.setImageViewBitmap(pqi.o, bitmap2);
            remoteViews3.setImageViewBitmap(pqi.f30648r, bitmap2);
            anonymousClass1.L$0 = widgetRainbowProvider_2_3;
            anonymousClass1.L$1 = context3;
            anonymousClass1.L$2 = remoteViews3;
            anonymousClass1.L$3 = dailyGoalReport3;
            anonymousClass1.L$4 = appWidgetManager3;
            anonymousClass1.I$0 = i6;
            anonymousClass1.Z$0 = z6;
            anonymousClass1.Z$1 = z5;
            anonymousClass1.label = 2;
            if (widgetRainbowProvider_2_3.doFinalUpdate(context3, appWidgetManager3, i6, remoteViews3, anonymousClass1) == obj) {
                return obj;
            }
            z4 = z6;
            i5 = i6;
            appWidgetManager2 = appWidgetManager3;
            dailyGoalReport2 = dailyGoalReport3;
            remoteViews2 = remoteViews3;
            context2 = context3;
            widgetRainbowProvider_2_2 = widgetRainbowProvider_2_3;
            objectRef = new Ref.ObjectRef();
            booleanRef = new Ref.BooleanRef();
            io2 = Dispatchers.getIO();
            obj3 = null;
            anonymousClass2 = new AnonymousClass2(objectRef, dailyGoalReport2, booleanRef, null);
            anonymousClass1.L$0 = widgetRainbowProvider_2_2;
            anonymousClass1.L$1 = context2;
            anonymousClass1.L$2 = remoteViews2;
            anonymousClass1.L$3 = appWidgetManager2;
            anonymousClass1.L$4 = objectRef;
            anonymousClass1.L$5 = booleanRef;
            anonymousClass1.I$0 = i5;
            anonymousClass1.Z$0 = z4;
            anonymousClass1.Z$1 = z5;
            anonymousClass1.label = 3;
            if (BuildersKt.withContext(io2, anonymousClass2, anonymousClass1) == obj) {
                return obj;
            }
            objectRef2 = objectRef;
            i7 = i5;
            stateFlow = (StateFlow) objectRef2.element;
            if (stateFlow != null) {
                anonymousClass1.L$0 = obj3;
                anonymousClass1.L$1 = obj3;
                anonymousClass1.L$2 = obj3;
                anonymousClass1.L$3 = obj3;
                anonymousClass1.L$4 = obj3;
                anonymousClass1.L$5 = obj3;
                anonymousClass1.label = 5;
                if (showEmptyData$default(widgetRainbowProvider_2_2, context2, appWidgetManager2, i7, false, anonymousClass1, 8, null) == obj) {
                    return obj;
                }
                return Unit.INSTANCE;
            }
            anonymousClass3 = widgetRainbowProvider_2_2.new AnonymousClass3(context2, appWidgetManager2, i7, remoteViews2, z5, z4, booleanRef);
            anonymousClass1.L$0 = obj3;
            anonymousClass1.L$1 = obj3;
            anonymousClass1.L$2 = obj3;
            anonymousClass1.L$3 = obj3;
            anonymousClass1.L$4 = obj3;
            anonymousClass1.L$5 = obj3;
            anonymousClass1.label = 4;
            if (stateFlow.collect(anonymousClass3, anonymousClass1) == obj) {
                return obj;
            }
            throw new KotlinNothingValueException();
        }
        if (i9 != 2) {
            if (i9 != 3) {
                if (i9 == 4) {
                    ResultKt.throwOnFailure(obj4);
                    throw new KotlinNothingValueException();
                }
                if (i9 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj4);
                return Unit.INSTANCE;
            }
            z5 = anonymousClass1.Z$1;
            z4 = anonymousClass1.Z$0;
            i7 = anonymousClass1.I$0;
            Ref.BooleanRef booleanRef2 = (Ref.BooleanRef) anonymousClass1.L$5;
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) anonymousClass1.L$4;
            AppWidgetManager appWidgetManager4 = (AppWidgetManager) anonymousClass1.L$3;
            remoteViews2 = (RemoteViews) anonymousClass1.L$2;
            context2 = (Context) anonymousClass1.L$1;
            widgetRainbowProvider_2_2 = (WidgetRainbowProvider_2_2) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj4);
            booleanRef = booleanRef2;
            objectRef2 = objectRef3;
            appWidgetManager2 = appWidgetManager4;
            obj = coroutine_suspended;
            obj3 = null;
            stateFlow = (StateFlow) objectRef2.element;
            if (stateFlow != null) {
                anonymousClass1.L$0 = obj3;
                anonymousClass1.L$1 = obj3;
                anonymousClass1.L$2 = obj3;
                anonymousClass1.L$3 = obj3;
                anonymousClass1.L$4 = obj3;
                anonymousClass1.L$5 = obj3;
                anonymousClass1.label = 5;
                if (showEmptyData$default(widgetRainbowProvider_2_2, context2, appWidgetManager2, i7, false, anonymousClass1, 8, null) == obj) {
                    return obj;
                }
                return Unit.INSTANCE;
            }
            anonymousClass3 = widgetRainbowProvider_2_2.new AnonymousClass3(context2, appWidgetManager2, i7, remoteViews2, z5, z4, booleanRef);
            anonymousClass1.L$0 = obj3;
            anonymousClass1.L$1 = obj3;
            anonymousClass1.L$2 = obj3;
            anonymousClass1.L$3 = obj3;
            anonymousClass1.L$4 = obj3;
            anonymousClass1.L$5 = obj3;
            anonymousClass1.label = 4;
            if (stateFlow.collect(anonymousClass3, anonymousClass1) == obj) {
                return obj;
            }
            throw new KotlinNothingValueException();
        }
        z5 = anonymousClass1.Z$1;
        z4 = anonymousClass1.Z$0;
        i5 = anonymousClass1.I$0;
        appWidgetManager2 = (AppWidgetManager) anonymousClass1.L$4;
        dailyGoalReport2 = (DailyGoalReport) anonymousClass1.L$3;
        remoteViews2 = (RemoteViews) anonymousClass1.L$2;
        context2 = (Context) anonymousClass1.L$1;
        widgetRainbowProvider_2_2 = (WidgetRainbowProvider_2_2) anonymousClass1.L$0;
        ResultKt.throwOnFailure(obj4);
        obj = coroutine_suspended;
        objectRef = new Ref.ObjectRef();
        booleanRef = new Ref.BooleanRef();
        io2 = Dispatchers.getIO();
        obj3 = null;
        anonymousClass2 = new AnonymousClass2(objectRef, dailyGoalReport2, booleanRef, null);
        anonymousClass1.L$0 = widgetRainbowProvider_2_2;
        anonymousClass1.L$1 = context2;
        anonymousClass1.L$2 = remoteViews2;
        anonymousClass1.L$3 = appWidgetManager2;
        anonymousClass1.L$4 = objectRef;
        anonymousClass1.L$5 = booleanRef;
        anonymousClass1.I$0 = i5;
        anonymousClass1.Z$0 = z4;
        anonymousClass1.Z$1 = z5;
        anonymousClass1.label = 3;
        if (BuildersKt.withContext(io2, anonymousClass2, anonymousClass1) == obj) {
            return obj;
        }
        objectRef2 = objectRef;
        i7 = i5;
        stateFlow = (StateFlow) objectRef2.element;
        if (stateFlow != null) {
            anonymousClass1.L$0 = obj3;
            anonymousClass1.L$1 = obj3;
            anonymousClass1.L$2 = obj3;
            anonymousClass1.L$3 = obj3;
            anonymousClass1.L$4 = obj3;
            anonymousClass1.L$5 = obj3;
            anonymousClass1.label = 5;
            if (showEmptyData$default(widgetRainbowProvider_2_2, context2, appWidgetManager2, i7, false, anonymousClass1, 8, null) == obj) {
                return obj;
            }
            return Unit.INSTANCE;
        }
        anonymousClass3 = widgetRainbowProvider_2_2.new AnonymousClass3(context2, appWidgetManager2, i7, remoteViews2, z5, z4, booleanRef);
        anonymousClass1.L$0 = obj3;
        anonymousClass1.L$1 = obj3;
        anonymousClass1.L$2 = obj3;
        anonymousClass1.L$3 = obj3;
        anonymousClass1.L$4 = obj3;
        anonymousClass1.L$5 = obj3;
        anonymousClass1.label = 4;
        if (stateFlow.collect(anonymousClass3, anonymousClass1) == obj) {
            return obj;
        }
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Object createRainbowBarChartBitmaps$default(WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2, Context context, RemoteViews remoteViews, DailyGoalReport dailyGoalReport, AppWidgetManager appWidgetManager, int i, boolean z, boolean z2, boolean z3, int i2, int i3, int i4, Continuation continuation, int i5, Object obj) {
        if (obj == null) {
            return widgetRainbowProvider_2_2.createRainbowBarChartBitmaps(context, remoteViews, dailyGoalReport, appWidgetManager, i, (i5 & 32) != 0 ? true : z, (i5 & 64) != 0 ? false : z2, (i5 & 128) != 0 ? false : z3, (i5 & 256) != 0 ? ExtUtilsKt.getDp(492) : i2, (i5 & 512) != 0 ? ExtUtilsKt.getDp(122) : i3, (i5 & 1024) != 0 ? 100 : i4, continuation);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createRainbowBarChartBitmaps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object doFinalUpdate(Context context, AppWidgetManager appWidgetManager, int i, RemoteViews remoteViews, Continuation<? super Unit> continuation) {
        C14801 c14801;
        if (continuation instanceof C14801) {
            c14801 = (C14801) continuation;
            int i2 = c14801.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c14801.label = i2 - Integer.MIN_VALUE;
            } else {
                c14801 = new C14801(continuation);
            }
        } else {
            c14801 = new C14801(continuation);
        }
        Object obj = c14801.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c14801.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            UiUtils.updateWidgetDefaultBackgroundIntent$default(UiUtils.INSTANCE, context, remoteViews, "rainbow", null, Boxing.boxInt(i), 8, null);
            RainbowWidgetPreference rainbowWidgetPreference = RainbowWidgetPreference.INSTANCE;
            long updateTime = rainbowWidgetPreference.getUpdateTime(getSizeType());
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z = jCurrentTimeMillis - updateTime <= TimeUnit.HOURS.toMillis(1L);
            rainbowWidgetPreference.setUpdateTime(getSizeType(), jCurrentTimeMillis);
            Bundle bundle = new Bundle();
            bundle.putString("miuiWidgetEventCode", z ? "state1" : "state10");
            bundle.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis));
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C14812 c14812 = new C14812(appWidgetManager, i, bundle, remoteViews, null);
            c14801.label = 1;
            if (BuildersKt.withContext(main, c14812, c14801) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        JobKt__JobKt.cancel$default(c14801.getContext(), (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object doUpdateWidget(Context context, AppWidgetManager appWidgetManager, int i, Continuation<? super Unit> continuation) {
        C14821 c14821;
        Context context2;
        AppWidgetManager appWidgetManager2;
        int i2;
        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2;
        Ref.ObjectRef objectRef;
        if (continuation instanceof C14821) {
            c14821 = (C14821) continuation;
            int i3 = c14821.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c14821.label = i3 - Integer.MIN_VALUE;
            } else {
                c14821 = new C14821(continuation);
            }
        } else {
            c14821 = new C14821(continuation);
        }
        C14821 c14822 = c14821;
        Object obj = c14822.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c14822.label;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 == 2 || i4 == 3) {
                } else if (i4 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                int i5 = c14822.I$0;
                objectRef = (Ref.ObjectRef) c14822.L$3;
                AppWidgetManager appWidgetManager3 = (AppWidgetManager) c14822.L$2;
                Context context3 = (Context) c14822.L$1;
                widgetRainbowProvider_2_2 = (WidgetRainbowProvider_2_2) c14822.L$0;
                ResultKt.throwOnFailure(obj);
                context2 = context3;
                i2 = i5;
                appWidgetManager2 = appWidgetManager3;
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        long beginOfToday = TimeUtils.getBeginOfToday() / ((long) 1000);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        C14832 c14832 = new C14832(objectRef2, beginOfToday, this, null);
        c14822.L$0 = this;
        context2 = context;
        c14822.L$1 = context2;
        appWidgetManager2 = appWidgetManager;
        c14822.L$2 = appWidgetManager2;
        c14822.L$3 = objectRef2;
        c14822.I$0 = i;
        c14822.label = 1;
        if (BuildersKt.withContext(io2, c14832, c14822) == coroutine_suspended) {
            return coroutine_suspended;
        }
        i2 = i;
        widgetRainbowProvider_2_2 = this;
        objectRef = objectRef2;
        DailyGoalReport dailyGoalReport = (DailyGoalReport) objectRef.element;
        if (dailyGoalReport != null) {
            Map<Integer, Pair<Integer, Integer>> itemTypeGoalAndValue = dailyGoalReport.getItemTypeGoalAndValue();
            Bitmap rainbowProgressBitmap = new RainbowWidgetHelper().getRainbowProgressBitmap(context2, widgetRainbowProvider_2_2.getRainbowIconWidthId(), widgetRainbowProvider_2_2.getRainbowIconHeightId(), dailyGoalReport.goalList());
            RemoteViews remoteViews = new RemoteViews(context2.getPackageName(), widgetRainbowProvider_2_2.getWidgetLayout());
            remoteViews.setImageViewBitmap(pqi.d, rainbowProgressBitmap);
            widgetRainbowProvider_2_2.updateWidgetValue(context2, remoteViews, itemTypeGoalAndValue);
            if (widgetRainbowProvider_2_2.getSizeType() == 1) {
                c14822.L$0 = widgetRainbowProvider_2_2;
                c14822.L$1 = context2;
                c14822.L$2 = appWidgetManager2;
                c14822.L$3 = null;
                c14822.I$0 = i2;
                c14822.label = 2;
                if (createRainbowBarChartBitmaps$default(widgetRainbowProvider_2_2, context2, remoteViews, dailyGoalReport, appWidgetManager2, i2, false, false, false, 0, 0, 0, c14822, 2016, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                c14822.L$0 = widgetRainbowProvider_2_2;
                c14822.L$1 = context2;
                c14822.L$2 = appWidgetManager2;
                c14822.L$3 = null;
                c14822.I$0 = i2;
                c14822.label = 3;
                if (widgetRainbowProvider_2_2.doFinalUpdate(context2, appWidgetManager2, i2, remoteViews, c14822) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            c14822.L$0 = null;
            c14822.L$1 = null;
            c14822.L$2 = null;
            c14822.L$3 = null;
            c14822.label = 4;
            if (showEmptyData$default(widgetRainbowProvider_2_2, context2, appWidgetManager2, i2, false, c14822, 8, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x0128  */
    /* JADX WARN: Code duplicated, block: B:38:0x0147  */
    /* JADX WARN: Code duplicated, block: B:40:0x0188 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0189  */
    /* JADX WARN: Code duplicated, block: B:43:0x01a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object doUpdateWidgetOs3(Context context, AppWidgetManager appWidgetManager, int i, Continuation<? super Unit> continuation) {
        C14841 c14841;
        AppWidgetManager appWidgetManager2;
        Context context2;
        int i2;
        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2;
        Ref.ObjectRef objectRef;
        Map<Integer, Pair<Integer, Integer>> itemTypeGoalAndValue;
        Bitmap rainbowProgressBitmap;
        RemoteViews remoteViews;
        DailyGoalReport dailyGoalReport;
        int i3;
        int dp;
        int dp2;
        if (continuation instanceof C14841) {
            c14841 = (C14841) continuation;
            int i4 = c14841.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c14841.label = i4 - Integer.MIN_VALUE;
            } else {
                c14841 = new C14841(continuation);
            }
        } else {
            c14841 = new C14841(continuation);
        }
        C14841 c14842 = c14841;
        Object obj = c14842.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c14842.label;
        if (i5 != 0) {
            if (i5 == 1) {
                int i6 = c14842.I$0;
                objectRef = (Ref.ObjectRef) c14842.L$3;
                AppWidgetManager appWidgetManager3 = (AppWidgetManager) c14842.L$2;
                Context context3 = (Context) c14842.L$1;
                WidgetRainbowProvider_2_2 widgetRainbowProvider_2_3 = (WidgetRainbowProvider_2_2) c14842.L$0;
                ResultKt.throwOnFailure(obj);
                i2 = i6;
                appWidgetManager2 = appWidgetManager3;
                context2 = context3;
                widgetRainbowProvider_2_2 = widgetRainbowProvider_2_3;
            } else if (i5 != 2) {
                if (i5 == 3 || i5 == 4) {
                } else if (i5 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                int i7 = c14842.I$0;
                RemoteViews remoteViews2 = (RemoteViews) c14842.L$6;
                rainbowProgressBitmap = (Bitmap) c14842.L$5;
                itemTypeGoalAndValue = (Map) c14842.L$4;
                DailyGoalReport dailyGoalReport2 = (DailyGoalReport) c14842.L$3;
                AppWidgetManager appWidgetManager4 = (AppWidgetManager) c14842.L$2;
                Context context4 = (Context) c14842.L$1;
                WidgetRainbowProvider_2_2 widgetRainbowProvider_2_4 = (WidgetRainbowProvider_2_2) c14842.L$0;
                ResultKt.throwOnFailure(obj);
                context2 = context4;
                dailyGoalReport = dailyGoalReport2;
                remoteViews = remoteViews2;
                i3 = i7;
                appWidgetManager2 = appWidgetManager4;
                widgetRainbowProvider_2_2 = widgetRainbowProvider_2_4;
                if (((Boolean) obj).booleanValue()) {
                    remoteViews.setInt(R.id.widget_frame, "setBackgroundResource", cli.h);
                    remoteViews.setInt(R.id.background, "setBackgroundResource", ymi.l);
                }
                remoteViews.setImageViewBitmap(pqi.d, rainbowProgressBitmap);
                widgetRainbowProvider_2_2.updateWidgetValueOs3(context2, remoteViews, itemTypeGoalAndValue);
                if (widgetRainbowProvider_2_2.getSizeType() == 1) {
                    dp = ExtUtilsKt.getDp(Boxing.boxInt(354));
                    dp2 = ExtUtilsKt.getDp(Boxing.boxInt(64));
                    c14842.L$0 = widgetRainbowProvider_2_2;
                    c14842.L$1 = context2;
                    c14842.L$2 = appWidgetManager2;
                    c14842.L$3 = null;
                    c14842.L$4 = null;
                    c14842.L$5 = null;
                    c14842.L$6 = null;
                    c14842.I$0 = i3;
                    c14842.label = 3;
                    if (createRainbowBarChartBitmaps$default(widgetRainbowProvider_2_2, context2, remoteViews, dailyGoalReport, appWidgetManager2, i3, false, false, true, dp, dp2, 100, c14842, 96, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    c14842.L$0 = widgetRainbowProvider_2_2;
                    c14842.L$1 = context2;
                    c14842.L$2 = appWidgetManager2;
                    c14842.L$3 = null;
                    c14842.L$4 = null;
                    c14842.L$5 = null;
                    c14842.L$6 = null;
                    c14842.I$0 = i3;
                    c14842.label = 4;
                    if (widgetRainbowProvider_2_2.doFinalUpdate(context2, appWidgetManager2, i3, remoteViews, c14842) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        long beginOfToday = TimeUtils.getBeginOfToday() / ((long) 1000);
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        C14852 c14852 = new C14852(objectRef2, beginOfToday, this, null);
        c14842.L$0 = this;
        c14842.L$1 = context;
        appWidgetManager2 = appWidgetManager;
        c14842.L$2 = appWidgetManager2;
        c14842.L$3 = objectRef2;
        c14842.I$0 = i;
        c14842.label = 1;
        if (BuildersKt.withContext(io2, c14852, c14842) == coroutine_suspended) {
            return coroutine_suspended;
        }
        context2 = context;
        i2 = i;
        widgetRainbowProvider_2_2 = this;
        objectRef = objectRef2;
        DailyGoalReport dailyGoalReport3 = (DailyGoalReport) objectRef.element;
        if (dailyGoalReport3 != null) {
            itemTypeGoalAndValue = dailyGoalReport3.getItemTypeGoalAndValue();
            rainbowProgressBitmap = new RainbowWidgetHelper().getRainbowProgressBitmap(context2, widgetRainbowProvider_2_2.getRainbowIconWidthId(), widgetRainbowProvider_2_2.getRainbowIconHeightId(), dailyGoalReport3.goalList());
            remoteViews = new RemoteViews(context2.getPackageName(), widgetRainbowProvider_2_2.getWidgetLayout());
            UiUtils uiUtils = UiUtils.INSTANCE;
            c14842.L$0 = widgetRainbowProvider_2_2;
            c14842.L$1 = context2;
            c14842.L$2 = appWidgetManager2;
            c14842.L$3 = dailyGoalReport3;
            c14842.L$4 = itemTypeGoalAndValue;
            c14842.L$5 = rainbowProgressBitmap;
            c14842.L$6 = remoteViews;
            c14842.I$0 = i2;
            c14842.label = 2;
            Object objIfSupportBlur = uiUtils.ifSupportBlur(context2, c14842);
            if (objIfSupportBlur == coroutine_suspended) {
                return coroutine_suspended;
            }
            dailyGoalReport = dailyGoalReport3;
            i3 = i2;
            obj = objIfSupportBlur;
            if (((Boolean) obj).booleanValue()) {
                remoteViews.setInt(R.id.widget_frame, "setBackgroundResource", cli.h);
                remoteViews.setInt(R.id.background, "setBackgroundResource", ymi.l);
            }
            remoteViews.setImageViewBitmap(pqi.d, rainbowProgressBitmap);
            widgetRainbowProvider_2_2.updateWidgetValueOs3(context2, remoteViews, itemTypeGoalAndValue);
            if (widgetRainbowProvider_2_2.getSizeType() == 1) {
                dp = ExtUtilsKt.getDp(Boxing.boxInt(354));
                dp2 = ExtUtilsKt.getDp(Boxing.boxInt(64));
                c14842.L$0 = widgetRainbowProvider_2_2;
                c14842.L$1 = context2;
                c14842.L$2 = appWidgetManager2;
                c14842.L$3 = null;
                c14842.L$4 = null;
                c14842.L$5 = null;
                c14842.L$6 = null;
                c14842.I$0 = i3;
                c14842.label = 3;
                if (createRainbowBarChartBitmaps$default(widgetRainbowProvider_2_2, context2, remoteViews, dailyGoalReport, appWidgetManager2, i3, false, false, true, dp, dp2, 100, c14842, 96, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                c14842.L$0 = widgetRainbowProvider_2_2;
                c14842.L$1 = context2;
                c14842.L$2 = appWidgetManager2;
                c14842.L$3 = null;
                c14842.L$4 = null;
                c14842.L$5 = null;
                c14842.L$6 = null;
                c14842.I$0 = i3;
                c14842.label = 4;
                if (widgetRainbowProvider_2_2.doFinalUpdate(context2, appWidgetManager2, i3, remoteViews, c14842) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            c14842.L$0 = null;
            c14842.L$1 = null;
            c14842.L$2 = null;
            c14842.L$3 = null;
            c14842.label = 5;
            if (showEmptyData$default(widgetRainbowProvider_2_2, context2, appWidgetManager2, i2, false, c14842, 8, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    private final int getItemIcon(int itemType) {
        if (itemType == 1) {
            return ymi.i;
        }
        if (itemType == 2) {
            return ymi.f40329b;
        }
        if (itemType == 3) {
            return ymi.h;
        }
        if (itemType != 4) {
            return 0;
        }
        return ymi.e;
    }

    private final int getMainIcon() {
        int sizeType = getSizeType();
        if (sizeType == 0) {
            return ymi.f;
        }
        if (sizeType != 1) {
            return 0;
        }
        return ymi.g;
    }

    private final int getRainbowIconHeightId() {
        int sizeType = getSizeType();
        if (sizeType != 0) {
            return sizeType != 1 ? rmi.e : rmi.e;
        }
        return rmi.f;
    }

    private final int getRainbowIconWidthId() {
        int sizeType = getSizeType();
        if (sizeType != 0) {
            return sizeType != 1 ? rmi.g : rmi.g;
        }
        return rmi.c;
    }

    private final int getWidgetLayout() {
        int sizeType = getSizeType();
        if (sizeType == 0) {
            return UiUtils.INSTANCE.shouldShowOs3Ui() ? tti.e : tti.d;
        }
        if (sizeType != 1) {
            return UiUtils.INSTANCE.shouldShowOs3Ui() ? tti.e : tti.d;
        }
        return UiUtils.INSTANCE.shouldShowOs3Ui() ? tti.g : tti.f;
    }

    private final void onWidgetUpdate(Context context, AppWidgetManager wMgr, int[] appWidgetIds) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new C14861(context, this, appWidgetIds, wMgr, null), 3, null);
    }

    private final void setEmptyString(Context context, RemoteViews remoteViews, int textId, int unitStringId) {
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(ni4.c(context, cli.e));
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan(ni4.c(context, cli.f));
        String str = " - " + ResourceExtKt.getString(unitStringId);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(foregroundColorSpan, 0, " - ".length(), 33);
        spannableString.setSpan(foregroundColorSpan2, " - ".length(), str.toString().length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(1.0f), 0, " - ".length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(0.72f), " - ".length(), str.length(), 33);
        remoteViews.setTextViewText(textId, spannableString);
    }

    private final void setEmptyStringOs3(Context context, RemoteViews remoteViews, int textId, int unitStringId) {
        String str = "-" + ResourceExtKt.getString(unitStringId);
        StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
        Pair pair = TuplesKt.to(SpanPropKey.FONT_WEIGHT, "450");
        Pair pair2 = TuplesKt.to(SpanPropKey.FONT_SIZE, "100%");
        SpanPropKey spanPropKey = SpanPropKey.FONT_COLOR;
        remoteViews.setTextViewText(textId, styledStringUtils.styleSmart(str, context, (116 & 2) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(pair, pair2, TuplesKt.to(spanPropKey, "@color/text_color_30"))), (116 & 4) != 0 ? null : null, (116 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : MapsKt__MapsJVMKt.mapOf(TuplesKt.to("-", new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey, "@color/text_color"), TuplesKt.to(SpanPropKey.MARGIN, "4dp;remote=true;relative=18sp"))))), (116 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (116 & 32) != 0 ? Locale.getDefault() : null, (116 & 64) != 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showEmptyData(Context context, AppWidgetManager appWidgetManager, int i, boolean z, Continuation<? super Unit> continuation) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), getWidgetLayout());
        if (z) {
            updateWidgetValue(context, remoteViews, MapsKt__MapsKt.emptyMap());
            if (getSizeType() == 1) {
                Object objCreateRainbowBarChartBitmaps$default = createRainbowBarChartBitmaps$default(this, context, remoteViews, null, appWidgetManager, i, true, true, false, 0, 0, 0, continuation, 1920, null);
                return objCreateRainbowBarChartBitmaps$default == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCreateRainbowBarChartBitmaps$default : Unit.INSTANCE;
            }
            Object objDoFinalUpdate = doFinalUpdate(context, appWidgetManager, i, remoteViews, continuation);
            return objDoFinalUpdate == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDoFinalUpdate : Unit.INSTANCE;
        }
        setEmptyString(context, remoteViews, pqi.s, ezi.f17223a);
        setEmptyString(context, remoteViews, pqi.B, ezi.D);
        setEmptyString(context, remoteViews, pqi.C, ezi.m);
        if (getSizeType() == 1) {
            Object objCreateRainbowBarChartBitmaps$default2 = createRainbowBarChartBitmaps$default(this, context, remoteViews, null, appWidgetManager, i, true, true, false, 0, 0, 0, continuation, 1920, null);
            return objCreateRainbowBarChartBitmaps$default2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCreateRainbowBarChartBitmaps$default2 : Unit.INSTANCE;
        }
        Object objDoFinalUpdate2 = doFinalUpdate(context, appWidgetManager, i, remoteViews, continuation);
        return objDoFinalUpdate2 == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDoFinalUpdate2 : Unit.INSTANCE;
    }

    public static /* synthetic */ Object showEmptyData$default(WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2, Context context, AppWidgetManager appWidgetManager, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmptyData");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        return widgetRainbowProvider_2_2.showEmptyData(context, appWidgetManager, i, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object showEmptyDataOs3(Context context, AppWidgetManager appWidgetManager, int i, boolean z, Continuation<? super Unit> continuation) {
        C14871 c14871;
        AppWidgetManager appWidgetManager2;
        int i2;
        boolean z2;
        RemoteViews remoteViews;
        WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2;
        Context context2 = context;
        if (continuation instanceof C14871) {
            c14871 = (C14871) continuation;
            int i3 = c14871.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c14871.label = i3 - Integer.MIN_VALUE;
            } else {
                c14871 = new C14871(continuation);
            }
        } else {
            c14871 = new C14871(continuation);
        }
        Object obj = c14871.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c14871.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), getWidgetLayout());
            UiUtils uiUtils = UiUtils.INSTANCE;
            c14871.L$0 = this;
            c14871.L$1 = context2;
            appWidgetManager2 = appWidgetManager;
            c14871.L$2 = appWidgetManager2;
            c14871.L$3 = remoteViews2;
            i2 = i;
            c14871.I$0 = i2;
            z2 = z;
            c14871.Z$0 = z2;
            c14871.label = 1;
            Object objIfSupportBlur = uiUtils.ifSupportBlur(context2, c14871);
            if (objIfSupportBlur == coroutine_suspended) {
                return coroutine_suspended;
            }
            remoteViews = remoteViews2;
            obj = objIfSupportBlur;
            widgetRainbowProvider_2_2 = this;
        } else {
            if (i4 != 1) {
                if (i4 == 2) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i4 == 3) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i4 == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i4 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            boolean z3 = c14871.Z$0;
            int i5 = c14871.I$0;
            RemoteViews remoteViews3 = (RemoteViews) c14871.L$3;
            AppWidgetManager appWidgetManager3 = (AppWidgetManager) c14871.L$2;
            Context context3 = (Context) c14871.L$1;
            WidgetRainbowProvider_2_2 widgetRainbowProvider_2_3 = (WidgetRainbowProvider_2_2) c14871.L$0;
            ResultKt.throwOnFailure(obj);
            z2 = z3;
            context2 = context3;
            i2 = i5;
            widgetRainbowProvider_2_2 = widgetRainbowProvider_2_3;
            remoteViews = remoteViews3;
            appWidgetManager2 = appWidgetManager3;
        }
        if (((Boolean) obj).booleanValue()) {
            remoteViews.setInt(R.id.widget_frame, "setBackgroundResource", cli.h);
            remoteViews.setInt(R.id.background, "setBackgroundResource", ymi.l);
        }
        if (z2) {
            widgetRainbowProvider_2_2.updateWidgetValueOs3(context2, remoteViews, MapsKt__MapsKt.emptyMap());
            if (widgetRainbowProvider_2_2.getSizeType() != 1) {
                c14871.L$0 = null;
                c14871.L$1 = null;
                c14871.L$2 = null;
                c14871.L$3 = null;
                c14871.label = 3;
                if (widgetRainbowProvider_2_2.doFinalUpdate(context2, appWidgetManager2, i2, remoteViews, c14871) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            int dp = ExtUtilsKt.getDp(Boxing.boxInt(354));
            int dp2 = ExtUtilsKt.getDp(Boxing.boxInt(64));
            c14871.L$0 = null;
            c14871.L$1 = null;
            c14871.L$2 = null;
            c14871.L$3 = null;
            c14871.label = 2;
            if (widgetRainbowProvider_2_2.createRainbowBarChartBitmaps(context2, remoteViews, null, appWidgetManager2, i2, true, true, true, dp, dp2, 100, c14871) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        widgetRainbowProvider_2_2.setEmptyStringOs3(context2, remoteViews, pqi.s, ezi.f17223a);
        widgetRainbowProvider_2_2.setEmptyStringOs3(context2, remoteViews, pqi.B, ezi.D);
        widgetRainbowProvider_2_2.setEmptyStringOs3(context2, remoteViews, pqi.C, ezi.m);
        if (widgetRainbowProvider_2_2.getSizeType() != 1) {
            c14871.L$0 = null;
            c14871.L$1 = null;
            c14871.L$2 = null;
            c14871.L$3 = null;
            c14871.label = 5;
            if (widgetRainbowProvider_2_2.doFinalUpdate(context2, appWidgetManager2, i2, remoteViews, c14871) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        int dp3 = ExtUtilsKt.getDp(Boxing.boxInt(354));
        int dp4 = ExtUtilsKt.getDp(Boxing.boxInt(64));
        c14871.L$0 = null;
        c14871.L$1 = null;
        c14871.L$2 = null;
        c14871.L$3 = null;
        c14871.label = 4;
        if (widgetRainbowProvider_2_2.createRainbowBarChartBitmaps(context2, remoteViews, null, appWidgetManager2, i2, true, true, true, dp3, dp4, 100, c14871) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object showEmptyDataOs3$default(WidgetRainbowProvider_2_2 widgetRainbowProvider_2_2, Context context, AppWidgetManager appWidgetManager, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showEmptyDataOs3");
        }
        if ((i2 & 8) != 0) {
            z = true;
        }
        return widgetRainbowProvider_2_2.showEmptyDataOs3(context, appWidgetManager, i, z, continuation);
    }

    private final void updateWidgetValue(Context context, RemoteViews remoteViews, Map<Integer, Pair<Integer, Integer>> goalProgressMap) {
        int i;
        int i2;
        int i3;
        Pair<Integer, Integer> pair;
        int i4 = 2;
        if (goalProgressMap.isEmpty()) {
            remoteViews.setImageViewResource(pqi.d, getMainIcon());
            remoteViews.setImageViewResource(pqi.f, getItemIcon(2));
            remoteViews.setContentDescription(R.id.background, context.getString(ezi.O));
            return;
        }
        for (Map.Entry<Integer, Pair<Integer, Integer>> entry : goalProgressMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<Integer, Integer> value = entry.getValue();
            int iIntValue2 = value.getFirst().intValue();
            int iIntValue3 = value.getSecond().intValue();
            int itemIcon = getItemIcon(iIntValue);
            if (iIntValue == 1) {
                i = pqi.B;
                i2 = pqi.g;
            } else if (iIntValue == i4) {
                i = pqi.s;
                i2 = pqi.f;
            } else if (iIntValue == 3 || iIntValue == 4) {
                i = pqi.C;
                i2 = pqi.h;
            } else {
                i = 0;
                i2 = 0;
            }
            String str = iIntValue3 + "/" + iIntValue2;
            SpannableString spannableString = new SpannableString(str);
            spannableString.setSpan(new ForegroundColorSpan(ni4.c(context, cli.e)), 0, String.valueOf(iIntValue3).length(), 33);
            spannableString.setSpan(new RelativeSizeSpan(1.0f), 0, String.valueOf(iIntValue3).length(), 33);
            spannableString.setSpan(new ForegroundColorSpan(ni4.c(context, cli.f)), String.valueOf(iIntValue3).length(), str.length(), 33);
            spannableString.setSpan(new RelativeSizeSpan(1.0f), String.valueOf(iIntValue3).length(), str.length(), 33);
            remoteViews.setTextViewText(i, spannableString);
            remoteViews.setImageViewResource(i2, itemIcon);
            Pair<Integer, Integer> pair2 = goalProgressMap.get(2);
            Intrinsics.checkNotNull(pair2);
            Pair<Integer, Integer> pair3 = pair2;
            Pair<Integer, Integer> pair4 = goalProgressMap.get(1);
            Intrinsics.checkNotNull(pair4);
            Pair<Integer, Integer> pair5 = pair4;
            if (goalProgressMap.containsKey(4)) {
                i3 = ezi.Q;
                pair = goalProgressMap.get(4);
                Intrinsics.checkNotNull(pair);
            } else {
                i3 = ezi.P;
                pair = goalProgressMap.get(3);
                Intrinsics.checkNotNull(pair);
            }
            Pair<Integer, Integer> pair6 = pair;
            remoteViews.setContentDescription(R.id.background, context.getString(i3, pair3.getSecond(), pair3.getFirst(), pair5.getSecond(), pair5.getFirst(), pair6.getSecond(), pair6.getFirst()));
            i4 = 2;
        }
    }

    private final void updateWidgetValueOs3(Context context, RemoteViews remoteViews, Map<Integer, Pair<Integer, Integer>> goalProgressMap) {
        if (goalProgressMap.isEmpty()) {
            remoteViews.setImageViewResource(pqi.d, getMainIcon());
            remoteViews.setImageViewResource(pqi.f, getItemIcon(2));
            remoteViews.setContentDescription(R.id.background, context.getString(ezi.O));
            return;
        }
        for (Map.Entry<Integer, Pair<Integer, Integer>> entry : goalProgressMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<Integer, Integer> value = entry.getValue();
            CharSequence charSequenceUpdateWidgetValueOs3$buildStyledProgress = updateWidgetValueOs3$buildStyledProgress(context, value.component2().intValue(), value.component1().intValue());
            if (iIntValue == 1) {
                remoteViews.setTextViewText(pqi.B, charSequenceUpdateWidgetValueOs3$buildStyledProgress);
                remoteViews.setImageViewResource(pqi.g, getItemIcon(iIntValue));
            } else if (iIntValue == 2) {
                remoteViews.setTextViewText(pqi.s, charSequenceUpdateWidgetValueOs3$buildStyledProgress);
                remoteViews.setImageViewResource(pqi.f, getItemIcon(iIntValue));
            } else if (iIntValue == 3 || iIntValue == 4) {
                remoteViews.setTextViewText(pqi.C, charSequenceUpdateWidgetValueOs3$buildStyledProgress);
                remoteViews.setImageViewResource(pqi.h, getItemIcon(iIntValue));
            }
        }
        Pair<Integer, Integer> pair = goalProgressMap.get(2);
        Intrinsics.checkNotNull(pair);
        Pair<Integer, Integer> pair2 = pair;
        Pair<Integer, Integer> pair3 = goalProgressMap.get(1);
        Intrinsics.checkNotNull(pair3);
        Pair<Integer, Integer> pair4 = pair3;
        Pair pair5 = goalProgressMap.containsKey(4) ? TuplesKt.to(4, Integer.valueOf(ezi.Q)) : TuplesKt.to(3, Integer.valueOf(ezi.P));
        int iIntValue2 = ((Number) pair5.component1()).intValue();
        int iIntValue3 = ((Number) pair5.component2()).intValue();
        Pair<Integer, Integer> pair6 = goalProgressMap.get(Integer.valueOf(iIntValue2));
        Intrinsics.checkNotNull(pair6);
        Pair<Integer, Integer> pair7 = pair6;
        remoteViews.setContentDescription(R.id.background, context.getString(iIntValue3, pair2.getSecond(), pair2.getFirst(), pair4.getSecond(), pair4.getFirst(), pair7.getSecond(), pair7.getFirst()));
    }

    private static final CharSequence updateWidgetValueOs3$buildStyledProgress(Context context, int i, int i2) {
        SpanPropKey spanPropKey = SpanPropKey.FONT_COLOR;
        StyledStringUtils.CssStyle cssStyle = new StyledStringUtils.CssStyle(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(spanPropKey, "@color/text_color")));
        StyledStringUtils.CssStyle cssStyle2 = new StyledStringUtils.CssStyle(MapsKt__MapsJVMKt.mapOf(TuplesKt.to(spanPropKey, "@color/text_color_30")));
        return StyledStringUtils.INSTANCE.getStyledString(context, "%1$s%2$s", (474 & 2) != 0 ? null : null, (List<StyledStringUtils.StyledArg>) ((474 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsKt.listOf((Object[]) new StyledStringUtils.StyledArg[]{new StyledStringUtils.StyledArg(String.valueOf(i), cssStyle), new StyledStringUtils.StyledArg("/" + i2, cssStyle2)})), (474 & 8) != 0, (474 & 16) != 0 ? Locale.getDefault() : null, (474 & 32) != 0, (474 & 64) != 0 ? null : null, (Map<String, StyledStringUtils.CssStyle>) ((474 & 128) != 0 ? MapsKt__MapsKt.emptyMap() : null), (List<StyledStringUtils.SegmentStyle>) ((474 & 256) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null));
    }

    public int getSizeType() {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
    
        if (r2.equals(com.mi.health.WidgetConstants.APP_WIDGET_UPDATE_ACTION) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
    
        if (r2.equals("recent_data_changed_broadcast") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
    
        if (r2.equals("android.intent.action.DATE_CHANGED") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
    
        if (r2.equals(com.mi.health.WidgetConstants.MIUI_APP_WIDGET_UPDATE_ACTION) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
    
        onUpdate(r6, r0, r7.getIntArrayExtra("appWidgetIds"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0081, code lost:
    
        if (r2.equals("android.intent.action.TIME_SET") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008a, code lost:
    
        if (r2.equals("android.intent.action.TIMEZONE_CHANGED") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
    
        if (r2.equals(com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.AppearanceModule.APPEARANCE_CHANGED_ACTION) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r2.equals(com.mi.health.WidgetConstants.ACTION_UI_MODE_CHANGED) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009f, code lost:
    
        onUpdate(r6, r0, null);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onReceive(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.Nullable android.content.Intent r7) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mi.health.rainbow.WidgetRainbowProvider_2_2.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider
    public void onRecentDataChanged(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        super.onRecentDataChanged(ctx);
        Logger.d(this.TAG, "recent data changed!");
        onUpdate(ctx, AppWidgetManager.getInstance(ctx), null);
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider, android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @Nullable AppWidgetManager wMgr, @Nullable int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onUpdate(context, wMgr, appWidgetIds);
        if (appWidgetIds == null || appWidgetIds.length == 0) {
            appWidgetIds = wMgr != null ? wMgr.getAppWidgetIds(new ComponentName(context, getClass())) : null;
        }
        if (wMgr == null || appWidgetIds == null) {
            return;
        }
        if (!(appWidgetIds.length == 0)) {
            onWidgetUpdate(context, wMgr, appWidgetIds);
        }
    }
}
