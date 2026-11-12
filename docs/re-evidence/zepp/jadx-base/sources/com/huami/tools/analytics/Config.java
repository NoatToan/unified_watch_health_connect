package com.huami.tools.analytics;

import android.content.Context;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.UserDataStore;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.ximalaya.ting.android.opensdk.player.statistic.OpenSdkPlayStatisticUpload;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u001b\b\u0000\u0018\u0000 Z2\u00020\u0001:\u0001ZB\u0007¢\u0006\u0004\bX\u0010YJ\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002R\u001c\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0012\u001a\u00020\r8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0018\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001e\u001a\u00020\u00198\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010(\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#\"\u0004\b)\u0010%R\"\u0010*\u001a\u00020\u00078\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010\t\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010-R\"\u0010/\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u00106\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010?\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b<\u0010!\u001a\u0004\b=\u0010#\"\u0004\b>\u0010%R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010L\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010\u001b\u001a\u0004\bI\u0010\u001d\"\u0004\bJ\u0010KR\"\u0010P\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\u001b\u001a\u0004\bN\u0010\u001d\"\u0004\bO\u0010KR\"\u0010T\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010!\u001a\u0004\bR\u0010#\"\u0004\bS\u0010%R\u001d\u0010W\u001a\u00020\u00038B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010\u000f\u001a\u0004\b\b\u0010V¨\u0006["}, d2 = {"Lcom/huami/tools/analytics/Config;", "", "Lkotlin/Function1;", "Lcom/huami/tools/analytics/Logger;", "", UserDataStore.FIRST_NAME, "printlnLog", "", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "Lcom/huami/tools/analytics/WebRecordDelegate;", "b", "Lkotlin/Lazy;", "getWebRecordDelegate", "()Lcom/huami/tools/analytics/WebRecordDelegate;", "webRecordDelegate", "Ljava/util/concurrent/Executor;", "kotlin.jvm.PlatformType", "c", "getUploadExecutor", "()Ljava/util/concurrent/Executor;", "uploadExecutor", "", GoogleApiAvailabilityLight.a, LogUtil.I, "getQueueMaxSize", "()I", "queueMaxSize", "", "e", "Z", "getDebug", "()Z", "setDebug", "(Z)V", "debug", "f", "isAnonymous", "setAnonymous", "appId", "getAppId", "setAppId", "(Ljava/lang/String;)V", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "Lcom/huami/tools/analytics/d;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "Lcom/huami/tools/analytics/d;", "getClient", "()Lcom/huami/tools/analytics/d;", "setClient", "(Lcom/huami/tools/analytics/d;)V", "g", "getAutoStart", "setAutoStart", "autoStart", "", "h", "J", "getTicker", "()J", "setTicker", "(J)V", "ticker", "i", "getTaskLimitSize", "setTaskLimitSize", "(I)V", "taskLimitSize", com.loc.z.j, "getLimitSize", "setLimitSize", "limitSize", hl.k, "getEnQueueWhenFailed", "setEnQueueWhenFailed", "enQueueWhenFailed", "l", "()Lcom/huami/tools/analytics/Logger;", "logger", "<init>", "()V", "Companion", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class Config {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public String appId;
    public d client;
    public Context context;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean isAnonymous;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean enQueueWhenFailed;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String tag = "TimerTracker";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy webRecordDelegate = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy uploadExecutor = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int queueMaxSize = 10000;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean debug = true;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean autoStart = true;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long ticker = 5000;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int taskLimitSize = 60;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int limitSize = 100;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004JT\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/tools/analytics/Config$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "appId", "Lcom/huami/tools/analytics/Config;", "debugConfig", "", "debug", "autoStart", "", "ticker", "taskLimitSize", "enQueueWhenFailed", "Lcom/huami/tools/analytics/d;", OpenSdkPlayStatisticUpload.KEY_CLIENT, "config", "<init>", "()V", "analytics_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Config config$default(Companion companion, boolean z, Context context, String str, boolean z2, int i, int i2, boolean z3, d dVar, int i3, Object obj) {
            return companion.config((i3 & 1) != 0 ? false : z, context, str, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? 5000 : i, (i3 & 32) != 0 ? 30 : i2, (i3 & 64) != 0 ? false : z3, (i3 & 128) != 0 ? null : dVar);
        }

        @NotNull
        public final Config config(boolean debug, @NotNull Context context, @NotNull String appId, boolean autoStart, int ticker, int taskLimitSize, boolean enQueueWhenFailed, @Nullable d client) {
            Config config = new Config();
            config.setDebug(debug);
            config.setAppId(appId);
            config.setTicker(ticker);
            config.setTaskLimitSize(taskLimitSize);
            config.setEnQueueWhenFailed(enQueueWhenFailed);
            config.setAutoStart(autoStart);
            config.setContext(context);
            if (client != null) {
                config.setClient(client);
            }
            return config;
        }

        @NotNull
        public final Config debugConfig(@NotNull Context context, @NotNull String appId) {
            Config configConfig$default = config$default(this, false, context, appId, false, 1000, 0, false, null, 233, null);
            configConfig$default.setDebug(true);
            return configConfig$default;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/Logger;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Logger> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Logger invoke() {
            return p.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Ljava/util/concurrent/Executor;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Executor> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Executor invoke() {
            return HuamiAnalytics.get().n();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/WebRecordDelegate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<WebRecordDelegate> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebRecordDelegate invoke() {
            return new WebRecordDelegate(Config.this);
        }
    }

    private final Logger a() {
        return (Logger) this.logger.getValue();
    }

    @NotNull
    public final String getAppId() {
        String str = this.appId;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final boolean getAutoStart() {
        return this.autoStart;
    }

    @NotNull
    public final d getClient() {
        d dVar = this.client;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @NotNull
    public final Context getContext() {
        Context context = this.context;
        if (context != null) {
            return context;
        }
        return null;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final boolean getEnQueueWhenFailed() {
        return this.enQueueWhenFailed;
    }

    public final int getLimitSize() {
        return this.limitSize;
    }

    public final int getQueueMaxSize() {
        return this.queueMaxSize;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final int getTaskLimitSize() {
        return this.taskLimitSize;
    }

    public final long getTicker() {
        return this.ticker;
    }

    public final Executor getUploadExecutor() {
        return (Executor) this.uploadExecutor.getValue();
    }

    @NotNull
    public final WebRecordDelegate getWebRecordDelegate() {
        return (WebRecordDelegate) this.webRecordDelegate.getValue();
    }

    /* JADX INFO: renamed from: isAnonymous, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    public final void printlnLog(@NotNull Function1<? super Logger, Unit> fn) {
        fn.invoke(a());
    }

    public final void setAnonymous(boolean z) {
        this.isAnonymous = z;
    }

    public final void setAppId(@NotNull String str) {
        this.appId = str;
    }

    public final void setAutoStart(boolean z) {
        this.autoStart = z;
    }

    public final void setClient(@NotNull d dVar) {
        this.client = dVar;
    }

    public final void setContext(@NotNull Context context) {
        this.context = context;
    }

    public final void setDebug(boolean z) {
        this.debug = z;
    }

    public final void setEnQueueWhenFailed(boolean z) {
        this.enQueueWhenFailed = z;
    }

    public final void setLimitSize(int i) {
        this.limitSize = i;
    }

    public final void setTaskLimitSize(int i) {
        this.taskLimitSize = i;
    }

    public final void setTicker(long j) {
        this.ticker = j;
    }
}
