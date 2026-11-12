package ps;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lps/d;", "", "Lps/f;", "eventTypeDTO", "Lps/l;", "metadataDTO", "<init>", "(Lps/f;Lps/l;)V", "a", "Lps/f;", "getEventTypeDTO", "()Lps/f;", "b", "(Lps/f;)V", "Lps/l;", "getMetadataDTO", "()Lps/l;", "c", "(Lps/l;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("eventTypeDTO")
    private f eventTypeDTO;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metadataDTO")
    private l metadataDTO;

    public /* synthetic */ d(f fVar, l lVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : fVar, (i14 & 2) != 0 ? null : lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static d a() {
        d dVar = new d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        new l(null, 1, null);
        dVar.metadataDTO = new l(null);
        return dVar;
    }

    public final void b(f fVar) {
        this.eventTypeDTO = fVar;
    }

    public final void c(l lVar) {
        this.metadataDTO = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.eventTypeDTO, dVar.eventTypeDTO) && p005kotlin.jvm.internal.s.g(this.metadataDTO, dVar.metadataDTO);
    }

    public final int hashCode() {
        f fVar = this.eventTypeDTO;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        l lVar = this.metadataDTO;
        return iHashCode + (lVar != null ? lVar.hashCode() : 0);
    }

    public final String toString() {
        return "ActivityEventMetaTypeDTO(eventTypeDTO=" + this.eventTypeDTO + ", metadataDTO=" + this.metadataDTO + ")";
    }

    public d(f fVar, l lVar) {
        this.eventTypeDTO = fVar;
        this.metadataDTO = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
