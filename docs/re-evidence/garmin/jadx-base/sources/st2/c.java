package st2;

import i63.h;
import java.util.List;
import m63.u1;
import o13.l;
import o13.m;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import sk0.i0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lst2/c;", "", "", "requestId", "", "Lst2/b;", "errors", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@h
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l<i63.c<Object>>[] f160918c = {null, m.a(n.PUBLICATION, new i0(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f160920b;

    public /* synthetic */ c(int i14, String str, List list, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f160919a = null;
        } else {
            this.f160919a = str;
        }
        if ((i14 & 2) == 0) {
            this.f160920b = null;
        } else {
            this.f160920b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return s.g(this.f160919a, cVar.f160919a) && s.g(this.f160920b, cVar.f160920b);
    }

    public final int hashCode() {
        String str = this.f160919a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<b> list = this.f160920b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return fb1.c.o("ErrorResponse(requestId=", this.f160919a, ", errors=", this.f160920b, ")");
    }

    /* JADX INFO: renamed from: st2.c$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lst2/c$b;", "", "<init>", "()V", "Li63/c;", "Lst2/c;", "serializer", "()Li63/c;", "livetrack_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final i63.c<c> serializer() {
            return a.f160921a;
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (j) (0 == true ? 1 : 0));
    }

    public c(String str, List<b> list) {
        this.f160919a = str;
        this.f160920b = list;
    }

    public /* synthetic */ c(String str, List list, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : list);
    }
}
