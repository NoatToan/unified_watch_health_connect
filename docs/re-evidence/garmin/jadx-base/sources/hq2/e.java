package hq2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.d0;
import p13.h0;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class e implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f85245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ short f85246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ iq2.c f85247d;

    public /* synthetic */ e(String str, short s8, iq2.c cVar, r rVar, int i14) {
        this.f85244a = i14;
        this.f85245b = str;
        this.f85246c = s8;
        this.f85247d = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f85244a;
        iq2.c cVar = this.f85247d;
        short s8 = this.f85246c;
        String str = this.f85245b;
        o13.p pVar = (o13.p) obj;
        switch (i14) {
            case 0:
                int i15 = g.f85248g;
                pVar.getClass();
                byte[] bArr = (byte[]) pVar.f128594a;
                byte[] bArr2 = (byte[]) pVar.f128595b;
                iq2.a aVar = new iq2.a();
                List listK = x.k(bArr, bArr2);
                ArrayList arrayList = new ArrayList();
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    d0.v(arrayList, r.t((byte[]) it.next(), aVar));
                }
                List listN0 = h0.N0(arrayList, new f());
                str.getClass();
                return new q(str, new as2.b(Short.valueOf(s8), System.currentTimeMillis()), cVar, listN0);
            default:
                int i16 = n.f85263g;
                pVar.getClass();
                byte[] bArr3 = (byte[]) pVar.f128594a;
                byte[] bArr4 = (byte[]) pVar.f128595b;
                iq2.b bVar = new iq2.b();
                List listK2 = x.k(bArr3, bArr4);
                ArrayList arrayList2 = new ArrayList();
                Iterator it3 = listK2.iterator();
                while (it3.hasNext()) {
                    d0.v(arrayList2, r.t((byte[]) it3.next(), bVar));
                }
                return new q(str, new as2.b(Short.valueOf(s8), System.currentTimeMillis()), cVar, h0.N0(arrayList2, new m()));
        }
    }
}
