package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\n\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR!\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R!\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/ViewLayerMatrixCache;", "", "", "invalidate", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroidx/compose/ui/graphics/Matrix;", "getMatrix-GrdbGEg", "(Landroid/view/View;)[F", "getMatrix", "getInverseMatrix-GrdbGEg", "getInverseMatrix", "Landroid/graphics/Matrix;", "androidMatrixCache", "Landroid/graphics/Matrix;", "inverseAndroidMatrixCache", "matrixCache", "[F", "inverseMatrixCache", "", "isDirty", "Z", "isInverseDirty", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 5, 1})
final class ViewLayerMatrixCache {

    @Nullable
    private Matrix androidMatrixCache;

    @Nullable
    private Matrix inverseAndroidMatrixCache;

    @Nullable
    private float[] inverseMatrixCache;
    private boolean isDirty = true;
    private boolean isInverseDirty = true;

    @Nullable
    private float[] matrixCache;

    @NotNull
    /* JADX INFO: renamed from: getInverseMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m2612getInverseMatrixGrdbGEg(@NotNull View view) {
        float[] fArrM1376constructorimpl$default = this.inverseMatrixCache;
        if (fArrM1376constructorimpl$default == null) {
            fArrM1376constructorimpl$default = androidx.compose.ui.graphics.Matrix.m1376constructorimpl$default(null, 1, null);
            this.inverseMatrixCache = fArrM1376constructorimpl$default;
        }
        if (!this.isInverseDirty) {
            return fArrM1376constructorimpl$default;
        }
        Matrix matrix = view.getMatrix();
        if (!Intrinsics.areEqual(this.inverseAndroidMatrixCache, matrix)) {
            AndroidMatrixConversions_androidKt.m1096setFromtUYjHk(fArrM1376constructorimpl$default, matrix);
            androidx.compose.ui.graphics.Matrix.m1381invertimpl(fArrM1376constructorimpl$default);
            Matrix matrix2 = this.inverseAndroidMatrixCache;
            if (matrix2 == null) {
                this.inverseAndroidMatrixCache = new Matrix(matrix);
            } else {
                matrix2.set(matrix);
            }
        }
        this.isInverseDirty = false;
        return fArrM1376constructorimpl$default;
    }

    @NotNull
    /* JADX INFO: renamed from: getMatrix-GrdbGEg, reason: not valid java name */
    public final float[] m2613getMatrixGrdbGEg(@NotNull View view) {
        float[] fArrM1376constructorimpl$default = this.matrixCache;
        if (fArrM1376constructorimpl$default == null) {
            fArrM1376constructorimpl$default = androidx.compose.ui.graphics.Matrix.m1376constructorimpl$default(null, 1, null);
            this.matrixCache = fArrM1376constructorimpl$default;
        }
        if (!this.isDirty) {
            return fArrM1376constructorimpl$default;
        }
        Matrix matrix = view.getMatrix();
        if (!Intrinsics.areEqual(this.androidMatrixCache, matrix)) {
            AndroidMatrixConversions_androidKt.m1096setFromtUYjHk(fArrM1376constructorimpl$default, matrix);
            Matrix matrix2 = this.androidMatrixCache;
            if (matrix2 == null) {
                this.androidMatrixCache = new Matrix(matrix);
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
