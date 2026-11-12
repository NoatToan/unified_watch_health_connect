package com.huami.tools.analytics;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.internal.function.Function;
import com.huami.tools.analytics.rt.timer.TimerTaskManager;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b2\u00103J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0016J\u001c\u0010\u0012\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000bH\u0016J&\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000b2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0017H\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR%\u0010\"\u001a\n \u001d*\u0004\u0018\u00010\u000b0\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010%\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u001e\u0010$R%\u0010)\u001a\n \u001d*\u0004\u0018\u00010&0&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b\u001a\u0010(R\u001d\u0010-\u001a\u00020*8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b+\u0010,R\u001d\u00101\u001a\u00020.8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u0010\u001f\u001a\u0004\b'\u00100¨\u00064"}, d2 = {"Lcom/huami/tools/analytics/TimerUploadTracker;", "Lcom/huami/tools/analytics/Tracker;", "", "debug", "", "setDebug", "enable", "enableAutoTrackPage", "Lcom/huami/tools/analytics/HitEvent;", "event", "record", "", "uid", "setUid", "region", "setRegion", "Lcom/huami/tools/analytics/internal/function/Function;", "mapper", "setUploadHostMapper", "getOriginalUploadHost", "pageName", "recordPageStart", "recordPageEnd", "", "params", "Lcom/huami/tools/analytics/Config;", "a", "Lcom/huami/tools/analytics/Config;", "config", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "c", "()Ljava/lang/String;", "tag", "Lcom/huami/tools/analytics/Logger;", "()Lcom/huami/tools/analytics/Logger;", "logger", "Lcom/huami/tools/analytics/HuamiAnalytics;", GoogleApiAvailabilityLight.a, "()Lcom/huami/tools/analytics/HuamiAnalytics;", "huamiAnalytics", "Lcom/huami/tools/analytics/WebRecordDelegate;", "e", "()Lcom/huami/tools/analytics/WebRecordDelegate;", "webRecordDelegate", "Lcom/huami/tools/analytics/rt/timer/TimerTaskManager;", "f", "()Lcom/huami/tools/analytics/rt/timer/TimerTaskManager;", "timerTaskManager", "<init>", "(Lcom/huami/tools/analytics/Config;)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class TimerUploadTracker implements Tracker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Config config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy tag = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy huamiAnalytics = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy webRecordDelegate = LazyKt__LazyJVMKt.lazy(new e());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy timerTaskManager = LazyKt__LazyJVMKt.lazy(new d());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/HuamiAnalytics;", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HuamiAnalytics> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HuamiAnalytics invoke() {
            return HuamiAnalytics.get();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/Logger;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Logger> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Logger invoke() {
            return p.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return TimerUploadTracker.this.getClass().getSimpleName();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/rt/timer/TimerTaskManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<TimerTaskManager> {

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
        public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<List<? extends Event>, Unit> {
            public a(Object obj) {
                super(1, obj, WebRecordDelegate.class, "uploadEvents", "uploadEvents(Ljava/util/List;)V", 0);
            }

            public final void a(@NotNull List<Event> list) {
                ((WebRecordDelegate) this.receiver).uploadEvents(list);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(List<? extends Event> list) {
                a(list);
                return Unit.INSTANCE;
            }
        }

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final TimerTaskManager invoke() {
            TimerTaskManager timerTaskManager = new TimerTaskManager(TimerUploadTracker.this.config, new a(TimerUploadTracker.this.e()));
            if (TimerUploadTracker.this.config.getAutoStart()) {
                timerTaskManager.start();
            }
            return timerTaskManager;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/WebRecordDelegate;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<WebRecordDelegate> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WebRecordDelegate invoke() {
            return new WebRecordDelegate(TimerUploadTracker.this.config);
        }
    }

    public TimerUploadTracker(@NotNull Config config) {
        this.config = config;
    }

    private final HuamiAnalytics a() {
        return (HuamiAnalytics) this.huamiAnalytics.getValue();
    }

    private final Logger b() {
        return (Logger) this.logger.getValue();
    }

    private final String c() {
        return (String) this.tag.getValue();
    }

    private final TimerTaskManager d() {
        return (TimerTaskManager) this.timerTaskManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebRecordDelegate e() {
        return (WebRecordDelegate) this.webRecordDelegate.getValue();
    }

    @Override // com.huami.tools.analytics.Tracker
    public void enableAutoTrackPage(boolean enable) {
        try {
            this.config.setAutoStart(false);
            TimerTaskManager timerTaskManagerD = d();
            if (enable) {
                timerTaskManagerD.start();
            } else {
                timerTaskManagerD.stop();
            }
        } catch (Throwable th) {
            b().e(c(), th, "set enable or disable error.");
        }
    }

    @Override // com.huami.tools.analytics.Tracker
    @NotNull
    public String getOriginalUploadHost() {
        return "https://app-analytics.huami.com/";
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0035 A[Catch: Exception -> 0x0072, TryCatch #0 {Exception -> 0x0072, blocks: (B:2:0x0000, B:4:0x000a, B:5:0x0017, B:7:0x001f, B:9:0x0029, B:16:0x0042, B:19:0x0066, B:21:0x006a, B:15:0x0035), top: B:26:0x0000 }] */
    @Override // com.huami.tools.analytics.Tracker
    public void record(@Nullable HitEvent event) {
        try {
            if (!a().isEnabled()) {
                b().v(c(), "不记事件因为统计 enable == false");
            }
            if (this.config.getIsAnonymous()) {
                b().e(c(), "实时打点必需为实名统计. 请调用  recorder#setUid 来设置一个有效的userId");
            } else {
                String str = this.config.getClient().b;
                if (str == null || str.length() == 0) {
                    b().e(c(), "实时打点必需为实名统计. 请调用  recorder#setUid 来设置一个有效的userId");
                }
            }
            b().v(c(), " record event [" + event + JsonLexerKt.END_LIST);
            if (event != null && (event instanceof Event)) {
                d().enQueue(event);
            }
        } catch (Exception e2) {
            b().e(c(), e2, "timer upload tracker error!");
        }
    }

    @Override // com.huami.tools.analytics.Tracker
    public void recordPageEnd(@NotNull String pageName) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void recordPageEnd(@NotNull String pageName, @Nullable Map<String, String> params) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void recordPageStart(@NotNull String pageName) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setDebug(boolean debug) {
        this.config.setDebug(debug);
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setRegion(@Nullable String region) {
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setUid(@Nullable String uid) {
        b().v(c(), Intrinsics.stringPlus("set user id : ", uid));
        this.config.getClient().b = uid;
    }

    @Override // com.huami.tools.analytics.Tracker
    public void setUploadHostMapper(@NotNull Function<String, String> mapper) {
        e().setUrlMapper(mapper);
    }
}
