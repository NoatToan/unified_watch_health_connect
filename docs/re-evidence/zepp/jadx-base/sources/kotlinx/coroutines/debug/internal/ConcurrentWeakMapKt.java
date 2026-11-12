package kotlinx.coroutines.debug.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u000e\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0002\u001a\b\u0010\u0004\u001a\u00020\u0003H\u0002\"\u0016\u0010\u0007\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0002\u0010\u0006\"\u0016\u0010\b\u001a\u00020\u00058\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0006\"\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0016\u0010\u000f\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"\u0016\u0010\u0011\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0012"}, d2 = {"", "Lkotlinx/coroutines/debug/internal/b;", "a", "", "b", "", LogUtil.I, "MAGIC", "MIN_CAPACITY", "Lkotlinx/coroutines/internal/Symbol;", "c", "Lkotlinx/coroutines/internal/Symbol;", "REHASH", GoogleApiAvailabilityLight.a, "Lkotlinx/coroutines/debug/internal/b;", "MARKED_NULL", "e", "MARKED_TRUE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1})
public final class ConcurrentWeakMapKt {
    private static final int a = -1640531527;
    private static final int b = 16;

    @NotNull
    private static final Symbol c = new Symbol("REHASH");

    @NotNull
    private static final b d = new b(null);

    @NotNull
    private static final b e = new b(Boolean.TRUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final b a(Object obj) {
        if (obj == null) {
            return d;
        }
        return Intrinsics.areEqual(obj, Boolean.TRUE) ? e : new b(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void b() {
        throw new UnsupportedOperationException("not implemented");
    }
}
