package p90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.device.pairing.devices.PrimaryApp;
import d53.w;
import java.util.List;
import k90.y;
import p005kotlin.Metadata;
import p13.u;
import w5.r;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lp90/o;", "Lk90/y;", "Lbm2/c;", "Ll90/b;", "Lb90/a;", "getDeviceSetupConfigUseCase", "<init>", "(Lb90/a;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o implements y<bm2.c, l90.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b90.a f136552a;

    static {
        new a(null);
    }

    public o(b90.a aVar) {
        aVar.getClass();
        this.f136552a = aVar;
    }

    @Override // k90.y
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l90.b a(bm2.c cVar) {
        l90.b bVar;
        cVar.getClass();
        String str = cVar.f18897a;
        String productDisplayName = cVar.getProductDisplayName();
        String strF = r.f(cVar.f18899b);
        if (str == null || productDisplayName == null || strF == null) {
            bVar = null;
        } else {
            d90.d dVarA = this.f136552a.a(strF, productDisplayName, str);
            l90.j.a aVar = l90.j.f111568b;
            PrimaryApp primaryApp = cVar.f18931q1;
            aVar.getClass();
            l90.j jVarA = l90.j.a.a(primaryApp);
            boolean z14 = cVar.f18922m;
            boolean z15 = cVar.f18924n;
            String string = w.i0(w.O(w.O(productDisplayName, "Garmin "), "GARMIN ")).toString();
            String str2 = cVar.f18899b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String[] strArr = cVar.f18932r;
            strArr.getClass();
            List listI0 = u.i0(strArr);
            String str4 = cVar.f18929p1;
            String str5 = cVar.f18903d;
            o90.a aVar2 = new o90.a(cVar.f18909g, dVarA.f58435a, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (p005kotlin.jvm.internal.j) null);
            boolean z16 = cVar.f18928p;
            l90.i.f111561a.getClass();
            l90.i iVarA = l90.i.a.a(strF, jVarA);
            yl2.b bVar2 = (yl2.b) yl2.b.B6.get(strF);
            if (bVar2 == null) {
                bVar2 = yl2.b.f197686f;
            }
            bVar = new l90.b(str, z14, z15, listI0, str4, string, strF, str5, str3, (String) null, aVar2, z16, jVarA, iVarA, bVar2, dVarA, 512, (p005kotlin.jvm.internal.j) null);
        }
        if (bVar != null) {
            return bVar;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "PairingDeviceMapper", "Device required fields are missing, skipping: " + cVar);
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp90/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
