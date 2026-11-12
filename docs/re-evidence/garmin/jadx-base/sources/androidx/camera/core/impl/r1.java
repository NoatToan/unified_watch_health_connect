package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class r1 implements b0.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5731b;

    public r1(int i14) {
        this.f5731b = i14;
    }

    @Override // b0.p
    public final ArrayList a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b0.r rVar = (b0.r) it.next();
            k7.h.b(rVar instanceof k0, "The camera info doesn't contain internal implementation.");
            if (rVar.b() == this.f5731b) {
                arrayList.add(rVar);
            }
        }
        return arrayList;
    }
}
