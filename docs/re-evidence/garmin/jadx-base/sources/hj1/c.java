package hj1;

/* JADX INFO: loaded from: classes10.dex */
public interface c {
    static /* synthetic */ void a(c cVar, gj1.c cVar2, int i14) {
        if ((i14 & 1) != 0) {
            cVar2 = null;
        }
        cVar.c(cVar2, (i14 & 4) == 0);
    }

    void c(gj1.c cVar, boolean z14);

    void hideProgressOverlay();

    void showProgressOverlay();
}
