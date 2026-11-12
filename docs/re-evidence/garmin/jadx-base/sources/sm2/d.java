package sm2;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class d extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qm2.l f160291i;

    public d(Context context, yl2.d dVar, rm2.c cVar) {
        super(context, dVar, cVar, "ConfigurePermissionsOperation");
        this.f160291i = this.f160338d.f197839a;
    }

    @Override // sm2.r
    public final void h() {
        yl2.d dVar;
        bm2.d dVar2;
        if (this.f160291i == null || (dVar2 = (dVar = this.f160338d).f197842d) == null) {
            d();
        } else {
            if (dVar.f197850l) {
                d();
                return;
            }
            new e(dVar2, dVar.f197839a).c();
            dVar.f197850l = true;
            d();
        }
    }
}
