package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/e0;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e0 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127638c;

    public /* synthetic */ e0(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.r() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        c22.l3.a aVar = c22.l3.f23124b;
        boolean z14 = !oe2.f.H(i14, 16);
        aVar.getClass();
        l22.b bVar = this.f127638c;
        String strF0 = c22.l3.a.f0(bVar, dDoubleValue, z14);
        if (u00.b.g(i14)) {
            return strF0;
        }
        if (dDoubleValue != 1.0d) {
            oi0.b bVar2 = new oi0.b(bVar, strF0);
            bVar2.D();
            return bVar2.f132238b;
        }
        oi0.b bVar3 = new oi0.b(bVar, strF0);
        String str = bVar3.f132238b;
        l22.b bVar4 = bVar3.f132237a;
        String strV = d53.u.v(str, bVar4.getString(R.string.lbl_unit_milliliter_abr), bVar4.getString(R.string.common_milliliter), false);
        bVar3.f132238b = strV;
        return strV;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127638c.getString(R.string.no_value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127638c = bVar;
    }
}
