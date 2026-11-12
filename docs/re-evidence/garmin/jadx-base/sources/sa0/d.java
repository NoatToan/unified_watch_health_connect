package sa0;

import com.garmin.proto.generated.WifiSetup;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f158173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WifiSetup.SecurityType f158174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e23.l f158175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e23.a f158176e;

    public /* synthetic */ d(String str, WifiSetup.SecurityType securityType, e23.l lVar, e23.a aVar, int i14, int i15) {
        this.f158172a = i15;
        this.f158173b = str;
        this.f158174c = securityType;
        this.f158175d = lVar;
        this.f158176e = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f158172a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(1);
                f.b(this.f158173b, this.f158174c, this.f158175d, this.f158176e, (p3.m) obj, iT);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                f.a(this.f158173b, this.f158174c, this.f158175d, this.f158176e, (p3.m) obj, iT2);
                break;
        }
        return Unit.INSTANCE;
    }
}
