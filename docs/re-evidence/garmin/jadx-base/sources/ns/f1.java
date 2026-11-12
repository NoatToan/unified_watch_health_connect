package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lns/f1;", "Lns/h1;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 extends h1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l22.b f127644e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(l22.b bVar) {
        super(bVar, false, null, 6, null);
        bVar.getClass();
        this.f127644e = bVar;
    }

    @Override // ns.h1, u00.b
    public final /* bridge */ /* synthetic */ String a(int i14, Object obj) {
        return i(((Number) obj).doubleValue(), i14);
    }

    @Override // ns.h1
    public final String i(double d14, int i14) {
        l22.b bVar = this.f127644e;
        String string = bVar.getString(R.string.lbl_minute_per_nautical_mile);
        boolean zH = oe2.f.H(i14, 16);
        c22.l3.f23124b.getClass();
        String strE1 = c22.l3.a.e1(c22.l3.a.o(d14));
        if (strE1 == null) {
            strE1 = "";
        }
        if (!zH) {
            strE1 = bVar.a(R.string.string_space_string_pattern, strE1, string);
        }
        return u00.b.g(i14) ? strE1 : l(strE1);
    }

    @Override // ns.h1
    public final String j(int i14, Double d14) {
        String string = this.f127644e.getString(R.string.lbl_minute_per_nautical_mile);
        return u00.b.g(i14) ? string : l(string);
    }

    @Override // ns.h1
    public final /* bridge */ /* synthetic */ String k(Object obj) {
        return j(1, (Double) obj);
    }

    public final String l(String str) {
        oi0.b bVar = new oi0.b(this.f127644e, str);
        String str2 = bVar.f132238b;
        l22.b bVar2 = bVar.f132237a;
        bVar.f132238b = d53.u.v(str2, bVar2.getString(R.string.common_min_abbreviated_without_period), bVar2.getString(R.string.lbl_time_unit_minutes), false);
        bVar.P(true, true);
        String strV = d53.u.v(bVar.f132238b, bVar2.getString(R.string.lbl_nautical_miles_abr), bVar2.getString(R.string.lbl_nautical_mile), false);
        bVar.f132238b = strV;
        return strV;
    }
}
