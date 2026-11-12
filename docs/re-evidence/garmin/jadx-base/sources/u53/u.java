package u53;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o53.x1;
import p005kotlin.Metadata;
import u53.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b \u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u000b\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¨\u0006\r"}, d2 = {"Lu53/u;", "S", "Lu53/c;", "Lo53/x1;", "", TtmlNode.ATTR_ID, "prev", "", "pointers", "<init>", "(JLu53/u;I)V", "", "cleanedAndPointers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class u<S extends u<S>> extends c<S> implements x1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f168770d = AtomicIntegerFieldUpdater.newUpdater(u.class, "cleanedAndPointers$volatile");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f168771c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public u(long j8, S s8, int i14) {
        super(s8);
        this.f168771c = j8;
        this.cleanedAndPointers$volatile = i14 << 16;
    }

    @Override // u53.c
    public final boolean d() {
        return f168770d.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return f168770d.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(t13.g gVar, int i14);

    public final void i() {
        if (f168770d.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i14;
        do {
            atomicIntegerFieldUpdater = f168770d;
            i14 = atomicIntegerFieldUpdater.get(this);
            if (i14 == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i14, 65536 + i14));
        return true;
    }
}
