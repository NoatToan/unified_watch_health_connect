package ns;

import com.garmin.android.apps.connectmobile.R;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lns/q0;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lns/q0$a;", "heartRateType", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lns/q0$a;Lu00/c;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class q0 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f127733d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lns/q0$a;", "", "", "paramStringId", "labelStringId", "<init>", "(Ljava/lang/String;III)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        Avg(R.string.param_avg_hr, R.string.lbl_average_heart_rate),
        Max(R.string.param_max_hr, R.string.activity_details_max_heart_rate),
        Min(R.string.param_min_hr, R.string.activity_details_min_heart_rate),
        Other(R.string.data_fields_setting_data_field, R.string.activity_details_heart_rate);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f127739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f127740b;

        a(int i14, int i15) {
            this.f127739a = i14;
            this.f127740b = i15;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(l22.b bVar, a aVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f127732c = bVar;
        this.f127733d = aVar;
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean zH = oe2.f.H(i14, 16);
        l22.b bVar = this.f127732c;
        String string = bVar.getString(R.string.lbl_bpm);
        c22.l3.f23124b.getClass();
        DecimalFormat decimalFormat = c22.l3.f23131i;
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        String strA = decimalFormat.format(MathKt.d(dDoubleValue));
        if (zH) {
            strA.getClass();
        } else {
            strA.getClass();
            strA = bVar.a(R.string.string_space_string_pattern, strA, string);
        }
        if (oe2.f.H(i14, 64)) {
            return bVar.a(this.f127733d.f127739a, strA);
        }
        if (u00.b.g(i14)) {
            return strA;
        }
        oi0.b bVar2 = new oi0.b(bVar, strA);
        bVar2.b();
        return bVar2.f132238b;
    }

    @Override // u00.b
    public final String d(int i14) {
        l22.b bVar = this.f127732c;
        String string = bVar.getString(R.string.no_value);
        return oe2.f.H(i14, 64) ? bVar.a(this.f127733d.f127739a, string) : string;
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127732c.getString(this.f127733d.f127740b);
    }

    public final String h(Object obj) {
        l22.b bVar = this.f127732c;
        String string = bVar.getString(R.string.lbl_bpm);
        if (u00.b.g(1)) {
            return string;
        }
        oi0.b bVar2 = new oi0.b(bVar, string);
        bVar2.b();
        return bVar2.f132238b;
    }

    public /* synthetic */ q0(l22.b bVar, a aVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, aVar, (i14 & 4) != 0 ? new ms.p() : cVar);
    }
}
