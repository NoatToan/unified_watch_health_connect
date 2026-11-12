package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/p1;", "Lu00/b;", "Lps/h0;", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p1 extends u00.b<ps.h0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127727c;

    public /* synthetic */ p1(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.h() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String strD;
        ps.h0 h0Var = (ps.h0) obj;
        h0Var.getClass();
        ps.z1 z1Var = h0Var.f139839b;
        Double d14 = h0Var.f139838a;
        if (d14 == null || z1Var == null) {
            return d(i14);
        }
        boolean z14 = !oe2.f.H(i14, 16);
        qs.y yVar = qs.y.UNIT_PRESSURE_BAR;
        qs.y yVarH = z1Var.h();
        l22.b bVar = this.f127727c;
        if (yVar == yVarH) {
            c22.l3.a aVar = c22.l3.f23124b;
            int iDoubleValue = (int) d14.doubleValue();
            c22.o3 o3Var = c22.o3.BAR;
            aVar.getClass();
            strD = c22.l3.a.J0(bVar, iDoubleValue, o3Var, true, z14);
        } else if (qs.y.UNIT_PRESSURE_PSI == z1Var.h()) {
            c22.l3.a aVar2 = c22.l3.f23124b;
            int iDoubleValue2 = (int) d14.doubleValue();
            c22.o3 o3Var2 = c22.o3.PSI;
            aVar2.getClass();
            strD = c22.l3.a.J0(bVar, iDoubleValue2, o3Var2, false, z14);
        } else {
            strD = d(i14);
        }
        if (!oe2.f.H(i14, 4)) {
            return strD;
        }
        oi0.b bVar2 = new oi0.b(bVar, strD);
        bVar2.S();
        bVar2.M();
        return bVar2.f132238b;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127727c.getString(R.string.no_value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(l22.b bVar, u00.c<ps.h0> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127727c = bVar;
    }
}
