package j90;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lj90/l;", "", "Lj90/m;", "status", "<init>", "(Lj90/m;)V", "a", "b", "Lj90/l$a;", "Lj90/l$b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class l {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj90/l$a;", "Lj90/l;", "Lj90/m;", "status", "<init>", "(Lj90/m;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f97835a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(m mVar) {
            super(mVar, null);
            mVar.getClass();
            this.f97835a = mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f97835a, ((a) obj).f97835a);
        }

        public final int hashCode() {
            return this.f97835a.hashCode();
        }

        public final String toString() {
            return "Fetch(status=" + this.f97835a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lj90/l$b;", "Lj90/l;", "Lj90/m;", "status", "<init>", "(Lj90/m;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m f97836a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m mVar) {
            super(mVar, null);
            mVar.getClass();
            this.f97836a = mVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && s.g(this.f97836a, ((b) obj).f97836a);
        }

        public final int hashCode() {
            return this.f97836a.hashCode();
        }

        public final String toString() {
            return "Upload(status=" + this.f97836a + ")";
        }
    }

    public /* synthetic */ l(m mVar, p005kotlin.jvm.internal.j jVar) {
        this(mVar);
    }

    private l(m mVar) {
    }
}
