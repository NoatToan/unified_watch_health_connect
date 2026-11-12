package ct2;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import rs2.p;
import ss2.r;
import ss2.t;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lct2/b;", "", "Ljava/io/InputStream;", "input", "Lrs2/p;", "gfdiWatchdog", "<init>", "(Ljava/io/InputStream;Lrs2/p;)V", "gfdi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f55527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Logger f55528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final it2.d f55529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f55530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f55531e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public us2.b f55532f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference<r> f55533g;

    public b(InputStream inputStream, p pVar) {
        inputStream.getClass();
        this.f55527a = pVar;
        rs2.d.f154380a.getClass();
        this.f55528b = LoggerFactory.getLogger(rs2.d.a("MessageReader", -1L, this, null));
        this.f55529c = new it2.d(inputStream);
        this.f55530d = new AtomicBoolean();
        this.f55533g = new AtomicReference<>(new t());
    }

    public final void a() {
        if (this.f55530d.compareAndSet(true, false)) {
            Thread thread = this.f55531e;
            if (thread == null) {
                s.m("thread");
                throw null;
            }
            thread.interrupt();
            this.f55529c.close();
            us2.b bVar = this.f55532f;
            if (bVar == null) {
                s.m("delegate");
                throw null;
            }
            bVar.f();
            rs2.f fVar = bVar.f172461d;
            if (fVar != null) {
                fVar.onClose();
            }
        }
    }

    public /* synthetic */ b(InputStream inputStream, p pVar, int i14, j jVar) {
        this(inputStream, (i14 & 2) != 0 ? null : pVar);
    }
}
