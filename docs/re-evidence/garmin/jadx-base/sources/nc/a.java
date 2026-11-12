package nc;

import androidx.lifecycle.j1;
import androidx.lifecycle.u1;
import java.util.UUID;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lnc/a;", "Landroidx/lifecycle/u1;", "Landroidx/lifecycle/j1;", "handle", "<init>", "(Landroidx/lifecycle/j1;)V", "navigation-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public oc.c<d4.c> f125258b;

    public a(j1 j1Var) {
        String string = (String) j1Var.a("SaveableStateHolder_BackStackEntryKey");
        if (string == null) {
            string = UUID.randomUUID().toString();
            j1Var.f(string, "SaveableStateHolder_BackStackEntryKey");
        }
        this.f125257a = string;
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        oc.c<d4.c> cVar = this.f125258b;
        if (cVar == null) {
            p005kotlin.jvm.internal.s.m("saveableStateHolderRef");
            throw null;
        }
        d4.c cVar2 = cVar.f131147a.get();
        if (cVar2 != null) {
            cVar2.c(this.f125257a);
        }
        oc.c<d4.c> cVar3 = this.f125258b;
        if (cVar3 != null) {
            cVar3.f131147a.clear();
        } else {
            p005kotlin.jvm.internal.s.m("saveableStateHolderRef");
            throw null;
        }
    }
}
