package sr;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.crashlytics.internal.common.IdManager;
import d53.w;
import java.text.DecimalFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsr/i;", "", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f160572a;

    public i(l22.b bVar) {
        bVar.getClass();
        this.f160572a = bVar;
    }

    public final String a(Double d14, boolean z14) {
        return z14 ? this.f160572a.getString(R.string.strength_training_body) : d(ls.e.TOTAL_VOLUME, d14);
    }

    public final String b(Long l14) {
        l22.b bVar = this.f160572a;
        if (l14 != null) {
            if (l14.longValue() > 0) {
                DecimalFormat decimalFormat = new DecimalFormat(IdManager.DEFAULT_VERSION_NAME);
                if (am.j.z(f12.l.f68084a)) {
                    l3.a aVar = l3.f23124b;
                    double dLongValue = l14.longValue();
                    aVar.getClass();
                    String str = decimalFormat.format(l3.a.V1(l3.a.P1(dLongValue)));
                    str.getClass();
                    return str;
                }
                l3.a aVar2 = l3.f23124b;
                double dLongValue2 = l14.longValue();
                aVar2.getClass();
                String str2 = decimalFormat.format(l3.a.V1(dLongValue2 / 453.592d));
                str2.getClass();
                return str2;
            }
            if (l14.longValue() == -1) {
                return bVar.getString(R.string.strength_training_body);
            }
        }
        return bVar.getString(R.string.no_value);
    }

    public final String c(String str) {
        return (str == null || !(w.J(str) ^ true)) ? this.f160572a.getString(R.string.unknown) : str;
    }

    public final String d(ls.e eVar, Object obj) {
        eVar.getClass();
        String strB = ss.k.b(eVar, this.f160572a, obj, 24);
        return strB == null ? "" : strB;
    }

    public final String e() {
        String strH = ss.k.h(ls.e.TOTAL_VOLUME, this.f160572a, Double.valueOf(0.0d));
        return strH == null ? "" : strH;
    }
}
