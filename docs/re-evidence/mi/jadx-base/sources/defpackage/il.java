package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lil;", "Lu4;", "", "Lel;", "", "value", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class il implements u4<List<? extends MemberCard>, byte[]> {
    @NotNull
    public byte[] a(@NotNull List<MemberCard> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.u4
    public /* bridge */ /* synthetic */ byte[] encode(List<? extends MemberCard> list) {
        return a((List<MemberCard>) list);
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<MemberCard> decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        ByteBuffer byteBuffer = ByteBuffer.wrap(value).order(ByteOrder.LITTLE_ENDIAN);
        byte b2 = byteBuffer.get();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b2; i++) {
            MemberCard.a aVar = MemberCard.z;
            Intrinsics.checkNotNullExpressionValue(byteBuffer, "byteBuffer");
            arrayList.add(aVar.a(byteBuffer));
        }
        return arrayList;
    }
}
