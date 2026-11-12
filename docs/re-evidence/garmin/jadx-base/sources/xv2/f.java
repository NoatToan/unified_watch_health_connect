package xv2;

import gw2.h;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lxv2/f;", "", "", "groupId", "Lgw2/h;", "actionType", "Lxv2/a;", "deleteConfirmation", "", "Lxv2/e;", "listItems", "<init>", "(ILgw2/h;Lxv2/a;Ljava/util/List;)V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f192287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f192288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f192289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<e> f192290d;

    public f(int i14, h hVar, a aVar, List<e> list) {
        hVar.getClass();
        list.getClass();
        this.f192287a = i14;
        this.f192288b = hVar;
        this.f192289c = aVar;
        this.f192290d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f192287a == fVar.f192287a && this.f192288b == fVar.f192288b && s.g(this.f192289c, fVar.f192289c) && this.f192290d.equals(fVar.f192290d);
    }

    public final int hashCode() {
        int iHashCode = (this.f192288b.hashCode() + (Integer.hashCode(this.f192287a) * 31)) * 31;
        a aVar = this.f192289c;
        return this.f192290d.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        return "ReorderableListOptions(groupId=" + this.f192287a + ", actionType=" + this.f192288b + ", deleteConfirmation=" + this.f192289c + ", listItems=" + this.f192290d + ")";
    }
}
