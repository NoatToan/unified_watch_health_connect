package kotlinx.coroutines.channels;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a%\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00010\u0001H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a'\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u0005H\u0082\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0016\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0016\u0010\u000b\u001a\u00020\b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\n\"\u001c\u0010\r\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u000f\u0010\u0010\"\u001c\u0010\u0011\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u0012\u0004\b\u0012\u0010\u0010\"\u001c\u0010\u0013\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u0012\u0004\b\u0014\u0010\u0010\"\u001c\u0010\u0015\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u0012\u0004\b\u0016\u0010\u0010\"\u001c\u0010\u0017\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u0012\u0004\b\u0018\u0010\u0010\"\u001c\u0010\u0019\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000e\u0012\u0004\b\u001a\u0010\u0010*(\b\u0000\u0010\u001e\"\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\u001d0\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"E", "", "Lkotlinx/coroutines/channels/ChannelResult;", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "b", "(Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Object;", "", "RECEIVE_THROWS_ON_CLOSE", LogUtil.I, "RECEIVE_RESULT", "Lkotlinx/coroutines/internal/Symbol;", "EMPTY", "Lkotlinx/coroutines/internal/Symbol;", "getEMPTY$annotations", "()V", "OFFER_SUCCESS", "getOFFER_SUCCESS$annotations", "OFFER_FAILED", "getOFFER_FAILED$annotations", "POLL_FAILED", "getPOLL_FAILED$annotations", "ENQUEUE_FAILED", "getENQUEUE_FAILED$annotations", "HANDLER_INVOKED", "getHANDLER_INVOKED$annotations", "Lkotlin/Function1;", "", "", "Handler", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1})
public final class AbstractChannelKt {
    public static final int RECEIVE_RESULT = 1;
    public static final int RECEIVE_THROWS_ON_CLOSE = 0;

    @JvmField
    @NotNull
    public static final Symbol EMPTY = new Symbol("EMPTY");

    @JvmField
    @NotNull
    public static final Symbol OFFER_SUCCESS = new Symbol("OFFER_SUCCESS");

    @JvmField
    @NotNull
    public static final Symbol OFFER_FAILED = new Symbol("OFFER_FAILED");

    @JvmField
    @NotNull
    public static final Symbol POLL_FAILED = new Symbol("POLL_FAILED");

    @JvmField
    @NotNull
    public static final Symbol ENQUEUE_FAILED = new Symbol("ENQUEUE_FAILED");

    @JvmField
    @NotNull
    public static final Symbol HANDLER_INVOKED = new Symbol("ON_CLOSE_HANDLER_INVOKED");

    private static final <E> Object a(Object obj) {
        return obj instanceof Closed ? ChannelResult.INSTANCE.m4453closedJP2dKIU(((Closed) obj).closeCause) : ChannelResult.INSTANCE.m4455successJP2dKIU(obj);
    }

    private static final <E> Object b(Closed<?> closed) {
        return ChannelResult.INSTANCE.m4453closedJP2dKIU(closed.closeCause);
    }

    public static /* synthetic */ void getEMPTY$annotations() {
    }

    public static /* synthetic */ void getENQUEUE_FAILED$annotations() {
    }

    public static /* synthetic */ void getHANDLER_INVOKED$annotations() {
    }

    public static /* synthetic */ void getOFFER_FAILED$annotations() {
    }

    public static /* synthetic */ void getOFFER_SUCCESS$annotations() {
    }

    public static /* synthetic */ void getPOLL_FAILED$annotations() {
    }
}
