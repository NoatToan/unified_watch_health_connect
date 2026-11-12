package ns;

import com.garmin.android.apps.connectmobile.R;
import java.text.NumberFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/w2;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w2 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127791c;

    public /* synthetic */ w2(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.b0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        if (oe2.f.H(i14, 16)) {
            String str = NumberFormat.getIntegerInstance().format(dDoubleValue);
            str.getClass();
            return str;
        }
        String str2 = NumberFormat.getIntegerInstance().format(dDoubleValue);
        str2.getClass();
        Double dValueOf = Double.valueOf(dDoubleValue);
        int i15 = c22.m3.MILLIMETER.f23164e;
        l22.b bVar = this.f127791c;
        String string = bVar.getString(i15);
        if (!u00.b.g(i14)) {
            string = h(string, p005kotlin.jvm.internal.s.c(dValueOf, 1.0d));
        }
        String strA = bVar.a(R.string.string_space_string_pattern, str2, string);
        if (oe2.f.H(i14, 2)) {
            return h(strA, dDoubleValue == 1.0d);
        }
        return strA;
    }

    public final String h(String str, boolean z14) {
        str.getClass();
        oi0.b bVar = new oi0.b(this.f127791c, str);
        String str2 = bVar.f132238b;
        l22.b bVar2 = bVar.f132237a;
        if (z14) {
            String strV = d53.u.v(str2, bVar2.getString(R.string.lbl_mm), bVar2.getString(R.string.lbl_unit_millimeter), false);
            bVar.f132238b = strV;
            return strV;
        }
        String strV2 = d53.u.v(str2, bVar2.getString(R.string.lbl_mm), bVar2.getString(R.string.lbl_unit_millimeter_plural), false);
        bVar.f132238b = strV2;
        return strV2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127791c = bVar;
    }
}
