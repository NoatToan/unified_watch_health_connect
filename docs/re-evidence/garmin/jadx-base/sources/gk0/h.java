package gk0;

import android.content.Context;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.framework.garminonline.query.TransactionStatusException;
import f12.l;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public class h extends k {

    public class a implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ gk0.a f77727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ gk0.b f77728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f77729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ c f77730d;

        public a(gk0.a aVar, gk0.b bVar, Context context, c cVar) {
            this.f77727a = aVar;
            this.f77728b = bVar;
            this.f77729c = context;
            this.f77730d = cVar;
        }
    }

    public class b implements hb2.b<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f77731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f77732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f77733c;

        public b(c cVar, Context context, i iVar) {
            this.f77731a = cVar;
            this.f77732b = context;
            this.f77733c = iVar;
        }

        @Override // hb2.b
        public final void a(hb2.a<? extends Object> aVar) {
            TransactionStatusException transactionStatusException;
            try {
                this.f77731a.b(aVar.f82775d.get());
            } catch (Exception e4) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(e4);
                for (Throwable cause = e4.getCause(); cause != null && !arrayList.contains(cause); cause = cause.getCause()) {
                    arrayList.add(cause);
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        transactionStatusException = null;
                        break;
                    }
                    Throwable th3 = (Throwable) it.next();
                    if (th3 instanceof TransactionStatusException) {
                        transactionStatusException = (TransactionStatusException) th3;
                        break;
                    }
                }
                i iVar = this.f77733c;
                if (transactionStatusException == null) {
                    ((a) iVar).f77730d.a(e4);
                    return;
                }
                if (transactionStatusException.getErrorCode() != 105) {
                    ((a) iVar).f77730d.a(e4);
                    return;
                }
                StringBuilder sb3 = new StringBuilder("GCS user transaction key [");
                l.f68084a.getClass();
                sb3.append(l.a.a().F0());
                sb3.append("] has expired. Signing in user with tokens to get new transaction ID...");
                i2.n("ExpiredTransactionID", sb3.toString());
                k.a(this.f77732b, iVar);
            }
        }
    }

    public static void b(gk0.a aVar, gk0.b bVar, Context context, c cVar) {
        Context applicationContext = context.getApplicationContext();
        a aVar2 = new a(aVar, bVar, applicationContext, cVar);
        l.f68084a.getClass();
        if (TextUtils.isEmpty(l.a.a().F0())) {
            k.a(context, aVar2);
            return;
        }
        hb2.a aVar3 = new hb2.a(bVar, null);
        aVar3.a(new b(cVar, applicationContext, aVar2));
        aVar3.b();
    }
}
