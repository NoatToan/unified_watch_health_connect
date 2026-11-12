package ns;

import com.garmin.android.apps.connectmobile.R;
import java.text.NumberFormat;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/u0;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u0 extends u00.b<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127773c;

    public /* synthetic */ u0(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.c0() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        String str = NumberFormat.getIntegerInstance().format(Integer.valueOf(iIntValue));
        if (!oe2.f.H(i14, 64)) {
            str.getClass();
            return str;
        }
        str.getClass();
        int i15 = iIntValue == 1 ? R.string.activity_lap_interval_label : R.string.lbl_intervals;
        l22.b bVar = this.f127773c;
        return bVar.a(R.string.value_unit, str, bVar.getString(i15));
    }

    @Override // u00.b
    public final String d(int i14) {
        l22.b bVar = this.f127773c;
        String string = bVar.getString(R.string.no_value);
        return oe2.f.H(i14, 64) ? bVar.a(R.string.value_unit, string, bVar.getString(R.string.lbl_intervals)) : string;
    }

    @Override // u00.b
    public final String e(Integer num) {
        Integer num2 = num;
        return this.f127773c.getString((num2 != null && num2.intValue() == 1) ? R.string.activity_lap_interval_label : R.string.lbl_intervals);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(l22.b bVar, u00.c<Integer> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127773c = bVar;
    }
}
