package sr;

import c22.c3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.PrivacyType;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsr/m;", "", "Ll22/b;", "resolver", "Lpi0/e;", "dateTimeFormatter", "<init>", "(Ll22/b;Lpi0/e;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f160576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pi0.e f160577b;

    public m(l22.b bVar, pi0.e eVar) {
        bVar.getClass();
        eVar.getClass();
        this.f160576a = bVar;
        this.f160577b = eVar;
    }

    public final String a(DateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        qi0.a aVar = qi0.a.RELATIVE_YEAR_ABBREV_MONTH_DAY;
        pi0.e eVar = this.f160577b;
        return this.f160576a.a(R.string.string_at_string_pattern, eVar.a(dateTime, aVar), eVar.c(dateTime, qi0.f.RELATIVE_24H_AM_PM_TIME));
    }

    public final String b(PrivacyType privacyType) {
        privacyType.getClass();
        int f28798b = privacyType.getF28798b();
        l22.b bVar = this.f160576a;
        return bVar.a(R.string.string_space_string_pattern, bVar.getString(f28798b), bVar.getString(R.string.msg_tap_to_change_privacy));
    }

    public final String c(c3 c3Var) {
        return c3Var != null ? this.f160576a.b(c3Var) : "";
    }
}
