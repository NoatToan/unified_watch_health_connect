package z1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface u {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz1/u$a;", "Lz1/u;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f200875a = new a();

        private a() {
        }

        @Override // z1.u
        public final int c(int i14, int i15, int i16, int i17) {
            return (((i14 - i16) - i17) / 2) - (i15 / 2);
        }

        public final String toString() {
            return "Center";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz1/u$b;", "Lz1/u;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f200876a = new b();

        private b() {
        }

        @Override // z1.u
        public final int c(int i14, int i15, int i16, int i17) {
            return 0;
        }

        public final String toString() {
            return "Start";
        }
    }

    int c(int i14, int i15, int i16, int i17);
}
