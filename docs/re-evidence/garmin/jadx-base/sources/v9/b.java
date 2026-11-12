package v9;

import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.u1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.x1;
import androidx.lifecycle.y;
import androidx.lifecycle.y1;
import k23.d;
import p3.m;
import p3.n;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    public static final u1 a(d dVar, ViewModelStoreOwner viewModelStoreOwner, String str, x1.c cVar, CreationExtras creationExtras, m mVar) {
        x1 x1VarC;
        p3.x1 x1Var = n.f135158a;
        if (cVar != null) {
            x1.b bVar = x1.f8070b;
            y1 viewModelStore = viewModelStoreOwner.getViewModelStore();
            bVar.getClass();
            x1VarC = x1.b.a(viewModelStore, cVar, creationExtras);
        } else if (viewModelStoreOwner instanceof y) {
            x1.b bVar2 = x1.f8070b;
            y1 viewModelStore2 = viewModelStoreOwner.getViewModelStore();
            x1.c defaultViewModelProviderFactory = ((y) viewModelStoreOwner).getDefaultViewModelProviderFactory();
            bVar2.getClass();
            x1VarC = x1.b.a(viewModelStore2, defaultViewModelProviderFactory, creationExtras);
        } else {
            x1VarC = x1.b.c(x1.f8070b, viewModelStoreOwner, null, 6);
        }
        if (str == null) {
            return x1VarC.b(dVar);
        }
        dVar.getClass();
        return x1VarC.f8072a.a(str, dVar);
    }
}
