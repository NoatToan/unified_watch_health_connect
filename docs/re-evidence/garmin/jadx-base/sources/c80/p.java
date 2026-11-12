package c80;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lc80/p;", "", "<init>", "()V", "c", "b", "a", "Lc80/p$a;", "Lc80/p$b;", "Lc80/p$c;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class p {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lc80/p$a;", "Lc80/p;", "Lorg/joda/time/DateTime;", "expirationDate", "", "autoRenewOn", "<init>", "(Lorg/joda/time/DateTime;Z)V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateTime f25519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f25520b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(DateTime dateTime, boolean z14) {
            super(null);
            dateTime.getClass();
            this.f25519a = dateTime;
            this.f25520b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p005kotlin.jvm.internal.s.g(this.f25519a, aVar.f25519a) && this.f25520b == aVar.f25520b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f25520b) + (this.f25519a.hashCode() * 31);
        }

        public final String toString() {
            return "Active(expirationDate=" + this.f25519a + ", autoRenewOn=" + this.f25520b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc80/p$b;", "Lc80/p;", "<init>", "()V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f25521a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1728280444;
        }

        public final String toString() {
            return "Eligible";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc80/p$c;", "Lc80/p;", "Lc80/c1;", "reason", "<init>", "(Lc80/c1;)V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c1 f25522a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c1 c1Var) {
            super(null);
            c1Var.getClass();
            this.f25522a = c1Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f25522a == ((c) obj).f25522a;
        }

        public final int hashCode() {
            return this.f25522a.hashCode();
        }

        public final String toString() {
            return "Ineligible(reason=" + this.f25522a + ")";
        }
    }

    public /* synthetic */ p(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private p() {
    }
}
