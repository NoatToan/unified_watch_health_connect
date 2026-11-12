package ns;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/k1;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k1 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127683c;

    public /* synthetic */ k1(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a0() : cVar);
    }

    public static c22.q3 i() {
        return ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() ? c22.q3.METERS_PER_SECOND : c22.q3.FEET_PER_SECOND;
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean zH = oe2.f.H(i14, 16);
        c22.q3 q3VarI = i();
        q3VarI.getClass();
        c22.l3.f23124b.getClass();
        String strA = (q3VarI.f23219a ? c22.l3.f23129g : c22.l3.f23130h).format(c22.l3.a.w(dDoubleValue, c22.q3.METERS_PER_SECOND, q3VarI));
        if (zH) {
            strA.getClass();
        } else {
            strA.getClass();
            int i15 = q3VarI.f23223e;
            l22.b bVar = this.f127683c;
            strA = bVar.a(R.string.value_unit, strA, bVar.getString(i15));
        }
        return u00.b.g(i14) ? strA : h(Double.valueOf(dDoubleValue), strA);
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127683c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127683c.getString(R.string.lbl_speed);
    }

    public final String h(Double d14, String str) {
        oi0.b bVar = new oi0.b(this.f127683c, str);
        c22.l3.a aVar = c22.l3.f23124b;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        c22.q3 q3VarI = i();
        aVar.getClass();
        boolean z14 = c22.l3.a.i(dDoubleValue, q3VarI) == 1.0d;
        boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
        String str2 = bVar.f132238b;
        l22.b bVar2 = bVar.f132237a;
        if (zY) {
            if (z14) {
                String strV = d53.u.v(str2, bVar2.getString(R.string.lbl_m_per_second), bVar2.getString(R.string.lbl_meter_per_second), false);
                bVar.f132238b = strV;
                return strV;
            }
            String strV2 = d53.u.v(str2, bVar2.getString(R.string.lbl_m_per_second), bVar2.getString(R.string.common_mps_string), false);
            bVar.f132238b = strV2;
            return strV2;
        }
        if (z14) {
            String strV3 = d53.u.v(str2, bVar2.getString(R.string.lbl_ft_per_second), bVar2.getString(R.string.lbl_foot_per_second), false);
            bVar.f132238b = strV3;
            return strV3;
        }
        String strV4 = d53.u.v(str2, bVar2.getString(R.string.lbl_ft_per_second), bVar2.getString(R.string.feet_per_second), false);
        bVar.f132238b = strV4;
        return strV4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127683c = bVar;
    }
}
