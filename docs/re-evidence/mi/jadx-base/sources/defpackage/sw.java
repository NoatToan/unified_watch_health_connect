package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0006\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\bJ\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0003H\u0002J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"Lsw;", "Lu4;", "", "Ltw;", "", "value", PluginDeviceInfo.FMODEL, "([Ltw;)[B", "([B)[Ltw;", "Ljava/nio/ByteBuffer;", "byteBuffer", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class sw implements u4<tw[], byte[]> {
    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull tw[] value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(value.length <= 1 ? 0 : 1);
        for (tw twVar : value) {
            byteArrayOutputStream.write(a(twVar));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
        return byteArray;
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public tw[] decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteBuffer byteBuffer = ByteBuffer.wrap(value);
        int i = (byteBuffer.get() & 1) != 0 ? 2 : 1;
        tw[] twVarArr = new tw[i];
        for (int i2 = 0; i2 < i; i2++) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            twVarArr[i2] = a(byteBuffer);
        }
        Object[] array = ArraysKt___ArraysKt.filterNotNull(twVarArr).toArray(new tw[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return (tw[]) array;
    }

    public final byte[] a(tw twVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(c3.a(twVar.getFrequencyListSize(), 1));
        Iterator<T> it = twVar.a().iterator();
        while (it.hasNext()) {
            byteArrayOutputStream.write(c3.a(((Number) it.next()).intValue(), 2));
        }
        Iterator<T> it2 = twVar.c().iterator();
        while (it2.hasNext()) {
            byteArrayOutputStream.write(c3.a(((Number) it2.next()).intValue(), 1));
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "ByteArrayOutputStream().…}\n        }.toByteArray()");
        return byteArray;
    }

    public final tw a(ByteBuffer byteBuffer) {
        byte b2 = byteBuffer.get();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < b2; i++) {
            arrayList.add(Integer.valueOf(tet.d(new byte[]{byteBuffer.get(), byteBuffer.get()}, 0, 2)));
        }
        for (int i2 = 0; i2 < b2; i2++) {
            arrayList2.add(Integer.valueOf(byteBuffer.get()));
        }
        return new tw(-1, b2, arrayList, arrayList2);
    }
}
