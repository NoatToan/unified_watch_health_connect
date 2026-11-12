package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: pq, reason: from Kotlin metadata and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0006"}, d2 = {"F", "Loq;", "", "Lol;", "originResponse", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 2, mv = {1, 7, 1})
public final class C3622pq {
    @NotNull
    public static final <F> ol<F> a(@NotNull oq<F, byte[]> oqVar, @NotNull ol<byte[]> originResponse) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(oqVar, "<this>");
        Intrinsics.checkNotNullParameter(originResponse, "originResponse");
        if (originResponse instanceof Timeout) {
            return new Timeout(null, 1, null);
        }
        if (originResponse instanceof Failure) {
            Failure failure = (Failure) originResponse;
            return new Failure(failure.getMsg(), failure.getCode());
        }
        if (!(originResponse instanceof fu)) {
            return ol.a.a(ol.f29263a, "未知错误类型", 0, 2, null);
        }
        byte[] bArrB = y2.b((byte[]) ((fu) originResponse).a());
        l9 l9VarDecode = new js().decode(bArrB);
        if (!(l9VarDecode instanceof im.d)) {
            return new Failure(l9VarDecode.getDesc(), l9VarDecode.getF24791a());
        }
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(new fu(oqVar.decode(y2.a(bArrB))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            objM886constructorimpl = new Failure("解析卡数据失败：" + thM889exceptionOrNullimpl, 0, 2, null);
        }
        return (ol) objM886constructorimpl;
    }
}
