package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¨\u0006\n"}, d2 = {"Ljs;", "Loq;", "Ll9;", "", "value", PluginDeviceInfo.FMODEL, "Lol;", "originResponse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class js implements oq<l9, byte[]> {
    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull l9 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: 无需编码");
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public l9 decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return im.c.a(ArraysKt___ArraysKt.first(value));
    }

    @Override // defpackage.oq
    @NotNull
    public ol<l9> a(@NotNull ol<byte[]> originResponse) {
        Intrinsics.checkNotNullParameter(originResponse, "originResponse");
        if (originResponse instanceof Timeout) {
            return new Timeout(null, 1, null);
        }
        if (originResponse instanceof Failure) {
            return new Failure(((Failure) originResponse).getMsg(), 0, 2, null);
        }
        if (!(originResponse instanceof fu)) {
            return ol.a.a(ol.f29263a, "未知错误类型", 0, 2, null);
        }
        l9 l9VarDecode = decode(y2.b((byte[]) ((fu) originResponse).a()));
        if (l9VarDecode instanceof im.d) {
            return ol.f29263a.a(l9VarDecode);
        }
        return ol.f29263a.a(l9VarDecode.getDesc(), l9VarDecode.getF24791a());
    }
}
