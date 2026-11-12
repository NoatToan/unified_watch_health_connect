package ns;

import com.garmin.android.apps.connectmobile.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/o;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127711c;

    public /* synthetic */ o(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        c22.l3.f23124b.getClass();
        DecimalFormat decimalFormat = c22.l3.f23131i;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String str = decimalFormat.format(dDoubleValue);
        if (!oe2.f.H(i14, 16)) {
            return tn.k.g(str, h(i14, Double.valueOf(dDoubleValue)));
        }
        str.getClass();
        return str;
    }

    @Override // u00.b
    public final String d(int i14) {
        l22.b bVar = this.f127711c;
        String string = bVar.getString(R.string.no_value);
        if (u00.b.g(i14)) {
            return string;
        }
        oi0.b bVar2 = new oi0.b(bVar, string);
        bVar2.M();
        return bVar2.f132238b;
    }

    public final String h(int i14, Double d14) {
        return oe2.f.H(i14, 16) ? "" : this.f127711c.getString(R.string.lbl_degree_sign);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127711c = bVar;
    }
}
