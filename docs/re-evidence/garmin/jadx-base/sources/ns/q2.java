package ns;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/q2;", "Lu00/b;", "Lls/g;", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class q2 extends u00.b<ls.g> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(l22.b bVar, u00.c<ls.g> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127742c = bVar;
        this.f127743d = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        ls.g gVar = (ls.g) obj;
        gVar.getClass();
        boolean z14 = !oe2.f.H(i14, 16);
        boolean isUsingMetric = gVar.getIsUsingMetric();
        double data = gVar.getData();
        c22.m3 m3Var = isUsingMetric ? c22.m3.METER : c22.m3.YARD;
        m3Var.getClass();
        c22.l3.f23124b.getClass();
        String strR = c22.l3.a.R(this.f127742c, data, m3Var, c22.l3.f23131i, z14, null);
        return u00.b.g(i14) ? strR : h(strR, isUsingMetric, j(gVar));
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127742c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(ls.g gVar) {
        return this.f127742c.getString(R.string.lbl_distance);
    }

    public final String h(String str, boolean z14, boolean z15) {
        oi0.b bVar = new oi0.b(this.f127742c, str);
        if (z14 && z15) {
            bVar.x();
            return bVar.f132238b;
        }
        if (z14) {
            bVar.y();
            return bVar.f132238b;
        }
        if (z15) {
            bVar.a0();
            return bVar.f132238b;
        }
        bVar.b0();
        return bVar.f132238b;
    }

    public final String i(Object obj) {
        ls.g gVar = (ls.g) obj;
        boolean isUsingMetric = gVar != null ? gVar.getIsUsingMetric() : this.f127743d;
        String string = this.f127742c.getString((isUsingMetric ? c22.m3.METER : c22.m3.YARD).f23164e);
        return u00.b.g(1) ? string : h(string, isUsingMetric, j(gVar));
    }

    public final boolean j(ls.g gVar) {
        c22.l3.a aVar = c22.l3.f23124b;
        double data = gVar != null ? gVar.getData() : 0.0d;
        c22.m3 m3Var = gVar != null ? gVar.getIsUsingMetric() : this.f127743d ? c22.m3.METER : c22.m3.YARD;
        aVar.getClass();
        return c22.l3.a.j(data, m3Var) == 1.0d;
    }

    public /* synthetic */ q2(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.g0() : cVar);
    }
}
