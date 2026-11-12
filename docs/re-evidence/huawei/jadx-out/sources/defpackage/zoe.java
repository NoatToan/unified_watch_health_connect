package defpackage;

import lib.android.paypal.com.magnessdk.c;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworking;
import lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactory;

/* JADX INFO: loaded from: classes46.dex */
public final class zoe implements MagnesNetworkingFactory {

    static /* synthetic */ class a {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[c.h.b.values().length];
            e = iArr;
            try {
                iArr[c.h.b.GET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[c.h.b.POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // lib.android.paypal.com.magnessdk.network.base.MagnesNetworkingFactory
    public MagnesNetworking createHttpClient(c.h.b bVar) throws Exception {
        int i = a.e[bVar.ordinal()];
        if (i != 1) {
            return i != 2 ? new zob() : new zob();
        }
        return new zod();
    }
}
