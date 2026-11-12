package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/b0;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b0 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127621c;

    public /* synthetic */ b0(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        int i15;
        double dDoubleValue = ((Number) obj).doubleValue();
        String str = c22.l3.f23138p.format(dDoubleValue);
        if (oe2.f.H(i14, 16)) {
            str.getClass();
            return str;
        }
        str.getClass();
        boolean zC = p005kotlin.jvm.internal.s.c(Double.valueOf(dDoubleValue), 1.0d);
        boolean zG = u00.b.g(i14);
        if (zG && zC) {
            i15 = R.string.activities_floor_per_minute;
        } else if (zG) {
            i15 = R.string.activities_floors_per_minute;
        } else {
            i15 = zC ? R.string.floor_per_minute : R.string.floors_per_minute;
        }
        return this.f127621c.a(R.string.string_space_string_pattern, str, this.f127621c.getString(i15));
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127621c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127621c.getString(R.string.lbl_speed);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127621c = bVar;
    }
}
