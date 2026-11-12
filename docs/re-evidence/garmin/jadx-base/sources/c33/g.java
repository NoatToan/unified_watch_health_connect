package c33;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {

    public static final class a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24223a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            str.getClass();
            this.f24223a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f24223a, ((a) obj).f24223a);
        }

        public final int hashCode() {
            return this.f24223a.hashCode();
        }

        public final String toString() {
            return androidx.room.a0.m(new StringBuilder("Class(name="), this.f24223a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f24224a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(null);
            str.getClass();
            this.f24224a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f24224a, ((b) obj).f24224a);
        }

        public final int hashCode() {
            return this.f24224a.hashCode();
        }

        public final String toString() {
            return androidx.room.a0.m(new StringBuilder("TypeAlias(name="), this.f24224a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class c extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f24225a;

        public c(int i14) {
            super(null);
            this.f24225a = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f24225a == ((c) obj).f24225a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f24225a);
        }

        public final String toString() {
            return ds.e0.j(new StringBuilder("TypeParameter(id="), this.f24225a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public /* synthetic */ g(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private g() {
    }
}
