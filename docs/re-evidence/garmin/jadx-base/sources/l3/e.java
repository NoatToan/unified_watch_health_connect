package l3;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll3/e;", "Ll3/g1$b;", "Lh4/d$c;", "menuAlignment", "anchorAlignment", "", MapboxMap.QFE_OFFSET, "<init>", "(Lh4/d$c;Lh4/d$c;I)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class e implements g1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.d.c f109223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4.d.c f109224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109225c;

    public e(h4.d.c cVar, h4.d.c cVar2, int i14) {
        this.f109223a = cVar;
        this.f109224b = cVar2;
        this.f109225c = i14;
    }

    @Override // l3.g1.b
    public final int a(g6.l lVar, long j8, int i14) {
        int iA = this.f109224b.a(0, lVar.b());
        return lVar.f76009b + iA + (-this.f109223a.a(0, i14)) + this.f109225c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return p005kotlin.jvm.internal.s.g(this.f109223a, eVar.f109223a) && p005kotlin.jvm.internal.s.g(this.f109224b, eVar.f109224b) && this.f109225c == eVar.f109225c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109225c) + ((this.f109224b.hashCode() + (this.f109223a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Vertical(menuAlignment=");
        sb3.append(this.f109223a);
        sb3.append(", anchorAlignment=");
        sb3.append(this.f109224b);
        sb3.append(", offset=");
        return ds.e0.j(sb3, this.f109225c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
