package g12;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.i f74899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f74900c;

    public /* synthetic */ l(com.garmin.android.apps.connectmobile.userprofile.i iVar, li0.f.b bVar, Long l14, int i14) {
        this.f74898a = i14;
        this.f74899b = iVar;
        this.f74900c = l14;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        Boolean bool;
        Object value2;
        Boolean bool2;
        Object value3;
        Boolean bool3;
        switch (this.f74898a) {
            case 0:
                p2 p2Var = this.f74899b.f46764p;
                do {
                    value = p2Var.getValue();
                    bool = Boolean.TRUE;
                    ((com.garmin.android.apps.connectmobile.userprofile.i.b) value).getClass();
                } while (!p2Var.b(value, new com.garmin.android.apps.connectmobile.userprofile.i.b(bool, false, false, true)));
                String str = "Accept follow request " + this.f74900c + " failed";
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "UserProfileViewModel", str);
                break;
            case 1:
                p2 p2Var2 = this.f74899b.f46764p;
                do {
                    value2 = p2Var2.getValue();
                    bool2 = Boolean.FALSE;
                    ((com.garmin.android.apps.connectmobile.userprofile.i.b) value2).getClass();
                } while (!p2Var2.b(value2, new com.garmin.android.apps.connectmobile.userprofile.i.b(bool2, false, false, true)));
                String str2 = "Undo decline follow request " + this.f74900c + " failed";
                i2.a aVar2 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var2, "UserProfileViewModel", str2);
                break;
            default:
                p2 p2Var3 = this.f74899b.f46764p;
                do {
                    value3 = p2Var3.getValue();
                    bool3 = Boolean.TRUE;
                    ((com.garmin.android.apps.connectmobile.userprofile.i.b) value3).getClass();
                } while (!p2Var3.b(value3, new com.garmin.android.apps.connectmobile.userprofile.i.b(bool3, false, false, true)));
                String str3 = "Decline follow request " + this.f74900c + " failed";
                i2.a aVar3 = i2.f36769a;
                a2 a2Var3 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var3, "UserProfileViewModel", str3);
                break;
        }
        return Unit.INSTANCE;
    }
}
