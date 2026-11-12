package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/g2;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g2 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127653c;

    public /* synthetic */ g2(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean zH = oe2.f.H(i14, 16);
        c22.l3.f23124b.getClass();
        String str = c22.l3.f23130h.format(dDoubleValue * 100.0d);
        str.getClass();
        l22.b bVar = this.f127653c;
        String string = bVar.getString(R.string.common_abbrev_centimeters_per_second);
        if (!u00.b.g(i14)) {
            oi0.b bVar2 = new oi0.b(bVar, string);
            String str2 = bVar2.f132238b;
            l22.b bVar3 = bVar2.f132237a;
            string = d53.u.v(str2, bVar3.getString(R.string.common_abbrev_centimeters_per_second), bVar3.getString(R.string.lbl_centimeters_per_second), false);
            bVar2.f132238b = string;
        }
        String strA = bVar.a(R.string.string_space_string_pattern, str, string);
        if (!zH) {
            return strA;
        }
        if (!oe2.f.H(i14, 2) && !u00.b.f(i14)) {
            return str;
        }
        oi0.b bVar4 = new oi0.b(bVar, strA);
        String str3 = bVar4.f132238b;
        l22.b bVar5 = bVar4.f132237a;
        String strV = d53.u.v(str3, bVar5.getString(R.string.common_abbrev_centimeters_per_second), bVar5.getString(R.string.lbl_centimeters_per_second), false);
        bVar4.f132238b = strV;
        return strV;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127653c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127653c.getString(R.string.lbl_step_speed_loss);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127653c = bVar;
    }
}
