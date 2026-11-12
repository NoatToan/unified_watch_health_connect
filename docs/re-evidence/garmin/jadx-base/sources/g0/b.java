package g0;

import b0.i1;
import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg0/b$a;", "Lg0/b;", "Le0/c;", "resolvedFeatureGroup", "<init>", "(Le0/c;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0.c f74078a;

        public a(e0.c cVar) {
            cVar.getClass();
            this.f74078a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f74078a.equals(((a) obj).f74078a);
        }

        public final int hashCode() {
            return this.f74078a.hashCode();
        }

        public final String toString() {
            return "Supported(resolvedFeatureGroup=" + this.f74078a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX INFO: renamed from: g0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg0/b$b;", "Lg0/b;", "<init>", "()V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C1505b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1505b f74079a = new C1505b();

        private C1505b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lg0/b$c;", "Lg0/b;", "Lb0/i1;", "unsupportedUseCase", "<init>", "(Lb0/i1;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i1 f74080a;

        public c(i1 i1Var) {
            i1Var.getClass();
            this.f74080a = i1Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f74080a.equals(((c) obj).f74080a);
        }

        public final int hashCode() {
            return this.f74080a.hashCode();
        }

        public final String toString() {
            return "UnsupportedUseCase(unsupportedUseCase=" + this.f74080a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lg0/b$d;", "Lg0/b;", "", "requiredUseCases", "Ld0/a;", "featureRequiring", "<init>", "(Ljava/lang/String;Ld0/a;)V", "camera-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f74081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d0.a f74082b;

        public d(String str, d0.a aVar) {
            str.getClass();
            aVar.getClass();
            this.f74081a = str;
            this.f74082b = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f74081a.equals(dVar.f74081a) && this.f74082b.equals(dVar.f74082b);
        }

        public final int hashCode() {
            return this.f74082b.hashCode() + (this.f74081a.hashCode() * 31);
        }

        public final String toString() {
            return "UseCaseMissing(requiredUseCases=" + this.f74081a + ", featureRequiring=" + this.f74082b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }
}
