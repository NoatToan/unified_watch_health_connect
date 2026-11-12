package com.mi.health.exercise.widget;

import android.R;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.RemoteViews;
import com.mi.health.utils.UiUtils;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.aggregation.record.StepRecord;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.common.utils.SystemProperties;
import defpackage.cli;
import defpackage.gfo;
import defpackage.lyi;
import defpackage.pqi;
import defpackage.rmi;
import defpackage.tti;
import defpackage.ymi;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J6\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ.\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010 J6\u0010!\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002J>\u0010%\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\u001fR$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u0014\u0010\u000e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\b¨\u0006'"}, d2 = {"Lcom/mi/health/exercise/widget/StepRemoteWidgetProvider;", "Lcom/mi/health/exercise/widget/StepRingWidgetProvider_2_1;", "<init>", "()V", "value", "", "ringDimen", "getRingDimen", "()I", "setRingDimen", "(I)V", "ringStrokeWidth", "getRingStrokeWidth", "setRingStrokeWidth", "widgetLayoutId", "getWidgetLayoutId", "onWidgetRemoteUiUpdate", "", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetId", "goals", "dailyStepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/DailyStepReport;", "grant", "", "widgetRemoteUiUpdateOs3", "updateRemoteView", "remoteViews", "Landroid/widget/RemoteViews;", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/widget/RemoteViews;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "widgetRemoteUiUpdateOs2", "prepareHourlySteps", "", "", "widgetRemoteUiUpdate", "inRemoteViews", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStepRemoteWidgetProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StepRemoteWidgetProvider.kt\ncom/mi/health/exercise/widget/StepRemoteWidgetProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,414:1\n1#2:415\n1863#3,2:416\n*S KotlinDebug\n*F\n+ 1 StepRemoteWidgetProvider.kt\ncom/mi/health/exercise/widget/StepRemoteWidgetProvider\n*L\n308#1:416,2\n*E\n"})
public class StepRemoteWidgetProvider extends StepRingWidgetProvider_2_1 {

    /* JADX INFO: renamed from: com.mi.health.exercise.widget.StepRemoteWidgetProvider$updateRemoteView$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.exercise.widget.StepRemoteWidgetProvider$updateRemoteView$2", f = "StepRemoteWidgetProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ AppWidgetManager $appWidgetManager;
        final /* synthetic */ Bundle $options;
        final /* synthetic */ RemoteViews $remoteViews;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AppWidgetManager appWidgetManager, int i, Bundle bundle, RemoteViews remoteViews, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$appWidgetManager = appWidgetManager;
            this.$appWidgetId = i;
            this.$options = bundle;
            this.$remoteViews = remoteViews;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$appWidgetManager, this.$appWidgetId, this.$options, this.$remoteViews, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$appWidgetManager.updateAppWidgetOptions(this.$appWidgetId, this.$options);
            this.$appWidgetManager.updateAppWidget(this.$appWidgetId, this.$remoteViews);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.exercise.widget.StepRemoteWidgetProvider$widgetRemoteUiUpdateOs2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.exercise.widget.StepRemoteWidgetProvider$widgetRemoteUiUpdateOs2$1", f = "StepRemoteWidgetProvider.kt", i = {}, l = {257}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ AppWidgetManager $appWidgetManager;
        final /* synthetic */ Context $context;
        final /* synthetic */ DailyStepReport $dailyStepReport;
        final /* synthetic */ int $goals;
        final /* synthetic */ boolean $grant;
        final /* synthetic */ RemoteViews $remoteViews;
        int label;

