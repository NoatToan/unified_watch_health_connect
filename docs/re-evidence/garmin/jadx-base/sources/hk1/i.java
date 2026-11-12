package hk1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lhk1/i;", "", "<init>", "()V", "a", "c", "b", "Lhk1/i$a;", "Lhk1/i$b;", "Lhk1/i$c;", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class i {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhk1/i$a;", "Lhk1/i;", "Lhk1/d;", "capability", "", "enabled", "<init>", "(Lhk1/d;Z)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f84154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f84155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, boolean z14) {
            super(null);
            dVar.getClass();
            this.f84154a = dVar;
            this.f84155b = z14;
            dVar.name().hashCode();
            Boolean.hashCode(z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f84154a == aVar.f84154a && this.f84155b == aVar.f84155b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f84155b) + (this.f84154a.hashCode() * 31);
        }

        public final String toString() {
            return "CapabilityItem(capability=" + this.f84154a + ", enabled=" + this.f84155b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhk1/i$b;", "Lhk1/i;", "Lhk1/d;", "capability", "<init>", "(Lhk1/d;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f84156a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar) {
            super(null);
            dVar.getClass();
            this.f84156a = dVar;
            dVar.name().hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f84156a == ((b) obj).f84156a;
        }

        public final int hashCode() {
            return this.f84156a.hashCode();
        }

        public final String toString() {
            return "Footer(capability=" + this.f84156a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhk1/i$c;", "Lhk1/i;", "Lhk1/f;", "capabilityType", "<init>", "(Lhk1/f;)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f84157a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar) {
            super(null);
            fVar.getClass();
            this.f84157a = fVar;
            fVar.name().hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f84157a == ((c) obj).f84157a;
        }

        public final int hashCode() {
            return this.f84157a.hashCode();
        }

        public final String toString() {
            return "Header(capabilityType=" + this.f84157a + ")";
        }
    }

    public /* synthetic */ i(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private i() {
    }
}
