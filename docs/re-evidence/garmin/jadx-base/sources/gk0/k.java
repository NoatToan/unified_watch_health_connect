package gk0;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.gcsprotos.generated.Auth;
import f12.l;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes8.dex */
public class k {
    public static void a(Context context, final i iVar) {
        ((d) KoinJavaComponent.get(d.class)).d(context);
        hb2.a aVar = new hb2.a(new b(context, (f) new e(context), k.class.getSimpleName(), -1L, false, (Auth.Category) null), null);
        aVar.a(new hb2.b() { // from class: gk0.j
            @Override // hb2.b
            public final void a(hb2.a aVar2) {
                try {
                    Auth.MobileAppAuthorizeResponse mobileAppAuthorizeResponse = (Auth.MobileAppAuthorizeResponse) aVar2.f82775d.get();
                    if (mobileAppAuthorizeResponse != null) {
                        try {
                            if (!TextUtils.isEmpty(mobileAppAuthorizeResponse.getTransactionKey())) {
                                l.f68084a.getClass();
                                l.a.a().i1(mobileAppAuthorizeResponse.getTransactionKey());
                            }
                        } catch (Exception e4) {
                            i2.i("TransactionKeyManager", "Exception while trying to save user transaction key: " + e4.toString());
                        }
                    }
                } catch (Exception e14) {
                    i2.i("TransactionKeyManager", "Exception while trying to save user transaction key: " + e14.toString());
                }
                h.a aVar3 = (h.a) iVar;
                aVar3.getClass();
                StringBuilder sb3 = new StringBuilder("Using new GCS user transaction key [");
                l.f68084a.getClass();
                sb3.append(l.a.a().F0());
                sb3.append("] to recursively call [");
                a aVar4 = aVar3.f77727a;
                sb3.append(aVar4.getClass().getSimpleName());
                sb3.append("].");
                i2.n("ExpiredTransactionIDFlow", sb3.toString());
                b bVar = aVar3.f77728b;
                eb2.e eVar = bVar.f63684h;
                eVar.f63688a = l.a.a().F0();
                bVar.f63684h = eVar;
                h.b(aVar4, bVar, aVar3.f77729c, aVar3.f77730d);
            }
        });
        aVar.b();
    }
}
