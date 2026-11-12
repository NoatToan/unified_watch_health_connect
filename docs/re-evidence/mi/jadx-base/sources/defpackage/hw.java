package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lhw;", "Lu4;", "Lxv;", "", "value", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class hw implements u4<Version, byte[]> {
    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull Version value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: 暂不编码");
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Version decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(value);
        byteBufferWrap.order(ByteOrder.LITTLE_ENDIAN);
        byte b2 = byteBufferWrap.get();
        byte b3 = byteBufferWrap.get();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b3; i++) {
            b1 b1VarA = b1.u.a(byteBufferWrap.get());
            if (b1VarA != null) {
                arrayList.add(b1VarA);
            }
        }
        byte b4 = byteBufferWrap.get();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < b4; i2++) {
            arrayList2.add(Byte.valueOf(byteBufferWrap.get()));
        }
        return new Version(b2, arrayList, CollectionsKt___CollectionsKt.toByteArray(arrayList2));
    }
}
