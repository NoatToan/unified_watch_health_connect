package c61;

import c22.l3;
import c32.k;
import com.garmin.android.apps.connectmobile.R;
import gg1.o0;
import java.text.DecimalFormat;
import o13.m;
import o13.t;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import pi0.e;
import qi0.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lc61/b;", "", "Ll22/b;", "resolver", "<init>", "(Ll22/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f24633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f24634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f24635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f24636d;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24637a;

        static {
            int[] iArr = new int[o0.values().length];
            try {
                iArr[o0.METRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f24637a = iArr;
        }
    }

    public b(l22.b bVar) {
        bVar.getClass();
        this.f24633a = bVar;
        this.f24634b = m.b(new bv0.b(27));
        this.f24635c = m.b(new k(this, 4));
        this.f24636d = m.b(new bv0.b(28));
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0017  */
    public final String a(Integer num) {
        String str;
        if (num != null) {
            int iIntValue = num.intValue();
            l3.f23124b.getClass();
            str = l3.f23131i.format(Integer.valueOf(iIntValue));
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        return this.f24633a.a(R.string.lbl_value_percent, str);
    }

    public final String b(DateTime dateTime) {
        if (dateTime == null) {
            return "";
        }
        return this.f24633a.a(R.string.tr_updated_at, ((e) this.f24634b.getValue()).c(dateTime, f.RELATIVE_24H_AM_PM_TIME));
    }

    public final String c(boolean z14) {
        l22.b bVar = this.f24633a;
        if (z14) {
            b61.b.f16165a.getClass();
            return "72".concat(bVar.getString(R.string.lbl_fahrenheit));
        }
        l3.f23124b.getClass();
        DecimalFormat decimalFormat = l3.f23131i;
        b61.b.f16165a.getClass();
        return tn.k.g(decimalFormat.format(l3.a.e(72)), bVar.getString(R.string.lbl_celsius));
    }

    public final o0 d() {
        return (o0) this.f24636d.getValue();
    }

    public final ac1.a e() {
        return (ac1.a) this.f24635c.getValue();
    }

    public final c f() {
        ac1.a aVarE = e();
        o0 o0VarD = d();
        aVarE.getClass();
        o0VarD.getClass();
        return new c(null, null, null, null, null, null, null, this.f24633a.a(R.string.msg_altitude_acclimation_available_when_training_amount_or_higher, aVarE.b(o0VarD, 800)), 127, null);
    }

    public final c g() {
        return new c(null, null, null, null, null, null, null, this.f24633a.a(R.string.msg_heat_acclimation_available_temp_or_higher, c(d() == o0.STATUTE_US)), 127, null);
    }
}
