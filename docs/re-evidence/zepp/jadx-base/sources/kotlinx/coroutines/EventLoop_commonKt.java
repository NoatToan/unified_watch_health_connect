package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\"\u001c\u0010\n\u001a\u00020\u00058\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\t\"\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0016\u0010\u0010\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0016\u0010\u0012\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\r\"\u0016\u0010\u0015\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014\"\u0016\u0010\u0017\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014\"\u0016\u0010\u0019\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\"\u001c\u0010\u001c\u001a\u00020\u00058\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0007\u0012\u0004\b\u001b\u0010\t*\u001e\b\u0002\u0010\u001f\u001a\u0004\b\u0000\u0010\u001d\"\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\u0012\u0004\u0012\u00028\u00000\u001e¨\u0006 "}, d2 = {"", "timeMillis", "delayToNanos", "timeNanos", "delayNanosToMillis", "Lkotlinx/coroutines/internal/Symbol;", "a", "Lkotlinx/coroutines/internal/Symbol;", "getDISPOSED_TASK$annotations", "()V", "DISPOSED_TASK", "", "b", LogUtil.I, "SCHEDULE_OK", "c", "SCHEDULE_COMPLETED", GoogleApiAvailabilityLight.a, "SCHEDULE_DISPOSED", "e", "J", "MS_TO_NS", "f", "MAX_MS", "g", "MAX_DELAY_NS", "h", "getCLOSED_EMPTY$annotations", "CLOSED_EMPTY", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/LockFreeTaskQueueCore;", "Queue", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1})
public final class EventLoop_commonKt {
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final long e = 1000000;
    private static final long f = 9223372036854L;
    private static final long g = 4611686018427387903L;

    @NotNull
    private static final Symbol a = new Symbol("REMOVED_TASK");

    @NotNull
    private static final Symbol h = new Symbol("CLOSED_EMPTY");

    private static /* synthetic */ void a() {
    }

    private static /* synthetic */ void b() {
    }

    public static final long delayNanosToMillis(long j) {
        return j / 1000000;
    }

    public static final long delayToNanos(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= f) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
