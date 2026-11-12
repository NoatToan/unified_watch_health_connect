package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lns/m1;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lns/m1$a;", "powerType", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lns/m1$a;Lu00/c;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class m1 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f127697d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lns/m1$a;", "", "", "paramStringId", "labelStringId", "<init>", "(Ljava/lang/String;III)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        Avg(R.string.param_avg_power, R.string.activities_power_help_average_power),
        Max(R.string.param_max_power, R.string.activity_details_max_power),
        Other(R.string.data_fields_setting_data_field, R.string.activity_details_power);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f127702a;

        a(int i14, int i15) {
            this.f127702a = i14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(l22.b bVar, a aVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f127696c = bVar;
        this.f127697d = aVar;
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean z14 = !oe2.f.H(i14, 16);
        c22.l3.a aVar = c22.l3.f23124b;
        String strD = d(8);
        aVar.getClass();
        l22.b bVar = this.f127696c;
        String strE0 = c22.l3.a.E0(bVar, dDoubleValue, z14, strD);
        if (oe2.f.H(i14, 64)) {
            return bVar.a(this.f127697d.f127702a, strE0);
        }
        if (u00.b.g(i14)) {
            return strE0;
        }
        oi0.b bVar2 = new oi0.b(bVar, strE0);
        bVar2.X();
        return bVar2.f132238b;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127696c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127696c.getString(R.string.activity_details_power);
    }

    public final String h(int i14, Double d14) {
        l22.b bVar = this.f127696c;
        String string = bVar.getString(R.string.lbl_watts);
        if (u00.b.g(1)) {
            return string;
        }
        oi0.b bVar2 = new oi0.b(bVar, string);
        bVar2.X();
        return bVar2.f132238b;
    }

    public final /* bridge */ /* synthetic */ String i(Object obj) {
        return h(1, (Double) obj);
    }

    public /* synthetic */ m1(l22.b bVar, a aVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, aVar, (i14 & 4) != 0 ? new ms.a0() : cVar);
    }
}
