package defpackage;

import io.sentry.SentryOptions;
import io.sentry.protocol.t;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.util.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.TestOnly;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class uvl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final tvl f36192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SentryOptions f36193b;

    public uvl(@NotNull tvl tvlVar, @NotNull SentryOptions sentryOptions) {
        this.f36192a = (tvl) p.c(tvlVar, "The SentryStackTraceFactory is required.");
        this.f36193b = (SentryOptions) p.c(sentryOptions, "The SentryOptions is required");
    }

    @Nullable
    public List<v> a() {
        HashMap map = new HashMap();
        Thread threadCurrentThread = Thread.currentThread();
        map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        return c(map, null, false);
    }

    @Nullable
    public List<v> b(@Nullable List<Long> list, boolean z) {
        return c(Thread.getAllStackTraces(), list, z);
    }

    @TestOnly
    @Nullable
    public List<v> c(@NotNull Map<Thread, StackTraceElement[]> map, @Nullable List<Long> list, boolean z) {
        Thread threadCurrentThread = Thread.currentThread();
        if (map.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!map.containsKey(threadCurrentThread)) {
            map.put(threadCurrentThread, threadCurrentThread.getStackTrace());
        }
        for (Map.Entry<Thread, StackTraceElement[]> entry : map.entrySet()) {
            Thread key = entry.getKey();
            arrayList.add(d((key == threadCurrentThread && !z) || (list != null && list.contains(Long.valueOf(key.getId()))), entry.getValue(), entry.getKey()));
        }
        return arrayList;
    }

    @NotNull
    public final v d(boolean z, @NotNull StackTraceElement[] stackTraceElementArr, @NotNull Thread thread) {
        v vVar = new v();
        vVar.w(thread.getName());
        vVar.x(Integer.valueOf(thread.getPriority()));
        vVar.u(Long.valueOf(thread.getId()));
        vVar.s(Boolean.valueOf(thread.isDaemon()));
        vVar.z(thread.getState().name());
        vVar.q(Boolean.valueOf(z));
        List<t> listA = this.f36192a.a(stackTraceElementArr, false);
        if (this.f36193b.isAttachStacktrace() && listA != null && !listA.isEmpty()) {
            u uVar = new u(listA);
            uVar.e(Boolean.TRUE);
            vVar.y(uVar);
        }
        return vVar;
    }
}
