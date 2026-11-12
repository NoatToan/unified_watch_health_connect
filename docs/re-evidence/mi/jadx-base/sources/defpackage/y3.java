package defpackage;

import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ly3;", "", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface y3 {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public static void a(@NotNull y3 y3Var, @NotNull Progress progress) {
            Intrinsics.checkNotNullParameter(progress, "progress");
        }

        public static void a(@NotNull y3 y3Var, @NotNull ChannelResponse error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        public static void a(@NotNull y3 y3Var, @NotNull byte[] bytes) {
            Intrinsics.checkNotNullParameter(bytes, "bytes");
        }
    }
}
