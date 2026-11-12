package p6;

/* JADX INFO: loaded from: classes.dex */
public class h extends d {
    public h(char[] cArr) {
        super(cArr);
    }

    public static h g(String str) {
        h hVar = new h(str.toCharArray());
        hVar.f136194b = 0L;
        hVar.f(str.length() - 1);
        return hVar;
    }

    @Override // p6.d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && b().equals(((h) obj).b())) {
            return true;
        }
        return super.equals(obj);
    }
}
