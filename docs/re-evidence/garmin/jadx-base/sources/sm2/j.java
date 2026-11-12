package sm2;

import android.content.Context;
import com.garmin.device.pairing.PairingException;
import com.google.maps.android.BuildConfig;

/* JADX INFO: loaded from: classes11.dex */
public class j extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lm2.i f160312i;

    public class a implements lm2.i.b<bm2.f> {
        public a() {
        }

        @Override // lm2.i.b
        public final void a(bm2.f fVar) {
            bm2.f fVar2 = fVar;
            j jVar = j.this;
            jVar.f160340f.debug("getDeviceInfoByProductNumber retrieved result: ".concat(fVar2 != null ? "non-null" : BuildConfig.TRAVIS));
            if (fVar2 != null) {
                jVar.f160338d.f197840b = fVar2;
            }
            jVar.d();
        }

        @Override // lm2.i.b
        public final void onFailure(Throwable th3) {
            yl2.e eVar = yl2.e.NETWORK;
            String message = th3.getMessage();
            j jVar = j.this;
            jVar.e(new PairingException(jVar, eVar, message));
        }
    }

    public j(Context context, yl2.d dVar, rm2.c cVar, lm2.i iVar) {
        super(context, dVar, cVar, "DeviceDtoOperation");
        this.f160312i = iVar;
    }

    @Override // sm2.r
    public final void h() {
        bm2.f fVar;
        yl2.d dVar = this.f160338d;
        dVar.getF197655a();
        if (dVar.f() != null && ((fVar = dVar.f197840b) == null || fVar.getPartNumberPartial() == null)) {
            ((im2.c) this.f160312i).e(dVar.f(), null, new a());
        } else {
            this.f160340f.debug("getDeviceInfoByProductNumber skipped");
            d();
        }
    }
}
