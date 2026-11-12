package defpackage;

import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.s;
import io.sentry.util.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class r67 implements ae8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<Throwable, Object> f32231a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SentryOptions f32232b;

    public r67(@NotNull SentryOptions sentryOptions) {
        this.f32232b = (SentryOptions) p.c(sentryOptions, "options are required");
    }

    @NotNull
    public static List<Throwable> d(@NotNull Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th.getCause() != null) {
            arrayList.add(th.getCause());
            th = th.getCause();
        }
        return arrayList;
    }

    public static <T> boolean e(@NotNull Map<T, Object> map, @NotNull List<T> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ae8
    @Nullable
    public s a(@NotNull s sVar, @NotNull c8c c8cVar) {
        if (this.f32232b.isEnableDeduplication()) {
            Throwable thO = sVar.O();
            if (thO != null) {
                if (this.f32231a.containsKey(thO) || e(this.f32231a, d(thO))) {
                    this.f32232b.getLogger().c(SentryLevel.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", sVar.G());
                    return null;
                }
                this.f32231a.put(thO, null);
            }
        } else {
            this.f32232b.getLogger().c(SentryLevel.DEBUG, "Event deduplication is disabled.", new Object[0]);
        }
        return sVar;
    }
}
