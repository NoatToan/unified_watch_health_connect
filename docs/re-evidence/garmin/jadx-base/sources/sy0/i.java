package sy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsy0/i;", "", "Lb63/o;", "localDate", "<init>", "(Lb63/o;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b63.o f161225a;

    public i(b63.o oVar) {
        oVar.getClass();
        this.f161225a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f161225a.equals(((i) obj).f161225a);
    }

    public final int hashCode() {
        return this.f161225a.f16206a.hashCode();
    }

    public final String toString() {
        return "LocalDateImmutable(localDate=" + this.f161225a + ")";
    }
}
