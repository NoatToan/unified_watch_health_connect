package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H\u0016¨\u0006\u000b"}, d2 = {"Lr4;", "Loq;", "", "", "value", PluginDeviceInfo.FMODEL, "([B)Ljava/lang/Integer;", "Lol;", "originResponse", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class r4 implements oq<Integer, byte[]> {
    @NotNull
    public byte[] a(int value) {
        throw new NotImplementedError("An operation is not implemented: 无需编码");
    }

    @Override // defpackage.u4
    public /* bridge */ /* synthetic */ Object encode(Object obj) {
        return a(((Number) obj).intValue());
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return Integer.valueOf(ArraysKt___ArraysKt.first(value));
    }

    @Override // defpackage.oq
    @NotNull
    public ol<Integer> a(@NotNull ol<byte[]> originResponse) {
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
        Integer numDecode = decode(y2.b((byte[]) ((fu) originResponse).a()));
        numDecode.intValue();
        return ol.f29263a.a(numDecode);
    }
}
