package l90;

import o53.r;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Ll90/a;", "", "<init>", "()V", "a", "c", "b", "Ll90/a$a;", "Ll90/a$b;", "Ll90/a$c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll90/a$b;", "Ll90/a;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f111513a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -724792247;
        }

        public final String toString() {
            return "DiscoveryTimeout";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll90/a$c;", "Ll90/a;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f111514a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 460568683;
        }

        public final String toString() {
            return "VisibleDiscoveryTimeout";
        }
    }

    public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private a() {
    }

    /* JADX INFO: renamed from: l90.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ll90/a$a;", "Ll90/a;", "Ll90/b;", "device", "Ldk2/d;", "scannedDevice", "Lo53/r;", "Ll90/c;", "confirmDevice", "<init>", "(Ll90/b;Ldk2/d;Lo53/r;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2132a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f111510a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final dk2.d f111511b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r<l90.c> f111512c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2132a(l90.b bVar, dk2.d dVar, r<l90.c> rVar) {
            super(null);
            bVar.getClass();
            dVar.getClass();
            rVar.getClass();
            this.f111510a = bVar;
            this.f111511b = dVar;
            this.f111512c = rVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2132a)) {
                return false;
            }
            C2132a c2132a = (C2132a) obj;
            return s.g(this.f111510a, c2132a.f111510a) && s.g(this.f111511b, c2132a.f111511b) && s.g(this.f111512c, c2132a.f111512c);
        }

        public final int hashCode() {
            return this.f111512c.hashCode() + ((this.f111511b.hashCode() + (this.f111510a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "DeviceFound(device=" + this.f111510a + ", scannedDevice=" + this.f111511b + ", confirmDevice=" + this.f111512c + ")";
        }

        public /* synthetic */ C2132a(l90.b bVar, dk2.d dVar, r rVar, int i14, p005kotlin.jvm.internal.j jVar) {
            this(bVar, dVar, (i14 & 4) != 0 ? gl.b.b() : rVar);
        }
    }
}
