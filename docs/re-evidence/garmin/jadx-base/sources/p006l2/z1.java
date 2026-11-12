package p006l2;

import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u0097\u0001\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Ll2/z1;", "", "Lkotlin/Function1;", "Ll2/y1;", "", "onDone", "onGo", "onNext", "onPrevious", "onSearch", "onSend", "<init>", "(Le23/l;Le23/l;Le23/l;Le23/l;Le23/l;Le23/l;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f108930g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final z1 f108931h = new z1(null, null, null, null, null, null, 63, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<y1, Unit> f108932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<y1, Unit> f108933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l<y1, Unit> f108934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l<y1, Unit> f108935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l<y1, Unit> f108936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l<y1, Unit> f108937f;

    public /* synthetic */ z1(l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6, int i14, j jVar) {
        this((i14 & 1) != 0 ? null : lVar, (i14 & 2) != 0 ? null : lVar2, (i14 & 4) != 0 ? null : lVar3, (i14 & 8) != 0 ? null : lVar4, (i14 & 16) != 0 ? null : lVar5, (i14 & 32) != 0 ? null : lVar6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return this.f108932a == z1Var.f108932a && this.f108933b == z1Var.f108933b && this.f108934c == z1Var.f108934c && this.f108935d == z1Var.f108935d && this.f108936e == z1Var.f108936e && this.f108937f == z1Var.f108937f;
    }

    public final int hashCode() {
        l<y1, Unit> lVar = this.f108932a;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        l<y1, Unit> lVar2 = this.f108933b;
        int iHashCode2 = (iHashCode + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        l<y1, Unit> lVar3 = this.f108934c;
        int iHashCode3 = (iHashCode2 + (lVar3 != null ? lVar3.hashCode() : 0)) * 31;
        l<y1, Unit> lVar4 = this.f108935d;
        int iHashCode4 = (iHashCode3 + (lVar4 != null ? lVar4.hashCode() : 0)) * 31;
        l<y1, Unit> lVar5 = this.f108936e;
        int iHashCode5 = (iHashCode4 + (lVar5 != null ? lVar5.hashCode() : 0)) * 31;
        l<y1, Unit> lVar6 = this.f108937f;
        return iHashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll2/z1$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z1(l<? super y1, Unit> lVar, l<? super y1, Unit> lVar2, l<? super y1, Unit> lVar3, l<? super y1, Unit> lVar4, l<? super y1, Unit> lVar5, l<? super y1, Unit> lVar6) {
        this.f108932a = lVar;
        this.f108933b = lVar2;
        this.f108934c = lVar3;
        this.f108935d = lVar4;
        this.f108936e = lVar5;
        this.f108937f = lVar6;
    }

    public z1() {
        this(null, null, null, null, null, null, 63, null);
    }
}
