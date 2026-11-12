package ns;

import com.garmin.android.apps.connectmobile.R;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/y0;", "Lu00/b;", "Lps/h0;", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y0 extends u00.b<ps.h0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127804c;

    public /* synthetic */ y0(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.d0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        ps.z1 z1Var;
        String string;
        double d14;
        ps.h0 h0Var = (ps.h0) obj;
        h0Var.getClass();
        Double d15 = h0Var.f139838a;
        if (d15 == null || (z1Var = h0Var.f139839b) == null) {
            return d(i14);
        }
        boolean z14 = qs.y.UNIT_VOLUME_LITER == z1Var.h();
        boolean zH = oe2.f.H(i14, 16);
        c22.r3 r3Var = z14 ? c22.r3.LITER : c22.r3.CUBIC_FOOT;
        c22.l3.a aVar = c22.l3.f23124b;
        double dDoubleValue = d15.doubleValue();
        aVar.getClass();
        l22.b bVar = this.f127804c;
        bVar.getClass();
        r3Var.getClass();
        if (Double.isNaN(dDoubleValue) || dDoubleValue == 0.0d) {
            string = null;
        } else {
            c22.r3 r3Var2 = c22.r3.LITER;
            double d16 = 1.0d;
            if (r3Var2 != r3Var || z14) {
                c22.r3 r3Var3 = c22.r3.CUBIC_FOOT;
                if (r3Var3 == r3Var && z14) {
                    c22.r3.f23238d.getClass();
                    r3Var3.getClass();
                    r3Var2.getClass();
                    if (r3Var3.f23242a != r3Var2.f23242a) {
                        d14 = r3Var3.f23243b;
                        d16 = 1.0d * d14;
                    }
                    dDoubleValue *= d16;
                }
            } else {
                c22.r3.a aVar2 = c22.r3.f23238d;
                c22.r3 r3Var4 = c22.r3.CUBIC_FOOT;
                aVar2.getClass();
                r3Var2.getClass();
                r3Var4.getClass();
                if (r3Var2.f23242a != r3Var4.f23242a) {
                    d14 = r3Var2.f23243b;
                    d16 = 1.0d * d14;
                }
                dDoubleValue *= d16;
            }
            StringBuilder sb3 = new StringBuilder(c22.l3.f23125c.format(dDoubleValue));
            if (!zH) {
                if (!z14) {
                    r3Var2 = c22.r3.CUBIC_FOOT;
                }
                sb3.append(StringUtils.SPACE);
                sb3.append(bVar.getString(r3Var2.f23244c));
            }
            string = sb3.toString();
        }
        if (string == null) {
            return d(8);
        }
        if (!oe2.f.H(i14, 4)) {
            return string;
        }
        oi0.b bVar2 = new oi0.b(bVar, string);
        String str = bVar2.f132238b;
        l22.b bVar3 = bVar2.f132237a;
        boolean z15 = d53.w.z(str, bVar3.getString(R.string.common_abbrev_liter_string), false);
        String str2 = bVar2.f132238b;
        if (z15) {
            bVar2.f132238b = d53.u.v(str2, bVar3.getString(R.string.common_abbrev_liter_string), bVar3.getString(R.string.lbl_unit_litre), false);
        } else if (d53.w.z(str2, bVar3.getString(R.string.common_abbrev_liter_string), false)) {
            bVar2.f132238b = d53.u.v(bVar2.f132238b, bVar3.getString(R.string.common_abbrev_cubic_feet_string), bVar3.getString(R.string.lbl_cubic_foot), false);
        }
        return bVar2.f132238b;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127804c.getString(R.string.no_value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(l22.b bVar, u00.c<ps.h0> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127804c = bVar;
    }
}
