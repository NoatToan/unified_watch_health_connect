package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/d;", "Lu00/b;", "Lls/b;", "Ll22/b;", "resourceResolver", "Lms/b;", "validator", "<init>", "(Ll22/b;Lms/b;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends u00.b<ls.b> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127630c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f127631a;

        static {
            int[] iArr = new int[c22.q3.values().length];
            try {
                iArr[c22.q3.KILOMETER_PER_HOUR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c22.q3.MILE_PER_HOUR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f127631a = iArr;
        }
    }

    public /* synthetic */ d(l22.b bVar, ms.b bVar2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.b() : bVar2);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        ls.b bVar = (ls.b) obj;
        bVar.getClass();
        Double data = bVar.getData();
        boolean zH = oe2.f.H(i14, 16);
        c22.q3 q3Var = bVar.getSpeedDisplayMeasureUnit().f29425a;
        if (data == null) {
            return d(i14);
        }
        double dDoubleValue = data.doubleValue();
        c22.l3.f23124b.getClass();
        String strA = c22.l3.f23130h.format(c22.l3.a.i(dDoubleValue, q3Var));
        l22.b bVar2 = this.f127630c;
        if (zH) {
            strA.getClass();
        } else {
            strA.getClass();
            strA = bVar2.a(R.string.string_space_string_pattern, strA, bVar2.getString(q3Var.f23223e));
        }
        if (oe2.f.H(i14, 64)) {
            return bVar2.a(R.string.max_value, strA);
        }
        if (u00.b.g(i14)) {
            return strA;
        }
        oi0.b bVar3 = new oi0.b(bVar2, strA);
        int i15 = a.f127631a[q3Var.ordinal()];
        if (i15 == 1) {
            bVar3.t();
            return bVar3.f132238b;
        }
        if (i15 == 2) {
            bVar3.C();
            return bVar3.f132238b;
        }
        String str = bVar3.f132238b;
        l22.b bVar4 = bVar3.f132237a;
        String strV = d53.u.v(str, bVar4.getString(R.string.lbl_aviation_speed_abr), bVar4.getString(R.string.lbl_knots), false);
        bVar3.f132238b = strV;
        return strV;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127630c.getString(R.string.no_value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(l22.b bVar, ms.b bVar2) {
        super(bVar, bVar2);
        bVar.getClass();
        bVar2.getClass();
        this.f127630c = bVar;
    }
}
