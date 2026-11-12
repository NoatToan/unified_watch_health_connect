package p3;

import com.mapbox.maps.MapboxMap;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lp3/v1;", "N", "Lp3/c;", "applier", "", MapboxMap.QFE_OFFSET, "<init>", "(Lp3/c;I)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v1<N> implements c<N> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<N> f135339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f135340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f135341c;

    public v1(c<N> cVar, int i14) {
        this.f135339a = cVar;
        this.f135340b = i14;
    }

    @Override // p3.c
    public final void apply(e23.p<? super N, Object, Unit> pVar, Object obj) {
        this.f135339a.apply(pVar, obj);
    }

    @Override // p3.c
    public final void clear() {
        n.a("Clear is not valid on OffsetApplier");
    }

    @Override // p3.c
    public final void down(N n14) {
        this.f135341c++;
        this.f135339a.down(n14);
    }

    @Override // p3.c
    public final N getCurrent() {
        return this.f135339a.getCurrent();
    }

    @Override // p3.c
    public final void insertBottomUp(int i14, N n14) {
        this.f135339a.insertBottomUp(i14 + (this.f135341c == 0 ? this.f135340b : 0), n14);
    }

    @Override // p3.c
    public final void insertTopDown(int i14, N n14) {
        this.f135339a.insertTopDown(i14 + (this.f135341c == 0 ? this.f135340b : 0), n14);
    }

    @Override // p3.c
    public final void move(int i14, int i15, int i16) {
        int i17 = this.f135341c == 0 ? this.f135340b : 0;
        this.f135339a.move(i14 + i17, i15 + i17, i16);
    }

    @Override // p3.c
    public final void remove(int i14, int i15) {
        this.f135339a.remove(i14 + (this.f135341c == 0 ? this.f135340b : 0), i15);
    }

    @Override // p3.c
    public final void reuse() {
        this.f135339a.reuse();
    }

    @Override // p3.c
    public final void up() {
        if (!(this.f135341c > 0)) {
            n.a("OffsetApplier up called with no corresponding down");
        }
        this.f135341c--;
        this.f135339a.up();
    }
}
