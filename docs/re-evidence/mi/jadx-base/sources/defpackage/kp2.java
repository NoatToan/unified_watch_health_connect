package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class kp2 {

    public static class a implements nnq<u14> {
        @Override // defpackage.nnq
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int a(u14 u14Var) {
            return u14Var.b();
        }
    }

    public static yl4<c93, u14> a(tpo<hpf> tpoVar, spf spfVar, yl4.c cVar) {
        yl4<c93, u14> yl4Var = new yl4<>(new a(), cVar, tpoVar);
        spfVar.registerMemoryTrimmable(yl4Var);
        return yl4Var;
    }
}
