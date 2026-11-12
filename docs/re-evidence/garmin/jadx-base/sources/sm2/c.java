package sm2;

import android.content.Context;
import com.garmin.device.pairing.PairingException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
public class c extends r {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final rm2.h f160287i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f160288j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a73.f f160289k;

    public class a implements lm2.i.b<bm2.e> {
        public a() {
        }

        @Override // lm2.i.b
        public final void a(bm2.e eVar) {
            bm2.e eVar2 = eVar;
            c cVar = c.this;
            rm2.c cVar2 = cVar.f160342h;
            if (cVar2 != null) {
                cVar2.v(qm2.k.CHECKING_DEVICE_REGISTRATION_STATUS_SUCCESS);
            }
            cVar.j(eVar2);
        }

        @Override // lm2.i.b
        public final void onFailure(Throwable th3) {
            boolean z14 = th3 instanceof JSONException;
            c cVar = c.this;
            if (z14) {
                rm2.c cVar2 = cVar.f160342h;
                if (cVar2 != null) {
                    cVar2.m(qm2.k.CHECKING_DEVICE_REGISTRATION_STATUS_FAILURE, yl2.e.JSON_PARSING_EXCEPTION, null);
                }
                cVar.e(new PairingException(cVar, yl2.e.JSON_PARSING_EXCEPTION));
                return;
            }
            rm2.c cVar3 = cVar.f160342h;
            if (cVar3 != null) {
                cVar3.m(qm2.k.CHECKING_DEVICE_REGISTRATION_STATUS_FAILURE, yl2.e.NO_INTERNET_CONNECTION, null);
            }
            cVar.e(new PairingException(cVar, yl2.e.NO_INTERNET_CONNECTION));
        }
    }

    public c(Context context, yl2.d dVar, rm2.c cVar, rm2.h hVar) {
        super(context, dVar, cVar, "CheckRegistrationOperation");
        this.f160289k = null;
        this.f160287i = hVar;
    }

    @Override // om2.b
    public final void b() {
        a73.f fVar = this.f160289k;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // sm2.r
    public final void h() {
        yl2.d dVar = this.f160338d;
        if (dVar.f197847i != null) {
            d();
            return;
        }
        this.f160340f.debug(".checkDeviceRegistration()");
        lm2.i iVarF = lm2.h.f();
        a aVar = new a();
        im2.c cVar = (im2.c) iVarF;
        bm2.e eVar = new bm2.e(0L, null, 0L, false, false, false, 63, null);
        AtomicInteger atomicInteger = new AtomicInteger(2);
        r0 r0Var = new r0();
        ArrayList arrayList = new ArrayList();
        this.f160289k = new a73.f(arrayList, 21, ge1.b.T(cVar.getF17560h(), null, null, new im2.e(cVar, dVar, arrayList, r0Var, atomicInteger, eVar, aVar, null), 3), r0Var);
    }

    public void j(bm2.e eVar) {
        this.f160340f.debug(".evaluateDeviceRegistrationStatus()");
        if (eVar == null) {
            d();
            return;
        }
        yl2.d dVar = this.f160338d;
        dVar.g(false);
        boolean z14 = eVar.f18960d;
        long j8 = eVar.f18959c;
        boolean z15 = (j8 == 0 || j8 == eVar.f18957a) ? false : true;
        boolean z16 = j8 != 0 && j8 == eVar.f18957a;
        this.f160288j = eVar.f18961e;
        int i14 = dVar.f197839a.f145763e;
        if (i14 == 3) {
            dVar.g(false);
            d();
            return;
        }
        if (!z14 || z16) {
            dVar.g(true);
            if (this.f160288j && dVar.f197839a.f145764f) {
                dVar.f197846h = true;
            }
            d();
            return;
        }
        if (z15 && i14 == 1) {
            String str = eVar.f18958b;
            if (str == null) {
                str = "";
            }
            this.f160287i.c0(str, this);
            return;
        }
        if (i14 == 2) {
            dVar.g(true);
            d();
        }
    }
}
