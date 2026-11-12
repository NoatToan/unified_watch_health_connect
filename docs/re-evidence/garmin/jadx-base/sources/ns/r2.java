package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/r2;", "Lu00/b;", "Lls/g;", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r2 extends u00.b<ls.g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127748c;

    public /* synthetic */ r2(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.h0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        ls.g gVar = (ls.g) obj;
        gVar.getClass();
        boolean zH = oe2.f.H(i14, 16);
        double data = gVar.getData();
        c22.q3 q3Var = gVar.getIsUsingMetric() ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR;
        q3Var.getClass();
        c22.l3.f23124b.getClass();
        String strA = c22.l3.f23130h.format(c22.l3.a.w(data, c22.q3.METERS_PER_SECOND, q3Var));
        l22.b bVar = this.f127748c;
        if (zH) {
            strA.getClass();
        } else {
            strA.getClass();
            strA = bVar.a(R.string.string_space_string_pattern, strA, bVar.getString(q3Var.f23223e));
        }
        if (u00.b.g(i14)) {
            return strA;
        }
        boolean isUsingMetric = gVar.getIsUsingMetric();
        oi0.b bVar2 = new oi0.b(bVar, strA);
        if (isUsingMetric) {
            bVar2.t();
            return bVar2.f132238b;
        }
        bVar2.C();
        return bVar2.f132238b;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127748c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(ls.g gVar) {
        return this.f127748c.getString(R.string.lbl_speed);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(l22.b bVar, u00.c<ls.g> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127748c = bVar;
    }
}
