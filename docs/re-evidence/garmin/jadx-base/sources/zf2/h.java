package zf2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzf2/h;", "", "Lzf2/f;", "heartRateZones", "", "", "powerZones", "<init>", "(Lzf2/f;Ljava/util/List;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f204649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<Integer> f204650b;

    public h(f fVar, List<Integer> list) {
        list.getClass();
        this.f204649a = fVar;
        this.f204650b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return s.g(this.f204649a, hVar.f204649a) && this.f204650b.equals(hVar.f204650b);
    }

    public final int hashCode() {
        f fVar = this.f204649a;
        return this.f204650b.hashCode() + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }

    public final String toString() {
        return "LiveActivityUserZones(heartRateZones=" + this.f204649a + ", powerZones=" + this.f204650b + ")";
    }
}
