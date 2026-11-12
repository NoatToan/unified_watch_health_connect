package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/g;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class g extends u00.b<Integer> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127646c;

    public /* synthetic */ g(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.t() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        String str;
        int iIntValue = ((Number) obj).intValue();
        if (iIntValue != 0) {
            c22.l3.f23124b.getClass();
            str = c22.l3.f23132j.format(Integer.valueOf(iIntValue));
        } else {
            str = "0";
        }
        if (u00.b.f(i14)) {
            str.getClass();
            return str;
        }
        if (oe2.f.H(i14, 16)) {
            str.getClass();
            return str;
        }
        str.getClass();
        return this.f127646c.a(R.string.string_space_string_pattern, str, h());
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127646c.getString(R.string.no_value);
    }

    public String h() {
        return this.f127646c.getString(R.string.lbl_body_battery_net_impact);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l22.b bVar, u00.c<Integer> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127646c = bVar;
    }
}
