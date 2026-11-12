package com.huami.tools.analytics;

import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.internal.function.Function;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001c\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\f\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0019\u0010\u0012\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u000e\u0010\u001fR0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lcom/huami/tools/analytics/WebRecordDelegate;", "", "", "genUrl", "", "Lcom/huami/tools/analytics/Event;", "events", "", "uploadEvents", "url", "", "delegateRequest", "generateReportJson", "Lcom/huami/tools/analytics/Config;", "a", "Lcom/huami/tools/analytics/Config;", "getConfig", "()Lcom/huami/tools/analytics/Config;", "config", "b", "Ljava/lang/String;", "tag", "c", "apiPath", "Lcom/huami/tools/analytics/a0;", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "()Lcom/huami/tools/analytics/a0;", "webRecorder", "Lcom/huami/tools/analytics/Logger;", "e", "()Lcom/huami/tools/analytics/Logger;", "logger", "Lcom/huami/tools/analytics/internal/function/Function;", "f", "Lcom/huami/tools/analytics/internal/function/Function;", "getUrlMapper", "()Lcom/huami/tools/analytics/internal/function/Function;", "setUrlMapper", "(Lcom/huami/tools/analytics/internal/function/Function;)V", "urlMapper", "<init>", "(Lcom/huami/tools/analytics/Config;)V", "analytics_release"}, k = 1, mv = {1, 5, 1})
public final class WebRecordDelegate {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Config config;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String apiPath = "api/v5/app/collect_hm";

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy webRecorder = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy logger = LazyKt__LazyJVMKt.lazy(b.a);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function<String, String> urlMapper;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/Logger;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Logger, Unit> {
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.b = str;
        }

        public final void a(@NotNull Logger logger) {
            logger.d(WebRecordDelegate.this.tag, Intrinsics.stringPlus("data : ", this.b));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Logger logger) {
            a(logger);
            return Unit.INSTANCE;
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/tools/analytics/a0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<a0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a0 invoke() {
            return new a0(HuamiAnalytics.get().k(), WebRecordDelegate.this.getConfig().getDebug(), true, WebRecordDelegate.this.getConfig().getAppId());
        }
    }

    public WebRecordDelegate(@NotNull Config config) {
        this.config = config;
        this.tag = config.getTag();
    }

    private final Logger a() {
        return (Logger) this.logger.getValue();
    }

    private final a0 b() {
        return (a0) this.webRecorder.getValue();
    }

    public final boolean delegateRequest(@NotNull String url, @NotNull List<Event> events) throws Throwable {
        try {
            String strGenerateReportJson = generateReportJson(events);
            if (this.config.getDebug()) {
                a().d(this.tag, "upload body ==> " + url + " \n " + strGenerateReportJson);
                this.config.printlnLog(new a(strGenerateReportJson));
            }
            if (strGenerateReportJson.length() == 0) {
                return false;
            }
            boolean zE = b().e(url, strGenerateReportJson, false);
            if (this.config.getDebug()) {
                a().d(this.tag, "upload result is [" + zE + JsonLexerKt.END_LIST);
            }
            return zE;
        } catch (Exception e) {
            p.b().e("WebRecordDelegate", (Throwable) e);
            e.printStackTrace();
            return false;
        }
    }

    @NotNull
    public final String genUrl() {
        String strApply;
        String str = "https://app-analytics.huami.com/";
        if (this.config.getDebug()) {
            str = "https://api-analytics-test.huami.com/";
        } else {
            Function<String, String> function = this.urlMapper;
            if (function != null && (strApply = function.apply("https://app-analytics.huami.com/")) != null) {
                str = strApply;
            }
        }
        return Intrinsics.stringPlus(str, this.apiPath);
    }

    @NotNull
    public final String generateReportJson(@NotNull List<Event> events) {
        return EventsToJsonConverter.INSTANCE.convertToJson(this.config.getClient(), events, this.config.getIsAnonymous());
    }

    @NotNull
    public final Config getConfig() {
        return this.config;
    }

    @Nullable
    public final Function<String, String> getUrlMapper() {
        return this.urlMapper;
    }

    public final void setUrlMapper(@Nullable Function<String, String> function) {
        this.urlMapper = function;
    }

    public final void uploadEvents(@NotNull List<Event> events) {
        if (this.config.getIsAnonymous()) {
            a().v(this.tag, "实时打点必需实名");
        } else {
            delegateRequest(genUrl(), events);
        }
    }
}
