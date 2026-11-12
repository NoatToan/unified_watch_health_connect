package je0;

import lc.u0;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lje0/i;", "", "", "date", "", "countOfActivities", "Lje0/q;", "stats", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Lje0/q;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lje0/q;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f98537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f98538c;

    public /* synthetic */ i(int i14, String str, Integer num, q qVar, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f98536a = null;
        } else {
            this.f98536a = str;
        }
        if ((i14 & 2) == 0) {
            this.f98537b = null;
        } else {
            this.f98537b = num;
        }
        if ((i14 & 4) == 0) {
            this.f98538c = null;
        } else {
            this.f98538c = qVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return p005kotlin.jvm.internal.s.g(this.f98536a, iVar.f98536a) && p005kotlin.jvm.internal.s.g(this.f98537b, iVar.f98537b) && p005kotlin.jvm.internal.s.g(this.f98538c, iVar.f98538c);
    }

    public final int hashCode() {
        String str = this.f98536a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f98537b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        q qVar = this.f98538c;
        return iHashCode2 + (qVar != null ? qVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = u0.n("DogProfileStatsBulkResponse(date=", this.f98537b, this.f98536a, ", countOfActivities=", ", stats=");
        sbN.append(this.f98538c);
        sbN.append(")");
        return sbN.toString();
    }

    /* JADX INFO: renamed from: je0.i$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lje0/i$b;", "", "<init>", "()V", "Li63/c;", "Lje0/i;", "serializer", "()Li63/c;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<i> serializer() {
            return a.f98539a;
        }

        private Companion() {
        }
    }

    public i() {
        this((String) null, (Integer) null, (q) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public i(String str, Integer num, q qVar) {
        this.f98536a = str;
        this.f98537b = num;
        this.f98538c = qVar;
    }

    public /* synthetic */ i(String str, Integer num, q qVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : qVar);
    }
}
