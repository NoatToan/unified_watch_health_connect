package db1;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldb1/f;", "", "Ldb1/p;", "setupStepErrorResponseMap", "Ldb1/m;", "pregnancySnapshotDTO", "<init>", "(Ldb1/p;Ldb1/m;)V", "a", "Ldb1/p;", "()Ldb1/p;", "b", "Ldb1/m;", "getPregnancySnapshotDTO", "()Ldb1/m;", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("setupStepErrorResponseMap")
    private final p setupStepErrorResponseMap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @SerializedName("pregnancySnapshotDTO")
    private final m pregnancySnapshotDTO;

    static {
        Parcelable.Creator<m> creator = m.CREATOR;
    }

    public f(p pVar, m mVar) {
        pVar.getClass();
        mVar.getClass();
        this.setupStepErrorResponseMap = pVar;
        this.pregnancySnapshotDTO = mVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p getSetupStepErrorResponseMap() {
        return this.setupStepErrorResponseMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.setupStepErrorResponseMap, fVar.setupStepErrorResponseMap) && p005kotlin.jvm.internal.s.g(this.pregnancySnapshotDTO, fVar.pregnancySnapshotDTO);
    }

    public final int hashCode() {
        return this.pregnancySnapshotDTO.hashCode() + (this.setupStepErrorResponseMap.hashCode() * 31);
    }

    public final String toString() {
        return "InitPregnancySetupResponseDTO(setupStepErrorResponseMap=" + this.setupStepErrorResponseMap + ", pregnancySnapshotDTO=" + this.pregnancySnapshotDTO + ")";
    }
}
