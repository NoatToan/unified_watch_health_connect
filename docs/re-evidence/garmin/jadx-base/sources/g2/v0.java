package g2;

import p005kotlin.Metadata;
import p3.a4;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lg2/v0;", "Lp3/x3;", "Lj23/l;", "", "firstVisibleItem", "slidingWindowSize", "extraItemCount", "<init>", "(III)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 implements x3<j23.l> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f75283e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.c2 f75286c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f75287d;

    public v0(int i14, int i15, int i16) {
        this.f75284a = i15;
        this.f75285b = i16;
        f75283e.getClass();
        int i17 = (i14 / i15) * i15;
        j23.l lVarO = j23.t.o(Math.max(i17 - i16, 0), i17 + i15 + i16);
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        this.f75286c = new p3.c2(lVarO, a4Var);
        this.f75287d = i14;
    }

    public final void a(int i14) {
        if (i14 != this.f75287d) {
            this.f75287d = i14;
            f75283e.getClass();
            int i15 = this.f75284a;
            int i16 = (i14 / i15) * i15;
            int i17 = this.f75285b;
            this.f75286c.setValue(j23.t.o(Math.max(i16 - i17, 0), i16 + i15 + i17));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p3.x3
    /* JADX INFO: renamed from: getValue */
    public final j23.l getF182175a() {
        return (j23.l) this.f75286c.getF182175a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg2/v0$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
