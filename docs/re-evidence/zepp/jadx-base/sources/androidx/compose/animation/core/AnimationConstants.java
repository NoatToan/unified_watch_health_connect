package androidx.compose.animation.core;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/animation/core/AnimationConstants;", "", "", "DefaultDurationMillis", LogUtil.I, "", "UnspecifiedTime", "J", "<init>", "()V", "animation-core_release"}, k = 1, mv = {1, 5, 1})
public final class AnimationConstants {
    public static final int $stable = 0;
    public static final int DefaultDurationMillis = 300;

    @NotNull
    public static final AnimationConstants INSTANCE = new AnimationConstants();
    public static final long UnspecifiedTime = Long.MIN_VALUE;

    private AnimationConstants() {
    }
}
