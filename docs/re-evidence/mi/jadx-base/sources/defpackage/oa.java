package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Loa;", "Loq;", "Lfv;", "", "Lol;", "originResponse", PluginDeviceInfo.FMODEL, "value", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class oa implements oq<TransferResponse, byte[]> {
    @Override // defpackage.oq
    @NotNull
    public ol<TransferResponse> a(@NotNull ol<byte[]> originResponse) {
        Object objM886constructorimpl;
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
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(new fu(decode(y2.a((byte[]) ((fu) originResponse).a()))));
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

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull TransferResponse value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: 不编码");
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public TransferResponse decode(@NotNull byte[] value) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(value, "value");
        w2 w2Var = new w2(value, 0, 2, null);
        int iC = w2Var.c();
        int iC2 = w2Var.c();
        try {
            Result.Companion companion = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(Integer.valueOf(w2.b(w2Var, 0, 1, null)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m889exceptionOrNullimpl(objM886constructorimpl) != null) {
            objM886constructorimpl = 0;
        }
        return new TransferResponse(iC, iC2, ((Number) objM886constructorimpl).intValue());
    }
}
