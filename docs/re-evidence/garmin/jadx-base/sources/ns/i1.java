package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lns/i1;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "", "numberOfDecimals", "Lu00/c;", "validator", "<init>", "(Ll22/b;ILu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i1 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f127664d;

    public /* synthetic */ i1(l22.b bVar, int i14, u00.c cVar, int i15, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i15 & 2) != 0 ? 1 : i14, (i15 & 4) != 0 ? new ms.y() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean zH = oe2.f.H(i14, 16);
        int i15 = this.f127664d;
        if (!zH) {
            c22.l3.a aVar = c22.l3.f23124b;
            String strD = d(8);
            aVar.getClass();
            String strB0 = c22.l3.a.B0(this.f127663c, dDoubleValue, i15, strD);
            return strB0 == null ? d(8) : strB0;
        }
        c22.l3.f23124b.getClass();
        if (i15 == 1) {
            String str = c22.l3.f23130h.format(dDoubleValue);
            str.getClass();
            return str;
        }
        if (i15 == 2) {
            String str2 = c22.l3.f23129g.format(dDoubleValue);
            str2.getClass();
            return str2;
        }
        if (i15 != 3) {
            return String.valueOf(dDoubleValue);
        }
        String str3 = c22.l3.f23127e.format(dDoubleValue);
        str3.getClass();
        return str3;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127663c.getString(R.string.no_value);
    }

    public final String h(Object obj) {
        return this.f127663c.getString(R.string.percent_sign);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(l22.b bVar, int i14, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127663c = bVar;
        this.f127664d = i14;
    }
}
