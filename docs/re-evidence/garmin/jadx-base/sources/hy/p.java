package hy;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhy/p;", "Lhy/g;", "Lgs1/f;", "autoDetectedEventDTO", "<init>", "(Lgs1/f;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gs1.f f86349a;

    static {
        Parcelable.Creator<gs1.f> creator = gs1.f.CREATOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gs1.f fVar) {
        super(null);
        fVar.getClass();
        this.f86349a = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && p005kotlin.jvm.internal.s.g(this.f86349a, ((p) obj).f86349a);
    }

    public final int hashCode() {
        return this.f86349a.hashCode();
    }

    public final String toString() {
        return "MoveIqDestination(autoDetectedEventDTO=" + this.f86349a + ")";
    }
}
