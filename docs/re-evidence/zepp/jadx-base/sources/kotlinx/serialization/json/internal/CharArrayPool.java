package kotlinx.serialization.json.internal;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0013"}, d2 = {"Lkotlinx/serialization/json/internal/CharArrayPool;", "", "", "take", "array", "", "release", "Lkotlin/collections/ArrayDeque;", "a", "Lkotlin/collections/ArrayDeque;", "arrays", "", "b", LogUtil.I, "charsTotal", "c", "MAX_CHARS_IN_POOL", "<init>", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 5, 1})
public final class CharArrayPool {

    @NotNull
    public static final CharArrayPool INSTANCE = new CharArrayPool();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final ArrayDeque<char[]> arrays = new ArrayDeque<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static int charsTotal;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final int MAX_CHARS_IN_POOL;

    static {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(l.toIntOrNull(System.getProperty("kotlinx.serialization.json.pool.size")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        Integer num = (Integer) objM3845constructorimpl;
        MAX_CHARS_IN_POOL = num == null ? 1048576 : num.intValue();
    }

    private CharArrayPool() {
    }

    public final void release(@NotNull char[] array) {
        synchronized (this) {
            int i = charsTotal;
            if (array.length + i < MAX_CHARS_IN_POOL) {
                charsTotal = i + array.length;
                arrays.addLast(array);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final char[] take() {
        char[] cArrRemoveLastOrNull;
        synchronized (this) {
            cArrRemoveLastOrNull = arrays.removeLastOrNull();
            if (cArrRemoveLastOrNull == null) {
                cArrRemoveLastOrNull = null;
            } else {
                charsTotal -= cArrRemoveLastOrNull.length;
            }
        }
        return cArrRemoveLastOrNull == null ? new char[128] : cArrRemoveLastOrNull;
    }
}
