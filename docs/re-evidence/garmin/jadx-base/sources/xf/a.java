package xf;

import ch.qos.logback.core.CoreConstants;
import ds.e0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
public interface a {

    /* JADX INFO: renamed from: xf.a$a, reason: collision with other inner class name */
    @d23.a
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lxf/a$a;", "Lxf/a;", "px", "", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C3547a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f190607a;

        private /* synthetic */ C3547a(int i14) {
            this.f190607a = i14;
        }

        public static final /* synthetic */ C3547a a(int i14) {
            return new C3547a(i14);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C3547a) {
                return this.f190607a == ((C3547a) obj).f190607a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f190607a);
        }

        public final String toString() {
            return e0.i("Pixels(px=", this.f190607a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lxf/a$b;", "Lxf/a;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f190608a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2093724603;
        }

        public final String toString() {
            return "Undefined";
        }
    }
}
