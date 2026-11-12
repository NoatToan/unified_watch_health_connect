package in0;

import java.util.List;
import lc.u0;
import m63.u1;
import o13.n;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0013BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fBS\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lin0/d;", "", "", "calendarDate", "", "outliersCount", "createTimestampUTC", "updateTimestampUTC", "", "Lin0/i;", "metrics", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lm63/u1;)V", "Companion", "a", "b", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class d {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f94426f = {null, null, null, null, o13.m.a(n.PUBLICATION, new ik2.b(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f94428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f94430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<i> f94431e;

    public /* synthetic */ d(int i14, String str, Integer num, String str2, String str3, List list, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f94427a = null;
        } else {
            this.f94427a = str;
        }
        if ((i14 & 2) == 0) {
            this.f94428b = null;
        } else {
            this.f94428b = num;
        }
        if ((i14 & 4) == 0) {
            this.f94429c = null;
        } else {
            this.f94429c = str2;
        }
        if ((i14 & 8) == 0) {
            this.f94430d = null;
        } else {
            this.f94430d = str3;
        }
        if ((i14 & 16) == 0) {
            this.f94431e = null;
        } else {
            this.f94431e = list;
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
        return s.g(this.f94427a, dVar.f94427a) && s.g(this.f94428b, dVar.f94428b) && s.g(this.f94429c, dVar.f94429c) && s.g(this.f94430d, dVar.f94430d) && s.g(this.f94431e, dVar.f94431e);
    }

    public final int hashCode() {
        String str = this.f94427a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f94428b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f94429c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f94430d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<i> list = this.f94431e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbN = u0.n("HealthStatusDetailsDTO(calendarDate=", this.f94428b, this.f94427a, ", outliersCount=", ", createTimestampUTC=");
        sn.a.t(sbN, this.f94429c, ", updateTimestampUTC=", this.f94430d, ", metrics=");
        return z.c(sbN, this.f94431e, ")");
    }

    /* JADX INFO: renamed from: in0.d$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lin0/d$b;", "", "<init>", "()V", "Li63/c;", "Lin0/d;", "serializer", "()Li63/c;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<d> serializer() {
            return a.f94432a;
        }

        private Companion() {
        }
    }

    public d() {
        this((String) null, (Integer) null, (String) null, (String) null, (List) null, 31, (p005kotlin.jvm.internal.j) null);
    }

    public d(String str, Integer num, String str2, String str3, List<i> list) {
        this.f94427a = str;
        this.f94428b = num;
        this.f94429c = str2;
        this.f94430d = str3;
        this.f94431e = list;
    }

    public /* synthetic */ d(String str, Integer num, String str2, String str3, List list, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : num, (i14 & 4) != 0 ? null : str2, (i14 & 8) != 0 ? null : str3, (i14 & 16) != 0 ? null : list);
    }
}
