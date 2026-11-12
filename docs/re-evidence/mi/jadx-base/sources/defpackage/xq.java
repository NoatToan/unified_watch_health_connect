package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lxq;", "Lu4;", "", "Lts;", "", "value", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class xq implements u4<List<? extends SnInfo>, byte[]> {
    @NotNull
    public byte[] a(@NotNull List<SnInfo> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.u4
    public /* bridge */ /* synthetic */ byte[] encode(List<? extends SnInfo> list) {
        return a((List<SnInfo>) list);
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<SnInfo> decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteBuffer byteBuffer = ByteBuffer.wrap(value);
        byte b2 = byteBuffer.get();
        boolean z = (b2 & 1) != 0;
        boolean z2 = (b2 & 2) != 0;
        boolean z3 = (b2 & 4) != 0;
        ArrayList arrayList = new ArrayList();
        if (z) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            arrayList.add(new SnInfo(gg.f18943b.a(1), z2.q(byteBuffer)));
        }
        if (z2) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            arrayList.add(new SnInfo(gg.f18943b.a(2), z2.q(byteBuffer)));
        }
        if (z3) {
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            arrayList.add(new SnInfo(gg.f18943b.a(4), z2.q(byteBuffer)));
        }
        return arrayList;
    }
}
