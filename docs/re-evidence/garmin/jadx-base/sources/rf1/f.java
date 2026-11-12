package rf1;

import com.garmin.android.apps.connectmobile.f3;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lrf1/f;", "T", "", "<init>", "()V", "c", "b", "a", "d", "Lrf1/f$a;", "Lrf1/f$b;", "Lrf1/f$c;", "Lrf1/f$d;", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class f<T> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrf1/f$b;", "Lrf1/f;", "", "Lrf1/b;", "feature", "<init>", "(Lrf1/b;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rf1.b f152425a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(rf1.b bVar) {
            super(null);
            bVar.getClass();
            this.f152425a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f152425a == ((b) obj).f152425a;
        }

        public final int hashCode() {
            return this.f152425a.hashCode();
        }

        public final String toString() {
            return "DeviceFeatureNotSupported(feature=" + this.f152425a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lrf1/f$c;", "Lrf1/f;", "", "<init>", "()V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f152426a = new c();

        private c() {
            super(null);
        }
    }

    public /* synthetic */ f(j jVar) {
        this();
    }

    private f() {
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrf1/f$a;", "Lrf1/f;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "<init>", "(Ljava/lang/Exception;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Exception f152424a;

        public /* synthetic */ a(Exception exc, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : exc);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f152424a, ((a) obj).f152424a);
        }

        public final int hashCode() {
            Exception exc = this.f152424a;
            if (exc == null) {
                return 0;
            }
            return exc.hashCode();
        }

        public final String toString() {
            return f3.h(this.f152424a, "DeviceError(exception=", ")");
        }

        public a(Exception exc) {
            super(null);
            this.f152424a = exc;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrf1/f$d;", "T", "Lrf1/f;", "value", "<init>", "(Ljava/lang/Object;)V", "gcm-electrocardiogram_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class d<T> extends f<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f152427a;

        public /* synthetic */ d(Object obj, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : obj);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && s.g(this.f152427a, ((d) obj).f152427a);
        }

        public final int hashCode() {
            T t7 = this.f152427a;
            if (t7 == null) {
                return 0;
            }
            return t7.hashCode();
        }

        public final String toString() {
            return org.apache.commons.lang3.e.f("DeviceResult(value=", ")", this.f152427a);
        }

        public d(T t7) {
            super(null);
            this.f152427a = t7;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public d() {
            j jVar = null;
            this(jVar, 1, jVar);
        }
    }
}
