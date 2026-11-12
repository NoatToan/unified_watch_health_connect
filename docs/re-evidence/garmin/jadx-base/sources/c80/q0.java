package c80;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lc80/q0;", "", "<init>", "()V", "a", "b", "Lc80/q0$a;", "Lc80/q0$b;", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class q0 {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc80/q0$a;", "Lc80/q0;", "Lc80/s0;", "promoLocation", "Lc80/w0;", "promoTarget", "", "userInitiated", "<init>", "(Lc80/s0;Lc80/w0;Z)V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s0 f25550a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final w0 f25551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f25552c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0 s0Var, w0 w0Var, boolean z14) {
            super(null);
            s0Var.getClass();
            this.f25550a = s0Var;
            this.f25551b = w0Var;
            this.f25552c = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f25550a == aVar.f25550a && p005kotlin.jvm.internal.s.g(this.f25551b, aVar.f25551b) && this.f25552c == aVar.f25552c;
        }

        public final int hashCode() {
            int iHashCode = this.f25550a.hashCode() * 31;
            w0 w0Var = this.f25551b;
            return Boolean.hashCode(this.f25552c) + ((iHashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Close(promoLocation=");
            sb3.append(this.f25550a);
            sb3.append(", promoTarget=");
            sb3.append(this.f25551b);
            sb3.append(", userInitiated=");
            return hb.a.k(sb3, this.f25552c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc80/q0$b;", "Lc80/q0;", "Lc80/s0;", "promoLocation", "<init>", "(Lc80/s0;)V", "gcm-domain-promotions_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s0 f25553a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s0 s0Var) {
            super(null);
            s0Var.getClass();
            this.f25553a = s0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f25553a == ((b) obj).f25553a;
        }

        public final int hashCode() {
            return this.f25553a.hashCode();
        }

        public final String toString() {
            return "Ready(promoLocation=" + this.f25553a + ")";
        }
    }

    public /* synthetic */ q0(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private q0() {
    }
}
