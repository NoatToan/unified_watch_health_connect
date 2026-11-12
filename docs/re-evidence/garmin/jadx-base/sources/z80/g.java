package z80;

import com.google.gson.annotations.SerializedName;
import m63.u1;
import m63.y1;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u000e\u0010B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0017"}, d2 = {"Lz80/g;", "", "", "enabled", "", "sport", "subSport", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lm63/u1;", "serializationConstructorMarker", "(ILjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lm63/u1;)V", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "Companion", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@i63.h
public final /* data */ class g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("enabled")
    private final Boolean enabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("sport")
    private final String sport;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @SerializedName("subSport")
    private final String subSport;

    public /* synthetic */ g(int i14, Boolean bool, String str, String str2, u1 u1Var) {
        if ((i14 & 1) == 0) {
            this.enabled = null;
        } else {
            this.enabled = bool;
        }
        if ((i14 & 2) == 0) {
            this.sport = null;
        } else {
            this.sport = str;
        }
        if ((i14 & 4) == 0) {
            this.subSport = null;
        } else {
            this.subSport = str2;
        }
    }

    public static g a(g gVar, Boolean bool) {
        String str = gVar.sport;
        String str2 = gVar.subSport;
        gVar.getClass();
        return new g(bool, str, str2);
    }

    public static final /* synthetic */ void e(g gVar, l63.d dVar, k63.e eVar) {
        if (dVar.C(eVar) || gVar.enabled != null) {
            dVar.d(eVar, 0, m63.g.f116948a, gVar.enabled);
        }
        if (dVar.C(eVar) || gVar.sport != null) {
            dVar.d(eVar, 1, y1.f117048a, gVar.sport);
        }
        if (!dVar.C(eVar) && gVar.subSport == null) {
            return;
        }
        dVar.d(eVar, 2, y1.f117048a, gVar.subSport);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSport() {
        return this.sport;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubSport() {
        return this.subSport;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return s.g(this.enabled, gVar.enabled) && s.g(this.sport, gVar.sport) && s.g(this.subSport, gVar.subSport);
    }

    public final int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.sport;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subSport;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.enabled;
        String str = this.sport;
        String str2 = this.subSport;
        StringBuilder sb3 = new StringBuilder("DisplayedActivityDTO(enabled=");
        sb3.append(bool);
        sb3.append(", sport=");
        sb3.append(str);
        sb3.append(", subSport=");
        return am.j.o(str2, ")", sb3);
    }

    /* JADX INFO: renamed from: z80.g$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lz80/g$b;", "", "<init>", "()V", "Li63/c;", "Lz80/g;", "serializer", "()Li63/c;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public final i63.c<g> serializer() {
            return a.f203055a;
        }

        private Companion() {
        }
    }

    public g() {
        this((Boolean) null, (String) null, (String) null, 7, (p005kotlin.jvm.internal.j) null);
    }

    public g(Boolean bool, String str, String str2) {
        this.enabled = bool;
        this.sport = str;
        this.subSport = str2;
    }

    public /* synthetic */ g(Boolean bool, String str, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : bool, (i14 & 2) != 0 ? null : str, (i14 & 4) != 0 ? null : str2);
    }
}
