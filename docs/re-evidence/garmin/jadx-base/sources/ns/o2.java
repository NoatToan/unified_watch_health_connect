package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/o2;", "Lns/g3;", "Ll22/b;", "resourceResolver", "Lu00/c;", "", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o2 extends g3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l22.b f127719d;

    public /* synthetic */ o2(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a0() : cVar);
    }

    @Override // ns.g3, u00.b
    public final /* bridge */ /* synthetic */ String a(int i14, Object obj) {
        return h(((Number) obj).doubleValue(), i14);
    }

    @Override // ns.g3, u00.b
    public final String d(int i14) {
        l22.b bVar = this.f127719d;
        String string = bVar.getString(R.string.no_duration_value);
        return oe2.f.H(i14, 64) ? bVar.a(R.string.string_space_string_pattern, string, bVar.getString(R.string.total_surface_time)) : string;
    }

    @Override // ns.g3, u00.b
    public final /* bridge */ /* synthetic */ String e(Double d14) {
        return i();
    }

    @Override // ns.g3
    public final String h(double d14, int i14) {
        String strH = super.h(d14, i14);
        boolean zH = oe2.f.H(i14, 64);
        l22.b bVar = this.f127719d;
        if (zH) {
            return bVar.a(R.string.lbl_param_surface_time, strH);
        }
        if (!u00.b.f(i14)) {
            return strH;
        }
        c22.l3.a aVar = c22.l3.f23124b;
        int iB = MathKt.b(d14);
        aVar.getClass();
        return c22.l3.a.k1(bVar, true, iB);
    }

    @Override // ns.g3
    public final String i() {
        return this.f127719d.getString(R.string.total_surface_time);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127719d = bVar;
    }
}
