package com.huami.tools.analytics;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.huami.tools.analytics.internal.function.Consumer;
import com.huami.tools.analytics.internal.function.Function;
import com.huami.tools.analytics.internal.utils.Const;
import com.huami.tools.analytics.internal.utils.DefaultClock;
import com.huami.tools.analytics.internal.utils.JavaUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes15.dex */
class z implements q {
    private final String a;
    private Executor b;
    private f c;
    private e d;
    private a0 e;

    public z(@NonNull Executor executor, @NonNull f fVar, @NonNull e eVar, @NonNull a0 a0Var, boolean z) {
        this.b = executor;
        this.c = fVar;
        this.e = a0Var;
        this.d = eVar;
        StringBuilder sb = new StringBuilder();
        sb.append(Const.LOG_TAG_PREFIX);
        sb.append(z ? "AnonymousUploadRecorder" : "IdentifiedUploadRecorder");
        this.a = sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(List list) {
        i(list, y());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p(String str, List list) {
        d dVarQueryContext = this.c.queryContext(str);
        if (dVarQueryContext != null) {
            A(list, w(dVarQueryContext));
        } else {
            p.b().w(this.a, String.format(Locale.CHINA, "找不到指定的事件上下文，不上传这批数据，contextId: %s", str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Consumer q(final String str) {
        return new Consumer() { // from class: com.huami.tools.analytics.v
            @Override // com.huami.tools.analytics.internal.function.Consumer
            public final void accept(Object obj) {
                this.a.p(str, (List) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s() {
        z(u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(List list) {
        p.b().v(this.a, String.format(Locale.CHINA, "共%d条数据，开始分批上传", Integer.valueOf(list.size())));
        k(list, v());
        j();
    }

    @VisibleForTesting
    public void A(List<Event> list, Consumer<List<Event>> consumer) {
        JavaUtils.segmentList(list, 40, consumer);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public void r(d dVar, List<Event> list) {
        if (this.e.c(dVar, list)) {
            this.c.deleteEvents(list);
        }
    }

    @Override // com.huami.tools.analytics.q
    public void a(Event event) {
        this.b.execute(x());
    }

    @VisibleForTesting
    public void i(List<Event> list, Consumer<List<Event>> consumer) {
        if (m(list.size())) {
            consumer.accept(list);
        }
    }

    @VisibleForTesting
    public void j() {
        this.c.clearUselessContexts(this.d.a().a);
    }

    @VisibleForTesting
    public void k(List<Event> list, Function<String, Consumer<List<Event>>> function) {
        JavaUtils.groupList(list, new Function() { // from class: com.huami.tools.analytics.x
            @Override // com.huami.tools.analytics.internal.function.Function
            public final Object apply(Object obj) {
                return ((Event) obj).getContextId();
            }
        }, function);
    }

    @VisibleForTesting
    public boolean l(List<Event> list) {
        boolean z;
        long jCurrentTimeMillis = DefaultClock.get().currentTimeMillis();
        Iterator<Event> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                z = false;
                break;
            }
            Event next = it2.next();
            if (next.getTimestamp() != null && jCurrentTimeMillis - next.getTimestamp().longValue() >= Const.REPORT_DELAY_TOLERANCE) {
                z = true;
                break;
            }
        }
        if (!z) {
            p.b().v(this.a, String.format(Locale.CHINA, "当前数据量（%d）未达到上传要求的最小数量（%d），也没有任何过旧的数据，暂不上传", Integer.valueOf(list.size()), 0));
        }
        return z;
    }

    @VisibleForTesting
    public boolean m(@IntRange(from = 0) int i) {
        return i >= 0;
    }

    @VisibleForTesting
    public Consumer<List<Event>> u() {
        return new Consumer() { // from class: com.huami.tools.analytics.t
            @Override // com.huami.tools.analytics.internal.function.Consumer
            public final void accept(Object obj) {
                this.a.o((List) obj);
            }
        };
    }

    @VisibleForTesting
    public Function<String, Consumer<List<Event>>> v() {
        return new Function() { // from class: com.huami.tools.analytics.w
            @Override // com.huami.tools.analytics.internal.function.Function
            public final Object apply(Object obj) {
                return this.a.q((String) obj);
            }
        };
    }

    @VisibleForTesting
    public Consumer<List<Event>> w(final d dVar) {
        return new Consumer() { // from class: com.huami.tools.analytics.u
            @Override // com.huami.tools.analytics.internal.function.Consumer
            public final void accept(Object obj) {
                this.a.r(dVar, (List) obj);
            }
        };
    }

    @VisibleForTesting
    public Runnable x() {
        return new Runnable() { // from class: com.huami.tools.analytics.y
            @Override // java.lang.Runnable
            public final void run() {
                this.a.s();
            }
        };
    }

    @VisibleForTesting
    public Consumer<List<Event>> y() {
        return new Consumer() { // from class: com.huami.tools.analytics.s
            @Override // com.huami.tools.analytics.internal.function.Consumer
            public final void accept(Object obj) {
                this.a.t((List) obj);
            }
        };
    }

    @VisibleForTesting
    public void z(Consumer<List<Event>> consumer) {
        List<Event> listQueryEvents = this.c.queryEvents();
        if (listQueryEvents.isEmpty()) {
            p.b().v(this.a, "无数据，不上传");
        } else {
            consumer.accept(listQueryEvents);
        }
    }
}
