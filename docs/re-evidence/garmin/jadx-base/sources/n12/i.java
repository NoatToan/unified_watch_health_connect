package n12;

import android.net.Uri;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class i extends p005kotlin.jvm.internal.q implements e23.l<com.garmin.android.apps.connectmobile.userprofile.editimage.f, Unit> {
    public i(Object obj) {
        super(1, obj, com.garmin.android.apps.connectmobile.userprofile.editimage.c.class, "updateImageSource", "updateImageSource(Lcom/garmin/android/apps/connectmobile/userprofile/editimage/ImageSourceType;)V", 0);
    }

    @Override // e23.l
    public final Unit invoke(com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar) {
        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar2 = fVar;
        fVar2.getClass();
        com.garmin.android.apps.connectmobile.userprofile.editimage.c cVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.c) this.receiver;
        cVar.getClass();
        if (fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.a) {
            ge1.b.T(cVar, null, null, new f0(cVar, ((com.garmin.android.apps.connectmobile.userprofile.editimage.f.a) fVar2).f46702b, null), 3);
        } else if (fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.e) {
            ge1.b.T(cVar, null, null, new f0(cVar, ((com.garmin.android.apps.connectmobile.userprofile.editimage.f.e) fVar2).f46707b, null), 3);
        } else if (fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c) {
            cVar.f46671n = ((com.garmin.android.apps.connectmobile.userprofile.editimage.f.c) fVar2).f46705b;
            if (cVar.f46669l) {
                cVar.c();
            } else {
                cVar.f46670m = new k32.n(cVar, 20);
            }
        } else if (fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) {
            Uri uri = ((com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) fVar2).f46706b;
            if (cVar.f46669l) {
                cVar.b(uri);
            } else {
                cVar.f46670m = new l0.e(10, cVar, uri);
            }
        } else {
            if (!(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.b)) {
                lc.u0.r();
                return null;
            }
            ge1.b.T(cVar, null, null, new i0(cVar, null), 3);
        }
        return Unit.INSTANCE;
    }
}