        /* JADX INFO: renamed from: com.mi.health.exercise.widget.StepRemoteWidgetProvider$widgetRemoteUiUpdateOs2$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.mi.health.exercise.widget.StepRemoteWidgetProvider$widgetRemoteUiUpdateOs2$1$1", f = "StepRemoteWidgetProvider.kt", i = {}, l = {278}, m = "invokeSuspend", n = {}, s = {})
        public static final class C03071 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ int $appWidgetId;
            final /* synthetic */ Context $context;
            final /* synthetic */ DailyStepReport $dailyStepReport;
            final /* synthetic */ boolean $grant;
            final /* synthetic */ RemoteViews $remoteViews;
            int label;
            final /* synthetic */ StepRemoteWidgetProvider this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03071(boolean z, RemoteViews remoteViews, StepRemoteWidgetProvider stepRemoteWidgetProvider, DailyStepReport dailyStepReport, int i, Context context, Continuation<? super C03071> continuation) {
                super(2, continuation);
                this.$grant = z;
                this.$remoteViews = remoteViews;
                this.this$0 = stepRemoteWidgetProvider;
                this.$dailyStepReport = dailyStepReport;
                this.$appWidgetId = i;
                this.$context = context;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C03071(this.$grant, this.$remoteViews, this.this$0, this.$dailyStepReport, this.$appWidgetId, this.$context, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objCreateBarChartBitmap;
                Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$grant) {
                        this.$remoteViews.setViewVisibility(pqi.K, 0);
                        this.$remoteViews.setViewVisibility(pqi.G, 8);
                        this.$remoteViews.setViewVisibility(pqi.I, 8);
                        this.$remoteViews.setViewVisibility(pqi.L, 0);
                        this.$remoteViews.setViewVisibility(pqi.M, 0);
                        this.$remoteViews.setViewVisibility(pqi.J, 0);
                        this.$remoteViews.setViewVisibility(pqi.f30646b, 0);
                        List listPrepareHourlySteps = this.this$0.prepareHourlySteps(this.$dailyStepReport);
                        Logger.i(this.this$0.getTAG(), "prepareHourlySteps.. appWidgetId: " + this.$appWidgetId + ";steps:" + listPrepareHourlySteps);
                        UiUtils uiUtils = UiUtils.INSTANCE;
                        int color = ExtUtilsKt.getColor(cli.o);
                        Context context = this.$context;
                        this.label = 1;
                        objCreateBarChartBitmap = uiUtils.createBarChartBitmap(context, listPrepareHourlySteps, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : 0, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : 0, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 100, (4816 & 2048) != 0 ? false : false, (4816 & 4096) != 0 ? null : null, this);
                        if (objCreateBarChartBitmap == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objCreateBarChartBitmap = obj;
                this.$remoteViews.setImageViewBitmap(pqi.f30645a, (Bitmap) objCreateBarChartBitmap);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C03071) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, AppWidgetManager appWidgetManager, int i, int i2, DailyStepReport dailyStepReport, boolean z, RemoteViews remoteViews, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$appWidgetManager = appWidgetManager;
            this.$appWidgetId = i;
            this.$goals = i2;
            this.$dailyStepReport = dailyStepReport;
            this.$grant = z;
            this.$remoteViews = remoteViews;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return StepRemoteWidgetProvider.this.new AnonymousClass1(this.$context, this.$appWidgetManager, this.$appWidgetId, this.$goals, this.$dailyStepReport, this.$grant, this.$remoteViews, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher coroutineDispatcher = Dispatchers.getDefault();
                C03071 c03071 = new C03071(this.$grant, this.$remoteViews, StepRemoteWidgetProvider.this, this.$dailyStepReport, this.$appWidgetId, this.$context, null);
                this.label = 1;
                if (BuildersKt.withContext(coroutineDispatcher, c03071, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            StepRemoteWidgetProvider.this.widgetRemoteUiUpdate(this.$context, this.$appWidgetManager, this.$appWidgetId, this.$goals, this.$dailyStepReport, this.$grant, this.$remoteViews);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.exercise.widget.StepRemoteWidgetProvider$widgetRemoteUiUpdateOs3$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.exercise.widget.StepRemoteWidgetProvider$widgetRemoteUiUpdateOs3$1", f = "StepRemoteWidgetProvider.kt", i = {}, l = {93, 120, 130, 201, 211}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ AppWidgetManager $appWidgetManager;
        final /* synthetic */ Context $context;
        final /* synthetic */ DailyStepReport $dailyStepReport;
        final /* synthetic */ int $goals;
        final /* synthetic */ boolean $grant;
        final /* synthetic */ RemoteViews $remoteViews;
        final /* synthetic */ Resources $resources;
        int label;
        final /* synthetic */ StepRemoteWidgetProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14751(Context context, RemoteViews remoteViews, boolean z, StepRemoteWidgetProvider stepRemoteWidgetProvider, DailyStepReport dailyStepReport, int i, AppWidgetManager appWidgetManager, int i2, Resources resources, Continuation<? super C14751> continuation) {
            super(2, continuation);
            this.$context = context;
            this.$remoteViews = remoteViews;
            this.$grant = z;
            this.this$0 = stepRemoteWidgetProvider;
            this.$dailyStepReport = dailyStepReport;
            this.$appWidgetId = i;
            this.$appWidgetManager = appWidgetManager;
            this.$goals = i2;
            this.$resources = resources;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14751(this.$context, this.$remoteViews, this.$grant, this.this$0, this.$dailyStepReport, this.$appWidgetId, this.$appWidgetManager, this.$goals, this.$resources, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x0112 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:41:0x0293 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objIfSupportBlur;
            Object objCreateBarChartBitmap;
            Object obj2;
            Object objCreateBarChartBitmap2;
            Object obj3;
            StepRemoteWidgetProvider stepRemoteWidgetProvider;
            Context context;
            AppWidgetManager appWidgetManager;
            int i;
            RemoteViews remoteViews;
            StepRemoteWidgetProvider stepRemoteWidgetProvider2;
            Context context2;
            AppWidgetManager appWidgetManager2;
            int i2;
            RemoteViews remoteViews2;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = this.label;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                UiUtils uiUtils = UiUtils.INSTANCE;
                Context context3 = this.$context;
                this.label = 1;
                objIfSupportBlur = uiUtils.ifSupportBlur(context3, this);
                if (objIfSupportBlur == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        ResultKt.throwOnFailure(obj);
                        objCreateBarChartBitmap2 = obj;
                        obj3 = coroutine_suspended;
                        this.$remoteViews.setImageViewBitmap(pqi.f30645a, (Bitmap) objCreateBarChartBitmap2);
                        stepRemoteWidgetProvider = this.this$0;
                        context = this.$context;
                        appWidgetManager = this.$appWidgetManager;
                        i = this.$appWidgetId;
                        remoteViews = this.$remoteViews;
                        this.label = 3;
                        if (stepRemoteWidgetProvider.updateRemoteView(context, appWidgetManager, i, remoteViews, this) == obj3) {
                            return obj3;
                        }
                    } else {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                ResultKt.throwOnFailure(obj);
                                objCreateBarChartBitmap = obj;
                                obj2 = coroutine_suspended;
                                this.$remoteViews.setImageViewBitmap(pqi.f30645a, (Bitmap) objCreateBarChartBitmap);
                                stepRemoteWidgetProvider2 = this.this$0;
                                context2 = this.$context;
                                appWidgetManager2 = this.$appWidgetManager;
                                i2 = this.$appWidgetId;
                                remoteViews2 = this.$remoteViews;
                                this.label = 5;
                                if (stepRemoteWidgetProvider2.updateRemoteView(context2, appWidgetManager2, i2, remoteViews2, this) == obj2) {
                                    return obj2;
                                }
                            } else {
                                if (i3 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj);
                            }
                            return Unit.INSTANCE;
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                objIfSupportBlur = obj;
            }
            if (((Boolean) objIfSupportBlur).booleanValue()) {
                this.$remoteViews.setInt(R.id.widget_frame, "setBackgroundResource", cli.h);
                this.$remoteViews.setInt(R.id.background, "setBackgroundResource", ymi.l);
            }
            if (!this.$grant) {
                List listPrepareHourlySteps = this.this$0.prepareHourlySteps(this.$dailyStepReport);
                this.$remoteViews.setViewVisibility(pqi.H, 0);
                this.$remoteViews.setViewVisibility(pqi.I, 0);
                this.$remoteViews.setViewVisibility(pqi.L, 8);
                this.$remoteViews.setViewVisibility(pqi.j, 0);
                this.$remoteViews.setViewVisibility(pqi.i, 8);
                Logger.i(this.this$0.getTAG(), "prepareHourlySteps.. appWidgetId: " + this.$appWidgetId + ";steps:" + listPrepareHourlySteps);
                UiUtils uiUtils2 = UiUtils.INSTANCE;
                int color = ExtUtilsKt.getColor(cli.o);
                Context context4 = this.$context;
                this.label = 2;
                objCreateBarChartBitmap2 = uiUtils2.createBarChartBitmap(context4, listPrepareHourlySteps, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : 0, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : 0, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 100, (4816 & 2048) != 0 ? false : true, (4816 & 4096) != 0 ? null : null, this);
                obj3 = coroutine_suspended;
                if (objCreateBarChartBitmap2 == obj3) {
                    return obj3;
                }
                this.$remoteViews.setImageViewBitmap(pqi.f30645a, (Bitmap) objCreateBarChartBitmap2);
                stepRemoteWidgetProvider = this.this$0;
                context = this.$context;
                appWidgetManager = this.$appWidgetManager;
                i = this.$appWidgetId;
                remoteViews = this.$remoteViews;
                this.label = 3;
                if (stepRemoteWidgetProvider.updateRemoteView(context, appWidgetManager, i, remoteViews, this) == obj3) {
                    return obj3;
                }
                return Unit.INSTANCE;
            }
            gfo.c(this.$context, System.currentTimeMillis());
            this.$remoteViews.setViewVisibility(pqi.H, 8);
            this.$remoteViews.setViewVisibility(pqi.I, 8);
            this.$remoteViews.setViewVisibility(pqi.L, 0);
            this.$remoteViews.setViewVisibility(pqi.j, 8);
            this.$remoteViews.setViewVisibility(pqi.i, 0);
            int steps = this.$dailyStepReport.getSteps();
            int i4 = this.$goals;
            float f = i4 != 0 ? steps / i4 : 0.0f;
            Logger.i(this.this$0.getTAG(), "finishPercent:" + f);
            StepRingWidgetProvider_2_1.updateRingViewO3$default(this.this$0, this.$context, this.$remoteViews, f, 0, 0, 0, 0, 120, null);
            StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
            Context context5 = this.$context;
            int i5 = lyi.common_unit_step_desc;
            SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
            Pair pair = TuplesKt.to(spanPropKey, "450");
            SpanPropKey spanPropKey2 = SpanPropKey.FONT_SIZE;
            this.$remoteViews.setTextViewText(pqi.M, styledStringUtils.getStyledString(context5, i5, steps, (1008 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(pair, TuplesKt.to(spanPropKey2, "50%"))), (1008 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : CollectionsKt__CollectionsJVMKt.listOf(new StyledStringUtils.StyledArg(Boxing.boxInt(steps), new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey2, "100%"), TuplesKt.to(spanPropKey, "380"), TuplesKt.to(SpanPropKey.MARGIN, "2dp;remote=true"))))), (1008 & 16) != 0, (1008 & 32) != 0 ? Locale.getDefault() : null, (1008 & 64) != 0, (1008 & 128) != 0 ? null : null, (1008 & 256) != 0 ? MapsKt__MapsKt.emptyMap() : null, (1008 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null));
            RemoteViews remoteViews3 = this.$remoteViews;
            int i6 = pqi.J;
            Context context6 = this.$context;
            int i7 = lyi.f;
            int i8 = this.$goals;
            remoteViews3.setTextViewText(i6, ResourceExtKt.getQuantityString(context6, i7, i8, Boxing.boxInt(i8)));
            StepRemoteWidgetProvider stepRemoteWidgetProvider3 = this.this$0;
            RemoteViews remoteViews4 = this.$remoteViews;
            Resources resources = this.$resources;
            Intrinsics.checkNotNull(resources);
            stepRemoteWidgetProvider3.setDefaultDescription(remoteViews4, resources, steps, this.$goals, f);
            List listPrepareHourlySteps2 = this.this$0.prepareHourlySteps(this.$dailyStepReport);
            Logger.i(this.this$0.getTAG(), "prepareHourlySteps.. appWidgetId: " + this.$appWidgetId + ";steps:" + listPrepareHourlySteps2);
            UiUtils uiUtils3 = UiUtils.INSTANCE;
            int color2 = ExtUtilsKt.getColor(cli.o);
            Context context7 = this.$context;
            this.label = 4;
            objCreateBarChartBitmap = uiUtils3.createBarChartBitmap(context7, listPrepareHourlySteps2, (4816 & 4) != 0 ? ExtUtilsKt.getDp(Double.valueOf(266.82d)) : 0, (4816 & 8) != 0 ? ExtUtilsKt.getDp(104) : 0, (4816 & 16) != 0 ? ExtUtilsKt.getColor(cli.g) : 0, (4816 & 32) != 0 ? Color.parseColor("#FFC107") : color2, (4816 & 64) != 0 ? 20.0f : 0.0f, (4816 & 128) != 0 ? 20.0f : 0.0f, (4816 & 256) != 0 ? 0.5f : 0.0f, (4816 & 512) != 0, (4816 & 1024) != 0 ? 0 : 100, (4816 & 2048) != 0 ? false : true, (4816 & 4096) != 0 ? null : null, this);
            obj2 = coroutine_suspended;
            if (objCreateBarChartBitmap == obj2) {
                return obj2;
            }
            this.$remoteViews.setImageViewBitmap(pqi.f30645a, (Bitmap) objCreateBarChartBitmap);
            stepRemoteWidgetProvider2 = this.this$0;
            context2 = this.$context;
            appWidgetManager2 = this.$appWidgetManager;
            i2 = this.$appWidgetId;
            remoteViews2 = this.$remoteViews;
            this.label = 5;
            if (stepRemoteWidgetProvider2.updateRemoteView(context2, appWidgetManager2, i2, remoteViews2, this) == obj2) {
                return obj2;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Float> prepareHourlySteps(DailyStepReport dailyStepReport) {
        List<StepRecord> stepRecords;
        ArrayList arrayList = new ArrayList(24);
        for (int i = 0; i < 24; i++) {
            arrayList.add(Float.valueOf(0.0f));
        }
        if (dailyStepReport != null && (stepRecords = dailyStepReport.getStepRecords()) != null) {
            for (StepRecord stepRecord : stepRecords) {
                int timeSegmentIndex = UiUtils.INSTANCE.getTimeSegmentIndex(stepRecord.getTime(), 24);
                arrayList.set(timeSegmentIndex, Float.valueOf(((Number) arrayList.get(timeSegmentIndex)).floatValue() + stepRecord.getSteps()));
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List prepareHourlySteps$default(StepRemoteWidgetProvider stepRemoteWidgetProvider, DailyStepReport dailyStepReport, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepareHourlySteps");
        }
        if ((i & 1) != 0) {
            dailyStepReport = null;
        }
        return stepRemoteWidgetProvider.prepareHourlySteps(dailyStepReport);
    }

    @Override // com.mi.health.exercise.widget.StepRingWidgetProvider_2_1
    public int getRingDimen() {
        return rmi.h;
    }

    @Override // com.mi.health.exercise.widget.StepRingWidgetProvider_2_1
    public int getRingStrokeWidth() {
        return rmi.i;
    }

    @Override // com.mi.health.exercise.widget.StepRingWidgetProvider_2_1, com.mi.health.exercise.widget.StepWidgetProviderBase
    public int getWidgetLayoutId() {
        return UiUtils.INSTANCE.shouldShowOs3Ui() ? tti.s : tti.f35030r;
    }

    @Override // com.mi.health.exercise.widget.StepRingWidgetProvider_2_1, com.mi.health.exercise.widget.StepWidgetProviderBase
    public void onWidgetRemoteUiUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, int goals, @NotNull DailyStepReport dailyStepReport, boolean grant) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(dailyStepReport, "dailyStepReport");
        if (UiUtils.INSTANCE.shouldShowOs3Ui()) {
            widgetRemoteUiUpdateOs3(context, appWidgetManager, appWidgetId, goals, dailyStepReport, grant);
        } else {
            widgetRemoteUiUpdateOs2(context, appWidgetManager, appWidgetId, goals, dailyStepReport, grant);
        }
    }

    @Override // com.mi.health.exercise.widget.StepRingWidgetProvider_2_1
    public void setRingDimen(int i) {
    }

    @Override // com.mi.health.exercise.widget.StepRingWidgetProvider_2_1
    public void setRingStrokeWidth(int i) {
    }

    @Nullable
    public final Object updateRemoteView(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int i, @NotNull RemoteViews remoteViews, @NotNull Continuation<? super Unit> continuation) {
        UiUtils.updateWidgetDefaultBackgroundIntent$default(UiUtils.INSTANCE, context, remoteViews, "steps", null, Boxing.boxInt(i), 8, null);
        long jB = gfo.b(context);
        Logger.i(getTAG(), "widget last update time : " + jB);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = jCurrentTimeMillis - jB <= TimeUnit.HOURS.toMillis(1L);
        Bundle bundle = new Bundle();
        bundle.putString("miuiWidgetEventCode", z ? "state1" : "state10");
        bundle.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis));
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new AnonymousClass2(appWidgetManager, i, bundle, remoteViews, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    public final void widgetRemoteUiUpdate(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, int goals, @NotNull DailyStepReport dailyStepReport, boolean grant, @NotNull RemoteViews inRemoteViews) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(dailyStepReport, "dailyStepReport");
        Intrinsics.checkNotNullParameter(inRemoteViews, "inRemoteViews");
        int steps = dailyStepReport.getSteps();
        boolean zAreEqual = Intrinsics.areEqual(SystemProperties.INSTANCE.getString("persist.sys.background_blur_supported", "false"), "true");
        Logger.i(getTAG(), "onWidgetRemoteUiUpdate.. appWidgetId: " + appWidgetId + ";steps:" + steps + ";goals:" + goals + ";grant:" + grant + ";supportBackGroundBlur:" + zAreEqual);
        gfo.c(context, System.currentTimeMillis());
        float f = goals != 0 ? steps / goals : 0.0f;
        Logger.i(getTAG(), "finishPercent:" + f);
        Resources resources = context.getResources();
        if (appWidgetManager.getAppWidgetOptions(appWidgetId).getInt("appWidgetMinHeight") <= 50) {
            setRingDimen(rmi.f32709k);
            setRingStrokeWidth(rmi.m);
        }
        Logger.i(getTAG(), "ringDimen = " + getRingDimen() + ",ringStrokeWidth = " + getRingStrokeWidth());
        updateRingView(context, inRemoteViews, f, getRingDimen(), getRingStrokeWidth());
        inRemoteViews.setImageViewResource(pqi.n, ymi.j);
        String quantityString = resources.getQuantityString(lyi.f25558b, goals, Integer.valueOf(goals));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String quantityString2 = context.getResources().getQuantityString(lyi.common_unit_step_desc, steps, Integer.valueOf(steps));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        UiUtils uiUtils = UiUtils.INSTANCE;
        SpannableString spannableStringTextNumberSizeChangeWithSpacing$default = UiUtils.textNumberSizeChangeWithSpacing$default(uiUtils, quantityString2, 26, 26, 13, null, 0, 48, null);
        if (grant) {
            inRemoteViews.setTextViewText(pqi.M, spannableStringTextNumberSizeChangeWithSpacing$default);
            inRemoteViews.setTextViewText(pqi.J, quantityString);
            Intrinsics.checkNotNull(resources);
            z = false;
            setDefaultDescription(inRemoteViews, resources, steps, goals, f);
        } else {
            z = false;
            String quantityString3 = context.getResources().getQuantityString(lyi.common_unit_step_desc, 0, 0);
            Intrinsics.checkNotNullExpressionValue(quantityString3, "getQuantityString(...)");
            inRemoteViews.setTextViewText(pqi.M, UiUtils.textNumberSizeChangeWithSpacing$default(uiUtils, quantityString3, 26, 26, 13, "-", 0, 32, null));
            inRemoteViews.setTextViewText(pqi.J, "--");
        }
        boolean z2 = z;
        UiUtils.updateWidgetDefaultBackgroundIntent$default(uiUtils, context, inRemoteViews, "steps", null, Integer.valueOf(appWidgetId), 8, null);
        long jB = gfo.b(context);
        Logger.i(getTAG(), "widget last update time : " + jB);
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z3 = jCurrentTimeMillis - jB <= TimeUnit.HOURS.toMillis(1L) ? true : z2;
        Bundle bundle = new Bundle();
        bundle.putString("miuiWidgetEventCode", z3 ? "state1" : "state10");
        bundle.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis));
        appWidgetManager.updateAppWidgetOptions(appWidgetId, bundle);
        appWidgetManager.updateAppWidget(appWidgetId, inRemoteViews);
    }

    public final void widgetRemoteUiUpdateOs2(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, int goals, @NotNull DailyStepReport dailyStepReport, boolean grant) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(dailyStepReport, "dailyStepReport");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new AnonymousClass1(context, appWidgetManager, appWidgetId, goals, dailyStepReport, grant, new RemoteViews(context.getPackageName(), getWidgetLayoutId()), null), 3, null);
    }

    public final void widgetRemoteUiUpdateOs3(@NotNull Context context, @NotNull AppWidgetManager appWidgetManager, int appWidgetId, int goals, @NotNull DailyStepReport dailyStepReport, boolean grant) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appWidgetManager, "appWidgetManager");
        Intrinsics.checkNotNullParameter(dailyStepReport, "dailyStepReport");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new C14751(context, new RemoteViews(context.getPackageName(), getWidgetLayoutId()), grant, this, dailyStepReport, appWidgetId, appWidgetManager, goals, context.getResources(), null), 3, null);
    }
}
