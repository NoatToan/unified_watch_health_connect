package defpackage;

import androidx.core.util.Pools;

/* JADX INFO: loaded from: classes4.dex */
public class i0i {
    public static h0i a(i3i i3iVar, boolean z) {
        int iD = i3iVar.d();
        return new jch(i3iVar.a(), iD, new Pools.SynchronizedPool(iD));
    }
}
