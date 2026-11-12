package org.opencv.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0086\u0002¨\u0006\u0003"}, d2 = {"Lorg/opencv/core/Mat;", "other", "times", "opencv_release"}, k = 2, mv = {1, 5, 1})
public final class MatMatMulKt {
    @NotNull
    public static final Mat times(@NotNull Mat mat, @NotNull Mat mat2) {
        return mat.matMul(mat2);
    }
}
