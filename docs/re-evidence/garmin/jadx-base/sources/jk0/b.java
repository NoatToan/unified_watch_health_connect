package jk0;

import java.util.List;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Ljk0/b;", "", "", "activityTypeKey", "", "Ljk0/d;", "defaultGear", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f99232c = {null, o13.m.a(o13.n.PUBLICATION, new je0.o(8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f99233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d> f99234b;

    public /* synthetic */ b(int i14, String str, List list, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f99233a = null;
        } else {
            this.f99233a = str;
        }
        if ((i14 & 2) == 0) {
            this.f99234b = null;
        } else {
            this.f99234b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return p005kotlin.jvm.internal.s.g(this.f99233a, bVar.f99233a) && p005kotlin.jvm.internal.s.g(this.f99234b, bVar.f99234b);
    }

    public final int hashCode() {
        String str = this.f99233a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<d> list = this.f99234b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return fb1.c.o("ActivityTypeDefaultGearChoiceDTO(activityTypeKey=", this.f99233a, ", defaultGear=", this.f99234b, ")");
    }

    /* JADX INFO: renamed from: jk0.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/b$b;", "", "<init>", "()V", "Li63/c;", "Ljk0/b;", "serializer", "()Li63/c;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f99235a;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this((String) null, (List) (0 == true ? 1 : 0), 3, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
    }

    public b(String str, List<d> list) {
        this.f99233a = str;
        this.f99234b = list;
    }

    public /* synthetic */ b(String str, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : list);
    }
}
