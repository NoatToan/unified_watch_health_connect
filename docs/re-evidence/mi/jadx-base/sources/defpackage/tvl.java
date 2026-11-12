package defpackage;

import io.sentry.SentryOptions;
import io.sentry.protocol.t;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class tvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SentryOptions f35110a;

    public tvl(@NotNull SentryOptions sentryOptions) {
        this.f35110a = sentryOptions;
    }

    @Nullable
    public List<t> a(@Nullable StackTraceElement[] stackTraceElementArr, boolean z) {
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            if (stackTraceElement != null) {
                String className = stackTraceElement.getClassName();
                if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
                    t tVar = new t();
                    tVar.u(b(className));
                    tVar.x(className);
                    tVar.t(stackTraceElement.getMethodName());
                    tVar.s(stackTraceElement.getFileName());
                    if (stackTraceElement.getLineNumber() >= 0) {
                        tVar.v(Integer.valueOf(stackTraceElement.getLineNumber()));
                    }
                    tVar.y(Boolean.valueOf(stackTraceElement.isNativeMethod()));
                    arrayList.add(tVar);
                    if (arrayList.size() >= 100) {
                        break;
                    }
                }
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    @Nullable
    public Boolean b(@Nullable String str) {
        if (str == null || str.isEmpty()) {
            return Boolean.TRUE;
        }
        Iterator<String> it = this.f35110a.getInAppIncludes().iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return Boolean.TRUE;
            }
        }
        Iterator<String> it2 = this.f35110a.getInAppExcludes().iterator();
        while (it2.hasNext()) {
            if (str.startsWith(it2.next())) {
                return Boolean.FALSE;
            }
        }
        return null;
    }
}
