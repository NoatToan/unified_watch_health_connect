package c12;

import am.j;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
public interface e {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc12/e$b;", "Lc12/e;", "", "message", "<init>", "(Ljava/lang/String;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22540a;

        public b(String str) {
            str.getClass();
            this.f22540a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f22540a.equals(((b) obj).f22540a);
        }

        public final int hashCode() {
            return this.f22540a.hashCode();
        }

        public final String toString() {
            return j.m("Loading(message=", this.f22540a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc12/e$a;", "Lc12/e;", "", "message", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22539b;

        public a(String str, String str2) {
            str.getClass();
            this.f22538a = str;
            this.f22539b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f22538a, aVar.f22538a) && s.g(this.f22539b, aVar.f22539b);
        }

        public final int hashCode() {
            int iHashCode = this.f22538a.hashCode() * 31;
            String str = this.f22539b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return e0.g("Error(message=", this.f22538a, ", description=", this.f22539b, ")");
        }

        public /* synthetic */ a(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc12/e$c;", "Lc12/e;", "", "message", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f22541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f22542b;

        public c(String str, String str2) {
            str.getClass();
            this.f22541a = str;
            this.f22542b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return s.g(this.f22541a, cVar.f22541a) && s.g(this.f22542b, cVar.f22542b);
        }

        public final int hashCode() {
            int iHashCode = this.f22541a.hashCode() * 31;
            String str = this.f22542b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return e0.g("Success(message=", this.f22541a, ", description=", this.f22542b, ")");
        }

        public /* synthetic */ c(String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
            this(str, (i14 & 2) != 0 ? null : str2);
        }
    }
}
