package c82;

import b63.o;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lc82/i;", "", "Lb63/o;", "day", "Lc82/h;", "dayAccessory", "", "isSelected", "<init>", "(Lb63/o;Lc82/h;Z)V", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f25737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f25738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f25739c;

    public i(o oVar, h hVar, boolean z14) {
        oVar.getClass();
        hVar.getClass();
        this.f25737a = oVar;
        this.f25738b = hVar;
        this.f25739c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return s.g(this.f25737a, iVar.f25737a) && s.g(this.f25738b, iVar.f25738b) && this.f25739c == iVar.f25739c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25739c) + ((this.f25738b.hashCode() + (this.f25737a.f16206a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DayCalendarItem(day=");
        sb3.append(this.f25737a);
        sb3.append(", dayAccessory=");
        sb3.append(this.f25738b);
        sb3.append(", isSelected=");
        return hb.a.k(sb3, this.f25739c, ")");
    }

    public /* synthetic */ i(o oVar, h hVar, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(oVar, (i14 & 2) != 0 ? h.f.f25735a : hVar, (i14 & 4) != 0 ? false : z14);
    }
}
