package vm0;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class g implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.invite.b f178759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f178760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f178761d;

    public /* synthetic */ g(com.garmin.android.apps.connectmobile.group.details.invite.b bVar, int i14, e eVar, int i15) {
        this.f178758a = i15;
        this.f178759b = bVar;
        this.f178760c = i14;
        this.f178761d = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f178758a;
        e eVar = this.f178761d;
        int i15 = this.f178760c;
        com.garmin.android.apps.connectmobile.group.details.invite.b bVar = this.f178759b;
        g3 g3Var = (g3) obj;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                g3Var.getClass();
                int i16 = com.garmin.android.apps.connectmobile.group.details.invite.b.C0643b.f36371a[g3Var.f35300a.ordinal()];
                if (i16 == 1) {
                    bVar.d7().C(i15, e.b(eVar, null, (wm0.a) g3Var.f35301b, 1983));
                } else if (i16 == 2) {
                    if (zy0.g.a(g3Var.f35304e)) {
                        new androidx.appcompat.app.e.a(bVar.requireContext()).setTitle(R.string.lbl_invitation_limit_reached_title).setMessage(R.string.lbl_invitation_limit_reached_message).setPositiveButton(R.string.lbl_ok, new ty1.o(26)).show();
                    } else {
                        g22.e.a(bVar, null);
                    }
                    bVar.d7().C(i15, e.b(eVar, null, null, 1983));
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar2 = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                g3Var.getClass();
                int i17 = com.garmin.android.apps.connectmobile.group.details.invite.b.C0643b.f36371a[g3Var.f35300a.ordinal()];
                if (i17 == 1) {
                    bVar.d7().C(i15, e.b(eVar, (com.garmin.android.apps.connectmobile.connections.groups.services.model.b) g3Var.f35301b, null, 2015));
                } else if (i17 == 2) {
                    g22.e.c(bVar);
                    bVar.d7().C(i15, eVar);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
