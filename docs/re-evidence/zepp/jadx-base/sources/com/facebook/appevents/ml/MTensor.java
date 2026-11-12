package com.facebook.appevents.ml;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u000f\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR$\u0010\u0012\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0017\u001a\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/ml/MTensor;", "", "", "i", "getShape", "", "shape", "", "reshape", "a", LogUtil.I, "capacity", "", "<set-?>", "b", "[F", "getData", "()[F", "data", "c", "[I", "getShapeSize", "()I", "shapeSize", "<init>", "([I)V", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class MTensor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int capacity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private float[] data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int[] shape;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/ml/MTensor$Companion;", "", "", "shape", "", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int a(int[] shape) {
            int i = 1;
            if (shape.length == 0) {
                throw new UnsupportedOperationException("Empty array can't be reduced.");
            }
            int i2 = shape[0];
            int lastIndex = ArraysKt___ArraysKt.getLastIndex(shape);
            if (1 <= lastIndex) {
                while (true) {
                    i2 *= shape[i];
                    if (i == lastIndex) {
                        break;
                    }
                    i++;
                }
            }
            return i2;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MTensor(@NotNull int[] iArr) {
        this.shape = iArr;
        int iA = INSTANCE.a(iArr);
        this.capacity = iA;
        this.data = new float[iA];
    }

    @NotNull
    public final float[] getData() {
        return this.data;
    }

    public final int getShape(int i) {
        return this.shape[i];
    }

    public final int getShapeSize() {
        return this.shape.length;
    }

    public final void reshape(@NotNull int[] shape) {
        this.shape = shape;
        int iA = INSTANCE.a(shape);
        float[] fArr = new float[iA];
        System.arraycopy(this.data, 0, fArr, 0, Math.min(this.capacity, iA));
        this.data = fArr;
        this.capacity = iA;
    }
}
