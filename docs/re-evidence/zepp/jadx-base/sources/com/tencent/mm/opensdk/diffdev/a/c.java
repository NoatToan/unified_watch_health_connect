package com.tencent.mm.opensdk.diffdev.a;

import com.tencent.mm.opensdk.diffdev.OAuthListener;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes18.dex */
final class c implements Runnable {
    public final /* synthetic */ b g;

    public c(b bVar) {
        this.g = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.g.f.c);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((OAuthListener) it2.next()).onQrcodeScanned();
        }
    }
}
