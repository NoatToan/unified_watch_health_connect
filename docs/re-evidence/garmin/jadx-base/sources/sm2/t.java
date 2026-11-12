package sm2;

import android.content.Context;
import bd0.e0;
import com.garmin.device.pairing.PairingException;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public class t extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final lm2.f f160344i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public vm2.b f160345j;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160346a;

        static {
            int[] iArr = new int[yl2.e.values().length];
            f160346a = iArr;
            try {
                iArr[yl2.e.INVALID_UNIT_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f160346a[yl2.e.HTTP_CONFLICT_409.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public t(Context context, yl2.d dVar, rm2.c cVar, lm2.f fVar) {
        super(context, dVar, cVar, "RegisterOperation");
        this.f160344i = fVar;
    }

    @Override // om2.b
    public final void b() {
        vm2.b bVar = this.f160345j;
        if (bVar != null) {
            bVar.cancel();
        }
    }

    @Override // sm2.r
    public final void h() {
        yl2.d dVar = this.f160338d;
        byte[] bArr = dVar.f197848j;
        if (dVar.f197847i == null) {
            if (dVar.f197839a.f145763e == 2) {
                dVar.g(true);
            } else {
                dVar.g(false);
            }
        }
        this.f160340f.debug(".registerDevice()");
        if (bArr == null) {
            j(yl2.e.NULL_OR_EMPTY_DEVICE_XML_BYTES, null);
        } else {
            if (dVar.f197842d == null) {
                j(yl2.e.DEVICE_INFO_OBJ_NULL, null);
                return;
            }
            this.f160345j = ((e0) lm2.h.f()).k(dVar, new s(this));
        }
    }

    public final void j(yl2.e eVar, String str) {
        Logger logger = this.f160340f;
        logger.debug(".handleDeviceRegistrationFailure: failureType = " + eVar);
        rm2.c cVar = this.f160342h;
        if (cVar != null) {
            cVar.m(qm2.k.REGISTERING_DEVICE_FAILURE, eVar, null);
        }
        int i14 = a.f160346a[eVar.ordinal()];
        if (i14 == 1) {
            logger.debug(".handleDeviceRegistrationFailure(): invalid unit ID");
            if (this.f160338d.f197842d != null) {
                this.f160341g.submit(new po.g(this, 21));
            }
            e(new PairingException(this, yl2.e.INVALID_UNIT_ID));
            return;
        }
        if (i14 == 2) {
            logger.debug(".handleDeviceRegistrationFailure(): 409 conflict");
            e(new PairingException(this, yl2.e.HTTP_CONFLICT_409, str));
        } else {
            logger.debug(".handleDeviceRegistrationFailure(): " + eVar);
            e(new PairingException(this, yl2.e.NETWORK, "Failed to register device."));
        }
    }
}
