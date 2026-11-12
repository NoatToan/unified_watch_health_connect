package z80;

import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lz80/b;", "", "<init>", "()V", "a", "b", "c", "Lz80/b$a;", "Lz80/b$b;", "Lz80/b$c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lz80/b$a;", "Lz80/b;", "Ldk2/d;", "device", "<init>", "(Ldk2/d;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final dk2.d f202977a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dk2.d dVar) {
            super(null);
            dVar.getClass();
            this.f202977a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f202977a, ((a) obj).f202977a);
        }

        public final int hashCode() {
            return this.f202977a.hashCode();
        }

        public final String toString() {
            return "DeviceFound(device=" + this.f202977a + ")";
        }
    }

    /* JADX INFO: renamed from: z80.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz80/b$b;", "Lz80/b;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3784b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C3784b f202978a = new C3784b();

        private C3784b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C3784b);
        }

        public final int hashCode() {
            return -1791479366;
        }

        public final String toString() {
            return "Failed";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz80/b$c;", "Lz80/b;", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f202979a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 71393156;
        }

        public final String toString() {
            return "Timeout";
        }
    }

    public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private b() {
    }
}
