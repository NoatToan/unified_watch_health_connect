package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lns/g1;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class g1 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c22.q3 f127649d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lns/g1$a;", "", "", "paramStringId", "labelStringId", "<init>", "(Ljava/lang/String;III)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        Max(R.string.max_value, R.string.activity_details_max_speed);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f127652a;

        a(int i14, int i15) {
            this.f127652a = i14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127648c = bVar;
        this.f127649d = c22.q3.NAUTICAL_MILES_PER_HOUR;
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean zH = oe2.f.H(i14, 16);
        c22.l3.f23124b.getClass();
        c22.q3 q3Var = this.f127649d;
        String strA = c22.l3.f23130h.format(c22.l3.a.i(dDoubleValue, q3Var));
        l22.b bVar = this.f127648c;
        if (zH) {
            strA.getClass();
        } else {
            strA.getClass();
            strA = bVar.a(R.string.string_space_string_pattern, strA, bVar.getString(q3Var.f23223e));
        }
        if (oe2.f.H(i14, 64)) {
            return bVar.a(a.Max.f127652a, strA);
        }
        if (u00.b.g(i14)) {
            return strA;
        }
        oi0.b bVar2 = new oi0.b(bVar, strA);
        bVar2.u();
        return bVar2.f132238b;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127648c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127648c.getString(R.string.lbl_speed);
    }

    public /* synthetic */ g1(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a0() : cVar);
    }
}
