package kotlin.reflect.jvm.internal.impl.platform;

import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class PlatformUtilKt {
    @NotNull
    public static final String getPresentableDescription(@NotNull TargetPlatform targetPlatform) {
        return CollectionsKt___CollectionsKt.joinToString$default(targetPlatform.getComponentPlatforms(), FlutterActivityLaunchConfigs.DEFAULT_INITIAL_ROUTE, null, null, 0, null, null, 62, null);
    }
}
