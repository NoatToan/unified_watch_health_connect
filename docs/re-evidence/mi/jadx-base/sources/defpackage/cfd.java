package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class cfd implements oq5, bfd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfd f5278a;

    public cfd(bfd bfdVar) {
        this.f5278a = bfdVar;
    }

    public static oq5 d(bfd bfdVar) {
        if (bfdVar instanceof qq5) {
            return ((qq5) bfdVar).b();
        }
        if (bfdVar instanceof oq5) {
            return (oq5) bfdVar;
        }
        if (bfdVar == null) {
            return null;
        }
        return new cfd(bfdVar);
    }

    @Override // defpackage.oq5, defpackage.bfd
    public int a() {
        return this.f5278a.a();
    }

    @Override // defpackage.oq5
    public int b(pq5 pq5Var, String str, int i) {
        return this.f5278a.c(pq5Var, str, i);
    }

    @Override // defpackage.bfd
    public int c(pq5 pq5Var, CharSequence charSequence, int i) {
        return this.f5278a.c(pq5Var, charSequence, i);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cfd) {
            return this.f5278a.equals(((cfd) obj).f5278a);
        }
        return false;
    }

    public int hashCode() {
        return this.f5278a.hashCode();
    }
}
