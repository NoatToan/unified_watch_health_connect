package androidx.camera.core.impl;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements e0.a {
    @Override // androidx.camera.core.impl.e0.a
    public final int a(ArrayList arrayList) {
        h hVar = e0.f5531a;
        if (arrayList.contains(35)) {
            return 35;
        }
        if (arrayList.contains(256)) {
            return 256;
        }
        return arrayList.contains(4101) ? 4101 : 0;
    }
}
