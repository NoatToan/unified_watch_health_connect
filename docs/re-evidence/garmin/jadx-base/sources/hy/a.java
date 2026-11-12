package hy;

import android.os.Parcelable;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lhy/a;", "Lhy/g;", "Lgs1/b;", "activityForDayDTO", "<init>", "(Lgs1/b;)V", "gcm-calendar_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gs1.b f86318a;

    static {
        Parcelable.Creator<gs1.b> creator = gs1.b.CREATOR;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gs1.b bVar) {
        super(null);
        bVar.getClass();
        this.f86318a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && p005kotlin.jvm.internal.s.g(this.f86318a, ((a) obj).f86318a);
    }

    public final int hashCode() {
        return this.f86318a.hashCode();
    }

    public final String toString() {
        return "ActivityDetailsDestination(activityForDayDTO=" + this.f86318a + ")";
    }
}
