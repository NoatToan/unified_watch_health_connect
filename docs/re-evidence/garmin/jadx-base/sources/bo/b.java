package bo;

import bm.y;
import java.util.List;
import m63.u1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import v.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dBµ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015B¯\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001a¨\u0006\u001e"}, d2 = {"Lbo/b;", "", "Lbo/k;", "pagination", "", "favorite", "", "search", "isPR", "eventType", "", "activityTypes", "activitySubTypes", "excludedActivitySubTypes", "startDate", "endDate", "Lbo/i;", "distance", "duration", "elevation", "<init>", "(Lbo/k;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbo/i;Lbo/i;Lbo/i;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILbo/k;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lbo/i;Lbo/i;Lbo/i;Lm63/u1;)V", "Companion", "a", "b", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f19086n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f19087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f19088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f19090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f19091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<String> f19092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<String> f19093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List<String> f19094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f19095i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f19096j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f19097k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i f19098l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final i f19099m;

    static {
        o13.n nVar = o13.n.PUBLICATION;
        f19086n = new o13.l[]{null, null, null, null, null, o13.m.a(nVar, new y(5)), o13.m.a(nVar, new y(6)), o13.m.a(nVar, new y(7)), null, null, null, null, null};
    }

    public /* synthetic */ b(k kVar, Boolean bool, String str, Boolean bool2, String str2, List list, List list2, List list3, String str3, String str4, i iVar, i iVar2, i iVar3, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : kVar, (i14 & 2) != 0 ? null : bool, (i14 & 4) != 0 ? null : str, (i14 & 8) != 0 ? null : bool2, (i14 & 16) != 0 ? null : str2, (i14 & 32) != 0 ? null : list, (i14 & 64) != 0 ? null : list2, (i14 & 128) != 0 ? null : list3, (i14 & 256) != 0 ? null : str3, (i14 & 512) != 0 ? null : str4, (i14 & 1024) != 0 ? null : iVar, (i14 & 2048) != 0 ? null : iVar2, (i14 & 4096) != 0 ? null : iVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return s.g(this.f19087a, bVar.f19087a) && s.g(this.f19088b, bVar.f19088b) && s.g(this.f19089c, bVar.f19089c) && s.g(this.f19090d, bVar.f19090d) && s.g(this.f19091e, bVar.f19091e) && s.g(this.f19092f, bVar.f19092f) && s.g(this.f19093g, bVar.f19093g) && s.g(this.f19094h, bVar.f19094h) && s.g(this.f19095i, bVar.f19095i) && s.g(this.f19096j, bVar.f19096j) && s.g(this.f19097k, bVar.f19097k) && s.g(this.f19098l, bVar.f19098l) && s.g(this.f19099m, bVar.f19099m);
    }

    public final int hashCode() {
        k kVar = this.f19087a;
        int iHashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        Boolean bool = this.f19088b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f19089c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool2 = this.f19090d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str2 = this.f19091e;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.f19092f;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.f19093g;
        int iHashCode7 = (iHashCode6 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f19094h;
        int iHashCode8 = (iHashCode7 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str3 = this.f19095i;
        int iHashCode9 = (iHashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f19096j;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        i iVar = this.f19097k;
        int iHashCode11 = (iHashCode10 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        i iVar2 = this.f19098l;
        int iHashCode12 = (iHashCode11 + (iVar2 == null ? 0 : iVar2.hashCode())) * 31;
        i iVar3 = this.f19099m;
        return iHashCode12 + (iVar3 != null ? iVar3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ActivitySearchRequestDTO(pagination=");
        sb3.append(this.f19087a);
        sb3.append(", favorite=");
        sb3.append(this.f19088b);
        sb3.append(", search=");
        b71.i.w(sb3, this.f19089c, ", isPR=", this.f19090d, ", eventType=");
        e0.o(this.f19091e, ", activityTypes=", ", activitySubTypes=", sb3, this.f19092f);
        n23.j.z(sb3, this.f19093g, ", excludedActivitySubTypes=", this.f19094h, ", startDate=");
        sn.a.t(sb3, this.f19095i, ", endDate=", this.f19096j, ", distance=");
        sb3.append(this.f19097k);
        sb3.append(", duration=");
        sb3.append(this.f19098l);
        sb3.append(", elevation=");
        sb3.append(this.f19099m);
        sb3.append(")");
        return sb3.toString();
    }

    /* JADX INFO: renamed from: bo.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbo/b$b;", "", "<init>", "()V", "Li63/c;", "Lbo/b;", "serializer", "()Li63/c;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<b> serializer() {
            return a.f19100a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ b(int i14, k kVar, Boolean bool, String str, Boolean bool2, String str2, List list, List list2, List list3, String str3, String str4, i iVar, i iVar2, i iVar3, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f19087a = null;
        } else {
            this.f19087a = kVar;
        }
        if ((i14 & 2) == 0) {
            this.f19088b = null;
        } else {
            this.f19088b = bool;
        }
        if ((i14 & 4) == 0) {
            this.f19089c = null;
        } else {
            this.f19089c = str;
        }
        if ((i14 & 8) == 0) {
            this.f19090d = null;
        } else {
            this.f19090d = bool2;
        }
        if ((i14 & 16) == 0) {
            this.f19091e = null;
        } else {
            this.f19091e = str2;
        }
        if ((i14 & 32) == 0) {
            this.f19092f = null;
        } else {
            this.f19092f = list;
        }
        if ((i14 & 64) == 0) {
            this.f19093g = null;
        } else {
            this.f19093g = list2;
        }
        if ((i14 & 128) == 0) {
            this.f19094h = null;
        } else {
            this.f19094h = list3;
        }
        if ((i14 & 256) == 0) {
            this.f19095i = null;
        } else {
            this.f19095i = str3;
        }
        if ((i14 & 512) == 0) {
            this.f19096j = null;
        } else {
            this.f19096j = str4;
        }
        if ((i14 & 1024) == 0) {
            this.f19097k = null;
        } else {
            this.f19097k = iVar;
        }
        if ((i14 & 2048) == 0) {
            this.f19098l = null;
        } else {
            this.f19098l = iVar2;
        }
        if ((i14 & 4096) == 0) {
            this.f19099m = null;
        } else {
            this.f19099m = iVar3;
        }
    }

    public b(k kVar, Boolean bool, String str, Boolean bool2, String str2, List<String> list, List<String> list2, List<String> list3, String str3, String str4, i iVar, i iVar2, i iVar3) {
        this.f19087a = kVar;
        this.f19088b = bool;
        this.f19089c = str;
        this.f19090d = bool2;
        this.f19091e = str2;
        this.f19092f = list;
        this.f19093g = list2;
        this.f19094h = list3;
        this.f19095i = str3;
        this.f19096j = str4;
        this.f19097k = iVar;
        this.f19098l = iVar2;
        this.f19099m = iVar3;
    }

    public b() {
        this((k) null, (Boolean) null, (String) null, (Boolean) null, (String) null, (List) null, (List) null, (List) null, (String) null, (String) null, (i) null, (i) null, (i) null, 8191, (p005kotlin.jvm.internal.j) null);
    }
}
