package ns;

import com.garmin.android.apps.connectmobile.R;
import java.text.NumberFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lns/p;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "singleDecimal", "Ljava/text/NumberFormat;", "numberFormatOverride", "Lu00/c;", "validator", "<init>", "(Ll22/b;ZZLjava/text/NumberFormat;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class p extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f127724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final NumberFormat f127725f;

    public /* synthetic */ p(l22.b bVar, boolean z14, boolean z15, NumberFormat numberFormat, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() : z14, (i14 & 4) != 0 ? false : z15, (i14 & 8) != 0 ? null : numberFormat, (i14 & 16) != 0 ? new ms.r() : cVar);
    }

    @Override // u00.b
    public /* bridge */ /* synthetic */ String a(int i14, Object obj) {
        return k(((Number) obj).doubleValue(), i14);
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127722c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127722c.getString(R.string.lbl_distance);
    }

    public String h(String str, boolean z14) {
        str.getClass();
        oi0.b bVar = new oi0.b(this.f127722c, str);
        boolean z15 = this.f127723d;
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

    public c22.m3 i() {
        return this.f127723d ? c22.m3.KILOMETER : c22.m3.MILE;
    }

    public String j(double d14, c22.m3 m3Var, boolean z14, boolean z15) {
        m3Var.getClass();
        c22.l3.a aVar = c22.l3.f23124b;
        NumberFormat numberFormat = this.f127725f;
        if (numberFormat == null) {
            if (z15) {
                numberFormat = c22.l3.f23125c;
            } else if (this.f127724e) {
                aVar.getClass();
                numberFormat = c22.l3.f23130h;
            } else {
                numberFormat = c22.l3.f23129g;
            }
        }
        NumberFormat numberFormat2 = numberFormat;
        aVar.getClass();
        return c22.l3.a.R(this.f127722c, d14, m3Var, numberFormat2, z14, null);
    }

    public String k(double d14, int i14) {
        String strJ = j(d14, i(), !oe2.f.H(i14, 16), oe2.f.H(i14, 256));
        return u00.b.g(i14) ? strJ : h(strJ, n(Double.valueOf(d14), i()));
    }

    public String l(int i14, Double d14) {
        String string = this.f127722c.getString(i().f23164e);
        return u00.b.g(1) ? string : h(string, n(d14, i()));
    }

    public /* bridge */ /* synthetic */ String m(Object obj) {
        return l(1, (Double) obj);
    }

    public boolean n(Double d14, c22.m3 m3Var) {
        m3Var.getClass();
        c22.l3.a aVar = c22.l3.f23124b;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        aVar.getClass();
        return c22.l3.a.g(dDoubleValue, c22.m3.METER, m3Var) == 1.0d;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(l22.b bVar, boolean z14, boolean z15, NumberFormat numberFormat, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127722c = bVar;
        this.f127723d = z14;
        this.f127724e = z15;
        this.f127725f = numberFormat;
    }
}
