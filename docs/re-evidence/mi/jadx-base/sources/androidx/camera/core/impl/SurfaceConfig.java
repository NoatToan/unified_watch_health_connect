package androidx.camera.core.impl;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class SurfaceConfig {

    public enum ConfigSize {
        ANALYSIS(0),
        PREVIEW(1),
        RECORD(2),
        MAXIMUM(3),
        NOT_SUPPORT(4);

        final int mId;

        ConfigSize(int i) {
            this.mId = i;
        }

        public int getId() {
            return this.mId;
        }
    }

    public enum ConfigType {
        PRIV,
        YUV,
        JPEG,
        RAW
    }

    public static SurfaceConfig a(ConfigType configType, ConfigSize configSize) {
        return new b(configType, configSize);
    }

    public abstract ConfigSize b();

    public abstract ConfigType c();

    public final boolean d(SurfaceConfig surfaceConfig) {
        return surfaceConfig.b().getId() <= b().getId() && surfaceConfig.c() == c();
    }
}
