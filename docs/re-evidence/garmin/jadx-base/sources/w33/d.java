package w33;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f181893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f181894b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f181893a = str;
            this.f181894b = str2;
        }

        @Override // w33.d
        public final String a() {
            return this.f181893a + CoreConstants.COLON_CHAR + this.f181894b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return s.g(this.f181893a, aVar.f181893a) && s.g(this.f181894b, aVar.f181894b);
        }

        public final int hashCode() {
            return this.f181894b.hashCode() + (this.f181893a.hashCode() * 31);
        }
    }

    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f181895a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f181896b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.f181895a = str;
            this.f181896b = str2;
        }

        @Override // w33.d
        public final String a() {
            return this.f181895a + this.f181896b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f181895a, bVar.f181895a) && s.g(this.f181896b, bVar.f181896b);
        }

        public final int hashCode() {
            return this.f181896b.hashCode() + (this.f181895a.hashCode() * 31);
        }
    }

    public /* synthetic */ d(j jVar) {
        this();
    }

    public abstract String a();

    public final String toString() {
        return a();
    }

    private d() {
    }
}
