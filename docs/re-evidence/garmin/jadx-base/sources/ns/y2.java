package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/y2;", "Lu00/b;", "Lps/g0;", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y2 extends u00.b<ps.g0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127806c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"ns/y2$a", "Lu00/c;", "Lps/g0;", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements u00.c<ps.g0> {
        @Override // u00.c
        public final boolean a(ps.g0 g0Var) {
            ps.g0 g0Var2 = g0Var;
            return new ms.a0().a(g0Var2 != null ? g0Var2.f139822a : null);
        }
    }

    public /* synthetic */ y2(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new a() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String strD;
        ps.g0 g0Var = (ps.g0) obj;
        g0Var.getClass();
        Double d14 = g0Var.f139822a;
        if (d14 == null) {
            return d(i14);
        }
        double dDoubleValue = d14.doubleValue();
        boolean zF = u00.b.f(i14);
        l22.b bVar = this.f127806c;
        if (zF) {
            strD = new oi0.h(bVar).d(MathKt.d(dDoubleValue), false);
        } else {
            c22.l3.a aVar = c22.l3.f23124b;
            long jD = MathKt.d(dDoubleValue);
            aVar.getClass();
            String strE1 = c22.l3.a.e1(jD);
            if (strE1 == null) {
                return d(i14);
            }
            strD = strE1;
        }
        Double d15 = g0Var.f139823b;
        if (d15 == null || d15.doubleValue() <= 0.0d) {
            return strD;
        }
        double dDoubleValue2 = (dDoubleValue / d15.doubleValue()) * 100.0d;
        c22.l3.f23124b.getClass();
        String strB0 = c22.l3.a.B0(bVar, dDoubleValue2, 0, null);
        return strB0 == null ? strD : bVar.a(R.string.string_space_bullet_string_pattern, strD, strB0);
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127806c.getString(R.string.no_duration_value);
    }

    @Override // u00.b
    public final String e(ps.g0 g0Var) {
        return this.f127806c.getString(R.string.lbl_time_short);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(l22.b bVar, u00.c<ps.g0> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127806c = bVar;
    }
}
