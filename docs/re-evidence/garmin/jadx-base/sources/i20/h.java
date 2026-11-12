package i20;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.edit.a f87157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f87158c;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.contacts.edit.a aVar, int i14, int i15) {
        this.f87156a = i15;
        this.f87157b = aVar;
        this.f87158c = i14;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f87156a;
        int i15 = this.f87158c;
        com.garmin.android.apps.connectmobile.contacts.edit.a aVar = this.f87157b;
        switch (i14) {
            case 0:
                int i16 = com.garmin.android.apps.connectmobile.contacts.edit.a.f32524f;
                aVar.z(i15);
                break;
            default:
                int i17 = com.garmin.android.apps.connectmobile.contacts.edit.a.f32524f;
                aVar.z(i15);
                break;
        }
        return Unit.INSTANCE;
    }
}
