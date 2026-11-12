package xa;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    public interface a {
    }

    public d(String str, String str2, a aVar, int i14) {
        boolean z14 = true;
        fa.a.a(str == null || str.length() <= 64);
        if (str2 != null && str2.length() > 64) {
            z14 = false;
        }
        fa.a.a(z14);
        aVar.getClass();
    }

    public d(String str, String str2, a aVar) {
        this(str, str2, aVar, 0);
    }
}
