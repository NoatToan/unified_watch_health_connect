package ns;

import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lns/o3;", "Lu00/b;", "Lps/h0;", "Ll22/b;", "resourceResolver", "", "roundedToOneDecimal", "Lu00/c;", "validator", "<init>", "(Ll22/b;ZLu00/c;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o3 extends u00.b<ps.h0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127721d;

    static {
        new a(null);
    }

    public /* synthetic */ o3(l22.b bVar, boolean z14, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? new ms.d0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        DecimalFormat decimalFormat;
        ps.h0 h0Var = (ps.h0) obj;
        h0Var.getClass();
        ps.z1 z1Var = h0Var.f139839b;
        boolean z14 = (z1Var != null ? z1Var.h() : null) == qs.y.UNIT_WEIGHT_KILOGRAM;
        Double d14 = h0Var.f139838a;
        if (d14 == null) {
            return d(i14);
        }
        c22.l3.a aVar = c22.l3.f23124b;
        double dDoubleValue = d14.doubleValue() / 1000.0d;
        boolean z15 = !oe2.f.H(i14, 16);
        if (this.f127721d) {
            decimalFormat = c22.l3.f23126d;
        } else {
            aVar.getClass();
            decimalFormat = c22.l3.f23131i;
        }
        DecimalFormat decimalFormat2 = decimalFormat;
        aVar.getClass();
        return c22.l3.a.B1(this.f127720c, dDoubleValue, z14, z15, decimalFormat2, true);
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127720c.getString(R.string.no_value);
    }

    public final /* bridge */ /* synthetic */ String h(Object obj) {
        return i((ps.h0) obj, 1);
    }

    public final String i(ps.h0 h0Var, int i14) {
        ps.z1 z1Var;
        int i15 = ((h0Var == null || (z1Var = h0Var.f139839b) == null) ? null : z1Var.h()) == qs.y.UNIT_WEIGHT_KILOGRAM ? R.string.lbl_kg : R.string.lbl_lbs;
        l22.b bVar = this.f127720c;
        String string = bVar.getString(i15);
        if (u00.b.g(i14)) {
            return string;
        }
        oi0.b bVar2 = new oi0.b(bVar, string);
        bVar2.Z();
        return bVar2.f132238b;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lns/o3$a;", "", "<init>", "()V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(l22.b bVar, boolean z14, u00.c<ps.h0> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127720c = bVar;
        this.f127721d = z14;
    }
}
