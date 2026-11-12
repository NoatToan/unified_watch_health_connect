package com.huami.assistant.ui.v2.usecase;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.provider.CalendarContract;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.assistant.AssistantModule;
import com.huami.assistant.ui.v2.repo.ScheduleRpcApi;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.AndroidPermissions;
import com.tekartik.sqflite.Constant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0001/B\u0017\b\u0002\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b-\u0010.J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\u0006\u0010\t\u001a\u00020\u0002J\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0002R\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010%\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b\u0017\u0010$R\u001d\u0010)\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b\u001b\u0010(R\u0018\u0010,\u001a\u0004\u0018\u00010*8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010+¨\u00060"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/SystemCalendarObserverUseCase;", "", "", "f", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "allScheduleModel", "a", "sendCorrectSysMsg", "release", Constant.METHOD_EXECUTE, "cancelCorrect", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "Ljava/lang/ref/WeakReference;", "getContextRef", "()Ljava/lang/ref/WeakReference;", "contextRef", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mIsInited", "Landroid/database/ContentObserver;", "c", "Landroid/database/ContentObserver;", "contentObserver", "Landroid/os/HandlerThread;", GoogleApiAvailabilityLight.a, "Landroid/os/HandlerThread;", "mHandlerThread", "Landroid/os/Handler;", "e", "Landroid/os/Handler;", "mHandler", "Lcom/huami/assistant/ui/v2/usecase/CorrectSysScheduleDbData;", "Lkotlin/Lazy;", "()Lcom/huami/assistant/ui/v2/usecase/CorrectSysScheduleDbData;", "correctSysScheduleDbData", "Lcom/huami/assistant/ui/v2/usecase/CorrectSysScheduleDeviceData;", "g", "()Lcom/huami/assistant/ui/v2/usecase/CorrectSysScheduleDeviceData;", "correctSysScheduleDeviceData", "Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "()Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "scheduleRpcApi", "<init>", "(Ljava/lang/ref/WeakReference;)V", "Companion", "assistant_release"}, k = 1, mv = {1, 5, 1})
public final class SystemCalendarObserverUseCase {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static volatile SystemCalendarObserverUseCase h = null;

    @NotNull
    private static final String i = "Schedule-->SystemCalendarObserverUseCase";
    private static final int j = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final WeakReference<Context> contextRef;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean mIsInited;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final ContentObserver contentObserver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private HandlerThread mHandlerThread;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Handler mHandler;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy correctSysScheduleDbData;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy correctSysScheduleDeviceData;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/SystemCalendarObserverUseCase$Companion;", "", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "contextRef", "Lcom/huami/assistant/ui/v2/usecase/SystemCalendarObserverUseCase;", "getInstance", "", "MSG_CORRECT_SYS_SCHEDULE_DATA", LogUtil.I, "", "TAG", "Ljava/lang/String;", DefaultSettingsSpiCall.n, "Lcom/huami/assistant/ui/v2/usecase/SystemCalendarObserverUseCase;", "<init>", "()V", "assistant_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SystemCalendarObserverUseCase getInstance(@NotNull WeakReference<Context> contextRef) {
            if (SystemCalendarObserverUseCase.h == null) {
                synchronized (this) {
                    if (SystemCalendarObserverUseCase.h == null) {
                        Companion companion = SystemCalendarObserverUseCase.INSTANCE;
                        SystemCalendarObserverUseCase.h = new SystemCalendarObserverUseCase(contextRef, null);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return SystemCalendarObserverUseCase.h;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "context not null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "start correctSysScheduleData";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "stop correctSysScheduleData";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/CorrectSysScheduleDbData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<CorrectSysScheduleDbData> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CorrectSysScheduleDbData invoke() {
            return new CorrectSysScheduleDbData(SystemCalendarObserverUseCase.this.getContextRef());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/assistant/ui/v2/usecase/CorrectSysScheduleDeviceData;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<CorrectSysScheduleDeviceData> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CorrectSysScheduleDeviceData invoke() {
            return new CorrectSysScheduleDeviceData(SystemCalendarObserverUseCase.this.getContextRef());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "context not null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "registerContentObserver return because is initialized";
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
        public final String invoke() {
            return "permission not granted";
        }
    }

    private SystemCalendarObserverUseCase(WeakReference<Context> weakReference) {
        this.contextRef = weakReference;
        this.mIsInited = new AtomicBoolean(false);
        final Handler handler = new Handler(Looper.getMainLooper());
        this.contentObserver = new ContentObserver(handler) { // from class: com.huami.assistant.ui.v2.usecase.SystemCalendarObserverUseCase$contentObserver$1

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public static final a a = new a();

                public a() {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return "system schedule change, app start sync";
                }
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                super.onChange(selfChange);
                HMLog.info("Schedule-->SystemCalendarObserverUseCase", a.a);
                SystemCalendarObserverUseCase.sendCorrectSysMsg$default(this.a, null, 1, null);
            }
        };
        this.correctSysScheduleDbData = LazyKt__LazyJVMKt.lazy(new d());
        this.correctSysScheduleDeviceData = LazyKt__LazyJVMKt.lazy(new e());
        HandlerThread handlerThread = new HandlerThread("SystemCalendarObserverUseCase");
        this.mHandlerThread = handlerThread;
        handlerThread.start();
        this.mHandler = new Handler(this.mHandlerThread.getLooper()) { // from class: com.huami.assistant.ui.v2.usecase.SystemCalendarObserverUseCase.1
            @Override // android.os.Handler
            public void handleMessage(@NotNull Message msg) {
                Object objM3845constructorimpl;
                if (msg.what == 1) {
                    Object obj = msg.obj;
                    List list = null;
                    if (obj != null) {
                        try {
                            Result.Companion companion = Result.Companion;
                            objM3845constructorimpl = Result.m3845constructorimpl((List) obj);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                        }
                        list = (List) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
                    }
                    SystemCalendarObserverUseCase.this.a(list);
                }
            }
        };
    }

    public /* synthetic */ SystemCalendarObserverUseCase(WeakReference weakReference, DefaultConstructorMarker defaultConstructorMarker) {
        this(weakReference);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void a(List<ScheduleModel> allScheduleModel) {
        if (this.contextRef.get() == null) {
            HMLog.info(i, a.a);
            return;
        }
        if (this.contextRef.get() != null) {
            HMLog.info(i, b.a);
            c().correct();
            if (allScheduleModel == null) {
                ScheduleRpcApi scheduleRpcApiE = e();
                allScheduleModel = scheduleRpcApiE == null ? null : scheduleRpcApiE.findAll();
            }
            if (allScheduleModel != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(allScheduleModel, 10));
                Iterator<T> it2 = allScheduleModel.iterator();
                while (it2.hasNext()) {
                    arrayList.add(com.huami.assistant.ui.v2.model.ScheduleModel.INSTANCE.fromWatchSchedule((ScheduleModel) it2.next()));
                }
                d().correct(arrayList);
            }
            HMLog.info(i, c.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(SystemCalendarObserverUseCase systemCalendarObserverUseCase, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = null;
        }
        systemCalendarObserverUseCase.a(list);
    }

    private final CorrectSysScheduleDbData c() {
        return (CorrectSysScheduleDbData) this.correctSysScheduleDbData.getValue();
    }

    private final CorrectSysScheduleDeviceData d() {
        return (CorrectSysScheduleDeviceData) this.correctSysScheduleDeviceData.getValue();
    }

    private final ScheduleRpcApi e() {
        return AssistantModule.getScheduleApi();
    }

    private final void f() {
        ContentResolver contentResolver;
        if (this.mIsInited.get()) {
            HMLog.info(i, g.a);
            return;
        }
        if (!AndroidPermissions.checkGranted(this.contextRef.get(), "android.permission.READ_CALENDAR")) {
            HMLog.info(i, h.a);
            return;
        }
        Context context = this.contextRef.get();
        if (context != null && (contentResolver = context.getContentResolver()) != null) {
            contentResolver.registerContentObserver(CalendarContract.Events.CONTENT_URI, true, this.contentObserver);
        }
        this.mIsInited.set(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendCorrectSysMsg$default(SystemCalendarObserverUseCase systemCalendarObserverUseCase, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = null;
        }
        systemCalendarObserverUseCase.sendCorrectSysMsg(list);
    }

    public final void cancelCorrect() {
        c().setInterrupt();
        d().setInterrupt();
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.removeMessages(1);
    }

    public final void execute() {
        if (this.contextRef.get() == null) {
            HMLog.info(i, f.a);
        } else {
            f();
        }
    }

    @NotNull
    public final WeakReference<Context> getContextRef() {
        return this.contextRef;
    }

    public final void release() {
        ContentResolver contentResolver;
        Context context = this.contextRef.get();
        if (context != null && (contentResolver = context.getContentResolver()) != null) {
            contentResolver.unregisterContentObserver(this.contentObserver);
        }
        this.mIsInited.compareAndSet(true, false);
    }

    public final void sendCorrectSysMsg(@Nullable List<ScheduleModel> allScheduleModel) {
        Message message = new Message();
        message.what = 1;
        message.obj = allScheduleModel;
        Handler handler = this.mHandler;
        if (handler == null) {
            return;
        }
        handler.sendMessage(message);
    }
}
