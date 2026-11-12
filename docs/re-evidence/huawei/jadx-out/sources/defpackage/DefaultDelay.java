package defpackage;

import kotlin.Metadata;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: renamed from: zhb, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\b\u001a\u00020\u0001H\u0002\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"DefaultDelay", "Lkotlinx/coroutines/Delay;", "getDefaultDelay$annotations", "()V", "getDefaultDelay", "()Lkotlinx/coroutines/Delay;", "defaultMainDelayOptIn", "", "initializeDefaultDelay", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class DefaultDelay {
    private static final boolean d = zme.a("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Delay f54095b = b();

    public static final Delay a() {
        return f54095b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final Delay b() {
        if (!d) {
            return zhc.d;
        }
        MainCoroutineDispatcher mainCoroutineDispatcherB = zhf.b();
        return (FAST_SERVICE_LOADER_PROPERTY_NAME.d(mainCoroutineDispatcherB) || !(mainCoroutineDispatcherB instanceof Delay)) ? zhc.d : (Delay) mainCoroutineDispatcherB;
    }
}
