package g12;

import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f74896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.i f74897b;

    public /* synthetic */ k(com.garmin.android.apps.connectmobile.userprofile.i iVar, int i14) {
        this.f74896a = i14;
        this.f74897b = iVar;
    }

    @Override // e23.a
    public final Object invoke() {
        Object value;
        Boolean bool;
        Object value2;
        Boolean bool2;
        Object value3;
        Boolean bool3;
        switch (this.f74896a) {
            case 0:
                p2 p2Var = this.f74897b.f46764p;
                do {
                    value = p2Var.getValue();
                    bool = Boolean.FALSE;
                    ((com.garmin.android.apps.connectmobile.userprofile.i.b) value).getClass();
                } while (!p2Var.b(value, new com.garmin.android.apps.connectmobile.userprofile.i.b(bool, true, false, false)));
                break;
            case 1:
                this.f74897b.f46770x.j(Boolean.TRUE);
                break;
            case 2:
                p2 p2Var2 = this.f74897b.f46764p;
                do {
                    value2 = p2Var2.getValue();
                    bool2 = Boolean.TRUE;
                    ((com.garmin.android.apps.connectmobile.userprofile.i.b) value2).getClass();
                } while (!p2Var2.b(value2, new com.garmin.android.apps.connectmobile.userprofile.i.b(bool2, false, false, false)));
                break;
            default:
                p2 p2Var3 = this.f74897b.f46764p;
                do {
                    value3 = p2Var3.getValue();
                    bool3 = Boolean.FALSE;
                    ((com.garmin.android.apps.connectmobile.userprofile.i.b) value3).getClass();
                } while (!p2Var3.b(value3, new com.garmin.android.apps.connectmobile.userprofile.i.b(bool3, false, true, false)));
                break;
        }
        return Unit.INSTANCE;
    }
}
