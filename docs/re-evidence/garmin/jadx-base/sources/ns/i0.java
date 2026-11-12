package ns;

import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lns/i0;", "Lu00/b;", "Lns/v;", "Ll22/b;", "resolver", "Lu00/c;", "validator", "<init>", "(Ll22/b;Lu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i0 extends u00.b<v> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127662c;

    public /* synthetic */ i0(l22.b bVar, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? new ms.l() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        v vVar = (v) obj;
        vVar.getClass();
        Integer num = vVar.f127783b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = vVar.f127782a;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        l22.b bVar = this.f127662c;
        return iIntValue == 0 ? bVar.a(R.string.lbl_nitrox_mixture, Integer.valueOf(iIntValue2)) : bVar.a(R.string.lbl_trimix_mixture, Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127662c.getString(R.string.no_value);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(l22.b bVar, u00.c<v> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127662c = bVar;
    }
}
