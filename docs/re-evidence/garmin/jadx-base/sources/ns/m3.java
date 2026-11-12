package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/m3;", "Lu00/b;", "Lns/l3;", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m3 extends u00.b<l3> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127704c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127705a;

        static {
            int[] iArr = new int[qs.a0.values().length];
            try {
                iArr[qs.a0.Custom.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f127705a = iArr;
        }
    }

    public /* synthetic */ m3(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.w() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String strL;
        l3 l3Var = (l3) obj;
        l3Var.getClass();
        qs.a0 a0Var = l3Var.f127692a;
        int[] iArr = a.f127705a;
        int iOrdinal = a0Var.ordinal();
        int i15 = a0Var.f146996b;
        int i16 = iArr[iOrdinal];
        l22.b bVar = this.f127704c;
        if (i16 != 1) {
            return bVar.getString(i15);
        }
        Double d14 = l3Var.f127693b;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        if (dDoubleValue > 0.0d) {
            c22.l3.f23124b.getClass();
            strL = c22.l3.a.L(dDoubleValue / ((double) 1000), 3);
        } else {
            strL = null;
        }
        String strH = h(l3Var, i14);
        if (strL == null || strH != null) {
            return (strL == null || strH == null) ? bVar.getString(i15) : bVar.a(R.string.string_space_string_pattern, strL, strH);
        }
        return strL;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001e  */
    public final String h(l3 l3Var, int i14) {
        boolean z14;
        if ((l3Var != null ? l3Var.f127692a : null) != qs.a0.Custom) {
            z14 = false;
        } else {
            Double d14 = l3Var.f127693b;
            if ((d14 != null ? d14.doubleValue() : 0.0d) > 0.0d) {
                z14 = true;
            } else {
                z14 = false;
            }
        }
        if (!oe2.f.H(i14, 16)) {
            l22.b bVar = this.f127704c;
            if (z14 && u00.b.g(i14)) {
                return bVar.getString(R.string.lbl_kg_l);
            }
            if (z14) {
                oi0.b bVar2 = new oi0.b(bVar, bVar.getString(R.string.lbl_kg_l));
                bVar2.q();
                String str = bVar2.f132238b;
                l22.b bVar3 = bVar2.f132237a;
                bVar2.f132238b = d53.u.v(str, bVar3.getString(R.string.common_abbrev_liter_string), bVar3.getString(R.string.lbl_unit_litre), false);
                bVar2.P((2 & 1) == 0, false);
                return bVar2.f132238b;
            }
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(l22.b bVar, u00.c<l3> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127704c = bVar;
    }
}
