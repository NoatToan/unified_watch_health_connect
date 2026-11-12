package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lf5/d1;", "", "<init>", "()V", "a", "b", "c", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d1 f68915a = new d1();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf5/d1$a;", "Lf5/y0;", "Lf5/w;", "measurable", "Lf5/d1$c;", "minMax", "Lf5/d1$d;", "widthHeight", "<init>", "(Lf5/w;Lf5/d1$c;Lf5/d1$d;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w f68916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f68917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f68918c;

        public a(w wVar, c cVar, d dVar) {
            this.f68916a = wVar;
            this.f68917b = cVar;
            this.f68918c = dVar;
        }

        @Override // f5.w
        public final int O(int i14) {
            return this.f68916a.O(i14);
        }

        @Override // f5.y0
        public final v1 Q(long j8) {
            d dVar = d.Width;
            w wVar = this.f68916a;
            d dVar2 = this.f68918c;
            c cVar = this.f68917b;
            if (dVar2 == dVar) {
                return new b(cVar == c.Max ? wVar.l0(g6.a.i(j8)) : wVar.O(g6.a.i(j8)), g6.a.e(j8) ? g6.a.i(j8) : 32767);
            }
            return new b(g6.a.f(j8) ? g6.a.j(j8) : 32767, cVar == c.Max ? wVar.a0(g6.a.j(j8)) : wVar.e0(g6.a.j(j8)));
        }

        @Override // f5.w
        public final int a0(int i14) {
            return this.f68916a.a0(i14);
        }

        @Override // f5.w
        /* JADX INFO: renamed from: e */
        public final Object getF81969t() {
            return this.f68916a.getF81969t();
        }

        @Override // f5.w
        public final int e0(int i14) {
            return this.f68916a.e0(i14);
        }

        @Override // f5.w
        public final int l0(int i14) {
            return this.f68916a.l0(i14);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf5/d1$b;", "Lf5/v1;", "", "width", "height", "<init>", "(II)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends v1 {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf5/d1$c;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum c {
        Min,
        Max
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf5/d1$d;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        Width,
        Height
    }

    private d1() {
    }
}
