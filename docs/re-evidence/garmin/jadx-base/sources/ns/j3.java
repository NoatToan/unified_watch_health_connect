package ns;

import com.garmin.android.apps.connectmobile.R;
import java.util.Arrays;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/j3;", "Lu00/b;", "Lls/h;", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j3 extends u00.b<ls.h> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(l22.b bVar, u00.c<ls.h> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127679c = bVar;
        this.f127680d = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        ls.h hVar = (ls.h) obj;
        hVar.getClass();
        boolean zH = oe2.f.H(i14, 4);
        l22.b bVar = this.f127679c;
        if (zH) {
            c22.l3.a aVar = c22.l3.f23124b;
            double pace = hVar.getPace();
            int perValue = hVar.getPerValue();
            boolean isUsingMetric = hVar.getIsUsingMetric();
            aVar.getClass();
            return bVar.a(R.string.string_space_string_pattern, c22.l3.a.r1(bVar, c22.l3.a.s(perValue, pace, isUsingMetric)), j(hVar, 4));
        }
        c22.l3.a aVar2 = c22.l3.f23124b;
        double pace2 = hVar.getPace();
        int perValue2 = hVar.getPerValue();
        boolean isUsingMetric2 = hVar.getIsUsingMetric();
        String strD = d(8);
        aVar2.getClass();
        bVar.getClass();
        String strS0 = Double.isNaN(pace2) ? aVar2.s0(bVar, pace2, isUsingMetric2, false, strD) : aVar2.s0(bVar, c22.l3.a.s(perValue2, pace2, isUsingMetric2), isUsingMetric2, false, strD);
        if (!oe2.f.H(i14, 16)) {
            strS0 = bVar.a(R.string.string_space_string_pattern, strS0, j(hVar, i14));
        }
        return oe2.f.H(i14, 2) ? h(strS0, hVar.getIsUsingMetric(), k(hVar)) : strS0;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127679c.getString(R.string.no_duration_value);
    }

    @Override // u00.b
    public final String e(ls.h hVar) {
        return this.f127679c.getString(R.string.lbl_pace);
    }

    public final String h(String str, boolean z14, boolean z15) {
        oi0.b bVar = new oi0.b(this.f127679c, str);
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

    public final /* bridge */ /* synthetic */ String i(Object obj) {
        return j((ls.h) obj, 1);
    }

    public final String j(ls.h hVar, int i14) {
        boolean isUsingMetric = hVar != null ? hVar.getIsUsingMetric() : this.f127680d;
        int i15 = isUsingMetric ? R.string.per_n_meters : R.string.per_n_yards;
        p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
        l22.b bVar = this.f127679c;
        String str = String.format(bVar.getString(i15), Arrays.copyOf(new Object[]{Integer.valueOf(hVar != null ? hVar.getPerValue() : 100)}, 1));
        boolean zK = k(hVar);
        if (oe2.f.H(i14, 2)) {
            return h(str, isUsingMetric, zK);
        }
        if (!oe2.f.H(i14, 4)) {
            return str;
        }
        oi0.b bVar2 = new oi0.b(bVar, h(str, isUsingMetric, zK));
        bVar2.P((2 & 1) == 0, false);
        return bVar2.f132238b;
    }

    public final boolean k(ls.h hVar) {
        c22.l3.a aVar = c22.l3.f23124b;
        double pace = hVar != null ? hVar.getPace() : 0.0d;
        int perValue = hVar != null ? hVar.getPerValue() : 0;
        boolean isUsingMetric = hVar != null ? hVar.getIsUsingMetric() : this.f127680d;
        aVar.getClass();
        return c22.l3.a.s(perValue, pace, isUsingMetric) == 1;
    }

    public /* synthetic */ j3(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.j0() : cVar);
    }
}
