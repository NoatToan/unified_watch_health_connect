package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/h;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127655c;

    public /* synthetic */ h(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.r() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean z14 = !oe2.f.H(i14, 16);
        c22.l3.a aVar = c22.l3.f23124b;
        l22.b bVar = this.f127655c;
        String strH = c22.l3.a.H(aVar, bVar, dDoubleValue, z14);
        if (u00.b.f(i14)) {
            oi0.b bVar2 = new oi0.b(bVar, strH);
            bVar2.d();
            return bVar2.f132238b;
        }
        if (oe2.f.H(i14, 64)) {
            return bVar.a(dDoubleValue == 1.0d ? R.string.lbl_num_calorie : R.string.lbl_num_calories, strH);
        }
        return strH;
    }

    @Override // u00.b
    public final String d(int i14) {
        l22.b bVar = this.f127655c;
        String string = bVar.getString(R.string.no_value);
        return oe2.f.H(i14, 64) ? bVar.a(R.string.lbl_num_calories, string) : string;
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127655c.getString(R.string.lbl_calories);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127655c = bVar;
    }
}
