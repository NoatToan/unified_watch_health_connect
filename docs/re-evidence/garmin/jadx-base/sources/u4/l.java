package u4;

import com.mapbox.maps.MapboxMap;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002By\b\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lu4/l;", "Lu4/n;", "", "", "name", "", "rotation", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "", "Lu4/g;", "clipPathData", MapboxMap.QFE_CHILDREN, "<init>", "(Ljava/lang/String;FFFFFFFLjava/util/List;Ljava/util/List;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l extends n implements Iterable<n>, f23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f168509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f168510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f168511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f168512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f168513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f168514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f168515h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<g> f168516i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<n> f168517j;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"u4/l$a", "", "Lu4/n;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Iterator<n>, f23.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Iterator<n> f168518a;

        public a(l lVar) {
            this.f168518a = lVar.f168517j.iterator();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f168518a.hasNext();
        }

        @Override // java.util.Iterator
        public final n next() {
            return this.f168518a.next();
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public l(String str, float f14, float f15, float f16, float f17, float f18, float f19, float f22, List list, List list2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? 0.0f : f14, (i14 & 4) != 0 ? 0.0f : f15, (i14 & 8) != 0 ? 0.0f : f16, (i14 & 16) != 0 ? 1.0f : f17, (i14 & 32) != 0 ? 1.0f : f18, (i14 & 64) != 0 ? 0.0f : f19, (i14 & 128) != 0 ? 0.0f : f22, (i14 & 256) != 0 ? m.f168519a : list, (i14 & 512) != 0 ? j0.f134944a : list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof l)) {
            l lVar = (l) obj;
            return s.g(this.f168508a, lVar.f168508a) && this.f168509b == lVar.f168509b && this.f168510c == lVar.f168510c && this.f168511d == lVar.f168511d && this.f168512e == lVar.f168512e && this.f168513f == lVar.f168513f && this.f168514g == lVar.f168514g && this.f168515h == lVar.f168515h && s.g(this.f168516i, lVar.f168516i) && s.g(this.f168517j, lVar.f168517j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f168517j.hashCode() + u0.b(q6.f.d(this.f168515h, q6.f.d(this.f168514g, q6.f.d(this.f168513f, q6.f.d(this.f168512e, q6.f.d(this.f168511d, q6.f.d(this.f168510c, q6.f.d(this.f168509b, this.f168508a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31, this.f168516i);
    }

    @Override // java.lang.Iterable
    public final Iterator<n> iterator() {
        return new a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(String str, float f14, float f15, float f16, float f17, float f18, float f19, float f22, List<? extends g> list, List<? extends n> list2) {
        super(null);
        this.f168508a = str;
        this.f168509b = f14;
        this.f168510c = f15;
        this.f168511d = f16;
        this.f168512e = f17;
        this.f168513f = f18;
        this.f168514g = f19;
        this.f168515h = f22;
        this.f168516i = list;
        this.f168517j = list2;
    }

    public l() {
        this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
    }
}
