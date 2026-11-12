package io.sentry.clientreport;

import io.sentry.DataCategory;
import io.sentry.util.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final m<Map<d, AtomicLong>> f21692a = new m<>(new m.a() { // from class: io.sentry.clientreport.a
        @Override // io.sentry.util.m.a
        public final Object a() {
            return b.d();
        }
    });

    public static /* synthetic */ Map d() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (DiscardReason discardReason : DiscardReason.values()) {
            for (DataCategory dataCategory : DataCategory.values()) {
                concurrentHashMap.put(new d(discardReason.getReason(), dataCategory.getCategory()), new AtomicLong(0L));
            }
        }
        return Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.clientreport.h
    public void a(d dVar, Long l) {
        AtomicLong atomicLong = this.f21692a.a().get(dVar);
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    @Override // io.sentry.clientreport.h
    public List<f> b() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<d, AtomicLong> entry : this.f21692a.a().entrySet()) {
            long andSet = entry.getValue().getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new f(entry.getKey().b(), entry.getKey().a(), lValueOf));
            }
        }
        return arrayList;
    }
}
