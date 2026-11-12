package com.xiaomi.fitness.exception.export;

import io.sentry.SentryLevel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\bf\u0018\u0000 \r2\u00020\u0001:\u0001\rJ6\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH&J(\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H&J&\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\nH&¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/exception/export/ExceptionHelper;", "", "uploadEvent", "", "tags", "", "", "level", "Lio/sentry/SentryLevel;", "params", "", "message", "addBreadcrumb", "Companion", "exception-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ExceptionHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/xiaomi/fitness/exception/export/ExceptionHelper$Companion;", "", "<init>", "()V", "exception-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    void addBreadcrumb(@NotNull SentryLevel level, @NotNull Map<String, ? extends Object> params);

    void uploadEvent(@NotNull List<String> tags, @NotNull SentryLevel level, @NotNull String message);

    void uploadEvent(@NotNull List<String> tags, @NotNull SentryLevel level, @NotNull Map<String, ? extends Object> params);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void addBreadcrumb$default(ExceptionHelper exceptionHelper, SentryLevel sentryLevel, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addBreadcrumb");
            }
            if ((i & 1) != 0) {
                sentryLevel = SentryLevel.INFO;
            }
            exceptionHelper.addBreadcrumb(sentryLevel, map);
        }

        public static /* synthetic */ void uploadEvent$default(ExceptionHelper exceptionHelper, List list, SentryLevel sentryLevel, Map map, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadEvent");
            }
            if ((i & 2) != 0) {
                sentryLevel = SentryLevel.ERROR;
            }
            exceptionHelper.uploadEvent((List<String>) list, sentryLevel, (Map<String, ? extends Object>) map);
        }

        public static /* synthetic */ void uploadEvent$default(ExceptionHelper exceptionHelper, List list, SentryLevel sentryLevel, String str, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadEvent");
            }
            if ((i & 2) != 0) {
                sentryLevel = SentryLevel.ERROR;
            }
            exceptionHelper.uploadEvent((List<String>) list, sentryLevel, str);
        }
    }
}
