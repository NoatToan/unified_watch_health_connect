package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/x1;", "Lns/w1;", "Ll22/b;", "resourceResolver", "Lu00/c;", "", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class x1 extends w1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l22.b f127801d;

    public /* synthetic */ x1(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.a0() : cVar);
    }

    @Override // ns.w1
    public final String h(int i14, Double d14) {
        l22.b bVar = this.f127801d;
        String string = bVar.getString(R.string.common_abbrev_glides_per_minute);
        if (u00.b.g(1)) {
            return string;
        }
        oi0.b bVar2 = new oi0.b(bVar, string);
        String str = bVar2.f132238b;
        l22.b bVar3 = bVar2.f132237a;
        String strV = d53.u.v(str, bVar3.getString(R.string.common_abbrev_glides_per_minute), bVar3.getString(R.string.lbl_glides_per_minute), false);
        bVar2.f132238b = strV;
        return strV;
    }

    @Override // ns.w1
    public final /* bridge */ /* synthetic */ String i(Object obj) {
        return h(1, (Double) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(l22.b bVar, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127801d = bVar;
    }
}
