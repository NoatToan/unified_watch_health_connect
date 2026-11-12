package kotlinx.coroutines;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlinx.coroutines.internal.Symbol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\u001a\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0000\"\u001c\u0010\b\u001a\u00020\u00038\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007\"\u001c\u0010\t\u001a\u00020\u00038\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u0010\u0005\u0012\u0004\b\n\u0010\u0007\"\u001c\u0010\r\u001a\u00020\u00038\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0005\u0012\u0004\b\f\u0010\u0007\"\u001c\u0010\u0010\u001a\u00020\u00038\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u0012\u0004\b\u000f\u0010\u0007\"\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"\u0016\u0010\u0016\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u0016\u0010\u0018\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013\"\u001c\u0010\u001b\u001a\u00020\u00038\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0005\u0012\u0004\b\u001a\u0010\u0007\"\u001c\u0010 \u001a\u00020\u001c8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b\u001f\u0010\u0007\"\u001c\u0010#\u001a\u00020\u001c8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u0012\u0004\b\"\u0010\u0007¨\u0006$"}, d2 = {"", "boxIncomplete", "unboxState", "Lkotlinx/coroutines/internal/Symbol;", "a", "Lkotlinx/coroutines/internal/Symbol;", "getCOMPLETING_ALREADY$annotations", "()V", "COMPLETING_ALREADY", "COMPLETING_WAITING_CHILDREN", "getCOMPLETING_WAITING_CHILDREN$annotations", "b", "getCOMPLETING_RETRY$annotations", "COMPLETING_RETRY", "c", "getTOO_LATE_TO_CANCEL$annotations", "TOO_LATE_TO_CANCEL", "", GoogleApiAvailabilityLight.a, LogUtil.I, "RETRY", "e", "FALSE", "f", "TRUE", "g", "getSEALED$annotations", "SEALED", "Lkotlinx/coroutines/n;", "h", "Lkotlinx/coroutines/n;", "getEMPTY_NEW$annotations", "EMPTY_NEW", "i", "getEMPTY_ACTIVE$annotations", "EMPTY_ACTIVE", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1})
public final class JobSupportKt {
    private static final int d = -1;
    private static final int e = 0;
    private static final int f = 1;

    @NotNull
    private static final Symbol a = new Symbol("COMPLETING_ALREADY");

    @JvmField
    @NotNull
    public static final Symbol COMPLETING_WAITING_CHILDREN = new Symbol("COMPLETING_WAITING_CHILDREN");

    @NotNull
    private static final Symbol b = new Symbol("COMPLETING_RETRY");

    @NotNull
    private static final Symbol c = new Symbol("TOO_LATE_TO_CANCEL");

    @NotNull
    private static final Symbol g = new Symbol("SEALED");

    @NotNull
    private static final n h = new n(false);

    @NotNull
    private static final n i = new n(true);

    private static /* synthetic */ void a() {
    }

    private static /* synthetic */ void b() {
    }

    @Nullable
    public static final Object boxIncomplete(@Nullable Object obj) {
        return obj instanceof Incomplete ? new o((Incomplete) obj) : obj;
    }

    private static /* synthetic */ void c() {
    }

    private static /* synthetic */ void d() {
    }

    private static /* synthetic */ void e() {
    }

    private static /* synthetic */ void f() {
    }

    public static /* synthetic */ void getCOMPLETING_WAITING_CHILDREN$annotations() {
    }

    @Nullable
    public static final Object unboxState(@Nullable Object obj) {
        o oVar = obj instanceof o ? (o) obj : null;
        return oVar == null ? obj : oVar.state;
    }
}
