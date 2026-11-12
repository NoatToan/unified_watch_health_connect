package i3;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BY\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB;\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Li3/ec;", "", "Lk2/a;", "extraSmall", "small", "medium", "large", "extraLarge", "largeIncreased", "extraLargeIncreased", "extraExtraLarge", "<init>", "(Lk2/a;Lk2/a;Lk2/a;Lk2/a;Lk2/a;Lk2/a;Lk2/a;Lk2/a;)V", "(Lk2/a;Lk2/a;Lk2/a;Lk2/a;Lk2/a;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k2.a f87990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k2.a f87991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2.a f87992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k2.a f87993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k2.a f87994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k2.a f87995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k2.a f87996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k2.a f87997h;

    /* JADX WARN: Illegal instructions before constructor call */
    public ec(k2.a aVar, k2.a aVar2, k2.a aVar3, k2.a aVar4, k2.a aVar5, k2.a aVar6, k2.a aVar7, k2.a aVar8, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            dc.f87864a.getClass();
            aVar = dc.f87865b;
        }
        if ((i14 & 2) != 0) {
            dc.f87864a.getClass();
            aVar2 = dc.f87866c;
        }
        if ((i14 & 4) != 0) {
            dc.f87864a.getClass();
            aVar3 = dc.f87867d;
        }
        if ((i14 & 8) != 0) {
            dc.f87864a.getClass();
            aVar4 = dc.f87868e;
        }
        if ((i14 & 16) != 0) {
            dc.f87864a.getClass();
            aVar5 = dc.f87870g;
        }
        if ((i14 & 32) != 0) {
            dc.f87864a.getClass();
            aVar6 = dc.f87869f;
        }
        if ((i14 & 64) != 0) {
            dc.f87864a.getClass();
            aVar7 = dc.f87871h;
        }
        if ((i14 & 128) != 0) {
            dc.f87864a.getClass();
            aVar8 = dc.f87872i;
        }
        k2.a aVar9 = aVar7;
        k2.a aVar10 = aVar8;
        k2.a aVar11 = aVar5;
        k2.a aVar12 = aVar6;
        this(aVar, aVar2, aVar3, aVar4, aVar11, aVar12, aVar9, aVar10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec)) {
            return false;
        }
        ec ecVar = (ec) obj;
        return p005kotlin.jvm.internal.s.g(this.f87990a, ecVar.f87990a) && p005kotlin.jvm.internal.s.g(this.f87991b, ecVar.f87991b) && p005kotlin.jvm.internal.s.g(this.f87992c, ecVar.f87992c) && p005kotlin.jvm.internal.s.g(this.f87993d, ecVar.f87993d) && p005kotlin.jvm.internal.s.g(this.f87994e, ecVar.f87994e) && p005kotlin.jvm.internal.s.g(this.f87995f, ecVar.f87995f) && p005kotlin.jvm.internal.s.g(this.f87996g, ecVar.f87996g) && p005kotlin.jvm.internal.s.g(this.f87997h, ecVar.f87997h);
    }

    public final int hashCode() {
        return this.f87997h.hashCode() + ((this.f87996g.hashCode() + ((this.f87995f.hashCode() + ((this.f87994e.hashCode() + ((this.f87993d.hashCode() + ((this.f87992c.hashCode() + ((this.f87991b.hashCode() + (this.f87990a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.f87990a + ", small=" + this.f87991b + ", medium=" + this.f87992c + ", large=" + this.f87993d + ", largeIncreased=" + this.f87995f + ", extraLarge=" + this.f87994e + ", extralargeIncreased=" + this.f87996g + ", extraExtraLarge=" + this.f87997h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ec(k2.a aVar, k2.a aVar2, k2.a aVar3, k2.a aVar4, k2.a aVar5, k2.a aVar6, k2.a aVar7, k2.a aVar8) {
        this.f87990a = aVar;
        this.f87991b = aVar2;
        this.f87992c = aVar3;
        this.f87993d = aVar4;
        this.f87994e = aVar5;
        this.f87995f = aVar6;
        this.f87996g = aVar7;
        this.f87997h = aVar8;
    }

    public ec() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ec(k2.a aVar, k2.a aVar2, k2.a aVar3, k2.a aVar4, k2.a aVar5, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            dc.f87864a.getClass();
            aVar = dc.f87865b;
        }
        if ((i14 & 2) != 0) {
            dc.f87864a.getClass();
            aVar2 = dc.f87866c;
        }
        if ((i14 & 4) != 0) {
            dc.f87864a.getClass();
            aVar3 = dc.f87867d;
        }
        if ((i14 & 8) != 0) {
            dc.f87864a.getClass();
            aVar4 = dc.f87868e;
        }
        if ((i14 & 16) != 0) {
            dc.f87864a.getClass();
            aVar5 = dc.f87870g;
        }
        k2.a aVar6 = aVar5;
        k2.a aVar7 = aVar3;
        k2.a aVar8 = aVar;
        this(aVar8, aVar2, aVar7, aVar4, aVar6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ec(k2.a aVar, k2.a aVar2, k2.a aVar3, k2.a aVar4, k2.a aVar5) {
        this(aVar, aVar2, aVar3, aVar4, aVar5, dc.f87869f, dc.f87871h, dc.f87872i);
        dc.f87864a.getClass();
    }
}
