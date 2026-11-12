package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class s6j extends de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xe f33349a;

    public s6j(xe xeVar) {
        this.f33349a = xeVar;
    }

    public static s6j h(Object obj) {
        if (obj instanceof s6j) {
            return (s6j) obj;
        }
        if (obj != null) {
            return new s6j(xe.r(obj));
        }
        return null;
    }

    public jm1 g() {
        if (this.f33349a.size() == 0) {
            return null;
        }
        return jm1.g(this.f33349a.u(0));
    }

    public jm1[] i() {
        int size = this.f33349a.size();
        jm1[] jm1VarArr = new jm1[size];
        for (int i = 0; i != size; i++) {
            jm1VarArr[i] = jm1.g(this.f33349a.u(i));
        }
        return jm1VarArr;
    }

    public boolean j() {
        return this.f33349a.size() > 1;
    }

    @Override // defpackage.de, defpackage.hd
    public re toASN1Primitive() {
        return this.f33349a;
    }
}
