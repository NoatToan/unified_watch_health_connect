package h5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lh5/h1;", "", "<init>", "()V", "a", "b", "c", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f81827a = new h1();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lh5/h1$a;", "Lf5/y0;", "Lf5/w;", "measurable", "Lh5/h1$c;", "minMax", "Lh5/h1$d;", "widthHeight", "<init>", "(Lf5/w;Lh5/h1$c;Lh5/h1$d;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements f5.y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f5.w f81828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f81829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f81830c;

        public a(f5.w wVar, c cVar, d dVar) {
            this.f81828a = wVar;
            this.f81829b = cVar;
            this.f81830c = dVar;
        }

        @Override // f5.w
        public final int O(int i14) {
            return this.f81828a.O(i14);
        }

        @Override // f5.y0
        public final f5.v1 Q(long j8) {
            d dVar = d.Width;
            f5.w wVar = this.f81828a;
            d dVar2 = this.f81830c;
            c cVar = this.f81829b;
            if (dVar2 == dVar) {
                return new b(cVar == c.Max ? wVar.l0(g6.a.i(j8)) : wVar.O(g6.a.i(j8)), g6.a.e(j8) ? g6.a.i(j8) : 32767);
            }
            return new b(g6.a.f(j8) ? g6.a.j(j8) : 32767, cVar == c.Max ? wVar.a0(g6.a.j(j8)) : wVar.e0(g6.a.j(j8)));
        }

        @Override // f5.w
        public final int a0(int i14) {
            return this.f81828a.a0(i14);
        }

        @Override // f5.w
        /* JADX INFO: renamed from: e */
        public final Object getF81969t() {
            return this.f81828a.getF81969t();
        }

        @Override // f5.w
        public final int e0(int i14) {
            return this.f81828a.e0(i14);
        }

        @Override // f5.w
        public final int l0(int i14) {
            return this.f81828a.l0(i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh5/h1$b;", "Lf5/v1;", "", "width", "height", "<init>", "(II)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends f5.v1 {
        public b(int i14, int i15) {
            long j8 = (((long) i15) & 4294967295L) | (((long) i14) << 32);
            g6.m.a aVar = g6.m.f76012b;
            D0(j8);
        }

        @Override // f5.c1
        public final int E(f5.a aVar) {
            return Integer.MIN_VALUE;
        }

        @Override // f5.v1
        public final void u0(float f14, long j8, e23.l lVar) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/h1$c;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        Min,
        Max
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/h1$d;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        Width,
        Height
    }

    private h1() {
    }
}
