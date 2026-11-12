package al2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000bB9\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lal2/o;", "Lal2/m;", "", "listeners", "Lt13/d;", "", "startContinuation", "Lal2/l;", "completionContinuation", "<init>", "(Ljava/util/Collection;Lt13/d;Lt13/d;)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class o implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3834f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection<m> f3835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t13.d<? super Boolean> f3836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t13.d<l> f3837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3838e;

    public /* synthetic */ o(Collection collection, t13.d dVar, t13.d dVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(collection, (i14 & 2) != 0 ? null : dVar, (i14 & 4) != 0 ? null : dVar2);
    }

    @Override // al2.m
    public final void B(n nVar) {
        Iterator<T> it = this.f3835b.iterator();
        while (it.hasNext()) {
            try {
                ((m) it.next()).B(nVar);
            } catch (Exception unused) {
            }
        }
    }

    @Override // al2.m
    public final void u(l lVar) {
        k kVar = lVar.f3822d;
        if (!kVar.f3817a) {
            this.f3838e = true;
            t13.d<? super Boolean> dVar = this.f3836c;
            if (dVar != null) {
                cl2.c.k(Boolean.valueOf(kVar == k.STARTED), dVar);
            }
        }
        boolean z14 = kVar.f3817a;
        Collection<m> collection = this.f3835b;
        if (z14) {
            if (!this.f3838e) {
                t13.d<? super Boolean> dVar2 = this.f3836c;
                if (dVar2 != null) {
                    cl2.c.k(Boolean.TRUE, dVar2);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj : collection) {
                    if (obj instanceof o) {
                        arrayList.add(obj);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    t13.d<? super Boolean> dVar3 = ((o) it.next()).f3836c;
                    if (dVar3 != null) {
                        cl2.c.k(Boolean.TRUE, dVar3);
                    }
                }
            }
            t13.d<l> dVar4 = this.f3837d;
            if (dVar4 != null) {
                cl2.c.k(lVar, dVar4);
            }
        }
        Iterator<T> it3 = collection.iterator();
        while (it3.hasNext()) {
            try {
                ((m) it3.next()).u(lVar);
            } catch (Exception unused) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lal2/o$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o(Collection<? extends m> collection, t13.d<? super Boolean> dVar, t13.d<? super l> dVar2) {
        collection.getClass();
        this.f3835b = collection;
        this.f3836c = dVar;
        this.f3837d = dVar2;
    }
}
