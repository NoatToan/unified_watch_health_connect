package sm2;

import android.content.Context;
import android.util.Base64;
import com.garmin.device.pairing.PairingException;
import org.json.JSONObject;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class z extends r {

    public class a implements lm2.i.b<JSONObject> {
        public a() {
        }

        @Override // lm2.i.b
        public final void a(JSONObject jSONObject) {
            z zVar = z.this;
            zVar.f160340f.debug(".updateBtConnectionInfoOperation - Success");
            zVar.d();
        }

        @Override // lm2.i.b
        public final void onFailure(Throwable th3) {
            z zVar = z.this;
            zVar.f160340f.error(".updateBtConnectionInfoOperation()", th3);
            zVar.d();
        }
    }

    public z(Context context, yl2.d dVar, rm2.c cVar) {
        super(context, dVar, cVar, "UpdateBtConnectionInfoOperation");
    }

    @Override // sm2.r
    public final void h() throws PairingException {
        yl2.d dVar = this.f160338d;
        bm2.d dVar2 = dVar.f197842d;
        Logger logger = this.f160340f;
        if (dVar2 == null) {
            logger.error(".updateBtConnectionInfo() -- deviceInfo is null");
            throw new PairingException(this, yl2.e.DEVICE_INFO_OBJ_NULL, "DeviceInfoDTO is null");
        }
        logger.debug(".updateBtConnectionInfo()");
        byte[] capabilityFlags = dVar2.b() != null ? dVar2.b().getCapabilityFlags() : null;
        if (capabilityFlags == null) {
            d();
            return;
        }
        byte[] bArr = dVar.f197843e;
        byte[] bArr2 = dVar.f197844f;
        byte[] bArr3 = dVar.f197845g;
        if (bArr == null || bArr2 == null || bArr3 == null) {
            bArr3 = null;
            bArr = null;
            bArr2 = null;
        }
        lm2.i iVarF = lm2.h.f();
        ((im2.c) iVarF).m(this.f160338d, new String(Base64.encode(capabilityFlags, 0)), dVar2.getConnectionType() == 1, bArr != null ? new String(Base64.encode(bArr, 0)) : null, bArr2 != null ? new String(Base64.encode(bArr2, 0)) : null, bArr3 != null ? new String(Base64.encode(bArr3, 0)) : null, new a());
    }
}
