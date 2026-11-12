package androidx.compose.ui.platform;

import android.graphics.Matrix;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR!\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR!\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"Landroidx/compose/ui/platform/RenderNodeMatrixCache;", "", "", "invalidate", "Landroidx/compose/ui/platform/DeviceRenderNode;", "renderNode", "Landroidx/compose/ui/graphics/Matrix;", "getMatrix-GrdbGEg", "(Landroidx/compose/ui/platform/DeviceRenderNode;)[F", "getMatrix", "getInverseMatrix-GrdbGEg", "getInverseMatrix", "Landroid/graphics/Matrix;", "oldAndroidMatrixCache", "Landroid/graphics/Matrix;", "newAndroidMatrixCache", "matrixCache", "[F", "oldInverseAndroidMatrixCache", "newInverseAndroidMatrixCache", "inverseMatrixCache", "", "isDirty", "Z", "isInverseDirty", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
final class RenderNodeMatrixCache {

    @Nullable
    private float[] inverseMatrixCache;
    private boolean isDirty = true;
    private boolean isInverseDirty = true;

    @Nullable
    private float[] matrixCache;

    @Nullable
    private Matrix newAndroidMatrixCache;

    @Nullable
    private Matrix newInverseAndroidMatrixCache;

    @Nullable
    private Matrix oldAndroidMatrixCache;

    @Nullable
    private Matrix oldInverseAndroidMatrixCache;

    @NotNull
    /* JADX INFO: renamed from: getInverseMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m2609getInverseMatrixGrdbGEg(@NotNull DeviceRenderNode renderNode) {
        float[] fArrM1376constructorimpl$default = this.inverseMatrixCache;
        if (fArrM1376constructorimpl$default == null) {
            fArrM1376constructorimpl$default = androidx.compose.ui.graphics.Matrix.m1376constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM1376constructorimpl$default;
        }
        if (!this.isInverseDirty) {
            return fArrM1376constructorimpl$default;
        }
        Matrix matrix = this.newInverseAndroidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.newInverseAndroidMatrixCache = matrix;
        }
        renderNode.getInverseMatrix(matrix);
        if (!Intrinsics.areEqual(this.oldInverseAndroidMatrixCache, matrix)) {
            AndroidMatrixConversions_androidKt.m1096setFromtUYjHk(fArrM1376constructorimpl$default, matrix);
            Matrix matrix2 = this.oldInverseAndroidMatrixCache;
            if (matrix2 == null) {
                this.oldInverseAndroidMatrixCache = new Matrix(matrix);
            } else {
                matrix2.set(matrix);
            }
        }
        this.isInverseDirty = false;
        return fArrM1376constructorimpl$default;
    }

    @NotNull
    /* JADX INFO: renamed from: getMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m2610getMatrixGrdbGEg(@NotNull DeviceRenderNode renderNode) {
        float[] fArrM1376constructorimpl$default = this.matrixCache;
        if (fArrM1376constructorimpl$default == null) {
            fArrM1376constructorimpl$default = androidx.compose.ui.graphics.Matrix.m1376constructorimpl$default(null, 1, null);
            this.matrixCache = fArrM1376constructorimpl$default;
        }
        if (!this.isDirty) {
            return fArrM1376constructorimpl$default;
        }
        Matrix matrix = this.newAndroidMatrixCache;
        if (matrix == null) {
            matrix = new Matrix();
            this.newAndroidMatrixCache = matrix;
        }
        renderNode.getMatrix(matrix);
        if (!Intrinsics.areEqual(this.oldAndroidMatrixCache, matrix)) {
            AndroidMatrixConversions_androidKt.m1096setFromtUYjHk(fArrM1376constructorimpl$default, matrix);
            Matrix matrix2 = this.oldAndroidMatrixCache;
            if (matrix2 == null) {
                this.oldAndroidMatrixCache = new Matrix(matrix);
            } else {
                matrix2.set(matrix);
            }
        }
        this.isDirty = false;
        return fArrM1376constructorimpl$default;
    }

    public final void invalidate() {
        this.isDirty = true;
        this.isInverseDirty = true;
    }
}
