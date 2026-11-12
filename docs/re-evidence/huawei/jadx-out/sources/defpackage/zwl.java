package defpackage;

import org.eclipse.californium.core.network.serialization.DataSerializer;

/* JADX INFO: loaded from: classes20.dex */
public final class zwl extends DataSerializer {
    @Override // org.eclipse.californium.core.network.serialization.DataSerializer
    public void serializeHeader(zzl zzlVar, zwj zwjVar) {
        if (zwjVar.d() < 13) {
            zzlVar.d(zwjVar.d(), 4);
            zzlVar.d(zwjVar.e().c(), 4);
        } else if (zwjVar.d() < 269) {
            zzlVar.d(13, 4);
            zzlVar.d(zwjVar.e().c(), 4);
            zzlVar.d(zwjVar.d() - 13, 8);
        } else if (zwjVar.d() < 65805) {
            zzlVar.d(14, 4);
            zzlVar.d(zwjVar.e().c(), 4);
            zzlVar.d(zwjVar.d() - 269, 16);
        } else {
            zzlVar.d(15, 4);
            zzlVar.d(zwjVar.e().c(), 4);
            zzlVar.d(zwjVar.d() - 65805, 32);
        }
        zzlVar.d(zwjVar.c(), 8);
        zzlVar.a(zwjVar.e().d());
    }
}
