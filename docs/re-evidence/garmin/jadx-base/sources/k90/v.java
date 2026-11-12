package k90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk90/v;", "Lk90/y;", "Lz80/e;", "Ll90/b;", "Lb90/a;", "getDeviceSetupConfigUseCase", "<init>", "(Lb90/a;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v implements y<z80.e, l90.b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b90.a f103616a;

    static {
        new a(null);
    }

    public v(b90.a aVar) {
        aVar.getClass();
        this.f103616a = aVar;
    }

    @Override // k90.y
    public final l90.b a(z80.e eVar) {
        l90.b bVar;
        Object next;
        eVar.getClass();
        String str = eVar.f203016b;
        String str2 = eVar.J;
        String str3 = eVar.G;
        String strF = w5.r.f(str3);
        if (str == null || str2 == null || strF == null) {
            bVar = null;
        } else {
            d90.d dVarA = this.f103616a.a(strF, str2, str);
            l90.j.a aVar = l90.j.f111568b;
            String str4 = eVar.I;
            aVar.getClass();
            Iterator<T> it = l90.j.f111574h.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!d53.u.q(((l90.j) next).f111575a, str4, true));
            l90.j jVar = (l90.j) next;
            Boolean bool = eVar.f203019e;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = eVar.f203020f;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            String string = d53.w.i0(d53.w.O(d53.w.O(str2, "Garmin "), "GARMIN ")).toString();
            if (str3 == null) {
                str3 = "";
            }
            String str5 = str3;
            List<String> list = eVar.f203021g;
            boolean z14 = zBooleanValue;
            String str6 = eVar.f203024j;
            boolean z15 = zBooleanValue2;
            String str7 = eVar.K;
            o90.a aVar2 = new o90.a(eVar.f203040z, dVarA.f58435a, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 252, (p005kotlin.jvm.internal.j) null);
            Boolean bool3 = eVar.H;
            boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
            l90.i.f111561a.getClass();
            l90.i iVarA = l90.i.a.a(strF, jVar);
            yl2.b bVar2 = (yl2.b) yl2.b.B6.get(strF);
            if (bVar2 == null) {
                bVar2 = yl2.b.f197686f;
            }
            bVar = new l90.b(str, z14, z15, list, str6, string, strF, str7, str5, (String) null, aVar2, zBooleanValue3, jVar, iVarA, bVar2, dVarA, 512, (p005kotlin.jvm.internal.j) null);
        }
        if (bVar != null) {
            return bVar;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "CompatibleDeviceMapper", "Device required fields are missing, skipping: " + eVar);
        return null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lk90/v$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
