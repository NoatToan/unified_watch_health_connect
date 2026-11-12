package y9;

import android.os.Bundle;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: y9.a$a, reason: collision with other inner class name */
    public interface InterfaceC3632a<D> {
        androidx.loader.content.b<D> onCreateLoader(int i14, Bundle bundle);

        void onLoadFinished(androidx.loader.content.b<D> bVar, D d14);

        void onLoaderReset(androidx.loader.content.b<D> bVar);
    }

    public static b a(n0 n0Var) {
        return new b(n0Var, ((ViewModelStoreOwner) n0Var).getViewModelStore());
    }

    public abstract androidx.loader.content.b b(int i14, InterfaceC3632a interfaceC3632a);
}
