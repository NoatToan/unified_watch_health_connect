package sm2;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class b extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public im2.a f160285i;

    public class a implements lm2.i.b<String> {
        public a() {
        }

        @Override // lm2.i.b
        public final void a(String str) {
            b bVar = b.this;
            rm2.c cVar = bVar.f160342h;
            if (cVar != null) {
                cVar.v(qm2.k.CHECKING_FOR_FIRMWARE_UPDATE_SUCCESS);
            }
            bVar.d();
        }

        @Override // lm2.i.b
        public final void onFailure(Throwable th3) {
            b bVar = b.this;
            bVar.f160340f.warn("checkForFirmwareUpdate ignored failure", th3);
            rm2.c cVar = bVar.f160342h;
            if (cVar != null) {
                cVar.m(qm2.k.CHECKING_FOR_FIRMWARE_UPDATE_FAILURE, yl2.e.NO_INTERNET_CONNECTION, null);
            }
            bVar.d();
        }
    }

    public b(Context context, yl2.d dVar, rm2.c cVar) {
        super(context, dVar, cVar, "CheckFirmwareOperation");
    }

    @Override // om2.b
    public final void b() {
        im2.a aVar = this.f160285i;
        if (aVar != null) {
            aVar.cancel();
        }
    }

    @Override // sm2.r
    public final void h() {
        this.f160340f.debug(".checkForFirmwareUpdate()");
        lm2.i iVarF = lm2.h.f();
        this.f160285i = ((im2.c) iVarF).c(this.f160338d, new a());
    }
}
