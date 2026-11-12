package h53;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u000bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lh53/a;", "", "", "v", "Lh53/c;", "trace", "<init>", "(ZLh53/c;)V", "", "_value", "I", "a", "atomicfu"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {
    private volatile int _value;

    static {
        new C1627a(null);
        AtomicIntegerFieldUpdater.newUpdater(a.class, "_value");
    }

    public a(boolean z14, c cVar) {
        cVar.getClass();
        this._value = z14 ? 1 : 0;
    }

    public final boolean a() {
        return this._value != 0;
    }

    public final void b() {
        this._value = 1;
        c.a aVar = c.a.f82142a;
    }

    public final String toString() {
        return String.valueOf(a());
    }

    /* JADX INFO: renamed from: h53.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R8\u0010\u0007\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh53/a$a;", "", "<init>", "()V", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;", "Lh53/a;", "kotlin.jvm.PlatformType", "FU", "Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;", "atomicfu"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C1627a {
        public /* synthetic */ C1627a(j jVar) {
            this();
        }

        private C1627a() {
        }
    }
}
