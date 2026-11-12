package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\rB1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lns/x;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lns/x$a;", "elevationChange", "", "isUsingMetric", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lns/x$a;ZLu00/c;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class x extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f127793d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f127794e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lns/x$a;", "", "", "paramStringId", "labelStringId", "<init>", "(Ljava/lang/String;III)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        Ascent(R.string.num_ascent, R.string.activities_ascent_label),
        Descent(R.string.num_descent, R.string.activities_descent_label);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f127798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f127799b;

        a(int i14, int i15) {
            this.f127798a = i14;
            this.f127799b = i15;
        }
    }

    public /* synthetic */ x(l22.b bVar, a aVar, boolean z14, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, aVar, (i14 & 4) != 0 ? am.r1.r() : z14, (i14 & 8) != 0 ? new ms.r() : cVar);
    }

    @Override // u00.b
    public /* bridge */ /* synthetic */ String a(int i14, Object obj) {
        return h(((Number) obj).doubleValue(), i14);
    }

    @Override // u00.b
    public String d(int i14) {
        return this.f127792c.getString(R.string.no_value);
    }

    @Override // u00.b
    public /* bridge */ /* synthetic */ String e(Double d14) {
        return i();
    }

    public String h(double d14, int i14) {
        c22.l3.f23124b.getClass();
        String strX = c22.l3.a.X(d14, this.f127794e);
        Object[] objArr = {strX, j(i14, Double.valueOf(d14))};
        l22.b bVar = this.f127792c;
        String strA = bVar.a(R.string.string_space_string_pattern, objArr);
        if (oe2.f.H(i14, 16)) {
            return strX;
        }
        return oe2.f.H(i14, 64) ? bVar.a(this.f127793d.f127798a, strA) : strA;
    }

    public String i() {
        return this.f127792c.getString(R.string.activity_details_elevation);
    }

    public final String j(int i14, Double d14) {
        boolean zC;
        boolean z14 = this.f127794e;
        int i15 = (z14 ? c22.m3.METER : c22.m3.FOOT).f23164e;
        l22.b bVar = this.f127792c;
        String string = bVar.getString(i15);
        if (u00.b.g(i14)) {
            return string;
        }
        if (z14) {
            zC = p005kotlin.jvm.internal.s.c(d14, 1.0d);
        } else {
            c22.l3.a aVar = c22.l3.f23124b;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            aVar.getClass();
            zC = dDoubleValue * 3.2808399d == 1.0d;
        }
        oi0.b bVar2 = new oi0.b(bVar, string);
        if (z14 && zC) {
            bVar2.x();
            return bVar2.f132238b;
        }
        if (z14) {
            bVar2.y();
            return bVar2.f132238b;
        }
        if (zC) {
            bVar2.i();
            return bVar2.f132238b;
        }
        bVar2.g();
        return bVar2.f132238b;
    }

    public final /* bridge */ /* synthetic */ String k(Object obj) {
        return j(1, (Double) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(l22.b bVar, a aVar, boolean z14, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f127792c = bVar;
        this.f127793d = aVar;
        this.f127794e = z14;
    }
}
