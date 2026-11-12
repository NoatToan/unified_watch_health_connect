package org.opencv.core;

import com.google.android.gms.fitness.data.WorkoutExercises;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b \u0010!B!\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010$\u001a\u00020\"¢\u0006\u0004\b \u0010%J\u0018\u0010\u0005\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016ø\u0001\u0000J\u0019\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016ø\u0001\u0000J\u0011\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016ø\u0001\u0000J\u0019\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0016ø\u0001\u0000J\u0011\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016ø\u0001\u0000J\u0019\u0010\u0013\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016ø\u0001\u0000R\u0019\u0010\u0019\u001a\u00020\u00148\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001f\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eø\u0001\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lorg/opencv/core/AtableUByte;", "Lorg/opencv/core/Mat$Atable;", "Lkotlin/UByte;", "getV-w2LRezQ", "()B", "getV", "v", "", "setV-7apg3OU", "(B)V", "setV", "Lorg/opencv/core/Mat$Tuple2;", "getV2c", "setV2c", "Lorg/opencv/core/Mat$Tuple3;", "getV3c", "setV3c", "Lorg/opencv/core/Mat$Tuple4;", "getV4c", "setV4c", "Lorg/opencv/core/Mat;", "a", "Lorg/opencv/core/Mat;", "getMat", "()Lorg/opencv/core/Mat;", "mat", "", "b", "[I", "getIndices", "()[I", "indices", "<init>", "(Lorg/opencv/core/Mat;[I)V", "", WorkoutExercises.ROW, "col", "(Lorg/opencv/core/Mat;II)V", "opencv_release"}, k = 1, mv = {1, 5, 1})
public final class AtableUByte implements Mat.Atable<UByte> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Mat mat;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final int[] indices;

    public AtableUByte(@NotNull Mat mat, @NotNull int[] iArr) {
        this.mat = mat;
        this.indices = iArr;
    }

    @NotNull
    public final int[] getIndices() {
        return this.indices;
    }

    @NotNull
    public final Mat getMat() {
        return this.mat;
    }

    @Override // org.opencv.core.Mat.Atable
    public /* bridge */ /* synthetic */ UByte getV() {
        return UByte.m3854boximpl(m4496getVw2LRezQ());
    }

    /* JADX INFO: renamed from: getV-w2LRezQ, reason: not valid java name */
    public byte m4496getVw2LRezQ() {
        byte[] bArrM3862constructorimpl = UByteArray.m3862constructorimpl(1);
        MatAtKt.m4501get7tiRaYo(this.mat, this.indices, bArrM3862constructorimpl);
        return UByteArray.m3868getw2LRezQ(bArrM3862constructorimpl, 0);
    }

    @Override // org.opencv.core.Mat.Atable
    @NotNull
    public Mat.Tuple2<UByte> getV2c() {
        byte[] bArrM3862constructorimpl = UByteArray.m3862constructorimpl(2);
        MatAtKt.m4501get7tiRaYo(this.mat, this.indices, bArrM3862constructorimpl);
        return new Mat.Tuple2<>(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArrM3862constructorimpl, 0)), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArrM3862constructorimpl, 1)));
    }

    @Override // org.opencv.core.Mat.Atable
    @NotNull
    public Mat.Tuple3<UByte> getV3c() {
        byte[] bArrM3862constructorimpl = UByteArray.m3862constructorimpl(3);
        MatAtKt.m4501get7tiRaYo(this.mat, this.indices, bArrM3862constructorimpl);
        return new Mat.Tuple3<>(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArrM3862constructorimpl, 0)), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArrM3862constructorimpl, 1)), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArrM3862constructorimpl, 2)));
    }

    @Override // org.opencv.core.Mat.Atable
    @NotNull
    public Mat.Tuple4<UByte> getV4c() {
        byte[] bArrM3862constructorimpl = UByteArray.m3862constructorimpl(4);
        MatAtKt.m4501get7tiRaYo(this.mat, this.indices, bArrM3862constructorimpl);
        return new Mat.Tuple4<>(UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArrM3862constructorimpl, 0)), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArrM3862constructorimpl, 1)), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArrM3862constructorimpl, 2)), UByte.m3854boximpl(UByteArray.m3868getw2LRezQ(bArrM3862constructorimpl, 3)));
    }

    @Override // org.opencv.core.Mat.Atable
    public /* bridge */ /* synthetic */ void setV(UByte uByte) {
        m4497setV7apg3OU(uByte.m3860unboximpl());
    }

    /* JADX INFO: renamed from: setV-7apg3OU, reason: not valid java name */
    public void m4497setV7apg3OU(byte v) {
        MatAtKt.m4505put7tiRaYo(this.mat, this.indices, new byte[]{v});
    }

    @Override // org.opencv.core.Mat.Atable
    public void setV2c(@NotNull Mat.Tuple2<UByte> v) {
        MatAtKt.m4505put7tiRaYo(this.mat, this.indices, new byte[]{v.get_0().m3860unboximpl(), v.get_1().m3860unboximpl()});
    }

    @Override // org.opencv.core.Mat.Atable
    public void setV3c(@NotNull Mat.Tuple3<UByte> v) {
        MatAtKt.m4505put7tiRaYo(this.mat, this.indices, new byte[]{v.get_0().m3860unboximpl(), v.get_1().m3860unboximpl(), v.get_2().m3860unboximpl()});
    }

    @Override // org.opencv.core.Mat.Atable
    public void setV4c(@NotNull Mat.Tuple4<UByte> v) {
        MatAtKt.m4505put7tiRaYo(this.mat, this.indices, new byte[]{v.get_0().m3860unboximpl(), v.get_1().m3860unboximpl(), v.get_2().m3860unboximpl(), v.get_3().m3860unboximpl()});
    }

    public AtableUByte(@NotNull Mat mat, int i, int i2) {
        this(mat, new int[]{i, i2});
    }
}
