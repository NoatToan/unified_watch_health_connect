package androidx.compose.ui.graphics;

import androidx.compose.ui.geometry.Offset;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0017\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BJ\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002ø\u0001\u0000J\u0019\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0002ø\u0001\u0000R\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\u0004\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/ui/graphics/Vertices;", "", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "encodeColorList", "Landroidx/compose/ui/geometry/Offset;", "points", "", "encodePointList", "Landroidx/compose/ui/graphics/VertexMode;", "vertexMode", LogUtil.I, "getVertexMode-c2xauaI", "()I", "positions", "[F", "getPositions", "()[F", "textureCoordinates", "getTextureCoordinates", "[I", "getColors", "()[I", "", "indices", "[S", "getIndices", "()[S", "", "<init>", "(ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "ui-graphics_release"}, k = 1, mv = {1, 5, 1})
public final class Vertices {

    @NotNull
    private final int[] colors;

    @NotNull
    private final short[] indices;

    @NotNull
    private final float[] positions;

    @NotNull
    private final float[] textureCoordinates;
    private final int vertexMode;

    private Vertices(int i, final List<Offset> list, List<Offset> list2, List<Color> list3, List<Integer> list4) {
        boolean z;
        this.vertexMode = i;
        Function1<Integer, Boolean> function1 = new Function1<Integer, Boolean>() { // from class: androidx.compose.ui.graphics.Vertices$outOfBounds$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @NotNull
            public final Boolean invoke(int i2) {
                return Boolean.valueOf(i2 < 0 || i2 >= list.size());
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
                return invoke(num.intValue());
            }
        };
        if (list2.size() != list.size()) {
            throw new IllegalArgumentException("positions and textureCoordinates lengths must match.");
        }
        if (list3.size() != list.size()) {
            throw new IllegalArgumentException("positions and colors lengths must match.");
        }
        int size = list4.size() - 1;
        if (size < 0) {
            z = false;
            break;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (function1.invoke(list4.get(i2)).booleanValue()) {
                z = true;
                break;
            } else {
                if (i3 > size) {
                    z = false;
                    break;
                }
                i2 = i3;
            }
        }
        if (z) {
            throw new IllegalArgumentException("indices values must be valid indices in the positions list.");
        }
        this.positions = encodePointList(list);
        this.textureCoordinates = encodePointList(list2);
        this.colors = encodeColorList(list3);
        int size2 = list4.size();
        short[] sArr = new short[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            sArr[i4] = (short) list4.get(i4).intValue();
        }
        this.indices = sArr;
    }

    public /* synthetic */ Vertices(int i, List list, List list2, List list3, List list4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, list2, list3, list4);
    }

    private final int[] encodeColorList(List<Color> colors) {
        int size = colors.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ColorKt.m1267toArgb8_81llA(colors.get(i).m1222unboximpl());
        }
        return iArr;
    }

    private final float[] encodePointList(List<Offset> points) {
        int size = points.size() * 2;
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            long packedValue = points.get(i / 2).getPackedValue();
            fArr[i] = i % 2 == 0 ? Offset.m983getXimpl(packedValue) : Offset.m984getYimpl(packedValue);
        }
        return fArr;
    }

    @NotNull
    public final int[] getColors() {
        return this.colors;
    }

    @NotNull
    public final short[] getIndices() {
        return this.indices;
    }

    @NotNull
    public final float[] getPositions() {
        return this.positions;
    }

    @NotNull
    public final float[] getTextureCoordinates() {
        return this.textureCoordinates;
    }

    /* JADX INFO: renamed from: getVertexMode-c2xauaI, reason: not valid java name and from getter */
    public final int getVertexMode() {
        return this.vertexMode;
    }
}
