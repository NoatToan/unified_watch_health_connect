package sk0;

import com.garmin.android.gncs.NotificationConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsk0/r0;", "", "Ljk0/o;", "sortOrder", "Lc80/u;", NotificationConstants.KEY_DATA_MIME_TYPE, "<init>", "(Ljk0/o;Lc80/u;)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jk0.o f159823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c80.u f159824b;

    public r0(jk0.o oVar, c80.u uVar) {
        oVar.getClass();
        this.f159823a = oVar;
        this.f159824b = uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.f159823a == r0Var.f159823a && this.f159824b == r0Var.f159824b;
    }

    public final int hashCode() {
        int iHashCode = this.f159823a.hashCode() * 31;
        c80.u uVar = this.f159824b;
        return iHashCode + (uVar == null ? 0 : uVar.hashCode());
    }

    public final String toString() {
        return "GearCacheKey(sortOrder=" + this.f159823a + ", type=" + this.f159824b + ")";
    }
}
