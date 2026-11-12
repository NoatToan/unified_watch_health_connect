package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class b implements Continuation<Void, List> {
    public final /* synthetic */ Collection a;

    public b(Collection collection) {
        this.a = collection;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* bridge */ /* synthetic */ List then(@NonNull Task<Void> task) throws Exception {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            arrayList.add(((Task) it2.next()).getResult());
        }
        return arrayList;
    }
}
