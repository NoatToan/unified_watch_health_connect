package defpackage;

import com.xiaomi.ai.nlp.factoid.entities.EntityType;
import com.xiaomi.ai.nlp.factoid.parsers.ParseResult;
import com.xiaomi.ai.nlp.factoid.parsers.Parser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class hl8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dq5 f20204b;
    public final List<EntityType> c;
    public final List<List<Parser>> d;
    public final ExecutorService e;
    public final int f;
    public final pr5 g;
    public Map<EntityType, Set<ParseResult>> h = new ConcurrentHashMap();

    public class a implements Comparator<q69> {
        public a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(q69 q69Var, q69 q69Var2) {
            if (q69Var.b() != q69Var2.b()) {
                return q69Var.b() < q69Var2.b() ? -1 : 1;
            }
            if (q69Var.c() == q69Var2.c()) {
                return 0;
            }
            return q69Var.c() < q69Var2.c() ? -1 : 1;
        }
    }

    public class b implements Callable<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Parser f20206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public hl8 f20207b;
        public boolean c;
        public long e = 0;
        public long d = 0;

        public b(Parser parser, hl8 hl8Var, boolean z) {
            this.f20206a = parser;
            this.f20207b = hl8Var;
            this.c = z;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            this.d = System.nanoTime();
            try {
                this.f20206a.g(this.f20207b, this.c);
                return null;
            } finally {
                this.e = System.nanoTime();
            }
        }

        public String b() {
            return this.f20206a.c();
        }

        public long c() {
            long j = this.e;
            if (j == 0 && this.d == 0) {
                return 0L;
            }
            return j - this.d;
        }
    }

    public hl8(String str, dq5 dq5Var, List<EntityType> list, List<List<Parser>> list2, pr5 pr5Var, ExecutorService executorService, int i) {
        this.f20203a = str;
        this.f20204b = dq5Var;
        this.c = list;
        this.d = list2;
        this.g = pr5Var;
        this.e = executorService;
        this.f = i;
    }

    public final List<q69> a() {
        ArrayList arrayList = new ArrayList();
        for (EntityType entityType : this.c) {
            if (this.h.containsKey(entityType)) {
                Iterator<ParseResult> it = this.h.get(entityType).iterator();
                while (it.hasNext()) {
                    Iterator<yb8> it2 = it.next().a().values().iterator();
                    while (it2.hasNext()) {
                        arrayList.addAll(it2.next().h());
                    }
                }
            }
        }
        Collections.sort(arrayList, new a());
        return arrayList;
    }

    public boolean b(EntityType entityType) {
        return this.h.containsKey(entityType);
    }

    public List<q69> c(boolean z) throws ExecutionException, InterruptedException, CancellationException {
        ArrayList arrayList = new ArrayList(16);
        for (List<Parser> list : this.d) {
            if (list.size() != 0) {
                f(list, arrayList, z);
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<Future> listInvokeAll = this.e.invokeAll(arrayList, this.f, TimeUnit.MILLISECONDS);
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                Iterator<b> it = arrayList.iterator();
                for (Future future : listInvokeAll) {
                    b next = it.next();
                    try {
                        future.get();
                        if (z) {
                            this.g.a(String.format("Query(%s) parsed successfully in %s(time cost: %d ns)", this.f20203a, next.b(), Long.valueOf(next.c())));
                        }
                    } catch (CancellationException e) {
                        if (z) {
                            this.g.a(String.format("Task canceled when parseing query(%s) in %s after %d ms:\n%s", this.f20203a, next.b(), Long.valueOf(jCurrentTimeMillis2), e.getMessage()));
                        }
                    }
                }
            }
        }
        return a();
    }

    public pr5 d() {
        return this.g;
    }

    public Set<ParseResult> e(EntityType entityType) {
        return this.h.get(entityType);
    }

    public final void f(List<Parser> list, List<b> list2, boolean z) {
        list2.clear();
        Iterator<Parser> it = list.iterator();
        while (it.hasNext()) {
            list2.add(new b(it.next(), this, z));
        }
    }

    public String g() {
        return this.f20203a;
    }

    public dq5 h() {
        return this.f20204b;
    }

    public void i(EntityType entityType, ParseResult parseResult) {
        if (!this.h.containsKey(entityType)) {
            this.h.put(entityType, new HashSet());
        }
        this.h.get(entityType).add(parseResult);
    }
}
