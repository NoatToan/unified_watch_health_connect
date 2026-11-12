package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"Lvb;", "Le1;", "", PluginDeviceInfo.FICONOFFLINE, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class vb extends e1<byte[]> {
    @Override // defpackage.bi
    @NotNull
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public byte[] b() {
        byte[] byteArray = d().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "mDataStream.toByteArray()");
        return byteArray;
    }
}
