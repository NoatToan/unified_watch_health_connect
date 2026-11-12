package tk2;

import al2.b;
import al2.c;
import al2.e;
import al2.l;
import al2.m;
import al2.n;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0007B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ltk2/a;", "Lal2/m;", "Lal2/e;", "", "enableAdHocAnalytics", "<init>", "(Z)V", "a", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a implements m, e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f165259c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165260b;

    static {
        new C3103a(null);
        Logger logger = LoggerFactory.getLogger("CFT#AnalyticsSender");
        logger.getClass();
        f165259c = logger;
    }

    public /* synthetic */ a(boolean z14, int i14, j jVar) {
        this((i14 & 1) != 0 ? false : z14);
    }

    @Override // al2.m
    public final void B(n nVar) {
    }

    public abstract void a(c cVar);

    public abstract void b(l lVar);

    @Override // al2.e
    public final void s(al2.a aVar) {
    }

    @Override // al2.m
    public final void u(l lVar) {
        lVar.getClass();
        if (lVar.f3822d.f3817a) {
            if (this.f165260b || !lVar.f3821c.a()) {
                b(lVar);
            }
        }
    }

    @Override // al2.e
    public final void y(c cVar) {
        if ((cVar.f3777c == b.NO_ITEMS && cVar.f3778d == null) || cVar.f3782h) {
            return;
        }
        a(cVar);
    }

    /* JADX INFO: renamed from: tk2.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltk2/a$a;", "", "<init>", "()V", "file-transfer-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C3103a {
        public /* synthetic */ C3103a(j jVar) {
            this();
        }

        private C3103a() {
        }
    }

    public a(boolean z14) {
        this.f165260b = z14;
    }

    public a() {
        this(false, 1, null);
    }
}
