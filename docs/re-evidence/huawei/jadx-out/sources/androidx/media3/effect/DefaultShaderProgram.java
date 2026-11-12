package androidx.media3.effect;

import android.content.Context;
import android.graphics.Gainmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.GlProgram;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class DefaultShaderProgram extends BaseGlShaderProgram implements ExternalShaderProgram, RepeatingGainmapShaderProgram {
    private static final String FRAGMENT_SHADER_COPY_PATH = "shaders/fragment_shader_copy_es2.glsl";
    private static final String FRAGMENT_SHADER_OETF_ES3_PATH = "shaders/fragment_shader_oetf_es3.glsl";
    private static final String FRAGMENT_SHADER_TRANSFORMATION_EXTERNAL_YUV_ES3_PATH = "shaders/fragment_shader_transformation_external_yuv_es3.glsl";
    private static final String FRAGMENT_SHADER_TRANSFORMATION_HDR_INTERNAL_ES3_PATH = "shaders/fragment_shader_transformation_hdr_internal_es3.glsl";
    private static final String FRAGMENT_SHADER_TRANSFORMATION_PATH = "shaders/fragment_shader_transformation_es2.glsl";
    private static final String FRAGMENT_SHADER_TRANSFORMATION_SDR_EXTERNAL_PATH = "shaders/fragment_shader_transformation_sdr_external_es2.glsl";
    private static final String FRAGMENT_SHADER_TRANSFORMATION_SDR_INTERNAL_PATH = "shaders/fragment_shader_transformation_sdr_internal_es2.glsl";
    private static final String FRAGMENT_SHADER_TRANSFORMATION_SDR_OETF_ES2_PATH = "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl";
    private static final String FRAGMENT_SHADER_TRANSFORMATION_ULTRA_HDR_ES3_PATH = "shaders/fragment_shader_transformation_ultra_hdr_es3.glsl";
    private static final String VERTEX_SHADER_TRANSFORMATION_ES3_PATH = "shaders/vertex_shader_transformation_es3.glsl";
    private static final String VERTEX_SHADER_TRANSFORMATION_PATH = "shaders/vertex_shader_transformation_es2.glsl";
    private final float[] compositeRgbMatrixArray;
    private final float[] compositeTransformationMatrixArray;
    private int gainmapTexId;
    private final GlProgram glProgram;
    private boolean isRepeatingFrameDrawn;
    private Gainmap lastGainmap;
    private final ImmutableList<GlMatrixTransformation> matrixTransformations;
    private int outputColorTransfer;
    private final ImmutableList<RgbMatrix> rgbMatrices;
    private final float[][] rgbMatrixCache;
    private boolean shouldRepeatLastFrame;
    private final float[] tempResultMatrix;
    private final float[][] transformationMatrixCache;
    private final boolean useHdr;
    private ImmutableList<float[]> visiblePolygon;
    private static final ImmutableList<float[]> NDC_SQUARE = ImmutableList.of(new float[]{-1.0f, -1.0f, 0.0f, 1.0f}, new float[]{-1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, 1.0f, 0.0f, 1.0f}, new float[]{1.0f, -1.0f, 0.0f, 1.0f});
    private static final float[] BT2020_FULL_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX = {1.0f, 1.0f, 1.0f, 0.0f, -0.1646f, 1.8814f, 1.4746f, -0.5714f, 0.0f};
    private static final float[] BT2020_LIMITED_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX = {1.1689f, 1.1689f, 1.1689f, 0.0f, -0.1881f, 2.1502f, 1.6853f, -0.653f, 0.0f};

    public static DefaultShaderProgram create(Context context, List<GlMatrixTransformation> list, List<RgbMatrix> list2, boolean z) throws VideoFrameProcessingException {
        String str;
        if (list2.isEmpty()) {
            str = FRAGMENT_SHADER_COPY_PATH;
        } else {
            str = FRAGMENT_SHADER_TRANSFORMATION_PATH;
        }
        return new DefaultShaderProgram(createGlProgram(context, VERTEX_SHADER_TRANSFORMATION_PATH, str), ImmutableList.copyOf((Collection) list), ImmutableList.copyOf((Collection) list2), 1, z);
    }

    public static DefaultShaderProgram createWithInternalSampler(Context context, ColorInfo colorInfo, ColorInfo colorInfo2, int i, int i2) throws VideoFrameProcessingException {
        String str;
        String str2;
        Assertions.checkState(colorInfo.colorTransfer != 2 || i2 == 2);
        boolean zIsTransferHdr = ColorInfo.isTransferHdr(colorInfo);
        boolean z = i2 == 2 && colorInfo2.colorSpace == 6;
        if (zIsTransferHdr || z) {
            str = VERTEX_SHADER_TRANSFORMATION_ES3_PATH;
        } else {
            str = VERTEX_SHADER_TRANSFORMATION_PATH;
        }
        if (z) {
            str2 = FRAGMENT_SHADER_TRANSFORMATION_ULTRA_HDR_ES3_PATH;
        } else if (zIsTransferHdr) {
            str2 = FRAGMENT_SHADER_TRANSFORMATION_HDR_INTERNAL_ES3_PATH;
        } else {
            str2 = FRAGMENT_SHADER_TRANSFORMATION_SDR_INTERNAL_PATH;
        }
        GlProgram glProgramCreateGlProgram = createGlProgram(context, str, str2);
        if (!z) {
            Assertions.checkArgument(zIsTransferHdr || colorInfo.colorTransfer == 2 || colorInfo.colorTransfer == 3);
            glProgramCreateGlProgram.setIntUniform("uInputColorTransfer", colorInfo.colorTransfer);
        }
        if (zIsTransferHdr) {
            glProgramCreateGlProgram.setIntUniform("uApplyHdrToSdrToneMapping", colorInfo2.colorSpace == 6 ? 0 : 1);
        }
        ImmutableList immutableListOf = ImmutableList.of();
        if (i2 == 2) {
            immutableListOf = ImmutableList.of(new MatrixTransformation() { // from class: androidx.media3.effect.DefaultShaderProgram$$ExternalSyntheticLambda1
                @Override // androidx.media3.effect.MatrixTransformation
                public final Matrix getMatrix(long j) {
                    return DefaultShaderProgram.lambda$createWithInternalSampler$0(j);
                }
            });
        }
        return createWithSampler(glProgramCreateGlProgram, colorInfo, colorInfo2, i, immutableListOf);
    }

    static /* synthetic */ Matrix lambda$createWithInternalSampler$0(long j) {
        Matrix matrix = new Matrix();
        matrix.setScale(1.0f, -1.0f);
        return matrix;
    }

    public static DefaultShaderProgram createWithExternalSampler(Context context, ColorInfo colorInfo, ColorInfo colorInfo2, int i, boolean z) throws VideoFrameProcessingException {
        String str;
        String str2;
        float[] fArr;
        boolean zIsTransferHdr = ColorInfo.isTransferHdr(colorInfo);
        if (zIsTransferHdr) {
            str = VERTEX_SHADER_TRANSFORMATION_ES3_PATH;
        } else {
            str = VERTEX_SHADER_TRANSFORMATION_PATH;
        }
        if (zIsTransferHdr) {
            str2 = FRAGMENT_SHADER_TRANSFORMATION_EXTERNAL_YUV_ES3_PATH;
        } else {
            str2 = FRAGMENT_SHADER_TRANSFORMATION_SDR_EXTERNAL_PATH;
        }
        GlProgram glProgramCreateGlProgram = createGlProgram(context, str, str2);
        if (zIsTransferHdr) {
            if (!GlUtil.isYuvTargetExtensionSupported()) {
                throw new VideoFrameProcessingException("The EXT_YUV_target extension is required for HDR editing input.");
            }
            if (colorInfo.colorRange == 1) {
                fArr = BT2020_FULL_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX;
            } else {
                fArr = BT2020_LIMITED_RANGE_YUV_TO_RGB_COLOR_TRANSFORM_MATRIX;
            }
            glProgramCreateGlProgram.setFloatsUniform("uYuvToRgbColorTransform", fArr);
            glProgramCreateGlProgram.setIntUniform("uInputColorTransfer", colorInfo.colorTransfer);
            glProgramCreateGlProgram.setIntUniform("uApplyHdrToSdrToneMapping", colorInfo2.colorSpace == 6 ? 0 : 1);
        }
        glProgramCreateGlProgram.setExternalTexturesRequireNearestSampling(z);
        return createWithSampler(glProgramCreateGlProgram, colorInfo, colorInfo2, i, ImmutableList.of());
    }

    public static DefaultShaderProgram createApplyingOetf(Context context, List<GlMatrixTransformation> list, List<RgbMatrix> list2, ColorInfo colorInfo, int i) throws VideoFrameProcessingException {
        String str;
        boolean zIsTransferHdr = ColorInfo.isTransferHdr(colorInfo);
        boolean z = i == 2;
        String str2 = zIsTransferHdr ? VERTEX_SHADER_TRANSFORMATION_ES3_PATH : VERTEX_SHADER_TRANSFORMATION_PATH;
        if (zIsTransferHdr) {
            str = FRAGMENT_SHADER_OETF_ES3_PATH;
        } else if (z) {
            str = FRAGMENT_SHADER_TRANSFORMATION_SDR_OETF_ES2_PATH;
        } else if (list2.isEmpty()) {
            str = FRAGMENT_SHADER_COPY_PATH;
        } else {
            str = FRAGMENT_SHADER_TRANSFORMATION_PATH;
        }
        GlProgram glProgramCreateGlProgram = createGlProgram(context, str2, str);
        int i2 = colorInfo.colorTransfer;
        if (zIsTransferHdr) {
            Assertions.checkArgument(i2 == 7 || i2 == 6);
            glProgramCreateGlProgram.setIntUniform("uOutputColorTransfer", i2);
        } else if (z) {
            Assertions.checkArgument(i2 == 3 || i2 == 10);
            glProgramCreateGlProgram.setIntUniform("uOutputColorTransfer", i2);
        }
        return new DefaultShaderProgram(glProgramCreateGlProgram, ImmutableList.copyOf((Collection) list), ImmutableList.copyOf((Collection) list2), colorInfo.colorTransfer, zIsTransferHdr);
    }

    private static DefaultShaderProgram createWithSampler(GlProgram glProgram, ColorInfo colorInfo, ColorInfo colorInfo2, int i, ImmutableList<GlMatrixTransformation> immutableList) {
        boolean zIsTransferHdr = ColorInfo.isTransferHdr(colorInfo);
        boolean z = (colorInfo.colorSpace == 1 || colorInfo.colorSpace == 2) && colorInfo2.colorSpace == 6;
        int i2 = colorInfo2.colorTransfer;
        if (zIsTransferHdr) {
            if (i2 == 3) {
                i2 = 10;
            }
            Assertions.checkArgument(i2 == 1 || i2 == 10 || i2 == 6 || i2 == 7);
            glProgram.setIntUniform("uOutputColorTransfer", i2);
        } else if (z) {
            Assertions.checkArgument(i2 == 1 || i2 == 6 || i2 == 7);
            glProgram.setIntUniform("uOutputColorTransfer", i2);
        } else {
            glProgram.setIntUniform("uSdrWorkingColorSpace", i);
            Assertions.checkArgument(i2 == 3 || i2 == 1);
            glProgram.setIntUniform("uOutputColorTransfer", i2);
        }
        return new DefaultShaderProgram(glProgram, immutableList, ImmutableList.of(), colorInfo2.colorTransfer, zIsTransferHdr || z);
    }

    private DefaultShaderProgram(GlProgram glProgram, ImmutableList<GlMatrixTransformation> immutableList, ImmutableList<RgbMatrix> immutableList2, int i, boolean z) {
        super(z, 1);
        this.glProgram = glProgram;
        this.outputColorTransfer = i;
        this.matrixTransformations = immutableList;
        this.rgbMatrices = immutableList2;
        this.useHdr = z;
        this.transformationMatrixCache = (float[][]) Array.newInstance((Class<?>) Float.TYPE, immutableList.size(), 16);
        this.rgbMatrixCache = (float[][]) Array.newInstance((Class<?>) Float.TYPE, immutableList2.size(), 16);
        this.compositeTransformationMatrixArray = GlUtil.create4x4IdentityMatrix();
        this.compositeRgbMatrixArray = GlUtil.create4x4IdentityMatrix();
        this.tempResultMatrix = new float[16];
        this.visiblePolygon = NDC_SQUARE;
        this.gainmapTexId = -1;
    }

    private static GlProgram createGlProgram(Context context, String str, String str2) throws VideoFrameProcessingException {
        try {
            GlProgram glProgram = new GlProgram(context, str, str2);
            glProgram.setFloatsUniform("uTexTransformationMatrix", GlUtil.create4x4IdentityMatrix());
            return glProgram;
        } catch (GlUtil.GlException | IOException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.effect.ExternalShaderProgram
    public void setTextureTransformMatrix(float[] fArr) {
        this.glProgram.setFloatsUniform("uTexTransformationMatrix", fArr);
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public Size configure(int i, int i2) {
        return MatrixUtils.configureAndGetOutputSize(i, i2, this.matrixTransformations);
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public void drawFrame(int i, long j) throws VideoFrameProcessingException {
        boolean z = updateCompositeRgbMatrixArray(j) || updateCompositeTransformationMatrixAndVisiblePolygon(j);
        if (this.visiblePolygon.size() < 3) {
            return;
        }
        if (this.shouldRepeatLastFrame && !z && this.isRepeatingFrameDrawn) {
            return;
        }
        try {
            this.glProgram.use();
            setGainmapSamplerAndUniforms();
            this.glProgram.setSamplerTexIdUniform("uTexSampler", i, 0);
            this.glProgram.setFloatsUniform("uTransformationMatrix", this.compositeTransformationMatrixArray);
            this.glProgram.setFloatsUniformIfPresent("uRgbMatrix", this.compositeRgbMatrixArray);
            this.glProgram.setBufferAttribute("aFramePosition", GlUtil.createVertexBuffer(this.visiblePolygon), 4);
            this.glProgram.bindAttributesAndUniforms();
            GLES20.glDrawArrays(6, 0, this.visiblePolygon.size());
            GlUtil.checkGlError();
            this.isRepeatingFrameDrawn = true;
        } catch (GlUtil.GlException e) {
            throw new VideoFrameProcessingException(e, j);
        }
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram, androidx.media3.effect.GlShaderProgram
    public void release() throws VideoFrameProcessingException {
        super.release();
        try {
            this.glProgram.delete();
            int i = this.gainmapTexId;
            if (i != -1) {
                GlUtil.deleteTexture(i);
            }
        } catch (GlUtil.GlException e) {
            throw new VideoFrameProcessingException(e);
        }
    }

    @Override // androidx.media3.effect.GainmapShaderProgram
    public void setGainmap(Gainmap gainmap) throws GlUtil.GlException {
        if (this.useHdr) {
            Gainmap gainmap2 = this.lastGainmap;
            if (gainmap2 == null || !GainmapUtil.equals(gainmap2, gainmap)) {
                this.isRepeatingFrameDrawn = false;
                this.lastGainmap = gainmap;
                int i = this.gainmapTexId;
                if (i == -1) {
                    this.gainmapTexId = GlUtil.createTexture(gainmap.getGainmapContents());
                } else {
                    GlUtil.setTexture(i, gainmap.getGainmapContents());
                }
            }
        }
    }

    @Override // androidx.media3.effect.RepeatingFrameShaderProgram
    public void signalNewRepeatingFrameSequence() {
        Assertions.checkState(this.outputTexturePool.capacity() == 1);
        this.shouldRepeatLastFrame = true;
        this.isRepeatingFrameDrawn = false;
    }

    @Override // androidx.media3.effect.BaseGlShaderProgram
    public boolean shouldClearTextureBuffer() {
        return (this.isRepeatingFrameDrawn && this.shouldRepeatLastFrame) ? false : true;
    }

    public void setOutputColorTransfer(int i) {
        Assertions.checkState(this.outputColorTransfer != 1);
        this.outputColorTransfer = i;
        this.glProgram.setIntUniform("uOutputColorTransfer", i);
    }

    public int getOutputColorTransfer() {
        return this.outputColorTransfer;
    }

    private boolean updateCompositeTransformationMatrixAndVisiblePolygon(long j) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.matrixTransformations.size(), 16);
        for (int i = 0; i < this.matrixTransformations.size(); i++) {
            fArr[i] = this.matrixTransformations.get(i).getGlMatrixArray(j);
        }
        if (!updateMatrixCache(this.transformationMatrixCache, fArr)) {
            return false;
        }
        GlUtil.setToIdentity(this.compositeTransformationMatrixArray);
        this.visiblePolygon = NDC_SQUARE;
        for (float[] fArr2 : this.transformationMatrixCache) {
            android.opengl.Matrix.multiplyMM(this.tempResultMatrix, 0, fArr2, 0, this.compositeTransformationMatrixArray, 0);
            float[] fArr3 = this.tempResultMatrix;
            System.arraycopy(fArr3, 0, this.compositeTransformationMatrixArray, 0, fArr3.length);
            ImmutableList<float[]> immutableListClipConvexPolygonToNdcRange = MatrixUtils.clipConvexPolygonToNdcRange(MatrixUtils.transformPoints(fArr2, this.visiblePolygon));
            this.visiblePolygon = immutableListClipConvexPolygonToNdcRange;
            if (immutableListClipConvexPolygonToNdcRange.size() < 3) {
                return true;
            }
        }
        android.opengl.Matrix.invertM(this.tempResultMatrix, 0, this.compositeTransformationMatrixArray, 0);
        this.visiblePolygon = MatrixUtils.transformPoints(this.tempResultMatrix, this.visiblePolygon);
        return true;
    }

    private boolean updateCompositeRgbMatrixArray(long j) {
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, this.rgbMatrices.size(), 16);
        for (int i = 0; i < this.rgbMatrices.size(); i++) {
            fArr[i] = this.rgbMatrices.get(i).getMatrix(j, this.useHdr);
        }
        if (!updateMatrixCache(this.rgbMatrixCache, fArr)) {
            return false;
        }
        GlUtil.setToIdentity(this.compositeRgbMatrixArray);
        for (int i2 = 0; i2 < this.rgbMatrices.size(); i2++) {
            android.opengl.Matrix.multiplyMM(this.tempResultMatrix, 0, this.rgbMatrices.get(i2).getMatrix(j, this.useHdr), 0, this.compositeRgbMatrixArray, 0);
            float[] fArr2 = this.tempResultMatrix;
            System.arraycopy(fArr2, 0, this.compositeRgbMatrixArray, 0, fArr2.length);
        }
        return true;
    }

    private static boolean updateMatrixCache(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i = 0; i < fArr.length; i++) {
            float[] fArr3 = fArr[i];
            float[] fArr4 = fArr2[i];
            if (!Arrays.equals(fArr3, fArr4)) {
                Assertions.checkState(fArr4.length == 16, "A 4x4 transformation matrix must have 16 elements");
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    private void setGainmapSamplerAndUniforms() throws GlUtil.GlException {
        if (this.lastGainmap == null) {
            return;
        }
        if (Util.SDK_INT < 34) {
            throw new IllegalStateException("Gainmaps not supported under API 34.");
        }
        this.glProgram.setSamplerTexIdUniform("uGainmapTexSampler", this.gainmapTexId, 1);
        GainmapUtil.setGainmapUniforms(this.glProgram, this.lastGainmap, -1);
    }
}
