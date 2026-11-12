package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lfw;", "Lu4;", "", "", "value", PluginDeviceInfo.FMODEL, "([B)Ljava/lang/Integer;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class fw implements u4<Integer, byte[]> {
    @NotNull
    public byte[] a(int value) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.u4
    public /* bridge */ /* synthetic */ byte[] encode(Integer num) {
        return a(num.intValue());
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Byte bFirstOrNull = ArraysKt___ArraysKt.firstOrNull(value);
        Integer numValueOf = bFirstOrNull != null ? Integer.valueOf(bFirstOrNull.byteValue()) : null;
        return Integer.valueOf(numValueOf != null ? numValueOf.intValue() : 1);
    }
}
