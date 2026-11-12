package ps;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lps/g;", "", "Lps/s;", "metadataDTO", "<init>", "(Lps/s;)V", "a", "Lps/s;", "getMetadataDTO", "()Lps/s;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("metadataDTO")
    private final s metadataDTO;

    public g(s sVar) {
        sVar.getClass();
        this.metadataDTO = sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && p005kotlin.jvm.internal.s.g(this.metadataDTO, ((g) obj).metadataDTO);
    }

    public final int hashCode() {
        return this.metadataDTO.hashCode();
    }

    public final String toString() {
        return "ActivityEventVideoMetaTypeDTO(metadataDTO=" + this.metadataDTO + ")";
    }
}
