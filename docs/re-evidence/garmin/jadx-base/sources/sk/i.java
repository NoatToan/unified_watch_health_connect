package sk;

import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f159553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.b f159554b;

    public i(h.b bVar, boolean z14) {
        this.f159554b = bVar;
        this.f159553a = z14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h hVar = h.this;
        d dVar = hVar.f159541c;
        hVar.f159542d.getMacAddress();
        h.b bVar = this.f159554b;
        UUID uuid = bVar.f159550b;
        UUID uuid2 = bVar.f159551c;
        boolean z14 = this.f159553a;
        dVar.getClass();
        if (uuid2.equals(b.f159495g)) {
            dk.a aVarA = e.a(z14 ? ak.e.TRANSFER_TX_COMPLETED : ak.e.TRANSFER_TX_FAILED);
            dVar.f159521o = false;
            a.C3022a c3022a = dVar.f159509c;
            if (c3022a != null) {
                c3022a.a(bk.l.CHANNEL_EVENT, aVarA);
            }
        }
    }
}
