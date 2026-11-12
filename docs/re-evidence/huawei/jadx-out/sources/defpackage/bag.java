package defpackage;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import com.huawei.android.appbundle.splitinstall.SplitSessionLoader;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes22.dex */
public final class bag {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final AtomicReference<SplitSessionLoader> f882c = new AtomicReference<>();

    static SplitSessionLoader d() {
        return f882c.get();
    }

    public static void c(SplitSessionLoader splitSessionLoader) {
        LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(f882c, null, splitSessionLoader);
    }
}
