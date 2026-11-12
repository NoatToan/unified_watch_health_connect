package ox1;

import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import fy1.g;
import ou1.f0;
import p005kotlin.Metadata;
import pi0.e;
import r22.p;
import ss.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lox1/c;", "", "Ll22/b;", "resolver", "Lpi0/e;", "dateTimeFormatter", "<init>", "(Ll22/b;Lpi0/e;)V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f134334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f134335b;

    public c(l22.b bVar, e eVar) {
        bVar.getClass();
        eVar.getClass();
        this.f134334a = bVar;
        this.f134335b = eVar;
    }

    public final p a(ls.e eVar, f0 f0Var) {
        Double d14;
        eVar.getClass();
        int i14 = g.f73922a[eVar.ordinal()];
        if (i14 != 1) {
            d14 = i14 != 2 ? null : f0Var.f134056b;
        } else {
            d14 = f0Var.f134055a;
        }
        l22.b bVar = this.f134334a;
        String strB = k.b(eVar, bVar, d14, 9);
        if (strB == null) {
            strB = "";
        }
        String strH = k.h(eVar, bVar, d14);
        if (strH == null) {
            strH = "";
        }
        String strA = bVar.a(R.string.string_space_string_pattern, strB, strH);
        c3 c3Var = eVar.f114678a;
        String strB2 = c3Var != null ? bVar.b(c3Var) : null;
        return new p(strA, null, strB2 == null ? "" : strB2, null, 0, null, null, 106, null);
    }
}
