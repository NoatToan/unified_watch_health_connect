package pf2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.j0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lpf2/a;", "Lpf2/b;", "<init>", "()V", "a", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference<List<rf2.b>> f137574a = new AtomicReference<>(new ArrayList());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference<List<rf2.b>> f137575b = new AtomicReference<>(j0.f134944a);

    static {
        new C2604a(null);
    }

    public final void a(rf2.b bVar) {
        bVar.getClass();
        AtomicReference<List<rf2.b>> atomicReference = this.f137574a;
        List<rf2.b> list = atomicReference.get();
        list.getClass();
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(bVar);
        atomicReference.set(arrayList);
    }

    /* JADX INFO: renamed from: pf2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lpf2/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2604a {
        public /* synthetic */ C2604a(j jVar) {
            this();
        }

        private C2604a() {
        }
    }
}
