package nf;

import d53.w;
import hf.y;
import lf.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lnf/m;", "Lnf/j;", "Lhf/y;", "uri", "Lwf/m;", "options", "<init>", "(Lhf/y;Lwf/m;)V", "a", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f125758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf.m f125759b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnf/m$a;", "Lnf/j$a;", "Lhf/y;", "<init>", "()V", "coil-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements j.a<y> {
        @Override // nf.j.a
        public final j a(y yVar, wf.m mVar, hf.j jVar) {
            y yVar2 = yVar;
            if (s.g(yVar2.f83620c, "jar:file")) {
                return new m(yVar2, mVar);
            }
            return null;
        }
    }

    public m(y yVar, wf.m mVar) {
        this.f125758a = yVar;
        this.f125759b = mVar;
    }

    @Override // nf.j
    public final Object a(t13.d<? super i> dVar) {
        y yVar = this.f125758a;
        String str = yVar.f83622e;
        if (str == null) {
            str = "";
        }
        int iG = w.G('!', 0, 6, str);
        if (iG == -1) {
            o2.c.s(yVar, "Invalid jar:file URI: ");
            return null;
        }
        w63.y.a aVar = w63.y.f183408b;
        String strSubstring = str.substring(0, iG);
        aVar.getClass();
        w63.y yVarA = w63.y.a.a(strSubstring);
        w63.y yVarA2 = w63.y.a.a(str.substring(iG + 1, str.length()));
        w63.l lVar = this.f125759b.f185001f;
        lVar.getClass();
        lf.n nVarA = p.a(yVarA2, x63.k.c(yVarA, lVar, new wy2.c(26)), null, null, 28);
        dg.n nVar = dg.n.f59492a;
        String strD0 = w.d0('.', yVarA2.b(), "");
        nVar.getClass();
        return new o(nVarA, dg.n.a(strD0), lf.e.DISK);
    }
}
