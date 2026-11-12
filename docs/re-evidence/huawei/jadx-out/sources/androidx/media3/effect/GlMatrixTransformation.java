package androidx.media3.effect;

import android.content.Context;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.Size;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes3.dex */
public interface GlMatrixTransformation extends GlEffect {
    float[] getGlMatrixArray(long j);

    default Size configure(int i, int i2) {
        return new Size(i, i2);
    }

    @Override // androidx.media3.effect.GlEffect
    default BaseGlShaderProgram toGlShaderProgram(Context context, boolean z) throws VideoFrameProcessingException {
        return DefaultShaderProgram.create(context, ImmutableList.of(this), ImmutableList.of(), z);
    }
}
