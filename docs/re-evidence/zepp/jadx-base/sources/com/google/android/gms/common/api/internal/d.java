package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes3.dex */
final class d extends l {
    private final Map<Api.Client, e> b;
    public final /* synthetic */ zaaf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zaaf zaafVar, Map<Api.Client, e> map) {
        super(zaafVar, null);
        this.c = zaafVar;
        this.b = map;
    }

    @Override // com.google.android.gms.common.api.internal.l
    @GuardedBy("mLock")
    @WorkerThread
    public final void a() {
        com.google.android.gms.common.internal.zaj zajVar = new com.google.android.gms.common.internal.zaj(this.c.d);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.b.keySet()) {
            if (!client.requiresGooglePlayServices() || this.b.get(client).c) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int iZaa = -1;
        int i = 0;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                iZaa = zajVar.zaa(this.c.c, (Api.Client) obj);
                if (iZaa != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                iZaa = zajVar.zaa(this.c.c, (Api.Client) obj2);
                if (iZaa == 0) {
                    break;
                }
            }
        }
        if (iZaa != 0) {
            this.c.a.c(new g(this, this.c, new ConnectionResult(iZaa, null)));
            return;
        }
        if (this.c.m && this.c.k != null) {
            this.c.k.zab();
        }
        for (Api.Client client2 : this.b.keySet()) {
            e eVar = this.b.get(client2);
            if (!client2.requiresGooglePlayServices() || zajVar.zaa(this.c.c, client2) == 0) {
                client2.connect(eVar);
            } else {
                this.c.a.c(new f(this, this.c, eVar));
            }
        }
    }
}
