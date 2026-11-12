package p006l2;

import o53.f0;
import p005kotlin.Metadata;
import s5.c;
import y2.f;

/* JADX INFO: loaded from: classes.dex */
public interface l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f108642a = a.f108643a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll2/l2$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f108643a = new a();

        private a() {
        }

        public static d a(a aVar, long j8, long j14) {
            long jA = f0.A(0.25d);
            aVar.getClass();
            return new d(j8, j14, jA, null);
        }
    }

    long a(f.a aVar, long j8, c cVar);

    int hashCode();
}
