package defpackage;

import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class l0a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24477b;
    public final boolean c;

    public l0a(lgi lgiVar, lgi lgiVar2) {
        this.f24476a = lgiVar2.a(b9p.class);
        this.f24477b = lgiVar.a(w7i.class);
        this.c = lgiVar.a(nd4.class);
    }

    public void a(List<DeferrableSurface> list) {
        if (!b() || list == null) {
            return;
        }
        Iterator<DeferrableSurface> it = list.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        zpe.a("ForceCloseDeferrableSurface", "deferrableSurface closed");
    }

    public boolean b() {
        return this.f24476a || this.f24477b || this.c;
    }
}
