package l3;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ll3/d;", "Ll3/g1$a;", "Lh4/d$b;", "menuAlignment", "anchorAlignment", "", MapboxMap.QFE_OFFSET, "<init>", "(Lh4/d$b;Lh4/d$b;I)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class d implements g1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.d.b f109205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h4.d.b f109206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109207c;

    public d(h4.d.b bVar, h4.d.b bVar2, int i14) {
        this.f109205a = bVar;
        this.f109206b = bVar2;
        this.f109207c = i14;
    }

    @Override // l3.g1.a
    public final int a(g6.l lVar, long j8, int i14, g6.o oVar) {
        int iA = this.f109206b.a(0, lVar.d(), oVar);
        int i15 = -this.f109205a.a(0, i14, oVar);
        g6.o oVar2 = g6.o.Ltr;
        int i16 = this.f109207c;
        if (oVar != oVar2) {
            i16 = -i16;
        }
        return lVar.f76008a + iA + i15 + i16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return p005kotlin.jvm.internal.s.g(this.f109205a, dVar.f109205a) && p005kotlin.jvm.internal.s.g(this.f109206b, dVar.f109206b) && this.f109207c == dVar.f109207c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f109207c) + ((this.f109206b.hashCode() + (this.f109205a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Horizontal(menuAlignment=");
        sb3.append(this.f109205a);
        sb3.append(", anchorAlignment=");
        sb3.append(this.f109206b);
        sb3.append(", offset=");
        return ds.e0.j(sb3, this.f109207c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }
}
