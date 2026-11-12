package gy0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lgy0/l;", "", "", "Lcy0/o;", "deletedImagesSuccess", "deletedImagesFailure", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "gcm-multi-day-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<cy0.o> f80187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<cy0.o> f80188b;

    public l(List<cy0.o> list, List<cy0.o> list2) {
        list.getClass();
        list2.getClass();
        this.f80187a = list;
        this.f80188b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f80187a.equals(lVar.f80187a) && this.f80188b.equals(lVar.f80188b);
    }

    public final int hashCode() {
        return this.f80188b.hashCode() + (this.f80187a.hashCode() * 31);
    }

    public final String toString() {
        return c22.t.f("EpicDeleteImageResult(deletedImagesSuccess=", ", deletedImagesFailure=", ")", this.f80187a, this.f80188b);
    }
}
