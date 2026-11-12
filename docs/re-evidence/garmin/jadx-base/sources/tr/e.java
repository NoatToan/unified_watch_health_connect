package tr;

import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ltr/e;", "Ltr/f;", "Ll22/b;", "resolver", "", "isUsingMetric", "<init>", "(Ll22/b;Z)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166118b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l22.b bVar, boolean z14) {
        super(bVar);
        bVar.getClass();
        this.f166118b = z14;
    }

    @Override // tr.g
    public final String c(int i14, int i15, Double d14, Double d15) {
        l3.a aVar = l3.f23124b;
        double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
        aVar.getClass();
        boolean z14 = this.f166118b;
        int iP = l3.a.p(dDoubleValue, z14);
        Integer numValueOf = d15 != null ? Integer.valueOf(l3.a.p(d15.doubleValue(), z14)) : null;
        if (i14 == i15) {
            iP++;
        } else {
            numValueOf = numValueOf != null ? wr.g.m(1, numValueOf) : null;
        }
        String strW0 = l3.a.w0(iP);
        String strW1 = numValueOf != null ? l3.a.w0(numValueOf.intValue()) : null;
        l22.b bVar = this.f166119a;
        return strW1 == null ? bVar.a(R.string.lbl_less_than_number, strW0) : bVar.a(R.string.string_short_dash_line_string_pattern, strW1, strW0);
    }
}
