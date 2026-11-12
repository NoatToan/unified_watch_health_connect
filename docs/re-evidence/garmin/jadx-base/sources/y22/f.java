package y22;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
public interface f {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ly22/f$a;", "Ly22/f;", "", "Ly22/w;", "photos", "<init>", "(Ljava/util/List;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<w> f194252a;

        public a(List<w> list) {
            list.getClass();
            this.f194252a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f194252a.equals(((a) obj).f194252a);
        }

        public final int hashCode() {
            return this.f194252a.hashCode();
        }

        public final String toString() {
            return tn.k.h("Failure(photos=", ")", this.f194252a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly22/f$b;", "Ly22/f;", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f194253a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2125939913;
        }

        public final String toString() {
            return "Success";
        }
    }
}
