package r53;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
public interface k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f150703a = a.f150704a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lr53/k2$a;", "", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f150704a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l2 f150705b = new l2();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m2 f150706c = new m2();

        private a() {
        }

        public static n2 a(a aVar, int i14) {
            long j8 = (i14 & 1) != 0 ? 0L : 5000L;
            long j14 = (i14 & 2) != 0 ? Long.MAX_VALUE : 0L;
            aVar.getClass();
            return new n2(j8, j14);
        }
    }

    i<i2> a(o2<Integer> o2Var);
}
