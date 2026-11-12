package qr2;

import org.slf4j.Logger;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements u03.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f146932b;

    public /* synthetic */ b(d dVar, int i14) {
        this.f146931a = i14;
        this.f146932b = dVar;
    }

    @Override // u03.a
    public final void run() {
        int i14 = this.f146931a;
        d dVar = this.f146932b;
        switch (i14) {
            case 0:
                Logger logger = d.f146935v;
                dVar.A4(d.c.CREATE_NEW_OWNER_DATA, null);
                break;
            case 1:
                dVar.f146947l.m(Boolean.FALSE);
                dVar.A4(d.c.WALLET_RESET, null);
                break;
            default:
                dVar.f146946k.m(d.c.PASSCODE_CONFIRMED);
                dVar.f146938c.k(dVar.f146936a);
                break;
        }
    }
}
