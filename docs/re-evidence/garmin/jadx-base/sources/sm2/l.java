package sm2;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class l extends r implements rm2.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rm2.h f160325i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lm2.f f160326j;

    public l(Context context, yl2.d dVar, rm2.c cVar, rm2.h hVar, lm2.f fVar) {
        super(context, dVar, cVar, "FirstSyncOperation");
        this.f160325i = hVar;
        this.f160326j = fVar;
    }

    @Override // sm2.r
    public final void h() {
        this.f160340f.debug("start first sync");
        yl2.d dVar = this.f160338d;
        this.f160325i.J(dVar.getF197655a(), dVar.f197839a.f145765g == 2, this);
    }

    @Override // sm2.r, la2.a
    public final void onDeviceDisconnected(la2.h hVar) {
        if (this.f132976b.get() == null) {
            return;
        }
        this.f160341g.submit(new a0.a((Object) this, false, 13));
    }
}
