package yc;

import java.util.concurrent.locks.ReentrantLock;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lyc/k0;", "", "<init>", "()V", "a", "b", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f196105a = new b(this);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/k0$a;", "", "<init>", "(Lyc/k0;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t4 f196106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r53.e2 f196107b = r53.g2.b(1, 0, q53.a.DROP_OLDEST, 2);

        public a(k0 k0Var) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lyc/k0$b;", "", "<init>", "(Lyc/k0;)V", "paging-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f196108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f196109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t4.a f196110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ReentrantLock f196111d = new ReentrantLock();

        public b(k0 k0Var) {
            this.f196108a = new a(k0Var);
            this.f196109b = new a(k0Var);
        }

        public final void a(t4.a aVar, e23.p<? super a, ? super a, Unit> pVar) {
            ReentrantLock reentrantLock = this.f196111d;
            try {
                reentrantLock.lock();
                if (aVar != null) {
                    this.f196110c = aVar;
                }
                pVar.invoke(this.f196108a, this.f196109b);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f196112a;

        static {
            int[] iArr = new int[c1.values().length];
            try {
                iArr[c1.PREPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c1.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f196112a = iArr;
        }
    }

    public final r53.e2 a(c1 c1Var) {
        c1Var.getClass();
        int i14 = c.f196112a[c1Var.ordinal()];
        b bVar = this.f196105a;
        if (i14 == 1) {
            return bVar.f196108a.f196107b;
        }
        if (i14 == 2) {
            return bVar.f196109b.f196107b;
        }
        vb.h.s("invalid load type for hints");
        return null;
    }
}
