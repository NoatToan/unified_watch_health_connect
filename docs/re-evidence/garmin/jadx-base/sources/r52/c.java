package r52;

/* JADX INFO: loaded from: classes9.dex */
public interface c {
    static /* synthetic */ void a(c cVar, String str, String str2, boolean z14, int i14) {
        if ((i14 & 8) != 0) {
            z14 = true;
        }
        cVar.b(str, str2, null, z14);
    }

    void b(String str, String str2, u4.d dVar, boolean z14);

    void c(String str, String str2, boolean z14);

    boolean isLoading();
}
