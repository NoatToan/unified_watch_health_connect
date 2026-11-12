package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lns/v0;", "Lns/e2;", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class v0 extends e2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l22.b f127784e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(l22.b bVar) {
        super(bVar, false, null, 6, null);
        bVar.getClass();
        this.f127784e = bVar;
    }

    @Override // ns.e2
    public final String h(String str) {
        str.getClass();
        oi0.b bVar = new oi0.b(this.f127784e, str);
        String str2 = bVar.f132238b;
        l22.b bVar2 = bVar.f132237a;
        String strV = d53.u.v(str2, bVar2.getString(R.string.lbl_reps_per_minute), bVar2.getString(R.string.lbl_reps_per_minute_cd), false);
        bVar.f132238b = strV;
        return strV;
    }

    @Override // ns.e2
    public final String i(double d14, c22.q3 q3Var, boolean z14) {
        q3Var.getClass();
        c22.l3.f23124b.getClass();
        return c22.l3.a.o0(this.f127784e, d14, z14);
    }

    @Override // ns.e2
    public final String j(int i14, Double d14) {
        String string = this.f127784e.getString(R.string.lbl_reps_per_minute);
        return u00.b.g(1) ? string : h(string);
    }

    @Override // ns.e2
    public final /* bridge */ /* synthetic */ String k(Object obj) {
        return j(1, (Double) obj);
    }
}
