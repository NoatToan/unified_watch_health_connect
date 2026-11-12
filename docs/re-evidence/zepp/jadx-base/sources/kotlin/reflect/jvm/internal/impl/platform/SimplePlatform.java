package kotlin.reflect.jvm.internal.impl.platform;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class SimplePlatform {

    @NotNull
    private final String a;

    @NotNull
    private final TargetPlatformVersion b;

    @NotNull
    public String getTargetName() {
        return getTargetPlatformVersion().getDescription();
    }

    @NotNull
    public TargetPlatformVersion getTargetPlatformVersion() {
        return this.b;
    }

    @NotNull
    public String toString() {
        String targetName = getTargetName();
        if (!(targetName.length() > 0)) {
            return this.a;
        }
        return this.a + " (" + targetName + ')';
    }
}
