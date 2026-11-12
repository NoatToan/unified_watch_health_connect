package androidx.media3.effect;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes21.dex */
public final class OverlayEffect implements GlEffect {
    private final ImmutableList<TextureOverlay> overlays;

    public OverlayEffect(ImmutableList<TextureOverlay> immutableList) {
        this.overlays = immutableList;
    }

    @Override // androidx.media3.effect.GlEffect
    public BaseGlShaderProgram toGlShaderProgram(Context context, boolean z) throws VideoFrameProcessingException {
        return new OverlayShaderProgram(context, z, this.overlays);
    }
}
