package ns;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lns/p3;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "", "isUsingMetric", "Lu00/c;", "validator", "<init>", "(Ll22/b;ZLu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p3 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127730d;

    public /* synthetic */ p3(l22.b bVar, boolean z14, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y() : z14, (i14 & 4) != 0 ? new ms.a0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String str;
        double dDoubleValue = ((Number) obj).doubleValue();
        c22.l3.f23124b.getClass();
        if (Double.isNaN(dDoubleValue) || dDoubleValue < 0.0d) {
            str = "";
        } else {
            double dB = MathKt.b(dDoubleValue);
            if (this.f127730d) {
                str = c22.l3.f23131i.format(c22.l3.a.P1(dB));
                str.getClass();
            } else {
                str = c22.l3.f23131i.format(dB / 453.592d);
                str.getClass();
            }
        }
        if (oe2.f.H(i14, 16)) {
            return str;
        }
        return this.f127729c.a(R.string.string_space_string_pattern, str, h(i14, Double.valueOf(dDoubleValue)));
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127729c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127729c.getString(R.string.strength_training_total_volume_label);
    }

    public final String h(int i14, Double d14) {
        int i15 = this.f127730d ? R.string.lbl_kg : R.string.lbl_lbs;
        l22.b bVar = this.f127729c;
        String string = bVar.getString(i15);
        if (u00.b.g(i14)) {
            return string;
        }
        oi0.b bVar2 = new oi0.b(bVar, string);
        bVar2.Z();
        return bVar2.f132238b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(l22.b bVar, boolean z14, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127729c = bVar;
        this.f127730d = z14;
    }
}
