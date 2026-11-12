package com.huawei.agconnect.apms;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class stu implements Runnable {
    public final /* synthetic */ vwx abc;

    public stu(vwx vwxVar) {
        this.abc = vwxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashSet hashSet;
        if (this.abc.cde.get()) {
            vwx vwxVar = this.abc;
            synchronized (vwxVar.bcd) {
                hashSet = new HashSet(vwxVar.bcd);
            }
            new qrs(vwxVar);
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((rst) it.next()).mno();
            }
            this.abc.cde.set(false);
        }
    }
}
