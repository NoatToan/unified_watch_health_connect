package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: renamed from: ziz, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0018\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020.H\u0002\u001a\u0018\u00109\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u000bH\u0002\u001a*\u0010;\u001a\b\u0012\u0004\u0012\u0002H<0\u001a\"\u0004\b\u0000\u0010<2\u0006\u0010=\u001a\u00020\u00032\f\u0010>\u001a\b\u0012\u0004\u0012\u0002H<0\u001aH\u0002\u001a,\u0010?\u001a \u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u0002H<0\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H<0\u001a0@\"\u0004\b\u0000\u0010<H\u0000\u001a\u0010\u0010A\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u000bH\u0002\u001aL\u0010C\u001a\u00020.\"\u0004\b\u0000\u0010D*\b\u0012\u0004\u0012\u0002HD0E2\u0006\u0010F\u001a\u0002HD2%\b\u0002\u0010G\u001a\u001f\u0012\u0013\u0012\u00110I¢\u0006\f\bJ\u0012\b\bK\u0012\u0004\b\b(L\u0012\u0004\u0012\u00020M\u0018\u00010HH\u0002¢\u0006\u0002\u0010N\"\u0010\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u000e\u0010\b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0016\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010 \u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010!\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\"\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010#\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010$\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010%\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010&\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010'\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010(\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010)\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0019\u0010*\u001a\u00020\u0003*\u00020\u00038Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\"\u0019\u0010-\u001a\u00020.*\u00020\u00038Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b/\u00100\"\u0019\u00101\u001a\u00020\u000b*\u00020\u00038Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\"\u0019\u00104\u001a\u00020\u0003*\u00020\u00038Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u0010,¨\u0006O"}, d2 = {"BUFFERED", "Lkotlinx/coroutines/internal/Symbol;", "BUFFER_END_RENDEZVOUS", "", "BUFFER_END_UNLIMITED", "CHANNEL_CLOSED", "getCHANNEL_CLOSED", "()Lkotlinx/coroutines/internal/Symbol;", "CLOSE_HANDLER_CLOSED", "CLOSE_HANDLER_INVOKED", "CLOSE_STATUS_ACTIVE", "", "CLOSE_STATUS_CANCELLATION_STARTED", "CLOSE_STATUS_CANCELLED", "CLOSE_STATUS_CLOSED", "DONE_RCV", "EB_COMPLETED_COUNTER_MASK", "EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT", "EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS", "FAILED", "INTERRUPTED_RCV", "INTERRUPTED_SEND", "IN_BUFFER", "NO_CLOSE_CAUSE", "NO_RECEIVE_RESULT", "NULL_SEGMENT", "Lkotlinx/coroutines/channels/ChannelSegment;", "", "POISONED", "RESULT_BUFFERED", "RESULT_CLOSED", "RESULT_FAILED", "RESULT_RENDEZVOUS", "RESULT_SUSPEND", "RESULT_SUSPEND_NO_WAITER", "RESUMING_BY_EB", "RESUMING_BY_RCV", "SEGMENT_SIZE", "SENDERS_CLOSE_STATUS_SHIFT", "SENDERS_COUNTER_MASK", "SUSPEND", "SUSPEND_NO_WAITER", "ebCompletedCounter", "getEbCompletedCounter", "(J)J", "ebPauseExpandBuffers", "", "getEbPauseExpandBuffers", "(J)Z", "sendersCloseStatus", "getSendersCloseStatus", "(J)I", "sendersCounter", "getSendersCounter", "constructEBCompletedAndPauseFlag", "counter", "pauseEB", "constructSendersAndCloseStatus", "closeStatus", "createSegment", ExifInterface.LONGITUDE_EAST, "id", "prev", "createSegmentFunction", "Lkotlin/reflect/KFunction2;", "initialBufferEnd", "capacity", "tryResume0", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CancellableContinuation;", "value", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "(Lkotlinx/coroutines/CancellableContinuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BUFFERED {
    private static final zja<Object> k = new zja<>(-1, null, null, 0);
    public static final int d = systemProp.e("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, null);
    private static final int h = systemProp.e("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zmh f54168a = new zmh("BUFFERED");
    private static final zmh n = new zmh("SHOULD_BUFFER");
    private static final zmh s = new zmh("S_RESUMING_BY_RCV");
    private static final zmh p = new zmh("RESUMING_BY_EB");
    private static final zmh m = new zmh("POISONED");
    private static final zmh f = new zmh("DONE_RCV");
    private static final zmh i = new zmh("INTERRUPTED_SEND");
    private static final zmh j = new zmh("INTERRUPTED_RCV");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final zmh f54170c = new zmh("CHANNEL_CLOSED");
    private static final zmh q = new zmh("SUSPEND");
    private static final zmh r = new zmh("SUSPEND_NO_WAITER");
    private static final zmh g = new zmh("FAILED");
    private static final zmh l = new zmh("NO_RECEIVE_RESULT");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final zmh f54169b = new zmh("CLOSE_HANDLER_CLOSED");
    private static final zmh e = new zmh("CLOSE_HANDLER_INVOKED");
    private static final zmh o = new zmh("NO_CLOSE_CAUSE");

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(int i2) {
        if (i2 == 0) {
            return 0L;
        }
        if (i2 != Integer.MAX_VALUE) {
            return i2;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j2, int i2) {
        return (((long) i2) << 60) + j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long e(long j2, boolean z) {
        return (z ? 4611686018427387904L : 0L) + j2;
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: ziz$e */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    final /* synthetic */ class e<E> extends zcn implements Function2<Long, zja<E>, zja<E>> {
        public static final e e = new e();

        public final zja<E> b(long j, zja<E> zjaVar) {
            return BUFFERED.b(j, zjaVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Object invoke(Long l, Object obj) {
            return b(l.longValue(), (zja) obj);
        }

        e() {
            super(2, BUFFERED.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
        }
    }

    public static final <E> KFunction<zja<E>> q() {
        return e.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> zja<E> b(long j2, zja<E> zjaVar) {
        return new zja<>(j2, zjaVar, zjaVar.b(), 0);
    }

    static /* synthetic */ boolean e(CancellableContinuation cancellableContinuation, Object obj, Function1 function1, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        return e(cancellableContinuation, obj, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> boolean e(CancellableContinuation<? super T> cancellableContinuation, T t, Function1<? super Throwable, yzc> function1) {
        Object objTryResume = cancellableContinuation.tryResume(t, null, function1);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    public static final zmh s() {
        return f54170c;
    }
}
