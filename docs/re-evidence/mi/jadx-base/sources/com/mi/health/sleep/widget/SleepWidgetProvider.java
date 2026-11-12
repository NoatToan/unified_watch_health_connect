package com.mi.health.sleep.widget;

import android.R;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.mi.health.HealthBaseAppWidgetProvider;
import com.mi.health.router.business.IntentHelper;
import com.mi.health.utils.ScreenUtil;
import com.mi.health.utils.UiUtils;
import com.xiaomi.fit.data.common.data.aireco.AirEcoIntentionConstants;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.api.repository.ISleepRepository;
import com.xiaomi.fit.fitness.export.data.aggregation.AllDaySleepReport;
import com.xiaomi.fit.fitness.export.data.item.SleepSegmentReport;
import com.xiaomi.fit.fitness.export.di.FitnessDataExtKt;
import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.SpanPropKey;
import com.xiaomi.fitness.common.utils.StyledStringUtils;
import com.xiaomi.fitness.common.utils.TimeDateUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import defpackage.cli;
import defpackage.ezi;
import defpackage.pqi;
import defpackage.tti;
import defpackage.ymi;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J$\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J \u0010\u0015\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J&\u0010\u0016\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0019J&\u0010\u001a\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0019J(\u0010\u001b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0082@¢\u0006\u0002\u0010 J&\u0010!\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0019J \u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J2\u0010$\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010%\u001a\u00020&H\u0082@¢\u0006\u0002\u0010'J&\u0010(\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0082@¢\u0006\u0002\u0010\u0019J\b\u0010)\u001a\u00020\u0018H\u0002J\u0010\u0010*\u001a\u00020\u00052\u0006\u0010+\u001a\u00020,H\u0002R\u0018\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006-"}, d2 = {"Lcom/mi/health/sleep/widget/SleepWidgetProvider;", "Lcom/mi/health/HealthBaseAppWidgetProvider;", "<init>", "()V", "TAG", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "onRecentDataChanged", "", "ctx", "Landroid/content/Context;", "onReceive", "context", "intent", "Landroid/content/Intent;", "onUpdate", "wMgr", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "onWidgetUpdate", "showEmptyDataOs3", "appWidgetId", "", "(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doUpdateWidgetOs3", "updateWidgetValueOs3", "remoteViews", "Landroid/widget/RemoteViews;", "sleepReport", "Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showEmptyDataOs2", "setOnClickPendingIntent", "widgetId", "updateWidgetValueOs2", "isGrant", "", "(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/xiaomi/fit/fitness/export/data/aggregation/AllDaySleepReport;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doUpdateWidgetOs2", "getWidgetLayout", "getHMTime", "time", "", "fitness-data-provider_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSleepWidgetProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SleepWidgetProvider.kt\ncom/mi/health/sleep/widget/SleepWidgetProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,584:1\n774#2:585\n865#2,2:586\n1872#2,3:588\n774#2:591\n865#2,2:592\n1872#2,3:594\n*S KotlinDebug\n*F\n+ 1 SleepWidgetProvider.kt\ncom/mi/health/sleep/widget/SleepWidgetProvider\n*L\n336#1:585\n336#1:586,2\n353#1:588,3\n510#1:591\n510#1:592,2\n527#1:594,3\n*E\n"})
public final class SleepWidgetProvider extends HealthBaseAppWidgetProvider {
    private final String TAG = SleepWidgetProvider.class.getSimpleName();

    /* JADX INFO: renamed from: com.mi.health.sleep.widget.SleepWidgetProvider$doUpdateWidgetOs2$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_SLEEP_2_2, f = "SleepWidgetProvider.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {550, 557, 566}, m = "doUpdateWidgetOs2", n = {"this", "context", "wMgr", "sleepReport", "appWidgetId", "this", "context", "wMgr", "remoteViews", "appWidgetId"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
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
            return SleepWidgetProvider.this.doUpdateWidgetOs2(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sleep.widget.SleepWidgetProvider$doUpdateWidgetOs2$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.sleep.widget.SleepWidgetProvider$doUpdateWidgetOs2$2", f = "SleepWidgetProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AllDaySleepReport> $sleepReport;
        final /* synthetic */ long $today;
        int label;
        final /* synthetic */ SleepWidgetProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Ref.ObjectRef<AllDaySleepReport> objectRef, long j, SleepWidgetProvider sleepWidgetProvider, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$sleepReport = objectRef;
            this.$today = j;
            this.this$0 = sleepWidgetProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$sleepReport, this.$today, this.this$0, continuation);
        }

        /* JADX WARN: Type inference failed for: r5v6, types: [T, com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$sleepReport.element = ((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).getReport(null, this.$today);
            String str = this.this$0.TAG;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            Logger.i(str, "update sleep widget: load report = " + this.$sleepReport.element);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sleep.widget.SleepWidgetProvider$doUpdateWidgetOs2$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.sleep.widget.SleepWidgetProvider$doUpdateWidgetOs2$3", f = "SleepWidgetProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ Bundle $options;
        final /* synthetic */ RemoteViews $remoteViews;
        final /* synthetic */ AppWidgetManager $wMgr;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AppWidgetManager appWidgetManager, int i, Bundle bundle, RemoteViews remoteViews, Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
            this.$wMgr = appWidgetManager;
            this.$appWidgetId = i;
            this.$options = bundle;
            this.$remoteViews = remoteViews;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass3(this.$wMgr, this.$appWidgetId, this.$options, this.$remoteViews, continuation);
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
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sleep.widget.SleepWidgetProvider$doUpdateWidgetOs3$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_SLEEP_2_2, f = "SleepWidgetProvider.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {SportReportBaseParser.ReportType.entryTime, SportReportBaseParser.ReportType.descentCount, 202, 211}, m = "doUpdateWidgetOs3", n = {"this", "context", "wMgr", "sleepReport", "appWidgetId", "this", "context", "wMgr", "sleepReport", "remoteViews", "appWidgetId", "this", "context", "wMgr", "remoteViews", "appWidgetId"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0"})
    public static final class C14881 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C14881(Continuation<? super C14881> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepWidgetProvider.this.doUpdateWidgetOs3(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sleep.widget.SleepWidgetProvider$doUpdateWidgetOs3$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.sleep.widget.SleepWidgetProvider$doUpdateWidgetOs3$2", f = "SleepWidgetProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14892 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<AllDaySleepReport> $sleepReport;
        final /* synthetic */ long $today;
        int label;
        final /* synthetic */ SleepWidgetProvider this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14892(Ref.ObjectRef<AllDaySleepReport> objectRef, long j, SleepWidgetProvider sleepWidgetProvider, Continuation<? super C14892> continuation) {
            super(2, continuation);
            this.$sleepReport = objectRef;
            this.$today = j;
            this.this$0 = sleepWidgetProvider;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14892(this.$sleepReport, this.$today, this.this$0, continuation);
        }

        /* JADX WARN: Type inference failed for: r5v6, types: [T, com.xiaomi.fit.fitness.export.data.aggregation.DailyBasicReport] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$sleepReport.element = ((ISleepRepository) FitnessDataExtKt.getInstance(IRepositoryProvider.INSTANCE).getRepository(ISleepRepository.class)).getReport(null, this.$today);
            String str = this.this$0.TAG;
            Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$p(...)");
            Logger.i(str, "update sleep widget: load report = " + this.$sleepReport.element);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14892) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sleep.widget.SleepWidgetProvider$doUpdateWidgetOs3$3, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.sleep.widget.SleepWidgetProvider$doUpdateWidgetOs3$3", f = "SleepWidgetProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14903 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ Bundle $options;
        final /* synthetic */ RemoteViews $remoteViews;
        final /* synthetic */ AppWidgetManager $wMgr;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14903(AppWidgetManager appWidgetManager, int i, Bundle bundle, RemoteViews remoteViews, Continuation<? super C14903> continuation) {
            super(2, continuation);
            this.$wMgr = appWidgetManager;
            this.$appWidgetId = i;
            this.$options = bundle;
            this.$remoteViews = remoteViews;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14903(this.$wMgr, this.$appWidgetId, this.$options, this.$remoteViews, continuation);
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
            return ((C14903) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sleep.widget.SleepWidgetProvider$onWidgetUpdate$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.sleep.widget.SleepWidgetProvider$onWidgetUpdate$1", f = "SleepWidgetProvider.kt", i = {}, l = {127, 131, 144, 148}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14911 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int[] $appWidgetIds;
        final /* synthetic */ Context $context;
        final /* synthetic */ AppWidgetManager $wMgr;
        int I$0;
        int I$1;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14911(int[] iArr, Context context, AppWidgetManager appWidgetManager, Continuation<? super C14911> continuation) {
            super(2, continuation);
            this.$appWidgetIds = iArr;
            this.$context = context;
            this.$wMgr = appWidgetManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepWidgetProvider.this.new C14911(this.$appWidgetIds, this.$context, this.$wMgr, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:56:0x0111  */
        /* JADX WARN: Code duplicated, block: B:58:0x0127 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c0 -> B:38:0x00c3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00e0 -> B:44:0x00e3). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x0105 -> B:53:0x0108). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0125 -> B:59:0x0128). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mi.health.sleep.widget.SleepWidgetProvider.C14911.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sleep.widget.SleepWidgetProvider$showEmptyDataOs2$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.sleep.widget.SleepWidgetProvider$showEmptyDataOs2$2", f = "SleepWidgetProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14922 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ RemoteViews $remoteViews;
        final /* synthetic */ AppWidgetManager $wMgr;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14922(AppWidgetManager appWidgetManager, int i, RemoteViews remoteViews, Continuation<? super C14922> continuation) {
            super(2, continuation);
            this.$wMgr = appWidgetManager;
            this.$appWidgetId = i;
            this.$remoteViews = remoteViews;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14922(this.$wMgr, this.$appWidgetId, this.$remoteViews, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$wMgr.updateAppWidget(this.$appWidgetId, this.$remoteViews);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14922) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sleep.widget.SleepWidgetProvider$showEmptyDataOs3$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = AirEcoIntentionConstants.WIDGET_PROVIDER_NAME_SLEEP_2_2, f = "SleepWidgetProvider.kt", i = {0, 0, 0, 0, 0}, l = {159, 173}, m = "showEmptyDataOs3", n = {"this", "context", "wMgr", "remoteViews", "appWidgetId"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"})
    public static final class C14931 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C14931(Continuation<? super C14931> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SleepWidgetProvider.this.showEmptyDataOs3(null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.mi.health.sleep.widget.SleepWidgetProvider$showEmptyDataOs3$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.sleep.widget.SleepWidgetProvider$showEmptyDataOs3$2", f = "SleepWidgetProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C14942 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $appWidgetId;
        final /* synthetic */ RemoteViews $remoteViews;
        final /* synthetic */ AppWidgetManager $wMgr;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C14942(AppWidgetManager appWidgetManager, int i, RemoteViews remoteViews, Continuation<? super C14942> continuation) {
            super(2, continuation);
            this.$wMgr = appWidgetManager;
            this.$appWidgetId = i;
            this.$remoteViews = remoteViews;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C14942(this.$wMgr, this.$appWidgetId, this.$remoteViews, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$wMgr.updateAppWidget(this.$appWidgetId, this.$remoteViews);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C14942) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x011b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object doUpdateWidgetOs2(Context context, AppWidgetManager appWidgetManager, int i, Continuation<? super Unit> continuation) {
        AnonymousClass1 anonymousClass1;
        Ref.ObjectRef objectRef;
        Context context2;
        AppWidgetManager appWidgetManager2;
        int i2;
        SleepWidgetProvider sleepWidgetProvider;
        Object obj;
        AppWidgetManager appWidgetManager3;
        int i3;
        RemoteViews remoteViews;
        MainCoroutineDispatcher main;
        AnonymousClass3 anonymousClass3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i4 = anonymousClass1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i4 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj2 = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = anonymousClass2.label;
        if (i5 != 0) {
            if (i5 == 1) {
                int i6 = anonymousClass2.I$0;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) anonymousClass2.L$3;
                AppWidgetManager appWidgetManager4 = (AppWidgetManager) anonymousClass2.L$2;
                Context context3 = (Context) anonymousClass2.L$1;
                sleepWidgetProvider = (SleepWidgetProvider) anonymousClass2.L$0;
                ResultKt.throwOnFailure(obj2);
                objectRef = objectRef2;
                context2 = context3;
                i2 = i6;
                appWidgetManager2 = appWidgetManager4;
            } else if (i5 == 2) {
                int i7 = anonymousClass2.I$0;
                RemoteViews remoteViews2 = (RemoteViews) anonymousClass2.L$3;
                AppWidgetManager appWidgetManager5 = (AppWidgetManager) anonymousClass2.L$2;
                Context context4 = (Context) anonymousClass2.L$1;
                sleepWidgetProvider = (SleepWidgetProvider) anonymousClass2.L$0;
                ResultKt.throwOnFailure(obj2);
                i3 = i7;
                remoteViews = remoteViews2;
                appWidgetManager3 = appWidgetManager5;
                context2 = context4;
                obj = coroutine_suspended;
                sleepWidgetProvider.setOnClickPendingIntent(i3, context2, remoteViews);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Bundle bundle = new Bundle();
                bundle.putString("miuiWidgetEventCode", "state1");
                bundle.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis));
                main = Dispatchers.getMain();
                anonymousClass3 = new AnonymousClass3(appWidgetManager3, i3, bundle, remoteViews, null);
                anonymousClass2.L$0 = null;
                anonymousClass2.L$1 = null;
                anonymousClass2.L$2 = null;
                anonymousClass2.L$3 = null;
                anonymousClass2.label = 3;
                if (BuildersKt.withContext(main, anonymousClass3, anonymousClass2) == obj) {
                    return obj;
                }
            } else {
                if (i5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj2);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj2);
        long beginOfToday = TimeUtils.getBeginOfToday() / ((long) 1000);
        objectRef = new Ref.ObjectRef();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass2 anonymousClass4 = new AnonymousClass2(objectRef, beginOfToday, this, null);
        anonymousClass2.L$0 = this;
        context2 = context;
        anonymousClass2.L$1 = context2;
        appWidgetManager2 = appWidgetManager;
        anonymousClass2.L$2 = appWidgetManager2;
        anonymousClass2.L$3 = objectRef;
        i2 = i;
        anonymousClass2.I$0 = i2;
        anonymousClass2.label = 1;
        if (BuildersKt.withContext(io2, anonymousClass4, anonymousClass2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        sleepWidgetProvider = this;
        RemoteViews remoteViews3 = new RemoteViews(context2.getPackageName(), sleepWidgetProvider.getWidgetLayout());
        AllDaySleepReport allDaySleepReport = (AllDaySleepReport) objectRef.element;
        anonymousClass2.L$0 = sleepWidgetProvider;
        anonymousClass2.L$1 = context2;
        anonymousClass2.L$2 = appWidgetManager2;
        anonymousClass2.L$3 = remoteViews3;
        anonymousClass2.I$0 = i2;
        anonymousClass2.label = 2;
        obj = coroutine_suspended;
        if (updateWidgetValueOs2$default(sleepWidgetProvider, context2, remoteViews3, allDaySleepReport, false, anonymousClass2, 8, null) == obj) {
            return obj;
        }
        appWidgetManager3 = appWidgetManager2;
        i3 = i2;
        remoteViews = remoteViews3;
        sleepWidgetProvider.setOnClickPendingIntent(i3, context2, remoteViews);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        Bundle bundle2 = new Bundle();
        bundle2.putString("miuiWidgetEventCode", "state1");
        bundle2.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis2));
        main = Dispatchers.getMain();
        anonymousClass3 = new AnonymousClass3(appWidgetManager3, i3, bundle2, remoteViews, null);
        anonymousClass2.L$0 = null;
        anonymousClass2.L$1 = null;
        anonymousClass2.L$2 = null;
        anonymousClass2.L$3 = null;
        anonymousClass2.label = 3;
        if (BuildersKt.withContext(main, anonymousClass3, anonymousClass2) == obj) {
            return obj;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:31:0x0109  */
    /* JADX WARN: Code duplicated, block: B:34:0x0132 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0133  */
    /* JADX WARN: Code duplicated, block: B:38:0x0175 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object doUpdateWidgetOs3(Context context, AppWidgetManager appWidgetManager, int i, Continuation<? super Unit> continuation) {
        C14881 c14881;
        Context context2;
        AppWidgetManager appWidgetManager2;
        int i2;
        SleepWidgetProvider sleepWidgetProvider;
        Ref.ObjectRef objectRef;
        SleepWidgetProvider sleepWidgetProvider2;
        Context context3;
        AppWidgetManager appWidgetManager3;
        int i3;
        RemoteViews remoteViews;
        Ref.ObjectRef objectRef2;
        AllDaySleepReport allDaySleepReport;
        AppWidgetManager appWidgetManager4;
        Context context4;
        SleepWidgetProvider sleepWidgetProvider3;
        MainCoroutineDispatcher main;
        C14903 c14903;
        if (continuation instanceof C14881) {
            c14881 = (C14881) continuation;
            int i4 = c14881.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c14881.label = i4 - Integer.MIN_VALUE;
            } else {
                c14881 = new C14881(continuation);
            }
        } else {
            c14881 = new C14881(continuation);
        }
        C14881 c14882 = c14881;
        Object obj = c14882.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = c14882.label;
        if (i5 != 0) {
            if (i5 == 1) {
                int i6 = c14882.I$0;
                Ref.ObjectRef objectRef3 = (Ref.ObjectRef) c14882.L$3;
                AppWidgetManager appWidgetManager5 = (AppWidgetManager) c14882.L$2;
                Context context5 = (Context) c14882.L$1;
                sleepWidgetProvider = (SleepWidgetProvider) c14882.L$0;
                ResultKt.throwOnFailure(obj);
                context2 = context5;
                i2 = i6;
                appWidgetManager2 = appWidgetManager5;
                objectRef = objectRef3;
            } else if (i5 == 2) {
                i3 = c14882.I$0;
                remoteViews = (RemoteViews) c14882.L$4;
                Ref.ObjectRef objectRef4 = (Ref.ObjectRef) c14882.L$3;
                AppWidgetManager appWidgetManager6 = (AppWidgetManager) c14882.L$2;
                context3 = (Context) c14882.L$1;
                sleepWidgetProvider2 = (SleepWidgetProvider) c14882.L$0;
                ResultKt.throwOnFailure(obj);
                objectRef2 = objectRef4;
                appWidgetManager3 = appWidgetManager6;
                if (((Boolean) obj).booleanValue()) {
                    remoteViews.setInt(R.id.widget_frame, "setBackgroundResource", cli.h);
                    remoteViews.setInt(R.id.background, "setBackgroundResource", ymi.l);
                }
                allDaySleepReport = (AllDaySleepReport) objectRef2.element;
                c14882.L$0 = sleepWidgetProvider2;
                c14882.L$1 = context3;
                c14882.L$2 = appWidgetManager3;
                c14882.L$3 = remoteViews;
                c14882.L$4 = null;
                c14882.I$0 = i3;
                c14882.label = 3;
                if (sleepWidgetProvider2.updateWidgetValueOs3(context3, remoteViews, allDaySleepReport, c14882) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                appWidgetManager4 = appWidgetManager3;
                context4 = context3;
                sleepWidgetProvider3 = sleepWidgetProvider2;
                sleepWidgetProvider3.setOnClickPendingIntent(i3, context4, remoteViews);
                long jCurrentTimeMillis = System.currentTimeMillis();
                Bundle bundle = new Bundle();
                bundle.putString("miuiWidgetEventCode", "state1");
                bundle.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis));
                main = Dispatchers.getMain();
                c14903 = new C14903(appWidgetManager4, i3, bundle, remoteViews, null);
                c14882.L$0 = null;
                c14882.L$1 = null;
                c14882.L$2 = null;
                c14882.L$3 = null;
                c14882.label = 4;
                if (BuildersKt.withContext(main, c14903, c14882) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i5 == 3) {
                i3 = c14882.I$0;
                remoteViews = (RemoteViews) c14882.L$3;
                AppWidgetManager appWidgetManager7 = (AppWidgetManager) c14882.L$2;
                context4 = (Context) c14882.L$1;
                sleepWidgetProvider3 = (SleepWidgetProvider) c14882.L$0;
                ResultKt.throwOnFailure(obj);
                appWidgetManager4 = appWidgetManager7;
                sleepWidgetProvider3.setOnClickPendingIntent(i3, context4, remoteViews);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Bundle bundle2 = new Bundle();
                bundle2.putString("miuiWidgetEventCode", "state1");
                bundle2.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis2));
                main = Dispatchers.getMain();
                c14903 = new C14903(appWidgetManager4, i3, bundle2, remoteViews, null);
                c14882.L$0 = null;
                c14882.L$1 = null;
                c14882.L$2 = null;
                c14882.L$3 = null;
                c14882.label = 4;
                if (BuildersKt.withContext(main, c14903, c14882) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i5 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        long beginOfToday = TimeUtils.getBeginOfToday() / ((long) 1000);
        Ref.ObjectRef objectRef5 = new Ref.ObjectRef();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        C14892 c14892 = new C14892(objectRef5, beginOfToday, this, null);
        c14882.L$0 = this;
        context2 = context;
        c14882.L$1 = context2;
        appWidgetManager2 = appWidgetManager;
        c14882.L$2 = appWidgetManager2;
        c14882.L$3 = objectRef5;
        i2 = i;
        c14882.I$0 = i2;
        c14882.label = 1;
        if (BuildersKt.withContext(io2, c14892, c14882) == coroutine_suspended) {
            return coroutine_suspended;
        }
        sleepWidgetProvider = this;
        objectRef = objectRef5;
        RemoteViews remoteViews2 = new RemoteViews(context2.getPackageName(), tti.l);
        UiUtils uiUtils = UiUtils.INSTANCE;
        c14882.L$0 = sleepWidgetProvider;
        c14882.L$1 = context2;
        c14882.L$2 = appWidgetManager2;
        c14882.L$3 = objectRef;
        c14882.L$4 = remoteViews2;
        c14882.I$0 = i2;
        c14882.label = 2;
        Object objIfSupportBlur = uiUtils.ifSupportBlur(context2, c14882);
        if (objIfSupportBlur == coroutine_suspended) {
            return coroutine_suspended;
        }
        sleepWidgetProvider2 = sleepWidgetProvider;
        context3 = context2;
        obj = objIfSupportBlur;
        Ref.ObjectRef objectRef6 = objectRef;
        appWidgetManager3 = appWidgetManager2;
        i3 = i2;
        remoteViews = remoteViews2;
        objectRef2 = objectRef6;
        if (((Boolean) obj).booleanValue()) {
            remoteViews.setInt(R.id.widget_frame, "setBackgroundResource", cli.h);
            remoteViews.setInt(R.id.background, "setBackgroundResource", ymi.l);
        }
        allDaySleepReport = (AllDaySleepReport) objectRef2.element;
        c14882.L$0 = sleepWidgetProvider2;
        c14882.L$1 = context3;
        c14882.L$2 = appWidgetManager3;
        c14882.L$3 = remoteViews;
        c14882.L$4 = null;
        c14882.I$0 = i3;
        c14882.label = 3;
        if (sleepWidgetProvider2.updateWidgetValueOs3(context3, remoteViews, allDaySleepReport, c14882) == coroutine_suspended) {
            return coroutine_suspended;
        }
        appWidgetManager4 = appWidgetManager3;
        context4 = context3;
        sleepWidgetProvider3 = sleepWidgetProvider2;
        sleepWidgetProvider3.setOnClickPendingIntent(i3, context4, remoteViews);
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        Bundle bundle3 = new Bundle();
        bundle3.putString("miuiWidgetEventCode", "state1");
        bundle3.putString("miuiWidgetTimestamp", String.valueOf(jCurrentTimeMillis3));
        main = Dispatchers.getMain();
        c14903 = new C14903(appWidgetManager4, i3, bundle3, remoteViews, null);
        c14882.L$0 = null;
        c14882.L$1 = null;
        c14882.L$2 = null;
        c14882.L$3 = null;
        c14882.label = 4;
        if (BuildersKt.withContext(main, c14903, c14882) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    private final String getHMTime(long time) {
        return TimeUtils.formatDate(TimeUtils.FORMAT_H_M, Long.valueOf(time * ((long) 1000)));
    }

    private final int getWidgetLayout() {
        return tti.f35029k;
    }

    private final void onWidgetUpdate(Context context, AppWidgetManager wMgr, int[] appWidgetIds) {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new C14911(appWidgetIds, context, wMgr, null), 3, null);
    }

    private final void setOnClickPendingIntent(int widgetId, Context context, RemoteViews remoteViews) {
        UiUtils.updateWidgetDefaultBackgroundIntent$default(UiUtils.INSTANCE, context, remoteViews, IntentHelper.ACTION_SLEEP, null, Integer.valueOf(widgetId), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showEmptyDataOs2(Context context, AppWidgetManager appWidgetManager, int i, Continuation<? super Unit> continuation) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), getWidgetLayout());
        remoteViews.setViewVisibility(pqi.F, 8);
        remoteViews.setViewVisibility(pqi.A, 0);
        setOnClickPendingIntent(i, context, remoteViews);
        Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C14922(appWidgetManager, i, remoteViews, null), continuation);
        return objWithContext == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object showEmptyDataOs3(Context context, AppWidgetManager appWidgetManager, int i, Continuation<? super Unit> continuation) {
        C14931 c14931;
        SleepWidgetProvider sleepWidgetProvider;
        Context context2;
        RemoteViews remoteViews;
        if (continuation instanceof C14931) {
            c14931 = (C14931) continuation;
            int i2 = c14931.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c14931.label = i2 - Integer.MIN_VALUE;
            } else {
                c14931 = new C14931(continuation);
            }
        } else {
            c14931 = new C14931(continuation);
        }
        Object obj = c14931.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c14931.label;
        if (i3 != 0) {
            if (i3 == 1) {
                i = c14931.I$0;
                remoteViews = (RemoteViews) c14931.L$3;
                appWidgetManager = (AppWidgetManager) c14931.L$2;
                context2 = (Context) c14931.L$1;
                sleepWidgetProvider = (SleepWidgetProvider) c14931.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        RemoteViews remoteViews2 = new RemoteViews(context.getPackageName(), tti.m);
        UiUtils uiUtils = UiUtils.INSTANCE;
        c14931.L$0 = this;
        c14931.L$1 = context;
        c14931.L$2 = appWidgetManager;
        c14931.L$3 = remoteViews2;
        c14931.I$0 = i;
        c14931.label = 1;
        Object objIfSupportBlur = uiUtils.ifSupportBlur(context, c14931);
        if (objIfSupportBlur == coroutine_suspended) {
            return coroutine_suspended;
        }
        sleepWidgetProvider = this;
        context2 = context;
        remoteViews = remoteViews2;
        obj = objIfSupportBlur;
        if (((Boolean) obj).booleanValue()) {
            remoteViews.setInt(R.id.widget_frame, "setBackgroundResource", cli.h);
            remoteViews.setInt(R.id.background, "setBackgroundResource", ymi.l);
        }
        sleepWidgetProvider.setOnClickPendingIntent(i, context2, remoteViews);
        MainCoroutineDispatcher main = Dispatchers.getMain();
        C14942 c14942 = new C14942(appWidgetManager, i, remoteViews, null);
        c14931.L$0 = null;
        c14931.L$1 = null;
        c14931.L$2 = null;
        c14931.L$3 = null;
        c14931.label = 2;
        if (BuildersKt.withContext(main, c14942, c14931) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:47:0x012e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0138  */
    /* JADX WARN: Code duplicated, block: B:51:0x014d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0168  */
    /* JADX WARN: Code duplicated, block: B:58:0x0188  */
    /* JADX WARN: Code duplicated, block: B:63:0x019f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x0197 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0182 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Iterable, java.util.LinkedList] */
    public final Object updateWidgetValueOs2(Context context, RemoteViews remoteViews, AllDaySleepReport allDaySleepReport, boolean z, Continuation<? super Unit> continuation) {
        List<SleepSegmentReport> sleepSegments;
        String str;
        String str2;
        int i;
        UiUtils.SleepDurationResult sleepDurationResultCalculateLongSleepDuration$default;
        UserInfoManager accountManagerExtKt;
        String hMFormatInMinutes;
        List<SleepSegmentReport> sleepSegments2;
        AbstractCollection arrayList;
        ?? r7;
        StringBuilder sb;
        String string;
        LinkedList linkedList;
        int dailySleepGoal;
        String dateStr;
        String dateStr2;
        String str3;
        Unit unit;
        String string2 = ResourceExtKt.getString(ezi.f17224b);
        String string3 = ResourceExtKt.getString(ezi.c);
        String str4 = AppUtil.isRTLDirection() ? string3 : string2;
        if (!AppUtil.isRTLDirection()) {
            string2 = string3;
        }
        remoteViews.setTextViewText(pqi.z, str4);
        remoteViews.setTextViewText(pqi.y, string2);
        int i2 = 0;
        if (!z) {
            remoteViews.setViewVisibility(pqi.F, 8);
            remoteViews.setViewVisibility(pqi.A, 0);
        }
        if (allDaySleepReport == null || (sleepSegments = allDaySleepReport.getSleepSegments()) == null || sleepSegments.isEmpty()) {
            String string4 = context.getString(ezi.L);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            remoteViews.setViewVisibility(pqi.F, 8);
            remoteViews.setViewVisibility(pqi.A, 0);
            remoteViews.setImageViewResource(pqi.e, ymi.f40328a);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str5 = String.format("%s,%s", Arrays.copyOf(new Object[]{context.getString(ezi.N), string4}, 2));
            Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
            remoteViews.setContentDescription(R.id.background, str5);
        } else {
            List<SleepSegmentReport> sleepSegments3 = allDaySleepReport.getSleepSegments();
            if (sleepSegments3 != null) {
                String TAG = this.TAG;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Logger.i(TAG, "updateWidgetValue: sleepSegments = " + sleepSegments3);
                str = null;
                str2 = "format(...)";
                i = 2;
                Bitmap bitmapCreateSleepChartBitmap$default = UiUtils.createSleepChartBitmap$default(UiUtils.INSTANCE, context, sleepSegments3, remoteViews, 0, 0, 24, null);
                if (bitmapCreateSleepChartBitmap$default != null) {
                    remoteViews.setImageViewBitmap(pqi.e, bitmapCreateSleepChartBitmap$default);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                }
                UiUtils uiUtils = UiUtils.INSTANCE;
                sleepDurationResultCalculateLongSleepDuration$default = UiUtils.calculateLongSleepDuration$default(uiUtils, allDaySleepReport.getSleepSegments(), false, i, str);
                String hMFormatInSecond = TimeDateUtil.getHMFormatInSecond(context, sleepDurationResultCalculateLongSleepDuration$default.getTotalDuration());
                if (sleepDurationResultCalculateLongSleepDuration$default.getStartTime() > 0 && sleepDurationResultCalculateLongSleepDuration$default.getEndTime() > 0 && sleepDurationResultCalculateLongSleepDuration$default.getStartTime() < sleepDurationResultCalculateLongSleepDuration$default.getEndTime()) {
                    dateStr = TimeDateUtil.getDateStr(sleepDurationResultCalculateLongSleepDuration$default.getStartTime(), TimeUtils.FORMAT_H_M);
                    dateStr2 = TimeDateUtil.getDateStr(sleepDurationResultCalculateLongSleepDuration$default.getEndTime(), TimeUtils.FORMAT_H_M);
                    if (AppUtil.isRTLDirection()) {
                        str3 = dateStr2;
                    } else {
                        str3 = dateStr;
                    }
                    if (!AppUtil.isRTLDirection()) {
                        dateStr = dateStr2;
                    }
                    remoteViews.setTextViewText(pqi.z, str3);
                    remoteViews.setTextViewText(pqi.y, dateStr);
                }
                remoteViews.setViewVisibility(pqi.F, 0);
                remoteViews.setTextViewText(pqi.F, UiUtils.textNumberSizeChangeWithSpacing$default(uiUtils, hMFormatInSecond, 26, 26, 13, null, 0, 48, null));
                accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
                if (accountManagerExtKt != null) {
                    dailySleepGoal = UserInfoManager.getUserProfile$default(accountManagerExtKt, false, 1, str).getDailySleepGoal();
                    if (dailySleepGoal == 0) {
                        dailySleepGoal = 480;
                    }
                    hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(context, dailySleepGoal);
                    Intrinsics.checkNotNullExpressionValue(context.getString(ezi.M, hMFormatInMinutes), "getString(...)");
                } else {
                    hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(context, 480L);
                }
                String string5 = context.getString(ezi.T, hMFormatInSecond, hMFormatInMinutes);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                sleepSegments2 = allDaySleepReport.getSleepSegments();
                if (sleepSegments2 == null) {
                    sleepSegments2 = CollectionsKt__CollectionsKt.emptyList();
                }
                LinkedList linkedList2 = new LinkedList(sleepSegments2);
                Collections.sort(linkedList2, new Comparator<SleepSegmentReport>() { // from class: com.mi.health.sleep.widget.SleepWidgetProvider.updateWidgetValueOs2.4
                    @Override // java.util.Comparator
                    public int compare(SleepSegmentReport a2, SleepSegmentReport b2) {
                        Intrinsics.checkNotNullParameter(a2, "a");
                        Intrinsics.checkNotNullParameter(b2, "b");
                        return Intrinsics.compare(a2.getWakeupTime(), b2.getWakeupTime());
                    }
                });
                arrayList = new ArrayList();
                for (Object obj : linkedList2) {
                    if (((SleepSegmentReport) obj).getSleepDuration() >= 180) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList instanceof LinkedList) {
                    linkedList = (LinkedList) arrayList;
                } else {
                    r7 = str;
                }
                if (r7 != 0 || r7.size() != 1) {
                    r7 = linkedList;
                    r7 = linkedList;
                    sb = new StringBuilder();
                    if (r7 != 0) {
                        for (Object obj2 : r7) {
                            int i3 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) obj2;
                            sb.append(context.getString(ezi.R, Boxing.boxInt(i3), getHMTime(sleepSegmentReport.getBedTime()), getHMTime(sleepSegmentReport.getWakeupTime())));
                            sb.append(",");
                            i2 = i3;
                        }
                    }
                    string = sb.toString();
                } else if (r7 != 0) {
                    Object obj3 = r7.get(0);
                    Intrinsics.checkNotNullExpressionValue(obj3, "get(...)");
                    SleepSegmentReport sleepSegmentReport2 = (SleepSegmentReport) obj3;
                    string = context.getString(ezi.S, getHMTime(sleepSegmentReport2.getBedTime()), getHMTime(sleepSegmentReport2.getWakeupTime()));
                } else {
                    string = str;
                }
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str6 = String.format(Locale.US, "%s,%s", Arrays.copyOf(new Object[]{string5, string}, i));
                Intrinsics.checkNotNullExpressionValue(str6, str2);
                remoteViews.setContentDescription(R.id.background, str6);
            } else {
                str = null;
                str2 = "format(...)";
                i = 2;
            }
            remoteViews.setImageViewResource(pqi.e, ymi.f40328a);
            UiUtils uiUtils2 = UiUtils.INSTANCE;
            sleepDurationResultCalculateLongSleepDuration$default = UiUtils.calculateLongSleepDuration$default(uiUtils2, allDaySleepReport.getSleepSegments(), false, i, str);
            String hMFormatInSecond2 = TimeDateUtil.getHMFormatInSecond(context, sleepDurationResultCalculateLongSleepDuration$default.getTotalDuration());
            if (sleepDurationResultCalculateLongSleepDuration$default.getStartTime() > 0) {
                dateStr = TimeDateUtil.getDateStr(sleepDurationResultCalculateLongSleepDuration$default.getStartTime(), TimeUtils.FORMAT_H_M);
                dateStr2 = TimeDateUtil.getDateStr(sleepDurationResultCalculateLongSleepDuration$default.getEndTime(), TimeUtils.FORMAT_H_M);
                if (AppUtil.isRTLDirection()) {
                    str3 = dateStr2;
                } else {
                    str3 = dateStr;
                }
                if (!AppUtil.isRTLDirection()) {
                    dateStr = dateStr2;
                }
                remoteViews.setTextViewText(pqi.z, str3);
                remoteViews.setTextViewText(pqi.y, dateStr);
            }
            remoteViews.setViewVisibility(pqi.F, 0);
            remoteViews.setTextViewText(pqi.F, UiUtils.textNumberSizeChangeWithSpacing$default(uiUtils2, hMFormatInSecond2, 26, 26, 13, null, 0, 48, null));
            accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
            if (accountManagerExtKt != null) {
                dailySleepGoal = UserInfoManager.getUserProfile$default(accountManagerExtKt, false, 1, str).getDailySleepGoal();
                if (dailySleepGoal == 0) {
                    dailySleepGoal = 480;
                }
                hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(context, dailySleepGoal);
                Intrinsics.checkNotNullExpressionValue(context.getString(ezi.M, hMFormatInMinutes), "getString(...)");
            } else {
                hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(context, 480L);
            }
            String string6 = context.getString(ezi.T, hMFormatInSecond2, hMFormatInMinutes);
            Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
            sleepSegments2 = allDaySleepReport.getSleepSegments();
            if (sleepSegments2 == null) {
                sleepSegments2 = CollectionsKt__CollectionsKt.emptyList();
            }
            LinkedList linkedList3 = new LinkedList(sleepSegments2);
            Collections.sort(linkedList3, new Comparator<SleepSegmentReport>() { // from class: com.mi.health.sleep.widget.SleepWidgetProvider.updateWidgetValueOs2.4
                @Override // java.util.Comparator
                public int compare(SleepSegmentReport a2, SleepSegmentReport b2) {
                    Intrinsics.checkNotNullParameter(a2, "a");
                    Intrinsics.checkNotNullParameter(b2, "b");
                    return Intrinsics.compare(a2.getWakeupTime(), b2.getWakeupTime());
                }
            });
            arrayList = new ArrayList();
            while (r3.hasNext()) {
                if (((SleepSegmentReport) obj).getSleepDuration() >= 180) {
                    arrayList.add(obj);
                }
            }
            if (arrayList instanceof LinkedList) {
                linkedList = (LinkedList) arrayList;
            } else {
                r7 = str;
            }
            if (r7 != 0) {
                r7 = linkedList;
                r7 = linkedList;
                sb = new StringBuilder();
                if (r7 != 0) {
                    while (r3.hasNext()) {
                        int i4 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        SleepSegmentReport sleepSegmentReport3 = (SleepSegmentReport) obj2;
                        sb.append(context.getString(ezi.R, Boxing.boxInt(i4), getHMTime(sleepSegmentReport3.getBedTime()), getHMTime(sleepSegmentReport3.getWakeupTime())));
                        sb.append(",");
                        i2 = i4;
                    }
                }
                string = sb.toString();
            } else {
                r7 = linkedList;
                r7 = linkedList;
                sb = new StringBuilder();
                if (r7 != 0) {
                    while (r3.hasNext()) {
                        int i5 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        SleepSegmentReport sleepSegmentReport4 = (SleepSegmentReport) obj2;
                        sb.append(context.getString(ezi.R, Boxing.boxInt(i5), getHMTime(sleepSegmentReport4.getBedTime()), getHMTime(sleepSegmentReport4.getWakeupTime())));
                        sb.append(",");
                        i2 = i5;
                    }
                }
                string = sb.toString();
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str7 = String.format(Locale.US, "%s,%s", Arrays.copyOf(new Object[]{string6, string}, i));
            Intrinsics.checkNotNullExpressionValue(str7, str2);
            remoteViews.setContentDescription(R.id.background, str7);
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object updateWidgetValueOs2$default(SleepWidgetProvider sleepWidgetProvider, Context context, RemoteViews remoteViews, AllDaySleepReport allDaySleepReport, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 8) != 0) {
            z = true;
        }
        return sleepWidgetProvider.updateWidgetValueOs2(context, remoteViews, allDaySleepReport, z, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0148  */
    /* JADX WARN: Code duplicated, block: B:30:0x0153  */
    /* JADX WARN: Code duplicated, block: B:32:0x0168  */
    /* JADX WARN: Code duplicated, block: B:35:0x0186  */
    /* JADX WARN: Code duplicated, block: B:39:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:44:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:52:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x0206  */
    /* JADX WARN: Code duplicated, block: B:59:0x020e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v0, types: [android.widget.RemoteViews] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Iterable, java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r2v54 */
    public final Object updateWidgetValueOs3(Context context, RemoteViews remoteViews, AllDaySleepReport allDaySleepReport, Continuation<? super Unit> continuation) {
        List<SleepSegmentReport> sleepSegments;
        Object obj;
        String str;
        String str2;
        ?? r11;
        Object obj2;
        int i;
        UiUtils.SleepDurationResult sleepDurationResultCalculateLongSleepDuration$default;
        ?? r15;
        UserInfoManager accountManagerExtKt;
        String str3;
        String hMFormatInMinutes;
        List<SleepSegmentReport> sleepSegments2;
        AbstractCollection arrayList;
        ?? r2;
        StringBuilder sb;
        String string;
        int i2;
        LinkedList linkedList;
        int dailySleepGoal;
        Unit unit;
        if (allDaySleepReport == null || (sleepSegments = allDaySleepReport.getSleepSegments()) == null || sleepSegments.isEmpty()) {
            remoteViews.setViewVisibility(pqi.F, 0);
            int i3 = pqi.F;
            StyledStringUtils styledStringUtils = StyledStringUtils.INSTANCE;
            String zeroHM = TimeDateUtil.INSTANCE.getZeroHM(context);
            SpanPropKey spanPropKey = SpanPropKey.FONT_WEIGHT;
            Pair pair = TuplesKt.to(spanPropKey, "450");
            SpanPropKey spanPropKey2 = SpanPropKey.FONT_SIZE;
            remoteViews.setTextViewText(i3, styledStringUtils.styleSmart(zeroHM, context, (116 & 2) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(pair, TuplesKt.to(spanPropKey2, "50%"))), (116 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(SpanPropKey.TEXT_REPLACE, "-"), TuplesKt.to(spanPropKey, "380"), TuplesKt.to(spanPropKey2, "100%"), TuplesKt.to(SpanPropKey.MARGIN, "2dp;remote=true"))), (116 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, (116 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (116 & 32) != 0 ? Locale.getDefault() : null, (116 & 64) != 0));
            remoteViews.setImageViewResource(pqi.e, ymi.f40328a);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str4 = String.format("%s,%s", Arrays.copyOf(new Object[]{context.getString(ezi.N), ResourceExtKt.getString(ezi.H)}, 2));
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            remoteViews.setContentDescription(R.id.background, str4);
        } else {
            List<SleepSegmentReport> sleepSegments3 = allDaySleepReport.getSleepSegments();
            if (sleepSegments3 != null) {
                String TAG = this.TAG;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                Logger.i(TAG, "updateWidgetValue: sleepSegments = " + sleepSegments3);
                str = "format(...)";
                r11 = 0;
                r11 = 0;
                obj2 = null;
                str2 = "%s,%s";
                i = 2;
                obj = "450";
                Bitmap bitmapCreateSleepChartBitmap = UiUtils.INSTANCE.createSleepChartBitmap(context, sleepSegments3, remoteViews, ExtUtilsKt.getDp(Boxing.boxInt(272)), ExtUtilsKt.getDp(Boxing.boxInt(84)));
                if (bitmapCreateSleepChartBitmap != null) {
                    remoteViews.setImageViewBitmap(pqi.e, bitmapCreateSleepChartBitmap);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                }
                sleepDurationResultCalculateLongSleepDuration$default = UiUtils.calculateLongSleepDuration$default(UiUtils.INSTANCE, allDaySleepReport.getSleepSegments(), r11, i, obj2);
                String hMFormatInSecond = TimeDateUtil.getHMFormatInSecond(context, sleepDurationResultCalculateLongSleepDuration$default.getTotalDuration());
                if (sleepDurationResultCalculateLongSleepDuration$default.getStartTime() > 0 && sleepDurationResultCalculateLongSleepDuration$default.getEndTime() > 0 && sleepDurationResultCalculateLongSleepDuration$default.getStartTime() < sleepDurationResultCalculateLongSleepDuration$default.getEndTime()) {
                    String dateStr = TimeDateUtil.getDateStr(sleepDurationResultCalculateLongSleepDuration$default.getStartTime(), TimeUtils.FORMAT_H_M);
                    String dateStr2 = TimeDateUtil.getDateStr(sleepDurationResultCalculateLongSleepDuration$default.getEndTime(), TimeUtils.FORMAT_H_M);
                    remoteViews.setTextViewText(pqi.z, dateStr);
                    remoteViews.setTextViewText(pqi.y, dateStr2);
                }
                remoteViews.setViewVisibility(pqi.F, r11);
                int i4 = pqi.F;
                StyledStringUtils styledStringUtils2 = StyledStringUtils.INSTANCE;
                SpanPropKey spanPropKey3 = SpanPropKey.FONT_WEIGHT;
                Pair pair2 = TuplesKt.to(spanPropKey3, obj);
                SpanPropKey spanPropKey4 = SpanPropKey.FONT_SIZE;
                r15 = r11;
                remoteViews.setTextViewText(i4, styledStringUtils2.styleSmart(hMFormatInSecond, context, (116 & 2) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(pair2, TuplesKt.to(spanPropKey4, "50%"))), (116 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey3, "380"), TuplesKt.to(spanPropKey4, "100%"), TuplesKt.to(SpanPropKey.MARGIN, "2dp;remote=true"))), (116 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, (116 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (116 & 32) != 0 ? Locale.getDefault() : null, (116 & 64) != 0));
                accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
                if (accountManagerExtKt != null) {
                    str3 = null;
                    dailySleepGoal = UserInfoManager.getUserProfile$default(accountManagerExtKt, r15, 1, null).getDailySleepGoal();
                    if (dailySleepGoal == 0) {
                        dailySleepGoal = 480;
                    }
                    hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(context, dailySleepGoal);
                    Intrinsics.checkNotNullExpressionValue(context.getString(ezi.M, hMFormatInMinutes), "getString(...)");
                } else {
                    str3 = null;
                    hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(context, 480L);
                }
                String string2 = context.getString(ezi.T, hMFormatInSecond, hMFormatInMinutes);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                sleepSegments2 = allDaySleepReport.getSleepSegments();
                if (sleepSegments2 == null) {
                    sleepSegments2 = CollectionsKt__CollectionsKt.emptyList();
                }
                LinkedList linkedList2 = new LinkedList(sleepSegments2);
                Collections.sort(linkedList2, new Comparator<SleepSegmentReport>() { // from class: com.mi.health.sleep.widget.SleepWidgetProvider.updateWidgetValueOs3.4
                    @Override // java.util.Comparator
                    public int compare(SleepSegmentReport a2, SleepSegmentReport b2) {
                        Intrinsics.checkNotNullParameter(a2, "a");
                        Intrinsics.checkNotNullParameter(b2, "b");
                        return Intrinsics.compare(a2.getWakeupTime(), b2.getWakeupTime());
                    }
                });
                arrayList = new ArrayList();
                for (Object obj3 : linkedList2) {
                    if (((SleepSegmentReport) obj3).getSleepDuration() >= 180) {
                        arrayList.add(obj3);
                    }
                }
                if (arrayList instanceof LinkedList) {
                    linkedList = (LinkedList) arrayList;
                } else {
                    r2 = str3;
                }
                if (r2 != 0 || r2.size() != 1) {
                    r2 = linkedList;
                    r2 = linkedList;
                    sb = new StringBuilder();
                    if (r2 != 0) {
                        i2 = r15 == true ? 1 : 0;
                        for (Object obj4 : r2) {
                            int i5 = i2 + 1;
                            if (i2 < 0) {
                                CollectionsKt__CollectionsKt.throwIndexOverflow();
                            }
                            SleepSegmentReport sleepSegmentReport = (SleepSegmentReport) obj4;
                            sb.append(context.getString(ezi.R, Boxing.boxInt(i5), getHMTime(sleepSegmentReport.getBedTime()), getHMTime(sleepSegmentReport.getWakeupTime())));
                            sb.append(",");
                            i2 = i5;
                        }
                    }
                    string = sb.toString();
                } else if (r2 != 0) {
                    Object obj5 = r2.get(r15 == true ? 1 : 0);
                    Intrinsics.checkNotNullExpressionValue(obj5, "get(...)");
                    SleepSegmentReport sleepSegmentReport2 = (SleepSegmentReport) obj5;
                    string = context.getString(ezi.S, getHMTime(sleepSegmentReport2.getBedTime()), getHMTime(sleepSegmentReport2.getWakeupTime()));
                } else {
                    string = str3;
                }
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str5 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{string2, string}, 2));
                Intrinsics.checkNotNullExpressionValue(str5, str);
                remoteViews.setContentDescription(R.id.background, str5);
            } else {
                obj = "450";
                str = "format(...)";
                str2 = "%s,%s";
                r11 = 0;
                obj2 = null;
                i = 2;
            }
            remoteViews.setImageViewResource(pqi.e, ymi.f40328a);
            sleepDurationResultCalculateLongSleepDuration$default = UiUtils.calculateLongSleepDuration$default(UiUtils.INSTANCE, allDaySleepReport.getSleepSegments(), r11, i, obj2);
            String hMFormatInSecond2 = TimeDateUtil.getHMFormatInSecond(context, sleepDurationResultCalculateLongSleepDuration$default.getTotalDuration());
            if (sleepDurationResultCalculateLongSleepDuration$default.getStartTime() > 0) {
                String dateStr3 = TimeDateUtil.getDateStr(sleepDurationResultCalculateLongSleepDuration$default.getStartTime(), TimeUtils.FORMAT_H_M);
                String dateStr4 = TimeDateUtil.getDateStr(sleepDurationResultCalculateLongSleepDuration$default.getEndTime(), TimeUtils.FORMAT_H_M);
                remoteViews.setTextViewText(pqi.z, dateStr3);
                remoteViews.setTextViewText(pqi.y, dateStr4);
            }
            remoteViews.setViewVisibility(pqi.F, r11);
            int i6 = pqi.F;
            StyledStringUtils styledStringUtils3 = StyledStringUtils.INSTANCE;
            SpanPropKey spanPropKey5 = SpanPropKey.FONT_WEIGHT;
            Pair pair3 = TuplesKt.to(spanPropKey5, obj);
            SpanPropKey spanPropKey6 = SpanPropKey.FONT_SIZE;
            r15 = r11;
            remoteViews.setTextViewText(i6, styledStringUtils3.styleSmart(hMFormatInSecond2, context, (116 & 2) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(pair3, TuplesKt.to(spanPropKey6, "50%"))), (116 & 4) != 0 ? null : new StyledStringUtils.CssStyle(MapsKt__MapsKt.mapOf(TuplesKt.to(spanPropKey5, "380"), TuplesKt.to(spanPropKey6, "100%"), TuplesKt.to(SpanPropKey.MARGIN, "2dp;remote=true"))), (116 & 8) != 0 ? MapsKt__MapsKt.emptyMap() : null, (116 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : null, (116 & 32) != 0 ? Locale.getDefault() : null, (116 & 64) != 0));
            accountManagerExtKt = AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
            if (accountManagerExtKt != null) {
                str3 = null;
                dailySleepGoal = UserInfoManager.getUserProfile$default(accountManagerExtKt, r15, 1, null).getDailySleepGoal();
                if (dailySleepGoal == 0) {
                    dailySleepGoal = 480;
                }
                hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(context, dailySleepGoal);
                Intrinsics.checkNotNullExpressionValue(context.getString(ezi.M, hMFormatInMinutes), "getString(...)");
            } else {
                str3 = null;
                hMFormatInMinutes = TimeDateUtil.getHMFormatInMinutes(context, 480L);
            }
            String string3 = context.getString(ezi.T, hMFormatInSecond2, hMFormatInMinutes);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            sleepSegments2 = allDaySleepReport.getSleepSegments();
            if (sleepSegments2 == null) {
                sleepSegments2 = CollectionsKt__CollectionsKt.emptyList();
            }
            LinkedList linkedList3 = new LinkedList(sleepSegments2);
            Collections.sort(linkedList3, new Comparator<SleepSegmentReport>() { // from class: com.mi.health.sleep.widget.SleepWidgetProvider.updateWidgetValueOs3.4
                @Override // java.util.Comparator
                public int compare(SleepSegmentReport a2, SleepSegmentReport b2) {
                    Intrinsics.checkNotNullParameter(a2, "a");
                    Intrinsics.checkNotNullParameter(b2, "b");
                    return Intrinsics.compare(a2.getWakeupTime(), b2.getWakeupTime());
                }
            });
            arrayList = new ArrayList();
            while (r2.hasNext()) {
                if (((SleepSegmentReport) obj3).getSleepDuration() >= 180) {
                    arrayList.add(obj3);
                }
            }
            if (arrayList instanceof LinkedList) {
                linkedList = (LinkedList) arrayList;
            } else {
                r2 = str3;
            }
            if (r2 != 0) {
                r2 = linkedList;
                r2 = linkedList;
                sb = new StringBuilder();
                if (r2 != 0) {
                    i2 = r15 == true ? 1 : 0;
                    while (r2.hasNext()) {
                        int i7 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        SleepSegmentReport sleepSegmentReport3 = (SleepSegmentReport) obj4;
                        sb.append(context.getString(ezi.R, Boxing.boxInt(i7), getHMTime(sleepSegmentReport3.getBedTime()), getHMTime(sleepSegmentReport3.getWakeupTime())));
                        sb.append(",");
                        i2 = i7;
                    }
                }
                string = sb.toString();
            } else {
                r2 = linkedList;
                r2 = linkedList;
                sb = new StringBuilder();
                if (r2 != 0) {
                    i2 = r15 == true ? 1 : 0;
                    while (r2.hasNext()) {
                        int i8 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        SleepSegmentReport sleepSegmentReport4 = (SleepSegmentReport) obj4;
                        sb.append(context.getString(ezi.R, Boxing.boxInt(i8), getHMTime(sleepSegmentReport4.getBedTime()), getHMTime(sleepSegmentReport4.getWakeupTime())));
                        sb.append(",");
                        i2 = i8;
                    }
                }
                string = sb.toString();
            }
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String str6 = String.format(Locale.US, str2, Arrays.copyOf(new Object[]{string3, string}, 2));
            Intrinsics.checkNotNullExpressionValue(str6, str);
            remoteViews.setContentDescription(R.id.background, str6);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r2.equals(com.mi.health.WidgetConstants.APP_WIDGET_UPDATE_ACTION) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r2.equals("recent_data_changed_broadcast") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r2.equals("android.intent.action.DATE_CHANGED") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r2.equals(com.mi.health.WidgetConstants.MIUI_APP_WIDGET_UPDATE_ACTION) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        onUpdate(r6, r0, r7.getIntArrayExtra("appWidgetIds"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r2.equals("android.intent.action.TIME_SET") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (r2.equals("android.intent.action.TIMEZONE_CHANGED") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0090, code lost:
    
        if (r2.equals(com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.AppearanceModule.APPEARANCE_CHANGED_ACTION) != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:
    
        if (r2.equals(com.mi.health.WidgetConstants.ACTION_UI_MODE_CHANGED) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009c, code lost:
    
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
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = r5.TAG
            java.lang.String r1 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r1 = 0
            if (r7 == 0) goto L15
            r2 = 0
            java.lang.String r2 = r7.toUri(r2)
            goto L16
        L15:
            r2 = r1
        L16:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "onReceive:"
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = ", this = "
            r3.append(r2)
            r3.append(r5)
            java.lang.String r2 = r3.toString()
            com.xiaomi.fitness.common.log.Logger.i(r0, r2)
            if (r7 != 0) goto L38
            super.onReceive(r6, r7)
            return
        L38:
            android.appwidget.AppWidgetManager r0 = android.appwidget.AppWidgetManager.getInstance(r6)
            java.lang.String r2 = r7.getAction()
            if (r2 == 0) goto La0
            int r3 = r2.hashCode()
            switch(r3) {
                case -333119352: goto L93;
                case 158859398: goto L8a;
                case 502473491: goto L81;
                case 505380757: goto L78;
                case 1027655412: goto L65;
                case 1041332296: goto L5c;
                case 1484986885: goto L53;
                case 1619576947: goto L4a;
                default: goto L49;
            }
        L49:
            goto La0
        L4a:
            java.lang.String r1 = "android.appwidget.action.APPWIDGET_UPDATE"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6e
            goto La0
        L53:
            java.lang.String r3 = "recent_data_changed_broadcast"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto La0
        L5c:
            java.lang.String r3 = "android.intent.action.DATE_CHANGED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto La0
        L65:
            java.lang.String r1 = "miui.appwidget.action.APPWIDGET_UPDATE"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L6e
            goto La0
        L6e:
            java.lang.String r1 = "appWidgetIds"
            int[] r7 = r7.getIntArrayExtra(r1)
            r5.onUpdate(r6, r0, r7)
            goto La3
        L78:
            java.lang.String r3 = "android.intent.action.TIME_SET"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto La0
        L81:
            java.lang.String r3 = "android.intent.action.TIMEZONE_CHANGED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto La0
        L8a:
            java.lang.String r3 = "android.intent.action.CONFIGURATION_CHANGED"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto La0
            goto L9c
        L93:
            java.lang.String r3 = "com.mi.health.widget.action.UI_MODE_CHANGED"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L9c
            goto La0
        L9c:
            r5.onUpdate(r6, r0, r1)
            goto La3
        La0:
            super.onReceive(r6, r7)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mi.health.sleep.widget.SleepWidgetProvider.onReceive(android.content.Context, android.content.Intent):void");
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider
    public void onRecentDataChanged(@NotNull Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        super.onRecentDataChanged(ctx);
        String TAG = this.TAG;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        Logger.d(TAG, "recent data changed!");
        onUpdate(ctx, AppWidgetManager.getInstance(ctx), null);
    }

    @Override // com.mi.health.HealthBaseAppWidgetProvider, android.appwidget.AppWidgetProvider
    public void onUpdate(@NotNull Context context, @Nullable AppWidgetManager wMgr, @Nullable int[] appWidgetIds) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onUpdate(context, wMgr, appWidgetIds);
        ScreenUtil.INSTANCE.logScreenMessage(context);
        if (appWidgetIds == null || appWidgetIds.length == 0) {
            appWidgetIds = wMgr != null ? wMgr.getAppWidgetIds(new ComponentName(context, (Class<?>) SleepWidgetProvider.class)) : null;
        }
        if (wMgr == null || appWidgetIds == null) {
            return;
        }
        if (!(appWidgetIds.length == 0)) {
            onWidgetUpdate(context, wMgr, appWidgetIds);
        }
    }
}
