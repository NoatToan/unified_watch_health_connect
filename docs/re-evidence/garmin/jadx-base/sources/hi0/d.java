package hi0;

import m63.u1;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0010\u0011\u0012B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0013"}, d2 = {"Lhi0/d;", "", "", "exceptionName", "message", "Lhi0/d$c;", "_errorType", "_error", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lhi0/d$c;Lhi0/d$c;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lhi0/d$c;Lhi0/d$c;Lm63/u1;)V", "Companion", "c", "a", "b", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f83800e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f83803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f83804d;

    static {
        n nVar = n.PUBLICATION;
        f83800e = new o13.l[]{null, null, o13.m.a(nVar, new ha0.a(7)), o13.m.a(nVar, new ha0.a(8))};
    }

    public /* synthetic */ d(int i14, String str, String str2, c cVar, c cVar2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f83801a = null;
        } else {
            this.f83801a = str;
        }
        if ((i14 & 2) == 0) {
            this.f83802b = null;
        } else {
            this.f83802b = str2;
        }
        if ((i14 & 4) == 0) {
            this.f83803c = null;
        } else {
            this.f83803c = cVar;
        }
        if ((i14 & 8) == 0) {
            this.f83804d = null;
        } else {
            this.f83804d = cVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return s.g(this.f83801a, dVar.f83801a) && s.g(this.f83802b, dVar.f83802b) && this.f83803c == dVar.f83803c && this.f83804d == dVar.f83804d;
    }

    public final int hashCode() {
        String str = this.f83801a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f83802b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        c cVar = this.f83803c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        c cVar2 = this.f83804d;
        return iHashCode3 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("FollowRequestErrorDTO(exceptionName=", this.f83801a, ", message=", this.f83802b, ", _errorType=");
        sbI.append(this.f83803c);
        sbI.append(", _error=");
        sbI.append(this.f83804d);
        sbI.append(")");
        return sbI.toString();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lhi0/d$c;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @i63.h
    public enum c {
        FOLLOWING_OVER_LIMIT,
        FOLLOWER_OVER_LIMIT,
        FOLLOWING_REQUEST_OVER_LIMIT,
        ManagedChildAccountForbiddenException;


        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Object f83806a = o13.m.a(n.PUBLICATION, new ha0.a(9));

        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f83812a;

            static {
                int[] iArr = new int[c.values().length];
                try {
                    iArr[c.FOLLOWING_OVER_LIMIT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[c.FOLLOWER_OVER_LIMIT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[c.FOLLOWING_REQUEST_OVER_LIMIT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[c.ManagedChildAccountForbiddenException.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f83812a = iArr;
            }
        }

        /* JADX INFO: renamed from: hi0.d$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhi0/d$c$a;", "", "<init>", "()V", "Li63/c;", "Lhi0/d$c;", "serializer", "()Li63/c;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
                this();
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
            public final i63.c<c> serializer() {
                return (i63.c) c.f83806a.getValue();
            }

            private Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: hi0.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lhi0/d$b;", "", "<init>", "()V", "Li63/c;", "Lhi0/d;", "serializer", "()Li63/c;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f83805a;
        }

        private Companion() {
        }
    }

    public d() {
        this((String) null, (String) null, (c) null, (c) null, 15, (p005kotlin.jvm.internal.j) null);
    }

    public d(String str, String str2, c cVar, c cVar2) {
        this.f83801a = str;
        this.f83802b = str2;
        this.f83803c = cVar;
        this.f83804d = cVar2;
    }

    public /* synthetic */ d(String str, String str2, c cVar, c cVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : cVar, (i14 & 8) != 0 ? null : cVar2);
    }
}
