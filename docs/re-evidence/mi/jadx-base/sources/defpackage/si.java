package defpackage;

import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lsi;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "T", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface si<T extends Settings> {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        @Nullable
        public static <T extends Settings> IPrimaryData a(@NotNull si<T> siVar, @NotNull ByteBuffer byteBuffer, boolean z, int i) {
            Intrinsics.checkNotNullParameter(byteBuffer, "byteBuffer");
            byte b2 = byteBuffer.get();
            if (b2 == 1) {
                return z2.e(byteBuffer, z);
            }
            if (b2 == 2) {
                return z2.d(byteBuffer, z);
            }
            if (b2 == 11) {
                return z2.m(byteBuffer);
            }
            if (b2 == 16) {
                return z2.b(byteBuffer, z);
            }
            if (b2 == 17) {
                return z2.a(byteBuffer, z);
            }
            if (b2 == 32) {
                return z2.f(byteBuffer, z);
            }
            if (b2 == 33) {
                return z2.g(byteBuffer, z);
            }
            if (b2 == 48) {
                return z2.r(byteBuffer);
            }
            if (b2 == 64) {
                return z2.s(byteBuffer);
            }
            if (b2 == 80) {
                return z2.n(byteBuffer);
            }
            return null;
        }
    }
}
