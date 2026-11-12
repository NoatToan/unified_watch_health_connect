package je0;

import java.util.List;
import m63.u1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0019By\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011B{\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016¨\u0006\u001a"}, d2 = {"Lje0/s;", "", "", "name", "nickname", "gender", "", "primaryBreedId", "", "secondaryBreedIds", "", "isNeutered", "", "weight", "birthdate", "birthdatePrecision", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "Companion", "a", "b", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class s {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final o13.l<i63.c<Object>>[] f98572j = {null, null, null, null, o13.m.a(o13.n.PUBLICATION, new o(1)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f98576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List<Long> f98577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f98578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Double f98579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f98580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f98581i;

    public /* synthetic */ s(int i14, String str, String str2, String str3, Long l14, List list, Boolean bool, Double d14, String str4, String str5, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.f98573a = null;
        } else {
            this.f98573a = str;
        }
        if ((i14 & 2) == 0) {
            this.f98574b = null;
        } else {
            this.f98574b = str2;
        }
        if ((i14 & 4) == 0) {
            this.f98575c = null;
        } else {
            this.f98575c = str3;
        }
        if ((i14 & 8) == 0) {
            this.f98576d = null;
        } else {
            this.f98576d = l14;
        }
        if ((i14 & 16) == 0) {
            this.f98577e = null;
        } else {
            this.f98577e = list;
        }
        if ((i14 & 32) == 0) {
            this.f98578f = null;
        } else {
            this.f98578f = bool;
        }
        if ((i14 & 64) == 0) {
            this.f98579g = null;
        } else {
            this.f98579g = d14;
        }
        if ((i14 & 128) == 0) {
            this.f98580h = null;
        } else {
            this.f98580h = str4;
        }
        if ((i14 & 256) == 0) {
            this.f98581i = null;
        } else {
            this.f98581i = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return p005kotlin.jvm.internal.s.g(this.f98573a, sVar.f98573a) && p005kotlin.jvm.internal.s.g(this.f98574b, sVar.f98574b) && p005kotlin.jvm.internal.s.g(this.f98575c, sVar.f98575c) && p005kotlin.jvm.internal.s.g(this.f98576d, sVar.f98576d) && p005kotlin.jvm.internal.s.g(this.f98577e, sVar.f98577e) && p005kotlin.jvm.internal.s.g(this.f98578f, sVar.f98578f) && p005kotlin.jvm.internal.s.g(this.f98579g, sVar.f98579g) && p005kotlin.jvm.internal.s.g(this.f98580h, sVar.f98580h) && p005kotlin.jvm.internal.s.g(this.f98581i, sVar.f98581i);
    }

    public final int hashCode() {
        String str = this.f98573a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f98574b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f98575c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l14 = this.f98576d;
        int iHashCode4 = (iHashCode3 + (l14 == null ? 0 : l14.hashCode())) * 31;
        List<Long> list = this.f98577e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.f98578f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Double d14 = this.f98579g;
        int iHashCode7 = (iHashCode6 + (d14 == null ? 0 : d14.hashCode())) * 31;
        String str4 = this.f98580h;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f98581i;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbI = p6.b.i("UpdatePetProfileRequest(name=", this.f98573a, ", nickname=", this.f98574b, ", gender=");
        n23.j.q(this.f98576d, this.f98575c, ", primaryBreedId=", ", secondaryBreedIds=", sbI);
        sbI.append(this.f98577e);
        sbI.append(", isNeutered=");
        sbI.append(this.f98578f);
        sbI.append(", weight=");
        b71.i.u(sbI, this.f98579g, ", birthdate=", this.f98580h, ", birthdatePrecision=");
        return am.j.o(this.f98581i, ")", sbI);
    }

    /* JADX INFO: renamed from: je0.s$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lje0/s$b;", "", "<init>", "()V", "Li63/c;", "Lje0/s;", "serializer", "()Li63/c;", "gcm-domain-dogs_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<s> serializer() {
            return a.f98582a;
        }

        private Companion() {
        }
    }

    public s() {
        this((String) null, (String) null, (String) null, (Long) null, (List) null, (Boolean) null, (Double) null, (String) null, (String) null, 511, (p005kotlin.jvm.internal.j) null);
    }

    public s(String str, String str2, String str3, Long l14, List<Long> list, Boolean bool, Double d14, String str4, String str5) {
        this.f98573a = str;
        this.f98574b = str2;
        this.f98575c = str3;
        this.f98576d = l14;
        this.f98577e = list;
        this.f98578f = bool;
        this.f98579g = d14;
        this.f98580h = str4;
        this.f98581i = str5;
    }

    public /* synthetic */ s(String str, String str2, String str3, Long l14, List list, Boolean bool, Double d14, String str4, String str5, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? null : l14, (i14 & 16) != 0 ? null : list, (i14 & 32) != 0 ? null : bool, (i14 & 64) != 0 ? null : d14, (i14 & 128) != 0 ? null : str4, (i14 & 256) != 0 ? null : str5);
    }
}
