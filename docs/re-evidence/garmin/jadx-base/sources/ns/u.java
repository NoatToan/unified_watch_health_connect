package ns;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lns/u;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lns/u$a;", "depthType", "", "isUsingMetric", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lns/u$a;ZLu00/c;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f127766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f127767e;

    public /* synthetic */ u(l22.b bVar, a aVar, boolean z14, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, aVar, (i14 & 4) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() : z14, (i14 & 8) != 0 ? new ms.r() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        Integer num;
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean z14 = !oe2.f.H(i14, 16);
        boolean z15 = this.f127767e;
        c22.m3 m3Var = z15 ? c22.m3.METER : c22.m3.FOOT;
        c22.l3.a aVar = c22.l3.f23124b;
        aVar.getClass();
        String strR = c22.l3.a.R(this.f127765c, dDoubleValue, m3Var, c22.l3.f23131i, z14, null);
        if (oe2.f.H(i14, 64) && (num = this.f127766d.f127772a) != null) {
            return this.f127765c.a(num.intValue(), strR);
        }
        if (u00.b.g(i14)) {
            return strR;
        }
        c22.m3 m3Var2 = z15 ? c22.m3.METER : c22.m3.FOOT;
        aVar.getClass();
        return h(strR, c22.l3.a.j(dDoubleValue, m3Var2) == 1.0d);
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127765c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127765c.getString(R.string.lbl_depth);
    }

    public final String h(String str, boolean z14) {
        oi0.b bVar = new oi0.b(this.f127765c, str);
        boolean z15 = this.f127767e;
        if (z15 && z14) {
            bVar.x();
            return bVar.f132238b;
        }
        if (z15) {
            bVar.y();
            return bVar.f132238b;
        }
        if (z14) {
            bVar.i();
            return bVar.f132238b;
        }
        bVar.g();
        return bVar.f132238b;
    }

    public final String i(Object obj) {
        Double d14 = (Double) obj;
        boolean z14 = this.f127767e;
        String string = this.f127765c.getString((z14 ? c22.m3.METER : c22.m3.FOOT).f23164e);
        if (u00.b.g(1)) {
            return string;
        }
        c22.l3.a aVar = c22.l3.f23124b;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        c22.m3 m3Var = z14 ? c22.m3.METER : c22.m3.FOOT;
        aVar.getClass();
        return h(string, c22.l3.a.j(dDoubleValue, m3Var) == 1.0d);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001d\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lns/u$a;", "", "", "paramStringId", "labelStringId", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;I)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        Avg(null, R.string.activity_details_average_depth_abbr, 1, null),
        Max(Integer.valueOf(R.string.lbl_num_max_depth), R.string.lbl_max_depth),
        Deepest(Integer.valueOf(R.string.lbl_num_deepest_dive), R.string.lbl_deepest_dive);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Integer f127772a;

        /* synthetic */ a(Integer num, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this((i15 & 1) != 0 ? null : num, i14);
        }

        a(Integer num, int i14) {
            this.f127772a = num;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l22.b bVar, a aVar, boolean z14, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f127765c = bVar;
        this.f127766d = aVar;
        this.f127767e = z14;
    }
}
