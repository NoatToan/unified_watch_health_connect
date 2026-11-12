package zk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import o13.m;
import o13.t;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lzk/d;", "", "Lzk/c;", "analyticsHelper", "", "Lk23/d;", "Lzk/f;", "types", "", "typeIds", "<init>", "(Lzk/c;Ljava/util/List;Ljava/util/List;)V", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k23.d<? extends f>> f205036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<String> f205037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f205038c;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends w implements e23.a<Logger> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f205039a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final Logger invoke() {
            return LoggerFactory.getLogger("AnalyticsLogger");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(c cVar, List<? extends k23.d<? extends f>> list, List<String> list2) {
        cVar.getClass();
        this.f205036a = list;
        this.f205037b = list2;
        this.f205038c = m.b(a.f205039a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.concurrent.CopyOnWriteArraySet<zk.f>] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Iterable] */
    public final void a(zk.a aVar) {
        ?? arrayList;
        aVar.getClass();
        List<String> list = this.f205037b;
        if (list == null || !(!list.isEmpty())) {
            List<k23.d<? extends f>> list2 = this.f205036a;
            if (list2 == null || !(!list2.isEmpty())) {
                arrayList = c.f205035b;
            } else {
                CopyOnWriteArraySet<f> copyOnWriteArraySet = c.f205035b;
                arrayList = new ArrayList();
                for (f fVar : copyOnWriteArraySet) {
                    if (list2.contains(s0.f105811a.b(fVar.getClass()))) {
                        arrayList.add(fVar);
                    }
                }
            }
        } else {
            CopyOnWriteArraySet<f> copyOnWriteArraySet2 = c.f205035b;
            arrayList = new ArrayList();
            for (f fVar2 : copyOnWriteArraySet2) {
                if (list.contains(fVar2.getId())) {
                    arrayList.add(fVar2);
                }
            }
        }
        for (f fVar3 : arrayList) {
            try {
                fVar3.getClass();
                List<g> listA = fVar3.a();
                if (listA == null || !listA.isEmpty()) {
                    Iterator it = listA.iterator();
                    do {
                        if (it.hasNext()) {
                        }
                    } while (((g) it.next()).a(aVar));
                }
                fVar3.b(aVar);
                break;
            } catch (Exception e4) {
                Object value = this.f205038c.getValue();
                value.getClass();
                ((Logger) value).warn(fVar3.getId() + " - " + e4.getMessage());
            }
        }
    }
}
