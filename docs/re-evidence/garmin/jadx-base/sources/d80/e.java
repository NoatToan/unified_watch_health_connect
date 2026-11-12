package d80;

import android.text.TextUtils;
import lj0.k;

/* JADX INFO: loaded from: classes8.dex */
public class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f.a f58256a;

    public e(f.a aVar) {
        this.f58256a = aVar;
    }

    @Override // lj0.k
    public final void a(lj0.b bVar) {
        f.a aVar = this.f58256a;
        aVar.f58268c = new f.c(f.this, bVar, b.a.GARMIN_CONNECT);
    }

    @Override // lj0.k
    public final void b(lj0.e.a aVar) {
        String str = (String) aVar.f112977a;
        f.a aVar2 = this.f58256a;
        aVar2.f58269d = str;
        if (TextUtils.isEmpty(str)) {
            f fVar = f.this;
            if (fVar.f58261e != g.NO_PARSING) {
                aVar2.f58268c = new f.c(fVar, lj0.b.f112954h, b.a.GARMIN_CONNECT);
                return;
            }
        }
        aVar2.f58268c = new f.c(f.this, b.a.GARMIN_CONNECT);
    }
}
