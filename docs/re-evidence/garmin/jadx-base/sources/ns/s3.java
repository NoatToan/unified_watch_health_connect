package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/s3;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s3 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127753c;

    public /* synthetic */ s3(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        c22.l3.a aVar = c22.l3.f23124b;
        long jD = MathKt.d(dDoubleValue);
        aVar.getClass();
        String strE1 = c22.l3.a.e1(jD);
        if (strE1 == null) {
            strE1 = "";
        }
        boolean zH = oe2.f.H(i14, 64);
        l22.b bVar = this.f127753c;
        if (zH) {
            return bVar.a(R.string.param_work_time, strE1);
        }
        return u00.b.f(i14) ? c22.l3.a.k1(bVar, true, MathKt.b(dDoubleValue)) : strE1;
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127753c.getString(R.string.no_duration_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127753c.getString(R.string.strength_training_work_time_label);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127753c = bVar;
    }
}
