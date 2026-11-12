package com.huami.feedback.zepp.ui.edit;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.amap.api.mapcore.util.hl;
import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.feedback.api.FeedbackConfig;
import com.huami.feedback.domain.SyncDeviceLogUseCase;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.repo.SubmitLogRepository;
import com.huami.feedback.repo.UserFormRepository;
import com.huami.feedback.sync.api.DeviceLogSyncError;
import com.huami.feedback.sync.api.device.DeviceType;
import com.huami.feedback.util.AnalyticsKt;
import com.huami.feedback.util.FeedbackException;
import com.huami.feedback.util.UtilsKt;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import com.huami.feedback.zepp.ui.R;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.sleep.sleephome.ui.SleepHomeActivity;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import it.sauronsoftware.ftp4j.FTPCodes;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u0000 82\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b6\u00107J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0002J%\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0014\u0010\u0013\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0007H\u0002J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010 \u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0002J\u001b\u0010!\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u001eH\u0082@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0014\u0010&\u001a\u0004\u0018\u00010%2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\"\u0010)\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010'\u001a\u00020\f2\u0006\u0010(\u001a\u00020\fH\u0016R\u0016\u0010+\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010-R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00104\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00103R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u00103\u0082\u0002\u0004\n\u0002\b\u0019¨\u00069"}, d2 = {"Lcom/huami/feedback/zepp/ui/edit/FeedbackWorkService;", "Landroid/app/Service;", "", "isRetry", "", "e", GoogleApiAvailabilityLight.b, "", "title", "content", "Landroidx/core/app/NotificationCompat$Builder;", "b", "", "message", "i", "(ILjava/lang/Integer;)V", hl.k, "l", "action", "a", "", "error", "h", "builder", "m", "Landroid/app/PendingIntent;", GoogleApiAvailabilityLight.a, "o", "f", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/feedback/entity/UserForm;", FeedbackActivity.KEY_USER_FORM, "g", com.google.android.exoplayer2.text.ttml.b.r, "(Lcom/huami/feedback/entity/UserForm;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", DataCacher.j, "startId", "onStartCommand", LogUtil.I, "notificationId", "Landroid/app/Notification;", "Landroid/app/Notification;", SleepHomeActivity.FROM_NOTIFICATION, "c", "Z", "lastSyncLogFailed", "", "J", "syncLogDuration", "postFileDuration", "<init>", "()V", "Companion", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
public final class FeedbackWorkService extends Service {

    @NotNull
    public static final String ACTION_FEEDBACK = "action_feedback";

    @NotNull
    public static final String ACTION_FEEDBACK_CANCEL = "action_feedback_cancel";

    @NotNull
    public static final String ACTION_FEEDBACK_RETRY = "action_feedback_retry";

    @NotNull
    private static final String f = "FEEDBACK_NOTIFICATION_CHANNEL";
    private static final int g = 100;
    private static boolean h;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int notificationId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Notification notification;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean lastSyncLogFailed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long syncLogDuration;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long postFileDuration;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static String i = "AppInternal";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006R\u0013\u0010\n\u001a\u00020\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/feedback/zepp/ui/edit/FeedbackWorkService$Companion;", "", "", FeedbackActivity.KEY_FEEDBACK_SOURCE, "", "recordFeedbackSource", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "stopFeedback", "", "isSubmitting", "()Z", "ACTION_FEEDBACK", "Ljava/lang/String;", "ACTION_FEEDBACK_CANCEL", "ACTION_FEEDBACK_RETRY", "CHANNEL_ID", "", "NOTIFICATION_ID_RANGE", LogUtil.I, "feedbackSource", "isSubmittingInternal", "Z", "<init>", "()V", "feedback-zepp-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isSubmitting() {
            return FeedbackWorkService.h;
        }

        public final void recordFeedbackSource(@NotNull String fromSource) {
            FeedbackWorkService.i = fromSource;
        }

        public final void stopFeedback(@NotNull Context context) {
            try {
                Result.Companion companion = Result.Companion;
                Result.m3845constructorimpl(Boolean.valueOf(context.stopService(new Intent(context, (Class<?>) FeedbackWorkService.class))));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Throwable b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, Throwable th) {
            super(0);
            this.a = z;
            this.b = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Service doFeedbackAction失败，isRetry:" + this.a + ",error：" + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.edit.FeedbackWorkService", f = "FeedbackWorkService.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 3}, l = {FTPCodes.USER_LOGGED_IN, 237, 244, Mtu.ATT_MTU_MAX, 251}, m = "doSubmit", n = {"this", "userFormRepo", "isRetry", "this", "userFormRepo", FeedbackActivity.KEY_USER_FORM, "error", "start$iv", "userFormRepo", "userFormRepo"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$0"})
    public static final class b extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public boolean g;
        public long h;
        public /* synthetic */ Object i;
        public int k;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.i = obj;
            this.k |= Integer.MIN_VALUE;
            return FeedbackWorkService.this.f(false, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ Ref.ObjectRef<DeviceLogSyncError> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Ref.ObjectRef<DeviceLogSyncError> objectRef) {
            super(0);
            this.a = objectRef;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("同步设备日志结果：", this.a.element);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("日志上传失败：", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "获取NotificationManager失败！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.edit.FeedbackWorkService$submit$1", f = "FeedbackWorkService.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"start$iv"}, s = {"J$0"})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public boolean a;
        public long b;
        public int c;
        private /* synthetic */ Object d;
        public final /* synthetic */ boolean f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ boolean a;
            public final /* synthetic */ Throwable b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, Throwable th) {
                super(0);
                this.a = z;
                this.b = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "service submit失败：isRetry:" + this.a + ",error:" + this.b;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            f fVar = FeedbackWorkService.this.new f(this.f, continuation);
            fVar.d = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            FeedbackWorkService feedbackWorkService;
            boolean z;
            long j;
            Object objM3845constructorimpl;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                feedbackWorkService = FeedbackWorkService.this;
                z = this.f;
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    Result.Companion companion = Result.Companion;
                    boolean z2 = z;
                    this.d = feedbackWorkService;
                    this.a = z;
                    this.b = jCurrentTimeMillis;
                    this.c = 1;
                    if (feedbackWorkService.f(z2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    j = jCurrentTimeMillis;
                } catch (Throwable th) {
                    th = th;
                    j = jCurrentTimeMillis;
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.b;
                z = this.a;
                feedbackWorkService = (FeedbackWorkService) this.d;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th2) {
                    th = th2;
                    Result.Companion companion3 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            }
            feedbackWorkService.lastSyncLogFailed = false;
            feedbackWorkService.l();
            feedbackWorkService.stopForeground(false);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                feedbackWorkService.h(thM3848exceptionOrNullimpl);
                feedbackWorkService.lastSyncLogFailed = true;
                HMLog.error$default("feedback", null, null, new a(z, thM3848exceptionOrNullimpl), 6, null);
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - j;
            Companion companion4 = FeedbackWorkService.INSTANCE;
            FeedbackWorkService.h = false;
            AnalyticsKt.feedbackDurationAnalytics(FeedbackWorkService.this.syncLogDuration, FeedbackWorkService.this.postFileDuration, jCurrentTimeMillis2 + UtilsKt.getConnectDuration(), !FeedbackWorkService.this.lastSyncLogFailed ? 1 : 0);
            FeedbackWorkService.this.syncLogDuration = 0L;
            FeedbackWorkService.this.postFileDuration = 0L;
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.zepp.ui.edit.FeedbackWorkService", f = "FeedbackWorkService.kt", i = {0, 0, 0}, l = {278}, m = "uploadFile", n = {"postResult", "postException", "start$iv"}, s = {"L$0", "L$1", "J$0"})
    public static final class g extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public long e;
        public /* synthetic */ Object f;
        public int h;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            return FeedbackWorkService.this.p(null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "开始uploadFile";
        }
    }

    private final void a(NotificationCompat.Builder builder, String str) {
        builder.addAction(0, getString(Intrinsics.areEqual(str, ACTION_FEEDBACK_RETRY) ? R.string.feedback_notify_retry : R.string.feedback_notify_cancel), d(str));
    }

    private final NotificationCompat.Builder b(String title, String content) {
        FeedbackConfig feedbackConfig = (FeedbackConfig) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FeedbackConfig.class), null, null);
        NotificationCompat.Builder priority = new NotificationCompat.Builder(this, f).setSmallIcon(feedbackConfig.getNotificationIcon()).setContentTitle(title).setPriority(0);
        if (!(content == null || content.length() == 0)) {
            priority.setContentText(content);
        }
        return priority.setColor(ContextCompat.getColor(this, feedbackConfig.getNotificationIconBg()));
    }

    public static /* synthetic */ NotificationCompat.Builder c(FeedbackWorkService feedbackWorkService, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return feedbackWorkService.b(str, str2);
    }

    private final PendingIntent d(String action) {
        Intent intent = new Intent(this, (Class<?>) FeedbackWorkService.class);
        intent.setAction(action);
        return PendingIntent.getService(this, 0, intent, Build.VERSION.SDK_INT >= 23 ? 201326592 : AMapEngineUtils.HALF_MAX_P20_WIDTH);
    }

    private final void e(boolean isRetry) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            h = true;
            if (!isRetry) {
                this.notificationId = Random.Default.nextInt(100);
            }
            k();
            if (!isRetry) {
                startForeground(this.notificationId, this.notification);
            }
            o(isRetry);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl == null) {
            return;
        }
        HMLog.error$default("feedback", null, null, new a(isRetry, thM3848exceptionOrNullimpl), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:38:0x0124  */
    /* JADX WARN: Code duplicated, block: B:40:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x0139  */
    /* JADX WARN: Code duplicated, block: B:43:0x0141  */
    /* JADX WARN: Code duplicated, block: B:52:0x0175  */
    /* JADX WARN: Code duplicated, block: B:54:0x017f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object f(boolean z, Continuation<? super Unit> continuation) throws Throwable {
        b bVar;
        boolean z2;
        FeedbackWorkService feedbackWorkService;
        UserFormRepository userFormRepository;
        Object obj;
        UserForm userForm;
        UserFormRepository userFormRepository2;
        Ref.ObjectRef objectRef;
        FeedbackWorkService feedbackWorkService2;
        Ref.ObjectRef objectRef2;
        UserFormRepository userFormRepository3;
        FeedbackWorkService feedbackWorkService3;
        long j;
        T t;
        Object objP;
        Object obj2;
        boolean zBooleanValue;
        Boolean boolBoxBoolean;
        Object obj3;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.k = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj4 = bVar.i;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = bVar.k;
        if (i3 != 0) {
            if (i3 == 1) {
                z2 = bVar.g;
                userFormRepository = (UserFormRepository) bVar.b;
                feedbackWorkService = (FeedbackWorkService) bVar.a;
                ResultKt.throwOnFailure(obj4);
                obj = obj4;
            } else if (i3 == 2) {
                j = bVar.h;
                feedbackWorkService2 = (FeedbackWorkService) bVar.f;
                objectRef = (Ref.ObjectRef) bVar.e;
                objectRef2 = (Ref.ObjectRef) bVar.d;
                userForm = (UserForm) bVar.c;
                userFormRepository3 = (UserFormRepository) bVar.b;
                feedbackWorkService3 = (FeedbackWorkService) bVar.a;
                ResultKt.throwOnFailure(obj4);
                t = obj4;
                objectRef.element = t;
                Unit unit = Unit.INSTANCE;
                feedbackWorkService2.syncLogDuration = System.currentTimeMillis() - j;
                HMLog.info("feedback", new c(objectRef2));
                if (objectRef2.element == 0) {
                    throw new FeedbackException(((DeviceLogSyncError) objectRef2.element).getValue(), ((DeviceLogSyncError) objectRef2.element).name());
                }
                bVar.a = userFormRepository3;
                bVar.b = null;
                bVar.c = null;
                bVar.d = null;
                bVar.e = null;
                bVar.f = null;
                bVar.k = 3;
                objP = feedbackWorkService3.p(userForm, bVar);
                if (objP == coroutine_suspended) {
                    return coroutine_suspended;
                }
                userFormRepository2 = userFormRepository3;
                obj2 = objP;
                zBooleanValue = ((Boolean) obj2).booleanValue();
                boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                if (boolBoxBoolean.booleanValue()) {
                    bVar.a = boolBoxBoolean;
                    bVar.k = 5;
                    if (userFormRepository2.setFormData(null, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i3 == 3) {
                userFormRepository2 = (UserFormRepository) bVar.a;
                ResultKt.throwOnFailure(obj4);
                obj2 = obj4;
                zBooleanValue = ((Boolean) obj2).booleanValue();
                boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                if (boolBoxBoolean.booleanValue()) {
                    bVar.a = boolBoxBoolean;
                    bVar.k = 5;
                    if (userFormRepository2.setFormData(null, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i3 == 4) {
                userFormRepository2 = (UserFormRepository) bVar.a;
                ResultKt.throwOnFailure(obj4);
                obj3 = obj4;
                zBooleanValue = ((Boolean) obj3).booleanValue();
                boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
                if (boolBoxBoolean.booleanValue()) {
                    bVar.a = boolBoxBoolean;
                    bVar.k = 5;
                    if (userFormRepository2.setFormData(null, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i3 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj4);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj4);
        UserFormRepository userFormRepository4 = (UserFormRepository) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(UserFormRepository.class), null, null);
        bVar.a = this;
        bVar.b = userFormRepository4;
        z2 = z;
        bVar.g = z2;
        bVar.k = 1;
        Object formData = userFormRepository4.getFormData(bVar);
        if (formData == coroutine_suspended) {
            return coroutine_suspended;
        }
        feedbackWorkService = this;
        userFormRepository = userFormRepository4;
        obj = formData;
        userForm = (UserForm) obj;
        if (userForm == null) {
            return Unit.INSTANCE;
        }
        DeviceType deviceType = userForm.getDeviceType();
        if (!feedbackWorkService.g(z2, userForm)) {
            bVar.a = userFormRepository;
            bVar.b = null;
            bVar.k = 4;
            Object objP2 = feedbackWorkService.p(userForm, bVar);
            if (objP2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            userFormRepository2 = userFormRepository;
            obj3 = objP2;
            zBooleanValue = ((Boolean) obj3).booleanValue();
            boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
            if (boolBoxBoolean.booleanValue()) {
                bVar.a = boolBoxBoolean;
                bVar.k = 5;
                if (userFormRepository2.setFormData(null, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        SyncDeviceLogUseCase syncDeviceLogUseCase = (SyncDeviceLogUseCase) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SyncDeviceLogUseCase.class), null, null);
        objectRef = new Ref.ObjectRef();
        long jCurrentTimeMillis = System.currentTimeMillis();
        bVar.a = feedbackWorkService;
        bVar.b = userFormRepository;
        bVar.c = userForm;
        bVar.d = objectRef;
        bVar.e = objectRef;
        bVar.f = feedbackWorkService;
        bVar.h = jCurrentTimeMillis;
        bVar.k = 2;
        Object objInvoke = syncDeviceLogUseCase.invoke(deviceType, bVar);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        feedbackWorkService2 = feedbackWorkService;
        objectRef2 = objectRef;
        userFormRepository3 = userFormRepository;
        feedbackWorkService3 = feedbackWorkService2;
        j = jCurrentTimeMillis;
        t = objInvoke;
        objectRef.element = t;
        Unit unit2 = Unit.INSTANCE;
        feedbackWorkService2.syncLogDuration = System.currentTimeMillis() - j;
        HMLog.info("feedback", new c(objectRef2));
        if (objectRef2.element == 0) {
            throw new FeedbackException(((DeviceLogSyncError) objectRef2.element).getValue(), ((DeviceLogSyncError) objectRef2.element).name());
        }
        bVar.a = userFormRepository3;
        bVar.b = null;
        bVar.c = null;
        bVar.d = null;
        bVar.e = null;
        bVar.f = null;
        bVar.k = 3;
        objP = feedbackWorkService3.p(userForm, bVar);
        if (objP == coroutine_suspended) {
            return coroutine_suspended;
        }
        userFormRepository2 = userFormRepository3;
        obj2 = objP;
        zBooleanValue = ((Boolean) obj2).booleanValue();
        boolBoxBoolean = Boxing.boxBoolean(zBooleanValue);
        if (boolBoxBoolean.booleanValue()) {
            bVar.a = boolBoxBoolean;
            bVar.k = 5;
            if (userFormRepository2.setFormData(null, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    private final boolean g(boolean isRetry, UserForm userForm) {
        return ((isRetry && this.lastSyncLogFailed) || userForm.getDeviceType() == null || !userForm.getIssueItem().getAdditionalInfo().getDefaultSelectDeviceLog()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void h(Throwable error) {
        if (error instanceof FeedbackException) {
            FeedbackException feedbackException = (FeedbackException) error;
            AnalyticsKt.feedbackFailAnalytics(feedbackException.getErrorCode(), feedbackException.getMessage());
        } else {
            AnalyticsKt.feedbackFailAnalytics(10000, "代码层面异常");
        }
        HMLog.info("feedback", new d(error));
        String string = ((FeedbackConfig) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FeedbackConfig.class), null, null)).getShowErrorMessage() ? error.toString() : null;
        NotificationCompat.Builder builderB = b(getString(R.string.feedback_notify_failed), string);
        a(builderB, ACTION_FEEDBACK_CANCEL);
        a(builderB, ACTION_FEEDBACK_RETRY);
        if (!(string == null || string.length() == 0)) {
            builderB.setStyle(new NotificationCompat.BigTextStyle());
        }
        n();
        m(builderB);
    }

    private final void i(@StringRes int title, @StringRes Integer message) {
        n();
        m(b(getString(title), message == null ? null : getString(message.intValue())));
    }

    public static /* synthetic */ void j(FeedbackWorkService feedbackWorkService, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            num = null;
        }
        feedbackWorkService.i(i2, num);
    }

    private final void k() {
        i(R.string.feedback_notify_uploading_title, Integer.valueOf(R.string.feedback_notify_uploading_message));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        AnalyticsKt.feedbackSuccessAnalytics();
        j(this, R.string.feedback_notify_success, null, 2, null);
    }

    private final void m(NotificationCompat.Builder builder) {
        this.notification = builder.build();
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(this);
        int i2 = this.notificationId;
        Notification notification = this.notification;
        Objects.requireNonNull(notification, "null cannot be cast to non-null type android.app.Notification");
        notificationManagerCompatFrom.notify(i2, notification);
    }

    private final void n() {
        if (Build.VERSION.SDK_INT >= 26) {
            String string = getString(R.string.feedback_title_new);
            NotificationChannel notificationChannel = new NotificationChannel(f, string, 4);
            notificationChannel.setDescription(string);
            NotificationManager notificationManager = (NotificationManager) getSystemService(SleepHomeActivity.FROM_NOTIFICATION);
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            } else {
                HMLog.error$default("feedback", null, null, e.a, 6, null);
            }
        }
    }

    private final void o(boolean isRetry) {
        kotlinx.coroutines.e.f(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new f(isRetry, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v24, types: [T, java.lang.Throwable] */
    public final Object p(UserForm userForm, Continuation<? super Boolean> continuation) throws Throwable {
        g gVar;
        FeedbackWorkService feedbackWorkService;
        Ref.BooleanRef booleanRef;
        Ref.ObjectRef objectRef;
        long j;
        Ref.BooleanRef booleanRef2;
        Object objM3845constructorimpl;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i2 = gVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.h = i2 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        g gVar2 = gVar;
        Object objSubmitLog = gVar2.f;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = gVar2.h;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objSubmitLog);
            HMLog.info("feedback", h.a);
            SubmitLogRepository submitLogRepository = (SubmitLogRepository) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(SubmitLogRepository.class), null, null);
            long validUid = AccountServiceExtKt.getValidUid((AccountService) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(AccountService.class), null, null));
            if (validUid == -1) {
                throw new FeedbackException(10000, "未获取到用户ID");
            }
            String nickname = HMPersonInfo.getInstance().getUserInfo().getNickname();
            AnalyticsKt.feedbackFromAnalytics(i);
            Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                Result.Companion companion = Result.Companion;
                String str = i;
                gVar2.a = booleanRef3;
                gVar2.b = objectRef2;
                gVar2.c = booleanRef3;
                gVar2.d = this;
                gVar2.e = jCurrentTimeMillis;
                gVar2.h = 1;
                objSubmitLog = submitLogRepository.submitLog(validUid, nickname, userForm, str, gVar2);
                if (objSubmitLog == coroutine_suspended) {
                    return coroutine_suspended;
                }
                feedbackWorkService = this;
                booleanRef2 = booleanRef3;
                booleanRef = booleanRef2;
                objectRef = objectRef2;
                j = jCurrentTimeMillis;
            } catch (Throwable th) {
                th = th;
                feedbackWorkService = this;
                booleanRef = booleanRef3;
                objectRef = objectRef2;
                j = jCurrentTimeMillis;
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = gVar2.e;
            feedbackWorkService = (FeedbackWorkService) gVar2.d;
            booleanRef2 = (Ref.BooleanRef) gVar2.c;
            objectRef = (Ref.ObjectRef) gVar2.b;
            booleanRef = (Ref.BooleanRef) gVar2.a;
            try {
                ResultKt.throwOnFailure(objSubmitLog);
            } catch (Throwable th2) {
                th = th2;
                Result.Companion companion3 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
        }
        booleanRef2.element = ((Boolean) objSubmitLog).booleanValue();
        objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        ?? M3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (M3848exceptionOrNullimpl != 0) {
            objectRef.element = M3848exceptionOrNullimpl;
        }
        Unit unit = Unit.INSTANCE;
        feedbackWorkService.postFileDuration = System.currentTimeMillis() - j;
        Throwable th3 = (Throwable) objectRef.element;
        if (th3 == null) {
            return Boxing.boxBoolean(booleanRef.element);
        }
        throw th3;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@Nullable Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        String action;
        if (intent != null && (action = intent.getAction()) != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 550976366) {
                if (iHashCode != 1455355543) {
                    if (iHashCode == 1733023851 && action.equals(ACTION_FEEDBACK_CANCEL)) {
                        stopForeground(true);
                    }
                } else if (action.equals(ACTION_FEEDBACK_RETRY)) {
                    e(true);
                }
            } else if (action.equals(ACTION_FEEDBACK)) {
                e(false);
            }
        }
        return 2;
    }
}
