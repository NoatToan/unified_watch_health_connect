package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\b¨\u0006\u000b"}, d2 = {"Lw8;", "Lu4;", "", "Lv8;", "", "value", PluginDeviceInfo.FMODEL, "([Lv8;)[B", "([B)[Lv8;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class w8 implements u4<EQOrNR[], byte[]> {
    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull EQOrNR[] value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(value.length <= 1 ? 0 : 1);
        for (EQOrNR eQOrNR : value) {
            byteArrayOutputStream.write(eQOrNR.a());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
        return byteArray;
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EQOrNR[] decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteBuffer byteBuffer = ByteBuffer.wrap(value);
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        int i = (((short) (((short) byteBuffer.get()) & 255)) & 1) != 0 ? 2 : 1;
        EQOrNR[] eQOrNRArr = new EQOrNR[i];
        for (int i2 = 0; i2 < i; i2++) {
            EQOrNR.a aVar = EQOrNR.e;
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            eQOrNRArr[i2] = aVar.a(byteBuffer);
        }
        Object[] array = ArraysKt___ArraysKt.filterNotNull(eQOrNRArr).toArray(new EQOrNR[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (EQOrNR[]) array;
    }
}
