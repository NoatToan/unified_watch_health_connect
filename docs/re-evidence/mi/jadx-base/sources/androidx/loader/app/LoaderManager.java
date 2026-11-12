package androidx.loader.app;

import android.os.Bundle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import defpackage.rie;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public abstract class LoaderManager {

    public interface a<D> {
        rie<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(rie<D> rieVar, D d);

        void onLoaderReset(rie<D> rieVar);
    }

    public static <T extends LifecycleOwner & ViewModelStoreOwner> LoaderManager b(T t) {
        return new androidx.loader.app.a(t, t.getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> rie<D> c(int i, Bundle bundle, a<D> aVar);

    public abstract void d();
}
