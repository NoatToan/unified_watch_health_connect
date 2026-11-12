package ns;

import com.garmin.android.apps.connectmobile.R;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lns/u2;", "Lu00/b;", "", "Ll22/b;", "resourceResolver", "", "isUsingStatuteUS", "Lu00/c;", "validator", "<init>", "(Ll22/b;ZLu00/c;)V", "gcm-domain-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class u2 extends u00.b<Double> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l22.b f127780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127781d;

    public /* synthetic */ u2(l22.b bVar, boolean z14, u00.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(bVar, (i14 & 2) != 0 ? ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).c() : z14, (i14 & 4) != 0 ? new ms.r() : cVar);
    }

    @Override // u00.b
    public final String a(int i14, Object obj) {
        double dDoubleValue = ((Number) obj).doubleValue();
        boolean z14 = !oe2.f.H(i14, 16);
        c22.l3.f23124b.getClass();
        return c22.l3.a.U0(this.f127780c, dDoubleValue, this.f127781d, false, z14);
    }

    @Override // u00.b
    public final String d(int i14) {
        return this.f127780c.getString(R.string.no_value);
    }

    @Override // u00.b
    public final String e(Double d14) {
        return this.f127780c.getString(R.string.lbl_temperature_cap);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(l22.b bVar, boolean z14, u00.c<Double> cVar) {
        super(bVar, cVar);
        bVar.getClass();
        cVar.getClass();
        this.f127780c = bVar;
        this.f127781d = z14;
    }
}
