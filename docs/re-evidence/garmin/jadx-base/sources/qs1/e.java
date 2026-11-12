package qs1;

import com.google.gson.annotations.SerializedName;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b¨\u0006\t"}, d2 = {"Lqs1/e;", "", "Lqs1/d;", "curatedCourseDTO", "<init>", "(Lqs1/d;)V", "a", "Lqs1/d;", "()Lqs1/d;", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("curatedCourseDTO")
    private final d curatedCourseDTO;

    public e(d dVar) {
        dVar.getClass();
        this.curatedCourseDTO = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getCuratedCourseDTO() {
        return this.curatedCourseDTO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && p005kotlin.jvm.internal.s.g(this.curatedCourseDTO, ((e) obj).curatedCourseDTO);
    }

    public final int hashCode() {
        return this.curatedCourseDTO.hashCode();
    }

    public final String toString() {
        return "CuratedCourseWrapper(curatedCourseDTO=" + this.curatedCourseDTO + ")";
    }
}
