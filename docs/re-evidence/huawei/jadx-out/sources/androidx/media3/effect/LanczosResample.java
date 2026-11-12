package androidx.media3.effect;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Size;

/* JADX INFO: loaded from: classes21.dex */
public final class LanczosResample implements GlEffect {
    private static final float DEFAULT_RADIUS = 3.0f;
    private final int height;
    private final float radius;
    private final int width;

    public static LanczosResample scaleToFit(int i, int i2) {
        Assertions.checkArgument(i > 0);
        Assertions.checkArgument(i2 > 0);
        return new LanczosResample(3.0f, i, i2);
    }

    private LanczosResample(float f, int i, int i2) {
        this.radius = f;
        this.width = i;
        this.height = i2;
    }

    @Override // androidx.media3.effect.GlEffect
    public GlShaderProgram toGlShaderProgram(Context context, boolean z) throws VideoFrameProcessingException {
        return new SeparableConvolutionShaderProgram(context, z, new LanczosResampleScaledFunctionProvider(this.radius, this.width, this.height));
    }

    static class LanczosResampleScaledFunctionProvider implements ConvolutionFunction1D.Provider {
        private static final float SCALE_UNSET = -3.4028235E38f;
        private final int height;
        private final float radius;
        private float scale;
        private final int width;

        private LanczosResampleScaledFunctionProvider(float f, int i, int i2) {
            Assertions.checkArgument(f > 0.0f);
            Assertions.checkArgument(i > 0);
            Assertions.checkArgument(i2 > 0);
            this.radius = f;
            this.width = i;
            this.height = i2;
            this.scale = -3.4028235E38f;
        }

        @Override // androidx.media3.effect.ConvolutionFunction1D.Provider
        public ConvolutionFunction1D getConvolution(long j) {
            return new ScaledLanczosFunction(this.radius, Math.min(this.scale, 1.0f));
        }

        @Override // androidx.media3.effect.ConvolutionFunction1D.Provider
        public Size configure(Size size) {
            Assertions.checkArgument(size.getWidth() > 0);
            Assertions.checkArgument(size.getHeight() > 0);
            if (size.getHeight() * this.width <= this.height * size.getWidth()) {
                this.scale = this.width / size.getWidth();
                return new Size(this.width, Math.round(size.getHeight() * this.scale));
            }
            this.scale = this.height / size.getHeight();
            return new Size(Math.round(size.getWidth() * this.scale), this.height);
        }
    }
}
