package rt1;

import androidx.lifecycle.u1;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;
import p13.c0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrt1/i;", "Landroidx/lifecycle/u1;", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.b f154539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gu1.b f154540b;

    public i() {
        uw1.b.f172999a.getClass();
        this.f154539a = new uw1.b();
        this.f154540b = gu1.b.a.a(gu1.b.f79047b);
    }

    public static final ArrayList x4(i iVar, List... listArr) {
        iVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            if (list != null && !list.isEmpty()) {
                arrayList.addAll(list);
            }
        }
        if (arrayList.size() > 1) {
            c0.u(arrayList, new g());
        }
        return arrayList;
    }
}
