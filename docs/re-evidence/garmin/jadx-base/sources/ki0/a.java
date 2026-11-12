package ki0;

import li0.l0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import yf0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lki0/a;", "Lyf0/c;", "<init>", "()V", "a", "b", "Lki0/a$a;", "Lki0/a$b;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class a implements c {

    /* JADX INFO: renamed from: ki0.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lki0/a$a;", "Lki0/a;", "", "displayName", "Lli0/l0;", "newState", "<init>", "(Ljava/lang/String;Lli0/l0;)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C2006a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final l0 f104808b;

        public C2006a(String str, l0 l0Var) {
            super(null);
            this.f104807a = str;
            this.f104808b = l0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2006a)) {
                return false;
            }
            C2006a c2006a = (C2006a) obj;
            return s.g(this.f104807a, c2006a.f104807a) && s.g(this.f104808b, c2006a.f104808b);
        }

        public final int hashCode() {
            String str = this.f104807a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            l0 l0Var = this.f104808b;
            return iHashCode + (l0Var != null ? l0Var.hashCode() : 0);
        }

        public final String toString() {
            return "StateEvent(displayName=" + this.f104807a + ", newState=" + this.f104808b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lki0/a$b;", "Lki0/a;", "", "displayName", "Lki0/a$b$a;", "situation", "<init>", "(Ljava/lang/String;Lki0/a$b$a;)V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final EnumC2007a f104810b;

        /* JADX INFO: renamed from: ki0.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lki0/a$b$a;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public enum EnumC2007a {
            DECLINE_REQUEST,
            DECLINE_REQUEST_REVERTED,
            DISMISS_SUGGESTION,
            BLOCK_USER,
            UNBLOCK_USER
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, EnumC2007a enumC2007a) {
            super(null);
            enumC2007a.getClass();
            this.f104809a = str;
            this.f104810b = enumC2007a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return s.g(this.f104809a, bVar.f104809a) && this.f104810b == bVar.f104810b;
        }

        public final int hashCode() {
            String str = this.f104809a;
            return this.f104810b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "VisibilityEvent(displayName=" + this.f104809a + ", situation=" + this.f104810b + ")";
        }
    }

    public /* synthetic */ a(j jVar) {
        this();
    }

    private a() {
    }
}
