package androidx.compose.ui.graphics.vector;

import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;
import kotlin.ranges.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0010\f\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b$\u001a\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001aB\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062!\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u00020\u00040\bH\u0082\b\"\u0016\u0010\u000e\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0010\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\"\u0016\u0010\u0011\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f\"\u0016\u0010\u0012\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f\"\u0016\u0010\u0013\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000f\"\u0016\u0010\u0014\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f\"\u0016\u0010\u0015\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000f\"\u0016\u0010\u0016\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f\"\u0016\u0010\u0017\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000f\"\u0016\u0010\u0018\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000f\"\u0016\u0010\u0019\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f\"\u0016\u0010\u001a\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000f\"\u0016\u0010\u001b\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000f\"\u0016\u0010\u001c\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000f\"\u0016\u0010\u001d\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000f\"\u0016\u0010\u001e\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000f\"\u0016\u0010\u001f\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000f\"\u0016\u0010 \u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u000f\"\u0016\u0010!\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u000f\"\u0016\u0010\"\u001a\u00020\u00008\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u000f\"\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010$\"\u0016\u0010%\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010$\"\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010$\"\u0016\u0010'\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010$\"\u0016\u0010(\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010$\"\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010$\"\u0016\u0010*\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010$\"\u0016\u0010+\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b+\u0010$\"\u0016\u0010,\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b,\u0010$¨\u0006-"}, d2 = {"", "", "args", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "toPathNodes", "", "numArgs", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "subArray", "nodeFor", "pathNodesFromArgs", "RelativeCloseKey", "C", "CloseKey", "RelativeMoveToKey", "MoveToKey", "RelativeLineToKey", "LineToKey", "RelativeHorizontalToKey", "HorizontalToKey", "RelativeVerticalToKey", "VerticalToKey", "RelativeCurveToKey", "CurveToKey", "RelativeReflectiveCurveToKey", "ReflectiveCurveToKey", "RelativeQuadToKey", "QuadToKey", "RelativeReflectiveQuadToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "ArcToKey", "NUM_MOVE_TO_ARGS", LogUtil.I, "NUM_LINE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "NUM_CURVE_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_ARC_TO_ARGS", "ui-graphics_release"}, k = 2, mv = {1, 5, 1})
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [float[], java.lang.Object] */
    private static final List<PathNode> pathNodesFromArgs(float[] fArr, int i, Function1<? super float[], ? extends PathNode> function1) {
        IntProgression intProgressionStep = e.step(new IntRange(0, fArr.length - i), i);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep, 10));
        Iterator<Integer> it2 = intProgressionStep.iterator();
        while (it2.hasNext()) {
            int iNextInt = ((IntIterator) it2).nextInt();
            ?? floatArray = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt, iNextInt + i)));
            Object relativeLineTo = (PathNode) function1.invoke(floatArray);
            if ((relativeLineTo instanceof PathNode.MoveTo) && iNextInt > 0) {
                relativeLineTo = new PathNode.LineTo(floatArray[0], floatArray[1]);
            } else if ((relativeLineTo instanceof PathNode.RelativeMoveTo) && iNextInt > 0) {
                relativeLineTo = new PathNode.RelativeLineTo(floatArray[0], floatArray[1]);
            }
            arrayList.add(relativeLineTo);
        }
        return arrayList;
    }

    @NotNull
    public static final List<PathNode> toPathNodes(char c, @NotNull float[] fArr) {
        ArrayList arrayList;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        PathNode relativeLineTo;
        if (c == 'z' || c == 'Z') {
            return kotlin.collections.e.listOf(PathNode.Close.INSTANCE);
        }
        if (c == 'm') {
            IntProgression intProgressionStep = e.step(new IntRange(0, fArr.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep, 10));
            Iterator<Integer> it2 = intProgressionStep.iterator();
            while (it2.hasNext()) {
                int iNextInt = ((IntIterator) it2).nextInt();
                float[] floatArray = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt, iNextInt + 2)));
                PathNode relativeMoveTo = new PathNode.RelativeMoveTo(floatArray[0], floatArray[1]);
                if ((relativeMoveTo instanceof PathNode.MoveTo) && iNextInt > 0) {
                    relativeMoveTo = new PathNode.LineTo(floatArray[0], floatArray[1]);
                } else if (iNextInt > 0) {
                    relativeMoveTo = new PathNode.RelativeLineTo(floatArray[0], floatArray[1]);
                }
                arrayList.add(relativeMoveTo);
            }
        } else if (c == 'M') {
            IntProgression intProgressionStep2 = e.step(new IntRange(0, fArr.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep2, 10));
            Iterator<Integer> it3 = intProgressionStep2.iterator();
            while (it3.hasNext()) {
                int iNextInt2 = ((IntIterator) it3).nextInt();
                float[] floatArray2 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt2, iNextInt2 + 2)));
                PathNode moveTo = new PathNode.MoveTo(floatArray2[0], floatArray2[1]);
                if (iNextInt2 > 0) {
                    moveTo = new PathNode.LineTo(floatArray2[0], floatArray2[1]);
                } else if ((moveTo instanceof PathNode.RelativeMoveTo) && iNextInt2 > 0) {
                    moveTo = new PathNode.RelativeLineTo(floatArray2[0], floatArray2[1]);
                }
                arrayList.add(moveTo);
            }
        } else if (c == 'l') {
            IntProgression intProgressionStep3 = e.step(new IntRange(0, fArr.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep3, 10));
            Iterator<Integer> it4 = intProgressionStep3.iterator();
            while (it4.hasNext()) {
                int iNextInt3 = ((IntIterator) it4).nextInt();
                float[] floatArray3 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt3, iNextInt3 + 2)));
                PathNode relativeLineTo2 = new PathNode.RelativeLineTo(floatArray3[0], floatArray3[1]);
                if ((relativeLineTo2 instanceof PathNode.MoveTo) && iNextInt3 > 0) {
                    relativeLineTo2 = new PathNode.LineTo(floatArray3[0], floatArray3[1]);
                } else if ((relativeLineTo2 instanceof PathNode.RelativeMoveTo) && iNextInt3 > 0) {
                    relativeLineTo2 = new PathNode.RelativeLineTo(floatArray3[0], floatArray3[1]);
                }
                arrayList.add(relativeLineTo2);
            }
        } else if (c == 'L') {
            IntProgression intProgressionStep4 = e.step(new IntRange(0, fArr.length - 2), 2);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep4, 10));
            Iterator<Integer> it5 = intProgressionStep4.iterator();
            while (it5.hasNext()) {
                int iNextInt4 = ((IntIterator) it5).nextInt();
                float[] floatArray4 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt4, iNextInt4 + 2)));
                PathNode lineTo = new PathNode.LineTo(floatArray4[0], floatArray4[1]);
                if ((lineTo instanceof PathNode.MoveTo) && iNextInt4 > 0) {
                    lineTo = new PathNode.LineTo(floatArray4[0], floatArray4[1]);
                } else if ((lineTo instanceof PathNode.RelativeMoveTo) && iNextInt4 > 0) {
                    lineTo = new PathNode.RelativeLineTo(floatArray4[0], floatArray4[1]);
                }
                arrayList.add(lineTo);
            }
        } else if (c == 'h') {
            IntProgression intProgressionStep5 = e.step(new IntRange(0, fArr.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep5, 10));
            Iterator<Integer> it6 = intProgressionStep5.iterator();
            while (it6.hasNext()) {
                int iNextInt5 = ((IntIterator) it6).nextInt();
                float[] floatArray5 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt5, iNextInt5 + 1)));
                PathNode relativeHorizontalTo = new PathNode.RelativeHorizontalTo(floatArray5[0]);
                if ((relativeHorizontalTo instanceof PathNode.MoveTo) && iNextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.LineTo(floatArray5[0], floatArray5[1]);
                } else if ((relativeHorizontalTo instanceof PathNode.RelativeMoveTo) && iNextInt5 > 0) {
                    relativeHorizontalTo = new PathNode.RelativeLineTo(floatArray5[0], floatArray5[1]);
                }
                arrayList.add(relativeHorizontalTo);
            }
        } else if (c == 'H') {
            IntProgression intProgressionStep6 = e.step(new IntRange(0, fArr.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep6, 10));
            Iterator<Integer> it7 = intProgressionStep6.iterator();
            while (it7.hasNext()) {
                int iNextInt6 = ((IntIterator) it7).nextInt();
                float[] floatArray6 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt6, iNextInt6 + 1)));
                PathNode horizontalTo = new PathNode.HorizontalTo(floatArray6[0]);
                if ((horizontalTo instanceof PathNode.MoveTo) && iNextInt6 > 0) {
                    horizontalTo = new PathNode.LineTo(floatArray6[0], floatArray6[1]);
                } else if ((horizontalTo instanceof PathNode.RelativeMoveTo) && iNextInt6 > 0) {
                    horizontalTo = new PathNode.RelativeLineTo(floatArray6[0], floatArray6[1]);
                }
                arrayList.add(horizontalTo);
            }
        } else if (c == 'v') {
            IntProgression intProgressionStep7 = e.step(new IntRange(0, fArr.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep7, 10));
            Iterator<Integer> it8 = intProgressionStep7.iterator();
            while (it8.hasNext()) {
                int iNextInt7 = ((IntIterator) it8).nextInt();
                float[] floatArray7 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt7, iNextInt7 + 1)));
                PathNode relativeVerticalTo = new PathNode.RelativeVerticalTo(floatArray7[0]);
                if ((relativeVerticalTo instanceof PathNode.MoveTo) && iNextInt7 > 0) {
                    relativeVerticalTo = new PathNode.LineTo(floatArray7[0], floatArray7[1]);
                } else if ((relativeVerticalTo instanceof PathNode.RelativeMoveTo) && iNextInt7 > 0) {
                    relativeVerticalTo = new PathNode.RelativeLineTo(floatArray7[0], floatArray7[1]);
                }
                arrayList.add(relativeVerticalTo);
            }
        } else if (c == 'V') {
            IntProgression intProgressionStep8 = e.step(new IntRange(0, fArr.length - 1), 1);
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep8, 10));
            Iterator<Integer> it9 = intProgressionStep8.iterator();
            while (it9.hasNext()) {
                int iNextInt8 = ((IntIterator) it9).nextInt();
                float[] floatArray8 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt8, iNextInt8 + 1)));
                PathNode verticalTo = new PathNode.VerticalTo(floatArray8[0]);
                if ((verticalTo instanceof PathNode.MoveTo) && iNextInt8 > 0) {
                    verticalTo = new PathNode.LineTo(floatArray8[0], floatArray8[1]);
                } else if ((verticalTo instanceof PathNode.RelativeMoveTo) && iNextInt8 > 0) {
                    verticalTo = new PathNode.RelativeLineTo(floatArray8[0], floatArray8[1]);
                }
                arrayList.add(verticalTo);
            }
        } else {
            char c4 = 5;
            if (c == 'c') {
                IntProgression intProgressionStep9 = e.step(new IntRange(0, fArr.length - 6), 6);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep9, 10));
                Iterator<Integer> it10 = intProgressionStep9.iterator();
                while (it10.hasNext()) {
                    int iNextInt9 = ((IntIterator) it10).nextInt();
                    float[] floatArray9 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt9, iNextInt9 + 6)));
                    PathNode relativeCurveTo = new PathNode.RelativeCurveTo(floatArray9[0], floatArray9[1], floatArray9[2], floatArray9[3], floatArray9[4], floatArray9[c4]);
                    if (!(relativeCurveTo instanceof PathNode.MoveTo) || iNextInt9 <= 0) {
                        relativeLineTo = (!(relativeCurveTo instanceof PathNode.RelativeMoveTo) || iNextInt9 <= 0) ? relativeCurveTo : new PathNode.RelativeLineTo(floatArray9[0], floatArray9[1]);
                    } else {
                        relativeLineTo = new PathNode.LineTo(floatArray9[0], floatArray9[1]);
                    }
                    arrayList.add(relativeLineTo);
                    c4 = 5;
                }
            } else if (c == 'C') {
                IntProgression intProgressionStep10 = e.step(new IntRange(0, fArr.length - 6), 6);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep10, 10));
                Iterator<Integer> it11 = intProgressionStep10.iterator();
                while (it11.hasNext()) {
                    int iNextInt10 = ((IntIterator) it11).nextInt();
                    float[] floatArray10 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt10, iNextInt10 + 6)));
                    PathNode curveTo = new PathNode.CurveTo(floatArray10[0], floatArray10[1], floatArray10[2], floatArray10[3], floatArray10[4], floatArray10[5]);
                    if ((curveTo instanceof PathNode.MoveTo) && iNextInt10 > 0) {
                        curveTo = new PathNode.LineTo(floatArray10[0], floatArray10[1]);
                    } else if ((curveTo instanceof PathNode.RelativeMoveTo) && iNextInt10 > 0) {
                        curveTo = new PathNode.RelativeLineTo(floatArray10[0], floatArray10[1]);
                    }
                    arrayList.add(curveTo);
                }
            } else if (c == 's') {
                IntProgression intProgressionStep11 = e.step(new IntRange(0, fArr.length - 4), 4);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep11, 10));
                Iterator<Integer> it12 = intProgressionStep11.iterator();
                while (it12.hasNext()) {
                    int iNextInt11 = ((IntIterator) it12).nextInt();
                    float[] floatArray11 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt11, iNextInt11 + 4)));
                    PathNode relativeReflectiveCurveTo = new PathNode.RelativeReflectiveCurveTo(floatArray11[0], floatArray11[1], floatArray11[2], floatArray11[3]);
                    if ((relativeReflectiveCurveTo instanceof PathNode.MoveTo) && iNextInt11 > 0) {
                        relativeReflectiveCurveTo = new PathNode.LineTo(floatArray11[0], floatArray11[1]);
                    } else if ((relativeReflectiveCurveTo instanceof PathNode.RelativeMoveTo) && iNextInt11 > 0) {
                        relativeReflectiveCurveTo = new PathNode.RelativeLineTo(floatArray11[0], floatArray11[1]);
                    }
                    arrayList.add(relativeReflectiveCurveTo);
                }
            } else if (c == 'S') {
                IntProgression intProgressionStep12 = e.step(new IntRange(0, fArr.length - 4), 4);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep12, 10));
                Iterator<Integer> it13 = intProgressionStep12.iterator();
                while (it13.hasNext()) {
                    int iNextInt12 = ((IntIterator) it13).nextInt();
                    float[] floatArray12 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt12, iNextInt12 + 4)));
                    PathNode reflectiveCurveTo = new PathNode.ReflectiveCurveTo(floatArray12[0], floatArray12[1], floatArray12[2], floatArray12[3]);
                    if ((reflectiveCurveTo instanceof PathNode.MoveTo) && iNextInt12 > 0) {
                        reflectiveCurveTo = new PathNode.LineTo(floatArray12[0], floatArray12[1]);
                    } else if ((reflectiveCurveTo instanceof PathNode.RelativeMoveTo) && iNextInt12 > 0) {
                        reflectiveCurveTo = new PathNode.RelativeLineTo(floatArray12[0], floatArray12[1]);
                    }
                    arrayList.add(reflectiveCurveTo);
                }
            } else if (c == 'q') {
                IntProgression intProgressionStep13 = e.step(new IntRange(0, fArr.length - 4), 4);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep13, 10));
                Iterator<Integer> it14 = intProgressionStep13.iterator();
                while (it14.hasNext()) {
                    int iNextInt13 = ((IntIterator) it14).nextInt();
                    float[] floatArray13 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt13, iNextInt13 + 4)));
                    PathNode relativeQuadTo = new PathNode.RelativeQuadTo(floatArray13[0], floatArray13[1], floatArray13[2], floatArray13[3]);
                    if ((relativeQuadTo instanceof PathNode.MoveTo) && iNextInt13 > 0) {
                        relativeQuadTo = new PathNode.LineTo(floatArray13[0], floatArray13[1]);
                    } else if ((relativeQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt13 > 0) {
                        relativeQuadTo = new PathNode.RelativeLineTo(floatArray13[0], floatArray13[1]);
                    }
                    arrayList.add(relativeQuadTo);
                }
            } else if (c == 'Q') {
                IntProgression intProgressionStep14 = e.step(new IntRange(0, fArr.length - 4), 4);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep14, 10));
                Iterator<Integer> it15 = intProgressionStep14.iterator();
                while (it15.hasNext()) {
                    int iNextInt14 = ((IntIterator) it15).nextInt();
                    float[] floatArray14 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt14, iNextInt14 + 4)));
                    PathNode quadTo = new PathNode.QuadTo(floatArray14[0], floatArray14[1], floatArray14[2], floatArray14[3]);
                    if ((quadTo instanceof PathNode.MoveTo) && iNextInt14 > 0) {
                        quadTo = new PathNode.LineTo(floatArray14[0], floatArray14[1]);
                    } else if ((quadTo instanceof PathNode.RelativeMoveTo) && iNextInt14 > 0) {
                        quadTo = new PathNode.RelativeLineTo(floatArray14[0], floatArray14[1]);
                    }
                    arrayList.add(quadTo);
                }
            } else if (c == 't') {
                IntProgression intProgressionStep15 = e.step(new IntRange(0, fArr.length - 2), 2);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep15, 10));
                Iterator<Integer> it16 = intProgressionStep15.iterator();
                while (it16.hasNext()) {
                    int iNextInt15 = ((IntIterator) it16).nextInt();
                    float[] floatArray15 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt15, iNextInt15 + 2)));
                    PathNode relativeReflectiveQuadTo = new PathNode.RelativeReflectiveQuadTo(floatArray15[0], floatArray15[1]);
                    if ((relativeReflectiveQuadTo instanceof PathNode.MoveTo) && iNextInt15 > 0) {
                        relativeReflectiveQuadTo = new PathNode.LineTo(floatArray15[0], floatArray15[1]);
                    } else if ((relativeReflectiveQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt15 > 0) {
                        relativeReflectiveQuadTo = new PathNode.RelativeLineTo(floatArray15[0], floatArray15[1]);
                    }
                    arrayList.add(relativeReflectiveQuadTo);
                }
            } else if (c == 'T') {
                IntProgression intProgressionStep16 = e.step(new IntRange(0, fArr.length - 2), 2);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep16, 10));
                Iterator<Integer> it17 = intProgressionStep16.iterator();
                while (it17.hasNext()) {
                    int iNextInt16 = ((IntIterator) it17).nextInt();
                    float[] floatArray16 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt16, iNextInt16 + 2)));
                    PathNode reflectiveQuadTo = new PathNode.ReflectiveQuadTo(floatArray16[0], floatArray16[1]);
                    if ((reflectiveQuadTo instanceof PathNode.MoveTo) && iNextInt16 > 0) {
                        reflectiveQuadTo = new PathNode.LineTo(floatArray16[0], floatArray16[1]);
                    } else if ((reflectiveQuadTo instanceof PathNode.RelativeMoveTo) && iNextInt16 > 0) {
                        reflectiveQuadTo = new PathNode.RelativeLineTo(floatArray16[0], floatArray16[1]);
                    }
                    arrayList.add(reflectiveQuadTo);
                }
            } else if (c == 'a') {
                IntProgression intProgressionStep17 = e.step(new IntRange(0, fArr.length - 7), 7);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep17, 10));
                Iterator<Integer> it18 = intProgressionStep17.iterator();
                while (it18.hasNext()) {
                    int iNextInt17 = ((IntIterator) it18).nextInt();
                    float[] floatArray17 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt17, iNextInt17 + 7)));
                    float f = floatArray17[0];
                    float f2 = floatArray17[1];
                    float f3 = floatArray17[2];
                    boolean z3 = Float.compare(floatArray17[3], 0.0f) != 0;
                    if (Float.compare(floatArray17[4], 0.0f) != 0) {
                        c3 = 5;
                        z2 = true;
                    } else {
                        c3 = 5;
                        z2 = false;
                    }
                    PathNode relativeArcTo = new PathNode.RelativeArcTo(f, f2, f3, z3, z2, floatArray17[c3], floatArray17[6]);
                    if ((relativeArcTo instanceof PathNode.MoveTo) && iNextInt17 > 0) {
                        relativeArcTo = new PathNode.LineTo(floatArray17[0], floatArray17[1]);
                    } else if ((relativeArcTo instanceof PathNode.RelativeMoveTo) && iNextInt17 > 0) {
                        relativeArcTo = new PathNode.RelativeLineTo(floatArray17[0], floatArray17[1]);
                    }
                    arrayList.add(relativeArcTo);
                }
            } else {
                if (c != 'A') {
                    throw new IllegalArgumentException(Intrinsics.stringPlus("Unknown command for: ", Character.valueOf(c)));
                }
                IntProgression intProgressionStep18 = e.step(new IntRange(0, fArr.length - 7), 7);
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intProgressionStep18, 10));
                Iterator<Integer> it19 = intProgressionStep18.iterator();
                while (it19.hasNext()) {
                    int iNextInt18 = ((IntIterator) it19).nextInt();
                    float[] floatArray18 = CollectionsKt___CollectionsKt.toFloatArray(ArraysKt___ArraysKt.slice(fArr, e.until(iNextInt18, iNextInt18 + 7)));
                    float f4 = floatArray18[0];
                    float f5 = floatArray18[1];
                    float f6 = floatArray18[2];
                    boolean z4 = Float.compare(floatArray18[3], 0.0f) != 0;
                    if (Float.compare(floatArray18[4], 0.0f) != 0) {
                        c2 = 5;
                        z = true;
                    } else {
                        c2 = 5;
                        z = false;
                    }
                    PathNode arcTo = new PathNode.ArcTo(f4, f5, f6, z4, z, floatArray18[c2], floatArray18[6]);
                    if ((arcTo instanceof PathNode.MoveTo) && iNextInt18 > 0) {
                        arcTo = new PathNode.LineTo(floatArray18[0], floatArray18[1]);
                    } else if ((arcTo instanceof PathNode.RelativeMoveTo) && iNextInt18 > 0) {
                        arcTo = new PathNode.RelativeLineTo(floatArray18[0], floatArray18[1]);
                    }
                    arrayList.add(arcTo);
                }
            }
        }
        return arrayList;
    }
}
