package c80;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lc80/s;", "", "<init>", "()V", "c", "b", "a", "Lc80/s$a;", "Lc80/s$b;", "Lc80/s$c;", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class s {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc80/s$a;", "Lc80/s;", "Lyx2/c;", "subscription", "<init>", "(Lyx2/c;)V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class a extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yx2.c f25558a;

        static {
            yx2.c.Companion companion = yx2.c.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(yx2.c cVar) {
            super(null);
            cVar.getClass();
            this.f25558a = cVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f25558a, ((a) obj).f25558a);
        }

        public final int hashCode() {
            return this.f25558a.hashCode();
        }

        public final String toString() {
            return "Active(subscription=" + this.f25558a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc80/s$b;", "Lc80/s;", "", "Lyx2/i;", "purchasableSubscriptions", "<init>", "(Ljava/util/List;)V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<yx2.i> f25559a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<yx2.i> list) {
            super(null);
            list.getClass();
            this.f25559a = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && p005kotlin.jvm.internal.s.g(this.f25559a, ((b) obj).f25559a);
        }

        public final int hashCode() {
            return this.f25559a.hashCode();
        }

        public final String toString() {
            return tn.k.h("Eligible(purchasableSubscriptions=", ")", this.f25559a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc80/s$c;", "Lc80/s;", "Lc80/c1;", "reason", "<init>", "(Lc80/c1;)V", "gcm-domain-subscription_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class c extends s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c1 f25560a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(c1 c1Var) {
            super(null);
            c1Var.getClass();
            this.f25560a = c1Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f25560a == ((c) obj).f25560a;
        }

        public final int hashCode() {
            return this.f25560a.hashCode();
        }

        public final String toString() {
            return "Ineligible(reason=" + this.f25560a + ")";
        }
    }

    public /* synthetic */ s(p005kotlin.jvm.internal.j jVar) {
        this();
    }

    private s() {
    }
}
