package kotlinx.coroutines.android;

import android.os.Looper;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import p005kotlin.Metadata;
import p53.b;
import p53.e;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidDispatcherFactory implements MainDispatcherFactory {
    @Override // kotlinx.coroutines.internal.MainDispatcherFactory
    public final b a() {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new b(e.b(mainLooper), null, 2, null);
        }
        h.z("The main looper is not available");
        return null;
    }
}
