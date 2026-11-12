package vm0;

import androidx.lifecycle.n0;
import cw1.k0;
import o53.s0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f178762a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f178763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.group.details.invite.b f178764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f178765d;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.group.details.invite.b bVar, int i14, e eVar) {
        this.f178764c = bVar;
        this.f178765d = i14;
        this.f178763b = eVar;
    }

    @Override // e23.a
    public final Object invoke() {
        wm0.a aVar;
        switch (this.f178762a) {
            case 0:
                com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar2 = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                com.garmin.android.apps.connectmobile.group.details.invite.b bVar = this.f178764c;
                bVar.getClass();
                e eVar = this.f178763b;
                if (eVar != null && (aVar = eVar.f178751g) != null) {
                    k kVarE7 = bVar.e7();
                    x53.c cVar = s0.f129406a;
                    androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(x53.b.f189152a, new m(kVarE7, aVar, null), 2);
                    n0 viewLifecycleOwner = bVar.getViewLifecycleOwner();
                    viewLifecycleOwner.getClass();
                    dh.b.L(jVarA, viewLifecycleOwner, new com.garmin.android.apps.connectmobile.group.details.invite.b.e(new k0(bVar, this.f178765d, eVar, aVar, 15)));
                }
                break;
            default:
                e eVar2 = this.f178763b;
                if (eVar2 != null) {
                    com.garmin.android.apps.connectmobile.group.details.invite.b.a aVar3 = com.garmin.android.apps.connectmobile.group.details.invite.b.f36368o;
                    this.f178764c.d7().C(this.f178765d, eVar2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(e eVar, com.garmin.android.apps.connectmobile.group.details.invite.b bVar, int i14) {
        this.f178763b = eVar;
        this.f178764c = bVar;
        this.f178765d = i14;
    }
}
