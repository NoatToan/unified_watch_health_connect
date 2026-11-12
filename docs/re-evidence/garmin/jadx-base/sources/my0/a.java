package my0;

import cy0.o;
import ha1.f;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lmy0/a;", "Lha1/f;", "Lcy0/o;", "multiDayActivityImageDTO", "<init>", "(Lcy0/o;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a extends f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f121457c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(o oVar) {
        super(oVar.getUrl(), oVar.getMediaUuid().getUuid());
        oVar.getClass();
        this.f121457c = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && s.g(this.f121457c, ((a) obj).f121457c);
    }

    public final int hashCode() {
        return this.f121457c.hashCode();
    }

    public final String toString() {
        return "EpicPhotoData(multiDayActivityImageDTO=" + this.f121457c + ")";
    }
}
