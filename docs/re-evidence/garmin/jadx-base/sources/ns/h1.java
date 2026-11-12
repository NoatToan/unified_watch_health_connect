package ns;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lns/h1;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "Lu00/c;", "validator", "<init>", "(Ll22/b;ZLu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class h1 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127658d;

    public /* synthetic */ h1(l22.b bVar, boolean z14, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() : z14, (i14 & 4) != 0 ? new ms.x() : cVar);
    }

    @Override // u00.b
    public /* bridge */ /* synthetic */ String a(int i14, Object obj) {
        return i(((Number) obj).doubleValue(), i14);
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127657c.getString(R.string.no_duration_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127657c.getString(R.string.lbl_pace);
    }

    public final String h(String str, boolean z14) {
        oi0.b bVar = new oi0.b(this.f127657c, str);
        boolean z15 = this.f127658d;
        if (z15 && z14) {
            bVar.r();
            return bVar.f132238b;
        }
        if (z15) {
            bVar.s();
            return bVar.f132238b;
        }
        if (z14) {
            bVar.A();
            return bVar.f132238b;
        }
        bVar.B();
        return bVar.f132238b;
    }

    public String i(double d14, int i14) {
        boolean zH = oe2.f.H(i14, 4);
        l22.b bVar = this.f127657c;
        boolean z14 = this.f127658d;
        if (zH) {
            c22.l3.f23124b.getClass();
            return bVar.a(R.string.string_space_string_pattern, c22.l3.a.r1(bVar, c22.l3.a.p(d14, z14)), j(4, Double.valueOf(d14)));
        }
        boolean z15 = !oe2.f.H(i14, 16);
        c22.l3.a aVar = c22.l3.f23124b;
        aVar.getClass();
        String strS0 = aVar.s0(this.f127657c, c22.l3.a.p(d14, z14), this.f127658d, z15, d(8));
        aVar.getClass();
        boolean z16 = c22.l3.a.p(d14, z14) == 1;
        if (oe2.f.H(i14, 2)) {
            return h(strS0, z16);
        }
        if (!oe2.f.H(i14, 4)) {
            return strS0;
        }
        oi0.b bVar2 = new oi0.b(bVar, h(strS0, z16));
        bVar2.P((2 & 1) == 0, false);
        return bVar2.f132238b;
    }

    public String j(int i14, Double d14) {
        c22.l3.a aVar = c22.l3.f23124b;
        aVar.getClass();
        boolean z14 = this.f127658d;
        int iN1 = c22.l3.a.N1(z14);
        l22.b bVar = this.f127657c;
        String string = bVar.getString(iN1);
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        aVar.getClass();
        boolean z15 = c22.l3.a.p(dDoubleValue, z14) == 1;
        if (oe2.f.H(i14, 2)) {
            return h(string, z15);
        }
        if (!oe2.f.H(i14, 4)) {
            return string;
        }
        oi0.b bVar2 = new oi0.b(bVar, h(string, z15));
        bVar2.P((2 & 1) == 0, false);
        return bVar2.f132238b;
    }

    public /* bridge */ /* synthetic */ String k(Object obj) {
        return j(1, (Double) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(l22.b bVar, boolean z14, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127657c = bVar;
        this.f127658d = z14;
    }
}
