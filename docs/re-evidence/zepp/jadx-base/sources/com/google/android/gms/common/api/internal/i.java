package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class i extends l {
    private final ArrayList<Api.Client> b;
    private final /* synthetic */ zaaf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zaaf zaafVar, ArrayList<Api.Client> arrayList) {
        super(zaafVar, null);
        this.c = zaafVar;
        this.b = arrayList;
    }

    @Override // com.google.android.gms.common.api.internal.l
    @WorkerThread
    public final void a() {
        this.c.a.n.p = this.c.A();
        ArrayList<Api.Client> arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Api.Client client = arrayList.get(i);
            i++;
            client.getRemoteService(this.c.o, this.c.a.n.p);
        }
    }
}
