package defpackage;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.huawei.android.appbundle.splitinstall.LoadedSplitFetcher;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class azx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<LoadedSplitFetcher> f860a = new AtomicReference<>(null);

    static LoadedSplitFetcher c() {
        return f860a.get();
    }

    public static void a(LoadedSplitFetcher loadedSplitFetcher) {
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(f860a, null, loadedSplitFetcher);
    }
}
