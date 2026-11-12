package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lns/t1;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lns/t1$a;", "respirationRateType", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lns/t1$a;Lu00/c;)V", "a", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t1 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127757c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f127758d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lns/t1$a;", "", "", "paramStringId", "labelStringId", "<init>", "(Ljava/lang/String;III)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum a {
        Avg(R.string.param_avg_resp, R.string.lbl_average_respiration),
        Other(R.string.data_fields_setting_data_field, R.string.activities_respiration_title);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f127762a;

        a(int i14, int i15) {
            this.f127762a = i14;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(l22.b bVar, a aVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        aVar.getClass();
        cVar.getClass();
        this.f127757c = bVar;
        this.f127758d = aVar;
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean z14 = !oe2.f.H(i14, 16);
        l22.b bVar = this.f127757c;
        String strK = new c22.l3(bVar).k(dDoubleValue, z14);
        if (oe2.f.H(i14, 64)) {
            return bVar.a(this.f127758d.f127762a, strK);
        }
        if (u00.b.g(i14)) {
            return strK;
        }
        oi0.b bVar2 = new oi0.b(bVar, strK);
        bVar2.c();
        return bVar2.f132238b;
    }

    @Override // u00.b
    public final String d(int i14) {
        l22.b bVar = this.f127757c;
        String string = bVar.getString(R.string.no_value);
        return oe2.f.H(i14, 64) ? bVar.a(this.f127758d.f127762a, string) : string;
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127757c.getString(R.string.activities_respiration_title);
    }

    public final String h(Object obj) {
        l22.b bVar = this.f127757c;
        String string = bVar.getString(R.string.activities_brpm_common_lbl);
        if (u00.b.g(1)) {
            return string;
        }
        oi0.b bVar2 = new oi0.b(bVar, string);
        bVar2.c();
        return bVar2.f132238b;
    }

    public /* synthetic */ t1(l22.b bVar, a aVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, aVar, (i14 & 4) != 0 ? new ms.b0() : cVar);
    }
}
