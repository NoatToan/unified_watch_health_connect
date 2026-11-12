package ml2;

import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.ByteArrayOutputStream;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0006\u0007\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lml2/o;", "", "", "pageNumber", "<init>", "(B)V", "a", "b", "c", "d", JWKParameterNames.RSA_EXPONENT, "f", "g", "Lml2/o$a;", "Lml2/o$c;", "Lml2/o$d;", "Lml2/o$e;", "Lml2/o$f;", "Lml2/o$g;", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f119409b = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f119410a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lml2/o$a;", "Lml2/o;", "<init>", "()V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f119411c = new a();

        private a() {
            super((byte) 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lml2/o$c;", "Lml2/o;", "<init>", "()V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f119412c = new c();

        private c() {
            super((byte) 4, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lml2/o$d;", "Lml2/o;", "<init>", "()V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class d extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f119413c = new d();

        private d() {
            super((byte) 2, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lml2/o$e;", "Lml2/o;", "<init>", "()V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class e extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f119414c = new e();

        private e() {
            super((byte) 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lml2/o$f;", "Lml2/o;", "", "Lcom/garmin/device/multilink/MultiLinkServiceId;", "serviceId", "<init>", "(I)V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class f extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f119415c;

        public f(int i14) {
            super((byte) 5, null);
            this.f119415c = i14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f119415c == ((f) obj).f119415c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f119415c);
        }

        public final String toString() {
            return v.e0.f(this.f119415c, "ServiceRevision(serviceId=", ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lml2/o$g;", "Lml2/o;", "<init>", "()V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class g extends o {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f119416c = new g();

        private g() {
            super((byte) 0, null);
        }
    }

    private o(byte b14) {
        this.f119410a = b14;
    }

    public final byte[] a() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.f119410a);
        if (this instanceof f) {
            lg.d.P(byteArrayOutputStream, ((f) this).f119415c);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lml2/o$b;", "", "<init>", "()V", "multi-link_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ o(byte b14, p005kotlin.jvm.internal.j jVar) {
        this(b14);
    }
}
