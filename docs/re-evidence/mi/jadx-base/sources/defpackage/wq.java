package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\b"}, d2 = {"Lwq;", "Lu4;", "Lgg;", "", "value", PluginDeviceInfo.FMODEL, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class wq implements u4<gg, byte[]> {
    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] encode(@NotNull gg value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new byte[]{(byte) (value.getF18944a() / 2)};
    }

    @Override // defpackage.u4
    @NotNull
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public gg decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return gg.f18943b.a(1 << ByteBuffer.wrap(value).get());
    }
}
