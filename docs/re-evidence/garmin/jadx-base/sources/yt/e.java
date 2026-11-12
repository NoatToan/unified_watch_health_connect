package yt;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f199285b;

    public /* synthetic */ e(h hVar, int i14) {
        this.f199284a = i14;
        this.f199285b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f199284a;
        int i15 = 1;
        h hVar = this.f199285b;
        switch (i14) {
            case 0:
                if (!hVar.f199311j) {
                    hVar.f199311j = true;
                }
                break;
            case 1:
                int i16 = h.f199301x;
                ot.p pVarX4 = hVar.w6().x4();
                if (pVarX4 != null) {
                    String strConcat = "handleChapterPause ".concat(pVarX4.getClass().getSimpleName());
                    i2.a aVar = i2.f36769a;
                    a2 a2Var = a2.GENERAL;
                    aVar.getClass();
                    i2.a.b(a2Var, "AnnualReportPlayerFragment", strConcat);
                    nt.a aVar2 = nt.a.f127827a;
                    String strF = pVarX4.getF133677s();
                    aVar2.getClass();
                    strF.getClass();
                    ht.s sVar = ht.s.f85508a;
                    lt.a.f fVar = new lt.a.f(strF, lt.a.c.ACTION_CHAPTER_PAUSE);
                    sVar.getClass();
                    ht.s.a(fVar);
                }
                hVar.A6(true);
                hVar.C6(false);
                break;
            default:
                int i17 = h.f199301x;
                hVar.w6().f199345f.f(hVar.getViewLifecycleOwner(), new h.c(new b(hVar, i15)));
                break;
        }
    }
}
