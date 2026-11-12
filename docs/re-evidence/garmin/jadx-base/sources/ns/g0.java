package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/g0;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g0 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127647c;

    public /* synthetic */ g0(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean zH = oe2.f.H(i14, 16);
        String strI = i(Double.valueOf(dDoubleValue));
        c22.l3.a aVar = c22.l3.f23124b;
        String strD = d(8);
        aVar.getClass();
        l22.b bVar = this.f127647c;
        String strG0 = c22.l3.a.g0(bVar, dDoubleValue, false, strD);
        if (!zH) {
            strG0 = bVar.a(R.string.string_space_string_pattern, strG0, strI);
        }
        if (u00.b.g(i14)) {
            return strG0;
        }
        return h(strG0, dDoubleValue == 1.0d);
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127647c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127647c.getString(R.string.lbl_force);
    }

    public final String h(String str, boolean z14) {
        oi0.b bVar = new oi0.b(this.f127647c, str);
        String str2 = bVar.f132238b;
        l22.b bVar2 = bVar.f132237a;
        if (z14) {
            String strV = d53.u.v(str2, bVar2.getString(R.string.lbl_newton_abbreviation), bVar2.getString(R.string.lbl_newton), false);
            bVar.f132238b = strV;
            return strV;
        }
        String strV2 = d53.u.v(str2, bVar2.getString(R.string.lbl_newton_abbreviation), bVar2.getString(R.string.lbl_newtons), false);
        bVar.f132238b = strV2;
        return strV2;
    }

    public final String i(Object obj) {
        Double d14 = (Double) obj;
        String string = this.f127647c.getString(R.string.lbl_newton_abbreviation);
        return u00.b.g(1) ? string : h(string, p005kotlin.jvm.internal.s.c(d14, 1.0d));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127647c = bVar;
    }
}
