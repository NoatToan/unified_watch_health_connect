package coil.size;

import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"SizeResolver", "Lcoil/size/SizeResolver;", MediaStoreUtil.MediaInfo.SIZE, "Lcoil/size/Size;", "create", "coil-base_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
@JvmName(name = "SizeResolvers")
public final class SizeResolvers {
    @JvmName(name = "create")
    @NotNull
    public static final SizeResolver create(@NotNull Size size) {
        return new RealSizeResolver(size);
    }
}
