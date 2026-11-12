package k90;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lk90/x;", "Lk90/w;", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "<init>", "(Ljava/lang/String;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103617a;

    static {
        new a(null);
    }

    public x(String str) {
        str.getClass();
        this.f103617a = str;
    }

    @Override // k90.w
    public final Boolean a(z80.e eVar) {
        Boolean bool = eVar.f203020f;
        Integer num = eVar.D;
        String str = eVar.J;
        Boolean bool2 = Boolean.FALSE;
        if (p005kotlin.jvm.internal.s.g(bool, bool2) && p005kotlin.jvm.internal.s.g(eVar.f203019e, bool2)) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strM = am.j.m("Incompatible device ", str, " doesn't have Bluetooth support.");
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DeviceCompatibilityFilter", strM);
            return bool2;
        }
        String str2 = eVar.A;
        String str3 = eVar.f203028n;
        String str4 = this.f103617a;
        if (str3 != null && !d53.w.J(str3) && d53.w.z(str3, str4, false)) {
            a2 a2Var2 = a2.DEVICE_SETUP;
            StringBuilder sbI = p6.b.i("Incompatible device ", str, " is excluded in country: ", str4, " excludeCountries: ");
            sbI.append(str3);
            String string = sbI.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "DeviceCompatibilityFilter", string);
            return bool2;
        }
        if (str2 != null && !d53.w.J(str2) && !d53.w.z(str2, str4, false)) {
            a2 a2Var3 = a2.DEVICE_SETUP;
            StringBuilder sbI2 = p6.b.i("Incompatible device ", str, " is not included in country: ", str4, " includeCountries: ");
            sbI2.append(str2);
            String string2 = sbI2.toString();
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "DeviceCompatibilityFilter", string2);
            return bool2;
        }
        List<String> list = eVar.B;
        if (list != null && list.contains("GCM")) {
            a2 a2Var4 = a2.DEVICE_SETUP;
            String strM2 = am.j.m("Incompatible device ", str, " is incompatible with GCM application.");
            i2.f36769a.getClass();
            i2.a.b(a2Var4, "DeviceCompatibilityFilter", strM2);
            return bool2;
        }
        if (num != null && num.intValue() == 99999) {
            a2 a2Var5 = a2.DEVICE_SETUP;
            String strM3 = am.j.m("Incompatible device ", str, " has no GCM support.");
            i2.f36769a.getClass();
            i2.a.b(a2Var5, "DeviceCompatibilityFilter", strM3);
            return bool2;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        ((l80.a) KoinJavaComponent.get$default(l80.a.class, null, null, 6, null)).getClass();
        if (iIntValue <= 11657) {
            return Boolean.TRUE;
        }
        i2.f36769a.getClass();
        i2.a.b(a2.DEVICE_SETUP, "DeviceCompatibilityFilter", "Incompatible device " + str + " requires a newer GCM version " + num + ".");
        return bool2;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lk90/x$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "APPLICATION_GCM", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
