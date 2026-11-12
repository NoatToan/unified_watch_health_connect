package va0;

import l90.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lva0/b;", "", "<init>", "()V", "a", "b", "Lva0/b$a;", "Lva0/b$b;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lva0/b$a;", "Lva0/b;", "Ll90/b;", "device", "<init>", "(Ll90/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l90.b f176571a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l90.b bVar) {
            super(null);
            bVar.getClass();
            this.f176571a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && s.g(this.f176571a, ((a) obj).f176571a);
        }

        public final int hashCode() {
            return this.f176571a.hashCode();
        }

        public final String toString() {
            return "DeviceReadyToScan(device=" + this.f176571a + ")";
        }
    }

    /* JADX INFO: renamed from: va0.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lva0/b$b;", "Lva0/b;", "Ll90/f;", "reason", "Ll90/b;", "device", "<init>", "(Ll90/f;Ll90/b;)V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C3294b extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f176572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l90.b f176573b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3294b(f fVar, l90.b bVar) {
            super(null);
            fVar.getClass();
            bVar.getClass();
            this.f176572a = fVar;
            this.f176573b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3294b)) {
                return false;
            }
            C3294b c3294b = (C3294b) obj;
            return this.f176572a == c3294b.f176572a && s.g(this.f176573b, c3294b.f176573b);
        }

        public final int hashCode() {
            return this.f176573b.hashCode() + (this.f176572a.hashCode() * 31);
        }

        public final String toString() {
            return "DeviceScanUnavailable(reason=" + this.f176572a + ", device=" + this.f176573b + ")";
        }
    }

    public /* synthetic */ b(j jVar) {
        this();
    }

    private b() {
    }
}
