package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\n¨\u0006\r"}, d2 = {"Ll1;", "Loq;", "Lubt;", "", "Lol;", "originResponse", PluginDeviceInfo.FMODEL, "(Lol;)Lol;", "value", "(Lubt;)[B", "([B)Lubt;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class l1 implements oq<ubt, byte[]> {
    @Override // defpackage.oq
    @NotNull
    public ol<ubt> a(@NotNull ol<byte[]> originResponse) {
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
            objM886constructorimpl = Result.m886constructorimpl(new fu(decode((byte[]) ((fu) originResponse).a())));
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
    public byte[] encode(@NotNull ubt value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: 不实现");
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ubt decode(@NotNull byte[] value) throws Exception {
        Intrinsics.checkNotNullParameter(value, "value");
        ubt ubtVarB = ubt.b(y2.a(value));
        if (ubtVarB != null) {
            return ubtVarB;
        }
        throw new Exception("解析电量信息失败(" + y2.c(y2.a(value)) + ')');
    }
}
