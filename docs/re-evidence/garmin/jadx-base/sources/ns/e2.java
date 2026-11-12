package ns;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lns/e2;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "Lu00/c;", "validator", "<init>", "(Ll22/b;ZLu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class e2 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127640c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127641d;

    public /* synthetic */ e2(l22.b bVar, boolean z14, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() : z14, (i14 & 4) != 0 ? new ms.a0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String strI = i(((Number) obj).doubleValue(), this.f127641d ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR, !oe2.f.H(i14, 16));
        if (oe2.f.H(i14, 64)) {
            return this.f127640c.a(R.string.max_value, strI);
        }
        return u00.b.g(i14) ? strI : h(strI);
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127640c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127640c.getString(R.string.lbl_speed);
    }

    public String h(String str) {
        str.getClass();
        oi0.b bVar = new oi0.b(this.f127640c, str);
        if (this.f127641d) {
            bVar.t();
            return bVar.f132238b;
        }
        bVar.C();
        return bVar.f132238b;
    }

    public String i(double d14, c22.q3 q3Var, boolean z14) {
        q3Var.getClass();
        c22.l3.f23124b.getClass();
        String str = c22.l3.f23130h.format(c22.l3.a.w(d14, c22.q3.METERS_PER_SECOND, q3Var));
        if (!z14) {
            str.getClass();
            return str;
        }
        str.getClass();
        int i14 = q3Var.f23223e;
        l22.b bVar = this.f127640c;
        return bVar.a(R.string.string_space_string_pattern, str, bVar.getString(i14));
    }

    public String j(int i14, Double d14) {
        String string = this.f127640c.getString((this.f127641d ? c22.q3.KILOMETER_PER_HOUR : c22.q3.MILE_PER_HOUR).f23223e);
        return u00.b.g(i14) ? string : h(string);
    }

    public /* bridge */ /* synthetic */ String k(Object obj) {
        return j(1, (Double) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(l22.b bVar, boolean z14, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127640c = bVar;
        this.f127641d = z14;
    }
}
